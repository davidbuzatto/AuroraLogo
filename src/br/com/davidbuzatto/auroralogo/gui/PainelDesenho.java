/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.davidbuzatto.auroralogo.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author David
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
            
            if ( tartaruga.isEstadoInicial() ) {
                tartaruga.atualizarPosicaoEstadoInicial( getWidth() / 2, getHeight() / 2 );
            }
            
            tartaruga.desenhar( g2d );
            
        }
        
        g2d.setColor( Color.BLACK );
        g2d.drawRect( 0, 0, getWidth() - 1, getHeight() - 1 );
        
    }

    public void setTartaruga( Tartaruga tartaruga ) {
        this.tartaruga = tartaruga;
    }
    
}
