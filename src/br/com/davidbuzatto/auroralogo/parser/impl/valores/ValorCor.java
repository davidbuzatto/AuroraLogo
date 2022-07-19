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
import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.Color;
import java.io.Serializable;

/**
 * Representação de um valor do tipo cor.
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValorCor extends Valor<Color> implements Serializable {
    
    public ValorCor( Color valor ) {
        super( valor );
    }

    @Override
    public String getTipo() {
        return "COR";
    }
    
    @Override
    public String toString() {
        return Utils.colorParaHexa( valor );
    }
    
    @Override
    public Valor somar( Valor valor ) {
        
        if ( valor.isString() ) {
            return concatenar( valor );
        }
        
        return novaCor( Utils.somarCores( this.valor, valor.valorCor() ) );
        
    }
    
    @Override
    public Valor subtrair( Valor valor ) {
        return novaCor( Utils.subtrairCores( this.valor, valor.valorCor() ) );
    }
    
    @Override
    public Valor multiplicar( Valor valor ) {
        return novaCor( Utils.multiplicarCores( this.valor, valor.valorCor() ) );
    }
    
    @Override
    public Valor dividir( Valor valor ) {
        return novaCor( Utils.dividirCores( this.valor, valor.valorCor() ) );
    }
    
    @Override
    public Valor resto( Valor valor ) {
        return novaCor( Utils.restoCores( this.valor, valor.valorCor() ) );
    }
    
    @Override
    public Valor igualA( Valor valor ) {
        return novoBooleano( this.valor.getRGB() == valor.valorInteiro() );
    }
    
    @Override
    public Valor diferenteDe( Valor valor ) {
        return novoBooleano( this.valor.getRGB() != valor.valorInteiro() );
    }
    
    @Override
    public Valor menorQue( Valor valor ) {
        return novoBooleano( this.valor.getRGB() < valor.valorInteiro() );
    }
    
    @Override
    public Valor menorOuIgualA( Valor valor ) {
        return novoBooleano( this.valor.getRGB() <= valor.valorInteiro() );
    }
    
    @Override
    public Valor maiorQue( Valor valor ) {
        return novoBooleano( this.valor.getRGB() > valor.valorInteiro() );
    }
    
    @Override
    public Valor maiorOuIgualA( Valor valor ) {
        return novoBooleano( this.valor.getRGB() >= valor.valorInteiro() );
    }
    
}
