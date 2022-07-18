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
import java.io.Serializable;

/**
 * Representação de um valor do tipo arranjo.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValorArranjo extends Valor<Object> implements Serializable {
    
    public ValorArranjo( Object valor ) {
        super( valor );
    }

    @Override
    public String getTipo() {
        return "ARRANJO";
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toStringArranjo( (Object[]) valor, sb );
        return sb.toString();
    }
    
    public static void toStringArranjo( Object[] valoresArranjo, StringBuilder sb ) {
        
        boolean primeiro = true;
        sb.append( "[" );
        
        for ( Object o : valoresArranjo ) {
            if ( !primeiro ) {
                sb.append( ", " );
            }
            if ( o instanceof Object[] ) {
                toStringArranjo( (Object[]) o, sb );
            } else {
                if ( o instanceof String ) {
                    sb.append( "\"" ).append( o.toString() ).append("\"");
                } else if ( o instanceof Character ) {
                    sb.append( "'" ).append( o.toString() ).append("'");
                } else if ( o instanceof Valor ) {
                    Valor v = (Valor) o;
                    if ( v.isString() ) {
                        StringBuilder append = sb.append( "\"" + v + "\"" );
                    } else if ( v.isCaractere() ) {
                        sb.append( "'" ).append( v ).append("'");
                    } else if ( v.isArranjoAssociativo() ) {
                        sb.append( ValorArranjoAssociativo.toStringArranjoAssociativo( ( (ValorArranjoAssociativo) v ).getValor() ) );
                    } else {
                        sb.append( v.toString() );
                    }
                } else {
                    sb.append( o.toString() );
                }
            }
            primeiro = false;
        }
        
        sb.append( "]" );
        
    }
    
}
