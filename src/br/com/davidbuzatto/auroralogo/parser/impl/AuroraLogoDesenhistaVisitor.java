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
import static br.com.davidbuzatto.auroralogo.parser.impl.Valor.*;
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
public class AuroraLogoDesenhistaVisitor extends AuroraLogoBaseVisitor<Valor> {

    private Tartaruga tartaruga;
    private JanelaPrincipal janelaPrincipal;
    private JTextPane textPaneSaida;
    
    // componentes de visita
    ComponenteVisitorMovimentacao cvMovimentacao;
    ComponenteVisitorCor cvCor;
    ComponenteVisitorInstrucoesSimples cvInstrucoesSimples;
    ComponenteVisitorEntradaSaida cvEntradaSaida;
    ComponenteVisitorAtribuicao cvAtribuicao;
    ComponenteVisitorInstrucoesGeometricas cvInstrucoesGeometricas;
    ComponenteVisitorFuncoesMatematicas cvFuncoesMatematicas;
    ComponenteVisitorExpressaoRelacaoTermo cvExpressaoRelacaoTermo;
    ComponenteVisitorFatores cvFatores;
    ComponenteVisitorConstrutos cvConstrutos;
    ComponenteVisitorArranjos cvArranjos;
    
    public AuroraLogoDesenhistaVisitor( 
            Tartaruga tartaruga, 
            JanelaPrincipal janelaPrincipal, 
            JTextPane textPaneSaida ) {
        
        this.tartaruga = tartaruga;
        this.tartaruga.limpar();
        this.janelaPrincipal = janelaPrincipal;
        this.textPaneSaida = textPaneSaida;
        
        cvMovimentacao = new ComponenteVisitorMovimentacao( tartaruga, this );
        cvCor = new ComponenteVisitorCor( tartaruga, this );
        cvInstrucoesSimples = new ComponenteVisitorInstrucoesSimples( tartaruga, this );
        cvEntradaSaida = new ComponenteVisitorEntradaSaida( tartaruga, janelaPrincipal, textPaneSaida, this );
        cvAtribuicao = new ComponenteVisitorAtribuicao( tartaruga, this );
        cvInstrucoesGeometricas = new ComponenteVisitorInstrucoesGeometricas( tartaruga, this );
        cvFuncoesMatematicas = new ComponenteVisitorFuncoesMatematicas( tartaruga, this );
        cvExpressaoRelacaoTermo = new ComponenteVisitorExpressaoRelacaoTermo( this );
        cvFatores = new ComponenteVisitorFatores( tartaruga, this );
        cvConstrutos = new ComponenteVisitorConstrutos( tartaruga, janelaPrincipal, textPaneSaida, this );
        cvArranjos = new ComponenteVisitorArranjos( tartaruga, this );
        
    }
    
    
    // movimentação
    
    @Override
    public Valor visitMovimentarDirecao( AuroraLogoParser.MovimentarDirecaoContext ctx ) {
        return cvMovimentacao.visitMovimentarDirecao( ctx );
    }
    
    @Override
    public Valor visitMovimentarPonto( AuroraLogoParser.MovimentarPontoContext ctx ) {
        return cvMovimentacao.visitMovimentarPonto( ctx );
    }
    
    
    // operações com cores
    
    @Override
    public Valor visitTrocarCorPincel( AuroraLogoParser.TrocarCorPincelContext ctx ) {
        return cvCor.visitTrocarCorPincel( ctx );
    }
    
    @Override
    public Valor visitTrocarCorPreenchimento( AuroraLogoParser.TrocarCorPreenchimentoContext ctx ) {
        return cvCor.visitTrocarCorPreenchimento( ctx );
    }
    
    @Override
    public Valor visitTrocarCorFundo( AuroraLogoParser.TrocarCorFundoContext ctx ) {
        return cvCor.visitTrocarCorFundo( ctx );
    }

    @Override
    public Valor visitCor( AuroraLogoParser.CorContext ctx ) {
        return cvCor.visitCor( ctx );
    }
    
    
    // operações simples
    
    @Override
    public Valor visitGirar( AuroraLogoParser.GirarContext ctx ) {
        return cvInstrucoesSimples.visitGirar( ctx );
    }
    
    @Override
    public Valor visitAbaixar( AuroraLogoParser.AbaixarContext ctx ) {
        return cvInstrucoesSimples.visitAbaixar( ctx );
    }

    @Override
    public Valor visitLevantar( AuroraLogoParser.LevantarContext ctx ) {
        return cvInstrucoesSimples.visitLevantar( ctx );
    }

    @Override
    public Valor visitLimpar( AuroraLogoParser.LimparContext ctx ) {
        return cvInstrucoesSimples.visitLimpar( ctx );
    }
    
    @Override
    public Valor visitEngrossar( AuroraLogoParser.EngrossarContext ctx ) {
        return cvInstrucoesSimples.visitEngrossar( ctx );
    }

    @Override
    public Valor visitDesengrossar( AuroraLogoParser.DesengrossarContext ctx ) {
        return cvInstrucoesSimples.visitDesengrossar( ctx );
    }

    @Override
    public Valor visitTrocarGrossura( AuroraLogoParser.TrocarGrossuraContext ctx ) {
        return cvInstrucoesSimples.visitTrocarGrossura( ctx );
    }

    
    // entrada e saída 
    
    @Override
    public Valor visitEscrever( AuroraLogoParser.EscreverContext ctx ) {
        return cvEntradaSaida.visitEscrever( ctx );
    }

    @Override
    public Valor visitLer( AuroraLogoParser.LerContext ctx ) {
        return cvEntradaSaida.visitLer( ctx );
    }
    
    @Override
    public Valor visitFormatarTexto( AuroraLogoParser.FormatarTextoContext ctx ) {
        return cvEntradaSaida.visitFormatarTexto( ctx );
    }
    
    
    // atribuições
    
    @Override
    public Valor visitAtribuirPadrao( AuroraLogoParser.AtribuirPadraoContext ctx ) {
        return cvAtribuicao.visitAtribuirPadrao( ctx );
    }
    
    @Override
    public Valor visitAtribuirAdicao( AuroraLogoParser.AtribuirAdicaoContext ctx ) {
        return cvAtribuicao.visitAtribuirAdicao( ctx );
    }
    
    @Override
    public Valor visitAtribuirSubtracao( AuroraLogoParser.AtribuirSubtracaoContext ctx ) {
        return cvAtribuicao.visitAtribuirSubtracao( ctx );
    }
    
    @Override
    public Valor visitAtribuirMultiplicacao( AuroraLogoParser.AtribuirMultiplicacaoContext ctx ) {
        return cvAtribuicao.visitAtribuirMultiplicacao( ctx );
    }
    
    @Override
    public Valor visitAtribuirDivisao( AuroraLogoParser.AtribuirDivisaoContext ctx ) {
        return cvAtribuicao.visitAtribuirDivisao( ctx );
    }
    
    @Override
    public Valor visitAtribuirResto( AuroraLogoParser.AtribuirRestoContext ctx ) {
        return cvAtribuicao.visitAtribuirResto( ctx );
    }

    @Override
    public Valor visitCriarArranjo( AuroraLogoParser.CriarArranjoContext ctx ) {
        return cvArranjos.visitCriarArranjo( ctx );
    }

    @Override
    public Valor visitCriarArranjoAssociativo( AuroraLogoParser.CriarArranjoAssociativoContext ctx ) {
        return cvArranjos.visitCriarArranjoAssociativo( ctx );
    }

    
    // espressão, relação e termo
    
    @Override
    public Valor visitExpr( AuroraLogoParser.ExprContext ctx ) {
        return cvExpressaoRelacaoTermo.visitExpr( ctx );
    }
    
    @Override
    public Valor visitRelacao( AuroraLogoParser.RelacaoContext ctx ) {
        return cvExpressaoRelacaoTermo.visitRelacao( ctx );
    }
    
    @Override
    public Valor visitExprSimp( AuroraLogoParser.ExprSimpContext ctx ) {
        return cvExpressaoRelacaoTermo.visitExprSimp( ctx );
    }
    
    @Override
    public Valor visitTermo( AuroraLogoParser.TermoContext ctx ) {
        return cvExpressaoRelacaoTermo.visitTermo( ctx );
    }
    
    
    // fatores
    
    @Override
    public Valor visitFatorNao( AuroraLogoParser.FatorNaoContext ctx ) {
        return cvFatores.visitFatorNao( ctx );
    }
    
    @Override
    public Valor visitFatorInt( AuroraLogoParser.FatorIntContext ctx ) {
        return cvFatores.visitFatorInt( ctx );
    }
    
    @Override
    public Valor visitFatorDec( AuroraLogoParser.FatorDecContext ctx ) {
        return cvFatores.visitFatorDec( ctx );
    }

    @Override
    public Valor visitFatorPi( AuroraLogoParser.FatorPiContext ctx ) {
        return cvFatores.visitFatorPi( ctx );
    }

    @Override
    public Valor visitFatorId( AuroraLogoParser.FatorIdContext ctx ) {
        return cvFatores.visitFatorId( ctx );
    }

    @Override
    public Valor visitFatorBool( AuroraLogoParser.FatorBoolContext ctx ) {
        return cvFatores.visitFatorBool( ctx );
    }

    @Override
    public Valor visitFatorChar( AuroraLogoParser.FatorCharContext ctx ) {
        return cvFatores.visitFatorChar( ctx );
    }

    @Override
    public Valor visitFatorString( AuroraLogoParser.FatorStringContext ctx ) {
        return cvFatores.visitFatorString( ctx );
    }
    
    @Override
    public Valor visitFatorCor( AuroraLogoParser.FatorCorContext ctx ) {
        return cvFatores.visitFatorCor( ctx );
    }
    
    @Override
    public Valor visitFatorParenteses( AuroraLogoParser.FatorParentesesContext ctx ) {
        return cvFatores.visitFatorParenteses( ctx );
    }

    
    // construtos: 
    //     se ... senão se ... senão
    //     usando ... escolha
    //     repetir ... vezes
    //     enquanto ... repetir
    @Override
    public Valor visitExprBool( AuroraLogoParser.ExprBoolContext ctx ) {
        return cvConstrutos.visitExprBool( ctx );
    }

    @Override
    public Valor visitSe( AuroraLogoParser.SeContext ctx ) {
        return cvConstrutos.visitSe( ctx );
    }

    @Override
    public Valor visitUsando( AuroraLogoParser.UsandoContext ctx ) {
        return cvConstrutos.visitUsando( ctx );
    }
    
    @Override
    public Valor visitRepetir( AuroraLogoParser.RepetirContext ctx ) {
        return cvConstrutos.visitRepetir( ctx );
    }

    @Override
    public Valor visitRepeticao( AuroraLogoParser.RepeticaoContext ctx ) {
        return cvConstrutos.visitRepeticao( ctx );
    }
    
    @Override
    public Valor visitRepetirEnquanto( AuroraLogoParser.RepetirEnquantoContext ctx ) {
        return cvConstrutos.visitRepetirEnquanto( ctx );
    }

    @Override
    public Valor visitParaCada( AuroraLogoParser.ParaCadaContext ctx ) {
        return cvConstrutos.visitParaCada( ctx );
    }
    
    @Override
    public Valor visitParar( AuroraLogoParser.PararContext ctx ) {
        return cvConstrutos.visitParar( ctx );
    }
    
    @Override
    public Valor visitContinuar( AuroraLogoParser.ContinuarContext ctx ) {
        return cvConstrutos.visitContinuar( ctx );
    }
    
    
    // funções matemáticas
    
    @Override
    public Valor visitFuncaoAbsoluto( AuroraLogoParser.FuncaoAbsolutoContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoAbsoluto( ctx );
    }
    
    @Override
    public Valor visitFuncaoRaizQuadrada( AuroraLogoParser.FuncaoRaizQuadradaContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoRaizQuadrada( ctx );
    }
    
    @Override
    public Valor visitFuncaoRaizCubica( AuroraLogoParser.FuncaoRaizCubicaContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoRaizCubica( ctx );
    }
    
    @Override
    public Valor visitFuncaoRaiz( AuroraLogoParser.FuncaoRaizContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoRaiz( ctx );
    }
    
    @Override
    public Valor visitFuncaoPotencia( AuroraLogoParser.FuncaoPotenciaContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoPotencia( ctx );
    }
    
    @Override
    public Valor visitFuncaoHipotenusa( AuroraLogoParser.FuncaoHipotenusaContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoHipotenusa( ctx );
    }
    
    @Override
    public Valor visitFuncaoChao( AuroraLogoParser.FuncaoChaoContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoChao( ctx );
    }
    
    @Override
    public Valor visitFuncaoTeto( AuroraLogoParser.FuncaoTetoContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoTeto( ctx );
    }
    
    @Override
    public Valor visitFuncaoArredondar( AuroraLogoParser.FuncaoArredondarContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoArredondar( ctx );
    }
    
    @Override
    public Valor visitFuncaoMinimo( AuroraLogoParser.FuncaoMinimoContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoMinimo( ctx );
    }
    
    @Override
    public Valor visitFuncaoMaximo( AuroraLogoParser.FuncaoMaximoContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoMaximo( ctx );
    }

    @Override
    public Valor visitFuncaoNumeroAleatorio( AuroraLogoParser.FuncaoNumeroAleatorioContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoNumeroAleatorio( ctx );
    }
    
    @Override
    public Valor visitFuncaoDefinirSementeAleatoria( AuroraLogoParser.FuncaoDefinirSementeAleatoriaContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoDefinirSementeAleatoria( ctx );
    }
    

    @Override
    public Valor visitFuncaoSeno( AuroraLogoParser.FuncaoSenoContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoSeno( ctx );
    }
    
    @Override
    public Valor visitFuncaoSenoHiperbolico( AuroraLogoParser.FuncaoSenoHiperbolicoContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoSenoHiperbolico( ctx );
    }
    
    @Override
    public Valor visitFuncaoArcoSeno( AuroraLogoParser.FuncaoArcoSenoContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoArcoSeno( ctx );
    }
    
    @Override
    public Valor visitFuncaoCosseno( AuroraLogoParser.FuncaoCossenoContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoCosseno( ctx );
    }
    
    @Override
    public Valor visitFuncaoCossenoHiperbolico( AuroraLogoParser.FuncaoCossenoHiperbolicoContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoCossenoHiperbolico( ctx );
    }
    
    @Override
    public Valor visitFuncaoArcoCosseno( AuroraLogoParser.FuncaoArcoCossenoContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoArcoCosseno( ctx );
    }
    
    @Override
    public Valor visitFuncaoTangente( AuroraLogoParser.FuncaoTangenteContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoTangente( ctx );
    }
    
    @Override
    public Valor visitFuncaoTangenteHiperbolica( AuroraLogoParser.FuncaoTangenteHiperbolicaContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoTangenteHiperbolica( ctx );
    }
    
    @Override
    public Valor visitFuncaoArcoTangente( AuroraLogoParser.FuncaoArcoTangenteContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoArcoTangente( ctx );
    }
    
    @Override
    public Valor visitFuncaoCartesianoParaPolar( AuroraLogoParser.FuncaoCartesianoParaPolarContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoCartesianoParaPolar( ctx );
    }

    @Override
    public Valor visitFuncaoLogaritmo( AuroraLogoParser.FuncaoLogaritmoContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoLogaritmo( ctx );
        
    }

    @Override
    public Valor visitFuncaoGrausParaRadianos( AuroraLogoParser.FuncaoGrausParaRadianosContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoGrausParaRadianos( ctx );
    }

    @Override
    public Valor visitFuncaoRadianosParaGraus( AuroraLogoParser.FuncaoRadianosParaGrausContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoRadianosParaGraus( ctx );
    }

    @Override
    public Valor visitFuncaoIncrementar( AuroraLogoParser.FuncaoIncrementarContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoIncrementar( ctx );
    }
    
    @Override
    public Valor visitFuncaoDecrementar( AuroraLogoParser.FuncaoDecrementarContext ctx ) {
        return cvFuncoesMatematicas.visitFuncaoDecrementar( ctx );
    }
    
    
    // funções geométricas

    @Override
    public Valor visitFuncaoDesenharSegmento( AuroraLogoParser.FuncaoDesenharSegmentoContext ctx ) {
        return cvInstrucoesGeometricas.visitFuncaoDesenharSegmento( ctx );
    }

    @Override
    public Valor visitFuncaoDesenharQuadrado( AuroraLogoParser.FuncaoDesenharQuadradoContext ctx ) {
        return cvInstrucoesGeometricas.visitFuncaoDesenharQuadrado( ctx );
    }

    @Override
    public Valor visitFuncaoDesenharRetangulo( AuroraLogoParser.FuncaoDesenharRetanguloContext ctx ) {
        return cvInstrucoesGeometricas.visitFuncaoDesenharRetangulo( ctx );
    }

    @Override
    public Valor visitFuncaoDesenharCirculo( AuroraLogoParser.FuncaoDesenharCirculoContext ctx ) {
        return cvInstrucoesGeometricas.visitFuncaoDesenharCirculo( ctx );
    }

    @Override
    public Valor visitFuncaoDesenharElipse( AuroraLogoParser.FuncaoDesenharElipseContext ctx ) {
        return cvInstrucoesGeometricas.visitFuncaoDesenharElipse( ctx );
    }

    @Override
    public Valor visitFuncaoDesenharArco( AuroraLogoParser.FuncaoDesenharArcoContext ctx ) {
        return cvInstrucoesGeometricas.visitFuncaoDesenharArco( ctx );
    }

    @Override
    public Valor visitFuncaoDesenharPoligonoRegular( AuroraLogoParser.FuncaoDesenharPoligonoRegularContext ctx ) {
        return cvInstrucoesGeometricas.visitFuncaoDesenharPoligonoRegular( ctx );
    }

    @Override
    public Valor visitFuncaoDesenharEstrela( AuroraLogoParser.FuncaoDesenharEstrelaContext ctx ) {
        return cvInstrucoesGeometricas.visitFuncaoDesenharEstrela( ctx );
    }

    @Override
    public Valor visitFuncaoDesenharPoligono( AuroraLogoParser.FuncaoDesenharPoligonoContext ctx ) {
        return cvInstrucoesGeometricas.visitFuncaoDesenharPoligono( ctx );
    }

    @Override
    public Valor visitFuncaoDesenharCurvaQuadratica( AuroraLogoParser.FuncaoDesenharCurvaQuadraticaContext ctx ) {
        return cvInstrucoesGeometricas.visitFuncaoDesenharCurvaQuadratica( ctx );
    }

    @Override
    public Valor visitFuncaoDesenharCurvaCubica( AuroraLogoParser.FuncaoDesenharCurvaCubicaContext ctx ) {
        return cvInstrucoesGeometricas.visitFuncaoDesenharCurvaCubica( ctx );
    }

    @Override
    public Valor visitDesenharCaminho( AuroraLogoParser.DesenharCaminhoContext ctx ) {
        return cvInstrucoesGeometricas.visitDesenharCaminho( ctx );
    }

    @Override
    public Valor visitInstrucaoCaminhoMoverAte( AuroraLogoParser.InstrucaoCaminhoMoverAteContext ctx ) {
        return cvInstrucoesGeometricas.visitInstrucaoCaminhoMoverAte( ctx );
    }

    @Override
    public Valor visitInstrucaoCaminhoLinhaAte( AuroraLogoParser.InstrucaoCaminhoLinhaAteContext ctx ) {
        return cvInstrucoesGeometricas.visitInstrucaoCaminhoLinhaAte( ctx );
    }

    @Override
    public Valor visitInstrucaoCaminhoCurvaQuadraticaAte( AuroraLogoParser.InstrucaoCaminhoCurvaQuadraticaAteContext ctx ) {
        return cvInstrucoesGeometricas.visitInstrucaoCaminhoCurvaQuadraticaAte( ctx );
    }

    @Override
    public Valor visitInstrucaoCaminhoCurvaCubicaAte( AuroraLogoParser.InstrucaoCaminhoCurvaCubicaAteContext ctx ) {
        return cvInstrucoesGeometricas.visitInstrucaoCaminhoCurvaCubicaAte( ctx );
    }

    @Override
    public Valor visitInstrucaoCaminhoFecharCaminho( AuroraLogoParser.InstrucaoCaminhoFecharCaminhoContext ctx ) {
        return cvInstrucoesGeometricas.visitInstrucaoCaminhoFecharCaminho( ctx );
    }

    @Override
    public Valor visitConsultarTartaruga( AuroraLogoParser.ConsultarTartarugaContext ctx ) {
        return cvInstrucoesSimples.visitConsultarTartaruga( ctx );
    }
    
    
    // outros métodos de visita
    
    @Override
    public Valor visitTerminal( TerminalNode node ) {
        return novoInteiro( node.getSymbol().getType() );
    }
    
    @Override
    public Valor visitErrorNode( ErrorNode node ) {
        System.out.println( node );
        return NULO;
    }
    
}
