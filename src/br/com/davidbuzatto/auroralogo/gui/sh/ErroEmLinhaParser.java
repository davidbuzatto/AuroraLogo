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

import br.com.davidbuzatto.auroralogo.gui.Tartaruga;
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
 * para notificar o componente sobre erros gerados pelo analisador sintático da
 * linguagem de programação AuroraLogo gerado usando ANTLR4.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class ErroEmLinhaParser extends AbstractParser {

    private static class Erro {
        Object offendingSymbol;
        int linha;
        int inicio;
        int comprimento;
        Color cor;

        public Erro( Object offendingSymbol, int linha, int inicio, int comprimento, Color cor ) {
            this.offendingSymbol = offendingSymbol;
            this.linha = linha;
            this.inicio = inicio;
            this.comprimento = comprimento;
            this.cor = cor;
        }
        
    }
    
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
    
    public void adicionarErro( Object offendingSymbol, int linha, int inicio, int comprimento, Color cor ) {
        
        Erro erro;
            
        if ( mapaErros.containsKey( linha ) ) {
            erro = mapaErros.get( linha );
            erro = new Erro( 
                    erro.offendingSymbol, 
                    erro.linha, 
                    erro.inicio, 
                    inicio - erro.inicio, 
                    cor );
        } else {
            erro = new Erro( offendingSymbol, linha, inicio, comprimento, cor );
        }
        
        mapaErros.put( linha, erro );
        
    }
    
    public void processarErros() {
        
        for ( Entry<Integer, Erro> e : mapaErros.entrySet() ) {
            
            Erro erro = e.getValue();
            
            int linha = erro.linha;
            int inicio = erro.inicio;
            int ajuste = 0;
            int comprimento = erro.comprimento;
            
            try {
                
                if ( linha > 0 ) {
                    ajuste = textAreaCodigo.getLineEndOffset( linha - 1 );
                    inicio += ajuste;
                }
                
            } catch ( BadLocationException exc ) {
                exc.printStackTrace();
            }
            
            String erroRazao = String.format( "erro em linha %d, coluna %d", linha + 1, inicio - ajuste );
            if ( erro.offendingSymbol != null && erro.offendingSymbol instanceof Token ) {
                Token t = (Token) erro.offendingSymbol;
                erroRazao += ":\n    não entendi o que você quiz dizer com \"" + t.getText() + "\" :(";
            }
            
            DefaultParserNotice dpn = new DefaultParserNotice( this, erroRazao, linha + 1, inicio, comprimento );
            dpn.setColor( erro.cor );
            dpn.setLevel( ParserNotice.Level.ERROR );
            dpn.setShowInEditor( true );
            dpn.setToolTipText( erroRazao );
            
            String[] linhas = erroRazao.split( ":\n    " );
            String linha1 = null;
            String linha2 = null;
            
            if ( linhas.length == 1 ) {
                linha1 = linhas[0];
            } else {
                linha1 = linhas[0];
                linha2 = linhas[1];
            }
            
            if ( linha1 != null && linha2 == null ) {
                Utils.inserirTextoFormatado( 
                        textPaneSaida, 
                        linha1 + "a.\n\n", 
                        true,
                        Color.RED );
            } else {
                Utils.inserirTextoFormatado( 
                        textPaneSaida, 
                        linha1 + ":\n    ", 
                        true,
                        Color.RED );
                Utils.inserirMensagemEmitente( 
                        textPaneSaida, 
                        "tartaruga", 
                        linha2 + "\n\n", 
                        tartaruga.getCor() );
            }
            
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
