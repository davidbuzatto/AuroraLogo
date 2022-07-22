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
 * Representação de um valor String.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValorString extends Valor<String> implements Serializable {
    
    public ValorString( String valor ) {
        super( valor );
    }

    @Override
    public String getTipo() {
        return "STRING";
    }
    
    @Override
    public String toString() {
        return valor.replace( "\\\"", "\"" );
    }
    
    @Override
    public Valor somar( Valor valor ) {
        return concatenar( valor );
    }
    
    @Override
    public Valor igualA( Valor valor ) {
        return novoBooleano( this.valor.equals( valor.valorString() ) );
    }
    
    @Override
    public Valor diferenteDe( Valor valor ) {
        return novoBooleano( !this.valor.equals( valor.valorString() ) );
    }
    
    @Override
    public Valor menorQue( Valor valor ) {
        return novoBooleano( this.valor.compareTo( valor.valorString() ) < 0 );
    }
    
    @Override
    public Valor menorOuIgualA( Valor valor ) {
        return novoBooleano( this.valor.compareTo( valor.valorString() ) <= 0 );
    }
    
    @Override
    public Valor maiorQue( Valor valor ) {
        return novoBooleano( this.valor.compareTo( valor.valorString() ) > 0 );
    }
    
    @Override
    public Valor maiorOuIgualA( Valor valor ) {
        return novoBooleano( this.valor.compareTo( valor.valorString() ) >= 0 );
    }
    
}
