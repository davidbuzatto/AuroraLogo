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
public class ValorVariavel {
    
    public static enum TipoVariavel {
    
        INTEIRO,
        DECIMAL,
        CARACTERE,
        BOOLEANO,
        STRING,
        NULO

    }
    
    public static ValorVariavel ZERO_INTEIRO = new ValorVariavel( TipoVariavel.INTEIRO, 0 );
    public static ValorVariavel UM_INTEIRO = new ValorVariavel( TipoVariavel.INTEIRO, 1 );
    public static ValorVariavel MAIOR_INTEIRO = new ValorVariavel( TipoVariavel.INTEIRO, Integer.MAX_VALUE );
    public static ValorVariavel MENOR_INTEIRO = new ValorVariavel( TipoVariavel.INTEIRO, Integer.MIN_VALUE );
    
    public static ValorVariavel ZERO_DECIMAL = new ValorVariavel( TipoVariavel.DECIMAL, 0.0 );
    public static ValorVariavel UM_DECIMAL = new ValorVariavel( TipoVariavel.DECIMAL, 1.0 );
    public static ValorVariavel MAIOR_DECIMAL = new ValorVariavel( TipoVariavel.DECIMAL, Double.MAX_VALUE );
    public static ValorVariavel MENOR_DECIMAL = new ValorVariavel( TipoVariavel.DECIMAL, Double.MIN_VALUE );
    public static ValorVariavel INFINITO_POSITIVO = new ValorVariavel( TipoVariavel.DECIMAL, Double.POSITIVE_INFINITY );
    public static ValorVariavel INFINITO_NEGATIVO = new ValorVariavel( TipoVariavel.DECIMAL, Double.NEGATIVE_INFINITY );
    public static ValorVariavel NAO_NUMERO = new ValorVariavel( TipoVariavel.DECIMAL, Double.NaN );
    
    public static ValorVariavel CARACTERE_NULO = new ValorVariavel( TipoVariavel.CARACTERE, '\0' );
    public static ValorVariavel FALSO = new ValorVariavel( TipoVariavel.BOOLEANO, false );
    public static ValorVariavel VERDADEIRO = new ValorVariavel( TipoVariavel.BOOLEANO, true );
    public static ValorVariavel NULO = new ValorVariavel( TipoVariavel.NULO, null );
    
    private TipoVariavel tipo;
    private Object valor;

    private ValorVariavel( TipoVariavel tipo, Object valor ) {
        this.tipo = tipo;
        this.valor = valor;
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
                return String.format( Locale.US, "%.3f", (Double) valor );
            default:
                return String.valueOf( valor );
        }
        
    }
    
    
    public static ValorVariavel novoInteiro( Integer valor ) {
        return new ValorVariavel( TipoVariavel.INTEIRO, valor );
    }
    
    public static ValorVariavel novoInteiro( String valor ) {
        return new ValorVariavel( TipoVariavel.INTEIRO, Integer.valueOf( valor ) );
    }
    
    public static ValorVariavel novoDecimal( Double valor ) {
        return new ValorVariavel( TipoVariavel.DECIMAL, valor );
    }
    
    public static ValorVariavel novoDecimal( String valor ) {
        return new ValorVariavel( TipoVariavel.DECIMAL, Double.parseDouble( valor ) );
    }
    
    public static ValorVariavel novoBooleano( Boolean valor ) {
        if ( valor ) {
            return VERDADEIRO;
        }
        return FALSO;
    }
    
    public static ValorVariavel novoBooleano( String valor ) {
        switch ( valor ) {
            case "true":
            case "VERDADEIRO":
                return VERDADEIRO;
            case "false":
            case "FALSO":
                return FALSO;
        }
        return NULO;
    }
    
    public static ValorVariavel novoCaractere( Character valor ) {
        return new ValorVariavel( TipoVariavel.CARACTERE, valor );
    }
    
    public static ValorVariavel novaString( String valor ) {
        return new ValorVariavel( TipoVariavel.STRING, valor );
    }
    
}