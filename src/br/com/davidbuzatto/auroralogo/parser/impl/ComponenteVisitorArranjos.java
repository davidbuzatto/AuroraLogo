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

import br.com.davidbuzatto.auroralogo.gui.Tartaruga;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import static br.com.davidbuzatto.auroralogo.parser.impl.Valor.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementação dos métodos de visita para os arranjos.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class ComponenteVisitorArranjos {
    
    private Tartaruga tartaruga;
    private AuroraLogoDesenhistaVisitor visitor;
    
    public ComponenteVisitorArranjos( 
            Tartaruga tartaruga, 
            AuroraLogoDesenhistaVisitor visitor ) {
        this.tartaruga = tartaruga;
        this.visitor = visitor;
    }
    
    public Valor visitCriarArranjo( AuroraLogoParser.CriarArranjoContext ctx ) {
        
        List<Integer> dimensoes = new ArrayList<>();
        
        for ( AuroraLogoParser.ExprContext c : ctx.expr() ) {
            
            Valor v = visitor.visit( c );
            dimensoes.add( v.valorInteiro() );
            
        }
        
        return novoArranjo( dimensoes.toArray( Integer[]::new ) );
        
    }

    public Valor visitCriarArranjoAssociativo( AuroraLogoParser.CriarArranjoAssociativoContext ctx ) {
        return novoArranjoAssociativo();
    }
    
}
