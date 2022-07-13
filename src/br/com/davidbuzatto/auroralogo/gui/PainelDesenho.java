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
import static br.com.davidbuzatto.auroralogo.utils.Utils.PREF_CAMINHO_ABRIR_SALVAR;
import static br.com.davidbuzatto.auroralogo.utils.Utils.getPref;
import static br.com.davidbuzatto.auroralogo.utils.Utils.setPref;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Painel responsável em desenhar a tartaruga do ambiente de desenvolvimento da
 * linguagem de programação AuroraLogo.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class PainelDesenho extends JPanel {

    private Tartaruga tartaruga;
    
    public PainelDesenho() {
        
        addMouseListener( new MouseAdapter() {
            @Override
            public void mouseClicked( MouseEvent e ) {
                
                if ( e.getButton() == MouseEvent.BUTTON3 ) {
                    
                    File diretorioAtual = new File( getPref( PREF_CAMINHO_ABRIR_SALVAR ) );
                    JFileChooser jfc = new JFileChooser( diretorioAtual );
                    jfc.setDialogTitle( "Salvar Imagem..." );
                    jfc.setMultiSelectionEnabled( false );
                    jfc.removeChoosableFileFilter( jfc.getFileFilter() );
                    jfc.setFileFilter( new FileNameExtensionFilter( "Arquivo de Imagem", "png" ) );

                    if ( jfc.showSaveDialog( e.getComponent().getParent().getParent() ) == JFileChooser.APPROVE_OPTION ) {

                        File arquivo = jfc.getSelectedFile();
                        boolean salvar = true;

                        if ( arquivo.exists() ) {
                            if ( JOptionPane.showConfirmDialog( null,
                                    "O arquivo já existe, deseja sobrescrevê-lo?",
                                    "Confirmação",
                                    JOptionPane.YES_NO_OPTION ) == JOptionPane.NO_OPTION ) {
                                salvar = false;
                            }
                        } else {
                            if ( !arquivo.getName().endsWith( ".png" ) ) {
                                arquivo = new File( arquivo.getAbsolutePath() + ".png" );
                            }
                        }

                        if ( salvar ) {
                            
                            setPref( PREF_CAMINHO_ABRIR_SALVAR, arquivo.getParentFile().getAbsolutePath() );
                            
                            BufferedImage img = new BufferedImage( getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB );
                            desenhar( (Graphics2D) img.createGraphics() );
                            
                            try {
                                ImageIO.write( img, "png", arquivo );
                            } catch ( IOException exc ) {
                                exc.printStackTrace();
                            }
                            
                        }

                    }
                    
                }
                
            }
        });
        
        addMouseMotionListener( new MouseAdapter() {
            @Override
            public void mouseMoved( MouseEvent e ) {
                tartaruga.setXYMouse( e.getX(), e.getY( ) );
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

    private void desenhar( Graphics2D g2d ) {
        
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
    
}
