// Generated from gramatica/AuroraLogo.g4 by ANTLR 4.10.1
package br.com.davidbuzatto.auroralogo.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AuroraLogoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, VA=6, PARA=7, EM=8, DIR=9, ESQ=10, 
		CIM=11, BAI=12, TROC=13, COR=14, DO=15, FUN=16, GIR=17, ENG=18, DES=19, 
		GROS=20, ESC=21, LER=22, ABA=23, LEV=24, PINC=25, LIM=26, SE=27, ENT=28, 
		SEN=29, ENQ=30, REP=31, VEZ=32, VEZS=33, NA=34, SAI=35, VER=36, FAL=37, 
		PRETO=38, AZUL=39, CIANO=40, CINZA=41, VERDE=42, MAGENTA=43, LARANJA=44, 
		ROSA=45, VERMELHO=46, BRANCO=47, AMARELO=48, ESCURO=49, CLARO=50, RAIZ=51, 
		ATR=52, ATRA=53, ADI=54, ADIA=55, SUB=56, SUBA=57, MUL=58, DIV=59, DIVA=60, 
		POR=61, MOD=62, MODA=63, IGU=64, IGUT=65, IGUA=66, DIF=67, DIFT=68, DIFA=69, 
		ME=70, MET=71, MEA=72, MEI=73, MEIT=74, MEIA=75, MA=76, MAT=77, MAA=78, 
		MAI=79, MAIT=80, MAIA=81, ELG=82, ELGT=83, OLG=84, OLGT=85, NAO=86, NAOT=87, 
		DOT=88, ID=89, INT=90, DEC=91, HEX=92, CHAR=93, STRING=94, COMENTARIO=95, 
		COMENTARIO_LINHA=96, WS=97;
	public static final int
		RULE_prog = 0, RULE_inst = 1, RULE_ains = 2, RULE_expr = 3, RULE_relacao = 4, 
		RULE_exprSimp = 5, RULE_termo = 6, RULE_fator = 7, RULE_exprBool = 8, 
		RULE_bool = 9, RULE_se = 10, RULE_seSe = 11, RULE_seSenaoSe = 12, RULE_seSenaoSeP = 13, 
		RULE_seSenao = 14, RULE_repetir = 15, RULE_repetirEnquanto = 16, RULE_movimentar = 17, 
		RULE_trocarCor = 18, RULE_configuracaoCor = 19, RULE_girar = 20, RULE_engrossar = 21, 
		RULE_desengrossar = 22, RULE_trocarGrossura = 23, RULE_escrever = 24, 
		RULE_ler = 25, RULE_atribuir = 26, RULE_abaixar = 27, RULE_levantar = 28, 
		RULE_limpar = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "inst", "ains", "expr", "relacao", "exprSimp", "termo", "fator", 
			"exprBool", "bool", "se", "seSe", "seSenaoSe", "seSenaoSeP", "seSenao", 
			"repetir", "repetirEnquanto", "movimentar", "trocarCor", "configuracaoCor", 
			"girar", "engrossar", "desengrossar", "trocarGrossura", "escrever", "ler", 
			"atribuir", "abaixar", "levantar", "limpar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "'v\\u00E1'", "'para'", "'em'", 
			"'direita'", "'esquerda'", "'cima'", "'baixo'", "'trocar'", "'cor'", 
			"'do'", "'fundo'", "'girar'", "'engrossar'", "'desengrossar'", "'grossura'", 
			"'escrever'", "'ler'", "'abaixar'", "'levantar'", "'pincel'", "'limpar'", 
			"'se'", "'ent\\u00E3o'", "'sen\\u00E3o'", "'enquanto'", "'repetir'", 
			"'vez'", "'vezes'", "'na'", "'sa\\u00EDda'", "'VERDADEIRO'", "'FALSO'", 
			"'preto'", "'azul'", "'ciano'", "'cinza'", "'verde'", "'magenta'", "'laranja'", 
			"'rosa'", "'vermelho'", "'branco'", "'amarelo'", "'escuro'", "'claro'", 
			"'raiz'", "'='", "'<-'", "'+'", "'mais'", "'-'", "'menos'", "'*'", "'/'", 
			"'dividido'", "'por'", "'%'", "'resto'", "'=='", "'\\u00E9 igual a'", 
			"'n\\u00E3o \\u00E9 diferente de'", "'!='", "'\\u00E9 diferente de'", 
			"'n\\u00E3o \\u00E9 igual a'", "'<'", "'\\u00E9 menor que'", "'n\\u00E3o \\u00E9 maior ou igual a'", 
			"'<='", "'\\u00E9 menor ou igual a'", "'n\\u00E3o \\u00E9 maior que'", 
			"'>'", "'\\u00E9 maior que'", "'n\\u00E3o \\u00E9 menor ou igual a'", 
			"'>='", "'\\u00E9 maior ou igual a'", "'n\\u00E3o \\u00E9 menor que'", 
			"'&&'", "'E'", "'||'", "'OU'", "'!'", "'N\\u00C3O'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "VA", "PARA", "EM", "DIR", "ESQ", 
			"CIM", "BAI", "TROC", "COR", "DO", "FUN", "GIR", "ENG", "DES", "GROS", 
			"ESC", "LER", "ABA", "LEV", "PINC", "LIM", "SE", "ENT", "SEN", "ENQ", 
			"REP", "VEZ", "VEZS", "NA", "SAI", "VER", "FAL", "PRETO", "AZUL", "CIANO", 
			"CINZA", "VERDE", "MAGENTA", "LARANJA", "ROSA", "VERMELHO", "BRANCO", 
			"AMARELO", "ESCURO", "CLARO", "RAIZ", "ATR", "ATRA", "ADI", "ADIA", "SUB", 
			"SUBA", "MUL", "DIV", "DIVA", "POR", "MOD", "MODA", "IGU", "IGUT", "IGUA", 
			"DIF", "DIFT", "DIFA", "ME", "MET", "MEA", "MEI", "MEIT", "MEIA", "MA", 
			"MAT", "MAA", "MAI", "MAIT", "MAIA", "ELG", "ELGT", "OLG", "OLGT", "NAO", 
			"NAOT", "DOT", "ID", "INT", "DEC", "HEX", "CHAR", "STRING", "COMENTARIO", 
			"COMENTARIO_LINHA", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AuroraLogo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AuroraLogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				inst();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VA) | (1L << TROC) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP))) != 0) || _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstContext extends ParserRuleContext {
		public AinsContext ains() {
			return getRuleContext(AinsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AuroraLogoParser.DOT, 0); }
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public RepetirEnquantoContext repetirEnquanto() {
			return getRuleContext(RepetirEnquantoContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inst);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				ains();
				setState(66);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				se();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				repetir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				repetirEnquanto();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AinsContext extends ParserRuleContext {
		public MovimentarContext movimentar() {
			return getRuleContext(MovimentarContext.class,0);
		}
		public TrocarCorContext trocarCor() {
			return getRuleContext(TrocarCorContext.class,0);
		}
		public GirarContext girar() {
			return getRuleContext(GirarContext.class,0);
		}
		public EngrossarContext engrossar() {
			return getRuleContext(EngrossarContext.class,0);
		}
		public DesengrossarContext desengrossar() {
			return getRuleContext(DesengrossarContext.class,0);
		}
		public TrocarGrossuraContext trocarGrossura() {
			return getRuleContext(TrocarGrossuraContext.class,0);
		}
		public EscreverContext escrever() {
			return getRuleContext(EscreverContext.class,0);
		}
		public LerContext ler() {
			return getRuleContext(LerContext.class,0);
		}
		public AtribuirContext atribuir() {
			return getRuleContext(AtribuirContext.class,0);
		}
		public AbaixarContext abaixar() {
			return getRuleContext(AbaixarContext.class,0);
		}
		public LevantarContext levantar() {
			return getRuleContext(LevantarContext.class,0);
		}
		public LimparContext limpar() {
			return getRuleContext(LimparContext.class,0);
		}
		public AinsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ains; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterAins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitAins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitAins(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AinsContext ains() throws RecognitionException {
		AinsContext _localctx = new AinsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ains);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				movimentar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				trocarCor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				girar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				engrossar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				desengrossar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				trocarGrossura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				escrever();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				ler();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(81);
				atribuir();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(82);
				abaixar();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(83);
				levantar();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(84);
				limpar();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<RelacaoContext> relacao() {
			return getRuleContexts(RelacaoContext.class);
		}
		public RelacaoContext relacao(int i) {
			return getRuleContext(RelacaoContext.class,i);
		}
		public List<TerminalNode> ELG() { return getTokens(AuroraLogoParser.ELG); }
		public TerminalNode ELG(int i) {
			return getToken(AuroraLogoParser.ELG, i);
		}
		public List<TerminalNode> ELGT() { return getTokens(AuroraLogoParser.ELGT); }
		public TerminalNode ELGT(int i) {
			return getToken(AuroraLogoParser.ELGT, i);
		}
		public List<TerminalNode> OLG() { return getTokens(AuroraLogoParser.OLG); }
		public TerminalNode OLG(int i) {
			return getToken(AuroraLogoParser.OLG, i);
		}
		public List<TerminalNode> OLGT() { return getTokens(AuroraLogoParser.OLGT); }
		public TerminalNode OLGT(int i) {
			return getToken(AuroraLogoParser.OLGT, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			relacao();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ELG - 82)) | (1L << (ELGT - 82)) | (1L << (OLG - 82)) | (1L << (OLGT - 82)))) != 0)) {
				{
				{
				setState(88);
				_la = _input.LA(1);
				if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ELG - 82)) | (1L << (ELGT - 82)) | (1L << (OLG - 82)) | (1L << (OLGT - 82)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(89);
				relacao();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelacaoContext extends ParserRuleContext {
		public Token opRel;
		public List<ExprSimpContext> exprSimp() {
			return getRuleContexts(ExprSimpContext.class);
		}
		public ExprSimpContext exprSimp(int i) {
			return getRuleContext(ExprSimpContext.class,i);
		}
		public TerminalNode IGU() { return getToken(AuroraLogoParser.IGU, 0); }
		public TerminalNode IGUT() { return getToken(AuroraLogoParser.IGUT, 0); }
		public TerminalNode IGUA() { return getToken(AuroraLogoParser.IGUA, 0); }
		public TerminalNode DIF() { return getToken(AuroraLogoParser.DIF, 0); }
		public TerminalNode DIFT() { return getToken(AuroraLogoParser.DIFT, 0); }
		public TerminalNode DIFA() { return getToken(AuroraLogoParser.DIFA, 0); }
		public TerminalNode ME() { return getToken(AuroraLogoParser.ME, 0); }
		public TerminalNode MET() { return getToken(AuroraLogoParser.MET, 0); }
		public TerminalNode MEA() { return getToken(AuroraLogoParser.MEA, 0); }
		public TerminalNode MEI() { return getToken(AuroraLogoParser.MEI, 0); }
		public TerminalNode MEIT() { return getToken(AuroraLogoParser.MEIT, 0); }
		public TerminalNode MEIA() { return getToken(AuroraLogoParser.MEIA, 0); }
		public TerminalNode MA() { return getToken(AuroraLogoParser.MA, 0); }
		public TerminalNode MAT() { return getToken(AuroraLogoParser.MAT, 0); }
		public TerminalNode MAA() { return getToken(AuroraLogoParser.MAA, 0); }
		public TerminalNode MAI() { return getToken(AuroraLogoParser.MAI, 0); }
		public TerminalNode MAIT() { return getToken(AuroraLogoParser.MAIT, 0); }
		public TerminalNode MAIA() { return getToken(AuroraLogoParser.MAIA, 0); }
		public RelacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterRelacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitRelacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitRelacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacaoContext relacao() throws RecognitionException {
		RelacaoContext _localctx = new RelacaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_relacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			exprSimp();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IGU - 64)) | (1L << (IGUT - 64)) | (1L << (IGUA - 64)) | (1L << (DIF - 64)) | (1L << (DIFT - 64)) | (1L << (DIFA - 64)) | (1L << (ME - 64)) | (1L << (MET - 64)) | (1L << (MEA - 64)) | (1L << (MEI - 64)) | (1L << (MEIT - 64)) | (1L << (MEIA - 64)) | (1L << (MA - 64)) | (1L << (MAT - 64)) | (1L << (MAA - 64)) | (1L << (MAI - 64)) | (1L << (MAIT - 64)) | (1L << (MAIA - 64)))) != 0)) {
				{
				setState(96);
				((RelacaoContext)_localctx).opRel = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IGU - 64)) | (1L << (IGUT - 64)) | (1L << (IGUA - 64)) | (1L << (DIF - 64)) | (1L << (DIFT - 64)) | (1L << (DIFA - 64)) | (1L << (ME - 64)) | (1L << (MET - 64)) | (1L << (MEA - 64)) | (1L << (MEI - 64)) | (1L << (MEIT - 64)) | (1L << (MEIA - 64)) | (1L << (MA - 64)) | (1L << (MAT - 64)) | (1L << (MAA - 64)) | (1L << (MAI - 64)) | (1L << (MAIT - 64)) | (1L << (MAIA - 64)))) != 0)) ) {
					((RelacaoContext)_localctx).opRel = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				exprSimp();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprSimpContext extends ParserRuleContext {
		public Token opNeg;
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> ADI() { return getTokens(AuroraLogoParser.ADI); }
		public TerminalNode ADI(int i) {
			return getToken(AuroraLogoParser.ADI, i);
		}
		public List<TerminalNode> ADIA() { return getTokens(AuroraLogoParser.ADIA); }
		public TerminalNode ADIA(int i) {
			return getToken(AuroraLogoParser.ADIA, i);
		}
		public List<TerminalNode> SUB() { return getTokens(AuroraLogoParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(AuroraLogoParser.SUB, i);
		}
		public List<TerminalNode> SUBA() { return getTokens(AuroraLogoParser.SUBA); }
		public TerminalNode SUBA(int i) {
			return getToken(AuroraLogoParser.SUBA, i);
		}
		public ExprSimpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSimp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterExprSimp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitExprSimp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitExprSimp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSimpContext exprSimp() throws RecognitionException {
		ExprSimpContext _localctx = new ExprSimpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprSimp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADI) | (1L << ADIA) | (1L << SUB) | (1L << SUBA))) != 0)) {
				{
				setState(100);
				((ExprSimpContext)_localctx).opNeg = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADI) | (1L << ADIA) | (1L << SUB) | (1L << SUBA))) != 0)) ) {
					((ExprSimpContext)_localctx).opNeg = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(103);
			termo();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADI) | (1L << ADIA) | (1L << SUB) | (1L << SUBA))) != 0)) {
				{
				{
				setState(104);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADI) | (1L << ADIA) | (1L << SUB) | (1L << SUBA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(105);
				termo();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(AuroraLogoParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(AuroraLogoParser.MUL, i);
		}
		public List<TerminalNode> VEZS() { return getTokens(AuroraLogoParser.VEZS); }
		public TerminalNode VEZS(int i) {
			return getToken(AuroraLogoParser.VEZS, i);
		}
		public List<TerminalNode> DIV() { return getTokens(AuroraLogoParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(AuroraLogoParser.DIV, i);
		}
		public List<TerminalNode> DIVA() { return getTokens(AuroraLogoParser.DIVA); }
		public TerminalNode DIVA(int i) {
			return getToken(AuroraLogoParser.DIVA, i);
		}
		public List<TerminalNode> POR() { return getTokens(AuroraLogoParser.POR); }
		public TerminalNode POR(int i) {
			return getToken(AuroraLogoParser.POR, i);
		}
		public List<TerminalNode> MOD() { return getTokens(AuroraLogoParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(AuroraLogoParser.MOD, i);
		}
		public List<TerminalNode> MODA() { return getTokens(AuroraLogoParser.MODA); }
		public TerminalNode MODA(int i) {
			return getToken(AuroraLogoParser.MODA, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_termo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			fator();
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MUL:
						{
						setState(112);
						match(MUL);
						}
						break;
					case VEZS:
						{
						setState(113);
						match(VEZS);
						}
						break;
					case DIV:
						{
						setState(114);
						match(DIV);
						}
						break;
					case DIVA:
						{
						setState(115);
						match(DIVA);
						setState(116);
						match(POR);
						}
						break;
					case MOD:
						{
						setState(117);
						match(MOD);
						}
						break;
					case MODA:
						{
						setState(118);
						match(MODA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(121);
					fator();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	 
		public FatorContext() { }
		public void copyFrom(FatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FatorDecContext extends FatorContext {
		public TerminalNode DEC() { return getToken(AuroraLogoParser.DEC, 0); }
		public FatorDecContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FatorIntContext extends FatorContext {
		public TerminalNode INT() { return getToken(AuroraLogoParser.INT, 0); }
		public FatorIntContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FatorStringContext extends FatorContext {
		public TerminalNode STRING() { return getToken(AuroraLogoParser.STRING, 0); }
		public FatorStringContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FatorParentesesContext extends FatorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FatorParentesesContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorParenteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorParenteses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorParenteses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FatorNaoContext extends FatorContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TerminalNode NAO() { return getToken(AuroraLogoParser.NAO, 0); }
		public TerminalNode NAOT() { return getToken(AuroraLogoParser.NAOT, 0); }
		public FatorNaoContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorNao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorNao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorNao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FatorCharContext extends FatorContext {
		public TerminalNode CHAR() { return getToken(AuroraLogoParser.CHAR, 0); }
		public FatorCharContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FatorIdContext extends FatorContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public FatorIdContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fator);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAO:
			case NAOT:
				_localctx = new FatorNaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NAOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
				fator();
				}
				break;
			case INT:
				_localctx = new FatorIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(INT);
				}
				break;
			case DEC:
				_localctx = new FatorDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(DEC);
				}
				break;
			case VER:
			case FAL:
			case ID:
				_localctx = new FatorIdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VER:
				case FAL:
					{
					setState(131);
					bool();
					}
					break;
				case ID:
					{
					setState(132);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case CHAR:
				_localctx = new FatorCharContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				match(CHAR);
				}
				break;
			case STRING:
				_localctx = new FatorStringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				match(STRING);
				}
				break;
			case T__0:
				_localctx = new FatorParentesesContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(137);
				match(T__0);
				setState(138);
				expr();
				setState(139);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprBoolContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprBoolContext exprBool() throws RecognitionException {
		ExprBoolContext _localctx = new ExprBoolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode VER() { return getToken(AuroraLogoParser.VER, 0); }
		public TerminalNode FAL() { return getToken(AuroraLogoParser.FAL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !(_la==VER || _la==FAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeContext extends ParserRuleContext {
		public SeSeContext seSe() {
			return getRuleContext(SeSeContext.class,0);
		}
		public SeSenaoSeContext seSenaoSe() {
			return getRuleContext(SeSenaoSeContext.class,0);
		}
		public SeSenaoContext seSenao() {
			return getRuleContext(SeSenaoContext.class,0);
		}
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			seSe();
			setState(148);
			seSenaoSe();
			setState(149);
			seSenao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeSeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(AuroraLogoParser.SE, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode ENT() { return getToken(AuroraLogoParser.ENT, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public SeSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterSeSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitSeSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitSeSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeSeContext seSe() throws RecognitionException {
		SeSeContext _localctx = new SeSeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_seSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(SE);
			setState(152);
			exprBool();
			setState(153);
			match(ENT);
			setState(154);
			match(T__2);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				inst();
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VA) | (1L << TROC) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP))) != 0) || _la==ID );
			setState(160);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeSenaoSeContext extends ParserRuleContext {
		public List<SeSenaoSePContext> seSenaoSeP() {
			return getRuleContexts(SeSenaoSePContext.class);
		}
		public SeSenaoSePContext seSenaoSeP(int i) {
			return getRuleContext(SeSenaoSePContext.class,i);
		}
		public SeSenaoSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seSenaoSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterSeSenaoSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitSeSenaoSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitSeSenaoSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeSenaoSeContext seSenaoSe() throws RecognitionException {
		SeSenaoSeContext _localctx = new SeSenaoSeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_seSenaoSe);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					seSenaoSeP();
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeSenaoSePContext extends ParserRuleContext {
		public TerminalNode SEN() { return getToken(AuroraLogoParser.SEN, 0); }
		public TerminalNode SE() { return getToken(AuroraLogoParser.SE, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode ENT() { return getToken(AuroraLogoParser.ENT, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public SeSenaoSePContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seSenaoSeP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterSeSenaoSeP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitSeSenaoSeP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitSeSenaoSeP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeSenaoSePContext seSenaoSeP() throws RecognitionException {
		SeSenaoSePContext _localctx = new SeSenaoSePContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_seSenaoSeP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(SEN);
			setState(169);
			match(SE);
			setState(170);
			exprBool();
			setState(171);
			match(ENT);
			setState(172);
			match(T__2);
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				inst();
				}
				}
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VA) | (1L << TROC) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP))) != 0) || _la==ID );
			setState(178);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeSenaoContext extends ParserRuleContext {
		public TerminalNode SEN() { return getToken(AuroraLogoParser.SEN, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public SeSenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seSenao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterSeSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitSeSenao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitSeSenao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeSenaoContext seSenao() throws RecognitionException {
		SeSenaoContext _localctx = new SeSenaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_seSenao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEN) {
				{
				setState(180);
				match(SEN);
				setState(181);
				match(T__2);
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(182);
					inst();
					}
					}
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VA) | (1L << TROC) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP))) != 0) || _la==ID );
				setState(187);
				match(T__3);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepetirContext extends ParserRuleContext {
		public TerminalNode REP() { return getToken(AuroraLogoParser.REP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VEZ() { return getToken(AuroraLogoParser.VEZ, 0); }
		public TerminalNode VEZS() { return getToken(AuroraLogoParser.VEZS, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public RepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitRepetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitRepetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(REP);
			setState(192);
			expr();
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==VEZ || _la==VEZS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(194);
			match(T__2);
			setState(196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195);
				inst();
				}
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VA) | (1L << TROC) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP))) != 0) || _la==ID );
			setState(200);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepetirEnquantoContext extends ParserRuleContext {
		public TerminalNode REP() { return getToken(AuroraLogoParser.REP, 0); }
		public TerminalNode ENQ() { return getToken(AuroraLogoParser.ENQ, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public RepetirEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetirEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterRepetirEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitRepetirEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitRepetirEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetirEnquantoContext repetirEnquanto() throws RecognitionException {
		RepetirEnquantoContext _localctx = new RepetirEnquantoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_repetirEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENQ) {
				{
				setState(202);
				match(ENQ);
				setState(203);
				exprBool();
				}
			}

			setState(206);
			match(REP);
			setState(207);
			match(T__2);
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				inst();
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VA) | (1L << TROC) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP))) != 0) || _la==ID );
			setState(213);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MovimentarContext extends ParserRuleContext {
		public MovimentarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movimentar; }
	 
		public MovimentarContext() { }
		public void copyFrom(MovimentarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MovimentarDirecaoContext extends MovimentarContext {
		public TerminalNode VA() { return getToken(AuroraLogoParser.VA, 0); }
		public TerminalNode PARA() { return getToken(AuroraLogoParser.PARA, 0); }
		public TerminalNode DIR() { return getToken(AuroraLogoParser.DIR, 0); }
		public TerminalNode ESQ() { return getToken(AuroraLogoParser.ESQ, 0); }
		public TerminalNode CIM() { return getToken(AuroraLogoParser.CIM, 0); }
		public TerminalNode BAI() { return getToken(AuroraLogoParser.BAI, 0); }
		public TerminalNode EM() { return getToken(AuroraLogoParser.EM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MovimentarDirecaoContext(MovimentarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterMovimentarDirecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitMovimentarDirecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitMovimentarDirecao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MovimentarPontoContext extends MovimentarContext {
		public TerminalNode VA() { return getToken(AuroraLogoParser.VA, 0); }
		public TerminalNode PARA() { return getToken(AuroraLogoParser.PARA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MovimentarPontoContext(MovimentarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterMovimentarPonto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitMovimentarPonto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitMovimentarPonto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovimentarContext movimentar() throws RecognitionException {
		MovimentarContext _localctx = new MovimentarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_movimentar);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new MovimentarDirecaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(VA);
				setState(216);
				match(PARA);
				setState(217);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIR) | (1L << ESQ) | (1L << CIM) | (1L << BAI))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EM) {
					{
					setState(218);
					match(EM);
					setState(219);
					expr();
					}
				}

				}
				break;
			case 2:
				_localctx = new MovimentarPontoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(VA);
				setState(223);
				match(PARA);
				setState(224);
				match(T__0);
				setState(225);
				expr();
				setState(226);
				match(T__4);
				setState(227);
				expr();
				setState(228);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrocarCorContext extends ParserRuleContext {
		public TrocarCorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trocarCor; }
	 
		public TrocarCorContext() { }
		public void copyFrom(TrocarCorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrocarCorPincelContext extends TrocarCorContext {
		public TerminalNode TROC() { return getToken(AuroraLogoParser.TROC, 0); }
		public TerminalNode COR() { return getToken(AuroraLogoParser.COR, 0); }
		public TerminalNode PARA() { return getToken(AuroraLogoParser.PARA, 0); }
		public ConfiguracaoCorContext configuracaoCor() {
			return getRuleContext(ConfiguracaoCorContext.class,0);
		}
		public TrocarCorPincelContext(TrocarCorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterTrocarCorPincel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitTrocarCorPincel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitTrocarCorPincel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrocarCorFundoContext extends TrocarCorContext {
		public TerminalNode TROC() { return getToken(AuroraLogoParser.TROC, 0); }
		public TerminalNode COR() { return getToken(AuroraLogoParser.COR, 0); }
		public TerminalNode DO() { return getToken(AuroraLogoParser.DO, 0); }
		public TerminalNode FUN() { return getToken(AuroraLogoParser.FUN, 0); }
		public TerminalNode PARA() { return getToken(AuroraLogoParser.PARA, 0); }
		public ConfiguracaoCorContext configuracaoCor() {
			return getRuleContext(ConfiguracaoCorContext.class,0);
		}
		public TrocarCorFundoContext(TrocarCorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterTrocarCorFundo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitTrocarCorFundo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitTrocarCorFundo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrocarCorContext trocarCor() throws RecognitionException {
		TrocarCorContext _localctx = new TrocarCorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_trocarCor);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new TrocarCorPincelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(TROC);
				setState(233);
				match(COR);
				setState(234);
				match(PARA);
				setState(235);
				configuracaoCor();
				}
				break;
			case 2:
				_localctx = new TrocarCorFundoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(TROC);
				setState(237);
				match(COR);
				setState(238);
				match(DO);
				setState(239);
				match(FUN);
				setState(240);
				match(PARA);
				setState(241);
				configuracaoCor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfiguracaoCorContext extends ParserRuleContext {
		public Token cor;
		public TerminalNode HEX() { return getToken(AuroraLogoParser.HEX, 0); }
		public TerminalNode PRETO() { return getToken(AuroraLogoParser.PRETO, 0); }
		public TerminalNode AZUL() { return getToken(AuroraLogoParser.AZUL, 0); }
		public TerminalNode CIANO() { return getToken(AuroraLogoParser.CIANO, 0); }
		public TerminalNode CINZA() { return getToken(AuroraLogoParser.CINZA, 0); }
		public TerminalNode VERDE() { return getToken(AuroraLogoParser.VERDE, 0); }
		public TerminalNode MAGENTA() { return getToken(AuroraLogoParser.MAGENTA, 0); }
		public TerminalNode LARANJA() { return getToken(AuroraLogoParser.LARANJA, 0); }
		public TerminalNode ROSA() { return getToken(AuroraLogoParser.ROSA, 0); }
		public TerminalNode VERMELHO() { return getToken(AuroraLogoParser.VERMELHO, 0); }
		public TerminalNode BRANCO() { return getToken(AuroraLogoParser.BRANCO, 0); }
		public TerminalNode AMARELO() { return getToken(AuroraLogoParser.AMARELO, 0); }
		public TerminalNode CLARO() { return getToken(AuroraLogoParser.CLARO, 0); }
		public TerminalNode ESCURO() { return getToken(AuroraLogoParser.ESCURO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VEZ() { return getToken(AuroraLogoParser.VEZ, 0); }
		public TerminalNode VEZS() { return getToken(AuroraLogoParser.VEZS, 0); }
		public ConfiguracaoCorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuracaoCor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterConfiguracaoCor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitConfiguracaoCor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitConfiguracaoCor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfiguracaoCorContext configuracaoCor() throws RecognitionException {
		ConfiguracaoCorContext _localctx = new ConfiguracaoCorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_configuracaoCor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEX:
				{
				setState(244);
				match(HEX);
				}
				break;
			case PRETO:
			case AZUL:
			case CIANO:
			case CINZA:
			case VERDE:
			case MAGENTA:
			case LARANJA:
			case ROSA:
			case VERMELHO:
			case BRANCO:
			case AMARELO:
				{
				setState(245);
				((ConfiguracaoCorContext)_localctx).cor = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRETO) | (1L << AZUL) | (1L << CIANO) | (1L << CINZA) | (1L << VERDE) | (1L << MAGENTA) | (1L << LARANJA) | (1L << ROSA) | (1L << VERMELHO) | (1L << BRANCO) | (1L << AMARELO))) != 0)) ) {
					((ConfiguracaoCorContext)_localctx).cor = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VER) | (1L << FAL) | (1L << ESCURO) | (1L << CLARO) | (1L << ADI) | (1L << ADIA) | (1L << SUB) | (1L << SUBA))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (NAO - 86)) | (1L << (NAOT - 86)) | (1L << (ID - 86)) | (1L << (INT - 86)) | (1L << (DEC - 86)) | (1L << (CHAR - 86)) | (1L << (STRING - 86)))) != 0)) {
				{
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VER) | (1L << FAL) | (1L << ADI) | (1L << ADIA) | (1L << SUB) | (1L << SUBA))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (NAO - 86)) | (1L << (NAOT - 86)) | (1L << (ID - 86)) | (1L << (INT - 86)) | (1L << (DEC - 86)) | (1L << (CHAR - 86)) | (1L << (STRING - 86)))) != 0)) {
					{
					setState(248);
					expr();
					setState(249);
					_la = _input.LA(1);
					if ( !(_la==VEZ || _la==VEZS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(253);
				_la = _input.LA(1);
				if ( !(_la==ESCURO || _la==CLARO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GirarContext extends ParserRuleContext {
		public TerminalNode GIR() { return getToken(AuroraLogoParser.GIR, 0); }
		public TerminalNode EM() { return getToken(AuroraLogoParser.EM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(AuroraLogoParser.SUB, 0); }
		public TerminalNode SUBA() { return getToken(AuroraLogoParser.SUBA, 0); }
		public GirarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_girar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterGirar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitGirar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitGirar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GirarContext girar() throws RecognitionException {
		GirarContext _localctx = new GirarContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_girar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(GIR);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(257);
				match(EM);
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(258);
					_la = _input.LA(1);
					if ( !(_la==SUB || _la==SUBA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(261);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EngrossarContext extends ParserRuleContext {
		public TerminalNode ENG() { return getToken(AuroraLogoParser.ENG, 0); }
		public TerminalNode EM() { return getToken(AuroraLogoParser.EM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EngrossarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engrossar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterEngrossar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitEngrossar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitEngrossar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngrossarContext engrossar() throws RecognitionException {
		EngrossarContext _localctx = new EngrossarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_engrossar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ENG);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(265);
				match(EM);
				setState(266);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesengrossarContext extends ParserRuleContext {
		public TerminalNode DES() { return getToken(AuroraLogoParser.DES, 0); }
		public TerminalNode EM() { return getToken(AuroraLogoParser.EM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DesengrossarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desengrossar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterDesengrossar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitDesengrossar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitDesengrossar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesengrossarContext desengrossar() throws RecognitionException {
		DesengrossarContext _localctx = new DesengrossarContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_desengrossar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(DES);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(270);
				match(EM);
				setState(271);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrocarGrossuraContext extends ParserRuleContext {
		public TerminalNode TROC() { return getToken(AuroraLogoParser.TROC, 0); }
		public TerminalNode GROS() { return getToken(AuroraLogoParser.GROS, 0); }
		public TerminalNode PARA() { return getToken(AuroraLogoParser.PARA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TrocarGrossuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trocarGrossura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterTrocarGrossura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitTrocarGrossura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitTrocarGrossura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrocarGrossuraContext trocarGrossura() throws RecognitionException {
		TrocarGrossuraContext _localctx = new TrocarGrossuraContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_trocarGrossura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(TROC);
			setState(275);
			match(GROS);
			setState(276);
			match(PARA);
			setState(277);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscreverContext extends ParserRuleContext {
		public TerminalNode ESC() { return getToken(AuroraLogoParser.ESC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NA() { return getToken(AuroraLogoParser.NA, 0); }
		public TerminalNode SAI() { return getToken(AuroraLogoParser.SAI, 0); }
		public EscreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrever; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterEscrever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitEscrever(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitEscrever(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscreverContext escrever() throws RecognitionException {
		EscreverContext _localctx = new EscreverContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_escrever);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ESC);
			setState(280);
			expr();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NA) {
				{
				setState(281);
				match(NA);
				setState(282);
				match(SAI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LerContext extends ParserRuleContext {
		public TerminalNode LER() { return getToken(AuroraLogoParser.LER, 0); }
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterLer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitLer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitLer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(LER);
			setState(286);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuirContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ATR() { return getToken(AuroraLogoParser.ATR, 0); }
		public TerminalNode ATRA() { return getToken(AuroraLogoParser.ATRA, 0); }
		public AtribuirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterAtribuir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitAtribuir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitAtribuir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuirContext atribuir() throws RecognitionException {
		AtribuirContext _localctx = new AtribuirContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_atribuir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(ID);
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==ATR || _la==ATRA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(290);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbaixarContext extends ParserRuleContext {
		public TerminalNode ABA() { return getToken(AuroraLogoParser.ABA, 0); }
		public TerminalNode PINC() { return getToken(AuroraLogoParser.PINC, 0); }
		public AbaixarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abaixar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterAbaixar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitAbaixar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitAbaixar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbaixarContext abaixar() throws RecognitionException {
		AbaixarContext _localctx = new AbaixarContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_abaixar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(ABA);
			setState(293);
			match(PINC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevantarContext extends ParserRuleContext {
		public TerminalNode LEV() { return getToken(AuroraLogoParser.LEV, 0); }
		public TerminalNode PINC() { return getToken(AuroraLogoParser.PINC, 0); }
		public LevantarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levantar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterLevantar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitLevantar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitLevantar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevantarContext levantar() throws RecognitionException {
		LevantarContext _localctx = new LevantarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_levantar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LEV);
			setState(296);
			match(PINC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimparContext extends ParserRuleContext {
		public TerminalNode LIM() { return getToken(AuroraLogoParser.LIM, 0); }
		public LimparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limpar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterLimpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitLimpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitLimpar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimparContext limpar() throws RecognitionException {
		LimparContext _localctx = new LimparContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_limpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(LIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001a\u012d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0004\u0000"+
		">\b\u0000\u000b\u0000\f\u0000?\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001H\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002V\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003[\b\u0003\n\u0003"+
		"\f\u0003^\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004c\b\u0004"+
		"\u0001\u0005\u0003\u0005f\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005k\b\u0005\n\u0005\f\u0005n\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006x\b\u0006\u0001\u0006\u0005\u0006{\b\u0006\n\u0006\f\u0006"+
		"~\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0086\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008e\b\u0007\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u009d\b\u000b\u000b"+
		"\u000b\f\u000b\u009e\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u00a4\b\f"+
		"\n\f\f\f\u00a7\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004"+
		"\r\u00af\b\r\u000b\r\f\r\u00b0\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0004\u000e\u00b8\b\u000e\u000b\u000e\f\u000e\u00b9\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00be\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00c5\b\u000f\u000b\u000f\f"+
		"\u000f\u00c6\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00cd\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00d2\b"+
		"\u0010\u000b\u0010\f\u0010\u00d3\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00dd\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00e7\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00f3\b\u0012\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00f7\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00fc"+
		"\b\u0013\u0001\u0013\u0003\u0013\u00ff\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0104\b\u0014\u0001\u0014\u0003\u0014\u0107\b"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u010c\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0111\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u011c\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0000\u0000\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000"+
		"\u000b\u0001\u0000RU\u0001\u0000@Q\u0001\u000069\u0001\u0000VW\u0001\u0000"+
		"$%\u0001\u0000 !\u0001\u0000\t\f\u0001\u0000&0\u0001\u000012\u0001\u0000"+
		"89\u0001\u000045\u0141\u0000=\u0001\u0000\u0000\u0000\u0002G\u0001\u0000"+
		"\u0000\u0000\u0004U\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000\u0000"+
		"\b_\u0001\u0000\u0000\u0000\ne\u0001\u0000\u0000\u0000\fo\u0001\u0000"+
		"\u0000\u0000\u000e\u008d\u0001\u0000\u0000\u0000\u0010\u008f\u0001\u0000"+
		"\u0000\u0000\u0012\u0091\u0001\u0000\u0000\u0000\u0014\u0093\u0001\u0000"+
		"\u0000\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018\u00a5\u0001\u0000"+
		"\u0000\u0000\u001a\u00a8\u0001\u0000\u0000\u0000\u001c\u00bd\u0001\u0000"+
		"\u0000\u0000\u001e\u00bf\u0001\u0000\u0000\u0000 \u00cc\u0001\u0000\u0000"+
		"\u0000\"\u00e6\u0001\u0000\u0000\u0000$\u00f2\u0001\u0000\u0000\u0000"+
		"&\u00f6\u0001\u0000\u0000\u0000(\u0100\u0001\u0000\u0000\u0000*\u0108"+
		"\u0001\u0000\u0000\u0000,\u010d\u0001\u0000\u0000\u0000.\u0112\u0001\u0000"+
		"\u0000\u00000\u0117\u0001\u0000\u0000\u00002\u011d\u0001\u0000\u0000\u0000"+
		"4\u0120\u0001\u0000\u0000\u00006\u0124\u0001\u0000\u0000\u00008\u0127"+
		"\u0001\u0000\u0000\u0000:\u012a\u0001\u0000\u0000\u0000<>\u0003\u0002"+
		"\u0001\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0001\u0001\u0000\u0000"+
		"\u0000AB\u0003\u0004\u0002\u0000BC\u0005X\u0000\u0000CH\u0001\u0000\u0000"+
		"\u0000DH\u0003\u0014\n\u0000EH\u0003\u001e\u000f\u0000FH\u0003 \u0010"+
		"\u0000GA\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GF\u0001\u0000\u0000\u0000H\u0003\u0001\u0000\u0000\u0000"+
		"IV\u0003\"\u0011\u0000JV\u0003$\u0012\u0000KV\u0003(\u0014\u0000LV\u0003"+
		"*\u0015\u0000MV\u0003,\u0016\u0000NV\u0003.\u0017\u0000OV\u00030\u0018"+
		"\u0000PV\u00032\u0019\u0000QV\u00034\u001a\u0000RV\u00036\u001b\u0000"+
		"SV\u00038\u001c\u0000TV\u0003:\u001d\u0000UI\u0001\u0000\u0000\u0000U"+
		"J\u0001\u0000\u0000\u0000UK\u0001\u0000\u0000\u0000UL\u0001\u0000\u0000"+
		"\u0000UM\u0001\u0000\u0000\u0000UN\u0001\u0000\u0000\u0000UO\u0001\u0000"+
		"\u0000\u0000UP\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000UR\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000"+
		"V\u0005\u0001\u0000\u0000\u0000W\\\u0003\b\u0004\u0000XY\u0007\u0000\u0000"+
		"\u0000Y[\u0003\b\u0004\u0000ZX\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0007\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_b\u0003\n\u0005\u0000`a"+
		"\u0007\u0001\u0000\u0000ac\u0003\n\u0005\u0000b`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000c\t\u0001\u0000\u0000\u0000df\u0007\u0002\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gl\u0003\f\u0006\u0000hi\u0007\u0002\u0000\u0000ik\u0003\f"+
		"\u0006\u0000jh\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u000b\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000o|\u0003\u000e\u0007\u0000px\u0005:\u0000"+
		"\u0000qx\u0005!\u0000\u0000rx\u0005;\u0000\u0000st\u0005<\u0000\u0000"+
		"tx\u0005=\u0000\u0000ux\u0005>\u0000\u0000vx\u0005?\u0000\u0000wp\u0001"+
		"\u0000\u0000\u0000wq\u0001\u0000\u0000\u0000wr\u0001\u0000\u0000\u0000"+
		"ws\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000y{\u0003\u000e\u0007\u0000zw\u0001\u0000"+
		"\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\r\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0007\u0003\u0000\u0000\u0080\u008e\u0003\u000e\u0007\u0000"+
		"\u0081\u008e\u0005Z\u0000\u0000\u0082\u008e\u0005[\u0000\u0000\u0083\u0086"+
		"\u0003\u0012\t\u0000\u0084\u0086\u0005Y\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u008e\u0001"+
		"\u0000\u0000\u0000\u0087\u008e\u0005]\u0000\u0000\u0088\u008e\u0005^\u0000"+
		"\u0000\u0089\u008a\u0005\u0001\u0000\u0000\u008a\u008b\u0003\u0006\u0003"+
		"\u0000\u008b\u008c\u0005\u0002\u0000\u0000\u008c\u008e\u0001\u0000\u0000"+
		"\u0000\u008d\u007f\u0001\u0000\u0000\u0000\u008d\u0081\u0001\u0000\u0000"+
		"\u0000\u008d\u0082\u0001\u0000\u0000\u0000\u008d\u0085\u0001\u0000\u0000"+
		"\u0000\u008d\u0087\u0001\u0000\u0000\u0000\u008d\u0088\u0001\u0000\u0000"+
		"\u0000\u008d\u0089\u0001\u0000\u0000\u0000\u008e\u000f\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0003\u0006\u0003\u0000\u0090\u0011\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0007\u0004\u0000\u0000\u0092\u0013\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0003\u0016\u000b\u0000\u0094\u0095\u0003\u0018\f\u0000"+
		"\u0095\u0096\u0003\u001c\u000e\u0000\u0096\u0015\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005\u001b\u0000\u0000\u0098\u0099\u0003\u0010\b\u0000\u0099"+
		"\u009a\u0005\u001c\u0000\u0000\u009a\u009c\u0005\u0003\u0000\u0000\u009b"+
		"\u009d\u0003\u0002\u0001\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0004\u0000\u0000\u00a1\u0017\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a4\u0003\u001a\r\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u0019\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u001d\u0000\u0000\u00a9\u00aa"+
		"\u0005\u001b\u0000\u0000\u00aa\u00ab\u0003\u0010\b\u0000\u00ab\u00ac\u0005"+
		"\u001c\u0000\u0000\u00ac\u00ae\u0005\u0003\u0000\u0000\u00ad\u00af\u0003"+
		"\u0002\u0001\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"\u0004\u0000\u0000\u00b3\u001b\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"\u001d\u0000\u0000\u00b5\u00b7\u0005\u0003\u0000\u0000\u00b6\u00b8\u0003"+
		"\u0002\u0001\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"\u0004\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00b4\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u001d\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0005\u001f\u0000\u0000\u00c0\u00c1\u0003"+
		"\u0006\u0003\u0000\u00c1\u00c2\u0007\u0005\u0000\u0000\u00c2\u00c4\u0005"+
		"\u0003\u0000\u0000\u00c3\u00c5\u0003\u0002\u0001\u0000\u00c4\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0005\u0004\u0000\u0000\u00c9\u001f\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0005\u001e\u0000\u0000\u00cb\u00cd\u0003"+
		"\u0010\b\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u001f"+
		"\u0000\u0000\u00cf\u00d1\u0005\u0003\u0000\u0000\u00d0\u00d2\u0003\u0002"+
		"\u0001\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0004"+
		"\u0000\u0000\u00d6!\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0006\u0000"+
		"\u0000\u00d8\u00d9\u0005\u0007\u0000\u0000\u00d9\u00dc\u0007\u0006\u0000"+
		"\u0000\u00da\u00db\u0005\b\u0000\u0000\u00db\u00dd\u0003\u0006\u0003\u0000"+
		"\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dd\u00e7\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0006\u0000\u0000"+
		"\u00df\u00e0\u0005\u0007\u0000\u0000\u00e0\u00e1\u0005\u0001\u0000\u0000"+
		"\u00e1\u00e2\u0003\u0006\u0003\u0000\u00e2\u00e3\u0005\u0005\u0000\u0000"+
		"\u00e3\u00e4\u0003\u0006\u0003\u0000\u00e4\u00e5\u0005\u0002\u0000\u0000"+
		"\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00e6\u00de\u0001\u0000\u0000\u0000\u00e7#\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005\r\u0000\u0000\u00e9\u00ea\u0005\u000e\u0000\u0000\u00ea\u00eb"+
		"\u0005\u0007\u0000\u0000\u00eb\u00f3\u0003&\u0013\u0000\u00ec\u00ed\u0005"+
		"\r\u0000\u0000\u00ed\u00ee\u0005\u000e\u0000\u0000\u00ee\u00ef\u0005\u000f"+
		"\u0000\u0000\u00ef\u00f0\u0005\u0010\u0000\u0000\u00f0\u00f1\u0005\u0007"+
		"\u0000\u0000\u00f1\u00f3\u0003&\u0013\u0000\u00f2\u00e8\u0001\u0000\u0000"+
		"\u0000\u00f2\u00ec\u0001\u0000\u0000\u0000\u00f3%\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f7\u0005\\\u0000\u0000\u00f5\u00f7\u0007\u0007\u0000\u0000\u00f6"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7"+
		"\u00fe\u0001\u0000\u0000\u0000\u00f8\u00f9\u0003\u0006\u0003\u0000\u00f9"+
		"\u00fa\u0007\u0005\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff\u0007\b\u0000\u0000\u00fe\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\'\u0001"+
		"\u0000\u0000\u0000\u0100\u0106\u0005\u0011\u0000\u0000\u0101\u0103\u0005"+
		"\b\u0000\u0000\u0102\u0104\u0007\t\u0000\u0000\u0103\u0102\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
		"\u0000\u0000\u0105\u0107\u0003\u0006\u0003\u0000\u0106\u0101\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107)\u0001\u0000\u0000"+
		"\u0000\u0108\u010b\u0005\u0012\u0000\u0000\u0109\u010a\u0005\b\u0000\u0000"+
		"\u010a\u010c\u0003\u0006\u0003\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0001\u0000\u0000\u0000\u010c+\u0001\u0000\u0000\u0000\u010d"+
		"\u0110\u0005\u0013\u0000\u0000\u010e\u010f\u0005\b\u0000\u0000\u010f\u0111"+
		"\u0003\u0006\u0003\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111-\u0001\u0000\u0000\u0000\u0112\u0113\u0005"+
		"\r\u0000\u0000\u0113\u0114\u0005\u0014\u0000\u0000\u0114\u0115\u0005\u0007"+
		"\u0000\u0000\u0115\u0116\u0003\u0006\u0003\u0000\u0116/\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0005\u0015\u0000\u0000\u0118\u011b\u0003\u0006\u0003"+
		"\u0000\u0119\u011a\u0005\"\u0000\u0000\u011a\u011c\u0005#\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c1\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0016\u0000\u0000\u011e"+
		"\u011f\u0005Y\u0000\u0000\u011f3\u0001\u0000\u0000\u0000\u0120\u0121\u0005"+
		"Y\u0000\u0000\u0121\u0122\u0007\n\u0000\u0000\u0122\u0123\u0003\u0006"+
		"\u0003\u0000\u01235\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0017\u0000"+
		"\u0000\u0125\u0126\u0005\u0019\u0000\u0000\u01267\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0005\u0018\u0000\u0000\u0128\u0129\u0005\u0019\u0000\u0000"+
		"\u01299\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u001a\u0000\u0000\u012b"+
		";\u0001\u0000\u0000\u0000\u001e?GU\\belw|\u0085\u008d\u009e\u00a5\u00b0"+
		"\u00b9\u00bd\u00c6\u00cc\u00d3\u00dc\u00e6\u00f2\u00f6\u00fb\u00fe\u0103"+
		"\u0106\u010b\u0110\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}