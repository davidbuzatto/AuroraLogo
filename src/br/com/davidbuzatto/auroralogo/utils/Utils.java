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
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import br.com.davidbuzatto.auroralogo.parser.impl.ComponenteVisitorFuncoes;
import br.com.davidbuzatto.auroralogo.parser.impl.Valor;
import static br.com.davidbuzatto.auroralogo.parser.impl.Valor.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.SplashScreen;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorConvertOp;
import java.awt.image.WritableRaster;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.prefs.Preferences;
import java.util.stream.Collectors;
import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.fife.rsta.ui.search.FindReplaceButtonsEnableResult;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.Style;
import org.fife.ui.rsyntaxtextarea.SyntaxScheme;

/**
 * Classe com métodos utilitários para a execução do ambiente de desenvolvimento
 * da linguagem de programação AuroraLogo.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Utils {
    
    private static final String PREFERENCES_PATH = "br.com.davidbuzatto.auroralogo";
    private static final Preferences PREFS = Preferences.userRoot().node( PREFERENCES_PATH );
    
    public static final String PREF_CAMINHO_ABRIR_SALVAR = "CAMINHO_ABRIR_SALVAR";
    public static final String PREF_TEMA = "TEMA";
    public static final String PREF_DEPURADOR_ATIVO = "DEPURADOR_ATIVO";
    public static final String PREF_GRADE_ATIVA = "GRADE_ATIVA";
    public static final String PREF_EIXOS_ATIVOS = "EIXOS_ATIVOS";
    public static final String PREF_PADRAO_CARTESIANO_ATIVO = "PADRAO_CARTESIANO_ATIVO";
    public static final String PREF_VALOR_SLIDER_PASSO_AUTOMATICO = "VALOR_SLIDER_PASSO_AUTOMATICO";
    public static final String PREF_JANELA_PRINCIPAL_MAXIMIZADA = "JANELA_PRINCIPAL_MAXIMIZADA";
    public static final String PREF_COR_TARTARUGA = "COR_TARTARUGA";
    public static final String PREF_ULTIMO_TESTE = "PREF_ULTIMO_TESTE";
    
    public static void mostrarDadosAnalise( 
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
    
    public static void mostrarDadosAnalise( CommonTokenStream tokens ) {
        Utils.mostrarDadosAnalise( tokens, null, null, false );
    }
    
    public static void mostrarDadosAnalise( 
            Parser parser, 
            ParseTree tree, 
            boolean mostrarTestRig ) {
        
        Utils.mostrarDadosAnalise( null, parser, tree, mostrarTestRig );
        
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
    
    public static Color gerarComponenteGradienteAlpha( Color corEsquerda, Color corDireita, double posicao ) {
        
        if ( corEsquerda == null ) {
            corEsquerda = Color.WHITE;
        }
        
        if ( corDireita == null ) {
            corDireita = Color.BLACK;
        }
        
        int r = (int) ( corDireita.getRed() * posicao + corEsquerda.getRed() * ( 1 - posicao ) );
        int g = (int) ( corDireita.getGreen() * posicao + corEsquerda.getGreen() * ( 1 - posicao ) );
        int b = (int) ( corDireita.getBlue() * posicao + corEsquerda.getBlue() * ( 1 - posicao ) );
        int a = (int) ( corDireita.getAlpha() * posicao + corEsquerda.getAlpha() * ( 1 - posicao ) );
        
        return new Color( r, g, b, a );
        
    }
    
    public static Color decodificarCor( String strCor ) throws NumberFormatException {
        
        if ( strCor.length() >= 7 ) {

            Color cor = Color.decode( strCor.substring( 0, 7 ) );

            if ( strCor.length() == 9 ) {
                String alpha = strCor.substring( 7 );
                cor = new Color( cor.getRed(), cor.getGreen(), cor.getBlue(), Integer.valueOf( alpha, 16 ) );
            }

            return cor;

        }

        return Color.BLACK;
        
    }
    
    public static Color subtrairCores( Color c1, Color c2 ) {
        
        int rC1 = c1.getRed();
        int gC1 = c1.getGreen();
        int bC1 = c1.getBlue();
        int aC1 = c1.getAlpha();
        
        int rC2 = c2.getRed();
        int gC2 = c2.getGreen();
        int bC2 = c2.getBlue();
        int aC2 = c2.getAlpha();
        
        int rC = Math.max( rC1 - rC2, 0 );
        int gC = Math.max( gC1 - gC2, 0 );
        int bC = Math.max( bC1 - bC2, 0 );
        int aC = Math.max( aC1 - aC2, 0 );
        
        if ( aC1 != 255 || aC2 != 255 ) {
            return new Color( rC, gC, bC, aC );
        }
        
        return new Color( rC, gC, bC );
        
    }
    
    public static Color multiplicarCores( Color c1, Color c2 ) {
        
        int rC1 = c1.getRed();
        int gC1 = c1.getGreen();
        int bC1 = c1.getBlue();
        int aC1 = c1.getAlpha();
        
        int rC2 = c2.getRed();
        int gC2 = c2.getGreen();
        int bC2 = c2.getBlue();
        int aC2 = c2.getAlpha();
        
        int rC = Math.max( rC1 * rC2 / 255, 0 );
        int gC = Math.max( gC1 * gC2 / 255, 0 );
        int bC = Math.max( bC1 * bC2 / 255, 0 );
        int aC = Math.max( aC1 * aC2 / 255, 0 );
        
        if ( aC1 != 255 || aC2 != 255 ) {
            return new Color( rC, gC, bC, aC );
        }
        
        return new Color( rC, gC, bC );
        
    }
    
    public static Color dividirCores( Color c1, Color c2 ) {
        
        int rC1 = c1.getRed();
        int gC1 = c1.getGreen();
        int bC1 = c1.getBlue();
        int aC1 = c1.getAlpha();
        
        int rC2 = c2.getRed();
        int gC2 = c2.getGreen();
        int bC2 = c2.getBlue();
        int aC2 = c2.getAlpha();
        
        int rC = rC1 / Math.max( rC2, 1 );
        int gC = gC1 / Math.max( gC2, 1 );
        int bC = bC1 / Math.max( bC2, 1 );
        int aC = aC1 / Math.max( aC2, 1 );
        
        if ( aC1 != 255 || aC2 != 255 ) {
            return new Color( rC, gC, bC, aC );
        }
        
        return new Color( rC, gC, bC );
        
    }
    
    public static Color restoCores( Color c1, Color c2 ) {
        
        int rC1 = c1.getRed();
        int gC1 = c1.getGreen();
        int bC1 = c1.getBlue();
        int aC1 = c1.getAlpha();
        
        int rC2 = c2.getRed();
        int gC2 = c2.getGreen();
        int bC2 = c2.getBlue();
        int aC2 = c2.getAlpha();
        
        int rC = rC1 % Math.max( rC2, 1 );
        int gC = gC1 % Math.max( gC2, 1 );
        int bC = bC1 % Math.max( bC2, 1 );
        int aC = aC1 % Math.max( aC2, 1 );
        
        if ( aC1 != 255 || aC2 != 255 ) {
            return new Color( rC, gC, bC, aC );
        }
        
        return new Color( rC, gC, bC );
        
    }
    
    public static Color inverterCor( Color c ) {
        
        int a = c.getAlpha();
        int r = 255 - c.getRed();
        int g = 255 - c.getGreen();
        int b = 255 - c.getBlue();
        
        return new Color( r, g, b, a );
    
    }
    
    /*
     * Cria um array de dimensões especificada no vararg "dimensoes".
     */
    public static Object criarArrayNDimensional( Integer... dimensoes ) {
        return criarArrayNDimensional( "", false, dimensoes );
    }
    
    private static Object criarArrayNDimensional( String identacao, boolean tracar, Integer... dimensoes ) {
        
        if ( dimensoes.length >= 1 ) {
            
            List<Integer> listaIndices = new ArrayList<>( Arrays.<Integer>asList(dimensoes ) );
            Integer tamanhoAtual = listaIndices.remove( 0 );
            
            if ( tamanhoAtual  <= 0 ) {
                tamanhoAtual  = 1;
            }
            
            Object[] novoSubArray = new Object[tamanhoAtual];
            
            for ( int i = 0; i < tamanhoAtual ; i++ ) {
                if ( tracar ) {
                    System.out.println( identacao + i );
                }
                novoSubArray[i] = criarArrayNDimensional( 
                        identacao + "  ", 
                        tracar, 
                        listaIndices.toArray( Integer[]::new ) );
            }
            
            return novoSubArray;
            
        }
        
        return novoInteiro( 0 );
        
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
            
            g2d.drawString( v, 346 - vWidth, 205 );
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
    
    public static Object[] cloneArrayObject( Object[] ao ) {
        
        Object[] clone = ao.clone();
        
        for ( int i = 0; i < clone.length; i++ ) {
            
            Object vClone = clone[i];
            if ( vClone instanceof Object[] ) {
                clone[i] = cloneArrayObject( (Object[]) clone[i] );
            } else if ( vClone instanceof LinkedHashMap ) {
                clone[i] = cloneLinkedHashMapObject( (LinkedHashMap<String, Object>) clone[i] );
            }

        }
        
        return clone;
        
    }
    
    public static LinkedHashMap<String, Object> cloneLinkedHashMapObject( LinkedHashMap<String, Object> ao ) {
        
        LinkedHashMap<String, Object> clone = (LinkedHashMap<String, Object>) ao.clone();
        
        for ( Entry<String, Object> e : clone.entrySet() ) {
            if ( e.getValue() instanceof LinkedHashMap ) {
                clone.put( e.getKey(), cloneLinkedHashMapObject( (LinkedHashMap<String, Object>) e.getValue() ) );
            } else if ( e.getValue() instanceof Object[] ) {
                clone.put( e.getKey(), cloneArrayObject( (Object[]) e.getValue() ) );
            }
        }
        
        return clone;
        
    }
    
    public static String toString( Object o ) {
        
        StringBuilder sb = new StringBuilder();
        
        if ( o instanceof Valor ) {
            o = ( (Valor) o ).getValor();
        }
        
        toString( o, sb, "", null, false );
        
        return sb.toString().trim();
        
    }
    
    private static void toString( Object o, StringBuilder sb, String ident, Object p, boolean addVirgula ) {
        
        String fixIdent = "    ";
        
        if ( o instanceof Object[] ) {
            sb.append( ident ).append( ( p == null ? "" : ( p instanceof String ? "\"" + p + "\"" : p ) + ": " ) ).append( "[" ).append( "\n" );
            Object[] oa = (Object[]) o;
            for ( int i = 0; i < oa.length; i++ ) {
                Object oi = oa[i];
                if ( oi instanceof Valor ) {
                    toString( ( (Valor) oi ).getValor(), sb, ident + fixIdent, i, i != oa.length - 1 );
                } else {
                    toString( oi, sb, ident + fixIdent, i, i != oa.length - 1 );
                }
            }
            sb.append( ident ).append( "]" ).append( addVirgula ? "," : "" ).append( "\n" );
        } else if ( o instanceof LinkedHashMap ) {
            sb.append( ident ).append( ( p == null ? "" : ( p instanceof String ? "\"" + p + "\"" : p ) + ": " ) ).append( "{" ).append( "\n" );
            LinkedHashMap<String, Object> lhm = (LinkedHashMap<String, Object>) o;
            int i = 0;
            for ( Entry<String, Object> e : lhm.entrySet() ) {
                if ( e.getValue() instanceof Valor ) {
                    toString( ( (Valor) e.getValue() ).getValor(), sb, ident + fixIdent, e.getKey(), i != lhm.size() - 1 );
                } else {
                    toString( e.getValue(), sb, ident + fixIdent, e.getKey(), i != lhm.size() - 1 );
                }
                i++;
            }
            sb.append( ident ).append( "}" ).append( addVirgula ? "," : "" ).append( "\n" );
        } else {
            
            String valor = "NULO";
            
            if ( o != null ) {
                
                valor = o.toString();
                
                if ( o instanceof Color ) {
                    valor = colorParaHexa( (Color) o );
                } else if ( o instanceof Character ) {
                    valor = "'" + o + "'";
                } else if ( o instanceof String ) {
                    valor = "\"" + o + "\"";
                } else if ( o instanceof Boolean ) {
                    valor = (Boolean) o ? "VERDADEIRO" : "FALSO";
                }
                
            }
            
            sb.append( ident ).append( ( p == null ? "" : ( p instanceof String ? "\"" + p + "\"" : p ) + ": " ) ).append( valor ).append( addVirgula ? "," : "" ).append( "\n" );
            
        }
        
    }
    
    public static String toStringArranjo( Object[] arranjo ) {
        StringBuilder sb = new StringBuilder();
        toStringArranjo( arranjo, sb );
        return sb.toString();
    }
    
    private static void toStringArranjo( Object[] arranjo, StringBuilder sb ) {
        
        boolean primeiro = true;
        sb.append( "[" );
        
        for ( Object o : arranjo ) {
            if ( !primeiro ) {
                sb.append( ", " );
            }
            if ( o instanceof Object[] ) {
                toStringArranjo( (Object[]) o, sb );
            } else {
                if ( o instanceof String ) {
                    sb.append( "\"" ).append( o.toString() ).append("\"");
                } else if ( o instanceof Character ) {
                    sb.append( "'" ).append( o.toString() ).append("'");
                } else if ( o instanceof Valor ) {
                    Valor v = (Valor) o;
                    if ( v.isString() ) {
                        StringBuilder append = sb.append( "\"" + v + "\"" );
                    } else if ( v.isCaractere() ) {
                        sb.append( "'" ).append( v ).append("'");
                    } else if ( v.isArranjoAssociativo() ) {
                        sb.append( toStringArranjoAssociativo( v ) );
                    } else {
                        sb.append( v.toString() );
                    }
                } else {
                    sb.append( o.toString() );
                }
            }
            primeiro = false;
        }
        
        sb.append( "]" );
        
    }
    
    public static String toStringArranjoAssociativo( Valor v ) {
        
        StringBuilder sb = new StringBuilder();
        
        if ( v.isArranjoAssociativo() ) {
            
            LinkedHashMap<String, Object> mapa = (LinkedHashMap<String, Object>) v.getValor();
            sb.append( "{" );
            
            boolean primeiro = true;
            for ( Entry<String, Object> e : mapa.entrySet() ) {
                
                if ( !primeiro ) {
                    sb.append( ", " );
                }
                
                sb.append( "\"" ).append( e.getKey() ).append("\"=");
                Object o = e.getValue();
                
                if ( o instanceof Object[] ) {
                    toStringArranjo( (Object[]) o, sb );
                } else {
                    if ( o instanceof String ) {
                        sb.append( "\"" ).append( o.toString() ).append("\"");
                    } else if ( o instanceof Character ) {
                        sb.append( "'" ).append( o.toString() ).append("'");
                    } else if ( o instanceof Valor ) {
                        Valor vv = (Valor) o;
                        if ( vv.isString() ) {
                            sb.append( "\"" ).append( vv ).append("\"");
                        } else if ( vv.isCaractere() ) {
                            sb.append( "'" ).append( vv ).append("'");
                        } else if ( vv.isArranjoAssociativo() ) {
                            sb.append( toStringArranjoAssociativo( vv ) );
                        } else {
                            sb.append( vv.toString() );
                        }
                    } else {
                        sb.append( o.toString() );
                    }
                }
                
                primeiro = false;
            }
            
            sb.append( "}" );
            
        }
        
        return sb.toString();
        
    }
    
    public static int mapeamentoModular( int i, int t ) {
        
        if ( i < 0 ) {
            i %= t;
            i += t;
            i %= t;
        } else {
            i %= t;
        }
        
        return i;
        
    }
    
    public static void criarItensMenuTestes( JanelaPrincipal janelaPrincipal, JMenu menuTestes ) {
        
        try {
            
            Path path = new File( Utils.class.getResource( 
                    "/br/com/davidbuzatto/auroralogo/templates/testes/testes.aulg" ).toURI() ).getParentFile().toPath();
            
            List<String> arquivosTeste = Files.walk( path )
                                             .map( Path::getFileName )
                                             .map( Path::toString )
                                             .filter( n -> n.endsWith( ".aulg" ) )
                                             .collect( Collectors.toList() );
            
            for ( String a : arquivosTeste ) {
                menuTestes.add( new AbstractAction( a ) {
                    @Override
                    public void actionPerformed( ActionEvent e ) {
                        String teste = a.replace( ".aulg", "" );
                        janelaPrincipal.carregarTesteAulg( teste, true );
                        setPref( PREF_ULTIMO_TESTE, teste );
                    }
                });
            }
            
        } catch ( Exception exc ) {
            menuTestes.setVisible( false );
            exc.printStackTrace();
        }
        
    }
    
    public static void criarItensMenuExemplos( JanelaPrincipal janelaPrincipal, JMenu menuExemplos ) {
        
        try {
            
            Scanner s = new Scanner( Utils.class.getResourceAsStream( 
                    "/br/com/davidbuzatto/auroralogo/templates/exemplos/exemplos.txt" ) );
            
            List<String> nomes = new ArrayList<>();
            while ( s.hasNextLine() ) {
                nomes.add( s.nextLine() );
            }
            
            LinkedHashMap<String, JMenu> menus = new LinkedHashMap<>();
            for ( String linha : nomes ) {
                
                if ( !linha.trim().startsWith( "//" ) && !linha.trim().isEmpty() ) {

                    if ( linha.contains( "_" ) ) {
                        String[] dados = linha.split( "_" );
                        String nomeMenu = dados[0].replace( "-", " " );
                        String nomeExemplo = dados[1];
                        JMenu menu;
                        if ( !menus.containsKey( nomeMenu ) ) {
                            menu = new JMenu( nomeMenu );
                            menus.put( nomeMenu, menu );
                            menuExemplos.add( menu );
                        } else {
                            menu = menus.get( nomeMenu );
                        }
                        menu.add( new AbstractAction( nomeExemplo.replace( "-", " " ).replace( ".aulg", "" ) ) {
                            @Override
                            public void actionPerformed( ActionEvent e ) {
                                String exemplo = linha.replace( ".aulg", "" );
                                janelaPrincipal.novoArquivo();
                                janelaPrincipal.carregarExemploAulg( exemplo, true );
                            }
                        });
                    } else {
                        menuExemplos.add( new AbstractAction( linha.replace( "-", " " ).replace( ".aulg", "" ) ) {
                            @Override
                            public void actionPerformed( ActionEvent e ) {
                                String exemplo = linha.replace( ".aulg", "" );
                                janelaPrincipal.novoArquivo();
                                janelaPrincipal.carregarExemploAulg( exemplo, true );
                            }
                        });
                    }
                    
                }
                
            }
            
        } catch ( Exception exc ) {
            exc.printStackTrace();
        }
        
    }
    
    public static String montarListaParametros( AuroraLogoParser.FuncContext ctx ) {
        
        String s = "";
        
        boolean primeiro = true;
        for ( TerminalNode t : ctx.ID() ) {
            if ( !primeiro ) {
                s += ", ";
            }
            s += t.getText();
            primeiro = false;
        }
        
        return s;
        
    }
    
    public static String gerarId( String idBase ) {
        
        if ( ComponenteVisitorFuncoes.PILHA_ESCOPOS.isEmpty() ) {
            return idBase;
        }
        
        return ComponenteVisitorFuncoes.PILHA_ESCOPOS.peek() + "(" + idBase + ")";
        
    }
    
    public static String formatarIdVariavelFuncao( String id ) {
        
        String idLimpo = id;
        
        if ( id.startsWith( "f" ) ) {
            
            int pP = id.indexOf( "(" );
            int pU = id.lastIndexOf( "_" );
            
            if ( pP >= 0 && pU >= 0 ) {
                String nV = id.substring( pP + 1, id.length() - 1 );
                String nF = id.substring( 0, pU );
                idLimpo = nF + "->" + nV;
            }
            
        }
        
        return idLimpo;
        
    }
    
    private static void mudarColoracaoSintaxe( RSyntaxTextArea textAreaCodigo ) {
        
        SyntaxScheme syntaxScheme = new SyntaxScheme( true );
        syntaxScheme.setStyle( SyntaxScheme.RESERVED_WORD, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.RESERVED_WORD_2, new Style( new Color( getIntPref( "RESERVED_WORD_2" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.IDENTIFIER, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.OPERATOR, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.FUNCTION, new Style( new Color( getIntPref( "FUNCTION" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.LITERAL_NUMBER_DECIMAL_INT, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.LITERAL_NUMBER_FLOAT, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.LITERAL_NUMBER_HEXADECIMAL, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.COMMENT_EOL, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.COMMENT_MULTILINE, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.COMMENT_DOCUMENTATION, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        textAreaCodigo.setSyntaxScheme( syntaxScheme );
        
    }
    
    public static void prepararPreferences( boolean reset ) {
        
        if ( reset ) {
            PREFS.remove( PREF_CAMINHO_ABRIR_SALVAR );
            PREFS.remove( PREF_TEMA );
            PREFS.remove( PREF_DEPURADOR_ATIVO );
            PREFS.remove( PREF_GRADE_ATIVA );
            PREFS.remove( PREF_EIXOS_ATIVOS );
            PREFS.remove( PREF_PADRAO_CARTESIANO_ATIVO );
            PREFS.remove( PREF_VALOR_SLIDER_PASSO_AUTOMATICO );
            PREFS.remove( PREF_JANELA_PRINCIPAL_MAXIMIZADA );
            PREFS.remove( PREF_COR_TARTARUGA );
            PREFS.remove( PREF_ULTIMO_TESTE );
        }
        
        PREFS.put( PREF_CAMINHO_ABRIR_SALVAR, PREFS.get( PREF_CAMINHO_ABRIR_SALVAR, new File( "" ).getAbsolutePath() ) );
        PREFS.put( PREF_TEMA, PREFS.get( PREF_TEMA, "claro" ) );
        PREFS.putBoolean( PREF_DEPURADOR_ATIVO, PREFS.getBoolean( PREF_DEPURADOR_ATIVO, false ) );
        PREFS.putBoolean( PREF_GRADE_ATIVA, PREFS.getBoolean( PREF_GRADE_ATIVA, false ) );
        PREFS.putBoolean( PREF_EIXOS_ATIVOS, PREFS.getBoolean( PREF_EIXOS_ATIVOS, false ) );
        PREFS.putBoolean( PREF_PADRAO_CARTESIANO_ATIVO, PREFS.getBoolean( PREF_PADRAO_CARTESIANO_ATIVO, true ) );
        PREFS.putInt( PREF_VALOR_SLIDER_PASSO_AUTOMATICO, PREFS.getInt( PREF_VALOR_SLIDER_PASSO_AUTOMATICO, 100 ) );
        PREFS.putBoolean( PREF_JANELA_PRINCIPAL_MAXIMIZADA, PREFS.getBoolean( PREF_JANELA_PRINCIPAL_MAXIMIZADA, false ) );
        PREFS.putInt( PREF_COR_TARTARUGA, PREFS.getInt( PREF_COR_TARTARUGA, Integer.MAX_VALUE ) );
        PREFS.put( PREF_ULTIMO_TESTE, PREFS.get( PREF_ULTIMO_TESTE, "testes" ) );
        
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
        
        
    }
    
    
}
