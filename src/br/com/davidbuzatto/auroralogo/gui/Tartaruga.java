/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.davidbuzatto.auroralogo.gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

/**
 *
 * @author David
 */
public class Tartaruga {
    
    private class Estado implements Cloneable {

        private int x;
        private int y;
        private int angulo;
        private BasicStroke contorno;
        private String texto;
        private Color cor;
        private boolean desenhando;
        
        public Estado( int x, int y, int angulo, int grossura, Color cor, boolean desenhando ) {
            this.x = x;
            this.y = y;
            this.angulo = angulo;
            this.contorno = new BasicStroke( grossura, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL );
            this.cor = cor;
            this.desenhando = desenhando;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            
            Estado e = (Estado) super.clone();
            e.x = x;
            e.y = y;
            e.angulo = angulo;
            e.contorno = new BasicStroke( e.contorno.getLineWidth(), e.contorno.getEndCap(), e.contorno.getLineJoin() );
            e.texto = null;
            e.cor = cor;
            e.desenhando = desenhando;
            
            return e;
            
        }
        
    }
    
    private List<Estado> estados;
    private BufferedImage imgTartaruga;
    private PainelDesenho painelDesenho;
    
    private boolean passoAPasso;
    private int estadoAtual;
    
    private boolean depuradorAtivo;
    
    public Tartaruga( int x, int y, int angulo, int grossura, Color cor, boolean desenhando, PainelDesenho painelDesenho ) {
        
        estados = new ArrayList<>();
        
        Estado e = new Estado( x, y, angulo, grossura, cor, desenhando );
        estados.add( e );
        
        this.painelDesenho = painelDesenho;
        
        try {
            
            imgTartaruga = ImageIO.read( getClass().getResourceAsStream( "/br/com/davidbuzatto/auroralogo/gui/icones/tartaruga.png" ) );
            
        } catch ( IOException exc )  {
        }
        
    }
    
    public void moverParaDireita( int quantidade ) {
        
        if ( quantidade < 0 ) {
            quantidade = 0;
        }
        
        Estado e = clonarUltimoEstado();
        e.x += Math.cos( Math.toRadians( e.angulo ) ) * quantidade;
        e.y += Math.sin( Math.toRadians( e.angulo ) ) * quantidade;
        estados.add( e );
        
    }
    
    public void moverParaEsquerda( int quantidade ) {
        
        if ( quantidade < 0 ) {
            quantidade = 0;
        }
        
        Estado e = clonarUltimoEstado();
        e.x -= Math.cos( Math.toRadians( e.angulo ) ) * quantidade;
        e.y -= Math.sin( Math.toRadians( e.angulo ) ) * quantidade;
        estados.add( e );
        
    }
    
    public void moverParaCima( int quantidade ) {
        
        if ( quantidade < 0 ) {
            quantidade = 0;
        }
        
        Estado e = clonarUltimoEstado();
        e.x -= Math.cos( Math.toRadians( e.angulo + 90 ) ) * quantidade;
        e.y -= Math.sin( Math.toRadians( e.angulo + 90 ) ) * quantidade;
        estados.add( e );
        
    }
    
    public void moverParaBaixo( int quantidade ) {
        
        if ( quantidade < 0 ) {
            quantidade = 0;
        }
        
        Estado e = clonarUltimoEstado();
        e.x += Math.cos( Math.toRadians( e.angulo + 90 ) ) * quantidade;
        e.y += Math.sin( Math.toRadians( e.angulo + 90 ) ) * quantidade;
        estados.add( e );
        
    }
    
    public void moverPara( int x, int y ) {
        
        Estado e = clonarUltimoEstado();
        e.x = x;
        e.y = y;
        estados.add( e );
        
    }
    
    public void trocarCor( Color cor ) {
        Estado e = clonarUltimoEstado();
        e.cor = cor;
        estados.add( e );
    }
    
    public void girar( int quantidade ) {
        
        Estado e = clonarUltimoEstado();
        
        int novaQuantidade = e.angulo + quantidade;
        novaQuantidade %= 360;
        
        if ( novaQuantidade < 0 ) {
            novaQuantidade = 360 + novaQuantidade;
        }
        
        e.angulo = novaQuantidade;
        estados.add( e );
        
    }
    
    public void engrossar( int quantidade ) {
        
        if ( quantidade <= 0 ) {
            quantidade = 1;
        }
        
        Estado e = clonarUltimoEstado();
        e.contorno = new BasicStroke( e.contorno.getLineWidth() + quantidade,
                e.contorno.getEndCap(), e.contorno.getLineJoin() );
        estados.add( e );
        
    }
    
    public void desengrossar( int quantidade ) {
        
        if ( quantidade <= 0 ) {
            quantidade = 1;
        }
        
        Estado e = clonarUltimoEstado();
        
        int novaQuantidade = (int) e.contorno.getLineWidth() - quantidade;
        if ( novaQuantidade <= 0 ) {
            novaQuantidade = 1;
        }
        
        e.contorno = new BasicStroke( novaQuantidade,
                e.contorno.getEndCap(), e.contorno.getLineJoin() );
        estados.add( e );
        
    }
    
    public void setGrossura( int quantidade ) {
        
        if ( quantidade <= 0 ) {
            quantidade = 1;
        }
        
        Estado e = clonarUltimoEstado();
        e.contorno = new BasicStroke( quantidade,
                e.contorno.getEndCap(), e.contorno.getLineJoin() );
        estados.add( e );
        
    }
    
    public void setTexto( String texto ) {
        Estado e = clonarUltimoEstado();
        e.texto = texto;
        estados.add( e );
    }
    
    public void abaixar() {
        Estado e = clonarUltimoEstado();
        e.desenhando = true;
        estados.add( e );
    }
    
    public void levantar() {
        Estado e = clonarUltimoEstado();
        e.desenhando = false;
        estados.add( e );
    }
    
    public void limpar() {
        Estado e = estados.get( 0 );
        e.x = painelDesenho.getWidth() / 2;
        e.y = painelDesenho.getHeight() / 2;
        estados.clear();
        estados.add( e );
        estadoAtual = 0;
    }
    
    public void desenhar( Graphics2D g2d ) {
        
        g2d = (Graphics2D) g2d.create();
        
        if ( estados.size() == 1 || estadoAtual == 0 ) {
            
            Estado atu = estados.get( 0 );
            g2d.setColor( atu.cor );
            
            desenharTartaruga( g2d, atu );
            
        } else {
            
            int ate = passoAPasso ? estadoAtual : estados.size() - 1;
            
            for ( int i = 1; i <= ate; i++ ) {
                
                Estado ant = estados.get( i-1 );
                Estado atu = estados.get( i );

                g2d.setColor( atu.cor );
                g2d.setStroke( atu.contorno );

                if ( ant.desenhando ) {
                    if ( atu.texto != null ) {
                        Graphics2D g2ds = (Graphics2D) g2d.create();
                        g2ds.rotate( Math.toRadians( atu.angulo ), atu.x, atu.y );
                        g2ds.drawString( atu.texto, atu.x, atu.y );
                        g2ds.dispose();
                    } else {
                        g2d.drawLine( ant.x, ant.y, atu.x, atu.y );
                    }
                }

                /*if ( passoAPasso ) {
                    desenharTartaruga( g2d, atu );
                } else if ( i == estados.size() - 1 ) {
                    desenharTartaruga( g2d, atu );
                }*/
                
                if ( i == ate ) {
                    desenharTartaruga( g2d, atu );
                }

            }
            
        }
        
        if ( depuradorAtivo ) {
            g2d.drawRect( 0, 0, 100, 100 );
            g2d.drawString( "Estado Atual: " + estadoAtual, 10, 10 );
        }
        
        g2d.dispose();
        
    }
    
    private void desenharTartaruga( Graphics2D g2d, Estado e ) {
        
        g2d = (Graphics2D) g2d.create();
        
        g2d.rotate( Math.toRadians( e.angulo ), e.x, e.y );
        
        g2d.drawImage( 
                imgTartaruga, 
                e.x - imgTartaruga.getWidth() / 2, 
                e.y - imgTartaruga.getHeight() + 4, 
                null );
        
        g2d.dispose();
        
    }
    
    public boolean isEstadoInicial() {
        return estados.size() == 1 || estadoAtual == 0;
    }
    
    public boolean isEstadoFinal() {
        return estadoAtual == estados.size() - 1;
    }
    
    public void atualizarPosicaoEstadoInicial( int x, int y ) {
        Estado e = estados.get( 0 );
        e.x = x;
        e.y = y;
    }
    
    private Estado clonarUltimoEstado() {
        
        try {
            return (Estado) estados.get( estados.size() - 1 ).clone();
        } catch ( CloneNotSupportedException exc ) {
        }
        
        return null;
        
    }

    public void setPassoAPasso( boolean passoAPasso ) {
        this.passoAPasso = passoAPasso;
    }

    public void setEstadoAtual( int estadoAtual ) {
        this.estadoAtual = estadoAtual;
    }
    
    public void irParaEstadoInicial() {
        estadoAtual = 0;
    }
    
    public void irParaEstadoAnterior() {
        if ( estadoAtual > 0 ) {
            estadoAtual--;
        }
    }
    
    public void irParaProximoEstado() {
        if ( estadoAtual < estados.size() - 1 ) {
            estadoAtual++;
        }
    }
    
    public void irParaEstadoFinal() {
        estadoAtual = estados.size() - 1;
    }
    
    public void setDepuradorAtivo( boolean depuradorAtivo ) {
        this.depuradorAtivo = depuradorAtivo;
    }

    public boolean isDepuradorAtivo() {
        return depuradorAtivo;
    }
    
}
