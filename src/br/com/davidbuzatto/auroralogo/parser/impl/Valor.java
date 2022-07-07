/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.davidbuzatto.auroralogo.parser.impl;

import java.util.Locale;

/**
 *
 * @author David
 */
public class Valor {
    
    public static enum TipoVariavel {
    
        INTEIRO,
        DECIMAL,
        CARACTERE,
        BOOLEANO,
        STRING,
        NULO,
        PARAR,
        CONTINUAR

    }
    
    public static Valor ZERO_INTEIRO = new Valor( TipoVariavel.INTEIRO, 0, true );
    public static Valor UM_INTEIRO = new Valor( TipoVariavel.INTEIRO, 1, true );
    public static Valor MAIOR_INTEIRO = new Valor( TipoVariavel.INTEIRO, Integer.MAX_VALUE, true );
    public static Valor MENOR_INTEIRO = new Valor( TipoVariavel.INTEIRO, Integer.MIN_VALUE, true );
    
    public static Valor ZERO_DECIMAL = new Valor( TipoVariavel.DECIMAL, 0.0, true );
    public static Valor UM_DECIMAL = new Valor( TipoVariavel.DECIMAL, 1.0, true );
    public static Valor PI_DECIMAL = new Valor( TipoVariavel.DECIMAL, Math.PI, true );
    public static Valor MAIOR_DECIMAL = new Valor( TipoVariavel.DECIMAL, Double.MAX_VALUE, true );
    public static Valor MENOR_DECIMAL = new Valor( TipoVariavel.DECIMAL, Double.MIN_VALUE, true );
    public static Valor INFINITO_POSITIVO = new Valor( TipoVariavel.DECIMAL, Double.POSITIVE_INFINITY, true );
    public static Valor INFINITO_NEGATIVO = new Valor( TipoVariavel.DECIMAL, Double.NEGATIVE_INFINITY, true );
    public static Valor NAO_NUMERO = new Valor( TipoVariavel.DECIMAL, Double.NaN, true );
    
    public static Valor CARACTERE_NULO = new Valor( TipoVariavel.CARACTERE, '\0', true );
    public static Valor FALSO = new Valor( TipoVariavel.BOOLEANO, false, true );
    public static Valor VERDADEIRO = new Valor( TipoVariavel.BOOLEANO, true, true );
    public static Valor NULO = new Valor( TipoVariavel.NULO, null, true );
    
    private TipoVariavel tipo;
    private Object valor;
    private boolean constante;

    private Valor( TipoVariavel tipo, Object valor ) {
        this( tipo, valor, false );
    }
    
    private Valor( TipoVariavel tipo, Object valor, boolean constante ) {
        this.tipo = tipo;
        this.valor = valor;
        this.constante = constante;
    }
    
    public TipoVariavel getTipo() {
        return tipo;
    }

    public Object getValor() {
        return valor;
    }
    
    public boolean isInteiro() {
        return tipo == TipoVariavel.INTEIRO;
    }
    
    public boolean isDecimal() {
        return tipo == TipoVariavel.DECIMAL;
    }
    
    public boolean isNumero() {
        return isInteiro() || isDecimal();
    }
    
    public boolean isCaractere() {
        return tipo == TipoVariavel.CARACTERE;
    }
    
    public boolean isBooleano() {
        return tipo == TipoVariavel.BOOLEANO;
    }
    
    public boolean isString() {
        return tipo == TipoVariavel.STRING;
    }
    
    public boolean isZero() {
        return tipo == TipoVariavel.INTEIRO && valor.equals( 0 ) ||
               tipo == TipoVariavel.DECIMAL && valor.equals( 0.0 );
    }
    
    public boolean isUm() {
        return tipo == TipoVariavel.INTEIRO && valor.equals( 1 ) ||
               tipo == TipoVariavel.DECIMAL && valor.equals( 1.0 );
    }
    
    public boolean isMaiorNumero() {
        return tipo == TipoVariavel.INTEIRO && valor.equals( Integer.MAX_VALUE ) ||
               tipo == TipoVariavel.DECIMAL && valor.equals( Double.MAX_VALUE );
    }
    
    public boolean isMenorNumero() {
        return tipo == TipoVariavel.INTEIRO && valor.equals( Integer.MIN_VALUE ) ||
               tipo == TipoVariavel.DECIMAL && valor.equals( Double.MIN_VALUE );
    }
    
    public boolean isInfinitoPositivo() {
        return tipo == TipoVariavel.DECIMAL && valor.equals( Double.POSITIVE_INFINITY );
    }
    
    public boolean isInfinitoNegativo() {
        return tipo == TipoVariavel.DECIMAL && valor.equals( Double.NEGATIVE_INFINITY );
    }
    
    public boolean isNegativo() {
        return tipo == TipoVariavel.INTEIRO && ( (Integer) valor < 0 ) ||
               tipo == TipoVariavel.DECIMAL && ( (Double) valor < 0.0 );
    }
    
    public boolean isPositivo() {
        return tipo == TipoVariavel.INTEIRO && ( (Integer) valor >= 0 ) ||
               tipo == TipoVariavel.DECIMAL && ( (Double) valor >= 0.0 );
    }
    
    public boolean isNaoNumero() {
        return tipo == TipoVariavel.DECIMAL && valor.equals( Double.NaN );
    }
    
    public boolean isNaN() {
        return isNaoNumero();
    }
    
    public boolean isVerdadeiro() {
        return tipo == TipoVariavel.BOOLEANO && valor.equals( true );
    }
    
    public boolean isFalso() {
        return tipo == TipoVariavel.BOOLEANO && valor.equals( false );
    }
    
    public boolean isNulo() {
        return tipo == TipoVariavel.NULO;
    }
    
    public boolean isParar() {
        return tipo == TipoVariavel.PARAR;
    }
    
    public boolean isContinuar() {
        return tipo == TipoVariavel.CONTINUAR;
    }

    public boolean isConstante() {
        return constante;
    }
    
    public Integer valorInteiro() {
        
        if ( tipo == TipoVariavel.INTEIRO ) {
            return (Integer) valor;
        } else if ( tipo == TipoVariavel.DECIMAL ) {
            return ( (Double) valor ).intValue();
        }
        
        return 0;
        
    }
    
    public Double valorDecimal() {
        
        if ( tipo == TipoVariavel.INTEIRO ) {
            return ( (Integer) valor ).doubleValue();
        } else if ( tipo == TipoVariavel.DECIMAL ) {
            return (Double) valor;
        }
        
        return 0.0;
        
    }
    
    public Character valorCaractere() {
        return tipo == TipoVariavel.CARACTERE && valor != null ? (Character) valor : '\0' ;
    }
    
    public Boolean valorBooleano() {
        return tipo == TipoVariavel.BOOLEANO && valor != null ? (Boolean) valor : false ;
    }
    
    public String valorString() {
        return tipo == TipoVariavel.STRING && valor != null ? (String) valor : "" ;
    }
    
    public int valorIdParar() {
        
        if ( tipo == TipoVariavel.PARAR ) {
            return (Integer) valor;
        }
        
        return 0;
        
    }
    
    public int valorIdContinuar() {
        
        if ( tipo == TipoVariavel.CONTINUAR ) {
            return (Integer) valor;
        }
        
        return 0;
        
    }
    
    public void incrementar() {
        
        if ( isNumero() && !constante ) {
            if ( isInteiro() ) {
                valor = (Integer) valor + 1;
            } else {
                valor = (Double) valor + 1.0;
            }
        }
        
        if ( constante ) {
            System.out.println( "tentativa de alteração de constante!" );
        }
        
    }
    
    public void decrementar() {
        
        if ( isNumero() && !constante ) {
            if ( isInteiro() ) {
                valor = (Integer) valor - 1;
            } else {
                valor = (Double) valor - 1.0;
            }
        }
        
        if ( constante ) {
            System.out.println( "tentativa de alteração de constante!" );
        }
        
    }
    
    public void somar( Valor valor ) {
        
        if ( this.isNumero() && valor.isNumero() && !constante ) {
            if ( isInteiro() ) {
                this.valor = ( (Integer) this.valor ) + valor.valorInteiro();
            } else {
                this.valor = ( (Double) this.valor ) + valor.valorDecimal();
            }
        }
        
        if ( constante ) {
            System.out.println( "tentativa de alteração de constante!" );
        }
        
    }
    
    public void subtrair( Valor valor ) {
        
        if ( this.isNumero() && valor.isNumero() && !constante ) {
            if ( isInteiro() ) {
                this.valor = ( (Integer) this.valor ) - valor.valorInteiro();
            } else {
                this.valor = ( (Double) this.valor ) - valor.valorDecimal();
            }
        }
        
        if ( constante ) {
            System.out.println( "tentativa de alteração de constante!" );
        }
        
    }
    
    public void multiplicar( Valor valor ) {
        
        if ( this.isNumero() && valor.isNumero() && !constante ) {
            if ( isInteiro() ) {
                this.valor = ( (Integer) this.valor ) * valor.valorInteiro();
            } else {
                this.valor = ( (Double) this.valor ) * valor.valorDecimal();
            }
        }
        
        if ( constante ) {
            System.out.println( "tentativa de alteração de constante!" );
        }
        
    }
    
    public void dividir( Valor valor ) {
        
        if ( this.isNumero() && valor.isNumero() && !constante ) {
            if ( isInteiro() ) {
                this.valor = ( (Integer) this.valor ) / ( valor.valorInteiro() == 0 ? 1 : valor.valorInteiro() );  // possível divisão por zero
            } else {
                this.valor = ( (Double) this.valor ) / valor.valorDecimal();                                       // divisão por zero "permitida"
            }
        }
        
        if ( constante ) {
            System.out.println( "tentativa de alteração de constante!" );
        }
        
    }
    
    public void resto( Valor valor ) {
        
        if ( this.isNumero() && valor.isNumero() && !constante ) {
            if ( isInteiro() ) {
                this.valor = ( (Integer) this.valor ) % ( valor.valorInteiro() == 0 ? 1 : valor.valorInteiro() );  // possível divisão por zero
            } else {
                this.valor = ( (Double) this.valor ) % valor.valorDecimal();                                       // divisão por zero "permitida"
            }
        }
        
        if ( constante ) {
            System.out.println( "tentativa de alteração de constante!" );
        }
        
    }
    
    @Override
    public String toString() {
        
        switch ( tipo ) {
            case BOOLEANO:
                if ( (Boolean) valor ) {
                    return "VERDADEIRO";
                }
                return "FALSO";
            case CARACTERE:
                return "'" + String.valueOf( valor ) + "'";
            case STRING:
                return "\"" + String.valueOf( valor ) + "\"";
            case NULO:
                return "NULO";
            case DECIMAL:
                if ( ( (Double) valor ).isNaN() ) {
                    return "NaN (Não-Número)";
                }
                return String.format( Locale.US, "%.3f", (Double) valor );
            default:
                return String.valueOf( valor );
        }
        
    }
    
    
    public static Valor novoInteiro( Integer valor ) {
        return new Valor( TipoVariavel.INTEIRO, valor );
    }
    
    public static Valor novoInteiro( String valor ) {
        return new Valor( TipoVariavel.INTEIRO, Integer.valueOf( valor ) );
    }
    
    public static Valor novoDecimal( Double valor ) {
        if ( valor.isNaN() ) {
            return NAO_NUMERO;
        }
        return new Valor( TipoVariavel.DECIMAL, valor );
    }
    
    public static Valor novoDecimal( String valor ) {
        return new Valor( TipoVariavel.DECIMAL, Double.parseDouble( valor ) );
    }
    
    public static Valor novoBooleano( Boolean valor ) {
        if ( valor ) {
            return new Valor( TipoVariavel.BOOLEANO, true );
        }
        return new Valor( TipoVariavel.BOOLEANO, false );
    }
    
    public static Valor novoBooleano( String valor ) {
        switch ( valor ) {
            case "true":
            case "VERDADEIRO":
                return new Valor( TipoVariavel.BOOLEANO, true );
            case "false":
            case "FALSO":
                return new Valor( TipoVariavel.BOOLEANO, false );
        }
        return NULO;
    }
    
    public static Valor novoCaractere( Character valor ) {
        return new Valor( TipoVariavel.CARACTERE, valor );
    }
    
    public static Valor novaString( String valor ) {
        return new Valor( TipoVariavel.STRING, valor );
    }
    
    public static Valor novoParar( int id ) {
        return new Valor( TipoVariavel.PARAR, id );
    }
    
    public static Valor novoContinuar( int id ) {
        return new Valor( TipoVariavel.CONTINUAR, id );
    }
    
}
