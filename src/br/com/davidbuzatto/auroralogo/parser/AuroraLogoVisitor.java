// Generated from gramatica/AuroraLogo.g4 by ANTLR 4.10.1
package br.com.davidbuzatto.auroralogo.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AuroraLogoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AuroraLogoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(AuroraLogoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(AuroraLogoParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#ains}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAins(AuroraLogoParser.AinsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AuroraLogoParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#relacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacao(AuroraLogoParser.RelacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#exprSimp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSimp(AuroraLogoParser.ExprSimpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(AuroraLogoParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fatorNao}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorNao(AuroraLogoParser.FatorNaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fatorInt}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorInt(AuroraLogoParser.FatorIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fatorDec}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorDec(AuroraLogoParser.FatorDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fatorPi}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorPi(AuroraLogoParser.FatorPiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fatorId}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorId(AuroraLogoParser.FatorIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fatorChar}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorChar(AuroraLogoParser.FatorCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fatorString}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorString(AuroraLogoParser.FatorStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fatorFuncaoMatematica}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorFuncaoMatematica(AuroraLogoParser.FatorFuncaoMatematicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fatorConsultarTartaruga}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorConsultarTartaruga(AuroraLogoParser.FatorConsultarTartarugaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fatorParenteses}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorParenteses(AuroraLogoParser.FatorParentesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(AuroraLogoParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(AuroraLogoParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#se}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSe(AuroraLogoParser.SeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#seSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeSe(AuroraLogoParser.SeSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#seSenaoSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeSenaoSe(AuroraLogoParser.SeSenaoSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#seSenao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeSenao(AuroraLogoParser.SeSenaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#usando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsando(AuroraLogoParser.UsandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#escolha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscolha(AuroraLogoParser.EscolhaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#repetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetir(AuroraLogoParser.RepetirContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#repetirEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetirEnquanto(AuroraLogoParser.RepetirEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#parar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParar(AuroraLogoParser.PararContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#continuar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuar(AuroraLogoParser.ContinuarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code movimentarDirecao}
	 * labeled alternative in {@link AuroraLogoParser#movimentar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovimentarDirecao(AuroraLogoParser.MovimentarDirecaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code movimentarPonto}
	 * labeled alternative in {@link AuroraLogoParser#movimentar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovimentarPonto(AuroraLogoParser.MovimentarPontoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trocarCorPincel}
	 * labeled alternative in {@link AuroraLogoParser#trocarCor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrocarCorPincel(AuroraLogoParser.TrocarCorPincelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trocarCorPreenchimento}
	 * labeled alternative in {@link AuroraLogoParser#trocarCor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrocarCorPreenchimento(AuroraLogoParser.TrocarCorPreenchimentoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trocarCorFundo}
	 * labeled alternative in {@link AuroraLogoParser#trocarCor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrocarCorFundo(AuroraLogoParser.TrocarCorFundoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#configuracaoCor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguracaoCor(AuroraLogoParser.ConfiguracaoCorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#girar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGirar(AuroraLogoParser.GirarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#engrossar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngrossar(AuroraLogoParser.EngrossarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#desengrossar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesengrossar(AuroraLogoParser.DesengrossarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#trocarGrossura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrocarGrossura(AuroraLogoParser.TrocarGrossuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#escrever}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscrever(AuroraLogoParser.EscreverContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#ler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLer(AuroraLogoParser.LerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribuirPadrao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuirPadrao(AuroraLogoParser.AtribuirPadraoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribuirAdicao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuirAdicao(AuroraLogoParser.AtribuirAdicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribuirSubtracao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuirSubtracao(AuroraLogoParser.AtribuirSubtracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribuirMultiplicacao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuirMultiplicacao(AuroraLogoParser.AtribuirMultiplicacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribuirDivisao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuirDivisao(AuroraLogoParser.AtribuirDivisaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribuirResto}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuirResto(AuroraLogoParser.AtribuirRestoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#abaixar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbaixar(AuroraLogoParser.AbaixarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#levantar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevantar(AuroraLogoParser.LevantarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#limpar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimpar(AuroraLogoParser.LimparContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoAbsoluto}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoAbsoluto(AuroraLogoParser.FuncaoAbsolutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoRaizQuadrada}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoRaizQuadrada(AuroraLogoParser.FuncaoRaizQuadradaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoRaizCubica}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoRaizCubica(AuroraLogoParser.FuncaoRaizCubicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoRaiz}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoRaiz(AuroraLogoParser.FuncaoRaizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoPotencia}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoPotencia(AuroraLogoParser.FuncaoPotenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoHipotenusa}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoHipotenusa(AuroraLogoParser.FuncaoHipotenusaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoChao}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoChao(AuroraLogoParser.FuncaoChaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoTeto}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoTeto(AuroraLogoParser.FuncaoTetoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoArredondar}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoArredondar(AuroraLogoParser.FuncaoArredondarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoMinimo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoMinimo(AuroraLogoParser.FuncaoMinimoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoMaximo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoMaximo(AuroraLogoParser.FuncaoMaximoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoNumeroAleatorio}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoNumeroAleatorio(AuroraLogoParser.FuncaoNumeroAleatorioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoDefinirSementeAleatoria}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoDefinirSementeAleatoria(AuroraLogoParser.FuncaoDefinirSementeAleatoriaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoSeno}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoSeno(AuroraLogoParser.FuncaoSenoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoCosseno}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoCosseno(AuroraLogoParser.FuncaoCossenoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoTangente}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoTangente(AuroraLogoParser.FuncaoTangenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoArcoSeno}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoArcoSeno(AuroraLogoParser.FuncaoArcoSenoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoArcoCosseno}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoArcoCosseno(AuroraLogoParser.FuncaoArcoCossenoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoArcoTangente}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoArcoTangente(AuroraLogoParser.FuncaoArcoTangenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoCartesianoParaPolar}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoCartesianoParaPolar(AuroraLogoParser.FuncaoCartesianoParaPolarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoSenoHiperbolico}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoSenoHiperbolico(AuroraLogoParser.FuncaoSenoHiperbolicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoCossenoHiperbolico}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoCossenoHiperbolico(AuroraLogoParser.FuncaoCossenoHiperbolicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoTangenteHiperbolica}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoTangenteHiperbolica(AuroraLogoParser.FuncaoTangenteHiperbolicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoLogaritmo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoLogaritmo(AuroraLogoParser.FuncaoLogaritmoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoGrausParaRadianos}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoGrausParaRadianos(AuroraLogoParser.FuncaoGrausParaRadianosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoRadianosParaGraus}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoRadianosParaGraus(AuroraLogoParser.FuncaoRadianosParaGrausContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoIncrementar}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoIncrementar(AuroraLogoParser.FuncaoIncrementarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoDecrementar}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoDecrementar(AuroraLogoParser.FuncaoDecrementarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#instrucaoGeometrica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucaoGeometrica(AuroraLogoParser.InstrucaoGeometricaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoDesenharSegmento}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoDesenharSegmento(AuroraLogoParser.FuncaoDesenharSegmentoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoDesenharQuadrado}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoDesenharQuadrado(AuroraLogoParser.FuncaoDesenharQuadradoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoDesenharRetangulo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoDesenharRetangulo(AuroraLogoParser.FuncaoDesenharRetanguloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoDesenharCirculo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoDesenharCirculo(AuroraLogoParser.FuncaoDesenharCirculoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoDesenharElipse}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoDesenharElipse(AuroraLogoParser.FuncaoDesenharElipseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoDesenharArco}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoDesenharArco(AuroraLogoParser.FuncaoDesenharArcoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoDesenharPoligonoRegular}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoDesenharPoligonoRegular(AuroraLogoParser.FuncaoDesenharPoligonoRegularContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoDesenharEstrela}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoDesenharEstrela(AuroraLogoParser.FuncaoDesenharEstrelaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoDesenharPoligono}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoDesenharPoligono(AuroraLogoParser.FuncaoDesenharPoligonoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoDesenharCurvaQuadratica}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoDesenharCurvaQuadratica(AuroraLogoParser.FuncaoDesenharCurvaQuadraticaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoDesenharCurvaCubica}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoDesenharCurvaCubica(AuroraLogoParser.FuncaoDesenharCurvaCubicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#desenharCaminho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesenharCaminho(AuroraLogoParser.DesenharCaminhoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instrucaoCaminhoMoverAte}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucaoCaminhoMoverAte(AuroraLogoParser.InstrucaoCaminhoMoverAteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instrucaoCaminhoLinhaAte}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucaoCaminhoLinhaAte(AuroraLogoParser.InstrucaoCaminhoLinhaAteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instrucaoCaminhoCurvaQuadraticaAte}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucaoCaminhoCurvaQuadraticaAte(AuroraLogoParser.InstrucaoCaminhoCurvaQuadraticaAteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instrucaoCaminhoCurvaCubicaAte}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucaoCaminhoCurvaCubicaAte(AuroraLogoParser.InstrucaoCaminhoCurvaCubicaAteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instrucaoCaminhoFecharCaminho}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucaoCaminhoFecharCaminho(AuroraLogoParser.InstrucaoCaminhoFecharCaminhoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#consultarTartaruga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsultarTartaruga(AuroraLogoParser.ConsultarTartarugaContext ctx);
}