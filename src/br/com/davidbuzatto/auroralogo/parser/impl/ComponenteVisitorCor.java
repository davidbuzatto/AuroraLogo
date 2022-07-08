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
public class ComponenteVisitorCor {
    
    private Tartaruga tartaruga;
    private AuroraLogoDesenhistaVisitor visitor;
    
    public ComponenteVisitorCor( 
            Tartaruga tartaruga, 
            AuroraLogoDesenhistaVisitor visitor ) {
        this.tartaruga = tartaruga;
        this.visitor = visitor;
    }
    
    public Valor visitTrocarCorPincel( AuroraLogoParser.TrocarCorPincelContext ctx ) {
        tartaruga.trocarCorPincel( obterCor( Color.BLACK, ctx ) );
        return NULO;
    }
    
    public Valor visitTrocarCorPreenchimento( AuroraLogoParser.TrocarCorPreenchimentoContext ctx ) {
        tartaruga.trocarCorPreenchimento( obterCor( Color.WHITE, ctx ) );
        return NULO;
    }
    
    public Valor visitTrocarCorFundo( AuroraLogoParser.TrocarCorFundoContext ctx ) {
        tartaruga.trocarCorFundo( obterCor( Color.WHITE, ctx ) );
        return NULO;
    }
    
    private Color obterCor( Color corInicial, AuroraLogoParser.TrocarCorContext ctx ) {
        
        Color cor = corInicial;
        AuroraLogoParser.ConfiguracaoCorContext configuracaoCor = null;
        
        if ( ctx instanceof AuroraLogoParser.TrocarCorPincelContext ) {
            configuracaoCor = ( (AuroraLogoParser.TrocarCorPincelContext) ctx ).configuracaoCor();
        } else if ( ctx instanceof AuroraLogoParser.TrocarCorPreenchimentoContext ) {
            configuracaoCor = ( (AuroraLogoParser.TrocarCorPreenchimentoContext) ctx ).configuracaoCor();
        } else if ( ctx instanceof AuroraLogoParser.TrocarCorFundoContext ) {
            configuracaoCor = ( (AuroraLogoParser.TrocarCorFundoContext) ctx ).configuracaoCor();
        }
        
        if ( configuracaoCor.cor() != null ) {
            
            Valor c = visitor.visit( configuracaoCor.cor() );
            cor = c.valorCor();
            
        } else if ( configuracaoCor.expr() != null ) {
            
            Valor c = visitor.visit( configuracaoCor.expr( 0 ) );
            if ( c.isCor() ) {
                cor = c.valorCor();
            }
            
        } else {
            
            switch ( configuracaoCor.corEx.getType() ) {
                case AuroraLogoParser.PRETO:
                    cor = Color.BLACK;
                    break;
                case AuroraLogoParser.AZUL:
                    cor = Color.BLUE;
                    break;
                case AuroraLogoParser.CIANO:
                    cor = Color.CYAN;
                    break;
                case AuroraLogoParser.CINZA:
                    cor = Color.GRAY;
                    break;
                case AuroraLogoParser.VERDE:
                    cor = Color.GREEN;
                    break;
                case AuroraLogoParser.MAGENTA:
                    cor = Color.MAGENTA;
                    break;
                case AuroraLogoParser.LARANJA:
                    cor = Color.ORANGE;
                    break;
                case AuroraLogoParser.ROSA:
                    cor = Color.PINK;
                    break;
                case AuroraLogoParser.VERMELHO:
                    cor = Color.RED;
                    break;
                case AuroraLogoParser.BRANCO:
                    cor = Color.WHITE;
                    break;
                case AuroraLogoParser.AMARELO:
                    cor = Color.YELLOW;
                    break;
            }
            
        }
        
        int vezes = 0;
        
        if ( configuracaoCor.VEZ() != null || configuracaoCor.VEZS() != null ) {
            vezes = visitor.visit( configuracaoCor.expr().get( configuracaoCor.expr().size() -1 ) ).valorInteiro();
            if ( vezes < 0 ) {
                vezes = 0;
            }
        }
        
        for ( int i = 0; i < vezes; i++ ) {
            if ( configuracaoCor.CLARO() != null ) {
                cor = cor.brighter();
            } else if ( configuracaoCor.ESCURO() != null ) {
                cor = cor.darker();
            }
        }
        
        return cor;
        
    }

    public Valor visitCor( AuroraLogoParser.CorContext ctx ) {
        
        Color cor = Color.decode( ctx.CHEX().getText().substring( 0, 7 ) );
            
        if ( ctx.CHEX().getText().length() == 9 ) {
            String alpha = ctx.CHEX().getText().substring( 7 );
            cor = new Color( cor.getRed(), cor.getGreen(), cor.getBlue(), Integer.valueOf( alpha, 16 ) );
        }
        
        return novaCor( cor );
        
    }
    
}
