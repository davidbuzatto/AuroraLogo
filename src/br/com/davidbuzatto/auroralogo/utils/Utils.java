package br.com.davidbuzatto.auroralogo.utils;

import java.awt.Color;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.prefs.Preferences;
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
    
    private static final String PREFERENCES_PATH = "br.com.davidbuzatto.auroralogo";
    
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
    
    
    private static Map<String, Color> defaultColors = new HashMap<>();
    
    static {
        defaultColors.put( "RESERVED_WORD", Color.BLUE );
        defaultColors.put( "RESERVED_WORD_2", Color.decode( "#9e6d03" ) );
        defaultColors.put( "IDENTIFIER", Color.GREEN.darker() );
        defaultColors.put( "OPERATOR", Color.decode( "#9e6d03" ) );
        defaultColors.put( "FUNCTION", Color.BLACK );
        defaultColors.put( "LITERAL_NUMBER_DECIMAL_INT", Color.MAGENTA.darker().darker() );
        defaultColors.put( "LITERAL_NUMBER_FLOAT", Color.MAGENTA.darker().darker() );
        defaultColors.put( "LITERAL_NUMBER_HEXADECIMAL", Color.BLUE );
        defaultColors.put( "COMMENT_EOL", Color.GRAY );
        defaultColors.put( "COMMENT_MULTILINE", Color.GRAY.darker() );
        defaultColors.put( "COMMENT_DOCUMENTATION", Color.BLUE.darker().darker() );
    };
    
    public static void preparePreferences() {
        
        Preferences prefs = Preferences.userRoot().node( PREFERENCES_PATH );
        
        prefs.put( "CAMINHO_ABRIR_SALVAR", prefs.get( "CAMINHO_ABRIR_SALVAR", new File( "" ).getAbsolutePath() ) );
        
        for ( Entry<String, Color> e : defaultColors.entrySet() ) {
            prefs.putInt( e.getKey(), prefs.getInt( e.getKey(), e.getValue().getRGB() ) );
        }
        
    }
    
    public static String getPref( String key ) {
        Preferences prefs = Preferences.userRoot().node( PREFERENCES_PATH );
        return prefs.get( key, "" );
    }
    
    public static int getIntPref( String key ) {
        Preferences prefs = Preferences.userRoot().node( PREFERENCES_PATH );
        return prefs.getInt( key, Integer.MIN_VALUE );
    }
    
    public static void setPref( String key, String value ) {
        Preferences prefs = Preferences.userRoot().node( PREFERENCES_PATH );
        prefs.put( key, value );
    }
    
    public static void setIntPref( String key, int value ) {
        Preferences prefs = Preferences.userRoot().node( PREFERENCES_PATH );
        prefs.putInt( key, value );
    }
    
}
