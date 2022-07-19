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
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorArranjo;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorArranjoAssociativo;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorBooleano;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorCaractere;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorContinuar;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorCor;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorDecimal;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorFuncao;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorIdentificador;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorInteiro;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorNulo;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorParar;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorRetornar;
import br.com.davidbuzatto.auroralogo.parser.impl.valores.ValorString;
import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Diversos métodos utilitários para criação de valores.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValorUtils {
    
    public static Valor novoInteiro( Integer valor ) {
        return new ValorInteiro( valor );
    }
    
    public static Valor novoInteiro( String valor ) {
        try {
            return new ValorInteiro( Integer.valueOf( valor ) );
        } catch ( NumberFormatException exc ) {
            return novoZeroInteiro();
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
            return novoZeroDecimal();
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
    
    public static Valor novoCaractere( Integer valor ) {
        if ( Character.isValidCodePoint( valor ) ) {
            return novoCaractere( (char) valor.intValue() );
        } else {
            return novoCaractere( '\0'  );
        }
    }
    
    public static Valor novaString( String valor ) {
        return new ValorString( valor );
    }
    
    public static Valor novaCor( Color valor ) {
        return new ValorCor( valor );
    }
    
    public static Valor novoArranjo( Integer... dimensoes ) {
        return new ValorArranjo( criarArrayNDimensional( dimensoes ) );
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
            return novoNulo();
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
            return novoValor( ( (Valor) o ).getValor() );
        } else if ( o instanceof Valor[] ) {
            return novoArranjo(Utils.cloneArrayObject((Valor[]) o ) );
        }
        
        return novoNulo();
        
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
    
    public static boolean equalsArranjo( Valor arranjo ) {
        return false;
    }
    
    public static boolean equalsArranjoAssociativo( Valor arranjoAssociativo ) {
        return false;
    }
    
    /*
     * Cria um array de dimensões especificada no vararg "dimensoes".
     */
    public static Object criarArrayNDimensional( Integer... dimensoes ) {
        return criarArrayNDimensional( "", false, dimensoes );
    }
    
    private static Object criarArrayNDimensional( String identacao, boolean tracar, Integer... dimensoes ) {
        
        if ( dimensoes.length >= 1 ) {
            
            List<Integer> listaIndices = new ArrayList<>( Arrays.<Integer>asList(dimensoes ) );
            Integer tamanhoAtual = listaIndices.remove( 0 );
            
            if ( tamanhoAtual  <= 0 ) {
                tamanhoAtual  = 1;
            }
            
            Object[] novoSubArray = new Object[tamanhoAtual];
            
            for ( int i = 0; i < tamanhoAtual ; i++ ) {
                if ( tracar ) {
                    System.out.println( identacao + i );
                }
                novoSubArray[i] = criarArrayNDimensional( 
                        identacao + "  ", 
                        tracar, 
                        listaIndices.toArray( Integer[]::new ) );
            }
            
            return novoSubArray;
            
        }
        
        return novoInteiro( 0 );
        
    }
    
}
