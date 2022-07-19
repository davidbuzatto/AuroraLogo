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
package br.com.davidbuzatto.auroralogo.parser.impl.valores;

import br.com.davidbuzatto.auroralogo.parser.impl.Valor;
import static br.com.davidbuzatto.auroralogo.parser.impl.ValorUtils.*;
import java.io.Serializable;

/**
 * Representação de um valor do tipo inteiro e suas constantes.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValorInteiro extends Valor<Integer> implements Serializable {

    public ValorInteiro( Integer valor ) {
        super( valor );
    }

    @Override
    public String getTipo() {
        return "INTEIRO";
    }
    
    @Override
    public String toString() {
        return String.valueOf( valor );
    }
    
    @Override
    public Valor incrementar() {
        return novoInteiro( valor + 1 );
    }
    
    @Override
    public Valor decrementar() {
        return novoInteiro( valor - 1 );
    }
    
    @Override
    public Valor somar( Valor valor ) {
        
        if ( valor.isDecimal() ) {
            return novoDecimal( ( this.valor ) + valor.valorDecimal() );
        } else if ( valor.isString() ) {
            return concatenar( valor );
        }
        
        return novoInteiro( ( this.valor ) + valor.valorInteiro() );
        
    }
    
    @Override
    public Valor subtrair( Valor valor ) {
        
        if ( valor.isDecimal() ) {
            return novoDecimal( ( this.valor ) - valor.valorDecimal() );
        }
        
        return novoInteiro( ( this.valor ) - valor.valorInteiro() );
        
    }
    
    @Override
    public Valor multiplicar( Valor valor ) {
        
        if ( valor.isDecimal() ) {
            return novoDecimal( ( this.valor ) * valor.valorDecimal() );
        }
        
        return novoInteiro( ( this.valor ) * valor.valorInteiro() );
        
    }
    
    @Override
    public Valor dividir( Valor valor ) {
        
        if ( valor.isDecimal() ) {
            return novoDecimal( ( this.valor ) / valor.valorDecimal() );                                  // divisão por zero "permitida"
        }
        
        return novoInteiro( ( this.valor ) / ( valor.valorInteiro() == 0 ? 1 : valor.valorInteiro() ) );  // possível divisão por zero;
        
    }
    
    @Override
    public Valor resto( Valor valor ) {
        
        if ( valor.isDecimal() ) {
            return novoDecimal( ( this.valor ) % valor.valorDecimal() );                                  // divisão por zero "permitida"
        }
        
        return novoInteiro( ( this.valor ) % ( valor.valorInteiro() == 0 ? 1 : valor.valorInteiro() ) );  // possível divisão por zero;
        
    }
    
    @Override
    public Valor igualA( Valor valor ) {
        return novoBooleano( this.valor.intValue() == valor.valorInteiro().intValue() );
    }
    
    @Override
    public Valor diferenteDe( Valor valor ) {
        return novoBooleano( this.valor.intValue() != valor.valorInteiro().intValue() );
    }
    
    @Override
    public Valor menorQue( Valor valor ) {
        return novoBooleano( this.valor < valor.valorInteiro() );
    }
    
    @Override
    public Valor menorOuIgualA( Valor valor ) {
        return novoBooleano( this.valor <= valor.valorInteiro() );
    }
    
    @Override
    public Valor maiorQue( Valor valor ) {
        return novoBooleano( this.valor > valor.valorInteiro() );
    }
    
    @Override
    public Valor maiorOuIgualA( Valor valor ) {
        return novoBooleano( this.valor >= valor.valorInteiro() );
    }
    
}
