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
package br.com.davidbuzatto.auroralogo.parser.impl;

import br.com.davidbuzatto.auroralogo.gui.tartaruga.Tartaruga;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import static br.com.davidbuzatto.auroralogo.parser.impl.Valor.*;
import java.awt.geom.Arc2D;

/**
 * Implementação dos métodos de visita para as instruções geométricas.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class ComponenteVisitorInstrucoesGeometricas {
    
    private Tartaruga tartaruga;
    private AuroraLogoDesenhistaVisitor visitor;
    
    public ComponenteVisitorInstrucoesGeometricas( 
            Tartaruga tartaruga, 
            AuroraLogoDesenhistaVisitor visitor ) {
        this.tartaruga = tartaruga;
        this.visitor = visitor;
    }
    
    public Valor visitFuncaoDesenharSegmento( AuroraLogoParser.FuncaoDesenharSegmentoContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double x1 = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
            double y1 = visitor.visit( ctx.expr( 1 ) ).valorDecimal();
            double x2 = visitor.visit( ctx.expr( 2 ) ).valorDecimal();
            double y2 = visitor.visit( ctx.expr( 3 ) ).valorDecimal();

            boolean d = tartaruga.isDesenhando();
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( x1, y1 );
            tartaruga.criarSegmento( x1, y1, x2, y2 );
            tartaruga.moverPara( x2, y2, false );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }
    
    public Valor visitFuncaoDesenharQuadrado( AuroraLogoParser.FuncaoDesenharQuadradoContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visitor.visit( ctx.expr( 1 ) ).valorDecimal();
            double lado = visitor.visit( ctx.expr( 2 ) ).valorDecimal();

            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = true;
            
            if ( ctx.opcaoFuncGeom() != null ) {
                contorno = ctx.opcaoFuncGeom().CON() == null;
                preenchimento = ctx.opcaoFuncGeom().PREE() == null;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( xCentro, yCentro );
            tartaruga.criarQuadrado( xCentro, yCentro, lado, contorno, preenchimento );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }
    
    public Valor visitFuncaoDesenharRetangulo( AuroraLogoParser.FuncaoDesenharRetanguloContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visitor.visit( ctx.expr( 1 ) ).valorDecimal();
            double largura = visitor.visit( ctx.expr( 2 ) ).valorDecimal();
            double altura = visitor.visit( ctx.expr( 3 ) ).valorDecimal();

            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = true;
            
            if ( ctx.opcaoFuncGeom() != null ) {
                contorno = ctx.opcaoFuncGeom().CON() == null;
                preenchimento = ctx.opcaoFuncGeom().PREE() == null;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( xCentro, yCentro );
            tartaruga.criarRetangulo( xCentro, yCentro, largura, altura, contorno, preenchimento );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }
    
    public Valor visitFuncaoDesenharRetanguloArredondado( AuroraLogoParser.FuncaoDesenharRetanguloArredondadoContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visitor.visit( ctx.expr( 1 ) ).valorDecimal();
            double largura = visitor.visit( ctx.expr( 2 ) ).valorDecimal();
            double altura = visitor.visit( ctx.expr( 3 ) ).valorDecimal();
            double arco = visitor.visit( ctx.expr( 4 ) ).valorDecimal();

            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = true;
            
            if ( ctx.opcaoFuncGeom() != null ) {
                contorno = ctx.opcaoFuncGeom().CON() == null;
                preenchimento = ctx.opcaoFuncGeom().PREE() == null;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( xCentro, yCentro );
            tartaruga.criarRetanguloArredondado( xCentro, yCentro, largura, altura, arco, contorno, preenchimento );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }
    
    public Valor visitFuncaoDesenharCirculo( AuroraLogoParser.FuncaoDesenharCirculoContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visitor.visit( ctx.expr( 1 ) ).valorDecimal();
            double raio = visitor.visit( ctx.expr( 2 ) ).valorDecimal();

            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = true;
            
            if ( ctx.opcaoFuncGeom() != null ) {
                contorno = ctx.opcaoFuncGeom().CON() == null;
                preenchimento = ctx.opcaoFuncGeom().PREE() == null;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( xCentro, yCentro );
            tartaruga.criarCirculo( xCentro, yCentro, raio, contorno, preenchimento );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }
    
    public Valor visitFuncaoDesenharElipse( AuroraLogoParser.FuncaoDesenharElipseContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visitor.visit( ctx.expr( 1 ) ).valorDecimal();
            double eixoHorizontal = visitor.visit( ctx.expr( 2 ) ).valorDecimal();
            double eixoVertical = visitor.visit( ctx.expr( 3 ) ).valorDecimal();

            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = true;
            
            if ( ctx.opcaoFuncGeom() != null ) {
                contorno = ctx.opcaoFuncGeom().CON() == null;
                preenchimento = ctx.opcaoFuncGeom().PREE() == null;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( xCentro, yCentro );
            tartaruga.criarElipse( xCentro, yCentro, eixoHorizontal, eixoVertical, contorno, preenchimento );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }
    
    public Valor visitFuncaoDesenharArco( AuroraLogoParser.FuncaoDesenharArcoContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visitor.visit( ctx.expr( 1 ) ).valorDecimal();
            double eixoHorizontal = visitor.visit( ctx.expr( 2 ) ).valorDecimal();
            double eixoVertical = visitor.visit( ctx.expr( 3 ) ).valorDecimal();
            double anguloInicio = visitor.visit( ctx.expr( 4 ) ).valorDecimal();
            double anguloFim = visitor.visit( ctx.expr( 5 ) ).valorDecimal();
            int tipo = Arc2D.OPEN;
            
            if ( ctx.ABE() != null ) {
                tipo = Arc2D.OPEN;
            } else if ( ctx.COD() != null ) {
                tipo = Arc2D.CHORD;
            } else if ( ctx.PIZ() != null ) {
                tipo = Arc2D.PIE;
            }
            
            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = true;
            
            if ( ctx.opcaoFuncGeom() != null ) {
                contorno = ctx.opcaoFuncGeom().CON() == null;
                preenchimento = ctx.opcaoFuncGeom().PREE() == null;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( xCentro, yCentro );
            tartaruga.criarArco( xCentro, yCentro, eixoHorizontal, eixoVertical, anguloInicio, anguloFim, tipo, contorno, preenchimento );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }
    
    public Valor visitFuncaoDesenharPoligonoRegular( AuroraLogoParser.FuncaoDesenharPoligonoRegularContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visitor.visit( ctx.expr( 1 ) ).valorDecimal();
            double raio = visitor.visit( ctx.expr( 2 ) ).valorDecimal();
            double angulo = visitor.visit( ctx.expr( 3 ) ).valorDecimal();
            int quantidadeLados = visitor.visit( ctx.expr( 4 ) ).valorInteiro();
            
            if ( quantidadeLados < 3 ) {
                quantidadeLados = 3;
            }
            
            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = true;

            if ( ctx.opcaoFuncGeom() != null ) {
                contorno = ctx.opcaoFuncGeom().CON() == null;
                preenchimento = ctx.opcaoFuncGeom().PREE() == null;
            }

            tartaruga.levantarPincel( false );
            tartaruga.moverPara( xCentro, yCentro );
            tartaruga.criarPoligonoRegular( xCentro, yCentro, raio, angulo, quantidadeLados, contorno, preenchimento );

            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }
    
    public Valor visitFuncaoDesenharEstrela( AuroraLogoParser.FuncaoDesenharEstrelaContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visitor.visit( ctx.expr( 1 ) ).valorDecimal();
            double raio = visitor.visit( ctx.expr( 2 ) ).valorDecimal();
            double angulo = visitor.visit( ctx.expr( 3 ) ).valorDecimal();
            int quantidadePontas = visitor.visit( ctx.expr( 4 ) ).valorInteiro();
            
            if ( quantidadePontas < 5 ) {
                quantidadePontas = 5;
            }
               
            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = true;

            if ( ctx.opcaoFuncGeom() != null ) {
                contorno = ctx.opcaoFuncGeom().CON() == null;
                preenchimento = ctx.opcaoFuncGeom().PREE() == null;
            }

            tartaruga.levantarPincel( false );
            tartaruga.moverPara( xCentro, yCentro );
            tartaruga.criarEstrela( xCentro, yCentro, raio, angulo, quantidadePontas, contorno, preenchimento );

            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }
    
    public Valor visitFuncaoDesenharPoligono( AuroraLogoParser.FuncaoDesenharPoligonoContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double[] xys = new double[ctx.expr().size()];
            
            double xMin = Double.MAX_VALUE;
            double xMax = Double.MIN_VALUE;
            double yMin = Double.MAX_VALUE;
            double yMax = Double.MIN_VALUE;
            
            if ( xys.length % 2 == 0 ) {
                
                for ( int i = 0; i < xys.length; i += 2 ) {
                    
                    xys[i] = visitor.visit( ctx.expr( i ) ).valorDecimal();
                    xys[i+1] = visitor.visit( ctx.expr( i+1 ) ).valorDecimal();
                    
                    if ( xys[i] < xMin ) {
                        xMin = xys[i];
                    }
                    
                    if ( xys[i] > xMax ) {
                        xMax = xys[i];
                    }
                    
                    if ( xys[i+1] < yMin ) {
                        yMin = xys[i+1];
                    }
                    
                    if ( xys[i+1] > yMax ) {
                        yMax = xys[i+1];
                    }
                    
                }

                boolean d = tartaruga.isDesenhando();
                boolean contorno = true;
                boolean preenchimento = true;

                if ( ctx.opcaoFuncGeom() != null ) {
                    contorno = ctx.opcaoFuncGeom().CON() == null;
                    preenchimento = ctx.opcaoFuncGeom().PREE() == null;
                }
                
                tartaruga.levantarPincel( false );
                tartaruga.moverPara( ( xMin + xMax ) / 2, ( yMin + yMax ) / 2 );
                
                if ( xys.length > 6 ) {
                    double[] res = new double[xys.length - 6];
                    for ( int i = 0; i < res.length; i++ ) {
                        res[i] = xys[6+i];
                    }
                    tartaruga.criarPoligono( xys[0], xys[1], xys[2], xys[3], xys[4], xys[5], contorno, preenchimento, res );
                } else {
                    tartaruga.criarPoligono( xys[0], xys[1], xys[2], xys[3], xys[4], xys[5], contorno, preenchimento );
                }
                
                

                if ( d ) {
                    tartaruga.abaixarPincel( false );
                }
            
            }
            
        }
        
        return NULO;
        
    }
    
    public Valor visitFuncaoDesenharCurvaQuadratica( AuroraLogoParser.FuncaoDesenharCurvaQuadraticaContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double x1 = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
            double y1 = visitor.visit( ctx.expr( 1 ) ).valorDecimal();
            double xControle = visitor.visit( ctx.expr( 2 ) ).valorDecimal();
            double yControle = visitor.visit( ctx.expr( 3 ) ).valorDecimal();
            double x2 = visitor.visit( ctx.expr( 4 ) ).valorDecimal();
            double y2 = visitor.visit( ctx.expr( 5 ) ).valorDecimal();
            
            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = true;
            boolean mostrarControles = false;
            
            if ( ctx.opcaoFuncGeom() != null ) {
                contorno = ctx.opcaoFuncGeom().CON() == null;
                preenchimento = ctx.opcaoFuncGeom().PREE() == null;
            }
            
            if ( ctx.opcaoPontosControle() != null ) {
                mostrarControles = true;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( x2, y2 );
            tartaruga.criarCurvaQuadratica( x1, y1, xControle, yControle, x2, y2, contorno, preenchimento, mostrarControles );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }
    
    public Valor visitFuncaoDesenharCurvaCubica( AuroraLogoParser.FuncaoDesenharCurvaCubicaContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double x1 = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
            double y1 = visitor.visit( ctx.expr( 1 ) ).valorDecimal();
            double xControle1 = visitor.visit( ctx.expr( 2 ) ).valorDecimal();
            double yControle1 = visitor.visit( ctx.expr( 3 ) ).valorDecimal();
            double xControle2 = visitor.visit( ctx.expr( 4 ) ).valorDecimal();
            double yControle2 = visitor.visit( ctx.expr( 5 ) ).valorDecimal();
            double x2 = visitor.visit( ctx.expr( 6 ) ).valorDecimal();
            double y2 = visitor.visit( ctx.expr( 7 ) ).valorDecimal();
            
            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = true;
            boolean mostrarControles = false;
            
            if ( ctx.opcaoFuncGeom() != null ) {
                contorno = ctx.opcaoFuncGeom().CON() == null;
                preenchimento = ctx.opcaoFuncGeom().PREE() == null;
            }
            
            if ( ctx.opcaoPontosControle() != null ) {
                mostrarControles = true;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( x2, y2 );
            tartaruga.criarCurvaCubica( x1, y1, xControle1, yControle1, xControle2, yControle2, x2, y2, contorno, preenchimento, mostrarControles );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }
    
    public Valor visitDesenharCaminho( AuroraLogoParser.DesenharCaminhoContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = true;
            boolean mostrarControles = false;
            
            if ( ctx.opcaoFuncGeom() != null ) {
                contorno = ctx.opcaoFuncGeom().CON() == null;
                preenchimento = ctx.opcaoFuncGeom().PREE() == null;
            }
            
            if ( ctx.opcaoPontosControle() != null ) {
                mostrarControles = true;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.iniciarCaminho( contorno, preenchimento, mostrarControles );
            
            for ( AuroraLogoParser.InstCaminhoContext c : ctx.instCaminho() ) {
                visitor.visit( c );
            }
            
            tartaruga.terminarCaminho();
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }
    
    public Valor visitInstrucaoCaminhoMoverAte( AuroraLogoParser.InstrucaoCaminhoMoverAteContext ctx ) {
            
        double x = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
        double y = visitor.visit( ctx.expr( 1 ) ).valorDecimal();

        boolean d = tartaruga.isDesenhando();

        tartaruga.levantarPincel( false );
        tartaruga.moverPara( x, y );
        tartaruga.caminhoMoverAte( x, y );

        if ( d ) {
            tartaruga.abaixarPincel( false );
        }
        
        return NULO;
        
    }
    
    public Valor visitInstrucaoCaminhoLinhaAte( AuroraLogoParser.InstrucaoCaminhoLinhaAteContext ctx ) {
        
        double x = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
        double y = visitor.visit( ctx.expr( 1 ) ).valorDecimal();

        boolean d = tartaruga.isDesenhando();

        tartaruga.levantarPincel( false );
        tartaruga.moverPara( x, y );
        tartaruga.caminhoLinhaAte( x, y );

        if ( d ) {
            tartaruga.abaixarPincel( false );
        }
        
        return NULO;
        
    }
    
    public Valor visitInstrucaoCaminhoCurvaQuadraticaAte( AuroraLogoParser.InstrucaoCaminhoCurvaQuadraticaAteContext ctx ) {
        
        double xControle = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
        double yControle = visitor.visit( ctx.expr( 1 ) ).valorDecimal();
        double x = visitor.visit( ctx.expr( 2 ) ).valorDecimal();
        double y = visitor.visit( ctx.expr( 3 ) ).valorDecimal();

        boolean d = tartaruga.isDesenhando();

        tartaruga.levantarPincel( false );
        tartaruga.moverPara( x, y );
        tartaruga.caminhoCurvaQuadraticaAte( xControle, yControle, x, y );

        if ( d ) {
            tartaruga.abaixarPincel( false );
        }
        
        return NULO;
        
    }
    
    public Valor visitInstrucaoCaminhoCurvaCubicaAte( AuroraLogoParser.InstrucaoCaminhoCurvaCubicaAteContext ctx ) {
            
        double xControle1 = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
        double yControle1 = visitor.visit( ctx.expr( 1 ) ).valorDecimal();
        double xControle2 = visitor.visit( ctx.expr( 2 ) ).valorDecimal();
        double yControle2 = visitor.visit( ctx.expr( 3 ) ).valorDecimal();
        double x = visitor.visit( ctx.expr( 4 ) ).valorDecimal();
        double y = visitor.visit( ctx.expr( 5 ) ).valorDecimal();

        boolean d = tartaruga.isDesenhando();

        tartaruga.levantarPincel( false );
        tartaruga.moverPara( x, y );
        tartaruga.caminhoCurvaCubicaAte( xControle1, yControle1, xControle2, yControle2, x, y );

        if ( d ) {
            tartaruga.abaixarPincel( false );
        }
        
        return NULO;
        
    }
    
    public Valor visitInstrucaoCaminhoFecharCaminho( AuroraLogoParser.InstrucaoCaminhoFecharCaminhoContext ctx ) {
        
        boolean d = tartaruga.isDesenhando();

        tartaruga.levantarPincel( false );
        tartaruga.fecharCaminho();

        if ( d ) {
            tartaruga.abaixarPincel( false );
        }
        
        return NULO;
        
    }
    
}
