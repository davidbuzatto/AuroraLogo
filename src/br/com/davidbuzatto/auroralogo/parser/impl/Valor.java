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
        }
        
        return 0;
        
    }
    
    public Double valorDecimal() {
        
        if ( isInteiro() ) {
            return ( (Integer) valor ).doubleValue();
        } else if ( isDecimal() ) {
            return (Double) valor;
        }
        
        return 0.0;
        
    }
    
    public Character valorCaractere() {
        return isCaractere() && valor != null ? (Character) valor : '\0' ;
    }
    
    public Boolean valorBooleano() {
        return isBooleano() && valor != null ? (Boolean) valor : false ;
    }
    
    public String valorString() {
        return isString() && valor != null ? (String) valor : "" ;
    }
    
    public Color valorCor() {
        return isCor() && valor != null ? (Color) valor : Color.BLACK ;
    }
    
    public Object valorArranjo( Integer... indices ) {
        
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
    
    public Object valorArranjoAssociativo( String chave ) {
        
        if ( isArranjoAssociativo() ) {
            return ( (LinkedHashMap<String, Object>) valor ).getOrDefault( chave, 0 );
        }
        
        return 0;
        
    }
    
    public AuroraLogoParser.FuncContext valorFuncao() {
        
        if ( isFuncao() ) {
            return (AuroraLogoParser.FuncContext) valor;
        }
        
        return null;
        
    }
    
    public String valorIdentificador() {
        
        if ( isIdentificador() ) {
            return (String) valor;
        }
        
        return null;
        
    }
    
    public Integer valorIdParar() {
        
        if ( isParar() ) {
            return (Integer) valor;
        }
        
        return 0;
        
    }
    
    public Integer valorIdContinuar() {
        
        if ( isContinuar() ) {
            return (Integer) valor;
        }
        
        return 0;
        
    }
    
    public Valor incrementar() {
        
        Valor v = null;
        
        if ( isNumero() ) {
            if ( isInteiro() ) {
                v = novoInteiro( (Integer) valor + 1 );
            } else {
                v = novoDecimal( (Double) valor + 1.0 );
            }
        }
        
        if ( v == null ) {
            return Valor.novoZeroInteiro();
        }
        
        return v;
        
    }
    
    public Valor decrementar() {
        
        Valor v = null;
        
        if ( isNumero() ) {
            if ( isInteiro() ) {
                v = novoInteiro( (Integer) valor - 1 );
            } else {
                v = novoDecimal( (Double) valor - 1.0 );
            }
        }
        
        if ( v == null ) {
            return Valor.novoZeroInteiro();
        }
        
        return v;
        
    }
    
    public Valor concatenar( Valor valor ) {
        
        if ( this.isString() ) {
            
            String novo = String.valueOf( this.valor );
            String concat = String.valueOf( valor );
            
            return novaString( novo + concat );
            
        }
        
        return Valor.novoZeroInteiro();
        
    }
    
    public Valor somar( Valor valor ) {
        
        Valor v = null;
        
        if ( this.isNumero() && valor.isNumero() ) {
            if ( isInteiro() ) {
                v = novoInteiro( ( (Integer) this.valor ) + valor.valorInteiro() );
            } else {
                v = novoDecimal( ( (Double) this.valor ) + valor.valorDecimal() );
            }
        }
        
        if ( v == null ) {
            return Valor.novoZeroInteiro();
        }
        
        return v;
        
    }
    
    public Valor subtrair( Valor valor ) {
        
        Valor v = null;
        
        if ( this.isNumero() && valor.isNumero() ) {
            if ( isInteiro() ) {
                v = novoInteiro( ( (Integer) this.valor ) - valor.valorInteiro() );
            } else {
                v = novoDecimal( ( (Double) this.valor ) - valor.valorDecimal() );
            }
        }
        
        if ( v == null ) {
            return Valor.novoZeroInteiro();
        }
        
        return v;
        
    }
    
    public Valor multiplicar( Valor valor ) {
        
        Valor v = null;
        
        if ( this.isNumero() && valor.isNumero() ) {
            if ( isInteiro() ) {
                v = novoInteiro( ( (Integer) this.valor ) * valor.valorInteiro() );
            } else {
                v = novoDecimal( ( (Double) this.valor ) * valor.valorDecimal() );
            }
        }
        
        if ( v == null ) {
            return Valor.novoZeroInteiro();
        }
        
        return v;
        
    }
    
    public Valor dividir( Valor valor ) {
        
        Valor v = null;
        
        if ( this.isNumero() && valor.isNumero() ) {
            if ( isInteiro() ) {
                v = novoInteiro( ( (Integer) this.valor ) / ( valor.valorInteiro() == 0 ? 1 : valor.valorInteiro() ) );  // possível divisão por zero
            } else {
                v = novoDecimal( ( (Double) this.valor ) / valor.valorDecimal() );                                       // divisão por zero "permitida"
            }
        }
        
        if ( v == null ) {
            return Valor.novoZeroInteiro();
        }
        
        return v;
        
    }
    
    public Valor resto( Valor valor ) {
        
        Valor v = null;
        
        if ( this.isNumero() && valor.isNumero() ) {
            if ( isInteiro() ) {
                v = novoInteiro( ( (Integer) this.valor ) % ( valor.valorInteiro() == 0 ? 1 : valor.valorInteiro() ) );  // possível divisão por zero
            } else {
                v = novoDecimal( ( (Double) this.valor ) % valor.valorDecimal() );                                       // divisão por zero "permitida"
            }
        }
        
        if ( v == null ) {
            return Valor.novoZeroInteiro();
        }
        
        return v;
        
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
    
    @Override
    public String toString() {
        return "";
    }
    
    
    public static Valor novoInteiro( Integer valor ) {
        return new ValorInteiro( valor );
    }
    
    public static Valor novoInteiro( String valor ) {
        try {
            return new ValorInteiro( Integer.valueOf( valor ) );
        } catch ( NumberFormatException exc ) {
            return Valor.novoZeroInteiro();
        }
    }
    
    public static Valor novoZeroInteiro() {
        return novoInteiro( 0 );
    }
    
    public static Valor novoUmInteiro() {
        return novoInteiro( 1 );
    }
    
    public static Valor novoDecimal( Double valor ) {
        if ( valor.isNaN() ) {
            return novoNaoNumeroDecimal();
        }
        return new ValorDecimal( valor );
    }
    
    public static Valor novoDecimal( String valor ) {
        try {
            return new ValorDecimal( Double.parseDouble( valor ) );
        } catch ( NumberFormatException exc ) {
            return Valor.novoZeroDecimal();
        }
    }
    
    public static Valor novoZeroDecimal() {
        return novoDecimal( 0.0 );
    }
    
    public static Valor novoUmDecimal() {
        return novoDecimal( 1.0 );
    }
    
    public static Valor novoNaoNumeroDecimal() {
        return new ValorDecimal( Double.NaN );
    }
    
    public static Valor novoBooleano( Boolean valor ) {
        if ( valor ) {
            return new ValorBooleano( true );
        }
        return new ValorBooleano( false );
    }
    
    public static Valor novoBooleano( String valor ) {
        switch ( valor ) {
            case "true":
            case "VERDADEIRO":
                return new ValorBooleano( true );
            case "false":
            case "FALSO":
                return new ValorBooleano( false );
        }
        return new ValorBooleano( false );
    }
    
    public static Valor novoVerdadeiro() {
        return novoBooleano( true );
    }
    
    public static Valor novoFalso() {
        return novoBooleano( false );
    }
    
    public static Valor novoNulo() {
        return new ValorNulo();
    }
    
    public static Valor novoCaractere( Character valor ) {
        return new ValorCaractere( valor );
    }
    
    public static Valor novaString( String valor ) {
        return new ValorString( valor );
    }
    
    public static Valor novaCor( Color valor ) {
        return new ValorCor( valor );
    }
    
    public static Valor novoArranjo( Integer... dimensoes ) {
        return new ValorArranjo( Utils.criarArrayNDimensional( dimensoes ) );
    }
    
    public static Valor novoArranjo( Object dados ) {
        return new ValorArranjo( dados );
    }
    
    public static Valor novoArranjoAssociativo() {
        return new ValorArranjoAssociativo( new LinkedHashMap<>() );
    }
    
    public static Valor novoArranjoAssociativo( LinkedHashMap<String, Object> mapa ) {
        return new ValorArranjoAssociativo( mapa );
    }
    
    public static Valor novaFuncao( AuroraLogoParser.FuncContext contexto ) {
        return new ValorFuncao( contexto );
    }
    
    public static Valor novoRetornar( Valor valor ) {
        return new ValorRetornar( valor );
    }
    
    // analisa o parâmetro e retorna o valor correto dependendo do tipo
    public static Valor novoValor( Object o ) {
        
        if ( o == null ) {
            return Valor.novoNulo();
        } else if ( o instanceof Valor ) {
            o = ( (Valor) o ).getValor();
        }
        
        if ( o instanceof Integer ) {
            return novoInteiro( (Integer) o );
        } else if ( o instanceof Double ) {
            return novoDecimal( (Double) o );
        } else if ( o instanceof Character ) {
            return novoCaractere( (Character) o );
        } else if ( o instanceof Boolean ) {
            return novoBooleano( (Boolean) o );
        } else if ( o instanceof String ) {
            return novaString( (String) o );
        } else if ( o instanceof Color ) {
            return novaCor( (Color) o );
        } else if ( o instanceof Object[] ) {
            return novoArranjo( Utils.cloneArrayObject( (Object[]) o ) );
        } else if ( o instanceof LinkedHashMap ) {
            return novoArranjoAssociativo( Utils.cloneLinkedHashMapObject( (LinkedHashMap) o ) );
        } else if ( o instanceof Valor ) {
            return novoValor(( (Valor) o ).getValor() );
        } else if ( o instanceof Valor[] ) {
            return novoArranjo(Utils.cloneArrayObject((Valor[]) o ) );
        }
        
        return Valor.novoNulo();
        
    }
    
    public static Valor novoParar( Integer idParavel ) {
        return new ValorParar( idParavel );
    }
    
    public static Valor novoContinuar( Integer idParavel ) {
        return new ValorContinuar( idParavel );
    }
    
    public static Valor novoIdentificador( String id ) {
        return new ValorIdentificador( id );
    }
    
    // SEMPRE retornam false
    public static boolean equalsArranjo( Valor arranjo ) {
        return false;
    }
    
    public static boolean equalsArranjoAssociativo( Valor arranjoAssociativo ) {
        return false;
    }
    
}
