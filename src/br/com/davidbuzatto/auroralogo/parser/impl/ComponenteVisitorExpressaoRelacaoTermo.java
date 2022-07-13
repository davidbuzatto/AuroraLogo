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

import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import static br.com.davidbuzatto.auroralogo.parser.impl.Valor.*;
import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.Color;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Implementação dos métodos de visita para tratamento de expressões.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class ComponenteVisitorExpressaoRelacaoTermo {

    private AuroraLogoDesenhistaVisitor visitor;

    public ComponenteVisitorExpressaoRelacaoTermo(
            AuroraLogoDesenhistaVisitor visitor ) {
        this.visitor = visitor;
    }
    
    public Valor visitExpr( AuroraLogoParser.ExprContext ctx ) {

        Valor valor = ZERO_INTEIRO;

        for ( int i = 0; i < ctx.getChildCount(); i += 2 ) {

            if ( i == 0 ) {
                valor = visitor.visit( ctx.getChild( i ) );
            } else {

                int op = ( ( TerminalNode ) ctx.getChild( i - 1 ) ).getSymbol().getType();
                Valor rv = visitor.visit( ctx.getChild( i ) );

                switch ( op ) {
                    case AuroraLogoParser.ELG:
                    case AuroraLogoParser.ELGT:
                        valor = novoBooleano( valor.valorBooleano() && rv.valorBooleano() );
                        break;
                    case AuroraLogoParser.OLG:
                    case AuroraLogoParser.OLGT:
                        valor = novoBooleano( valor.valorBooleano() || rv.valorBooleano() );
                        break;
                }

            }

        }

        return valor;

    }
    
    public Valor visitRelacao( AuroraLogoParser.RelacaoContext ctx ) {

        Valor valor = visitor.visit( ctx.exprSimp( 0 ) );

        if ( ctx.opRel != null ) {

            Valor rv = visitor.visit( ctx.exprSimp( 1 ) );
            boolean res = false;

            switch ( ctx.opRel.getType() ) {
                case AuroraLogoParser.IGU:
                case AuroraLogoParser.IGUT:
                case AuroraLogoParser.IGUA:
                    if ( valor.isInteiro() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorInteiro().intValue() == rv.valorInteiro().intValue();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorInteiro().intValue() == rv.valorDecimal().doubleValue();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorInteiro().intValue() == rv.valorCaractere().charValue();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorInteiro() != 0 ) == rv.valorBooleano();
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorInteiro() ).equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = valor.valorInteiro() == rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isDecimal() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorDecimal().doubleValue() == rv.valorInteiro().intValue();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorDecimal().doubleValue() == rv.valorDecimal().doubleValue();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorDecimal().doubleValue() == rv.valorCaractere().charValue();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorDecimal() != 0.0 ) == rv.valorBooleano();
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorDecimal() ).equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = valor.valorDecimal() == rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCaractere() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCaractere().charValue() == rv.valorInteiro().intValue();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCaractere().charValue() == rv.valorDecimal().doubleValue();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCaractere().charValue() == rv.valorCaractere().charValue();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorCaractere() != '\0' ) == rv.valorBooleano();
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCaractere() ).equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = valor.valorCaractere() == rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isBooleano() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorBooleano() == ( rv.valorInteiro() != 0 );
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorBooleano() == ( rv.valorDecimal() != 0.0 );
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorBooleano() == ( rv.valorCaractere() != '\0' );
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorBooleano().booleanValue() == rv.valorBooleano().booleanValue();
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) == rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isString() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorString().equals( String.valueOf( rv.valorInteiro() ) );
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorString().equals( String.valueOf( rv.valorDecimal() ) );
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorString().equals( String.valueOf( rv.valorCaractere() ) );
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorString().equals( String.valueOf( rv ) );
                        } else if ( rv.isString() ) {
                            res = valor.valorString().equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = valor.valorString().equals( String.valueOf( rv ) );
                        } else if ( rv.isArranjo() ) {
                            res = valor.valorString().equals( String.valueOf( rv ) );
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = valor.valorString().equals( String.valueOf( rv ) );
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCor() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCor().getRGB() == rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCor().getRGB() == rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCor().getRGB() == rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorCor().getRGB() == ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCor() ).equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = valor.valorCor().getRGB() == rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isArranjo() ) {
                        if ( rv.isInteiro() ) {
                            res = false;
                        } else if ( rv.isDecimal() ) {
                            res = false;
                        } else if ( rv.isCaractere() ) {
                            res = false;
                        } else if ( rv.isBooleano() ) {
                            res = false;
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = false;
                        } else if ( rv.isArranjo() ) {
                            res = valor.equalsArranjo( rv );
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isArranjoAssociativo() ) {
                        if ( rv.isInteiro() ) {
                            res = false;
                        } else if ( rv.isDecimal() ) {
                            res = false;
                        } else if ( rv.isCaractere() ) {
                            res = false;
                        } else if ( rv.isBooleano() ) {
                            res = false;
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = false;
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = valor.equalsArranjoAssociativo( rv );
                        } else {
                            res = false;
                        }
                    } else {
                        res = false;
                    }
                    break;
                case AuroraLogoParser.DIF:
                case AuroraLogoParser.DIFT:
                case AuroraLogoParser.DIFA:
                    if ( valor.isInteiro() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorInteiro().intValue() != rv.valorInteiro().intValue();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorInteiro().intValue() != rv.valorDecimal().doubleValue();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorInteiro().intValue() != rv.valorCaractere().charValue();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorInteiro() != 0 ) != rv.valorBooleano();
                        } else if ( rv.isString() ) {
                            res = !String.valueOf( valor.valorInteiro() ).equals( rv.valorString() );
                        }  else if ( rv.isCor() ) {
                            res = valor.valorInteiro() != rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = true;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = true;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isDecimal() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorDecimal().doubleValue() != rv.valorInteiro().intValue();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorDecimal().doubleValue() != rv.valorDecimal().doubleValue();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorDecimal().doubleValue() != rv.valorCaractere().charValue();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorDecimal() != 0.0 ) != rv.valorBooleano();
                        } else if ( rv.isString() ) {
                            res = !String.valueOf( valor.valorDecimal() ).equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = valor.valorDecimal() != rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = true;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = true;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCaractere() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCaractere().charValue() != rv.valorInteiro().intValue();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCaractere().charValue() != rv.valorDecimal().doubleValue();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCaractere().charValue() != rv.valorCaractere().charValue();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorCaractere() != '\0' ) != rv.valorBooleano();
                        } else if ( rv.isString() ) {
                            res = !String.valueOf( valor.valorCaractere() ).equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = valor.valorCaractere() != rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = true;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = true;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isBooleano() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorBooleano() != ( rv.valorInteiro() != 0 );
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorBooleano() != ( rv.valorDecimal() != 0.0 );
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorBooleano() != ( rv.valorCaractere() != '\0' );
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorBooleano().booleanValue() != rv.valorBooleano().booleanValue();
                        } else if ( rv.isString() ) {
                            res = !String.valueOf( valor ).equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) != rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = true;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = true;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isString() ) {
                        if ( rv.isInteiro() ) {
                            res = !valor.valorString().equals( String.valueOf( rv.valorInteiro() ) );
                        } else if ( rv.isDecimal() ) {
                            res = !valor.valorString().equals( String.valueOf( rv.valorDecimal() ) );
                        } else if ( rv.isCaractere() ) {
                            res = !valor.valorString().equals( String.valueOf( rv.valorCaractere() ) );
                        } else if ( rv.isBooleano() ) {
                            res = !valor.valorString().equals( String.valueOf( rv ) );
                        } else if ( rv.isString() ) {
                            res = !valor.valorString().equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = !valor.valorString().equals( String.valueOf( rv ) );
                        } else if ( rv.isArranjo() ) {
                            res = !valor.valorString().equals( String.valueOf( rv ) );
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = !valor.valorString().equals( String.valueOf( rv ) );
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCor() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCor().getRGB() != rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCor().getRGB() != rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCor().getRGB() != rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorCor().getRGB() != ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = !String.valueOf( valor.valorCor() ).equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = valor.valorCor().getRGB() != rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = true;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = true;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isArranjo() ) {
                        if ( rv.isInteiro() ) {
                            res = true;
                        } else if ( rv.isDecimal() ) {
                            res = true;
                        } else if ( rv.isCaractere() ) {
                            res = true;
                        } else if ( rv.isBooleano() ) {
                            res = true;
                        } else if ( rv.isString() ) {
                            res = !String.valueOf( valor ).equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = true;
                        } else if ( rv.isArranjo() ) {
                            res = !valor.equalsArranjo( rv );
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = true;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isArranjoAssociativo() ) {
                        if ( rv.isInteiro() ) {
                            res = true;
                        } else if ( rv.isDecimal() ) {
                            res = true;
                        } else if ( rv.isCaractere() ) {
                            res = true;
                        } else if ( rv.isBooleano() ) {
                            res = true;
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).equals( rv.valorString() );
                        } else if ( rv.isCor() ) {
                            res = true;
                        } else if ( rv.isArranjo() ) {
                            res = true;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = !valor.equalsArranjoAssociativo( rv );
                        } else {
                            res = false;
                        }
                    } else {
                        res = false;
                    }
                    break;
                case AuroraLogoParser.ME:
                case AuroraLogoParser.MET:
                case AuroraLogoParser.MEA:
                    if ( valor.isInteiro() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorInteiro() < rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorInteiro() < rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorInteiro() < rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorInteiro() < ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorInteiro() ).compareTo( rv.valorString() ) < 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorInteiro() < rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isDecimal() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorDecimal() < rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorDecimal() < rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorDecimal() < rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorDecimal() < ( rv.valorBooleano() ? 1.0 : 0.0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorDecimal() ).compareTo( rv.valorString() ) < 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorDecimal() < rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCaractere() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCaractere() < rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCaractere() < rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCaractere() < rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorCaractere() < ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCaractere() ).compareTo( rv.valorString() ) < 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorCaractere() < rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isBooleano() ) {
                        if ( rv.isInteiro() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) < rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) < rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) < rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) < ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) < 0;
                        } else if ( rv.isCor() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) < rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isString() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorInteiro() ) ) < 0;
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorDecimal() ) ) < 0;
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorCaractere() ) ) < 0;
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) < 0;
                        } else if ( rv.isString() ) {
                            res = valor.valorString().compareTo( rv.valorString() ) < 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) < 0;
                        } else if ( rv.isArranjo() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) < 0;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) < 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCor() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCor().getRGB() < rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCor().getRGB() < rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCor().getRGB() < rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorCor().getRGB() < ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCor() ).compareTo( rv.valorString() ) < 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorCor().getRGB() < rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isArranjo() ) {
                        if ( rv.isInteiro() ) {
                            res = false;
                        } else if ( rv.isDecimal() ) {
                            res = false;
                        } else if ( rv.isCaractere() ) {
                            res = false;
                        } else if ( rv.isBooleano() ) {
                            res = false;
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) < 0;
                        } else if ( rv.isCor() ) {
                            res = false;
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isArranjoAssociativo() ) {
                        if ( rv.isInteiro() ) {
                            res = false;
                        } else if ( rv.isDecimal() ) {
                            res = false;
                        } else if ( rv.isCaractere() ) {
                            res = false;
                        } else if ( rv.isBooleano() ) {
                            res = false;
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) < 0;
                        } else if ( rv.isCor() ) {
                            res = false;
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else {
                        res = false;
                    }
                    break;
                case AuroraLogoParser.MEI:
                case AuroraLogoParser.MEIT:
                case AuroraLogoParser.MEIA:
                    if ( valor.isInteiro() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorInteiro() <= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorInteiro() <= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorInteiro() <= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorInteiro() <= ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorInteiro() ).compareTo( rv.valorString() ) <= 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorInteiro() <= rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isDecimal() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorDecimal() <= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorDecimal() <= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorDecimal() <= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorDecimal() <= ( rv.valorBooleano() ? 1.0 : 0.0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorDecimal() ).compareTo( rv.valorString() ) <= 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorDecimal() <= rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCaractere() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCaractere() <= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCaractere() <= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCaractere() <= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorCaractere() <= ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCaractere() ).compareTo( rv.valorString() ) <= 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorCaractere() <= rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isBooleano() ) {
                        if ( rv.isInteiro() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) <= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) <= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) <= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) <= ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) <= 0;
                        } else if ( rv.isCor() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) <= rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isString() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorInteiro() ) ) <= 0;
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorDecimal() ) ) <= 0;
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorCaractere() ) ) <= 0;
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) <= 0;
                        } else if ( rv.isString() ) {
                            res = valor.valorString().compareTo( rv.valorString() ) <= 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) <= 0;
                        } else if ( rv.isArranjo() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) <= 0;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) <= 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCor() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCor().getRGB() <= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCor().getRGB() <= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCor().getRGB() <= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorCor().getRGB() <= ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCor() ).compareTo( rv.valorString() ) <= 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorCor().getRGB() <= rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isArranjo() ) {
                        if ( rv.isInteiro() ) {
                            res = false;
                        } else if ( rv.isDecimal() ) {
                            res = false;
                        } else if ( rv.isCaractere() ) {
                            res = false;
                        } else if ( rv.isBooleano() ) {
                            res = false;
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) <= 0;
                        } else if ( rv.isCor() ) {
                            res = false;
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isArranjoAssociativo() ) {
                        if ( rv.isInteiro() ) {
                            res = false;
                        } else if ( rv.isDecimal() ) {
                            res = false;
                        } else if ( rv.isCaractere() ) {
                            res = false;
                        } else if ( rv.isBooleano() ) {
                            res = false;
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) <= 0;
                        } else if ( rv.isCor() ) {
                            res = false;
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else {
                        res = false;
                    }
                    break;
                case AuroraLogoParser.MA:
                case AuroraLogoParser.MAT:
                case AuroraLogoParser.MAA:
                    if ( valor.isInteiro() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorInteiro() > rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorInteiro() > rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorInteiro() > rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorInteiro() > ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorInteiro() ).compareTo( rv.valorString() ) > 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorInteiro() > rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        }  else {
                            res = false;
                        }
                    } else if ( valor.isDecimal() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorDecimal() > rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorDecimal() > rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorDecimal() > rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorDecimal() > ( rv.valorBooleano() ? 1.0 : 0.0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorDecimal() ).compareTo( rv.valorString() ) > 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorDecimal() > rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCaractere() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCaractere() > rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCaractere() > rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCaractere() > rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorCaractere() > ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCaractere() ).compareTo( rv.valorString() ) > 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorCaractere() > rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isBooleano() ) {
                        if ( rv.isInteiro() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) > rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) > rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) > rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) > ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) > 0;
                        } else if ( rv.isCor() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) > rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isString() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorInteiro() ) ) > 0;
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorDecimal() ) ) > 0;
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorCaractere() ) ) > 0;
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) > 0;
                        } else if ( rv.isString() ) {
                            res = valor.valorString().compareTo( rv.valorString() ) > 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) > 0;
                        } else if ( rv.isArranjo() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) > 0;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) > 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCor() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCor().getRGB() > rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCor().getRGB() > rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCor().getRGB() > rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorCor().getRGB() > ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCor() ).compareTo( rv.valorString() ) > 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorCor().getRGB() > rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isArranjo() ) {
                        if ( rv.isInteiro() ) {
                            res = false;
                        } else if ( rv.isDecimal() ) {
                            res = false;
                        } else if ( rv.isCaractere() ) {
                            res = false;
                        } else if ( rv.isBooleano() ) {
                            res = false;
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) > 0;
                        } else if ( rv.isCor() ) {
                            res = false;
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isArranjoAssociativo() ) {
                        if ( rv.isInteiro() ) {
                            res = false;
                        } else if ( rv.isDecimal() ) {
                            res = false;
                        } else if ( rv.isCaractere() ) {
                            res = false;
                        } else if ( rv.isBooleano() ) {
                            res = false;
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) > 0;
                        } else if ( rv.isCor() ) {
                            res = false;
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else {
                        res = false;
                    }
                    break;
                case AuroraLogoParser.MAI:
                case AuroraLogoParser.MAIT:
                case AuroraLogoParser.MAIA:
                    if ( valor.isInteiro() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorInteiro() >= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorInteiro() >= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorInteiro() >= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorInteiro() >= ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorInteiro() ).compareTo( rv.valorString() ) >= 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorInteiro() >= rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isDecimal() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorDecimal() >= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorDecimal() >= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorDecimal() >= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorDecimal() >= ( rv.valorBooleano() ? 1.0 : 0.0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorDecimal() ).compareTo( rv.valorString() ) >= 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorDecimal() >= rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCaractere() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCaractere() >= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCaractere() >= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCaractere() >= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorCaractere() >= ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCaractere() ).compareTo( rv.valorString() ) >= 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorCaractere() >= rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isBooleano() ) {
                        if ( rv.isInteiro() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) >= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) >= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) >= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) >= ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) >= 0;
                        } else if ( rv.isCor() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) >= rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isString() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorInteiro() ) ) >= 0;
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorDecimal() ) ) >= 0;
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorCaractere() ) ) >= 0;
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) >= 0;
                        } else if ( rv.isString() ) {
                            res = valor.valorString().compareTo( rv.valorString() ) >= 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) >= 0;
                        } else if ( rv.isArranjo() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) >= 0;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) >= 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCor() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCor().getRGB() >= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCor().getRGB() >= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCor().getRGB() >= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorCor().getRGB() >= ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCor() ).compareTo( rv.valorString() ) >= 0;
                        } else if ( rv.isCor() ) {
                            res = valor.valorCor().getRGB() >= rv.valorCor().getRGB();
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isArranjo() ) {
                        if ( rv.isInteiro() ) {
                            res = false;
                        } else if ( rv.isDecimal() ) {
                            res = false;
                        } else if ( rv.isCaractere() ) {
                            res = false;
                        } else if ( rv.isBooleano() ) {
                            res = false;
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) >= 0;
                        } else if ( rv.isCor() ) {
                            res = false;
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isArranjoAssociativo() ) {
                        if ( rv.isInteiro() ) {
                            res = false;
                        } else if ( rv.isDecimal() ) {
                            res = false;
                        } else if ( rv.isCaractere() ) {
                            res = false;
                        } else if ( rv.isBooleano() ) {
                            res = false;
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) >= 0;
                        } else if ( rv.isCor() ) {
                            res = false;
                        } else if ( rv.isArranjo() ) {
                            res = false;
                        } else if ( rv.isArranjoAssociativo() ) {
                            res = false;
                        } else {
                            res = false;
                        }
                    } else {
                        res = false;
                    }
                    break;
            }

            return novoBooleano( res );

        }

        return valor;

    }
    
    public Valor visitExprSimp( AuroraLogoParser.ExprSimpContext ctx ) {

        Valor valor = ZERO_INTEIRO;
        Valor mult = UM_INTEIRO;
        int ini = 0;

        if ( ctx.opNeg != null && ctx.opNeg.getType() == AuroraLogoParser.SUB ) {
            mult = novoInteiro( -1 );
            ini = 1;
        }

        for ( int i = ini; i < ctx.getChildCount(); i += 2 ) {

            if ( i == ini ) {
                valor = visitor.visit( ctx.getChild( i ) );
            } else {

                int op = ( ( TerminalNode ) ctx.getChild( i - 1 ) ).getSymbol().getType();
                Valor tv = visitor.visit( ctx.getChild( i ) );

                switch ( op ) {
                    case AuroraLogoParser.ADI:
                    case AuroraLogoParser.ADIA:
                        if ( valor.isInteiro() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( valor.valorInteiro() + tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( valor.valorInteiro() + tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoInteiro( valor.valorInteiro() + tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoInteiro( valor.valorInteiro() + ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                valor = novaString( valor + tv.valorString() );
                            } else if ( tv.isCor() ) {
                                valor = novoInteiro( valor.valorInteiro() + tv.valorCor().getRGB() );
                            } else if ( tv.isArranjo() ) {
                                valor = novaString( valor + Utils.toString( tv ) );
                            } else if ( tv.isArranjoAssociativo() ) {
                                valor = novaString( valor + Utils.toString( tv ) );
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isDecimal() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoDecimal( valor.valorDecimal() + tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( valor.valorDecimal() + tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoDecimal( valor.valorDecimal() + tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoDecimal( valor.valorDecimal() + ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                valor = novaString( valor + tv.valorString() );
                            } else if ( tv.isCor() ) {
                                valor = novoDecimal( valor.valorDecimal() + tv.valorCor().getRGB() );
                            } else if ( tv.isArranjo() ) {
                                valor = novaString( valor.valorDecimal() + Utils.toString( tv ) );
                            } else if ( tv.isArranjoAssociativo() ) {
                                valor = novaString( valor.valorDecimal() + Utils.toString( tv ) );
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isCaractere() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCaractere() + tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( valor.valorCaractere() + tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoInteiro( valor.valorCaractere() + tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoInteiro( valor.valorCaractere() + ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                valor = novaString( valor.valorCaractere() + tv.valorString() );
                            } else if ( tv.isCor() ) {
                                valor = novoInteiro( valor.valorCaractere() + tv.valorCor().getRGB() );
                            } else if ( tv.isArranjo() ) {
                                valor = novaString( valor.valorCaractere() + Utils.toString( tv ) );
                            } else if ( tv.isArranjoAssociativo() ) {
                                valor = novaString( valor.valorCaractere() + Utils.toString( tv ) );
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isBooleano() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) + tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( ( valor.valorBooleano() ? 1 : 0 ) + tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) + tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) + ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                valor = novaString( valor + tv.valorString() );
                            } else if ( tv.isCor() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) + tv.valorCor().getRGB() );
                            } else if ( tv.isArranjo() ) {
                                valor = novaString( ( valor.valorBooleano() ? 1 : 0 ) + Utils.toString( tv ) );
                            } else if ( tv.isArranjoAssociativo() ) {
                                valor = novaString( ( valor.valorBooleano() ? 1 : 0 ) + Utils.toString( tv ) );
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isString() ) {
                            if ( tv.isInteiro() ) {
                                valor = novaString( valor.valorString() + tv );
                            } else if ( tv.isDecimal() ) {
                                valor = novaString( valor.valorString() + tv );
                            } else if ( tv.isCaractere() ) {
                                valor = novaString( valor.valorString() + tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novaString( valor.valorString() + tv );
                            } else if ( tv.isString() ) {
                                valor = novaString( valor.valorString() + tv.valorString() );
                            } else if ( tv.isCor() ) {
                                valor = novaString( valor.valorString() + tv );
                            } else if ( tv.isArranjo() ) {
                                valor = novaString( valor.valorString() + Utils.toString( tv ) );
                            } else if ( tv.isArranjoAssociativo() ) {
                                valor = novaString( valor.valorString() + Utils.toString( tv ) );
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isCor() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCor().getRGB() + tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( valor.valorCor().getRGB() + tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoInteiro( valor.valorCor().getRGB() + tv.valorCaractere()  );
                            } else if ( tv.isBooleano() ) {
                                valor = novoInteiro( valor.valorCor().getRGB() + ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                valor = novaString( valor + tv.valorString() );
                            } else if ( tv.isCor() ) {
                                valor = novaCor( Utils.gerarComponenteGradienteAlpha( valor.valorCor(), tv.valorCor(), 0.5 ) );
                            } else if ( tv.isArranjo() ) {
                                valor = novaString( valor + Utils.toString( tv ) );
                            } else if ( tv.isArranjoAssociativo() ) {
                                valor = novaString( valor + Utils.toString( tv ) );
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isArranjo() ) {
                            if ( tv.isInteiro() ) {
                                valor = novaString( Utils.toString( valor ) + tv );
                            } else if ( tv.isDecimal() ) {
                                valor = novaString( Utils.toString( valor ) + tv );
                            } else if ( tv.isCaractere() ) {
                                valor = novaString( Utils.toString( valor ) + tv );
                            } else if ( tv.isBooleano() ) {
                                valor = novaString( Utils.toString( valor ) + tv );
                            } else if ( tv.isString() ) {
                                valor = novaString( Utils.toString( valor ) + tv );
                            } else if ( tv.isCor() ) {
                                valor = novaString( Utils.toString( valor ) + tv );
                            } else if ( tv.isArranjo() ) {
                                valor = novaString( Utils.toString( valor ) + Utils.toString( tv ) );
                            } else if ( tv.isArranjoAssociativo() ) {
                                valor = novaString( Utils.toString( valor ) + Utils.toString( tv ) );
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isArranjoAssociativo() ) {
                            if ( tv.isInteiro() ) {
                                valor = novaString( Utils.toString( valor ) + tv );
                            } else if ( tv.isDecimal() ) {
                                valor = novaString( Utils.toString( valor ) + tv );
                            } else if ( tv.isCaractere() ) {
                                valor = novaString( Utils.toString( valor ) + tv );
                            } else if ( tv.isBooleano() ) {
                                valor = novaString( Utils.toString( valor ) + tv );
                            } else if ( tv.isString() ) {
                                valor = novaString( Utils.toString( valor ) + tv );
                            } else if ( tv.isCor() ) {
                                valor = novaString( Utils.toString( valor ) + tv );
                            } else if ( tv.isArranjo() ) {
                                valor = novaString( Utils.toString( valor ) + Utils.toString( tv ) );
                            } else if ( tv.isArranjoAssociativo() ) {
                                valor = novaString( Utils.toString( valor ) + Utils.toString( tv ) );
                            } else {
                                // valor é o próprio
                            }
                        }
                        break;
                    case AuroraLogoParser.SUB:
                    case AuroraLogoParser.SUBA:
                        if ( valor.isInteiro() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( valor.valorInteiro() - tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( valor.valorInteiro() - tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoInteiro( valor.valorInteiro() - tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoInteiro( valor.valorInteiro() - ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                // ignora strings
                            } else if ( tv.isCor() ) {
                                valor = novoInteiro( valor.valorInteiro() - tv.valorCor().getRGB() );
                            } else if ( tv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( tv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isDecimal() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoDecimal( valor.valorDecimal() - tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( valor.valorDecimal() - tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoDecimal( valor.valorDecimal() - tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoDecimal( valor.valorDecimal() - ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                // ignora strings
                            } else if ( tv.isCor() ) {
                                valor = novoDecimal( valor.valorDecimal() - tv.valorCor().getRGB() );
                            } else if ( tv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( tv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isCaractere() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCaractere() - tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( valor.valorCaractere() - tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoInteiro( valor.valorCaractere() - tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoInteiro( valor.valorCaractere() - ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                // ignora strings
                            } else if ( tv.isCor() ) {
                                valor = novoInteiro( valor.valorCaractere() - tv.valorCor().getRGB() );
                            } else if ( tv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( tv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isBooleano() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) - tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( ( valor.valorBooleano() ? 1 : 0 ) - tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) - tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) - ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                // ignora strings
                            } else if ( tv.isCor() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) - tv.valorCor().getRGB() );
                            } else if ( tv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( tv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isString() ) {  // ignora strings
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoCaractere( tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoBooleano( tv.valorBooleano() );
                            } else if ( tv.isString() ) {
                                // ignora strings
                            } else if ( tv.isCor() ) {
                                // valor é o prório
                            } else if ( tv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( tv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isCor() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCor().getRGB() - tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( valor.valorCor().getRGB() - tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoInteiro( valor.valorCor().getRGB() - tv.valorCaractere()  );
                            } else if ( tv.isBooleano() ) {
                                valor = novoInteiro( valor.valorCor().getRGB() - ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                // valor é o próprio
                            } else if ( tv.isCor() ) {
                                valor = novaCor( Utils.subtrairCores( valor.valorCor(), tv.valorCor() ) );
                            } else if ( tv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( tv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isArranjo() ) {
                            // valor é o próprio
                        } else if ( valor.isArranjoAssociativo() ) {
                            // valor é o próprio
                        }
                        break;
                }
            }

        }

        if ( valor.isInteiro() ) {
            return novoInteiro( mult.valorInteiro() * valor.valorInteiro() );
        } else if ( valor.isDecimal() ) {
            return novoDecimal( mult.valorInteiro() * valor.valorDecimal() );
        } else {
            return valor;
        }

    }
    
    public Valor visitTermo( AuroraLogoParser.TermoContext ctx ) {

        Valor valor = ZERO_INTEIRO;

        for ( int i = 0; i < ctx.getChildCount(); i += 2 ) {

            if ( i == 0 ) {
                valor = visitor.visit( ctx.getChild( i ) );
            } else {

                int op = ( ( TerminalNode ) ctx.getChild( i - 1 ) ).getSymbol().getType();
                Valor fv = visitor.visit( ctx.getChild( i ) );

                switch ( op ) {
                    case AuroraLogoParser.MUL:
                    case AuroraLogoParser.VEZ:
                        if ( valor.isInteiro() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorInteiro() * fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorInteiro() * fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( valor.valorInteiro() * fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( valor.valorInteiro() * ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                valor = novoInteiro( valor.valorInteiro() * fv.valorCor().getRGB() );
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isDecimal() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoDecimal( valor.valorDecimal() * fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorDecimal() * fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoDecimal( valor.valorDecimal() * fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoDecimal( valor.valorDecimal() * ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                valor = novoDecimal( valor.valorDecimal() * fv.valorCor().getRGB() );
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isCaractere() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCaractere() * fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorCaractere() * fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( valor.valorCaractere() * fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( valor.valorCaractere() * ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                valor = novoInteiro( valor.valorCaractere() * fv.valorCor().getRGB() );
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isBooleano() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) * fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( ( valor.valorBooleano() ? 1 : 0 ) * fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) * fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) * ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) * fv.valorCor().getRGB() );
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isString() ) {  // ignora strings
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoCaractere( fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoBooleano( fv.valorBooleano() );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                // valor é o prório
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isCor() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCor().getRGB() * fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorCor().getRGB() * fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( valor.valorCor().getRGB() * fv.valorCaractere()  );
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( valor.valorCor().getRGB() * ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // valor é o próprio
                            } else if ( fv.isCor() ) {
                                valor = novaCor( Utils.multiplicarCores( valor.valorCor(), fv.valorCor() ) );
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isArranjo() ) {
                            // valor é o próprio
                        } else if ( valor.isArranjoAssociativo() ) {
                            // valor é o próprio
                        }
                        break;
                    case AuroraLogoParser.DIV:
                    case AuroraLogoParser.DIVA:
                        if ( valor.isInteiro() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorInteiro() / ( fv.valorInteiro() == 0 ? 1 : fv.valorInteiro() ) );            // possível divisão por zero
                            } else if ( fv.isDecimal() ) {      
                                valor = novoDecimal( valor.valorInteiro() / fv.valorDecimal() );                                             // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {      
                                valor = novoInteiro( valor.valorInteiro() / ( fv.valorCaractere() == 0 ? 1 : fv.valorCaractere() ) );        // possível divisão por zero
                            } else if ( fv.isBooleano() ) {      
                                valor = novoInteiro( valor.valorInteiro() );                                                                 // possível divisão por zero
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                valor = novoInteiro( valor.valorInteiro() / ( fv.valorCor().getRGB() == 0 ? 1 : fv.valorCor().getRGB() ) );  // possível divisão por zero
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            } 
                        } else if ( valor.isDecimal() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoDecimal( valor.valorDecimal() / fv.valorInteiro() );                                             // divisão por zero "permitida"
                            } else if ( fv.isDecimal() ) {                              
                                valor = novoDecimal( valor.valorDecimal() / fv.valorDecimal() );                                             // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {                              
                                valor = novoDecimal( valor.valorDecimal() / fv.valorCaractere() );                                           // divisão por zero "permitida"
                            } else if ( fv.isBooleano() ) {                              
                                valor = novoDecimal( valor.valorDecimal() / ( fv.valorBooleano() ? 1 : 0 ) );                                // divisão por zero "permitida"
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                valor = novoDecimal( valor.valorDecimal() / ( fv.valorCor().getRGB() == 0 ? 1 : fv.valorCor().getRGB() ) );  // possível divisão por zero
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isCaractere() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCaractere() / ( fv.valorInteiro() == 0 ? 1 : fv.valorInteiro() ) );            // possível divisão por zero
                            } else if ( fv.isDecimal() ) {      
                                valor = novoDecimal( valor.valorCaractere() / fv.valorDecimal() );                                             // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {      
                                valor = novoInteiro( valor.valorCaractere() / ( fv.valorCaractere() == 0 ? 1 : fv.valorCaractere() ) );        // possível divisão por zero
                            } else if ( fv.isBooleano() ) {    
                                valor = novoInteiro( ( int ) valor.valorCaractere() );                                                         // possível divisão por zero
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                valor = novoInteiro( valor.valorCaractere() / ( fv.valorCor().getRGB() == 0 ? 1 : fv.valorCor().getRGB() ) );  // possível divisão por zero
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isBooleano() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) / ( fv.valorInteiro() == 0 ? 1 : fv.valorInteiro() ) );            // possível divisão por zero
                            } else if ( fv.isDecimal() ) {      
                                valor = novoDecimal( ( valor.valorBooleano() ? 1 : 0 ) / fv.valorDecimal() );                                             // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {      
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) / ( fv.valorCaractere() == 0 ? 1 : fv.valorCaractere() ) );        // possível divisão por zero
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) );                                                                 // possível divisão por zero
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) / ( fv.valorCor().getRGB() == 0 ? 1 : fv.valorCor().getRGB() ) );  // possível divisão por zero
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isString() ) {  // ignora strings
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoCaractere( fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoBooleano( fv.valorBooleano() );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                // valor é o prório
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isCor() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCor().getRGB() / ( fv.valorInteiro() == 0 ? 1 : fv.valorInteiro() ) );      // possível divisão por zero
                            } else if ( fv.isDecimal() ) { 
                                valor = novoDecimal( valor.valorCor().getRGB() / fv.valorDecimal() );                                       // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) { 
                                valor = novoInteiro( valor.valorCor().getRGB() / ( fv.valorCaractere() == 0 ? 1 : fv.valorCaractere() ) );  // possível divisão por zero
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( valor.valorCor().getRGB() / ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // valor é o próprio
                            } else if ( fv.isCor() ) {
                                valor = novaCor( Utils.dividirCores( valor.valorCor(), fv.valorCor() ) );
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isArranjo() ) {
                            // valor é o próprio
                        } else if ( valor.isArranjoAssociativo() ) {
                            // valor é o próprio
                        }
                        break;
                    case AuroraLogoParser.MOD:
                    case AuroraLogoParser.MODA:
                        if ( valor.isInteiro() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorInteiro() % ( fv.valorInteiro() == 0 ? 1 : fv.valorInteiro() ) );            // possível divisão por zero
                            } else if ( fv.isDecimal() ) {      
                                valor = novoDecimal( valor.valorInteiro() % fv.valorDecimal() );                                             // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {      
                                valor = novoInteiro( valor.valorInteiro() % ( fv.valorCaractere() == 0 ? 1 : fv.valorCaractere() ) );        // possível divisão por zero
                            } else if ( fv.isBooleano() ) {      
                                valor = novoInteiro( valor.valorInteiro() );                                                                 // possível divisão por zero
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                valor = novoInteiro( valor.valorInteiro() % ( fv.valorCor().getRGB() == 0 ? 1 : fv.valorCor().getRGB() ) );  // possível divisão por zero
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            } 
                        } else if ( valor.isDecimal() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoDecimal( valor.valorDecimal() % fv.valorInteiro() );                                             // divisão por zero "permitida"
                            } else if ( fv.isDecimal() ) {                              
                                valor = novoDecimal( valor.valorDecimal() % fv.valorDecimal() );                                             // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {                              
                                valor = novoDecimal( valor.valorDecimal() % fv.valorCaractere() );                                           // divisão por zero "permitida"
                            } else if ( fv.isBooleano() ) {                              
                                valor = novoDecimal( valor.valorDecimal() % ( fv.valorBooleano() ? 1 : 0 ) );                                // divisão por zero "permitida"
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                valor = novoDecimal( valor.valorDecimal() % ( fv.valorCor().getRGB() == 0 ? 1 : fv.valorCor().getRGB() ) );  // possível divisão por zero
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isCaractere() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCaractere() % ( fv.valorInteiro() == 0 ? 1 : fv.valorInteiro() ) );            // possível divisão por zero
                            } else if ( fv.isDecimal() ) {      
                                valor = novoDecimal( valor.valorCaractere() % fv.valorDecimal() );                                             // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {      
                                valor = novoInteiro( valor.valorCaractere() % ( fv.valorCaractere() == 0 ? 1 : fv.valorCaractere() ) );        // possível divisão por zero
                            } else if ( fv.isBooleano() ) {    
                                valor = novoInteiro( ( int ) valor.valorCaractere() );                                                         // possível divisão por zero
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                valor = novoInteiro( valor.valorCaractere() % ( fv.valorCor().getRGB() == 0 ? 1 : fv.valorCor().getRGB() ) );  // possível divisão por zero
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isBooleano() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) % ( fv.valorInteiro() == 0 ? 1 : fv.valorInteiro() ) );            // possível divisão por zero
                            } else if ( fv.isDecimal() ) {      
                                valor = novoDecimal( ( valor.valorBooleano() ? 1 : 0 ) % fv.valorDecimal() );                                             // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {      
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) % ( fv.valorCaractere() == 0 ? 1 : fv.valorCaractere() ) );        // possível divisão por zero
                            } else if ( fv.isBooleano() ) {      
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) );                                                                 // possível divisão por zero
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) % ( fv.valorCor().getRGB() == 0 ? 1 : fv.valorCor().getRGB() ) );  // possível divisão por zero
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            } 
                        } else if ( valor.isString() ) {  // ignora strings
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoCaractere( fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoBooleano( fv.valorBooleano() );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else if ( fv.isCor() ) {
                                // valor é o prório
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isCor() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCor().getRGB() / ( fv.valorInteiro() == 0 ? 1 : fv.valorInteiro() ) );      // possível divisão por zero
                            } else if ( fv.isDecimal() ) { 
                                valor = novoDecimal( valor.valorCor().getRGB() / fv.valorDecimal() );                                       // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) { 
                                valor = novoInteiro( valor.valorCor().getRGB() / ( fv.valorCaractere() == 0 ? 1 : fv.valorCaractere() ) );  // possível divisão por zero
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( valor.valorCor().getRGB() / ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // valor é o próprio
                            } else if ( fv.isCor() ) {
                                valor = novaCor( Utils.restoCores( valor.valorCor(), fv.valorCor() ) );
                            } else if ( fv.isArranjo() ) {
                                // valor é o próprio
                            } else if ( fv.isArranjoAssociativo() ) {
                                // valor é o próprio
                            } else {
                                // valor é o próprio
                            }
                        } else if ( valor.isArranjo() ) {
                            // valor é o próprio
                        } else if ( valor.isArranjoAssociativo() ) {
                            // valor é o próprio
                        }
                        break;

                }

            }

        }

        return valor;

    }

}
