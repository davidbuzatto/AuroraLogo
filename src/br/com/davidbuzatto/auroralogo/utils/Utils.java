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
package br.com.davidbuzatto.auroralogo.utils;

import br.com.davidbuzatto.auroralogo.gui.JanelaPrincipal;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.SplashScreen;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorConvertOp;
import java.awt.image.WritableRaster;
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
import org.fife.rsta.ui.search.FindReplaceButtonsEnableResult;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;

/**
 * Classe com métodos utilitários para a execução do ambiente de desenvolvimento
 * da linguagem de programação AuroraLogo.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class Utils {
    
    private static final String PREFERENCES_PATH = "br.com.davidbuzatto.auroralogo";
    private static final Preferences PREFS = Preferences.userRoot().node( PREFERENCES_PATH );
    
    public static final String PREF_CAMINHO_ABRIR_SALVAR = "CAMINHO_ABRIR_SALVAR";
    public static final String PREF_TEMA = "TEMA";
    public static final String PREF_DEPURADOR_ATIVO = "DEPURADOR_ATIVO";
    public static final String PREF_GRADE_ATIVA = "GRADE_ATIVA";
    public static final String PREF_VALOR_SLIDER_PASSO_AUTOMATICO = "VALOR_SLIDER_PASSO_AUTOMATICO";
    public static final String PREF_JANELA_PRINCIPAL_MAXIMIZADA = "JANELA_PRINCIPAL_MAXIMIZADA";
    public static final String PREF_COR_TARTARUGA = "COR_TARTARUGA";
    
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
    
    public static void inserirTextoFormatado( JTextPane textPane, String texto, boolean negrito, Color corTexto ) {
        inserirTextoFormatado( textPane, texto, negrito, corTexto, null );
    }
    
    public static void inserirTextoFormatado( JTextPane textPane, String texto, boolean negrito, Color corTexto, Color corFundo ) {
        
        try {
            
            SimpleAttributeSet attr = new SimpleAttributeSet();
            
            if ( corTexto == null ) {
                corTexto = Color.BLACK;
            }
            
            if ( corFundo == null ) {
                corFundo = textPane.getBackground();
            }
            
            StyleConstants.setForeground( attr, corTexto );
            StyleConstants.setBackground( attr, corFundo );
            StyleConstants.setBold( attr, negrito );
            
            textPane.getDocument().insertString( 
                    textPane.getDocument().getLength(), texto, attr );
            
        } catch ( BadLocationException exc ) {
            exc.printStackTrace();
        }
        
    }
    
    public static void inserirMensagemEmitente( JTextPane textPane, String quemDisse, String oQueDisse, Color corTexto ) {
        
        quemDisse += ":";
        oQueDisse = " " + oQueDisse.replace( "\\n", "\n" );
        
        if ( corTexto == null ) {
            
            int c = 0;
            
            Color[] cores = {
                new Color( 151, 53, 152 ),
                new Color( 0, 102, 203 ),
                new Color( 24, 210, 233 ),
                new Color( 104, 203, 60 ),
                new Color( 244, 244, 0 ),
                new Color( 249, 149, 38 ),
                new Color( 245, 18, 9 )
            };
            
            for ( char ch : quemDisse.toCharArray() ) {
                
                inserirTextoFormatado( 
                        textPane, 
                        ch + "", 
                        true,
                        gerarComponenteGradiente( cores[c], Color.WHITE, .5 ),
                        gerarComponenteGradiente( cores[c], Color.BLACK, .5 ) );
                
                c++;
                c %= cores.length;
                
            }

            for ( char ch : oQueDisse.toCharArray() ) {
                
                Utils.inserirTextoFormatado( 
                        textPane, 
                        ch + "", 
                        true,
                        gerarComponenteGradiente( cores[c], Color.BLACK, .8 ) );
                
                c++;
                c %= cores.length;
                
            }
            
        } else {
        
            inserirTextoFormatado( 
                    textPane, 
                    quemDisse, 
                    true,
                    gerarComponenteGradiente( corTexto, Color.WHITE, .5 ),
                    gerarComponenteGradiente( corTexto, Color.BLACK, .5 ) );


            Utils.inserirTextoFormatado( 
                    textPane, 
                    oQueDisse, 
                    true,
                    gerarComponenteGradiente( corTexto, Color.BLACK, .5 ) );
        
        }
        
    }
    
    public static void inserirCorCodigo( RSyntaxTextArea textAreaCodigo, Color cor ) {
        
        try {
            
            SimpleAttributeSet attr = new SimpleAttributeSet();
            
            textAreaCodigo.getDocument().insertString( 
                    textAreaCodigo.getCaretPosition(), colorParaHexa( cor ), attr );
            
        } catch ( BadLocationException exc ) {
            exc.printStackTrace();
        }
        
    }
    
    public static String colorParaHexa( Color cor ) {
        
        return "#" 
                + String.format( "%02X", cor.getRed() )
                + String.format( "%02X", cor.getGreen() )
                + String.format( "%02X", cor.getBlue() )
                + ( cor.getAlpha() != 255 ? String.format( "%02X", cor.getAlpha() ) : "" );
        
    }
    
    public static String toUnicodeScape( char c ) {
        return "\\u" + String.format( "%04X", (int) c );
    }
    
    public static BufferedImage processarImagemTartaruga( BufferedImage imgTartaruga, Color cor, double p ) {
        
        BufferedImageOp op = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null); 
        BufferedImage imgCinza = op.filter( imgTartaruga, null );
        BufferedImage imgFinal = new BufferedImage( imgTartaruga.getWidth(), imgTartaruga.getHeight(), BufferedImage.TYPE_INT_ARGB );
        
        WritableRaster wrC = imgCinza.getRaster();
        WritableRaster wrF = imgFinal.getRaster();
        WritableRaster wrT = imgTartaruga.getRaster();
        
        int[] corC = new int[2];
        int[] corT = new int[4];
        
        for ( int x = 0; x < wrC.getWidth(); x++ ) {
            for ( int y = 0; y < wrC.getHeight(); y++ ) {
                
                corC = wrC.getPixel( x, y, corC );
                corT = wrT.getPixel( x, y, corT );
                
                if ( corT[3] != 0 ) {
                    
                    int r = (int) ( corC[0] * p + cor.getRed() * ( 1 - p ) );
                    int g = (int) ( corC[0] * p + cor.getGreen() * ( 1 - p ) );
                    int b = (int) ( corC[0] * p + cor.getBlue() * ( 1 - p ) );
                    
                    corT[0] = r;
                    corT[1] = g;
                    corT[2] = b;
                    
                    wrF.setPixel( x, y, corT );
                }
                
            }
            
        }
        
        return imgFinal;
        
    }
    
    public static Color gerarComponenteGradiente( Color corEsquerda, Color corDireita, double posicao ) {
        return gerarComponenteGradiente( corEsquerda, corDireita, posicao, 255 );
    }
    
    public static Color gerarComponenteGradiente( Color corEsquerda, Color corDireita, double posicao, int alpha ) {
        
        if ( corEsquerda == null ) {
            corEsquerda = Color.WHITE;
        }
        
        if ( corDireita == null ) {
            corDireita = Color.BLACK;
        }
        
        int r = (int) ( corDireita.getRed() * posicao + corEsquerda.getRed() * ( 1 - posicao ) );
        int g = (int) ( corDireita.getGreen() * posicao + corEsquerda.getGreen() * ( 1 - posicao ) );
        int b = (int) ( corDireita.getBlue() * posicao + corEsquerda.getBlue() * ( 1 - posicao ) );
        
        return new Color( r, g, b, alpha );
        
    }
    
    public static void updateSplashScreen( int millisecondsToWait ) {
        
        SplashScreen sp = SplashScreen.getSplashScreen();
        if ( sp != null ) {
            
            Graphics2D g2d = (Graphics2D) sp.createGraphics();
            g2d.setRenderingHint( 
                    RenderingHints.KEY_ANTIALIASING, 
                    RenderingHints.VALUE_ANTIALIAS_ON );
            g2d.setColor( new Color( 0, 102, 143 ) );
            
            Font f = new Font( "Century Gothic", Font.BOLD, 30 ) ;
            if ( f.getFamily().equals( Font.DIALOG ) ) {
                f = new Font( Font.MONOSPACED, Font.BOLD, 30 ) ;
            }
            g2d.setFont( f );
            
            FontMetrics fm = g2d.getFontMetrics();
            String v = JanelaPrincipal.VERSAO;
            int vWidth = fm.stringWidth( v );
            
            g2d.drawString( v, 300 - vWidth, 175 );
            g2d.dispose();
            
            sp.update();
            
            try {
                Thread.sleep( millisecondsToWait );
            } catch ( InterruptedException exc ) {
            }
            
        }
        
    }
    
    public static void gerarCoordenadasPoligonoRegular( double xCentro, double yCentro, double raio, double angulo, double[] xs, double[] ys ) {
        
        int quantidadeLados = xs.length;
        double incrementoAngulo = 360.0 / quantidadeLados;

        for ( int i = 0; i < quantidadeLados; i++ ) {
            xs[i] = xCentro + Math.cos( Math.toRadians( angulo ) ) * raio;
            ys[i] = yCentro + Math.sin( Math.toRadians( angulo ) ) * raio;
            angulo += incrementoAngulo;
        }
        
    }
    
    public static String getToolTip( FindReplaceButtonsEnableResult res ) {
        
        String tooltip = res.getError();
        
        if ( tooltip != null && tooltip.indexOf( '\n' ) > -1 ) {
            tooltip = tooltip.replaceFirst( "\\\n", "</b><br><pre>" );
            tooltip = "<html><b>" + tooltip;
        }
        
        return tooltip;
        
    }
    
    public static void prepararPreferences( boolean reset ) {
        
        if ( reset ) {
            PREFS.remove( PREF_CAMINHO_ABRIR_SALVAR );
            PREFS.remove( PREF_TEMA );
            PREFS.remove( PREF_DEPURADOR_ATIVO );
            PREFS.remove( PREF_GRADE_ATIVA );
            PREFS.remove( PREF_VALOR_SLIDER_PASSO_AUTOMATICO );
            PREFS.remove( PREF_JANELA_PRINCIPAL_MAXIMIZADA );
            PREFS.remove( PREF_COR_TARTARUGA );
        }
        
        PREFS.put( PREF_CAMINHO_ABRIR_SALVAR, PREFS.get( PREF_CAMINHO_ABRIR_SALVAR, new File( "" ).getAbsolutePath() ) );
        PREFS.put( PREF_TEMA, PREFS.get( PREF_TEMA, "claro" ) );
        PREFS.putBoolean( PREF_DEPURADOR_ATIVO, PREFS.getBoolean( PREF_DEPURADOR_ATIVO, false ) );
        PREFS.putBoolean( PREF_GRADE_ATIVA, PREFS.getBoolean( PREF_GRADE_ATIVA, false ) );
        PREFS.putInt( PREF_VALOR_SLIDER_PASSO_AUTOMATICO, PREFS.getInt( PREF_VALOR_SLIDER_PASSO_AUTOMATICO, 100 ) );
        PREFS.putBoolean( PREF_JANELA_PRINCIPAL_MAXIMIZADA, PREFS.getBoolean( PREF_JANELA_PRINCIPAL_MAXIMIZADA, false ) );
        PREFS.putInt( PREF_COR_TARTARUGA, PREFS.getInt( PREF_COR_TARTARUGA, Integer.MAX_VALUE ) );
        
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
    
    public static void main( String[] args ) {
        System.out.println( toUnicodeScape( 'á' ) );
    }
    
}
