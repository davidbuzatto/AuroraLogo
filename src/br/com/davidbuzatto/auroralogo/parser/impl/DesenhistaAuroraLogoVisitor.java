
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.davidbuzatto.auroralogo.parser.impl;

import br.com.davidbuzatto.auroralogo.gui.JanelaPrincipal;
import br.com.davidbuzatto.auroralogo.gui.Tartaruga;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoBaseVisitor;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import static br.com.davidbuzatto.auroralogo.parser.impl.ValorVariavel.*;
import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.Color;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author David
 */
public class DesenhistaAuroraLogoVisitor extends AuroraLogoBaseVisitor<ValorVariavel> {

    private Tartaruga tartaruga;
    private JanelaPrincipal janelaPrincipal;
    private JTextPane textPaneSaida;
    
    public DesenhistaAuroraLogoVisitor( 
            Tartaruga tartaruga, 
            JanelaPrincipal janelaPrincipal, 
            JTextPane textPaneSaida ) {
        this.tartaruga = tartaruga;
        this.tartaruga.limpar();
        this.janelaPrincipal = janelaPrincipal;
        this.textPaneSaida = textPaneSaida;
    }
    
    @Override
    public ValorVariavel visitMovimentarDirecao( AuroraLogoParser.MovimentarDirecaoContext ctx ) {
        
        ValorVariavel valor = UM_INTEIRO;
        
        if ( ctx.expr() != null ) {
            valor = visit( ctx.expr() );
        }
        
        if ( ctx.DIR() != null ) {
            tartaruga.moverParaDireita( valor.valorInteiro() );
        } else if ( ctx.ESQ() != null ) {
            tartaruga.moverParaEsquerda( valor.valorInteiro() );
        } else if ( ctx.CIM() != null ) {
            tartaruga.moverParaCima( valor.valorInteiro() );
        } else if ( ctx.BAI() != null ) {
            tartaruga.moverParaBaixo( valor.valorInteiro() );
        }
        
        return NULO;
        
    }
    
    @Override
    public ValorVariavel visitMovimentarPonto( AuroraLogoParser.MovimentarPontoContext ctx ) {
        
        int x = visit( ctx.expr( 0 ) ).valorInteiro();
        int y = visit( ctx.expr( 1 ) ).valorInteiro();
        
        tartaruga.moverPara( x, y );
        
        return NULO;
        
    }
    
    @Override
    public ValorVariavel visitTrocarCorPincel( AuroraLogoParser.TrocarCorPincelContext ctx ) {
        tartaruga.trocarCorPincel( obterCor( Color.BLACK, ctx ) );
        return NULO;
    }
    
    @Override
    public ValorVariavel visitTrocarCorFundo( AuroraLogoParser.TrocarCorFundoContext ctx ) {
        tartaruga.trocarCorFundo( obterCor( Color.WHITE, ctx ) );
        return NULO;
    }
    
    private Color obterCor( Color corInicial, AuroraLogoParser.TrocarCorContext ctx ) {
        
        Color cor = corInicial;
        AuroraLogoParser.ConfiguracaoCorContext configuracaoCor = null;
        
        if ( ctx instanceof AuroraLogoParser.TrocarCorPincelContext ) {
            configuracaoCor = ( (AuroraLogoParser.TrocarCorPincelContext) ctx ).configuracaoCor();
        } else if ( ctx instanceof AuroraLogoParser.TrocarCorFundoContext ) {
            configuracaoCor = ( (AuroraLogoParser.TrocarCorFundoContext) ctx ).configuracaoCor();
        }
        
        if ( configuracaoCor.HEX() != null ) {
            
            //cor = Color.decode( configuracaoCor.HEX().getText() );
            cor = Color.decode( configuracaoCor.HEX().getText().substring( 0, 8 ) );
            
            if ( configuracaoCor.HEX().getText().length() == 10 ) {
                String alpha = configuracaoCor.HEX().getText().substring( 8 );
                cor = new Color( cor.getRed(), cor.getGreen(), cor.getBlue(), Integer.valueOf( alpha, 16 ) );
            }
            
        } else {
            
            switch ( configuracaoCor.cor.getType() ) {
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
        
        int vezes = 1;
        
        if ( configuracaoCor.expr() != null ) {
            vezes = visit( configuracaoCor.expr() ).valorInteiro();
            if ( vezes <= 0 ) {
                vezes = 1;
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
    public ValorVariavel visitGirar( AuroraLogoParser.GirarContext ctx ) {
        
        int valor = 1;
        
        if ( ctx.expr() != null ) {
            valor = visit( ctx.expr() ).valorInteiro();
        }
        
        tartaruga.girar( valor );
        
        return NULO;
        
    }

    @Override
    public ValorVariavel visitEngrossar( AuroraLogoParser.EngrossarContext ctx ) {
        
        int valor = 1;
        
        if ( ctx.expr() != null ) {
            valor = visit( ctx.expr() ).valorInteiro();
        }
        
        tartaruga.engrossar( valor );
        
        return NULO;
        
    }

    @Override
    public ValorVariavel visitDesengrossar( AuroraLogoParser.DesengrossarContext ctx ) {
        
        int valor = 1;
        
        if ( ctx.expr() != null ) {
            valor = visit( ctx.expr() ).valorInteiro();
        }
        
        tartaruga.desengrossar( valor );
        
        return NULO;
        
    }

    @Override
    public ValorVariavel visitTrocarGrossura( AuroraLogoParser.TrocarGrossuraContext ctx ) {
        tartaruga.setGrossura( visit( ctx.expr() ).valorInteiro() );
        return NULO;
    }

    @Override
    public ValorVariavel visitEscrever( AuroraLogoParser.EscreverContext ctx ) {
        
        /*StringBuilder sb = new StringBuilder();
        
        if ( ctx.STRING() != null ) {
            String t = ctx.STRING().getText();
            t = t.substring( 1, t.length() - 1 );
            sb.append( t );
        } else {
            ValorVariavel v = visit( ctx.expr() );
            if ( v.isBooleano() ) {
                sb.append( v );
            } else {
                sb.append( v.getValor() );
            }
        }
        
        if ( ctx.concat() != null ) {
            
            for ( AuroraLogoParser.ConcatContext c : ctx.concat() ) {
                
                if ( c.STRING() != null ) {
                    String t = c.STRING().getText();
                    t = t.substring( 1, t.length() - 1 );
                    sb.append( t );
                } else {
                    ValorVariavel v = visit( c.expr() );
                    if ( v.isBooleano() ) {
                        sb.append( v );
                    } else {
                        sb.append( v.getValor() );
                    }
                }
                
            }
            
        }
        
        if ( ctx.NA() != null ) {
            Utils.inserirMensagemEmitente( textPaneSaida, "tartaruga escreveu", sb.toString() + "\n", tartaruga.getCor() );
        } else {
            tartaruga.setTexto( sb.toString() );
        }*/
        
        String valor;
        
        ValorVariavel v = visit( ctx.expr() );
        if ( v.isBooleano() ) {
            valor = String.valueOf( v );
        } else {
            valor = String.valueOf( v.getValor() );
        }
        
        
        if ( ctx.NA() != null ) {
            Utils.inserirMensagemEmitente( textPaneSaida, "tartaruga escreveu", valor + "\n", tartaruga.getCor() );
        } else {
            tartaruga.setTexto( valor );
        }
        
        return NULO;
        
    }

    @Override
    public ValorVariavel visitLer( AuroraLogoParser.LerContext ctx ) {
        
        String id = ctx.ID().getText();
        ValorVariavel valor = NULO;
        
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
    public ValorVariavel visitAbaixar( AuroraLogoParser.AbaixarContext ctx ) {
        tartaruga.abaixar();
        return NULO;
    }

    @Override
    public ValorVariavel visitLevantar( AuroraLogoParser.LevantarContext ctx ) {
        tartaruga.levantar();
        return NULO;
    }

    @Override
    public ValorVariavel visitLimpar( AuroraLogoParser.LimparContext ctx ) {
        tartaruga.limpar();
        return NULO;
    }
    
    @Override
    public ValorVariavel visitAtribuir( AuroraLogoParser.AtribuirContext ctx ) {
        
        String id = ctx.ID().getText();
        
        ValorVariavel valor = visit( ctx.expr() );
        tartaruga.inserirOuAtualizarMemoria( id, valor );
        
        return valor;
        
    }

    @Override
    public ValorVariavel visitExpr( AuroraLogoParser.ExprContext ctx ) {
        
        ValorVariavel valor = ZERO_INTEIRO;
        
        for ( int i = 0; i < ctx.getChildCount(); i += 2 ) {
            
            if ( i == 0 ) {
                valor = visit( ctx.getChild( i ) );
            } else {
                
                int op = ( (TerminalNode) ctx.getChild( i-1 ) ).getSymbol().getType();
                ValorVariavel rv = visit( ctx.getChild( i ) );
                
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
        
        
        /*ValorVariavel valor = ZERO_INTEIRO;
        boolean bValor = false;
        boolean logExpr = false;
        
        for ( int i = 0; i < ctx.getChildCount(); i += 2 ) {
            
            if ( i == 0 ) {
                valor = visit( ctx.getChild( i ) );
                bValor = valor.valorInteiro() != 0;                            // inteiro como boolean
            } else {
                
                logExpr = true;
                
                int op = ( (TerminalNode) ctx.getChild( i-1 ) ).getSymbol().getType();
                boolean rv = visit( ctx.getChild( i ) ).valorInteiro() != 0;   // inteiro como boolean
                
                switch ( op ) {
                    case AuroraLogoParser.ELG:
                    case AuroraLogoParser.ELGT:
                        bValor = bValor && rv;
                        break;
                    case AuroraLogoParser.OLG:
                    case AuroraLogoParser.OLGT:
                        bValor = bValor || rv;
                        break;
                }
                
            }
            
        }
        
        // tratando inteiro como boolean
        if ( logExpr ) {
            if ( bValor ) {
                return UM_INTEIRO;
            }
            return ZERO_INTEIRO;
        }
            
        return valor;*/
        
    }
    
    @Override
    public ValorVariavel visitRelacao( AuroraLogoParser.RelacaoContext ctx ) {
        
        ValorVariavel valor = visit( ctx.exprSimp( 0 ) );
        
        if ( ctx.opRel != null ) {
            
            ValorVariavel rv = visit( ctx.exprSimp( 1 ) );
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
    public ValorVariavel visitExprSimp( AuroraLogoParser.ExprSimpContext ctx ) {
        
        ValorVariavel valor = ZERO_INTEIRO;
        ValorVariavel mult = UM_INTEIRO;
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
                ValorVariavel tv = visit( ctx.getChild( i ) );
                
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
    public ValorVariavel visitTermo( AuroraLogoParser.TermoContext ctx ) {
        
        ValorVariavel valor = ZERO_INTEIRO;
        
        for ( int i = 0; i < ctx.getChildCount(); i += 2 ) {
            
            if ( i == 0 ) {
                valor = visit( ctx.getChild( i ) );
            } else {
                
                int op = ( (TerminalNode) ctx.getChild( i-1 ) ).getSymbol().getType();
                ValorVariavel fv = visit( ctx.getChild( i ) );
                
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
                                valor = novoInteiro( valor.valorInteiro() / fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorInteiro() / fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( valor.valorInteiro() / fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( valor.valorInteiro() / ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isDecimal() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoDecimal( valor.valorDecimal() / fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorDecimal() / fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoDecimal( valor.valorDecimal() / fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoDecimal( valor.valorDecimal() / ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isCaractere() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCaractere() / fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorCaractere() / fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( valor.valorCaractere() / fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( valor.valorCaractere() / ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isBooleano() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) / fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( ( valor.valorBooleano() ? 1 : 0 ) / fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) / fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) / ( fv.valorBooleano() ? 1 : 0 ) );
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
                                valor = novoInteiro( valor.valorInteiro() % fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorInteiro() % fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( valor.valorInteiro() % fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( valor.valorInteiro() % ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isDecimal() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoDecimal( valor.valorDecimal() % fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorDecimal() % fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoDecimal( valor.valorDecimal() % fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoDecimal( valor.valorDecimal() % ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isCaractere() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( valor.valorCaractere() % fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( valor.valorCaractere() % fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( valor.valorCaractere() % fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( valor.valorCaractere() % ( fv.valorBooleano() ? 1 : 0 ) );
                            } else if ( fv.isString() ) {
                                // ignora strings
                            } else {
                                // valor é o prório
                            }
                        } else if ( valor.isBooleano() ) {
                            if ( fv.isInteiro() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) % fv.valorInteiro() );
                            } else if ( fv.isDecimal() ) {
                                valor = novoDecimal( ( valor.valorBooleano() ? 1 : 0 ) % fv.valorDecimal() );
                            } else if ( fv.isCaractere() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) % fv.valorCaractere() );
                            } else if ( fv.isBooleano() ) {
                                valor = novoInteiro( ( valor.valorBooleano() ? 1 : 0 ) % ( fv.valorBooleano() ? 1 : 0 ) );
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
    public ValorVariavel visitFatorNao( AuroraLogoParser.FatorNaoContext ctx ) {
        
        ValorVariavel valor = visit( ctx.fator() );
            
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
    public ValorVariavel visitFatorInt( AuroraLogoParser.FatorIntContext ctx ) {
        return ValorVariavel.novoInteiro( ctx.INT().getText() );
    }
    
    @Override
    public ValorVariavel visitFatorDec( AuroraLogoParser.FatorDecContext ctx ) {
        return ValorVariavel.novoDecimal( ctx.DEC().getText() );
    }

    @Override
    public ValorVariavel visitFatorPi( AuroraLogoParser.FatorPiContext ctx ) {
        System.out.println( "a" );
        return PI_DECIMAL;
    }

    @Override
    public ValorVariavel visitFatorId( AuroraLogoParser.FatorIdContext ctx ) {
        
        if ( ctx.bool() != null ) {
            return visit( ctx.bool() );
        }
        
        String id = ctx.ID().getText();
        return tartaruga.lerMemoria( id );
        
    }

    @Override
    public ValorVariavel visitBool( AuroraLogoParser.BoolContext ctx ) {
        if ( ctx.VER() != null ) {
            return VERDADEIRO;
        }
        return FALSO;
    }

    @Override
    public ValorVariavel visitFatorChar( AuroraLogoParser.FatorCharContext ctx ) {
        return novoCaractere( ctx.getText().substring( 1, ctx.getText().length() - 1 ).charAt( 0 ) );
    }

    @Override
    public ValorVariavel visitFatorString( AuroraLogoParser.FatorStringContext ctx ) {
        return novaString( ctx.getText().substring( 1, ctx.getText().length() - 1 ) );
    }
    
    @Override
    public ValorVariavel visitFatorParenteses( AuroraLogoParser.FatorParentesesContext ctx ) {
        return visit( ctx.expr() );
    }

    @Override
    public ValorVariavel visitExprBool( AuroraLogoParser.ExprBoolContext ctx ) {
        return visit( ctx.expr() );
    }

    @Override
    public ValorVariavel visitSe( AuroraLogoParser.SeContext ctx ) {
        
        boolean entrouNoSe = false;
        boolean entrouEmAlgumSenaoSe = false;
        
        if ( visit( ctx.seSe().exprBool() ).isVerdadeiro() ) {
            entrouNoSe = true;
            for ( AuroraLogoParser.InstContext c : ctx.seSe().inst() ) {
                visit( c );
            }
        } else if ( ctx.seSenaoSe().children != null ) {
            
            for ( AuroraLogoParser.SeSenaoSePContext sssp : ctx.seSenaoSe().seSenaoSeP() ) {
                if ( visit( sssp.exprBool() ).isVerdadeiro() ) {
                    entrouEmAlgumSenaoSe = true;
                    for ( AuroraLogoParser.InstContext c : sssp.inst() ) {
                        visit( c );
                    }
                    break;
                }
            }
            
        }
        
        if ( ctx.seSenao().children != null && !entrouNoSe && !entrouEmAlgumSenaoSe ) {
            for ( AuroraLogoParser.InstContext c : ctx.seSenao().inst() ) {
                visit( c );
            }
        }
        
        return NULO;
        
    }

    @Override
    public ValorVariavel visitRepetir( AuroraLogoParser.RepetirContext ctx ) {
        
        int quantidade = visit( ctx.expr() ).valorInteiro();
        
        for ( int i = 0; i < quantidade; i++ ) {
            for ( AuroraLogoParser.InstContext c : ctx.inst() ) {
                visit( c );
            }
        }
        
        return NULO;
        
    }

    @Override
    public ValorVariavel visitRepetirEnquanto( AuroraLogoParser.RepetirEnquantoContext ctx ) {
        
        if ( ctx.ENQ() != null ) {
            
            while ( visit( ctx.exprBool() ).isVerdadeiro() ) {
                for ( AuroraLogoParser.InstContext c : ctx.inst() ) {
                    visit( c );
                }
            }
            
        } else {
            
            int cont = 0;
            int max = 1000;
            
            while ( cont < max ) {
                for ( AuroraLogoParser.InstContext c : ctx.inst() ) {
                    visit( c );
                }
                cont++;
            }
            
        }
        
        return NULO;
        
    }

    @Override
    public ValorVariavel visitErrorNode( ErrorNode node ) {
        System.out.println( node );
        return NULO;
    }

    @Override
    public ValorVariavel visitFuncaoAbsoluto( AuroraLogoParser.FuncaoAbsolutoContext ctx ) {
        
        ValorVariavel v = visit( ctx.expr() );
        
        if ( v.isInteiro() ) {
            return novoInteiro( Math.abs( v.valorInteiro() ) );
        } else if ( v.isDecimal() ) {
            return novoDecimal( Math.abs( v.valorDecimal() ) );
        }
       
        return ZERO_INTEIRO;
       
    }
    
    @Override
    public ValorVariavel visitFuncaoRaizQuadrada( AuroraLogoParser.FuncaoRaizQuadradaContext ctx ) {
        
        ValorVariavel v = visit( ctx.expr() );
        
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
    public ValorVariavel visitFuncaoRaizCubica( AuroraLogoParser.FuncaoRaizCubicaContext ctx ) {
        
        ValorVariavel v = visit( ctx.expr() );
        
        if ( v.isInteiro() ) {
            return novoDecimal( Math.cbrt( v.valorInteiro() ) );
        } else if ( v.isDecimal() ) {
            return novoDecimal( Math.cbrt( v.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public ValorVariavel visitFuncaoRaiz( AuroraLogoParser.FuncaoRaizContext ctx ) {
        
        ValorVariavel vRad = visit( ctx.expr( 0 ) );
        ValorVariavel vInd = visit( ctx.expr( 1 ) );
        
        if ( vRad.isNumero() && vInd.isNumero() ) {
            return novoDecimal( Math.pow( vRad.valorDecimal(), 1.0 / vInd.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public ValorVariavel visitFuncaoPotencia( AuroraLogoParser.FuncaoPotenciaContext ctx ) {
        
        ValorVariavel vBase = visit( ctx.expr( 0 ) );
        ValorVariavel vExp = visit( ctx.expr( 1 ) );
        
        if ( vBase.isNumero() && vExp.isNumero() ) {
            return novoDecimal( Math.pow( vBase.valorDecimal(), vExp.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public ValorVariavel visitFuncaoHipotenusa( AuroraLogoParser.FuncaoHipotenusaContext ctx ) {
        
        ValorVariavel lado1 = visit( ctx.expr( 0 ) );
        ValorVariavel lado2 = visit( ctx.expr( 1 ) );
        
        if ( lado1.isNumero() && lado2.isNumero() ) {
            return novoDecimal( Math.hypot( lado1.valorDecimal(), lado2.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public ValorVariavel visitFuncaoChao( AuroraLogoParser.FuncaoChaoContext ctx ) {
        
        ValorVariavel v = visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.floor( v.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public ValorVariavel visitFuncaoTeto( AuroraLogoParser.FuncaoTetoContext ctx ) {
        
        ValorVariavel v = visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.ceil( v.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public ValorVariavel visitFuncaoArredondar( AuroraLogoParser.FuncaoArredondarContext ctx ) {
        
        if ( ctx.expr( 1 ) == null ) {
            
            ValorVariavel v = visit( ctx.expr( 0 ) );
        
            if ( v.isNumero() ) {
                return novoInteiro( (int) Math.round( v.valorDecimal() ) );
            }
        
        } else {
            
            ValorVariavel v = visit( ctx.expr( 0 ) );
            ValorVariavel casas = visit( ctx.expr( 1 ) );
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
    public ValorVariavel visitFuncaoMinimo( AuroraLogoParser.FuncaoMinimoContext ctx ) {
        
        ValorVariavel n1 = visit( ctx.expr( 0 ) );
        ValorVariavel n2 = visit( ctx.expr( 1 ) );
        
        if ( n1.isNumero() && n2.isNumero() ) {
            if ( n1.isInteiro() && n2.isInteiro() ) {
                return novoInteiro( Math.min( n1.valorInteiro(), n2.valorInteiro() ) );
            }
            return novoDecimal( Math.min( n1.valorDecimal(), n2.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }
    
    @Override
    public ValorVariavel visitFuncaoMaximo( AuroraLogoParser.FuncaoMaximoContext ctx ) {
        
        ValorVariavel n1 = visit( ctx.expr( 0 ) );
        ValorVariavel n2 = visit( ctx.expr( 1 ) );
        
        if ( n1.isNumero() && n2.isNumero() ) {
            if ( n1.isInteiro() && n2.isInteiro() ) {
                return novoInteiro( Math.max( n1.valorInteiro(), n2.valorInteiro() ) );
            }
            return novoDecimal( Math.max( n1.valorDecimal(), n2.valorDecimal() ) );
        }
       
        return ZERO_DECIMAL;
       
    }

    @Override
    public ValorVariavel visitFuncaoNumeroAleatorio( AuroraLogoParser.FuncaoNumeroAleatorioContext ctx ) {
        // TODO: função número aleatório
        return super.visitFuncaoNumeroAleatorio( ctx ); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public ValorVariavel visitFuncaoSeno( AuroraLogoParser.FuncaoSenoContext ctx ) {
        
        ValorVariavel a = visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            double rad = Math.toRadians( a.valorDecimal() );
            return novoDecimal( Math.sin( rad ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public ValorVariavel visitFuncaoSenoHiperbolico( AuroraLogoParser.FuncaoSenoHiperbolicoContext ctx ) {
        
        ValorVariavel a = visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            return novoDecimal( Math.sinh( a.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public ValorVariavel visitFuncaoArcoSeno( AuroraLogoParser.FuncaoArcoSenoContext ctx ) {
        
        ValorVariavel v = visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.toDegrees( Math.asin( v.valorDecimal() ) ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public ValorVariavel visitFuncaoCosseno( AuroraLogoParser.FuncaoCossenoContext ctx ) {
        
        ValorVariavel a = visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            double rad = Math.toRadians( a.valorDecimal() );
            return novoDecimal( Math.cos( rad ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public ValorVariavel visitFuncaoCossenoHiperbolico( AuroraLogoParser.FuncaoCossenoHiperbolicoContext ctx ) {
        
        ValorVariavel a = visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            return novoDecimal( Math.cosh( a.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public ValorVariavel visitFuncaoArcoCosseno( AuroraLogoParser.FuncaoArcoCossenoContext ctx ) {
        
        ValorVariavel v = visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.toDegrees( Math.acos( v.valorDecimal() ) ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public ValorVariavel visitFuncaoTangente( AuroraLogoParser.FuncaoTangenteContext ctx ) {
        
        ValorVariavel a = visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            double rad = Math.toRadians( a.valorDecimal() );
            return novoDecimal( Math.tan( rad ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public ValorVariavel visitFuncaoTangenteHiperbolica( AuroraLogoParser.FuncaoTangenteHiperbolicaContext ctx ) {
        
        ValorVariavel a = visit( ctx.expr() );
        
        if ( a.isNumero() ) {
            return novoDecimal( Math.tanh( a.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public ValorVariavel visitFuncaoArcoTangente( AuroraLogoParser.FuncaoArcoTangenteContext ctx ) {
        
        ValorVariavel v = visit( ctx.expr() );
        
        if ( v.isNumero() ) {
            return novoDecimal( Math.toDegrees( Math.atan( v.valorDecimal() ) ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
    @Override
    public ValorVariavel visitFuncaoCartesianoParaPolar( AuroraLogoParser.FuncaoCartesianoParaPolarContext ctx ) {
        
        ValorVariavel y = visit( ctx.expr( 0 ) );
        ValorVariavel x = visit( ctx.expr( 1 ) );
        
        if ( y.isNumero() && x.isNumero() ) {
            return novoDecimal( Math.toDegrees( Math.atan2( y.valorDecimal(), x.valorDecimal() ) ) );
        }
       
        return ZERO_DECIMAL;
       
    }

    @Override
    public ValorVariavel visitFuncaoLogaritmo( AuroraLogoParser.FuncaoLogaritmoContext ctx ) {
        // TODO: função logarítmo
        return super.visitFuncaoLogaritmo( ctx ); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public ValorVariavel visitFuncaoGrausParaRadianos( AuroraLogoParser.FuncaoGrausParaRadianosContext ctx ) {
        
        ValorVariavel g = visit( ctx.expr() );
        
        if ( g.isNumero() ) {
            return novoDecimal( Math.toRadians( g.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }

    @Override
    public ValorVariavel visitFuncaoRadianosParaGraus( AuroraLogoParser.FuncaoRadianosParaGrausContext ctx ) {
        
        ValorVariavel r = visit( ctx.expr() );
        
        if ( r.isNumero() ) {
            return novoDecimal( Math.toDegrees( r.valorDecimal() ) );
        }
        
        return ZERO_DECIMAL;
        
    }
    
}
