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

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 * Painel responsável em desenhar a tartaruga do ambiente de desenvolvimento da
 * linguagem de programação AuroraLogo.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class PainelDesenho extends JPanel {

    private Tartaruga tartaruga;
    
    @Override
    protected void paintComponent( Graphics g ) {
        
        super.paintComponent( g );
        
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint( 
                RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON );
        
        if ( tartaruga != null ) {
            tartaruga.desenhar( g2d );
        }
        
        g2d.setColor( Color.BLACK );
        g2d.drawRect( 0, 0, getWidth() - 1, getHeight() - 1 );
        
    }

    public void setTartaruga( Tartaruga tartaruga ) {
        this.tartaruga = tartaruga;
    }
    
}
