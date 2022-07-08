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
import java.awt.Color;

/**
 *
 * @author Prof. Dr. David Buzatto
 */
public class ComponenteVisitorFatores {
    
    private Tartaruga tartaruga;
    private AuroraLogoDesenhistaVisitor visitor;
    
    public ComponenteVisitorFatores( 
            Tartaruga tartaruga, 
            AuroraLogoDesenhistaVisitor visitor ) {
        this.tartaruga = tartaruga;
        this.visitor = visitor;
    }
    
    public Valor visitFatorNao( AuroraLogoParser.FatorNaoContext ctx ) {
        
        Valor valor = visitor.visit( ctx.fator() );
            
        if ( ctx.NAO() != null || ctx.NAOT() != null ) {
            if ( valor.isFalso() ) {
                return VERDADEIRO;
            } else {
                return FALSO;
            }
        }
        
        // nunca deve chegar aqui!
        return valor;
        
    }
    
    public Valor visitFatorInt( AuroraLogoParser.FatorIntContext ctx ) {
        return Valor.novoInteiro( ctx.INT().getText() );
    }
    
    public Valor visitFatorDec( AuroraLogoParser.FatorDecContext ctx ) {
        return Valor.novoDecimal( ctx.DEC().getText() );
    }
    
    public Valor visitFatorPi( AuroraLogoParser.FatorPiContext ctx ) {
        return PI_DECIMAL;
    }
    
    public Valor visitFatorId( AuroraLogoParser.FatorIdContext ctx ) {
        
        if ( ctx.fatorBool() != null ) {
            return visitor.visit( ctx.fatorBool() );
        }
        
        String id = ctx.ID().getText();
        return tartaruga.lerMemoria( id );
        
    }
    
    public Valor visitFatorBool( AuroraLogoParser.FatorBoolContext ctx ) {
        if ( ctx.VER() != null ) {
            return VERDADEIRO;
        }
        return FALSO;
    }
    
    public Valor visitFatorChar( AuroraLogoParser.FatorCharContext ctx ) {
        return novoCaractere( ctx.getText().substring( 1, ctx.getText().length() - 1 ).charAt( 0 ) );
    }
    
    public Valor visitFatorString( AuroraLogoParser.FatorStringContext ctx ) {
        return novaString( ctx.getText().substring( 1, ctx.getText().length() - 1 ) );
    }
    
    public Valor visitFatorCor( AuroraLogoParser.FatorCorContext ctx ) {
        
        String strCor = ctx.cor().CHEX().getText();
        Color cor = Color.decode( strCor.substring( 0, 7 ) );
            
        if ( strCor.length() == 9 ) {
            String alpha = strCor.substring( 7 );
            cor = new Color( cor.getRed(), cor.getGreen(), cor.getBlue(), Integer.valueOf( alpha, 16 ) );
        }
        
        return novaCor( cor );
        
    }
    
    public Valor visitFatorParenteses( AuroraLogoParser.FatorParentesesContext ctx ) {
        return visitor.visit( ctx.expr() );
    }
    
}
