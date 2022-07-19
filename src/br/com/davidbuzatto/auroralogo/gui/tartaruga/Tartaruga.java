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

import br.com.davidbuzatto.auroralogo.gui.PainelDesenho;
import  br.com.davidbuzatto.auroralogo.parser.impl.Valor;
import static br.com.davidbuzatto.auroralogo.parser.impl.ValorUtils.*;
import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import javax.imageio.ImageIO;

/**
 * Representação da Tartaruga do ambiente de desenvolvimento da linguagem de 
 * programação AuroraLogo.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class Tartaruga {
    
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
    private ContainerForma caminho;
    
    private boolean passoAPasso;
    private int estadoAtual;
    
    private int xMouse;
    private int yMouse;
    private boolean dragging;
    
    private boolean depuradorAtivo;
    private boolean gradeAtiva;
    private boolean eixosAtivos;
    private boolean padraoCartesianoAtivo;
            
    private double escala;
    private int deslocamentoX;
    private int deslocamentoY;
    
    private static final int ESPACAMENTO_GRADE = 20;
    public static Cursor cursorMaoAberta = Cursor.getPredefinedCursor( Cursor.MOVE_CURSOR );
    
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
        
        this.xMouse = -1;
        this.yMouse = -1;
        
        this.escala = 1.0;
        
        try {
            
            imgTartarugaBase = ImageIO.read( getClass().getResourceAsStream( "/br/com/davidbuzatto/auroralogo/gui/icones/tartaruga.png" ) );
            imgTartaruga = ImageIO.read( getClass().getResourceAsStream( "/br/com/davidbuzatto/auroralogo/gui/icones/tartaruga.png" ) );
            
            BufferedImage imgMove = new BufferedImage( 32, 32, BufferedImage.TYPE_INT_ARGB );
            imgMove.getGraphics().drawImage( ImageIO.read( 
                        getClass().getResource( "/br/com/davidbuzatto/auroralogo/gui/icones/cursor_openhand.png" ) ), 0, 0, null );
            cursorMaoAberta = Toolkit.getDefaultToolkit().createCustomCursor( imgMove, new Point( 7, 7 ), "move" );

        } catch ( IOException exc )  {
        }
        
    }
    
    private int cx() {
        return painelDesenho.getWidth() / 2;
    }
    
    private int cy() {
        return painelDesenho.getHeight() / 2;
    }
    
    private int sx() {
        return padraoCartesianoAtivo ? cx() + deslocamentoX : 0;
    }
    
    private int sy() {
        return padraoCartesianoAtivo ? cy() + deslocamentoY : 0;
    }
    
    private double tx( double x ) {
        if ( padraoCartesianoAtivo ) {
            return x * escala + sx();
        } else {
            return x * escala + sx() + deslocamentoX;
        }
    }
    
    private double ty( double y ) {
        if ( padraoCartesianoAtivo ) {
            return sy() - y * escala;
        } else {
            return y * escala + sy() + deslocamentoY;
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

    public void setDeslocamento( int deslocamentoX, int deslocamentoY ) {
        
        this.deslocamentoX = deslocamentoX;
        this.deslocamentoY = deslocamentoY;
        
    }

    public int getDeslocamentoX() {
        return deslocamentoX;
    }

    public int getDeslocamentoY() {
        return deslocamentoY;
    }
    
    public double getEscala() {
        return escala;
    }

    public void resetEscala() {
        escala = 1.0;
    }
    
    public void escalonar( double quantidade ) {
        
        if ( quantidade < 0 && escala <= 1 ) {
            escala += quantidade / 5;
        } else if ( quantidade > 0 && escala >= 0.1 && escala < 1.0 ) {
            escala += quantidade / 5;
        } else {
            escala += quantidade;
        }
        
        // quantidade de zeros = quantidade de casas decimais
        escala = (double) Math.round( escala * 10d ) / 10d;
        
        if ( escala > 1.0 && escala < 1.5 ) {
            escala = 1.0;
        }
        
        if ( escala < 0.1 ) {
            escala = 0.1;
        } else if ( escala > 10 ) {
            escala = 10;
        }
        
    }
    
    public void setFonteDepurador( Font fonteDepurador ) {
        this.fonteDepurador = fonteDepurador;
    }
    
    public void moverParaDireita( double quantidade ) {
        
        if ( quantidade < 0 ) {
            quantidade = 0;
        }
        
        Estado e = clonarUltimoEstado();
        
        if ( padraoCartesianoAtivo ) {
            e.x += Math.cos( Math.toRadians( e.angulo ) ) * quantidade;
            e.y += -Math.sin( Math.toRadians( e.angulo ) ) * quantidade;
        } else {
            e.x += Math.cos( Math.toRadians( e.angulo ) ) * quantidade;
            e.y += Math.sin( Math.toRadians( e.angulo ) ) * quantidade;
        }
        
        estados.add( e );
        
    }
    
    public void moverParaEsquerda( double quantidade ) {
        
        if ( quantidade < 0 ) {
            quantidade = 0;
        }
        
        Estado e = clonarUltimoEstado();
        
        if ( padraoCartesianoAtivo ) {
            e.x -= Math.cos( Math.toRadians( e.angulo ) ) * quantidade;
            e.y -= -Math.sin( Math.toRadians( e.angulo ) ) * quantidade;
        } else {
            e.x -= Math.cos( Math.toRadians( e.angulo ) ) * quantidade;
            e.y -= Math.sin( Math.toRadians( e.angulo ) ) * quantidade;
        }
        
        estados.add( e );
        
    }
    
    public void moverParaCima( double quantidade ) {
        
        if ( quantidade < 0 ) {
            quantidade = 0;
        }
        
        Estado e = clonarUltimoEstado();
        
        if ( padraoCartesianoAtivo ) {
            e.x -= Math.cos( Math.toRadians( e.angulo + 90 ) ) * quantidade;
            e.y -= -Math.sin( Math.toRadians( e.angulo + 90 ) ) * quantidade;
        } else {
            e.x -= Math.cos( Math.toRadians( e.angulo + 90 ) ) * quantidade;
            e.y -= Math.sin( Math.toRadians( e.angulo + 90 ) ) * quantidade;
        }
        
        estados.add( e );
        
    }
    
    public void moverParaBaixo( double quantidade ) {
        
        if ( quantidade < 0 ) {
            quantidade = 0;
        }
        
        Estado e = clonarUltimoEstado();
        
        if ( padraoCartesianoAtivo ) {
            e.x += Math.cos( Math.toRadians( e.angulo + 90 ) ) * quantidade;
            e.y += -Math.sin( Math.toRadians( e.angulo + 90 ) ) * quantidade;
        } else {
            e.x += Math.cos( Math.toRadians( e.angulo + 90 ) ) * quantidade;
            e.y += Math.sin( Math.toRadians( e.angulo + 90 ) ) * quantidade;
        }
        
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
        
        if ( padraoCartesianoAtivo ) {
            e.x = 0;
            e.y = 0;
        } else {
            
            int x = cx();
            int y = cy();
            
            int kx = x % ESPACAMENTO_GRADE;
            int ky = y % ESPACAMENTO_GRADE;
            
            x += ESPACAMENTO_GRADE - kx;
            y += ESPACAMENTO_GRADE - ky;
            
            e.x = x;
            e.y = y;
            
        }
        
        e.memoria.clear();
        e.desenhando = true;
        
        estados.clear();
        estados.add( e );
        estadoAtual = 0;
        
    }
    
    public void inserirOuAtualizarMemoria( String id, Valor valor ) {
        Estado e = clonarUltimoEstado();
        e.memoria.put( id, valor );
        estados.add( e );
    }
    
    public Valor lerMemoria( String id ) {
        Estado e = getEstadoFinal();
        return e.memoria.getOrDefault( id, novoNulo() );
    }
    
    public Valor removerDaMemoria( String id ) {
        Estado e = getEstadoFinal();
        return e.memoria.remove( id );
    }
    
    public void desenhar( Graphics2D g2d ) {
        
        g2d = (Graphics2D) g2d.create();
        
        Estado estadoFinal = getEstadoFinal();
        g2d.setColor( estadoFinal.corFundo );
        g2d.fillRect( 0, 0, painelDesenho.getWidth(), painelDesenho.getHeight() );
        
        desenharGradesEEixos( g2d, ESPACAMENTO_GRADE );
            
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
                
                if ( atu.containerForma != null ) {
                    
                    Graphics2D g2dr = (Graphics2D) g2d.create();
                    
                    Shape forma = atu.containerForma.forma;
                            
                    if ( !( 
                            forma instanceof Line2D ||
                            forma instanceof QuadCurve2D ||
                            forma instanceof CubicCurve2D ||
                            atu.containerForma.nome.equals( "polígono" ) ||
                            atu.containerForma.nome.equals( "caminho" ) ) ) {
                        g2dr.rotate( Math.toRadians( atu.angulo ), tx( atu.x ), ty( atu.y ) );
                    }
                        
                    if ( forma instanceof Line2D.Double ) {
                        
                        Line2D.Double f = (Line2D.Double) forma;
                        Line2D.Double nf = new Line2D.Double( 
                                tx( f.x1 ), ty( f.y1 ), tx( f.x2 ), ty( f.y2 ) );
                        
                        forma = nf;
                        
                    } else if ( forma instanceof Rectangle2D.Double ) {
                        
                        Rectangle2D.Double f = (Rectangle2D.Double) forma;
                        Rectangle2D.Double nf = new Rectangle2D.Double( 
                                tx( f.x ) - ( f.width * escala ) / 2, 
                                ty( f.y ) - ( f.height * escala ) / 2, 
                                f.width * escala, 
                                f.height * escala );
                        
                        forma = nf;
                        
                    } else if ( forma instanceof RoundRectangle2D.Double ) {
                        
                        RoundRectangle2D.Double f = (RoundRectangle2D.Double) forma;
                        RoundRectangle2D.Double nf = new RoundRectangle2D.Double( 
                                tx( f.x ) - ( f.width * escala ) / 2, 
                                ty( f.y ) - ( f.height * escala ) / 2, 
                                f.width * escala, 
                                f.height * escala,
                                f.arcwidth * escala,
                                f.archeight * escala);
                        
                        forma = nf;
                        
                    } else if ( forma instanceof Ellipse2D.Double ) {
                        
                        Ellipse2D.Double f = (Ellipse2D.Double) forma;
                        Ellipse2D.Double nf = new Ellipse2D.Double( 
                                tx( f.x ) - ( f.width * escala ) / 2, 
                                ty( f.y ) - ( f.height * escala ) / 2, 
                                f.width * escala,
                                f.height * escala );
                        
                        forma = nf;
                        
                    } else if ( forma instanceof Arc2D.Double ) {
                        
                        Arc2D.Double f = (Arc2D.Double) forma;
                        Arc2D.Double nf = new Arc2D.Double( 
                                tx( f.x ) - ( f.width * escala ) / 2, 
                                ty( f.y ) - ( f.height * escala ) / 2, 
                                f.width * escala,
                                f.height * escala,
                                f.start, f.extent, f.getArcType() );
                        
                        forma = nf;
                        
                    } else if ( forma instanceof QuadCurve2D.Double ) {
                        
                        QuadCurve2D.Double f = (QuadCurve2D.Double) forma;
                        QuadCurve2D.Double nf = new QuadCurve2D.Double( 
                                tx( f.x1 ), ty( f.y1 ),
                                tx( f.ctrlx ), ty( f.ctrly ),
                                tx( f.x2 ), ty( f.y2 ) );
                        
                        if ( atu.containerForma.mostrarControles ) {
                            Graphics2D g2ds = (Graphics2D) g2d.create();
                            if ( escala < 1.0 ) {
                                Font ff = new Font( g2d.getFont().getFontName(), g2d.getFont().getStyle(), 
                                        (int) ( g2d.getFont().getSize() * escala ) );
                                g2ds.setFont( ff );
                            }
                            g2ds.setStroke( new BasicStroke( 3 ) );
                            Line2D.Double p = new Line2D.Double( tx( f.ctrlx ), ty( f.ctrly ), tx( f.ctrlx ), ty( f.ctrly ) );
                            g2ds.draw( p );
                            g2ds.drawString( "c", (int) p.x1 + 3, (int) p.y1 );
                            g2ds.dispose();
                        }
                        
                        forma = nf;
                        
                    } else if ( forma instanceof CubicCurve2D.Double ) {
                        
                        CubicCurve2D.Double f = (CubicCurve2D.Double) forma;
                        CubicCurve2D.Double nf = new CubicCurve2D.Double( 
                                tx( f.x1 ), ty( f.y1 ),
                                tx( f.ctrlx1 ), ty( f.ctrly1 ),
                                tx( f.ctrlx2 ), ty( f.ctrly2 ),
                                tx( f.x2 ), ty( f.y2 ) );
                        
                        if ( atu.containerForma.mostrarControles ) {
                            Graphics2D g2ds = (Graphics2D) g2d.create();
                            if ( escala < 1.0 ) {
                                Font ff = new Font( g2d.getFont().getFontName(), g2d.getFont().getStyle(), 
                                        (int) ( g2d.getFont().getSize() * escala ) );
                                g2ds.setFont( ff );
                            }
                            g2ds.setStroke( new BasicStroke( 3 ) );
                            Line2D.Double p1 = new Line2D.Double( tx( f.ctrlx1 ), ty( f.ctrly1 ), tx( f.ctrlx1 ), ty( f.ctrly1 ) );
                            Line2D.Double p2 = new Line2D.Double( tx( f.ctrlx2 ), ty( f.ctrly2 ), tx( f.ctrlx2 ), ty( f.ctrly2 ) );
                            g2ds.draw( p1 );
                            g2ds.draw( p2 );
                            g2ds.drawString( "c1", (int) p1.x1 + 3, (int) p1.y1 );
                            g2ds.drawString( "c2", (int) p2.x1 + 3, (int) p2.y1 );
                            g2ds.dispose();
                        }
                        
                        forma = nf;
                        
                    } else if ( forma instanceof Path2D.Double ) {

                        Path2D.Double f = (Path2D.Double) forma;
                        Path2D.Double nf = new Path2D.Double();
                        
                        PathIterator pi = f.getPathIterator( null );
                        double[] coords = new double[6];
                        
                        while ( !pi.isDone() ) {
                            
                            int tipo = pi.currentSegment( coords );
                            
                            switch ( tipo ) {
                                
                                case PathIterator.SEG_MOVETO:
                                    nf.moveTo( tx( coords[0] ), ty( coords[1] ) );
                                    break;
                                    
                                case PathIterator.SEG_LINETO:
                                    nf.lineTo( tx( coords[0] ), ty( coords[1] ) );
                                    break;
                                    
                                case PathIterator.SEG_QUADTO:
                                    
                                    nf.quadTo( tx( coords[0] ), ty( coords[1] ),
                                            tx( coords[2] ), ty( coords[3] ) );
                                    
                                    if ( atu.containerForma.mostrarControles ) {
                                        Graphics2D g2ds = (Graphics2D) g2d.create();
                                        if ( escala < 1.0 ) {
                                            Font ff = new Font( g2d.getFont().getFontName(), g2d.getFont().getStyle(), 
                                                    (int) ( g2d.getFont().getSize() * escala ) );
                                            g2ds.setFont( ff );
                                        }
                                        g2ds.setStroke( new BasicStroke( 3 ) );
                                        Line2D.Double p = new Line2D.Double( tx( coords[0] ), ty( coords[1] ), tx( coords[0] ), ty( coords[1] ) );
                                        g2ds.draw( p );
                                        g2ds.drawString( "c", (int) p.x1 + 3, (int) p.y1 );
                                        g2ds.dispose();
                                    }
                                    
                                    break;
                                    
                                case PathIterator.SEG_CUBICTO:
                                    
                                    nf.curveTo( tx( coords[0] ), ty( coords[1] ),
                                            tx( coords[2] ), ty( coords[3] ),
                                            tx( coords[4] ), ty( coords[5] ) );
                                    
                                    if ( atu.containerForma.mostrarControles ) {
                                        Graphics2D g2ds = (Graphics2D) g2d.create();
                                        if ( escala < 1.0 ) {
                                            Font ff = new Font( g2d.getFont().getFontName(), g2d.getFont().getStyle(), 
                                                    (int) ( g2d.getFont().getSize() * escala ) );
                                            g2ds.setFont( ff );
                                        }
                                        g2ds.setStroke( new BasicStroke( 3 ) );
                                        Line2D.Double p1 = new Line2D.Double( tx( coords[0] ), ty( coords[1] ), tx( coords[0] ), ty( coords[1] ) );
                                        Line2D.Double p2 = new Line2D.Double( tx( coords[2] ), ty( coords[3] ), tx( coords[2] ), ty( coords[3] ) );
                                        g2ds.draw( p1 );
                                        g2ds.draw( p2 );
                                        g2ds.drawString( "c1", (int) p1.x1 + 3, (int) p1.y1 );
                                        g2ds.drawString( "c2", (int) p2.x1 + 3, (int) p2.y1 );
                                        g2ds.dispose();
                                    }
                                    
                                    break;
                                    
                                case PathIterator.SEG_CLOSE:
                                    nf.closePath();
                                    break;
                                    
                            }
                            
                            pi.next();
                            
                        }
                        
                        forma = nf;
                        
                    }
                    
                    if ( atu.containerForma.preenchida ) {
                        g2dr.setColor( atu.corPreenchimento );
                        g2dr.fill( forma);
                    }
                    
                    if ( atu.containerForma.contornada ) {
                        g2dr.setColor( atu.corPincel );
                        g2dr.draw( forma );
                    }
                    
                } else if ( ant.desenhando ) {
                    if ( atu.texto != null ) {
                        Graphics2D g2ds = (Graphics2D) g2d.create();
                        g2ds.rotate( Math.toRadians( atu.angulo ), tx( atu.x ), ty( atu.y ) );
                        Font f = new Font( g2d.getFont().getFontName(), g2d.getFont().getStyle(), 
                                (int) ( g2d.getFont().getSize() * escala ) );
                        g2ds.setFont( f );
                        g2ds.drawString( atu.texto, (int) tx( atu.x ), (int) ty( atu.y ) );
                        g2ds.dispose();
                    } else {
                        double xAnt = tx( ant.x );
                        double yAnt = ty( ant.y );
                        double xAtu = tx( atu.x );
                        double yAtu = ty( atu.y );
                        if ( !( xAnt == xAtu && yAnt == yAtu ) ) {  // evita desenhos de pontos
                            g2d.draw( new Line2D.Double( xAnt, yAnt, xAtu, yAtu ) );
                        }
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
    
    private void desenharGradesEEixos( Graphics2D g2d, int espacamento ) {
        
        g2d = (Graphics2D) g2d.create();
        
        g2d.setFont( fonteDepurador.deriveFont( Font.PLAIN, 10 ) );
        
        int iniX = cx();
        int iniY = cy();
        
        double anguloLabels = Math.toRadians( 45 );
        
        if ( escala < 1.0 ) {
            Font f = new Font( g2d.getFont().getFontName(), g2d.getFont().getStyle(), (int) ( g2d.getFont().getSize() * escala ) );
            g2d.setFont( f );
        }
        
        if ( padraoCartesianoAtivo ) {
            desenharGradeEEixosPadraoCartesiano( g2d, (int) ( espacamento * escala ),
                    espacamento, iniX, iniY, COR_GRADE, COR_GRADE.darker() );
        } else {
            desenharGradeEEixosPadraoGrafico( g2d, (int) ( espacamento * escala ),
                    espacamento, anguloLabels, COR_GRADE, COR_GRADE.darker() );
        }
        
        g2d.dispose();
        
    }
    
    private void desenharGradeEEixosPadraoCartesiano( 
            Graphics2D g2d, 
            int espacamentoEscalonado, int espacamentoPadrao,
            int iniX, int iniY, 
            Color corGrade, Color corEixos ) {
        
        g2d = (Graphics2D) g2d.create();
        
        // positivo
        int c = 1;
        for ( int i = iniX + deslocamentoX; i < painelDesenho.getWidth(); i += espacamentoEscalonado ) {

            if ( gradeAtiva ) {
                g2d.setColor( corGrade );
                g2d.drawLine( i, 0, i, painelDesenho.getHeight() );
            }

            if ( eixosAtivos ) {

                g2d.setColor( corEixos );
                g2d.drawString( String.valueOf( espacamentoPadrao * ( c-1 ) ),
                        i+2, iniY - ( c % 2 == 0 ? 3 : -10 ) + deslocamentoY );
                g2d.drawLine( i, iniY + deslocamentoY,
                        i, iniY - ( c % 2 == 0 ? 3 : -3 ) + deslocamentoY  );

            }

            c++;

        }
        
        // negativo
        c = 1;
        for ( int i = iniX + deslocamentoX; i > -painelDesenho.getWidth(); i -= espacamentoEscalonado ) {

            if ( gradeAtiva ) {
                g2d.setColor( corGrade );
                g2d.drawLine( i, 0, i, painelDesenho.getHeight() );
            }

            if ( eixosAtivos ) {

                g2d.setColor( corEixos );
                g2d.drawString( String.valueOf( - espacamentoPadrao * ( c-1 ) ),
                        i+2, iniY - ( c % 2 == 0 ? 3 : -10 ) + deslocamentoY );
                g2d.drawLine( i, iniY + deslocamentoY,
                        i, iniY - ( c % 2 == 0 ? 3 : -3 ) + deslocamentoY  );

            }

            c++;

        }

        // positivo
        c = 1;
        for ( int i = iniY + deslocamentoY + espacamentoEscalonado; i < painelDesenho.getHeight(); i += espacamentoEscalonado ) {

            if ( gradeAtiva ) {
                g2d.setColor( corGrade );
                g2d.drawLine( 0, i, painelDesenho.getWidth(), i );
            }

            if ( eixosAtivos ) {

                g2d.setColor( corEixos );

                g2d.drawLine( iniX + deslocamentoX - 3, i, iniX + deslocamentoX, i );
                g2d.drawString( String.valueOf( - espacamentoPadrao * c ), 
                        iniX + deslocamentoX + 5, i + 3 );

            }

            c++;
            
        }
        
        // negativo
        c = 1;
        for ( int i = iniY + deslocamentoY - espacamentoEscalonado; i > -painelDesenho.getHeight(); i -= espacamentoEscalonado ) {

            if ( gradeAtiva ) {
                g2d.setColor( corGrade );
                g2d.drawLine( 0, i, painelDesenho.getWidth(), i );
            }

            if ( eixosAtivos ) {

                g2d.setColor( corEixos );

                g2d.drawLine( iniX + deslocamentoX - 3, i, iniX + deslocamentoX, i );
                g2d.drawString( String.valueOf( espacamentoPadrao * c ), 
                        iniX + deslocamentoX + 5, i + 3 );

            }

            c++;
            
        }

        if ( eixosAtivos || gradeAtiva ) {

            if ( gradeAtiva ) {
                g2d.setColor( corGrade );
            }
            
            if ( eixosAtivos ) {
                g2d.setColor( corEixos );
            }

            g2d.drawLine( iniX + deslocamentoX, 0, 
                    iniX + deslocamentoX, painelDesenho.getHeight() );
            g2d.drawLine( 0, iniY + deslocamentoY,
                    painelDesenho.getWidth(), iniY + deslocamentoY );

        }
        
        g2d.dispose();
        
    }
    
    private void desenharGradeEEixosPadraoGrafico( 
            Graphics2D g2d, 
            int espacamentoEscalonado, int espacamentoPadrao, 
            double anguloLabels, 
            Color corGrade, Color corEixos ) {
        
        g2d = (Graphics2D) g2d.create();
        
        // positivo
        int c = 1;
        int label = 0;
        for ( int i = deslocamentoX; i < painelDesenho.getWidth(); i += espacamentoEscalonado ) {

            if ( gradeAtiva ) {
                g2d.setColor( corGrade );
                g2d.drawLine( i, 0, i, painelDesenho.getHeight() );
            }
            
            if ( eixosAtivos ) {

                g2d.setColor( corEixos );

                g2d.rotate( anguloLabels, i+2, 10 );
                g2d.drawString( String.valueOf( label ), i+2, 10 );
                g2d.rotate( -anguloLabels, i+2, 10 );
                g2d.drawLine( i, 0, i, 4 );

            }

            c++;
            label += espacamentoPadrao;

        }
        
        // negativo
        c = 1;
        label = 0;
        for ( int i = deslocamentoX; i > -painelDesenho.getWidth(); i -= espacamentoEscalonado ) {

            if ( gradeAtiva ) {
                g2d.setColor( corGrade );
                g2d.drawLine( i, 0, i, painelDesenho.getHeight() );
            }
            
            if ( eixosAtivos ) {

                g2d.setColor( corEixos );

                g2d.rotate( anguloLabels, i+2, 10 );
                g2d.drawString( String.valueOf( label ), i+2, 10 );
                g2d.rotate( -anguloLabels, i+2, 10 );
                g2d.drawLine( i, 0, i, 4 );

            }

            c++;
            label -= espacamentoPadrao;

        }

        // positivo
        c = 1;
        label = espacamentoPadrao;
        for ( int i = espacamentoEscalonado + deslocamentoY; i < painelDesenho.getHeight(); i += espacamentoEscalonado ) {

            if ( gradeAtiva ) {
                g2d.setColor( corGrade );
                g2d.drawLine( 0, i, painelDesenho.getWidth(), i );
            }

            if ( eixosAtivos ) {

                g2d.setColor( corEixos );

                g2d.drawLine( 0, i, 4, i );
                g2d.drawString( String.valueOf( label ), 8, i + 3 );

            }

            c++;
            label += espacamentoPadrao;
            
        }
        
        // negativo
        c = 1;
        label = espacamentoPadrao;
        for ( int i = espacamentoEscalonado + deslocamentoY; i > -painelDesenho.getHeight(); i -= espacamentoEscalonado ) {

            if ( gradeAtiva ) {
                g2d.setColor( corGrade );
                g2d.drawLine( 0, i, painelDesenho.getWidth(), i );
            }

            if ( eixosAtivos ) {

                g2d.setColor( corEixos );

                g2d.drawLine( 0, i, 4, i );
                g2d.drawString( String.valueOf( label ), 8, i + 3 );

            }

            c++;
            label -= espacamentoPadrao;
            
        }
        
        if ( eixosAtivos || gradeAtiva ) {

            if ( gradeAtiva ) {
                g2d.setColor( corGrade );
            }
            
            if ( eixosAtivos ) {
                g2d.setColor( corEixos );
            }

            g2d.drawLine( deslocamentoX, 0,
                    deslocamentoX, painelDesenho.getHeight() );
            g2d.drawLine( 0, deslocamentoY,
                    painelDesenho.getWidth(), deslocamentoY );

        }
        
        g2d.dispose();
        
    }
    
    private void desenharDepurador( Graphics2D g2d ) {
        
        g2d = (Graphics2D) g2d.create();
        
        //Color corFundo = COR_FUNDO_DEPURADOR;
        Color cPD = painelDesenho.getBackground();
        Color corFundo = new Color( cPD.getRed(), cPD.getGreen(), cPD.getBlue(), 200 );
        Color corTexto = COR_TEXTO_DEPURADOR;
        
        Estado atu = estados.get( this.estadoAtual );
        
        int xIni = 0;
        int yIni = 0;
        int larg = 210;
        int alt = painelDesenho.getHeight();
        
        g2d.setStroke( new BasicStroke( 1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL ) );
        g2d.setFont( fonteDepurador );
        FontMetrics fm = g2d.getFontMetrics();
        
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
            atu.containerForma == null ? "não há" : atu.containerForma,
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
                
                g2d.setColor( Color.WHITE );
                g2d.fillRect( 115, yAtual - 9, 10, 10 );
                
                g2d.setColor( (Color) valores[i] );
                g2d.fillRect( 115, yAtual - 9, 10, 10 );

                g2d.setColor( corTexto );
                g2d.drawRect( 115, yAtual - 9, 10, 10 );
                
                g2d.drawString( "(" + Utils.colorParaHexa( (Color) valores[i] ) + ")", 130, yAtual );
        
            } else {
                
                if ( PROPRIEDADES_DEPURADOR[i].contains( "variáveis" ) ) {
                    g2d.drawString( PROPRIEDADES_DEPURADOR[i] + ( atu.memoria.isEmpty() ? " não há" : "\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u256e" ), xIniStrings, yAtual );
                    //g2d.drawString( PROPRIEDADES_DEPURADOR[i] + ( atu.memoria.isEmpty() ? " não há" : "\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" ), xIniStrings, yAtual );
                } else {
                    g2d.drawString( PROPRIEDADES_DEPURADOR[i] + valores[i], xIniStrings, yAtual );
                }
                
            }
            
        }
        
        List<VariavelDepurador> variaveis = new ArrayList<>();
        int c = 0;
        for ( Entry<String, Valor> e : atu.memoria.entrySet() ) {
            
            VariavelDepurador vd = new VariavelDepurador();
            vd.x = xIniStrings + 3;
            vd.y = yIniStrings + passoY * i++ + 3;
            vd.largura = larg - xIniStrings - 11;
            vd.altura = 15;
            vd.nome = e.getKey();
            vd.valor = e.getValue();
                        
            variaveis.add( vd );
            c++;
            
        }
        
        if ( c > 0 ) {
            yAtual = yIniStrings + passoY * i++;
            g2d.drawString( "\u2570\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u256f", xIniStrings, yAtual );
            //g2d.drawString( "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518", xIniStrings, yAtual );
        }
        
        boolean entrou = false;
        for ( int j = variaveis.size() - 1; j >= 0; j-- ) {
            if ( variaveis.get( j ).desenhar( g2d, corTexto, corFundo, fm, xMouse, yMouse ) ) {
                entrou = true;
            }
        }
        
        if ( !dragging ) {
            if ( entrou ) {
                painelDesenho.setCursor( Cursor.getPredefinedCursor( Cursor.HAND_CURSOR ) );
            } else {
                painelDesenho.setCursor( Cursor.getPredefinedCursor( Cursor.DEFAULT_CURSOR ) );
            }
        }
        
        g2d.dispose();
        
    }
    
    private void desenharTartaruga( Graphics2D g2d, Estado e ) {
        
        g2d = (Graphics2D) g2d.create();
        
        double x = tx( e.x );
        double y = ty( e.y );
        
        g2d.rotate( Math.toRadians( e.angulo ), x, y );
        
        g2d.drawImage( 
                imgTartaruga, 
                (int) x - imgTartaruga.getWidth() / 2, 
                (int) y - imgTartaruga.getHeight() + 2, 
                null );
        
        g2d.dispose();
        
    }
    
    public void setXYMouse( int xMouse, int yMouse ) {
        this.xMouse = xMouse;
        this.yMouse = yMouse;
    }

    public void setDragging( boolean dragging ) {
        this.dragging = dragging;
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
    
    public double getGrossuraPincelEstadoFinal() {
        return (double) getEstadoFinal().contorno.getLineWidth();
    }
    
    public Color getCorPincelEstadoFinal() {
        return getEstadoFinal().corPincel;
    }
    
    public Color getCorPreenchimentoEstadoFinal() {
        return getEstadoFinal().corPreenchimento;
    }
    
    public Color getCorFundoEstadoFinal() {
        return getEstadoFinal().corFundo;
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

    public boolean isEixosAtivos() {
        return eixosAtivos;
    }

    public void setEixosAtivos( boolean eixosAtivos ) {
        this.eixosAtivos = eixosAtivos;
    }

    public boolean isPadraoCartesianoAtivo() {
        return padraoCartesianoAtivo;
    }

    public void setPadraoCartesianoAtivo( boolean padraoCartesianoAtivo ) {
        this.padraoCartesianoAtivo = padraoCartesianoAtivo;
    }
    
    public boolean isDesenhando() {
        return getEstadoFinal().desenhando;
    }
    
    // funções geométricas

    public void criarSegmento( double x1, double y1, double x2, double y2 ) {
        Estado e = clonarUltimoEstado();
        e.containerForma = new ContainerForma( 
                new Line2D.Double( x1, y1, x2, y2 ), 
                true, false, "segmento" );
        estados.add( e );
    }

    public void criarQuadrado( double xCentro, double yCentro, double lado,
            boolean contornado, boolean preenchido ) {
        Estado e = clonarUltimoEstado();
        e.containerForma = new ContainerForma( 
                new Rectangle2D.Double( 
                        xCentro, yCentro, 
                        lado, lado ), 
                contornado, preenchido, "quadrado" );
        estados.add( e );
    }

    public void criarRetangulo( double xCentro, double yCentro,
            double largura, double altura,
            boolean contornado, boolean preenchido ) {
        Estado e = clonarUltimoEstado();
        e.containerForma = new ContainerForma( 
                new Rectangle2D.Double( 
                        xCentro, yCentro, 
                        largura, altura ), 
                contornado, preenchido, "retângulo" );
        estados.add( e );
    }
    
    public void criarRetanguloArredondado( double xCentro, double yCentro,
            double largura, double altura, double arco,
            boolean contornado, boolean preenchido ) {
        Estado e = clonarUltimoEstado();
        e.containerForma = new ContainerForma( 
                new RoundRectangle2D.Double( 
                        xCentro, yCentro, 
                        largura, altura, arco, arco ), 
                contornado, preenchido, "retângulo a." );
        estados.add( e );
    }

    public void criarCirculo( double xCentro, double yCentro, double raio,
            boolean contornado, boolean preenchido ) {
        Estado e = clonarUltimoEstado();
        e.containerForma = new ContainerForma( 
                new Ellipse2D.Double( 
                        xCentro, yCentro, 
                        raio * 2, raio * 2 ), 
                contornado, preenchido, "círculo" );
        estados.add( e );
    }

    public void criarElipse( double xCentro, double yCentro,
            double eixoHorizontal, double eixoVertical,
            boolean contornada, boolean preenchida ) {
        Estado e = clonarUltimoEstado();
        e.containerForma = new ContainerForma( 
                new Ellipse2D.Double( 
                        xCentro, yCentro, 
                        eixoHorizontal, eixoVertical ), 
                contornada, preenchida, "elipse" );
        estados.add( e );
    }

    public void criarArco( double xCentro, double yCentro,
            double eixoHorizontal, double eixoVertical,
            double anguloInicio, double anguloFim,
            int tipo, boolean contornado, boolean preenchido ) {
        Estado e = clonarUltimoEstado();
        e.containerForma = new ContainerForma( 
                new Arc2D.Double( 
                        xCentro, yCentro, 
                        eixoHorizontal, eixoVertical, 
                        anguloInicio, anguloFim, tipo ), 
                contornado, preenchido, "arco" );
        estados.add( e );
    }

    public void criarPoligonoRegular( double xCentro, double yCentro,
            double raio, double angulo, int quantidadeLados,
            boolean contornado, boolean preenchido ) {
        
        if ( quantidadeLados >= 3 ) {
            
            Estado e = clonarUltimoEstado();
            Path2D.Double poligono = new Path2D.Double();
            
            double[] xs = new double[quantidadeLados];
            double[] ys = new double[quantidadeLados];
            Utils.gerarCoordenadasPoligonoRegular( xCentro, yCentro, raio, angulo, xs, ys );
            
            poligono.moveTo( xs[0], ys[0] );
        
            for ( int i = 1; i < quantidadeLados; i++ ) {
                poligono.lineTo( xs[i], ys[i] );
            }

            poligono.closePath();
            
            e.containerForma = new ContainerForma( poligono, contornado, preenchido, "polígono reg." );
            estados.add( e );
            
        }
        
    }

    public void criarEstrela( double xCentro, double yCentro,
            double raio, double angulo, int quantidadePontas,
            boolean contornada, boolean preenchida ) {
        
        if ( quantidadePontas >= 3 ) {
            
            Estado e = clonarUltimoEstado();
            Path2D.Double estrela = new Path2D.Double();
            
            double[] xs = new double[quantidadePontas];
            double[] ys = new double[quantidadePontas];
            Utils.gerarCoordenadasPoligonoRegular( xCentro, yCentro, raio, angulo, xs, ys );
            
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
            
            e.containerForma = new ContainerForma( estrela, contornada, preenchida, "estrela" );
            estados.add( e );
            
        }
        
    }

    public void criarPoligono( double x1, double y1,
            double x2, double y2,
            double x3, double y3,
            boolean contornado, boolean preenchido,
            double... xyn ) {
        
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
            
            e.containerForma = new ContainerForma( poligono, contornado, preenchido, "polígono" );
            estados.add( e );
        
        }
        
    }

    public void criarCurvaQuadratica( double x1, double y1,
            double xControle, double yControle,
            double x2, double y2,
            boolean contornada, boolean preenchida, boolean mostrarControles ) {
        Estado e = clonarUltimoEstado();
        e.containerForma = new ContainerForma( 
                new QuadCurve2D.Double( 
                        x1, y1,
                        xControle, yControle,
                        x2, y2 ),
                contornada, preenchida, 
                mostrarControles, "curva quad." );
        estados.add( e );
    }

    public void criarCurvaCubica( double x1, double y1,
            double xControle1, double yControle1,
            double xControle2, double yControle2,
            double x2, double y2,
            boolean contornada, boolean preenchida, boolean mostrarControles ) {
        Estado e = clonarUltimoEstado();
        e.containerForma = new ContainerForma( 
                new CubicCurve2D.Double( 
                        x1, y1,
                        xControle1, yControle1,
                        xControle2, yControle2,
                        x2, y2 ), 
                contornada, preenchida, 
                mostrarControles, "curva cúbica" );
        estados.add( e );
    }

    public void iniciarCaminho( boolean contornado, boolean preenchido, boolean mostrarControles ) {
        Estado e = clonarUltimoEstado();
        caminho = null;
        caminho = new ContainerForma( new Path2D.Double(), contornado, preenchido, mostrarControles, "caminho" );
        e.containerForma = caminho;
        estados.add( e );
    }

    public void caminhoMoverAte( double x, double y ) {
        
        if ( caminho != null ) {
            
            try { 
                Estado e = clonarUltimoEstado();
                caminho = (ContainerForma) caminho.clone();
                ( (Path2D.Double) caminho.forma ).moveTo( x, y );
                e.containerForma = caminho;
                estados.add( e );
            } catch ( CloneNotSupportedException exc ) {
            }
            
        }
        
    }

    public void caminhoLinhaAte( double x, double y ) {
        
        if ( caminho != null ) {
            
            try { 
                Estado e = clonarUltimoEstado();
                caminho = (ContainerForma) caminho.clone();
                ( (Path2D.Double) caminho.forma ).lineTo( x, y );
                e.containerForma = caminho;
                estados.add( e );
            } catch ( CloneNotSupportedException exc ) {
            }
            
        }
        
    }

    public void caminhoCurvaQuadraticaAte( double xControle, double yControle,
            double x, double y ) {
        
        if ( caminho != null ) {
            
            try { 
                Estado e = clonarUltimoEstado();
                caminho = (ContainerForma) caminho.clone();
                ( (Path2D.Double) caminho.forma ).quadTo( 
                        xControle, yControle, 
                        x, y );
                e.containerForma = caminho;
                estados.add( e );
            } catch ( CloneNotSupportedException exc ) {
            }
            
        }
        
    }

    public void caminhoCurvaCubicaAte( double xControle1, double yControle1,
            double xControle2, double yControle2,
            double x, double y ) {
        
        if ( caminho != null ) {
            
            try { 
                Estado e = clonarUltimoEstado();
                caminho = (ContainerForma) caminho.clone();
                ( (Path2D.Double) caminho.forma ).curveTo( 
                        xControle1, yControle1, 
                        xControle2, yControle2, 
                        x, y );
                e.containerForma = caminho;
                estados.add( e );
            } catch ( CloneNotSupportedException exc ) {
            }
            
        }
        
    }

    public void fecharCaminho() {
        
        if ( caminho != null ) {
            
            try { 
                Estado e = clonarUltimoEstado();
                caminho = (ContainerForma) caminho.clone();
                ( (Path2D.Double) caminho.forma ).closePath();
                e.containerForma = caminho;
                estados.add( e );
            } catch ( CloneNotSupportedException exc ) {
            }
            
        }
        
    }
    
    public void terminarCaminho() {
        caminho = null;
    }
    
}
