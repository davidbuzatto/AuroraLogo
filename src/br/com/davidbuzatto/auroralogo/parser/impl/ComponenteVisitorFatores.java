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
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser.ExprContext;
import static br.com.davidbuzatto.auroralogo.parser.impl.Valor.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/**
 * Implementação dos métodos de visita para tratamento dos fatores.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ComponenteVisitorFatores {
    
    private Tartaruga tartaruga;
    private AuroraLogoDesenhistaVisitor visitor;
    
    public ComponenteVisitorFatores( 
            Tartaruga tartaruga, 
            AuroraLogoDesenhistaVisitor visitor ) {
        this.tartaruga = tartaruga;
        this.visitor = visitor;
    }
    
    public Valor visitFatorNao( AuroraLogoParser.FatorNaoContext ctx ) {
        
        Valor valor = visitor.visit( ctx.fator() );
            
        if ( ctx.NAO() != null || ctx.NAOT() != null ) {
            if ( valor.isFalso() ) {
                return VERDADEIRO;
            } else {
                return FALSO;
            }
        }
        
        // nunca deve chegar aqui!
        return valor;
        
    }
    
    public Valor visitFatorInt( AuroraLogoParser.FatorIntContext ctx ) {
        return novoInteiro( ctx.INT().getText() );
    }
    
    public Valor visitFatorDec( AuroraLogoParser.FatorDecContext ctx ) {
        return novoDecimal( ctx.DEC().getText() );
    }
    
    public Valor visitFatorPi( AuroraLogoParser.FatorPiContext ctx ) {
        return PI_DECIMAL;
    }
    
    public Valor visitFatorId( AuroraLogoParser.FatorIdContext ctx ) {
        
        if ( ctx.fatorBool() != null ) {
            return visitor.visit( ctx.fatorBool() );
        }
        
        String id = ctx.ID().getText();
        Valor v = tartaruga.lerMemoria( id );
        
        if ( v.isArranjo() ) {
            
            List<Integer> indices = new ArrayList<>();
            
            for ( ExprContext e : ctx.expr() ) {
                Valor vIndice = visitor.visit( e );
                indices.add( vIndice.valorInteiro() );
            }
            
            Integer[] aInd = indices.toArray( Integer[]::new );
            Object valorP = v.valorArranjo( aInd );
            
            if ( ctx.COMP() != null ) {
                if ( valorP instanceof Object[] ) {
                    v = novoInteiro( ( (Object[]) valorP ).length );
                } else {
                    v = ZERO_INTEIRO;
                }
            } else {
                v = novoValor( valorP );
            }
            
        } else if ( v.isArranjoAssociativo() ) {
            
            ExprContext e = ctx.expr( 0 );
            
            if ( e != null ) {
                
                String chave = visitor.visit( e ).valorString();
                Object valorP = v.valorArranjoAssociativo( chave );
                
                if ( ctx.COMP() != null ) {
                    
                    if ( valorP instanceof Valor ) {
                        Valor vo = (Valor) valorP;
                        if ( vo.isArranjo() ) {
                            v = novoInteiro( ( (Object[]) vo.getValor() ).length );
                        } else {
                            v = ZERO_INTEIRO;
                        }
                    } else {
                        v = ZERO_INTEIRO;
                    }
                    
                } else if ( ctx.CHAV() != null ) {
                    
                    
                    
                }else {
                    v = novoValor( valorP );
                }
                
            } else {
                
                if ( ctx.COMP() != null ) {
                    v = novoInteiro( ( (LinkedHashMap<String, Object>) v.getValor() ).keySet().size() );
                } else if ( ctx.CHAV() != null ) {
                    
                    /*List<String> chaves = new ArrayList<>();
                    
                    for ( String chave : ( (LinkedHashMap<String, Object>) v.getValor() ).keySet() ) {
                        chaves.add( chave );
                    }
                    
                    v = novoArranjo( chaves.toArray( String[]::new ) );*/
                    
                    Set<String> keySet = ( (LinkedHashMap<String, Object>) v.getValor() ).keySet();
                    Valor[] chaves = new Valor[keySet.size()];
                    
                    int i = 0;
                    for ( String chave : keySet ) {
                        chaves[i++] = novaString( chave );
                    }
                    
                    v = novoArranjo( chaves );
                    
                }
                
            }
            
        } else {
            if ( ctx.COMP() != null ) {
                v = ZERO_INTEIRO;
            } else if ( ctx.CHAV() != null ) {
                v = ZERO_INTEIRO;
            }
        }
        
        return v;
        
    }
    
    public Valor visitFatorBool( AuroraLogoParser.FatorBoolContext ctx ) {
        if ( ctx.VER() != null ) {
            return VERDADEIRO;
        }
        return FALSO;
    }
    
    public Valor visitFatorChar( AuroraLogoParser.FatorCharContext ctx ) {
        return novoCaractere( ctx.getText().substring( 1, ctx.getText().length() - 1 ).charAt( 0 ) );
    }
    
    public Valor visitFatorString( AuroraLogoParser.FatorStringContext ctx ) {
        return novaString( ctx.getText().substring( 1, ctx.getText().length() - 1 ) );
    }
    
    public Valor visitFatorCor( AuroraLogoParser.FatorCorContext ctx ) {
        
        String strCor = ctx.cor().CHEX().getText();
        Color cor = Color.decode( strCor.substring( 0, 7 ) );
            
        if ( strCor.length() == 9 ) {
            String alpha = strCor.substring( 7 );
            cor = new Color( cor.getRed(), cor.getGreen(), cor.getBlue(), Integer.valueOf( alpha, 16 ) );
        }
        
        return novaCor( cor );
        
    }
    
    public Valor visitFatorParenteses( AuroraLogoParser.FatorParentesesContext ctx ) {
        return visitor.visit( ctx.expr() );
    }
    
}
