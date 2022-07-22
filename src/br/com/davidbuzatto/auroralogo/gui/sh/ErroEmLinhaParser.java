/*
 * Copyright (C) 2022 Prof. Dr. David Buzatto
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.com.davidbuzatto.auroralogo.gui.sh;

import br.com.davidbuzatto.auroralogo.gui.tartaruga.Tartaruga;
import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import org.antlr.v4.runtime.Token;
import org.fife.ui.rsyntaxtextarea.RSyntaxDocument;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.parser.AbstractParser;
import org.fife.ui.rsyntaxtextarea.parser.DefaultParseResult;
import org.fife.ui.rsyntaxtextarea.parser.DefaultParserNotice;
import org.fife.ui.rsyntaxtextarea.parser.ParseResult;
import org.fife.ui.rsyntaxtextarea.parser.ParserNotice;

/**
 * Analisador sintático específico do componente RSyntaxTextArea desenvolvido
 * para notificar o componente sobre erros gerados pelos analisadores léxico e
 * sintático da linguagem de programação AuroraLogo gerados usando o ANTLR4.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class ErroEmLinhaParser extends AbstractParser {
    
    private RSyntaxTextArea textAreaCodigo;
    private JTextPane textPaneSaida;
    private Tartaruga tartaruga;
    private Map<Integer, Erro> mapaErros;
    private List<DefaultParserNotice> erros;
    
    public ErroEmLinhaParser( RSyntaxTextArea textAreaCodigo, JTextPane textPaneSaida, Tartaruga tartaruga ) {
        this.textAreaCodigo = textAreaCodigo;
        this.textPaneSaida = textPaneSaida;
        this.tartaruga = tartaruga;
        mapaErros = new LinkedHashMap<>();
        erros = new ArrayList<>();
    }
    
    public void adicionarErro( Object offendingSymbol, String mensagem, int linha, int inicio, int comprimento, Color cor ) {
        
        Erro erro;
            
        if ( mapaErros.containsKey( linha ) ) {
            erro = mapaErros.get( linha );
            erro = new Erro( 
                    erro.getOffendingSymbol(), 
                    erro.getMensagem(),
                    erro.getLinha(), 
                    erro.getInicio(), 
                    inicio - erro.getInicio(), 
                    cor );
        } else {
            erro = new Erro( offendingSymbol, mensagem, linha, inicio, comprimento, cor );
        }
        
        mapaErros.put( linha, erro );
        
    }
    
    public void processarErros() {
        
        for ( Entry<Integer, Erro> e : mapaErros.entrySet() ) {
            
            Erro erro = e.getValue();
            
            int linha = erro.getLinha();
            int inicio = erro.getInicio();
            int ajuste = 0;
            int comprimento = erro.getComprimento();
            
            try {
                
                if ( linha > 0 ) {
                    ajuste = textAreaCodigo.getLineEndOffset( linha - 1 );
                    inicio += ajuste;
                }
                
            } catch ( BadLocationException exc ) {
                exc.printStackTrace();
            }
            
            String erroRazao = String.format( "em linha %d, coluna %d", linha + 1, inicio - ajuste );
            String erroMsg = "";
            
            Color cor = Color.RED;
            
            if ( erro.getOffendingSymbol() != null && erro.getOffendingSymbol() instanceof Token ) {
                Token t = (Token) erro.getOffendingSymbol();
                erroMsg = t.getText();
                erroRazao = "erro sintático " + erroRazao;
            } else {
                erroMsg = erro.getMensagem();
                erroMsg = erroMsg.substring( erroMsg.indexOf( ":" ) + 1 ).trim().replace( "'", "" );
                erroRazao = "erro léxico " + erroRazao;
                cor = Color.decode( "#8e00a1" );
            }
            
            erroRazao += ":\n    não entendi o que você quiz dizer com \"" + erroMsg + "\" :(";
            
            DefaultParserNotice dpn = new DefaultParserNotice( this, erroRazao, linha + 1, inicio, comprimento );
            dpn.setColor( erro.getCor() );
            dpn.setLevel( ParserNotice.Level.ERROR );
            dpn.setShowInEditor( true );
            dpn.setToolTipText( erroRazao );
            
            String[] linhas = erroRazao.split( ":\n    " );
            
            Utils.inserirTextoFormatado( 
                    textPaneSaida, 
                    linhas[0] + ":\n    ", 
                    true,
                    cor );
            Utils.inserirMensagemEmitente( 
                    textPaneSaida, 
                    "tartaruga", 
                    linhas[1] + "\n\n", 
                    tartaruga.getCor() );
            
            erros.add( dpn );
            
        }
        
    }
    
    public void limparErros() {
        mapaErros.clear();
        erros.clear();
    }
    
    @Override
    public ParseResult parse( RSyntaxDocument rsd, String string ) {
        
        DefaultParseResult dpr = new DefaultParseResult( this );
        
        for ( DefaultParserNotice d : erros ) {
            dpr.addNotice( d );
        }
        
        return dpr;
        
    }
    
}
