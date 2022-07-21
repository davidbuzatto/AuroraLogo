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
package br.com.davidbuzatto.auroralogo.gui.tartaruga;

import br.com.davidbuzatto.auroralogo.parser.impl.Valor;
import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.List;

/**
 * Representação de uma variável do depurador.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VariavelDepurador {
    
    protected String nome;
    protected Valor valor;
    
    protected int x;
    protected int y;
    protected int xMouse;
    protected int yMouse;
    protected int largura;
    protected int altura;
    
    protected boolean mouseOver;
    
    public boolean desenhar( Graphics2D g2d, Color corTexto, Color corDepurador, FontMetrics fm, int xMouse, int yMouse ) {
        
        g2d = (Graphics2D) g2d.create();
        g2d.setColor( corTexto );
        
        corDepurador = corDepurador.darker().darker();
        Color corTextoInvertida = Utils.inverterCor( corTexto );
        
        mouseOver = xMouse >= x && xMouse <= x + largura && 
                    yMouse >= ( y - altura ) && yMouse <= y - 1;
        
        nome = Utils.formatarIdVariavelFuncao( nome );
        String textoNome = nome;
        String textoValor = "";
        
        // abrevia o nome
        if ( textoNome.length() > 10 ) {
            textoNome = nome.substring( 0, 6 ) + "..." + nome.charAt( nome.length() - 1 );
        }

        String completo = textoNome + ": ";

        if ( valor.isCor() ) {
            textoValor = "  (" + valor + ")";
        } else if ( valor.isString() ) {
            textoValor = "\"" + valor + "\"";
        } else if ( valor.isCaractere() ) {
            textoValor = "'" + valor + "'";
        } else {
            textoValor = String.valueOf( valor );
        }
        
        completo += textoValor;
        if ( completo.length() > 25 ) {
            completo = completo.substring( 0, 22 ) + "...";
        }
        
        completo = "\u251e\u2500" + completo;
                
        String complemento = "";
        for ( int j = 0; j < 27 - completo.length(); j++ ) {
            complemento += " ";
        }
        complemento += "\u2502";
        completo += complemento;
           
        if ( mouseOver ) {
            g2d.setColor( corDepurador );
            g2d.fillRect( x, y - altura, largura, altura );
            g2d.setColor( corTextoInvertida );
        } else {
            g2d.setColor( corTexto );
        }
        
        g2d.drawString( completo, x - 3, y - 3 );
        
        if ( valor.isCor() ) {
                
            int largVar = fm.stringWidth( completo.substring( 0, completo.indexOf( ":" ) + 1 ) );
            
            g2d.setColor( Color.WHITE );
            g2d.fillRect( x + largVar + 3, y - 12, 10, 10 );
            
            g2d.setColor( valor.valorCor() );
            g2d.fillRect( x + largVar + 3, y - 12, 10, 10 );

            g2d.setColor( corTexto );
            g2d.drawRect( x + largVar + 3, y - 12, 10, 10 );

        }
        
        if ( mouseOver ) {
            
            List<String> saida = new ArrayList<>();
            String sg = "";
            int largMax = 0;
            int larg = 0;
            
            String sv = Utils.toStringGeral( valor.getValor() );

            if ( sv.contains( "\\n" ) || sv.contains( "\n" ) ) {

                sg = nome + ":";
                
                larg = fm.stringWidth( sg );
                if ( largMax < larg ) {
                    largMax = larg;
                }   
                saida.add( sg );
                
                String[] ssv = null;

                if ( sv.contains( "\\n" ) ) {
                    ssv = sv.split( "\\\\n" );
                } else {
                    ssv = sv.split( "\n" );
                }

                for ( int i = 0; i < ssv.length; i++ ) {

                    sg = "    " + ssv[i];

                    larg = fm.stringWidth( sg );
                    if ( largMax < larg ) {
                        largMax = larg;
                    }
                    saida.add( sg );

                }
                
            } else {
                
                if ( valor.isString() ) {
                    sg = nome + ": \"" + valor + "\"";
                } else if ( valor.isCaractere() ) {
                    sg = nome + ": '" + valor + "'";
                } else if ( valor.isCor() ) {
                    sg = nome + ":   (" + valor + ")";
                } else {
                    sg = nome + ": " + valor;
                }
                
                larg = fm.stringWidth( sg );
                if ( largMax < larg ) {
                    largMax = larg;
                }
                saida.add( sg );
                
            }
            
            RoundRectangle2D.Double r = new RoundRectangle2D.Double( 
                    xMouse + 10, yMouse + 10, largMax + 20, saida.size() * 15 + 7, 10, 10 );
                    
            g2d.setColor( corDepurador );
            g2d.fill( r );
            
            g2d.setColor( corTexto );
            g2d.draw( r );
            
            int i = 0;
            for ( String s : saida ) { 
                
                int largVar = fm.stringWidth( s.substring( 0, s.indexOf( ":" ) + 1 ) );
            
                try {
                    
                    Color c = Utils.decodificarCor( s.substring( s.indexOf( "(#" ) + 1, s.lastIndexOf( ")" ) ) );
                            
                    g2d.setColor( Color.WHITE );
                    g2d.fillRect( xMouse + largVar + 25, yMouse + 17 + ( 15 * i ), 10, 10 );
                    
                    g2d.setColor( c );
                    g2d.fillRect( xMouse + largVar + 25, yMouse + 17 + ( 15 * i ), 10, 10 );

                    g2d.setColor( corTexto );
                    g2d.drawRect( xMouse + largVar + 25, yMouse + 17 + ( 15 * i ), 10, 10 );
                    
                } catch ( StringIndexOutOfBoundsException | NumberFormatException exc ) {
                    // não é uma cor
                }
                
                g2d.setColor( corTextoInvertida );
                g2d.drawString( s, xMouse + 20, yMouse + 26 + ( 15 * i ) );
                
                i++;
                
            }
            
            
            g2d.dispose();
            return true;
            
        }
        
        g2d.dispose();
        return false;
        
    }
    
}
