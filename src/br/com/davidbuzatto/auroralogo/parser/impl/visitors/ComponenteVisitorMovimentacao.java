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
package br.com.davidbuzatto.auroralogo.parser.impl.visitors;

import br.com.davidbuzatto.auroralogo.gui.tartaruga.Tartaruga;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import br.com.davidbuzatto.auroralogo.parser.impl.AuroraLogoDesenhistaVisitor;
import br.com.davidbuzatto.auroralogo.parser.impl.Valor;
import static br.com.davidbuzatto.auroralogo.parser.impl.ValorUtils.*;

/**
 * Implementação dos métodos de visita para as instruções de movimentação.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class ComponenteVisitorMovimentacao {
    
    private Tartaruga tartaruga;
    private AuroraLogoDesenhistaVisitor visitor;
    
    public ComponenteVisitorMovimentacao( 
            Tartaruga tartaruga, 
            AuroraLogoDesenhistaVisitor visitor ) {
        this.tartaruga = tartaruga;
        this.visitor = visitor;
    }
    
    public Valor visitMovimentarDirecao( AuroraLogoParser.MovimentarDirecaoContext ctx ) {
        
        Valor valor = novoUmDecimal();
        
        if ( ctx.expr() != null ) {
            valor = visitor.visit( ctx.expr() );
        }
        
        if ( ctx.DIR() != null ) {
            tartaruga.moverParaDireita( valor.valorDecimal() );
        } else if ( ctx.ESQ() != null ) {
            tartaruga.moverParaEsquerda( valor.valorDecimal() );
        } else if ( ctx.CIM() != null ) {
            tartaruga.moverParaCima( valor.valorDecimal() );
        } else if ( ctx.BAI() != null ) {
            tartaruga.moverParaBaixo( valor.valorDecimal() );
        }
        
        return novoNulo();
        
    }
    
    public Valor visitMovimentarPonto( AuroraLogoParser.MovimentarPontoContext ctx ) {
        
        double x = visitor.visit( ctx.expr( 0 ) ).valorDecimal();
        double y = visitor.visit( ctx.expr( 1 ) ).valorDecimal();
        
        tartaruga.moverPara( x, y );
        
        return novoNulo();
        
    }
    
}
