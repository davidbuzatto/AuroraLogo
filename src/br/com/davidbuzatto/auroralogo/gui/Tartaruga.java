/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.davidbuzatto.auroralogo.gui;

import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.imageio.ImageIO;

/**
 *
 * @author David
 */
public class Tartaruga {
    
    private class Estado implements Cloneable {

        int x;
        int y;
        int angulo;
        BasicStroke contorno;
        String texto;
        Color corPincel;
        Color corFundo;
        boolean desenhando;
        Map<String, Integer> memoria;
        
        public Estado( int x, int y, int angulo, int grossura, Color corPincel, Color corFundo, boolean desenhando ) {
            this.x = x;
            this.y = y;
            this.angulo = angulo;
            this.contorno = new BasicStroke( grossura, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL );
            this.corPincel = corPincel;
            this.corFundo = corFundo;
            this.desenhando = desenhando;
            this.memoria = new LinkedHashMap<>();
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            
            Estado e = (Estado) super.clone();
            e.x = x;
            e.y = y;
            e.angulo = angulo;
            e.contorno = new BasicStroke( e.contorno.getLineWidth(), e.contorno.getEndCap(), e.contorno.getLineJoin() );
            e.texto = null;
            e.corPincel = corPincel;
            e.corFundo = corFundo;
            e.desenhando = desenhando;
            e.memoria = new LinkedHashMap<>();
            
            for ( Entry<String, Integer> en : memoria.entrySet() ) {
                e.memoria.put( en.getKey(), en.getValue() );
            }
            
            return e;
            
        }
        
    }
    
    private static final Color COR_GRADE = new Color( 230, 230, 230 );
    private static final Color COR_FUNDO_DEPURADOR = new Color( 255, 255, 255, 200 );
    private static final Color COR_TEXTO_DEPURADOR = Color.BLACK;
    private static final String[] PROPRIEDADES_DEPURADOR = {
        " estado atual: ",
        "            x: ",
        "            y: ",
        "       ângulo: ",
        "     grossura: ",
        "cor do pincel: ",
        " cor do fundo: ",
        "   desenhando: ",
        "               ",
        "variáveis:"
    };
    
    private List<Estado> estados;
    private BufferedImage imgTartaruga;
    private PainelDesenho painelDesenho;
    private Font fonteDepurador;
    
    private boolean passoAPasso;
    private int estadoAtual;
    
    private boolean depuradorAtivo;
    private boolean gradeAtiva;
    
    public Tartaruga( int x, int y, int angulo, int grossura, Color corPincel, Color corFundo, boolean desenhando, PainelDesenho painelDesenho, Font fonteDepurador ) {
        
        estados = new ArrayList<>();
        
        Estado e = new Estado( x, y, angulo, grossura, corPincel, corFundo, desenhando );
        estados.add( e );
        
        this.painelDesenho = painelDesenho;
        this.fonteDepurador = fonteDepurador;
        
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
    
    public void trocarCorPincel( Color corPincel ) {
        Estado e = clonarUltimoEstado();
        e.corPincel = corPincel;
        estados.add( e );
    }
    
    public void trocarCorFundo( Color corFundo ) {
        Estado e = clonarUltimoEstado();
        e.corFundo = corFundo;
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
        e.memoria.clear();
        estados.clear();
        estados.add( e );
        estadoAtual = 0;
    }
    
    public void inserirOuAtualizarMemoria( String id, Integer valor ) {
        Estado e = clonarUltimoEstado();
        e.memoria.put( id, valor );
        estados.add( e );
    }
    
    public Integer lerMemoria( String id ) {
        Estado eAtual = estados.get( estados.size() - 1 );
        return eAtual.memoria.getOrDefault( id, 0 );
    }
    
    public void desenhar( Graphics2D g2d ) {
        
        g2d = (Graphics2D) g2d.create();
        
        Estado estadoFinal = estados.get( estados.size() - 1 );
        g2d.setColor( estadoFinal.corFundo );
        g2d.fillRect( 0, 0, painelDesenho.getWidth(), painelDesenho.getHeight() );
        
        if ( gradeAtiva ) {
            desenharGrade( g2d, 20 );
        }
            
        if ( estados.size() == 1 || estadoAtual == 0 ) {
            
            Estado atu = estados.get( 0 );
            
            g2d.setColor( atu.corPincel );
            desenharTartaruga( g2d, atu );
            
        } else {
            
            int ate = passoAPasso ? estadoAtual : estados.size() - 1;
            
            for ( int i = 1; i <= ate; i++ ) {
                
                Estado ant = estados.get( i-1 );
                Estado atu = estados.get( i );

                g2d.setColor( atu.corPincel );
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
                
                if ( i == ate ) {
                    desenharTartaruga( g2d, atu );
                }

            }
            
        }
        
        if ( depuradorAtivo ) {
            desenharDepurador( g2d );
        }
        
        g2d.dispose();
        
    }
    
    private void desenharGrade( Graphics2D g2d, int espacamento ) {
        
        g2d = (Graphics2D) g2d.create();
        
        g2d.setColor( COR_GRADE );
        int c = 1;
        
        int iniX = painelDesenho.getWidth() / 2;
        int iniY = painelDesenho.getHeight()/ 2;
        
        for ( int i = iniX; i < painelDesenho.getWidth(); i += espacamento ) {
            g2d.drawLine( i, 0, i, painelDesenho.getHeight() );
            g2d.drawLine( ( iniX - ( espacamento * c ) ), 0, ( iniX - ( espacamento * c ) ), painelDesenho.getHeight() );
            c++;
        }
        
        c = 1;
        for ( int i = painelDesenho.getHeight() / 2; i < painelDesenho.getHeight(); i += espacamento ) {
            g2d.drawLine( 0, i, painelDesenho.getWidth(), i );
            g2d.drawLine( 0, ( iniY - ( espacamento * c ) ), painelDesenho.getWidth(), ( iniY - ( espacamento * c ) ) );
            c++;
        }
        
        g2d.dispose();
        
    }
    
    private void desenharDepurador( Graphics2D g2d ) {
        
        g2d = (Graphics2D) g2d.create();
        
        Color corFundo = COR_FUNDO_DEPURADOR;
        Color corTexto = COR_TEXTO_DEPURADOR;
        
        Estado atu = estados.get( this.estadoAtual );
        
        int xIni = 0;
        int yIni = 0;
        int larg = 210;
        int alt = painelDesenho.getHeight();
        
        g2d.setStroke( new BasicStroke( 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL ) );
        g2d.setFont( fonteDepurador );
        
        g2d.setColor( corFundo );
        g2d.fillRect( xIni, yIni, larg, alt );
        
        g2d.setColor( corTexto );
        g2d.drawRect( xIni, yIni, larg, alt );
        
        Object[] valores = {
            estadoAtual + 1,
            atu.x,
            atu.y,
            atu.angulo + "º",
            String.format( "%.2f", atu.contorno.getLineWidth() ),
            atu.corPincel,
            atu.corFundo,
            atu.desenhando ? "sim" : "não",
            "",
            "",
        };
        
        
        int xIniStrings = 10;
        int yIniStrings = 20;
        int passoY = 15;
        
        int yAtual;
        int i;
        
        for ( i = 0; i < PROPRIEDADES_DEPURADOR.length; i++ ) {
            
            yAtual = yIniStrings + passoY * i;
            g2d.setColor( corTexto );
            
            if ( valores[i] instanceof Color ) {
                
                g2d.drawString( PROPRIEDADES_DEPURADOR[i], xIniStrings, yAtual );
                
                g2d.setColor( (Color) valores[i] );
                g2d.fillRect( 115, yAtual - 10, 10, 10 );

                g2d.setColor( corTexto );
                g2d.drawRect( 115, yAtual - 10, 10, 10 );
                
                g2d.drawString( "(" + Utils.colorParaHexa( (Color) valores[i] )+ ")", 130, yAtual );
        
            } else {
                
                if ( PROPRIEDADES_DEPURADOR[i].contains( "variáveis" ) ) {
                    g2d.drawString( PROPRIEDADES_DEPURADOR[i] + ( atu.memoria.isEmpty() ? " não há" : "\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" ), xIniStrings, yAtual );
                } else {
                    g2d.drawString( PROPRIEDADES_DEPURADOR[i] + valores[i], xIniStrings, yAtual );
                }
                
            }
            
        }
        
        int c = 0;
        for ( Entry<String, Integer> e : atu.memoria.entrySet() ) {
            
            String nome = e.getKey();
            if ( nome.length() > 10 ) {
                nome = nome.substring( 0, 6 ) + "..." + nome.charAt( nome.length() - 1 );
            }
            
            String completo = nome + ": " + e.getValue();
            if ( completo.length() > 22 ) {
                completo = completo.substring( 0, 19 ) + "...";
            }
            //System.out.println( completo.length() );
            
            yAtual = yIniStrings + passoY * i++;
            
            if ( c == atu.memoria.size() - 1 ) {
                completo = "\u2502 \u2514\u2500 " + completo;
            } else {
                completo = "\u2502 \u251e\u2500 " + completo;
            }
            
            String complemento = "";
            for ( int j = 0; j < 27 - completo.length(); j++ ) {
                complemento += " ";
            }
            complemento += "\u2502";
            
            g2d.drawString( completo + complemento, xIniStrings, yAtual );
            
            c++;
        }
        
        if ( c > 0 ) {
            yAtual = yIniStrings + passoY * i++;
            g2d.drawString( "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518", xIniStrings, yAtual );
        }
        
        g2d.dispose();
        
    }
    
    private void desenharTartaruga( Graphics2D g2d, Estado e ) {
        
        g2d = (Graphics2D) g2d.create();
        
        g2d.rotate( Math.toRadians( e.angulo ), e.x, e.y );
        
        g2d.drawImage( 
                imgTartaruga, 
                e.x - imgTartaruga.getWidth() / 2, 
                e.y - imgTartaruga.getHeight() + 2, 
                null );
        
        g2d.dispose();
        
    }
    
    public boolean isEstadoInicial() {
        return estados.size() == 1 || estadoAtual == 0;
    }
    
    public boolean isEstadoFinal() {
        return estadoAtual == estados.size() - 1;
    }
    
    public int getUltimoEstado() {
        return estados.size() - 1;
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
    
    public int getEstadoAtual() {
        return estadoAtual;
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

    public boolean isGradeAtiva() {
        return gradeAtiva;
    }

    public void setGradeAtiva( boolean gradeAtiva ) {
        this.gradeAtiva = gradeAtiva;
    }
    
}
