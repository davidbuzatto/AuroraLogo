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

import br.com.davidbuzatto.auroralogo.gui.JanelaPrincipal;
import br.com.davidbuzatto.auroralogo.gui.tartaruga.Tartaruga;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import static br.com.davidbuzatto.auroralogo.parser.impl.Valor.*;
import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

/**
 * Implementação dos métodos de visita para lidar com entrada e saída.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class ComponenteVisitorEntradaSaida {
    
    private Tartaruga tartaruga;
    private JanelaPrincipal janelaPrincipal;
    private JTextPane textPaneSaida;
    private AuroraLogoDesenhistaVisitor visitor;
    
    public ComponenteVisitorEntradaSaida( 
            Tartaruga tartaruga, 
            JanelaPrincipal janelaPrincipal, 
            JTextPane textPaneSaida, 
            AuroraLogoDesenhistaVisitor visitor ) {
        this.tartaruga = tartaruga;
        this.janelaPrincipal = janelaPrincipal;
        this.textPaneSaida = textPaneSaida;
        this.visitor = visitor;
    }
    
    public Valor visitEscrever( AuroraLogoParser.EscreverContext ctx ) {
        
        String textoSaida;
        
        Valor v = visitor.visit( ctx.expr() );
        
        if ( v.isString() ) {
            textoSaida = String.valueOf( v );
        } else if ( v.isCaractere() ) {
            textoSaida = String.valueOf( v );
        } else if ( v.isCor() ) {
            textoSaida = String.valueOf( v );
        } else if ( v.isArranjo() || v.isArranjoAssociativo() ) {
            textoSaida = "\n" + Utils.toString( v.getValor() );
        } else {
            textoSaida = String.valueOf( v );
        }
        
        
        if ( ctx.PUL() != null ) {
            textoSaida += "\n";
        }
        
        if ( ctx.NA() != null ) {
            Utils.inserirMensagemEmitente( textPaneSaida, "tartaruga escreveu", textoSaida, tartaruga.getCor() );
        } else if ( ctx.NO() != null ) {
            
            JTextPane tp = new JTextPane();
            tp.setFont( new Font( "Consolas", 0, 13 ) );
            tp.setEditable( false );
            tp.setBackground( Utils.gerarComponenteGradiente( tartaruga.getCor(), Color.WHITE, 0.9 ) );
            tp.setBorder( new LineBorder( Utils.gerarComponenteGradiente( tartaruga.getCor(), Color.BLACK, 0.5 ) ) );
            tp.setFont( textPaneSaida.getFont() );
            
            Utils.inserirMensagemEmitente( tp, "tartaruga escreveu", textoSaida, tartaruga.getCor() );
            JOptionPane.showMessageDialog( janelaPrincipal, tp, "Mensagem", JOptionPane.PLAIN_MESSAGE );
            
        } else {
            tartaruga.setTexto( textoSaida );
        }
        
        return NULO;
        
    }
    
    public Valor visitLer( AuroraLogoParser.LerContext ctx ) {
        
        String id = Utils.gerarId( visitor.visit( ctx.processaId() ).valorIdentificador() );
        Valor valor = NULO;
        
        String idLimpo = Utils.formatarIdVariavelFuncao( id );
        
        String v = JOptionPane.showInputDialog( 
                       janelaPrincipal, String.format( "Entre com um valor para \"%s\":", idLimpo ) );
            
        if ( v != null ) {
            
            v = v.trim();
            
            boolean ok = false;
            
            try {
                valor = novoInteiro( Integer.parseInt( v ) );
                ok = true;
            } catch ( NumberFormatException exc ) {}
            
            if ( !ok ) {
                
                try {
                    valor = novoDecimal( Double.parseDouble( v ) );
                    ok = true;
                } catch ( NumberFormatException exc ) {}

                if ( !ok ) {
                    
                    switch ( v ) {
                        case "VERDADEIRO":
                            valor = VERDADEIRO;
                            break;
                        case "FALSO":
                            valor = FALSO;
                            break;
                        default:
                            if ( v.startsWith( "#" ) ) {
                                valor = novaCor( Utils.decodificarCor( v ) );
                                break;
                            } else if ( v.length() == 3 && v.startsWith( "'" ) && v.endsWith( "'" ) ) {
                                valor = novoCaractere( v.charAt( 1 ) );
                                break;
                            }
                            valor = novaString( v );
                            break;
                    }
                    
                }
                
            }
            
            tartaruga.inserirOuAtualizarMemoria( id, valor );
            
        }
        
        return NULO;
        
    }
    
    public Valor visitFormatarTexto( AuroraLogoParser.FormatarTextoContext ctx ) {
        
        String textoFormatado = "";
        String formato = ctx.STRING().getText();
        formato = formato.substring( 1, formato.length() - 1 );
        
        List<Object> valores = new ArrayList<>();
        
        for ( AuroraLogoParser.ExprContext c : ctx.expr() ) {
            Valor v = visitor.visit( c );
            if ( v.isInteiro() ) {
                valores.add( v.valorInteiro() );
            } else if ( v.isDecimal() ) {
                valores.add( v.valorDecimal() );
            } else if ( v.isCaractere() ) {
                valores.add( v.valorCaractere() );
            } else if ( v.isBooleano() ) {
                valores.add( v.valorBooleano() );
            } else if ( v.isString() ) {
                valores.add( v.valorString() );
            } else {
                valores.add( String.valueOf( v.getValor() ) );
            }
        }
        
        try {
            textoFormatado = String.format( Locale.US, formato, valores.toArray() );
        } catch ( IllegalFormatException exc ) {
            textoFormatado = "formato inválido";
        }
        
        return novaString( textoFormatado );
        
    }
    
}
