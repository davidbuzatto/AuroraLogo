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

/**
 *
 * @author Prof. Dr. David Buzatto
 */
public class ComponenteVisitorAtribuicao {
    
    private Tartaruga tartaruga;
    private AuroraLogoDesenhistaVisitor visitor;
    
    public ComponenteVisitorAtribuicao( 
            Tartaruga tartaruga, 
            AuroraLogoDesenhistaVisitor visitor ) {
        this.tartaruga = tartaruga;
        this.visitor = visitor;
    }
    
    public Valor visitAtribuirPadrao( AuroraLogoParser.AtribuirPadraoContext ctx ) {
        
        String id = ctx.ID().getText();
        
        Valor valor = visitor.visit( ctx.expr() );
        tartaruga.inserirOuAtualizarMemoria( id, valor );
        
        return valor;
        
    }
    
    public Valor visitAtribuirAdicao( AuroraLogoParser.AtribuirAdicaoContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = visitor.visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria.somar( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN.somar( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN.somar( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        } else if ( vMemoria.isString() ) {
            vMemoria.contatenar( valor );
            tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
        }
        
        return vMemoria;
        
    }
    
    public Valor visitAtribuirSubtracao( AuroraLogoParser.AtribuirSubtracaoContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = visitor.visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria.subtrair( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN.subtrair( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN.subtrair( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        }
        
        return vMemoria;
        
    }
    
    public Valor visitAtribuirMultiplicacao( AuroraLogoParser.AtribuirMultiplicacaoContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = visitor.visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria.multiplicar( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN.multiplicar( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN.multiplicar( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        }
        
        return vMemoria;
        
    }
    
    public Valor visitAtribuirDivisao( AuroraLogoParser.AtribuirDivisaoContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = visitor.visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria.dividir( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN.dividir( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN.dividir( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        }
        
        return vMemoria;
        
    }
    
    public Valor visitAtribuirResto( AuroraLogoParser.AtribuirRestoContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = visitor.visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria.resto( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN.resto( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN.resto( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        }
        
        return vMemoria;
        
    }
    
}
