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

import br.com.davidbuzatto.auroralogo.gui.tartaruga.Tartaruga;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import static br.com.davidbuzatto.auroralogo.parser.impl.Valor.*;

/**
 * Implementação dos métodos de visita para instruções simples/básicas.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class ComponenteVisitorInstrucoesSimples {
    
    private Tartaruga tartaruga;
    private AuroraLogoDesenhistaVisitor visitor;
    
    public ComponenteVisitorInstrucoesSimples( 
            Tartaruga tartaruga, 
            AuroraLogoDesenhistaVisitor visitor ) {
        this.tartaruga = tartaruga;
        this.visitor = visitor;
    }
    
    public Valor visitGirar( AuroraLogoParser.GirarContext ctx ) {
        
        double valor = 1;
        
        if ( ctx.expr() != null ) {
            valor = visitor.visit( ctx.expr() ).valorDecimal();
        }
        
        tartaruga.girar( valor );
        
        return NULO;
        
    }
    
    public Valor visitAbaixar( AuroraLogoParser.AbaixarContext ctx ) {
        tartaruga.abaixarPincel();
        return NULO;
    }
    
    public Valor visitLevantar( AuroraLogoParser.LevantarContext ctx ) {
        tartaruga.levantarPincel();
        return NULO;
    }
    
    public Valor visitLimpar( AuroraLogoParser.LimparContext ctx ) {
        tartaruga.limpar();
        return NULO;
    }
    
    public Valor visitEngrossar( AuroraLogoParser.EngrossarContext ctx ) {
        
        double valor = 1;
        
        if ( ctx.expr() != null ) {
            valor = visitor.visit( ctx.expr() ).valorDecimal();
        }
        
        tartaruga.engrossar( valor );
        
        return NULO;
        
    }
    
    public Valor visitDesengrossar( AuroraLogoParser.DesengrossarContext ctx ) {
        
        double valor = 1;
        
        if ( ctx.expr() != null ) {
            valor = visitor.visit( ctx.expr() ).valorDecimal();
        }
        
        tartaruga.desengrossar( valor );
        
        return NULO;
        
    }
    
    public Valor visitTrocarGrossura( AuroraLogoParser.TrocarGrossuraContext ctx ) {
        tartaruga.setGrossura( visitor.visit( ctx.expr() ).valorDecimal() );
        return NULO;
    }
    
    public Valor visitConsultarTartaruga( AuroraLogoParser.ConsultarTartarugaContext ctx ) {
        
        if ( ctx.PX() != null ) {
            return novoDecimal( tartaruga.getXEstadoFinal() );
        } else if ( ctx.PY() != null ) {
            return novoDecimal( tartaruga.getYEstadoFinal() );
        } else if ( ctx.PA() != null ) {
            return novoDecimal( tartaruga.getAnguloEstadoFinal() );
        }
        
        return ZERO_DECIMAL;
        
    }
    
}
