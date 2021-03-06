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
import static br.com.davidbuzatto.auroralogo.parser.impl.ValorUtils.*;
import br.com.davidbuzatto.auroralogo.utils.Utils;
import static br.com.davidbuzatto.auroralogo.utils.Utils.mapeamentoModular;
import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.antlr.v4.runtime.tree.TerminalNode;

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
                return novoVerdadeiro();
            } else {
                return novoFalso();
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
        return novoDecimal( Math.PI );
    }
    
    public Valor visitFatorId( AuroraLogoParser.FatorIdContext ctx ) {
        
        String id = Utils.gerarId( visitor.visit( ctx.processaId() ).valorDoIdentificador() );
        Valor v = tartaruga.lerMemoria( id );
        
        if ( v.isString() ) {
            if ( ctx.COMP() != null ) {
                v = novoInteiro( v.valorString().length() );
            } else if ( ctx.TIPO() != null ) {
                v = novaString( v.getTipo() );
            }
        } else if ( v.isArranjo() ) {
            
            if ( ctx.COMP() != null ) {
                v = novoInteiro( ( (Object[]) v.getValor() ).length );
            } else if ( ctx.CHAV() != null ) {
                v = novoZeroInteiro();
            } else if ( ctx.TIPO() != null ) {
                v = novaString( v.getTipo() );
            }
            
        } else if ( v.isArranjoAssociativo() ) {
            
            if ( ctx.COMP() != null ) {
                v = novoInteiro( ( (LinkedHashMap<String, Object>) v.getValor() ).keySet().size() );
            } else if ( ctx.CHAV() != null ) {
                
                Set<String> keySet = ( (LinkedHashMap<String, Object>) v.getValor() ).keySet();
                Valor[] chaves = new Valor[keySet.size()];
                
                int i = 0;
                for ( String chave : keySet ) {
                    chaves[i++] = novaString( chave );
                }

                v = novoArranjo( chaves );
                
            } else if ( ctx.TIPO() != null ) {
                v = novaString( v.getTipo() );
            }
            
        } else {
            if ( ctx.COMP() != null ) {
                v = novoZeroInteiro();
            } else if ( ctx.CHAV() != null ) {
                v = novoZeroInteiro();
            } else if ( ctx.TIPO() != null ) {
                v = novaString( v.getTipo() );
            }
        }
        
        return v;
        
    }
    
    public Valor visitFatorIdArranjo( AuroraLogoParser.FatorIdArranjoContext ctx ) {
        
        String id = Utils.gerarId( visitor.visit( ctx.processaId() ).valorDoIdentificador() );
        Valor v = tartaruga.lerMemoria( id );
        
        if ( v.isString() ) {
            if ( ctx.COMP() != null ) {
                v = novoInteiro( v.valorString().length() );
            } else if ( ctx.TIPO() != null ) {
                v = novaString( v.getTipo() );
            }
        } else if ( v.isArranjo() ) {
            
            List<Integer> indices = new ArrayList<>();
            
            for ( AuroraLogoParser.ExprContext e : ctx.expr() ) {
                Valor vIndice = visitor.visit( e );
                indices.add( vIndice.valorInteiro() );
            }
            
            Integer[] aInd = indices.toArray( Integer[]::new );
            Object valorP = v.valorDoArranjo( aInd );
            
            if ( ctx.COMP() != null ) {
                if ( valorP instanceof Object[] ) {
                    v = novoInteiro( ( (Object[]) valorP ).length );
                } else {
                    v = novoZeroInteiro();
                }
            } else if ( ctx.CHAV() != null ) {
                if ( valorP instanceof LinkedHashMap ) {
                    
                    Set<String> keySet = ( (LinkedHashMap<String, Object>) valorP ).keySet();
                    Valor[] chaves = new Valor[keySet.size()];
                    
                    int i = 0;
                    for ( String chave : keySet ) {
                        chaves[i++] = novaString( chave );
                    }
                    
                    v = novoArranjo( chaves );
                    
                } else {
                    v = novoZeroInteiro();
                }
            } else if ( ctx.TIPO() != null ) {
                v = novaString( novoValor( valorP ).getTipo() );
            } else {
                v = novoValor( valorP );
            }
            
        } else if ( v.isArranjoAssociativo() ) {
            
            if ( !ctx.expr().isEmpty() ) {
                
                // somente a primeira dimensão
                String chave = visitor.visit( ctx.expr( 0 ) ).valorString();
                Object valorP = v.valorDoArranjoAssociativo( chave );
                
                if ( ctx.COMP() != null ) {
                    
                    if ( valorP instanceof Valor ) {
                        Valor vo = (Valor) valorP;
                        if ( vo.isArranjo() ) {
                            v = novoInteiro( ( (Object[]) vo.getValor() ).length );
                        } else if ( vo.isArranjoAssociativo() ) {
                            v = novoInteiro( ( (LinkedHashMap<String, Object>) vo.getValor() ).keySet().size() );
                        } else {
                            v = novoZeroInteiro();
                        }
                    } else {
                        v = novoZeroInteiro();
                    }
                    
                } else if ( ctx.CHAV() != null ) {
                    
                    if ( valorP instanceof Valor ) {
                        Valor vo = (Valor) valorP;
                        if ( vo.isArranjo() ) {
                            v = novoZeroInteiro();
                        } else if ( vo.isArranjoAssociativo() ) {
                            
                            Set<String> keySet = ( (LinkedHashMap<String, Object>) vo.getValor() ).keySet();
                            Valor[] chaves = new Valor[keySet.size()];

                            int i = 0;
                            for ( String c : keySet ) {
                                chaves[i++] = novaString( c );
                            }

                            v = novoArranjo( chaves );
                            
                        } else {
                            v = novoZeroInteiro();
                        }
                    } else {
                        v = novoZeroInteiro();
                    }
                    
                } else if ( ctx.TIPO() != null ) {
                    v = novaString( novoValor( valorP ).getTipo() );
                } else {
                    v = novoValor( valorP );
                }
                
            }
            
        } else {
            v = novoZeroInteiro();
        }
        
        return v;
        
    }
    
    public Valor visitFatorIdArranjoAssociativo( AuroraLogoParser.FatorIdArranjoAssociativoContext ctx ) {
        
        String id = Utils.gerarId( visitor.visit( ctx.processaId() ).valorDoIdentificador() );
        Valor v = tartaruga.lerMemoria( id );
        
        if ( v.isString() ) {
            if ( ctx.COMP() != null ) {
                v = novoInteiro( v.valorString().length() );
            } else if ( ctx.TIPO() != null ) {
                v = novaString( v.getTipo() );
            }
        } else if ( v.isArranjoAssociativo() ) {
            
            if ( ctx.expr() != null ) {
                
                String chave = visitor.visit( ctx.expr() ).valorString();
                Object valorP = v.valorDoArranjoAssociativo( chave );
                
                if ( ctx.COMP() != null ) {
                    
                    if ( valorP instanceof Valor ) {
                        Valor vo = (Valor) valorP;
                        if ( vo.isArranjo() ) {
                            v = novoInteiro( ( (Object[]) vo.getValor() ).length );
                        } else if ( vo.isArranjoAssociativo() ) {
                            v = novoInteiro( ( (LinkedHashMap<String, Object>) vo.getValor() ).keySet().size() );
                        } else {
                            v = novoZeroInteiro();
                        }
                    } else {
                        v = novoZeroInteiro();
                    }
                    
                } else if ( ctx.CHAV() != null ) {
                    
                    if ( valorP instanceof Valor ) {
                        Valor vo = (Valor) valorP;
                        if ( vo.isArranjo() ) {
                            v = novoZeroInteiro();
                        } else if ( vo.isArranjoAssociativo() ) {
                            
                            Set<String> keySet = ( (LinkedHashMap<String, Object>) vo.getValor() ).keySet();
                            Valor[] chaves = new Valor[keySet.size()];

                            int i = 0;
                            for ( String c : keySet ) {
                                chaves[i++] = novaString( c );
                            }

                            v = novoArranjo( chaves );
                            
                        } else {
                            v = novoZeroInteiro();
                        }
                    } else {
                        v = novoZeroInteiro();
                    }
                    
                } else if ( ctx.TIPO() != null ) {
                    v = novaString( novoValor( valorP ).getTipo().toString() );
                } else {
                    v = novoValor( valorP );
                }
                
            } else {
                
                if ( ctx.COMP() != null ) {
                    v = novoInteiro( ( (LinkedHashMap<String, Object>) v.getValor() ).keySet().size() );
                } else if ( ctx.CHAV() != null ) {
                    
                    Set<String> keySet = ( (LinkedHashMap<String, Object>) v.getValor() ).keySet();
                    Valor[] chaves = new Valor[keySet.size()];
                    
                    int i = 0;
                    for ( String chave : keySet ) {
                        chaves[i++] = novaString( chave );
                    }
                    
                    v = novoArranjo( chaves );
                    
                } else if ( ctx.TIPO() != null ) {
                    v = novaString( v.getTipo().toString() );
                }
                
            }
            
        } else {
            v = novoZeroInteiro();
        }
        
        return v;
        
    }
    
    public Valor visitFatorIdIdAtributo( AuroraLogoParser.FatorIdIdAtributoContext ctx ) {
        
        String id = Utils.gerarId( visitor.visit( ctx.processaId() ).valorDoIdentificador() );
        Valor v = tartaruga.lerMemoria( id );
        
        if ( v.isArranjoAssociativo() ) {
            
            List<String> chaves = new ArrayList<>();
            LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>) v.getValor();

            for ( TerminalNode tIda : ctx.IDA() ) {
                chaves.add( tIda.getText().substring( 1 ) );
            }
            
            for ( String c : chaves ) {
                Object o = map.get( c );
                if ( o instanceof Valor ) {
                    v = (Valor) o;
                    if ( v.isArranjoAssociativo() ) {
                        map = (LinkedHashMap<String, Object>) v.getValor();
                    } else {
                        break;
                    }
                } else {
                    v = novoValor( o );
                    break;
                }
            }
            
        }
        
        return v;
        
    }
    
    public Valor visitFatorBool( AuroraLogoParser.FatorBoolContext ctx ) {
        if ( ctx.VER() != null ) {
            return novoVerdadeiro();
        }
        return novoFalso();
    }
    
    public Valor visitFatorChar( AuroraLogoParser.FatorCharContext ctx ) {
        return novoCaractere( ctx.getText().substring( 1, ctx.getText().length() - 1 ).charAt( 0 ) );
    }
    
    public Valor visitFatorString( AuroraLogoParser.FatorStringContext ctx ) {
        return novaString( ctx.getText().substring( 1, ctx.getText().length() - 1 ) );
    }
    
    public Valor visitFatorCor( AuroraLogoParser.FatorCorContext ctx ) {
        return visitor.visit( ctx.cor() );
    }
    
    public Valor visitFatorConsultarTartaruga( AuroraLogoParser.FatorConsultarTartarugaContext ctx ) {
        
        if ( ctx.consultarTartaruga().PX() != null ) {
            return novoDecimal( tartaruga.getXEstadoFinal() );
        } else if ( ctx.consultarTartaruga().PY() != null ) {
            return novoDecimal( tartaruga.getYEstadoFinal() );
        } else if ( ctx.consultarTartaruga().PA() != null ) {
            return novoDecimal( tartaruga.getAnguloEstadoFinal() );
        } else if ( ctx.consultarTartaruga().PG() != null ) {
            return novoDecimal( tartaruga.getGrossuraPincelEstadoFinal() );
        } else if ( ctx.consultarTartaruga().PES() != null ) {
            return novaString( tartaruga.getEstiloPincelEstadoFinal() );
        } else if ( ctx.consultarTartaruga().PCP() != null ) {
            return novaCor( tartaruga.getCorPincelEstadoFinal() );
        } else if ( ctx.consultarTartaruga().PCPP() != null ) {
            return novaCor( tartaruga.getCorPreenchimentoEstadoFinal());
        } else if ( ctx.consultarTartaruga().PCF() != null ) {
            return novaCor( tartaruga.getCorFundoEstadoFinal() );
        } else if ( ctx.consultarTartaruga().PCPR() != null ) {
            return novaCor( tartaruga.getCor() == null ? Color.BLACK : tartaruga.getCor() );
        } else if ( ctx.consultarTartaruga().PD() != null ) {
            return novoBooleano( tartaruga.isDesenhando() );
        }
        
        return novoZeroDecimal();
        
    }
    
    public Valor visitFatorConsultarString( AuroraLogoParser.FatorConsultarStringContext ctx ) {
        
        AuroraLogoParser.ConsultarStringContext ctxc = ctx.consultarString();
        String id = Utils.gerarId( visitor.visit( ctxc.processaId() ).valorDoIdentificador() );
        Valor string = tartaruga.lerMemoria( id );
        
        if ( string.isString() ) {
            
            if ( ctxc.COMP() != null ) {
                return novoInteiro( string.valorString().length() );
            } if ( ctxc.TIPO() != null ) {
                return novaString( string.getTipo() );
            } else if ( ctxc.CARC() != null ) {
                
                char[] chars = string.valorString().toCharArray();
                
                if ( ctxc.exprIndice() != null ) {
                    Valor vInd = visitor.visit( ctxc.exprIndice() );
                    int i = mapeamentoModular( vInd.valorInteiro(), chars.length );
                    return novoCaractere( chars[i] );
                } else {
                    
                    Character[] charsObj = new Character[chars.length];
                    int i = 0;
                    for ( char c : chars ) {
                        charsObj[i++] = c;
                    }
                    
                    return novoArranjo( charsObj );
                    
                }
                
            } else if ( ctxc.SUBS() != null ) {
                
                Valor vIni = visitor.visit( ctxc.expr( 0 ) );
                Valor vFim = ctxc.expr( 1 ) == null ? null : visitor.visit( ctxc.expr( 1 ) );
                String s = string.valorString();
                
                if ( vFim == null ) {
                    
                    int ini = Utils.mapeamentoModular( vIni.valorInteiro(), s.length() );
                    if ( ini > s.length() - 1 ) {
                        ini = s.length() - 1;
                    }
                    
                    return novaString( s.substring( ini ) );
                    
                } else {
                    
                    int ini = Utils.mapeamentoModular( vIni.valorInteiro(), s.length() );
                    int fim = Utils.mapeamentoModular( vFim.valorInteiro(), s.length()+1 );
                    
                    if ( ini > s.length() - 1 ) {
                        ini = s.length() - 1;
                    }
                    
                    if ( fim > s.length() ) {
                        fim = s.length();
                    }
                    
                    try {
                        return novaString( s.substring( ini, fim ) );
                    } catch ( IndexOutOfBoundsException exc ) {
                        return novaString( "" );
                    }
                    
                }
                
            }
            
        }
        
        return novaString( "" );
        
    }
    
    public Valor visitFatorFuncaoConversao( AuroraLogoParser.FatorFuncaoConversaoContext ctx ) {
        
        AuroraLogoParser.FuncaoConversaoContext fctx = ctx.funcaoConversao();
        Valor v = visitor.visit( fctx.expr() );
        
        if ( fctx.FCO_INT() != null ) {
            return novoInteiro( v.valorInteiro() );
        } else if ( fctx.FCO_DEC() != null ) {
            return novoDecimal( v.valorDecimal() );
        } else if ( fctx.FCO_CHR() != null ) {
            return novoCaractere( v.valorCaractere() );
        } else if ( fctx.FCO_BOL() != null ) {
            return novoBooleano( v.valorBooleano() );
        } else if ( fctx.FCO_STR() != null ) {
            return novaString( v.valorString() );
        } else if ( fctx.FCO_COR() != null ) {
            return novaCor( v.valorCor() );
        }
        
        return novoNulo();
        
    }
    
    public Valor visitFatorParenteses( AuroraLogoParser.FatorParentesesContext ctx ) {
        return visitor.visit( ctx.expr() );
    }
    
}
