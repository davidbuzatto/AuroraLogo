/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.davidbuzatto.auroralogo.gui;

import br.com.davidbuzatto.auroralogo.parser.impl.ValorVariavel;
import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import javax.imageio.ImageIO;

/**
 *
 * @author David
 */
public class Tartaruga {
    
    private class Forma implements Cloneable {
        
        Shape forma;
        boolean preenchida;
        String nome;

        public Forma( Shape forma, boolean preenchida, String nome ) {
            this.forma = forma;
            this.preenchida = preenchida;
            this.nome = nome;
        }
        
        @Override
        public Object clone() throws CloneNotSupportedException {
            
            if ( forma instanceof Path2D.Double ) {
                
                Forma f = (Forma) super.clone();
                f.forma = (Path2D.Double) ( (Path2D.Double) forma ).clone();
                f.preenchida = preenchida;
                f.nome = nome;

                return f;
                
            }
            
            return null;
            
        }

        @Override
        public String toString() {
            return nome;
        }
        
    }
    
    private class Estado implements Cloneable {

        double x;
        double y;
        double angulo;
        BasicStroke contorno;
        String texto;
        Color corPincel;
        Color corPreenchimento;
        Color corFundo;
        boolean desenhando;
        Forma forma;
        Map<String, ValorVariavel> memoria;
        
        public Estado( double x, double y, double angulo, double grossura, Color corPincel, Color corPreenchimento, Color corFundo, boolean desenhando ) {
            this.x = x;
            this.y = y;
            this.angulo = angulo;
            this.contorno = new BasicStroke( (float) grossura, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL );
            this.corPincel = corPincel;
            this.corPreenchimento = corPreenchimento;
            this.corFundo = corFundo;
            this.desenhando = desenhando;
            this.forma = null;
            this.memoria = new LinkedHashMap<>();
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getAngulo() {
            return angulo;
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
            e.corPreenchimento = corPreenchimento;
            e.corFundo = corFundo;
            e.desenhando = desenhando;
            e.forma = null;
            e.memoria = new LinkedHashMap<>();
            
            for ( Entry<String, ValorVariavel> en : memoria.entrySet() ) {
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
        "  forma atual: ",
        "       pincel: ",
        "preenchimento: ",
        "        fundo: ",
        "   desenhando: ",
        "               ",
        "variáveis:"
    };
    
    private List<Estado> estados;
    private BufferedImage imgTartarugaBase;
    private BufferedImage imgTartaruga;
    private PainelDesenho painelDesenho;
    private Font fonteDepurador;
    private Color cor;
    private Forma caminho;
    
    private boolean passoAPasso;
    private int estadoAtual;
    
    private boolean depuradorAtivo;
    private boolean gradeAtiva;
    
    public Tartaruga( 
            double x, double y, double angulo, 
            double grossura, Color corPincel, Color corPreenchimento, 
            Color corFundo, boolean desenhando, 
            PainelDesenho painelDesenho, Font fonteDepurador ) {
        
        estados = new ArrayList<>();
        
        Estado e = new Estado( x, y, angulo, grossura, corPincel, corPreenchimento, corFundo, desenhando );
        estados.add( e );
        
        this.painelDesenho = painelDesenho;
        this.fonteDepurador = fonteDepurador;
        
        try {
            imgTartarugaBase = ImageIO.read( getClass().getResourceAsStream( "/br/com/davidbuzatto/auroralogo/gui/icones/tartaruga.png" ) );
            imgTartaruga = ImageIO.read( getClass().getResourceAsStream( "/br/com/davidbuzatto/auroralogo/gui/icones/tartaruga.png" ) );
        } catch ( IOException exc )  {
        }
        
    }
    
    public void setCor( Color cor ) {
        
        this.cor = cor;
        
        if ( this.cor == null ) {
            imgTartaruga = imgTartarugaBase;
        } else {
            imgTartaruga = Utils.processarImagemTartaruga( imgTartarugaBase, this.cor, .45 );
        }
        
    }

    public Color getCor() {
        return cor;
    }

    public void setFonteDepurador( Font fonteDepurador ) {
        this.fonteDepurador = fonteDepurador;
    }
    
    public void moverParaDireita( double quantidade ) {
        
        if ( quantidade < 0 ) {
            quantidade = 0;
        }
        
        Estado e = clonarUltimoEstado();
        e.x += Math.cos( Math.toRadians( e.angulo ) ) * quantidade;
        e.y += Math.sin( Math.toRadians( e.angulo ) ) * quantidade;
        estados.add( e );
        
    }
    
    public void moverParaEsquerda( double quantidade ) {
        
        if ( quantidade < 0 ) {
            quantidade = 0;
        }
        
        Estado e = clonarUltimoEstado();
        e.x -= Math.cos( Math.toRadians( e.angulo ) ) * quantidade;
        e.y -= Math.sin( Math.toRadians( e.angulo ) ) * quantidade;
        estados.add( e );
        
    }
    
    public void moverParaCima( double quantidade ) {
        
        if ( quantidade < 0 ) {
            quantidade = 0;
        }
        
        Estado e = clonarUltimoEstado();
        e.x -= Math.cos( Math.toRadians( e.angulo + 90 ) ) * quantidade;
        e.y -= Math.sin( Math.toRadians( e.angulo + 90 ) ) * quantidade;
        estados.add( e );
        
    }
    
    public void moverParaBaixo( double quantidade ) {
        
        if ( quantidade < 0 ) {
            quantidade = 0;
        }
        
        Estado e = clonarUltimoEstado();
        e.x += Math.cos( Math.toRadians( e.angulo + 90 ) ) * quantidade;
        e.y += Math.sin( Math.toRadians( e.angulo + 90 ) ) * quantidade;
        estados.add( e );
        
    }
    
    public void moverPara( double x, double y ) {
        moverPara( x, y, true );
    }
    
    public void moverPara( double x, double y, boolean gerarEstado ) {
        
        if ( gerarEstado ) {
            Estado e = clonarUltimoEstado();
            e.x = x;
            e.y = y;
            estados.add( e );
        } else {
            Estado e = getEstadoFinal();
            e.x = x;
            e.y = y;
        }
        
    }
    
    public void trocarCorPincel( Color corPincel ) {
        Estado e = clonarUltimoEstado();
        e.corPincel = corPincel;
        estados.add( e );
    }
    
    public void trocarCorPreenchimento( Color corPreenchimento ) {
        Estado e = clonarUltimoEstado();
        e.corPreenchimento = corPreenchimento;
        estados.add( e );
    }
    
    public void trocarCorFundo( Color corFundo ) {
        Estado e = clonarUltimoEstado();
        e.corFundo = corFundo;
        estados.add( e );
    }
    
    public void girar( double quantidade ) {
        
        Estado e = clonarUltimoEstado();
        
        double novaQuantidade = e.angulo + quantidade;
        novaQuantidade %= 360;
        
        if ( novaQuantidade < 0 ) {
            novaQuantidade = 360 + novaQuantidade;
        }
        
        e.angulo = novaQuantidade;
        estados.add( e );
        
    }
    
    public void engrossar( double quantidade ) {
        
        if ( quantidade <= 0 ) {
            quantidade = 1;
        }
        
        Estado e = clonarUltimoEstado();
        e.contorno = new BasicStroke( (float) (e.contorno.getLineWidth() + quantidade),
                e.contorno.getEndCap(), e.contorno.getLineJoin() );
        estados.add( e );
        
    }
    
    public void desengrossar( double quantidade ) {
        
        if ( quantidade <= 0 ) {
            quantidade = 1;
        }
        
        Estado e = clonarUltimoEstado();
        
        double novaQuantidade = e.contorno.getLineWidth() - quantidade;
        if ( novaQuantidade <= 0 ) {
            novaQuantidade = 1;
        }
        
        e.contorno = new BasicStroke( (float) novaQuantidade,
                e.contorno.getEndCap(), e.contorno.getLineJoin() );
        estados.add( e );
        
    }
    
    public void setGrossura( double quantidade ) {
        
        if ( quantidade <= 0 ) {
            quantidade = 1;
        }
        
        Estado e = clonarUltimoEstado();
        e.contorno = new BasicStroke( (float) quantidade,
                e.contorno.getEndCap(), e.contorno.getLineJoin() );
        estados.add( e );
        
    }
    
    public void setTexto( String texto ) {
        Estado e = clonarUltimoEstado();
        e.texto = texto;
        estados.add( e );
    }
    
    public void abaixarPincel() {
        abaixarPincel( true );
    }
    
    public void abaixarPincel( boolean gerarEstado ) {
        
        if ( gerarEstado ) {
            Estado e = clonarUltimoEstado();
            e.desenhando = true;
            estados.add( e );
        } else {
            getEstadoFinal().desenhando = true;
        }
        
    }
    
    public void levantarPincel() {
        Estado e = clonarUltimoEstado();
        e.desenhando = false;
        estados.add( e );
    }
    
    public void levantarPincel( boolean gerarEstado ) {
        
        if ( gerarEstado ) {
            Estado e = clonarUltimoEstado();
            e.desenhando = false;
            estados.add( e );
        } else {
            getEstadoFinal().desenhando = false;
        }
        
    }
    
    public void limpar() {
        Estado e = estados.get( 0 );
        e.x = painelDesenho.getWidth() / 2;
        e.y = painelDesenho.getHeight() / 2;
        e.memoria.clear();
        e.desenhando = true;
        estados.clear();
        estados.add( e );
        estadoAtual = 0;
    }
    
    public void inserirOuAtualizarMemoria( String id, ValorVariavel valor ) {
        Estado e = clonarUltimoEstado();
        e.memoria.put( id, valor );
        estados.add( e );
    }
    
    public ValorVariavel lerMemoria( String id ) {
        Estado e = getEstadoFinal();
        return e.memoria.getOrDefault( id, ValorVariavel.NULO );
    }
    
    public void desenhar( Graphics2D g2d ) {
        
        g2d = (Graphics2D) g2d.create();
        
        Estado estadoFinal = getEstadoFinal();
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

                if ( atu.forma != null ) {
                    
                    if ( atu.forma.preenchida ) {
                        g2d.setColor( atu.corPreenchimento );
                        g2d.fill( atu.forma.forma );
                    }
                    
                    g2d.setColor( atu.corPincel );
                    g2d.draw( atu.forma.forma );
                    
                } else if ( ant.desenhando ) {
                    if ( atu.texto != null ) {
                        Graphics2D g2ds = (Graphics2D) g2d.create();
                        g2ds.rotate( Math.toRadians( atu.angulo ), atu.x, atu.y );
                        g2ds.drawString( atu.texto, (int) atu.x, (int) atu.y );
                        g2ds.dispose();
                    } else {
                        g2d.draw( new Line2D.Double( ant.x, ant.y, atu.x, atu.y ) );
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
            String.format( Locale.US, "%.4f", atu.x ),
            String.format( Locale.US, "%.4f", atu.y ),
            String.format( Locale.US, "%.4f", atu.angulo ) + "º",
            String.format( Locale.US, "%.4f", atu.contorno.getLineWidth() ),
            atu.forma == null ? "não há" : atu.forma,
            atu.corPincel,
            atu.corPreenchimento,
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
        for ( Entry<String, ValorVariavel> e : atu.memoria.entrySet() ) {
            
            String nome = e.getKey();
            if ( nome.length() > 10 ) {
                nome = nome.substring( 0, 6 ) + "..." + nome.charAt( nome.length() - 1 );
            }
            
            String completo = nome + ": " + e.getValue();
            if ( completo.length() > 22 ) {
                completo = completo.substring( 0, 19 ) + "...";
            }
            
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
                (int) e.x - imgTartaruga.getWidth() / 2, 
                (int) e.y - imgTartaruga.getHeight() + 2, 
                null );
        
        g2d.dispose();
        
    }
    
    public boolean isEstadoInicial() {
        return estados.size() == 1 || estadoAtual == 0;
    }
    
    public boolean isEstadoFinal() {
        return estadoAtual == estados.size() - 1;
    }
    
    public void atualizarPosicaoEstadoInicial( double x, double y ) {
        Estado e = estados.get( 0 );
        e.x = x;
        e.y = y;
    }
    
    private Estado clonarUltimoEstado() {
        
        try {
            return (Estado) getEstadoFinal().clone();
        } catch ( CloneNotSupportedException exc ) {
        }
        
        return null;
        
    }

    public void setPassoAPasso( boolean passoAPasso ) {
        this.passoAPasso = passoAPasso;
    }

    public void setPosicaoEstadoAtual( int estadoAtual ) {
        this.estadoAtual = estadoAtual;
    }
    
    public int getPosicaoEstadoAtual() {
        return estadoAtual;
    }
    
    public int getPosicaoUltimoEstado() {
        return estados.size() - 1;
    }
    
    public Estado getEstadoAtual() {
        return estados.get( estadoAtual );
    }
    
    public Estado getEstadoInicial() {
        return estados.get( 0 );
    }
    
    public Estado getEstadoFinal() {
        return estados.get( estados.size() - 1 );
    }
    
    public Estado getEstado( int posicao ) {
        if ( posicao >= 0 && posicao < estados.size() ) {
            return estados.get( posicao );
        } else {
            return null;
        }
    }
    
    public double getAnguloEstadoFinal() {
        return getEstadoFinal().angulo;
    }
    
    public double getXEstadoFinal() {
        return getEstadoFinal().x;
    }
    
    public double getYEstadoFinal() {
        return getEstadoFinal().y;
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
    
    public boolean isDesenhando() {
        return getEstadoFinal().desenhando;
    }
    
    // funções geométricas

    public void criarSegmento( double x1, double y1, double x2, double y2 ) {
        Estado e = clonarUltimoEstado();
        e.forma = new Forma( 
                new Line2D.Double( x1, y1, x2, y2 ), 
                false, "segmento" );
        estados.add( e );
    }

    public void criarQuadrado( double xCentro, double yCentro, double lado, boolean preenchido ) {
        Estado e = clonarUltimoEstado();
        e.forma = new Forma( 
                new Rectangle2D.Double( 
                        xCentro - lado / 2, yCentro - lado / 2, 
                        lado, lado ), 
                preenchido, "quadrado" );
        estados.add( e );
    }

    public void criarRetangulo( double xCentro, double yCentro, double largura, double altura, boolean preenchido ) {
        Estado e = clonarUltimoEstado();
        e.forma = new Forma( 
                new Rectangle2D.Double( 
                        xCentro - largura / 2, yCentro - altura / 2, 
                        largura, altura ), 
                preenchido, "retângulo" );
        estados.add( e );
    }

    public void criarCirculo( double xCentro, double yCentro, double raio, boolean preenchido ) {
        Estado e = clonarUltimoEstado();
        e.forma = new Forma( 
                new Ellipse2D.Double( 
                        xCentro - raio, yCentro - raio, 
                        raio * 2, raio * 2 ), 
                preenchido, "círculo" );
        estados.add( e );
    }

    public void criarElipse( double xCentro, double yCentro, double eixoHorizontal, double eixoVertical, boolean preenchida ) {
        Estado e = clonarUltimoEstado();
        e.forma = new Forma( 
                new Ellipse2D.Double( xCentro - eixoHorizontal / 2, yCentro - eixoVertical / 2, 
                        eixoHorizontal, eixoVertical ), 
                preenchida, "elipse" );
        estados.add( e );
    }

    public void criarArco( double xCentro, double yCentro, double eixoHorizontal, double eixoVertical, double anguloInicio, double anguloFim, int tipo, boolean preenchido ) {
        Estado e = clonarUltimoEstado();
        e.forma = new Forma( 
                new Arc2D.Double( xCentro - eixoHorizontal / 2, yCentro - eixoVertical / 2, 
                        eixoHorizontal, eixoVertical, 
                        anguloInicio, anguloFim, tipo ), 
                preenchido, "arco" );
        estados.add( e );
    }

    public void criarPoligonoRegular( double xCentro, double yCentro, double raio, double angulo, int quantidadeLados, boolean preenchido ) {
        
        if ( quantidadeLados >= 3 ) {
            
            Estado e = clonarUltimoEstado();
            Path2D.Double poligono = new Path2D.Double();
            
            double[] xs = new double[quantidadeLados];
            double[] ys = new double[quantidadeLados];
            Utils.gerarCoordenadasPoligono( xCentro, yCentro, raio, angulo, xs, ys );
            
            poligono.moveTo( xs[0], ys[0] );
        
            for ( int i = 1; i < quantidadeLados; i++ ) {
                poligono.lineTo( xs[i], ys[i] );
            }

            poligono.closePath();
            
            e.forma = new Forma( poligono, preenchido, "polígono reg." );
            estados.add( e );
            
        }
        
    }

    public void criarEstrela( double xCentro, double yCentro, double raio, double angulo, int quantidadePontas, boolean preenchida ) {
        
        if ( quantidadePontas >= 3 ) {
            
            Estado e = clonarUltimoEstado();
            Path2D.Double estrela = new Path2D.Double();
            
            double[] xs = new double[quantidadePontas];
            double[] ys = new double[quantidadePontas];
            Utils.gerarCoordenadasPoligono( xCentro, yCentro, raio, angulo, xs, ys );
            
            estrela.moveTo( xs[0], ys[0] );
        
            if ( quantidadePontas % 2 == 0 ) {
            
                for ( int i = 2; i < quantidadePontas; i += 2 ) {
                    estrela.lineTo( xs[i], ys[i] );
                }
                estrela.closePath();

                estrela.moveTo( xs[1], ys[1] );
                for ( int i = 3; i < quantidadePontas; i += 2 ) {
                    estrela.lineTo( xs[i], ys[i] );
                }

            } else {

                for ( int i = 2; i < quantidadePontas * 2; i += 2 ) {
                    estrela.lineTo( xs[i%quantidadePontas], ys[i%quantidadePontas] );
                }

            }

            estrela.closePath();
            
            e.forma = new Forma( estrela, preenchida, "estrela" );
            estados.add( e );
            
        }
        
    }

    public void criarPoligono( double x1, double y1, double x2, double y2, double x3, double y3, boolean preenchido, double... xyn ) {
        
        if ( xyn.length % 2 == 0 ) {
            
            Estado e = clonarUltimoEstado();
            
            Path2D.Double poligono = new Path2D.Double();
            poligono.moveTo( x1, y1 );
            poligono.lineTo( x2, y2 );
            poligono.lineTo( x3, y3 );
            
            for ( int i = 0; i < xyn.length; i += 2 ) {
                poligono.lineTo( xyn[i], xyn[i+1] );
            }
            
            poligono.closePath();
            
            e.forma = new Forma( poligono, preenchido, "polígono" );
            estados.add( e );
        
        }
        
    }

    public void criarCurvaQuadratica( double x1, double y1, double xControle, double yControle, double x2, double y2, boolean preenchida ) {
        Estado e = clonarUltimoEstado();
        e.forma = new Forma( 
                new QuadCurve2D.Double( x1, y1, xControle, yControle, x2, y2 ), 
                preenchida, "curva quad." );
        estados.add( e );
    }

    public void criarCurvaCubica( double x1, double y1, double xControle1, double yControle1, double xControle2, double yControle2, double x2, double y2, boolean preenchida ) {
        Estado e = clonarUltimoEstado();
        e.forma = new Forma( 
                new CubicCurve2D.Double( x1, y1, xControle1, yControle1, 
                        xControle2, yControle2, x2, y2 ), 
                preenchida, "curva cúbica" );
        estados.add( e );
    }

    public void iniciarCaminho( boolean preenchido ) {
        Estado e = clonarUltimoEstado();
        caminho = null;
        caminho = new Forma( new Path2D.Double(), preenchido, "caminho" );
        e.forma = caminho;
        estados.add( e );
    }

    public void caminhoMoverAte( double x, double y ) {
        
        if ( caminho != null ) {
            
            try { 
                Estado e = clonarUltimoEstado();
                caminho = (Forma) caminho.clone();
                ( (Path2D.Double) caminho.forma ).moveTo( x, y );
                e.forma = caminho;
                estados.add( e );
            } catch ( CloneNotSupportedException exc ) {
                exc.printStackTrace();
            }
            
        }
        
    }

    public void caminhoLinhaAte( double x, double y ) {
        
        if ( caminho != null ) {
            
            try { 
                Estado e = clonarUltimoEstado();
                caminho = (Forma) caminho.clone();
                ( (Path2D.Double) caminho.forma ).lineTo( x, y );
                e.forma = caminho;
                estados.add( e );
            } catch ( CloneNotSupportedException exc ) {
                exc.printStackTrace();
            }
            
        }
        
    }

    public void caminhoCurvaQuadraticaAte( double xControle, double yControle, double x, double y ) {
        
        if ( caminho != null ) {
            
            try { 
                Estado e = clonarUltimoEstado();
                caminho = (Forma) caminho.clone();
                ( (Path2D.Double) caminho.forma ).quadTo( xControle, yControle, x, y );
                e.forma = caminho;
                estados.add( e );
            } catch ( CloneNotSupportedException exc ) {
                exc.printStackTrace();
            }
            
        }
        
    }

    public void caminhoCurvaCubicaAte( double xControle1, double yControle1, double xControle2, double yControle2, double x, double y ) {
        
        if ( caminho != null ) {
            
            try { 
                Estado e = clonarUltimoEstado();
                caminho = (Forma) caminho.clone();
                ( (Path2D.Double) caminho.forma ).curveTo( xControle1, yControle1, xControle2, yControle2, x, y );
                e.forma = caminho;
                estados.add( e );
            } catch ( CloneNotSupportedException exc ) {
                exc.printStackTrace();
            }
            
        }
        
    }

    public void fecharCaminho() {
        
        if ( caminho != null ) {
            
            try { 
                Estado e = clonarUltimoEstado();
                caminho = (Forma) caminho.clone();
                ( (Path2D.Double) caminho.forma ).closePath();
                e.forma = caminho;
                estados.add( e );
            } catch ( CloneNotSupportedException exc ) {
                exc.printStackTrace();
            }
            
        }
        
    }
    
    public void terminarCaminho() {
        caminho = null;
    }
    
}
