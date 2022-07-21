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
import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.Color;

/**
 * Implementação dos métodos de visita para lidar com cores.
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
        return novoNulo();
    }
    
    public Valor visitTrocarCorPreenchimento( AuroraLogoParser.TrocarCorPreenchimentoContext ctx ) {
        tartaruga.trocarCorPreenchimento( obterCor( Color.WHITE, ctx ) );
        return novoNulo();
    }
    
    public Valor visitTrocarCorFundo( AuroraLogoParser.TrocarCorFundoContext ctx ) {
        tartaruga.trocarCorFundo( obterCor( Color.WHITE, ctx ) );
        return novoNulo();
    }
    
    public Valor visitCriarCor( AuroraLogoParser.CriarCorContext ctx ) {
        
        int r = visitor.visit( ctx.expr( 0 ) ).valorInteiro();
        int g = visitor.visit( ctx.expr( 1 ) ).valorInteiro();
        int b = visitor.visit( ctx.expr( 2 ) ).valorInteiro();
        int a = 255;
        
        if ( ctx.expr().size() == 4 ) {
            a = visitor.visit( ctx.expr( 3 ) ).valorInteiro();
        }
        
        return novaCor( Utils.criarCorRGBA( r, g, b, a ) );
        
    }
    
    public Valor visitCor( AuroraLogoParser.CorContext ctx ) {
        
        if ( ctx.CHEX() != null ) {
            return novaCor( Utils.decodificarCor( ctx.CHEX().getText() ) );
        } else if ( ctx.criarCor() != null ) {
            return visitor.visit( ctx.criarCor() );
        } else if ( ctx.corExtenso() != null ) {
            return visitor.visit( ctx.corExtenso() );
        }
        
        return novaCor( Color.BLACK );
        
    }
    
    public Valor visitCorExtenso( AuroraLogoParser.CorExtensoContext ctx ) {
        
        Color cor = Color.BLACK;
        
        if ( ctx.PRETO() != null ) {
            cor = Color.decode( "#000000" );
        } else if ( ctx.AZUL() != null ) {
            cor = Color.decode( "#0000ff" );
        } else if ( ctx.CIANO() != null ) {
            cor = Color.decode( "#00ffff" );
        } else if ( ctx.CINZA() != null ) {
            cor = Color.decode( "#808080" );
        } else if ( ctx.VERDE() != null ) {
            cor = Color.decode( "#00ff00" );
        } else if ( ctx.MAGENTA() != null ) {
            cor = Color.decode( "#ff00ff" );
        } else if ( ctx.LARANJA() != null ) {
            cor = Color.decode( "#fc8f00" );
        } else if ( ctx.ROSA() != null ) {
            cor = Color.decode( "#fc005c" );
        } else if ( ctx.VERMELHO() != null ) {
            cor = Color.decode( "#ff0000" );
        } else if ( ctx.BRANCO() != null ) {
            cor = Color.decode( "#ffffff" );
        } else if ( ctx.AMARELO() != null ) {
            cor = Color.decode( "#ffff00" );
        }
        
        return novaCor( cor );
        
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
        
        // CHEX, criarCor e corExtenso
        if ( configuracaoCor.cor() != null ) {
            
            Valor c = visitor.visit( configuracaoCor.cor() );
            cor = c.valorCor();
            
        } else if ( configuracaoCor.expr( 0 ) != null ) {
            
            Valor c = visitor.visit( configuracaoCor.expr( 0 ) );
            
            if ( c.isCor() ) {
                cor = c.valorCor();
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
                cor = Utils.gerarComponenteGradienteAlpha( cor, Color.WHITE, 0.1 );
            } else if ( configuracaoCor.ESCURO() != null ) {
                cor = Utils.gerarComponenteGradienteAlpha( cor, Color.BLACK, 0.1 );
            }
        }
        
        return cor;
        
    }
    
}
