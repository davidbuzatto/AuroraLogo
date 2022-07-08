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

import br.com.davidbuzatto.auroralogo.gui.Tartaruga;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import static br.com.davidbuzatto.auroralogo.parser.impl.Valor.*;
import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Prof. Dr. David Buzatto
 */
public class ComponenteVisitorFuncoesMatematicas {
    
    private Tartaruga tartaruga;
    private AuroraLogoDesenhistaVisitor visitor;
    private Random gerador;
    
    public ComponenteVisitorFuncoesMatematicas( 
            Tartaruga tartaruga, 
            AuroraLogoDesenhistaVisitor visitor ) {
        this.tartaruga = tartaruga;
        this.visitor = visitor;
        this.gerador = new Random();
    }
    
    public Valor visitFuncaoAbsoluto( AuroraLogoParser.FuncaoAbsolutoContext ctx ) {
        
        Valor v = visitor.visit( ctx.expr() );
        
        if ( v.isInteiro() ) {
            return novoInteiro( Math.abs( v.valorInteiro() ) );
        } else if ( v.isDecimal() ) {
            return novoDecimal( Math.abs( v.valorDecimal() ) );
        }
       
        return ZERO_INTEIRO;
       
    }
    
    public Valor visitFuncaoRaizQuadrada( AuroraLogoParser.FuncaoRaizQuadradaContext ctx ) {
        
        Valor v = visitor.visit( ctx.expr() );
        
        if ( v.isInteiro() ) {
            if ( v.isPositivo() ) {
                return novoDecimal( Math.sqrt( v.valorInteiro() ) );
            }
        } else if ( v.isDecimal() ) {
            if ( v.isPositivo() ) {
                return novoDecimal( Math.sqrt( v.valorDecimal() ) );
            }
        }
       
        return ZERO_DECIMAL;
       
    }
    
    public Valor visitFuncaoRaizCubica( AuroraLogoParser.FuncaoRaizCubicaContext ctx ) {
        
        Valor v = visitor.visit( ctx.expr() );
        
        if ( v.isInteiro() ) {
            return novoDecimal( Math.cbrt( v.valorInteiro() ) );
        } else if ( v.isDecimal() ) {
            return novoDecimal( Math.cbrt( v.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    public Valor visitFuncaoRaiz( AuroraLogoParser.FuncaoRaizContext ctx ) {
        
        Valor vRad = visitor.visit( ctx.expr( 0 ) );
        Valor vInd = visitor.visit( ctx.expr( 1 ) );
        
        if ( vRad.isNumero() && vInd.isNumero() ) {
            return novoDecimal( Math.pow( vRad.valorDecimal(), 1.0 / vInd.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    public Valor visitFuncaoPotencia( AuroraLogoParser.FuncaoPotenciaContext ctx ) {
        
        Valor vBase = visitor.visit( ctx.expr( 0 ) );
        Valor vExp = visitor.visit( ctx.expr( 1 ) );
        
        if ( vBase.isNumero() && vExp.isNumero() ) {
            return novoDecimal( Math.pow( vBase.valorDecimal(), vExp.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    public Valor visitFuncaoHipotenusa( AuroraLogoParser.FuncaoHipotenusaContext ctx ) {
        
        Valor lado1 = visitor.visit( ctx.expr( 0 ) );
        Valor lado2 = visitor.visit( ctx.expr( 1 ) );
        
        if ( lado1.isNumero() && lado2.isNumero() ) {
            return novoDecimal( Math.hypot( lado1.valorDecimal(), lado2.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    public Valor visitFuncaoChao( AuroraLogoParser.FuncaoChaoContext ctx ) {
        
        Valor v = visitor.visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.floor( v.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    public Valor visitFuncaoTeto( AuroraLogoParser.FuncaoTetoContext ctx ) {
        
        Valor v = visitor.visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.ceil( v.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    public Valor visitFuncaoArredondar( AuroraLogoParser.FuncaoArredondarContext ctx ) {
        
        if ( ctx.expr( 1 ) == null ) {
            
            Valor v = visitor.visit( ctx.expr( 0 ) );
        
            if ( v.isNumero() ) {
                return novoInteiro( (int) Math.round( v.valorDecimal() ) );
            }
        
        } else {
            
            Valor v = visitor.visit( ctx.expr( 0 ) );
            Valor casas = visitor.visit( ctx.expr( 1 ) );
            try {
            if ( v.isNumero() && casas.isNumero() ) {
                String vs = String.format( Locale.US, "%." + casas.valorInteiro() + "f", v.valorDecimal() );
                return novoDecimal( Double.valueOf( vs ) );
            }
            } catch ( Exception exc ) {
                exc.printStackTrace();
            }
            
        }
       
        return ZERO_DECIMAL;
       
    }
    
    public Valor visitFuncaoMinimo( AuroraLogoParser.FuncaoMinimoContext ctx ) {
        
        Valor n1 = visitor.visit( ctx.expr( 0 ) );
        Valor n2 = visitor.visit( ctx.expr( 1 ) );
        
        if ( n1.isNumero() && n2.isNumero() ) {
            if ( n1.isInteiro() && n2.isInteiro() ) {
                return novoInteiro( Math.min( n1.valorInteiro(), n2.valorInteiro() ) );
            }
            return novoDecimal( Math.min( n1.valorDecimal(), n2.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    public Valor visitFuncaoMaximo( AuroraLogoParser.FuncaoMaximoContext ctx ) {
        
        Valor n1 = visitor.visit( ctx.expr( 0 ) );
        Valor n2 = visitor.visit( ctx.expr( 1 ) );
        
        if ( n1.isNumero() && n2.isNumero() ) {
            if ( n1.isInteiro() && n2.isInteiro() ) {
                return novoInteiro( Math.max( n1.valorInteiro(), n2.valorInteiro() ) );
            }
            return novoDecimal( Math.max( n1.valorDecimal(), n2.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }

    public Valor visitFuncaoNumeroAleatorio( AuroraLogoParser.FuncaoNumeroAleatorioContext ctx ) {
        
        if ( ctx.expr( 0 ) == null ) {
            return novoDecimal( gerador.nextDouble() );
        } else if ( ctx.expr( 1 ) == null ) {
            
            Valor limite = visitor.visit( ctx.expr( 0 ) );
            
            if ( limite.isInteiro() ) {
                return novoInteiro( gerador.nextInt( limite.valorInteiro() ) );
            } else if ( limite.isDecimal() ) {
                return novoDecimal( gerador.nextDouble( limite.valorDecimal() ) );
            }
            
            return novoDecimal( gerador.nextDouble() );
            
        } else {
            
            Valor origem = visitor.visit( ctx.expr( 0 ) );
            Valor limite = visitor.visit( ctx.expr( 1 ) );
            
            if ( origem.isNumero() && limite.isNumero() ) {
                
                if ( origem.isInteiro() && limite.isInteiro() ) {
                    return novoInteiro( gerador.nextInt( origem.valorInteiro(), limite.valorInteiro() ) );
                } else {
                    return novoDecimal( gerador.nextDouble( origem.valorDecimal(), limite.valorDecimal() ) );
                }
                
            }
            
            return novoDecimal( gerador.nextDouble() );
            
        }
        
    }
    
    public Valor visitFuncaoDefinirSementeAleatoria( AuroraLogoParser.FuncaoDefinirSementeAleatoriaContext ctx ) {
        
        Valor v = visitor.visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            gerador = new Random( v.valorInteiro() );
        }
        
        return NULO;
        
    }
    
    public Valor visitFuncaoSeno( AuroraLogoParser.FuncaoSenoContext ctx ) {
        
        Valor a = visitor.visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            double rad = Math.toRadians( a.valorDecimal() );
            return novoDecimal( Math.sin( rad ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    public Valor visitFuncaoSenoHiperbolico( AuroraLogoParser.FuncaoSenoHiperbolicoContext ctx ) {
        
        Valor a = visitor.visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            return novoDecimal( Math.sinh( a.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    public Valor visitFuncaoArcoSeno( AuroraLogoParser.FuncaoArcoSenoContext ctx ) {
        
        Valor v = visitor.visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.toDegrees( Math.asin( v.valorDecimal() ) ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    public Valor visitFuncaoCosseno( AuroraLogoParser.FuncaoCossenoContext ctx ) {
        
        Valor a = visitor.visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            double rad = Math.toRadians( a.valorDecimal() );
            return novoDecimal( Math.cos( rad ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    public Valor visitFuncaoCossenoHiperbolico( AuroraLogoParser.FuncaoCossenoHiperbolicoContext ctx ) {
        
        Valor a = visitor.visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            return novoDecimal( Math.cosh( a.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    public Valor visitFuncaoArcoCosseno( AuroraLogoParser.FuncaoArcoCossenoContext ctx ) {
        
        Valor v = visitor.visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.toDegrees( Math.acos( v.valorDecimal() ) ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    public Valor visitFuncaoTangente( AuroraLogoParser.FuncaoTangenteContext ctx ) {
        
        Valor a = visitor.visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            double rad = Math.toRadians( a.valorDecimal() );
            return novoDecimal( Math.tan( rad ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    public Valor visitFuncaoTangenteHiperbolica( AuroraLogoParser.FuncaoTangenteHiperbolicaContext ctx ) {
        
        Valor a = visitor.visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            return novoDecimal( Math.tanh( a.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    public Valor visitFuncaoArcoTangente( AuroraLogoParser.FuncaoArcoTangenteContext ctx ) {
        
        Valor v = visitor.visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.toDegrees( Math.atan( v.valorDecimal() ) ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    public Valor visitFuncaoCartesianoParaPolar( AuroraLogoParser.FuncaoCartesianoParaPolarContext ctx ) {
        
        Valor y = visitor.visit( ctx.expr( 0 ) );
        Valor x = visitor.visit( ctx.expr( 1 ) );
        
        if ( y.isNumero() && x.isNumero() ) {
            return novoDecimal( Math.toDegrees( Math.atan2( y.valorDecimal(), x.valorDecimal() ) ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    public Valor visitFuncaoLogaritmo( AuroraLogoParser.FuncaoLogaritmoContext ctx ) {
        
        Valor v = visitor.visit( ctx.expr( 0 ) );
        
        if ( ctx.expr( 1 ) == null ) {    
            if ( v.isNumero() ) {
                return novoDecimal( Math.log( v.valorDecimal() ) );
            }
        } else {
            
            Valor base = visitor.visit( ctx.expr( 1 ) );
            
            if ( v.isNumero() && base.isNumero() ) {
                
                double dv = v.valorDecimal();
                double db = base.valorDecimal();
                
                return novoDecimal( Math.log( dv ) / Math.log( db ) );
                
            }
            
        }
        
        return ZERO_DECIMAL;
        
    }
    
    public Valor visitFuncaoGrausParaRadianos( AuroraLogoParser.FuncaoGrausParaRadianosContext ctx ) {
        
        Valor g = visitor.visit( ctx.expr() );
        
        if ( g.isNumero() ) {
            return novoDecimal( Math.toRadians( g.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    public Valor visitFuncaoRadianosParaGraus( AuroraLogoParser.FuncaoRadianosParaGrausContext ctx ) {
        
        Valor r = visitor.visit( ctx.expr() );
        
        if ( r.isNumero() ) {
            return novoDecimal( Math.toDegrees( r.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    public Valor visitFuncaoIncrementar( AuroraLogoParser.FuncaoIncrementarContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            valor.incrementar();
            tartaruga.inserirOuAtualizarMemoria( id, valor );
        }
        
        return valor;
        
    }
    
    public Valor visitFuncaoDecrementar( AuroraLogoParser.FuncaoDecrementarContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            valor.decrementar();
            tartaruga.inserirOuAtualizarMemoria( id, valor );
        }
        
        return valor;
        
    }
    
}
