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

import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorArranjoAssociativo;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorInteiro;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorCaractere;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorBooleano;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorContinuar;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorParar;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorRetornar;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorIdentificador;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorFuncao;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorArranjo;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorDecimal;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorCor;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorString;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorNulo;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import static br.com.davidbuzatto.auroralogo.parser.impl.ValorUtils.*;
import br.com.davidbuzatto.auroralogo.utils.Utils;
import static br.com.davidbuzatto.auroralogo.utils.Utils.mapeamentoModular;
import java.awt.Color;
import java.io.Serializable;
import java.util.LinkedHashMap;

/**
 * Classe que representa valores de variáveis, funções e sinalizadores mantidos
 * na memória da tartaruga, sendo componente fundamental para a execução das
 * tarefas do Visitor.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public abstract class Valor<Tipo> implements Serializable {
    
    protected Tipo valor;

    protected Valor( Tipo valor ) {
        this.valor = valor;
    }

    public Tipo getValor() {
        return valor;
    }
    
    public String getTipo() {
        return "VALOR";
    }
    
    public boolean isInteiro() {
        return this instanceof ValorInteiro;
    }
    
    public boolean isDecimal() {
        return this instanceof ValorDecimal;
    }
    
    public boolean isNumero() {
        return isInteiro() || isDecimal();
    }
    
    public boolean isCaractere() {
        return this instanceof ValorCaractere;
    }
    
    public boolean isBooleano() {
        return this instanceof ValorBooleano;
    }
    
    public boolean isString() {
        return this instanceof ValorString;
    }
    
    public boolean isCor() {
        return this instanceof ValorCor;
    }
    
    public boolean isArranjo() {
        return this instanceof ValorArranjo;
    }
    
    public boolean isArranjoAssociativo() {
        return this instanceof ValorArranjoAssociativo;
    }
    
    public boolean isFuncao() {
        return this instanceof ValorFuncao;
    }
    
    public boolean isIdentificador() {
        return this instanceof ValorIdentificador;
    }
    
    public boolean isNulo() {
        return this instanceof ValorNulo;
    }
    
    public boolean isParar() {
        return this instanceof ValorParar;
    }
    
    public boolean isContinuar() {
        return this instanceof ValorContinuar;
    }
    
    public boolean isRetorno() {
        return this instanceof ValorRetornar;
    }
    
    public boolean isZero() {
        return isInteiro() && valor.equals( 0 ) ||
               isDecimal() && valor.equals( 0.0 );
    }
    
    public boolean isUm() {
        return isInteiro() && valor.equals( 1 ) ||
               isDecimal() && valor.equals( 1.0 );
    }
    
    public boolean isMaiorNumero() {
        return isInteiro() && valor.equals( Integer.MAX_VALUE ) ||
               isDecimal() && valor.equals( Double.MAX_VALUE );
    }
    
    public boolean isMenorNumero() {
        return isInteiro() && valor.equals( Integer.MIN_VALUE ) ||
               isDecimal() && valor.equals( Double.MIN_VALUE );
    }
    
    public boolean isNegativo() {
        return isInteiro() && ( (Integer) valor < 0 ) ||
               isInteiro() && ( (Double) valor < 0.0 );
    }
    
    public boolean isPositivo() {
        return isInteiro() && ( (Integer) valor >= 0 ) ||
               isDecimal() && ( (Double) valor >= 0.0 );
    }
    
    public boolean isInfinitoPositivo() {
        return isDecimal() && valor.equals( Double.POSITIVE_INFINITY );
    }
    
    public boolean isInfinitoNegativo() {
        return isDecimal() && valor.equals( Double.NEGATIVE_INFINITY );
    }
    
    public boolean isNaoNumero() {
        return isDecimal() && valor.equals( Double.NaN );
    }
    
    public boolean isNaN() {
        return isNaoNumero();
    }
    
    public boolean isVerdadeiro() {
        return isBooleano() && valor.equals( true );
    }
    
    public boolean isFalso() {
        return isBooleano() && valor.equals( false );
    }    
    
    public Integer valorInteiro() {
        
        if ( isInteiro() ) {
            return (Integer) valor;
        } else if ( isDecimal() ) {
            return ( (Double) valor ).intValue();
        } else if ( isCaractere() ) {
            return (int) ( (Character) valor );
        } else if ( isBooleano() ) {
            return (Boolean) valor ? 1 : 0;
        } else if ( isString() ) {
            try {
                return Integer.valueOf( valor.toString() );
            } catch ( NumberFormatException exc ) {
                return 0;
            }
        } else if ( isCor() ) {
            return ( (Color) valor ).getRGB();
        } else if ( isArranjo() ) {
            return ( (Object[]) valor ).length;
        } else if ( isArranjoAssociativo() ) {
            return ( (LinkedHashMap<String, Object>) valor ).keySet().size();
        }
        
        return 0;
        
    }
    
    public Double valorDecimal() {
        
        if ( isInteiro() ) {
            return ( (Integer) valor ).doubleValue();
        } else if ( isDecimal() ) {
            return (Double) valor;
        } else if ( isCaractere() ) {
            return (double) ( (Character) valor );
        } else if ( isBooleano() ) {
            return (Boolean) valor ? 1.0 : 0.0;
        } else if ( isString() ) {
            try {
                return Double.valueOf( valor.toString() );
            } catch ( NumberFormatException exc ) {
                return 0.0;
            }
        } else if ( isCor() ) {
            return (double) ( (Color) valor ).getRGB();
        } else if ( isArranjo() ) {
            return (double) ( (Object[]) valor ).length;
        } else if ( isArranjoAssociativo() ) {
            return (double) ( (LinkedHashMap<String, Object>) valor ).keySet().size();
        }
        
        return 0.0;
        
    }
    
    public Character valorCaractere() {
        
        if ( isInteiro() ) {
            return (char) ( (Integer) valor ).intValue();
        } else if ( isDecimal() ) {
            return (char) ( (Double) valor ).intValue();
        } else if ( isCaractere() ) {
            return (Character) valor;
        } else if ( isBooleano() ) {
            return (Boolean) valor ? '1' : '\0';
        } else if ( isString() ) {
            return valor.toString().length() > 0 ? valor.toString().charAt( 0 ) : '\0';
        } else if ( isCor() ) {
            return '\0';
        } else if ( isArranjo() ) {
            return '\0';
        } else if ( isArranjoAssociativo() ) {
            return '\0';
        }
        
        return '\0';
        
    }
    
    public Boolean valorBooleano() {
        
        if ( isInteiro() ) {
            return ( (Integer) valor ) != 0;
        } else if ( isDecimal() ) {
            return ( (Double) valor ).intValue() != 0;
        } else if ( isCaractere() ) {
            return ( (Character) valor ) != '\0';
        } else if ( isBooleano() ) {
            return (Boolean) valor;
        } else if ( isString() ) {
            return valor.toString().equals( "VERDADEIRO" );
        } else if ( isCor() ) {
            return ( (Color) valor ).equals( Color.BLUE );
        } else if ( isArranjo() ) {
            return false;
        } else if ( isArranjoAssociativo() ) {
            return false;
        }
        
        return false;
        
    }
    
    public String valorString() {
        return valor.toString();
    }
    
    public Color valorCor() {
        
        if ( isInteiro() ) {
            int c = (Integer) valor;
            return Utils.criarCorRGB( c, c, c );
        } else if ( isDecimal() ) {
            int c = ( (Double) valor ).intValue();
            return Utils.criarCorRGB( c, c, c );
        } else if ( isCaractere() ) {
            int c = (Character) valor;
            return Utils.criarCorRGB( c, c, c );
        } else if ( isBooleano() ) {
            return (Boolean) valor ? Color.BLUE : Color.RED;
        } else if ( isString() ) {
            try {
                return Utils.decodificarCor( valor.toString() );
            } catch ( NumberFormatException exc ) {
            }
        } else if ( isCor() ) {
            return (Color) valor;
        } else if ( isArranjo() ) {
            return Color.BLACK;
        } else if ( isArranjoAssociativo() ) {
            return Color.BLACK;
        }
        
        return Color.BLACK;
        
    }
    
    public Object valorDoArranjo( Integer... indices ) {
        
        Object v = valor;
        
        if ( isArranjo() ) {
            
            for ( int i : indices ) {
                
                // índices que podem ser mapeados à posições reais da 
                // estrutura geram substruturas de uma dimensão menor
                if ( v instanceof Object[] ) {
                    
                    Object[] va = (Object[]) v;
                    int t = va.length;
                    
                    // calcula o índice, evitando acesso a posição inválida
                    // caso o índice ultrapasse o limite, o valor é atualizado
                    // usando mapeamento linear. índices negativos, também
                    // mapeados, acessam a estrutura de trás para frente, assim
                    // como em Python
                    i = mapeamentoModular( i, t );
                    
                    v = va[i];
                    
                } else {
                    // caso haja mais índices do que dimensões a serem exploradas
                    // para o processo de desdobramento
                    break;
                }
                
            }
            
            return v;
            
        }
        
        return 0;
        
    }
    
    public Object valorDoArranjoAssociativo( String chave ) {
        
        if ( isArranjoAssociativo() ) {
            return ( (LinkedHashMap<String, Object>) valor ).getOrDefault( chave, 0 );
        }
        
        return 0;
        
    }
    
    public AuroraLogoParser.FuncContext valorDaFuncao() {
        
        if ( isFuncao() ) {
            return (AuroraLogoParser.FuncContext) valor;
        }
        
        return null;
        
    }
    
    public String valorDoIdentificador() {
        
        if ( isIdentificador() ) {
            return (String) valor;
        }
        
        return null;
        
    }
    
    public Integer valorDoIdParar() {
        
        if ( isParar() ) {
            return (Integer) valor;
        }
        
        return 0;
        
    }
    
    public Integer valorDoIdContinuar() {
        
        if ( isContinuar() ) {
            return (Integer) valor;
        }
        
        return 0;
        
    }
    
    // métodos a implementar nas subclasses
    public Valor incrementar() {
        return novoZeroInteiro();
    }
    
    public Valor decrementar() {
        return novoZeroInteiro();
    }
    
    public Valor concatenar( Valor valor ) {
        
        String esq = String.valueOf( this );
        String dir = String.valueOf( valor );
        
        if ( isArranjo() || isArranjoAssociativo() ) {
            esq = Utils.toStringGeral( this );
        }
        
        if ( valor.isArranjo() || valor.isArranjoAssociativo() ) {
            dir = Utils.toStringGeral( valor );
        }
        
        
        return novaString( esq + dir );
        
    }
    
    public Valor somar( Valor valor ) {
        return novoZeroInteiro();
    }
    
    public Valor subtrair( Valor valor ) {
        return novoZeroInteiro();
    }
    
    public Valor multiplicar( Valor valor ) {
        return novoZeroInteiro();
    }
    
    public Valor dividir( Valor valor ) {
        return novoZeroInteiro();
    }
    
    public Valor resto( Valor valor ) {
        return novoZeroInteiro();
    }
    
    public Valor igualA( Valor valor ) {
        return novoFalso();
    }
    
    public Valor diferenteDe( Valor valor ) {
        return novoFalso();
    }
    
    public Valor maiorQue( Valor valor ) {
        return novoFalso();
    }
    
    public Valor maiorOuIgualA( Valor valor ) {
        return novoFalso();
    }
    
    public Valor menorQue( Valor valor ) {
        return novoFalso();
    }
    
    public Valor menorOuIgualA( Valor valor ) {
        return novoFalso();
    }
    
    public Valor eLogico( Valor valor ) {
        return novoFalso();
    }
    
    public Valor ouLogico( Valor valor ) {
        return novoFalso();
    }
    
    public void setValorArranjo( Object valor, Integer... indices ) {
        
        Object v = this.valor;
        
        if ( isArranjo() ) {
            
            for ( int i = 0; i < indices.length - 1; i++ ) {
                
                int indice = indices[i];
                
                if ( v instanceof Object[] ) {
                    
                    Object[] va = (Object[]) v;
                    int t = va.length;
                    
                    indice = mapeamentoModular( indice, t );
                    
                    v = va[indice];
                    
                } else {
                    break;
                }
                
            }
            
            ( (Object[]) v )[indices[indices.length-1]] = valor;
            
        }
        
    }
    
    public void setValorArranjoAssociativo( String chave, Object valor ) {
        
        if ( isArranjoAssociativo() ) {
            ( (ValorArranjoAssociativo) this ).valor.put( chave, valor );
        }
        
    }
    
}
