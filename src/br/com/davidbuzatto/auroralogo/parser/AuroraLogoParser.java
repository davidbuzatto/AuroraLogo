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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, VA=7, PARA=8, PARR=9, 
		CONT=10, EM=11, DIR=12, ESQ=13, CIM=14, BAI=15, TROC=16, COR=17, DO=18, 
		DESE=19, FUN=20, GIR=21, GRA=22, ENG=23, DES=24, GROS=25, ESC=26, LER=27, 
		ABA=28, LEV=29, PINC=30, PREE=31, LIM=32, SE=33, ENT=34, SEN=35, ENQ=36, 
		REP=37, VEZ=38, VEZS=39, NA=40, SAI=41, INCM=42, DCMM=43, SOMM=44, SUBM=45, 
		MULM=46, DIVM=47, POR=48, DE=49, COM=50, PI=51, VER=52, FAL=53, PRETO=54, 
		AZUL=55, CIANO=56, CINZA=57, VERDE=58, MAGENTA=59, LARANJA=60, ROSA=61, 
		VERMELHO=62, BRANCO=63, AMARELO=64, ESCURO=65, CLARO=66, F_VABS=67, F_RAIQ=68, 
		F_RAIC=69, F_RAIZ=70, F_POTE=71, F_HIPO=72, F_CHAO=73, F_TETO=74, F_ARRE=75, 
		F_MINI=76, F_MAXI=77, F_NUMA=78, F_SEME=79, F_SENO=80, F_COSS=81, F_TANG=82, 
		F_ASEN=83, F_ACOS=84, F_ATAN=85, F_CAPO=86, F_SENH=87, F_COSH=88, F_TANH=89, 
		F_LOGA=90, F_GRRA=91, F_RAGR=92, F_INC=93, F_DCM=94, FG_LIN=95, FG_QUA=96, 
		FG_RET=97, FG_CIC=98, FG_ELI=99, FG_POR=100, FG_EST=101, FG_POL=102, FG_CQD=103, 
		FG_CCU=104, FG_PHI=105, FG_PHM=106, FG_PHL=107, FG_PHQ=108, FG_PHC=109, 
		FG_PHF=110, ATR=111, ATRA=112, AC_A=113, AT_A=114, AC_S=115, AT_S=116, 
		AC_M=117, AT_M=118, AC_D=119, AT_D=120, AC_R=121, AT_R=122, ADI=123, ADIA=124, 
		SUB=125, SUBA=126, MUL=127, DIV=128, DIVA=129, MOD=130, MODA=131, IGU=132, 
		IGUT=133, IGUA=134, DIF=135, DIFT=136, DIFA=137, ME=138, MET=139, MEA=140, 
		MEI=141, MEIT=142, MEIA=143, MA=144, MAT=145, MAA=146, MAI=147, MAIT=148, 
		MAIA=149, ELG=150, ELGT=151, OLG=152, OLGT=153, NAO=154, NAOT=155, DOT=156, 
		ID=157, INT=158, DEC=159, HEX=160, CHAR=161, STRING=162, COMENTARIO=163, 
		COMENTARIO_LINHA=164, WS=165;
	public static final int
		RULE_prog = 0, RULE_inst = 1, RULE_ains = 2, RULE_expr = 3, RULE_relacao = 4, 
		RULE_exprSimp = 5, RULE_termo = 6, RULE_fator = 7, RULE_exprBool = 8, 
		RULE_bool = 9, RULE_se = 10, RULE_seSe = 11, RULE_seSenaoSe = 12, RULE_seSenaoSeP = 13, 
		RULE_seSenao = 14, RULE_repetir = 15, RULE_repetirEnquanto = 16, RULE_parar = 17, 
		RULE_continuar = 18, RULE_movimentar = 19, RULE_trocarCor = 20, RULE_configuracaoCor = 21, 
		RULE_girar = 22, RULE_engrossar = 23, RULE_desengrossar = 24, RULE_trocarGrossura = 25, 
		RULE_escrever = 26, RULE_ler = 27, RULE_atribuir = 28, RULE_abaixar = 29, 
		RULE_levantar = 30, RULE_limpar = 31, RULE_funcaoMatematica = 32, RULE_instrucaoGeometrica = 33, 
		RULE_desenhar = 34, RULE_funcaoGeometrica = 35, RULE_criarCaminho = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "inst", "ains", "expr", "relacao", "exprSimp", "termo", "fator", 
			"exprBool", "bool", "se", "seSe", "seSenaoSe", "seSenaoSeP", "seSenao", 
			"repetir", "repetirEnquanto", "parar", "continuar", "movimentar", "trocarCor", 
			"configuracaoCor", "girar", "engrossar", "desengrossar", "trocarGrossura", 
			"escrever", "ler", "atribuir", "abaixar", "levantar", "limpar", "funcaoMatematica", 
			"instrucaoGeometrica", "desenhar", "funcaoGeometrica", "criarCaminho"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "'()'", "'v\\u00E1'", "'para'", 
			"'parar'", "'continuar'", "'em'", "'direita'", "'esquerda'", "'cima'", 
			"'baixo'", "'trocar'", "'cor'", "'do'", "'desenhar'", "'fundo'", "'girar'", 
			"'graus'", "'engrossar'", "'desengrossar'", "'grossura'", "'escrever'", 
			"'ler'", "'abaixar'", "'levantar'", "'pincel'", "'preenchimento'", "'limpar'", 
			"'se'", "'ent\\u00E3o'", "'sen\\u00E3o'", "'enquanto'", "'repetir'", 
			"'vez'", "'vezes'", "'na'", "'sa\\u00EDda'", "'incrementando'", "'decrementando'", 
			"'somando'", "'subtraindo'", "'multiplicando'", "'dividindo'", "'por'", 
			"'de'", "'com'", "'PI'", "'VERDADEIRO'", "'FALSO'", "'preto'", "'azul'", 
			"'ciano'", "'cinza'", "'verde'", "'magenta'", "'laranja'", "'rosa'", 
			"'vermelho'", "'branco'", "'amarelo'", "'escuro'", "'claro'", "'valorAbsoluto'", 
			"'raizQuadrada'", "'raizC\\u00FAbica'", "'raiz'", "'pot\\u00EAncia'", 
			"'hipotenusa'", "'ch\\u00E3o'", "'teto'", "'arredondar'", "'m\\u00EDnimo'", 
			"'m\\u00E1ximo'", "'n\\u00FAmeroAleat\\u00F3rio'", "'definirSementeAleat\\u00F3ria'", 
			"'seno'", "'cosseno'", "'tangente'", "'arcoSeno'", "'arcoCosseno'", "'arcoTangente'", 
			"'cartesianoParaPolar'", "'senoHiperb\\u00F3lico'", "'cossenoHiperb\\u00F3lico'", 
			"'tangenteHiperb\\u00F3lica'", "'logar\\u00EDtmo'", "'grausParaRadianos'", 
			"'radianosParaGraus'", "'incrementar'", "'decrementar'", "'linha'", "'quadrado'", 
			"'ret\\u00E2ngulo'", "'c\\u00EDrculo'", "'elipse'", "'pol\\u00EDgonoRegular'", 
			"'estrela'", "'pol\\u00EDgono'", "'curvaQuadr\\u00E1tica'", "'curvaC\\u00FAbica'", 
			"'iniciarCaminho'", "'moverAt\\u00E9'", "'linhaAt\\u00E9'", "'curvaQuadr\\u00E1ticaAt\\u00E9'", 
			"'curvaC\\u00FAbicaAt\\u00E9'", "'fecharCaminho'", "'='", "'<-'", "'+='", 
			"'+<-'", "'-='", "'-<-'", "'*='", "'*<-'", "'/='", "'/<-'", "'%='", "'%<-'", 
			"'+'", "'mais'", "'-'", "'menos'", "'*'", "'/'", "'dividido por'", "'%'", 
			"'resto'", "'=='", "'\\u00E9 igual a'", "'n\\u00E3o \\u00E9 diferente de'", 
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
			null, null, null, null, null, null, null, "VA", "PARA", "PARR", "CONT", 
			"EM", "DIR", "ESQ", "CIM", "BAI", "TROC", "COR", "DO", "DESE", "FUN", 
			"GIR", "GRA", "ENG", "DES", "GROS", "ESC", "LER", "ABA", "LEV", "PINC", 
			"PREE", "LIM", "SE", "ENT", "SEN", "ENQ", "REP", "VEZ", "VEZS", "NA", 
			"SAI", "INCM", "DCMM", "SOMM", "SUBM", "MULM", "DIVM", "POR", "DE", "COM", 
			"PI", "VER", "FAL", "PRETO", "AZUL", "CIANO", "CINZA", "VERDE", "MAGENTA", 
			"LARANJA", "ROSA", "VERMELHO", "BRANCO", "AMARELO", "ESCURO", "CLARO", 
			"F_VABS", "F_RAIQ", "F_RAIC", "F_RAIZ", "F_POTE", "F_HIPO", "F_CHAO", 
			"F_TETO", "F_ARRE", "F_MINI", "F_MAXI", "F_NUMA", "F_SEME", "F_SENO", 
			"F_COSS", "F_TANG", "F_ASEN", "F_ACOS", "F_ATAN", "F_CAPO", "F_SENH", 
			"F_COSH", "F_TANH", "F_LOGA", "F_GRRA", "F_RAGR", "F_INC", "F_DCM", "FG_LIN", 
			"FG_QUA", "FG_RET", "FG_CIC", "FG_ELI", "FG_POR", "FG_EST", "FG_POL", 
			"FG_CQD", "FG_CCU", "FG_PHI", "FG_PHM", "FG_PHL", "FG_PHQ", "FG_PHC", 
			"FG_PHF", "ATR", "ATRA", "AC_A", "AT_A", "AC_S", "AT_S", "AC_M", "AT_M", 
			"AC_D", "AT_D", "AC_R", "AT_R", "ADI", "ADIA", "SUB", "SUBA", "MUL", 
			"DIV", "DIVA", "MOD", "MODA", "IGU", "IGUT", "IGUA", "DIF", "DIFT", "DIFA", 
			"ME", "MET", "MEA", "MEI", "MEIT", "MEIA", "MA", "MAT", "MAA", "MAI", 
			"MAIT", "MAIA", "ELG", "ELGT", "OLG", "OLGT", "NAO", "NAOT", "DOT", "ID", 
			"INT", "DEC", "HEX", "CHAR", "STRING", "COMENTARIO", "COMENTARIO_LINHA", 
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
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				inst();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VA) | (1L << PARR) | (1L << CONT) | (1L << TROC) | (1L << DESE) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP) | (1L << PI) | (1L << VER) | (1L << FAL))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (F_VABS - 67)) | (1L << (F_RAIQ - 67)) | (1L << (F_RAIC - 67)) | (1L << (F_RAIZ - 67)) | (1L << (F_POTE - 67)) | (1L << (F_HIPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_TETO - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_MINI - 67)) | (1L << (F_MAXI - 67)) | (1L << (F_NUMA - 67)) | (1L << (F_SEME - 67)) | (1L << (F_SENO - 67)) | (1L << (F_COSS - 67)) | (1L << (F_TANG - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_SENH - 67)) | (1L << (F_COSH - 67)) | (1L << (F_TANH - 67)) | (1L << (F_LOGA - 67)) | (1L << (F_GRRA - 67)) | (1L << (F_RAGR - 67)) | (1L << (F_INC - 67)) | (1L << (F_DCM - 67)) | (1L << (FG_PHI - 67)) | (1L << (FG_PHM - 67)) | (1L << (FG_PHL - 67)) | (1L << (FG_PHQ - 67)) | (1L << (FG_PHC - 67)) | (1L << (FG_PHF - 67)) | (1L << (ADI - 67)) | (1L << (ADIA - 67)) | (1L << (SUB - 67)) | (1L << (SUBA - 67)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (NAO - 154)) | (1L << (NAOT - 154)) | (1L << (ID - 154)) | (1L << (INT - 154)) | (1L << (DEC - 154)) | (1L << (CHAR - 154)) | (1L << (STRING - 154)))) != 0) );
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				ains();
				setState(80);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				se();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				repetir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				movimentar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				trocarCor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				girar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				engrossar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				desengrossar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				trocarGrossura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				instrucaoGeometrica();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				escrever();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				ler();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(96);
				atribuir();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(97);
				abaixar();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(98);
				levantar();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(99);
				limpar();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(100);
				expr();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(101);
				parar();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(102);
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
			setState(105);
			relacao();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (ELG - 150)) | (1L << (ELGT - 150)) | (1L << (OLG - 150)) | (1L << (OLGT - 150)))) != 0)) {
				{
				{
				setState(106);
				_la = _input.LA(1);
				if ( !(((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (ELG - 150)) | (1L << (ELGT - 150)) | (1L << (OLG - 150)) | (1L << (OLGT - 150)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(107);
				relacao();
				}
				}
				setState(112);
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
			setState(113);
			exprSimp();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (IGU - 132)) | (1L << (IGUT - 132)) | (1L << (IGUA - 132)) | (1L << (DIF - 132)) | (1L << (DIFT - 132)) | (1L << (DIFA - 132)) | (1L << (ME - 132)) | (1L << (MET - 132)) | (1L << (MEA - 132)) | (1L << (MEI - 132)) | (1L << (MEIT - 132)) | (1L << (MEIA - 132)) | (1L << (MA - 132)) | (1L << (MAT - 132)) | (1L << (MAA - 132)) | (1L << (MAI - 132)) | (1L << (MAIT - 132)) | (1L << (MAIA - 132)))) != 0)) {
				{
				setState(114);
				((RelacaoContext)_localctx).opRel = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (IGU - 132)) | (1L << (IGUT - 132)) | (1L << (IGUA - 132)) | (1L << (DIF - 132)) | (1L << (DIFT - 132)) | (1L << (DIFA - 132)) | (1L << (ME - 132)) | (1L << (MET - 132)) | (1L << (MEA - 132)) | (1L << (MEI - 132)) | (1L << (MEIT - 132)) | (1L << (MEIA - 132)) | (1L << (MA - 132)) | (1L << (MAT - 132)) | (1L << (MAA - 132)) | (1L << (MAI - 132)) | (1L << (MAIT - 132)) | (1L << (MAIA - 132)))) != 0)) ) {
					((RelacaoContext)_localctx).opRel = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(115);
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
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ADI - 123)) | (1L << (ADIA - 123)) | (1L << (SUB - 123)) | (1L << (SUBA - 123)))) != 0)) {
				{
				setState(118);
				((ExprSimpContext)_localctx).opNeg = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ADI - 123)) | (1L << (ADIA - 123)) | (1L << (SUB - 123)) | (1L << (SUBA - 123)))) != 0)) ) {
					((ExprSimpContext)_localctx).opNeg = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(121);
			termo();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ADI - 123)) | (1L << (ADIA - 123)) | (1L << (SUB - 123)) | (1L << (SUBA - 123)))) != 0)) {
				{
				{
				setState(122);
				_la = _input.LA(1);
				if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ADI - 123)) | (1L << (ADIA - 123)) | (1L << (SUB - 123)) | (1L << (SUBA - 123)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(123);
				termo();
				}
				}
				setState(128);
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
			setState(129);
			fator();
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					_la = _input.LA(1);
					if ( !(_la==VEZS || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (MUL - 127)) | (1L << (DIV - 127)) | (1L << (DIVA - 127)) | (1L << (MOD - 127)) | (1L << (MODA - 127)))) != 0)) ) {
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
					} 
				}
				setState(136);
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAO:
			case NAOT:
				_localctx = new FatorNaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NAOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(138);
				fator();
				}
				break;
			case INT:
				_localctx = new FatorIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(INT);
				}
				break;
			case DEC:
				_localctx = new FatorDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(DEC);
				}
				break;
			case PI:
				_localctx = new FatorPiContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(PI);
				}
				break;
			case VER:
			case FAL:
			case ID:
				_localctx = new FatorIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VER:
				case FAL:
					{
					setState(142);
					bool();
					}
					break;
				case ID:
					{
					setState(143);
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
				setState(146);
				match(CHAR);
				}
				break;
			case STRING:
				_localctx = new FatorStringContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
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
			case F_INC:
			case F_DCM:
				_localctx = new FatorFuncaoMatematicaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(148);
				funcaoMatematica();
				}
				break;
			case T__0:
				_localctx = new FatorParentesesContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(149);
				match(T__0);
				setState(150);
				expr();
				setState(151);
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
			setState(155);
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
			setState(157);
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
			setState(159);
			seSe();
			setState(160);
			seSenaoSe();
			setState(161);
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
			setState(163);
			match(SE);
			setState(164);
			exprBool();
			setState(165);
			match(ENT);
			setState(166);
			match(T__2);
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				inst();
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VA) | (1L << PARR) | (1L << CONT) | (1L << TROC) | (1L << DESE) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP) | (1L << PI) | (1L << VER) | (1L << FAL))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (F_VABS - 67)) | (1L << (F_RAIQ - 67)) | (1L << (F_RAIC - 67)) | (1L << (F_RAIZ - 67)) | (1L << (F_POTE - 67)) | (1L << (F_HIPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_TETO - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_MINI - 67)) | (1L << (F_MAXI - 67)) | (1L << (F_NUMA - 67)) | (1L << (F_SEME - 67)) | (1L << (F_SENO - 67)) | (1L << (F_COSS - 67)) | (1L << (F_TANG - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_SENH - 67)) | (1L << (F_COSH - 67)) | (1L << (F_TANH - 67)) | (1L << (F_LOGA - 67)) | (1L << (F_GRRA - 67)) | (1L << (F_RAGR - 67)) | (1L << (F_INC - 67)) | (1L << (F_DCM - 67)) | (1L << (FG_PHI - 67)) | (1L << (FG_PHM - 67)) | (1L << (FG_PHL - 67)) | (1L << (FG_PHQ - 67)) | (1L << (FG_PHC - 67)) | (1L << (FG_PHF - 67)) | (1L << (ADI - 67)) | (1L << (ADIA - 67)) | (1L << (SUB - 67)) | (1L << (SUBA - 67)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (NAO - 154)) | (1L << (NAOT - 154)) | (1L << (ID - 154)) | (1L << (INT - 154)) | (1L << (DEC - 154)) | (1L << (CHAR - 154)) | (1L << (STRING - 154)))) != 0) );
			setState(172);
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
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					seSenaoSeP();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(180);
			match(SEN);
			setState(181);
			match(SE);
			setState(182);
			exprBool();
			setState(183);
			match(ENT);
			setState(184);
			match(T__2);
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				inst();
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VA) | (1L << PARR) | (1L << CONT) | (1L << TROC) | (1L << DESE) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP) | (1L << PI) | (1L << VER) | (1L << FAL))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (F_VABS - 67)) | (1L << (F_RAIQ - 67)) | (1L << (F_RAIC - 67)) | (1L << (F_RAIZ - 67)) | (1L << (F_POTE - 67)) | (1L << (F_HIPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_TETO - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_MINI - 67)) | (1L << (F_MAXI - 67)) | (1L << (F_NUMA - 67)) | (1L << (F_SEME - 67)) | (1L << (F_SENO - 67)) | (1L << (F_COSS - 67)) | (1L << (F_TANG - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_SENH - 67)) | (1L << (F_COSH - 67)) | (1L << (F_TANH - 67)) | (1L << (F_LOGA - 67)) | (1L << (F_GRRA - 67)) | (1L << (F_RAGR - 67)) | (1L << (F_INC - 67)) | (1L << (F_DCM - 67)) | (1L << (FG_PHI - 67)) | (1L << (FG_PHM - 67)) | (1L << (FG_PHL - 67)) | (1L << (FG_PHQ - 67)) | (1L << (FG_PHC - 67)) | (1L << (FG_PHF - 67)) | (1L << (ADI - 67)) | (1L << (ADIA - 67)) | (1L << (SUB - 67)) | (1L << (SUBA - 67)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (NAO - 154)) | (1L << (NAOT - 154)) | (1L << (ID - 154)) | (1L << (INT - 154)) | (1L << (DEC - 154)) | (1L << (CHAR - 154)) | (1L << (STRING - 154)))) != 0) );
			setState(190);
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
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEN) {
				{
				setState(192);
				match(SEN);
				setState(193);
				match(T__2);
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(194);
					inst();
					}
					}
					setState(197); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VA) | (1L << PARR) | (1L << CONT) | (1L << TROC) | (1L << DESE) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP) | (1L << PI) | (1L << VER) | (1L << FAL))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (F_VABS - 67)) | (1L << (F_RAIQ - 67)) | (1L << (F_RAIC - 67)) | (1L << (F_RAIZ - 67)) | (1L << (F_POTE - 67)) | (1L << (F_HIPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_TETO - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_MINI - 67)) | (1L << (F_MAXI - 67)) | (1L << (F_NUMA - 67)) | (1L << (F_SEME - 67)) | (1L << (F_SENO - 67)) | (1L << (F_COSS - 67)) | (1L << (F_TANG - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_SENH - 67)) | (1L << (F_COSH - 67)) | (1L << (F_TANH - 67)) | (1L << (F_LOGA - 67)) | (1L << (F_GRRA - 67)) | (1L << (F_RAGR - 67)) | (1L << (F_INC - 67)) | (1L << (F_DCM - 67)) | (1L << (FG_PHI - 67)) | (1L << (FG_PHM - 67)) | (1L << (FG_PHL - 67)) | (1L << (FG_PHQ - 67)) | (1L << (FG_PHC - 67)) | (1L << (FG_PHF - 67)) | (1L << (ADI - 67)) | (1L << (ADIA - 67)) | (1L << (SUB - 67)) | (1L << (SUBA - 67)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (NAO - 154)) | (1L << (NAOT - 154)) | (1L << (ID - 154)) | (1L << (INT - 154)) | (1L << (DEC - 154)) | (1L << (CHAR - 154)) | (1L << (STRING - 154)))) != 0) );
				setState(199);
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
			setState(203);
			match(REP);
			setState(204);
			expr();
			setState(205);
			_la = _input.LA(1);
			if ( !(_la==VEZ || _la==VEZS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VA) | (1L << PARR) | (1L << CONT) | (1L << TROC) | (1L << DESE) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP) | (1L << PI) | (1L << VER) | (1L << FAL))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (F_VABS - 67)) | (1L << (F_RAIQ - 67)) | (1L << (F_RAIC - 67)) | (1L << (F_RAIZ - 67)) | (1L << (F_POTE - 67)) | (1L << (F_HIPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_TETO - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_MINI - 67)) | (1L << (F_MAXI - 67)) | (1L << (F_NUMA - 67)) | (1L << (F_SEME - 67)) | (1L << (F_SENO - 67)) | (1L << (F_COSS - 67)) | (1L << (F_TANG - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_SENH - 67)) | (1L << (F_COSH - 67)) | (1L << (F_TANH - 67)) | (1L << (F_LOGA - 67)) | (1L << (F_GRRA - 67)) | (1L << (F_RAGR - 67)) | (1L << (F_INC - 67)) | (1L << (F_DCM - 67)) | (1L << (FG_PHI - 67)) | (1L << (FG_PHM - 67)) | (1L << (FG_PHL - 67)) | (1L << (FG_PHQ - 67)) | (1L << (FG_PHC - 67)) | (1L << (FG_PHF - 67)) | (1L << (ADI - 67)) | (1L << (ADIA - 67)) | (1L << (SUB - 67)) | (1L << (SUBA - 67)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (NAO - 154)) | (1L << (NAOT - 154)) | (1L << (ID - 154)) | (1L << (INT - 154)) | (1L << (DEC - 154)) | (1L << (CHAR - 154)) | (1L << (STRING - 154)))) != 0) );
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
		enterRule(_localctx, 32, RULE_repetirEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENQ) {
				{
				setState(214);
				match(ENQ);
				setState(215);
				exprBool();
				}
			}

			setState(218);
			match(REP);
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCM:
			case DCMM:
				{
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==INCM || _la==DCMM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(220);
				match(ID);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EM) {
					{
					setState(221);
					match(EM);
					setState(222);
					expr();
					}
				}

				}
				break;
			case SOMM:
				{
				setState(225);
				match(SOMM);
				setState(226);
				match(ID);
				setState(227);
				match(COM);
				setState(228);
				expr();
				}
				break;
			case MULM:
				{
				setState(229);
				match(MULM);
				setState(230);
				match(ID);
				setState(231);
				match(POR);
				setState(232);
				expr();
				}
				break;
			case DIVM:
				{
				setState(233);
				match(DIVM);
				setState(234);
				match(ID);
				setState(235);
				match(POR);
				setState(236);
				expr();
				}
				break;
			case SUBM:
				{
				setState(237);
				match(SUBM);
				setState(238);
				expr();
				setState(239);
				match(DE);
				setState(240);
				match(ID);
				}
				break;
			case T__2:
				break;
			default:
				break;
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << VA) | (1L << PARR) | (1L << CONT) | (1L << TROC) | (1L << DESE) | (1L << GIR) | (1L << ENG) | (1L << DES) | (1L << ESC) | (1L << LER) | (1L << ABA) | (1L << LEV) | (1L << LIM) | (1L << SE) | (1L << ENQ) | (1L << REP) | (1L << PI) | (1L << VER) | (1L << FAL))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (F_VABS - 67)) | (1L << (F_RAIQ - 67)) | (1L << (F_RAIC - 67)) | (1L << (F_RAIZ - 67)) | (1L << (F_POTE - 67)) | (1L << (F_HIPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_TETO - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_MINI - 67)) | (1L << (F_MAXI - 67)) | (1L << (F_NUMA - 67)) | (1L << (F_SEME - 67)) | (1L << (F_SENO - 67)) | (1L << (F_COSS - 67)) | (1L << (F_TANG - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_SENH - 67)) | (1L << (F_COSH - 67)) | (1L << (F_TANH - 67)) | (1L << (F_LOGA - 67)) | (1L << (F_GRRA - 67)) | (1L << (F_RAGR - 67)) | (1L << (F_INC - 67)) | (1L << (F_DCM - 67)) | (1L << (FG_PHI - 67)) | (1L << (FG_PHM - 67)) | (1L << (FG_PHL - 67)) | (1L << (FG_PHQ - 67)) | (1L << (FG_PHC - 67)) | (1L << (FG_PHF - 67)) | (1L << (ADI - 67)) | (1L << (ADIA - 67)) | (1L << (SUB - 67)) | (1L << (SUBA - 67)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (NAO - 154)) | (1L << (NAOT - 154)) | (1L << (ID - 154)) | (1L << (INT - 154)) | (1L << (DEC - 154)) | (1L << (CHAR - 154)) | (1L << (STRING - 154)))) != 0) );
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
		enterRule(_localctx, 34, RULE_parar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		enterRule(_localctx, 36, RULE_continuar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 38, RULE_movimentar);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new MovimentarDirecaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(VA);
				setState(257);
				match(PARA);
				setState(258);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIR) | (1L << ESQ) | (1L << CIM) | (1L << BAI))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
			case 2:
				_localctx = new MovimentarPontoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(VA);
				setState(264);
				match(PARA);
				setState(265);
				match(T__0);
				setState(266);
				expr();
				setState(267);
				match(T__4);
				setState(268);
				expr();
				setState(269);
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
		enterRule(_localctx, 40, RULE_trocarCor);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new TrocarCorPincelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(TROC);
				setState(274);
				match(COR);
				setState(275);
				match(DO);
				setState(276);
				match(PINC);
				setState(277);
				match(PARA);
				setState(278);
				configuracaoCor();
				}
				break;
			case 2:
				_localctx = new TrocarCorPreenchimentoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(TROC);
				setState(280);
				match(COR);
				setState(281);
				match(DO);
				setState(282);
				match(PREE);
				setState(283);
				match(PARA);
				setState(284);
				configuracaoCor();
				}
				break;
			case 3:
				_localctx = new TrocarCorFundoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(TROC);
				setState(286);
				match(COR);
				setState(287);
				match(DO);
				setState(288);
				match(FUN);
				setState(289);
				match(PARA);
				setState(290);
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
		enterRule(_localctx, 42, RULE_configuracaoCor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEX:
				{
				setState(293);
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
				setState(294);
				((ConfiguracaoCorContext)_localctx).cor = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (PRETO - 54)) | (1L << (AZUL - 54)) | (1L << (CIANO - 54)) | (1L << (CINZA - 54)) | (1L << (VERDE - 54)) | (1L << (MAGENTA - 54)) | (1L << (LARANJA - 54)) | (1L << (ROSA - 54)) | (1L << (VERMELHO - 54)) | (1L << (BRANCO - 54)) | (1L << (AMARELO - 54)))) != 0)) ) {
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
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PI) | (1L << VER) | (1L << FAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ESCURO - 65)) | (1L << (CLARO - 65)) | (1L << (F_VABS - 65)) | (1L << (F_RAIQ - 65)) | (1L << (F_RAIC - 65)) | (1L << (F_RAIZ - 65)) | (1L << (F_POTE - 65)) | (1L << (F_HIPO - 65)) | (1L << (F_CHAO - 65)) | (1L << (F_TETO - 65)) | (1L << (F_ARRE - 65)) | (1L << (F_MINI - 65)) | (1L << (F_MAXI - 65)) | (1L << (F_NUMA - 65)) | (1L << (F_SEME - 65)) | (1L << (F_SENO - 65)) | (1L << (F_COSS - 65)) | (1L << (F_TANG - 65)) | (1L << (F_ASEN - 65)) | (1L << (F_ACOS - 65)) | (1L << (F_ATAN - 65)) | (1L << (F_CAPO - 65)) | (1L << (F_SENH - 65)) | (1L << (F_COSH - 65)) | (1L << (F_TANH - 65)) | (1L << (F_LOGA - 65)) | (1L << (F_GRRA - 65)) | (1L << (F_RAGR - 65)) | (1L << (F_INC - 65)) | (1L << (F_DCM - 65)) | (1L << (ADI - 65)) | (1L << (ADIA - 65)) | (1L << (SUB - 65)) | (1L << (SUBA - 65)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (NAO - 154)) | (1L << (NAOT - 154)) | (1L << (ID - 154)) | (1L << (INT - 154)) | (1L << (DEC - 154)) | (1L << (CHAR - 154)) | (1L << (STRING - 154)))) != 0)) {
				{
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PI) | (1L << VER) | (1L << FAL))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (F_VABS - 67)) | (1L << (F_RAIQ - 67)) | (1L << (F_RAIC - 67)) | (1L << (F_RAIZ - 67)) | (1L << (F_POTE - 67)) | (1L << (F_HIPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_TETO - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_MINI - 67)) | (1L << (F_MAXI - 67)) | (1L << (F_NUMA - 67)) | (1L << (F_SEME - 67)) | (1L << (F_SENO - 67)) | (1L << (F_COSS - 67)) | (1L << (F_TANG - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_SENH - 67)) | (1L << (F_COSH - 67)) | (1L << (F_TANH - 67)) | (1L << (F_LOGA - 67)) | (1L << (F_GRRA - 67)) | (1L << (F_RAGR - 67)) | (1L << (F_INC - 67)) | (1L << (F_DCM - 67)) | (1L << (ADI - 67)) | (1L << (ADIA - 67)) | (1L << (SUB - 67)) | (1L << (SUBA - 67)))) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (NAO - 154)) | (1L << (NAOT - 154)) | (1L << (ID - 154)) | (1L << (INT - 154)) | (1L << (DEC - 154)) | (1L << (CHAR - 154)) | (1L << (STRING - 154)))) != 0)) {
					{
					setState(297);
					expr();
					setState(298);
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

				setState(302);
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
		enterRule(_localctx, 44, RULE_girar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(GIR);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(306);
				match(EM);
				setState(307);
				expr();
				setState(308);
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
		enterRule(_localctx, 46, RULE_engrossar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(ENG);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(313);
				match(EM);
				setState(314);
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
		enterRule(_localctx, 48, RULE_desengrossar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(DES);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(318);
				match(EM);
				setState(319);
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
		enterRule(_localctx, 50, RULE_trocarGrossura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(TROC);
			setState(323);
			match(GROS);
			setState(324);
			match(PARA);
			setState(325);
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
		enterRule(_localctx, 52, RULE_escrever);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(ESC);
			setState(328);
			expr();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NA) {
				{
				setState(329);
				match(NA);
				setState(330);
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
		enterRule(_localctx, 54, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(LER);
			setState(334);
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
		enterRule(_localctx, 56, RULE_atribuir);
		int _la;
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new AtribuirPadraoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(ID);
				setState(337);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(338);
				expr();
				}
				break;
			case 2:
				_localctx = new AtribuirAdicaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(ID);
				setState(340);
				_la = _input.LA(1);
				if ( !(_la==AC_A || _la==AT_A) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(341);
				expr();
				}
				break;
			case 3:
				_localctx = new AtribuirSubtracaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				match(ID);
				setState(343);
				_la = _input.LA(1);
				if ( !(_la==AC_S || _la==AT_S) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(344);
				expr();
				}
				break;
			case 4:
				_localctx = new AtribuirMultiplicacaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				match(ID);
				setState(346);
				_la = _input.LA(1);
				if ( !(_la==AC_M || _la==AT_M) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(347);
				expr();
				}
				break;
			case 5:
				_localctx = new AtribuirDivisaoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(348);
				match(ID);
				setState(349);
				_la = _input.LA(1);
				if ( !(_la==AC_D || _la==AT_D) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(350);
				expr();
				}
				break;
			case 6:
				_localctx = new AtribuirRestoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
				match(ID);
				setState(352);
				_la = _input.LA(1);
				if ( !(_la==AC_R || _la==AT_R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(353);
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
		enterRule(_localctx, 58, RULE_abaixar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(ABA);
			setState(357);
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
		enterRule(_localctx, 60, RULE_levantar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(LEV);
			setState(360);
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
		enterRule(_localctx, 62, RULE_limpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
		enterRule(_localctx, 64, RULE_funcaoMatematica);
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F_VABS:
				_localctx = new FuncaoAbsolutoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(F_VABS);
				setState(365);
				match(T__0);
				setState(366);
				expr();
				setState(367);
				match(T__1);
				}
				break;
			case F_RAIQ:
				_localctx = new FuncaoRaizQuadradaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(F_RAIQ);
				setState(370);
				match(T__0);
				setState(371);
				expr();
				setState(372);
				match(T__1);
				}
				break;
			case F_RAIC:
				_localctx = new FuncaoRaizCubicaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				match(F_RAIC);
				setState(375);
				match(T__0);
				setState(376);
				expr();
				setState(377);
				match(T__1);
				}
				break;
			case F_RAIZ:
				_localctx = new FuncaoRaizContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				match(F_RAIZ);
				setState(380);
				match(T__0);
				setState(381);
				expr();
				setState(382);
				match(T__4);
				setState(383);
				expr();
				setState(384);
				match(T__1);
				}
				break;
			case F_POTE:
				_localctx = new FuncaoPotenciaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				match(F_POTE);
				setState(387);
				match(T__0);
				setState(388);
				expr();
				setState(389);
				match(T__4);
				setState(390);
				expr();
				setState(391);
				match(T__1);
				}
				break;
			case F_HIPO:
				_localctx = new FuncaoHipotenusaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(393);
				match(F_HIPO);
				setState(394);
				match(T__0);
				setState(395);
				expr();
				setState(396);
				match(T__4);
				setState(397);
				expr();
				setState(398);
				match(T__1);
				}
				break;
			case F_CHAO:
				_localctx = new FuncaoChaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(400);
				match(F_CHAO);
				setState(401);
				match(T__0);
				setState(402);
				expr();
				setState(403);
				match(T__1);
				}
				break;
			case F_TETO:
				_localctx = new FuncaoTetoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(405);
				match(F_TETO);
				setState(406);
				match(T__0);
				setState(407);
				expr();
				setState(408);
				match(T__1);
				}
				break;
			case F_ARRE:
				_localctx = new FuncaoArredondarContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(410);
				match(F_ARRE);
				setState(411);
				match(T__0);
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(412);
					expr();
					}
					break;
				case 2:
					{
					setState(413);
					expr();
					setState(414);
					match(T__4);
					setState(415);
					expr();
					}
					break;
				}
				setState(419);
				match(T__1);
				}
				break;
			case F_MINI:
				_localctx = new FuncaoMinimoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(421);
				match(F_MINI);
				setState(422);
				match(T__0);
				setState(423);
				expr();
				setState(424);
				match(T__4);
				setState(425);
				expr();
				setState(426);
				match(T__1);
				}
				break;
			case F_MAXI:
				_localctx = new FuncaoMaximoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(428);
				match(F_MAXI);
				setState(429);
				match(T__0);
				setState(430);
				expr();
				setState(431);
				match(T__4);
				setState(432);
				expr();
				setState(433);
				match(T__1);
				}
				break;
			case F_NUMA:
				_localctx = new FuncaoNumeroAleatorioContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(435);
				match(F_NUMA);
				setState(436);
				match(T__0);
				setState(442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(437);
					expr();
					}
					break;
				case 2:
					{
					setState(438);
					expr();
					setState(439);
					match(T__4);
					setState(440);
					expr();
					}
					break;
				}
				setState(444);
				match(T__1);
				}
				break;
			case F_SEME:
				_localctx = new FuncaoDefinirSementeAleatoriaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(445);
				match(F_SEME);
				setState(446);
				match(T__0);
				setState(447);
				expr();
				setState(448);
				match(T__1);
				}
				break;
			case F_SENO:
				_localctx = new FuncaoSenoContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(450);
				match(F_SENO);
				setState(451);
				match(T__0);
				setState(452);
				expr();
				setState(453);
				match(T__1);
				}
				break;
			case F_COSS:
				_localctx = new FuncaoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(455);
				match(F_COSS);
				setState(456);
				match(T__0);
				setState(457);
				expr();
				setState(458);
				match(T__1);
				}
				break;
			case F_TANG:
				_localctx = new FuncaoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(460);
				match(F_TANG);
				setState(461);
				match(T__0);
				setState(462);
				expr();
				setState(463);
				match(T__1);
				}
				break;
			case F_ASEN:
				_localctx = new FuncaoArcoSenoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(465);
				match(F_ASEN);
				setState(466);
				match(T__0);
				setState(467);
				expr();
				setState(468);
				match(T__1);
				}
				break;
			case F_ACOS:
				_localctx = new FuncaoArcoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(470);
				match(F_ACOS);
				setState(471);
				match(T__0);
				setState(472);
				expr();
				setState(473);
				match(T__1);
				}
				break;
			case F_ATAN:
				_localctx = new FuncaoArcoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(475);
				match(F_ATAN);
				setState(476);
				match(T__0);
				setState(477);
				expr();
				setState(478);
				match(T__1);
				}
				break;
			case F_CAPO:
				_localctx = new FuncaoCartesianoParaPolarContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(480);
				match(F_CAPO);
				setState(481);
				match(T__0);
				setState(482);
				expr();
				setState(483);
				match(T__4);
				setState(484);
				expr();
				setState(485);
				match(T__1);
				}
				break;
			case F_SENH:
				_localctx = new FuncaoSenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(487);
				match(F_SENH);
				setState(488);
				match(T__0);
				setState(489);
				expr();
				setState(490);
				match(T__1);
				}
				break;
			case F_COSH:
				_localctx = new FuncaoCossenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(492);
				match(F_COSH);
				setState(493);
				match(T__0);
				setState(494);
				expr();
				setState(495);
				match(T__1);
				}
				break;
			case F_TANH:
				_localctx = new FuncaoTangenteHiperbolicaContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(497);
				match(F_TANH);
				setState(498);
				match(T__0);
				setState(499);
				expr();
				setState(500);
				match(T__1);
				}
				break;
			case F_LOGA:
				_localctx = new FuncaoLogaritmoContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(502);
				match(F_LOGA);
				setState(503);
				match(T__0);
				setState(509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(504);
					expr();
					}
					break;
				case 2:
					{
					setState(505);
					expr();
					setState(506);
					match(T__4);
					setState(507);
					expr();
					}
					break;
				}
				setState(511);
				match(T__1);
				}
				break;
			case F_GRRA:
				_localctx = new FuncaoGrausParaRadianosContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(513);
				match(F_GRRA);
				setState(514);
				match(T__0);
				setState(515);
				expr();
				setState(516);
				match(T__1);
				}
				break;
			case F_RAGR:
				_localctx = new FuncaoRadianosParaGrausContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(518);
				match(F_RAGR);
				setState(519);
				match(T__0);
				setState(520);
				expr();
				setState(521);
				match(T__1);
				}
				break;
			case F_INC:
				_localctx = new FuncaoIncrementarContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(523);
				match(F_INC);
				setState(524);
				match(T__0);
				setState(525);
				match(ID);
				setState(526);
				match(T__1);
				}
				break;
			case F_DCM:
				_localctx = new FuncaoDecrementarContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(527);
				match(F_DCM);
				setState(528);
				match(T__0);
				setState(529);
				match(ID);
				setState(530);
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
		public DesenharContext desenhar() {
			return getRuleContext(DesenharContext.class,0);
		}
		public CriarCaminhoContext criarCaminho() {
			return getRuleContext(CriarCaminhoContext.class,0);
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
		enterRule(_localctx, 66, RULE_instrucaoGeometrica);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESE:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				desenhar();
				}
				break;
			case FG_PHI:
			case FG_PHM:
			case FG_PHL:
			case FG_PHQ:
			case FG_PHC:
			case FG_PHF:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				criarCaminho();
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

	public static class DesenharContext extends ParserRuleContext {
		public TerminalNode DESE() { return getToken(AuroraLogoParser.DESE, 0); }
		public FuncaoGeometricaContext funcaoGeometrica() {
			return getRuleContext(FuncaoGeometricaContext.class,0);
		}
		public DesenharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desenhar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterDesenhar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitDesenhar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitDesenhar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesenharContext desenhar() throws RecognitionException {
		DesenharContext _localctx = new DesenharContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_desenhar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(DESE);
			setState(538);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
	public static class FuncaoDesenharCurvaQudraticaContext extends FuncaoGeometricaContext {
		public TerminalNode FG_CQD() { return getToken(AuroraLogoParser.FG_CQD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoDesenharCurvaQudraticaContext(FuncaoGeometricaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDesenharCurvaQudratica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDesenharCurvaQudratica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDesenharCurvaQudratica(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoDesenharCurvaCubicaContext extends FuncaoGeometricaContext {
		public TerminalNode FG_CCU() { return getToken(AuroraLogoParser.FG_CCU, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
	public static class FuncaoDesenharLinhaContext extends FuncaoGeometricaContext {
		public TerminalNode FG_LIN() { return getToken(AuroraLogoParser.FG_LIN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoDesenharLinhaContext(FuncaoGeometricaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDesenharLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDesenharLinha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDesenharLinha(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoDesenharQuadradoContext extends FuncaoGeometricaContext {
		public TerminalNode FG_QUA() { return getToken(AuroraLogoParser.FG_QUA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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

	public final FuncaoGeometricaContext funcaoGeometrica() throws RecognitionException {
		FuncaoGeometricaContext _localctx = new FuncaoGeometricaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_funcaoGeometrica);
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FG_LIN:
				_localctx = new FuncaoDesenharLinhaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(FG_LIN);
				setState(541);
				match(T__0);
				setState(542);
				expr();
				setState(543);
				match(T__1);
				}
				break;
			case FG_QUA:
				_localctx = new FuncaoDesenharQuadradoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				match(FG_QUA);
				setState(546);
				match(T__0);
				setState(547);
				expr();
				setState(548);
				match(T__1);
				}
				break;
			case FG_RET:
				_localctx = new FuncaoDesenharRetanguloContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				match(FG_RET);
				setState(551);
				match(T__0);
				setState(552);
				expr();
				setState(553);
				match(T__1);
				}
				break;
			case FG_CIC:
				_localctx = new FuncaoDesenharCirculoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(555);
				match(FG_CIC);
				setState(556);
				match(T__0);
				setState(557);
				expr();
				setState(558);
				match(T__1);
				}
				break;
			case FG_ELI:
				_localctx = new FuncaoDesenharElipseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(560);
				match(FG_ELI);
				setState(561);
				match(T__0);
				setState(562);
				expr();
				setState(563);
				match(T__1);
				}
				break;
			case FG_POR:
				_localctx = new FuncaoDesenharPoligonoRegularContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(565);
				match(FG_POR);
				setState(566);
				match(T__0);
				setState(567);
				expr();
				setState(568);
				match(T__1);
				}
				break;
			case FG_EST:
				_localctx = new FuncaoDesenharEstrelaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(570);
				match(FG_EST);
				setState(571);
				match(T__0);
				setState(572);
				expr();
				setState(573);
				match(T__1);
				}
				break;
			case FG_POL:
				_localctx = new FuncaoDesenharPoligonoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(575);
				match(FG_POL);
				setState(576);
				match(T__0);
				setState(577);
				expr();
				setState(578);
				match(T__1);
				}
				break;
			case FG_CQD:
				_localctx = new FuncaoDesenharCurvaQudraticaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(580);
				match(FG_CQD);
				setState(581);
				match(T__0);
				setState(582);
				expr();
				setState(583);
				match(T__1);
				}
				break;
			case FG_CCU:
				_localctx = new FuncaoDesenharCurvaCubicaContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(585);
				match(FG_CCU);
				setState(586);
				match(T__0);
				setState(587);
				expr();
				setState(588);
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

	public static class CriarCaminhoContext extends ParserRuleContext {
		public CriarCaminhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criarCaminho; }
	 
		public CriarCaminhoContext() { }
		public void copyFrom(CriarCaminhoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncaoCCCurvaCubicaAteContext extends CriarCaminhoContext {
		public TerminalNode FG_PHC() { return getToken(AuroraLogoParser.FG_PHC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoCCCurvaCubicaAteContext(CriarCaminhoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoCCCurvaCubicaAte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoCCCurvaCubicaAte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoCCCurvaCubicaAte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoCCMoverAteContext extends CriarCaminhoContext {
		public TerminalNode FG_PHM() { return getToken(AuroraLogoParser.FG_PHM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoCCMoverAteContext(CriarCaminhoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoCCMoverAte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoCCMoverAte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoCCMoverAte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoCCLinhaAteContext extends CriarCaminhoContext {
		public TerminalNode FG_PHL() { return getToken(AuroraLogoParser.FG_PHL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoCCLinhaAteContext(CriarCaminhoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoCCLinhaAte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoCCLinhaAte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoCCLinhaAte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoCCFecharCaminhoContext extends CriarCaminhoContext {
		public TerminalNode FG_PHF() { return getToken(AuroraLogoParser.FG_PHF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoCCFecharCaminhoContext(CriarCaminhoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoCCFecharCaminho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoCCFecharCaminho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoCCFecharCaminho(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoCCIniciarCaminhoContext extends CriarCaminhoContext {
		public TerminalNode FG_PHI() { return getToken(AuroraLogoParser.FG_PHI, 0); }
		public FuncaoCCIniciarCaminhoContext(CriarCaminhoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoCCIniciarCaminho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoCCIniciarCaminho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoCCIniciarCaminho(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoCCCurvaQuadraticaAteContext extends CriarCaminhoContext {
		public TerminalNode FG_PHQ() { return getToken(AuroraLogoParser.FG_PHQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncaoCCCurvaQuadraticaAteContext(CriarCaminhoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoCCCurvaQuadraticaAte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoCCCurvaQuadraticaAte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoCCCurvaQuadraticaAte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriarCaminhoContext criarCaminho() throws RecognitionException {
		CriarCaminhoContext _localctx = new CriarCaminhoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_criarCaminho);
		try {
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FG_PHI:
				_localctx = new FuncaoCCIniciarCaminhoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				match(FG_PHI);
				setState(593);
				match(T__5);
				}
				break;
			case FG_PHM:
				_localctx = new FuncaoCCMoverAteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				match(FG_PHM);
				setState(595);
				match(T__0);
				setState(596);
				expr();
				setState(597);
				match(T__1);
				}
				break;
			case FG_PHL:
				_localctx = new FuncaoCCLinhaAteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
				match(FG_PHL);
				setState(600);
				match(T__0);
				setState(601);
				expr();
				setState(602);
				match(T__1);
				}
				break;
			case FG_PHQ:
				_localctx = new FuncaoCCCurvaQuadraticaAteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(604);
				match(FG_PHQ);
				setState(605);
				match(T__0);
				setState(606);
				expr();
				setState(607);
				match(T__1);
				}
				break;
			case FG_PHC:
				_localctx = new FuncaoCCCurvaCubicaAteContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(609);
				match(FG_PHC);
				setState(610);
				match(T__0);
				setState(611);
				expr();
				setState(612);
				match(T__1);
				}
				break;
			case FG_PHF:
				_localctx = new FuncaoCCFecharCaminhoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(614);
				match(FG_PHF);
				setState(615);
				match(T__0);
				setState(616);
				expr();
				setState(617);
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
		"\u0004\u0001\u00a5\u026e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\"\u0002#\u0007#\u0002$\u0007$\u0001\u0000\u0004\u0000L\b\u0000\u000b"+
		"\u0000\f\u0000M\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001V\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002h\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003m\b\u0003\n\u0003\f\u0003p\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004u\b\u0004\u0001\u0005\u0003\u0005x\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005}\b\u0005\n\u0005\f\u0005"+
		"\u0080\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0085\b"+
		"\u0006\n\u0006\f\u0006\u0088\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0091\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u009a\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u00a9\b\u000b\u000b\u000b\f\u000b\u00aa"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u00b0\b\f\n\f\f\f\u00b3\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00bb\b\r\u000b\r\f"+
		"\r\u00bc\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u00c4\b\u000e\u000b\u000e\f\u000e\u00c5\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00ca\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0004\u000f\u00d1\b\u000f\u000b\u000f\f\u000f\u00d2\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00d9\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e0\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00f3\b\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00f7\b\u0010\u000b"+
		"\u0010\f\u0010\u00f8\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0106\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0110"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0124\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0128"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u012d\b\u0015"+
		"\u0001\u0015\u0003\u0015\u0130\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0137\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u013c\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0141\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u014c\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0163\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01a2\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u01bb\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01fe"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u0214\b \u0001!\u0001!\u0003!\u0218\b!\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u024f\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u026c\b$\u0001$\u0000\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000"+
		"\u0011\u0001\u0000\u0096\u0099\u0001\u0000\u0084\u0095\u0001\u0000{~\u0002"+
		"\u0000\'\'\u007f\u0083\u0001\u0000\u009a\u009b\u0001\u000045\u0001\u0000"+
		"&\'\u0001\u0000*+\u0001\u0000\f\u000f\u0001\u00006@\u0001\u0000AB\u0001"+
		"\u0000op\u0001\u0000qr\u0001\u0000st\u0001\u0000uv\u0001\u0000wx\u0001"+
		"\u0000yz\u02b5\u0000K\u0001\u0000\u0000\u0000\u0002U\u0001\u0000\u0000"+
		"\u0000\u0004g\u0001\u0000\u0000\u0000\u0006i\u0001\u0000\u0000\u0000\b"+
		"q\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000\f\u0081\u0001\u0000"+
		"\u0000\u0000\u000e\u0099\u0001\u0000\u0000\u0000\u0010\u009b\u0001\u0000"+
		"\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u009f\u0001\u0000"+
		"\u0000\u0000\u0016\u00a3\u0001\u0000\u0000\u0000\u0018\u00b1\u0001\u0000"+
		"\u0000\u0000\u001a\u00b4\u0001\u0000\u0000\u0000\u001c\u00c9\u0001\u0000"+
		"\u0000\u0000\u001e\u00cb\u0001\u0000\u0000\u0000 \u00d8\u0001\u0000\u0000"+
		"\u0000\"\u00fc\u0001\u0000\u0000\u0000$\u00fe\u0001\u0000\u0000\u0000"+
		"&\u010f\u0001\u0000\u0000\u0000(\u0123\u0001\u0000\u0000\u0000*\u0127"+
		"\u0001\u0000\u0000\u0000,\u0131\u0001\u0000\u0000\u0000.\u0138\u0001\u0000"+
		"\u0000\u00000\u013d\u0001\u0000\u0000\u00002\u0142\u0001\u0000\u0000\u0000"+
		"4\u0147\u0001\u0000\u0000\u00006\u014d\u0001\u0000\u0000\u00008\u0162"+
		"\u0001\u0000\u0000\u0000:\u0164\u0001\u0000\u0000\u0000<\u0167\u0001\u0000"+
		"\u0000\u0000>\u016a\u0001\u0000\u0000\u0000@\u0213\u0001\u0000\u0000\u0000"+
		"B\u0217\u0001\u0000\u0000\u0000D\u0219\u0001\u0000\u0000\u0000F\u024e"+
		"\u0001\u0000\u0000\u0000H\u026b\u0001\u0000\u0000\u0000JL\u0003\u0002"+
		"\u0001\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0001\u0001\u0000\u0000"+
		"\u0000OP\u0003\u0004\u0002\u0000PQ\u0005\u009c\u0000\u0000QV\u0001\u0000"+
		"\u0000\u0000RV\u0003\u0014\n\u0000SV\u0003\u001e\u000f\u0000TV\u0003 "+
		"\u0010\u0000UO\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000V\u0003\u0001\u0000\u0000"+
		"\u0000Wh\u0003&\u0013\u0000Xh\u0003(\u0014\u0000Yh\u0003,\u0016\u0000"+
		"Zh\u0003.\u0017\u0000[h\u00030\u0018\u0000\\h\u00032\u0019\u0000]h\u0003"+
		"B!\u0000^h\u00034\u001a\u0000_h\u00036\u001b\u0000`h\u00038\u001c\u0000"+
		"ah\u0003:\u001d\u0000bh\u0003<\u001e\u0000ch\u0003>\u001f\u0000dh\u0003"+
		"\u0006\u0003\u0000eh\u0003\"\u0011\u0000fh\u0003$\u0012\u0000gW\u0001"+
		"\u0000\u0000\u0000gX\u0001\u0000\u0000\u0000gY\u0001\u0000\u0000\u0000"+
		"gZ\u0001\u0000\u0000\u0000g[\u0001\u0000\u0000\u0000g\\\u0001\u0000\u0000"+
		"\u0000g]\u0001\u0000\u0000\u0000g^\u0001\u0000\u0000\u0000g_\u0001\u0000"+
		"\u0000\u0000g`\u0001\u0000\u0000\u0000ga\u0001\u0000\u0000\u0000gb\u0001"+
		"\u0000\u0000\u0000gc\u0001\u0000\u0000\u0000gd\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\u0005\u0001\u0000"+
		"\u0000\u0000in\u0003\b\u0004\u0000jk\u0007\u0000\u0000\u0000km\u0003\b"+
		"\u0004\u0000lj\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0007\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000qt\u0003\n\u0005\u0000rs\u0007\u0001\u0000"+
		"\u0000su\u0003\n\u0005\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000u\t\u0001\u0000\u0000\u0000vx\u0007\u0002\u0000\u0000wv\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y~\u0003"+
		"\f\u0006\u0000z{\u0007\u0002\u0000\u0000{}\u0003\f\u0006\u0000|z\u0001"+
		"\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u000b\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0081\u0086\u0003\u000e\u0007\u0000\u0082"+
		"\u0083\u0007\u0003\u0000\u0000\u0083\u0085\u0003\u000e\u0007\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\r\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0007\u0004\u0000\u0000\u008a\u009a\u0003\u000e\u0007\u0000\u008b\u009a"+
		"\u0005\u009e\u0000\u0000\u008c\u009a\u0005\u009f\u0000\u0000\u008d\u009a"+
		"\u00053\u0000\u0000\u008e\u0091\u0003\u0012\t\u0000\u008f\u0091\u0005"+
		"\u009d\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u009a\u0001\u0000\u0000\u0000\u0092\u009a\u0005"+
		"\u00a1\u0000\u0000\u0093\u009a\u0005\u00a2\u0000\u0000\u0094\u009a\u0003"+
		"@ \u0000\u0095\u0096\u0005\u0001\u0000\u0000\u0096\u0097\u0003\u0006\u0003"+
		"\u0000\u0097\u0098\u0005\u0002\u0000\u0000\u0098\u009a\u0001\u0000\u0000"+
		"\u0000\u0099\u0089\u0001\u0000\u0000\u0000\u0099\u008b\u0001\u0000\u0000"+
		"\u0000\u0099\u008c\u0001\u0000\u0000\u0000\u0099\u008d\u0001\u0000\u0000"+
		"\u0000\u0099\u0090\u0001\u0000\u0000\u0000\u0099\u0092\u0001\u0000\u0000"+
		"\u0000\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0094\u0001\u0000\u0000"+
		"\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u009a\u000f\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0003\u0006\u0003\u0000\u009c\u0011\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0007\u0005\u0000\u0000\u009e\u0013\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0003\u0016\u000b\u0000\u00a0\u00a1\u0003\u0018\f\u0000"+
		"\u00a1\u00a2\u0003\u001c\u000e\u0000\u00a2\u0015\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0005!\u0000\u0000\u00a4\u00a5\u0003\u0010\b\u0000\u00a5"+
		"\u00a6\u0005\"\u0000\u0000\u00a6\u00a8\u0005\u0003\u0000\u0000\u00a7\u00a9"+
		"\u0003\u0002\u0001\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005\u0004\u0000\u0000\u00ad\u0017\u0001\u0000\u0000\u0000\u00ae\u00b0"+
		"\u0003\u001a\r\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u0019\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005#\u0000\u0000\u00b5\u00b6\u0005!\u0000"+
		"\u0000\u00b6\u00b7\u0003\u0010\b\u0000\u00b7\u00b8\u0005\"\u0000\u0000"+
		"\u00b8\u00ba\u0005\u0003\u0000\u0000\u00b9\u00bb\u0003\u0002\u0001\u0000"+
		"\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0004\u0000\u0000"+
		"\u00bf\u001b\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005#\u0000\u0000\u00c1"+
		"\u00c3\u0005\u0003\u0000\u0000\u00c2\u00c4\u0003\u0002\u0001\u0000\u00c3"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0004\u0000\u0000\u00c8"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c0\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u001d\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0005%\u0000\u0000\u00cc\u00cd\u0003\u0006\u0003\u0000\u00cd\u00ce"+
		"\u0007\u0006\u0000\u0000\u00ce\u00d0\u0005\u0003\u0000\u0000\u00cf\u00d1"+
		"\u0003\u0002\u0001\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0005\u0004\u0000\u0000\u00d5\u001f\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0005$\u0000\u0000\u00d7\u00d9\u0003\u0010\b\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00f2\u0005%\u0000\u0000\u00db\u00dc\u0007\u0007"+
		"\u0000\u0000\u00dc\u00df\u0005\u009d\u0000\u0000\u00dd\u00de\u0005\u000b"+
		"\u0000\u0000\u00de\u00e0\u0003\u0006\u0003\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00f3\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0005,\u0000\u0000\u00e2\u00e3\u0005\u009d\u0000"+
		"\u0000\u00e3\u00e4\u00052\u0000\u0000\u00e4\u00f3\u0003\u0006\u0003\u0000"+
		"\u00e5\u00e6\u0005.\u0000\u0000\u00e6\u00e7\u0005\u009d\u0000\u0000\u00e7"+
		"\u00e8\u00050\u0000\u0000\u00e8\u00f3\u0003\u0006\u0003\u0000\u00e9\u00ea"+
		"\u0005/\u0000\u0000\u00ea\u00eb\u0005\u009d\u0000\u0000\u00eb\u00ec\u0005"+
		"0\u0000\u0000\u00ec\u00f3\u0003\u0006\u0003\u0000\u00ed\u00ee\u0005-\u0000"+
		"\u0000\u00ee\u00ef\u0003\u0006\u0003\u0000\u00ef\u00f0\u00051\u0000\u0000"+
		"\u00f0\u00f1\u0005\u009d\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f2\u00db\u0001\u0000\u0000\u0000\u00f2\u00e1\u0001\u0000\u0000\u0000"+
		"\u00f2\u00e5\u0001\u0000\u0000\u0000\u00f2\u00e9\u0001\u0000\u0000\u0000"+
		"\u00f2\u00ed\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0005\u0003\u0000\u0000"+
		"\u00f5\u00f7\u0003\u0002\u0001\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0005\u0004\u0000\u0000\u00fb!\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005\t\u0000\u0000\u00fd#\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0005\n\u0000\u0000\u00ff%\u0001\u0000\u0000\u0000\u0100\u0101\u0005"+
		"\u0007\u0000\u0000\u0101\u0102\u0005\b\u0000\u0000\u0102\u0105\u0007\b"+
		"\u0000\u0000\u0103\u0104\u0005\u000b\u0000\u0000\u0104\u0106\u0003\u0006"+
		"\u0003\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"+
		"\u0000\u0000\u0106\u0110\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0007"+
		"\u0000\u0000\u0108\u0109\u0005\b\u0000\u0000\u0109\u010a\u0005\u0001\u0000"+
		"\u0000\u010a\u010b\u0003\u0006\u0003\u0000\u010b\u010c\u0005\u0005\u0000"+
		"\u0000\u010c\u010d\u0003\u0006\u0003\u0000\u010d\u010e\u0005\u0002\u0000"+
		"\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u0100\u0001\u0000\u0000"+
		"\u0000\u010f\u0107\u0001\u0000\u0000\u0000\u0110\'\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0005\u0010\u0000\u0000\u0112\u0113\u0005\u0011\u0000\u0000"+
		"\u0113\u0114\u0005\u0012\u0000\u0000\u0114\u0115\u0005\u001e\u0000\u0000"+
		"\u0115\u0116\u0005\b\u0000\u0000\u0116\u0124\u0003*\u0015\u0000\u0117"+
		"\u0118\u0005\u0010\u0000\u0000\u0118\u0119\u0005\u0011\u0000\u0000\u0119"+
		"\u011a\u0005\u0012\u0000\u0000\u011a\u011b\u0005\u001f\u0000\u0000\u011b"+
		"\u011c\u0005\b\u0000\u0000\u011c\u0124\u0003*\u0015\u0000\u011d\u011e"+
		"\u0005\u0010\u0000\u0000\u011e\u011f\u0005\u0011\u0000\u0000\u011f\u0120"+
		"\u0005\u0012\u0000\u0000\u0120\u0121\u0005\u0014\u0000\u0000\u0121\u0122"+
		"\u0005\b\u0000\u0000\u0122\u0124\u0003*\u0015\u0000\u0123\u0111\u0001"+
		"\u0000\u0000\u0000\u0123\u0117\u0001\u0000\u0000\u0000\u0123\u011d\u0001"+
		"\u0000\u0000\u0000\u0124)\u0001\u0000\u0000\u0000\u0125\u0128\u0005\u00a0"+
		"\u0000\u0000\u0126\u0128\u0007\t\u0000\u0000\u0127\u0125\u0001\u0000\u0000"+
		"\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u012f\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0003\u0006\u0003\u0000\u012a\u012b\u0007\u0006\u0000"+
		"\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u0129\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e\u0130\u0007\n\u0000\u0000\u012f\u012c\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130+\u0001\u0000\u0000\u0000\u0131"+
		"\u0136\u0005\u0015\u0000\u0000\u0132\u0133\u0005\u000b\u0000\u0000\u0133"+
		"\u0134\u0003\u0006\u0003\u0000\u0134\u0135\u0005\u0016\u0000\u0000\u0135"+
		"\u0137\u0001\u0000\u0000\u0000\u0136\u0132\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0001\u0000\u0000\u0000\u0137-\u0001\u0000\u0000\u0000\u0138\u013b"+
		"\u0005\u0017\u0000\u0000\u0139\u013a\u0005\u000b\u0000\u0000\u013a\u013c"+
		"\u0003\u0006\u0003\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c/\u0001\u0000\u0000\u0000\u013d\u0140\u0005"+
		"\u0018\u0000\u0000\u013e\u013f\u0005\u000b\u0000\u0000\u013f\u0141\u0003"+
		"\u0006\u0003\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001"+
		"\u0000\u0000\u0000\u01411\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u0010"+
		"\u0000\u0000\u0143\u0144\u0005\u0019\u0000\u0000\u0144\u0145\u0005\b\u0000"+
		"\u0000\u0145\u0146\u0003\u0006\u0003\u0000\u01463\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0005\u001a\u0000\u0000\u0148\u014b\u0003\u0006\u0003\u0000"+
		"\u0149\u014a\u0005(\u0000\u0000\u014a\u014c\u0005)\u0000\u0000\u014b\u0149"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c5\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0005\u001b\u0000\u0000\u014e\u014f\u0005"+
		"\u009d\u0000\u0000\u014f7\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u009d"+
		"\u0000\u0000\u0151\u0152\u0007\u000b\u0000\u0000\u0152\u0163\u0003\u0006"+
		"\u0003\u0000\u0153\u0154\u0005\u009d\u0000\u0000\u0154\u0155\u0007\f\u0000"+
		"\u0000\u0155\u0163\u0003\u0006\u0003\u0000\u0156\u0157\u0005\u009d\u0000"+
		"\u0000\u0157\u0158\u0007\r\u0000\u0000\u0158\u0163\u0003\u0006\u0003\u0000"+
		"\u0159\u015a\u0005\u009d\u0000\u0000\u015a\u015b\u0007\u000e\u0000\u0000"+
		"\u015b\u0163\u0003\u0006\u0003\u0000\u015c\u015d\u0005\u009d\u0000\u0000"+
		"\u015d\u015e\u0007\u000f\u0000\u0000\u015e\u0163\u0003\u0006\u0003\u0000"+
		"\u015f\u0160\u0005\u009d\u0000\u0000\u0160\u0161\u0007\u0010\u0000\u0000"+
		"\u0161\u0163\u0003\u0006\u0003\u0000\u0162\u0150\u0001\u0000\u0000\u0000"+
		"\u0162\u0153\u0001\u0000\u0000\u0000\u0162\u0156\u0001\u0000\u0000\u0000"+
		"\u0162\u0159\u0001\u0000\u0000\u0000\u0162\u015c\u0001\u0000\u0000\u0000"+
		"\u0162\u015f\u0001\u0000\u0000\u0000\u01639\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0005\u001c\u0000\u0000\u0165\u0166\u0005\u001e\u0000\u0000\u0166"+
		";\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u001d\u0000\u0000\u0168\u0169"+
		"\u0005\u001e\u0000\u0000\u0169=\u0001\u0000\u0000\u0000\u016a\u016b\u0005"+
		" \u0000\u0000\u016b?\u0001\u0000\u0000\u0000\u016c\u016d\u0005C\u0000"+
		"\u0000\u016d\u016e\u0005\u0001\u0000\u0000\u016e\u016f\u0003\u0006\u0003"+
		"\u0000\u016f\u0170\u0005\u0002\u0000\u0000\u0170\u0214\u0001\u0000\u0000"+
		"\u0000\u0171\u0172\u0005D\u0000\u0000\u0172\u0173\u0005\u0001\u0000\u0000"+
		"\u0173\u0174\u0003\u0006\u0003\u0000\u0174\u0175\u0005\u0002\u0000\u0000"+
		"\u0175\u0214\u0001\u0000\u0000\u0000\u0176\u0177\u0005E\u0000\u0000\u0177"+
		"\u0178\u0005\u0001\u0000\u0000\u0178\u0179\u0003\u0006\u0003\u0000\u0179"+
		"\u017a\u0005\u0002\u0000\u0000\u017a\u0214\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0005F\u0000\u0000\u017c\u017d\u0005\u0001\u0000\u0000\u017d\u017e"+
		"\u0003\u0006\u0003\u0000\u017e\u017f\u0005\u0005\u0000\u0000\u017f\u0180"+
		"\u0003\u0006\u0003\u0000\u0180\u0181\u0005\u0002\u0000\u0000\u0181\u0214"+
		"\u0001\u0000\u0000\u0000\u0182\u0183\u0005G\u0000\u0000\u0183\u0184\u0005"+
		"\u0001\u0000\u0000\u0184\u0185\u0003\u0006\u0003\u0000\u0185\u0186\u0005"+
		"\u0005\u0000\u0000\u0186\u0187\u0003\u0006\u0003\u0000\u0187\u0188\u0005"+
		"\u0002\u0000\u0000\u0188\u0214\u0001\u0000\u0000\u0000\u0189\u018a\u0005"+
		"H\u0000\u0000\u018a\u018b\u0005\u0001\u0000\u0000\u018b\u018c\u0003\u0006"+
		"\u0003\u0000\u018c\u018d\u0005\u0005\u0000\u0000\u018d\u018e\u0003\u0006"+
		"\u0003\u0000\u018e\u018f\u0005\u0002\u0000\u0000\u018f\u0214\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u0005I\u0000\u0000\u0191\u0192\u0005\u0001\u0000"+
		"\u0000\u0192\u0193\u0003\u0006\u0003\u0000\u0193\u0194\u0005\u0002\u0000"+
		"\u0000\u0194\u0214\u0001\u0000\u0000\u0000\u0195\u0196\u0005J\u0000\u0000"+
		"\u0196\u0197\u0005\u0001\u0000\u0000\u0197\u0198\u0003\u0006\u0003\u0000"+
		"\u0198\u0199\u0005\u0002\u0000\u0000\u0199\u0214\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0005K\u0000\u0000\u019b\u01a1\u0005\u0001\u0000\u0000\u019c"+
		"\u01a2\u0003\u0006\u0003\u0000\u019d\u019e\u0003\u0006\u0003\u0000\u019e"+
		"\u019f\u0005\u0005\u0000\u0000\u019f\u01a0\u0003\u0006\u0003\u0000\u01a0"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a1\u019c\u0001\u0000\u0000\u0000\u01a1"+
		"\u019d\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a4\u0005\u0002\u0000\u0000\u01a4\u0214\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0005L\u0000\u0000\u01a6\u01a7\u0005\u0001\u0000\u0000\u01a7\u01a8"+
		"\u0003\u0006\u0003\u0000\u01a8\u01a9\u0005\u0005\u0000\u0000\u01a9\u01aa"+
		"\u0003\u0006\u0003\u0000\u01aa\u01ab\u0005\u0002\u0000\u0000\u01ab\u0214"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005M\u0000\u0000\u01ad\u01ae\u0005"+
		"\u0001\u0000\u0000\u01ae\u01af\u0003\u0006\u0003\u0000\u01af\u01b0\u0005"+
		"\u0005\u0000\u0000\u01b0\u01b1\u0003\u0006\u0003\u0000\u01b1\u01b2\u0005"+
		"\u0002\u0000\u0000\u01b2\u0214\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005"+
		"N\u0000\u0000\u01b4\u01ba\u0005\u0001\u0000\u0000\u01b5\u01bb\u0003\u0006"+
		"\u0003\u0000\u01b6\u01b7\u0003\u0006\u0003\u0000\u01b7\u01b8\u0005\u0005"+
		"\u0000\u0000\u01b8\u01b9\u0003\u0006\u0003\u0000\u01b9\u01bb\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b5\u0001\u0000\u0000\u0000\u01ba\u01b6\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bc\u0214\u0005\u0002\u0000\u0000\u01bd\u01be\u0005O\u0000"+
		"\u0000\u01be\u01bf\u0005\u0001\u0000\u0000\u01bf\u01c0\u0003\u0006\u0003"+
		"\u0000\u01c0\u01c1\u0005\u0002\u0000\u0000\u01c1\u0214\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0005P\u0000\u0000\u01c3\u01c4\u0005\u0001\u0000\u0000"+
		"\u01c4\u01c5\u0003\u0006\u0003\u0000\u01c5\u01c6\u0005\u0002\u0000\u0000"+
		"\u01c6\u0214\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005Q\u0000\u0000\u01c8"+
		"\u01c9\u0005\u0001\u0000\u0000\u01c9\u01ca\u0003\u0006\u0003\u0000\u01ca"+
		"\u01cb\u0005\u0002\u0000\u0000\u01cb\u0214\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cd\u0005R\u0000\u0000\u01cd\u01ce\u0005\u0001\u0000\u0000\u01ce\u01cf"+
		"\u0003\u0006\u0003\u0000\u01cf\u01d0\u0005\u0002\u0000\u0000\u01d0\u0214"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005S\u0000\u0000\u01d2\u01d3\u0005"+
		"\u0001\u0000\u0000\u01d3\u01d4\u0003\u0006\u0003\u0000\u01d4\u01d5\u0005"+
		"\u0002\u0000\u0000\u01d5\u0214\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005"+
		"T\u0000\u0000\u01d7\u01d8\u0005\u0001\u0000\u0000\u01d8\u01d9\u0003\u0006"+
		"\u0003\u0000\u01d9\u01da\u0005\u0002\u0000\u0000\u01da\u0214\u0001\u0000"+
		"\u0000\u0000\u01db\u01dc\u0005U\u0000\u0000\u01dc\u01dd\u0005\u0001\u0000"+
		"\u0000\u01dd\u01de\u0003\u0006\u0003\u0000\u01de\u01df\u0005\u0002\u0000"+
		"\u0000\u01df\u0214\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005V\u0000\u0000"+
		"\u01e1\u01e2\u0005\u0001\u0000\u0000\u01e2\u01e3\u0003\u0006\u0003\u0000"+
		"\u01e3\u01e4\u0005\u0005\u0000\u0000\u01e4\u01e5\u0003\u0006\u0003\u0000"+
		"\u01e5\u01e6\u0005\u0002\u0000\u0000\u01e6\u0214\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0005W\u0000\u0000\u01e8\u01e9\u0005\u0001\u0000\u0000\u01e9"+
		"\u01ea\u0003\u0006\u0003\u0000\u01ea\u01eb\u0005\u0002\u0000\u0000\u01eb"+
		"\u0214\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005X\u0000\u0000\u01ed\u01ee"+
		"\u0005\u0001\u0000\u0000\u01ee\u01ef\u0003\u0006\u0003\u0000\u01ef\u01f0"+
		"\u0005\u0002\u0000\u0000\u01f0\u0214\u0001\u0000\u0000\u0000\u01f1\u01f2"+
		"\u0005Y\u0000\u0000\u01f2\u01f3\u0005\u0001\u0000\u0000\u01f3\u01f4\u0003"+
		"\u0006\u0003\u0000\u01f4\u01f5\u0005\u0002\u0000\u0000\u01f5\u0214\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f7\u0005Z\u0000\u0000\u01f7\u01fd\u0005\u0001"+
		"\u0000\u0000\u01f8\u01fe\u0003\u0006\u0003\u0000\u01f9\u01fa\u0003\u0006"+
		"\u0003\u0000\u01fa\u01fb\u0005\u0005\u0000\u0000\u01fb\u01fc\u0003\u0006"+
		"\u0003\u0000\u01fc\u01fe\u0001\u0000\u0000\u0000\u01fd\u01f8\u0001\u0000"+
		"\u0000\u0000\u01fd\u01f9\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u0005\u0002\u0000\u0000\u0200\u0214\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u0005[\u0000\u0000\u0202\u0203\u0005\u0001\u0000"+
		"\u0000\u0203\u0204\u0003\u0006\u0003\u0000\u0204\u0205\u0005\u0002\u0000"+
		"\u0000\u0205\u0214\u0001\u0000\u0000\u0000\u0206\u0207\u0005\\\u0000\u0000"+
		"\u0207\u0208\u0005\u0001\u0000\u0000\u0208\u0209\u0003\u0006\u0003\u0000"+
		"\u0209\u020a\u0005\u0002\u0000\u0000\u020a\u0214\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0005]\u0000\u0000\u020c\u020d\u0005\u0001\u0000\u0000\u020d"+
		"\u020e\u0005\u009d\u0000\u0000\u020e\u0214\u0005\u0002\u0000\u0000\u020f"+
		"\u0210\u0005^\u0000\u0000\u0210\u0211\u0005\u0001\u0000\u0000\u0211\u0212"+
		"\u0005\u009d\u0000\u0000\u0212\u0214\u0005\u0002\u0000\u0000\u0213\u016c"+
		"\u0001\u0000\u0000\u0000\u0213\u0171\u0001\u0000\u0000\u0000\u0213\u0176"+
		"\u0001\u0000\u0000\u0000\u0213\u017b\u0001\u0000\u0000\u0000\u0213\u0182"+
		"\u0001\u0000\u0000\u0000\u0213\u0189\u0001\u0000\u0000\u0000\u0213\u0190"+
		"\u0001\u0000\u0000\u0000\u0213\u0195\u0001\u0000\u0000\u0000\u0213\u019a"+
		"\u0001\u0000\u0000\u0000\u0213\u01a5\u0001\u0000\u0000\u0000\u0213\u01ac"+
		"\u0001\u0000\u0000\u0000\u0213\u01b3\u0001\u0000\u0000\u0000\u0213\u01bd"+
		"\u0001\u0000\u0000\u0000\u0213\u01c2\u0001\u0000\u0000\u0000\u0213\u01c7"+
		"\u0001\u0000\u0000\u0000\u0213\u01cc\u0001\u0000\u0000\u0000\u0213\u01d1"+
		"\u0001\u0000\u0000\u0000\u0213\u01d6\u0001\u0000\u0000\u0000\u0213\u01db"+
		"\u0001\u0000\u0000\u0000\u0213\u01e0\u0001\u0000\u0000\u0000\u0213\u01e7"+
		"\u0001\u0000\u0000\u0000\u0213\u01ec\u0001\u0000\u0000\u0000\u0213\u01f1"+
		"\u0001\u0000\u0000\u0000\u0213\u01f6\u0001\u0000\u0000\u0000\u0213\u0201"+
		"\u0001\u0000\u0000\u0000\u0213\u0206\u0001\u0000\u0000\u0000\u0213\u020b"+
		"\u0001\u0000\u0000\u0000\u0213\u020f\u0001\u0000\u0000\u0000\u0214A\u0001"+
		"\u0000\u0000\u0000\u0215\u0218\u0003D\"\u0000\u0216\u0218\u0003H$\u0000"+
		"\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0216\u0001\u0000\u0000\u0000"+
		"\u0218C\u0001\u0000\u0000\u0000\u0219\u021a\u0005\u0013\u0000\u0000\u021a"+
		"\u021b\u0003F#\u0000\u021bE\u0001\u0000\u0000\u0000\u021c\u021d\u0005"+
		"_\u0000\u0000\u021d\u021e\u0005\u0001\u0000\u0000\u021e\u021f\u0003\u0006"+
		"\u0003\u0000\u021f\u0220\u0005\u0002\u0000\u0000\u0220\u024f\u0001\u0000"+
		"\u0000\u0000\u0221\u0222\u0005`\u0000\u0000\u0222\u0223\u0005\u0001\u0000"+
		"\u0000\u0223\u0224\u0003\u0006\u0003\u0000\u0224\u0225\u0005\u0002\u0000"+
		"\u0000\u0225\u024f\u0001\u0000\u0000\u0000\u0226\u0227\u0005a\u0000\u0000"+
		"\u0227\u0228\u0005\u0001\u0000\u0000\u0228\u0229\u0003\u0006\u0003\u0000"+
		"\u0229\u022a\u0005\u0002\u0000\u0000\u022a\u024f\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0005b\u0000\u0000\u022c\u022d\u0005\u0001\u0000\u0000\u022d"+
		"\u022e\u0003\u0006\u0003\u0000\u022e\u022f\u0005\u0002\u0000\u0000\u022f"+
		"\u024f\u0001\u0000\u0000\u0000\u0230\u0231\u0005c\u0000\u0000\u0231\u0232"+
		"\u0005\u0001\u0000\u0000\u0232\u0233\u0003\u0006\u0003\u0000\u0233\u0234"+
		"\u0005\u0002\u0000\u0000\u0234\u024f\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0005d\u0000\u0000\u0236\u0237\u0005\u0001\u0000\u0000\u0237\u0238\u0003"+
		"\u0006\u0003\u0000\u0238\u0239\u0005\u0002\u0000\u0000\u0239\u024f\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0005e\u0000\u0000\u023b\u023c\u0005\u0001"+
		"\u0000\u0000\u023c\u023d\u0003\u0006\u0003\u0000\u023d\u023e\u0005\u0002"+
		"\u0000\u0000\u023e\u024f\u0001\u0000\u0000\u0000\u023f\u0240\u0005f\u0000"+
		"\u0000\u0240\u0241\u0005\u0001\u0000\u0000\u0241\u0242\u0003\u0006\u0003"+
		"\u0000\u0242\u0243\u0005\u0002\u0000\u0000\u0243\u024f\u0001\u0000\u0000"+
		"\u0000\u0244\u0245\u0005g\u0000\u0000\u0245\u0246\u0005\u0001\u0000\u0000"+
		"\u0246\u0247\u0003\u0006\u0003\u0000\u0247\u0248\u0005\u0002\u0000\u0000"+
		"\u0248\u024f\u0001\u0000\u0000\u0000\u0249\u024a\u0005h\u0000\u0000\u024a"+
		"\u024b\u0005\u0001\u0000\u0000\u024b\u024c\u0003\u0006\u0003\u0000\u024c"+
		"\u024d\u0005\u0002\u0000\u0000\u024d\u024f\u0001\u0000\u0000\u0000\u024e"+
		"\u021c\u0001\u0000\u0000\u0000\u024e\u0221\u0001\u0000\u0000\u0000\u024e"+
		"\u0226\u0001\u0000\u0000\u0000\u024e\u022b\u0001\u0000\u0000\u0000\u024e"+
		"\u0230\u0001\u0000\u0000\u0000\u024e\u0235\u0001\u0000\u0000\u0000\u024e"+
		"\u023a\u0001\u0000\u0000\u0000\u024e\u023f\u0001\u0000\u0000\u0000\u024e"+
		"\u0244\u0001\u0000\u0000\u0000\u024e\u0249\u0001\u0000\u0000\u0000\u024f"+
		"G\u0001\u0000\u0000\u0000\u0250\u0251\u0005i\u0000\u0000\u0251\u026c\u0005"+
		"\u0006\u0000\u0000\u0252\u0253\u0005j\u0000\u0000\u0253\u0254\u0005\u0001"+
		"\u0000\u0000\u0254\u0255\u0003\u0006\u0003\u0000\u0255\u0256\u0005\u0002"+
		"\u0000\u0000\u0256\u026c\u0001\u0000\u0000\u0000\u0257\u0258\u0005k\u0000"+
		"\u0000\u0258\u0259\u0005\u0001\u0000\u0000\u0259\u025a\u0003\u0006\u0003"+
		"\u0000\u025a\u025b\u0005\u0002\u0000\u0000\u025b\u026c\u0001\u0000\u0000"+
		"\u0000\u025c\u025d\u0005l\u0000\u0000\u025d\u025e\u0005\u0001\u0000\u0000"+
		"\u025e\u025f\u0003\u0006\u0003\u0000\u025f\u0260\u0005\u0002\u0000\u0000"+
		"\u0260\u026c\u0001\u0000\u0000\u0000\u0261\u0262\u0005m\u0000\u0000\u0262"+
		"\u0263\u0005\u0001\u0000\u0000\u0263\u0264\u0003\u0006\u0003\u0000\u0264"+
		"\u0265\u0005\u0002\u0000\u0000\u0265\u026c\u0001\u0000\u0000\u0000\u0266"+
		"\u0267\u0005n\u0000\u0000\u0267\u0268\u0005\u0001\u0000\u0000\u0268\u0269"+
		"\u0003\u0006\u0003\u0000\u0269\u026a\u0005\u0002\u0000\u0000\u026a\u026c"+
		"\u0001\u0000\u0000\u0000\u026b\u0250\u0001\u0000\u0000\u0000\u026b\u0252"+
		"\u0001\u0000\u0000\u0000\u026b\u0257\u0001\u0000\u0000\u0000\u026b\u025c"+
		"\u0001\u0000\u0000\u0000\u026b\u0261\u0001\u0000\u0000\u0000\u026b\u0266"+
		"\u0001\u0000\u0000\u0000\u026cI\u0001\u0000\u0000\u0000&MUgntw~\u0086"+
		"\u0090\u0099\u00aa\u00b1\u00bc\u00c5\u00c9\u00d2\u00d8\u00df\u00f2\u00f8"+
		"\u0105\u010f\u0123\u0127\u012c\u012f\u0136\u013b\u0140\u014b\u0162\u01a1"+
		"\u01ba\u01fd\u0213\u0217\u024e\u026b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}