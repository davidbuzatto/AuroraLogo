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
 * Representação de um valor do tipo caractere e suas constantes.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValorCaractere extends Valor<Character> implements Serializable {
    
    public ValorCaractere( Character valor ) {
        super( valor );
    }

    @Override
    public String getTipo() {
        return "CARACTERE";
    }
    
    @Override
    public String toString() {
        return String.valueOf( valor );
    }
    
}
