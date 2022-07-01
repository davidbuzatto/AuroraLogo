/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.davidbuzatto.auroralogo.parser.impl;

import br.com.davidbuzatto.auroralogo.gui.JanelaPrincipal;
import br.com.davidbuzatto.auroralogo.gui.Tartaruga;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoBaseVisitor;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author David
 */
public class DesenhistaAuroraLogoVisitor extends AuroraLogoBaseVisitor<Integer> {

    private Tartaruga tartaruga;
    //private Map<String, Integer> memoria = new HashMap<>();
    private JanelaPrincipal janelaPrincipal;
    
    public DesenhistaAuroraLogoVisitor( Tartaruga tartaruga, JanelaPrincipal janelaPrincipal ) {
        this.tartaruga = tartaruga;
        this.tartaruga.limpar();
        this.janelaPrincipal = janelaPrincipal;
    }
    
    @Override
    public Integer visitMovimentarDirecao( AuroraLogoParser.MovimentarDirecaoContext ctx ) {
        
        int valor = 1;
        
        if ( ctx.expr() != null ) {
            valor = visit( ctx.expr() );
        }
        
        if ( ctx.DIR() != null ) {
            tartaruga.moverParaDireita( valor );
        } else if ( ctx.ESQ() != null ) {
            tartaruga.moverParaEsquerda( valor );
        } else if ( ctx.CIM() != null ) {
            tartaruga.moverParaCima( valor );
        } else if ( ctx.BAI() != null ) {
            tartaruga.moverParaBaixo( valor );
        }
        
        return 0;
        
    }
    
    @Override
    public Integer visitMovimentarPonto( AuroraLogoParser.MovimentarPontoContext ctx ) {
        
        int x = visit( ctx.expr( 0 ) );
        int y = visit( ctx.expr( 1 ) );
        
        tartaruga.moverPara( x, y );
        
        return 0;
        
    }
    
    @Override
    public Integer visitTrocarCorPincel( AuroraLogoParser.TrocarCorPincelContext ctx ) {
        tartaruga.trocarCorPincel( obterCor( Color.BLACK, ctx ) );
        return 0;
    }
    
    @Override
    public Integer visitTrocarCorFundo( AuroraLogoParser.TrocarCorFundoContext ctx ) {
        tartaruga.trocarCorFundo( obterCor( Color.WHITE, ctx ) );
        return 0;
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
            vezes = visit( configuracaoCor.expr() );
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
    public Integer visitGirar( AuroraLogoParser.GirarContext ctx ) {
        int valor = 1;
        if ( ctx.expr() != null ) {
            valor = visit( ctx.expr() );
        }
        if ( ctx.SUB() != null || ctx.SUBA() != null ) {
            valor = -valor;
        }
        tartaruga.girar( valor );
        return 0;
    }

    @Override
    public Integer visitEngrossar( AuroraLogoParser.EngrossarContext ctx ) {
        int valor = 1;
        if ( ctx.expr() != null ) {
            valor = visit( ctx.expr() );
        }
        tartaruga.engrossar( valor );
        return 0;
    }

    @Override
    public Integer visitDesengrossar( AuroraLogoParser.DesengrossarContext ctx ) {
        int valor = 1;
        if ( ctx.expr() != null ) {
            valor = visit( ctx.expr() );
        }
        tartaruga.desengrossar( valor );
        return 0;
    }

    @Override
    public Integer visitTrocarGrossura( AuroraLogoParser.TrocarGrossuraContext ctx ) {
        tartaruga.setGrossura( visit( ctx.expr() ) );
        return 0;
    }

    @Override
    public Integer visitEscrever( AuroraLogoParser.EscreverContext ctx ) {
        
        StringBuilder sb = new StringBuilder();
        
        if ( ctx.STRING() != null ) {
            String t = ctx.STRING().getText();
            t = t.substring( 1, t.length() - 1 );
            sb.append( t );
        } else {
            int v = visit( ctx.expr() );
            sb.append( String.valueOf( v ) );
        }
        
        if ( ctx.concat() != null ) {
            
            for ( AuroraLogoParser.ConcatContext c : ctx.concat() ) {
                
                if ( c.STRING() != null ) {
                    String t = c.STRING().getText();
                    t = t.substring( 1, t.length() - 1 );
                    sb.append( t );
                } else {
                    int v = visit( c.expr() );
                    sb.append( String.valueOf( v ) );
                }
                
            }
            
        }
        
        tartaruga.setTexto( sb.toString() );
        return 0;
        
    }

    @Override
    public Integer visitLer( AuroraLogoParser.LerContext ctx ) {
        
        String id = ctx.ID().getText();
        int valor = 0;
        
        try {
            valor = Integer.parseInt( JOptionPane.showInputDialog( 
                    janelaPrincipal, String.format( "Entre com um valor inteiro para \"%s\":", id ) ) );
        } catch ( NumberFormatException exc ) {
        }
        
        tartaruga.inserirOuAtualizarMemoria( id, valor );
        
        return 0;
        
    }

    @Override
    public Integer visitAbaixar( AuroraLogoParser.AbaixarContext ctx ) {
        tartaruga.abaixar();
        return 0;
    }

    @Override
    public Integer visitLevantar( AuroraLogoParser.LevantarContext ctx ) {
        tartaruga.levantar();
        return 0;
    }

    @Override
    public Integer visitLimpar( AuroraLogoParser.LimparContext ctx ) {
        tartaruga.limpar();
        return 0;
    }
    
    @Override
    public Integer visitAtribuir( AuroraLogoParser.AtribuirContext ctx ) {
        String id = ctx.ID().getText();
        int valor = visit( ctx.expr() );
        tartaruga.inserirOuAtualizarMemoria( id, valor );
        return valor;
    }

    @Override
    public Integer visitExpr( AuroraLogoParser.ExprContext ctx ) {
        
        int valor = 0;
        boolean bValor = false;
        boolean logExpr = false;
        
        for ( int i = 0; i < ctx.getChildCount(); i += 2 ) {
            
            if ( i == 0 ) {
                valor = visit( ctx.getChild( i ) );
                bValor = valor != 0;                            // inteiro como boolean
            } else {
                
                logExpr = true;
                
                int op = ( (TerminalNode) ctx.getChild( i-1 ) ).getSymbol().getType();
                boolean rv = visit( ctx.getChild( i ) ) != 0;   // inteiro como boolean
                
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
                return 1;
            }
            return 0;
        }
            
        return valor;
        
    }
    
    @Override
    public Integer visitRelacao( AuroraLogoParser.RelacaoContext ctx ) {
        
        int valor = visit( ctx.exprSimp( 0 ) );
        
        if ( ctx.opRel != null ) {
            
            int rv = visit( ctx.exprSimp( 1 ) );
            boolean res = false;
            
            switch ( ctx.opRel.getType() ) {
                case AuroraLogoParser.IGU:
                case AuroraLogoParser.IGUT:
                case AuroraLogoParser.IGUA:
                    res = valor == rv;
                    break;
                case AuroraLogoParser.DIF:
                case AuroraLogoParser.DIFT:
                case AuroraLogoParser.DIFA:
                    res = valor != rv;
                    break;
                case AuroraLogoParser.ME:
                case AuroraLogoParser.MET:
                case AuroraLogoParser.MEA:
                    res = valor < rv;
                    break;
                case AuroraLogoParser.MEI:
                case AuroraLogoParser.MEIT:
                case AuroraLogoParser.MEIA:
                    res = valor <= rv;
                    break;
                case AuroraLogoParser.MA:
                case AuroraLogoParser.MAT:
                case AuroraLogoParser.MAA:
                    res = valor > rv;
                    break;
                case AuroraLogoParser.MAI:
                case AuroraLogoParser.MAIT:
                case AuroraLogoParser.MAIA:
                    res = valor >= rv;
                    break;
            }
            
            // tratando inteiro como boolean
            if ( res ) {
                return 1;
            }
            
            return 0;
            
        }
        
        return valor;
        
    }
    
    @Override
    public Integer visitExprSimp( AuroraLogoParser.ExprSimpContext ctx ) {
        
        int valor = 0;
        int mult = 1;
        int ini = 0;
        
        if ( ctx.opNeg != null && ctx.opNeg.getType() == AuroraLogoParser.SUB ) {
            mult = -1;
            ini = 1;
        }
        
        for ( int i = ini; i < ctx.getChildCount(); i += 2 ) {
            
            if ( i == ini ) {
                valor = visit( ctx.getChild( i ) );
            } else {
                int op = ( (TerminalNode) ctx.getChild( i-1 ) ).getSymbol().getType();
                int tv = visit( ctx.getChild( i ) );
                switch ( op ) {
                    case AuroraLogoParser.ADI:
                    case AuroraLogoParser.ADIA:
                        valor += tv;
                        break;
                    case AuroraLogoParser.SUB:
                    case AuroraLogoParser.SUBA:
                        valor -= tv;
                        break;
                }
            }
            
        }
        
        return mult * valor;
        
    }
    
    @Override
    public Integer visitTermo( AuroraLogoParser.TermoContext ctx ) {
        
        int valor = 0;
        
        for ( int i = 0; i < ctx.getChildCount(); i += 2 ) {
            
            if ( i == 0 ) {
                valor = visit( ctx.getChild( i ) );
            } else {
                int op = ( (TerminalNode) ctx.getChild( i-1 ) ).getSymbol().getType();
                int fv = visit( ctx.getChild( i ) );
                switch ( op ) {
                    case AuroraLogoParser.MUL:
                    case AuroraLogoParser.VEZ:
                        valor *= fv;
                        break;
                    case AuroraLogoParser.DIV:
                    case AuroraLogoParser.DIVA:
                        valor /= fv;
                        break;
                    case AuroraLogoParser.MOD:
                    case AuroraLogoParser.MODA:
                        valor %= fv;
                        break;
                }
            }
            
        }
        
        return valor;
        
    }

    @Override
    public Integer visitTerminal( TerminalNode node ) {
        return node.getSymbol().getType();
    }
    
    @Override
    public Integer visitFatorNao( AuroraLogoParser.FatorNaoContext ctx ) {
        
        int valor = visit( ctx.fator() );
            
        if ( ctx.NAO() != null || ctx.NAOT() != null ) {
            if ( valor == 0 ) {
                return 1;
            } else if ( valor == 1 ) {
                return 0;
            }
        }
        
        return valor;
        
    }
    
    @Override
    public Integer visitFatorInt( AuroraLogoParser.FatorIntContext ctx ) {
        return Integer.valueOf( ctx.INT().getText() );
    }

    @Override
    public Integer visitFatorId( AuroraLogoParser.FatorIdContext ctx ) {
        String id = ctx.ID().getText();
        return tartaruga.lerMemoria( id );
    }

    public Integer visitFatorParenteses( AuroraLogoParser.FatorParentesesContext ctx ) {
        return visit( ctx.expr() );
    }

    @Override
    public Integer visitExprBool( AuroraLogoParser.ExprBoolContext ctx ) {
        return visit( ctx.expr() );
    }

    @Override
    public Integer visitSe( AuroraLogoParser.SeContext ctx ) {
        
        boolean entrouNoSe = false;
        boolean entrouEmAlgumSenaoSe = false;
        
        if ( visit( ctx.seSe().exprBool() ) == 1 ) {
            entrouNoSe = true;
            for ( AuroraLogoParser.InstContext c : ctx.seSe().inst() ) {
                visit( c );
            }
        } else if ( ctx.seSenaoSe().children != null ) {
            
            for ( AuroraLogoParser.SeSenaoSePContext sssp : ctx.seSenaoSe().seSenaoSeP() ) {
                if ( visit( sssp.exprBool() ) == 1 ) {
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
        
        return 0;
        
    }

    @Override
    public Integer visitRepita( AuroraLogoParser.RepitaContext ctx ) {
        
        int quantidade = visit( ctx.expr() );
        
        for ( int i = 0; i < quantidade; i++ ) {
            for ( AuroraLogoParser.InstContext c : ctx.inst() ) {
                visit( c );
            }
        }
        
        return 0;
        
    }

    @Override
    public Integer visitEnquanto( AuroraLogoParser.EnquantoContext ctx ) {
        
        if ( ctx.ENQ() != null ) {
            
            while ( visit( ctx.exprBool() ) == 1 ) {
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
        
        return 0;
        
    }

    @Override
    public Integer visitErrorNode( ErrorNode node ) {
        System.out.println( node );
        return 0;
    }
    
}
