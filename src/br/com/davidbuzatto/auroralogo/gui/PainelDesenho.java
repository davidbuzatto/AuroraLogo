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
package br.com.davidbuzatto.auroralogo.gui;

import br.com.davidbuzatto.auroralogo.gui.tartaruga.Tartaruga;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.JPanel;

/**
 * Painel responsável em desenhar a tartaruga do ambiente de desenvolvimento da
 * linguagem de programação AuroraLogo.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class PainelDesenho extends JPanel {

    private Tartaruga tartaruga;
    private JanelaPrincipal janelaPrincipal;
    private int xPress;
    private int yPress;
    private boolean dragging;
    
    public PainelDesenho() {
        
        addMouseListener( new MouseAdapter() {
            
            @Override
            public void mousePressed( MouseEvent e ) {
                if ( e.getButton() == MouseEvent.BUTTON1 ) {
                    xPress = e.getX() - tartaruga.getDeslocamentoX();
                    yPress = e.getY() - tartaruga.getDeslocamentoY();
                    setCursor( tartaruga.cursorMaoAberta );
                    dragging = true;
                    tartaruga.setDragging( dragging );
                }
            }
            
            @Override
            public void mouseReleased( MouseEvent e ) {
                setCursor( Cursor.getPredefinedCursor( Cursor.DEFAULT_CURSOR ) );
                dragging = false;
                tartaruga.setDragging( dragging );
            }
            
        });
        
        addMouseMotionListener( new MouseAdapter() {
            
            @Override
            public void mouseMoved( MouseEvent e ) {
                if ( !dragging ) {
                    tartaruga.setXYMouse( e.getX(), e.getY( ) );
                } else {
                    tartaruga.setXYMouse( -1, -1 );
                }
                repaint();
            }

            @Override
            public void mouseDragged( MouseEvent e ) {
                if ( e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK ) {
                    int deslocamentoX = e.getX() - xPress;
                    int deslocamentoY = e.getY() - yPress;
                    tartaruga.setDeslocamento( deslocamentoX, deslocamentoY );
                    repaint();
                }
            }
            
        });
        
        addMouseWheelListener( new MouseAdapter() {
            @Override
            public void mouseWheelMoved( MouseWheelEvent e ) {
                tartaruga.escalonar( ( -e.getPreciseWheelRotation() ) / 2 );
                janelaPrincipal.atualizarLabelZoom();
                repaint();
            }
        });
        
    }
    
    @Override
    protected void paintComponent( Graphics g ) {
        
        super.paintComponent( g );
        
        Graphics2D g2d = (Graphics2D) g.create();
        desenhar( g2d );
        
    }

    public void desenhar( Graphics2D g2d ) {
        
        g2d = (Graphics2D) g2d.create();
        g2d.setRenderingHint( 
                RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON );
        
        if ( tartaruga != null ) {
            tartaruga.desenhar( g2d );
        }
        
        g2d.setColor( Color.BLACK );
        g2d.drawRect( 0, 0, getWidth() - 1, getHeight() - 1 );
        
        g2d.dispose();
        
    }
    
    public void setTartaruga( Tartaruga tartaruga ) {
        this.tartaruga = tartaruga;
    }

    public void setJanelaPrincipal( JanelaPrincipal janelaPrincipal ) {
        this.janelaPrincipal = janelaPrincipal;
    }
    
}
