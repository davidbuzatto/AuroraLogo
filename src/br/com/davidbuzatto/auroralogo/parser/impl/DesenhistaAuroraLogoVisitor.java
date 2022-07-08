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
import br.com.davidbuzatto.auroralogo.gui.Tartaruga;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoBaseVisitor;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser.CorContext;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser.InstCaminhoContext;
import static br.com.davidbuzatto.auroralogo.parser.impl.Valor.*;
import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.Color;
import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Implementação do padrão de projeto Visitor para a AST resultante da análise
 * do código fonte da lingugaem AuroraLogo. É nessa classe que todas as ações
 * relativas a cada tipo de construção são tomadas.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class DesenhistaAuroraLogoVisitor extends AuroraLogoBaseVisitor<Valor> {

    private Tartaruga tartaruga;
    private JanelaPrincipal janelaPrincipal;
    private JTextPane textPaneSaida;
    private Random gerador;
    
    // identificador das instruções de repetição (repetir ... vezes, 
    // enquanto ... repetir) e condicionais (usando .. escolha) usado pela
    // instruçã "parar" para sinalizar quem deve ser interrompido.
    private int idInstrucaoParavel;
    
    public DesenhistaAuroraLogoVisitor( 
            Tartaruga tartaruga, 
            JanelaPrincipal janelaPrincipal, 
            JTextPane textPaneSaida ) {
        this.tartaruga = tartaruga;
        this.tartaruga.limpar();
        this.janelaPrincipal = janelaPrincipal;
        this.textPaneSaida = textPaneSaida;
        this.gerador = new Random();
    }
    
    @Override
    public Valor visitMovimentarDirecao( AuroraLogoParser.MovimentarDirecaoContext ctx ) {
        
        Valor valor = UM_DECIMAL;
        
        if ( ctx.expr() != null ) {
            valor = visit( ctx.expr() );
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
        
        return NULO;
        
    }
    
    @Override
    public Valor visitMovimentarPonto( AuroraLogoParser.MovimentarPontoContext ctx ) {
        
        double x = visit( ctx.expr( 0 ) ).valorDecimal();
        double y = visit( ctx.expr( 1 ) ).valorDecimal();
        
        tartaruga.moverPara( x, y );
        
        return NULO;
        
    }
    
    @Override
    public Valor visitTrocarCorPincel( AuroraLogoParser.TrocarCorPincelContext ctx ) {
        tartaruga.trocarCorPincel( obterCor( Color.BLACK, ctx ) );
        return NULO;
    }
    
    @Override
    public Valor visitTrocarCorPreenchimento( AuroraLogoParser.TrocarCorPreenchimentoContext ctx ) {
        tartaruga.trocarCorPreenchimento( obterCor( Color.WHITE, ctx ) );
        return NULO;
    }
    
    @Override
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
            
            Valor c = visit( configuracaoCor.cor() );
            cor = c.valorCor();
            
        } else if ( configuracaoCor.expr() != null ) {
            
            Valor c = visit( configuracaoCor.expr( 0 ) );
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
            vezes = visit( configuracaoCor.expr().get( configuracaoCor.expr().size() -1 ) ).valorInteiro();
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

    @Override
    public Valor visitCor( AuroraLogoParser.CorContext ctx ) {
        
        Color cor = Color.decode( ctx.CHEX().getText().substring( 0, 7 ) );
            
        if ( ctx.CHEX().getText().length() == 9 ) {
            String alpha = ctx.CHEX().getText().substring( 7 );
            cor = new Color( cor.getRed(), cor.getGreen(), cor.getBlue(), Integer.valueOf( alpha, 16 ) );
        }
        
        return novaCor( cor );
        
    }
    
    @Override
    public Valor visitGirar( AuroraLogoParser.GirarContext ctx ) {
        
        double valor = 1;
        
        if ( ctx.expr() != null ) {
            valor = visit( ctx.expr() ).valorDecimal();
        }
        
        tartaruga.girar( valor );
        
        return NULO;
        
    }

    @Override
    public Valor visitEngrossar( AuroraLogoParser.EngrossarContext ctx ) {
        
        double valor = 1;
        
        if ( ctx.expr() != null ) {
            valor = visit( ctx.expr() ).valorDecimal();
        }
        
        tartaruga.engrossar( valor );
        
        return NULO;
        
    }

    @Override
    public Valor visitDesengrossar( AuroraLogoParser.DesengrossarContext ctx ) {
        
        double valor = 1;
        
        if ( ctx.expr() != null ) {
            valor = visit( ctx.expr() ).valorDecimal();
        }
        
        tartaruga.desengrossar( valor );
        
        return NULO;
        
    }

    @Override
    public Valor visitTrocarGrossura( AuroraLogoParser.TrocarGrossuraContext ctx ) {
        tartaruga.setGrossura( visit( ctx.expr() ).valorDecimal() );
        return NULO;
    }

    @Override
    public Valor visitEscrever( AuroraLogoParser.EscreverContext ctx ) {
        
        String textoSaida;
        
        Valor v = visit( ctx.expr() );
        
        if ( v.isBooleano() ) {
            textoSaida = String.valueOf( v );
        } else {
            textoSaida = String.valueOf( v.getValor() );
        }
        
        if ( ctx.PUL() != null ) {
            textoSaida += "\n";
        }
        
        if ( ctx.NA() != null ) {
            Utils.inserirMensagemEmitente( textPaneSaida, "tartaruga escreveu", textoSaida, tartaruga.getCor() );
        } else if ( ctx.NO() != null ) {
            JTextPane tp = new JTextPane();
            tp.setFont( textPaneSaida.getFont() );
            Utils.inserirMensagemEmitente( tp, "tartaruga escreveu", textoSaida, tartaruga.getCor() );
            JOptionPane.showMessageDialog( janelaPrincipal, tp, "Mensagem", JOptionPane.PLAIN_MESSAGE );
        } else {
            tartaruga.setTexto( textoSaida );
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitLer( AuroraLogoParser.LerContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = NULO;
        
        String v = JOptionPane.showInputDialog( 
                       janelaPrincipal, String.format( "Entre com um valor para \"%s\":", id ) );
            
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
                            if ( v.length() == 3 && v.startsWith( "'" ) && v.endsWith( "'" ) ) {
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

    @Override
    public Valor visitAbaixar( AuroraLogoParser.AbaixarContext ctx ) {
        tartaruga.abaixarPincel();
        return NULO;
    }

    @Override
    public Valor visitLevantar( AuroraLogoParser.LevantarContext ctx ) {
        tartaruga.levantarPincel();
        return NULO;
    }

    @Override
    public Valor visitLimpar( AuroraLogoParser.LimparContext ctx ) {
        tartaruga.limpar();
        return NULO;
    }
    
    @Override
    public Valor visitAtribuirPadrao( AuroraLogoParser.AtribuirPadraoContext ctx ) {
        
        String id = ctx.ID().getText();
        
        Valor valor = visit( ctx.expr() );
        tartaruga.inserirOuAtualizarMemoria( id, valor );
        
        return valor;
        
    }
    
    @Override
    public Valor visitAtribuirAdicao( AuroraLogoParser.AtribuirAdicaoContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria.somar( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN.somar( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN.somar( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        } else if ( vMemoria.isString() ) {
            vMemoria.contatenar( valor );
            tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
        }
        
        return vMemoria;
        
    }
    
    @Override
    public Valor visitAtribuirSubtracao( AuroraLogoParser.AtribuirSubtracaoContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria.subtrair( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN.subtrair( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN.subtrair( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        }
        
        return vMemoria;
        
    }
    
    @Override
    public Valor visitAtribuirMultiplicacao( AuroraLogoParser.AtribuirMultiplicacaoContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria.multiplicar( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN.multiplicar( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN.multiplicar( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        }
        
        return vMemoria;
        
    }
    
    @Override
    public Valor visitAtribuirDivisao( AuroraLogoParser.AtribuirDivisaoContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria.dividir( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN.dividir( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN.dividir( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        }
        
        return vMemoria;
        
    }
    
    @Override
    public Valor visitAtribuirResto( AuroraLogoParser.AtribuirRestoContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = visit( ctx.expr() );
        
        Valor vMemoria = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            if ( vMemoria.isNumero() ) {
                vMemoria.resto( valor );
                tartaruga.inserirOuAtualizarMemoria( id, vMemoria );
            } else if ( vMemoria.isNulo() ) {
                if ( valor.isInteiro() ) {
                    Valor vN = novoInteiro( 0 );
                    vN.resto( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                } else if ( valor.isDecimal() ) {
                    Valor vN = novoDecimal( 0.0 );
                    vN.resto( valor );
                    tartaruga.inserirOuAtualizarMemoria( id, vN );
                }
            }
        }
        
        return vMemoria;
        
    }

    @Override
    public Valor visitExpr( AuroraLogoParser.ExprContext ctx ) {
        
        Valor valor = ZERO_INTEIRO;
        
        for ( int i = 0; i < ctx.getChildCount(); i += 2 ) {
            
            if ( i == 0 ) {
                valor = visit( ctx.getChild( i ) );
            } else {
                
                int op = ( (TerminalNode) ctx.getChild( i-1 ) ).getSymbol().getType();
                Valor rv = visit( ctx.getChild( i ) );
                
                switch ( op ) {
                    case AuroraLogoParser.ELG:
                    case AuroraLogoParser.ELGT:
                        valor = novoBooleano( valor.valorBooleano() && rv.valorBooleano() );
                        break;
                    case AuroraLogoParser.OLG:
                    case AuroraLogoParser.OLGT:
                        valor = novoBooleano( valor.valorBooleano() || rv.valorBooleano() );
                        break;
                }
                
            }
            
        }
            
        return valor;
        
    }
    
    @Override
    public Valor visitRelacao( AuroraLogoParser.RelacaoContext ctx ) {
        
        Valor valor = visit( ctx.exprSimp( 0 ) );
        
        if ( ctx.opRel != null ) {
            
            Valor rv = visit( ctx.exprSimp( 1 ) );
            boolean res = false;
            
            switch ( ctx.opRel.getType() ) {
                case AuroraLogoParser.IGU:
                case AuroraLogoParser.IGUT:
                case AuroraLogoParser.IGUA:
                    if ( valor.isInteiro() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorInteiro().intValue() == rv.valorInteiro().intValue();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorInteiro().intValue() == rv.valorDecimal().doubleValue();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorInteiro().intValue() == rv.valorCaractere().charValue();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorInteiro() != 0 ) == rv.valorBooleano();
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorInteiro() ).equals( rv.valorString() );
                        } else {
                            res = false;
                        }
                    } else if ( valor.isDecimal() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorDecimal().doubleValue() == rv.valorInteiro().intValue();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorDecimal().doubleValue() == rv.valorDecimal().doubleValue();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorDecimal().doubleValue() == rv.valorCaractere().charValue();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorDecimal() != 0.0 ) == rv.valorBooleano();
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorDecimal() ).equals( rv.valorString() );
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCaractere() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCaractere().charValue() == rv.valorInteiro().intValue();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCaractere().charValue() == rv.valorDecimal().doubleValue();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCaractere().charValue() == rv.valorCaractere().charValue();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorCaractere() != '\0' ) == rv.valorBooleano();
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCaractere() ).equals( rv.valorString() );
                        } else {
                            res = false;
                        }
                    } else if ( valor.isBooleano() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorBooleano() == ( rv.valorInteiro() != 0 );
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorBooleano() == ( rv.valorDecimal() != 0.0 );
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorBooleano() == ( rv.valorCaractere() != '\0' );
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorBooleano().booleanValue() == rv.valorBooleano().booleanValue();
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).equals( rv.valorString() );
                        } else {
                            res = false;
                        }
                    } else if ( valor.isString() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorString().equals( String.valueOf( rv.valorInteiro() ) );
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorString().equals( String.valueOf( rv.valorDecimal() ) );
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorString().equals( String.valueOf( rv.valorCaractere() ) );
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorString().equals( String.valueOf( rv ) );
                        } else if ( rv.isString() ) {
                            res = valor.valorString().equals( rv.valorString() );
                        } else {
                            res = false;
                        }
                    } else {
                        res = false;
                    }
                    break;
                case AuroraLogoParser.DIF:
                case AuroraLogoParser.DIFT:
                case AuroraLogoParser.DIFA:
                    if ( valor.isInteiro() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorInteiro().intValue() != rv.valorInteiro().intValue();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorInteiro().intValue() != rv.valorDecimal().doubleValue();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorInteiro().intValue() != rv.valorCaractere().charValue();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorInteiro() != 0 ) != rv.valorBooleano();
                        } else if ( rv.isString() ) {
                            res = !String.valueOf( valor.valorInteiro() ).equals( rv.valorString() );
                        } else {
                            res = false;
                        }
                    } else if ( valor.isDecimal() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorDecimal().doubleValue() != rv.valorInteiro().intValue();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorDecimal().doubleValue() != rv.valorDecimal().doubleValue();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorDecimal().doubleValue() != rv.valorCaractere().charValue();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorDecimal() != 0.0 ) != rv.valorBooleano();
                        } else if ( rv.isString() ) {
                            res = !String.valueOf( valor.valorDecimal() ).equals( rv.valorString() );
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCaractere() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCaractere().charValue() != rv.valorInteiro().intValue();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCaractere().charValue() != rv.valorDecimal().doubleValue();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCaractere().charValue() != rv.valorCaractere().charValue();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorCaractere() != '\0' ) != rv.valorBooleano();
                        } else if ( rv.isString() ) {
                            res = !String.valueOf( valor.valorCaractere() ).equals( rv.valorString() );
                        } else {
                            res = false;
                        }
                    } else if ( valor.isBooleano() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorBooleano() != ( rv.valorInteiro() != 0 );
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorBooleano() != ( rv.valorDecimal() != 0.0 );
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorBooleano() != ( rv.valorCaractere() != '\0' );
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorBooleano().booleanValue() != rv.valorBooleano().booleanValue();
                        } else if ( rv.isString() ) {
                            res = !String.valueOf( valor ).equals( rv.valorString() );
                        } else {
                            res = false;
                        }
                    } else if ( valor.isString() ) {
                        if ( rv.isInteiro() ) {
                            res = !valor.valorString().equals( String.valueOf( rv.valorInteiro() ) );
                        } else if ( rv.isDecimal() ) {
                            res = !valor.valorString().equals( String.valueOf( rv.valorDecimal() ) );
                        } else if ( rv.isCaractere() ) {
                            res = !valor.valorString().equals( String.valueOf( rv.valorCaractere() ) );
                        } else if ( rv.isBooleano() ) {
                            res = !valor.valorString().equals( String.valueOf( rv ) );
                        } else if ( rv.isString() ) {
                            res = !valor.valorString().equals( rv.valorString() );
                        } else {
                            res = false;
                        }
                    } else {
                        res = false;
                    }
                    break;
                case AuroraLogoParser.ME:
                case AuroraLogoParser.MET:
                case AuroraLogoParser.MEA:
                    if ( valor.isInteiro() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorInteiro() < rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorInteiro() < rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorInteiro() < rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorInteiro() < ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorInteiro() ).compareTo( rv.valorString() ) < 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isDecimal() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorDecimal() < rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorDecimal() < rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorDecimal() < rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorDecimal() < ( rv.valorBooleano() ? 1.0 : 0.0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorDecimal() ).compareTo( rv.valorString() ) < 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCaractere() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCaractere() < rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCaractere() < rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCaractere() < rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorCaractere() < ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCaractere() ).compareTo( rv.valorString() ) < 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isBooleano() ) {
                        if ( rv.isInteiro() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) < rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) < rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) < rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) < ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) < 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isString() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorInteiro() ) ) < 0;
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorDecimal() ) ) < 0;
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorCaractere() ) ) < 0;
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) < 0;
                        } else if ( rv.isString() ) {
                            res = valor.valorString().compareTo( rv.valorString() ) < 0;
                        } else {
                            res = false;
                        }
                    } else {
                        res = false;
                    }
                    break;
                case AuroraLogoParser.MEI:
                case AuroraLogoParser.MEIT:
                case AuroraLogoParser.MEIA:
                    if ( valor.isInteiro() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorInteiro() <= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorInteiro() <= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorInteiro() <= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorInteiro() <= ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorInteiro() ).compareTo( rv.valorString() ) <= 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isDecimal() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorDecimal() <= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorDecimal() <= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorDecimal() <= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorDecimal() <= ( rv.valorBooleano() ? 1.0 : 0.0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorDecimal() ).compareTo( rv.valorString() ) <= 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCaractere() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCaractere() <= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCaractere() <= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCaractere() <= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorCaractere() <= ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCaractere() ).compareTo( rv.valorString() ) <= 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isBooleano() ) {
                        if ( rv.isInteiro() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) <= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) <= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) <= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) <= ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) <= 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isString() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorInteiro() ) ) <= 0;
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorDecimal() ) ) <= 0;
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorCaractere() ) ) <= 0;
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) <= 0;
                        } else if ( rv.isString() ) {
                            res = valor.valorString().compareTo( rv.valorString() ) <= 0;
                        } else {
                            res = false;
                        }
                    } else {
                        res = false;
                    }
                    break;
                case AuroraLogoParser.MA:
                case AuroraLogoParser.MAT:
                case AuroraLogoParser.MAA:
                    if ( valor.isInteiro() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorInteiro() > rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorInteiro() > rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorInteiro() > rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorInteiro() > ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorInteiro() ).compareTo( rv.valorString() ) > 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isDecimal() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorDecimal() > rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorDecimal() > rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorDecimal() > rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorDecimal() > ( rv.valorBooleano() ? 1.0 : 0.0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorDecimal() ).compareTo( rv.valorString() ) > 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCaractere() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCaractere() > rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCaractere() > rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCaractere() > rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorCaractere() > ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCaractere() ).compareTo( rv.valorString() ) > 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isBooleano() ) {
                        if ( rv.isInteiro() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) > rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) > rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) > rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) > ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) > 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isString() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorInteiro() ) ) > 0;
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorDecimal() ) ) > 0;
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorCaractere() ) ) > 0;
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) > 0;
                        } else if ( rv.isString() ) {
                            res = valor.valorString().compareTo( rv.valorString() ) > 0;
                        } else {
                            res = false;
                        }
                    } else {
                        res = false;
                    }
                    break;
                case AuroraLogoParser.MAI:
                case AuroraLogoParser.MAIT:
                case AuroraLogoParser.MAIA:
                    if ( valor.isInteiro() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorInteiro() >= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorInteiro() >= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorInteiro() >= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorInteiro() >= ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorInteiro() ).compareTo( rv.valorString() ) >= 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isDecimal() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorDecimal() >= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorDecimal() >= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorDecimal() >= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorDecimal() >= ( rv.valorBooleano() ? 1.0 : 0.0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorDecimal() ).compareTo( rv.valorString() ) >= 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isCaractere() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorCaractere() >= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorCaractere() >= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorCaractere() >= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorCaractere() >= ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor.valorCaractere() ).compareTo( rv.valorString() ) >= 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isBooleano() ) {
                        if ( rv.isInteiro() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) >= rv.valorInteiro();
                        } else if ( rv.isDecimal() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) >= rv.valorDecimal();
                        } else if ( rv.isCaractere() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) >= rv.valorCaractere();
                        } else if ( rv.isBooleano() ) {
                            res = ( valor.valorBooleano() ? 1 : 0 ) >= ( rv.valorBooleano() ? 1 : 0 );
                        } else if ( rv.isString() ) {
                            res = String.valueOf( valor ).compareTo( rv.valorString() ) >= 0;
                        } else {
                            res = false;
                        }
                    } else if ( valor.isString() ) {
                        if ( rv.isInteiro() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorInteiro() ) ) >= 0;
                        } else if ( rv.isDecimal() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorDecimal() ) ) >= 0;
                        } else if ( rv.isCaractere() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv.valorCaractere() ) ) >= 0;
                        } else if ( rv.isBooleano() ) {
                            res = valor.valorString().compareTo( String.valueOf( rv ) ) >= 0;
                        } else if ( rv.isString() ) {
                            res = valor.valorString().compareTo( rv.valorString() ) >= 0;
                        } else {
                            res = false;
                        }
                    } else {
                        res = false;
                    }
                    break;
            }
            
            return novoBooleano( res );
            
        }
        
        return valor;
        
    }
    
    @Override
    public Valor visitExprSimp( AuroraLogoParser.ExprSimpContext ctx ) {
        
        Valor valor = ZERO_INTEIRO;
        Valor mult = UM_INTEIRO;
        int ini = 0;
        
        if ( ctx.opNeg != null && ctx.opNeg.getType() == AuroraLogoParser.SUB ) {
            mult = novoInteiro( -1 );
            ini = 1;
        }
        
        for ( int i = ini; i < ctx.getChildCount(); i += 2 ) {
            
            if ( i == ini ) {
                valor = visit( ctx.getChild( i ) );
            } else {
                
                int op = ( (TerminalNode) ctx.getChild( i-1 ) ).getSymbol().getType();
                Valor tv = visit( ctx.getChild( i ) );
                
                switch ( op ) {
                    case AuroraLogoParser.ADI:
                    case AuroraLogoParser.ADIA:
                        if ( valor.isInteiro() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( valor.valorInteiro() + tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( valor.valorInteiro() + tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoInteiro( valor.valorInteiro() + tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoInteiro( valor.valorInteiro() + ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                valor = novaString( valor + tv.valorString() );
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isDecimal() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoDecimal( valor.valorDecimal() + tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( valor.valorDecimal() + tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoDecimal( valor.valorDecimal() + tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoDecimal( valor.valorDecimal() + ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                valor = novaString( valor + tv.valorString() );
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isCaractere() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCaractere() + tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( valor.valorCaractere() + tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoInteiro( valor.valorCaractere() + tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoInteiro( valor.valorCaractere() + ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                valor = novaString( valor.valorCaractere() + tv.valorString() );
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isBooleano() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) + tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( ( valor.valorBooleano() ? 1 : 0 ) + tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) + tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) + ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                valor = novaString( valor + tv.valorString() );
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isString() ) {
                            if ( tv.isInteiro() ) {
                                valor = novaString( valor.valorString() + tv );
                            } else if ( tv.isDecimal() ) {
                                valor = novaString( valor.valorString() + tv );
                            } else if ( tv.isCaractere() ) {
                                valor = novaString( valor.valorString() + tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novaString( valor.valorString() + tv );
                            } else if ( tv.isString() ) {
                                valor = novaString( valor.valorString() + tv.valorString() );
                            } else {
                                // valor é o prório
                            }
                        }
                        break;
                    case AuroraLogoParser.SUB:
                    case AuroraLogoParser.SUBA:
                        if ( valor.isInteiro() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( valor.valorInteiro() - tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( valor.valorInteiro() - tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoInteiro( valor.valorInteiro() - tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoInteiro( valor.valorInteiro() - ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isDecimal() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoDecimal( valor.valorDecimal() - tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( valor.valorDecimal() - tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoDecimal( valor.valorDecimal() - tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoDecimal( valor.valorDecimal() - ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isCaractere() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCaractere() - tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( valor.valorCaractere() - tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoInteiro( valor.valorCaractere() - tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoInteiro( valor.valorCaractere() - ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isBooleano() ) {
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) - tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( ( valor.valorBooleano() ? 1 : 0 ) - tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) - tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) - ( tv.valorBooleano() ? 1 : 0 ) );
                            } else if ( tv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isString() ) {  // ignora strings
                            if ( tv.isInteiro() ) {
                                valor = novoInteiro( tv.valorInteiro() );
                            } else if ( tv.isDecimal() ) {
                                valor = novoDecimal( tv.valorDecimal() );
                            } else if ( tv.isCaractere() ) {
                                valor = novoCaractere( tv.valorCaractere() );
                            } else if ( tv.isBooleano() ) {
                                valor = novoBooleano( tv.valorBooleano() );
                            } else if ( tv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        }
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
    
    @Override
    public Valor visitTermo( AuroraLogoParser.TermoContext ctx ) {
        
        Valor valor = ZERO_INTEIRO;
        
        for ( int i = 0; i < ctx.getChildCount(); i += 2 ) {
            
            if ( i == 0 ) {
                valor = visit( ctx.getChild( i ) );
            } else {
                
                int op = ( (TerminalNode) ctx.getChild( i-1 ) ).getSymbol().getType();
                Valor fv = visit( ctx.getChild( i ) );
                
                switch ( op ) {
                    case AuroraLogoParser.MUL:
                    case AuroraLogoParser.VEZ:
                        if ( valor.isInteiro() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorInteiro() * fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorInteiro() * fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( valor.valorInteiro() * fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( valor.valorInteiro() * ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isDecimal() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoDecimal( valor.valorDecimal() * fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorDecimal() * fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoDecimal( valor.valorDecimal() * fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoDecimal( valor.valorDecimal() * ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isCaractere() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCaractere() * fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorCaractere() * fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( valor.valorCaractere() * fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( valor.valorCaractere() * ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isBooleano() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) * fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( ( valor.valorBooleano() ? 1 : 0 ) * fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) * fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) * ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isString() ) {  // ignora strings
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoCaractere( fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoBooleano( fv.valorBooleano() );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        }
                        break;
                    case AuroraLogoParser.DIV:
                    case AuroraLogoParser.DIVA:
                        if ( valor.isInteiro() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorInteiro() / ( fv.valorInteiro() == 0 ? 1 : fv.valorInteiro() ) );      // possível divisão por zero
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorInteiro() / fv.valorDecimal() );                                       // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( valor.valorInteiro() / ( fv.valorCaractere() == 0 ? 1 : fv.valorCaractere() ) );  // possível divisão por zero
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( valor.valorInteiro() );                                                           // possível divisão por zero
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isDecimal() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoDecimal( valor.valorDecimal() / fv.valorInteiro() );               // divisão por zero "permitida"
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorDecimal() / fv.valorDecimal() );               // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {
                                valor = novoDecimal( valor.valorDecimal() / fv.valorCaractere() );             // divisão por zero "permitida"
                            } else if ( fv.isBooleano() ) {
                                valor = novoDecimal( valor.valorDecimal() / ( fv.valorBooleano() ? 1 : 0 ) );  // divisão por zero "permitida"
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isCaractere() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCaractere() / ( fv.valorInteiro() == 0 ? 1 : fv.valorInteiro() ) );      // possível divisão por zero
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorCaractere() / fv.valorDecimal() );                                       // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( valor.valorCaractere() / ( fv.valorCaractere() == 0 ? 1 : fv.valorCaractere() ) );  // possível divisão por zero
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( (int) valor.valorCaractere() );                                                     // possível divisão por zero
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isBooleano() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) / ( fv.valorInteiro() == 0 ? 1 : fv.valorInteiro() ) );      // possível divisão por zero
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( ( valor.valorBooleano() ? 1 : 0 ) / fv.valorDecimal() );                                       // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) / ( fv.valorCaractere() == 0 ? 1 : fv.valorCaractere() ) );  // possível divisão por zero
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) );                                                           // possível divisão por zero
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isString() ) {  // ignora strings
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoCaractere( fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoBooleano( fv.valorBooleano() );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        }
                        break;
                    case AuroraLogoParser.MOD:
                    case AuroraLogoParser.MODA:
                        if ( valor.isInteiro() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorInteiro() % ( fv.valorInteiro() == 0 ? 1 : fv.valorInteiro() ) );      // possível divisão por zero
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorInteiro() % fv.valorDecimal() );                                       // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( valor.valorInteiro() % ( fv.valorCaractere() == 0 ? 1 : fv.valorCaractere() ) );  // possível divisão por zero
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( valor.valorInteiro() );                                                           // possível divisão por zero
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isDecimal() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoDecimal( valor.valorDecimal() % fv.valorInteiro() );               // divisão por zero "permitida"
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorDecimal() % fv.valorDecimal() );               // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {
                                valor = novoDecimal( valor.valorDecimal() % fv.valorCaractere() );             // divisão por zero "permitida"
                            } else if ( fv.isBooleano() ) {
                                valor = novoDecimal( valor.valorDecimal() % ( fv.valorBooleano() ? 1 : 0 ) );  // divisão por zero "permitida"
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isCaractere() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCaractere() % ( fv.valorInteiro() == 0 ? 1 : fv.valorInteiro() ) );      // possível divisão por zero
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorCaractere() % fv.valorDecimal() );                                       // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( valor.valorCaractere() % ( fv.valorCaractere() == 0 ? 1 : fv.valorCaractere() ) );  // possível divisão por zero
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( (int) valor.valorCaractere() );                                                     // possível divisão por zero
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isBooleano() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) % ( fv.valorInteiro() == 0 ? 1 : fv.valorInteiro() ) );      // possível divisão por zero
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( ( valor.valorBooleano() ? 1 : 0 ) % fv.valorDecimal() );                                       // divisão por zero "permitida"
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) % ( fv.valorCaractere() == 0 ? 1 : fv.valorCaractere() ) );  // possível divisão por zero
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) );                                                           // possível divisão por zero
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isString() ) {  // ignora strings
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoCaractere( fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoBooleano( fv.valorBooleano() );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        }
                        break;
                        
                }
                
            }
            
        }
        
        return valor;
        
    }

    /*@Override
    public ValorVariavel visitTerminal( TerminalNode node ) {
        return novoInteiro( node.getSymbol().getType() );
    }*/
    
    @Override
    public Valor visitFatorNao( AuroraLogoParser.FatorNaoContext ctx ) {
        
        Valor valor = visit( ctx.fator() );
            
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
    
    @Override
    public Valor visitFatorInt( AuroraLogoParser.FatorIntContext ctx ) {
        return Valor.novoInteiro( ctx.INT().getText() );
    }
    
    @Override
    public Valor visitFatorDec( AuroraLogoParser.FatorDecContext ctx ) {
        return Valor.novoDecimal( ctx.DEC().getText() );
    }

    @Override
    public Valor visitFatorPi( AuroraLogoParser.FatorPiContext ctx ) {
        return PI_DECIMAL;
    }

    @Override
    public Valor visitFatorId( AuroraLogoParser.FatorIdContext ctx ) {
        
        if ( ctx.bool() != null ) {
            return visit( ctx.bool() );
        }
        
        String id = ctx.ID().getText();
        return tartaruga.lerMemoria( id );
        
    }

    @Override
    public Valor visitBool( AuroraLogoParser.BoolContext ctx ) {
        if ( ctx.VER() != null ) {
            return VERDADEIRO;
        }
        return FALSO;
    }

    @Override
    public Valor visitFatorChar( AuroraLogoParser.FatorCharContext ctx ) {
        return novoCaractere( ctx.getText().substring( 1, ctx.getText().length() - 1 ).charAt( 0 ) );
    }

    @Override
    public Valor visitFatorString( AuroraLogoParser.FatorStringContext ctx ) {
        return novaString( ctx.getText().substring( 1, ctx.getText().length() - 1 ) );
    }
    
    @Override
    public Valor visitFatorCor( AuroraLogoParser.FatorCorContext ctx ) {
        
        String strCor = ctx.cor().CHEX().getText();
        Color cor = Color.decode( strCor.substring( 0, 7 ) );
            
        if ( strCor.length() == 9 ) {
            String alpha = strCor.substring( 7 );
            cor = new Color( cor.getRed(), cor.getGreen(), cor.getBlue(), Integer.valueOf( alpha, 16 ) );
        }
        
        return novaCor( cor );
        
    }
    
    @Override
    public Valor visitFatorParenteses( AuroraLogoParser.FatorParentesesContext ctx ) {
        return visit( ctx.expr() );
    }

    @Override
    public Valor visitExprBool( AuroraLogoParser.ExprBoolContext ctx ) {
        return visit( ctx.expr() );
    }

    @Override
    public Valor visitSe( AuroraLogoParser.SeContext ctx ) {
        
        boolean entrouNoSe = false;
        boolean entrouEmAlgumSenaoSe = false;
        
        Valor retorno = NULO;
        
        if ( visit( ctx.seSe().exprBool() ).isVerdadeiro() ) {
            
            entrouNoSe = true;
            
            for ( AuroraLogoParser.InstContext c : ctx.seSe().inst() ) {
                
                if ( c.ains() != null ) { 
                    
                    // se for uma instrução de parada ou de continuar
                    if ( c.ains().parar() != null ||
                         c.ains().continuar() != null ) {
                        
                        Valor r;
                        
                        if ( c.ains().parar() != null ) {
                            r = visit( c.ains().parar() );
                        } else {
                            r = visit( c.ains().continuar() );
                        }
                        
                        retorno = r; // sinaliza para o chamador
                        break;       // para o for de instruções do se
                        
                    } else {
                        visit( c );
                    }
                    
                } else {
                    
                    Valor v = visit( c );
                    
                    // captura retorno de outros ses
                    if ( v != null && ( v.isParar() || v.isContinuar() ) ) {
                        retorno = v;  // sinaliza para propagar
                        break;        // para o for de instruções do se
                    }
                    
                }
                
            }
            
        } else if ( ctx.seSenaoSe() != null ) {
            
            for ( AuroraLogoParser.SeSenaoSeContext sssp : ctx.seSenaoSe() ) {
                
                if ( visit( sssp.exprBool() ).isVerdadeiro() ) {
                    
                    entrouEmAlgumSenaoSe = true;
                    
                    for ( AuroraLogoParser.InstContext c : sssp.inst() ) {
                        
                        if ( c.ains() != null ) { 

                            // se for uma instrução de parada ou de continuar
                            if ( c.ains().parar() != null ||
                                 c.ains().continuar() != null ) {

                                Valor r;

                                if ( c.ains().parar() != null ) {
                                    r = visit( c.ains().parar() );
                                } else {
                                    r = visit( c.ains().continuar() );
                                }
                                
                                retorno = r; // sinaliza para o chamador
                                break;       // para o for de instruções do se

                            } else {
                                visit( c );
                            }

                        } else {

                            Valor v = visit( c );

                            // captura retorno de outros ses
                            if ( v != null && ( v.isParar() || v.isContinuar() ) ) {
                                retorno = v;  // sinaliza para propagar
                                break;        // para o for de instruções do senão se
                            }

                        }
                        
                    }
                    
                    break;
                    
                }
                
            }
            
        }
        
        if ( ctx.seSenao() != null && !entrouNoSe && !entrouEmAlgumSenaoSe ) {
            
            for ( AuroraLogoParser.InstContext c : ctx.seSenao().inst() ) {
                
                if ( c.ains() != null ) { 
                    
                    // se for uma instrução de parada ou de continuar
                    if ( c.ains().parar() != null ||
                         c.ains().continuar() != null ) {
                        
                        Valor r;
                        
                        if ( c.ains().parar() != null ) {
                            r = visit( c.ains().parar() );
                        } else {
                            r = visit( c.ains().continuar() );
                        }
                        
                        retorno = r; // sinaliza para o chamador
                        break;       // para o for de instruções do se
                        
                    } else {
                        visit( c );
                    }
                    
                } else {
                    
                    Valor v = visit( c );
                    
                    // captura retorno de outros ses
                    if ( v != null && ( v.isParar() || v.isContinuar() ) ) {
                        retorno = v;  // sinaliza para propagar
                        break;        // para o for de instruções do senão
                    }
                    
                }
                
            }
            
        }
        
        return retorno;
        
    }

    @Override
    public Valor visitUsando( AuroraLogoParser.UsandoContext ctx ) {
        
        int id = ++idInstrucaoParavel;
        String idT = ctx.ID().getText();
        Valor vId = tartaruga.lerMemoria( idT );
        
        if ( !vId.isNulo() ) {
            
            int pMatch = -1;
            List<AuroraLogoParser.InstContext> coletaInstrucoes = new ArrayList<>();
            
            for ( int i = 0; i < ctx.escolha().size(); i++ ) {
                
                AuroraLogoParser.EscolhaContext ectx = ctx.escolha( i );
                
                if ( vId.isInteiro() ) {
                    if ( ectx.INT() != null && vId.valorInteiro().equals( Integer.valueOf( ectx.INT().getText() ) )  ) {
                        pMatch = i;
                        break;
                    }
                } else if ( vId.isDecimal() ) {
                    if ( ectx.DEC() != null && vId.valorDecimal().equals( Double.valueOf( ectx.DEC().getText() ) )  ) {
                        pMatch = i;
                        break;
                    }
                } else if ( vId.isCaractere() ) {
                    if ( ectx.CHAR() != null && vId.valorCaractere().equals( ectx.CHAR().getText().charAt( 1 ) ) ) {
                        pMatch = i;
                        break;
                    }
                } else if ( vId.isString() ) {
                    if ( ectx.STRING() != null && ( "\"" + vId.valorString() + "\"" ).equals( ectx.STRING().getText() ) ) {
                        pMatch = i;
                        break;
                    }
                }
                
            }
            
            // coleta
            if ( pMatch != -1 ) {
                for ( int i = pMatch; i < ctx.escolha().size(); i++ ) {
                    if ( ctx.escolha( i ) != null ) {
                        coletaInstrucoes.addAll( ctx.escolha( i ).inst() );
                    }
                }
            }
            
            // se tiver instruções padrão
            if ( ctx.PADR() != null ) {
                coletaInstrucoes.addAll( ctx.inst() );
            }
            
            int ate = 0;
            
            // pesquisa até achar o primeiro parar para realizar o primeiro corte
            for ( int i = 0; i < coletaInstrucoes.size(); i++ ) {
                if ( coletaInstrucoes.get( i ).ains() != null && coletaInstrucoes.get( i ).ains().parar() != null ) {
                    break;
                }
                ate = i;
            }
            
            // remove o restante
            if ( !coletaInstrucoes.isEmpty() ) {
                
                coletaInstrucoes = coletaInstrucoes.subList( 0, ate + 1 );
                
                // visita as instruções que sobraram
                for ( int i = 0; i < coletaInstrucoes.size(); i++ ) {
                    
                    AuroraLogoParser.InstContext c = coletaInstrucoes.get( i );
                    
                    Valor v = visit( c );
                    
                    if ( v != null ) { 
                            
                        // se for um parar indireto, propagado de um se
                        if ( v.isParar() ) {

                            // se o id bater, para essa instrução
                            if ( v.valorIdParar() == id ) {
                                break;
                            }

                        }

                    }
                    
                }
                
            }
            
        }
        
        return NULO;
        
    }
    
    @Override
    public Valor visitRepetir( AuroraLogoParser.RepetirContext ctx ) {
        
        int id = ++idInstrucaoParavel;
        int quantidade = visit( ctx.expr() ).valorInteiro();
        boolean breakExt = false;
        
        for ( int i = 0; i < quantidade; i++ ) {
            
            if ( !breakExt ) {
            
                for ( AuroraLogoParser.InstContext c : ctx.inst() ) {
                    
                    if ( c.ains() != null ) { 
                        
                        if ( c.ains().parar() != null  ) {
                        
                            // se for um parar do corpo da instrução
                            Valor p = visit( c.ains().parar() );

                            // se o id bater, para essa instrução
                            if ( p.valorIdParar() == id ) {
                                breakExt = true;
                                break;
                            }
                            
                        } else if ( c.ains().continuar() != null  ) {
                            
                            // se for um continuar do corpo da instrução
                            Valor con = visit( c.ains().continuar() );
                            
                            // se o id bater, continua essa instrução matando o for interno
                            if ( con.valorIdContinuar() == id ) {
                                break;
                            }
                            
                        } else {
                            visit( c );
                        }
                        
                    } else {
                        
                        Valor v = visit( c );
                        
                        if ( v != null ) { 
                            
                            // se for um parar indireto, propagado de um se
                            if ( v.isParar() ) {

                                // se o id bater, para essa instrução
                                if ( v.valorIdParar() == id ) {
                                    breakExt = true;
                                    break;
                                }
                                
                            } else if ( v.isContinuar() ) {

                                // se o id bater, continua essa instrução matando o for interno
                                if ( v.valorIdContinuar() == id ) {
                                    break;
                                }
                                
                            }
                            
                        }
                        
                    }
                    
                }
            
            } else {
                break;
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitRepetirEnquanto( AuroraLogoParser.RepetirEnquantoContext ctx ) {
        
        int id = ++idInstrucaoParavel;
        boolean breakExt = false;
        
        if ( ctx.ENQ() != null ) {

            // como tratar loop infinito implícito?
            while ( visit( ctx.exprBool() ).isVerdadeiro() ) {

                if ( !breakExt ) {
                
                    for ( AuroraLogoParser.InstContext c : ctx.inst() ) {

                        if ( c.ains() != null ) { 

                            if ( c.ains().parar() != null  ) {

                                // se for um parar do corpo da instrução
                                Valor p = visit( c.ains().parar() );

                                // se o id bater, para essa instrução
                                if ( p.valorIdParar() == id ) {
                                    breakExt = true;
                                    break;
                                }

                            } else if ( c.ains().continuar() != null  ) {

                                // se for um continuar do corpo da instrução
                                Valor con = visit( c.ains().continuar() );

                                // se o id bater, continua essa instrução matando o for interno
                                if ( con.valorIdContinuar() == id ) {
                                    break;
                                }

                            } else {
                                visit( c );
                            }

                        } else {

                            Valor v = visit( c );

                            if ( v != null ) { 

                                // se for um parar indireto, propagado de um se
                                if ( v.isParar() ) {

                                    // se o id bater, para essa instrução
                                    if ( v.valorIdParar() == id ) {
                                        breakExt = true;
                                        break;
                                    }

                                } else if ( v.isContinuar() ) {

                                    // se o id bater, continua essa instrução matando o for interno
                                    if ( v.valorIdContinuar() == id ) {
                                        break;
                                    }

                                }

                            }

                        }

                    }
                    
                    String idP = ctx.ID().getText();
                    Valor vIdP = tartaruga.lerMemoria( idP );
                    if ( vIdP.isNulo() ) {
                        vIdP = novoInteiro( 0 );
                    }
                    
                    Valor vP = null;
                    if ( ctx.expr() != null ) {
                        vP = visit( ctx.expr() );
                    } else {
                        vP = UM_INTEIRO;
                    }
                    
                    if ( ctx.INCM() != null ) {
                        vIdP.somar( vP );
                    } else if ( ctx.DCMM() != null ) {
                        vIdP.subtrair( vP );
                    } else if ( ctx.SOMM() != null ) {
                        vIdP.somar( vP );
                    } else if ( ctx.SUBM() != null ) {
                        vIdP.subtrair( vP );
                    } else if ( ctx.MULM() != null ) {
                        vIdP.multiplicar( vP );
                    } else if ( ctx.DIVM() != null ) {
                        vIdP.dividir( vP );
                    }
                    
                    tartaruga.inserirOuAtualizarMemoria( idP, vIdP );
                    
                
                } else {
                    break;
                }

            }
            
        } else { // loop infinito explícito
            
            if ( !breakExt ) {
                
                int cont = 0;
                int max = 1000;

                while ( cont < max ) {
                    
                    if ( !breakExt ) {
                
                        for ( AuroraLogoParser.InstContext c : ctx.inst() ) {

                            if ( c.ains() != null ) { 

                                if ( c.ains().parar() != null  ) {

                                    // se for um parar do corpo da instrução
                                    Valor p = visit( c.ains().parar() );

                                    // se o id bater, para essa instrução
                                    if ( p.valorIdParar() == id ) {
                                        breakExt = true;
                                        break;
                                    }

                                } else if ( c.ains().continuar() != null  ) {

                                    // se for um continuar do corpo da instrução
                                    Valor con = visit( c.ains().continuar() );

                                    // se o id bater, continua essa instrução matando o for interno
                                    if ( con.valorIdContinuar() == id ) {
                                        break;
                                    }

                                } else {
                                    visit( c );
                                }

                            } else {

                                Valor v = visit( c );

                                if ( v != null ) { 

                                    // se for um parar indireto, propagado de um se
                                    if ( v.isParar() ) {

                                        // se o id bater, para essa instrução
                                        if ( v.valorIdParar() == id ) {
                                            breakExt = true;
                                            break;
                                        }

                                    } else if ( v.isContinuar() ) {

                                        // se o id bater, continua essa instrução matando o for interno
                                        if ( v.valorIdContinuar() == id ) {
                                            break;
                                        }

                                    }

                                }

                            }

                        }
                        
                        cont++;
                        
                    } else {
                        break;
                    }
                    
                }
                
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitParar( AuroraLogoParser.PararContext ctx ) {
        return novoParar( idInstrucaoParavel );
    }
    
    @Override
    public Valor visitContinuar( AuroraLogoParser.ContinuarContext ctx ) {
        return novoContinuar( idInstrucaoParavel );
    }
    
    @Override
    public Valor visitErrorNode( ErrorNode node ) {
        System.out.println( node );
        return NULO;
    }

    
    // funções matemáticas
    
    @Override
    public Valor visitFuncaoAbsoluto( AuroraLogoParser.FuncaoAbsolutoContext ctx ) {
        
        Valor v = visit( ctx.expr() );
        
        if ( v.isInteiro() ) {
            return novoInteiro( Math.abs( v.valorInteiro() ) );
        } else if ( v.isDecimal() ) {
            return novoDecimal( Math.abs( v.valorDecimal() ) );
        }
       
        return ZERO_INTEIRO;
       
    }
    
    @Override
    public Valor visitFuncaoRaizQuadrada( AuroraLogoParser.FuncaoRaizQuadradaContext ctx ) {
        
        Valor v = visit( ctx.expr() );
        
        if ( v.isInteiro() ) {
            if ( v.isPositivo() ) {
                return novoDecimal( Math.sqrt( v.valorInteiro() ) );
            }
        } else if ( v.isDecimal() ) {
            if ( v.isPositivo() ) {
                return novoDecimal( Math.sqrt( v.valorDecimal() ) );
            }
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public Valor visitFuncaoRaizCubica( AuroraLogoParser.FuncaoRaizCubicaContext ctx ) {
        
        Valor v = visit( ctx.expr() );
        
        if ( v.isInteiro() ) {
            return novoDecimal( Math.cbrt( v.valorInteiro() ) );
        } else if ( v.isDecimal() ) {
            return novoDecimal( Math.cbrt( v.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public Valor visitFuncaoRaiz( AuroraLogoParser.FuncaoRaizContext ctx ) {
        
        Valor vRad = visit( ctx.expr( 0 ) );
        Valor vInd = visit( ctx.expr( 1 ) );
        
        if ( vRad.isNumero() && vInd.isNumero() ) {
            return novoDecimal( Math.pow( vRad.valorDecimal(), 1.0 / vInd.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public Valor visitFuncaoPotencia( AuroraLogoParser.FuncaoPotenciaContext ctx ) {
        
        Valor vBase = visit( ctx.expr( 0 ) );
        Valor vExp = visit( ctx.expr( 1 ) );
        
        if ( vBase.isNumero() && vExp.isNumero() ) {
            return novoDecimal( Math.pow( vBase.valorDecimal(), vExp.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public Valor visitFuncaoHipotenusa( AuroraLogoParser.FuncaoHipotenusaContext ctx ) {
        
        Valor lado1 = visit( ctx.expr( 0 ) );
        Valor lado2 = visit( ctx.expr( 1 ) );
        
        if ( lado1.isNumero() && lado2.isNumero() ) {
            return novoDecimal( Math.hypot( lado1.valorDecimal(), lado2.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public Valor visitFuncaoChao( AuroraLogoParser.FuncaoChaoContext ctx ) {
        
        Valor v = visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.floor( v.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public Valor visitFuncaoTeto( AuroraLogoParser.FuncaoTetoContext ctx ) {
        
        Valor v = visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.ceil( v.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public Valor visitFuncaoArredondar( AuroraLogoParser.FuncaoArredondarContext ctx ) {
        
        if ( ctx.expr( 1 ) == null ) {
            
            Valor v = visit( ctx.expr( 0 ) );
        
            if ( v.isNumero() ) {
                return novoInteiro( (int) Math.round( v.valorDecimal() ) );
            }
        
        } else {
            
            Valor v = visit( ctx.expr( 0 ) );
            Valor casas = visit( ctx.expr( 1 ) );
            try {
            if ( v.isNumero() && casas.isNumero() ) {
                String vs = String.format( Locale.US, "%." + casas.valorInteiro() + "f", v.valorDecimal() );
                return novoDecimal( Double.valueOf( vs ) );
            }
            } catch ( Exception exc ) {
                exc.printStackTrace();
            }
            
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public Valor visitFuncaoMinimo( AuroraLogoParser.FuncaoMinimoContext ctx ) {
        
        Valor n1 = visit( ctx.expr( 0 ) );
        Valor n2 = visit( ctx.expr( 1 ) );
        
        if ( n1.isNumero() && n2.isNumero() ) {
            if ( n1.isInteiro() && n2.isInteiro() ) {
                return novoInteiro( Math.min( n1.valorInteiro(), n2.valorInteiro() ) );
            }
            return novoDecimal( Math.min( n1.valorDecimal(), n2.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public Valor visitFuncaoMaximo( AuroraLogoParser.FuncaoMaximoContext ctx ) {
        
        Valor n1 = visit( ctx.expr( 0 ) );
        Valor n2 = visit( ctx.expr( 1 ) );
        
        if ( n1.isNumero() && n2.isNumero() ) {
            if ( n1.isInteiro() && n2.isInteiro() ) {
                return novoInteiro( Math.max( n1.valorInteiro(), n2.valorInteiro() ) );
            }
            return novoDecimal( Math.max( n1.valorDecimal(), n2.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }

    @Override
    public Valor visitFuncaoNumeroAleatorio( AuroraLogoParser.FuncaoNumeroAleatorioContext ctx ) {
        
        if ( ctx.expr( 0 ) == null ) {
            return novoDecimal( gerador.nextDouble() );
        } else if ( ctx.expr( 1 ) == null ) {
            
            Valor limite = visit( ctx.expr( 0 ) );
            
            if ( limite.isInteiro() ) {
                return novoInteiro( gerador.nextInt( limite.valorInteiro() ) );
            } else if ( limite.isDecimal() ) {
                return novoDecimal( gerador.nextDouble( limite.valorDecimal() ) );
            }
            
            return novoDecimal( gerador.nextDouble() );
            
        } else {
            
            Valor origem = visit( ctx.expr( 0 ) );
            Valor limite = visit( ctx.expr( 1 ) );
            
            if ( origem.isNumero() && limite.isNumero() ) {
                
                if ( origem.isInteiro() && limite.isInteiro() ) {
                    return novoInteiro( gerador.nextInt( origem.valorInteiro(), limite.valorInteiro() ) );
                } else {
                    return novoDecimal( gerador.nextDouble( origem.valorDecimal(), limite.valorDecimal() ) );
                }
                
            }
            
            return novoDecimal( gerador.nextDouble() );
            
        }
        
    }
    
    @Override
    public Valor visitFuncaoDefinirSementeAleatoria( AuroraLogoParser.FuncaoDefinirSementeAleatoriaContext ctx ) {
        
        Valor v = visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            gerador = new Random( v.valorInteiro() );
        }
        
        return NULO;
        
    }
    

    @Override
    public Valor visitFuncaoSeno( AuroraLogoParser.FuncaoSenoContext ctx ) {
        
        Valor a = visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            double rad = Math.toRadians( a.valorDecimal() );
            return novoDecimal( Math.sin( rad ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public Valor visitFuncaoSenoHiperbolico( AuroraLogoParser.FuncaoSenoHiperbolicoContext ctx ) {
        
        Valor a = visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            return novoDecimal( Math.sinh( a.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public Valor visitFuncaoArcoSeno( AuroraLogoParser.FuncaoArcoSenoContext ctx ) {
        
        Valor v = visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.toDegrees( Math.asin( v.valorDecimal() ) ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public Valor visitFuncaoCosseno( AuroraLogoParser.FuncaoCossenoContext ctx ) {
        
        Valor a = visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            double rad = Math.toRadians( a.valorDecimal() );
            return novoDecimal( Math.cos( rad ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public Valor visitFuncaoCossenoHiperbolico( AuroraLogoParser.FuncaoCossenoHiperbolicoContext ctx ) {
        
        Valor a = visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            return novoDecimal( Math.cosh( a.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public Valor visitFuncaoArcoCosseno( AuroraLogoParser.FuncaoArcoCossenoContext ctx ) {
        
        Valor v = visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.toDegrees( Math.acos( v.valorDecimal() ) ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public Valor visitFuncaoTangente( AuroraLogoParser.FuncaoTangenteContext ctx ) {
        
        Valor a = visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            double rad = Math.toRadians( a.valorDecimal() );
            return novoDecimal( Math.tan( rad ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public Valor visitFuncaoTangenteHiperbolica( AuroraLogoParser.FuncaoTangenteHiperbolicaContext ctx ) {
        
        Valor a = visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            return novoDecimal( Math.tanh( a.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public Valor visitFuncaoArcoTangente( AuroraLogoParser.FuncaoArcoTangenteContext ctx ) {
        
        Valor v = visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.toDegrees( Math.atan( v.valorDecimal() ) ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public Valor visitFuncaoCartesianoParaPolar( AuroraLogoParser.FuncaoCartesianoParaPolarContext ctx ) {
        
        Valor y = visit( ctx.expr( 0 ) );
        Valor x = visit( ctx.expr( 1 ) );
        
        if ( y.isNumero() && x.isNumero() ) {
            return novoDecimal( Math.toDegrees( Math.atan2( y.valorDecimal(), x.valorDecimal() ) ) );
        }
       
        return ZERO_DECIMAL;
       
    }

    @Override
    public Valor visitFuncaoLogaritmo( AuroraLogoParser.FuncaoLogaritmoContext ctx ) {
        
        Valor v = visit( ctx.expr( 0 ) );
        
        if ( ctx.expr( 1 ) == null ) {    
            if ( v.isNumero() ) {
                return novoDecimal( Math.log( v.valorDecimal() ) );
            }
        } else {
            
            Valor base = visit( ctx.expr( 1 ) );
            
            if ( v.isNumero() && base.isNumero() ) {
                
                double dv = v.valorDecimal();
                double db = base.valorDecimal();
                
                return novoDecimal( Math.log( dv ) / Math.log( db ) );
                
            }
            
        }
        
        return ZERO_DECIMAL;
        
    }

    @Override
    public Valor visitFuncaoGrausParaRadianos( AuroraLogoParser.FuncaoGrausParaRadianosContext ctx ) {
        
        Valor g = visit( ctx.expr() );
        
        if ( g.isNumero() ) {
            return novoDecimal( Math.toRadians( g.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }

    @Override
    public Valor visitFuncaoRadianosParaGraus( AuroraLogoParser.FuncaoRadianosParaGrausContext ctx ) {
        
        Valor r = visit( ctx.expr() );
        
        if ( r.isNumero() ) {
            return novoDecimal( Math.toDegrees( r.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }

    @Override
    public Valor visitFuncaoIncrementar( AuroraLogoParser.FuncaoIncrementarContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            valor.incrementar();
            tartaruga.inserirOuAtualizarMemoria( id, valor );
        }
        
        return valor;
        
    }
    
    @Override
    public Valor visitFuncaoDecrementar( AuroraLogoParser.FuncaoDecrementarContext ctx ) {
        
        String id = ctx.ID().getText();
        Valor valor = tartaruga.lerMemoria( id );
        
        if ( valor.isNumero() ) {
            valor.decrementar();
            tartaruga.inserirOuAtualizarMemoria( id, valor );
        }
        
        return valor;
        
    }
    
    
    // funções geométricas

    @Override
    public Valor visitFuncaoDesenharSegmento( AuroraLogoParser.FuncaoDesenharSegmentoContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double x1 = visit( ctx.expr( 0 ) ).valorDecimal();
            double y1 = visit( ctx.expr( 1 ) ).valorDecimal();
            double x2 = visit( ctx.expr( 2 ) ).valorDecimal();
            double y2 = visit( ctx.expr( 3 ) ).valorDecimal();

            boolean d = tartaruga.isDesenhando();
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( x1, y1 );
            tartaruga.criarSegmento( x1, y1, x2, y2 );
            tartaruga.moverPara( x2, y2, false );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitFuncaoDesenharQuadrado( AuroraLogoParser.FuncaoDesenharQuadradoContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visit( ctx.expr( 1 ) ).valorDecimal();
            double lado = visit( ctx.expr( 2 ) ).valorDecimal();

            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = false;
            
            if ( ctx.opcaoFGeomO() != null ) {
                contorno = ctx.opcaoFGeomO().CON() == null;
                preenchimento = ctx.opcaoFGeomO().PREO() != null;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( xCentro, yCentro );
            tartaruga.criarQuadrado( xCentro, yCentro, lado, contorno, preenchimento );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitFuncaoDesenharRetangulo( AuroraLogoParser.FuncaoDesenharRetanguloContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visit( ctx.expr( 1 ) ).valorDecimal();
            double largura = visit( ctx.expr( 2 ) ).valorDecimal();
            double altura = visit( ctx.expr( 3 ) ).valorDecimal();

            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = false;
            
            if ( ctx.opcaoFGeomO() != null ) {
                contorno = ctx.opcaoFGeomO().CON() == null;
                preenchimento = ctx.opcaoFGeomO().PREO() != null;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( xCentro, yCentro );
            tartaruga.criarRetangulo( xCentro, yCentro, largura, altura, contorno, preenchimento );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitFuncaoDesenharCirculo( AuroraLogoParser.FuncaoDesenharCirculoContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visit( ctx.expr( 1 ) ).valorDecimal();
            double raio = visit( ctx.expr( 2 ) ).valorDecimal();

            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = false;
            
            if ( ctx.opcaoFGeomO() != null ) {
                contorno = ctx.opcaoFGeomO().CON() == null;
                preenchimento = ctx.opcaoFGeomO().PREO() != null;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( xCentro, yCentro );
            tartaruga.criarCirculo( xCentro, yCentro, raio, contorno, preenchimento );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitFuncaoDesenharElipse( AuroraLogoParser.FuncaoDesenharElipseContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visit( ctx.expr( 1 ) ).valorDecimal();
            double eixoHorizontal = visit( ctx.expr( 2 ) ).valorDecimal();
            double eixoVertical = visit( ctx.expr( 3 ) ).valorDecimal();

            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = false;
            
            if ( ctx.opcaoFGeomA() != null ) {
                contorno = ctx.opcaoFGeomA().CON() == null;
                preenchimento = ctx.opcaoFGeomA().PREA() != null;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( xCentro, yCentro );
            tartaruga.criarElipse( xCentro, yCentro, eixoHorizontal, eixoVertical, contorno, preenchimento );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitFuncaoDesenharArco( AuroraLogoParser.FuncaoDesenharArcoContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visit( ctx.expr( 1 ) ).valorDecimal();
            double eixoHorizontal = visit( ctx.expr( 2 ) ).valorDecimal();
            double eixoVertical = visit( ctx.expr( 3 ) ).valorDecimal();
            double anguloInicio = visit( ctx.expr( 4 ) ).valorDecimal();
            double anguloFim = visit( ctx.expr( 5 ) ).valorDecimal();
            int tipo = Arc2D.OPEN;
            
            if ( ctx.ABE() != null ) {
                tipo = Arc2D.OPEN;
            } else if ( ctx.COD() != null ) {
                tipo = Arc2D.CHORD;
            } else if ( ctx.PIZ() != null ) {
                tipo = Arc2D.PIE;
            }
            
            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = false;
            
            if ( ctx.opcaoFGeomO() != null ) {
                contorno = ctx.opcaoFGeomO().CON() == null;
                preenchimento = ctx.opcaoFGeomO().PREO() != null;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( xCentro, yCentro );
            tartaruga.criarArco( xCentro, yCentro, eixoHorizontal, eixoVertical, anguloInicio, anguloFim, tipo, contorno, preenchimento );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitFuncaoDesenharPoligonoRegular( AuroraLogoParser.FuncaoDesenharPoligonoRegularContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visit( ctx.expr( 1 ) ).valorDecimal();
            double raio = visit( ctx.expr( 2 ) ).valorDecimal();
            double angulo = visit( ctx.expr( 3 ) ).valorDecimal();
            int quantidadeLados = visit( ctx.expr( 4 ) ).valorInteiro();
            
            if ( quantidadeLados >= 3 ) {
                
                boolean d = tartaruga.isDesenhando();
                boolean contorno = true;
                boolean preenchimento = false;

                if ( ctx.opcaoFGeomO() != null ) {
                    contorno = ctx.opcaoFGeomO().CON() == null;
                    preenchimento = ctx.opcaoFGeomO().PREO() != null;
                }
                
                tartaruga.levantarPincel( false );
                tartaruga.moverPara( xCentro, yCentro );
                tartaruga.criarPoligonoRegular( xCentro, yCentro, raio, angulo, quantidadeLados, contorno, preenchimento );

                if ( d ) {
                    tartaruga.abaixarPincel( false );
                }
            
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitFuncaoDesenharEstrela( AuroraLogoParser.FuncaoDesenharEstrelaContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double xCentro = visit( ctx.expr( 0 ) ).valorDecimal();
            double yCentro = visit( ctx.expr( 1 ) ).valorDecimal();
            double raio = visit( ctx.expr( 2 ) ).valorDecimal();
            double angulo = visit( ctx.expr( 3 ) ).valorDecimal();
            int quantidadePontas = visit( ctx.expr( 4 ) ).valorInteiro();
            
            if ( quantidadePontas >= 3 ) {
                
                boolean d = tartaruga.isDesenhando();
                boolean contorno = true;
                boolean preenchimento = false;

                if ( ctx.opcaoFGeomA() != null ) {
                    contorno = ctx.opcaoFGeomA().CON() == null;
                    preenchimento = ctx.opcaoFGeomA().PREA() != null;
                }
                
                tartaruga.levantarPincel( false );
                tartaruga.moverPara( xCentro, yCentro );
                tartaruga.criarEstrela( xCentro, yCentro, raio, angulo, quantidadePontas, contorno, preenchimento );

                if ( d ) {
                    tartaruga.abaixarPincel( false );
                }
            
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitFuncaoDesenharPoligono( AuroraLogoParser.FuncaoDesenharPoligonoContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double[] xys = new double[ctx.expr().size()];
            
            double xMin = Double.MAX_VALUE;
            double xMax = Double.MIN_VALUE;
            double yMin = Double.MAX_VALUE;
            double yMax = Double.MIN_VALUE;
            
            if ( xys.length % 2 == 0 ) {
                
                for ( int i = 0; i < xys.length; i += 2 ) {
                    
                    xys[i] = visit( ctx.expr( i ) ).valorDecimal();
                    xys[i+1] = visit( ctx.expr( i+1 ) ).valorDecimal();
                    
                    if ( xys[i] < xMin ) {
                        xMin = xys[i];
                    }
                    
                    if ( xys[i] > xMax ) {
                        xMax = xys[i];
                    }
                    
                    if ( xys[i+1] < yMin ) {
                        yMin = xys[i+1];
                    }
                    
                    if ( xys[i+1] > yMax ) {
                        yMax = xys[i+1];
                    }
                    
                }

                boolean d = tartaruga.isDesenhando();
                boolean contorno = true;
                boolean preenchimento = false;

                if ( ctx.opcaoFGeomO() != null ) {
                    contorno = ctx.opcaoFGeomO().CON() == null;
                    preenchimento = ctx.opcaoFGeomO().PREO() != null;
                }
                
                tartaruga.levantarPincel( false );
                tartaruga.moverPara( ( xMin + xMax ) / 2, ( yMin + yMax ) / 2 );
                
                if ( xys.length > 6 ) {
                    double[] res = new double[xys.length - 6];
                    for ( int i = 0; i < res.length; i++ ) {
                        res[i] = xys[6+i];
                    }
                    tartaruga.criarPoligono( xys[0], xys[1], xys[2], xys[3], xys[4], xys[5], contorno, preenchimento, res );
                } else {
                    tartaruga.criarPoligono( xys[0], xys[1], xys[2], xys[3], xys[4], xys[5], contorno, preenchimento );
                }
                
                

                if ( d ) {
                    tartaruga.abaixarPincel( false );
                }
            
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitFuncaoDesenharCurvaQuadratica( AuroraLogoParser.FuncaoDesenharCurvaQuadraticaContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double x1 = visit( ctx.expr( 0 ) ).valorDecimal();
            double y1 = visit( ctx.expr( 1 ) ).valorDecimal();
            double xControle = visit( ctx.expr( 2 ) ).valorDecimal();
            double yControle = visit( ctx.expr( 3 ) ).valorDecimal();
            double x2 = visit( ctx.expr( 4 ) ).valorDecimal();
            double y2 = visit( ctx.expr( 5 ) ).valorDecimal();
            
            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = false;
            
            if ( ctx.opcaoFGeomA() != null ) {
                contorno = ctx.opcaoFGeomA().CON() == null;
                preenchimento = ctx.opcaoFGeomA().PREA() != null;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( x2, y2 );
            tartaruga.criarCurvaQuadratica( x1, y1, xControle, yControle, x2, y2, contorno, preenchimento );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitFuncaoDesenharCurvaCubica( AuroraLogoParser.FuncaoDesenharCurvaCubicaContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            double x1 = visit( ctx.expr( 0 ) ).valorDecimal();
            double y1 = visit( ctx.expr( 1 ) ).valorDecimal();
            double xControle1 = visit( ctx.expr( 2 ) ).valorDecimal();
            double yControle1 = visit( ctx.expr( 3 ) ).valorDecimal();
            double xControle2 = visit( ctx.expr( 4 ) ).valorDecimal();
            double yControle2 = visit( ctx.expr( 5 ) ).valorDecimal();
            double x2 = visit( ctx.expr( 6 ) ).valorDecimal();
            double y2 = visit( ctx.expr( 7 ) ).valorDecimal();
            
            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = false;
            
            if ( ctx.opcaoFGeomA() != null ) {
                contorno = ctx.opcaoFGeomA().CON() == null;
                preenchimento = ctx.opcaoFGeomA().PREA() != null;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.moverPara( x2, y2 );
            tartaruga.criarCurvaCubica( x1, y1, xControle1, yControle1, xControle2, yControle2, x2, y2, contorno, preenchimento );
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitDesenharCaminho( AuroraLogoParser.DesenharCaminhoContext ctx ) {
        
        if ( tartaruga.isDesenhando() ) {
            
            boolean d = tartaruga.isDesenhando();
            boolean contorno = true;
            boolean preenchimento = false;
            
            if ( ctx.opcaoFGeomO() != null ) {
                contorno = ctx.opcaoFGeomO().CON() == null;
                preenchimento = ctx.opcaoFGeomO().PREO() != null;
            }
            
            tartaruga.levantarPincel( false );
            tartaruga.iniciarCaminho( contorno, preenchimento );
            
            for ( InstCaminhoContext c : ctx.instCaminho() ) {
                visit( c );
            }
            
            tartaruga.terminarCaminho();
            
            if ( d ) {
                tartaruga.abaixarPincel( false );
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitInstrucaoCaminhoMoverAte( AuroraLogoParser.InstrucaoCaminhoMoverAteContext ctx ) {
            
        double x = visit( ctx.expr( 0 ) ).valorDecimal();
        double y = visit( ctx.expr( 1 ) ).valorDecimal();

        boolean d = tartaruga.isDesenhando();

        tartaruga.levantarPincel( false );
        tartaruga.moverPara( x, y );
        tartaruga.caminhoMoverAte( x, y );

        if ( d ) {
            tartaruga.abaixarPincel( false );
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitInstrucaoCaminhoLinhaAte( AuroraLogoParser.InstrucaoCaminhoLinhaAteContext ctx ) {
        
        double x = visit( ctx.expr( 0 ) ).valorDecimal();
        double y = visit( ctx.expr( 1 ) ).valorDecimal();

        boolean d = tartaruga.isDesenhando();

        tartaruga.levantarPincel( false );
        tartaruga.moverPara( x, y );
        tartaruga.caminhoLinhaAte( x, y );

        if ( d ) {
            tartaruga.abaixarPincel( false );
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitInstrucaoCaminhoCurvaQuadraticaAte( AuroraLogoParser.InstrucaoCaminhoCurvaQuadraticaAteContext ctx ) {
        
        double xControle = visit( ctx.expr( 0 ) ).valorDecimal();
        double yControle = visit( ctx.expr( 1 ) ).valorDecimal();
        double x = visit( ctx.expr( 2 ) ).valorDecimal();
        double y = visit( ctx.expr( 3 ) ).valorDecimal();

        boolean d = tartaruga.isDesenhando();

        tartaruga.levantarPincel( false );
        tartaruga.moverPara( x, y );
        tartaruga.caminhoCurvaQuadraticaAte( xControle, yControle, x, y );

        if ( d ) {
            tartaruga.abaixarPincel( false );
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitInstrucaoCaminhoCurvaCubicaAte( AuroraLogoParser.InstrucaoCaminhoCurvaCubicaAteContext ctx ) {
            
        double xControle1 = visit( ctx.expr( 0 ) ).valorDecimal();
        double yControle1 = visit( ctx.expr( 1 ) ).valorDecimal();
        double xControle2 = visit( ctx.expr( 2 ) ).valorDecimal();
        double yControle2 = visit( ctx.expr( 3 ) ).valorDecimal();
        double x = visit( ctx.expr( 4 ) ).valorDecimal();
        double y = visit( ctx.expr( 5 ) ).valorDecimal();

        boolean d = tartaruga.isDesenhando();

        tartaruga.levantarPincel( false );
        tartaruga.moverPara( x, y );
        tartaruga.caminhoCurvaCubicaAte( xControle1, yControle1, xControle2, yControle2, x, y );

        if ( d ) {
            tartaruga.abaixarPincel( false );
        }
        
        return NULO;
        
    }

    @Override
    public Valor visitInstrucaoCaminhoFecharCaminho( AuroraLogoParser.InstrucaoCaminhoFecharCaminhoContext ctx ) {
        
        boolean d = tartaruga.isDesenhando();

        tartaruga.levantarPincel( false );
        //tartaruga.moverPara( x, y );
        tartaruga.fecharCaminho();

        if ( d ) {
            tartaruga.abaixarPincel( false );
        }
        
        return NULO;
        
    }

    @Override
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

    @Override
    public Valor visitFormatarTexto( AuroraLogoParser.FormatarTextoContext ctx ) {
        
        String textoFormatado = "";
        String formato = ctx.STRING().getText();
        formato = formato.substring( 1, formato.length() - 1 );
        
        List<Object> valores = new ArrayList<>();
        
        for ( AuroraLogoParser.ExprContext c : ctx.expr() ) {
            Valor v = visit( c );
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
