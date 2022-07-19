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
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Representação de um valor do tipo arranjo associativo.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValorArranjoAssociativo extends Valor<LinkedHashMap<String, Object>> implements Serializable {
    
    public ValorArranjoAssociativo( LinkedHashMap<String, Object> valor ) {
        super( valor );
    }

    @Override
    public String getTipo() {
        return "ARRANJO_ASSOCIATIVO";
    }
    
    @Override
    public Valor diferenteDe( Valor valor ) {
        return novoVerdadeiro();
    }
    
    @Override
    public Valor somar( Valor valor ) {
        
        if ( valor.isString() ) {
            return concatenar( valor );
        }
        
        return this;
        
    }
    
    @Override
    public Valor subtrair( Valor valor ) {
        return this;
    }
    
    @Override
    public Valor multiplicar( Valor valor ) {
        return this;
    }
    
    @Override
    public Valor dividir( Valor valor ) {
        return this;
    }
    
    @Override
    public Valor resto( Valor valor ) {
        return this;
    }
    
    @Override
    public String toString() {
        return toStringArranjoAssociativo( valor );
    }
    
    public static String toStringArranjoAssociativo( LinkedHashMap<String, Object> mapa ) {
        
        StringBuilder sb = new StringBuilder();
        sb.append( "{" );
        boolean primeiro = true;
        
        for ( Map.Entry<String, Object> e : mapa.entrySet() ) {

            if ( !primeiro ) {
                sb.append( ", " );
            }

            sb.append( "\"" ).append( e.getKey() ).append("\"=");
            Object o = e.getValue();

            if ( o instanceof Object[] ) {
                ValorArranjo.toStringArranjo( (Object[]) o, sb );
            } else {
                if ( o instanceof String ) {
                    sb.append( "\"" ).append( o.toString() ).append("\"");
                } else if ( o instanceof Character ) {
                    sb.append( "'" ).append( o.toString() ).append("'");
                } else if ( o instanceof Valor ) {
                    Valor vv = (Valor) o;
                    if ( vv.isString() ) {
                        sb.append( "\"" ).append( vv ).append("\"");
                    } else if ( vv.isCaractere() ) {
                        sb.append( "'" ).append( vv ).append("'");
                    } else if ( vv.isArranjoAssociativo() ) {
                        sb.append( toStringArranjoAssociativo( ( (ValorArranjoAssociativo) vv ).valor ) );
                    } else {
                        sb.append( vv.toString() );
                    }
                } else {
                    sb.append( o.toString() );
                }
            }

            primeiro = false;
        }

        sb.append( "}" );
        
        return sb.toString();
        
    }
    
}
