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
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * Painel com a imagem de fundo do "Sobre".
 * 
 * @author Prof. Dr. David Buzatto
 */
public class PainelSobre extends JPanel {

    private BufferedImage imgFundo;
    
    public PainelSobre() {
        try {
            imgFundo = ImageIO.read( getClass().getResourceAsStream( "/br/com/davidbuzatto/auroralogo/gui/imagens/splash2.png" ) );
        } catch ( IOException exc ) {
        }
        setBackground( new Color( 0, 0, 0, 0 ) );
    }
    
    @Override
    protected void paintComponent( Graphics g ) {
        
        super.paintComponent( g );
        
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint( 
                RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON );
        g2d.setColor( new Color( 0, 102, 143 ) );
        
        g2d.drawImage( imgFundo, 0, 0, null );
        
        Font f = new Font( "Century Gothic", Font.BOLD, 30 ) ;
        if ( f.getFamily().equals( Font.DIALOG ) ) {
            f = new Font( Font.MONOSPACED, Font.BOLD, 30 ) ;
        }
        g2d.setFont( f );

        FontMetrics fm = g2d.getFontMetrics();
        String v = JanelaPrincipal.VERSAO;
        int vWidth = fm.stringWidth( v );

        g2d.drawString( v, 346 - vWidth, 290 );
        
        
        RoundRectangle2D.Double rect = new RoundRectangle2D.Double( 140, 300, 400, 250, 20, 20 );
        
        g2d.setColor( new Color( 255, 255, 255, 200 ) );
        g2d.fill( rect );
        g2d.setColor( new Color( 0, 0, 0, 200 )  );
        g2d.draw( rect );
        
        g2d.dispose();
        
    }
    
    
    
}
