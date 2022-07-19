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

import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import br.com.davidbuzatto.auroralogo.parser.impl.AuroraLogoDesenhistaVisitor;
import br.com.davidbuzatto.auroralogo.parser.impl.Valor;
import static br.com.davidbuzatto.auroralogo.parser.impl.ValorUtils.*;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Implementação dos métodos de visita para tratamento de expressões.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class ComponenteVisitorExpressaoRelacaoTermo {

    private AuroraLogoDesenhistaVisitor visitor;

    public ComponenteVisitorExpressaoRelacaoTermo(
            AuroraLogoDesenhistaVisitor visitor ) {
        this.visitor = visitor;
    }
    
    public Valor visitExpr( AuroraLogoParser.ExprContext ctx ) {

        Valor valor = novoZeroInteiro();

        for ( int i = 0; i < ctx.getChildCount(); i += 2 ) {

            if ( i == 0 ) {
                valor = visitor.visit( ctx.getChild( i ) );
            } else {

                int op = ( ( TerminalNode ) ctx.getChild( i - 1 ) ).getSymbol().getType();
                Valor rv = visitor.visit( ctx.getChild( i ) );

                switch ( op ) {
                    
                    case AuroraLogoParser.ELG:
                    case AuroraLogoParser.ELGT:
                        valor = valor.eLogico( rv );
                        break;
                        
                    case AuroraLogoParser.OLG:
                    case AuroraLogoParser.OLGT:
                        valor = valor.ouLogico( rv );
                        break;
                        
                }

            }

        }

        return valor;

    }
    
    public Valor visitRelacao( AuroraLogoParser.RelacaoContext ctx ) {

        Valor valor = visitor.visit( ctx.exprSimp( 0 ) );

        if ( ctx.opRel != null ) {

            Valor rv = visitor.visit( ctx.exprSimp( 1 ) );

            switch ( ctx.opRel.getType() ) {
                
                case AuroraLogoParser.IGU:
                case AuroraLogoParser.IGUT:
                case AuroraLogoParser.IGUA:
                    return valor.igualA( rv );
                    
                case AuroraLogoParser.DIF:
                case AuroraLogoParser.DIFT:
                case AuroraLogoParser.DIFA:
                    return valor.diferenteDe( rv );
                    
                case AuroraLogoParser.ME:
                case AuroraLogoParser.MET:
                case AuroraLogoParser.MEA:
                    return valor.menorQue( rv );
                    
                case AuroraLogoParser.MEI:
                case AuroraLogoParser.MEIT:
                case AuroraLogoParser.MEIA:
                    return valor.menorOuIgualA( rv );
                    
                case AuroraLogoParser.MA:
                case AuroraLogoParser.MAT:
                case AuroraLogoParser.MAA:
                    return valor.maiorQue( rv );
                    
                case AuroraLogoParser.MAI:
                case AuroraLogoParser.MAIT:
                case AuroraLogoParser.MAIA:
                    return valor.maiorOuIgualA( rv );
                    
            }

            return novoFalso();

        }

        return valor;

    }
    
    public Valor visitExprSimp( AuroraLogoParser.ExprSimpContext ctx ) {

        Valor valor = novoZeroInteiro();
        Valor mult = novoUmInteiro();
        int ini = 0;

        if ( ctx.opNeg != null && ctx.opNeg.getType() == AuroraLogoParser.SUB ) {
            mult = novoInteiro( -1 );
            ini = 1;
        }

        for ( int i = ini; i < ctx.getChildCount(); i += 2 ) {

            if ( i == ini ) {
                valor = visitor.visit( ctx.getChild( i ) );
            } else {

                int op = ( ( TerminalNode ) ctx.getChild( i - 1 ) ).getSymbol().getType();
                Valor tv = visitor.visit( ctx.getChild( i ) );

                switch ( op ) {
                    
                    case AuroraLogoParser.ADI:
                    case AuroraLogoParser.ADIA:
                        valor = valor.somar( tv );
                        break;
                        
                    case AuroraLogoParser.SUB:
                    case AuroraLogoParser.SUBA:
                        valor = valor.subtrair( tv );
                        break;
                        
                }
            }

        }

        if ( valor.isInteiro() ) {
            return novoInteiro( mult.valorInteiro() * valor.valorInteiro() );
        } else if ( valor.isDecimal() ) {
            return novoDecimal( mult.valorInteiro() * valor.valorDecimal() );
        } else {
            return valor;
        }

    }
    
    public Valor visitTermo( AuroraLogoParser.TermoContext ctx ) {

        Valor valor = novoZeroInteiro();

        for ( int i = 0; i < ctx.getChildCount(); i += 2 ) {

            if ( i == 0 ) {
                valor = visitor.visit( ctx.getChild( i ) );
            } else {

                int op = ( ( TerminalNode ) ctx.getChild( i - 1 ) ).getSymbol().getType();
                Valor fv = visitor.visit( ctx.getChild( i ) );

                switch ( op ) {
                    
                    case AuroraLogoParser.MUL:
                    case AuroraLogoParser.VEZ:
                        valor = valor.multiplicar( fv );
                        break;
                        
                    case AuroraLogoParser.DIV:
                    case AuroraLogoParser.DIVA:
                        valor = valor.dividir( fv );
                        break;
                        
                    case AuroraLogoParser.MOD:
                    case AuroraLogoParser.MODA:
                        valor = valor.resto( fv );
                        break;

                }

            }

        }

        return valor;

    }

}
