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
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import static br.com.davidbuzatto.auroralogo.parser.impl.Valor.*;
import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

/**
 *
 * @author Prof. Dr. David Buzatto
 */
public class ComponenteVisitorConstrutos {
    
    // identificador das instruções de repetição (repetir ... vezes, 
    // enquanto ... repetir) e condicionais (usando .. escolha) usado pela
    // instruçã "parar" para sinalizar quem deve ser interrompido.
    private int idInstrucaoParavel;
    
    private Tartaruga tartaruga;
    private JanelaPrincipal janelaPrincipal;
    private JTextPane textPaneSaida;
    private AuroraLogoDesenhistaVisitor visitor;
    
    public ComponenteVisitorConstrutos( 
            Tartaruga tartaruga, 
            JanelaPrincipal janelaPrincipal, 
            JTextPane textPaneSaida, 
            AuroraLogoDesenhistaVisitor visitor ) {
        this.tartaruga = tartaruga;
        this.janelaPrincipal = janelaPrincipal;
        this.textPaneSaida = textPaneSaida;
        this.visitor = visitor;
    }
    
    public Valor visitExprBool( AuroraLogoParser.ExprBoolContext ctx ) {
        return visitor.visit( ctx.expr() );
    }
    
    public Valor visitSe( AuroraLogoParser.SeContext ctx ) {
        
        boolean entrouNoSe = false;
        boolean entrouEmAlgumSenaoSe = false;
        
        Valor retorno = NULO;
        
        if ( visitor.visit( ctx.seSe().exprBool() ).isVerdadeiro() ) {
            
            entrouNoSe = true;
            
            for ( AuroraLogoParser.InstContext c : ctx.seSe().inst() ) {
                
                if ( c.ains() != null ) { 
                    
                    // se for uma instrução de parada ou de continuar
                    if ( c.ains().parar() != null ||
                         c.ains().continuar() != null ) {
                        
                        Valor r;
                        
                        if ( c.ains().parar() != null ) {
                            r = visitor.visit( c.ains().parar() );
                        } else {
                            r = visitor.visit( c.ains().continuar() );
                        }
                        
                        retorno = r; // sinaliza para o chamador
                        break;       // para o for de instruções do se
                        
                    } else {
                        visitor.visit( c );
                    }
                    
                } else {
                    
                    Valor v = visitor.visit( c );
                    
                    // captura retorno de outros ses
                    if ( v != null && ( v.isParar() || v.isContinuar() ) ) {
                        retorno = v;  // sinaliza para propagar
                        break;        // para o for de instruções do se
                    }
                    
                }
                
            }
            
        } else if ( ctx.seSenaoSe() != null ) {
            
            for ( AuroraLogoParser.SeSenaoSeContext sssp : ctx.seSenaoSe() ) {
                
                if ( visitor.visit( sssp.exprBool() ).isVerdadeiro() ) {
                    
                    entrouEmAlgumSenaoSe = true;
                    
                    for ( AuroraLogoParser.InstContext c : sssp.inst() ) {
                        
                        if ( c.ains() != null ) { 

                            // se for uma instrução de parada ou de continuar
                            if ( c.ains().parar() != null ||
                                 c.ains().continuar() != null ) {

                                Valor r;

                                if ( c.ains().parar() != null ) {
                                    r = visitor.visit( c.ains().parar() );
                                } else {
                                    r = visitor.visit( c.ains().continuar() );
                                }
                                
                                retorno = r; // sinaliza para o chamador
                                break;       // para o for de instruções do se

                            } else {
                                visitor.visit( c );
                            }

                        } else {

                            Valor v = visitor.visit( c );

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
                            r = visitor.visit( c.ains().parar() );
                        } else {
                            r = visitor.visit( c.ains().continuar() );
                        }
                        
                        retorno = r; // sinaliza para o chamador
                        break;       // para o for de instruções do se
                        
                    } else {
                        visitor.visit( c );
                    }
                    
                } else {
                    
                    Valor v = visitor.visit( c );
                    
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
                    
                    Valor v = visitor.visit( c );
                    
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
    
    public Valor visitRepetir( AuroraLogoParser.RepetirContext ctx ) {
        
        int id = ++idInstrucaoParavel;
        int quantidade = visitor.visit( ctx.expr() ).valorInteiro();
        boolean breakExt = false;
        
        for ( int i = 0; i < quantidade; i++ ) {
            
            if ( !breakExt ) {
            
                for ( AuroraLogoParser.InstContext c : ctx.inst() ) {
                    
                    if ( c.ains() != null ) { 
                        
                        if ( c.ains().parar() != null  ) {
                        
                            // se for um parar do corpo da instrução
                            Valor p = visitor.visit( c.ains().parar() );

                            // se o id bater, para essa instrução
                            if ( p.valorIdParar() == id ) {
                                breakExt = true;
                                break;
                            }
                            
                        } else if ( c.ains().continuar() != null  ) {
                            
                            // se for um continuar do corpo da instrução
                            Valor con = visitor.visit( c.ains().continuar() );
                            
                            // se o id bater, continua essa instrução matando o for interno
                            if ( con.valorIdContinuar() == id ) {
                                break;
                            }
                            
                        } else {
                            visitor.visit( c );
                        }
                        
                    } else {
                        
                        Valor v = visitor.visit( c );
                        
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
    
    public Valor visitRepetirEnquanto( AuroraLogoParser.RepetirEnquantoContext ctx ) {
        
        int id = ++idInstrucaoParavel;
        boolean breakExt = false;
        
        int cont = 0;
        int max = 1000;
                
        if ( ctx.ENQ() != null ) {
            
            // como tratar loop infinito implícito?
            while ( visitor.visit( ctx.exprBool() ).isVerdadeiro() ) {
                
                if ( cont == max ) {
                        
                    cont = 0;
                    max = continuarExecucao( max );

                    if ( max < 1 ) {
                        break;
                    }

                }
                
                if ( !breakExt ) {
                
                    for ( AuroraLogoParser.InstContext c : ctx.inst() ) {

                        if ( c.ains() != null ) { 

                            if ( c.ains().parar() != null  ) {

                                // se for um parar do corpo da instrução
                                Valor p = visitor.visit( c.ains().parar() );

                                // se o id bater, para essa instrução
                                if ( p.valorIdParar() == id ) {
                                    breakExt = true;
                                    break;
                                }

                            } else if ( c.ains().continuar() != null  ) {

                                // se for um continuar do corpo da instrução
                                Valor con = visitor.visit( c.ains().continuar() );

                                // se o id bater, continua essa instrução matando o for interno
                                if ( con.valorIdContinuar() == id ) {
                                    break;
                                }

                            } else {
                                visitor.visit( c );
                            }

                        } else {

                            Valor v = visitor.visit( c );

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
                    
                    calcularPasso( ctx );
                
                } else {
                    break;
                }
                
                cont++;
                
            }
            
        } else { // loop infinito explícito
            
            if ( !breakExt ) {

                while ( true ) {
                    
                    if ( cont == max ) {
                        
                        cont = 0;
                        max = continuarExecucao( max );
                        
                        if ( max < 1 ) {
                            break;
                        }
                        
                    }
                    
                    if ( !breakExt ) {
                
                        for ( AuroraLogoParser.InstContext c : ctx.inst() ) {

                            if ( c.ains() != null ) { 

                                if ( c.ains().parar() != null  ) {

                                    // se for um parar do corpo da instrução
                                    Valor p = visitor.visit( c.ains().parar() );

                                    // se o id bater, para essa instrução
                                    if ( p.valorIdParar() == id ) {
                                        breakExt = true;
                                        break;
                                    }

                                } else if ( c.ains().continuar() != null  ) {

                                    // se for um continuar do corpo da instrução
                                    Valor con = visitor.visit( c.ains().continuar() );

                                    // se o id bater, continua essa instrução matando o for interno
                                    if ( con.valorIdContinuar() == id ) {
                                        break;
                                    }

                                } else {
                                    visitor.visit( c );
                                }

                            } else {

                                Valor v = visitor.visit( c );

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
                        
                        calcularPasso( ctx );
                        
                    } else {
                        break;
                    }
                    
                    cont++;
                    
                }
                
            }
            
        }
        
        return NULO;
        
    }
    
    public Valor visitParar( AuroraLogoParser.PararContext ctx ) {
        return novoParar( idInstrucaoParavel );
    }
    
    public Valor visitContinuar( AuroraLogoParser.ContinuarContext ctx ) {
        return novoContinuar( idInstrucaoParavel );
    }
    
    private void calcularPasso( AuroraLogoParser.RepetirEnquantoContext ctx ) {
        
        if ( ctx.ID() != null ) {
                        
            String idP = ctx.ID().getText();
            Valor vIdP = tartaruga.lerMemoria( idP );
            if ( vIdP.isNulo() ) {
                vIdP = novoInteiro( 0 );
            }

            Valor vP = null;
            if ( ctx.expr() != null ) {
                vP = visitor.visit( ctx.expr() );
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

        }
        
    }
    
    private int continuarExecucao( int max ) {
        
        Color corFundo = Utils.gerarComponenteGradiente( tartaruga.getCor(), Color.WHITE, 0.9 );
        Color corTexto = Utils.gerarComponenteGradiente( tartaruga.getCor(), Color.BLACK, 0.5 );
        
        JTextPane tp = new JTextPane();
        tp.setEditable( false );
        tp.setBackground( corFundo );
        tp.setBorder( new LineBorder( corTexto ) );
        tp.setFont( textPaneSaida.getFont() );
        
        Utils.inserirMensagemEmitente( 
                tp, "tartaruga escreveu", 
                          "Eu provavelmente entrei em um laço/loop\n"
                        + "infinito, pois já o executei " + max + ( max == 1 ? " vez" : " vezes" ) + "!\n\n"
                        + "Eu gostaria de saber se devo continuar a executar esse laço e,\n"
                        + "em caso afirmativo, eu preciso que você me informe por mais\n"
                        + "quantas vezes eu devo repeti-lo.\n\n"
                        + "Caso deseje que eu pare, basta cancelar ou fechar esse diálogo,\n"
                        + "ou então informar um valor inválido, ou seja, qualquer coisa que\n"
                        + "não seja um inteiro positivo.",
                tartaruga.getCor() );

        /*Object paneBG = UIManager.get( "OptionPane.background" );
        Object tfBG = UIManager.get( "TextField.background" );
        Object tfFG = UIManager.get( "TextField.foreground" );
        
        UIManager.put( "OptionPane.background", corFundo );
        UIManager.put( "TextField.background", corFundo );
        UIManager.put( "TextField.foreground", corTexto );*/
        
        
        String valor = JOptionPane.showInputDialog( 
                janelaPrincipal, 
                tp, 
                "Devo Continuar?", 
                JOptionPane.QUESTION_MESSAGE );

        /*UIManager.put( "OptionPane.background", paneBG );
        UIManager.put( "TextField.background", tfBG );
        UIManager.put( "TextField.foreground", tfFG );*/
        
        try {
            int valorInt = Integer.parseInt( valor );
            return valorInt;
        } catch ( NumberFormatException exc ) {
            return 0;
        }
        
    }
    
}
