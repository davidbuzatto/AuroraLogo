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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PX=7, PY=8, PA=9, ABA=10, 
		ABE=11, ATE=12, BAI=13, CAM=14, CIM=15, COD=16, COM=17, CONT=18, COR=19, 
		CUBI=20, CUR=21, DCMM=22, DE=23, DES=24, DESE=25, DIAG=26, DIR=27, DIVM=28, 
		DO=29, EM=30, ENG=31, ENQ=32, ENT=33, ESCO=34, ESC=35, ESQ=36, FAL=37, 
		FEC=38, FORM=39, FUN=40, GIR=41, GRA=42, GROS=43, INCM=44, INI=45, LER=46, 
		LEV=47, LIM=48, LIN=49, MOV=50, MULM=51, NA=52, NO=53, PADR=54, PARA=55, 
		PARR=56, PI=57, PINC=58, PIZ=59, POR=60, PREA=61, PREE=62, PREO=63, PUL=64, 
		QUAD=65, REP=66, SAI=67, SE=68, SEN=69, SOMM=70, SUBM=71, TART=72, TER=73, 
		TROC=74, USA=75, VA=76, VER=77, VEZ=78, VEZS=79, PRETO=80, AZUL=81, CIANO=82, 
		CINZA=83, VERDE=84, MAGENTA=85, LARANJA=86, ROSA=87, VERMELHO=88, BRANCO=89, 
		AMARELO=90, ESCURO=91, CLARO=92, F_ACOS=93, F_ARRE=94, F_ASEN=95, F_ATAN=96, 
		F_CAPO=97, F_CHAO=98, F_COSH=99, F_COSS=100, F_DCM=101, F_GRRA=102, F_HIPO=103, 
		F_INC=104, F_LOGA=105, F_MAXI=106, F_MINI=107, F_NUMA=108, F_POTE=109, 
		F_RAGR=110, F_RAIC=111, F_RAIQ=112, F_RAIZ=113, F_SEME=114, F_SENH=115, 
		F_SENO=116, F_TANG=117, F_TANH=118, F_TETO=119, F_VABS=120, FG_ARC=121, 
		FG_CCU=122, FG_CIC=123, FG_CQD=124, FG_ELI=125, FG_EST=126, FG_POL=127, 
		FG_POR=128, FG_QUA=129, FG_RET=130, FG_SEG=131, ATR=132, ATRA=133, AC_A=134, 
		AT_A=135, AC_S=136, AT_S=137, AC_M=138, AT_M=139, AC_D=140, AT_D=141, 
		AC_R=142, AT_R=143, ADI=144, ADIA=145, SUB=146, SUBA=147, MUL=148, DIV=149, 
		DIVA=150, MOD=151, MODA=152, IGU=153, IGUT=154, IGUA=155, DIF=156, DIFT=157, 
		DIFA=158, ME=159, MET=160, MEA=161, MEI=162, MEIT=163, MEIA=164, MA=165, 
		MAT=166, MAA=167, MAI=168, MAIT=169, MAIA=170, ELG=171, ELGT=172, OLG=173, 
		OLGT=174, NAO=175, NAOT=176, DOT=177, ID=178, INT=179, DEC=180, CHEX=181, 
		CHAR=182, STRING=183, COMENTARIO=184, COMENTARIO_LINHA=185, WS=186;
	public static final int
		RULE_prog = 0, RULE_inst = 1, RULE_ains = 2, RULE_expr = 3, RULE_relacao = 4, 
		RULE_exprSimp = 5, RULE_termo = 6, RULE_fator = 7, RULE_exprBool = 8, 
		RULE_bool = 9, RULE_se = 10, RULE_seSe = 11, RULE_seSenaoSe = 12, RULE_seSenao = 13, 
		RULE_usando = 14, RULE_escolha = 15, RULE_repetir = 16, RULE_repetirEnquanto = 17, 
		RULE_parar = 18, RULE_continuar = 19, RULE_movimentar = 20, RULE_trocarCor = 21, 
		RULE_configuracaoCor = 22, RULE_cor = 23, RULE_girar = 24, RULE_engrossar = 25, 
		RULE_desengrossar = 26, RULE_trocarGrossura = 27, RULE_escrever = 28, 
		RULE_ler = 29, RULE_atribuir = 30, RULE_abaixar = 31, RULE_levantar = 32, 
		RULE_limpar = 33, RULE_funcaoMatematica = 34, RULE_instrucaoGeometrica = 35, 
		RULE_funcaoGeometrica = 36, RULE_desenharCaminho = 37, RULE_instCaminho = 38, 
		RULE_consultarTartaruga = 39, RULE_formatarTexto = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "inst", "ains", "expr", "relacao", "exprSimp", "termo", "fator", 
			"exprBool", "bool", "se", "seSe", "seSenaoSe", "seSenao", "usando", "escolha", 
			"repetir", "repetirEnquanto", "parar", "continuar", "movimentar", "trocarCor", 
			"configuracaoCor", "cor", "girar", "engrossar", "desengrossar", "trocarGrossura", 
			"escrever", "ler", "atribuir", "abaixar", "levantar", "limpar", "funcaoMatematica", 
			"instrucaoGeometrica", "funcaoGeometrica", "desenharCaminho", "instCaminho", 
			"consultarTartaruga", "formatarTexto"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "':'", "','", "'x'", "'y'", "'\\u00E2ngulo'", 
			"'abaixar'", "'ABERTO'", "'at\\u00E9'", "'baixo'", "'caminho'", "'cima'", 
			"'CORDA'", "'com'", "'continuar'", "'cor'", "'c\\u00FAbica'", "'curva'", 
			"'decrementando'", "'de'", "'desengrossar'", "'desenhar'", "'di\\u00E1logo'", 
			"'direita'", "'dividindo'", "'do'", "'em'", "'engrossar'", "'enquanto'", 
			"'ent\\u00E3o'", "'escolha'", "'escrever'", "'esquerda'", "'FALSO'", 
			"'fechar'", "'formatarTexto'", "'fundo'", "'girar'", "'graus'", "'grossura'", 
			"'incrementando'", "'iniciar'", "'ler'", "'levantar'", "'limpar'", "'linha'", 
			"'mover'", "'multiplicando'", "'na'", "'no'", "'padr\\u00E3o'", "'para'", 
			"'parar'", "'PI'", "'pincel'", "'PIZZA'", "'por'", "'preenchida'", "'preenchimento'", 
			"'preenchido'", "'pulando'", "'quadr\\u00E1tica'", "'repetir'", "'sa\\u00EDda'", 
			"'se'", "'sen\\u00E3o'", "'somando'", "'subtraindo'", "'tartaruga'", 
			"'terminar'", "'trocar'", "'usando'", "'v\\u00E1'", "'VERDADEIRO'", "'vez'", 
			"'vezes'", "'preto'", "'azul'", "'ciano'", "'cinza'", "'verde'", "'magenta'", 
			"'laranja'", "'rosa'", "'vermelho'", "'branco'", "'amarelo'", "'escuro'", 
			"'claro'", "'arcoCosseno'", "'arredondar'", "'arcoSeno'", "'arcoTangente'", 
			"'cartesianoParaPolar'", "'ch\\u00E3o'", "'cossenoHiperb\\u00F3lico'", 
			"'cosseno'", "'decrementar'", "'grausParaRadianos'", "'hipotenusa'", 
			"'incrementar'", "'logar\\u00EDtmo'", "'m\\u00E1ximo'", "'m\\u00EDnimo'", 
			"'n\\u00FAmeroAleat\\u00F3rio'", "'pot\\u00EAncia'", "'radianosParaGraus'", 
			"'raizC\\u00FAbica'", "'raizQuadrada'", "'raiz'", "'definirSementeAleat\\u00F3ria'", 
			"'senoHiperb\\u00F3lico'", "'seno'", "'tangente'", "'tangenteHiperb\\u00F3lica'", 
			"'teto'", "'valorAbsoluto'", "'arco'", "'curvaC\\u00FAbica'", "'c\\u00EDrculo'", 
			"'curvaQuadr\\u00E1tica'", "'elipse'", "'estrela'", "'pol\\u00EDgono'", 
			"'pol\\u00EDgonoRegular'", "'quadrado'", "'ret\\u00E2ngulo'", "'segmento'", 
			"'='", "'<-'", "'+='", "'+<-'", "'-='", "'-<-'", "'*='", "'*<-'", "'/='", 
			"'/<-'", "'%='", "'%<-'", "'+'", "'mais'", "'-'", "'menos'", "'*'", "'/'", 
			"'dividido por'", "'%'", "'resto'", "'=='", "'\\u00E9 igual a'", "'n\\u00E3o \\u00E9 diferente de'", 
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
			null, null, null, null, null, null, null, "PX", "PY", "PA", "ABA", "ABE", 
			"ATE", "BAI", "CAM", "CIM", "COD", "COM", "CONT", "COR", "CUBI", "CUR", 
			"DCMM", "DE", "DES", "DESE", "DIAG", "DIR", "DIVM", "DO", "EM", "ENG", 
			"ENQ", "ENT", "ESCO", "ESC", "ESQ", "FAL", "FEC", "FORM", "FUN", "GIR", 
			"GRA", "GROS", "INCM", "INI", "LER", "LEV", "LIM", "LIN", "MOV", "MULM", 
			"NA", "NO", "PADR", "PARA", "PARR", "PI", "PINC", "PIZ", "POR", "PREA", 
			"PREE", "PREO", "PUL", "QUAD", "REP", "SAI", "SE", "SEN", "SOMM", "SUBM", 
			"TART", "TER", "TROC", "USA", "VA", "VER", "VEZ", "VEZS", "PRETO", "AZUL", 
			"CIANO", "CINZA", "VERDE", "MAGENTA", "LARANJA", "ROSA", "VERMELHO", 
			"BRANCO", "AMARELO", "ESCURO", "CLARO", "F_ACOS", "F_ARRE", "F_ASEN", 
			"F_ATAN", "F_CAPO", "F_CHAO", "F_COSH", "F_COSS", "F_DCM", "F_GRRA", 
			"F_HIPO", "F_INC", "F_LOGA", "F_MAXI", "F_MINI", "F_NUMA", "F_POTE", 
			"F_RAGR", "F_RAIC", "F_RAIQ", "F_RAIZ", "F_SEME", "F_SENH", "F_SENO", 
			"F_TANG", "F_TANH", "F_TETO", "F_VABS", "FG_ARC", "FG_CCU", "FG_CIC", 
			"FG_CQD", "FG_ELI", "FG_EST", "FG_POL", "FG_POR", "FG_QUA", "FG_RET", 
			"FG_SEG", "ATR", "ATRA", "AC_A", "AT_A", "AC_S", "AT_S", "AC_M", "AT_M", 
			"AC_D", "AT_D", "AC_R", "AT_R", "ADI", "ADIA", "SUB", "SUBA", "MUL", 
			"DIV", "DIVA", "MOD", "MODA", "IGU", "IGUT", "IGUA", "DIF", "DIFT", "DIFA", 
			"ME", "MET", "MEA", "MEI", "MEIT", "MEIA", "MA", "MAT", "MAA", "MAI", 
			"MAIT", "MAIA", "ELG", "ELGT", "OLG", "OLGT", "NAO", "NAOT", "DOT", "ID", 
			"INT", "DEC", "CHEX", "CHAR", "STRING", "COMENTARIO", "COMENTARIO_LINHA", 
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
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				inst();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (REP - 66)) | (1L << (SE - 66)) | (1L << (TART - 66)) | (1L << (TROC - 66)) | (1L << (USA - 66)) | (1L << (VA - 66)) | (1L << (VER - 66)) | (1L << (F_ACOS - 66)) | (1L << (F_ARRE - 66)) | (1L << (F_ASEN - 66)) | (1L << (F_ATAN - 66)) | (1L << (F_CAPO - 66)) | (1L << (F_CHAO - 66)) | (1L << (F_COSH - 66)) | (1L << (F_COSS - 66)) | (1L << (F_DCM - 66)) | (1L << (F_GRRA - 66)) | (1L << (F_HIPO - 66)) | (1L << (F_INC - 66)) | (1L << (F_LOGA - 66)) | (1L << (F_MAXI - 66)) | (1L << (F_MINI - 66)) | (1L << (F_NUMA - 66)) | (1L << (F_POTE - 66)) | (1L << (F_RAGR - 66)) | (1L << (F_RAIC - 66)) | (1L << (F_RAIQ - 66)) | (1L << (F_RAIZ - 66)) | (1L << (F_SEME - 66)) | (1L << (F_SENH - 66)) | (1L << (F_SENO - 66)) | (1L << (F_TANG - 66)) | (1L << (F_TANH - 66)) | (1L << (F_TETO - 66)) | (1L << (F_VABS - 66)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (ADI - 144)) | (1L << (ADIA - 144)) | (1L << (SUB - 144)) | (1L << (SUBA - 144)) | (1L << (NAO - 144)) | (1L << (NAOT - 144)) | (1L << (ID - 144)) | (1L << (INT - 144)) | (1L << (DEC - 144)) | (1L << (CHEX - 144)) | (1L << (CHAR - 144)) | (1L << (STRING - 144)))) != 0) );
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
		public UsandoContext usando() {
			return getRuleContext(UsandoContext.class,0);
		}
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public RepetirEnquantoContext repetirEnquanto() {
			return getRuleContext(RepetirEnquantoContext.class,0);
		}
		public DesenharCaminhoContext desenharCaminho() {
			return getRuleContext(DesenharCaminhoContext.class,0);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				ains();
				setState(88);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				se();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				usando();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				repetir();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				repetirEnquanto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				desenharCaminho();
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
		public InstrucaoGeometricaContext instrucaoGeometrica() {
			return getRuleContext(InstrucaoGeometricaContext.class,0);
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
		public PararContext parar() {
			return getRuleContext(PararContext.class,0);
		}
		public ContinuarContext continuar() {
			return getRuleContext(ContinuarContext.class,0);
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				movimentar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				trocarCor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				girar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				engrossar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				desengrossar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				trocarGrossura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				instrucaoGeometrica();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(104);
				escrever();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(105);
				ler();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
				atribuir();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(107);
				abaixar();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(108);
				levantar();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(109);
				limpar();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(110);
				expr();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(111);
				parar();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(112);
				continuar();
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
			setState(115);
			relacao();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (ELG - 171)) | (1L << (ELGT - 171)) | (1L << (OLG - 171)) | (1L << (OLGT - 171)))) != 0)) {
				{
				{
				setState(116);
				_la = _input.LA(1);
				if ( !(((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (ELG - 171)) | (1L << (ELGT - 171)) | (1L << (OLG - 171)) | (1L << (OLGT - 171)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(117);
				relacao();
				}
				}
				setState(122);
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
			setState(123);
			exprSimp();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (IGU - 153)) | (1L << (IGUT - 153)) | (1L << (IGUA - 153)) | (1L << (DIF - 153)) | (1L << (DIFT - 153)) | (1L << (DIFA - 153)) | (1L << (ME - 153)) | (1L << (MET - 153)) | (1L << (MEA - 153)) | (1L << (MEI - 153)) | (1L << (MEIT - 153)) | (1L << (MEIA - 153)) | (1L << (MA - 153)) | (1L << (MAT - 153)) | (1L << (MAA - 153)) | (1L << (MAI - 153)) | (1L << (MAIT - 153)) | (1L << (MAIA - 153)))) != 0)) {
				{
				setState(124);
				((RelacaoContext)_localctx).opRel = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (IGU - 153)) | (1L << (IGUT - 153)) | (1L << (IGUA - 153)) | (1L << (DIF - 153)) | (1L << (DIFT - 153)) | (1L << (DIFA - 153)) | (1L << (ME - 153)) | (1L << (MET - 153)) | (1L << (MEA - 153)) | (1L << (MEI - 153)) | (1L << (MEIT - 153)) | (1L << (MEIA - 153)) | (1L << (MA - 153)) | (1L << (MAT - 153)) | (1L << (MAA - 153)) | (1L << (MAI - 153)) | (1L << (MAIT - 153)) | (1L << (MAIA - 153)))) != 0)) ) {
					((RelacaoContext)_localctx).opRel = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (ADI - 144)) | (1L << (ADIA - 144)) | (1L << (SUB - 144)) | (1L << (SUBA - 144)))) != 0)) {
				{
				setState(128);
				((ExprSimpContext)_localctx).opNeg = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (ADI - 144)) | (1L << (ADIA - 144)) | (1L << (SUB - 144)) | (1L << (SUBA - 144)))) != 0)) ) {
					((ExprSimpContext)_localctx).opNeg = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(131);
			termo();
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					_la = _input.LA(1);
					if ( !(((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (ADI - 144)) | (1L << (ADIA - 144)) | (1L << (SUB - 144)) | (1L << (SUBA - 144)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(133);
					termo();
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			fator();
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					_la = _input.LA(1);
					if ( !(_la==VEZS || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (MUL - 148)) | (1L << (DIV - 148)) | (1L << (DIVA - 148)) | (1L << (MOD - 148)) | (1L << (MODA - 148)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(141);
					fator();
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class FatorFormatarTextoContext extends FatorContext {
		public FormatarTextoContext formatarTexto() {
			return getRuleContext(FormatarTextoContext.class,0);
		}
		public FatorFormatarTextoContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorFormatarTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorFormatarTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorFormatarTexto(this);
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
	public static class FatorConsultarTartarugaContext extends FatorContext {
		public ConsultarTartarugaContext consultarTartaruga() {
			return getRuleContext(ConsultarTartarugaContext.class,0);
		}
		public FatorConsultarTartarugaContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorConsultarTartaruga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorConsultarTartaruga(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorConsultarTartaruga(this);
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
	public static class FatorCorContext extends FatorContext {
		public CorContext cor() {
			return getRuleContext(CorContext.class,0);
		}
		public FatorCorContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorCor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorCor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorCor(this);
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
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAO:
			case NAOT:
				_localctx = new FatorNaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NAOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(148);
				fator();
				}
				break;
			case INT:
				_localctx = new FatorIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(INT);
				}
				break;
			case DEC:
				_localctx = new FatorDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(DEC);
				}
				break;
			case PI:
				_localctx = new FatorPiContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(PI);
				}
				break;
			case FAL:
			case VER:
			case ID:
				_localctx = new FatorIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FAL:
				case VER:
					{
					setState(152);
					bool();
					}
					break;
				case ID:
					{
					setState(153);
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
				setState(156);
				match(CHAR);
				}
				break;
			case STRING:
				_localctx = new FatorStringContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				match(STRING);
				}
				break;
			case CHEX:
				_localctx = new FatorCorContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(158);
				cor();
				}
				break;
			case F_ACOS:
			case F_ARRE:
			case F_ASEN:
			case F_ATAN:
			case F_CAPO:
			case F_CHAO:
			case F_COSH:
			case F_COSS:
			case F_DCM:
			case F_GRRA:
			case F_HIPO:
			case F_INC:
			case F_LOGA:
			case F_MAXI:
			case F_MINI:
			case F_NUMA:
			case F_POTE:
			case F_RAGR:
			case F_RAIC:
			case F_RAIQ:
			case F_RAIZ:
			case F_SEME:
			case F_SENH:
			case F_SENO:
			case F_TANG:
			case F_TANH:
			case F_TETO:
			case F_VABS:
				_localctx = new FatorFuncaoMatematicaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(159);
				funcaoMatematica();
				}
				break;
			case TART:
				_localctx = new FatorConsultarTartarugaContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(160);
				consultarTartaruga();
				}
				break;
			case FORM:
				_localctx = new FatorFormatarTextoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(161);
				formatarTexto();
				}
				break;
			case T__0:
				_localctx = new FatorParentesesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(162);
				match(T__0);
				setState(163);
				expr();
				setState(164);
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
			setState(168);
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
			setState(170);
			_la = _input.LA(1);
			if ( !(_la==FAL || _la==VER) ) {
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
		public List<SeSenaoSeContext> seSenaoSe() {
			return getRuleContexts(SeSenaoSeContext.class);
		}
		public SeSenaoSeContext seSenaoSe(int i) {
			return getRuleContext(SeSenaoSeContext.class,i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			seSe();
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					seSenaoSe();
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEN) {
				{
				setState(179);
				seSenao();
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
			setState(182);
			match(SE);
			setState(183);
			exprBool();
			setState(184);
			match(ENT);
			setState(185);
			match(T__2);
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				inst();
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (REP - 66)) | (1L << (SE - 66)) | (1L << (TART - 66)) | (1L << (TROC - 66)) | (1L << (USA - 66)) | (1L << (VA - 66)) | (1L << (VER - 66)) | (1L << (F_ACOS - 66)) | (1L << (F_ARRE - 66)) | (1L << (F_ASEN - 66)) | (1L << (F_ATAN - 66)) | (1L << (F_CAPO - 66)) | (1L << (F_CHAO - 66)) | (1L << (F_COSH - 66)) | (1L << (F_COSS - 66)) | (1L << (F_DCM - 66)) | (1L << (F_GRRA - 66)) | (1L << (F_HIPO - 66)) | (1L << (F_INC - 66)) | (1L << (F_LOGA - 66)) | (1L << (F_MAXI - 66)) | (1L << (F_MINI - 66)) | (1L << (F_NUMA - 66)) | (1L << (F_POTE - 66)) | (1L << (F_RAGR - 66)) | (1L << (F_RAIC - 66)) | (1L << (F_RAIQ - 66)) | (1L << (F_RAIZ - 66)) | (1L << (F_SEME - 66)) | (1L << (F_SENH - 66)) | (1L << (F_SENO - 66)) | (1L << (F_TANG - 66)) | (1L << (F_TANH - 66)) | (1L << (F_TETO - 66)) | (1L << (F_VABS - 66)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (ADI - 144)) | (1L << (ADIA - 144)) | (1L << (SUB - 144)) | (1L << (SUBA - 144)) | (1L << (NAO - 144)) | (1L << (NAOT - 144)) | (1L << (ID - 144)) | (1L << (INT - 144)) | (1L << (DEC - 144)) | (1L << (CHEX - 144)) | (1L << (CHAR - 144)) | (1L << (STRING - 144)))) != 0) );
			setState(191);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(SEN);
			setState(194);
			match(SE);
			setState(195);
			exprBool();
			setState(196);
			match(ENT);
			setState(197);
			match(T__2);
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				inst();
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (REP - 66)) | (1L << (SE - 66)) | (1L << (TART - 66)) | (1L << (TROC - 66)) | (1L << (USA - 66)) | (1L << (VA - 66)) | (1L << (VER - 66)) | (1L << (F_ACOS - 66)) | (1L << (F_ARRE - 66)) | (1L << (F_ASEN - 66)) | (1L << (F_ATAN - 66)) | (1L << (F_CAPO - 66)) | (1L << (F_CHAO - 66)) | (1L << (F_COSH - 66)) | (1L << (F_COSS - 66)) | (1L << (F_DCM - 66)) | (1L << (F_GRRA - 66)) | (1L << (F_HIPO - 66)) | (1L << (F_INC - 66)) | (1L << (F_LOGA - 66)) | (1L << (F_MAXI - 66)) | (1L << (F_MINI - 66)) | (1L << (F_NUMA - 66)) | (1L << (F_POTE - 66)) | (1L << (F_RAGR - 66)) | (1L << (F_RAIC - 66)) | (1L << (F_RAIQ - 66)) | (1L << (F_RAIZ - 66)) | (1L << (F_SEME - 66)) | (1L << (F_SENH - 66)) | (1L << (F_SENO - 66)) | (1L << (F_TANG - 66)) | (1L << (F_TANH - 66)) | (1L << (F_TETO - 66)) | (1L << (F_VABS - 66)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (ADI - 144)) | (1L << (ADIA - 144)) | (1L << (SUB - 144)) | (1L << (SUBA - 144)) | (1L << (NAO - 144)) | (1L << (NAOT - 144)) | (1L << (ID - 144)) | (1L << (INT - 144)) | (1L << (DEC - 144)) | (1L << (CHEX - 144)) | (1L << (CHAR - 144)) | (1L << (STRING - 144)))) != 0) );
			setState(203);
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
		enterRule(_localctx, 26, RULE_seSenao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(SEN);
			setState(206);
			match(T__2);
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207);
				inst();
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (REP - 66)) | (1L << (SE - 66)) | (1L << (TART - 66)) | (1L << (TROC - 66)) | (1L << (USA - 66)) | (1L << (VA - 66)) | (1L << (VER - 66)) | (1L << (F_ACOS - 66)) | (1L << (F_ARRE - 66)) | (1L << (F_ASEN - 66)) | (1L << (F_ATAN - 66)) | (1L << (F_CAPO - 66)) | (1L << (F_CHAO - 66)) | (1L << (F_COSH - 66)) | (1L << (F_COSS - 66)) | (1L << (F_DCM - 66)) | (1L << (F_GRRA - 66)) | (1L << (F_HIPO - 66)) | (1L << (F_INC - 66)) | (1L << (F_LOGA - 66)) | (1L << (F_MAXI - 66)) | (1L << (F_MINI - 66)) | (1L << (F_NUMA - 66)) | (1L << (F_POTE - 66)) | (1L << (F_RAGR - 66)) | (1L << (F_RAIC - 66)) | (1L << (F_RAIQ - 66)) | (1L << (F_RAIZ - 66)) | (1L << (F_SEME - 66)) | (1L << (F_SENH - 66)) | (1L << (F_SENO - 66)) | (1L << (F_TANG - 66)) | (1L << (F_TANH - 66)) | (1L << (F_TETO - 66)) | (1L << (F_VABS - 66)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (ADI - 144)) | (1L << (ADIA - 144)) | (1L << (SUB - 144)) | (1L << (SUBA - 144)) | (1L << (NAO - 144)) | (1L << (NAOT - 144)) | (1L << (ID - 144)) | (1L << (INT - 144)) | (1L << (DEC - 144)) | (1L << (CHEX - 144)) | (1L << (CHAR - 144)) | (1L << (STRING - 144)))) != 0) );
			setState(212);
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

	public static class UsandoContext extends ParserRuleContext {
		public TerminalNode USA() { return getToken(AuroraLogoParser.USA, 0); }
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public List<EscolhaContext> escolha() {
			return getRuleContexts(EscolhaContext.class);
		}
		public EscolhaContext escolha(int i) {
			return getRuleContext(EscolhaContext.class,i);
		}
		public TerminalNode PADR() { return getToken(AuroraLogoParser.PADR, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public UsandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterUsando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitUsando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitUsando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsandoContext usando() throws RecognitionException {
		UsandoContext _localctx = new UsandoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_usando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(USA);
			setState(215);
			match(ID);
			setState(216);
			match(T__2);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				escolha();
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESCO );
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PADR) {
				{
				setState(222);
				match(PADR);
				setState(223);
				match(T__4);
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					inst();
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (REP - 66)) | (1L << (SE - 66)) | (1L << (TART - 66)) | (1L << (TROC - 66)) | (1L << (USA - 66)) | (1L << (VA - 66)) | (1L << (VER - 66)) | (1L << (F_ACOS - 66)) | (1L << (F_ARRE - 66)) | (1L << (F_ASEN - 66)) | (1L << (F_ATAN - 66)) | (1L << (F_CAPO - 66)) | (1L << (F_CHAO - 66)) | (1L << (F_COSH - 66)) | (1L << (F_COSS - 66)) | (1L << (F_DCM - 66)) | (1L << (F_GRRA - 66)) | (1L << (F_HIPO - 66)) | (1L << (F_INC - 66)) | (1L << (F_LOGA - 66)) | (1L << (F_MAXI - 66)) | (1L << (F_MINI - 66)) | (1L << (F_NUMA - 66)) | (1L << (F_POTE - 66)) | (1L << (F_RAGR - 66)) | (1L << (F_RAIC - 66)) | (1L << (F_RAIQ - 66)) | (1L << (F_RAIZ - 66)) | (1L << (F_SEME - 66)) | (1L << (F_SENH - 66)) | (1L << (F_SENO - 66)) | (1L << (F_TANG - 66)) | (1L << (F_TANH - 66)) | (1L << (F_TETO - 66)) | (1L << (F_VABS - 66)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (ADI - 144)) | (1L << (ADIA - 144)) | (1L << (SUB - 144)) | (1L << (SUBA - 144)) | (1L << (NAO - 144)) | (1L << (NAOT - 144)) | (1L << (ID - 144)) | (1L << (INT - 144)) | (1L << (DEC - 144)) | (1L << (CHEX - 144)) | (1L << (CHAR - 144)) | (1L << (STRING - 144)))) != 0) );
				}
			}

			setState(231);
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

	public static class EscolhaContext extends ParserRuleContext {
		public TerminalNode ESCO() { return getToken(AuroraLogoParser.ESCO, 0); }
		public TerminalNode INT() { return getToken(AuroraLogoParser.INT, 0); }
		public TerminalNode DEC() { return getToken(AuroraLogoParser.DEC, 0); }
		public TerminalNode CHAR() { return getToken(AuroraLogoParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(AuroraLogoParser.STRING, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public EscolhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escolha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterEscolha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitEscolha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitEscolha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscolhaContext escolha() throws RecognitionException {
		EscolhaContext _localctx = new EscolhaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_escolha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(ESCO);
			setState(234);
			_la = _input.LA(1);
			if ( !(((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (INT - 179)) | (1L << (DEC - 179)) | (1L << (CHAR - 179)) | (1L << (STRING - 179)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(235);
			match(T__4);
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(236);
				inst();
				}
				}
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (REP - 66)) | (1L << (SE - 66)) | (1L << (TART - 66)) | (1L << (TROC - 66)) | (1L << (USA - 66)) | (1L << (VA - 66)) | (1L << (VER - 66)) | (1L << (F_ACOS - 66)) | (1L << (F_ARRE - 66)) | (1L << (F_ASEN - 66)) | (1L << (F_ATAN - 66)) | (1L << (F_CAPO - 66)) | (1L << (F_CHAO - 66)) | (1L << (F_COSH - 66)) | (1L << (F_COSS - 66)) | (1L << (F_DCM - 66)) | (1L << (F_GRRA - 66)) | (1L << (F_HIPO - 66)) | (1L << (F_INC - 66)) | (1L << (F_LOGA - 66)) | (1L << (F_MAXI - 66)) | (1L << (F_MINI - 66)) | (1L << (F_NUMA - 66)) | (1L << (F_POTE - 66)) | (1L << (F_RAGR - 66)) | (1L << (F_RAIC - 66)) | (1L << (F_RAIQ - 66)) | (1L << (F_RAIZ - 66)) | (1L << (F_SEME - 66)) | (1L << (F_SENH - 66)) | (1L << (F_SENO - 66)) | (1L << (F_TANG - 66)) | (1L << (F_TANH - 66)) | (1L << (F_TETO - 66)) | (1L << (F_VABS - 66)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (ADI - 144)) | (1L << (ADIA - 144)) | (1L << (SUB - 144)) | (1L << (SUBA - 144)) | (1L << (NAO - 144)) | (1L << (NAOT - 144)) | (1L << (ID - 144)) | (1L << (INT - 144)) | (1L << (DEC - 144)) | (1L << (CHEX - 144)) | (1L << (CHAR - 144)) | (1L << (STRING - 144)))) != 0) );
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
		enterRule(_localctx, 32, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(REP);
			setState(242);
			expr();
			setState(243);
			_la = _input.LA(1);
			if ( !(_la==VEZ || _la==VEZS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(244);
			match(T__2);
			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(245);
				inst();
				}
				}
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (REP - 66)) | (1L << (SE - 66)) | (1L << (TART - 66)) | (1L << (TROC - 66)) | (1L << (USA - 66)) | (1L << (VA - 66)) | (1L << (VER - 66)) | (1L << (F_ACOS - 66)) | (1L << (F_ARRE - 66)) | (1L << (F_ASEN - 66)) | (1L << (F_ATAN - 66)) | (1L << (F_CAPO - 66)) | (1L << (F_CHAO - 66)) | (1L << (F_COSH - 66)) | (1L << (F_COSS - 66)) | (1L << (F_DCM - 66)) | (1L << (F_GRRA - 66)) | (1L << (F_HIPO - 66)) | (1L << (F_INC - 66)) | (1L << (F_LOGA - 66)) | (1L << (F_MAXI - 66)) | (1L << (F_MINI - 66)) | (1L << (F_NUMA - 66)) | (1L << (F_POTE - 66)) | (1L << (F_RAGR - 66)) | (1L << (F_RAIC - 66)) | (1L << (F_RAIQ - 66)) | (1L << (F_RAIZ - 66)) | (1L << (F_SEME - 66)) | (1L << (F_SENH - 66)) | (1L << (F_SENO - 66)) | (1L << (F_TANG - 66)) | (1L << (F_TANH - 66)) | (1L << (F_TETO - 66)) | (1L << (F_VABS - 66)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (ADI - 144)) | (1L << (ADIA - 144)) | (1L << (SUB - 144)) | (1L << (SUBA - 144)) | (1L << (NAO - 144)) | (1L << (NAOT - 144)) | (1L << (ID - 144)) | (1L << (INT - 144)) | (1L << (DEC - 144)) | (1L << (CHEX - 144)) | (1L << (CHAR - 144)) | (1L << (STRING - 144)))) != 0) );
			setState(250);
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
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public TerminalNode SOMM() { return getToken(AuroraLogoParser.SOMM, 0); }
		public TerminalNode COM() { return getToken(AuroraLogoParser.COM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MULM() { return getToken(AuroraLogoParser.MULM, 0); }
		public TerminalNode POR() { return getToken(AuroraLogoParser.POR, 0); }
		public TerminalNode DIVM() { return getToken(AuroraLogoParser.DIVM, 0); }
		public TerminalNode SUBM() { return getToken(AuroraLogoParser.SUBM, 0); }
		public TerminalNode DE() { return getToken(AuroraLogoParser.DE, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public TerminalNode INCM() { return getToken(AuroraLogoParser.INCM, 0); }
		public TerminalNode DCMM() { return getToken(AuroraLogoParser.DCMM, 0); }
		public TerminalNode EM() { return getToken(AuroraLogoParser.EM, 0); }
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
		enterRule(_localctx, 34, RULE_repetirEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENQ) {
				{
				setState(252);
				match(ENQ);
				setState(253);
				exprBool();
				}
			}

			setState(256);
			match(REP);
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DCMM:
			case INCM:
				{
				setState(257);
				_la = _input.LA(1);
				if ( !(_la==DCMM || _la==INCM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(258);
				match(ID);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EM) {
					{
					setState(259);
					match(EM);
					setState(260);
					expr();
					}
				}

				}
				break;
			case SOMM:
				{
				setState(263);
				match(SOMM);
				setState(264);
				match(ID);
				setState(265);
				match(COM);
				setState(266);
				expr();
				}
				break;
			case MULM:
				{
				setState(267);
				match(MULM);
				setState(268);
				match(ID);
				setState(269);
				match(POR);
				setState(270);
				expr();
				}
				break;
			case DIVM:
				{
				setState(271);
				match(DIVM);
				setState(272);
				match(ID);
				setState(273);
				match(POR);
				setState(274);
				expr();
				}
				break;
			case SUBM:
				{
				setState(275);
				match(SUBM);
				setState(276);
				expr();
				setState(277);
				match(DE);
				setState(278);
				match(ID);
				}
				break;
			case T__2:
				break;
			default:
				break;
			}
			setState(282);
			match(T__2);
			setState(284); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(283);
				inst();
				}
				}
				setState(286); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (REP - 66)) | (1L << (SE - 66)) | (1L << (TART - 66)) | (1L << (TROC - 66)) | (1L << (USA - 66)) | (1L << (VA - 66)) | (1L << (VER - 66)) | (1L << (F_ACOS - 66)) | (1L << (F_ARRE - 66)) | (1L << (F_ASEN - 66)) | (1L << (F_ATAN - 66)) | (1L << (F_CAPO - 66)) | (1L << (F_CHAO - 66)) | (1L << (F_COSH - 66)) | (1L << (F_COSS - 66)) | (1L << (F_DCM - 66)) | (1L << (F_GRRA - 66)) | (1L << (F_HIPO - 66)) | (1L << (F_INC - 66)) | (1L << (F_LOGA - 66)) | (1L << (F_MAXI - 66)) | (1L << (F_MINI - 66)) | (1L << (F_NUMA - 66)) | (1L << (F_POTE - 66)) | (1L << (F_RAGR - 66)) | (1L << (F_RAIC - 66)) | (1L << (F_RAIQ - 66)) | (1L << (F_RAIZ - 66)) | (1L << (F_SEME - 66)) | (1L << (F_SENH - 66)) | (1L << (F_SENO - 66)) | (1L << (F_TANG - 66)) | (1L << (F_TANH - 66)) | (1L << (F_TETO - 66)) | (1L << (F_VABS - 66)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (ADI - 144)) | (1L << (ADIA - 144)) | (1L << (SUB - 144)) | (1L << (SUBA - 144)) | (1L << (NAO - 144)) | (1L << (NAOT - 144)) | (1L << (ID - 144)) | (1L << (INT - 144)) | (1L << (DEC - 144)) | (1L << (CHEX - 144)) | (1L << (CHAR - 144)) | (1L << (STRING - 144)))) != 0) );
			setState(288);
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

	public static class PararContext extends ParserRuleContext {
		public TerminalNode PARR() { return getToken(AuroraLogoParser.PARR, 0); }
		public PararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterParar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitParar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitParar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PararContext parar() throws RecognitionException {
		PararContext _localctx = new PararContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(PARR);
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

	public static class ContinuarContext extends ParserRuleContext {
		public TerminalNode CONT() { return getToken(AuroraLogoParser.CONT, 0); }
		public ContinuarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterContinuar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitContinuar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitContinuar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinuarContext continuar() throws RecognitionException {
		ContinuarContext _localctx = new ContinuarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_continuar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(CONT);
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
		enterRule(_localctx, 40, RULE_movimentar);
		int _la;
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new MovimentarDirecaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(VA);
				setState(295);
				match(PARA);
				setState(296);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAI) | (1L << CIM) | (1L << DIR) | (1L << ESQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EM) {
					{
					setState(297);
					match(EM);
					setState(298);
					expr();
					}
				}

				}
				break;
			case 2:
				_localctx = new MovimentarPontoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(VA);
				setState(302);
				match(PARA);
				setState(303);
				match(T__0);
				setState(304);
				expr();
				setState(305);
				match(T__5);
				setState(306);
				expr();
				setState(307);
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
	public static class TrocarCorPreenchimentoContext extends TrocarCorContext {
		public TerminalNode TROC() { return getToken(AuroraLogoParser.TROC, 0); }
		public TerminalNode COR() { return getToken(AuroraLogoParser.COR, 0); }
		public TerminalNode DO() { return getToken(AuroraLogoParser.DO, 0); }
		public TerminalNode PREE() { return getToken(AuroraLogoParser.PREE, 0); }
		public TerminalNode PARA() { return getToken(AuroraLogoParser.PARA, 0); }
		public ConfiguracaoCorContext configuracaoCor() {
			return getRuleContext(ConfiguracaoCorContext.class,0);
		}
		public TrocarCorPreenchimentoContext(TrocarCorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterTrocarCorPreenchimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitTrocarCorPreenchimento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitTrocarCorPreenchimento(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrocarCorPincelContext extends TrocarCorContext {
		public TerminalNode TROC() { return getToken(AuroraLogoParser.TROC, 0); }
		public TerminalNode COR() { return getToken(AuroraLogoParser.COR, 0); }
		public TerminalNode DO() { return getToken(AuroraLogoParser.DO, 0); }
		public TerminalNode PINC() { return getToken(AuroraLogoParser.PINC, 0); }
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
		enterRule(_localctx, 42, RULE_trocarCor);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new TrocarCorPincelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(TROC);
				setState(312);
				match(COR);
				setState(313);
				match(DO);
				setState(314);
				match(PINC);
				setState(315);
				match(PARA);
				setState(316);
				configuracaoCor();
				}
				break;
			case 2:
				_localctx = new TrocarCorPreenchimentoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(TROC);
				setState(318);
				match(COR);
				setState(319);
				match(DO);
				setState(320);
				match(PREE);
				setState(321);
				match(PARA);
				setState(322);
				configuracaoCor();
				}
				break;
			case 3:
				_localctx = new TrocarCorFundoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(TROC);
				setState(324);
				match(COR);
				setState(325);
				match(DO);
				setState(326);
				match(FUN);
				setState(327);
				match(PARA);
				setState(328);
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
		public Token corEx;
		public CorContext cor() {
			return getRuleContext(CorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		enterRule(_localctx, 44, RULE_configuracaoCor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case FAL:
			case FORM:
			case PI:
			case TART:
			case VER:
			case F_ACOS:
			case F_ARRE:
			case F_ASEN:
			case F_ATAN:
			case F_CAPO:
			case F_CHAO:
			case F_COSH:
			case F_COSS:
			case F_DCM:
			case F_GRRA:
			case F_HIPO:
			case F_INC:
			case F_LOGA:
			case F_MAXI:
			case F_MINI:
			case F_NUMA:
			case F_POTE:
			case F_RAGR:
			case F_RAIC:
			case F_RAIQ:
			case F_RAIZ:
			case F_SEME:
			case F_SENH:
			case F_SENO:
			case F_TANG:
			case F_TANH:
			case F_TETO:
			case F_VABS:
			case ADI:
			case ADIA:
			case SUB:
			case SUBA:
			case NAO:
			case NAOT:
			case ID:
			case INT:
			case DEC:
			case CHEX:
			case CHAR:
			case STRING:
				{
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(331);
					cor();
					}
					break;
				case 2:
					{
					setState(332);
					expr();
					}
					break;
				}
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
				setState(335);
				((ConfiguracaoCorContext)_localctx).corEx = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (PRETO - 80)) | (1L << (AZUL - 80)) | (1L << (CIANO - 80)) | (1L << (CINZA - 80)) | (1L << (VERDE - 80)) | (1L << (MAGENTA - 80)) | (1L << (LARANJA - 80)) | (1L << (ROSA - 80)) | (1L << (VERMELHO - 80)) | (1L << (BRANCO - 80)) | (1L << (AMARELO - 80)))) != 0)) ) {
					((ConfiguracaoCorContext)_localctx).corEx = (Token)_errHandler.recoverInline(this);
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
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << FAL) | (1L << FORM) | (1L << PI))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TART - 72)) | (1L << (VER - 72)) | (1L << (ESCURO - 72)) | (1L << (CLARO - 72)) | (1L << (F_ACOS - 72)) | (1L << (F_ARRE - 72)) | (1L << (F_ASEN - 72)) | (1L << (F_ATAN - 72)) | (1L << (F_CAPO - 72)) | (1L << (F_CHAO - 72)) | (1L << (F_COSH - 72)) | (1L << (F_COSS - 72)) | (1L << (F_DCM - 72)) | (1L << (F_GRRA - 72)) | (1L << (F_HIPO - 72)) | (1L << (F_INC - 72)) | (1L << (F_LOGA - 72)) | (1L << (F_MAXI - 72)) | (1L << (F_MINI - 72)) | (1L << (F_NUMA - 72)) | (1L << (F_POTE - 72)) | (1L << (F_RAGR - 72)) | (1L << (F_RAIC - 72)) | (1L << (F_RAIQ - 72)) | (1L << (F_RAIZ - 72)) | (1L << (F_SEME - 72)) | (1L << (F_SENH - 72)) | (1L << (F_SENO - 72)) | (1L << (F_TANG - 72)) | (1L << (F_TANH - 72)) | (1L << (F_TETO - 72)) | (1L << (F_VABS - 72)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (ADI - 144)) | (1L << (ADIA - 144)) | (1L << (SUB - 144)) | (1L << (SUBA - 144)) | (1L << (NAO - 144)) | (1L << (NAOT - 144)) | (1L << (ID - 144)) | (1L << (INT - 144)) | (1L << (DEC - 144)) | (1L << (CHEX - 144)) | (1L << (CHAR - 144)) | (1L << (STRING - 144)))) != 0)) {
				{
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << FAL) | (1L << FORM) | (1L << PI))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (TART - 72)) | (1L << (VER - 72)) | (1L << (F_ACOS - 72)) | (1L << (F_ARRE - 72)) | (1L << (F_ASEN - 72)) | (1L << (F_ATAN - 72)) | (1L << (F_CAPO - 72)) | (1L << (F_CHAO - 72)) | (1L << (F_COSH - 72)) | (1L << (F_COSS - 72)) | (1L << (F_DCM - 72)) | (1L << (F_GRRA - 72)) | (1L << (F_HIPO - 72)) | (1L << (F_INC - 72)) | (1L << (F_LOGA - 72)) | (1L << (F_MAXI - 72)) | (1L << (F_MINI - 72)) | (1L << (F_NUMA - 72)) | (1L << (F_POTE - 72)) | (1L << (F_RAGR - 72)) | (1L << (F_RAIC - 72)) | (1L << (F_RAIQ - 72)) | (1L << (F_RAIZ - 72)) | (1L << (F_SEME - 72)) | (1L << (F_SENH - 72)) | (1L << (F_SENO - 72)) | (1L << (F_TANG - 72)) | (1L << (F_TANH - 72)) | (1L << (F_TETO - 72)) | (1L << (F_VABS - 72)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (ADI - 144)) | (1L << (ADIA - 144)) | (1L << (SUB - 144)) | (1L << (SUBA - 144)) | (1L << (NAO - 144)) | (1L << (NAOT - 144)) | (1L << (ID - 144)) | (1L << (INT - 144)) | (1L << (DEC - 144)) | (1L << (CHEX - 144)) | (1L << (CHAR - 144)) | (1L << (STRING - 144)))) != 0)) {
					{
					setState(338);
					expr();
					setState(339);
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

				setState(343);
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

	public static class CorContext extends ParserRuleContext {
		public TerminalNode CHEX() { return getToken(AuroraLogoParser.CHEX, 0); }
		public CorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterCor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitCor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitCor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorContext cor() throws RecognitionException {
		CorContext _localctx = new CorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(CHEX);
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
		enterRule(_localctx, 48, RULE_girar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(GIR);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(349);
				match(EM);
				setState(350);
				expr();
				setState(351);
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
		enterRule(_localctx, 50, RULE_engrossar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(ENG);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(356);
				match(EM);
				setState(357);
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
		enterRule(_localctx, 52, RULE_desengrossar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(DES);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(361);
				match(EM);
				setState(362);
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
		enterRule(_localctx, 54, RULE_trocarGrossura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(TROC);
			setState(366);
			match(GROS);
			setState(367);
			match(PARA);
			setState(368);
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
		public TerminalNode NO() { return getToken(AuroraLogoParser.NO, 0); }
		public TerminalNode DIAG() { return getToken(AuroraLogoParser.DIAG, 0); }
		public TerminalNode PUL() { return getToken(AuroraLogoParser.PUL, 0); }
		public TerminalNode LIN() { return getToken(AuroraLogoParser.LIN, 0); }
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
		enterRule(_localctx, 56, RULE_escrever);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(ESC);
			setState(371);
			expr();
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUL) {
					{
					setState(372);
					match(PUL);
					setState(373);
					match(LIN);
					}
				}

				setState(376);
				match(NA);
				setState(377);
				match(SAI);
				}
				break;
			case 2:
				{
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUL) {
					{
					setState(378);
					match(PUL);
					setState(379);
					match(LIN);
					}
				}

				setState(382);
				match(NO);
				setState(383);
				match(DIAG);
				}
				break;
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
		enterRule(_localctx, 58, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(LER);
			setState(387);
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
		public AtribuirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuir; }
	 
		public AtribuirContext() { }
		public void copyFrom(AtribuirContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtribuirDivisaoContext extends AtribuirContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AC_D() { return getToken(AuroraLogoParser.AC_D, 0); }
		public TerminalNode AT_D() { return getToken(AuroraLogoParser.AT_D, 0); }
		public AtribuirDivisaoContext(AtribuirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterAtribuirDivisao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitAtribuirDivisao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitAtribuirDivisao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuirPadraoContext extends AtribuirContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ATR() { return getToken(AuroraLogoParser.ATR, 0); }
		public TerminalNode ATRA() { return getToken(AuroraLogoParser.ATRA, 0); }
		public AtribuirPadraoContext(AtribuirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterAtribuirPadrao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitAtribuirPadrao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitAtribuirPadrao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuirRestoContext extends AtribuirContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AC_R() { return getToken(AuroraLogoParser.AC_R, 0); }
		public TerminalNode AT_R() { return getToken(AuroraLogoParser.AT_R, 0); }
		public AtribuirRestoContext(AtribuirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterAtribuirResto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitAtribuirResto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitAtribuirResto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuirAdicaoContext extends AtribuirContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AC_A() { return getToken(AuroraLogoParser.AC_A, 0); }
		public TerminalNode AT_A() { return getToken(AuroraLogoParser.AT_A, 0); }
		public AtribuirAdicaoContext(AtribuirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterAtribuirAdicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitAtribuirAdicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitAtribuirAdicao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuirSubtracaoContext extends AtribuirContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AC_S() { return getToken(AuroraLogoParser.AC_S, 0); }
		public TerminalNode AT_S() { return getToken(AuroraLogoParser.AT_S, 0); }
		public AtribuirSubtracaoContext(AtribuirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterAtribuirSubtracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitAtribuirSubtracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitAtribuirSubtracao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuirMultiplicacaoContext extends AtribuirContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AC_M() { return getToken(AuroraLogoParser.AC_M, 0); }
		public TerminalNode AT_M() { return getToken(AuroraLogoParser.AT_M, 0); }
		public AtribuirMultiplicacaoContext(AtribuirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterAtribuirMultiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitAtribuirMultiplicacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitAtribuirMultiplicacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuirContext atribuir() throws RecognitionException {
		AtribuirContext _localctx = new AtribuirContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_atribuir);
		int _la;
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new AtribuirPadraoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(ID);
				setState(390);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(391);
				expr();
				}
				break;
			case 2:
				_localctx = new AtribuirAdicaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(ID);
				setState(393);
				_la = _input.LA(1);
				if ( !(_la==AC_A || _la==AT_A) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(394);
				expr();
				}
				break;
			case 3:
				_localctx = new AtribuirSubtracaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(ID);
				setState(396);
				_la = _input.LA(1);
				if ( !(_la==AC_S || _la==AT_S) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(397);
				expr();
				}
				break;
			case 4:
				_localctx = new AtribuirMultiplicacaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				match(ID);
				setState(399);
				_la = _input.LA(1);
				if ( !(_la==AC_M || _la==AT_M) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(400);
				expr();
				}
				break;
			case 5:
				_localctx = new AtribuirDivisaoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(401);
				match(ID);
				setState(402);
				_la = _input.LA(1);
				if ( !(_la==AC_D || _la==AT_D) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(403);
				expr();
				}
				break;
			case 6:
				_localctx = new AtribuirRestoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(404);
				match(ID);
				setState(405);
				_la = _input.LA(1);
				if ( !(_la==AC_R || _la==AT_R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(406);
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
		enterRule(_localctx, 62, RULE_abaixar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(ABA);
			setState(410);
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
		enterRule(_localctx, 64, RULE_levantar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(LEV);
			setState(413);
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
		enterRule(_localctx, 66, RULE_limpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
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
	public static class FuncaoDecrementarContext extends FuncaoMatematicaContext {
		public TerminalNode F_DCM() { return getToken(AuroraLogoParser.F_DCM, 0); }
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public FuncaoDecrementarContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDecrementar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDecrementar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDecrementar(this);
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
	public static class FuncaoIncrementarContext extends FuncaoMatematicaContext {
		public TerminalNode F_INC() { return getToken(AuroraLogoParser.F_INC, 0); }
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public FuncaoIncrementarContext(FuncaoMatematicaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoIncrementar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoIncrementar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoIncrementar(this);
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
		enterRule(_localctx, 68, RULE_funcaoMatematica);
		try {
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F_VABS:
				_localctx = new FuncaoAbsolutoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(F_VABS);
				setState(418);
				match(T__0);
				setState(419);
				expr();
				setState(420);
				match(T__1);
				}
				break;
			case F_RAIQ:
				_localctx = new FuncaoRaizQuadradaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(F_RAIQ);
				setState(423);
				match(T__0);
				setState(424);
				expr();
				setState(425);
				match(T__1);
				}
				break;
			case F_RAIC:
				_localctx = new FuncaoRaizCubicaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				match(F_RAIC);
				setState(428);
				match(T__0);
				setState(429);
				expr();
				setState(430);
				match(T__1);
				}
				break;
			case F_RAIZ:
				_localctx = new FuncaoRaizContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				match(F_RAIZ);
				setState(433);
				match(T__0);
				setState(434);
				expr();
				setState(435);
				match(T__5);
				setState(436);
				expr();
				setState(437);
				match(T__1);
				}
				break;
			case F_POTE:
				_localctx = new FuncaoPotenciaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
				match(F_POTE);
				setState(440);
				match(T__0);
				setState(441);
				expr();
				setState(442);
				match(T__5);
				setState(443);
				expr();
				setState(444);
				match(T__1);
				}
				break;
			case F_HIPO:
				_localctx = new FuncaoHipotenusaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(446);
				match(F_HIPO);
				setState(447);
				match(T__0);
				setState(448);
				expr();
				setState(449);
				match(T__5);
				setState(450);
				expr();
				setState(451);
				match(T__1);
				}
				break;
			case F_CHAO:
				_localctx = new FuncaoChaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(453);
				match(F_CHAO);
				setState(454);
				match(T__0);
				setState(455);
				expr();
				setState(456);
				match(T__1);
				}
				break;
			case F_TETO:
				_localctx = new FuncaoTetoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(458);
				match(F_TETO);
				setState(459);
				match(T__0);
				setState(460);
				expr();
				setState(461);
				match(T__1);
				}
				break;
			case F_ARRE:
				_localctx = new FuncaoArredondarContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(463);
				match(F_ARRE);
				setState(464);
				match(T__0);
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(465);
					expr();
					}
					break;
				case 2:
					{
					setState(466);
					expr();
					setState(467);
					match(T__5);
					setState(468);
					expr();
					}
					break;
				}
				setState(472);
				match(T__1);
				}
				break;
			case F_MINI:
				_localctx = new FuncaoMinimoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(474);
				match(F_MINI);
				setState(475);
				match(T__0);
				setState(476);
				expr();
				setState(477);
				match(T__5);
				setState(478);
				expr();
				setState(479);
				match(T__1);
				}
				break;
			case F_MAXI:
				_localctx = new FuncaoMaximoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(481);
				match(F_MAXI);
				setState(482);
				match(T__0);
				setState(483);
				expr();
				setState(484);
				match(T__5);
				setState(485);
				expr();
				setState(486);
				match(T__1);
				}
				break;
			case F_NUMA:
				_localctx = new FuncaoNumeroAleatorioContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(488);
				match(F_NUMA);
				setState(489);
				match(T__0);
				setState(495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(490);
					expr();
					}
					break;
				case 2:
					{
					setState(491);
					expr();
					setState(492);
					match(T__5);
					setState(493);
					expr();
					}
					break;
				}
				setState(497);
				match(T__1);
				}
				break;
			case F_SEME:
				_localctx = new FuncaoDefinirSementeAleatoriaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(498);
				match(F_SEME);
				setState(499);
				match(T__0);
				setState(500);
				expr();
				setState(501);
				match(T__1);
				}
				break;
			case F_SENO:
				_localctx = new FuncaoSenoContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(503);
				match(F_SENO);
				setState(504);
				match(T__0);
				setState(505);
				expr();
				setState(506);
				match(T__1);
				}
				break;
			case F_COSS:
				_localctx = new FuncaoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(508);
				match(F_COSS);
				setState(509);
				match(T__0);
				setState(510);
				expr();
				setState(511);
				match(T__1);
				}
				break;
			case F_TANG:
				_localctx = new FuncaoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(513);
				match(F_TANG);
				setState(514);
				match(T__0);
				setState(515);
				expr();
				setState(516);
				match(T__1);
				}
				break;
			case F_ASEN:
				_localctx = new FuncaoArcoSenoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(518);
				match(F_ASEN);
				setState(519);
				match(T__0);
				setState(520);
				expr();
				setState(521);
				match(T__1);
				}
				break;
			case F_ACOS:
				_localctx = new FuncaoArcoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(523);
				match(F_ACOS);
				setState(524);
				match(T__0);
				setState(525);
				expr();
				setState(526);
				match(T__1);
				}
				break;
			case F_ATAN:
				_localctx = new FuncaoArcoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(528);
				match(F_ATAN);
				setState(529);
				match(T__0);
				setState(530);
				expr();
				setState(531);
				match(T__1);
				}
				break;
			case F_CAPO:
				_localctx = new FuncaoCartesianoParaPolarContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(533);
				match(F_CAPO);
				setState(534);
				match(T__0);
				setState(535);
				expr();
				setState(536);
				match(T__5);
				setState(537);
				expr();
				setState(538);
				match(T__1);
				}
				break;
			case F_SENH:
				_localctx = new FuncaoSenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(540);
				match(F_SENH);
				setState(541);
				match(T__0);
				setState(542);
				expr();
				setState(543);
				match(T__1);
				}
				break;
			case F_COSH:
				_localctx = new FuncaoCossenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(545);
				match(F_COSH);
				setState(546);
				match(T__0);
				setState(547);
				expr();
				setState(548);
				match(T__1);
				}
				break;
			case F_TANH:
				_localctx = new FuncaoTangenteHiperbolicaContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(550);
				match(F_TANH);
				setState(551);
				match(T__0);
				setState(552);
				expr();
				setState(553);
				match(T__1);
				}
				break;
			case F_LOGA:
				_localctx = new FuncaoLogaritmoContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(555);
				match(F_LOGA);
				setState(556);
				match(T__0);
				setState(562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(557);
					expr();
					}
					break;
				case 2:
					{
					setState(558);
					expr();
					setState(559);
					match(T__5);
					setState(560);
					expr();
					}
					break;
				}
				setState(564);
				match(T__1);
				}
				break;
			case F_GRRA:
				_localctx = new FuncaoGrausParaRadianosContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(566);
				match(F_GRRA);
				setState(567);
				match(T__0);
				setState(568);
				expr();
				setState(569);
				match(T__1);
				}
				break;
			case F_RAGR:
				_localctx = new FuncaoRadianosParaGrausContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(571);
				match(F_RAGR);
				setState(572);
				match(T__0);
				setState(573);
				expr();
				setState(574);
				match(T__1);
				}
				break;
			case F_INC:
				_localctx = new FuncaoIncrementarContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(576);
				match(F_INC);
				setState(577);
				match(T__0);
				setState(578);
				match(ID);
				setState(579);
				match(T__1);
				}
				break;
			case F_DCM:
				_localctx = new FuncaoDecrementarContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(580);
				match(F_DCM);
				setState(581);
				match(T__0);
				setState(582);
				match(ID);
				setState(583);
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

	public static class InstrucaoGeometricaContext extends ParserRuleContext {
		public TerminalNode DESE() { return getToken(AuroraLogoParser.DESE, 0); }
		public FuncaoGeometricaContext funcaoGeometrica() {
			return getRuleContext(FuncaoGeometricaContext.class,0);
		}
		public InstrucaoGeometricaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoGeometrica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterInstrucaoGeometrica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitInstrucaoGeometrica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitInstrucaoGeometrica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucaoGeometricaContext instrucaoGeometrica() throws RecognitionException {
		InstrucaoGeometricaContext _localctx = new InstrucaoGeometricaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_instrucaoGeometrica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(DESE);
			setState(587);
			funcaoGeometrica();
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

	public static class FuncaoGeometricaContext extends ParserRuleContext {
		public FuncaoGeometricaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoGeometrica; }
	 
		public FuncaoGeometricaContext() { }
		public void copyFrom(FuncaoGeometricaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncaoDesenharCirculoContext extends FuncaoGeometricaContext {
		public TerminalNode FG_CIC() { return getToken(AuroraLogoParser.FG_CIC, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PREO() { return getToken(AuroraLogoParser.PREO, 0); }
		public FuncaoDesenharCirculoContext(FuncaoGeometricaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDesenharCirculo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDesenharCirculo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDesenharCirculo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoDesenharRetanguloContext extends FuncaoGeometricaContext {
		public TerminalNode FG_RET() { return getToken(AuroraLogoParser.FG_RET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PREO() { return getToken(AuroraLogoParser.PREO, 0); }
		public FuncaoDesenharRetanguloContext(FuncaoGeometricaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDesenharRetangulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDesenharRetangulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDesenharRetangulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoDesenharPoligonoRegularContext extends FuncaoGeometricaContext {
		public TerminalNode FG_POR() { return getToken(AuroraLogoParser.FG_POR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PREO() { return getToken(AuroraLogoParser.PREO, 0); }
		public FuncaoDesenharPoligonoRegularContext(FuncaoGeometricaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDesenharPoligonoRegular(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDesenharPoligonoRegular(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDesenharPoligonoRegular(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoDesenharSegmentoContext extends FuncaoGeometricaContext {
		public TerminalNode FG_SEG() { return getToken(AuroraLogoParser.FG_SEG, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncaoDesenharSegmentoContext(FuncaoGeometricaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDesenharSegmento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDesenharSegmento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDesenharSegmento(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoDesenharCurvaCubicaContext extends FuncaoGeometricaContext {
		public TerminalNode FG_CCU() { return getToken(AuroraLogoParser.FG_CCU, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PREA() { return getToken(AuroraLogoParser.PREA, 0); }
		public FuncaoDesenharCurvaCubicaContext(FuncaoGeometricaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDesenharCurvaCubica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDesenharCurvaCubica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDesenharCurvaCubica(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoDesenharElipseContext extends FuncaoGeometricaContext {
		public TerminalNode FG_ELI() { return getToken(AuroraLogoParser.FG_ELI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PREA() { return getToken(AuroraLogoParser.PREA, 0); }
		public FuncaoDesenharElipseContext(FuncaoGeometricaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDesenharElipse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDesenharElipse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDesenharElipse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoDesenharPoligonoContext extends FuncaoGeometricaContext {
		public TerminalNode FG_POL() { return getToken(AuroraLogoParser.FG_POL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PREO() { return getToken(AuroraLogoParser.PREO, 0); }
		public FuncaoDesenharPoligonoContext(FuncaoGeometricaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDesenharPoligono(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDesenharPoligono(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDesenharPoligono(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoDesenharEstrelaContext extends FuncaoGeometricaContext {
		public TerminalNode FG_EST() { return getToken(AuroraLogoParser.FG_EST, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PREA() { return getToken(AuroraLogoParser.PREA, 0); }
		public FuncaoDesenharEstrelaContext(FuncaoGeometricaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDesenharEstrela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDesenharEstrela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDesenharEstrela(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoDesenharArcoContext extends FuncaoGeometricaContext {
		public TerminalNode FG_ARC() { return getToken(AuroraLogoParser.FG_ARC, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PREO() { return getToken(AuroraLogoParser.PREO, 0); }
		public TerminalNode ABE() { return getToken(AuroraLogoParser.ABE, 0); }
		public TerminalNode COD() { return getToken(AuroraLogoParser.COD, 0); }
		public TerminalNode PIZ() { return getToken(AuroraLogoParser.PIZ, 0); }
		public FuncaoDesenharArcoContext(FuncaoGeometricaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDesenharArco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDesenharArco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDesenharArco(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoDesenharQuadradoContext extends FuncaoGeometricaContext {
		public TerminalNode FG_QUA() { return getToken(AuroraLogoParser.FG_QUA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PREO() { return getToken(AuroraLogoParser.PREO, 0); }
		public FuncaoDesenharQuadradoContext(FuncaoGeometricaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDesenharQuadrado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDesenharQuadrado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDesenharQuadrado(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoDesenharCurvaQuadraticaContext extends FuncaoGeometricaContext {
		public TerminalNode FG_CQD() { return getToken(AuroraLogoParser.FG_CQD, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PREA() { return getToken(AuroraLogoParser.PREA, 0); }
		public FuncaoDesenharCurvaQuadraticaContext(FuncaoGeometricaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDesenharCurvaQuadratica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDesenharCurvaQuadratica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDesenharCurvaQuadratica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoGeometricaContext funcaoGeometrica() throws RecognitionException {
		FuncaoGeometricaContext _localctx = new FuncaoGeometricaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_funcaoGeometrica);
		int _la;
		try {
			setState(764);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FG_SEG:
				_localctx = new FuncaoDesenharSegmentoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				match(FG_SEG);
				setState(590);
				match(T__0);
				setState(591);
				expr();
				setState(592);
				match(T__5);
				setState(593);
				expr();
				setState(594);
				match(T__5);
				setState(595);
				expr();
				setState(596);
				match(T__5);
				setState(597);
				expr();
				setState(598);
				match(T__1);
				}
				break;
			case FG_QUA:
				_localctx = new FuncaoDesenharQuadradoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(FG_QUA);
				setState(601);
				match(T__0);
				setState(602);
				expr();
				setState(603);
				match(T__5);
				setState(604);
				expr();
				setState(605);
				match(T__5);
				setState(606);
				expr();
				setState(607);
				match(T__1);
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREO) {
					{
					setState(608);
					match(PREO);
					}
				}

				}
				break;
			case FG_RET:
				_localctx = new FuncaoDesenharRetanguloContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				match(FG_RET);
				setState(612);
				match(T__0);
				setState(613);
				expr();
				setState(614);
				match(T__5);
				setState(615);
				expr();
				setState(616);
				match(T__5);
				setState(617);
				expr();
				setState(618);
				match(T__5);
				setState(619);
				expr();
				setState(620);
				match(T__1);
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREO) {
					{
					setState(621);
					match(PREO);
					}
				}

				}
				break;
			case FG_CIC:
				_localctx = new FuncaoDesenharCirculoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(624);
				match(FG_CIC);
				setState(625);
				match(T__0);
				setState(626);
				expr();
				setState(627);
				match(T__5);
				setState(628);
				expr();
				setState(629);
				match(T__5);
				setState(630);
				expr();
				setState(631);
				match(T__1);
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREO) {
					{
					setState(632);
					match(PREO);
					}
				}

				}
				break;
			case FG_ELI:
				_localctx = new FuncaoDesenharElipseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(635);
				match(FG_ELI);
				setState(636);
				match(T__0);
				setState(637);
				expr();
				setState(638);
				match(T__5);
				setState(639);
				expr();
				setState(640);
				match(T__5);
				setState(641);
				expr();
				setState(642);
				match(T__5);
				setState(643);
				expr();
				setState(644);
				match(T__1);
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREA) {
					{
					setState(645);
					match(PREA);
					}
				}

				}
				break;
			case FG_ARC:
				_localctx = new FuncaoDesenharArcoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(648);
				match(FG_ARC);
				setState(649);
				match(T__0);
				setState(650);
				expr();
				setState(651);
				match(T__5);
				setState(652);
				expr();
				setState(653);
				match(T__5);
				setState(654);
				expr();
				setState(655);
				match(T__5);
				setState(656);
				expr();
				setState(657);
				match(T__5);
				setState(658);
				expr();
				setState(659);
				match(T__5);
				setState(660);
				expr();
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(661);
					match(T__5);
					setState(662);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABE) | (1L << COD) | (1L << PIZ))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(665);
				match(T__1);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREO) {
					{
					setState(666);
					match(PREO);
					}
				}

				}
				break;
			case FG_POR:
				_localctx = new FuncaoDesenharPoligonoRegularContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(669);
				match(FG_POR);
				setState(670);
				match(T__0);
				setState(671);
				expr();
				setState(672);
				match(T__5);
				setState(673);
				expr();
				setState(674);
				match(T__5);
				setState(675);
				expr();
				setState(676);
				match(T__5);
				setState(677);
				expr();
				setState(678);
				match(T__5);
				setState(679);
				expr();
				setState(680);
				match(T__1);
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREO) {
					{
					setState(681);
					match(PREO);
					}
				}

				}
				break;
			case FG_EST:
				_localctx = new FuncaoDesenharEstrelaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(684);
				match(FG_EST);
				setState(685);
				match(T__0);
				setState(686);
				expr();
				setState(687);
				match(T__5);
				setState(688);
				expr();
				setState(689);
				match(T__5);
				setState(690);
				expr();
				setState(691);
				match(T__5);
				setState(692);
				expr();
				setState(693);
				match(T__5);
				setState(694);
				expr();
				setState(695);
				match(T__1);
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREA) {
					{
					setState(696);
					match(PREA);
					}
				}

				}
				break;
			case FG_POL:
				_localctx = new FuncaoDesenharPoligonoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(699);
				match(FG_POL);
				setState(700);
				match(T__0);
				setState(701);
				expr();
				setState(702);
				match(T__5);
				setState(703);
				expr();
				setState(704);
				match(T__5);
				setState(705);
				expr();
				setState(706);
				match(T__5);
				setState(707);
				expr();
				setState(708);
				match(T__5);
				setState(709);
				expr();
				setState(710);
				match(T__5);
				setState(711);
				expr();
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(712);
					match(T__5);
					setState(713);
					expr();
					setState(714);
					match(T__5);
					setState(715);
					expr();
					}
					}
					setState(721);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(722);
				match(T__1);
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREO) {
					{
					setState(723);
					match(PREO);
					}
				}

				}
				break;
			case FG_CQD:
				_localctx = new FuncaoDesenharCurvaQuadraticaContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(726);
				match(FG_CQD);
				setState(727);
				match(T__0);
				setState(728);
				expr();
				setState(729);
				match(T__5);
				setState(730);
				expr();
				setState(731);
				match(T__5);
				setState(732);
				expr();
				setState(733);
				match(T__5);
				setState(734);
				expr();
				setState(735);
				match(T__5);
				setState(736);
				expr();
				setState(737);
				match(T__5);
				setState(738);
				expr();
				setState(739);
				match(T__1);
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREA) {
					{
					setState(740);
					match(PREA);
					}
				}

				}
				break;
			case FG_CCU:
				_localctx = new FuncaoDesenharCurvaCubicaContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(743);
				match(FG_CCU);
				setState(744);
				match(T__0);
				setState(745);
				expr();
				setState(746);
				match(T__5);
				setState(747);
				expr();
				setState(748);
				match(T__5);
				setState(749);
				expr();
				setState(750);
				match(T__5);
				setState(751);
				expr();
				setState(752);
				match(T__5);
				setState(753);
				expr();
				setState(754);
				match(T__5);
				setState(755);
				expr();
				setState(756);
				match(T__5);
				setState(757);
				expr();
				setState(758);
				match(T__5);
				setState(759);
				expr();
				setState(760);
				match(T__1);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREA) {
					{
					setState(761);
					match(PREA);
					}
				}

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

	public static class DesenharCaminhoContext extends ParserRuleContext {
		public TerminalNode DESE() { return getToken(AuroraLogoParser.DESE, 0); }
		public TerminalNode CAM() { return getToken(AuroraLogoParser.CAM, 0); }
		public TerminalNode PREO() { return getToken(AuroraLogoParser.PREO, 0); }
		public List<InstCaminhoContext> instCaminho() {
			return getRuleContexts(InstCaminhoContext.class);
		}
		public InstCaminhoContext instCaminho(int i) {
			return getRuleContext(InstCaminhoContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AuroraLogoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AuroraLogoParser.DOT, i);
		}
		public DesenharCaminhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desenharCaminho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterDesenharCaminho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitDesenharCaminho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitDesenharCaminho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesenharCaminhoContext desenharCaminho() throws RecognitionException {
		DesenharCaminhoContext _localctx = new DesenharCaminhoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_desenharCaminho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(DESE);
			setState(767);
			match(CAM);
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PREO) {
				{
				setState(768);
				match(PREO);
				}
			}

			setState(771);
			match(T__2);
			setState(775); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(772);
				instCaminho();
				setState(773);
				match(DOT);
				}
				}
				setState(777); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CUR) | (1L << FEC) | (1L << LIN) | (1L << MOV))) != 0) );
			setState(779);
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

	public static class InstCaminhoContext extends ParserRuleContext {
		public InstCaminhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instCaminho; }
	 
		public InstCaminhoContext() { }
		public void copyFrom(InstCaminhoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InstrucaoCaminhoLinhaAteContext extends InstCaminhoContext {
		public TerminalNode LIN() { return getToken(AuroraLogoParser.LIN, 0); }
		public TerminalNode ATE() { return getToken(AuroraLogoParser.ATE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InstrucaoCaminhoLinhaAteContext(InstCaminhoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterInstrucaoCaminhoLinhaAte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitInstrucaoCaminhoLinhaAte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitInstrucaoCaminhoLinhaAte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstrucaoCaminhoFecharCaminhoContext extends InstCaminhoContext {
		public TerminalNode FEC() { return getToken(AuroraLogoParser.FEC, 0); }
		public InstrucaoCaminhoFecharCaminhoContext(InstCaminhoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterInstrucaoCaminhoFecharCaminho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitInstrucaoCaminhoFecharCaminho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitInstrucaoCaminhoFecharCaminho(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstrucaoCaminhoCurvaQuadraticaAteContext extends InstCaminhoContext {
		public TerminalNode CUR() { return getToken(AuroraLogoParser.CUR, 0); }
		public TerminalNode QUAD() { return getToken(AuroraLogoParser.QUAD, 0); }
		public TerminalNode ATE() { return getToken(AuroraLogoParser.ATE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InstrucaoCaminhoCurvaQuadraticaAteContext(InstCaminhoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterInstrucaoCaminhoCurvaQuadraticaAte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitInstrucaoCaminhoCurvaQuadraticaAte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitInstrucaoCaminhoCurvaQuadraticaAte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstrucaoCaminhoMoverAteContext extends InstCaminhoContext {
		public TerminalNode MOV() { return getToken(AuroraLogoParser.MOV, 0); }
		public TerminalNode ATE() { return getToken(AuroraLogoParser.ATE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InstrucaoCaminhoMoverAteContext(InstCaminhoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterInstrucaoCaminhoMoverAte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitInstrucaoCaminhoMoverAte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitInstrucaoCaminhoMoverAte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstrucaoCaminhoCurvaCubicaAteContext extends InstCaminhoContext {
		public TerminalNode CUR() { return getToken(AuroraLogoParser.CUR, 0); }
		public TerminalNode CUBI() { return getToken(AuroraLogoParser.CUBI, 0); }
		public TerminalNode ATE() { return getToken(AuroraLogoParser.ATE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InstrucaoCaminhoCurvaCubicaAteContext(InstCaminhoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterInstrucaoCaminhoCurvaCubicaAte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitInstrucaoCaminhoCurvaCubicaAte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitInstrucaoCaminhoCurvaCubicaAte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstCaminhoContext instCaminho() throws RecognitionException {
		InstCaminhoContext _localctx = new InstCaminhoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_instCaminho);
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new InstrucaoCaminhoMoverAteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				match(MOV);
				setState(782);
				match(ATE);
				setState(783);
				match(T__0);
				setState(784);
				expr();
				setState(785);
				match(T__5);
				setState(786);
				expr();
				setState(787);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InstrucaoCaminhoLinhaAteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				match(LIN);
				setState(790);
				match(ATE);
				setState(791);
				match(T__0);
				setState(792);
				expr();
				setState(793);
				match(T__5);
				setState(794);
				expr();
				setState(795);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new InstrucaoCaminhoCurvaQuadraticaAteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(797);
				match(CUR);
				setState(798);
				match(QUAD);
				setState(799);
				match(ATE);
				setState(800);
				match(T__0);
				setState(801);
				expr();
				setState(802);
				match(T__5);
				setState(803);
				expr();
				setState(804);
				match(T__5);
				setState(805);
				expr();
				setState(806);
				match(T__5);
				setState(807);
				expr();
				setState(808);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new InstrucaoCaminhoCurvaCubicaAteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(810);
				match(CUR);
				setState(811);
				match(CUBI);
				setState(812);
				match(ATE);
				setState(813);
				match(T__0);
				setState(814);
				expr();
				setState(815);
				match(T__5);
				setState(816);
				expr();
				setState(817);
				match(T__5);
				setState(818);
				expr();
				setState(819);
				match(T__5);
				setState(820);
				expr();
				setState(821);
				match(T__5);
				setState(822);
				expr();
				setState(823);
				match(T__5);
				setState(824);
				expr();
				setState(825);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new InstrucaoCaminhoFecharCaminhoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(827);
				match(FEC);
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

	public static class ConsultarTartarugaContext extends ParserRuleContext {
		public TerminalNode TART() { return getToken(AuroraLogoParser.TART, 0); }
		public TerminalNode DOT() { return getToken(AuroraLogoParser.DOT, 0); }
		public TerminalNode PX() { return getToken(AuroraLogoParser.PX, 0); }
		public TerminalNode PY() { return getToken(AuroraLogoParser.PY, 0); }
		public TerminalNode PA() { return getToken(AuroraLogoParser.PA, 0); }
		public ConsultarTartarugaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consultarTartaruga; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterConsultarTartaruga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitConsultarTartaruga(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitConsultarTartaruga(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsultarTartarugaContext consultarTartaruga() throws RecognitionException {
		ConsultarTartarugaContext _localctx = new ConsultarTartarugaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_consultarTartaruga);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(TART);
			setState(831);
			match(DOT);
			setState(832);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PX) | (1L << PY) | (1L << PA))) != 0)) ) {
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

	public static class FormatarTextoContext extends ParserRuleContext {
		public TerminalNode FORM() { return getToken(AuroraLogoParser.FORM, 0); }
		public TerminalNode STRING() { return getToken(AuroraLogoParser.STRING, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FormatarTextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatarTexto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFormatarTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFormatarTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFormatarTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatarTextoContext formatarTexto() throws RecognitionException {
		FormatarTextoContext _localctx = new FormatarTextoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_formatarTexto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(FORM);
			setState(835);
			match(T__0);
			setState(836);
			match(STRING);
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(837);
				match(T__5);
				setState(838);
				expr();
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
			match(T__1);
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
		"\u0004\u0001\u00ba\u034f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0001\u0000\u0004\u0000T\b\u0000\u000b\u0000\f\u0000"+
		"U\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001`\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002r\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003w\b\u0003\n\u0003\f\u0003z\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u007f\b\u0004\u0001\u0005\u0003\u0005"+
		"\u0082\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0087\b"+
		"\u0005\n\u0005\f\u0005\u008a\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u008f\b\u0006\n\u0006\f\u0006\u0092\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u009b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00a7\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0005"+
		"\n\u00af\b\n\n\n\f\n\u00b2\t\n\u0001\n\u0003\n\u00b5\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00bc\b\u000b\u000b"+
		"\u000b\f\u000b\u00bd\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0004\f\u00c8\b\f\u000b\f\f\f\u00c9\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0004\r\u00d1\b\r\u000b\r\f\r\u00d2\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00db\b"+
		"\u000e\u000b\u000e\f\u000e\u00dc\u0001\u000e\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u00e2\b\u000e\u000b\u000e\f\u000e\u00e3\u0003\u000e\u00e6\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0004\u000f\u00ee\b\u000f\u000b\u000f\f\u000f\u00ef\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00f7\b\u0010\u000b"+
		"\u0010\f\u0010\u00f8\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00ff\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0106\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0119\b\u0011\u0001\u0011\u0001\u0011\u0004"+
		"\u0011\u011d\b\u0011\u000b\u0011\f\u0011\u011e\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u012c\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0136\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u014a\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u014e\b\u0016\u0001\u0016\u0003\u0016\u0151\b"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0156\b\u0016\u0001"+
		"\u0016\u0003\u0016\u0159\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0162\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0167\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u016c\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0177\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u017d\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0181"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0198\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01d7"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01f0\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u0233\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0249\b\"\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u0262\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u026f\b$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u027a\b$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0287\b$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u0298\b$\u0001$\u0001$\u0003$\u029c"+
		"\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u02ab\b$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u02ba"+
		"\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u02ce"+
		"\b$\n$\f$\u02d1\t$\u0001$\u0001$\u0003$\u02d5\b$\u0001$\u0001$\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u02e6\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u02fb\b$\u0003$\u02fd\b$\u0001%\u0001%\u0001"+
		"%\u0003%\u0302\b%\u0001%\u0001%\u0001%\u0001%\u0004%\u0308\b%\u000b%\f"+
		"%\u0309\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u033d\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0005(\u0348\b(\n(\f(\u034b\t(\u0001(\u0001(\u0001(\u0000"+
		"\u0000)\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNP\u0000\u0014\u0001\u0000\u00ab"+
		"\u00ae\u0001\u0000\u0099\u00aa\u0001\u0000\u0090\u0093\u0002\u0000OO\u0094"+
		"\u0098\u0001\u0000\u00af\u00b0\u0002\u0000%%MM\u0002\u0000\u00b3\u00b4"+
		"\u00b6\u00b7\u0001\u0000NO\u0002\u0000\u0016\u0016,,\u0004\u0000\r\r\u000f"+
		"\u000f\u001b\u001b$$\u0001\u0000PZ\u0001\u0000[\\\u0001\u0000\u0084\u0085"+
		"\u0001\u0000\u0086\u0087\u0001\u0000\u0088\u0089\u0001\u0000\u008a\u008b"+
		"\u0001\u0000\u008c\u008d\u0001\u0000\u008e\u008f\u0003\u0000\u000b\u000b"+
		"\u0010\u0010;;\u0001\u0000\u0007\t\u03ad\u0000S\u0001\u0000\u0000\u0000"+
		"\u0002_\u0001\u0000\u0000\u0000\u0004q\u0001\u0000\u0000\u0000\u0006s"+
		"\u0001\u0000\u0000\u0000\b{\u0001\u0000\u0000\u0000\n\u0081\u0001\u0000"+
		"\u0000\u0000\f\u008b\u0001\u0000\u0000\u0000\u000e\u00a6\u0001\u0000\u0000"+
		"\u0000\u0010\u00a8\u0001\u0000\u0000\u0000\u0012\u00aa\u0001\u0000\u0000"+
		"\u0000\u0014\u00ac\u0001\u0000\u0000\u0000\u0016\u00b6\u0001\u0000\u0000"+
		"\u0000\u0018\u00c1\u0001\u0000\u0000\u0000\u001a\u00cd\u0001\u0000\u0000"+
		"\u0000\u001c\u00d6\u0001\u0000\u0000\u0000\u001e\u00e9\u0001\u0000\u0000"+
		"\u0000 \u00f1\u0001\u0000\u0000\u0000\"\u00fe\u0001\u0000\u0000\u0000"+
		"$\u0122\u0001\u0000\u0000\u0000&\u0124\u0001\u0000\u0000\u0000(\u0135"+
		"\u0001\u0000\u0000\u0000*\u0149\u0001\u0000\u0000\u0000,\u0150\u0001\u0000"+
		"\u0000\u0000.\u015a\u0001\u0000\u0000\u00000\u015c\u0001\u0000\u0000\u0000"+
		"2\u0163\u0001\u0000\u0000\u00004\u0168\u0001\u0000\u0000\u00006\u016d"+
		"\u0001\u0000\u0000\u00008\u0172\u0001\u0000\u0000\u0000:\u0182\u0001\u0000"+
		"\u0000\u0000<\u0197\u0001\u0000\u0000\u0000>\u0199\u0001\u0000\u0000\u0000"+
		"@\u019c\u0001\u0000\u0000\u0000B\u019f\u0001\u0000\u0000\u0000D\u0248"+
		"\u0001\u0000\u0000\u0000F\u024a\u0001\u0000\u0000\u0000H\u02fc\u0001\u0000"+
		"\u0000\u0000J\u02fe\u0001\u0000\u0000\u0000L\u033c\u0001\u0000\u0000\u0000"+
		"N\u033e\u0001\u0000\u0000\u0000P\u0342\u0001\u0000\u0000\u0000RT\u0003"+
		"\u0002\u0001\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0001\u0001\u0000"+
		"\u0000\u0000WX\u0003\u0004\u0002\u0000XY\u0005\u00b1\u0000\u0000Y`\u0001"+
		"\u0000\u0000\u0000Z`\u0003\u0014\n\u0000[`\u0003\u001c\u000e\u0000\\`"+
		"\u0003 \u0010\u0000]`\u0003\"\u0011\u0000^`\u0003J%\u0000_W\u0001\u0000"+
		"\u0000\u0000_Z\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000_\\\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"`\u0003\u0001\u0000\u0000\u0000ar\u0003(\u0014\u0000br\u0003*\u0015\u0000"+
		"cr\u00030\u0018\u0000dr\u00032\u0019\u0000er\u00034\u001a\u0000fr\u0003"+
		"6\u001b\u0000gr\u0003F#\u0000hr\u00038\u001c\u0000ir\u0003:\u001d\u0000"+
		"jr\u0003<\u001e\u0000kr\u0003>\u001f\u0000lr\u0003@ \u0000mr\u0003B!\u0000"+
		"nr\u0003\u0006\u0003\u0000or\u0003$\u0012\u0000pr\u0003&\u0013\u0000q"+
		"a\u0001\u0000\u0000\u0000qb\u0001\u0000\u0000\u0000qc\u0001\u0000\u0000"+
		"\u0000qd\u0001\u0000\u0000\u0000qe\u0001\u0000\u0000\u0000qf\u0001\u0000"+
		"\u0000\u0000qg\u0001\u0000\u0000\u0000qh\u0001\u0000\u0000\u0000qi\u0001"+
		"\u0000\u0000\u0000qj\u0001\u0000\u0000\u0000qk\u0001\u0000\u0000\u0000"+
		"ql\u0001\u0000\u0000\u0000qm\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u0005\u0001"+
		"\u0000\u0000\u0000sx\u0003\b\u0004\u0000tu\u0007\u0000\u0000\u0000uw\u0003"+
		"\b\u0004\u0000vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0007\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000{~\u0003\n\u0005\u0000|}\u0007\u0001\u0000"+
		"\u0000}\u007f\u0003\n\u0005\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f\t\u0001\u0000\u0000\u0000\u0080\u0082\u0007\u0002"+
		"\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0088\u0003\f\u0006"+
		"\u0000\u0084\u0085\u0007\u0002\u0000\u0000\u0085\u0087\u0003\f\u0006\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u000b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008b\u0090\u0003\u000e\u0007\u0000\u008c\u008d\u0007\u0003\u0000\u0000"+
		"\u008d\u008f\u0003\u000e\u0007\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\r\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0004\u0000\u0000\u0094"+
		"\u00a7\u0003\u000e\u0007\u0000\u0095\u00a7\u0005\u00b3\u0000\u0000\u0096"+
		"\u00a7\u0005\u00b4\u0000\u0000\u0097\u00a7\u00059\u0000\u0000\u0098\u009b"+
		"\u0003\u0012\t\u0000\u0099\u009b\u0005\u00b2\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u00a7\u0001"+
		"\u0000\u0000\u0000\u009c\u00a7\u0005\u00b6\u0000\u0000\u009d\u00a7\u0005"+
		"\u00b7\u0000\u0000\u009e\u00a7\u0003.\u0017\u0000\u009f\u00a7\u0003D\""+
		"\u0000\u00a0\u00a7\u0003N\'\u0000\u00a1\u00a7\u0003P(\u0000\u00a2\u00a3"+
		"\u0005\u0001\u0000\u0000\u00a3\u00a4\u0003\u0006\u0003\u0000\u00a4\u00a5"+
		"\u0005\u0002\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u0093"+
		"\u0001\u0000\u0000\u0000\u00a6\u0095\u0001\u0000\u0000\u0000\u00a6\u0096"+
		"\u0001\u0000\u0000\u0000\u00a6\u0097\u0001\u0000\u0000\u0000\u00a6\u009a"+
		"\u0001\u0000\u0000\u0000\u00a6\u009c\u0001\u0000\u0000\u0000\u00a6\u009d"+
		"\u0001\u0000\u0000\u0000\u00a6\u009e\u0001\u0000\u0000\u0000\u00a6\u009f"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a0\u0001\u0000\u0000\u0000\u00a6\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a7\u000f"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003\u0006\u0003\u0000\u00a9\u0011"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007\u0005\u0000\u0000\u00ab\u0013"+
		"\u0001\u0000\u0000\u0000\u00ac\u00b0\u0003\u0016\u000b\u0000\u00ad\u00af"+
		"\u0003\u0018\f\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b5\u0003\u001a\r\u0000\u00b4\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u0015\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005D\u0000\u0000\u00b7\u00b8\u0003\u0010\b"+
		"\u0000\u00b8\u00b9\u0005!\u0000\u0000\u00b9\u00bb\u0005\u0003\u0000\u0000"+
		"\u00ba\u00bc\u0003\u0002\u0001\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0005\u0004\u0000\u0000\u00c0\u0017\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0005E\u0000\u0000\u00c2\u00c3\u0005D\u0000\u0000\u00c3\u00c4"+
		"\u0003\u0010\b\u0000\u00c4\u00c5\u0005!\u0000\u0000\u00c5\u00c7\u0005"+
		"\u0003\u0000\u0000\u00c6\u00c8\u0003\u0002\u0001\u0000\u00c7\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0005\u0004\u0000\u0000\u00cc\u0019\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0005E\u0000\u0000\u00ce\u00d0\u0005\u0003"+
		"\u0000\u0000\u00cf\u00d1\u0003\u0002\u0001\u0000\u00d0\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005\u0004\u0000\u0000\u00d5\u001b\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0005K\u0000\u0000\u00d7\u00d8\u0005\u00b2\u0000"+
		"\u0000\u00d8\u00da\u0005\u0003\u0000\u0000\u00d9\u00db\u0003\u001e\u000f"+
		"\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e5\u0001\u0000\u0000\u0000\u00de\u00df\u00056\u0000\u0000"+
		"\u00df\u00e1\u0005\u0005\u0000\u0000\u00e0\u00e2\u0003\u0002\u0001\u0000"+
		"\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00de\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0005\u0004\u0000\u0000\u00e8\u001d\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0005\"\u0000\u0000\u00ea\u00eb\u0007\u0006\u0000\u0000\u00eb"+
		"\u00ed\u0005\u0005\u0000\u0000\u00ec\u00ee\u0003\u0002\u0001\u0000\u00ed"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u001f\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005B\u0000\u0000\u00f2\u00f3"+
		"\u0003\u0006\u0003\u0000\u00f3\u00f4\u0007\u0007\u0000\u0000\u00f4\u00f6"+
		"\u0005\u0003\u0000\u0000\u00f5\u00f7\u0003\u0002\u0001\u0000\u00f6\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u0004\u0000\u0000\u00fb!\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0005 \u0000\u0000\u00fd\u00ff\u0003\u0010"+
		"\b\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0118\u0005B\u0000\u0000"+
		"\u0101\u0102\u0007\b\u0000\u0000\u0102\u0105\u0005\u00b2\u0000\u0000\u0103"+
		"\u0104\u0005\u001e\u0000\u0000\u0104\u0106\u0003\u0006\u0003\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0119\u0001\u0000\u0000\u0000\u0107\u0108\u0005F\u0000\u0000\u0108\u0109"+
		"\u0005\u00b2\u0000\u0000\u0109\u010a\u0005\u0011\u0000\u0000\u010a\u0119"+
		"\u0003\u0006\u0003\u0000\u010b\u010c\u00053\u0000\u0000\u010c\u010d\u0005"+
		"\u00b2\u0000\u0000\u010d\u010e\u0005<\u0000\u0000\u010e\u0119\u0003\u0006"+
		"\u0003\u0000\u010f\u0110\u0005\u001c\u0000\u0000\u0110\u0111\u0005\u00b2"+
		"\u0000\u0000\u0111\u0112\u0005<\u0000\u0000\u0112\u0119\u0003\u0006\u0003"+
		"\u0000\u0113\u0114\u0005G\u0000\u0000\u0114\u0115\u0003\u0006\u0003\u0000"+
		"\u0115\u0116\u0005\u0017\u0000\u0000\u0116\u0117\u0005\u00b2\u0000\u0000"+
		"\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0101\u0001\u0000\u0000\u0000"+
		"\u0118\u0107\u0001\u0000\u0000\u0000\u0118\u010b\u0001\u0000\u0000\u0000"+
		"\u0118\u010f\u0001\u0000\u0000\u0000\u0118\u0113\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000"+
		"\u011a\u011c\u0005\u0003\u0000\u0000\u011b\u011d\u0003\u0002\u0001\u0000"+
		"\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0005\u0004\u0000\u0000"+
		"\u0121#\u0001\u0000\u0000\u0000\u0122\u0123\u00058\u0000\u0000\u0123%"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0012\u0000\u0000\u0125\'\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0005L\u0000\u0000\u0127\u0128\u00057\u0000"+
		"\u0000\u0128\u012b\u0007\t\u0000\u0000\u0129\u012a\u0005\u001e\u0000\u0000"+
		"\u012a\u012c\u0003\u0006\u0003\u0000\u012b\u0129\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u0136\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0005L\u0000\u0000\u012e\u012f\u00057\u0000\u0000\u012f\u0130"+
		"\u0005\u0001\u0000\u0000\u0130\u0131\u0003\u0006\u0003\u0000\u0131\u0132"+
		"\u0005\u0006\u0000\u0000\u0132\u0133\u0003\u0006\u0003\u0000\u0133\u0134"+
		"\u0005\u0002\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u0126"+
		"\u0001\u0000\u0000\u0000\u0135\u012d\u0001\u0000\u0000\u0000\u0136)\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0005J\u0000\u0000\u0138\u0139\u0005\u0013"+
		"\u0000\u0000\u0139\u013a\u0005\u001d\u0000\u0000\u013a\u013b\u0005:\u0000"+
		"\u0000\u013b\u013c\u00057\u0000\u0000\u013c\u014a\u0003,\u0016\u0000\u013d"+
		"\u013e\u0005J\u0000\u0000\u013e\u013f\u0005\u0013\u0000\u0000\u013f\u0140"+
		"\u0005\u001d\u0000\u0000\u0140\u0141\u0005>\u0000\u0000\u0141\u0142\u0005"+
		"7\u0000\u0000\u0142\u014a\u0003,\u0016\u0000\u0143\u0144\u0005J\u0000"+
		"\u0000\u0144\u0145\u0005\u0013\u0000\u0000\u0145\u0146\u0005\u001d\u0000"+
		"\u0000\u0146\u0147\u0005(\u0000\u0000\u0147\u0148\u00057\u0000\u0000\u0148"+
		"\u014a\u0003,\u0016\u0000\u0149\u0137\u0001\u0000\u0000\u0000\u0149\u013d"+
		"\u0001\u0000\u0000\u0000\u0149\u0143\u0001\u0000\u0000\u0000\u014a+\u0001"+
		"\u0000\u0000\u0000\u014b\u014e\u0003.\u0017\u0000\u014c\u014e\u0003\u0006"+
		"\u0003\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u0151\u0007\n\u0000"+
		"\u0000\u0150\u014d\u0001\u0000\u0000\u0000\u0150\u014f\u0001\u0000\u0000"+
		"\u0000\u0151\u0158\u0001\u0000\u0000\u0000\u0152\u0153\u0003\u0006\u0003"+
		"\u0000\u0153\u0154\u0007\u0007\u0000\u0000\u0154\u0156\u0001\u0000\u0000"+
		"\u0000\u0155\u0152\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0159\u0007\u000b\u0000"+
		"\u0000\u0158\u0155\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000"+
		"\u0000\u0159-\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u00b5\u0000\u0000"+
		"\u015b/\u0001\u0000\u0000\u0000\u015c\u0161\u0005)\u0000\u0000\u015d\u015e"+
		"\u0005\u001e\u0000\u0000\u015e\u015f\u0003\u0006\u0003\u0000\u015f\u0160"+
		"\u0005*\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015d\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u01621\u0001\u0000"+
		"\u0000\u0000\u0163\u0166\u0005\u001f\u0000\u0000\u0164\u0165\u0005\u001e"+
		"\u0000\u0000\u0165\u0167\u0003\u0006\u0003\u0000\u0166\u0164\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u01673\u0001\u0000\u0000"+
		"\u0000\u0168\u016b\u0005\u0018\u0000\u0000\u0169\u016a\u0005\u001e\u0000"+
		"\u0000\u016a\u016c\u0003\u0006\u0003\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c5\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0005J\u0000\u0000\u016e\u016f\u0005+\u0000\u0000\u016f\u0170"+
		"\u00057\u0000\u0000\u0170\u0171\u0003\u0006\u0003\u0000\u01717\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0005#\u0000\u0000\u0173\u0180\u0003\u0006\u0003"+
		"\u0000\u0174\u0175\u0005@\u0000\u0000\u0175\u0177\u00051\u0000\u0000\u0176"+
		"\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u00054\u0000\u0000\u0179\u0181"+
		"\u0005C\u0000\u0000\u017a\u017b\u0005@\u0000\u0000\u017b\u017d\u00051"+
		"\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u00055\u0000"+
		"\u0000\u017f\u0181\u0005\u001a\u0000\u0000\u0180\u0176\u0001\u0000\u0000"+
		"\u0000\u0180\u017c\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000"+
		"\u0000\u01819\u0001\u0000\u0000\u0000\u0182\u0183\u0005.\u0000\u0000\u0183"+
		"\u0184\u0005\u00b2\u0000\u0000\u0184;\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0005\u00b2\u0000\u0000\u0186\u0187\u0007\f\u0000\u0000\u0187\u0198\u0003"+
		"\u0006\u0003\u0000\u0188\u0189\u0005\u00b2\u0000\u0000\u0189\u018a\u0007"+
		"\r\u0000\u0000\u018a\u0198\u0003\u0006\u0003\u0000\u018b\u018c\u0005\u00b2"+
		"\u0000\u0000\u018c\u018d\u0007\u000e\u0000\u0000\u018d\u0198\u0003\u0006"+
		"\u0003\u0000\u018e\u018f\u0005\u00b2\u0000\u0000\u018f\u0190\u0007\u000f"+
		"\u0000\u0000\u0190\u0198\u0003\u0006\u0003\u0000\u0191\u0192\u0005\u00b2"+
		"\u0000\u0000\u0192\u0193\u0007\u0010\u0000\u0000\u0193\u0198\u0003\u0006"+
		"\u0003\u0000\u0194\u0195\u0005\u00b2\u0000\u0000\u0195\u0196\u0007\u0011"+
		"\u0000\u0000\u0196\u0198\u0003\u0006\u0003\u0000\u0197\u0185\u0001\u0000"+
		"\u0000\u0000\u0197\u0188\u0001\u0000\u0000\u0000\u0197\u018b\u0001\u0000"+
		"\u0000\u0000\u0197\u018e\u0001\u0000\u0000\u0000\u0197\u0191\u0001\u0000"+
		"\u0000\u0000\u0197\u0194\u0001\u0000\u0000\u0000\u0198=\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0005\n\u0000\u0000\u019a\u019b\u0005:\u0000\u0000"+
		"\u019b?\u0001\u0000\u0000\u0000\u019c\u019d\u0005/\u0000\u0000\u019d\u019e"+
		"\u0005:\u0000\u0000\u019eA\u0001\u0000\u0000\u0000\u019f\u01a0\u00050"+
		"\u0000\u0000\u01a0C\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005x\u0000\u0000"+
		"\u01a2\u01a3\u0005\u0001\u0000\u0000\u01a3\u01a4\u0003\u0006\u0003\u0000"+
		"\u01a4\u01a5\u0005\u0002\u0000\u0000\u01a5\u0249\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0005p\u0000\u0000\u01a7\u01a8\u0005\u0001\u0000\u0000\u01a8"+
		"\u01a9\u0003\u0006\u0003\u0000\u01a9\u01aa\u0005\u0002\u0000\u0000\u01aa"+
		"\u0249\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005o\u0000\u0000\u01ac\u01ad"+
		"\u0005\u0001\u0000\u0000\u01ad\u01ae\u0003\u0006\u0003\u0000\u01ae\u01af"+
		"\u0005\u0002\u0000\u0000\u01af\u0249\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0005q\u0000\u0000\u01b1\u01b2\u0005\u0001\u0000\u0000\u01b2\u01b3\u0003"+
		"\u0006\u0003\u0000\u01b3\u01b4\u0005\u0006\u0000\u0000\u01b4\u01b5\u0003"+
		"\u0006\u0003\u0000\u01b5\u01b6\u0005\u0002\u0000\u0000\u01b6\u0249\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0005m\u0000\u0000\u01b8\u01b9\u0005\u0001"+
		"\u0000\u0000\u01b9\u01ba\u0003\u0006\u0003\u0000\u01ba\u01bb\u0005\u0006"+
		"\u0000\u0000\u01bb\u01bc\u0003\u0006\u0003\u0000\u01bc\u01bd\u0005\u0002"+
		"\u0000\u0000\u01bd\u0249\u0001\u0000\u0000\u0000\u01be\u01bf\u0005g\u0000"+
		"\u0000\u01bf\u01c0\u0005\u0001\u0000\u0000\u01c0\u01c1\u0003\u0006\u0003"+
		"\u0000\u01c1\u01c2\u0005\u0006\u0000\u0000\u01c2\u01c3\u0003\u0006\u0003"+
		"\u0000\u01c3\u01c4\u0005\u0002\u0000\u0000\u01c4\u0249\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0005b\u0000\u0000\u01c6\u01c7\u0005\u0001\u0000\u0000"+
		"\u01c7\u01c8\u0003\u0006\u0003\u0000\u01c8\u01c9\u0005\u0002\u0000\u0000"+
		"\u01c9\u0249\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005w\u0000\u0000\u01cb"+
		"\u01cc\u0005\u0001\u0000\u0000\u01cc\u01cd\u0003\u0006\u0003\u0000\u01cd"+
		"\u01ce\u0005\u0002\u0000\u0000\u01ce\u0249\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0005^\u0000\u0000\u01d0\u01d6\u0005\u0001\u0000\u0000\u01d1\u01d7"+
		"\u0003\u0006\u0003\u0000\u01d2\u01d3\u0003\u0006\u0003\u0000\u01d3\u01d4"+
		"\u0005\u0006\u0000\u0000\u01d4\u01d5\u0003\u0006\u0003\u0000\u01d5\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d1\u0001\u0000\u0000\u0000\u01d6\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0005\u0002\u0000\u0000\u01d9\u0249\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0005k\u0000\u0000\u01db\u01dc\u0005\u0001\u0000\u0000\u01dc\u01dd\u0003"+
		"\u0006\u0003\u0000\u01dd\u01de\u0005\u0006\u0000\u0000\u01de\u01df\u0003"+
		"\u0006\u0003\u0000\u01df\u01e0\u0005\u0002\u0000\u0000\u01e0\u0249\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0005j\u0000\u0000\u01e2\u01e3\u0005\u0001"+
		"\u0000\u0000\u01e3\u01e4\u0003\u0006\u0003\u0000\u01e4\u01e5\u0005\u0006"+
		"\u0000\u0000\u01e5\u01e6\u0003\u0006\u0003\u0000\u01e6\u01e7\u0005\u0002"+
		"\u0000\u0000\u01e7\u0249\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005l\u0000"+
		"\u0000\u01e9\u01ef\u0005\u0001\u0000\u0000\u01ea\u01f0\u0003\u0006\u0003"+
		"\u0000\u01eb\u01ec\u0003\u0006\u0003\u0000\u01ec\u01ed\u0005\u0006\u0000"+
		"\u0000\u01ed\u01ee\u0003\u0006\u0003\u0000\u01ee\u01f0\u0001\u0000\u0000"+
		"\u0000\u01ef\u01ea\u0001\u0000\u0000\u0000\u01ef\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f1\u0249\u0005\u0002\u0000\u0000\u01f2\u01f3\u0005r\u0000\u0000"+
		"\u01f3\u01f4\u0005\u0001\u0000\u0000\u01f4\u01f5\u0003\u0006\u0003\u0000"+
		"\u01f5\u01f6\u0005\u0002\u0000\u0000\u01f6\u0249\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f8\u0005t\u0000\u0000\u01f8\u01f9\u0005\u0001\u0000\u0000\u01f9"+
		"\u01fa\u0003\u0006\u0003\u0000\u01fa\u01fb\u0005\u0002\u0000\u0000\u01fb"+
		"\u0249\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005d\u0000\u0000\u01fd\u01fe"+
		"\u0005\u0001\u0000\u0000\u01fe\u01ff\u0003\u0006\u0003\u0000\u01ff\u0200"+
		"\u0005\u0002\u0000\u0000\u0200\u0249\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u0005u\u0000\u0000\u0202\u0203\u0005\u0001\u0000\u0000\u0203\u0204\u0003"+
		"\u0006\u0003\u0000\u0204\u0205\u0005\u0002\u0000\u0000\u0205\u0249\u0001"+
		"\u0000\u0000\u0000\u0206\u0207\u0005_\u0000\u0000\u0207\u0208\u0005\u0001"+
		"\u0000\u0000\u0208\u0209\u0003\u0006\u0003\u0000\u0209\u020a\u0005\u0002"+
		"\u0000\u0000\u020a\u0249\u0001\u0000\u0000\u0000\u020b\u020c\u0005]\u0000"+
		"\u0000\u020c\u020d\u0005\u0001\u0000\u0000\u020d\u020e\u0003\u0006\u0003"+
		"\u0000\u020e\u020f\u0005\u0002\u0000\u0000\u020f\u0249\u0001\u0000\u0000"+
		"\u0000\u0210\u0211\u0005`\u0000\u0000\u0211\u0212\u0005\u0001\u0000\u0000"+
		"\u0212\u0213\u0003\u0006\u0003\u0000\u0213\u0214\u0005\u0002\u0000\u0000"+
		"\u0214\u0249\u0001\u0000\u0000\u0000\u0215\u0216\u0005a\u0000\u0000\u0216"+
		"\u0217\u0005\u0001\u0000\u0000\u0217\u0218\u0003\u0006\u0003\u0000\u0218"+
		"\u0219\u0005\u0006\u0000\u0000\u0219\u021a\u0003\u0006\u0003\u0000\u021a"+
		"\u021b\u0005\u0002\u0000\u0000\u021b\u0249\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u0005s\u0000\u0000\u021d\u021e\u0005\u0001\u0000\u0000\u021e\u021f"+
		"\u0003\u0006\u0003\u0000\u021f\u0220\u0005\u0002\u0000\u0000\u0220\u0249"+
		"\u0001\u0000\u0000\u0000\u0221\u0222\u0005c\u0000\u0000\u0222\u0223\u0005"+
		"\u0001\u0000\u0000\u0223\u0224\u0003\u0006\u0003\u0000\u0224\u0225\u0005"+
		"\u0002\u0000\u0000\u0225\u0249\u0001\u0000\u0000\u0000\u0226\u0227\u0005"+
		"v\u0000\u0000\u0227\u0228\u0005\u0001\u0000\u0000\u0228\u0229\u0003\u0006"+
		"\u0003\u0000\u0229\u022a\u0005\u0002\u0000\u0000\u022a\u0249\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0005i\u0000\u0000\u022c\u0232\u0005\u0001\u0000"+
		"\u0000\u022d\u0233\u0003\u0006\u0003\u0000\u022e\u022f\u0003\u0006\u0003"+
		"\u0000\u022f\u0230\u0005\u0006\u0000\u0000\u0230\u0231\u0003\u0006\u0003"+
		"\u0000\u0231\u0233\u0001\u0000\u0000\u0000\u0232\u022d\u0001\u0000\u0000"+
		"\u0000\u0232\u022e\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000"+
		"\u0000\u0234\u0235\u0005\u0002\u0000\u0000\u0235\u0249\u0001\u0000\u0000"+
		"\u0000\u0236\u0237\u0005f\u0000\u0000\u0237\u0238\u0005\u0001\u0000\u0000"+
		"\u0238\u0239\u0003\u0006\u0003\u0000\u0239\u023a\u0005\u0002\u0000\u0000"+
		"\u023a\u0249\u0001\u0000\u0000\u0000\u023b\u023c\u0005n\u0000\u0000\u023c"+
		"\u023d\u0005\u0001\u0000\u0000\u023d\u023e\u0003\u0006\u0003\u0000\u023e"+
		"\u023f\u0005\u0002\u0000\u0000\u023f\u0249\u0001\u0000\u0000\u0000\u0240"+
		"\u0241\u0005h\u0000\u0000\u0241\u0242\u0005\u0001\u0000\u0000\u0242\u0243"+
		"\u0005\u00b2\u0000\u0000\u0243\u0249\u0005\u0002\u0000\u0000\u0244\u0245"+
		"\u0005e\u0000\u0000\u0245\u0246\u0005\u0001\u0000\u0000\u0246\u0247\u0005"+
		"\u00b2\u0000\u0000\u0247\u0249\u0005\u0002\u0000\u0000\u0248\u01a1\u0001"+
		"\u0000\u0000\u0000\u0248\u01a6\u0001\u0000\u0000\u0000\u0248\u01ab\u0001"+
		"\u0000\u0000\u0000\u0248\u01b0\u0001\u0000\u0000\u0000\u0248\u01b7\u0001"+
		"\u0000\u0000\u0000\u0248\u01be\u0001\u0000\u0000\u0000\u0248\u01c5\u0001"+
		"\u0000\u0000\u0000\u0248\u01ca\u0001\u0000\u0000\u0000\u0248\u01cf\u0001"+
		"\u0000\u0000\u0000\u0248\u01da\u0001\u0000\u0000\u0000\u0248\u01e1\u0001"+
		"\u0000\u0000\u0000\u0248\u01e8\u0001\u0000\u0000\u0000\u0248\u01f2\u0001"+
		"\u0000\u0000\u0000\u0248\u01f7\u0001\u0000\u0000\u0000\u0248\u01fc\u0001"+
		"\u0000\u0000\u0000\u0248\u0201\u0001\u0000\u0000\u0000\u0248\u0206\u0001"+
		"\u0000\u0000\u0000\u0248\u020b\u0001\u0000\u0000\u0000\u0248\u0210\u0001"+
		"\u0000\u0000\u0000\u0248\u0215\u0001\u0000\u0000\u0000\u0248\u021c\u0001"+
		"\u0000\u0000\u0000\u0248\u0221\u0001\u0000\u0000\u0000\u0248\u0226\u0001"+
		"\u0000\u0000\u0000\u0248\u022b\u0001\u0000\u0000\u0000\u0248\u0236\u0001"+
		"\u0000\u0000\u0000\u0248\u023b\u0001\u0000\u0000\u0000\u0248\u0240\u0001"+
		"\u0000\u0000\u0000\u0248\u0244\u0001\u0000\u0000\u0000\u0249E\u0001\u0000"+
		"\u0000\u0000\u024a\u024b\u0005\u0019\u0000\u0000\u024b\u024c\u0003H$\u0000"+
		"\u024cG\u0001\u0000\u0000\u0000\u024d\u024e\u0005\u0083\u0000\u0000\u024e"+
		"\u024f\u0005\u0001\u0000\u0000\u024f\u0250\u0003\u0006\u0003\u0000\u0250"+
		"\u0251\u0005\u0006\u0000\u0000\u0251\u0252\u0003\u0006\u0003\u0000\u0252"+
		"\u0253\u0005\u0006\u0000\u0000\u0253\u0254\u0003\u0006\u0003\u0000\u0254"+
		"\u0255\u0005\u0006\u0000\u0000\u0255\u0256\u0003\u0006\u0003\u0000\u0256"+
		"\u0257\u0005\u0002\u0000\u0000\u0257\u02fd\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0005\u0081\u0000\u0000\u0259\u025a\u0005\u0001\u0000\u0000\u025a"+
		"\u025b\u0003\u0006\u0003\u0000\u025b\u025c\u0005\u0006\u0000\u0000\u025c"+
		"\u025d\u0003\u0006\u0003\u0000\u025d\u025e\u0005\u0006\u0000\u0000\u025e"+
		"\u025f\u0003\u0006\u0003\u0000\u025f\u0261\u0005\u0002\u0000\u0000\u0260"+
		"\u0262\u0005?\u0000\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0261\u0262"+
		"\u0001\u0000\u0000\u0000\u0262\u02fd\u0001\u0000\u0000\u0000\u0263\u0264"+
		"\u0005\u0082\u0000\u0000\u0264\u0265\u0005\u0001\u0000\u0000\u0265\u0266"+
		"\u0003\u0006\u0003\u0000\u0266\u0267\u0005\u0006\u0000\u0000\u0267\u0268"+
		"\u0003\u0006\u0003\u0000\u0268\u0269\u0005\u0006\u0000\u0000\u0269\u026a"+
		"\u0003\u0006\u0003\u0000\u026a\u026b\u0005\u0006\u0000\u0000\u026b\u026c"+
		"\u0003\u0006\u0003\u0000\u026c\u026e\u0005\u0002\u0000\u0000\u026d\u026f"+
		"\u0005?\u0000\u0000\u026e\u026d\u0001\u0000\u0000\u0000\u026e\u026f\u0001"+
		"\u0000\u0000\u0000\u026f\u02fd\u0001\u0000\u0000\u0000\u0270\u0271\u0005"+
		"{\u0000\u0000\u0271\u0272\u0005\u0001\u0000\u0000\u0272\u0273\u0003\u0006"+
		"\u0003\u0000\u0273\u0274\u0005\u0006\u0000\u0000\u0274\u0275\u0003\u0006"+
		"\u0003\u0000\u0275\u0276\u0005\u0006\u0000\u0000\u0276\u0277\u0003\u0006"+
		"\u0003\u0000\u0277\u0279\u0005\u0002\u0000\u0000\u0278\u027a\u0005?\u0000"+
		"\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000"+
		"\u0000\u027a\u02fd\u0001\u0000\u0000\u0000\u027b\u027c\u0005}\u0000\u0000"+
		"\u027c\u027d\u0005\u0001\u0000\u0000\u027d\u027e\u0003\u0006\u0003\u0000"+
		"\u027e\u027f\u0005\u0006\u0000\u0000\u027f\u0280\u0003\u0006\u0003\u0000"+
		"\u0280\u0281\u0005\u0006\u0000\u0000\u0281\u0282\u0003\u0006\u0003\u0000"+
		"\u0282\u0283\u0005\u0006\u0000\u0000\u0283\u0284\u0003\u0006\u0003\u0000"+
		"\u0284\u0286\u0005\u0002\u0000\u0000\u0285\u0287\u0005=\u0000\u0000\u0286"+
		"\u0285\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287"+
		"\u02fd\u0001\u0000\u0000\u0000\u0288\u0289\u0005y\u0000\u0000\u0289\u028a"+
		"\u0005\u0001\u0000\u0000\u028a\u028b\u0003\u0006\u0003\u0000\u028b\u028c"+
		"\u0005\u0006\u0000\u0000\u028c\u028d\u0003\u0006\u0003\u0000\u028d\u028e"+
		"\u0005\u0006\u0000\u0000\u028e\u028f\u0003\u0006\u0003\u0000\u028f\u0290"+
		"\u0005\u0006\u0000\u0000\u0290\u0291\u0003\u0006\u0003\u0000\u0291\u0292"+
		"\u0005\u0006\u0000\u0000\u0292\u0293\u0003\u0006\u0003\u0000\u0293\u0294"+
		"\u0005\u0006\u0000\u0000\u0294\u0297\u0003\u0006\u0003\u0000\u0295\u0296"+
		"\u0005\u0006\u0000\u0000\u0296\u0298\u0007\u0012\u0000\u0000\u0297\u0295"+
		"\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u0299"+
		"\u0001\u0000\u0000\u0000\u0299\u029b\u0005\u0002\u0000\u0000\u029a\u029c"+
		"\u0005?\u0000\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029b\u029c\u0001"+
		"\u0000\u0000\u0000\u029c\u02fd\u0001\u0000\u0000\u0000\u029d\u029e\u0005"+
		"\u0080\u0000\u0000\u029e\u029f\u0005\u0001\u0000\u0000\u029f\u02a0\u0003"+
		"\u0006\u0003\u0000\u02a0\u02a1\u0005\u0006\u0000\u0000\u02a1\u02a2\u0003"+
		"\u0006\u0003\u0000\u02a2\u02a3\u0005\u0006\u0000\u0000\u02a3\u02a4\u0003"+
		"\u0006\u0003\u0000\u02a4\u02a5\u0005\u0006\u0000\u0000\u02a5\u02a6\u0003"+
		"\u0006\u0003\u0000\u02a6\u02a7\u0005\u0006\u0000\u0000\u02a7\u02a8\u0003"+
		"\u0006\u0003\u0000\u02a8\u02aa\u0005\u0002\u0000\u0000\u02a9\u02ab\u0005"+
		"?\u0000\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000"+
		"\u0000\u0000\u02ab\u02fd\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005~\u0000"+
		"\u0000\u02ad\u02ae\u0005\u0001\u0000\u0000\u02ae\u02af\u0003\u0006\u0003"+
		"\u0000\u02af\u02b0\u0005\u0006\u0000\u0000\u02b0\u02b1\u0003\u0006\u0003"+
		"\u0000\u02b1\u02b2\u0005\u0006\u0000\u0000\u02b2\u02b3\u0003\u0006\u0003"+
		"\u0000\u02b3\u02b4\u0005\u0006\u0000\u0000\u02b4\u02b5\u0003\u0006\u0003"+
		"\u0000\u02b5\u02b6\u0005\u0006\u0000\u0000\u02b6\u02b7\u0003\u0006\u0003"+
		"\u0000\u02b7\u02b9\u0005\u0002\u0000\u0000\u02b8\u02ba\u0005=\u0000\u0000"+
		"\u02b9\u02b8\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000"+
		"\u02ba\u02fd\u0001\u0000\u0000\u0000\u02bb\u02bc\u0005\u007f\u0000\u0000"+
		"\u02bc\u02bd\u0005\u0001\u0000\u0000\u02bd\u02be\u0003\u0006\u0003\u0000"+
		"\u02be\u02bf\u0005\u0006\u0000\u0000\u02bf\u02c0\u0003\u0006\u0003\u0000"+
		"\u02c0\u02c1\u0005\u0006\u0000\u0000\u02c1\u02c2\u0003\u0006\u0003\u0000"+
		"\u02c2\u02c3\u0005\u0006\u0000\u0000\u02c3\u02c4\u0003\u0006\u0003\u0000"+
		"\u02c4\u02c5\u0005\u0006\u0000\u0000\u02c5\u02c6\u0003\u0006\u0003\u0000"+
		"\u02c6\u02c7\u0005\u0006\u0000\u0000\u02c7\u02cf\u0003\u0006\u0003\u0000"+
		"\u02c8\u02c9\u0005\u0006\u0000\u0000\u02c9\u02ca\u0003\u0006\u0003\u0000"+
		"\u02ca\u02cb\u0005\u0006\u0000\u0000\u02cb\u02cc\u0003\u0006\u0003\u0000"+
		"\u02cc\u02ce\u0001\u0000\u0000\u0000\u02cd\u02c8\u0001\u0000\u0000\u0000"+
		"\u02ce\u02d1\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000"+
		"\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0\u02d2\u0001\u0000\u0000\u0000"+
		"\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d2\u02d4\u0005\u0002\u0000\u0000"+
		"\u02d3\u02d5\u0005?\u0000\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d5\u02fd\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d7\u0005|\u0000\u0000\u02d7\u02d8\u0005\u0001\u0000\u0000\u02d8\u02d9"+
		"\u0003\u0006\u0003\u0000\u02d9\u02da\u0005\u0006\u0000\u0000\u02da\u02db"+
		"\u0003\u0006\u0003\u0000\u02db\u02dc\u0005\u0006\u0000\u0000\u02dc\u02dd"+
		"\u0003\u0006\u0003\u0000\u02dd\u02de\u0005\u0006\u0000\u0000\u02de\u02df"+
		"\u0003\u0006\u0003\u0000\u02df\u02e0\u0005\u0006\u0000\u0000\u02e0\u02e1"+
		"\u0003\u0006\u0003\u0000\u02e1\u02e2\u0005\u0006\u0000\u0000\u02e2\u02e3"+
		"\u0003\u0006\u0003\u0000\u02e3\u02e5\u0005\u0002\u0000\u0000\u02e4\u02e6"+
		"\u0005=\u0000\u0000\u02e5\u02e4\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001"+
		"\u0000\u0000\u0000\u02e6\u02fd\u0001\u0000\u0000\u0000\u02e7\u02e8\u0005"+
		"z\u0000\u0000\u02e8\u02e9\u0005\u0001\u0000\u0000\u02e9\u02ea\u0003\u0006"+
		"\u0003\u0000\u02ea\u02eb\u0005\u0006\u0000\u0000\u02eb\u02ec\u0003\u0006"+
		"\u0003\u0000\u02ec\u02ed\u0005\u0006\u0000\u0000\u02ed\u02ee\u0003\u0006"+
		"\u0003\u0000\u02ee\u02ef\u0005\u0006\u0000\u0000\u02ef\u02f0\u0003\u0006"+
		"\u0003\u0000\u02f0\u02f1\u0005\u0006\u0000\u0000\u02f1\u02f2\u0003\u0006"+
		"\u0003\u0000\u02f2\u02f3\u0005\u0006\u0000\u0000\u02f3\u02f4\u0003\u0006"+
		"\u0003\u0000\u02f4\u02f5\u0005\u0006\u0000\u0000\u02f5\u02f6\u0003\u0006"+
		"\u0003\u0000\u02f6\u02f7\u0005\u0006\u0000\u0000\u02f7\u02f8\u0003\u0006"+
		"\u0003\u0000\u02f8\u02fa\u0005\u0002\u0000\u0000\u02f9\u02fb\u0005=\u0000"+
		"\u0000\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fd\u0001\u0000\u0000\u0000\u02fc\u024d\u0001\u0000\u0000"+
		"\u0000\u02fc\u0258\u0001\u0000\u0000\u0000\u02fc\u0263\u0001\u0000\u0000"+
		"\u0000\u02fc\u0270\u0001\u0000\u0000\u0000\u02fc\u027b\u0001\u0000\u0000"+
		"\u0000\u02fc\u0288\u0001\u0000\u0000\u0000\u02fc\u029d\u0001\u0000\u0000"+
		"\u0000\u02fc\u02ac\u0001\u0000\u0000\u0000\u02fc\u02bb\u0001\u0000\u0000"+
		"\u0000\u02fc\u02d6\u0001\u0000\u0000\u0000\u02fc\u02e7\u0001\u0000\u0000"+
		"\u0000\u02fdI\u0001\u0000\u0000\u0000\u02fe\u02ff\u0005\u0019\u0000\u0000"+
		"\u02ff\u0301\u0005\u000e\u0000\u0000\u0300\u0302\u0005?\u0000\u0000\u0301"+
		"\u0300\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302"+
		"\u0303\u0001\u0000\u0000\u0000\u0303\u0307\u0005\u0003\u0000\u0000\u0304"+
		"\u0305\u0003L&\u0000\u0305\u0306\u0005\u00b1\u0000\u0000\u0306\u0308\u0001"+
		"\u0000\u0000\u0000\u0307\u0304\u0001\u0000\u0000\u0000\u0308\u0309\u0001"+
		"\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000\u0309\u030a\u0001"+
		"\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u030c\u0005"+
		"\u0004\u0000\u0000\u030cK\u0001\u0000\u0000\u0000\u030d\u030e\u00052\u0000"+
		"\u0000\u030e\u030f\u0005\f\u0000\u0000\u030f\u0310\u0005\u0001\u0000\u0000"+
		"\u0310\u0311\u0003\u0006\u0003\u0000\u0311\u0312\u0005\u0006\u0000\u0000"+
		"\u0312\u0313\u0003\u0006\u0003\u0000\u0313\u0314\u0005\u0002\u0000\u0000"+
		"\u0314\u033d\u0001\u0000\u0000\u0000\u0315\u0316\u00051\u0000\u0000\u0316"+
		"\u0317\u0005\f\u0000\u0000\u0317\u0318\u0005\u0001\u0000\u0000\u0318\u0319"+
		"\u0003\u0006\u0003\u0000\u0319\u031a\u0005\u0006\u0000\u0000\u031a\u031b"+
		"\u0003\u0006\u0003\u0000\u031b\u031c\u0005\u0002\u0000\u0000\u031c\u033d"+
		"\u0001\u0000\u0000\u0000\u031d\u031e\u0005\u0015\u0000\u0000\u031e\u031f"+
		"\u0005A\u0000\u0000\u031f\u0320\u0005\f\u0000\u0000\u0320\u0321\u0005"+
		"\u0001\u0000\u0000\u0321\u0322\u0003\u0006\u0003\u0000\u0322\u0323\u0005"+
		"\u0006\u0000\u0000\u0323\u0324\u0003\u0006\u0003\u0000\u0324\u0325\u0005"+
		"\u0006\u0000\u0000\u0325\u0326\u0003\u0006\u0003\u0000\u0326\u0327\u0005"+
		"\u0006\u0000\u0000\u0327\u0328\u0003\u0006\u0003\u0000\u0328\u0329\u0005"+
		"\u0002\u0000\u0000\u0329\u033d\u0001\u0000\u0000\u0000\u032a\u032b\u0005"+
		"\u0015\u0000\u0000\u032b\u032c\u0005\u0014\u0000\u0000\u032c\u032d\u0005"+
		"\f\u0000\u0000\u032d\u032e\u0005\u0001\u0000\u0000\u032e\u032f\u0003\u0006"+
		"\u0003\u0000\u032f\u0330\u0005\u0006\u0000\u0000\u0330\u0331\u0003\u0006"+
		"\u0003\u0000\u0331\u0332\u0005\u0006\u0000\u0000\u0332\u0333\u0003\u0006"+
		"\u0003\u0000\u0333\u0334\u0005\u0006\u0000\u0000\u0334\u0335\u0003\u0006"+
		"\u0003\u0000\u0335\u0336\u0005\u0006\u0000\u0000\u0336\u0337\u0003\u0006"+
		"\u0003\u0000\u0337\u0338\u0005\u0006\u0000\u0000\u0338\u0339\u0003\u0006"+
		"\u0003\u0000\u0339\u033a\u0005\u0002\u0000\u0000\u033a\u033d\u0001\u0000"+
		"\u0000\u0000\u033b\u033d\u0005&\u0000\u0000\u033c\u030d\u0001\u0000\u0000"+
		"\u0000\u033c\u0315\u0001\u0000\u0000\u0000\u033c\u031d\u0001\u0000\u0000"+
		"\u0000\u033c\u032a\u0001\u0000\u0000\u0000\u033c\u033b\u0001\u0000\u0000"+
		"\u0000\u033dM\u0001\u0000\u0000\u0000\u033e\u033f\u0005H\u0000\u0000\u033f"+
		"\u0340\u0005\u00b1\u0000\u0000\u0340\u0341\u0007\u0013\u0000\u0000\u0341"+
		"O\u0001\u0000\u0000\u0000\u0342\u0343\u0005\'\u0000\u0000\u0343\u0344"+
		"\u0005\u0001\u0000\u0000\u0344\u0349\u0005\u00b7\u0000\u0000\u0345\u0346"+
		"\u0005\u0006\u0000\u0000\u0346\u0348\u0003\u0006\u0003\u0000\u0347\u0345"+
		"\u0001\u0000\u0000\u0000\u0348\u034b\u0001\u0000\u0000\u0000\u0349\u0347"+
		"\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034c"+
		"\u0001\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034c\u034d"+
		"\u0005\u0002\u0000\u0000\u034dQ\u0001\u0000\u0000\u0000;U_qx~\u0081\u0088"+
		"\u0090\u009a\u00a6\u00b0\u00b4\u00bd\u00c9\u00d2\u00dc\u00e3\u00e5\u00ef"+
		"\u00f8\u00fe\u0105\u0118\u011e\u012b\u0135\u0149\u014d\u0150\u0155\u0158"+
		"\u0161\u0166\u016b\u0176\u017c\u0180\u0197\u01d6\u01ef\u0232\u0248\u0261"+
		"\u026e\u0279\u0286\u0297\u029b\u02aa\u02b9\u02cf\u02d4\u02e5\u02fa\u02fc"+
		"\u0301\u0309\u033c\u0349";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}