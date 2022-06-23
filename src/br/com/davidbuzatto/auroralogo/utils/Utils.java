package br.com.davidbuzatto.auroralogo.utils;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author David
 */
public class Utils {
    
    public static void mostrarDados( 
            CommonTokenStream tokens, 
            Parser parser, 
            ParseTree tree, 
            boolean mostrarTestRig ) {
        
        if ( tokens != null ) {
            for ( Token t : tokens.getTokens() ) {
                System.out.println( t );
            }
        }
        
        if ( parser != null && tree != null ) {
            
            System.out.println( tree.getText() );
            System.out.println( tree.toStringTree( parser ) );

            if ( mostrarTestRig ) {
                Trees.inspect( tree, parser );
            }
            
        }
        
    }
    
    public static void mostrarDados( CommonTokenStream tokens ) {
        Utils.mostrarDados( tokens, null, null, false );
    }
    
    public static void mostrarDados( 
            Parser parser, 
            ParseTree tree, 
            boolean mostrarTestRig ) {
        
        Utils.mostrarDados( null, parser, tree, mostrarTestRig );
        
    }
    
}
