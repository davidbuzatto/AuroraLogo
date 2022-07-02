/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.davidbuzatto.auroralogo.parser.impl;

import br.com.davidbuzatto.auroralogo.gui.JanelaPrincipal;
import br.com.davidbuzatto.auroralogo.gui.PainelDesenho;
import br.com.davidbuzatto.auroralogo.gui.Tartaruga;
import br.com.davidbuzatto.auroralogo.gui.sh.ErroEmLinhaParser;
import java.awt.Color;
import java.util.Collections;
import java.util.List;
import javax.swing.JTextPane;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.fife.ui.rsyntaxtextarea.ErrorStrip;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;

/**
 *
 * @author David
 */
public class AuroraLogoErrorListener extends BaseErrorListener {

    private RSyntaxTextArea textAreaCodigo;
    private ErrorStrip errorStrip;
    private ErroEmLinhaParser erroLinhaParser;
    private JTextPane textPaneSaida;
    private JanelaPrincipal janelaPrincipal;
    private PainelDesenho painelDesenho;
    private Tartaruga tartaruga;
    private boolean houveErro;
    
    public AuroraLogoErrorListener( 
            RSyntaxTextArea textAreaCodigo, 
            ErrorStrip errorStrip,
            ErroEmLinhaParser erroLinhaParser,
            JTextPane textPaneSaida, 
            JanelaPrincipal janelaPrincipal, 
            PainelDesenho painelDesenho, 
            Tartaruga tartaruga ) {
        
        this.textAreaCodigo = textAreaCodigo;
        this.errorStrip = errorStrip;
        this.erroLinhaParser = erroLinhaParser;
        this.textPaneSaida = textPaneSaida;
        this.janelaPrincipal = janelaPrincipal;
        this.painelDesenho = painelDesenho;
        this.tartaruga = tartaruga;
        
    }
    
    @Override
    public void syntaxError( Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line, 
            int charPositionInLine,
            String msg,
            RecognitionException e ) {
        
        List<String> stack = ( ( Parser ) recognizer ).getRuleInvocationStack();
        Collections.reverse( stack );
        
        erroLinhaParser.adicionarErro( 
                offendingSymbol,
                line - 1, 
                charPositionInLine, 
                1, 
                Color.RED );
        
        houveErro = true;
        
    }

    public boolean houveErro() {
        return houveErro;
    }
    
}