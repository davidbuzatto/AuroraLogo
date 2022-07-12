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

import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.Color;
import java.util.LinkedHashMap;
import java.util.Locale;

/**
 * Classe que representa valores de variáveis e constantes mantidas na memória
 * da tartatura. É peça fundamental para a execução das tarefas do Visitor.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Valor {
    
    public static enum Tipo {
    
        INTEIRO,
        DECIMAL,
        CARACTERE,
        BOOLEANO,
        STRING,
        COR,
        ARRANJO,
        ARRANJO_ASSOCIATIVO,
        NULO,
        PARAR,
        CONTINUAR

    }
    
    public static Valor ZERO_INTEIRO = new Valor( Tipo.INTEIRO, 0, true );
    public static Valor UM_INTEIRO = new Valor( Tipo.INTEIRO, 1, true );
    public static Valor MAIOR_INTEIRO = new Valor( Tipo.INTEIRO, Integer.MAX_VALUE, true );
    public static Valor MENOR_INTEIRO = new Valor( Tipo.INTEIRO, Integer.MIN_VALUE, true );
    
    public static Valor ZERO_DECIMAL = new Valor( Tipo.DECIMAL, 0.0, true );
    public static Valor UM_DECIMAL = new Valor( Tipo.DECIMAL, 1.0, true );
    public static Valor PI_DECIMAL = new Valor( Tipo.DECIMAL, Math.PI, true );
    public static Valor MAIOR_DECIMAL = new Valor( Tipo.DECIMAL, Double.MAX_VALUE, true );
    public static Valor MENOR_DECIMAL = new Valor( Tipo.DECIMAL, Double.MIN_VALUE, true );
    public static Valor INFINITO_POSITIVO = new Valor( Tipo.DECIMAL, Double.POSITIVE_INFINITY, true );
    public static Valor INFINITO_NEGATIVO = new Valor( Tipo.DECIMAL, Double.NEGATIVE_INFINITY, true );
    public static Valor NAO_NUMERO = new Valor( Tipo.DECIMAL, Double.NaN, true );
    
    public static Valor CARACTERE_NULO = new Valor( Tipo.CARACTERE, '\0', true );
    public static Valor FALSO = new Valor( Tipo.BOOLEANO, false, true );
    public static Valor VERDADEIRO = new Valor( Tipo.BOOLEANO, true, true );
    public static Valor NULO = new Valor( Tipo.NULO, null, true );
    
    private Tipo tipo;
    private Object valor;
    private boolean constante;

    private Valor( Tipo tipo, Object valor ) {
        this( tipo, valor, false );
    }
    
    private Valor( Tipo tipo, Object valor, boolean constante ) {
        this.tipo = tipo;
        this.valor = valor;
        this.constante = constante;
    }
    
    public Tipo getTipo() {
        return tipo;
    }

    public Object getValor() {
        return valor;
    }
    
    public boolean isInteiro() {
        return tipo == Tipo.INTEIRO;
    }
    
    public boolean isDecimal() {
        return tipo == Tipo.DECIMAL;
    }
    
    public boolean isNumero() {
        return isInteiro() || isDecimal();
    }
    
    public boolean isCaractere() {
        return tipo == Tipo.CARACTERE;
    }
    
    public boolean isBooleano() {
        return tipo == Tipo.BOOLEANO;
    }
    
    public boolean isString() {
        return tipo == Tipo.STRING;
    }
    
    public boolean isCor() {
        return tipo == Tipo.COR;
    }
    
    public boolean isArranjo() {
        return tipo == Tipo.ARRANJO;
    }
    
    public boolean isArranjoAssociativo() {
        return tipo == Tipo.ARRANJO_ASSOCIATIVO;
    }
    
    public boolean isZero() {
        return tipo == Tipo.INTEIRO && valor.equals( 0 ) ||
               tipo == Tipo.DECIMAL && valor.equals( 0.0 );
    }
    
    public boolean isUm() {
        return tipo == Tipo.INTEIRO && valor.equals( 1 ) ||
               tipo == Tipo.DECIMAL && valor.equals( 1.0 );
    }
    
    public boolean isMaiorNumero() {
        return tipo == Tipo.INTEIRO && valor.equals( Integer.MAX_VALUE ) ||
               tipo == Tipo.DECIMAL && valor.equals( Double.MAX_VALUE );
    }
    
    public boolean isMenorNumero() {
        return tipo == Tipo.INTEIRO && valor.equals( Integer.MIN_VALUE ) ||
               tipo == Tipo.DECIMAL && valor.equals( Double.MIN_VALUE );
    }
    
    public boolean isInfinitoPositivo() {
        return tipo == Tipo.DECIMAL && valor.equals( Double.POSITIVE_INFINITY );
    }
    
    public boolean isInfinitoNegativo() {
        return tipo == Tipo.DECIMAL && valor.equals( Double.NEGATIVE_INFINITY );
    }
    
    public boolean isNegativo() {
        return tipo == Tipo.INTEIRO && ( (Integer) valor < 0 ) ||
               tipo == Tipo.DECIMAL && ( (Double) valor < 0.0 );
    }
    
    public boolean isPositivo() {
        return tipo == Tipo.INTEIRO && ( (Integer) valor >= 0 ) ||
               tipo == Tipo.DECIMAL && ( (Double) valor >= 0.0 );
    }
    
    public boolean isNaoNumero() {
        return tipo == Tipo.DECIMAL && valor.equals( Double.NaN );
    }
    
    public boolean isNaN() {
        return isNaoNumero();
    }
    
    public boolean isVerdadeiro() {
        return tipo == Tipo.BOOLEANO && valor.equals( true );
    }
    
    public boolean isFalso() {
        return tipo == Tipo.BOOLEANO && valor.equals( false );
    }
    
    public boolean isNulo() {
        return tipo == Tipo.NULO;
    }
    
    public boolean isParar() {
        return tipo == Tipo.PARAR;
    }
    
    public boolean isContinuar() {
        return tipo == Tipo.CONTINUAR;
    }

    public boolean isConstante() {
        return constante;
    }
    
    public Integer valorInteiro() {
        
        if ( tipo == Tipo.INTEIRO ) {
            return (Integer) valor;
        } else if ( tipo == Tipo.DECIMAL ) {
            return ( (Double) valor ).intValue();
        }
        
        return 0;
        
    }
    
    public Double valorDecimal() {
        
        if ( tipo == Tipo.INTEIRO ) {
            return ( (Integer) valor ).doubleValue();
        } else if ( tipo == Tipo.DECIMAL ) {
            return (Double) valor;
        }
        
        return 0.0;
        
    }
    
    public Character valorCaractere() {
        return tipo == Tipo.CARACTERE && valor != null ? (Character) valor : '\0' ;
    }
    
    public Boolean valorBooleano() {
        return tipo == Tipo.BOOLEANO && valor != null ? (Boolean) valor : false ;
    }
    
    public String valorString() {
        return tipo == Tipo.STRING && valor != null ? (String) valor : "" ;
    }
    
    public Color valorCor() {
        return tipo == Tipo.COR && valor != null ? (Color) valor : Color.BLACK ;
    }
    
    public Object valorArranjo( Integer... indices ) {
        
        Object v = valor;
        
        if ( tipo == Tipo.ARRANJO ) {
            
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
                    if ( i < 0 ) {
                        i %= t;
                        i += t;
                        i %= t;
                    } else {
                        i %= t;
                    }
                    
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
        
        if ( tipo == Tipo.ARRANJO_ASSOCIATIVO ) {
            return ( (LinkedHashMap<String, Object>) valor ).getOrDefault( chave, 0 );
        }
        
        return 0;
        
    }
    
    public Integer valorIdParar() {
        
        if ( tipo == Tipo.PARAR ) {
            return (Integer) valor;
        }
        
        return 0;
        
    }
    
    public Integer valorIdContinuar() {
        
        if ( tipo == Tipo.CONTINUAR ) {
            return (Integer) valor;
        }
        
        return 0;
        
    }
    
    public Valor incrementar() {
        
        Valor v = null;
        
        if ( isNumero() && !constante ) {
            if ( isInteiro() ) {
                v = novoInteiro( (Integer) valor + 1 );
            } else {
                v = novoDecimal( (Double) valor + 1.0 );
            }
        }
        
        if ( constante ) {
            System.err.println( "tentativa de alteração de constante!" );
        }
        
        if ( v == null ) {
            return ZERO_INTEIRO;
        }
        
        return v;
        
    }
    
    public Valor decrementar() {
        
        Valor v = null;
        
        if ( isNumero() && !constante ) {
            if ( isInteiro() ) {
                v = novoInteiro( (Integer) valor - 1 );
            } else {
                v = novoDecimal( (Double) valor - 1.0 );
            }
        }
        
        if ( constante ) {
            System.err.println( "tentativa de alteração de constante!" );
        }
        
        if ( v == null ) {
            return ZERO_INTEIRO;
        }
        
        return v;
        
    }
    
    public Valor concatenar( Valor valor ) {
        
        if ( this.isString() && !constante ) {
            
            String novo = String.valueOf( this.valor );
            String concat = String.valueOf( valor );
            
            /*if ( valor.isString() || valor.isCaractere() ) {
                novo += concat.substring( 1, concat.length() - 1 );
            } else {
                novo += concat;
            }*/
            
            novo += concat;
            
            return novaString( novo );
            
        }
        
        return ZERO_INTEIRO;
        
    }
    
    public Valor somar( Valor valor ) {
        
        Valor v = null;
        
        if ( this.isNumero() && valor.isNumero() && !constante ) {
            if ( isInteiro() ) {
                v = novoInteiro( ( (Integer) this.valor ) + valor.valorInteiro() );
            } else {
                v = novoDecimal( ( (Double) this.valor ) + valor.valorDecimal() );
            }
        }
        
        if ( constante ) {
            System.err.println( "tentativa de alteração de constante!" );
        }
        
        if ( v == null ) {
            return ZERO_INTEIRO;
        }
        
        return v;
        
    }
    
    public Valor subtrair( Valor valor ) {
        
        Valor v = null;
        
        if ( this.isNumero() && valor.isNumero() && !constante ) {
            if ( isInteiro() ) {
                v = novoInteiro( ( (Integer) this.valor ) - valor.valorInteiro() );
            } else {
                v = novoDecimal( ( (Double) this.valor ) - valor.valorDecimal() );
            }
        }
        
        if ( constante ) {
            System.err.println( "tentativa de alteração de constante!" );
        }
        
        if ( v == null ) {
            return ZERO_INTEIRO;
        }
        
        return v;
        
    }
    
    public Valor multiplicar( Valor valor ) {
        
        Valor v = null;
        
        if ( this.isNumero() && valor.isNumero() && !constante ) {
            if ( isInteiro() ) {
                v = novoInteiro( ( (Integer) this.valor ) * valor.valorInteiro() );
            } else {
                v = novoDecimal( ( (Double) this.valor ) * valor.valorDecimal() );
            }
        }
        
        if ( constante ) {
            System.err.println( "tentativa de alteração de constante!" );
        }
        
        if ( v == null ) {
            return ZERO_INTEIRO;
        }
        
        return v;
        
    }
    
    public Valor dividir( Valor valor ) {
        
        Valor v = null;
        
        if ( this.isNumero() && valor.isNumero() && !constante ) {
            if ( isInteiro() ) {
                v = novoInteiro( ( (Integer) this.valor ) / ( valor.valorInteiro() == 0 ? 1 : valor.valorInteiro() ) );  // possível divisão por zero
            } else {
                v = novoDecimal( ( (Double) this.valor ) / valor.valorDecimal() );                                       // divisão por zero "permitida"
            }
        }
        
        if ( constante ) {
            System.err.println( "tentativa de alteração de constante!" );
        }
        
        if ( v == null ) {
            return ZERO_INTEIRO;
        }
        
        return v;
        
    }
    
    public Valor resto( Valor valor ) {
        
        Valor v = null;
        
        if ( this.isNumero() && valor.isNumero() && !constante ) {
            if ( isInteiro() ) {
                v = novoInteiro( ( (Integer) this.valor ) % ( valor.valorInteiro() == 0 ? 1 : valor.valorInteiro() ) );  // possível divisão por zero
            } else {
                v = novoDecimal( ( (Double) this.valor ) % valor.valorDecimal() );                                       // divisão por zero "permitida"
            }
        }
        
        if ( constante ) {
            System.err.println( "tentativa de alteração de constante!" );
        }
        
        if ( v == null ) {
            return ZERO_INTEIRO;
        }
        
        return v;
        
    }
    
    public void setValorArranjo( Object valor, Integer... indices ) {
        
        Object v = this.valor;
        
        if ( tipo == Tipo.ARRANJO ) {
            
            for ( int i = 0; i < indices.length - 1; i++ ) {
                
                int indice = indices[i];
                
                if ( v instanceof Object[] ) {
                    
                    Object[] va = (Object[]) v;
                    int t = va.length;
                    
                    if ( indice < 0 ) {
                        indice %= t;
                        indice += t;
                        indice %= t;
                    } else {
                        indice %= t;
                    }
                    
                    v = va[indice];
                    
                } else {
                    break;
                }
                
            }
            
            ( (Object[]) v )[indices[indices.length-1]] = valor;
            
        }
        
    }
    
    public void setValorArranjoAssociativo( String chave, Object valor ) {
        
        if ( tipo == Tipo.ARRANJO_ASSOCIATIVO ) {
            ( (LinkedHashMap<String, Object>) this.valor ).put( chave, valor );
        }
        
    }
    
    @Override
    public String toString() {
        
        switch ( tipo ) {
            case INTEIRO:
                return String.valueOf( valor );
            case DECIMAL:
                if ( ( (Double) valor ).isNaN() ) {
                    return "NaN (Não-Número)";
                }
                return String.format( Locale.US, "%.3f", (Double) valor );
            case BOOLEANO:
                if ( (Boolean) valor ) {
                    return "VERDADEIRO";
                }
                return "FALSO";
            /*case CARACTERE:
                return "'" + String.valueOf( valor ) + "'";
            case STRING:
                return "\"" + String.valueOf( valor ) + "\"";*/
            case CARACTERE:
                return String.valueOf( valor );
            case STRING:
                return String.valueOf( valor );
            case COR:
                return Utils.colorParaHexa( (Color) valor );
            case ARRANJO:
                return Utils.toStringArranjo( (Object[]) valor );
            case ARRANJO_ASSOCIATIVO:
                return Utils.toStringArranjoAssociativo( this );
            case NULO:
                return "NULO";
            default:
                return String.valueOf( valor );
                
        }
        
    }
    
    
    public static Valor novoInteiro( Integer valor ) {
        return new Valor( Tipo.INTEIRO, valor );
    }
    
    public static Valor novoInteiro( String valor ) {
        return new Valor( Tipo.INTEIRO, Integer.valueOf( valor ) );
    }
    
    public static Valor novoDecimal( Double valor ) {
        if ( valor.isNaN() ) {
            return NAO_NUMERO;
        }
        return new Valor( Tipo.DECIMAL, valor );
    }
    
    public static Valor novoDecimal( String valor ) {
        return new Valor( Tipo.DECIMAL, Double.parseDouble( valor ) );
    }
    
    public static Valor novoBooleano( Boolean valor ) {
        if ( valor ) {
            return new Valor( Tipo.BOOLEANO, true );
        }
        return new Valor( Tipo.BOOLEANO, false );
    }
    
    public static Valor novoBooleano( String valor ) {
        switch ( valor ) {
            case "true":
            case "VERDADEIRO":
                return new Valor( Tipo.BOOLEANO, true );
            case "false":
            case "FALSO":
                return new Valor( Tipo.BOOLEANO, false );
        }
        return NULO;
    }
    
    public static Valor novoCaractere( Character valor ) {
        return new Valor( Tipo.CARACTERE, valor );
    }
    
    public static Valor novaString( String valor ) {
        return new Valor( Tipo.STRING, valor );
    }
    
    public static Valor novaCor( Color valor ) {
        return new Valor( Tipo.COR, valor );
    }
    
    public static Valor novoArranjo( Integer... dimensoes ) {
        return new Valor( Tipo.ARRANJO, Utils.criarArrayNDimensional( dimensoes ) );
    }
    
    public static Valor novoArranjo( Object dados ) {
        return new Valor( Tipo.ARRANJO, dados );
    }
    
    public static Valor novoArranjoAssociativo() {
        return new Valor( Tipo.ARRANJO_ASSOCIATIVO, new LinkedHashMap<String, Object>() );
    }
    
    public static Valor novoArranjoAssociativo( LinkedHashMap<String, Object> mapa ) {
        return new Valor( Tipo.ARRANJO_ASSOCIATIVO, mapa );
    }
    
    // analisa o parâmetro e retorna o valor correto dependendo do tipo
    public static Valor novoValor( Object o ) {
        
        if ( o == null ) {
            return NULO;
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
            return novoArranjo( (Object[]) o );
        } else if ( o instanceof LinkedHashMap ) {
            return novoArranjoAssociativo( (LinkedHashMap) o );
        }
        
        return NULO;
        
    }
    
    public static Valor novoParar( int id ) {
        return new Valor( Tipo.PARAR, id );
    }
    
    public static Valor novoContinuar( int id ) {
        return new Valor( Tipo.CONTINUAR, id );
    }
    
    public boolean equalsArranjo( Valor arranjo ) {
        return false;
    }
    
    public boolean equalsArranjoAssociativo( Valor arranjoAssociativo ) {
        return false;
    }
    
}
