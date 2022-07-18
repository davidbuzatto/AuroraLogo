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
import static br.com.davidbuzatto.auroralogo.parser.impl.Valor.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Implementação dos métodos de visita para a definição e invocação de funções.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class ComponenteVisitorFuncoes {
    
    private Tartaruga tartaruga;
    private AuroraLogoDesenhistaVisitor visitor;
    
    // pilha para resolução de escopo
    public static final Deque<String> PILHA_ESCOPOS = new ArrayDeque<>();
    private static int contadorInvocacao = 0;
    
    public ComponenteVisitorFuncoes( 
            Tartaruga tartaruga, 
            AuroraLogoDesenhistaVisitor visitor ) {
        this.tartaruga = tartaruga;
        this.visitor = visitor;
    }
    
    public static void resetControleEscopo() {
        PILHA_ESCOPOS.clear();
        contadorInvocacao = 0;
    }
    
    public Valor visitFunc( AuroraLogoParser.FuncContext ctx ) {
        
        String id = ctx.IDF().getText();
        Valor funcao = novaFuncao( ctx );
        tartaruga.inserirOuAtualizarMemoria( id, funcao );
        
        return funcao;
        
    }
    
    public Valor visitFatorChamadaFuncao( AuroraLogoParser.FatorChamadaFuncaoContext ctx ) {
        
        AuroraLogoParser.ChamadaFuncaoContext cctx = ctx.chamadaFuncao();
        
        String id = cctx.IDF().getText();
        Valor funcao = tartaruga.lerMemoria( id );
        
        if ( funcao.isFuncao() ) {
            
            AuroraLogoParser.FuncContext fctx = (AuroraLogoParser.FuncContext) funcao.valorFuncao();
            
            // obtém os valores no escopo anterior
            List<Valor> argumentos = new ArrayList<>();
            for ( AuroraLogoParser.ExprContext e : cctx.expr() ) {
                argumentos.add( visitor.visit( e ) );
            }
            
            // abre um novo escopo
            String idFuncao = fctx.IDF().getText() + "_" + contadorInvocacao++;
            PILHA_ESCOPOS.push( idFuncao );
            
            List<String> parametros = new ArrayList<>();
            for ( TerminalNode t : fctx.ID() ) {
                parametros.add( idFuncao + "(" + t.getText() + ")" );
            }
            
            List<Valor> argumentosFaltando = new ArrayList<>();
            if ( argumentos.size() < parametros.size() ) {
                for ( int i = 0; i < parametros.size() - argumentos.size(); i++ ) {
                    argumentosFaltando.add( novoNulo() );
                }
            }
            argumentos.addAll( argumentosFaltando );
            
            for ( int i = 0; i < parametros.size(); i++ ) {
                tartaruga.inserirOuAtualizarMemoria( parametros.get( i ), argumentos.get( i ) );
            }
            
            AuroraLogoParser.FuncContext corpoFuncao = (AuroraLogoParser.FuncContext) funcao.getValor();
            
            for ( AuroraLogoParser.InstfContext ifc : corpoFuncao.instf() ) {
                
                AuroraLogoParser.InstContext inst = ifc.inst();
                
                if ( inst.ains() != null && inst.ains().retornar() != null ) {
                    
                    Valor vRet = visitor.visit( inst.ains().retornar() );
                    limparMemoriaEscopo( idFuncao );
                    return ( (Valor) vRet.getValor() );
                    
                } else {
                    
                    Valor v = visitor.visit( inst );
                    
                    // retorno recebido indiretamente (condicionais e repetição)
                    if ( v != null && v.isRetorno() ) {
                        limparMemoriaEscopo( idFuncao );
                        return ( (Valor) v.getValor() );
                    }
                    
                }
                
            }
            
        }
        
        // função sem retorno
        PILHA_ESCOPOS.pop();
        return novoNulo();
        
    }
    
    public Valor visitRetornar( AuroraLogoParser.RetornarContext ctx ) {
        
        if ( ctx.expr() != null ) {
            return novoRetornar( visitor.visit( ctx.expr() ) );
        }
        
        return novoRetornar( novoNulo() );
        
    }
    
    public Valor visitProcessaId( AuroraLogoParser.ProcessaIdContext ctx ) {
        return novoIdentificador( ctx.ID().getText() );
    }
    
    private void limparMemoriaEscopo( String idFuncao ) {
        
        List<String> aRemover = new ArrayList<>( tartaruga.getEstadoFinal().obterIdentificadoresPorPrefixo( idFuncao ) );
        for ( String idR : aRemover ) {
            tartaruga.removerDaMemoria( idR );
        }

        PILHA_ESCOPOS.pop();
        
    }
    
}
