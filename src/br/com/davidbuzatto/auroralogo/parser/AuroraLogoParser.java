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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ABA=9, 
		ABE=10, ATE=11, BAI=12, CADA=13, CAM=14, CIM=15, COD=16, COM=17, CONT=18, 
		CON=19, COR=20, CUBI=21, CUR=22, CRA=23, CRAA=24, CRR=25, CRRA=26, DCMM=27, 
		DE=28, DES=29, DESE=30, DIAG=31, DIR=32, DIVM=33, DO=34, E=35, EM=36, 
		ENG=37, ENQ=38, ENT=39, ESCO=40, ESC=41, ESQ=42, FAL=43, FEC=44, FORM=45, 
		FUN=46, GIR=47, GRA=48, GROS=49, INCM=50, INI=51, LER=52, LEV=53, LIM=54, 
		LIN=55, MOV=56, MULM=57, NA=58, NO=59, PADR=60, PARA=61, PARR=62, PI=63, 
		PINC=64, PIZ=65, POR=66, PREE=67, PUL=68, QUAD=69, REP=70, REPE=71, SAI=72, 
		SE=73, SEN=74, SEM=75, SOMM=76, SUBM=77, TART=78, TER=79, TROC=80, USA=81, 
		VA=82, VER=83, VEZ=84, VEZS=85, PRETO=86, AZUL=87, CIANO=88, CINZA=89, 
		VERDE=90, MAGENTA=91, LARANJA=92, ROSA=93, VERMELHO=94, BRANCO=95, AMARELO=96, 
		ESCURO=97, CLARO=98, PA=99, PX=100, PY=101, CHAV=102, COMP=103, F_ACOS=104, 
		F_ARRE=105, F_ASEN=106, F_ATAN=107, F_CAPO=108, F_CHAO=109, F_COSH=110, 
		F_COSS=111, F_DCM=112, F_GRRA=113, F_HIPO=114, F_INC=115, F_LOGA=116, 
		F_MAXI=117, F_MINI=118, F_NUMA=119, F_POTE=120, F_RAGR=121, F_RAIC=122, 
		F_RAIQ=123, F_RAIZ=124, F_SEME=125, F_SENH=126, F_SENO=127, F_TANG=128, 
		F_TANH=129, F_TETO=130, F_VABS=131, FG_ARC=132, FG_CCU=133, FG_CIC=134, 
		FG_CQD=135, FG_ELI=136, FG_EST=137, FG_POL=138, FG_POR=139, FG_QUA=140, 
		FG_RET=141, FG_REA=142, FG_SEG=143, ATR=144, ATRA=145, AC_A=146, AT_A=147, 
		AC_S=148, AT_S=149, AC_M=150, AT_M=151, AC_D=152, AT_D=153, AC_R=154, 
		AT_R=155, ADI=156, ADIA=157, SUB=158, SUBA=159, MUL=160, DIV=161, DIVA=162, 
		MOD=163, MODA=164, IGU=165, IGUT=166, IGUA=167, DIF=168, DIFT=169, DIFA=170, 
		ME=171, MET=172, MEA=173, MEI=174, MEIT=175, MEIA=176, MA=177, MAT=178, 
		MAA=179, MAI=180, MAIT=181, MAIA=182, ELG=183, ELGT=184, OLG=185, OLGT=186, 
		NAO=187, NAOT=188, DOT=189, ID=190, IDC=191, IDA=192, INT=193, DEC=194, 
		CHEX=195, CHAR=196, STRING=197, COMENTARIO=198, COMENTARIO_LINHA=199, 
		WS=200;
	public static final int
		RULE_prog = 0, RULE_inst = 1, RULE_ains = 2, RULE_expr = 3, RULE_relacao = 4, 
		RULE_exprSimp = 5, RULE_termo = 6, RULE_fator = 7, RULE_exprBool = 8, 
		RULE_se = 9, RULE_seSe = 10, RULE_seSenaoSe = 11, RULE_seSenao = 12, RULE_usando = 13, 
		RULE_escolha = 14, RULE_repetir = 15, RULE_repeticao = 16, RULE_repetirEnquanto = 17, 
		RULE_paraCada = 18, RULE_parar = 19, RULE_continuar = 20, RULE_movimentar = 21, 
		RULE_trocarCor = 22, RULE_configuracaoCor = 23, RULE_cor = 24, RULE_girar = 25, 
		RULE_engrossar = 26, RULE_desengrossar = 27, RULE_trocarGrossura = 28, 
		RULE_escrever = 29, RULE_ler = 30, RULE_atribuir = 31, RULE_exprIndice = 32, 
		RULE_abaixar = 33, RULE_levantar = 34, RULE_limpar = 35, RULE_funcaoMatematica = 36, 
		RULE_instrucaoGeometrica = 37, RULE_funcaoGeometrica = 38, RULE_opcaoFGeomO = 39, 
		RULE_desenharCaminho = 40, RULE_instCaminho = 41, RULE_consultarTartaruga = 42, 
		RULE_formatarTexto = 43, RULE_criarArranjos = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "inst", "ains", "expr", "relacao", "exprSimp", "termo", "fator", 
			"exprBool", "se", "seSe", "seSenaoSe", "seSenao", "usando", "escolha", 
			"repetir", "repeticao", "repetirEnquanto", "paraCada", "parar", "continuar", 
			"movimentar", "trocarCor", "configuracaoCor", "cor", "girar", "engrossar", 
			"desengrossar", "trocarGrossura", "escrever", "ler", "atribuir", "exprIndice", 
			"abaixar", "levantar", "limpar", "funcaoMatematica", "instrucaoGeometrica", 
			"funcaoGeometrica", "opcaoFGeomO", "desenharCaminho", "instCaminho", 
			"consultarTartaruga", "formatarTexto", "criarArranjos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'{'", "'}'", "'('", "')'", "':'", "','", "'abaixar'", 
			"'ABERTO'", "'at\\u00E9'", "'baixo'", "'cada'", "'caminho'", "'cima'", 
			"'CORDA'", "'com'", "'continuar'", "'contorno'", "'cor'", "'c\\u00FAbica'", 
			"'curva'", "'criarArranjo'", "'criarArranjoAssociativo'", "'criarArray'", 
			"'criarArrayAssociativo'", "'decrementando'", "'de'", "'desengrossar'", 
			"'desenhar'", "'di\\u00E1logo'", "'direita'", "'dividindo'", "'do'", 
			"'e'", "'em'", "'engrossar'", "'enquanto'", "'ent\\u00E3o'", "'escolha'", 
			"'escrever'", "'esquerda'", "'FALSO'", "'fechar'", "'formatarTexto'", 
			"'fundo'", "'girar'", "'graus'", "'grossura'", "'incrementando'", "'iniciar'", 
			"'ler'", "'levantar'", "'limpar'", "'linha'", "'mover'", "'multiplicando'", 
			"'na'", "'no'", "'padr\\u00E3o'", "'para'", "'parar'", "'PI'", "'pincel'", 
			"'PIZZA'", "'por'", "'preenchimento'", "'pulando'", "'quadr\\u00E1tica'", 
			"'repetir'", "'repeti\\u00E7\\u00E3o'", "'sa\\u00EDda'", "'se'", "'sen\\u00E3o'", 
			"'sem'", "'somando'", "'subtraindo'", "'tartaruga'", "'terminar'", "'trocar'", 
			"'usando'", "'v\\u00E1'", "'VERDADEIRO'", "'vez'", "'vezes'", "'preto'", 
			"'azul'", "'ciano'", "'cinza'", "'verde'", "'magenta'", "'laranja'", 
			"'rosa'", "'vermelho'", "'branco'", "'amarelo'", "'escuro'", "'claro'", 
			"'\\u00E2ngulo'", "'x'", "'y'", "'chaves'", "'comprimento'", "'arcoCosseno'", 
			"'arredondar'", "'arcoSeno'", "'arcoTangente'", "'cartesianoParaPolar'", 
			"'ch\\u00E3o'", "'cossenoHiperb\\u00F3lico'", "'cosseno'", "'decrementar'", 
			"'grausParaRadianos'", "'hipotenusa'", "'incrementar'", "'logar\\u00EDtmo'", 
			"'m\\u00E1ximo'", "'m\\u00EDnimo'", "'n\\u00FAmeroAleat\\u00F3rio'", 
			"'pot\\u00EAncia'", "'radianosParaGraus'", "'raizC\\u00FAbica'", "'raizQuadrada'", 
			"'raiz'", "'definirSementeAleat\\u00F3ria'", "'senoHiperb\\u00F3lico'", 
			"'seno'", "'tangente'", "'tangenteHiperb\\u00F3lica'", "'teto'", "'valorAbsoluto'", 
			"'arco'", "'curvaC\\u00FAbica'", "'c\\u00EDrculo'", "'curvaQuadr\\u00E1tica'", 
			"'elipse'", "'estrela'", "'pol\\u00EDgono'", "'pol\\u00EDgonoRegular'", 
			"'quadrado'", "'ret\\u00E2ngulo'", "'ret\\u00E2nguloArredondado'", "'segmento'", 
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
			null, null, null, null, null, null, null, null, null, "ABA", "ABE", "ATE", 
			"BAI", "CADA", "CAM", "CIM", "COD", "COM", "CONT", "CON", "COR", "CUBI", 
			"CUR", "CRA", "CRAA", "CRR", "CRRA", "DCMM", "DE", "DES", "DESE", "DIAG", 
			"DIR", "DIVM", "DO", "E", "EM", "ENG", "ENQ", "ENT", "ESCO", "ESC", "ESQ", 
			"FAL", "FEC", "FORM", "FUN", "GIR", "GRA", "GROS", "INCM", "INI", "LER", 
			"LEV", "LIM", "LIN", "MOV", "MULM", "NA", "NO", "PADR", "PARA", "PARR", 
			"PI", "PINC", "PIZ", "POR", "PREE", "PUL", "QUAD", "REP", "REPE", "SAI", 
			"SE", "SEN", "SEM", "SOMM", "SUBM", "TART", "TER", "TROC", "USA", "VA", 
			"VER", "VEZ", "VEZS", "PRETO", "AZUL", "CIANO", "CINZA", "VERDE", "MAGENTA", 
			"LARANJA", "ROSA", "VERMELHO", "BRANCO", "AMARELO", "ESCURO", "CLARO", 
			"PA", "PX", "PY", "CHAV", "COMP", "F_ACOS", "F_ARRE", "F_ASEN", "F_ATAN", 
			"F_CAPO", "F_CHAO", "F_COSH", "F_COSS", "F_DCM", "F_GRRA", "F_HIPO", 
			"F_INC", "F_LOGA", "F_MAXI", "F_MINI", "F_NUMA", "F_POTE", "F_RAGR", 
			"F_RAIC", "F_RAIQ", "F_RAIZ", "F_SEME", "F_SENH", "F_SENO", "F_TANG", 
			"F_TANH", "F_TETO", "F_VABS", "FG_ARC", "FG_CCU", "FG_CIC", "FG_CQD", 
			"FG_ELI", "FG_EST", "FG_POL", "FG_POR", "FG_QUA", "FG_RET", "FG_REA", 
			"FG_SEG", "ATR", "ATRA", "AC_A", "AT_A", "AC_S", "AT_S", "AC_M", "AT_M", 
			"AC_D", "AT_D", "AC_R", "AT_R", "ADI", "ADIA", "SUB", "SUBA", "MUL", 
			"DIV", "DIVA", "MOD", "MODA", "IGU", "IGUT", "IGUA", "DIF", "DIFT", "DIFA", 
			"ME", "MET", "MEA", "MEI", "MEIT", "MEIA", "MA", "MAT", "MAA", "MAI", 
			"MAIT", "MAIA", "ELG", "ELGT", "OLG", "OLGT", "NAO", "NAOT", "DOT", "ID", 
			"IDC", "IDA", "INT", "DEC", "CHEX", "CHAR", "STRING", "COMENTARIO", "COMENTARIO_LINHA", 
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
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				inst();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (REP - 70)) | (1L << (REPE - 70)) | (1L << (SE - 70)) | (1L << (TART - 70)) | (1L << (TROC - 70)) | (1L << (USA - 70)) | (1L << (VA - 70)) | (1L << (VER - 70)) | (1L << (F_ACOS - 70)) | (1L << (F_ARRE - 70)) | (1L << (F_ASEN - 70)) | (1L << (F_ATAN - 70)) | (1L << (F_CAPO - 70)) | (1L << (F_CHAO - 70)) | (1L << (F_COSH - 70)) | (1L << (F_COSS - 70)) | (1L << (F_DCM - 70)) | (1L << (F_GRRA - 70)) | (1L << (F_HIPO - 70)) | (1L << (F_INC - 70)) | (1L << (F_LOGA - 70)) | (1L << (F_MAXI - 70)) | (1L << (F_MINI - 70)) | (1L << (F_NUMA - 70)) | (1L << (F_POTE - 70)) | (1L << (F_RAGR - 70)) | (1L << (F_RAIC - 70)) | (1L << (F_RAIQ - 70)) | (1L << (F_RAIZ - 70)) | (1L << (F_SEME - 70)) | (1L << (F_SENH - 70)) | (1L << (F_SENO - 70)) | (1L << (F_TANG - 70)) | (1L << (F_TANH - 70)) | (1L << (F_TETO - 70)) | (1L << (F_VABS - 70)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (ADI - 156)) | (1L << (ADIA - 156)) | (1L << (SUB - 156)) | (1L << (SUBA - 156)) | (1L << (NAO - 156)) | (1L << (NAOT - 156)) | (1L << (ID - 156)) | (1L << (INT - 156)) | (1L << (DEC - 156)) | (1L << (CHEX - 156)) | (1L << (CHAR - 156)) | (1L << (STRING - 156)))) != 0) );
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
		public ParaCadaContext paraCada() {
			return getRuleContext(ParaCadaContext.class,0);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				ains();
				setState(96);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				se();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				usando();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				repetir();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				repetirEnquanto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				paraCada();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
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
		public AbaixarContext abaixar() {
			return getRuleContext(AbaixarContext.class,0);
		}
		public LevantarContext levantar() {
			return getRuleContext(LevantarContext.class,0);
		}
		public LimparContext limpar() {
			return getRuleContext(LimparContext.class,0);
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
		public PararContext parar() {
			return getRuleContext(PararContext.class,0);
		}
		public ContinuarContext continuar() {
			return getRuleContext(ContinuarContext.class,0);
		}
		public InstrucaoGeometricaContext instrucaoGeometrica() {
			return getRuleContext(InstrucaoGeometricaContext.class,0);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				movimentar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				trocarCor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				girar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				abaixar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				levantar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				limpar();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				engrossar();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				desengrossar();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(114);
				trocarGrossura();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(115);
				escrever();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(116);
				ler();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(117);
				atribuir();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(118);
				parar();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(119);
				continuar();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(120);
				instrucaoGeometrica();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(121);
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
			setState(124);
			relacao();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (ELG - 183)) | (1L << (ELGT - 183)) | (1L << (OLG - 183)) | (1L << (OLGT - 183)))) != 0)) {
				{
				{
				setState(125);
				_la = _input.LA(1);
				if ( !(((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (ELG - 183)) | (1L << (ELGT - 183)) | (1L << (OLG - 183)) | (1L << (OLGT - 183)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(126);
				relacao();
				}
				}
				setState(131);
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
			setState(132);
			exprSimp();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & ((1L << (IGU - 165)) | (1L << (IGUT - 165)) | (1L << (IGUA - 165)) | (1L << (DIF - 165)) | (1L << (DIFT - 165)) | (1L << (DIFA - 165)) | (1L << (ME - 165)) | (1L << (MET - 165)) | (1L << (MEA - 165)) | (1L << (MEI - 165)) | (1L << (MEIT - 165)) | (1L << (MEIA - 165)) | (1L << (MA - 165)) | (1L << (MAT - 165)) | (1L << (MAA - 165)) | (1L << (MAI - 165)) | (1L << (MAIT - 165)) | (1L << (MAIA - 165)))) != 0)) {
				{
				setState(133);
				((RelacaoContext)_localctx).opRel = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & ((1L << (IGU - 165)) | (1L << (IGUT - 165)) | (1L << (IGUA - 165)) | (1L << (DIF - 165)) | (1L << (DIFT - 165)) | (1L << (DIFA - 165)) | (1L << (ME - 165)) | (1L << (MET - 165)) | (1L << (MEA - 165)) | (1L << (MEI - 165)) | (1L << (MEIT - 165)) | (1L << (MEIA - 165)) | (1L << (MA - 165)) | (1L << (MAT - 165)) | (1L << (MAA - 165)) | (1L << (MAI - 165)) | (1L << (MAIT - 165)) | (1L << (MAIA - 165)))) != 0)) ) {
					((RelacaoContext)_localctx).opRel = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
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
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (ADI - 156)) | (1L << (ADIA - 156)) | (1L << (SUB - 156)) | (1L << (SUBA - 156)))) != 0)) {
				{
				setState(137);
				((ExprSimpContext)_localctx).opNeg = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (ADI - 156)) | (1L << (ADIA - 156)) | (1L << (SUB - 156)) | (1L << (SUBA - 156)))) != 0)) ) {
					((ExprSimpContext)_localctx).opNeg = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(140);
			termo();
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					_la = _input.LA(1);
					if ( !(((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (ADI - 156)) | (1L << (ADIA - 156)) | (1L << (SUB - 156)) | (1L << (SUBA - 156)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(142);
					termo();
					}
					} 
				}
				setState(147);
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
			setState(148);
			fator();
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					_la = _input.LA(1);
					if ( !(_la==VEZS || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (MUL - 160)) | (1L << (DIV - 160)) | (1L << (DIVA - 160)) | (1L << (MOD - 160)) | (1L << (MODA - 160)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(150);
					fator();
					}
					} 
				}
				setState(155);
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
	public static class FatorIdIdAtributoContext extends FatorContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public List<TerminalNode> DOT() { return getTokens(AuroraLogoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AuroraLogoParser.DOT, i);
		}
		public List<TerminalNode> IDA() { return getTokens(AuroraLogoParser.IDA); }
		public TerminalNode IDA(int i) {
			return getToken(AuroraLogoParser.IDA, i);
		}
		public FatorIdIdAtributoContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorIdIdAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorIdIdAtributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorIdIdAtributo(this);
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
	public static class FatorIdContext extends FatorContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public TerminalNode DOT() { return getToken(AuroraLogoParser.DOT, 0); }
		public TerminalNode COMP() { return getToken(AuroraLogoParser.COMP, 0); }
		public TerminalNode CHAV() { return getToken(AuroraLogoParser.CHAV, 0); }
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
	public static class FatorRepeticaoContext extends FatorContext {
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public FatorRepeticaoContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorRepeticao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FatorIdArranjoAssociativoContext extends FatorContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AuroraLogoParser.DOT, 0); }
		public TerminalNode COMP() { return getToken(AuroraLogoParser.COMP, 0); }
		public TerminalNode CHAV() { return getToken(AuroraLogoParser.CHAV, 0); }
		public FatorIdArranjoAssociativoContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorIdArranjoAssociativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorIdArranjoAssociativo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorIdArranjoAssociativo(this);
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
	public static class FatorIdArranjoContext extends FatorContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(AuroraLogoParser.DOT, 0); }
		public TerminalNode COMP() { return getToken(AuroraLogoParser.COMP, 0); }
		public TerminalNode CHAV() { return getToken(AuroraLogoParser.CHAV, 0); }
		public FatorIdArranjoContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorIdArranjo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorIdArranjo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorIdArranjo(this);
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
	public static class FatorBoolContext extends FatorContext {
		public TerminalNode VER() { return getToken(AuroraLogoParser.VER, 0); }
		public TerminalNode FAL() { return getToken(AuroraLogoParser.FAL, 0); }
		public FatorBoolContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fator);
		int _la;
		try {
			int _alt;
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new FatorNaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NAOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(157);
				fator();
				}
				break;
			case 2:
				_localctx = new FatorIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(INT);
				}
				break;
			case 3:
				_localctx = new FatorDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(DEC);
				}
				break;
			case 4:
				_localctx = new FatorPiContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(PI);
				}
				break;
			case 5:
				_localctx = new FatorIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				match(ID);
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(162);
					match(DOT);
					setState(163);
					match(COMP);
					}
					break;
				case 2:
					{
					setState(164);
					match(DOT);
					setState(165);
					match(CHAV);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new FatorIdArranjoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				match(ID);
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(169);
					match(T__0);
					setState(170);
					expr();
					setState(171);
					match(T__1);
					}
					}
					setState(175); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(177);
					match(DOT);
					setState(178);
					match(COMP);
					}
					break;
				case 2:
					{
					setState(179);
					match(DOT);
					setState(180);
					match(CHAV);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new FatorIdArranjoAssociativoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				match(ID);
				setState(184);
				match(T__2);
				setState(185);
				expr();
				setState(186);
				match(T__3);
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(187);
					match(DOT);
					setState(188);
					match(COMP);
					}
					break;
				case 2:
					{
					setState(189);
					match(DOT);
					setState(190);
					match(CHAV);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new FatorIdIdAtributoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(193);
				match(ID);
				setState(196); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(194);
						match(DOT);
						setState(195);
						match(IDA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(198); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
				_localctx = new FatorCharContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(200);
				match(CHAR);
				}
				break;
			case 10:
				_localctx = new FatorStringContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(201);
				match(STRING);
				}
				break;
			case 11:
				_localctx = new FatorBoolContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(202);
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
				break;
			case 12:
				_localctx = new FatorCorContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(203);
				cor();
				}
				break;
			case 13:
				_localctx = new FatorFuncaoMatematicaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(204);
				funcaoMatematica();
				}
				break;
			case 14:
				_localctx = new FatorConsultarTartarugaContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(205);
				consultarTartaruga();
				}
				break;
			case 15:
				_localctx = new FatorFormatarTextoContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(206);
				formatarTexto();
				}
				break;
			case 16:
				_localctx = new FatorRepeticaoContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(207);
				repeticao();
				}
				break;
			case 17:
				_localctx = new FatorParentesesContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(208);
				match(T__4);
				setState(209);
				expr();
				setState(210);
				match(T__5);
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
			setState(214);
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
		enterRule(_localctx, 18, RULE_se);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			seSe();
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					seSenaoSe();
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEN) {
				{
				setState(223);
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
		enterRule(_localctx, 20, RULE_seSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(SE);
			setState(227);
			exprBool();
			setState(228);
			match(ENT);
			setState(229);
			match(T__2);
			setState(231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230);
				inst();
				}
				}
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (REP - 70)) | (1L << (REPE - 70)) | (1L << (SE - 70)) | (1L << (TART - 70)) | (1L << (TROC - 70)) | (1L << (USA - 70)) | (1L << (VA - 70)) | (1L << (VER - 70)) | (1L << (F_ACOS - 70)) | (1L << (F_ARRE - 70)) | (1L << (F_ASEN - 70)) | (1L << (F_ATAN - 70)) | (1L << (F_CAPO - 70)) | (1L << (F_CHAO - 70)) | (1L << (F_COSH - 70)) | (1L << (F_COSS - 70)) | (1L << (F_DCM - 70)) | (1L << (F_GRRA - 70)) | (1L << (F_HIPO - 70)) | (1L << (F_INC - 70)) | (1L << (F_LOGA - 70)) | (1L << (F_MAXI - 70)) | (1L << (F_MINI - 70)) | (1L << (F_NUMA - 70)) | (1L << (F_POTE - 70)) | (1L << (F_RAGR - 70)) | (1L << (F_RAIC - 70)) | (1L << (F_RAIQ - 70)) | (1L << (F_RAIZ - 70)) | (1L << (F_SEME - 70)) | (1L << (F_SENH - 70)) | (1L << (F_SENO - 70)) | (1L << (F_TANG - 70)) | (1L << (F_TANH - 70)) | (1L << (F_TETO - 70)) | (1L << (F_VABS - 70)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (ADI - 156)) | (1L << (ADIA - 156)) | (1L << (SUB - 156)) | (1L << (SUBA - 156)) | (1L << (NAO - 156)) | (1L << (NAOT - 156)) | (1L << (ID - 156)) | (1L << (INT - 156)) | (1L << (DEC - 156)) | (1L << (CHEX - 156)) | (1L << (CHAR - 156)) | (1L << (STRING - 156)))) != 0) );
			setState(235);
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
		enterRule(_localctx, 22, RULE_seSenaoSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(SEN);
			setState(238);
			match(SE);
			setState(239);
			exprBool();
			setState(240);
			match(ENT);
			setState(241);
			match(T__2);
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				inst();
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (REP - 70)) | (1L << (REPE - 70)) | (1L << (SE - 70)) | (1L << (TART - 70)) | (1L << (TROC - 70)) | (1L << (USA - 70)) | (1L << (VA - 70)) | (1L << (VER - 70)) | (1L << (F_ACOS - 70)) | (1L << (F_ARRE - 70)) | (1L << (F_ASEN - 70)) | (1L << (F_ATAN - 70)) | (1L << (F_CAPO - 70)) | (1L << (F_CHAO - 70)) | (1L << (F_COSH - 70)) | (1L << (F_COSS - 70)) | (1L << (F_DCM - 70)) | (1L << (F_GRRA - 70)) | (1L << (F_HIPO - 70)) | (1L << (F_INC - 70)) | (1L << (F_LOGA - 70)) | (1L << (F_MAXI - 70)) | (1L << (F_MINI - 70)) | (1L << (F_NUMA - 70)) | (1L << (F_POTE - 70)) | (1L << (F_RAGR - 70)) | (1L << (F_RAIC - 70)) | (1L << (F_RAIQ - 70)) | (1L << (F_RAIZ - 70)) | (1L << (F_SEME - 70)) | (1L << (F_SENH - 70)) | (1L << (F_SENO - 70)) | (1L << (F_TANG - 70)) | (1L << (F_TANH - 70)) | (1L << (F_TETO - 70)) | (1L << (F_VABS - 70)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (ADI - 156)) | (1L << (ADIA - 156)) | (1L << (SUB - 156)) | (1L << (SUBA - 156)) | (1L << (NAO - 156)) | (1L << (NAOT - 156)) | (1L << (ID - 156)) | (1L << (INT - 156)) | (1L << (DEC - 156)) | (1L << (CHEX - 156)) | (1L << (CHAR - 156)) | (1L << (STRING - 156)))) != 0) );
			setState(247);
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
		enterRule(_localctx, 24, RULE_seSenao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(SEN);
			setState(250);
			match(T__2);
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251);
				inst();
				}
				}
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (REP - 70)) | (1L << (REPE - 70)) | (1L << (SE - 70)) | (1L << (TART - 70)) | (1L << (TROC - 70)) | (1L << (USA - 70)) | (1L << (VA - 70)) | (1L << (VER - 70)) | (1L << (F_ACOS - 70)) | (1L << (F_ARRE - 70)) | (1L << (F_ASEN - 70)) | (1L << (F_ATAN - 70)) | (1L << (F_CAPO - 70)) | (1L << (F_CHAO - 70)) | (1L << (F_COSH - 70)) | (1L << (F_COSS - 70)) | (1L << (F_DCM - 70)) | (1L << (F_GRRA - 70)) | (1L << (F_HIPO - 70)) | (1L << (F_INC - 70)) | (1L << (F_LOGA - 70)) | (1L << (F_MAXI - 70)) | (1L << (F_MINI - 70)) | (1L << (F_NUMA - 70)) | (1L << (F_POTE - 70)) | (1L << (F_RAGR - 70)) | (1L << (F_RAIC - 70)) | (1L << (F_RAIQ - 70)) | (1L << (F_RAIZ - 70)) | (1L << (F_SEME - 70)) | (1L << (F_SENH - 70)) | (1L << (F_SENO - 70)) | (1L << (F_TANG - 70)) | (1L << (F_TANH - 70)) | (1L << (F_TETO - 70)) | (1L << (F_VABS - 70)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (ADI - 156)) | (1L << (ADIA - 156)) | (1L << (SUB - 156)) | (1L << (SUBA - 156)) | (1L << (NAO - 156)) | (1L << (NAOT - 156)) | (1L << (ID - 156)) | (1L << (INT - 156)) | (1L << (DEC - 156)) | (1L << (CHEX - 156)) | (1L << (CHAR - 156)) | (1L << (STRING - 156)))) != 0) );
			setState(256);
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
		enterRule(_localctx, 26, RULE_usando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(USA);
			setState(259);
			match(ID);
			setState(260);
			match(T__2);
			setState(262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(261);
				escolha();
				}
				}
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESCO );
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PADR) {
				{
				setState(266);
				match(PADR);
				setState(267);
				match(T__6);
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(268);
					inst();
					}
					}
					setState(271); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (REP - 70)) | (1L << (REPE - 70)) | (1L << (SE - 70)) | (1L << (TART - 70)) | (1L << (TROC - 70)) | (1L << (USA - 70)) | (1L << (VA - 70)) | (1L << (VER - 70)) | (1L << (F_ACOS - 70)) | (1L << (F_ARRE - 70)) | (1L << (F_ASEN - 70)) | (1L << (F_ATAN - 70)) | (1L << (F_CAPO - 70)) | (1L << (F_CHAO - 70)) | (1L << (F_COSH - 70)) | (1L << (F_COSS - 70)) | (1L << (F_DCM - 70)) | (1L << (F_GRRA - 70)) | (1L << (F_HIPO - 70)) | (1L << (F_INC - 70)) | (1L << (F_LOGA - 70)) | (1L << (F_MAXI - 70)) | (1L << (F_MINI - 70)) | (1L << (F_NUMA - 70)) | (1L << (F_POTE - 70)) | (1L << (F_RAGR - 70)) | (1L << (F_RAIC - 70)) | (1L << (F_RAIQ - 70)) | (1L << (F_RAIZ - 70)) | (1L << (F_SEME - 70)) | (1L << (F_SENH - 70)) | (1L << (F_SENO - 70)) | (1L << (F_TANG - 70)) | (1L << (F_TANH - 70)) | (1L << (F_TETO - 70)) | (1L << (F_VABS - 70)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (ADI - 156)) | (1L << (ADIA - 156)) | (1L << (SUB - 156)) | (1L << (SUBA - 156)) | (1L << (NAO - 156)) | (1L << (NAOT - 156)) | (1L << (ID - 156)) | (1L << (INT - 156)) | (1L << (DEC - 156)) | (1L << (CHEX - 156)) | (1L << (CHAR - 156)) | (1L << (STRING - 156)))) != 0) );
				}
			}

			setState(275);
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
		enterRule(_localctx, 28, RULE_escolha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ESCO);
			setState(278);
			_la = _input.LA(1);
			if ( !(((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(279);
			match(T__6);
			setState(281); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(280);
				inst();
				}
				}
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (REP - 70)) | (1L << (REPE - 70)) | (1L << (SE - 70)) | (1L << (TART - 70)) | (1L << (TROC - 70)) | (1L << (USA - 70)) | (1L << (VA - 70)) | (1L << (VER - 70)) | (1L << (F_ACOS - 70)) | (1L << (F_ARRE - 70)) | (1L << (F_ASEN - 70)) | (1L << (F_ATAN - 70)) | (1L << (F_CAPO - 70)) | (1L << (F_CHAO - 70)) | (1L << (F_COSH - 70)) | (1L << (F_COSS - 70)) | (1L << (F_DCM - 70)) | (1L << (F_GRRA - 70)) | (1L << (F_HIPO - 70)) | (1L << (F_INC - 70)) | (1L << (F_LOGA - 70)) | (1L << (F_MAXI - 70)) | (1L << (F_MINI - 70)) | (1L << (F_NUMA - 70)) | (1L << (F_POTE - 70)) | (1L << (F_RAGR - 70)) | (1L << (F_RAIC - 70)) | (1L << (F_RAIQ - 70)) | (1L << (F_RAIZ - 70)) | (1L << (F_SEME - 70)) | (1L << (F_SENH - 70)) | (1L << (F_SENO - 70)) | (1L << (F_TANG - 70)) | (1L << (F_TANH - 70)) | (1L << (F_TETO - 70)) | (1L << (F_VABS - 70)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (ADI - 156)) | (1L << (ADIA - 156)) | (1L << (SUB - 156)) | (1L << (SUBA - 156)) | (1L << (NAO - 156)) | (1L << (NAOT - 156)) | (1L << (ID - 156)) | (1L << (INT - 156)) | (1L << (DEC - 156)) | (1L << (CHEX - 156)) | (1L << (CHAR - 156)) | (1L << (STRING - 156)))) != 0) );
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
			setState(285);
			match(REP);
			setState(286);
			expr();
			setState(287);
			_la = _input.LA(1);
			if ( !(_la==VEZ || _la==VEZS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(288);
			match(T__2);
			setState(290); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(289);
				inst();
				}
				}
				setState(292); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (REP - 70)) | (1L << (REPE - 70)) | (1L << (SE - 70)) | (1L << (TART - 70)) | (1L << (TROC - 70)) | (1L << (USA - 70)) | (1L << (VA - 70)) | (1L << (VER - 70)) | (1L << (F_ACOS - 70)) | (1L << (F_ARRE - 70)) | (1L << (F_ASEN - 70)) | (1L << (F_ATAN - 70)) | (1L << (F_CAPO - 70)) | (1L << (F_CHAO - 70)) | (1L << (F_COSH - 70)) | (1L << (F_COSS - 70)) | (1L << (F_DCM - 70)) | (1L << (F_GRRA - 70)) | (1L << (F_HIPO - 70)) | (1L << (F_INC - 70)) | (1L << (F_LOGA - 70)) | (1L << (F_MAXI - 70)) | (1L << (F_MINI - 70)) | (1L << (F_NUMA - 70)) | (1L << (F_POTE - 70)) | (1L << (F_RAGR - 70)) | (1L << (F_RAIC - 70)) | (1L << (F_RAIQ - 70)) | (1L << (F_RAIZ - 70)) | (1L << (F_SEME - 70)) | (1L << (F_SENH - 70)) | (1L << (F_SENO - 70)) | (1L << (F_TANG - 70)) | (1L << (F_TANH - 70)) | (1L << (F_TETO - 70)) | (1L << (F_VABS - 70)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (ADI - 156)) | (1L << (ADIA - 156)) | (1L << (SUB - 156)) | (1L << (SUBA - 156)) | (1L << (NAO - 156)) | (1L << (NAOT - 156)) | (1L << (ID - 156)) | (1L << (INT - 156)) | (1L << (DEC - 156)) | (1L << (CHEX - 156)) | (1L << (CHAR - 156)) | (1L << (STRING - 156)))) != 0) );
			setState(294);
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

	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode REPE() { return getToken(AuroraLogoParser.REPE, 0); }
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitRepeticao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(REPE);
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
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENQ) {
				{
				setState(298);
				match(ENQ);
				setState(299);
				exprBool();
				}
			}

			setState(302);
			match(REP);
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DCMM:
			case INCM:
				{
				setState(303);
				_la = _input.LA(1);
				if ( !(_la==DCMM || _la==INCM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(304);
				match(ID);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EM) {
					{
					setState(305);
					match(EM);
					setState(306);
					expr();
					}
				}

				}
				break;
			case SOMM:
				{
				setState(309);
				match(SOMM);
				setState(310);
				match(ID);
				setState(311);
				match(COM);
				setState(312);
				expr();
				}
				break;
			case MULM:
				{
				setState(313);
				match(MULM);
				setState(314);
				match(ID);
				setState(315);
				match(POR);
				setState(316);
				expr();
				}
				break;
			case DIVM:
				{
				setState(317);
				match(DIVM);
				setState(318);
				match(ID);
				setState(319);
				match(POR);
				setState(320);
				expr();
				}
				break;
			case SUBM:
				{
				setState(321);
				match(SUBM);
				setState(322);
				expr();
				setState(323);
				match(DE);
				setState(324);
				match(ID);
				}
				break;
			case T__2:
				break;
			default:
				break;
			}
			setState(328);
			match(T__2);
			setState(330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(329);
				inst();
				}
				}
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (REP - 70)) | (1L << (REPE - 70)) | (1L << (SE - 70)) | (1L << (TART - 70)) | (1L << (TROC - 70)) | (1L << (USA - 70)) | (1L << (VA - 70)) | (1L << (VER - 70)) | (1L << (F_ACOS - 70)) | (1L << (F_ARRE - 70)) | (1L << (F_ASEN - 70)) | (1L << (F_ATAN - 70)) | (1L << (F_CAPO - 70)) | (1L << (F_CHAO - 70)) | (1L << (F_COSH - 70)) | (1L << (F_COSS - 70)) | (1L << (F_DCM - 70)) | (1L << (F_GRRA - 70)) | (1L << (F_HIPO - 70)) | (1L << (F_INC - 70)) | (1L << (F_LOGA - 70)) | (1L << (F_MAXI - 70)) | (1L << (F_MINI - 70)) | (1L << (F_NUMA - 70)) | (1L << (F_POTE - 70)) | (1L << (F_RAGR - 70)) | (1L << (F_RAIC - 70)) | (1L << (F_RAIQ - 70)) | (1L << (F_RAIZ - 70)) | (1L << (F_SEME - 70)) | (1L << (F_SENH - 70)) | (1L << (F_SENO - 70)) | (1L << (F_TANG - 70)) | (1L << (F_TANH - 70)) | (1L << (F_TETO - 70)) | (1L << (F_VABS - 70)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (ADI - 156)) | (1L << (ADIA - 156)) | (1L << (SUB - 156)) | (1L << (SUBA - 156)) | (1L << (NAO - 156)) | (1L << (NAOT - 156)) | (1L << (ID - 156)) | (1L << (INT - 156)) | (1L << (DEC - 156)) | (1L << (CHEX - 156)) | (1L << (CHAR - 156)) | (1L << (STRING - 156)))) != 0) );
			setState(334);
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

	public static class ParaCadaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(AuroraLogoParser.PARA, 0); }
		public TerminalNode CADA() { return getToken(AuroraLogoParser.CADA, 0); }
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public TerminalNode EM() { return getToken(AuroraLogoParser.EM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode REP() { return getToken(AuroraLogoParser.REP, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public ParaCadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paraCada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterParaCada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitParaCada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitParaCada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaCadaContext paraCada() throws RecognitionException {
		ParaCadaContext _localctx = new ParaCadaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_paraCada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(PARA);
			setState(337);
			match(CADA);
			setState(338);
			match(ID);
			setState(339);
			match(EM);
			setState(340);
			expr();
			setState(341);
			match(REP);
			setState(342);
			match(T__2);
			setState(344); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(343);
				inst();
				}
				}
				setState(346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (REP - 70)) | (1L << (REPE - 70)) | (1L << (SE - 70)) | (1L << (TART - 70)) | (1L << (TROC - 70)) | (1L << (USA - 70)) | (1L << (VA - 70)) | (1L << (VER - 70)) | (1L << (F_ACOS - 70)) | (1L << (F_ARRE - 70)) | (1L << (F_ASEN - 70)) | (1L << (F_ATAN - 70)) | (1L << (F_CAPO - 70)) | (1L << (F_CHAO - 70)) | (1L << (F_COSH - 70)) | (1L << (F_COSS - 70)) | (1L << (F_DCM - 70)) | (1L << (F_GRRA - 70)) | (1L << (F_HIPO - 70)) | (1L << (F_INC - 70)) | (1L << (F_LOGA - 70)) | (1L << (F_MAXI - 70)) | (1L << (F_MINI - 70)) | (1L << (F_NUMA - 70)) | (1L << (F_POTE - 70)) | (1L << (F_RAGR - 70)) | (1L << (F_RAIC - 70)) | (1L << (F_RAIQ - 70)) | (1L << (F_RAIZ - 70)) | (1L << (F_SEME - 70)) | (1L << (F_SENH - 70)) | (1L << (F_SENO - 70)) | (1L << (F_TANG - 70)) | (1L << (F_TANH - 70)) | (1L << (F_TETO - 70)) | (1L << (F_VABS - 70)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (ADI - 156)) | (1L << (ADIA - 156)) | (1L << (SUB - 156)) | (1L << (SUBA - 156)) | (1L << (NAO - 156)) | (1L << (NAOT - 156)) | (1L << (ID - 156)) | (1L << (INT - 156)) | (1L << (DEC - 156)) | (1L << (CHEX - 156)) | (1L << (CHAR - 156)) | (1L << (STRING - 156)))) != 0) );
			setState(348);
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
		enterRule(_localctx, 38, RULE_parar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
		enterRule(_localctx, 40, RULE_continuar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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
		enterRule(_localctx, 42, RULE_movimentar);
		int _la;
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new MovimentarDirecaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(VA);
				setState(355);
				match(PARA);
				setState(356);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAI) | (1L << CIM) | (1L << DIR) | (1L << ESQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EM) {
					{
					setState(357);
					match(EM);
					setState(358);
					expr();
					}
				}

				}
				break;
			case 2:
				_localctx = new MovimentarPontoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(VA);
				setState(362);
				match(PARA);
				setState(363);
				match(T__4);
				setState(364);
				expr();
				setState(365);
				match(T__7);
				setState(366);
				expr();
				setState(367);
				match(T__5);
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
		enterRule(_localctx, 44, RULE_trocarCor);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new TrocarCorPincelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(TROC);
				setState(372);
				match(COR);
				setState(373);
				match(DO);
				setState(374);
				match(PINC);
				setState(375);
				match(PARA);
				setState(376);
				configuracaoCor();
				}
				break;
			case 2:
				_localctx = new TrocarCorPreenchimentoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(TROC);
				setState(378);
				match(COR);
				setState(379);
				match(DO);
				setState(380);
				match(PREE);
				setState(381);
				match(PARA);
				setState(382);
				configuracaoCor();
				}
				break;
			case 3:
				_localctx = new TrocarCorFundoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				match(TROC);
				setState(384);
				match(COR);
				setState(385);
				match(DO);
				setState(386);
				match(FUN);
				setState(387);
				match(PARA);
				setState(388);
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
		enterRule(_localctx, 46, RULE_configuracaoCor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case FAL:
			case FORM:
			case PI:
			case REPE:
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
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(391);
					cor();
					}
					break;
				case 2:
					{
					setState(392);
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
				setState(395);
				((ConfiguracaoCorContext)_localctx).corEx = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (PRETO - 86)) | (1L << (AZUL - 86)) | (1L << (CIANO - 86)) | (1L << (CINZA - 86)) | (1L << (VERDE - 86)) | (1L << (MAGENTA - 86)) | (1L << (LARANJA - 86)) | (1L << (ROSA - 86)) | (1L << (VERMELHO - 86)) | (1L << (BRANCO - 86)) | (1L << (AMARELO - 86)))) != 0)) ) {
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
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << FAL) | (1L << FORM) | (1L << PI))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (REPE - 71)) | (1L << (TART - 71)) | (1L << (VER - 71)) | (1L << (ESCURO - 71)) | (1L << (CLARO - 71)) | (1L << (F_ACOS - 71)) | (1L << (F_ARRE - 71)) | (1L << (F_ASEN - 71)) | (1L << (F_ATAN - 71)) | (1L << (F_CAPO - 71)) | (1L << (F_CHAO - 71)) | (1L << (F_COSH - 71)) | (1L << (F_COSS - 71)) | (1L << (F_DCM - 71)) | (1L << (F_GRRA - 71)) | (1L << (F_HIPO - 71)) | (1L << (F_INC - 71)) | (1L << (F_LOGA - 71)) | (1L << (F_MAXI - 71)) | (1L << (F_MINI - 71)) | (1L << (F_NUMA - 71)) | (1L << (F_POTE - 71)) | (1L << (F_RAGR - 71)) | (1L << (F_RAIC - 71)) | (1L << (F_RAIQ - 71)) | (1L << (F_RAIZ - 71)) | (1L << (F_SEME - 71)) | (1L << (F_SENH - 71)) | (1L << (F_SENO - 71)) | (1L << (F_TANG - 71)) | (1L << (F_TANH - 71)) | (1L << (F_TETO - 71)) | (1L << (F_VABS - 71)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (ADI - 156)) | (1L << (ADIA - 156)) | (1L << (SUB - 156)) | (1L << (SUBA - 156)) | (1L << (NAO - 156)) | (1L << (NAOT - 156)) | (1L << (ID - 156)) | (1L << (INT - 156)) | (1L << (DEC - 156)) | (1L << (CHEX - 156)) | (1L << (CHAR - 156)) | (1L << (STRING - 156)))) != 0)) {
				{
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << FAL) | (1L << FORM) | (1L << PI))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (REPE - 71)) | (1L << (TART - 71)) | (1L << (VER - 71)) | (1L << (F_ACOS - 71)) | (1L << (F_ARRE - 71)) | (1L << (F_ASEN - 71)) | (1L << (F_ATAN - 71)) | (1L << (F_CAPO - 71)) | (1L << (F_CHAO - 71)) | (1L << (F_COSH - 71)) | (1L << (F_COSS - 71)) | (1L << (F_DCM - 71)) | (1L << (F_GRRA - 71)) | (1L << (F_HIPO - 71)) | (1L << (F_INC - 71)) | (1L << (F_LOGA - 71)) | (1L << (F_MAXI - 71)) | (1L << (F_MINI - 71)) | (1L << (F_NUMA - 71)) | (1L << (F_POTE - 71)) | (1L << (F_RAGR - 71)) | (1L << (F_RAIC - 71)) | (1L << (F_RAIQ - 71)) | (1L << (F_RAIZ - 71)) | (1L << (F_SEME - 71)) | (1L << (F_SENH - 71)) | (1L << (F_SENO - 71)) | (1L << (F_TANG - 71)) | (1L << (F_TANH - 71)) | (1L << (F_TETO - 71)) | (1L << (F_VABS - 71)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (ADI - 156)) | (1L << (ADIA - 156)) | (1L << (SUB - 156)) | (1L << (SUBA - 156)) | (1L << (NAO - 156)) | (1L << (NAOT - 156)) | (1L << (ID - 156)) | (1L << (INT - 156)) | (1L << (DEC - 156)) | (1L << (CHEX - 156)) | (1L << (CHAR - 156)) | (1L << (STRING - 156)))) != 0)) {
					{
					setState(398);
					expr();
					setState(399);
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

				setState(403);
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
		enterRule(_localctx, 48, RULE_cor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
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
		enterRule(_localctx, 50, RULE_girar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(GIR);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(409);
				match(EM);
				setState(410);
				expr();
				setState(411);
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
		enterRule(_localctx, 52, RULE_engrossar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(ENG);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(416);
				match(EM);
				setState(417);
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
		enterRule(_localctx, 54, RULE_desengrossar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(DES);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(421);
				match(EM);
				setState(422);
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
		enterRule(_localctx, 56, RULE_trocarGrossura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(TROC);
			setState(426);
			match(GROS);
			setState(427);
			match(PARA);
			setState(428);
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
		enterRule(_localctx, 58, RULE_escrever);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(ESC);
			setState(431);
			expr();
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUL) {
					{
					setState(432);
					match(PUL);
					setState(433);
					match(LIN);
					}
				}

				setState(436);
				match(NA);
				setState(437);
				match(SAI);
				}
				break;
			case 2:
				{
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUL) {
					{
					setState(438);
					match(PUL);
					setState(439);
					match(LIN);
					}
				}

				setState(442);
				match(NO);
				setState(443);
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
		enterRule(_localctx, 60, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(LER);
			setState(447);
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
	public static class AtribuirArranjoAssociativoContext extends AtribuirContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public TerminalNode ATR() { return getToken(AuroraLogoParser.ATR, 0); }
		public TerminalNode ATRA() { return getToken(AuroraLogoParser.ATRA, 0); }
		public ExprIndiceContext exprIndice() {
			return getRuleContext(ExprIndiceContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CriarArranjosContext criarArranjos() {
			return getRuleContext(CriarArranjosContext.class,0);
		}
		public AtribuirArranjoAssociativoContext(AtribuirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterAtribuirArranjoAssociativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitAtribuirArranjoAssociativo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitAtribuirArranjoAssociativo(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode ATR() { return getToken(AuroraLogoParser.ATR, 0); }
		public TerminalNode ATRA() { return getToken(AuroraLogoParser.ATRA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CriarArranjosContext criarArranjos() {
			return getRuleContext(CriarArranjosContext.class,0);
		}
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
	public static class AtribuirArranjoContext extends AtribuirContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public TerminalNode ATR() { return getToken(AuroraLogoParser.ATR, 0); }
		public TerminalNode ATRA() { return getToken(AuroraLogoParser.ATRA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CriarArranjosContext criarArranjos() {
			return getRuleContext(CriarArranjosContext.class,0);
		}
		public List<ExprIndiceContext> exprIndice() {
			return getRuleContexts(ExprIndiceContext.class);
		}
		public ExprIndiceContext exprIndice(int i) {
			return getRuleContext(ExprIndiceContext.class,i);
		}
		public AtribuirArranjoContext(AtribuirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterAtribuirArranjo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitAtribuirArranjo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitAtribuirArranjo(this);
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
		enterRule(_localctx, 62, RULE_atribuir);
		int _la;
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new AtribuirPadraoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(ID);
				setState(450);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(453);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case FAL:
				case FORM:
				case PI:
				case REPE:
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
					setState(451);
					expr();
					}
					break;
				case CRA:
				case CRAA:
				case CRR:
				case CRRA:
					{
					setState(452);
					criarArranjos();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new AtribuirArranjoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(ID);
				setState(460); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(456);
					match(T__0);
					setState(457);
					exprIndice();
					setState(458);
					match(T__1);
					}
					}
					setState(462); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(464);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(467);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case FAL:
				case FORM:
				case PI:
				case REPE:
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
					setState(465);
					expr();
					}
					break;
				case CRA:
				case CRAA:
				case CRR:
				case CRRA:
					{
					setState(466);
					criarArranjos();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				_localctx = new AtribuirArranjoAssociativoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				match(ID);
				{
				setState(470);
				match(T__2);
				setState(471);
				exprIndice();
				setState(472);
				match(T__3);
				}
				setState(474);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(477);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case FAL:
				case FORM:
				case PI:
				case REPE:
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
					setState(475);
					expr();
					}
					break;
				case CRA:
				case CRAA:
				case CRR:
				case CRRA:
					{
					setState(476);
					criarArranjos();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new AtribuirAdicaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				match(ID);
				setState(480);
				_la = _input.LA(1);
				if ( !(_la==AC_A || _la==AT_A) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(481);
				expr();
				}
				break;
			case 5:
				_localctx = new AtribuirSubtracaoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(482);
				match(ID);
				setState(483);
				_la = _input.LA(1);
				if ( !(_la==AC_S || _la==AT_S) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(484);
				expr();
				}
				break;
			case 6:
				_localctx = new AtribuirMultiplicacaoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(485);
				match(ID);
				setState(486);
				_la = _input.LA(1);
				if ( !(_la==AC_M || _la==AT_M) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(487);
				expr();
				}
				break;
			case 7:
				_localctx = new AtribuirDivisaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(488);
				match(ID);
				setState(489);
				_la = _input.LA(1);
				if ( !(_la==AC_D || _la==AT_D) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(490);
				expr();
				}
				break;
			case 8:
				_localctx = new AtribuirRestoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(491);
				match(ID);
				setState(492);
				_la = _input.LA(1);
				if ( !(_la==AC_R || _la==AT_R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(493);
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

	public static class ExprIndiceContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprIndiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprIndice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterExprIndice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitExprIndice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitExprIndice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprIndiceContext exprIndice() throws RecognitionException {
		ExprIndiceContext _localctx = new ExprIndiceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exprIndice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
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
		enterRule(_localctx, 66, RULE_abaixar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(ABA);
			setState(499);
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
		enterRule(_localctx, 68, RULE_levantar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(LEV);
			setState(502);
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
		enterRule(_localctx, 70, RULE_limpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
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
		enterRule(_localctx, 72, RULE_funcaoMatematica);
		try {
			setState(673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F_VABS:
				_localctx = new FuncaoAbsolutoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(F_VABS);
				setState(507);
				match(T__4);
				setState(508);
				expr();
				setState(509);
				match(T__5);
				}
				break;
			case F_RAIQ:
				_localctx = new FuncaoRaizQuadradaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				match(F_RAIQ);
				setState(512);
				match(T__4);
				setState(513);
				expr();
				setState(514);
				match(T__5);
				}
				break;
			case F_RAIC:
				_localctx = new FuncaoRaizCubicaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				match(F_RAIC);
				setState(517);
				match(T__4);
				setState(518);
				expr();
				setState(519);
				match(T__5);
				}
				break;
			case F_RAIZ:
				_localctx = new FuncaoRaizContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				match(F_RAIZ);
				setState(522);
				match(T__4);
				setState(523);
				expr();
				setState(524);
				match(T__7);
				setState(525);
				expr();
				setState(526);
				match(T__5);
				}
				break;
			case F_POTE:
				_localctx = new FuncaoPotenciaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(528);
				match(F_POTE);
				setState(529);
				match(T__4);
				setState(530);
				expr();
				setState(531);
				match(T__7);
				setState(532);
				expr();
				setState(533);
				match(T__5);
				}
				break;
			case F_HIPO:
				_localctx = new FuncaoHipotenusaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(535);
				match(F_HIPO);
				setState(536);
				match(T__4);
				setState(537);
				expr();
				setState(538);
				match(T__7);
				setState(539);
				expr();
				setState(540);
				match(T__5);
				}
				break;
			case F_CHAO:
				_localctx = new FuncaoChaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(542);
				match(F_CHAO);
				setState(543);
				match(T__4);
				setState(544);
				expr();
				setState(545);
				match(T__5);
				}
				break;
			case F_TETO:
				_localctx = new FuncaoTetoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(547);
				match(F_TETO);
				setState(548);
				match(T__4);
				setState(549);
				expr();
				setState(550);
				match(T__5);
				}
				break;
			case F_ARRE:
				_localctx = new FuncaoArredondarContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(552);
				match(F_ARRE);
				setState(553);
				match(T__4);
				setState(559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(554);
					expr();
					}
					break;
				case 2:
					{
					setState(555);
					expr();
					setState(556);
					match(T__7);
					setState(557);
					expr();
					}
					break;
				}
				setState(561);
				match(T__5);
				}
				break;
			case F_MINI:
				_localctx = new FuncaoMinimoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(563);
				match(F_MINI);
				setState(564);
				match(T__4);
				setState(565);
				expr();
				setState(566);
				match(T__7);
				setState(567);
				expr();
				setState(568);
				match(T__5);
				}
				break;
			case F_MAXI:
				_localctx = new FuncaoMaximoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(570);
				match(F_MAXI);
				setState(571);
				match(T__4);
				setState(572);
				expr();
				setState(573);
				match(T__7);
				setState(574);
				expr();
				setState(575);
				match(T__5);
				}
				break;
			case F_NUMA:
				_localctx = new FuncaoNumeroAleatorioContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(577);
				match(F_NUMA);
				setState(578);
				match(T__4);
				setState(584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(579);
					expr();
					}
					break;
				case 2:
					{
					setState(580);
					expr();
					setState(581);
					match(T__7);
					setState(582);
					expr();
					}
					break;
				}
				setState(586);
				match(T__5);
				}
				break;
			case F_SEME:
				_localctx = new FuncaoDefinirSementeAleatoriaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(587);
				match(F_SEME);
				setState(588);
				match(T__4);
				setState(589);
				expr();
				setState(590);
				match(T__5);
				}
				break;
			case F_SENO:
				_localctx = new FuncaoSenoContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(592);
				match(F_SENO);
				setState(593);
				match(T__4);
				setState(594);
				expr();
				setState(595);
				match(T__5);
				}
				break;
			case F_COSS:
				_localctx = new FuncaoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(597);
				match(F_COSS);
				setState(598);
				match(T__4);
				setState(599);
				expr();
				setState(600);
				match(T__5);
				}
				break;
			case F_TANG:
				_localctx = new FuncaoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(602);
				match(F_TANG);
				setState(603);
				match(T__4);
				setState(604);
				expr();
				setState(605);
				match(T__5);
				}
				break;
			case F_ASEN:
				_localctx = new FuncaoArcoSenoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(607);
				match(F_ASEN);
				setState(608);
				match(T__4);
				setState(609);
				expr();
				setState(610);
				match(T__5);
				}
				break;
			case F_ACOS:
				_localctx = new FuncaoArcoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(612);
				match(F_ACOS);
				setState(613);
				match(T__4);
				setState(614);
				expr();
				setState(615);
				match(T__5);
				}
				break;
			case F_ATAN:
				_localctx = new FuncaoArcoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(617);
				match(F_ATAN);
				setState(618);
				match(T__4);
				setState(619);
				expr();
				setState(620);
				match(T__5);
				}
				break;
			case F_CAPO:
				_localctx = new FuncaoCartesianoParaPolarContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(622);
				match(F_CAPO);
				setState(623);
				match(T__4);
				setState(624);
				expr();
				setState(625);
				match(T__7);
				setState(626);
				expr();
				setState(627);
				match(T__5);
				}
				break;
			case F_SENH:
				_localctx = new FuncaoSenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(629);
				match(F_SENH);
				setState(630);
				match(T__4);
				setState(631);
				expr();
				setState(632);
				match(T__5);
				}
				break;
			case F_COSH:
				_localctx = new FuncaoCossenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(634);
				match(F_COSH);
				setState(635);
				match(T__4);
				setState(636);
				expr();
				setState(637);
				match(T__5);
				}
				break;
			case F_TANH:
				_localctx = new FuncaoTangenteHiperbolicaContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(639);
				match(F_TANH);
				setState(640);
				match(T__4);
				setState(641);
				expr();
				setState(642);
				match(T__5);
				}
				break;
			case F_LOGA:
				_localctx = new FuncaoLogaritmoContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(644);
				match(F_LOGA);
				setState(645);
				match(T__4);
				setState(651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(646);
					expr();
					}
					break;
				case 2:
					{
					setState(647);
					expr();
					setState(648);
					match(T__7);
					setState(649);
					expr();
					}
					break;
				}
				setState(653);
				match(T__5);
				}
				break;
			case F_GRRA:
				_localctx = new FuncaoGrausParaRadianosContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(655);
				match(F_GRRA);
				setState(656);
				match(T__4);
				setState(657);
				expr();
				setState(658);
				match(T__5);
				}
				break;
			case F_RAGR:
				_localctx = new FuncaoRadianosParaGrausContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(660);
				match(F_RAGR);
				setState(661);
				match(T__4);
				setState(662);
				expr();
				setState(663);
				match(T__5);
				}
				break;
			case F_INC:
				_localctx = new FuncaoIncrementarContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(665);
				match(F_INC);
				setState(666);
				match(T__4);
				setState(667);
				match(ID);
				setState(668);
				match(T__5);
				}
				break;
			case F_DCM:
				_localctx = new FuncaoDecrementarContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(669);
				match(F_DCM);
				setState(670);
				match(T__4);
				setState(671);
				match(ID);
				setState(672);
				match(T__5);
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
		enterRule(_localctx, 74, RULE_instrucaoGeometrica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(DESE);
			setState(676);
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
		public OpcaoFGeomOContext opcaoFGeomO() {
			return getRuleContext(OpcaoFGeomOContext.class,0);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpcaoFGeomOContext opcaoFGeomO() {
			return getRuleContext(OpcaoFGeomOContext.class,0);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpcaoFGeomOContext opcaoFGeomO() {
			return getRuleContext(OpcaoFGeomOContext.class,0);
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
	public static class FuncaoDesenharRetanguloArredondadoContext extends FuncaoGeometricaContext {
		public TerminalNode FG_REA() { return getToken(AuroraLogoParser.FG_REA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpcaoFGeomOContext opcaoFGeomO() {
			return getRuleContext(OpcaoFGeomOContext.class,0);
		}
		public FuncaoDesenharRetanguloArredondadoContext(FuncaoGeometricaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoDesenharRetanguloArredondado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoDesenharRetanguloArredondado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoDesenharRetanguloArredondado(this);
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
		public OpcaoFGeomOContext opcaoFGeomO() {
			return getRuleContext(OpcaoFGeomOContext.class,0);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpcaoFGeomOContext opcaoFGeomO() {
			return getRuleContext(OpcaoFGeomOContext.class,0);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpcaoFGeomOContext opcaoFGeomO() {
			return getRuleContext(OpcaoFGeomOContext.class,0);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpcaoFGeomOContext opcaoFGeomO() {
			return getRuleContext(OpcaoFGeomOContext.class,0);
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
	public static class FuncaoDesenharArcoContext extends FuncaoGeometricaContext {
		public TerminalNode FG_ARC() { return getToken(AuroraLogoParser.FG_ARC, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpcaoFGeomOContext opcaoFGeomO() {
			return getRuleContext(OpcaoFGeomOContext.class,0);
		}
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
		public OpcaoFGeomOContext opcaoFGeomO() {
			return getRuleContext(OpcaoFGeomOContext.class,0);
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
	public static class FuncaoDesenharCurvaQuadraticaContext extends FuncaoGeometricaContext {
		public TerminalNode FG_CQD() { return getToken(AuroraLogoParser.FG_CQD, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpcaoFGeomOContext opcaoFGeomO() {
			return getRuleContext(OpcaoFGeomOContext.class,0);
		}
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
		enterRule(_localctx, 76, RULE_funcaoGeometrica);
		int _la;
		try {
			setState(868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FG_SEG:
				_localctx = new FuncaoDesenharSegmentoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				match(FG_SEG);
				setState(679);
				match(T__4);
				setState(680);
				expr();
				setState(681);
				match(T__7);
				setState(682);
				expr();
				setState(683);
				match(T__7);
				setState(684);
				expr();
				setState(685);
				match(T__7);
				setState(686);
				expr();
				setState(687);
				match(T__5);
				}
				break;
			case FG_QUA:
				_localctx = new FuncaoDesenharQuadradoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				match(FG_QUA);
				setState(690);
				match(T__4);
				setState(691);
				expr();
				setState(692);
				match(T__7);
				setState(693);
				expr();
				setState(694);
				match(T__7);
				setState(695);
				expr();
				setState(696);
				match(T__5);
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(697);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_RET:
				_localctx = new FuncaoDesenharRetanguloContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
				match(FG_RET);
				setState(701);
				match(T__4);
				setState(702);
				expr();
				setState(703);
				match(T__7);
				setState(704);
				expr();
				setState(705);
				match(T__7);
				setState(706);
				expr();
				setState(707);
				match(T__7);
				setState(708);
				expr();
				setState(709);
				match(T__5);
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(710);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_REA:
				_localctx = new FuncaoDesenharRetanguloArredondadoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(713);
				match(FG_REA);
				setState(714);
				match(T__4);
				setState(715);
				expr();
				setState(716);
				match(T__7);
				setState(717);
				expr();
				setState(718);
				match(T__7);
				setState(719);
				expr();
				setState(720);
				match(T__7);
				setState(721);
				expr();
				setState(722);
				match(T__7);
				setState(723);
				expr();
				setState(724);
				match(T__5);
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(725);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_CIC:
				_localctx = new FuncaoDesenharCirculoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(728);
				match(FG_CIC);
				setState(729);
				match(T__4);
				setState(730);
				expr();
				setState(731);
				match(T__7);
				setState(732);
				expr();
				setState(733);
				match(T__7);
				setState(734);
				expr();
				setState(735);
				match(T__5);
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(736);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_ELI:
				_localctx = new FuncaoDesenharElipseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(739);
				match(FG_ELI);
				setState(740);
				match(T__4);
				setState(741);
				expr();
				setState(742);
				match(T__7);
				setState(743);
				expr();
				setState(744);
				match(T__7);
				setState(745);
				expr();
				setState(746);
				match(T__7);
				setState(747);
				expr();
				setState(748);
				match(T__5);
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(749);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_ARC:
				_localctx = new FuncaoDesenharArcoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(752);
				match(FG_ARC);
				setState(753);
				match(T__4);
				setState(754);
				expr();
				setState(755);
				match(T__7);
				setState(756);
				expr();
				setState(757);
				match(T__7);
				setState(758);
				expr();
				setState(759);
				match(T__7);
				setState(760);
				expr();
				setState(761);
				match(T__7);
				setState(762);
				expr();
				setState(763);
				match(T__7);
				setState(764);
				expr();
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(765);
					match(T__7);
					setState(766);
					_la = _input.LA(1);
					if ( !(((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ABE - 10)) | (1L << (COD - 10)) | (1L << (PIZ - 10)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(769);
				match(T__5);
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(770);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_POR:
				_localctx = new FuncaoDesenharPoligonoRegularContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(773);
				match(FG_POR);
				setState(774);
				match(T__4);
				setState(775);
				expr();
				setState(776);
				match(T__7);
				setState(777);
				expr();
				setState(778);
				match(T__7);
				setState(779);
				expr();
				setState(780);
				match(T__7);
				setState(781);
				expr();
				setState(782);
				match(T__7);
				setState(783);
				expr();
				setState(784);
				match(T__5);
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(785);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_EST:
				_localctx = new FuncaoDesenharEstrelaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(788);
				match(FG_EST);
				setState(789);
				match(T__4);
				setState(790);
				expr();
				setState(791);
				match(T__7);
				setState(792);
				expr();
				setState(793);
				match(T__7);
				setState(794);
				expr();
				setState(795);
				match(T__7);
				setState(796);
				expr();
				setState(797);
				match(T__7);
				setState(798);
				expr();
				setState(799);
				match(T__5);
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(800);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_POL:
				_localctx = new FuncaoDesenharPoligonoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(803);
				match(FG_POL);
				setState(804);
				match(T__4);
				setState(805);
				expr();
				setState(806);
				match(T__7);
				setState(807);
				expr();
				setState(808);
				match(T__7);
				setState(809);
				expr();
				setState(810);
				match(T__7);
				setState(811);
				expr();
				setState(812);
				match(T__7);
				setState(813);
				expr();
				setState(814);
				match(T__7);
				setState(815);
				expr();
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(816);
					match(T__7);
					setState(817);
					expr();
					setState(818);
					match(T__7);
					setState(819);
					expr();
					}
					}
					setState(825);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(826);
				match(T__5);
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(827);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_CQD:
				_localctx = new FuncaoDesenharCurvaQuadraticaContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(830);
				match(FG_CQD);
				setState(831);
				match(T__4);
				setState(832);
				expr();
				setState(833);
				match(T__7);
				setState(834);
				expr();
				setState(835);
				match(T__7);
				setState(836);
				expr();
				setState(837);
				match(T__7);
				setState(838);
				expr();
				setState(839);
				match(T__7);
				setState(840);
				expr();
				setState(841);
				match(T__7);
				setState(842);
				expr();
				setState(843);
				match(T__5);
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(844);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_CCU:
				_localctx = new FuncaoDesenharCurvaCubicaContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(847);
				match(FG_CCU);
				setState(848);
				match(T__4);
				setState(849);
				expr();
				setState(850);
				match(T__7);
				setState(851);
				expr();
				setState(852);
				match(T__7);
				setState(853);
				expr();
				setState(854);
				match(T__7);
				setState(855);
				expr();
				setState(856);
				match(T__7);
				setState(857);
				expr();
				setState(858);
				match(T__7);
				setState(859);
				expr();
				setState(860);
				match(T__7);
				setState(861);
				expr();
				setState(862);
				match(T__7);
				setState(863);
				expr();
				setState(864);
				match(T__5);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(865);
					opcaoFGeomO();
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

	public static class OpcaoFGeomOContext extends ParserRuleContext {
		public List<TerminalNode> SEM() { return getTokens(AuroraLogoParser.SEM); }
		public TerminalNode SEM(int i) {
			return getToken(AuroraLogoParser.SEM, i);
		}
		public TerminalNode PREE() { return getToken(AuroraLogoParser.PREE, 0); }
		public TerminalNode E() { return getToken(AuroraLogoParser.E, 0); }
		public TerminalNode CON() { return getToken(AuroraLogoParser.CON, 0); }
		public OpcaoFGeomOContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcaoFGeomO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterOpcaoFGeomO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitOpcaoFGeomO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitOpcaoFGeomO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcaoFGeomOContext opcaoFGeomO() throws RecognitionException {
		OpcaoFGeomOContext _localctx = new OpcaoFGeomOContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_opcaoFGeomO);
		int _la;
		try {
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				match(SEM);
				setState(871);
				match(PREE);
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(872);
					match(E);
					setState(873);
					match(SEM);
					setState(874);
					match(CON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				match(SEM);
				setState(878);
				match(CON);
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(879);
					match(E);
					setState(880);
					match(SEM);
					setState(881);
					match(PREE);
					}
				}

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

	public static class DesenharCaminhoContext extends ParserRuleContext {
		public TerminalNode DESE() { return getToken(AuroraLogoParser.DESE, 0); }
		public TerminalNode CAM() { return getToken(AuroraLogoParser.CAM, 0); }
		public OpcaoFGeomOContext opcaoFGeomO() {
			return getRuleContext(OpcaoFGeomOContext.class,0);
		}
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
		enterRule(_localctx, 80, RULE_desenharCaminho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(DESE);
			setState(887);
			match(CAM);
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEM) {
				{
				setState(888);
				opcaoFGeomO();
				}
			}

			setState(891);
			match(T__2);
			setState(895); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(892);
				instCaminho();
				setState(893);
				match(DOT);
				}
				}
				setState(897); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CUR) | (1L << FEC) | (1L << LIN) | (1L << MOV))) != 0) );
			setState(899);
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
		enterRule(_localctx, 82, RULE_instCaminho);
		try {
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				_localctx = new InstrucaoCaminhoMoverAteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				match(MOV);
				setState(902);
				match(ATE);
				setState(903);
				match(T__4);
				setState(904);
				expr();
				setState(905);
				match(T__7);
				setState(906);
				expr();
				setState(907);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new InstrucaoCaminhoLinhaAteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				match(LIN);
				setState(910);
				match(ATE);
				setState(911);
				match(T__4);
				setState(912);
				expr();
				setState(913);
				match(T__7);
				setState(914);
				expr();
				setState(915);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new InstrucaoCaminhoCurvaQuadraticaAteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				match(CUR);
				setState(918);
				match(QUAD);
				setState(919);
				match(ATE);
				setState(920);
				match(T__4);
				setState(921);
				expr();
				setState(922);
				match(T__7);
				setState(923);
				expr();
				setState(924);
				match(T__7);
				setState(925);
				expr();
				setState(926);
				match(T__7);
				setState(927);
				expr();
				setState(928);
				match(T__5);
				}
				break;
			case 4:
				_localctx = new InstrucaoCaminhoCurvaCubicaAteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(930);
				match(CUR);
				setState(931);
				match(CUBI);
				setState(932);
				match(ATE);
				setState(933);
				match(T__4);
				setState(934);
				expr();
				setState(935);
				match(T__7);
				setState(936);
				expr();
				setState(937);
				match(T__7);
				setState(938);
				expr();
				setState(939);
				match(T__7);
				setState(940);
				expr();
				setState(941);
				match(T__7);
				setState(942);
				expr();
				setState(943);
				match(T__7);
				setState(944);
				expr();
				setState(945);
				match(T__5);
				}
				break;
			case 5:
				_localctx = new InstrucaoCaminhoFecharCaminhoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(947);
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
		enterRule(_localctx, 84, RULE_consultarTartaruga);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(TART);
			setState(951);
			match(DOT);
			setState(952);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (PA - 99)) | (1L << (PX - 99)) | (1L << (PY - 99)))) != 0)) ) {
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
		enterRule(_localctx, 86, RULE_formatarTexto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(FORM);
			setState(955);
			match(T__4);
			setState(956);
			match(STRING);
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(957);
				match(T__7);
				setState(958);
				expr();
				}
				}
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(964);
			match(T__5);
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

	public static class CriarArranjosContext extends ParserRuleContext {
		public CriarArranjosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criarArranjos; }
	 
		public CriarArranjosContext() { }
		public void copyFrom(CriarArranjosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CriarArranjoAssociativoContext extends CriarArranjosContext {
		public TerminalNode CRAA() { return getToken(AuroraLogoParser.CRAA, 0); }
		public TerminalNode CRRA() { return getToken(AuroraLogoParser.CRRA, 0); }
		public CriarArranjoAssociativoContext(CriarArranjosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterCriarArranjoAssociativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitCriarArranjoAssociativo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitCriarArranjoAssociativo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CriarArranjoContext extends CriarArranjosContext {
		public TerminalNode CRA() { return getToken(AuroraLogoParser.CRA, 0); }
		public TerminalNode CRR() { return getToken(AuroraLogoParser.CRR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CriarArranjoContext(CriarArranjosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterCriarArranjo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitCriarArranjo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitCriarArranjo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriarArranjosContext criarArranjos() throws RecognitionException {
		CriarArranjosContext _localctx = new CriarArranjosContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_criarArranjos);
		int _la;
		try {
			setState(978);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CRA:
			case CRR:
				_localctx = new CriarArranjoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				_la = _input.LA(1);
				if ( !(_la==CRA || _la==CRR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(971); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(967);
					match(T__0);
					setState(968);
					expr();
					setState(969);
					match(T__1);
					}
					}
					setState(973); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			case CRAA:
			case CRRA:
				_localctx = new CriarArranjoAssociativoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				_la = _input.LA(1);
				if ( !(_la==CRAA || _la==CRRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(976);
				match(T__2);
				setState(977);
				match(T__3);
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
		"\u0004\u0001\u00c8\u03d5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0001\u0000\u0004\u0000\\\b\u0000\u000b\u0000\f\u0000]\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001i\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002{\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0080\b\u0003\n\u0003\f\u0003\u0083\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0088\b\u0004\u0001\u0005\u0003\u0005"+
		"\u008b\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0090\b"+
		"\u0005\n\u0005\f\u0005\u0093\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0098\b\u0006\n\u0006\f\u0006\u009b\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a7\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u00ae\b\u0007\u000b"+
		"\u0007\f\u0007\u00af\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00b6\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c0\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u00c5\b\u0007\u000b\u0007\f"+
		"\u0007\u00c6\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00d5\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0005\t\u00db\b\t\n\t\f\t\u00de\t\t\u0001\t\u0003\t\u00e1\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00e8\b\n\u000b\n\f\n\u00e9\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u00f4\b\u000b\u000b\u000b\f\u000b\u00f5\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u00fd\b\f\u000b\f\f"+
		"\f\u00fe\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u0107"+
		"\b\r\u000b\r\f\r\u0108\u0001\r\u0001\r\u0001\r\u0004\r\u010e\b\r\u000b"+
		"\r\f\r\u010f\u0003\r\u0112\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0004\u000e\u011a\b\u000e\u000b\u000e\f\u000e"+
		"\u011b\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u0123\b\u000f\u000b\u000f\f\u000f\u0124\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u012d\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0134\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0147\b\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u014b\b"+
		"\u0011\u000b\u0011\f\u0011\u014c\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0004\u0012\u0159\b\u0012\u000b\u0012\f\u0012\u015a\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0168\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0172\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0186\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u018a\b\u0017\u0001\u0017\u0003\u0017"+
		"\u018d\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0192\b"+
		"\u0017\u0001\u0017\u0003\u0017\u0195\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u019e"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01a3\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01a8\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u01b3\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u01b9\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01bd\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01c6\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f\u01cd\b\u001f"+
		"\u000b\u001f\f\u001f\u01ce\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u01d4\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01de\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u01ef\b\u001f\u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u0230\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0249\b$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u028c\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u02a2\b$\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u02bb\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u02c8\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02d7\b&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02e2"+
		"\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u02ef\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0300"+
		"\b&\u0001&\u0001&\u0003&\u0304\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0313\b&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u0322\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0005&\u0336\b&\n&\f&\u0339\t&\u0001&\u0001&\u0003&\u033d"+
		"\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u034e\b&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0363\b&\u0003&\u0365"+
		"\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u036c\b\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0373\b\'\u0003\'\u0375\b\'\u0001"+
		"(\u0001(\u0001(\u0003(\u037a\b(\u0001(\u0001(\u0001(\u0001(\u0004(\u0380"+
		"\b(\u000b(\f(\u0381\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u03b5\b)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0005+\u03c0\b+\n+\f+\u03c3\t+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0004,\u03cc\b,\u000b,\f,\u03cd\u0001,\u0001,\u0001"+
		",\u0003,\u03d3\b,\u0001,\u0000\u0000-\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVX\u0000\u0016\u0001\u0000\u00b7\u00ba\u0001\u0000\u00a5\u00b6"+
		"\u0001\u0000\u009c\u009f\u0002\u0000UU\u00a0\u00a4\u0001\u0000\u00bb\u00bc"+
		"\u0002\u0000++SS\u0002\u0000\u00c1\u00c2\u00c4\u00c5\u0001\u0000TU\u0002"+
		"\u0000\u001b\u001b22\u0004\u0000\f\f\u000f\u000f  **\u0001\u0000V`\u0001"+
		"\u0000ab\u0001\u0000\u0090\u0091\u0001\u0000\u0092\u0093\u0001\u0000\u0094"+
		"\u0095\u0001\u0000\u0096\u0097\u0001\u0000\u0098\u0099\u0001\u0000\u009a"+
		"\u009b\u0003\u0000\n\n\u0010\u0010AA\u0001\u0000ce\u0002\u0000\u0017\u0017"+
		"\u0019\u0019\u0002\u0000\u0018\u0018\u001a\u001a\u044a\u0000[\u0001\u0000"+
		"\u0000\u0000\u0002h\u0001\u0000\u0000\u0000\u0004z\u0001\u0000\u0000\u0000"+
		"\u0006|\u0001\u0000\u0000\u0000\b\u0084\u0001\u0000\u0000\u0000\n\u008a"+
		"\u0001\u0000\u0000\u0000\f\u0094\u0001\u0000\u0000\u0000\u000e\u00d4\u0001"+
		"\u0000\u0000\u0000\u0010\u00d6\u0001\u0000\u0000\u0000\u0012\u00d8\u0001"+
		"\u0000\u0000\u0000\u0014\u00e2\u0001\u0000\u0000\u0000\u0016\u00ed\u0001"+
		"\u0000\u0000\u0000\u0018\u00f9\u0001\u0000\u0000\u0000\u001a\u0102\u0001"+
		"\u0000\u0000\u0000\u001c\u0115\u0001\u0000\u0000\u0000\u001e\u011d\u0001"+
		"\u0000\u0000\u0000 \u0128\u0001\u0000\u0000\u0000\"\u012c\u0001\u0000"+
		"\u0000\u0000$\u0150\u0001\u0000\u0000\u0000&\u015e\u0001\u0000\u0000\u0000"+
		"(\u0160\u0001\u0000\u0000\u0000*\u0171\u0001\u0000\u0000\u0000,\u0185"+
		"\u0001\u0000\u0000\u0000.\u018c\u0001\u0000\u0000\u00000\u0196\u0001\u0000"+
		"\u0000\u00002\u0198\u0001\u0000\u0000\u00004\u019f\u0001\u0000\u0000\u0000"+
		"6\u01a4\u0001\u0000\u0000\u00008\u01a9\u0001\u0000\u0000\u0000:\u01ae"+
		"\u0001\u0000\u0000\u0000<\u01be\u0001\u0000\u0000\u0000>\u01ee\u0001\u0000"+
		"\u0000\u0000@\u01f0\u0001\u0000\u0000\u0000B\u01f2\u0001\u0000\u0000\u0000"+
		"D\u01f5\u0001\u0000\u0000\u0000F\u01f8\u0001\u0000\u0000\u0000H\u02a1"+
		"\u0001\u0000\u0000\u0000J\u02a3\u0001\u0000\u0000\u0000L\u0364\u0001\u0000"+
		"\u0000\u0000N\u0374\u0001\u0000\u0000\u0000P\u0376\u0001\u0000\u0000\u0000"+
		"R\u03b4\u0001\u0000\u0000\u0000T\u03b6\u0001\u0000\u0000\u0000V\u03ba"+
		"\u0001\u0000\u0000\u0000X\u03d2\u0001\u0000\u0000\u0000Z\\\u0003\u0002"+
		"\u0001\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u0001\u0001\u0000\u0000"+
		"\u0000_`\u0003\u0004\u0002\u0000`a\u0005\u00bd\u0000\u0000ai\u0001\u0000"+
		"\u0000\u0000bi\u0003\u0012\t\u0000ci\u0003\u001a\r\u0000di\u0003\u001e"+
		"\u000f\u0000ei\u0003\"\u0011\u0000fi\u0003$\u0012\u0000gi\u0003P(\u0000"+
		"h_\u0001\u0000\u0000\u0000hb\u0001\u0000\u0000\u0000hc\u0001\u0000\u0000"+
		"\u0000hd\u0001\u0000\u0000\u0000he\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hg\u0001\u0000\u0000\u0000i\u0003\u0001\u0000\u0000\u0000"+
		"j{\u0003*\u0015\u0000k{\u0003,\u0016\u0000l{\u00032\u0019\u0000m{\u0003"+
		"B!\u0000n{\u0003D\"\u0000o{\u0003F#\u0000p{\u00034\u001a\u0000q{\u0003"+
		"6\u001b\u0000r{\u00038\u001c\u0000s{\u0003:\u001d\u0000t{\u0003<\u001e"+
		"\u0000u{\u0003>\u001f\u0000v{\u0003&\u0013\u0000w{\u0003(\u0014\u0000"+
		"x{\u0003J%\u0000y{\u0003\u0006\u0003\u0000zj\u0001\u0000\u0000\u0000z"+
		"k\u0001\u0000\u0000\u0000zl\u0001\u0000\u0000\u0000zm\u0001\u0000\u0000"+
		"\u0000zn\u0001\u0000\u0000\u0000zo\u0001\u0000\u0000\u0000zp\u0001\u0000"+
		"\u0000\u0000zq\u0001\u0000\u0000\u0000zr\u0001\u0000\u0000\u0000zs\u0001"+
		"\u0000\u0000\u0000zt\u0001\u0000\u0000\u0000zu\u0001\u0000\u0000\u0000"+
		"zv\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000zy\u0001\u0000\u0000\u0000{\u0005\u0001\u0000\u0000\u0000|\u0081"+
		"\u0003\b\u0004\u0000}~\u0007\u0000\u0000\u0000~\u0080\u0003\b\u0004\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0007\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0087\u0003\n\u0005\u0000\u0085\u0086\u0007\u0001\u0000\u0000\u0086\u0088"+
		"\u0003\n\u0005\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\t\u0001\u0000\u0000\u0000\u0089\u008b\u0007\u0002"+
		"\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0091\u0003\f\u0006"+
		"\u0000\u008d\u008e\u0007\u0002\u0000\u0000\u008e\u0090\u0003\f\u0006\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u000b\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0094\u0099\u0003\u000e\u0007\u0000\u0095\u0096\u0007\u0003\u0000\u0000"+
		"\u0096\u0098\u0003\u000e\u0007\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\r\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0007\u0004\u0000\u0000\u009d"+
		"\u00d5\u0003\u000e\u0007\u0000\u009e\u00d5\u0005\u00c1\u0000\u0000\u009f"+
		"\u00d5\u0005\u00c2\u0000\u0000\u00a0\u00d5\u0005?\u0000\u0000\u00a1\u00a6"+
		"\u0005\u00be\u0000\u0000\u00a2\u00a3\u0005\u00bd\u0000\u0000\u00a3\u00a7"+
		"\u0005g\u0000\u0000\u00a4\u00a5\u0005\u00bd\u0000\u0000\u00a5\u00a7\u0005"+
		"f\u0000\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ad\u0005\u00be\u0000\u0000\u00a9\u00aa\u0005\u0001"+
		"\u0000\u0000\u00aa\u00ab\u0003\u0006\u0003\u0000\u00ab\u00ac\u0005\u0002"+
		"\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005\u00bd\u0000\u0000\u00b2\u00b6\u0005g\u0000"+
		"\u0000\u00b3\u00b4\u0005\u00bd\u0000\u0000\u00b4\u00b6\u0005f\u0000\u0000"+
		"\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00d5\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0005\u00be\u0000\u0000\u00b8\u00b9\u0005\u0003\u0000\u0000"+
		"\u00b9\u00ba\u0003\u0006\u0003\u0000\u00ba\u00bf\u0005\u0004\u0000\u0000"+
		"\u00bb\u00bc\u0005\u00bd\u0000\u0000\u00bc\u00c0\u0005g\u0000\u0000\u00bd"+
		"\u00be\u0005\u00bd\u0000\u0000\u00be\u00c0\u0005f\u0000\u0000\u00bf\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00d5\u0001\u0000\u0000\u0000\u00c1\u00c4"+
		"\u0005\u00be\u0000\u0000\u00c2\u00c3\u0005\u00bd\u0000\u0000\u00c3\u00c5"+
		"\u0005\u00c0\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c7\u00d5\u0001\u0000\u0000\u0000\u00c8\u00d5"+
		"\u0005\u00c4\u0000\u0000\u00c9\u00d5\u0005\u00c5\u0000\u0000\u00ca\u00d5"+
		"\u0007\u0005\u0000\u0000\u00cb\u00d5\u00030\u0018\u0000\u00cc\u00d5\u0003"+
		"H$\u0000\u00cd\u00d5\u0003T*\u0000\u00ce\u00d5\u0003V+\u0000\u00cf\u00d5"+
		"\u0003 \u0010\u0000\u00d0\u00d1\u0005\u0005\u0000\u0000\u00d1\u00d2\u0003"+
		"\u0006\u0003\u0000\u00d2\u00d3\u0005\u0006\u0000\u0000\u00d3\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d4\u009c\u0001\u0000\u0000\u0000\u00d4\u009e\u0001"+
		"\u0000\u0000\u0000\u00d4\u009f\u0001\u0000\u0000\u0000\u00d4\u00a0\u0001"+
		"\u0000\u0000\u0000\u00d4\u00a1\u0001\u0000\u0000\u0000\u00d4\u00a8\u0001"+
		"\u0000\u0000\u0000\u00d4\u00b7\u0001\u0000\u0000\u0000\u00d4\u00c1\u0001"+
		"\u0000\u0000\u0000\u00d4\u00c8\u0001\u0000\u0000\u0000\u00d4\u00c9\u0001"+
		"\u0000\u0000\u0000\u00d4\u00ca\u0001\u0000\u0000\u0000\u00d4\u00cb\u0001"+
		"\u0000\u0000\u0000\u00d4\u00cc\u0001\u0000\u0000\u0000\u00d4\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d4\u00ce\u0001\u0000\u0000\u0000\u00d4\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d0\u0001\u0000\u0000\u0000\u00d5\u000f\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0003\u0006\u0003\u0000\u00d7\u0011\u0001"+
		"\u0000\u0000\u0000\u00d8\u00dc\u0003\u0014\n\u0000\u00d9\u00db\u0003\u0016"+
		"\u000b\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00df\u00e1\u0003\u0018\f\u0000\u00e0\u00df\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u0013\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0005I\u0000\u0000\u00e3\u00e4\u0003\u0010\b\u0000"+
		"\u00e4\u00e5\u0005\'\u0000\u0000\u00e5\u00e7\u0005\u0003\u0000\u0000\u00e6"+
		"\u00e8\u0003\u0002\u0001\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0005\u0004\u0000\u0000\u00ec\u0015\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005J\u0000\u0000\u00ee\u00ef\u0005I\u0000\u0000\u00ef\u00f0\u0003"+
		"\u0010\b\u0000\u00f0\u00f1\u0005\'\u0000\u0000\u00f1\u00f3\u0005\u0003"+
		"\u0000\u0000\u00f2\u00f4\u0003\u0002\u0001\u0000\u00f3\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0005\u0004\u0000\u0000\u00f8\u0017\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0005J\u0000\u0000\u00fa\u00fc\u0005\u0003\u0000"+
		"\u0000\u00fb\u00fd\u0003\u0002\u0001\u0000\u00fc\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0005\u0004\u0000\u0000\u0101\u0019\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0005Q\u0000\u0000\u0103\u0104\u0005\u00be\u0000\u0000"+
		"\u0104\u0106\u0005\u0003\u0000\u0000\u0105\u0107\u0003\u001c\u000e\u0000"+
		"\u0106\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000"+
		"\u0109\u0111\u0001\u0000\u0000\u0000\u010a\u010b\u0005<\u0000\u0000\u010b"+
		"\u010d\u0005\u0007\u0000\u0000\u010c\u010e\u0003\u0002\u0001\u0000\u010d"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"\u0112\u0001\u0000\u0000\u0000\u0111\u010a\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0005\u0004\u0000\u0000\u0114\u001b\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0005(\u0000\u0000\u0116\u0117\u0007\u0006\u0000\u0000\u0117\u0119"+
		"\u0005\u0007\u0000\u0000\u0118\u011a\u0003\u0002\u0001\u0000\u0119\u0118"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u001d"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0005F\u0000\u0000\u011e\u011f\u0003"+
		"\u0006\u0003\u0000\u011f\u0120\u0007\u0007\u0000\u0000\u0120\u0122\u0005"+
		"\u0003\u0000\u0000\u0121\u0123\u0003\u0002\u0001\u0000\u0122\u0121\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0005\u0004\u0000\u0000\u0127\u001f\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0005G\u0000\u0000\u0129!\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005&\u0000\u0000\u012b\u012d\u0003\u0010\b\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0146\u0005F\u0000\u0000\u012f"+
		"\u0130\u0007\b\u0000\u0000\u0130\u0133\u0005\u00be\u0000\u0000\u0131\u0132"+
		"\u0005$\u0000\u0000\u0132\u0134\u0003\u0006\u0003\u0000\u0133\u0131\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0147\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0005L\u0000\u0000\u0136\u0137\u0005\u00be"+
		"\u0000\u0000\u0137\u0138\u0005\u0011\u0000\u0000\u0138\u0147\u0003\u0006"+
		"\u0003\u0000\u0139\u013a\u00059\u0000\u0000\u013a\u013b\u0005\u00be\u0000"+
		"\u0000\u013b\u013c\u0005B\u0000\u0000\u013c\u0147\u0003\u0006\u0003\u0000"+
		"\u013d\u013e\u0005!\u0000\u0000\u013e\u013f\u0005\u00be\u0000\u0000\u013f"+
		"\u0140\u0005B\u0000\u0000\u0140\u0147\u0003\u0006\u0003\u0000\u0141\u0142"+
		"\u0005M\u0000\u0000\u0142\u0143\u0003\u0006\u0003\u0000\u0143\u0144\u0005"+
		"\u001c\u0000\u0000\u0144\u0145\u0005\u00be\u0000\u0000\u0145\u0147\u0001"+
		"\u0000\u0000\u0000\u0146\u012f\u0001\u0000\u0000\u0000\u0146\u0135\u0001"+
		"\u0000\u0000\u0000\u0146\u0139\u0001\u0000\u0000\u0000\u0146\u013d\u0001"+
		"\u0000\u0000\u0000\u0146\u0141\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014a\u0005"+
		"\u0003\u0000\u0000\u0149\u014b\u0003\u0002\u0001\u0000\u014a\u0149\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014a\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0005\u0004\u0000\u0000\u014f#\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0005=\u0000\u0000\u0151\u0152\u0005\r\u0000"+
		"\u0000\u0152\u0153\u0005\u00be\u0000\u0000\u0153\u0154\u0005$\u0000\u0000"+
		"\u0154\u0155\u0003\u0006\u0003\u0000\u0155\u0156\u0005F\u0000\u0000\u0156"+
		"\u0158\u0005\u0003\u0000\u0000\u0157\u0159\u0003\u0002\u0001\u0000\u0158"+
		"\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b"+
		"\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u0004\u0000\u0000\u015d"+
		"%\u0001\u0000\u0000\u0000\u015e\u015f\u0005>\u0000\u0000\u015f\'\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0005\u0012\u0000\u0000\u0161)\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0005R\u0000\u0000\u0163\u0164\u0005=\u0000\u0000"+
		"\u0164\u0167\u0007\t\u0000\u0000\u0165\u0166\u0005$\u0000\u0000\u0166"+
		"\u0168\u0003\u0006\u0003\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0001\u0000\u0000\u0000\u0168\u0172\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0005R\u0000\u0000\u016a\u016b\u0005=\u0000\u0000\u016b\u016c\u0005"+
		"\u0005\u0000\u0000\u016c\u016d\u0003\u0006\u0003\u0000\u016d\u016e\u0005"+
		"\b\u0000\u0000\u016e\u016f\u0003\u0006\u0003\u0000\u016f\u0170\u0005\u0006"+
		"\u0000\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u0162\u0001\u0000"+
		"\u0000\u0000\u0171\u0169\u0001\u0000\u0000\u0000\u0172+\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0005P\u0000\u0000\u0174\u0175\u0005\u0014\u0000\u0000"+
		"\u0175\u0176\u0005\"\u0000\u0000\u0176\u0177\u0005@\u0000\u0000\u0177"+
		"\u0178\u0005=\u0000\u0000\u0178\u0186\u0003.\u0017\u0000\u0179\u017a\u0005"+
		"P\u0000\u0000\u017a\u017b\u0005\u0014\u0000\u0000\u017b\u017c\u0005\""+
		"\u0000\u0000\u017c\u017d\u0005C\u0000\u0000\u017d\u017e\u0005=\u0000\u0000"+
		"\u017e\u0186\u0003.\u0017\u0000\u017f\u0180\u0005P\u0000\u0000\u0180\u0181"+
		"\u0005\u0014\u0000\u0000\u0181\u0182\u0005\"\u0000\u0000\u0182\u0183\u0005"+
		".\u0000\u0000\u0183\u0184\u0005=\u0000\u0000\u0184\u0186\u0003.\u0017"+
		"\u0000\u0185\u0173\u0001\u0000\u0000\u0000\u0185\u0179\u0001\u0000\u0000"+
		"\u0000\u0185\u017f\u0001\u0000\u0000\u0000\u0186-\u0001\u0000\u0000\u0000"+
		"\u0187\u018a\u00030\u0018\u0000\u0188\u018a\u0003\u0006\u0003\u0000\u0189"+
		"\u0187\u0001\u0000\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a"+
		"\u018d\u0001\u0000\u0000\u0000\u018b\u018d\u0007\n\u0000\u0000\u018c\u0189"+
		"\u0001\u0000\u0000\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018d\u0194"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0003\u0006\u0003\u0000\u018f\u0190"+
		"\u0007\u0007\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u018e"+
		"\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193"+
		"\u0001\u0000\u0000\u0000\u0193\u0195\u0007\u000b\u0000\u0000\u0194\u0191"+
		"\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195/\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0005\u00c3\u0000\u0000\u01971\u0001\u0000"+
		"\u0000\u0000\u0198\u019d\u0005/\u0000\u0000\u0199\u019a\u0005$\u0000\u0000"+
		"\u019a\u019b\u0003\u0006\u0003\u0000\u019b\u019c\u00050\u0000\u0000\u019c"+
		"\u019e\u0001\u0000\u0000\u0000\u019d\u0199\u0001\u0000\u0000\u0000\u019d"+
		"\u019e\u0001\u0000\u0000\u0000\u019e3\u0001\u0000\u0000\u0000\u019f\u01a2"+
		"\u0005%\u0000\u0000\u01a0\u01a1\u0005$\u0000\u0000\u01a1\u01a3\u0003\u0006"+
		"\u0003\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a35\u0001\u0000\u0000\u0000\u01a4\u01a7\u0005\u001d\u0000"+
		"\u0000\u01a5\u01a6\u0005$\u0000\u0000\u01a6\u01a8\u0003\u0006\u0003\u0000"+
		"\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a87\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005P\u0000\u0000\u01aa\u01ab"+
		"\u00051\u0000\u0000\u01ab\u01ac\u0005=\u0000\u0000\u01ac\u01ad\u0003\u0006"+
		"\u0003\u0000\u01ad9\u0001\u0000\u0000\u0000\u01ae\u01af\u0005)\u0000\u0000"+
		"\u01af\u01bc\u0003\u0006\u0003\u0000\u01b0\u01b1\u0005D\u0000\u0000\u01b1"+
		"\u01b3\u00057\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\u0005:\u0000\u0000\u01b5\u01bd\u0005H\u0000\u0000\u01b6\u01b7\u0005D"+
		"\u0000\u0000\u01b7\u01b9\u00057\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0005;\u0000\u0000\u01bb\u01bd\u0005\u001f\u0000\u0000"+
		"\u01bc\u01b2\u0001\u0000\u0000\u0000\u01bc\u01b8\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd;\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u00054\u0000\u0000\u01bf\u01c0\u0005\u00be\u0000\u0000\u01c0=\u0001"+
		"\u0000\u0000\u0000\u01c1\u01c2\u0005\u00be\u0000\u0000\u01c2\u01c5\u0007"+
		"\f\u0000\u0000\u01c3\u01c6\u0003\u0006\u0003\u0000\u01c4\u01c6\u0003X"+
		",\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c6\u01ef\u0001\u0000\u0000\u0000\u01c7\u01cc\u0005\u00be\u0000"+
		"\u0000\u01c8\u01c9\u0005\u0001\u0000\u0000\u01c9\u01ca\u0003@ \u0000\u01ca"+
		"\u01cb\u0005\u0002\u0000\u0000\u01cb\u01cd\u0001\u0000\u0000\u0000\u01cc"+
		"\u01c8\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d3\u0007\f\u0000\u0000\u01d1\u01d4"+
		"\u0003\u0006\u0003\u0000\u01d2\u01d4\u0003X,\u0000\u01d3\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01ef\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d6\u0005\u00be\u0000\u0000\u01d6\u01d7\u0005\u0003"+
		"\u0000\u0000\u01d7\u01d8\u0003@ \u0000\u01d8\u01d9\u0005\u0004\u0000\u0000"+
		"\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dd\u0007\f\u0000\u0000\u01db"+
		"\u01de\u0003\u0006\u0003\u0000\u01dc\u01de\u0003X,\u0000\u01dd\u01db\u0001"+
		"\u0000\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01de\u01ef\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0005\u00be\u0000\u0000\u01e0\u01e1\u0007"+
		"\r\u0000\u0000\u01e1\u01ef\u0003\u0006\u0003\u0000\u01e2\u01e3\u0005\u00be"+
		"\u0000\u0000\u01e3\u01e4\u0007\u000e\u0000\u0000\u01e4\u01ef\u0003\u0006"+
		"\u0003\u0000\u01e5\u01e6\u0005\u00be\u0000\u0000\u01e6\u01e7\u0007\u000f"+
		"\u0000\u0000\u01e7\u01ef\u0003\u0006\u0003\u0000\u01e8\u01e9\u0005\u00be"+
		"\u0000\u0000\u01e9\u01ea\u0007\u0010\u0000\u0000\u01ea\u01ef\u0003\u0006"+
		"\u0003\u0000\u01eb\u01ec\u0005\u00be\u0000\u0000\u01ec\u01ed\u0007\u0011"+
		"\u0000\u0000\u01ed\u01ef\u0003\u0006\u0003\u0000\u01ee\u01c1\u0001\u0000"+
		"\u0000\u0000\u01ee\u01c7\u0001\u0000\u0000\u0000\u01ee\u01d5\u0001\u0000"+
		"\u0000\u0000\u01ee\u01df\u0001\u0000\u0000\u0000\u01ee\u01e2\u0001\u0000"+
		"\u0000\u0000\u01ee\u01e5\u0001\u0000\u0000\u0000\u01ee\u01e8\u0001\u0000"+
		"\u0000\u0000\u01ee\u01eb\u0001\u0000\u0000\u0000\u01ef?\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0003\u0006\u0003\u0000\u01f1A\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f3\u0005\t\u0000\u0000\u01f3\u01f4\u0005@\u0000\u0000\u01f4"+
		"C\u0001\u0000\u0000\u0000\u01f5\u01f6\u00055\u0000\u0000\u01f6\u01f7\u0005"+
		"@\u0000\u0000\u01f7E\u0001\u0000\u0000\u0000\u01f8\u01f9\u00056\u0000"+
		"\u0000\u01f9G\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005\u0083\u0000\u0000"+
		"\u01fb\u01fc\u0005\u0005\u0000\u0000\u01fc\u01fd\u0003\u0006\u0003\u0000"+
		"\u01fd\u01fe\u0005\u0006\u0000\u0000\u01fe\u02a2\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0005{\u0000\u0000\u0200\u0201\u0005\u0005\u0000\u0000\u0201"+
		"\u0202\u0003\u0006\u0003\u0000\u0202\u0203\u0005\u0006\u0000\u0000\u0203"+
		"\u02a2\u0001\u0000\u0000\u0000\u0204\u0205\u0005z\u0000\u0000\u0205\u0206"+
		"\u0005\u0005\u0000\u0000\u0206\u0207\u0003\u0006\u0003\u0000\u0207\u0208"+
		"\u0005\u0006\u0000\u0000\u0208\u02a2\u0001\u0000\u0000\u0000\u0209\u020a"+
		"\u0005|\u0000\u0000\u020a\u020b\u0005\u0005\u0000\u0000\u020b\u020c\u0003"+
		"\u0006\u0003\u0000\u020c\u020d\u0005\b\u0000\u0000\u020d\u020e\u0003\u0006"+
		"\u0003\u0000\u020e\u020f\u0005\u0006\u0000\u0000\u020f\u02a2\u0001\u0000"+
		"\u0000\u0000\u0210\u0211\u0005x\u0000\u0000\u0211\u0212\u0005\u0005\u0000"+
		"\u0000\u0212\u0213\u0003\u0006\u0003\u0000\u0213\u0214\u0005\b\u0000\u0000"+
		"\u0214\u0215\u0003\u0006\u0003\u0000\u0215\u0216\u0005\u0006\u0000\u0000"+
		"\u0216\u02a2\u0001\u0000\u0000\u0000\u0217\u0218\u0005r\u0000\u0000\u0218"+
		"\u0219\u0005\u0005\u0000\u0000\u0219\u021a\u0003\u0006\u0003\u0000\u021a"+
		"\u021b\u0005\b\u0000\u0000\u021b\u021c\u0003\u0006\u0003\u0000\u021c\u021d"+
		"\u0005\u0006\u0000\u0000\u021d\u02a2\u0001\u0000\u0000\u0000\u021e\u021f"+
		"\u0005m\u0000\u0000\u021f\u0220\u0005\u0005\u0000\u0000\u0220\u0221\u0003"+
		"\u0006\u0003\u0000\u0221\u0222\u0005\u0006\u0000\u0000\u0222\u02a2\u0001"+
		"\u0000\u0000\u0000\u0223\u0224\u0005\u0082\u0000\u0000\u0224\u0225\u0005"+
		"\u0005\u0000\u0000\u0225\u0226\u0003\u0006\u0003\u0000\u0226\u0227\u0005"+
		"\u0006\u0000\u0000\u0227\u02a2\u0001\u0000\u0000\u0000\u0228\u0229\u0005"+
		"i\u0000\u0000\u0229\u022f\u0005\u0005\u0000\u0000\u022a\u0230\u0003\u0006"+
		"\u0003\u0000\u022b\u022c\u0003\u0006\u0003\u0000\u022c\u022d\u0005\b\u0000"+
		"\u0000\u022d\u022e\u0003\u0006\u0003\u0000\u022e\u0230\u0001\u0000\u0000"+
		"\u0000\u022f\u022a\u0001\u0000\u0000\u0000\u022f\u022b\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0005\u0006\u0000"+
		"\u0000\u0232\u02a2\u0001\u0000\u0000\u0000\u0233\u0234\u0005v\u0000\u0000"+
		"\u0234\u0235\u0005\u0005\u0000\u0000\u0235\u0236\u0003\u0006\u0003\u0000"+
		"\u0236\u0237\u0005\b\u0000\u0000\u0237\u0238\u0003\u0006\u0003\u0000\u0238"+
		"\u0239\u0005\u0006\u0000\u0000\u0239\u02a2\u0001\u0000\u0000\u0000\u023a"+
		"\u023b\u0005u\u0000\u0000\u023b\u023c\u0005\u0005\u0000\u0000\u023c\u023d"+
		"\u0003\u0006\u0003\u0000\u023d\u023e\u0005\b\u0000\u0000\u023e\u023f\u0003"+
		"\u0006\u0003\u0000\u023f\u0240\u0005\u0006\u0000\u0000\u0240\u02a2\u0001"+
		"\u0000\u0000\u0000\u0241\u0242\u0005w\u0000\u0000\u0242\u0248\u0005\u0005"+
		"\u0000\u0000\u0243\u0249\u0003\u0006\u0003\u0000\u0244\u0245\u0003\u0006"+
		"\u0003\u0000\u0245\u0246\u0005\b\u0000\u0000\u0246\u0247\u0003\u0006\u0003"+
		"\u0000\u0247\u0249\u0001\u0000\u0000\u0000\u0248\u0243\u0001\u0000\u0000"+
		"\u0000\u0248\u0244\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000"+
		"\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u02a2\u0005\u0006\u0000"+
		"\u0000\u024b\u024c\u0005}\u0000\u0000\u024c\u024d\u0005\u0005\u0000\u0000"+
		"\u024d\u024e\u0003\u0006\u0003\u0000\u024e\u024f\u0005\u0006\u0000\u0000"+
		"\u024f\u02a2\u0001\u0000\u0000\u0000\u0250\u0251\u0005\u007f\u0000\u0000"+
		"\u0251\u0252\u0005\u0005\u0000\u0000\u0252\u0253\u0003\u0006\u0003\u0000"+
		"\u0253\u0254\u0005\u0006\u0000\u0000\u0254\u02a2\u0001\u0000\u0000\u0000"+
		"\u0255\u0256\u0005o\u0000\u0000\u0256\u0257\u0005\u0005\u0000\u0000\u0257"+
		"\u0258\u0003\u0006\u0003\u0000\u0258\u0259\u0005\u0006\u0000\u0000\u0259"+
		"\u02a2\u0001\u0000\u0000\u0000\u025a\u025b\u0005\u0080\u0000\u0000\u025b"+
		"\u025c\u0005\u0005\u0000\u0000\u025c\u025d\u0003\u0006\u0003\u0000\u025d"+
		"\u025e\u0005\u0006\u0000\u0000\u025e\u02a2\u0001\u0000\u0000\u0000\u025f"+
		"\u0260\u0005j\u0000\u0000\u0260\u0261\u0005\u0005\u0000\u0000\u0261\u0262"+
		"\u0003\u0006\u0003\u0000\u0262\u0263\u0005\u0006\u0000\u0000\u0263\u02a2"+
		"\u0001\u0000\u0000\u0000\u0264\u0265\u0005h\u0000\u0000\u0265\u0266\u0005"+
		"\u0005\u0000\u0000\u0266\u0267\u0003\u0006\u0003\u0000\u0267\u0268\u0005"+
		"\u0006\u0000\u0000\u0268\u02a2\u0001\u0000\u0000\u0000\u0269\u026a\u0005"+
		"k\u0000\u0000\u026a\u026b\u0005\u0005\u0000\u0000\u026b\u026c\u0003\u0006"+
		"\u0003\u0000\u026c\u026d\u0005\u0006\u0000\u0000\u026d\u02a2\u0001\u0000"+
		"\u0000\u0000\u026e\u026f\u0005l\u0000\u0000\u026f\u0270\u0005\u0005\u0000"+
		"\u0000\u0270\u0271\u0003\u0006\u0003\u0000\u0271\u0272\u0005\b\u0000\u0000"+
		"\u0272\u0273\u0003\u0006\u0003\u0000\u0273\u0274\u0005\u0006\u0000\u0000"+
		"\u0274\u02a2\u0001\u0000\u0000\u0000\u0275\u0276\u0005~\u0000\u0000\u0276"+
		"\u0277\u0005\u0005\u0000\u0000\u0277\u0278\u0003\u0006\u0003\u0000\u0278"+
		"\u0279\u0005\u0006\u0000\u0000\u0279\u02a2\u0001\u0000\u0000\u0000\u027a"+
		"\u027b\u0005n\u0000\u0000\u027b\u027c\u0005\u0005\u0000\u0000\u027c\u027d"+
		"\u0003\u0006\u0003\u0000\u027d\u027e\u0005\u0006\u0000\u0000\u027e\u02a2"+
		"\u0001\u0000\u0000\u0000\u027f\u0280\u0005\u0081\u0000\u0000\u0280\u0281"+
		"\u0005\u0005\u0000\u0000\u0281\u0282\u0003\u0006\u0003\u0000\u0282\u0283"+
		"\u0005\u0006\u0000\u0000\u0283\u02a2\u0001\u0000\u0000\u0000\u0284\u0285"+
		"\u0005t\u0000\u0000\u0285\u028b\u0005\u0005\u0000\u0000\u0286\u028c\u0003"+
		"\u0006\u0003\u0000\u0287\u0288\u0003\u0006\u0003\u0000\u0288\u0289\u0005"+
		"\b\u0000\u0000\u0289\u028a\u0003\u0006\u0003\u0000\u028a\u028c\u0001\u0000"+
		"\u0000\u0000\u028b\u0286\u0001\u0000\u0000\u0000\u028b\u0287\u0001\u0000"+
		"\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u028e\u0005\u0006"+
		"\u0000\u0000\u028e\u02a2\u0001\u0000\u0000\u0000\u028f\u0290\u0005q\u0000"+
		"\u0000\u0290\u0291\u0005\u0005\u0000\u0000\u0291\u0292\u0003\u0006\u0003"+
		"\u0000\u0292\u0293\u0005\u0006\u0000\u0000\u0293\u02a2\u0001\u0000\u0000"+
		"\u0000\u0294\u0295\u0005y\u0000\u0000\u0295\u0296\u0005\u0005\u0000\u0000"+
		"\u0296\u0297\u0003\u0006\u0003\u0000\u0297\u0298\u0005\u0006\u0000\u0000"+
		"\u0298\u02a2\u0001\u0000\u0000\u0000\u0299\u029a\u0005s\u0000\u0000\u029a"+
		"\u029b\u0005\u0005\u0000\u0000\u029b\u029c\u0005\u00be\u0000\u0000\u029c"+
		"\u02a2\u0005\u0006\u0000\u0000\u029d\u029e\u0005p\u0000\u0000\u029e\u029f"+
		"\u0005\u0005\u0000\u0000\u029f\u02a0\u0005\u00be\u0000\u0000\u02a0\u02a2"+
		"\u0005\u0006\u0000\u0000\u02a1\u01fa\u0001\u0000\u0000\u0000\u02a1\u01ff"+
		"\u0001\u0000\u0000\u0000\u02a1\u0204\u0001\u0000\u0000\u0000\u02a1\u0209"+
		"\u0001\u0000\u0000\u0000\u02a1\u0210\u0001\u0000\u0000\u0000\u02a1\u0217"+
		"\u0001\u0000\u0000\u0000\u02a1\u021e\u0001\u0000\u0000\u0000\u02a1\u0223"+
		"\u0001\u0000\u0000\u0000\u02a1\u0228\u0001\u0000\u0000\u0000\u02a1\u0233"+
		"\u0001\u0000\u0000\u0000\u02a1\u023a\u0001\u0000\u0000\u0000\u02a1\u0241"+
		"\u0001\u0000\u0000\u0000\u02a1\u024b\u0001\u0000\u0000\u0000\u02a1\u0250"+
		"\u0001\u0000\u0000\u0000\u02a1\u0255\u0001\u0000\u0000\u0000\u02a1\u025a"+
		"\u0001\u0000\u0000\u0000\u02a1\u025f\u0001\u0000\u0000\u0000\u02a1\u0264"+
		"\u0001\u0000\u0000\u0000\u02a1\u0269\u0001\u0000\u0000\u0000\u02a1\u026e"+
		"\u0001\u0000\u0000\u0000\u02a1\u0275\u0001\u0000\u0000\u0000\u02a1\u027a"+
		"\u0001\u0000\u0000\u0000\u02a1\u027f\u0001\u0000\u0000\u0000\u02a1\u0284"+
		"\u0001\u0000\u0000\u0000\u02a1\u028f\u0001\u0000\u0000\u0000\u02a1\u0294"+
		"\u0001\u0000\u0000\u0000\u02a1\u0299\u0001\u0000\u0000\u0000\u02a1\u029d"+
		"\u0001\u0000\u0000\u0000\u02a2I\u0001\u0000\u0000\u0000\u02a3\u02a4\u0005"+
		"\u001e\u0000\u0000\u02a4\u02a5\u0003L&\u0000\u02a5K\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a7\u0005\u008f\u0000\u0000\u02a7\u02a8\u0005\u0005\u0000"+
		"\u0000\u02a8\u02a9\u0003\u0006\u0003\u0000\u02a9\u02aa\u0005\b\u0000\u0000"+
		"\u02aa\u02ab\u0003\u0006\u0003\u0000\u02ab\u02ac\u0005\b\u0000\u0000\u02ac"+
		"\u02ad\u0003\u0006\u0003\u0000\u02ad\u02ae\u0005\b\u0000\u0000\u02ae\u02af"+
		"\u0003\u0006\u0003\u0000\u02af\u02b0\u0005\u0006\u0000\u0000\u02b0\u0365"+
		"\u0001\u0000\u0000\u0000\u02b1\u02b2\u0005\u008c\u0000\u0000\u02b2\u02b3"+
		"\u0005\u0005\u0000\u0000\u02b3\u02b4\u0003\u0006\u0003\u0000\u02b4\u02b5"+
		"\u0005\b\u0000\u0000\u02b5\u02b6\u0003\u0006\u0003\u0000\u02b6\u02b7\u0005"+
		"\b\u0000\u0000\u02b7\u02b8\u0003\u0006\u0003\u0000\u02b8\u02ba\u0005\u0006"+
		"\u0000\u0000\u02b9\u02bb\u0003N\'\u0000\u02ba\u02b9\u0001\u0000\u0000"+
		"\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u0365\u0001\u0000\u0000"+
		"\u0000\u02bc\u02bd\u0005\u008d\u0000\u0000\u02bd\u02be\u0005\u0005\u0000"+
		"\u0000\u02be\u02bf\u0003\u0006\u0003\u0000\u02bf\u02c0\u0005\b\u0000\u0000"+
		"\u02c0\u02c1\u0003\u0006\u0003\u0000\u02c1\u02c2\u0005\b\u0000\u0000\u02c2"+
		"\u02c3\u0003\u0006\u0003\u0000\u02c3\u02c4\u0005\b\u0000\u0000\u02c4\u02c5"+
		"\u0003\u0006\u0003\u0000\u02c5\u02c7\u0005\u0006\u0000\u0000\u02c6\u02c8"+
		"\u0003N\'\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001"+
		"\u0000\u0000\u0000\u02c8\u0365\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005"+
		"\u008e\u0000\u0000\u02ca\u02cb\u0005\u0005\u0000\u0000\u02cb\u02cc\u0003"+
		"\u0006\u0003\u0000\u02cc\u02cd\u0005\b\u0000\u0000\u02cd\u02ce\u0003\u0006"+
		"\u0003\u0000\u02ce\u02cf\u0005\b\u0000\u0000\u02cf\u02d0\u0003\u0006\u0003"+
		"\u0000\u02d0\u02d1\u0005\b\u0000\u0000\u02d1\u02d2\u0003\u0006\u0003\u0000"+
		"\u02d2\u02d3\u0005\b\u0000\u0000\u02d3\u02d4\u0003\u0006\u0003\u0000\u02d4"+
		"\u02d6\u0005\u0006\u0000\u0000\u02d5\u02d7\u0003N\'\u0000\u02d6\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u0365"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d9\u0005\u0086\u0000\u0000\u02d9\u02da"+
		"\u0005\u0005\u0000\u0000\u02da\u02db\u0003\u0006\u0003\u0000\u02db\u02dc"+
		"\u0005\b\u0000\u0000\u02dc\u02dd\u0003\u0006\u0003\u0000\u02dd\u02de\u0005"+
		"\b\u0000\u0000\u02de\u02df\u0003\u0006\u0003\u0000\u02df\u02e1\u0005\u0006"+
		"\u0000\u0000\u02e0\u02e2\u0003N\'\u0000\u02e1\u02e0\u0001\u0000\u0000"+
		"\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u0365\u0001\u0000\u0000"+
		"\u0000\u02e3\u02e4\u0005\u0088\u0000\u0000\u02e4\u02e5\u0005\u0005\u0000"+
		"\u0000\u02e5\u02e6\u0003\u0006\u0003\u0000\u02e6\u02e7\u0005\b\u0000\u0000"+
		"\u02e7\u02e8\u0003\u0006\u0003\u0000\u02e8\u02e9\u0005\b\u0000\u0000\u02e9"+
		"\u02ea\u0003\u0006\u0003\u0000\u02ea\u02eb\u0005\b\u0000\u0000\u02eb\u02ec"+
		"\u0003\u0006\u0003\u0000\u02ec\u02ee\u0005\u0006\u0000\u0000\u02ed\u02ef"+
		"\u0003N\'\u0000\u02ee\u02ed\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001"+
		"\u0000\u0000\u0000\u02ef\u0365\u0001\u0000\u0000\u0000\u02f0\u02f1\u0005"+
		"\u0084\u0000\u0000\u02f1\u02f2\u0005\u0005\u0000\u0000\u02f2\u02f3\u0003"+
		"\u0006\u0003\u0000\u02f3\u02f4\u0005\b\u0000\u0000\u02f4\u02f5\u0003\u0006"+
		"\u0003\u0000\u02f5\u02f6\u0005\b\u0000\u0000\u02f6\u02f7\u0003\u0006\u0003"+
		"\u0000\u02f7\u02f8\u0005\b\u0000\u0000\u02f8\u02f9\u0003\u0006\u0003\u0000"+
		"\u02f9\u02fa\u0005\b\u0000\u0000\u02fa\u02fb\u0003\u0006\u0003\u0000\u02fb"+
		"\u02fc\u0005\b\u0000\u0000\u02fc\u02ff\u0003\u0006\u0003\u0000\u02fd\u02fe"+
		"\u0005\b\u0000\u0000\u02fe\u0300\u0007\u0012\u0000\u0000\u02ff\u02fd\u0001"+
		"\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0301\u0001"+
		"\u0000\u0000\u0000\u0301\u0303\u0005\u0006\u0000\u0000\u0302\u0304\u0003"+
		"N\'\u0000\u0303\u0302\u0001\u0000\u0000\u0000\u0303\u0304\u0001\u0000"+
		"\u0000\u0000\u0304\u0365\u0001\u0000\u0000\u0000\u0305\u0306\u0005\u008b"+
		"\u0000\u0000\u0306\u0307\u0005\u0005\u0000\u0000\u0307\u0308\u0003\u0006"+
		"\u0003\u0000\u0308\u0309\u0005\b\u0000\u0000\u0309\u030a\u0003\u0006\u0003"+
		"\u0000\u030a\u030b\u0005\b\u0000\u0000\u030b\u030c\u0003\u0006\u0003\u0000"+
		"\u030c\u030d\u0005\b\u0000\u0000\u030d\u030e\u0003\u0006\u0003\u0000\u030e"+
		"\u030f\u0005\b\u0000\u0000\u030f\u0310\u0003\u0006\u0003\u0000\u0310\u0312"+
		"\u0005\u0006\u0000\u0000\u0311\u0313\u0003N\'\u0000\u0312\u0311\u0001"+
		"\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0365\u0001"+
		"\u0000\u0000\u0000\u0314\u0315\u0005\u0089\u0000\u0000\u0315\u0316\u0005"+
		"\u0005\u0000\u0000\u0316\u0317\u0003\u0006\u0003\u0000\u0317\u0318\u0005"+
		"\b\u0000\u0000\u0318\u0319\u0003\u0006\u0003\u0000\u0319\u031a\u0005\b"+
		"\u0000\u0000\u031a\u031b\u0003\u0006\u0003\u0000\u031b\u031c\u0005\b\u0000"+
		"\u0000\u031c\u031d\u0003\u0006\u0003\u0000\u031d\u031e\u0005\b\u0000\u0000"+
		"\u031e\u031f\u0003\u0006\u0003\u0000\u031f\u0321\u0005\u0006\u0000\u0000"+
		"\u0320\u0322\u0003N\'\u0000\u0321\u0320\u0001\u0000\u0000\u0000\u0321"+
		"\u0322\u0001\u0000\u0000\u0000\u0322\u0365\u0001\u0000\u0000\u0000\u0323"+
		"\u0324\u0005\u008a\u0000\u0000\u0324\u0325\u0005\u0005\u0000\u0000\u0325"+
		"\u0326\u0003\u0006\u0003\u0000\u0326\u0327\u0005\b\u0000\u0000\u0327\u0328"+
		"\u0003\u0006\u0003\u0000\u0328\u0329\u0005\b\u0000\u0000\u0329\u032a\u0003"+
		"\u0006\u0003\u0000\u032a\u032b\u0005\b\u0000\u0000\u032b\u032c\u0003\u0006"+
		"\u0003\u0000\u032c\u032d\u0005\b\u0000\u0000\u032d\u032e\u0003\u0006\u0003"+
		"\u0000\u032e\u032f\u0005\b\u0000\u0000\u032f\u0337\u0003\u0006\u0003\u0000"+
		"\u0330\u0331\u0005\b\u0000\u0000\u0331\u0332\u0003\u0006\u0003\u0000\u0332"+
		"\u0333\u0005\b\u0000\u0000\u0333\u0334\u0003\u0006\u0003\u0000\u0334\u0336"+
		"\u0001\u0000\u0000\u0000\u0335\u0330\u0001\u0000\u0000\u0000\u0336\u0339"+
		"\u0001\u0000\u0000\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0337\u0338"+
		"\u0001\u0000\u0000\u0000\u0338\u033a\u0001\u0000\u0000\u0000\u0339\u0337"+
		"\u0001\u0000\u0000\u0000\u033a\u033c\u0005\u0006\u0000\u0000\u033b\u033d"+
		"\u0003N\'\u0000\u033c\u033b\u0001\u0000\u0000\u0000\u033c\u033d\u0001"+
		"\u0000\u0000\u0000\u033d\u0365\u0001\u0000\u0000\u0000\u033e\u033f\u0005"+
		"\u0087\u0000\u0000\u033f\u0340\u0005\u0005\u0000\u0000\u0340\u0341\u0003"+
		"\u0006\u0003\u0000\u0341\u0342\u0005\b\u0000\u0000\u0342\u0343\u0003\u0006"+
		"\u0003\u0000\u0343\u0344\u0005\b\u0000\u0000\u0344\u0345\u0003\u0006\u0003"+
		"\u0000\u0345\u0346\u0005\b\u0000\u0000\u0346\u0347\u0003\u0006\u0003\u0000"+
		"\u0347\u0348\u0005\b\u0000\u0000\u0348\u0349\u0003\u0006\u0003\u0000\u0349"+
		"\u034a\u0005\b\u0000\u0000\u034a\u034b\u0003\u0006\u0003\u0000\u034b\u034d"+
		"\u0005\u0006\u0000\u0000\u034c\u034e\u0003N\'\u0000\u034d\u034c\u0001"+
		"\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000\u0000\u034e\u0365\u0001"+
		"\u0000\u0000\u0000\u034f\u0350\u0005\u0085\u0000\u0000\u0350\u0351\u0005"+
		"\u0005\u0000\u0000\u0351\u0352\u0003\u0006\u0003\u0000\u0352\u0353\u0005"+
		"\b\u0000\u0000\u0353\u0354\u0003\u0006\u0003\u0000\u0354\u0355\u0005\b"+
		"\u0000\u0000\u0355\u0356\u0003\u0006\u0003\u0000\u0356\u0357\u0005\b\u0000"+
		"\u0000\u0357\u0358\u0003\u0006\u0003\u0000\u0358\u0359\u0005\b\u0000\u0000"+
		"\u0359\u035a\u0003\u0006\u0003\u0000\u035a\u035b\u0005\b\u0000\u0000\u035b"+
		"\u035c\u0003\u0006\u0003\u0000\u035c\u035d\u0005\b\u0000\u0000\u035d\u035e"+
		"\u0003\u0006\u0003\u0000\u035e\u035f\u0005\b\u0000\u0000\u035f\u0360\u0003"+
		"\u0006\u0003\u0000\u0360\u0362\u0005\u0006\u0000\u0000\u0361\u0363\u0003"+
		"N\'\u0000\u0362\u0361\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000"+
		"\u0000\u0000\u0363\u0365\u0001\u0000\u0000\u0000\u0364\u02a6\u0001\u0000"+
		"\u0000\u0000\u0364\u02b1\u0001\u0000\u0000\u0000\u0364\u02bc\u0001\u0000"+
		"\u0000\u0000\u0364\u02c9\u0001\u0000\u0000\u0000\u0364\u02d8\u0001\u0000"+
		"\u0000\u0000\u0364\u02e3\u0001\u0000\u0000\u0000\u0364\u02f0\u0001\u0000"+
		"\u0000\u0000\u0364\u0305\u0001\u0000\u0000\u0000\u0364\u0314\u0001\u0000"+
		"\u0000\u0000\u0364\u0323\u0001\u0000\u0000\u0000\u0364\u033e\u0001\u0000"+
		"\u0000\u0000\u0364\u034f\u0001\u0000\u0000\u0000\u0365M\u0001\u0000\u0000"+
		"\u0000\u0366\u0367\u0005K\u0000\u0000\u0367\u036b\u0005C\u0000\u0000\u0368"+
		"\u0369\u0005#\u0000\u0000\u0369\u036a\u0005K\u0000\u0000\u036a\u036c\u0005"+
		"\u0013\u0000\u0000\u036b\u0368\u0001\u0000\u0000\u0000\u036b\u036c\u0001"+
		"\u0000\u0000\u0000\u036c\u0375\u0001\u0000\u0000\u0000\u036d\u036e\u0005"+
		"K\u0000\u0000\u036e\u0372\u0005\u0013\u0000\u0000\u036f\u0370\u0005#\u0000"+
		"\u0000\u0370\u0371\u0005K\u0000\u0000\u0371\u0373\u0005C\u0000\u0000\u0372"+
		"\u036f\u0001\u0000\u0000\u0000\u0372\u0373\u0001\u0000\u0000\u0000\u0373"+
		"\u0375\u0001\u0000\u0000\u0000\u0374\u0366\u0001\u0000\u0000\u0000\u0374"+
		"\u036d\u0001\u0000\u0000\u0000\u0375O\u0001\u0000\u0000\u0000\u0376\u0377"+
		"\u0005\u001e\u0000\u0000\u0377\u0379\u0005\u000e\u0000\u0000\u0378\u037a"+
		"\u0003N\'\u0000\u0379\u0378\u0001\u0000\u0000\u0000\u0379\u037a\u0001"+
		"\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000\u0000\u037b\u037f\u0005"+
		"\u0003\u0000\u0000\u037c\u037d\u0003R)\u0000\u037d\u037e\u0005\u00bd\u0000"+
		"\u0000\u037e\u0380\u0001\u0000\u0000\u0000\u037f\u037c\u0001\u0000\u0000"+
		"\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381\u037f\u0001\u0000\u0000"+
		"\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0383\u0001\u0000\u0000"+
		"\u0000\u0383\u0384\u0005\u0004\u0000\u0000\u0384Q\u0001\u0000\u0000\u0000"+
		"\u0385\u0386\u00058\u0000\u0000\u0386\u0387\u0005\u000b\u0000\u0000\u0387"+
		"\u0388\u0005\u0005\u0000\u0000\u0388\u0389\u0003\u0006\u0003\u0000\u0389"+
		"\u038a\u0005\b\u0000\u0000\u038a\u038b\u0003\u0006\u0003\u0000\u038b\u038c"+
		"\u0005\u0006\u0000\u0000\u038c\u03b5\u0001\u0000\u0000\u0000\u038d\u038e"+
		"\u00057\u0000\u0000\u038e\u038f\u0005\u000b\u0000\u0000\u038f\u0390\u0005"+
		"\u0005\u0000\u0000\u0390\u0391\u0003\u0006\u0003\u0000\u0391\u0392\u0005"+
		"\b\u0000\u0000\u0392\u0393\u0003\u0006\u0003\u0000\u0393\u0394\u0005\u0006"+
		"\u0000\u0000\u0394\u03b5\u0001\u0000\u0000\u0000\u0395\u0396\u0005\u0016"+
		"\u0000\u0000\u0396\u0397\u0005E\u0000\u0000\u0397\u0398\u0005\u000b\u0000"+
		"\u0000\u0398\u0399\u0005\u0005\u0000\u0000\u0399\u039a\u0003\u0006\u0003"+
		"\u0000\u039a\u039b\u0005\b\u0000\u0000\u039b\u039c\u0003\u0006\u0003\u0000"+
		"\u039c\u039d\u0005\b\u0000\u0000\u039d\u039e\u0003\u0006\u0003\u0000\u039e"+
		"\u039f\u0005\b\u0000\u0000\u039f\u03a0\u0003\u0006\u0003\u0000\u03a0\u03a1"+
		"\u0005\u0006\u0000\u0000\u03a1\u03b5\u0001\u0000\u0000\u0000\u03a2\u03a3"+
		"\u0005\u0016\u0000\u0000\u03a3\u03a4\u0005\u0015\u0000\u0000\u03a4\u03a5"+
		"\u0005\u000b\u0000\u0000\u03a5\u03a6\u0005\u0005\u0000\u0000\u03a6\u03a7"+
		"\u0003\u0006\u0003\u0000\u03a7\u03a8\u0005\b\u0000\u0000\u03a8\u03a9\u0003"+
		"\u0006\u0003\u0000\u03a9\u03aa\u0005\b\u0000\u0000\u03aa\u03ab\u0003\u0006"+
		"\u0003\u0000\u03ab\u03ac\u0005\b\u0000\u0000\u03ac\u03ad\u0003\u0006\u0003"+
		"\u0000\u03ad\u03ae\u0005\b\u0000\u0000\u03ae\u03af\u0003\u0006\u0003\u0000"+
		"\u03af\u03b0\u0005\b\u0000\u0000\u03b0\u03b1\u0003\u0006\u0003\u0000\u03b1"+
		"\u03b2\u0005\u0006\u0000\u0000\u03b2\u03b5\u0001\u0000\u0000\u0000\u03b3"+
		"\u03b5\u0005,\u0000\u0000\u03b4\u0385\u0001\u0000\u0000\u0000\u03b4\u038d"+
		"\u0001\u0000\u0000\u0000\u03b4\u0395\u0001\u0000\u0000\u0000\u03b4\u03a2"+
		"\u0001\u0000\u0000\u0000\u03b4\u03b3\u0001\u0000\u0000\u0000\u03b5S\u0001"+
		"\u0000\u0000\u0000\u03b6\u03b7\u0005N\u0000\u0000\u03b7\u03b8\u0005\u00bd"+
		"\u0000\u0000\u03b8\u03b9\u0007\u0013\u0000\u0000\u03b9U\u0001\u0000\u0000"+
		"\u0000\u03ba\u03bb\u0005-\u0000\u0000\u03bb\u03bc\u0005\u0005\u0000\u0000"+
		"\u03bc\u03c1\u0005\u00c5\u0000\u0000\u03bd\u03be\u0005\b\u0000\u0000\u03be"+
		"\u03c0\u0003\u0006\u0003\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03c0"+
		"\u03c3\u0001\u0000\u0000\u0000\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c1"+
		"\u03c2\u0001\u0000\u0000\u0000\u03c2\u03c4\u0001\u0000\u0000\u0000\u03c3"+
		"\u03c1\u0001\u0000\u0000\u0000\u03c4\u03c5\u0005\u0006\u0000\u0000\u03c5"+
		"W\u0001\u0000\u0000\u0000\u03c6\u03cb\u0007\u0014\u0000\u0000\u03c7\u03c8"+
		"\u0005\u0001\u0000\u0000\u03c8\u03c9\u0003\u0006\u0003\u0000\u03c9\u03ca"+
		"\u0005\u0002\u0000\u0000\u03ca\u03cc\u0001\u0000\u0000\u0000\u03cb\u03c7"+
		"\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03cb"+
		"\u0001\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000\u0000\u03ce\u03d3"+
		"\u0001\u0000\u0000\u0000\u03cf\u03d0\u0007\u0015\u0000\u0000\u03d0\u03d1"+
		"\u0005\u0003\u0000\u0000\u03d1\u03d3\u0005\u0004\u0000\u0000\u03d2\u03c6"+
		"\u0001\u0000\u0000\u0000\u03d2\u03cf\u0001\u0000\u0000\u0000\u03d3Y\u0001"+
		"\u0000\u0000\u0000J]hz\u0081\u0087\u008a\u0091\u0099\u00a6\u00af\u00b5"+
		"\u00bf\u00c6\u00d4\u00dc\u00e0\u00e9\u00f5\u00fe\u0108\u010f\u0111\u011b"+
		"\u0124\u012c\u0133\u0146\u014c\u015a\u0167\u0171\u0185\u0189\u018c\u0191"+
		"\u0194\u019d\u01a2\u01a7\u01b2\u01b8\u01bc\u01c5\u01ce\u01d3\u01dd\u01ee"+
		"\u022f\u0248\u028b\u02a1\u02ba\u02c7\u02d6\u02e1\u02ee\u02ff\u0303\u0312"+
		"\u0321\u0337\u033c\u034d\u0362\u0364\u036b\u0372\u0374\u0379\u0381\u03b4"+
		"\u03c1\u03cd\u03d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}