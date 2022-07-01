package br.com.davidbuzatto.auroralogo.utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
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
    private static final Preferences PREFS = Preferences.userRoot().node( PREFERENCES_PATH );
    public static final String PREF_CAMINHO_ABRIR_SALVAR = "CAMINHO_ABRIR_SALVAR";
    public static final String PREF_TEMA = "TEMA";
    public static final String PREF_DEPURADOR_ATIVO = "DEPURADOR_ATIVO";
    public static final String PREF_VALOR_SLIDER_PASSO_AUTOMATICO = "VALOR_SLIDER_PASSO_AUTOMATICO";
    
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
    
    public static List<Component> obterFilhos( Container pai ) {
        
        List<Component> filhos = new ArrayList<>();
        obterFilhos( pai, filhos );
        
        return filhos;
        
    }
    
    private static void obterFilhos( Container pai, List<Component> filhos ) {
            
        for ( Component f : pai.getComponents() ) {
            filhos.add( f );
            if ( f instanceof Container ) {
                obterFilhos( (Container) f, filhos );
            }
        }
        
    }
    
    public static void inserirTextoFormatado( JTextPane textPane, String texto, Color cor ) {
        
        try {
            
            SimpleAttributeSet attr = new SimpleAttributeSet();
            
            StyleConstants.setForeground( attr, cor );
            StyleConstants.setBold( attr, true );
            
            textPane.getDocument().insertString( 
                    textPane.getDocument().getLength(), texto, attr );
            
        } catch ( BadLocationException exc ) {
            exc.printStackTrace();
        }
        
    }
    
    /*private static Map<String, Color> defaultColors = new HashMap<>();
    
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
    };*/
    
    public static void preparePreferences() {
        
        /*try {
            PREFS.clear();
        } catch ( BackingStoreException exc ) {
            java.util.logging.Logger.getLogger( Utils.class.getName() ).log( java.util.logging.Level.SEVERE, null, exc );
        }*/
        
        /*PREFS.remove( "CAMINHO_ABRIR_SALVAR" );
        PREFS.remove( "TEMA" );*/
        
        /*PREFS.put( "CAMINHO_ABRIR_SALVAR", PREFS.get( "CAMINHO_ABRIR_SALVAR", new File( "" ).getAbsolutePath() ) );
        PREFS.put( "TEMA", PREFS.get( "TEMA1", "claro" ) );*/
        
        PREFS.get( PREF_CAMINHO_ABRIR_SALVAR, new File( "" ).getAbsolutePath() );
        PREFS.get( PREF_TEMA, "claro" );
        PREFS.getBoolean( PREF_DEPURADOR_ATIVO, false );
        PREFS.getInt( PREF_VALOR_SLIDER_PASSO_AUTOMATICO, 100 );
        
        /*for ( Entry<String, Color> e : defaultColors.entrySet() ) {
            PREFS.putInt( e.getKey(), prefs.getInt( e.getKey(), e.getValue().getRGB() ) );
        }*/
        
    }
    
    public static String getPref( String key ) {
        return PREFS.get( key, "" );
    }
    
    public static int getIntPref( String key ) {
        return PREFS.getInt( key, Integer.MIN_VALUE );
    }
    
    public static long getLongPref( String key ) {
        return PREFS.getLong( key, Long.MIN_VALUE );
    }
    
    public static float getFloatPref( String key ) {
        return PREFS.getFloat( key, Float.MIN_VALUE );
    }
    
    public static double getDoublePref( String key ) {
        return PREFS.getDouble( key, Double.MIN_VALUE );
    }
    
    public static boolean getBooleanPref( String key ) {
        return PREFS.getBoolean( key, false );
    }
    
    public static void setPref( String key, String value ) {
        PREFS.put( key, value );
    }
    
    public static void setIntPref( String key, int value ) {
        PREFS.putInt( key, value );
    }
    
    public static void setLongPref( String key, long value ) {
        PREFS.putLong( key, value );
    }
    
    public static void setFloatPref( String key, float value ) {
        PREFS.putFloat( key, value );
    }
    
    public static void setDoublePref( String key, double value ) {
        PREFS.putDouble( key, value );
    }
    
    public static void setBooleanPref( String key, boolean value ) {
        PREFS.putBoolean( key, value );
    }
    
}
