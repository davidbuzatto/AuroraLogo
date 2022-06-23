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
	 * Enter a parse tree produced by {@link AuroraLogoParser#repita}.
	 * @param ctx the parse tree
	 */
	void enterRepita(AuroraLogoParser.RepitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#repita}.
	 * @param ctx the parse tree
	 */
	void exitRepita(AuroraLogoParser.RepitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(AuroraLogoParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(AuroraLogoParser.EnquantoContext ctx);
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
	 * Enter a parse tree produced by {@link AuroraLogoParser#trocarCor}.
	 * @param ctx the parse tree
	 */
	void enterTrocarCor(AuroraLogoParser.TrocarCorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#trocarCor}.
	 * @param ctx the parse tree
	 */
	void exitTrocarCor(AuroraLogoParser.TrocarCorContext ctx);
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
	 * Enter a parse tree produced by {@link AuroraLogoParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcat(AuroraLogoParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcat(AuroraLogoParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void enterAtribuir(AuroraLogoParser.AtribuirContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void exitAtribuir(AuroraLogoParser.AtribuirContext ctx);
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
}