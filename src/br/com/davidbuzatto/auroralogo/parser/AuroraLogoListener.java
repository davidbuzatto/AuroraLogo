// Generated from gramatica/AuroraLogo.g4 by ANTLR 4.10.1
package br.com.davidbuzatto.auroralogo.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AuroraLogoParser}.
 */
public interface AuroraLogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(AuroraLogoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(AuroraLogoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(AuroraLogoParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(AuroraLogoParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#ains}.
	 * @param ctx the parse tree
	 */
	void enterAins(AuroraLogoParser.AinsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#ains}.
	 * @param ctx the parse tree
	 */
	void exitAins(AuroraLogoParser.AinsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AuroraLogoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AuroraLogoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(AuroraLogoParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(AuroraLogoParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#exprSimp}.
	 * @param ctx the parse tree
	 */
	void enterExprSimp(AuroraLogoParser.ExprSimpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#exprSimp}.
	 * @param ctx the parse tree
	 */
	void exitExprSimp(AuroraLogoParser.ExprSimpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(AuroraLogoParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(AuroraLogoParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fatorNao}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFatorNao(AuroraLogoParser.FatorNaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fatorNao}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFatorNao(AuroraLogoParser.FatorNaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fatorInt}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFatorInt(AuroraLogoParser.FatorIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fatorInt}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFatorInt(AuroraLogoParser.FatorIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fatorDec}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFatorDec(AuroraLogoParser.FatorDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fatorDec}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFatorDec(AuroraLogoParser.FatorDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fatorPi}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFatorPi(AuroraLogoParser.FatorPiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fatorPi}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFatorPi(AuroraLogoParser.FatorPiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fatorId}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFatorId(AuroraLogoParser.FatorIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fatorId}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFatorId(AuroraLogoParser.FatorIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fatorChar}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFatorChar(AuroraLogoParser.FatorCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fatorChar}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFatorChar(AuroraLogoParser.FatorCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fatorString}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFatorString(AuroraLogoParser.FatorStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fatorString}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFatorString(AuroraLogoParser.FatorStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fatorFuncaoMatematica}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFatorFuncaoMatematica(AuroraLogoParser.FatorFuncaoMatematicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fatorFuncaoMatematica}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFatorFuncaoMatematica(AuroraLogoParser.FatorFuncaoMatematicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fatorParenteses}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFatorParenteses(AuroraLogoParser.FatorParentesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fatorParenteses}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFatorParenteses(AuroraLogoParser.FatorParentesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(AuroraLogoParser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(AuroraLogoParser.ExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(AuroraLogoParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(AuroraLogoParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(AuroraLogoParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(AuroraLogoParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#seSe}.
	 * @param ctx the parse tree
	 */
	void enterSeSe(AuroraLogoParser.SeSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#seSe}.
	 * @param ctx the parse tree
	 */
	void exitSeSe(AuroraLogoParser.SeSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#seSenaoSe}.
	 * @param ctx the parse tree
	 */
	void enterSeSenaoSe(AuroraLogoParser.SeSenaoSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#seSenaoSe}.
	 * @param ctx the parse tree
	 */
	void exitSeSenaoSe(AuroraLogoParser.SeSenaoSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#seSenaoSeP}.
	 * @param ctx the parse tree
	 */
	void enterSeSenaoSeP(AuroraLogoParser.SeSenaoSePContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#seSenaoSeP}.
	 * @param ctx the parse tree
	 */
	void exitSeSenaoSeP(AuroraLogoParser.SeSenaoSePContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#seSenao}.
	 * @param ctx the parse tree
	 */
	void enterSeSenao(AuroraLogoParser.SeSenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#seSenao}.
	 * @param ctx the parse tree
	 */
	void exitSeSenao(AuroraLogoParser.SeSenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#repetir}.
	 * @param ctx the parse tree
	 */
	void enterRepetir(AuroraLogoParser.RepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#repetir}.
	 * @param ctx the parse tree
	 */
	void exitRepetir(AuroraLogoParser.RepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#repetirEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterRepetirEnquanto(AuroraLogoParser.RepetirEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#repetirEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitRepetirEnquanto(AuroraLogoParser.RepetirEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#parar}.
	 * @param ctx the parse tree
	 */
	void enterParar(AuroraLogoParser.PararContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#parar}.
	 * @param ctx the parse tree
	 */
	void exitParar(AuroraLogoParser.PararContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#continuar}.
	 * @param ctx the parse tree
	 */
	void enterContinuar(AuroraLogoParser.ContinuarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#continuar}.
	 * @param ctx the parse tree
	 */
	void exitContinuar(AuroraLogoParser.ContinuarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code movimentarDirecao}
	 * labeled alternative in {@link AuroraLogoParser#movimentar}.
	 * @param ctx the parse tree
	 */
	void enterMovimentarDirecao(AuroraLogoParser.MovimentarDirecaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code movimentarDirecao}
	 * labeled alternative in {@link AuroraLogoParser#movimentar}.
	 * @param ctx the parse tree
	 */
	void exitMovimentarDirecao(AuroraLogoParser.MovimentarDirecaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code movimentarPonto}
	 * labeled alternative in {@link AuroraLogoParser#movimentar}.
	 * @param ctx the parse tree
	 */
	void enterMovimentarPonto(AuroraLogoParser.MovimentarPontoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code movimentarPonto}
	 * labeled alternative in {@link AuroraLogoParser#movimentar}.
	 * @param ctx the parse tree
	 */
	void exitMovimentarPonto(AuroraLogoParser.MovimentarPontoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trocarCorPincel}
	 * labeled alternative in {@link AuroraLogoParser#trocarCor}.
	 * @param ctx the parse tree
	 */
	void enterTrocarCorPincel(AuroraLogoParser.TrocarCorPincelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trocarCorPincel}
	 * labeled alternative in {@link AuroraLogoParser#trocarCor}.
	 * @param ctx the parse tree
	 */
	void exitTrocarCorPincel(AuroraLogoParser.TrocarCorPincelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trocarCorPreenchimento}
	 * labeled alternative in {@link AuroraLogoParser#trocarCor}.
	 * @param ctx the parse tree
	 */
	void enterTrocarCorPreenchimento(AuroraLogoParser.TrocarCorPreenchimentoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trocarCorPreenchimento}
	 * labeled alternative in {@link AuroraLogoParser#trocarCor}.
	 * @param ctx the parse tree
	 */
	void exitTrocarCorPreenchimento(AuroraLogoParser.TrocarCorPreenchimentoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trocarCorFundo}
	 * labeled alternative in {@link AuroraLogoParser#trocarCor}.
	 * @param ctx the parse tree
	 */
	void enterTrocarCorFundo(AuroraLogoParser.TrocarCorFundoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trocarCorFundo}
	 * labeled alternative in {@link AuroraLogoParser#trocarCor}.
	 * @param ctx the parse tree
	 */
	void exitTrocarCorFundo(AuroraLogoParser.TrocarCorFundoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#configuracaoCor}.
	 * @param ctx the parse tree
	 */
	void enterConfiguracaoCor(AuroraLogoParser.ConfiguracaoCorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#configuracaoCor}.
	 * @param ctx the parse tree
	 */
	void exitConfiguracaoCor(AuroraLogoParser.ConfiguracaoCorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#girar}.
	 * @param ctx the parse tree
	 */
	void enterGirar(AuroraLogoParser.GirarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#girar}.
	 * @param ctx the parse tree
	 */
	void exitGirar(AuroraLogoParser.GirarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#engrossar}.
	 * @param ctx the parse tree
	 */
	void enterEngrossar(AuroraLogoParser.EngrossarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#engrossar}.
	 * @param ctx the parse tree
	 */
	void exitEngrossar(AuroraLogoParser.EngrossarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#desengrossar}.
	 * @param ctx the parse tree
	 */
	void enterDesengrossar(AuroraLogoParser.DesengrossarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#desengrossar}.
	 * @param ctx the parse tree
	 */
	void exitDesengrossar(AuroraLogoParser.DesengrossarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#trocarGrossura}.
	 * @param ctx the parse tree
	 */
	void enterTrocarGrossura(AuroraLogoParser.TrocarGrossuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#trocarGrossura}.
	 * @param ctx the parse tree
	 */
	void exitTrocarGrossura(AuroraLogoParser.TrocarGrossuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#escrever}.
	 * @param ctx the parse tree
	 */
	void enterEscrever(AuroraLogoParser.EscreverContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#escrever}.
	 * @param ctx the parse tree
	 */
	void exitEscrever(AuroraLogoParser.EscreverContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#ler}.
	 * @param ctx the parse tree
	 */
	void enterLer(AuroraLogoParser.LerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#ler}.
	 * @param ctx the parse tree
	 */
	void exitLer(AuroraLogoParser.LerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribuirPadrao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void enterAtribuirPadrao(AuroraLogoParser.AtribuirPadraoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribuirPadrao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void exitAtribuirPadrao(AuroraLogoParser.AtribuirPadraoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribuirAdicao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void enterAtribuirAdicao(AuroraLogoParser.AtribuirAdicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribuirAdicao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void exitAtribuirAdicao(AuroraLogoParser.AtribuirAdicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribuirSubtracao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void enterAtribuirSubtracao(AuroraLogoParser.AtribuirSubtracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribuirSubtracao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void exitAtribuirSubtracao(AuroraLogoParser.AtribuirSubtracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribuirMultiplicacao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void enterAtribuirMultiplicacao(AuroraLogoParser.AtribuirMultiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribuirMultiplicacao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void exitAtribuirMultiplicacao(AuroraLogoParser.AtribuirMultiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribuirDivisao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void enterAtribuirDivisao(AuroraLogoParser.AtribuirDivisaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribuirDivisao}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void exitAtribuirDivisao(AuroraLogoParser.AtribuirDivisaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribuirResto}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void enterAtribuirResto(AuroraLogoParser.AtribuirRestoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribuirResto}
	 * labeled alternative in {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void exitAtribuirResto(AuroraLogoParser.AtribuirRestoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#abaixar}.
	 * @param ctx the parse tree
	 */
	void enterAbaixar(AuroraLogoParser.AbaixarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#abaixar}.
	 * @param ctx the parse tree
	 */
	void exitAbaixar(AuroraLogoParser.AbaixarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#levantar}.
	 * @param ctx the parse tree
	 */
	void enterLevantar(AuroraLogoParser.LevantarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#levantar}.
	 * @param ctx the parse tree
	 */
	void exitLevantar(AuroraLogoParser.LevantarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#limpar}.
	 * @param ctx the parse tree
	 */
	void enterLimpar(AuroraLogoParser.LimparContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#limpar}.
	 * @param ctx the parse tree
	 */
	void exitLimpar(AuroraLogoParser.LimparContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoAbsoluto}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoAbsoluto(AuroraLogoParser.FuncaoAbsolutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoAbsoluto}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoAbsoluto(AuroraLogoParser.FuncaoAbsolutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoRaizQuadrada}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoRaizQuadrada(AuroraLogoParser.FuncaoRaizQuadradaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoRaizQuadrada}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoRaizQuadrada(AuroraLogoParser.FuncaoRaizQuadradaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoRaizCubica}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoRaizCubica(AuroraLogoParser.FuncaoRaizCubicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoRaizCubica}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoRaizCubica(AuroraLogoParser.FuncaoRaizCubicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoRaiz}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoRaiz(AuroraLogoParser.FuncaoRaizContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoRaiz}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoRaiz(AuroraLogoParser.FuncaoRaizContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoPotencia}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoPotencia(AuroraLogoParser.FuncaoPotenciaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoPotencia}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoPotencia(AuroraLogoParser.FuncaoPotenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoHipotenusa}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoHipotenusa(AuroraLogoParser.FuncaoHipotenusaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoHipotenusa}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoHipotenusa(AuroraLogoParser.FuncaoHipotenusaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoChao}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoChao(AuroraLogoParser.FuncaoChaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoChao}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoChao(AuroraLogoParser.FuncaoChaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoTeto}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoTeto(AuroraLogoParser.FuncaoTetoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoTeto}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoTeto(AuroraLogoParser.FuncaoTetoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoArredondar}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoArredondar(AuroraLogoParser.FuncaoArredondarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoArredondar}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoArredondar(AuroraLogoParser.FuncaoArredondarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoMinimo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoMinimo(AuroraLogoParser.FuncaoMinimoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoMinimo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoMinimo(AuroraLogoParser.FuncaoMinimoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoMaximo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoMaximo(AuroraLogoParser.FuncaoMaximoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoMaximo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoMaximo(AuroraLogoParser.FuncaoMaximoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoNumeroAleatorio}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoNumeroAleatorio(AuroraLogoParser.FuncaoNumeroAleatorioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoNumeroAleatorio}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoNumeroAleatorio(AuroraLogoParser.FuncaoNumeroAleatorioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoDefinirSementeAleatoria}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoDefinirSementeAleatoria(AuroraLogoParser.FuncaoDefinirSementeAleatoriaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoDefinirSementeAleatoria}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoDefinirSementeAleatoria(AuroraLogoParser.FuncaoDefinirSementeAleatoriaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoSeno}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoSeno(AuroraLogoParser.FuncaoSenoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoSeno}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoSeno(AuroraLogoParser.FuncaoSenoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoCosseno}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoCosseno(AuroraLogoParser.FuncaoCossenoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoCosseno}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoCosseno(AuroraLogoParser.FuncaoCossenoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoTangente}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoTangente(AuroraLogoParser.FuncaoTangenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoTangente}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoTangente(AuroraLogoParser.FuncaoTangenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoArcoSeno}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoArcoSeno(AuroraLogoParser.FuncaoArcoSenoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoArcoSeno}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoArcoSeno(AuroraLogoParser.FuncaoArcoSenoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoArcoCosseno}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoArcoCosseno(AuroraLogoParser.FuncaoArcoCossenoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoArcoCosseno}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoArcoCosseno(AuroraLogoParser.FuncaoArcoCossenoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoArcoTangente}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoArcoTangente(AuroraLogoParser.FuncaoArcoTangenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoArcoTangente}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoArcoTangente(AuroraLogoParser.FuncaoArcoTangenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoCartesianoParaPolar}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoCartesianoParaPolar(AuroraLogoParser.FuncaoCartesianoParaPolarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoCartesianoParaPolar}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoCartesianoParaPolar(AuroraLogoParser.FuncaoCartesianoParaPolarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoSenoHiperbolico}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoSenoHiperbolico(AuroraLogoParser.FuncaoSenoHiperbolicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoSenoHiperbolico}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoSenoHiperbolico(AuroraLogoParser.FuncaoSenoHiperbolicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoCossenoHiperbolico}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoCossenoHiperbolico(AuroraLogoParser.FuncaoCossenoHiperbolicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoCossenoHiperbolico}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoCossenoHiperbolico(AuroraLogoParser.FuncaoCossenoHiperbolicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoTangenteHiperbolica}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoTangenteHiperbolica(AuroraLogoParser.FuncaoTangenteHiperbolicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoTangenteHiperbolica}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoTangenteHiperbolica(AuroraLogoParser.FuncaoTangenteHiperbolicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoLogaritmo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoLogaritmo(AuroraLogoParser.FuncaoLogaritmoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoLogaritmo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoLogaritmo(AuroraLogoParser.FuncaoLogaritmoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoGrausParaRadianos}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoGrausParaRadianos(AuroraLogoParser.FuncaoGrausParaRadianosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoGrausParaRadianos}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoGrausParaRadianos(AuroraLogoParser.FuncaoGrausParaRadianosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoRadianosParaGraus}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoRadianosParaGraus(AuroraLogoParser.FuncaoRadianosParaGrausContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoRadianosParaGraus}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoRadianosParaGraus(AuroraLogoParser.FuncaoRadianosParaGrausContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoIncrementar}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoIncrementar(AuroraLogoParser.FuncaoIncrementarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoIncrementar}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoIncrementar(AuroraLogoParser.FuncaoIncrementarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoDecrementar}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoDecrementar(AuroraLogoParser.FuncaoDecrementarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoDecrementar}
	 * labeled alternative in {@link AuroraLogoParser#funcaoMatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoDecrementar(AuroraLogoParser.FuncaoDecrementarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#instrucaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoGeometrica(AuroraLogoParser.InstrucaoGeometricaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#instrucaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoGeometrica(AuroraLogoParser.InstrucaoGeometricaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoDesenharSegmento}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoDesenharSegmento(AuroraLogoParser.FuncaoDesenharSegmentoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoDesenharSegmento}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoDesenharSegmento(AuroraLogoParser.FuncaoDesenharSegmentoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoDesenharQuadrado}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoDesenharQuadrado(AuroraLogoParser.FuncaoDesenharQuadradoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoDesenharQuadrado}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoDesenharQuadrado(AuroraLogoParser.FuncaoDesenharQuadradoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoDesenharRetangulo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoDesenharRetangulo(AuroraLogoParser.FuncaoDesenharRetanguloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoDesenharRetangulo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoDesenharRetangulo(AuroraLogoParser.FuncaoDesenharRetanguloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoDesenharCirculo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoDesenharCirculo(AuroraLogoParser.FuncaoDesenharCirculoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoDesenharCirculo}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoDesenharCirculo(AuroraLogoParser.FuncaoDesenharCirculoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoDesenharElipse}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoDesenharElipse(AuroraLogoParser.FuncaoDesenharElipseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoDesenharElipse}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoDesenharElipse(AuroraLogoParser.FuncaoDesenharElipseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoDesenharArco}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoDesenharArco(AuroraLogoParser.FuncaoDesenharArcoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoDesenharArco}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoDesenharArco(AuroraLogoParser.FuncaoDesenharArcoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoDesenharPoligonoRegular}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoDesenharPoligonoRegular(AuroraLogoParser.FuncaoDesenharPoligonoRegularContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoDesenharPoligonoRegular}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoDesenharPoligonoRegular(AuroraLogoParser.FuncaoDesenharPoligonoRegularContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoDesenharEstrela}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoDesenharEstrela(AuroraLogoParser.FuncaoDesenharEstrelaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoDesenharEstrela}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoDesenharEstrela(AuroraLogoParser.FuncaoDesenharEstrelaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoDesenharPoligono}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoDesenharPoligono(AuroraLogoParser.FuncaoDesenharPoligonoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoDesenharPoligono}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoDesenharPoligono(AuroraLogoParser.FuncaoDesenharPoligonoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoDesenharCurvaQuadratica}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoDesenharCurvaQuadratica(AuroraLogoParser.FuncaoDesenharCurvaQuadraticaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoDesenharCurvaQuadratica}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoDesenharCurvaQuadratica(AuroraLogoParser.FuncaoDesenharCurvaQuadraticaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoDesenharCurvaCubica}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoDesenharCurvaCubica(AuroraLogoParser.FuncaoDesenharCurvaCubicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoDesenharCurvaCubica}
	 * labeled alternative in {@link AuroraLogoParser#funcaoGeometrica}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoDesenharCurvaCubica(AuroraLogoParser.FuncaoDesenharCurvaCubicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#desenharCaminho}.
	 * @param ctx the parse tree
	 */
	void enterDesenharCaminho(AuroraLogoParser.DesenharCaminhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#desenharCaminho}.
	 * @param ctx the parse tree
	 */
	void exitDesenharCaminho(AuroraLogoParser.DesenharCaminhoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instrucaoCaminhoMoverAte}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoCaminhoMoverAte(AuroraLogoParser.InstrucaoCaminhoMoverAteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instrucaoCaminhoMoverAte}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoCaminhoMoverAte(AuroraLogoParser.InstrucaoCaminhoMoverAteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instrucaoCaminhoLinhaAte}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoCaminhoLinhaAte(AuroraLogoParser.InstrucaoCaminhoLinhaAteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instrucaoCaminhoLinhaAte}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoCaminhoLinhaAte(AuroraLogoParser.InstrucaoCaminhoLinhaAteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instrucaoCaminhoCurvaQuadraticaAte}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoCaminhoCurvaQuadraticaAte(AuroraLogoParser.InstrucaoCaminhoCurvaQuadraticaAteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instrucaoCaminhoCurvaQuadraticaAte}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoCaminhoCurvaQuadraticaAte(AuroraLogoParser.InstrucaoCaminhoCurvaQuadraticaAteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instrucaoCaminhoCurvaCubicaAte}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoCaminhoCurvaCubicaAte(AuroraLogoParser.InstrucaoCaminhoCurvaCubicaAteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instrucaoCaminhoCurvaCubicaAte}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoCaminhoCurvaCubicaAte(AuroraLogoParser.InstrucaoCaminhoCurvaCubicaAteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instrucaoCaminhoFecharCaminho}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoCaminhoFecharCaminho(AuroraLogoParser.InstrucaoCaminhoFecharCaminhoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instrucaoCaminhoFecharCaminho}
	 * labeled alternative in {@link AuroraLogoParser#instCaminho}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoCaminhoFecharCaminho(AuroraLogoParser.InstrucaoCaminhoFecharCaminhoContext ctx);
}