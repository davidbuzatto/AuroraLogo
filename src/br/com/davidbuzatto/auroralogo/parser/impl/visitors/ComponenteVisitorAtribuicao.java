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
package br.com.davidbuzatto.auroralogo.parser.impl.visitors;

import br.com.davidbuzatto.auroralogo.gui.tartaruga.Tartaruga;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import br.com.davidbuzatto.auroralogo.parser.impl.AuroraLogoDesenhistaVisitor;
import br.com.davidbuzatto.auroralogo.parser.impl.Valor;
import static br.com.davidbuzatto.auroralogo.parser.impl.Valor.*;
import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Implementação dos métodos de visita para as instruções de atribuição.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
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
        
        String id = Utils.gerarId( visitor.visit( ctx.processaId() ).valorIdentificador() );
        Valor valor = null;
        
        if ( ctx.expr() != null ) {
            valor = visitor.visit( ctx.expr() );
        } else if ( ctx.criarArranjos() != null ) {
            valor = visitor.visit( ctx.criarArranjos() );
        }
        
        tartaruga.inserirOuAtualizarMemoria( id, valor );
        
        return valor;
        
    }
    
    public Valor visitAtribuirArranjo( AuroraLogoParser.AtribuirArranjoContext ctx ) {
        
        String id = Utils.gerarId( visitor.visit( ctx.processaId() ).valorIdentificador() );
        Valor valor = null;
        
        if ( ctx.expr() != null ) {
            valor = visitor.visit( ctx.expr() );
        } else if ( ctx.criarArranjos() != null ) {
            valor = visitor.visit( ctx.criarArranjos() );
        }
        
        List<Integer> indices = new ArrayList<>();

        for ( AuroraLogoParser.ExprIndiceContext e : ctx.exprIndice() ) {
            Valor vIndice = visitor.visit( e );
            indices.add( vIndice.valorInteiro() );
        }

        Integer[] ind = indices.toArray( Integer[]::new );

        Valor vMemoria = tartaruga.lerMemoria( id );
        if ( vMemoria == null ) {
            vMemoria = novoArranjo( 0 );
        }

        if ( vMemoria.isArranjo() ) {
            
            vMemoria = novoValor( Utils.cloneArrayObject( (Object[]) vMemoria.getValor() ) );
            vMemoria.setValorArranjo( valor, ind );
            tartaruga.inserirOuAtualizarMemoria( id, vMemoria );

            return vMemoria;

        } else if ( vMemoria.isArranjoAssociativo() ) {

            String chave = visitor.visit( ctx.exprIndice( 0 ) ).valorString();
            
            vMemoria = novoValor( Utils.cloneLinkedHashMapObject( (LinkedHashMap) vMemoria.getValor() ) );
            vMemoria.setValorArranjoAssociativo( chave, valor );
            tartaruga.inserirOuAtualizarMemoria( id, vMemoria );

            return vMemoria;

        } else {
            return valor;
        }
        
    }

    public Valor visitAtribuirArranjoAssociativo( AuroraLogoParser.AtribuirArranjoAssociativoContext ctx ) {
        
        String id = Utils.gerarId( visitor.visit( ctx.processaId() ).valorIdentificador() );
        Valor valor = null;
        
        if ( ctx.expr() != null ) {
            valor = visitor.visit( ctx.expr() );
        } else if ( ctx.criarArranjos() != null ) {
            valor = visitor.visit( ctx.criarArranjos() );
        }

        Valor vMemoria = tartaruga.lerMemoria( id );
        if ( vMemoria == null ) {
            vMemoria = novoArranjoAssociativo();
        }

        if ( vMemoria.isArranjo() ) {
            
            vMemoria = novoValor( Utils.cloneArrayObject( (Object[]) vMemoria.getValor() ) );
            vMemoria.setValorArranjo( valor, 0 );
            tartaruga.inserirOuAtualizarMemoria( id, vMemoria );

            return vMemoria;

        } else if ( vMemoria.isArranjoAssociativo() ) {
            
            String chave = visitor.visit( ctx.exprIndice() ).valorString();
            
            vMemoria = novoValor( Utils.cloneLinkedHashMapObject( (LinkedHashMap) vMemoria.getValor() ) );
            vMemoria.setValorArranjoAssociativo( chave, valor );
            tartaruga.inserirOuAtualizarMemoria( id, vMemoria );

            return vMemoria;

        } else {
            return valor;
        }
        
    }
    
    public Valor visitAtribuirAdicao( AuroraLogoParser.AtribuirAdicaoContext ctx ) {
        
        String id = Utils.gerarId( visitor.visit( ctx.processaId() ).valorIdentificador() );
        Valor valor = visitor.visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( vMemoria.isString() ) {
            vMemoria = vMemoria.concatenar( valor );
            tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
        } else if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria = vMemoria.somar( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN = vN.somar( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN = vN.somar( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        }
        
        return vMemoria;
        
    }
    
    public Valor visitAtribuirSubtracao( AuroraLogoParser.AtribuirSubtracaoContext ctx ) {
        
        String id = Utils.gerarId( visitor.visit( ctx.processaId() ).valorIdentificador() );
        Valor valor = visitor.visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria = vMemoria.subtrair( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN = vN.subtrair( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN = vN.subtrair( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        }
        
        return vMemoria;
        
    }
    
    public Valor visitAtribuirMultiplicacao( AuroraLogoParser.AtribuirMultiplicacaoContext ctx ) {
        
        String id = Utils.gerarId( visitor.visit( ctx.processaId() ).valorIdentificador() );
        Valor valor = visitor.visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria = vMemoria.multiplicar( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN = vN.multiplicar( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN = vN.multiplicar( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        }
        
        return vMemoria;
        
    }
    
    public Valor visitAtribuirDivisao( AuroraLogoParser.AtribuirDivisaoContext ctx ) {
        
        String id = Utils.gerarId( visitor.visit( ctx.processaId() ).valorIdentificador() );
        Valor valor = visitor.visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria = vMemoria.dividir( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN = vN.dividir( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN = vN.dividir( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        }
        
        return vMemoria;
        
    }
    
    public Valor visitAtribuirResto( AuroraLogoParser.AtribuirRestoContext ctx ) {
        
        String id = Utils.gerarId( visitor.visit( ctx.processaId() ).valorIdentificador() );
        Valor valor = visitor.visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria = vMemoria.resto( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN = vN.resto( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN = vN.resto( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        }
        
        return vMemoria;
        
    }
    
}
