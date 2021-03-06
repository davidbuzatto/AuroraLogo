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
import java.util.Locale;

/**
 * Representação de um valor do tipo decimal e suas constantes.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValorDecimal extends Valor<Double> implements Serializable {
    
    public ValorDecimal( Double valor ) {
        super( valor );
    }

    @Override
    public String getTipo() {
        return "DECIMAL";
    }
    
    @Override
    public String toString() {
        if ( valor.isNaN() ) {
            return "NaN (Não-Número)";
        }
        return String.format( Locale.US, "%.3f", valor );
    }
    
    @Override
    public Valor incrementar() {
        return novoDecimal( valor + 1.0 );
    }
    
    @Override
    public Valor decrementar() {
        return novoDecimal( valor - 1.0 );
    }
    
    @Override
    public Valor somar( Valor valor ) {
        
        if ( valor.isString() ) {
            return concatenar( valor );
        }
         
        return novoDecimal( ( this.valor ) + valor.valorDecimal() );
        
    }
    
    @Override
    public Valor subtrair( Valor valor ) {
        return novoDecimal( ( this.valor ) - valor.valorDecimal() );
    }
    
    @Override
    public Valor multiplicar( Valor valor ) {
        return novoDecimal( ( this.valor ) * valor.valorDecimal() );
    }
    
    @Override
    public Valor dividir( Valor valor ) {
        return novoDecimal( ( this.valor ) / valor.valorDecimal() );  // divisão por zero "permitida"
    }
    
    @Override
    public Valor resto( Valor valor ) {
        return novoDecimal( ( this.valor ) % valor.valorDecimal() );  // divisão por zero "permitida"
    }
    
    @Override
    public Valor igualA( Valor valor ) {
        return novoBooleano( this.valor.doubleValue() == valor.valorDecimal().doubleValue() );
    }
    
    @Override
    public Valor diferenteDe( Valor valor ) {
        return novoBooleano( this.valor.doubleValue() != valor.valorDecimal().doubleValue() );
    }
    
    @Override
    public Valor menorQue( Valor valor ) {
        return novoBooleano( this.valor < valor.valorDecimal() );
    }
    
    @Override
    public Valor menorOuIgualA( Valor valor ) {
        return novoBooleano( this.valor <= valor.valorDecimal() );
    }
    
    @Override
    public Valor maiorQue( Valor valor ) {
        return novoBooleano( this.valor > valor.valorDecimal() );
    }
    
    @Override
    public Valor maiorOuIgualA( Valor valor ) {
        return novoBooleano( this.valor >= valor.valorDecimal() );
    }
    
}
