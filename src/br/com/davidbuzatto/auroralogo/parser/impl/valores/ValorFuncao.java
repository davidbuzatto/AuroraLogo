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

import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import br.com.davidbuzatto.auroralogo.parser.impl.Valor;
import java.io.Serializable;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Representação de um valor do tipo função.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValorFuncao extends Valor<AuroraLogoParser.FuncContext> implements Serializable {
    
    public ValorFuncao( AuroraLogoParser.FuncContext valor ) {
        super( valor );
    }

    @Override
    public String getTipo() {
        return "FUNÇÃO";
    }
    
    @Override
    public String toString() {
        return "função(" + montarListaParametros( valor ) + ")";
    }
    
    public static String montarListaParametros( AuroraLogoParser.FuncContext ctx ) {
        
        String s = "";
        
        boolean primeiro = true;
        for ( TerminalNode t : ctx.ID() ) {
            if ( !primeiro ) {
                s += ", ";
            }
            s += t.getText();
            primeiro = false;
        }
        
        return s;
        
    }
    
}
