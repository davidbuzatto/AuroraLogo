/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.davidbuzatto.auroralogo.gui.sh;

import java.awt.Color;
import org.fife.ui.rsyntaxtextarea.RSyntaxDocument;
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

    @Override
    public ParseResult parse( RSyntaxDocument rsd, String string ) {
        
        System.out.println( "a" );
        DefaultParseResult dpr = new DefaultParseResult( this );
        DefaultParserNotice dpn = new DefaultParserNotice( this, "a", 1, 1, 10 );
        
        dpn.setColor( Color.RED );
        dpn.setLevel( ParserNotice.Level.ERROR );
        dpn.setShowInEditor( true );
        dpn.setToolTipText( "erro" );
        
        dpr.addNotice( dpn );
        return dpr;
        
    }
    
}
