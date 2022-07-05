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
		CIM=11, BAI=12, TROC=13, COR=14, DO=15, FUN=16, GIR=17, GRA=18, ENG=19, 
		DES=20, GROS=21, ESC=22, LER=23, ABA=24, LEV=25, PINC=26, LIM=27, SE=28, 
		ENT=29, SEN=30, ENQ=31, REP=32, VEZ=33, VEZS=34, NA=35, SAI=36, PI=37, 
		VER=38, FAL=39, PRETO=40, AZUL=41, CIANO=42, CINZA=43, VERDE=44, MAGENTA=45, 
		LARANJA=46, ROSA=47, VERMELHO=48, BRANCO=49, AMARELO=50, ESCURO=51, CLARO=52, 
		F_VABS=53, F_RAIQ=54, F_RAIC=55, F_RAIZ=56, F_POTE=57, F_HIPO=58, F_CHAO=59, 
		F_TETO=60, F_ARRE=61, F_MINI=62, F_MAXI=63, F_NUMA=64, F_SEME=65, F_SENO=66, 
		F_COSS=67, F_TANG=68, F_ASEN=69, F_ACOS=70, F_ATAN=71, F_CAPO=72, F_SENH=73, 
		F_COSH=74, F_TANH=75, F_LOGA=76, F_GRRA=77, F_RAGR=78, ATR=79, ATRA=80, 
		ADI=81, ADIA=82, SUB=83, SUBA=84, MUL=85, DIV=86, DIVA=87, POR=88, MOD=89, 
		MODA=90, IGU=91, IGUT=92, IGUA=93, DIF=94, DIFT=95, DIFA=96, ME=97, MET=98, 
		MEA=99, MEI=100, MEIT=101, MEIA=102, MA=103, MAT=104, MAA=105, MAI=106, 
		MAIT=107, MAIA=108, ELG=109, ELGT=110, OLG=111, OLGT=112, NAO=113, NAOT=114, 
		DOT=115, ID=116, INT=117, DEC=118, HEX=119, CHAR=120, STRING=121, COMENTARIO=122, 
		COMENTARIO_LINHA=123, WS=124;
	public static final int
		RULE_prog = 0, RULE_inst = 1, RULE_ains = 2, RULE_expr = 3, RULE_relacao = 4, 
		RULE_exprSimp = 5, RULE_termo = 6, RULE_fator = 7, RULE_exprBool = 8, 
		RULE_bool = 9, RULE_se = 10, RULE_seSe = 11, RULE_seSenaoSe = 12, RULE_seSenaoSeP = 13, 
		RULE_seSenao = 14, RULE_repetir = 15, RULE_repetirEnquanto = 16, RULE_movimentar = 17, 
		RULE_trocarCor = 18, RULE_configuracaoCor = 19, RULE_girar = 20, RULE_engrossar = 21, 
		RULE_desengrossar = 22, RULE_trocarGrossura = 23, RULE_escrever = 24, 
		RULE_ler = 25, RULE_atribuir = 26, RULE_abaixar = 27, RULE_levantar = 28, 
		RULE_limpar = 29, RULE_funcaoMatematica = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "inst", "ains", "expr", "relacao", "exprSimp", "termo", "fator", 
			"exprBool", "bool", "se", "seSe", "seSenaoSe", "seSenaoSeP", "seSenao", 
			"repetir", "repetirEnquanto", "movimentar", "trocarCor", "configuracaoCor", 
			"girar", "engrossar", "desengrossar", "trocarGrossura", "escrever", "ler", 
			"atribuir", "abaixar", "levantar", "limpar", "funcaoMatematica"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "'v\\u00E1'", "'para'", "'em'", 
			"'direita'", "'esquerda'", "'cima'", "'baixo'", "'trocar'", "'cor'", 
			"'do'", "'fundo'", "'girar'", "'graus'", "'engrossar'", "'desengrossar'", 
			"'grossura'", "'escrever'", "'ler'", "'abaixar'", "'levantar'", "'pincel'", 
			"'limpar'", "'se'", "'ent\\u00E3o'", "'sen\\u00E3o'", "'enquanto'", "'repetir'", 
			"'vez'", "'vezes'", "'na'", "'sa\\u00EDda'", "'PI'", "'VERDADEIRO'", 
			"'FALSO'", "'preto'", "'azul'", "'ciano'", "'cinza'", "'verde'", "'magenta'", 
			"'laranja'", "'rosa'", "'vermelho'", "'branco'", "'amarelo'", "'escuro'", 
			"'claro'", "'valorAbsoluto'", "'raizQuadrada'", "'raizC\\u00FAbica'", 
			"'raiz'", "'pot\\u00EAncia'", "'hipotenusa'", "'ch\\u00E3o'", "'teto'", 
			"'arredondar'", "'m\\u00EDnimo'", "'m\\u00E1ximo'", "'n\\u00FAmeroAleat\\u00F3rio'", 
			"'definirSementeAleat\\u00F3ria'", "'seno'", "'cosseno'", "'tangente'", 
			"'arcoSeno'", "'arcoCosseno'", "'arcoTangente'", "'cartesianoParaPolar'", 
			"'senoHiperb\\u00F3lico'", "'cossenoHiperb\\u00F3lico'", "'tangenteHiperb\\u00F3lica'", 
			"'logar\\u00EDtmo'", "'grausParaRadianos'", "'radianosParaGraus'", "'='", 
			"'<-'", "'+'", "'mais'", "'-'", "'menos'", "'*'", "'/'", "'dividido'", 
			"'por'", "'%'", "'resto'", "'=='", "'\\u00E9 igual a'", "'n\\u00E3o \\u00E9 diferente de'", 
			"'!='", "'\\u00E9 diferente de'", "'n\\u00E3o \\u00E9 igual a'", "'<'", 
			"'\\u00E9 menor que'", "'n\\u00E3o \\u00E9 maior ou igual a'", "'<='", 
			"'\\u00E9 menor ou igual a'", "'n\\u00E3o \\u00E9 maior que'", "'>'", 
			"'\\u00E9 maior que'", "'n\\u00E3o \\u00E9 menor ou igual a'", "'>='", 
			"'\\u00E9 maior ou igual a'", "'n\\u00E3o \\u00E9 menor que'", "'&&'", 
			"'E'", "'||'", "'OU'", "'!'", "'N\\u00C3O'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "VA", "PARA", "EM", "DIR", "ESQ", 
			"CIM", "BAI", "TROC", "COR", "DO", "FUN", "GIR", "GRA", "ENG", "DES", 
			"GROS", "ESC", "LER", "ABA", "LEV", "PINC", "LIM", "SE", "ENT", "SEN", 
			"ENQ", "REP", "VEZ", "VEZS", "NA", "SAI", "PI", "VER", "FAL", "PRETO", 
			"AZUL", "CIANO", "CINZA", "VERDE", "MAGENTA", "LARANJA", "ROSA", "VERMELHO", 
			"BRANCO", "AMARELO", "ESCURO", "CLARO", "F_VABS", "F_RAIQ", "F_RAIC", 
			"F_RAIZ", "F_POTE", "F_HIPO", "F_CHAO", "F_TETO", "F_ARRE", "F_MINI", 
			"F_MAXI", "F_NUMA", "F_SEME", "F_SENO", "F_COSS", "F_TANG", "F_ASEN", 
			"F_ACOS", "F_ATAN", "F_CAPO", "F_SENH", "F_COSH", "F_TANH", "F_LOGA", 
			"F_GRRA", "F_RAGR", "ATR", "ATRA", "ADI", "ADIA", "SUB", "SUBA", "MUL", 
			"DIV", "DIVA", "POR", "MOD", "MODA", "IGU", "IGUT", "IGUA", "DIF", "DIFT", 
			"DIFA", "ME", "MET", "MEA", "MEI", "MEIT", "MEIA", "MA", "MAT", "MAA", 
			"MAI", "MAIT", "MAIA", "ELG", "ELGT", "OLG", "OLGT", "NAO", "NAOT", "DOT", 
			"ID", "INT", "DEC", "HEX", "CHAR", "STRING", "COMENTARIO", "COMENTARIO_LINHA", 
			"WS"
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
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				inst();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VA) | (1L << TROC) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP) | (1L << PI) | (1L << VER) | (1L << FAL) | (1L << F_VABS) | (1L << F_RAIQ) | (1L << F_RAIC) | (1L << F_RAIZ) | (1L << F_POTE) | (1L << F_HIPO) | (1L << F_CHAO) | (1L << F_TETO) | (1L << F_ARRE) | (1L << F_MINI) | (1L << F_MAXI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (F_NUMA - 64)) | (1L << (F_SEME - 64)) | (1L << (F_SENO - 64)) | (1L << (F_COSS - 64)) | (1L << (F_TANG - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_SENH - 64)) | (1L << (F_COSH - 64)) | (1L << (F_TANH - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_RAGR - 64)) | (1L << (ADI - 64)) | (1L << (ADIA - 64)) | (1L << (SUB - 64)) | (1L << (SUBA - 64)) | (1L << (NAO - 64)) | (1L << (NAOT - 64)) | (1L << (ID - 64)) | (1L << (INT - 64)) | (1L << (DEC - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0) );
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				ains();
				setState(68);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				se();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				repetir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				movimentar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				trocarCor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				girar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				engrossar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				desengrossar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				trocarGrossura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				escrever();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				ler();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(83);
				atribuir();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(84);
				abaixar();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(85);
				levantar();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(86);
				limpar();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(87);
				expr();
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
			setState(90);
			relacao();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ELG - 109)) | (1L << (ELGT - 109)) | (1L << (OLG - 109)) | (1L << (OLGT - 109)))) != 0)) {
				{
				{
				setState(91);
				_la = _input.LA(1);
				if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ELG - 109)) | (1L << (ELGT - 109)) | (1L << (OLG - 109)) | (1L << (OLGT - 109)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(92);
				relacao();
				}
				}
				setState(97);
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
			setState(98);
			exprSimp();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (IGU - 91)) | (1L << (IGUT - 91)) | (1L << (IGUA - 91)) | (1L << (DIF - 91)) | (1L << (DIFT - 91)) | (1L << (DIFA - 91)) | (1L << (ME - 91)) | (1L << (MET - 91)) | (1L << (MEA - 91)) | (1L << (MEI - 91)) | (1L << (MEIT - 91)) | (1L << (MEIA - 91)) | (1L << (MA - 91)) | (1L << (MAT - 91)) | (1L << (MAA - 91)) | (1L << (MAI - 91)) | (1L << (MAIT - 91)) | (1L << (MAIA - 91)))) != 0)) {
				{
				setState(99);
				((RelacaoContext)_localctx).opRel = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (IGU - 91)) | (1L << (IGUT - 91)) | (1L << (IGUA - 91)) | (1L << (DIF - 91)) | (1L << (DIFT - 91)) | (1L << (DIFA - 91)) | (1L << (ME - 91)) | (1L << (MET - 91)) | (1L << (MEA - 91)) | (1L << (MEI - 91)) | (1L << (MEIT - 91)) | (1L << (MEIA - 91)) | (1L << (MA - 91)) | (1L << (MAT - 91)) | (1L << (MAA - 91)) | (1L << (MAI - 91)) | (1L << (MAIT - 91)) | (1L << (MAIA - 91)))) != 0)) ) {
					((RelacaoContext)_localctx).opRel = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(100);
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
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (ADI - 81)) | (1L << (ADIA - 81)) | (1L << (SUB - 81)) | (1L << (SUBA - 81)))) != 0)) {
				{
				setState(103);
				((ExprSimpContext)_localctx).opNeg = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (ADI - 81)) | (1L << (ADIA - 81)) | (1L << (SUB - 81)) | (1L << (SUBA - 81)))) != 0)) ) {
					((ExprSimpContext)_localctx).opNeg = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(106);
			termo();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (ADI - 81)) | (1L << (ADIA - 81)) | (1L << (SUB - 81)) | (1L << (SUBA - 81)))) != 0)) {
				{
				{
				setState(107);
				_la = _input.LA(1);
				if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (ADI - 81)) | (1L << (ADIA - 81)) | (1L << (SUB - 81)) | (1L << (SUBA - 81)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(108);
				termo();
				}
				}
				setState(113);
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
			setState(114);
			fator();
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MUL:
						{
						setState(115);
						match(MUL);
						}
						break;
					case VEZS:
						{
						setState(116);
						match(VEZS);
						}
						break;
					case DIV:
						{
						setState(117);
						match(DIV);
						}
						break;
					case DIVA:
						{
						setState(118);
						match(DIVA);
						setState(119);
						match(POR);
						}
						break;
					case MOD:
						{
						setState(120);
						match(MOD);
						}
						break;
					case MODA:
						{
						setState(121);
						match(MODA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(124);
					fator();
					}
					} 
				}
				setState(129);
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
	public static class FatorFuncaoMatematicaContext extends FatorContext {
		public FuncaoMatematicaContext funcaoMatematica() {
			return getRuleContext(FuncaoMatematicaContext.class,0);
		}
		public FatorFuncaoMatematicaContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorFuncaoMatematica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorFuncaoMatematica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorFuncaoMatematica(this);
			else return visitor.visitChildren(this);
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
	public static class FatorPiContext extends FatorContext {
		public TerminalNode PI() { return getToken(AuroraLogoParser.PI, 0); }
		public FatorPiContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorPi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorPi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorPi(this);
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAO:
			case NAOT:
				_localctx = new FatorNaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NAOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				fator();
				}
				break;
			case INT:
				_localctx = new FatorIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(INT);
				}
				break;
			case DEC:
				_localctx = new FatorDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(DEC);
				}
				break;
			case PI:
				_localctx = new FatorPiContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(PI);
				}
				break;
			case VER:
			case FAL:
			case ID:
				_localctx = new FatorIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VER:
				case FAL:
					{
					setState(135);
					bool();
					}
					break;
				case ID:
					{
					setState(136);
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
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				match(CHAR);
				}
				break;
			case STRING:
				_localctx = new FatorStringContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				match(STRING);
				}
				break;
			case F_VABS:
			case F_RAIQ:
			case F_RAIC:
			case F_RAIZ:
			case F_POTE:
			case F_HIPO:
			case F_CHAO:
			case F_TETO:
			case F_ARRE:
			case F_MINI:
			case F_MAXI:
			case F_NUMA:
			case F_SEME:
			case F_SENO:
			case F_COSS:
			case F_TANG:
			case F_ASEN:
			case F_ACOS:
			case F_ATAN:
			case F_CAPO:
			case F_SENH:
			case F_COSH:
			case F_TANH:
			case F_LOGA:
			case F_GRRA:
			case F_RAGR:
				_localctx = new FatorFuncaoMatematicaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(141);
				funcaoMatematica();
				}
				break;
			case T__0:
				_localctx = new FatorParentesesContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(142);
				match(T__0);
				setState(143);
				expr();
				setState(144);
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
			setState(148);
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
			setState(150);
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
			setState(152);
			seSe();
			setState(153);
			seSenaoSe();
			setState(154);
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
			setState(156);
			match(SE);
			setState(157);
			exprBool();
			setState(158);
			match(ENT);
			setState(159);
			match(T__2);
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				inst();
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VA) | (1L << TROC) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP) | (1L << PI) | (1L << VER) | (1L << FAL) | (1L << F_VABS) | (1L << F_RAIQ) | (1L << F_RAIC) | (1L << F_RAIZ) | (1L << F_POTE) | (1L << F_HIPO) | (1L << F_CHAO) | (1L << F_TETO) | (1L << F_ARRE) | (1L << F_MINI) | (1L << F_MAXI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (F_NUMA - 64)) | (1L << (F_SEME - 64)) | (1L << (F_SENO - 64)) | (1L << (F_COSS - 64)) | (1L << (F_TANG - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_SENH - 64)) | (1L << (F_COSH - 64)) | (1L << (F_TANH - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_RAGR - 64)) | (1L << (ADI - 64)) | (1L << (ADIA - 64)) | (1L << (SUB - 64)) | (1L << (SUBA - 64)) | (1L << (NAO - 64)) | (1L << (NAOT - 64)) | (1L << (ID - 64)) | (1L << (INT - 64)) | (1L << (DEC - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0) );
			setState(165);
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
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					seSenaoSeP();
					}
					} 
				}
				setState(172);
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
			setState(173);
			match(SEN);
			setState(174);
			match(SE);
			setState(175);
			exprBool();
			setState(176);
			match(ENT);
			setState(177);
			match(T__2);
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(178);
				inst();
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VA) | (1L << TROC) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP) | (1L << PI) | (1L << VER) | (1L << FAL) | (1L << F_VABS) | (1L << F_RAIQ) | (1L << F_RAIC) | (1L << F_RAIZ) | (1L << F_POTE) | (1L << F_HIPO) | (1L << F_CHAO) | (1L << F_TETO) | (1L << F_ARRE) | (1L << F_MINI) | (1L << F_MAXI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (F_NUMA - 64)) | (1L << (F_SEME - 64)) | (1L << (F_SENO - 64)) | (1L << (F_COSS - 64)) | (1L << (F_TANG - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_SENH - 64)) | (1L << (F_COSH - 64)) | (1L << (F_TANH - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_RAGR - 64)) | (1L << (ADI - 64)) | (1L << (ADIA - 64)) | (1L << (SUB - 64)) | (1L << (SUBA - 64)) | (1L << (NAO - 64)) | (1L << (NAOT - 64)) | (1L << (ID - 64)) | (1L << (INT - 64)) | (1L << (DEC - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0) );
			setState(183);
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
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEN) {
				{
				setState(185);
				match(SEN);
				setState(186);
				match(T__2);
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(187);
					inst();
					}
					}
					setState(190); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VA) | (1L << TROC) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP) | (1L << PI) | (1L << VER) | (1L << FAL) | (1L << F_VABS) | (1L << F_RAIQ) | (1L << F_RAIC) | (1L << F_RAIZ) | (1L << F_POTE) | (1L << F_HIPO) | (1L << F_CHAO) | (1L << F_TETO) | (1L << F_ARRE) | (1L << F_MINI) | (1L << F_MAXI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (F_NUMA - 64)) | (1L << (F_SEME - 64)) | (1L << (F_SENO - 64)) | (1L << (F_COSS - 64)) | (1L << (F_TANG - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_SENH - 64)) | (1L << (F_COSH - 64)) | (1L << (F_TANH - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_RAGR - 64)) | (1L << (ADI - 64)) | (1L << (ADIA - 64)) | (1L << (SUB - 64)) | (1L << (SUBA - 64)) | (1L << (NAO - 64)) | (1L << (NAOT - 64)) | (1L << (ID - 64)) | (1L << (INT - 64)) | (1L << (DEC - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0) );
				setState(192);
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
			setState(196);
			match(REP);
			setState(197);
			expr();
			setState(198);
			_la = _input.LA(1);
			if ( !(_la==VEZ || _la==VEZS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(199);
			match(T__2);
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				inst();
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VA) | (1L << TROC) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP) | (1L << PI) | (1L << VER) | (1L << FAL) | (1L << F_VABS) | (1L << F_RAIQ) | (1L << F_RAIC) | (1L << F_RAIZ) | (1L << F_POTE) | (1L << F_HIPO) | (1L << F_CHAO) | (1L << F_TETO) | (1L << F_ARRE) | (1L << F_MINI) | (1L << F_MAXI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (F_NUMA - 64)) | (1L << (F_SEME - 64)) | (1L << (F_SENO - 64)) | (1L << (F_COSS - 64)) | (1L << (F_TANG - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_SENH - 64)) | (1L << (F_COSH - 64)) | (1L << (F_TANH - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_RAGR - 64)) | (1L << (ADI - 64)) | (1L << (ADIA - 64)) | (1L << (SUB - 64)) | (1L << (SUBA - 64)) | (1L << (NAO - 64)) | (1L << (NAOT - 64)) | (1L << (ID - 64)) | (1L << (INT - 64)) | (1L << (DEC - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0) );
			setState(205);
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
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENQ) {
				{
				setState(207);
				match(ENQ);
				setState(208);
				exprBool();
				}
			}

			setState(211);
			match(REP);
			setState(212);
			match(T__2);
			setState(214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				inst();
				}
				}
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VA) | (1L << TROC) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP) | (1L << PI) | (1L << VER) | (1L << FAL) | (1L << F_VABS) | (1L << F_RAIQ) | (1L << F_RAIC) | (1L << F_RAIZ) | (1L << F_POTE) | (1L << F_HIPO) | (1L << F_CHAO) | (1L << F_TETO) | (1L << F_ARRE) | (1L << F_MINI) | (1L << F_MAXI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (F_NUMA - 64)) | (1L << (F_SEME - 64)) | (1L << (F_SENO - 64)) | (1L << (F_COSS - 64)) | (1L << (F_TANG - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_SENH - 64)) | (1L << (F_COSH - 64)) | (1L << (F_TANH - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_RAGR - 64)) | (1L << (ADI - 64)) | (1L << (ADIA - 64)) | (1L << (SUB - 64)) | (1L << (SUBA - 64)) | (1L << (NAO - 64)) | (1L << (NAOT - 64)) | (1L << (ID - 64)) | (1L << (INT - 64)) | (1L << (DEC - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0) );
			setState(218);
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
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new MovimentarDirecaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(VA);
				setState(221);
				match(PARA);
				setState(222);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIR) | (1L << ESQ) | (1L << CIM) | (1L << BAI))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EM) {
					{
					setState(223);
					match(EM);
					setState(224);
					expr();
					}
				}

				}
				break;
			case 2:
				_localctx = new MovimentarPontoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(VA);
				setState(228);
				match(PARA);
				setState(229);
				match(T__0);
				setState(230);
				expr();
				setState(231);
				match(T__4);
				setState(232);
				expr();
				setState(233);
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
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new TrocarCorPincelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(TROC);
				setState(238);
				match(COR);
				setState(239);
				match(PARA);
				setState(240);
				configuracaoCor();
				}
				break;
			case 2:
				_localctx = new TrocarCorFundoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(TROC);
				setState(242);
				match(COR);
				setState(243);
				match(DO);
				setState(244);
				match(FUN);
				setState(245);
				match(PARA);
				setState(246);
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
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEX:
				{
				setState(249);
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
				setState(250);
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
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PI) | (1L << VER) | (1L << FAL) | (1L << ESCURO) | (1L << CLARO) | (1L << F_VABS) | (1L << F_RAIQ) | (1L << F_RAIC) | (1L << F_RAIZ) | (1L << F_POTE) | (1L << F_HIPO) | (1L << F_CHAO) | (1L << F_TETO) | (1L << F_ARRE) | (1L << F_MINI) | (1L << F_MAXI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (F_NUMA - 64)) | (1L << (F_SEME - 64)) | (1L << (F_SENO - 64)) | (1L << (F_COSS - 64)) | (1L << (F_TANG - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_SENH - 64)) | (1L << (F_COSH - 64)) | (1L << (F_TANH - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_RAGR - 64)) | (1L << (ADI - 64)) | (1L << (ADIA - 64)) | (1L << (SUB - 64)) | (1L << (SUBA - 64)) | (1L << (NAO - 64)) | (1L << (NAOT - 64)) | (1L << (ID - 64)) | (1L << (INT - 64)) | (1L << (DEC - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
				{
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PI) | (1L << VER) | (1L << FAL) | (1L << F_VABS) | (1L << F_RAIQ) | (1L << F_RAIC) | (1L << F_RAIZ) | (1L << F_POTE) | (1L << F_HIPO) | (1L << F_CHAO) | (1L << F_TETO) | (1L << F_ARRE) | (1L << F_MINI) | (1L << F_MAXI))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (F_NUMA - 64)) | (1L << (F_SEME - 64)) | (1L << (F_SENO - 64)) | (1L << (F_COSS - 64)) | (1L << (F_TANG - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_SENH - 64)) | (1L << (F_COSH - 64)) | (1L << (F_TANH - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_RAGR - 64)) | (1L << (ADI - 64)) | (1L << (ADIA - 64)) | (1L << (SUB - 64)) | (1L << (SUBA - 64)) | (1L << (NAO - 64)) | (1L << (NAOT - 64)) | (1L << (ID - 64)) | (1L << (INT - 64)) | (1L << (DEC - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(253);
					expr();
					setState(254);
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

				setState(258);
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
		public TerminalNode GRA() { return getToken(AuroraLogoParser.GRA, 0); }
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
			setState(261);
			match(GIR);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(262);
				match(EM);
				setState(263);
				expr();
				setState(264);
				match(GRA);
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
			setState(268);
			match(ENG);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(269);
				match(EM);
				setState(270);
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
			setState(273);
			match(DES);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(274);
				match(EM);
				setState(275);
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
			setState(278);
			match(TROC);
			setState(279);
			match(GROS);
			setState(280);
			match(PARA);
			setState(281);
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
			setState(283);
			match(ESC);
			setState(284);
			expr();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NA) {
				{
				setState(285);
				match(NA);
				setState(286);
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
			setState(289);
			match(LER);
			setState(290);
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
			setState(292);
			match(ID);
			setState(293);
			_la = _input.LA(1);
			if ( !(_la==ATR || _la==ATRA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(294);
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
			setState(296);
			match(ABA);
			setState(297);
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
			setState(299);
			match(LEV);
			setState(300);
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
			setState(302);
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

	public static class FuncaoMatematicaContext extends ParserRuleContext {
		public FuncaoMatematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoMatematica; }
	 
		public FuncaoMatematicaContext() { }
		public void copyFrom(FuncaoMatematicaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncaoRadianosParaGrausContext extends FuncaoMatematicaContext {
		public TerminalNode F_RAGR() { return getToken(AuroraLogoParser.F_RAGR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoRadianosParaGrausContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoRadianosParaGraus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoRadianosParaGraus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoRadianosParaGraus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoHipotenusaContext extends FuncaoMatematicaContext {
		public TerminalNode F_HIPO() { return getToken(AuroraLogoParser.F_HIPO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncaoHipotenusaContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoHipotenusa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoHipotenusa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoHipotenusa(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoArcoCossenoContext extends FuncaoMatematicaContext {
		public TerminalNode F_ACOS() { return getToken(AuroraLogoParser.F_ACOS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoArcoCossenoContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoArcoCosseno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoArcoCosseno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoArcoCosseno(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoArcoSenoContext extends FuncaoMatematicaContext {
		public TerminalNode F_ASEN() { return getToken(AuroraLogoParser.F_ASEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoArcoSenoContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoArcoSeno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoArcoSeno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoArcoSeno(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoMinimoContext extends FuncaoMatematicaContext {
		public TerminalNode F_MINI() { return getToken(AuroraLogoParser.F_MINI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncaoMinimoContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoMinimo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoMinimo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoMinimo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoDefinirSementeAleatoriaContext extends FuncaoMatematicaContext {
		public TerminalNode F_SEME() { return getToken(AuroraLogoParser.F_SEME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoDefinirSementeAleatoriaContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDefinirSementeAleatoria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDefinirSementeAleatoria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDefinirSementeAleatoria(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoMaximoContext extends FuncaoMatematicaContext {
		public TerminalNode F_MAXI() { return getToken(AuroraLogoParser.F_MAXI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncaoMaximoContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoMaximo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoMaximo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoMaximo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoArcoTangenteContext extends FuncaoMatematicaContext {
		public TerminalNode F_ATAN() { return getToken(AuroraLogoParser.F_ATAN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoArcoTangenteContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoArcoTangente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoArcoTangente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoArcoTangente(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoCossenoContext extends FuncaoMatematicaContext {
		public TerminalNode F_COSS() { return getToken(AuroraLogoParser.F_COSS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoCossenoContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoCosseno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoCosseno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoCosseno(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoPotenciaContext extends FuncaoMatematicaContext {
		public TerminalNode F_POTE() { return getToken(AuroraLogoParser.F_POTE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncaoPotenciaContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoPotencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoPotencia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoTetoContext extends FuncaoMatematicaContext {
		public TerminalNode F_TETO() { return getToken(AuroraLogoParser.F_TETO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoTetoContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoTeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoTeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoTeto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoRaizQuadradaContext extends FuncaoMatematicaContext {
		public TerminalNode F_RAIQ() { return getToken(AuroraLogoParser.F_RAIQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoRaizQuadradaContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoRaizQuadrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoRaizQuadrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoRaizQuadrada(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoTangenteContext extends FuncaoMatematicaContext {
		public TerminalNode F_TANG() { return getToken(AuroraLogoParser.F_TANG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoTangenteContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoTangente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoTangente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoTangente(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoTangenteHiperbolicaContext extends FuncaoMatematicaContext {
		public TerminalNode F_TANH() { return getToken(AuroraLogoParser.F_TANH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoTangenteHiperbolicaContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoTangenteHiperbolica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoTangenteHiperbolica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoTangenteHiperbolica(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoCossenoHiperbolicoContext extends FuncaoMatematicaContext {
		public TerminalNode F_COSH() { return getToken(AuroraLogoParser.F_COSH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoCossenoHiperbolicoContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoCossenoHiperbolico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoCossenoHiperbolico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoCossenoHiperbolico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoSenoHiperbolicoContext extends FuncaoMatematicaContext {
		public TerminalNode F_SENH() { return getToken(AuroraLogoParser.F_SENH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoSenoHiperbolicoContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoSenoHiperbolico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoSenoHiperbolico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoSenoHiperbolico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoLogaritmoContext extends FuncaoMatematicaContext {
		public TerminalNode F_LOGA() { return getToken(AuroraLogoParser.F_LOGA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncaoLogaritmoContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoLogaritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoLogaritmo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoLogaritmo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoArredondarContext extends FuncaoMatematicaContext {
		public TerminalNode F_ARRE() { return getToken(AuroraLogoParser.F_ARRE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncaoArredondarContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoArredondar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoArredondar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoArredondar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoRaizContext extends FuncaoMatematicaContext {
		public TerminalNode F_RAIZ() { return getToken(AuroraLogoParser.F_RAIZ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncaoRaizContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoRaiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoRaiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoRaiz(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoAbsolutoContext extends FuncaoMatematicaContext {
		public TerminalNode F_VABS() { return getToken(AuroraLogoParser.F_VABS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoAbsolutoContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoAbsoluto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoAbsoluto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoAbsoluto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoChaoContext extends FuncaoMatematicaContext {
		public TerminalNode F_CHAO() { return getToken(AuroraLogoParser.F_CHAO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoChaoContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoChao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoChao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoChao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoCartesianoParaPolarContext extends FuncaoMatematicaContext {
		public TerminalNode F_CAPO() { return getToken(AuroraLogoParser.F_CAPO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncaoCartesianoParaPolarContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoCartesianoParaPolar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoCartesianoParaPolar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoCartesianoParaPolar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoGrausParaRadianosContext extends FuncaoMatematicaContext {
		public TerminalNode F_GRRA() { return getToken(AuroraLogoParser.F_GRRA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoGrausParaRadianosContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoGrausParaRadianos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoGrausParaRadianos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoGrausParaRadianos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoNumeroAleatorioContext extends FuncaoMatematicaContext {
		public TerminalNode F_NUMA() { return getToken(AuroraLogoParser.F_NUMA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncaoNumeroAleatorioContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoNumeroAleatorio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoNumeroAleatorio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoNumeroAleatorio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoSenoContext extends FuncaoMatematicaContext {
		public TerminalNode F_SENO() { return getToken(AuroraLogoParser.F_SENO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoSenoContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoSeno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoSeno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoSeno(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoRaizCubicaContext extends FuncaoMatematicaContext {
		public TerminalNode F_RAIC() { return getToken(AuroraLogoParser.F_RAIC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoRaizCubicaContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoRaizCubica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoRaizCubica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoRaizCubica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoMatematicaContext funcaoMatematica() throws RecognitionException {
		FuncaoMatematicaContext _localctx = new FuncaoMatematicaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_funcaoMatematica);
		try {
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F_VABS:
				_localctx = new FuncaoAbsolutoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(F_VABS);
				setState(305);
				match(T__0);
				setState(306);
				expr();
				setState(307);
				match(T__1);
				}
				break;
			case F_RAIQ:
				_localctx = new FuncaoRaizQuadradaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(F_RAIQ);
				setState(310);
				match(T__0);
				setState(311);
				expr();
				setState(312);
				match(T__1);
				}
				break;
			case F_RAIC:
				_localctx = new FuncaoRaizCubicaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(F_RAIC);
				setState(315);
				match(T__0);
				setState(316);
				expr();
				setState(317);
				match(T__1);
				}
				break;
			case F_RAIZ:
				_localctx = new FuncaoRaizContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(F_RAIZ);
				setState(320);
				match(T__0);
				setState(321);
				expr();
				setState(322);
				match(T__4);
				setState(323);
				expr();
				setState(324);
				match(T__1);
				}
				break;
			case F_POTE:
				_localctx = new FuncaoPotenciaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				match(F_POTE);
				setState(327);
				match(T__0);
				setState(328);
				expr();
				setState(329);
				match(T__4);
				setState(330);
				expr();
				setState(331);
				match(T__1);
				}
				break;
			case F_HIPO:
				_localctx = new FuncaoHipotenusaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(333);
				match(F_HIPO);
				setState(334);
				match(T__0);
				setState(335);
				expr();
				setState(336);
				match(T__4);
				setState(337);
				expr();
				setState(338);
				match(T__1);
				}
				break;
			case F_CHAO:
				_localctx = new FuncaoChaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(340);
				match(F_CHAO);
				setState(341);
				match(T__0);
				setState(342);
				expr();
				setState(343);
				match(T__1);
				}
				break;
			case F_TETO:
				_localctx = new FuncaoTetoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(345);
				match(F_TETO);
				setState(346);
				match(T__0);
				setState(347);
				expr();
				setState(348);
				match(T__1);
				}
				break;
			case F_ARRE:
				_localctx = new FuncaoArredondarContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(350);
				match(F_ARRE);
				setState(351);
				match(T__0);
				setState(357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(352);
					expr();
					}
					break;
				case 2:
					{
					setState(353);
					expr();
					setState(354);
					match(T__4);
					setState(355);
					expr();
					}
					break;
				}
				setState(359);
				match(T__1);
				}
				break;
			case F_MINI:
				_localctx = new FuncaoMinimoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(361);
				match(F_MINI);
				setState(362);
				match(T__0);
				setState(363);
				expr();
				setState(364);
				match(T__4);
				setState(365);
				expr();
				setState(366);
				match(T__1);
				}
				break;
			case F_MAXI:
				_localctx = new FuncaoMaximoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(368);
				match(F_MAXI);
				setState(369);
				match(T__0);
				setState(370);
				expr();
				setState(371);
				match(T__4);
				setState(372);
				expr();
				setState(373);
				match(T__1);
				}
				break;
			case F_NUMA:
				_localctx = new FuncaoNumeroAleatorioContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(375);
				match(F_NUMA);
				setState(376);
				match(T__0);
				setState(382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(377);
					expr();
					}
					break;
				case 2:
					{
					setState(378);
					expr();
					setState(379);
					match(T__4);
					setState(380);
					expr();
					}
					break;
				}
				setState(384);
				match(T__1);
				}
				break;
			case F_SEME:
				_localctx = new FuncaoDefinirSementeAleatoriaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(385);
				match(F_SEME);
				setState(386);
				match(T__0);
				setState(387);
				expr();
				setState(388);
				match(T__1);
				}
				break;
			case F_SENO:
				_localctx = new FuncaoSenoContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(390);
				match(F_SENO);
				setState(391);
				match(T__0);
				setState(392);
				expr();
				setState(393);
				match(T__1);
				}
				break;
			case F_COSS:
				_localctx = new FuncaoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(395);
				match(F_COSS);
				setState(396);
				match(T__0);
				setState(397);
				expr();
				setState(398);
				match(T__1);
				}
				break;
			case F_TANG:
				_localctx = new FuncaoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(400);
				match(F_TANG);
				setState(401);
				match(T__0);
				setState(402);
				expr();
				setState(403);
				match(T__1);
				}
				break;
			case F_ASEN:
				_localctx = new FuncaoArcoSenoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(405);
				match(F_ASEN);
				setState(406);
				match(T__0);
				setState(407);
				expr();
				setState(408);
				match(T__1);
				}
				break;
			case F_ACOS:
				_localctx = new FuncaoArcoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(410);
				match(F_ACOS);
				setState(411);
				match(T__0);
				setState(412);
				expr();
				setState(413);
				match(T__1);
				}
				break;
			case F_ATAN:
				_localctx = new FuncaoArcoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(415);
				match(F_ATAN);
				setState(416);
				match(T__0);
				setState(417);
				expr();
				setState(418);
				match(T__1);
				}
				break;
			case F_CAPO:
				_localctx = new FuncaoCartesianoParaPolarContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(420);
				match(F_CAPO);
				setState(421);
				match(T__0);
				setState(422);
				expr();
				setState(423);
				match(T__4);
				setState(424);
				expr();
				setState(425);
				match(T__1);
				}
				break;
			case F_SENH:
				_localctx = new FuncaoSenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(427);
				match(F_SENH);
				setState(428);
				match(T__0);
				setState(429);
				expr();
				setState(430);
				match(T__1);
				}
				break;
			case F_COSH:
				_localctx = new FuncaoCossenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(432);
				match(F_COSH);
				setState(433);
				match(T__0);
				setState(434);
				expr();
				setState(435);
				match(T__1);
				}
				break;
			case F_TANH:
				_localctx = new FuncaoTangenteHiperbolicaContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(437);
				match(F_TANH);
				setState(438);
				match(T__0);
				setState(439);
				expr();
				setState(440);
				match(T__1);
				}
				break;
			case F_LOGA:
				_localctx = new FuncaoLogaritmoContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(442);
				match(F_LOGA);
				setState(443);
				match(T__0);
				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(444);
					expr();
					}
					break;
				case 2:
					{
					setState(445);
					expr();
					setState(446);
					match(T__4);
					setState(447);
					expr();
					}
					break;
				}
				setState(451);
				match(T__1);
				}
				break;
			case F_GRRA:
				_localctx = new FuncaoGrausParaRadianosContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(453);
				match(F_GRRA);
				setState(454);
				match(T__0);
				setState(455);
				expr();
				setState(456);
				match(T__1);
				}
				break;
			case F_RAGR:
				_localctx = new FuncaoRadianosParaGrausContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(458);
				match(F_RAGR);
				setState(459);
				match(T__0);
				setState(460);
				expr();
				setState(461);
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

	public static final String _serializedATN =
		"\u0004\u0001|\u01d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0004\u0000@\b\u0000\u000b\u0000\f\u0000A\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001J\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002Y\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003^\b\u0003\n\u0003\f\u0003a\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004f\b\u0004\u0001\u0005\u0003\u0005i\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005n\b\u0005\n\u0005\f\u0005"+
		"q\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006{\b\u0006\u0001\u0006"+
		"\u0005\u0006~\b\u0006\n\u0006\f\u0006\u0081\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u008a\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0093\b\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00a2\b\u000b\u000b\u000b"+
		"\f\u000b\u00a3\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u00a9\b\f\n\f\f"+
		"\f\u00ac\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00b4"+
		"\b\r\u000b\r\f\r\u00b5\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0004\u000e\u00bd\b\u000e\u000b\u000e\f\u000e\u00be\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00c3\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u00ca\b\u000f\u000b\u000f\f\u000f\u00cb"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00d2\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00d7\b\u0010\u000b\u0010"+
		"\f\u0010\u00d8\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00e2\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00ec\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00f8\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u00fc\b"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0101\b\u0013\u0001"+
		"\u0013\u0003\u0013\u0104\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u010b\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0110\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0115\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0120"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0166\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u017f\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01c2"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01d0\b\u001e\u0001\u001e\u0000\u0000\u001f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<\u0000\n\u0001\u0000mp\u0001\u0000[l\u0001\u0000QT\u0001"+
		"\u0000qr\u0001\u0000&\'\u0001\u0000!\"\u0001\u0000\t\f\u0001\u0000(2\u0001"+
		"\u000034\u0001\u0000OP\u0204\u0000?\u0001\u0000\u0000\u0000\u0002I\u0001"+
		"\u0000\u0000\u0000\u0004X\u0001\u0000\u0000\u0000\u0006Z\u0001\u0000\u0000"+
		"\u0000\bb\u0001\u0000\u0000\u0000\nh\u0001\u0000\u0000\u0000\fr\u0001"+
		"\u0000\u0000\u0000\u000e\u0092\u0001\u0000\u0000\u0000\u0010\u0094\u0001"+
		"\u0000\u0000\u0000\u0012\u0096\u0001\u0000\u0000\u0000\u0014\u0098\u0001"+
		"\u0000\u0000\u0000\u0016\u009c\u0001\u0000\u0000\u0000\u0018\u00aa\u0001"+
		"\u0000\u0000\u0000\u001a\u00ad\u0001\u0000\u0000\u0000\u001c\u00c2\u0001"+
		"\u0000\u0000\u0000\u001e\u00c4\u0001\u0000\u0000\u0000 \u00d1\u0001\u0000"+
		"\u0000\u0000\"\u00eb\u0001\u0000\u0000\u0000$\u00f7\u0001\u0000\u0000"+
		"\u0000&\u00fb\u0001\u0000\u0000\u0000(\u0105\u0001\u0000\u0000\u0000*"+
		"\u010c\u0001\u0000\u0000\u0000,\u0111\u0001\u0000\u0000\u0000.\u0116\u0001"+
		"\u0000\u0000\u00000\u011b\u0001\u0000\u0000\u00002\u0121\u0001\u0000\u0000"+
		"\u00004\u0124\u0001\u0000\u0000\u00006\u0128\u0001\u0000\u0000\u00008"+
		"\u012b\u0001\u0000\u0000\u0000:\u012e\u0001\u0000\u0000\u0000<\u01cf\u0001"+
		"\u0000\u0000\u0000>@\u0003\u0002\u0001\u0000?>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000B\u0001\u0001\u0000\u0000\u0000CD\u0003\u0004\u0002\u0000DE\u0005"+
		"s\u0000\u0000EJ\u0001\u0000\u0000\u0000FJ\u0003\u0014\n\u0000GJ\u0003"+
		"\u001e\u000f\u0000HJ\u0003 \u0010\u0000IC\u0001\u0000\u0000\u0000IF\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000"+
		"J\u0003\u0001\u0000\u0000\u0000KY\u0003\"\u0011\u0000LY\u0003$\u0012\u0000"+
		"MY\u0003(\u0014\u0000NY\u0003*\u0015\u0000OY\u0003,\u0016\u0000PY\u0003"+
		".\u0017\u0000QY\u00030\u0018\u0000RY\u00032\u0019\u0000SY\u00034\u001a"+
		"\u0000TY\u00036\u001b\u0000UY\u00038\u001c\u0000VY\u0003:\u001d\u0000"+
		"WY\u0003\u0006\u0003\u0000XK\u0001\u0000\u0000\u0000XL\u0001\u0000\u0000"+
		"\u0000XM\u0001\u0000\u0000\u0000XN\u0001\u0000\u0000\u0000XO\u0001\u0000"+
		"\u0000\u0000XP\u0001\u0000\u0000\u0000XQ\u0001\u0000\u0000\u0000XR\u0001"+
		"\u0000\u0000\u0000XS\u0001\u0000\u0000\u0000XT\u0001\u0000\u0000\u0000"+
		"XU\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000"+
		"\u0000Y\u0005\u0001\u0000\u0000\u0000Z_\u0003\b\u0004\u0000[\\\u0007\u0000"+
		"\u0000\u0000\\^\u0003\b\u0004\u0000][\u0001\u0000\u0000\u0000^a\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`\u0007\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000be\u0003\n\u0005"+
		"\u0000cd\u0007\u0001\u0000\u0000df\u0003\n\u0005\u0000ec\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000f\t\u0001\u0000\u0000\u0000gi\u0007\u0002"+
		"\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jo\u0003\f\u0006\u0000kl\u0007\u0002\u0000\u0000ln\u0003"+
		"\f\u0006\u0000mk\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u000b\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000r\u007f\u0003\u000e\u0007\u0000s{\u0005"+
		"U\u0000\u0000t{\u0005\"\u0000\u0000u{\u0005V\u0000\u0000vw\u0005W\u0000"+
		"\u0000w{\u0005X\u0000\u0000x{\u0005Y\u0000\u0000y{\u0005Z\u0000\u0000"+
		"zs\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000\u0000zu\u0001\u0000\u0000"+
		"\u0000zv\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0003\u000e\u0007\u0000}z\u0001"+
		"\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\r\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0007\u0003\u0000\u0000"+
		"\u0083\u0093\u0003\u000e\u0007\u0000\u0084\u0093\u0005u\u0000\u0000\u0085"+
		"\u0093\u0005v\u0000\u0000\u0086\u0093\u0005%\u0000\u0000\u0087\u008a\u0003"+
		"\u0012\t\u0000\u0088\u008a\u0005t\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u0093\u0001\u0000"+
		"\u0000\u0000\u008b\u0093\u0005x\u0000\u0000\u008c\u0093\u0005y\u0000\u0000"+
		"\u008d\u0093\u0003<\u001e\u0000\u008e\u008f\u0005\u0001\u0000\u0000\u008f"+
		"\u0090\u0003\u0006\u0003\u0000\u0090\u0091\u0005\u0002\u0000\u0000\u0091"+
		"\u0093\u0001\u0000\u0000\u0000\u0092\u0082\u0001\u0000\u0000\u0000\u0092"+
		"\u0084\u0001\u0000\u0000\u0000\u0092\u0085\u0001\u0000\u0000\u0000\u0092"+
		"\u0086\u0001\u0000\u0000\u0000\u0092\u0089\u0001\u0000\u0000\u0000\u0092"+
		"\u008b\u0001\u0000\u0000\u0000\u0092\u008c\u0001\u0000\u0000\u0000\u0092"+
		"\u008d\u0001\u0000\u0000\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0093"+
		"\u000f\u0001\u0000\u0000\u0000\u0094\u0095\u0003\u0006\u0003\u0000\u0095"+
		"\u0011\u0001\u0000\u0000\u0000\u0096\u0097\u0007\u0004\u0000\u0000\u0097"+
		"\u0013\u0001\u0000\u0000\u0000\u0098\u0099\u0003\u0016\u000b\u0000\u0099"+
		"\u009a\u0003\u0018\f\u0000\u009a\u009b\u0003\u001c\u000e\u0000\u009b\u0015"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u001c\u0000\u0000\u009d\u009e"+
		"\u0003\u0010\b\u0000\u009e\u009f\u0005\u001d\u0000\u0000\u009f\u00a1\u0005"+
		"\u0003\u0000\u0000\u00a0\u00a2\u0003\u0002\u0001\u0000\u00a1\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005\u0004\u0000\u0000\u00a6\u0017\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a9\u0003\u001a\r\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u0019\u0001\u0000"+
		"\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u001e"+
		"\u0000\u0000\u00ae\u00af\u0005\u001c\u0000\u0000\u00af\u00b0\u0003\u0010"+
		"\b\u0000\u00b0\u00b1\u0005\u001d\u0000\u0000\u00b1\u00b3\u0005\u0003\u0000"+
		"\u0000\u00b2\u00b4\u0003\u0002\u0001\u0000\u00b3\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0005\u0004\u0000\u0000\u00b8\u001b\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005\u001e\u0000\u0000\u00ba\u00bc\u0005\u0003\u0000"+
		"\u0000\u00bb\u00bd\u0003\u0002\u0001\u0000\u00bc\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005\u0004\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c2\u00b9\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c3\u001d\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005 \u0000\u0000"+
		"\u00c5\u00c6\u0003\u0006\u0003\u0000\u00c6\u00c7\u0007\u0005\u0000\u0000"+
		"\u00c7\u00c9\u0005\u0003\u0000\u0000\u00c8\u00ca\u0003\u0002\u0001\u0000"+
		"\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0004\u0000\u0000"+
		"\u00ce\u001f\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u001f\u0000\u0000"+
		"\u00d0\u00d2\u0003\u0010\b\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0005 \u0000\u0000\u00d4\u00d6\u0005\u0003\u0000\u0000\u00d5\u00d7"+
		"\u0003\u0002\u0001\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0005\u0004\u0000\u0000\u00db!\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005"+
		"\u0006\u0000\u0000\u00dd\u00de\u0005\u0007\u0000\u0000\u00de\u00e1\u0007"+
		"\u0006\u0000\u0000\u00df\u00e0\u0005\b\u0000\u0000\u00e0\u00e2\u0003\u0006"+
		"\u0003\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00ec\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0006"+
		"\u0000\u0000\u00e4\u00e5\u0005\u0007\u0000\u0000\u00e5\u00e6\u0005\u0001"+
		"\u0000\u0000\u00e6\u00e7\u0003\u0006\u0003\u0000\u00e7\u00e8\u0005\u0005"+
		"\u0000\u0000\u00e8\u00e9\u0003\u0006\u0003\u0000\u00e9\u00ea\u0005\u0002"+
		"\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00dc\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e3\u0001\u0000\u0000\u0000\u00ec#\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0005\r\u0000\u0000\u00ee\u00ef\u0005\u000e\u0000\u0000"+
		"\u00ef\u00f0\u0005\u0007\u0000\u0000\u00f0\u00f8\u0003&\u0013\u0000\u00f1"+
		"\u00f2\u0005\r\u0000\u0000\u00f2\u00f3\u0005\u000e\u0000\u0000\u00f3\u00f4"+
		"\u0005\u000f\u0000\u0000\u00f4\u00f5\u0005\u0010\u0000\u0000\u00f5\u00f6"+
		"\u0005\u0007\u0000\u0000\u00f6\u00f8\u0003&\u0013\u0000\u00f7\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f1\u0001\u0000\u0000\u0000\u00f8%\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fc\u0005w\u0000\u0000\u00fa\u00fc\u0007\u0007\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fc\u0103\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003\u0006\u0003"+
		"\u0000\u00fe\u00ff\u0007\u0005\u0000\u0000\u00ff\u0101\u0001\u0000\u0000"+
		"\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0007\b\u0000\u0000"+
		"\u0103\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\'\u0001\u0000\u0000\u0000\u0105\u010a\u0005\u0011\u0000\u0000\u0106"+
		"\u0107\u0005\b\u0000\u0000\u0107\u0108\u0003\u0006\u0003\u0000\u0108\u0109"+
		"\u0005\u0012\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0106"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b)\u0001"+
		"\u0000\u0000\u0000\u010c\u010f\u0005\u0013\u0000\u0000\u010d\u010e\u0005"+
		"\b\u0000\u0000\u010e\u0110\u0003\u0006\u0003\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110+\u0001\u0000\u0000"+
		"\u0000\u0111\u0114\u0005\u0014\u0000\u0000\u0112\u0113\u0005\b\u0000\u0000"+
		"\u0113\u0115\u0003\u0006\u0003\u0000\u0114\u0112\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0001\u0000\u0000\u0000\u0115-\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0005\r\u0000\u0000\u0117\u0118\u0005\u0015\u0000\u0000\u0118\u0119"+
		"\u0005\u0007\u0000\u0000\u0119\u011a\u0003\u0006\u0003\u0000\u011a/\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0005\u0016\u0000\u0000\u011c\u011f\u0003"+
		"\u0006\u0003\u0000\u011d\u011e\u0005#\u0000\u0000\u011e\u0120\u0005$\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000"+
		"\u0000\u01201\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u0017\u0000\u0000"+
		"\u0122\u0123\u0005t\u0000\u0000\u01233\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0005t\u0000\u0000\u0125\u0126\u0007\t\u0000\u0000\u0126\u0127\u0003"+
		"\u0006\u0003\u0000\u01275\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u0018"+
		"\u0000\u0000\u0129\u012a\u0005\u001a\u0000\u0000\u012a7\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0005\u0019\u0000\u0000\u012c\u012d\u0005\u001a\u0000"+
		"\u0000\u012d9\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u001b\u0000\u0000"+
		"\u012f;\u0001\u0000\u0000\u0000\u0130\u0131\u00055\u0000\u0000\u0131\u0132"+
		"\u0005\u0001\u0000\u0000\u0132\u0133\u0003\u0006\u0003\u0000\u0133\u0134"+
		"\u0005\u0002\u0000\u0000\u0134\u01d0\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u00056\u0000\u0000\u0136\u0137\u0005\u0001\u0000\u0000\u0137\u0138\u0003"+
		"\u0006\u0003\u0000\u0138\u0139\u0005\u0002\u0000\u0000\u0139\u01d0\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u00057\u0000\u0000\u013b\u013c\u0005\u0001"+
		"\u0000\u0000\u013c\u013d\u0003\u0006\u0003\u0000\u013d\u013e\u0005\u0002"+
		"\u0000\u0000\u013e\u01d0\u0001\u0000\u0000\u0000\u013f\u0140\u00058\u0000"+
		"\u0000\u0140\u0141\u0005\u0001\u0000\u0000\u0141\u0142\u0003\u0006\u0003"+
		"\u0000\u0142\u0143\u0005\u0005\u0000\u0000\u0143\u0144\u0003\u0006\u0003"+
		"\u0000\u0144\u0145\u0005\u0002\u0000\u0000\u0145\u01d0\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u00059\u0000\u0000\u0147\u0148\u0005\u0001\u0000\u0000"+
		"\u0148\u0149\u0003\u0006\u0003\u0000\u0149\u014a\u0005\u0005\u0000\u0000"+
		"\u014a\u014b\u0003\u0006\u0003\u0000\u014b\u014c\u0005\u0002\u0000\u0000"+
		"\u014c\u01d0\u0001\u0000\u0000\u0000\u014d\u014e\u0005:\u0000\u0000\u014e"+
		"\u014f\u0005\u0001\u0000\u0000\u014f\u0150\u0003\u0006\u0003\u0000\u0150"+
		"\u0151\u0005\u0005\u0000\u0000\u0151\u0152\u0003\u0006\u0003\u0000\u0152"+
		"\u0153\u0005\u0002\u0000\u0000\u0153\u01d0\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0005;\u0000\u0000\u0155\u0156\u0005\u0001\u0000\u0000\u0156\u0157"+
		"\u0003\u0006\u0003\u0000\u0157\u0158\u0005\u0002\u0000\u0000\u0158\u01d0"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0005<\u0000\u0000\u015a\u015b\u0005"+
		"\u0001\u0000\u0000\u015b\u015c\u0003\u0006\u0003\u0000\u015c\u015d\u0005"+
		"\u0002\u0000\u0000\u015d\u01d0\u0001\u0000\u0000\u0000\u015e\u015f\u0005"+
		"=\u0000\u0000\u015f\u0165\u0005\u0001\u0000\u0000\u0160\u0166\u0003\u0006"+
		"\u0003\u0000\u0161\u0162\u0003\u0006\u0003\u0000\u0162\u0163\u0005\u0005"+
		"\u0000\u0000\u0163\u0164\u0003\u0006\u0003\u0000\u0164\u0166\u0001\u0000"+
		"\u0000\u0000\u0165\u0160\u0001\u0000\u0000\u0000\u0165\u0161\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u0002"+
		"\u0000\u0000\u0168\u01d0\u0001\u0000\u0000\u0000\u0169\u016a\u0005>\u0000"+
		"\u0000\u016a\u016b\u0005\u0001\u0000\u0000\u016b\u016c\u0003\u0006\u0003"+
		"\u0000\u016c\u016d\u0005\u0005\u0000\u0000\u016d\u016e\u0003\u0006\u0003"+
		"\u0000\u016e\u016f\u0005\u0002\u0000\u0000\u016f\u01d0\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0005?\u0000\u0000\u0171\u0172\u0005\u0001\u0000\u0000"+
		"\u0172\u0173\u0003\u0006\u0003\u0000\u0173\u0174\u0005\u0005\u0000\u0000"+
		"\u0174\u0175\u0003\u0006\u0003\u0000\u0175\u0176\u0005\u0002\u0000\u0000"+
		"\u0176\u01d0\u0001\u0000\u0000\u0000\u0177\u0178\u0005@\u0000\u0000\u0178"+
		"\u017e\u0005\u0001\u0000\u0000\u0179\u017f\u0003\u0006\u0003\u0000\u017a"+
		"\u017b\u0003\u0006\u0003\u0000\u017b\u017c\u0005\u0005\u0000\u0000\u017c"+
		"\u017d\u0003\u0006\u0003\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e"+
		"\u0179\u0001\u0000\u0000\u0000\u017e\u017a\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180"+
		"\u01d0\u0005\u0002\u0000\u0000\u0181\u0182\u0005A\u0000\u0000\u0182\u0183"+
		"\u0005\u0001\u0000\u0000\u0183\u0184\u0003\u0006\u0003\u0000\u0184\u0185"+
		"\u0005\u0002\u0000\u0000\u0185\u01d0\u0001\u0000\u0000\u0000\u0186\u0187"+
		"\u0005B\u0000\u0000\u0187\u0188\u0005\u0001\u0000\u0000\u0188\u0189\u0003"+
		"\u0006\u0003\u0000\u0189\u018a\u0005\u0002\u0000\u0000\u018a\u01d0\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\u0005C\u0000\u0000\u018c\u018d\u0005\u0001"+
		"\u0000\u0000\u018d\u018e\u0003\u0006\u0003\u0000\u018e\u018f\u0005\u0002"+
		"\u0000\u0000\u018f\u01d0\u0001\u0000\u0000\u0000\u0190\u0191\u0005D\u0000"+
		"\u0000\u0191\u0192\u0005\u0001\u0000\u0000\u0192\u0193\u0003\u0006\u0003"+
		"\u0000\u0193\u0194\u0005\u0002\u0000\u0000\u0194\u01d0\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0005E\u0000\u0000\u0196\u0197\u0005\u0001\u0000\u0000"+
		"\u0197\u0198\u0003\u0006\u0003\u0000\u0198\u0199\u0005\u0002\u0000\u0000"+
		"\u0199\u01d0\u0001\u0000\u0000\u0000\u019a\u019b\u0005F\u0000\u0000\u019b"+
		"\u019c\u0005\u0001\u0000\u0000\u019c\u019d\u0003\u0006\u0003\u0000\u019d"+
		"\u019e\u0005\u0002\u0000\u0000\u019e\u01d0\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0005G\u0000\u0000\u01a0\u01a1\u0005\u0001\u0000\u0000\u01a1\u01a2"+
		"\u0003\u0006\u0003\u0000\u01a2\u01a3\u0005\u0002\u0000\u0000\u01a3\u01d0"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005H\u0000\u0000\u01a5\u01a6\u0005"+
		"\u0001\u0000\u0000\u01a6\u01a7\u0003\u0006\u0003\u0000\u01a7\u01a8\u0005"+
		"\u0005\u0000\u0000\u01a8\u01a9\u0003\u0006\u0003\u0000\u01a9\u01aa\u0005"+
		"\u0002\u0000\u0000\u01aa\u01d0\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005"+
		"I\u0000\u0000\u01ac\u01ad\u0005\u0001\u0000\u0000\u01ad\u01ae\u0003\u0006"+
		"\u0003\u0000\u01ae\u01af\u0005\u0002\u0000\u0000\u01af\u01d0\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0005J\u0000\u0000\u01b1\u01b2\u0005\u0001\u0000"+
		"\u0000\u01b2\u01b3\u0003\u0006\u0003\u0000\u01b3\u01b4\u0005\u0002\u0000"+
		"\u0000\u01b4\u01d0\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005K\u0000\u0000"+
		"\u01b6\u01b7\u0005\u0001\u0000\u0000\u01b7\u01b8\u0003\u0006\u0003\u0000"+
		"\u01b8\u01b9\u0005\u0002\u0000\u0000\u01b9\u01d0\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bb\u0005L\u0000\u0000\u01bb\u01c1\u0005\u0001\u0000\u0000\u01bc"+
		"\u01c2\u0003\u0006\u0003\u0000\u01bd\u01be\u0003\u0006\u0003\u0000\u01be"+
		"\u01bf\u0005\u0005\u0000\u0000\u01bf\u01c0\u0003\u0006\u0003\u0000\u01c0"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c1\u01bc\u0001\u0000\u0000\u0000\u01c1"+
		"\u01bd\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0005\u0002\u0000\u0000\u01c4\u01d0\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0005M\u0000\u0000\u01c6\u01c7\u0005\u0001\u0000\u0000\u01c7\u01c8"+
		"\u0003\u0006\u0003\u0000\u01c8\u01c9\u0005\u0002\u0000\u0000\u01c9\u01d0"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005N\u0000\u0000\u01cb\u01cc\u0005"+
		"\u0001\u0000\u0000\u01cc\u01cd\u0003\u0006\u0003\u0000\u01cd\u01ce\u0005"+
		"\u0002\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf\u0130\u0001"+
		"\u0000\u0000\u0000\u01cf\u0135\u0001\u0000\u0000\u0000\u01cf\u013a\u0001"+
		"\u0000\u0000\u0000\u01cf\u013f\u0001\u0000\u0000\u0000\u01cf\u0146\u0001"+
		"\u0000\u0000\u0000\u01cf\u014d\u0001\u0000\u0000\u0000\u01cf\u0154\u0001"+
		"\u0000\u0000\u0000\u01cf\u0159\u0001\u0000\u0000\u0000\u01cf\u015e\u0001"+
		"\u0000\u0000\u0000\u01cf\u0169\u0001\u0000\u0000\u0000\u01cf\u0170\u0001"+
		"\u0000\u0000\u0000\u01cf\u0177\u0001\u0000\u0000\u0000\u01cf\u0181\u0001"+
		"\u0000\u0000\u0000\u01cf\u0186\u0001\u0000\u0000\u0000\u01cf\u018b\u0001"+
		"\u0000\u0000\u0000\u01cf\u0190\u0001\u0000\u0000\u0000\u01cf\u0195\u0001"+
		"\u0000\u0000\u0000\u01cf\u019a\u0001\u0000\u0000\u0000\u01cf\u019f\u0001"+
		"\u0000\u0000\u0000\u01cf\u01a4\u0001\u0000\u0000\u0000\u01cf\u01ab\u0001"+
		"\u0000\u0000\u0000\u01cf\u01b0\u0001\u0000\u0000\u0000\u01cf\u01b5\u0001"+
		"\u0000\u0000\u0000\u01cf\u01ba\u0001\u0000\u0000\u0000\u01cf\u01c5\u0001"+
		"\u0000\u0000\u0000\u01cf\u01ca\u0001\u0000\u0000\u0000\u01d0=\u0001\u0000"+
		"\u0000\u0000!AIX_ehoz\u007f\u0089\u0092\u00a3\u00aa\u00b5\u00be\u00c2"+
		"\u00cb\u00d1\u00d8\u00e1\u00eb\u00f7\u00fb\u0100\u0103\u010a\u010f\u0114"+
		"\u011f\u0165\u017e\u01c1\u01cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}