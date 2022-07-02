/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.davidbuzatto.auroralogo.gui.sh;

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
 *
 * @author David
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
    private Map<Integer, Erro> mapaErros;
    private List<DefaultParserNotice> erros;
    
    public ErroEmLinhaParser( RSyntaxTextArea textAreaCodigo, JTextPane textPaneSaida ) {
        this.textAreaCodigo = textAreaCodigo;
        this.textPaneSaida = textPaneSaida;
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
            int comprimento = erro.comprimento;
            
            try {
                
                if ( linha > 0 ) {
                    inicio += textAreaCodigo.getLineEndOffset( linha - 1 );
                }
                
            } catch ( BadLocationException exc ) {
                exc.printStackTrace();
            }
            
            String erroRazao = String.format( "erro em linha %d, colunha %d", linha + 1, inicio );
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
                    linha1 + ".\n\n", 
                    true,
                    Color.RED );
            } else {
                Utils.inserirTextoFormatado( 
                    textPaneSaida, 
                    linha1 + ":\n    ", 
                    true,
                    Color.RED );
                Utils.inserirTextoFormatado( 
                    textPaneSaida, 
                    "tartaruga:", 
                    true,
                    Color.GREEN,
                    new Color( 48, 151, 80 ) );
                Utils.inserirTextoFormatado( 
                    textPaneSaida, 
                    " " + linha2 + "\n\n", 
                    true,
                    new Color( 48, 151, 80 ) );
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
