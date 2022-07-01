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
	 * Visit a parse tree produced by the {@code fatorId}
	 * labeled alternative in {@link AuroraLogoParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorId(AuroraLogoParser.FatorIdContext ctx);
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
	 * Visit a parse tree produced by {@link AuroraLogoParser#seSenaoSeP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeSenaoSeP(AuroraLogoParser.SeSenaoSePContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#seSenao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeSenao(AuroraLogoParser.SeSenaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#repita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepita(AuroraLogoParser.RepitaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#enquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquanto(AuroraLogoParser.EnquantoContext ctx);
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
	 * Visit a parse tree produced by {@link AuroraLogoParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(AuroraLogoParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuroraLogoParser#atribuir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuir(AuroraLogoParser.AtribuirContext ctx);
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
}