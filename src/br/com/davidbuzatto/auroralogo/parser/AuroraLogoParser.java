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
		PINC=64, PIZ=65, POR=66, PREA=67, PREE=68, PREO=69, PUL=70, QUAD=71, REP=72, 
		REPE=73, SAI=74, SE=75, SEN=76, SEM=77, SOMM=78, SUBM=79, TART=80, TER=81, 
		TROC=82, USA=83, VA=84, VER=85, VEZ=86, VEZS=87, PRETO=88, AZUL=89, CIANO=90, 
		CINZA=91, VERDE=92, MAGENTA=93, LARANJA=94, ROSA=95, VERMELHO=96, BRANCO=97, 
		AMARELO=98, ESCURO=99, CLARO=100, PA=101, PX=102, PY=103, CHAV=104, COMP=105, 
		F_ACOS=106, F_ARRE=107, F_ASEN=108, F_ATAN=109, F_CAPO=110, F_CHAO=111, 
		F_COSH=112, F_COSS=113, F_DCM=114, F_GRRA=115, F_HIPO=116, F_INC=117, 
		F_LOGA=118, F_MAXI=119, F_MINI=120, F_NUMA=121, F_POTE=122, F_RAGR=123, 
		F_RAIC=124, F_RAIQ=125, F_RAIZ=126, F_SEME=127, F_SENH=128, F_SENO=129, 
		F_TANG=130, F_TANH=131, F_TETO=132, F_VABS=133, FG_ARC=134, FG_CCU=135, 
		FG_CIC=136, FG_CQD=137, FG_ELI=138, FG_EST=139, FG_POL=140, FG_POR=141, 
		FG_QUA=142, FG_RET=143, FG_SEG=144, ATR=145, ATRA=146, AC_A=147, AT_A=148, 
		AC_S=149, AT_S=150, AC_M=151, AT_M=152, AC_D=153, AT_D=154, AC_R=155, 
		AT_R=156, ADI=157, ADIA=158, SUB=159, SUBA=160, MUL=161, DIV=162, DIVA=163, 
		MOD=164, MODA=165, IGU=166, IGUT=167, IGUA=168, DIF=169, DIFT=170, DIFA=171, 
		ME=172, MET=173, MEA=174, MEI=175, MEIT=176, MEIA=177, MA=178, MAT=179, 
		MAA=180, MAI=181, MAIT=182, MAIA=183, ELG=184, ELGT=185, OLG=186, OLGT=187, 
		NAO=188, NAOT=189, DOT=190, ID=191, IDC=192, IDA=193, INT=194, DEC=195, 
		CHEX=196, CHAR=197, STRING=198, COMENTARIO=199, COMENTARIO_LINHA=200, 
		WS=201;
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
		RULE_opcaoFGeomA = 40, RULE_desenharCaminho = 41, RULE_instCaminho = 42, 
		RULE_consultarTartaruga = 43, RULE_formatarTexto = 44, RULE_criarArranjos = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "inst", "ains", "expr", "relacao", "exprSimp", "termo", "fator", 
			"exprBool", "se", "seSe", "seSenaoSe", "seSenao", "usando", "escolha", 
			"repetir", "repeticao", "repetirEnquanto", "paraCada", "parar", "continuar", 
			"movimentar", "trocarCor", "configuracaoCor", "cor", "girar", "engrossar", 
			"desengrossar", "trocarGrossura", "escrever", "ler", "atribuir", "exprIndice", 
			"abaixar", "levantar", "limpar", "funcaoMatematica", "instrucaoGeometrica", 
			"funcaoGeometrica", "opcaoFGeomO", "opcaoFGeomA", "desenharCaminho", 
			"instCaminho", "consultarTartaruga", "formatarTexto", "criarArranjos"
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
			"'PIZZA'", "'por'", "'preenchida'", "'preenchimento'", "'preenchido'", 
			"'pulando'", "'quadr\\u00E1tica'", "'repetir'", "'repeti\\u00E7\\u00E3o'", 
			"'sa\\u00EDda'", "'se'", "'sen\\u00E3o'", "'sem'", "'somando'", "'subtraindo'", 
			"'tartaruga'", "'terminar'", "'trocar'", "'usando'", "'v\\u00E1'", "'VERDADEIRO'", 
			"'vez'", "'vezes'", "'preto'", "'azul'", "'ciano'", "'cinza'", "'verde'", 
			"'magenta'", "'laranja'", "'rosa'", "'vermelho'", "'branco'", "'amarelo'", 
			"'escuro'", "'claro'", "'\\u00E2ngulo'", "'x'", "'y'", "'chaves'", "'comprimento'", 
			"'arcoCosseno'", "'arredondar'", "'arcoSeno'", "'arcoTangente'", "'cartesianoParaPolar'", 
			"'ch\\u00E3o'", "'cossenoHiperb\\u00F3lico'", "'cosseno'", "'decrementar'", 
			"'grausParaRadianos'", "'hipotenusa'", "'incrementar'", "'logar\\u00EDtmo'", 
			"'m\\u00E1ximo'", "'m\\u00EDnimo'", "'n\\u00FAmeroAleat\\u00F3rio'", 
			"'pot\\u00EAncia'", "'radianosParaGraus'", "'raizC\\u00FAbica'", "'raizQuadrada'", 
			"'raiz'", "'definirSementeAleat\\u00F3ria'", "'senoHiperb\\u00F3lico'", 
			"'seno'", "'tangente'", "'tangenteHiperb\\u00F3lica'", "'teto'", "'valorAbsoluto'", 
			"'arco'", "'curvaC\\u00FAbica'", "'c\\u00EDrculo'", "'curvaQuadr\\u00E1tica'", 
			"'elipse'", "'estrela'", "'pol\\u00EDgono'", "'pol\\u00EDgonoRegular'", 
			"'quadrado'", "'ret\\u00E2ngulo'", "'segmento'", "'='", "'<-'", "'+='", 
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
			null, null, null, null, null, null, null, null, null, "ABA", "ABE", "ATE", 
			"BAI", "CADA", "CAM", "CIM", "COD", "COM", "CONT", "CON", "COR", "CUBI", 
			"CUR", "CRA", "CRAA", "CRR", "CRRA", "DCMM", "DE", "DES", "DESE", "DIAG", 
			"DIR", "DIVM", "DO", "E", "EM", "ENG", "ENQ", "ENT", "ESCO", "ESC", "ESQ", 
			"FAL", "FEC", "FORM", "FUN", "GIR", "GRA", "GROS", "INCM", "INI", "LER", 
			"LEV", "LIM", "LIN", "MOV", "MULM", "NA", "NO", "PADR", "PARA", "PARR", 
			"PI", "PINC", "PIZ", "POR", "PREA", "PREE", "PREO", "PUL", "QUAD", "REP", 
			"REPE", "SAI", "SE", "SEN", "SEM", "SOMM", "SUBM", "TART", "TER", "TROC", 
			"USA", "VA", "VER", "VEZ", "VEZS", "PRETO", "AZUL", "CIANO", "CINZA", 
			"VERDE", "MAGENTA", "LARANJA", "ROSA", "VERMELHO", "BRANCO", "AMARELO", 
			"ESCURO", "CLARO", "PA", "PX", "PY", "CHAV", "COMP", "F_ACOS", "F_ARRE", 
			"F_ASEN", "F_ATAN", "F_CAPO", "F_CHAO", "F_COSH", "F_COSS", "F_DCM", 
			"F_GRRA", "F_HIPO", "F_INC", "F_LOGA", "F_MAXI", "F_MINI", "F_NUMA", 
			"F_POTE", "F_RAGR", "F_RAIC", "F_RAIQ", "F_RAIZ", "F_SEME", "F_SENH", 
			"F_SENO", "F_TANG", "F_TANH", "F_TETO", "F_VABS", "FG_ARC", "FG_CCU", 
			"FG_CIC", "FG_CQD", "FG_ELI", "FG_EST", "FG_POL", "FG_POR", "FG_QUA", 
			"FG_RET", "FG_SEG", "ATR", "ATRA", "AC_A", "AT_A", "AC_S", "AT_S", "AC_M", 
			"AT_M", "AC_D", "AT_D", "AC_R", "AT_R", "ADI", "ADIA", "SUB", "SUBA", 
			"MUL", "DIV", "DIVA", "MOD", "MODA", "IGU", "IGUT", "IGUA", "DIF", "DIFT", 
			"DIFA", "ME", "MET", "MEA", "MEI", "MEIT", "MEIA", "MA", "MAT", "MAA", 
			"MAI", "MAIT", "MAIA", "ELG", "ELGT", "OLG", "OLGT", "NAO", "NAOT", "DOT", 
			"ID", "IDC", "IDA", "INT", "DEC", "CHEX", "CHAR", "STRING", "COMENTARIO", 
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
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				inst();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (REP - 72)) | (1L << (REPE - 72)) | (1L << (SE - 72)) | (1L << (TART - 72)) | (1L << (TROC - 72)) | (1L << (USA - 72)) | (1L << (VA - 72)) | (1L << (VER - 72)) | (1L << (F_ACOS - 72)) | (1L << (F_ARRE - 72)) | (1L << (F_ASEN - 72)) | (1L << (F_ATAN - 72)) | (1L << (F_CAPO - 72)) | (1L << (F_CHAO - 72)) | (1L << (F_COSH - 72)) | (1L << (F_COSS - 72)) | (1L << (F_DCM - 72)) | (1L << (F_GRRA - 72)) | (1L << (F_HIPO - 72)) | (1L << (F_INC - 72)) | (1L << (F_LOGA - 72)) | (1L << (F_MAXI - 72)) | (1L << (F_MINI - 72)) | (1L << (F_NUMA - 72)) | (1L << (F_POTE - 72)) | (1L << (F_RAGR - 72)) | (1L << (F_RAIC - 72)) | (1L << (F_RAIQ - 72)) | (1L << (F_RAIZ - 72)) | (1L << (F_SEME - 72)) | (1L << (F_SENH - 72)) | (1L << (F_SENO - 72)) | (1L << (F_TANG - 72)) | (1L << (F_TANH - 72)) | (1L << (F_TETO - 72)) | (1L << (F_VABS - 72)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (ADI - 157)) | (1L << (ADIA - 157)) | (1L << (SUB - 157)) | (1L << (SUBA - 157)) | (1L << (NAO - 157)) | (1L << (NAOT - 157)) | (1L << (ID - 157)) | (1L << (INT - 157)) | (1L << (DEC - 157)) | (1L << (CHEX - 157)) | (1L << (CHAR - 157)) | (1L << (STRING - 157)))) != 0) );
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
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				ains();
				setState(98);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				se();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				usando();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				repetir();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				repetirEnquanto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				paraCada();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(105);
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
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				movimentar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				trocarCor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				girar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				abaixar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				levantar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				limpar();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
				engrossar();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(115);
				desengrossar();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(116);
				trocarGrossura();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(117);
				escrever();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(118);
				ler();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(119);
				atribuir();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(120);
				parar();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(121);
				continuar();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(122);
				instrucaoGeometrica();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(123);
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
			setState(126);
			relacao();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (ELG - 184)) | (1L << (ELGT - 184)) | (1L << (OLG - 184)) | (1L << (OLGT - 184)))) != 0)) {
				{
				{
				setState(127);
				_la = _input.LA(1);
				if ( !(((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (ELG - 184)) | (1L << (ELGT - 184)) | (1L << (OLG - 184)) | (1L << (OLGT - 184)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
				relacao();
				}
				}
				setState(133);
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
			setState(134);
			exprSimp();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & ((1L << (IGU - 166)) | (1L << (IGUT - 166)) | (1L << (IGUA - 166)) | (1L << (DIF - 166)) | (1L << (DIFT - 166)) | (1L << (DIFA - 166)) | (1L << (ME - 166)) | (1L << (MET - 166)) | (1L << (MEA - 166)) | (1L << (MEI - 166)) | (1L << (MEIT - 166)) | (1L << (MEIA - 166)) | (1L << (MA - 166)) | (1L << (MAT - 166)) | (1L << (MAA - 166)) | (1L << (MAI - 166)) | (1L << (MAIT - 166)) | (1L << (MAIA - 166)))) != 0)) {
				{
				setState(135);
				((RelacaoContext)_localctx).opRel = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & ((1L << (IGU - 166)) | (1L << (IGUT - 166)) | (1L << (IGUA - 166)) | (1L << (DIF - 166)) | (1L << (DIFT - 166)) | (1L << (DIFA - 166)) | (1L << (ME - 166)) | (1L << (MET - 166)) | (1L << (MEA - 166)) | (1L << (MEI - 166)) | (1L << (MEIT - 166)) | (1L << (MEIA - 166)) | (1L << (MA - 166)) | (1L << (MAT - 166)) | (1L << (MAA - 166)) | (1L << (MAI - 166)) | (1L << (MAIT - 166)) | (1L << (MAIA - 166)))) != 0)) ) {
					((RelacaoContext)_localctx).opRel = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(136);
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
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (ADI - 157)) | (1L << (ADIA - 157)) | (1L << (SUB - 157)) | (1L << (SUBA - 157)))) != 0)) {
				{
				setState(139);
				((ExprSimpContext)_localctx).opNeg = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (ADI - 157)) | (1L << (ADIA - 157)) | (1L << (SUB - 157)) | (1L << (SUBA - 157)))) != 0)) ) {
					((ExprSimpContext)_localctx).opNeg = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(142);
			termo();
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					_la = _input.LA(1);
					if ( !(((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (ADI - 157)) | (1L << (ADIA - 157)) | (1L << (SUB - 157)) | (1L << (SUBA - 157)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(144);
					termo();
					}
					} 
				}
				setState(149);
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
			setState(150);
			fator();
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					_la = _input.LA(1);
					if ( !(_la==VEZS || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (MUL - 161)) | (1L << (DIV - 161)) | (1L << (DIVA - 161)) | (1L << (MOD - 161)) | (1L << (MODA - 161)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(152);
					fator();
					}
					} 
				}
				setState(157);
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new FatorNaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NAOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(159);
				fator();
				}
				break;
			case 2:
				_localctx = new FatorIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(INT);
				}
				break;
			case 3:
				_localctx = new FatorDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(DEC);
				}
				break;
			case 4:
				_localctx = new FatorPiContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(PI);
				}
				break;
			case 5:
				_localctx = new FatorIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(ID);
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(164);
					match(DOT);
					setState(165);
					match(COMP);
					}
					break;
				case 2:
					{
					setState(166);
					match(DOT);
					setState(167);
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
				setState(170);
				match(ID);
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(171);
					match(T__0);
					setState(172);
					expr();
					setState(173);
					match(T__1);
					}
					}
					setState(177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(179);
					match(DOT);
					setState(180);
					match(COMP);
					}
					break;
				case 2:
					{
					setState(181);
					match(DOT);
					setState(182);
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
				setState(185);
				match(ID);
				setState(186);
				match(T__2);
				setState(187);
				expr();
				setState(188);
				match(T__3);
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(189);
					match(DOT);
					setState(190);
					match(COMP);
					}
					break;
				case 2:
					{
					setState(191);
					match(DOT);
					setState(192);
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
				setState(195);
				match(ID);
				setState(198); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(196);
						match(DOT);
						setState(197);
						match(IDA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(200); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
				_localctx = new FatorCharContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(202);
				match(CHAR);
				}
				break;
			case 10:
				_localctx = new FatorStringContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(203);
				match(STRING);
				}
				break;
			case 11:
				_localctx = new FatorBoolContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(204);
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
				setState(205);
				cor();
				}
				break;
			case 13:
				_localctx = new FatorFuncaoMatematicaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(206);
				funcaoMatematica();
				}
				break;
			case 14:
				_localctx = new FatorConsultarTartarugaContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(207);
				consultarTartaruga();
				}
				break;
			case 15:
				_localctx = new FatorFormatarTextoContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(208);
				formatarTexto();
				}
				break;
			case 16:
				_localctx = new FatorRepeticaoContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(209);
				repeticao();
				}
				break;
			case 17:
				_localctx = new FatorParentesesContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(210);
				match(T__4);
				setState(211);
				expr();
				setState(212);
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
			setState(216);
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
			setState(218);
			seSe();
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(219);
					seSenaoSe();
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEN) {
				{
				setState(225);
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
			setState(228);
			match(SE);
			setState(229);
			exprBool();
			setState(230);
			match(ENT);
			setState(231);
			match(T__2);
			setState(233); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(232);
				inst();
				}
				}
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (REP - 72)) | (1L << (REPE - 72)) | (1L << (SE - 72)) | (1L << (TART - 72)) | (1L << (TROC - 72)) | (1L << (USA - 72)) | (1L << (VA - 72)) | (1L << (VER - 72)) | (1L << (F_ACOS - 72)) | (1L << (F_ARRE - 72)) | (1L << (F_ASEN - 72)) | (1L << (F_ATAN - 72)) | (1L << (F_CAPO - 72)) | (1L << (F_CHAO - 72)) | (1L << (F_COSH - 72)) | (1L << (F_COSS - 72)) | (1L << (F_DCM - 72)) | (1L << (F_GRRA - 72)) | (1L << (F_HIPO - 72)) | (1L << (F_INC - 72)) | (1L << (F_LOGA - 72)) | (1L << (F_MAXI - 72)) | (1L << (F_MINI - 72)) | (1L << (F_NUMA - 72)) | (1L << (F_POTE - 72)) | (1L << (F_RAGR - 72)) | (1L << (F_RAIC - 72)) | (1L << (F_RAIQ - 72)) | (1L << (F_RAIZ - 72)) | (1L << (F_SEME - 72)) | (1L << (F_SENH - 72)) | (1L << (F_SENO - 72)) | (1L << (F_TANG - 72)) | (1L << (F_TANH - 72)) | (1L << (F_TETO - 72)) | (1L << (F_VABS - 72)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (ADI - 157)) | (1L << (ADIA - 157)) | (1L << (SUB - 157)) | (1L << (SUBA - 157)) | (1L << (NAO - 157)) | (1L << (NAOT - 157)) | (1L << (ID - 157)) | (1L << (INT - 157)) | (1L << (DEC - 157)) | (1L << (CHEX - 157)) | (1L << (CHAR - 157)) | (1L << (STRING - 157)))) != 0) );
			setState(237);
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
			setState(239);
			match(SEN);
			setState(240);
			match(SE);
			setState(241);
			exprBool();
			setState(242);
			match(ENT);
			setState(243);
			match(T__2);
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(244);
				inst();
				}
				}
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (REP - 72)) | (1L << (REPE - 72)) | (1L << (SE - 72)) | (1L << (TART - 72)) | (1L << (TROC - 72)) | (1L << (USA - 72)) | (1L << (VA - 72)) | (1L << (VER - 72)) | (1L << (F_ACOS - 72)) | (1L << (F_ARRE - 72)) | (1L << (F_ASEN - 72)) | (1L << (F_ATAN - 72)) | (1L << (F_CAPO - 72)) | (1L << (F_CHAO - 72)) | (1L << (F_COSH - 72)) | (1L << (F_COSS - 72)) | (1L << (F_DCM - 72)) | (1L << (F_GRRA - 72)) | (1L << (F_HIPO - 72)) | (1L << (F_INC - 72)) | (1L << (F_LOGA - 72)) | (1L << (F_MAXI - 72)) | (1L << (F_MINI - 72)) | (1L << (F_NUMA - 72)) | (1L << (F_POTE - 72)) | (1L << (F_RAGR - 72)) | (1L << (F_RAIC - 72)) | (1L << (F_RAIQ - 72)) | (1L << (F_RAIZ - 72)) | (1L << (F_SEME - 72)) | (1L << (F_SENH - 72)) | (1L << (F_SENO - 72)) | (1L << (F_TANG - 72)) | (1L << (F_TANH - 72)) | (1L << (F_TETO - 72)) | (1L << (F_VABS - 72)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (ADI - 157)) | (1L << (ADIA - 157)) | (1L << (SUB - 157)) | (1L << (SUBA - 157)) | (1L << (NAO - 157)) | (1L << (NAOT - 157)) | (1L << (ID - 157)) | (1L << (INT - 157)) | (1L << (DEC - 157)) | (1L << (CHEX - 157)) | (1L << (CHAR - 157)) | (1L << (STRING - 157)))) != 0) );
			setState(249);
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
			setState(251);
			match(SEN);
			setState(252);
			match(T__2);
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				inst();
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (REP - 72)) | (1L << (REPE - 72)) | (1L << (SE - 72)) | (1L << (TART - 72)) | (1L << (TROC - 72)) | (1L << (USA - 72)) | (1L << (VA - 72)) | (1L << (VER - 72)) | (1L << (F_ACOS - 72)) | (1L << (F_ARRE - 72)) | (1L << (F_ASEN - 72)) | (1L << (F_ATAN - 72)) | (1L << (F_CAPO - 72)) | (1L << (F_CHAO - 72)) | (1L << (F_COSH - 72)) | (1L << (F_COSS - 72)) | (1L << (F_DCM - 72)) | (1L << (F_GRRA - 72)) | (1L << (F_HIPO - 72)) | (1L << (F_INC - 72)) | (1L << (F_LOGA - 72)) | (1L << (F_MAXI - 72)) | (1L << (F_MINI - 72)) | (1L << (F_NUMA - 72)) | (1L << (F_POTE - 72)) | (1L << (F_RAGR - 72)) | (1L << (F_RAIC - 72)) | (1L << (F_RAIQ - 72)) | (1L << (F_RAIZ - 72)) | (1L << (F_SEME - 72)) | (1L << (F_SENH - 72)) | (1L << (F_SENO - 72)) | (1L << (F_TANG - 72)) | (1L << (F_TANH - 72)) | (1L << (F_TETO - 72)) | (1L << (F_VABS - 72)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (ADI - 157)) | (1L << (ADIA - 157)) | (1L << (SUB - 157)) | (1L << (SUBA - 157)) | (1L << (NAO - 157)) | (1L << (NAOT - 157)) | (1L << (ID - 157)) | (1L << (INT - 157)) | (1L << (DEC - 157)) | (1L << (CHEX - 157)) | (1L << (CHAR - 157)) | (1L << (STRING - 157)))) != 0) );
			setState(258);
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
			setState(260);
			match(USA);
			setState(261);
			match(ID);
			setState(262);
			match(T__2);
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				escolha();
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESCO );
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PADR) {
				{
				setState(268);
				match(PADR);
				setState(269);
				match(T__6);
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(270);
					inst();
					}
					}
					setState(273); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (REP - 72)) | (1L << (REPE - 72)) | (1L << (SE - 72)) | (1L << (TART - 72)) | (1L << (TROC - 72)) | (1L << (USA - 72)) | (1L << (VA - 72)) | (1L << (VER - 72)) | (1L << (F_ACOS - 72)) | (1L << (F_ARRE - 72)) | (1L << (F_ASEN - 72)) | (1L << (F_ATAN - 72)) | (1L << (F_CAPO - 72)) | (1L << (F_CHAO - 72)) | (1L << (F_COSH - 72)) | (1L << (F_COSS - 72)) | (1L << (F_DCM - 72)) | (1L << (F_GRRA - 72)) | (1L << (F_HIPO - 72)) | (1L << (F_INC - 72)) | (1L << (F_LOGA - 72)) | (1L << (F_MAXI - 72)) | (1L << (F_MINI - 72)) | (1L << (F_NUMA - 72)) | (1L << (F_POTE - 72)) | (1L << (F_RAGR - 72)) | (1L << (F_RAIC - 72)) | (1L << (F_RAIQ - 72)) | (1L << (F_RAIZ - 72)) | (1L << (F_SEME - 72)) | (1L << (F_SENH - 72)) | (1L << (F_SENO - 72)) | (1L << (F_TANG - 72)) | (1L << (F_TANH - 72)) | (1L << (F_TETO - 72)) | (1L << (F_VABS - 72)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (ADI - 157)) | (1L << (ADIA - 157)) | (1L << (SUB - 157)) | (1L << (SUBA - 157)) | (1L << (NAO - 157)) | (1L << (NAOT - 157)) | (1L << (ID - 157)) | (1L << (INT - 157)) | (1L << (DEC - 157)) | (1L << (CHEX - 157)) | (1L << (CHAR - 157)) | (1L << (STRING - 157)))) != 0) );
				}
			}

			setState(277);
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
			setState(279);
			match(ESCO);
			setState(280);
			_la = _input.LA(1);
			if ( !(((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (INT - 194)) | (1L << (DEC - 194)) | (1L << (CHAR - 194)) | (1L << (STRING - 194)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(281);
			match(T__6);
			setState(283); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(282);
				inst();
				}
				}
				setState(285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (REP - 72)) | (1L << (REPE - 72)) | (1L << (SE - 72)) | (1L << (TART - 72)) | (1L << (TROC - 72)) | (1L << (USA - 72)) | (1L << (VA - 72)) | (1L << (VER - 72)) | (1L << (F_ACOS - 72)) | (1L << (F_ARRE - 72)) | (1L << (F_ASEN - 72)) | (1L << (F_ATAN - 72)) | (1L << (F_CAPO - 72)) | (1L << (F_CHAO - 72)) | (1L << (F_COSH - 72)) | (1L << (F_COSS - 72)) | (1L << (F_DCM - 72)) | (1L << (F_GRRA - 72)) | (1L << (F_HIPO - 72)) | (1L << (F_INC - 72)) | (1L << (F_LOGA - 72)) | (1L << (F_MAXI - 72)) | (1L << (F_MINI - 72)) | (1L << (F_NUMA - 72)) | (1L << (F_POTE - 72)) | (1L << (F_RAGR - 72)) | (1L << (F_RAIC - 72)) | (1L << (F_RAIQ - 72)) | (1L << (F_RAIZ - 72)) | (1L << (F_SEME - 72)) | (1L << (F_SENH - 72)) | (1L << (F_SENO - 72)) | (1L << (F_TANG - 72)) | (1L << (F_TANH - 72)) | (1L << (F_TETO - 72)) | (1L << (F_VABS - 72)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (ADI - 157)) | (1L << (ADIA - 157)) | (1L << (SUB - 157)) | (1L << (SUBA - 157)) | (1L << (NAO - 157)) | (1L << (NAOT - 157)) | (1L << (ID - 157)) | (1L << (INT - 157)) | (1L << (DEC - 157)) | (1L << (CHEX - 157)) | (1L << (CHAR - 157)) | (1L << (STRING - 157)))) != 0) );
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
			setState(287);
			match(REP);
			setState(288);
			expr();
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==VEZ || _la==VEZS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(290);
			match(T__2);
			setState(292); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(291);
				inst();
				}
				}
				setState(294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (REP - 72)) | (1L << (REPE - 72)) | (1L << (SE - 72)) | (1L << (TART - 72)) | (1L << (TROC - 72)) | (1L << (USA - 72)) | (1L << (VA - 72)) | (1L << (VER - 72)) | (1L << (F_ACOS - 72)) | (1L << (F_ARRE - 72)) | (1L << (F_ASEN - 72)) | (1L << (F_ATAN - 72)) | (1L << (F_CAPO - 72)) | (1L << (F_CHAO - 72)) | (1L << (F_COSH - 72)) | (1L << (F_COSS - 72)) | (1L << (F_DCM - 72)) | (1L << (F_GRRA - 72)) | (1L << (F_HIPO - 72)) | (1L << (F_INC - 72)) | (1L << (F_LOGA - 72)) | (1L << (F_MAXI - 72)) | (1L << (F_MINI - 72)) | (1L << (F_NUMA - 72)) | (1L << (F_POTE - 72)) | (1L << (F_RAGR - 72)) | (1L << (F_RAIC - 72)) | (1L << (F_RAIQ - 72)) | (1L << (F_RAIZ - 72)) | (1L << (F_SEME - 72)) | (1L << (F_SENH - 72)) | (1L << (F_SENO - 72)) | (1L << (F_TANG - 72)) | (1L << (F_TANH - 72)) | (1L << (F_TETO - 72)) | (1L << (F_VABS - 72)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (ADI - 157)) | (1L << (ADIA - 157)) | (1L << (SUB - 157)) | (1L << (SUBA - 157)) | (1L << (NAO - 157)) | (1L << (NAOT - 157)) | (1L << (ID - 157)) | (1L << (INT - 157)) | (1L << (DEC - 157)) | (1L << (CHEX - 157)) | (1L << (CHAR - 157)) | (1L << (STRING - 157)))) != 0) );
			setState(296);
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
			setState(298);
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
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENQ) {
				{
				setState(300);
				match(ENQ);
				setState(301);
				exprBool();
				}
			}

			setState(304);
			match(REP);
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DCMM:
			case INCM:
				{
				setState(305);
				_la = _input.LA(1);
				if ( !(_la==DCMM || _la==INCM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(306);
				match(ID);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EM) {
					{
					setState(307);
					match(EM);
					setState(308);
					expr();
					}
				}

				}
				break;
			case SOMM:
				{
				setState(311);
				match(SOMM);
				setState(312);
				match(ID);
				setState(313);
				match(COM);
				setState(314);
				expr();
				}
				break;
			case MULM:
				{
				setState(315);
				match(MULM);
				setState(316);
				match(ID);
				setState(317);
				match(POR);
				setState(318);
				expr();
				}
				break;
			case DIVM:
				{
				setState(319);
				match(DIVM);
				setState(320);
				match(ID);
				setState(321);
				match(POR);
				setState(322);
				expr();
				}
				break;
			case SUBM:
				{
				setState(323);
				match(SUBM);
				setState(324);
				expr();
				setState(325);
				match(DE);
				setState(326);
				match(ID);
				}
				break;
			case T__2:
				break;
			default:
				break;
			}
			setState(330);
			match(T__2);
			setState(332); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(331);
				inst();
				}
				}
				setState(334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (REP - 72)) | (1L << (REPE - 72)) | (1L << (SE - 72)) | (1L << (TART - 72)) | (1L << (TROC - 72)) | (1L << (USA - 72)) | (1L << (VA - 72)) | (1L << (VER - 72)) | (1L << (F_ACOS - 72)) | (1L << (F_ARRE - 72)) | (1L << (F_ASEN - 72)) | (1L << (F_ATAN - 72)) | (1L << (F_CAPO - 72)) | (1L << (F_CHAO - 72)) | (1L << (F_COSH - 72)) | (1L << (F_COSS - 72)) | (1L << (F_DCM - 72)) | (1L << (F_GRRA - 72)) | (1L << (F_HIPO - 72)) | (1L << (F_INC - 72)) | (1L << (F_LOGA - 72)) | (1L << (F_MAXI - 72)) | (1L << (F_MINI - 72)) | (1L << (F_NUMA - 72)) | (1L << (F_POTE - 72)) | (1L << (F_RAGR - 72)) | (1L << (F_RAIC - 72)) | (1L << (F_RAIQ - 72)) | (1L << (F_RAIZ - 72)) | (1L << (F_SEME - 72)) | (1L << (F_SENH - 72)) | (1L << (F_SENO - 72)) | (1L << (F_TANG - 72)) | (1L << (F_TANH - 72)) | (1L << (F_TETO - 72)) | (1L << (F_VABS - 72)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (ADI - 157)) | (1L << (ADIA - 157)) | (1L << (SUB - 157)) | (1L << (SUBA - 157)) | (1L << (NAO - 157)) | (1L << (NAOT - 157)) | (1L << (ID - 157)) | (1L << (INT - 157)) | (1L << (DEC - 157)) | (1L << (CHEX - 157)) | (1L << (CHAR - 157)) | (1L << (STRING - 157)))) != 0) );
			setState(336);
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
			setState(338);
			match(PARA);
			setState(339);
			match(CADA);
			setState(340);
			match(ID);
			setState(341);
			match(EM);
			setState(342);
			expr();
			setState(343);
			match(REP);
			setState(344);
			match(T__2);
			setState(346); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(345);
				inst();
				}
				}
				setState(348); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ABA) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA) | (1L << PARR) | (1L << PI))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (REP - 72)) | (1L << (REPE - 72)) | (1L << (SE - 72)) | (1L << (TART - 72)) | (1L << (TROC - 72)) | (1L << (USA - 72)) | (1L << (VA - 72)) | (1L << (VER - 72)) | (1L << (F_ACOS - 72)) | (1L << (F_ARRE - 72)) | (1L << (F_ASEN - 72)) | (1L << (F_ATAN - 72)) | (1L << (F_CAPO - 72)) | (1L << (F_CHAO - 72)) | (1L << (F_COSH - 72)) | (1L << (F_COSS - 72)) | (1L << (F_DCM - 72)) | (1L << (F_GRRA - 72)) | (1L << (F_HIPO - 72)) | (1L << (F_INC - 72)) | (1L << (F_LOGA - 72)) | (1L << (F_MAXI - 72)) | (1L << (F_MINI - 72)) | (1L << (F_NUMA - 72)) | (1L << (F_POTE - 72)) | (1L << (F_RAGR - 72)) | (1L << (F_RAIC - 72)) | (1L << (F_RAIQ - 72)) | (1L << (F_RAIZ - 72)) | (1L << (F_SEME - 72)) | (1L << (F_SENH - 72)) | (1L << (F_SENO - 72)) | (1L << (F_TANG - 72)) | (1L << (F_TANH - 72)) | (1L << (F_TETO - 72)) | (1L << (F_VABS - 72)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (ADI - 157)) | (1L << (ADIA - 157)) | (1L << (SUB - 157)) | (1L << (SUBA - 157)) | (1L << (NAO - 157)) | (1L << (NAOT - 157)) | (1L << (ID - 157)) | (1L << (INT - 157)) | (1L << (DEC - 157)) | (1L << (CHEX - 157)) | (1L << (CHAR - 157)) | (1L << (STRING - 157)))) != 0) );
			setState(350);
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
			setState(352);
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
			setState(354);
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
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new MovimentarDirecaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(VA);
				setState(357);
				match(PARA);
				setState(358);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAI) | (1L << CIM) | (1L << DIR) | (1L << ESQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EM) {
					{
					setState(359);
					match(EM);
					setState(360);
					expr();
					}
				}

				}
				break;
			case 2:
				_localctx = new MovimentarPontoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(VA);
				setState(364);
				match(PARA);
				setState(365);
				match(T__4);
				setState(366);
				expr();
				setState(367);
				match(T__7);
				setState(368);
				expr();
				setState(369);
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
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new TrocarCorPincelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(TROC);
				setState(374);
				match(COR);
				setState(375);
				match(DO);
				setState(376);
				match(PINC);
				setState(377);
				match(PARA);
				setState(378);
				configuracaoCor();
				}
				break;
			case 2:
				_localctx = new TrocarCorPreenchimentoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(TROC);
				setState(380);
				match(COR);
				setState(381);
				match(DO);
				setState(382);
				match(PREE);
				setState(383);
				match(PARA);
				setState(384);
				configuracaoCor();
				}
				break;
			case 3:
				_localctx = new TrocarCorFundoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				match(TROC);
				setState(386);
				match(COR);
				setState(387);
				match(DO);
				setState(388);
				match(FUN);
				setState(389);
				match(PARA);
				setState(390);
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
			setState(398);
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
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(393);
					cor();
					}
					break;
				case 2:
					{
					setState(394);
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
				setState(397);
				((ConfiguracaoCorContext)_localctx).corEx = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (PRETO - 88)) | (1L << (AZUL - 88)) | (1L << (CIANO - 88)) | (1L << (CINZA - 88)) | (1L << (VERDE - 88)) | (1L << (MAGENTA - 88)) | (1L << (LARANJA - 88)) | (1L << (ROSA - 88)) | (1L << (VERMELHO - 88)) | (1L << (BRANCO - 88)) | (1L << (AMARELO - 88)))) != 0)) ) {
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
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << FAL) | (1L << FORM) | (1L << PI))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (REPE - 73)) | (1L << (TART - 73)) | (1L << (VER - 73)) | (1L << (ESCURO - 73)) | (1L << (CLARO - 73)) | (1L << (F_ACOS - 73)) | (1L << (F_ARRE - 73)) | (1L << (F_ASEN - 73)) | (1L << (F_ATAN - 73)) | (1L << (F_CAPO - 73)) | (1L << (F_CHAO - 73)) | (1L << (F_COSH - 73)) | (1L << (F_COSS - 73)) | (1L << (F_DCM - 73)) | (1L << (F_GRRA - 73)) | (1L << (F_HIPO - 73)) | (1L << (F_INC - 73)) | (1L << (F_LOGA - 73)) | (1L << (F_MAXI - 73)) | (1L << (F_MINI - 73)) | (1L << (F_NUMA - 73)) | (1L << (F_POTE - 73)) | (1L << (F_RAGR - 73)) | (1L << (F_RAIC - 73)) | (1L << (F_RAIQ - 73)) | (1L << (F_RAIZ - 73)) | (1L << (F_SEME - 73)) | (1L << (F_SENH - 73)) | (1L << (F_SENO - 73)) | (1L << (F_TANG - 73)) | (1L << (F_TANH - 73)) | (1L << (F_TETO - 73)) | (1L << (F_VABS - 73)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (ADI - 157)) | (1L << (ADIA - 157)) | (1L << (SUB - 157)) | (1L << (SUBA - 157)) | (1L << (NAO - 157)) | (1L << (NAOT - 157)) | (1L << (ID - 157)) | (1L << (INT - 157)) | (1L << (DEC - 157)) | (1L << (CHEX - 157)) | (1L << (CHAR - 157)) | (1L << (STRING - 157)))) != 0)) {
				{
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << FAL) | (1L << FORM) | (1L << PI))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (REPE - 73)) | (1L << (TART - 73)) | (1L << (VER - 73)) | (1L << (F_ACOS - 73)) | (1L << (F_ARRE - 73)) | (1L << (F_ASEN - 73)) | (1L << (F_ATAN - 73)) | (1L << (F_CAPO - 73)) | (1L << (F_CHAO - 73)) | (1L << (F_COSH - 73)) | (1L << (F_COSS - 73)) | (1L << (F_DCM - 73)) | (1L << (F_GRRA - 73)) | (1L << (F_HIPO - 73)) | (1L << (F_INC - 73)) | (1L << (F_LOGA - 73)) | (1L << (F_MAXI - 73)) | (1L << (F_MINI - 73)) | (1L << (F_NUMA - 73)) | (1L << (F_POTE - 73)) | (1L << (F_RAGR - 73)) | (1L << (F_RAIC - 73)) | (1L << (F_RAIQ - 73)) | (1L << (F_RAIZ - 73)) | (1L << (F_SEME - 73)) | (1L << (F_SENH - 73)) | (1L << (F_SENO - 73)) | (1L << (F_TANG - 73)) | (1L << (F_TANH - 73)) | (1L << (F_TETO - 73)) | (1L << (F_VABS - 73)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (ADI - 157)) | (1L << (ADIA - 157)) | (1L << (SUB - 157)) | (1L << (SUBA - 157)) | (1L << (NAO - 157)) | (1L << (NAOT - 157)) | (1L << (ID - 157)) | (1L << (INT - 157)) | (1L << (DEC - 157)) | (1L << (CHEX - 157)) | (1L << (CHAR - 157)) | (1L << (STRING - 157)))) != 0)) {
					{
					setState(400);
					expr();
					setState(401);
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

				setState(405);
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
			setState(408);
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
			setState(410);
			match(GIR);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(411);
				match(EM);
				setState(412);
				expr();
				setState(413);
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
			setState(417);
			match(ENG);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(418);
				match(EM);
				setState(419);
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
			setState(422);
			match(DES);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(423);
				match(EM);
				setState(424);
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
			setState(427);
			match(TROC);
			setState(428);
			match(GROS);
			setState(429);
			match(PARA);
			setState(430);
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
			setState(432);
			match(ESC);
			setState(433);
			expr();
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUL) {
					{
					setState(434);
					match(PUL);
					setState(435);
					match(LIN);
					}
				}

				setState(438);
				match(NA);
				setState(439);
				match(SAI);
				}
				break;
			case 2:
				{
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUL) {
					{
					setState(440);
					match(PUL);
					setState(441);
					match(LIN);
					}
				}

				setState(444);
				match(NO);
				setState(445);
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
			setState(448);
			match(LER);
			setState(449);
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
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new AtribuirPadraoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(ID);
				setState(452);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(455);
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
					setState(453);
					expr();
					}
					break;
				case CRA:
				case CRAA:
				case CRR:
				case CRRA:
					{
					setState(454);
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
				setState(457);
				match(ID);
				setState(462); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(458);
					match(T__0);
					setState(459);
					exprIndice();
					setState(460);
					match(T__1);
					}
					}
					setState(464); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(466);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(469);
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
					setState(467);
					expr();
					}
					break;
				case CRA:
				case CRAA:
				case CRR:
				case CRRA:
					{
					setState(468);
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
				setState(471);
				match(ID);
				{
				setState(472);
				match(T__2);
				setState(473);
				exprIndice();
				setState(474);
				match(T__3);
				}
				setState(476);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(479);
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
					setState(477);
					expr();
					}
					break;
				case CRA:
				case CRAA:
				case CRR:
				case CRRA:
					{
					setState(478);
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
				setState(481);
				match(ID);
				setState(482);
				_la = _input.LA(1);
				if ( !(_la==AC_A || _la==AT_A) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(483);
				expr();
				}
				break;
			case 5:
				_localctx = new AtribuirSubtracaoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(484);
				match(ID);
				setState(485);
				_la = _input.LA(1);
				if ( !(_la==AC_S || _la==AT_S) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(486);
				expr();
				}
				break;
			case 6:
				_localctx = new AtribuirMultiplicacaoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(487);
				match(ID);
				setState(488);
				_la = _input.LA(1);
				if ( !(_la==AC_M || _la==AT_M) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(489);
				expr();
				}
				break;
			case 7:
				_localctx = new AtribuirDivisaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(490);
				match(ID);
				setState(491);
				_la = _input.LA(1);
				if ( !(_la==AC_D || _la==AT_D) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(492);
				expr();
				}
				break;
			case 8:
				_localctx = new AtribuirRestoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(493);
				match(ID);
				setState(494);
				_la = _input.LA(1);
				if ( !(_la==AC_R || _la==AT_R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(495);
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
			setState(498);
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
			setState(500);
			match(ABA);
			setState(501);
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
			setState(503);
			match(LEV);
			setState(504);
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
			setState(506);
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
			setState(675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F_VABS:
				_localctx = new FuncaoAbsolutoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(F_VABS);
				setState(509);
				match(T__4);
				setState(510);
				expr();
				setState(511);
				match(T__5);
				}
				break;
			case F_RAIQ:
				_localctx = new FuncaoRaizQuadradaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				match(F_RAIQ);
				setState(514);
				match(T__4);
				setState(515);
				expr();
				setState(516);
				match(T__5);
				}
				break;
			case F_RAIC:
				_localctx = new FuncaoRaizCubicaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
				match(F_RAIC);
				setState(519);
				match(T__4);
				setState(520);
				expr();
				setState(521);
				match(T__5);
				}
				break;
			case F_RAIZ:
				_localctx = new FuncaoRaizContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(523);
				match(F_RAIZ);
				setState(524);
				match(T__4);
				setState(525);
				expr();
				setState(526);
				match(T__7);
				setState(527);
				expr();
				setState(528);
				match(T__5);
				}
				break;
			case F_POTE:
				_localctx = new FuncaoPotenciaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(530);
				match(F_POTE);
				setState(531);
				match(T__4);
				setState(532);
				expr();
				setState(533);
				match(T__7);
				setState(534);
				expr();
				setState(535);
				match(T__5);
				}
				break;
			case F_HIPO:
				_localctx = new FuncaoHipotenusaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(537);
				match(F_HIPO);
				setState(538);
				match(T__4);
				setState(539);
				expr();
				setState(540);
				match(T__7);
				setState(541);
				expr();
				setState(542);
				match(T__5);
				}
				break;
			case F_CHAO:
				_localctx = new FuncaoChaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(544);
				match(F_CHAO);
				setState(545);
				match(T__4);
				setState(546);
				expr();
				setState(547);
				match(T__5);
				}
				break;
			case F_TETO:
				_localctx = new FuncaoTetoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(549);
				match(F_TETO);
				setState(550);
				match(T__4);
				setState(551);
				expr();
				setState(552);
				match(T__5);
				}
				break;
			case F_ARRE:
				_localctx = new FuncaoArredondarContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(554);
				match(F_ARRE);
				setState(555);
				match(T__4);
				setState(561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(556);
					expr();
					}
					break;
				case 2:
					{
					setState(557);
					expr();
					setState(558);
					match(T__7);
					setState(559);
					expr();
					}
					break;
				}
				setState(563);
				match(T__5);
				}
				break;
			case F_MINI:
				_localctx = new FuncaoMinimoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(565);
				match(F_MINI);
				setState(566);
				match(T__4);
				setState(567);
				expr();
				setState(568);
				match(T__7);
				setState(569);
				expr();
				setState(570);
				match(T__5);
				}
				break;
			case F_MAXI:
				_localctx = new FuncaoMaximoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(572);
				match(F_MAXI);
				setState(573);
				match(T__4);
				setState(574);
				expr();
				setState(575);
				match(T__7);
				setState(576);
				expr();
				setState(577);
				match(T__5);
				}
				break;
			case F_NUMA:
				_localctx = new FuncaoNumeroAleatorioContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(579);
				match(F_NUMA);
				setState(580);
				match(T__4);
				setState(586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(581);
					expr();
					}
					break;
				case 2:
					{
					setState(582);
					expr();
					setState(583);
					match(T__7);
					setState(584);
					expr();
					}
					break;
				}
				setState(588);
				match(T__5);
				}
				break;
			case F_SEME:
				_localctx = new FuncaoDefinirSementeAleatoriaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(589);
				match(F_SEME);
				setState(590);
				match(T__4);
				setState(591);
				expr();
				setState(592);
				match(T__5);
				}
				break;
			case F_SENO:
				_localctx = new FuncaoSenoContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(594);
				match(F_SENO);
				setState(595);
				match(T__4);
				setState(596);
				expr();
				setState(597);
				match(T__5);
				}
				break;
			case F_COSS:
				_localctx = new FuncaoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(599);
				match(F_COSS);
				setState(600);
				match(T__4);
				setState(601);
				expr();
				setState(602);
				match(T__5);
				}
				break;
			case F_TANG:
				_localctx = new FuncaoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(604);
				match(F_TANG);
				setState(605);
				match(T__4);
				setState(606);
				expr();
				setState(607);
				match(T__5);
				}
				break;
			case F_ASEN:
				_localctx = new FuncaoArcoSenoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(609);
				match(F_ASEN);
				setState(610);
				match(T__4);
				setState(611);
				expr();
				setState(612);
				match(T__5);
				}
				break;
			case F_ACOS:
				_localctx = new FuncaoArcoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(614);
				match(F_ACOS);
				setState(615);
				match(T__4);
				setState(616);
				expr();
				setState(617);
				match(T__5);
				}
				break;
			case F_ATAN:
				_localctx = new FuncaoArcoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(619);
				match(F_ATAN);
				setState(620);
				match(T__4);
				setState(621);
				expr();
				setState(622);
				match(T__5);
				}
				break;
			case F_CAPO:
				_localctx = new FuncaoCartesianoParaPolarContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(624);
				match(F_CAPO);
				setState(625);
				match(T__4);
				setState(626);
				expr();
				setState(627);
				match(T__7);
				setState(628);
				expr();
				setState(629);
				match(T__5);
				}
				break;
			case F_SENH:
				_localctx = new FuncaoSenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(631);
				match(F_SENH);
				setState(632);
				match(T__4);
				setState(633);
				expr();
				setState(634);
				match(T__5);
				}
				break;
			case F_COSH:
				_localctx = new FuncaoCossenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(636);
				match(F_COSH);
				setState(637);
				match(T__4);
				setState(638);
				expr();
				setState(639);
				match(T__5);
				}
				break;
			case F_TANH:
				_localctx = new FuncaoTangenteHiperbolicaContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(641);
				match(F_TANH);
				setState(642);
				match(T__4);
				setState(643);
				expr();
				setState(644);
				match(T__5);
				}
				break;
			case F_LOGA:
				_localctx = new FuncaoLogaritmoContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(646);
				match(F_LOGA);
				setState(647);
				match(T__4);
				setState(653);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(648);
					expr();
					}
					break;
				case 2:
					{
					setState(649);
					expr();
					setState(650);
					match(T__7);
					setState(651);
					expr();
					}
					break;
				}
				setState(655);
				match(T__5);
				}
				break;
			case F_GRRA:
				_localctx = new FuncaoGrausParaRadianosContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(657);
				match(F_GRRA);
				setState(658);
				match(T__4);
				setState(659);
				expr();
				setState(660);
				match(T__5);
				}
				break;
			case F_RAGR:
				_localctx = new FuncaoRadianosParaGrausContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(662);
				match(F_RAGR);
				setState(663);
				match(T__4);
				setState(664);
				expr();
				setState(665);
				match(T__5);
				}
				break;
			case F_INC:
				_localctx = new FuncaoIncrementarContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(667);
				match(F_INC);
				setState(668);
				match(T__4);
				setState(669);
				match(ID);
				setState(670);
				match(T__5);
				}
				break;
			case F_DCM:
				_localctx = new FuncaoDecrementarContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(671);
				match(F_DCM);
				setState(672);
				match(T__4);
				setState(673);
				match(ID);
				setState(674);
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
			setState(677);
			match(DESE);
			setState(678);
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
	public static class FuncaoDesenharCurvaCubicaContext extends FuncaoGeometricaContext {
		public TerminalNode FG_CCU() { return getToken(AuroraLogoParser.FG_CCU, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpcaoFGeomAContext opcaoFGeomA() {
			return getRuleContext(OpcaoFGeomAContext.class,0);
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
		public OpcaoFGeomAContext opcaoFGeomA() {
			return getRuleContext(OpcaoFGeomAContext.class,0);
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
		public OpcaoFGeomAContext opcaoFGeomA() {
			return getRuleContext(OpcaoFGeomAContext.class,0);
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
		public OpcaoFGeomAContext opcaoFGeomA() {
			return getRuleContext(OpcaoFGeomAContext.class,0);
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
			setState(855);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FG_SEG:
				_localctx = new FuncaoDesenharSegmentoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				match(FG_SEG);
				setState(681);
				match(T__4);
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
				match(T__7);
				setState(688);
				expr();
				setState(689);
				match(T__5);
				}
				break;
			case FG_QUA:
				_localctx = new FuncaoDesenharQuadradoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				match(FG_QUA);
				setState(692);
				match(T__4);
				setState(693);
				expr();
				setState(694);
				match(T__7);
				setState(695);
				expr();
				setState(696);
				match(T__7);
				setState(697);
				expr();
				setState(698);
				match(T__5);
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREO || _la==SEM) {
					{
					setState(699);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_RET:
				_localctx = new FuncaoDesenharRetanguloContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(702);
				match(FG_RET);
				setState(703);
				match(T__4);
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
				match(T__7);
				setState(710);
				expr();
				setState(711);
				match(T__5);
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREO || _la==SEM) {
					{
					setState(712);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_CIC:
				_localctx = new FuncaoDesenharCirculoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(715);
				match(FG_CIC);
				setState(716);
				match(T__4);
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
				match(T__5);
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREO || _la==SEM) {
					{
					setState(723);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_ELI:
				_localctx = new FuncaoDesenharElipseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(726);
				match(FG_ELI);
				setState(727);
				match(T__4);
				setState(728);
				expr();
				setState(729);
				match(T__7);
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
				if (_la==PREA || _la==SEM) {
					{
					setState(736);
					opcaoFGeomA();
					}
				}

				}
				break;
			case FG_ARC:
				_localctx = new FuncaoDesenharArcoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(739);
				match(FG_ARC);
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
				match(T__7);
				setState(749);
				expr();
				setState(750);
				match(T__7);
				setState(751);
				expr();
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(752);
					match(T__7);
					setState(753);
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

				setState(756);
				match(T__5);
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREO || _la==SEM) {
					{
					setState(757);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_POR:
				_localctx = new FuncaoDesenharPoligonoRegularContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(760);
				match(FG_POR);
				setState(761);
				match(T__4);
				setState(762);
				expr();
				setState(763);
				match(T__7);
				setState(764);
				expr();
				setState(765);
				match(T__7);
				setState(766);
				expr();
				setState(767);
				match(T__7);
				setState(768);
				expr();
				setState(769);
				match(T__7);
				setState(770);
				expr();
				setState(771);
				match(T__5);
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREO || _la==SEM) {
					{
					setState(772);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_EST:
				_localctx = new FuncaoDesenharEstrelaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(775);
				match(FG_EST);
				setState(776);
				match(T__4);
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
				match(T__7);
				setState(785);
				expr();
				setState(786);
				match(T__5);
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREA || _la==SEM) {
					{
					setState(787);
					opcaoFGeomA();
					}
				}

				}
				break;
			case FG_POL:
				_localctx = new FuncaoDesenharPoligonoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(790);
				match(FG_POL);
				setState(791);
				match(T__4);
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
				match(T__7);
				setState(800);
				expr();
				setState(801);
				match(T__7);
				setState(802);
				expr();
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(803);
					match(T__7);
					setState(804);
					expr();
					setState(805);
					match(T__7);
					setState(806);
					expr();
					}
					}
					setState(812);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(813);
				match(T__5);
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREO || _la==SEM) {
					{
					setState(814);
					opcaoFGeomO();
					}
				}

				}
				break;
			case FG_CQD:
				_localctx = new FuncaoDesenharCurvaQuadraticaContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(817);
				match(FG_CQD);
				setState(818);
				match(T__4);
				setState(819);
				expr();
				setState(820);
				match(T__7);
				setState(821);
				expr();
				setState(822);
				match(T__7);
				setState(823);
				expr();
				setState(824);
				match(T__7);
				setState(825);
				expr();
				setState(826);
				match(T__7);
				setState(827);
				expr();
				setState(828);
				match(T__7);
				setState(829);
				expr();
				setState(830);
				match(T__5);
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREA || _la==SEM) {
					{
					setState(831);
					opcaoFGeomA();
					}
				}

				}
				break;
			case FG_CCU:
				_localctx = new FuncaoDesenharCurvaCubicaContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(834);
				match(FG_CCU);
				setState(835);
				match(T__4);
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
				match(T__7);
				setState(844);
				expr();
				setState(845);
				match(T__7);
				setState(846);
				expr();
				setState(847);
				match(T__7);
				setState(848);
				expr();
				setState(849);
				match(T__7);
				setState(850);
				expr();
				setState(851);
				match(T__5);
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREA || _la==SEM) {
					{
					setState(852);
					opcaoFGeomA();
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
		public TerminalNode PREO() { return getToken(AuroraLogoParser.PREO, 0); }
		public TerminalNode E() { return getToken(AuroraLogoParser.E, 0); }
		public TerminalNode SEM() { return getToken(AuroraLogoParser.SEM, 0); }
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
			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PREO:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				match(PREO);
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(858);
					match(E);
					setState(859);
					match(SEM);
					setState(860);
					match(CON);
					}
				}

				}
				break;
			case SEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				match(SEM);
				setState(864);
				match(CON);
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(865);
					match(E);
					setState(866);
					match(PREO);
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

	public static class OpcaoFGeomAContext extends ParserRuleContext {
		public TerminalNode PREA() { return getToken(AuroraLogoParser.PREA, 0); }
		public TerminalNode E() { return getToken(AuroraLogoParser.E, 0); }
		public TerminalNode SEM() { return getToken(AuroraLogoParser.SEM, 0); }
		public TerminalNode CON() { return getToken(AuroraLogoParser.CON, 0); }
		public OpcaoFGeomAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcaoFGeomA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterOpcaoFGeomA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitOpcaoFGeomA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitOpcaoFGeomA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcaoFGeomAContext opcaoFGeomA() throws RecognitionException {
		OpcaoFGeomAContext _localctx = new OpcaoFGeomAContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_opcaoFGeomA);
		int _la;
		try {
			setState(883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PREA:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				match(PREA);
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
			case SEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				match(SEM);
				setState(878);
				match(CON);
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(879);
					match(E);
					setState(880);
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
		enterRule(_localctx, 82, RULE_desenharCaminho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(DESE);
			setState(886);
			match(CAM);
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PREO || _la==SEM) {
				{
				setState(887);
				opcaoFGeomO();
				}
			}

			setState(890);
			match(T__2);
			setState(894); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(891);
				instCaminho();
				setState(892);
				match(DOT);
				}
				}
				setState(896); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CUR) | (1L << FEC) | (1L << LIN) | (1L << MOV))) != 0) );
			setState(898);
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
		enterRule(_localctx, 84, RULE_instCaminho);
		try {
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				_localctx = new InstrucaoCaminhoMoverAteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				match(MOV);
				setState(901);
				match(ATE);
				setState(902);
				match(T__4);
				setState(903);
				expr();
				setState(904);
				match(T__7);
				setState(905);
				expr();
				setState(906);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new InstrucaoCaminhoLinhaAteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				match(LIN);
				setState(909);
				match(ATE);
				setState(910);
				match(T__4);
				setState(911);
				expr();
				setState(912);
				match(T__7);
				setState(913);
				expr();
				setState(914);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new InstrucaoCaminhoCurvaQuadraticaAteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(916);
				match(CUR);
				setState(917);
				match(QUAD);
				setState(918);
				match(ATE);
				setState(919);
				match(T__4);
				setState(920);
				expr();
				setState(921);
				match(T__7);
				setState(922);
				expr();
				setState(923);
				match(T__7);
				setState(924);
				expr();
				setState(925);
				match(T__7);
				setState(926);
				expr();
				setState(927);
				match(T__5);
				}
				break;
			case 4:
				_localctx = new InstrucaoCaminhoCurvaCubicaAteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(929);
				match(CUR);
				setState(930);
				match(CUBI);
				setState(931);
				match(ATE);
				setState(932);
				match(T__4);
				setState(933);
				expr();
				setState(934);
				match(T__7);
				setState(935);
				expr();
				setState(936);
				match(T__7);
				setState(937);
				expr();
				setState(938);
				match(T__7);
				setState(939);
				expr();
				setState(940);
				match(T__7);
				setState(941);
				expr();
				setState(942);
				match(T__7);
				setState(943);
				expr();
				setState(944);
				match(T__5);
				}
				break;
			case 5:
				_localctx = new InstrucaoCaminhoFecharCaminhoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(946);
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
		enterRule(_localctx, 86, RULE_consultarTartaruga);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			match(TART);
			setState(950);
			match(DOT);
			setState(951);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (PA - 101)) | (1L << (PX - 101)) | (1L << (PY - 101)))) != 0)) ) {
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
		enterRule(_localctx, 88, RULE_formatarTexto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			match(FORM);
			setState(954);
			match(T__4);
			setState(955);
			match(STRING);
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(956);
				match(T__7);
				setState(957);
				expr();
				}
				}
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(963);
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
		enterRule(_localctx, 90, RULE_criarArranjos);
		int _la;
		try {
			setState(977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CRA:
			case CRR:
				_localctx = new CriarArranjoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(965);
				_la = _input.LA(1);
				if ( !(_la==CRA || _la==CRR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(970); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(966);
					match(T__0);
					setState(967);
					expr();
					setState(968);
					match(T__1);
					}
					}
					setState(972); 
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
				setState(974);
				_la = _input.LA(1);
				if ( !(_la==CRAA || _la==CRRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(975);
				match(T__2);
				setState(976);
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
		"\u0004\u0001\u00c9\u03d4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		",\u0002-\u0007-\u0001\u0000\u0004\u0000^\b\u0000\u000b\u0000\f\u0000_"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001k\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002}\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u0082\b\u0003\n\u0003\f\u0003\u0085"+
		"\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008a\b\u0004"+
		"\u0001\u0005\u0003\u0005\u008d\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u0092\b\u0005\n\u0005\f\u0005\u0095\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u009a\b\u0006\n\u0006\f\u0006\u009d\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a9\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007"+
		"\u00b0\b\u0007\u000b\u0007\f\u0007\u00b1\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00b8\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00c2\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u00c7"+
		"\b\u0007\u000b\u0007\f\u0007\u00c8\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d7\b\u0007\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0005\t\u00dd\b\t\n\t\f\t\u00e0\t\t\u0001\t\u0003"+
		"\t\u00e3\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00ea\b\n"+
		"\u000b\n\f\n\u00eb\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00f6\b\u000b\u000b\u000b"+
		"\f\u000b\u00f7\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004\f"+
		"\u00ff\b\f\u000b\f\f\f\u0100\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0004\r\u0109\b\r\u000b\r\f\r\u010a\u0001\r\u0001\r\u0001\r\u0004\r"+
		"\u0110\b\r\u000b\r\f\r\u0111\u0003\r\u0114\b\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u011c\b\u000e\u000b\u000e"+
		"\f\u000e\u011d\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0004\u000f\u0125\b\u000f\u000b\u000f\f\u000f\u0126\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u012f"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0136\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0149\b\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u014d"+
		"\b\u0011\u000b\u0011\f\u0011\u014e\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0004\u0012\u015b\b\u0012\u000b\u0012\f\u0012\u015c\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u016a"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0174\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0188"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u018c\b\u0017\u0001\u0017"+
		"\u0003\u0017\u018f\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0194\b\u0017\u0001\u0017\u0003\u0017\u0197\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u01a0\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01a5"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01aa\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01b5\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01bb\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u01bf\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01c8\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f"+
		"\u01cf\b\u001f\u000b\u001f\f\u001f\u01d0\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u01d6\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01e0"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01f1\b\u001f\u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u0232\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u024b\b$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u028e\b$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u02a4\b$\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u02bd\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u02ca\b&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02d5\b&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02e2"+
		"\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02f3\b&\u0001&\u0001&\u0003"+
		"&\u02f7\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u0306\b&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u0315\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005"+
		"&\u0329\b&\n&\f&\u032c\t&\u0001&\u0001&\u0003&\u0330\b&\u0001&\u0001&"+
		"\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u0341\b&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u0356\b&\u0003&\u0358\b&\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0003\'\u035e\b\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u0364\b\'\u0003\'\u0366\b\'\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u036c\b(\u0001(\u0001(\u0001(\u0001(\u0003(\u0372\b(\u0003(\u0374\b"+
		"(\u0001)\u0001)\u0001)\u0003)\u0379\b)\u0001)\u0001)\u0001)\u0001)\u0004"+
		")\u037f\b)\u000b)\f)\u0380\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0003*\u03b4\b*\u0001+\u0001+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0005,\u03bf\b,\n,\f,\u03c2\t,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0004-\u03cb\b-\u000b-\f-\u03cc\u0001-\u0001"+
		"-\u0001-\u0003-\u03d2\b-\u0001-\u0000\u0000.\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\u0000\u0016\u0001\u0000\u00b8\u00bb\u0001\u0000\u00a6"+
		"\u00b7\u0001\u0000\u009d\u00a0\u0002\u0000WW\u00a1\u00a5\u0001\u0000\u00bc"+
		"\u00bd\u0002\u0000++UU\u0002\u0000\u00c2\u00c3\u00c5\u00c6\u0001\u0000"+
		"VW\u0002\u0000\u001b\u001b22\u0004\u0000\f\f\u000f\u000f  **\u0001\u0000"+
		"Xb\u0001\u0000cd\u0001\u0000\u0091\u0092\u0001\u0000\u0093\u0094\u0001"+
		"\u0000\u0095\u0096\u0001\u0000\u0097\u0098\u0001\u0000\u0099\u009a\u0001"+
		"\u0000\u009b\u009c\u0003\u0000\n\n\u0010\u0010AA\u0001\u0000eg\u0002\u0000"+
		"\u0017\u0017\u0019\u0019\u0002\u0000\u0018\u0018\u001a\u001a\u0449\u0000"+
		"]\u0001\u0000\u0000\u0000\u0002j\u0001\u0000\u0000\u0000\u0004|\u0001"+
		"\u0000\u0000\u0000\u0006~\u0001\u0000\u0000\u0000\b\u0086\u0001\u0000"+
		"\u0000\u0000\n\u008c\u0001\u0000\u0000\u0000\f\u0096\u0001\u0000\u0000"+
		"\u0000\u000e\u00d6\u0001\u0000\u0000\u0000\u0010\u00d8\u0001\u0000\u0000"+
		"\u0000\u0012\u00da\u0001\u0000\u0000\u0000\u0014\u00e4\u0001\u0000\u0000"+
		"\u0000\u0016\u00ef\u0001\u0000\u0000\u0000\u0018\u00fb\u0001\u0000\u0000"+
		"\u0000\u001a\u0104\u0001\u0000\u0000\u0000\u001c\u0117\u0001\u0000\u0000"+
		"\u0000\u001e\u011f\u0001\u0000\u0000\u0000 \u012a\u0001\u0000\u0000\u0000"+
		"\"\u012e\u0001\u0000\u0000\u0000$\u0152\u0001\u0000\u0000\u0000&\u0160"+
		"\u0001\u0000\u0000\u0000(\u0162\u0001\u0000\u0000\u0000*\u0173\u0001\u0000"+
		"\u0000\u0000,\u0187\u0001\u0000\u0000\u0000.\u018e\u0001\u0000\u0000\u0000"+
		"0\u0198\u0001\u0000\u0000\u00002\u019a\u0001\u0000\u0000\u00004\u01a1"+
		"\u0001\u0000\u0000\u00006\u01a6\u0001\u0000\u0000\u00008\u01ab\u0001\u0000"+
		"\u0000\u0000:\u01b0\u0001\u0000\u0000\u0000<\u01c0\u0001\u0000\u0000\u0000"+
		">\u01f0\u0001\u0000\u0000\u0000@\u01f2\u0001\u0000\u0000\u0000B\u01f4"+
		"\u0001\u0000\u0000\u0000D\u01f7\u0001\u0000\u0000\u0000F\u01fa\u0001\u0000"+
		"\u0000\u0000H\u02a3\u0001\u0000\u0000\u0000J\u02a5\u0001\u0000\u0000\u0000"+
		"L\u0357\u0001\u0000\u0000\u0000N\u0365\u0001\u0000\u0000\u0000P\u0373"+
		"\u0001\u0000\u0000\u0000R\u0375\u0001\u0000\u0000\u0000T\u03b3\u0001\u0000"+
		"\u0000\u0000V\u03b5\u0001\u0000\u0000\u0000X\u03b9\u0001\u0000\u0000\u0000"+
		"Z\u03d1\u0001\u0000\u0000\u0000\\^\u0003\u0002\u0001\u0000]\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`\u0001\u0001\u0000\u0000\u0000ab\u0003\u0004\u0002"+
		"\u0000bc\u0005\u00be\u0000\u0000ck\u0001\u0000\u0000\u0000dk\u0003\u0012"+
		"\t\u0000ek\u0003\u001a\r\u0000fk\u0003\u001e\u000f\u0000gk\u0003\"\u0011"+
		"\u0000hk\u0003$\u0012\u0000ik\u0003R)\u0000ja\u0001\u0000\u0000\u0000"+
		"jd\u0001\u0000\u0000\u0000je\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000"+
		"\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000"+
		"\u0000\u0000k\u0003\u0001\u0000\u0000\u0000l}\u0003*\u0015\u0000m}\u0003"+
		",\u0016\u0000n}\u00032\u0019\u0000o}\u0003B!\u0000p}\u0003D\"\u0000q}"+
		"\u0003F#\u0000r}\u00034\u001a\u0000s}\u00036\u001b\u0000t}\u00038\u001c"+
		"\u0000u}\u0003:\u001d\u0000v}\u0003<\u001e\u0000w}\u0003>\u001f\u0000"+
		"x}\u0003&\u0013\u0000y}\u0003(\u0014\u0000z}\u0003J%\u0000{}\u0003\u0006"+
		"\u0003\u0000|l\u0001\u0000\u0000\u0000|m\u0001\u0000\u0000\u0000|n\u0001"+
		"\u0000\u0000\u0000|o\u0001\u0000\u0000\u0000|p\u0001\u0000\u0000\u0000"+
		"|q\u0001\u0000\u0000\u0000|r\u0001\u0000\u0000\u0000|s\u0001\u0000\u0000"+
		"\u0000|t\u0001\u0000\u0000\u0000|u\u0001\u0000\u0000\u0000|v\u0001\u0000"+
		"\u0000\u0000|w\u0001\u0000\u0000\u0000|x\u0001\u0000\u0000\u0000|y\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000"+
		"}\u0005\u0001\u0000\u0000\u0000~\u0083\u0003\b\u0004\u0000\u007f\u0080"+
		"\u0007\u0000\u0000\u0000\u0080\u0082\u0003\b\u0004\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0007\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0089\u0003"+
		"\n\u0005\u0000\u0087\u0088\u0007\u0001\u0000\u0000\u0088\u008a\u0003\n"+
		"\u0005\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\t\u0001\u0000\u0000\u0000\u008b\u008d\u0007\u0002\u0000"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0093\u0003\f\u0006\u0000"+
		"\u008f\u0090\u0007\u0002\u0000\u0000\u0090\u0092\u0003\f\u0006\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u000b\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096"+
		"\u009b\u0003\u000e\u0007\u0000\u0097\u0098\u0007\u0003\u0000\u0000\u0098"+
		"\u009a\u0003\u000e\u0007\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a"+
		"\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\r\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0004\u0000\u0000\u009f\u00d7"+
		"\u0003\u000e\u0007\u0000\u00a0\u00d7\u0005\u00c2\u0000\u0000\u00a1\u00d7"+
		"\u0005\u00c3\u0000\u0000\u00a2\u00d7\u0005?\u0000\u0000\u00a3\u00a8\u0005"+
		"\u00bf\u0000\u0000\u00a4\u00a5\u0005\u00be\u0000\u0000\u00a5\u00a9\u0005"+
		"i\u0000\u0000\u00a6\u00a7\u0005\u00be\u0000\u0000\u00a7\u00a9\u0005h\u0000"+
		"\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00d7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00af\u0005\u00bf\u0000\u0000\u00ab\u00ac\u0005\u0001\u0000"+
		"\u0000\u00ac\u00ad\u0003\u0006\u0003\u0000\u00ad\u00ae\u0005\u0002\u0000"+
		"\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ab\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0005\u00be\u0000\u0000\u00b4\u00b8\u0005i\u0000\u0000"+
		"\u00b5\u00b6\u0005\u00be\u0000\u0000\u00b6\u00b8\u0005h\u0000\u0000\u00b7"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b8\u00d7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005\u00bf\u0000\u0000\u00ba\u00bb\u0005\u0003\u0000\u0000\u00bb"+
		"\u00bc\u0003\u0006\u0003\u0000\u00bc\u00c1\u0005\u0004\u0000\u0000\u00bd"+
		"\u00be\u0005\u00be\u0000\u0000\u00be\u00c2\u0005i\u0000\u0000\u00bf\u00c0"+
		"\u0005\u00be\u0000\u0000\u00c0\u00c2\u0005h\u0000\u0000\u00c1\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c2\u00d7\u0001\u0000\u0000\u0000\u00c3\u00c6\u0005"+
		"\u00bf\u0000\u0000\u00c4\u00c5\u0005\u00be\u0000\u0000\u00c5\u00c7\u0005"+
		"\u00c1\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00d7\u0001\u0000\u0000\u0000\u00ca\u00d7\u0005"+
		"\u00c5\u0000\u0000\u00cb\u00d7\u0005\u00c6\u0000\u0000\u00cc\u00d7\u0007"+
		"\u0005\u0000\u0000\u00cd\u00d7\u00030\u0018\u0000\u00ce\u00d7\u0003H$"+
		"\u0000\u00cf\u00d7\u0003V+\u0000\u00d0\u00d7\u0003X,\u0000\u00d1\u00d7"+
		"\u0003 \u0010\u0000\u00d2\u00d3\u0005\u0005\u0000\u0000\u00d3\u00d4\u0003"+
		"\u0006\u0003\u0000\u00d4\u00d5\u0005\u0006\u0000\u0000\u00d5\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d6\u009e\u0001\u0000\u0000\u0000\u00d6\u00a0\u0001"+
		"\u0000\u0000\u0000\u00d6\u00a1\u0001\u0000\u0000\u0000\u00d6\u00a2\u0001"+
		"\u0000\u0000\u0000\u00d6\u00a3\u0001\u0000\u0000\u0000\u00d6\u00aa\u0001"+
		"\u0000\u0000\u0000\u00d6\u00b9\u0001\u0000\u0000\u0000\u00d6\u00c3\u0001"+
		"\u0000\u0000\u0000\u00d6\u00ca\u0001\u0000\u0000\u0000\u00d6\u00cb\u0001"+
		"\u0000\u0000\u0000\u00d6\u00cc\u0001\u0000\u0000\u0000\u00d6\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d6\u00ce\u0001\u0000\u0000\u0000\u00d6\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d0\u0001\u0000\u0000\u0000\u00d6\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d7\u000f\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0003\u0006\u0003\u0000\u00d9\u0011\u0001"+
		"\u0000\u0000\u0000\u00da\u00de\u0003\u0014\n\u0000\u00db\u00dd\u0003\u0016"+
		"\u000b\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000"+
		"\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e3\u0003\u0018\f\u0000\u00e2\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u0013\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0005K\u0000\u0000\u00e5\u00e6\u0003\u0010\b\u0000"+
		"\u00e6\u00e7\u0005\'\u0000\u0000\u00e7\u00e9\u0005\u0003\u0000\u0000\u00e8"+
		"\u00ea\u0003\u0002\u0001\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005\u0004\u0000\u0000\u00ee\u0015\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0005L\u0000\u0000\u00f0\u00f1\u0005K\u0000\u0000\u00f1\u00f2\u0003"+
		"\u0010\b\u0000\u00f2\u00f3\u0005\'\u0000\u0000\u00f3\u00f5\u0005\u0003"+
		"\u0000\u0000\u00f4\u00f6\u0003\u0002\u0001\u0000\u00f5\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0005\u0004\u0000\u0000\u00fa\u0017\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0005L\u0000\u0000\u00fc\u00fe\u0005\u0003\u0000"+
		"\u0000\u00fd\u00ff\u0003\u0002\u0001\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0005\u0004\u0000\u0000\u0103\u0019\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0005S\u0000\u0000\u0105\u0106\u0005\u00bf\u0000\u0000"+
		"\u0106\u0108\u0005\u0003\u0000\u0000\u0107\u0109\u0003\u001c\u000e\u0000"+
		"\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000"+
		"\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u0113\u0001\u0000\u0000\u0000\u010c\u010d\u0005<\u0000\u0000\u010d"+
		"\u010f\u0005\u0007\u0000\u0000\u010e\u0110\u0003\u0002\u0001\u0000\u010f"+
		"\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111"+
		"\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0114\u0001\u0000\u0000\u0000\u0113\u010c\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0005\u0004\u0000\u0000\u0116\u001b\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0005(\u0000\u0000\u0118\u0119\u0007\u0006\u0000\u0000\u0119\u011b"+
		"\u0005\u0007\u0000\u0000\u011a\u011c\u0003\u0002\u0001\u0000\u011b\u011a"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011b"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u001d"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0005H\u0000\u0000\u0120\u0121\u0003"+
		"\u0006\u0003\u0000\u0121\u0122\u0007\u0007\u0000\u0000\u0122\u0124\u0005"+
		"\u0003\u0000\u0000\u0123\u0125\u0003\u0002\u0001\u0000\u0124\u0123\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0124\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0005\u0004\u0000\u0000\u0129\u001f\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0005I\u0000\u0000\u012b!\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0005&\u0000\u0000\u012d\u012f\u0003\u0010\b\u0000"+
		"\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0148\u0005H\u0000\u0000\u0131"+
		"\u0132\u0007\b\u0000\u0000\u0132\u0135\u0005\u00bf\u0000\u0000\u0133\u0134"+
		"\u0005$\u0000\u0000\u0134\u0136\u0003\u0006\u0003\u0000\u0135\u0133\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0149\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0005N\u0000\u0000\u0138\u0139\u0005\u00bf"+
		"\u0000\u0000\u0139\u013a\u0005\u0011\u0000\u0000\u013a\u0149\u0003\u0006"+
		"\u0003\u0000\u013b\u013c\u00059\u0000\u0000\u013c\u013d\u0005\u00bf\u0000"+
		"\u0000\u013d\u013e\u0005B\u0000\u0000\u013e\u0149\u0003\u0006\u0003\u0000"+
		"\u013f\u0140\u0005!\u0000\u0000\u0140\u0141\u0005\u00bf\u0000\u0000\u0141"+
		"\u0142\u0005B\u0000\u0000\u0142\u0149\u0003\u0006\u0003\u0000\u0143\u0144"+
		"\u0005O\u0000\u0000\u0144\u0145\u0003\u0006\u0003\u0000\u0145\u0146\u0005"+
		"\u001c\u0000\u0000\u0146\u0147\u0005\u00bf\u0000\u0000\u0147\u0149\u0001"+
		"\u0000\u0000\u0000\u0148\u0131\u0001\u0000\u0000\u0000\u0148\u0137\u0001"+
		"\u0000\u0000\u0000\u0148\u013b\u0001\u0000\u0000\u0000\u0148\u013f\u0001"+
		"\u0000\u0000\u0000\u0148\u0143\u0001\u0000\u0000\u0000\u0148\u0149\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014c\u0005"+
		"\u0003\u0000\u0000\u014b\u014d\u0003\u0002\u0001\u0000\u014c\u014b\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014c\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0005\u0004\u0000\u0000\u0151#\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0005=\u0000\u0000\u0153\u0154\u0005\r\u0000"+
		"\u0000\u0154\u0155\u0005\u00bf\u0000\u0000\u0155\u0156\u0005$\u0000\u0000"+
		"\u0156\u0157\u0003\u0006\u0003\u0000\u0157\u0158\u0005H\u0000\u0000\u0158"+
		"\u015a\u0005\u0003\u0000\u0000\u0159\u015b\u0003\u0002\u0001\u0000\u015a"+
		"\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c"+
		"\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u0004\u0000\u0000\u015f"+
		"%\u0001\u0000\u0000\u0000\u0160\u0161\u0005>\u0000\u0000\u0161\'\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0005\u0012\u0000\u0000\u0163)\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0005T\u0000\u0000\u0165\u0166\u0005=\u0000\u0000"+
		"\u0166\u0169\u0007\t\u0000\u0000\u0167\u0168\u0005$\u0000\u0000\u0168"+
		"\u016a\u0003\u0006\u0003\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0001\u0000\u0000\u0000\u016a\u0174\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0005T\u0000\u0000\u016c\u016d\u0005=\u0000\u0000\u016d\u016e\u0005"+
		"\u0005\u0000\u0000\u016e\u016f\u0003\u0006\u0003\u0000\u016f\u0170\u0005"+
		"\b\u0000\u0000\u0170\u0171\u0003\u0006\u0003\u0000\u0171\u0172\u0005\u0006"+
		"\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0164\u0001\u0000"+
		"\u0000\u0000\u0173\u016b\u0001\u0000\u0000\u0000\u0174+\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0005R\u0000\u0000\u0176\u0177\u0005\u0014\u0000\u0000"+
		"\u0177\u0178\u0005\"\u0000\u0000\u0178\u0179\u0005@\u0000\u0000\u0179"+
		"\u017a\u0005=\u0000\u0000\u017a\u0188\u0003.\u0017\u0000\u017b\u017c\u0005"+
		"R\u0000\u0000\u017c\u017d\u0005\u0014\u0000\u0000\u017d\u017e\u0005\""+
		"\u0000\u0000\u017e\u017f\u0005D\u0000\u0000\u017f\u0180\u0005=\u0000\u0000"+
		"\u0180\u0188\u0003.\u0017\u0000\u0181\u0182\u0005R\u0000\u0000\u0182\u0183"+
		"\u0005\u0014\u0000\u0000\u0183\u0184\u0005\"\u0000\u0000\u0184\u0185\u0005"+
		".\u0000\u0000\u0185\u0186\u0005=\u0000\u0000\u0186\u0188\u0003.\u0017"+
		"\u0000\u0187\u0175\u0001\u0000\u0000\u0000\u0187\u017b\u0001\u0000\u0000"+
		"\u0000\u0187\u0181\u0001\u0000\u0000\u0000\u0188-\u0001\u0000\u0000\u0000"+
		"\u0189\u018c\u00030\u0018\u0000\u018a\u018c\u0003\u0006\u0003\u0000\u018b"+
		"\u0189\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c"+
		"\u018f\u0001\u0000\u0000\u0000\u018d\u018f\u0007\n\u0000\u0000\u018e\u018b"+
		"\u0001\u0000\u0000\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u0196"+
		"\u0001\u0000\u0000\u0000\u0190\u0191\u0003\u0006\u0003\u0000\u0191\u0192"+
		"\u0007\u0007\u0000\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193\u0190"+
		"\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0001\u0000\u0000\u0000\u0195\u0197\u0007\u000b\u0000\u0000\u0196\u0193"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197/\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0005\u00c4\u0000\u0000\u01991\u0001\u0000"+
		"\u0000\u0000\u019a\u019f\u0005/\u0000\u0000\u019b\u019c\u0005$\u0000\u0000"+
		"\u019c\u019d\u0003\u0006\u0003\u0000\u019d\u019e\u00050\u0000\u0000\u019e"+
		"\u01a0\u0001\u0000\u0000\u0000\u019f\u019b\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a03\u0001\u0000\u0000\u0000\u01a1\u01a4"+
		"\u0005%\u0000\u0000\u01a2\u01a3\u0005$\u0000\u0000\u01a3\u01a5\u0003\u0006"+
		"\u0003\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a55\u0001\u0000\u0000\u0000\u01a6\u01a9\u0005\u001d\u0000"+
		"\u0000\u01a7\u01a8\u0005$\u0000\u0000\u01a8\u01aa\u0003\u0006\u0003\u0000"+
		"\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000"+
		"\u01aa7\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005R\u0000\u0000\u01ac\u01ad"+
		"\u00051\u0000\u0000\u01ad\u01ae\u0005=\u0000\u0000\u01ae\u01af\u0003\u0006"+
		"\u0003\u0000\u01af9\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005)\u0000\u0000"+
		"\u01b1\u01be\u0003\u0006\u0003\u0000\u01b2\u01b3\u0005F\u0000\u0000\u01b3"+
		"\u01b5\u00057\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u0005:\u0000\u0000\u01b7\u01bf\u0005J\u0000\u0000\u01b8\u01b9\u0005F"+
		"\u0000\u0000\u01b9\u01bb\u00057\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bd\u0005;\u0000\u0000\u01bd\u01bf\u0005\u001f\u0000\u0000"+
		"\u01be\u01b4\u0001\u0000\u0000\u0000\u01be\u01ba\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf;\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u00054\u0000\u0000\u01c1\u01c2\u0005\u00bf\u0000\u0000\u01c2=\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c4\u0005\u00bf\u0000\u0000\u01c4\u01c7\u0007"+
		"\f\u0000\u0000\u01c5\u01c8\u0003\u0006\u0003\u0000\u01c6\u01c8\u0003Z"+
		"-\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c8\u01f1\u0001\u0000\u0000\u0000\u01c9\u01ce\u0005\u00bf\u0000"+
		"\u0000\u01ca\u01cb\u0005\u0001\u0000\u0000\u01cb\u01cc\u0003@ \u0000\u01cc"+
		"\u01cd\u0005\u0002\u0000\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce"+
		"\u01ca\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d5\u0007\f\u0000\u0000\u01d3\u01d6"+
		"\u0003\u0006\u0003\u0000\u01d4\u01d6\u0003Z-\u0000\u01d5\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6\u01f1\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\u0005\u00bf\u0000\u0000\u01d8\u01d9\u0005\u0003"+
		"\u0000\u0000\u01d9\u01da\u0003@ \u0000\u01da\u01db\u0005\u0004\u0000\u0000"+
		"\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01df\u0007\f\u0000\u0000\u01dd"+
		"\u01e0\u0003\u0006\u0003\u0000\u01de\u01e0\u0003Z-\u0000\u01df\u01dd\u0001"+
		"\u0000\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0\u01f1\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0005\u00bf\u0000\u0000\u01e2\u01e3\u0007"+
		"\r\u0000\u0000\u01e3\u01f1\u0003\u0006\u0003\u0000\u01e4\u01e5\u0005\u00bf"+
		"\u0000\u0000\u01e5\u01e6\u0007\u000e\u0000\u0000\u01e6\u01f1\u0003\u0006"+
		"\u0003\u0000\u01e7\u01e8\u0005\u00bf\u0000\u0000\u01e8\u01e9\u0007\u000f"+
		"\u0000\u0000\u01e9\u01f1\u0003\u0006\u0003\u0000\u01ea\u01eb\u0005\u00bf"+
		"\u0000\u0000\u01eb\u01ec\u0007\u0010\u0000\u0000\u01ec\u01f1\u0003\u0006"+
		"\u0003\u0000\u01ed\u01ee\u0005\u00bf\u0000\u0000\u01ee\u01ef\u0007\u0011"+
		"\u0000\u0000\u01ef\u01f1\u0003\u0006\u0003\u0000\u01f0\u01c3\u0001\u0000"+
		"\u0000\u0000\u01f0\u01c9\u0001\u0000\u0000\u0000\u01f0\u01d7\u0001\u0000"+
		"\u0000\u0000\u01f0\u01e1\u0001\u0000\u0000\u0000\u01f0\u01e4\u0001\u0000"+
		"\u0000\u0000\u01f0\u01e7\u0001\u0000\u0000\u0000\u01f0\u01ea\u0001\u0000"+
		"\u0000\u0000\u01f0\u01ed\u0001\u0000\u0000\u0000\u01f1?\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0003\u0006\u0003\u0000\u01f3A\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f5\u0005\t\u0000\u0000\u01f5\u01f6\u0005@\u0000\u0000\u01f6"+
		"C\u0001\u0000\u0000\u0000\u01f7\u01f8\u00055\u0000\u0000\u01f8\u01f9\u0005"+
		"@\u0000\u0000\u01f9E\u0001\u0000\u0000\u0000\u01fa\u01fb\u00056\u0000"+
		"\u0000\u01fbG\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005\u0085\u0000\u0000"+
		"\u01fd\u01fe\u0005\u0005\u0000\u0000\u01fe\u01ff\u0003\u0006\u0003\u0000"+
		"\u01ff\u0200\u0005\u0006\u0000\u0000\u0200\u02a4\u0001\u0000\u0000\u0000"+
		"\u0201\u0202\u0005}\u0000\u0000\u0202\u0203\u0005\u0005\u0000\u0000\u0203"+
		"\u0204\u0003\u0006\u0003\u0000\u0204\u0205\u0005\u0006\u0000\u0000\u0205"+
		"\u02a4\u0001\u0000\u0000\u0000\u0206\u0207\u0005|\u0000\u0000\u0207\u0208"+
		"\u0005\u0005\u0000\u0000\u0208\u0209\u0003\u0006\u0003\u0000\u0209\u020a"+
		"\u0005\u0006\u0000\u0000\u020a\u02a4\u0001\u0000\u0000\u0000\u020b\u020c"+
		"\u0005~\u0000\u0000\u020c\u020d\u0005\u0005\u0000\u0000\u020d\u020e\u0003"+
		"\u0006\u0003\u0000\u020e\u020f\u0005\b\u0000\u0000\u020f\u0210\u0003\u0006"+
		"\u0003\u0000\u0210\u0211\u0005\u0006\u0000\u0000\u0211\u02a4\u0001\u0000"+
		"\u0000\u0000\u0212\u0213\u0005z\u0000\u0000\u0213\u0214\u0005\u0005\u0000"+
		"\u0000\u0214\u0215\u0003\u0006\u0003\u0000\u0215\u0216\u0005\b\u0000\u0000"+
		"\u0216\u0217\u0003\u0006\u0003\u0000\u0217\u0218\u0005\u0006\u0000\u0000"+
		"\u0218\u02a4\u0001\u0000\u0000\u0000\u0219\u021a\u0005t\u0000\u0000\u021a"+
		"\u021b\u0005\u0005\u0000\u0000\u021b\u021c\u0003\u0006\u0003\u0000\u021c"+
		"\u021d\u0005\b\u0000\u0000\u021d\u021e\u0003\u0006\u0003\u0000\u021e\u021f"+
		"\u0005\u0006\u0000\u0000\u021f\u02a4\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0005o\u0000\u0000\u0221\u0222\u0005\u0005\u0000\u0000\u0222\u0223\u0003"+
		"\u0006\u0003\u0000\u0223\u0224\u0005\u0006\u0000\u0000\u0224\u02a4\u0001"+
		"\u0000\u0000\u0000\u0225\u0226\u0005\u0084\u0000\u0000\u0226\u0227\u0005"+
		"\u0005\u0000\u0000\u0227\u0228\u0003\u0006\u0003\u0000\u0228\u0229\u0005"+
		"\u0006\u0000\u0000\u0229\u02a4\u0001\u0000\u0000\u0000\u022a\u022b\u0005"+
		"k\u0000\u0000\u022b\u0231\u0005\u0005\u0000\u0000\u022c\u0232\u0003\u0006"+
		"\u0003\u0000\u022d\u022e\u0003\u0006\u0003\u0000\u022e\u022f\u0005\b\u0000"+
		"\u0000\u022f\u0230\u0003\u0006\u0003\u0000\u0230\u0232\u0001\u0000\u0000"+
		"\u0000\u0231\u022c\u0001\u0000\u0000\u0000\u0231\u022d\u0001\u0000\u0000"+
		"\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u0005\u0006\u0000"+
		"\u0000\u0234\u02a4\u0001\u0000\u0000\u0000\u0235\u0236\u0005x\u0000\u0000"+
		"\u0236\u0237\u0005\u0005\u0000\u0000\u0237\u0238\u0003\u0006\u0003\u0000"+
		"\u0238\u0239\u0005\b\u0000\u0000\u0239\u023a\u0003\u0006\u0003\u0000\u023a"+
		"\u023b\u0005\u0006\u0000\u0000\u023b\u02a4\u0001\u0000\u0000\u0000\u023c"+
		"\u023d\u0005w\u0000\u0000\u023d\u023e\u0005\u0005\u0000\u0000\u023e\u023f"+
		"\u0003\u0006\u0003\u0000\u023f\u0240\u0005\b\u0000\u0000\u0240\u0241\u0003"+
		"\u0006\u0003\u0000\u0241\u0242\u0005\u0006\u0000\u0000\u0242\u02a4\u0001"+
		"\u0000\u0000\u0000\u0243\u0244\u0005y\u0000\u0000\u0244\u024a\u0005\u0005"+
		"\u0000\u0000\u0245\u024b\u0003\u0006\u0003\u0000\u0246\u0247\u0003\u0006"+
		"\u0003\u0000\u0247\u0248\u0005\b\u0000\u0000\u0248\u0249\u0003\u0006\u0003"+
		"\u0000\u0249\u024b\u0001\u0000\u0000\u0000\u024a\u0245\u0001\u0000\u0000"+
		"\u0000\u024a\u0246\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000"+
		"\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u02a4\u0005\u0006\u0000"+
		"\u0000\u024d\u024e\u0005\u007f\u0000\u0000\u024e\u024f\u0005\u0005\u0000"+
		"\u0000\u024f\u0250\u0003\u0006\u0003\u0000\u0250\u0251\u0005\u0006\u0000"+
		"\u0000\u0251\u02a4\u0001\u0000\u0000\u0000\u0252\u0253\u0005\u0081\u0000"+
		"\u0000\u0253\u0254\u0005\u0005\u0000\u0000\u0254\u0255\u0003\u0006\u0003"+
		"\u0000\u0255\u0256\u0005\u0006\u0000\u0000\u0256\u02a4\u0001\u0000\u0000"+
		"\u0000\u0257\u0258\u0005q\u0000\u0000\u0258\u0259\u0005\u0005\u0000\u0000"+
		"\u0259\u025a\u0003\u0006\u0003\u0000\u025a\u025b\u0005\u0006\u0000\u0000"+
		"\u025b\u02a4\u0001\u0000\u0000\u0000\u025c\u025d\u0005\u0082\u0000\u0000"+
		"\u025d\u025e\u0005\u0005\u0000\u0000\u025e\u025f\u0003\u0006\u0003\u0000"+
		"\u025f\u0260\u0005\u0006\u0000\u0000\u0260\u02a4\u0001\u0000\u0000\u0000"+
		"\u0261\u0262\u0005l\u0000\u0000\u0262\u0263\u0005\u0005\u0000\u0000\u0263"+
		"\u0264\u0003\u0006\u0003\u0000\u0264\u0265\u0005\u0006\u0000\u0000\u0265"+
		"\u02a4\u0001\u0000\u0000\u0000\u0266\u0267\u0005j\u0000\u0000\u0267\u0268"+
		"\u0005\u0005\u0000\u0000\u0268\u0269\u0003\u0006\u0003\u0000\u0269\u026a"+
		"\u0005\u0006\u0000\u0000\u026a\u02a4\u0001\u0000\u0000\u0000\u026b\u026c"+
		"\u0005m\u0000\u0000\u026c\u026d\u0005\u0005\u0000\u0000\u026d\u026e\u0003"+
		"\u0006\u0003\u0000\u026e\u026f\u0005\u0006\u0000\u0000\u026f\u02a4\u0001"+
		"\u0000\u0000\u0000\u0270\u0271\u0005n\u0000\u0000\u0271\u0272\u0005\u0005"+
		"\u0000\u0000\u0272\u0273\u0003\u0006\u0003\u0000\u0273\u0274\u0005\b\u0000"+
		"\u0000\u0274\u0275\u0003\u0006\u0003\u0000\u0275\u0276\u0005\u0006\u0000"+
		"\u0000\u0276\u02a4\u0001\u0000\u0000\u0000\u0277\u0278\u0005\u0080\u0000"+
		"\u0000\u0278\u0279\u0005\u0005\u0000\u0000\u0279\u027a\u0003\u0006\u0003"+
		"\u0000\u027a\u027b\u0005\u0006\u0000\u0000\u027b\u02a4\u0001\u0000\u0000"+
		"\u0000\u027c\u027d\u0005p\u0000\u0000\u027d\u027e\u0005\u0005\u0000\u0000"+
		"\u027e\u027f\u0003\u0006\u0003\u0000\u027f\u0280\u0005\u0006\u0000\u0000"+
		"\u0280\u02a4\u0001\u0000\u0000\u0000\u0281\u0282\u0005\u0083\u0000\u0000"+
		"\u0282\u0283\u0005\u0005\u0000\u0000\u0283\u0284\u0003\u0006\u0003\u0000"+
		"\u0284\u0285\u0005\u0006\u0000\u0000\u0285\u02a4\u0001\u0000\u0000\u0000"+
		"\u0286\u0287\u0005v\u0000\u0000\u0287\u028d\u0005\u0005\u0000\u0000\u0288"+
		"\u028e\u0003\u0006\u0003\u0000\u0289\u028a\u0003\u0006\u0003\u0000\u028a"+
		"\u028b\u0005\b\u0000\u0000\u028b\u028c\u0003\u0006\u0003\u0000\u028c\u028e"+
		"\u0001\u0000\u0000\u0000\u028d\u0288\u0001\u0000\u0000\u0000\u028d\u0289"+
		"\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0290"+
		"\u0005\u0006\u0000\u0000\u0290\u02a4\u0001\u0000\u0000\u0000\u0291\u0292"+
		"\u0005s\u0000\u0000\u0292\u0293\u0005\u0005\u0000\u0000\u0293\u0294\u0003"+
		"\u0006\u0003\u0000\u0294\u0295\u0005\u0006\u0000\u0000\u0295\u02a4\u0001"+
		"\u0000\u0000\u0000\u0296\u0297\u0005{\u0000\u0000\u0297\u0298\u0005\u0005"+
		"\u0000\u0000\u0298\u0299\u0003\u0006\u0003\u0000\u0299\u029a\u0005\u0006"+
		"\u0000\u0000\u029a\u02a4\u0001\u0000\u0000\u0000\u029b\u029c\u0005u\u0000"+
		"\u0000\u029c\u029d\u0005\u0005\u0000\u0000\u029d\u029e\u0005\u00bf\u0000"+
		"\u0000\u029e\u02a4\u0005\u0006\u0000\u0000\u029f\u02a0\u0005r\u0000\u0000"+
		"\u02a0\u02a1\u0005\u0005\u0000\u0000\u02a1\u02a2\u0005\u00bf\u0000\u0000"+
		"\u02a2\u02a4\u0005\u0006\u0000\u0000\u02a3\u01fc\u0001\u0000\u0000\u0000"+
		"\u02a3\u0201\u0001\u0000\u0000\u0000\u02a3\u0206\u0001\u0000\u0000\u0000"+
		"\u02a3\u020b\u0001\u0000\u0000\u0000\u02a3\u0212\u0001\u0000\u0000\u0000"+
		"\u02a3\u0219\u0001\u0000\u0000\u0000\u02a3\u0220\u0001\u0000\u0000\u0000"+
		"\u02a3\u0225\u0001\u0000\u0000\u0000\u02a3\u022a\u0001\u0000\u0000\u0000"+
		"\u02a3\u0235\u0001\u0000\u0000\u0000\u02a3\u023c\u0001\u0000\u0000\u0000"+
		"\u02a3\u0243\u0001\u0000\u0000\u0000\u02a3\u024d\u0001\u0000\u0000\u0000"+
		"\u02a3\u0252\u0001\u0000\u0000\u0000\u02a3\u0257\u0001\u0000\u0000\u0000"+
		"\u02a3\u025c\u0001\u0000\u0000\u0000\u02a3\u0261\u0001\u0000\u0000\u0000"+
		"\u02a3\u0266\u0001\u0000\u0000\u0000\u02a3\u026b\u0001\u0000\u0000\u0000"+
		"\u02a3\u0270\u0001\u0000\u0000\u0000\u02a3\u0277\u0001\u0000\u0000\u0000"+
		"\u02a3\u027c\u0001\u0000\u0000\u0000\u02a3\u0281\u0001\u0000\u0000\u0000"+
		"\u02a3\u0286\u0001\u0000\u0000\u0000\u02a3\u0291\u0001\u0000\u0000\u0000"+
		"\u02a3\u0296\u0001\u0000\u0000\u0000\u02a3\u029b\u0001\u0000\u0000\u0000"+
		"\u02a3\u029f\u0001\u0000\u0000\u0000\u02a4I\u0001\u0000\u0000\u0000\u02a5"+
		"\u02a6\u0005\u001e\u0000\u0000\u02a6\u02a7\u0003L&\u0000\u02a7K\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a9\u0005\u0090\u0000\u0000\u02a9\u02aa\u0005"+
		"\u0005\u0000\u0000\u02aa\u02ab\u0003\u0006\u0003\u0000\u02ab\u02ac\u0005"+
		"\b\u0000\u0000\u02ac\u02ad\u0003\u0006\u0003\u0000\u02ad\u02ae\u0005\b"+
		"\u0000\u0000\u02ae\u02af\u0003\u0006\u0003\u0000\u02af\u02b0\u0005\b\u0000"+
		"\u0000\u02b0\u02b1\u0003\u0006\u0003\u0000\u02b1\u02b2\u0005\u0006\u0000"+
		"\u0000\u02b2\u0358\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005\u008e\u0000"+
		"\u0000\u02b4\u02b5\u0005\u0005\u0000\u0000\u02b5\u02b6\u0003\u0006\u0003"+
		"\u0000\u02b6\u02b7\u0005\b\u0000\u0000\u02b7\u02b8\u0003\u0006\u0003\u0000"+
		"\u02b8\u02b9\u0005\b\u0000\u0000\u02b9\u02ba\u0003\u0006\u0003\u0000\u02ba"+
		"\u02bc\u0005\u0006\u0000\u0000\u02bb\u02bd\u0003N\'\u0000\u02bc\u02bb"+
		"\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u0358"+
		"\u0001\u0000\u0000\u0000\u02be\u02bf\u0005\u008f\u0000\u0000\u02bf\u02c0"+
		"\u0005\u0005\u0000\u0000\u02c0\u02c1\u0003\u0006\u0003\u0000\u02c1\u02c2"+
		"\u0005\b\u0000\u0000\u02c2\u02c3\u0003\u0006\u0003\u0000\u02c3\u02c4\u0005"+
		"\b\u0000\u0000\u02c4\u02c5\u0003\u0006\u0003\u0000\u02c5\u02c6\u0005\b"+
		"\u0000\u0000\u02c6\u02c7\u0003\u0006\u0003\u0000\u02c7\u02c9\u0005\u0006"+
		"\u0000\u0000\u02c8\u02ca\u0003N\'\u0000\u02c9\u02c8\u0001\u0000\u0000"+
		"\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u0358\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cc\u0005\u0088\u0000\u0000\u02cc\u02cd\u0005\u0005\u0000"+
		"\u0000\u02cd\u02ce\u0003\u0006\u0003\u0000\u02ce\u02cf\u0005\b\u0000\u0000"+
		"\u02cf\u02d0\u0003\u0006\u0003\u0000\u02d0\u02d1\u0005\b\u0000\u0000\u02d1"+
		"\u02d2\u0003\u0006\u0003\u0000\u02d2\u02d4\u0005\u0006\u0000\u0000\u02d3"+
		"\u02d5\u0003N\'\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d4\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d5\u0358\u0001\u0000\u0000\u0000\u02d6\u02d7"+
		"\u0005\u008a\u0000\u0000\u02d7\u02d8\u0005\u0005\u0000\u0000\u02d8\u02d9"+
		"\u0003\u0006\u0003\u0000\u02d9\u02da\u0005\b\u0000\u0000\u02da\u02db\u0003"+
		"\u0006\u0003\u0000\u02db\u02dc\u0005\b\u0000\u0000\u02dc\u02dd\u0003\u0006"+
		"\u0003\u0000\u02dd\u02de\u0005\b\u0000\u0000\u02de\u02df\u0003\u0006\u0003"+
		"\u0000\u02df\u02e1\u0005\u0006\u0000\u0000\u02e0\u02e2\u0003P(\u0000\u02e1"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2"+
		"\u0358\u0001\u0000\u0000\u0000\u02e3\u02e4\u0005\u0086\u0000\u0000\u02e4"+
		"\u02e5\u0005\u0005\u0000\u0000\u02e5\u02e6\u0003\u0006\u0003\u0000\u02e6"+
		"\u02e7\u0005\b\u0000\u0000\u02e7\u02e8\u0003\u0006\u0003\u0000\u02e8\u02e9"+
		"\u0005\b\u0000\u0000\u02e9\u02ea\u0003\u0006\u0003\u0000\u02ea\u02eb\u0005"+
		"\b\u0000\u0000\u02eb\u02ec\u0003\u0006\u0003\u0000\u02ec\u02ed\u0005\b"+
		"\u0000\u0000\u02ed\u02ee\u0003\u0006\u0003\u0000\u02ee\u02ef\u0005\b\u0000"+
		"\u0000\u02ef\u02f2\u0003\u0006\u0003\u0000\u02f0\u02f1\u0005\b\u0000\u0000"+
		"\u02f1\u02f3\u0007\u0012\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000"+
		"\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000"+
		"\u02f4\u02f6\u0005\u0006\u0000\u0000\u02f5\u02f7\u0003N\'\u0000\u02f6"+
		"\u02f5\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7"+
		"\u0358\u0001\u0000\u0000\u0000\u02f8\u02f9\u0005\u008d\u0000\u0000\u02f9"+
		"\u02fa\u0005\u0005\u0000\u0000\u02fa\u02fb\u0003\u0006\u0003\u0000\u02fb"+
		"\u02fc\u0005\b\u0000\u0000\u02fc\u02fd\u0003\u0006\u0003\u0000\u02fd\u02fe"+
		"\u0005\b\u0000\u0000\u02fe\u02ff\u0003\u0006\u0003\u0000\u02ff\u0300\u0005"+
		"\b\u0000\u0000\u0300\u0301\u0003\u0006\u0003\u0000\u0301\u0302\u0005\b"+
		"\u0000\u0000\u0302\u0303\u0003\u0006\u0003\u0000\u0303\u0305\u0005\u0006"+
		"\u0000\u0000\u0304\u0306\u0003N\'\u0000\u0305\u0304\u0001\u0000\u0000"+
		"\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0358\u0001\u0000\u0000"+
		"\u0000\u0307\u0308\u0005\u008b\u0000\u0000\u0308\u0309\u0005\u0005\u0000"+
		"\u0000\u0309\u030a\u0003\u0006\u0003\u0000\u030a\u030b\u0005\b\u0000\u0000"+
		"\u030b\u030c\u0003\u0006\u0003\u0000\u030c\u030d\u0005\b\u0000\u0000\u030d"+
		"\u030e\u0003\u0006\u0003\u0000\u030e\u030f\u0005\b\u0000\u0000\u030f\u0310"+
		"\u0003\u0006\u0003\u0000\u0310\u0311\u0005\b\u0000\u0000\u0311\u0312\u0003"+
		"\u0006\u0003\u0000\u0312\u0314\u0005\u0006\u0000\u0000\u0313\u0315\u0003"+
		"P(\u0000\u0314\u0313\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000"+
		"\u0000\u0315\u0358\u0001\u0000\u0000\u0000\u0316\u0317\u0005\u008c\u0000"+
		"\u0000\u0317\u0318\u0005\u0005\u0000\u0000\u0318\u0319\u0003\u0006\u0003"+
		"\u0000\u0319\u031a\u0005\b\u0000\u0000\u031a\u031b\u0003\u0006\u0003\u0000"+
		"\u031b\u031c\u0005\b\u0000\u0000\u031c\u031d\u0003\u0006\u0003\u0000\u031d"+
		"\u031e\u0005\b\u0000\u0000\u031e\u031f\u0003\u0006\u0003\u0000\u031f\u0320"+
		"\u0005\b\u0000\u0000\u0320\u0321\u0003\u0006\u0003\u0000\u0321\u0322\u0005"+
		"\b\u0000\u0000\u0322\u032a\u0003\u0006\u0003\u0000\u0323\u0324\u0005\b"+
		"\u0000\u0000\u0324\u0325\u0003\u0006\u0003\u0000\u0325\u0326\u0005\b\u0000"+
		"\u0000\u0326\u0327\u0003\u0006\u0003\u0000\u0327\u0329\u0001\u0000\u0000"+
		"\u0000\u0328\u0323\u0001\u0000\u0000\u0000\u0329\u032c\u0001\u0000\u0000"+
		"\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000"+
		"\u0000\u032b\u032d\u0001\u0000\u0000\u0000\u032c\u032a\u0001\u0000\u0000"+
		"\u0000\u032d\u032f\u0005\u0006\u0000\u0000\u032e\u0330\u0003N\'\u0000"+
		"\u032f\u032e\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000"+
		"\u0330\u0358\u0001\u0000\u0000\u0000\u0331\u0332\u0005\u0089\u0000\u0000"+
		"\u0332\u0333\u0005\u0005\u0000\u0000\u0333\u0334\u0003\u0006\u0003\u0000"+
		"\u0334\u0335\u0005\b\u0000\u0000\u0335\u0336\u0003\u0006\u0003\u0000\u0336"+
		"\u0337\u0005\b\u0000\u0000\u0337\u0338\u0003\u0006\u0003\u0000\u0338\u0339"+
		"\u0005\b\u0000\u0000\u0339\u033a\u0003\u0006\u0003\u0000\u033a\u033b\u0005"+
		"\b\u0000\u0000\u033b\u033c\u0003\u0006\u0003\u0000\u033c\u033d\u0005\b"+
		"\u0000\u0000\u033d\u033e\u0003\u0006\u0003\u0000\u033e\u0340\u0005\u0006"+
		"\u0000\u0000\u033f\u0341\u0003P(\u0000\u0340\u033f\u0001\u0000\u0000\u0000"+
		"\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0358\u0001\u0000\u0000\u0000"+
		"\u0342\u0343\u0005\u0087\u0000\u0000\u0343\u0344\u0005\u0005\u0000\u0000"+
		"\u0344\u0345\u0003\u0006\u0003\u0000\u0345\u0346\u0005\b\u0000\u0000\u0346"+
		"\u0347\u0003\u0006\u0003\u0000\u0347\u0348\u0005\b\u0000\u0000\u0348\u0349"+
		"\u0003\u0006\u0003\u0000\u0349\u034a\u0005\b\u0000\u0000\u034a\u034b\u0003"+
		"\u0006\u0003\u0000\u034b\u034c\u0005\b\u0000\u0000\u034c\u034d\u0003\u0006"+
		"\u0003\u0000\u034d\u034e\u0005\b\u0000\u0000\u034e\u034f\u0003\u0006\u0003"+
		"\u0000\u034f\u0350\u0005\b\u0000\u0000\u0350\u0351\u0003\u0006\u0003\u0000"+
		"\u0351\u0352\u0005\b\u0000\u0000\u0352\u0353\u0003\u0006\u0003\u0000\u0353"+
		"\u0355\u0005\u0006\u0000\u0000\u0354\u0356\u0003P(\u0000\u0355\u0354\u0001"+
		"\u0000\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356\u0358\u0001"+
		"\u0000\u0000\u0000\u0357\u02a8\u0001\u0000\u0000\u0000\u0357\u02b3\u0001"+
		"\u0000\u0000\u0000\u0357\u02be\u0001\u0000\u0000\u0000\u0357\u02cb\u0001"+
		"\u0000\u0000\u0000\u0357\u02d6\u0001\u0000\u0000\u0000\u0357\u02e3\u0001"+
		"\u0000\u0000\u0000\u0357\u02f8\u0001\u0000\u0000\u0000\u0357\u0307\u0001"+
		"\u0000\u0000\u0000\u0357\u0316\u0001\u0000\u0000\u0000\u0357\u0331\u0001"+
		"\u0000\u0000\u0000\u0357\u0342\u0001\u0000\u0000\u0000\u0358M\u0001\u0000"+
		"\u0000\u0000\u0359\u035d\u0005E\u0000\u0000\u035a\u035b\u0005#\u0000\u0000"+
		"\u035b\u035c\u0005M\u0000\u0000\u035c\u035e\u0005\u0013\u0000\u0000\u035d"+
		"\u035a\u0001\u0000\u0000\u0000\u035d\u035e\u0001\u0000\u0000\u0000\u035e"+
		"\u0366\u0001\u0000\u0000\u0000\u035f\u0360\u0005M\u0000\u0000\u0360\u0363"+
		"\u0005\u0013\u0000\u0000\u0361\u0362\u0005#\u0000\u0000\u0362\u0364\u0005"+
		"E\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000"+
		"\u0000\u0000\u0364\u0366\u0001\u0000\u0000\u0000\u0365\u0359\u0001\u0000"+
		"\u0000\u0000\u0365\u035f\u0001\u0000\u0000\u0000\u0366O\u0001\u0000\u0000"+
		"\u0000\u0367\u036b\u0005C\u0000\u0000\u0368\u0369\u0005#\u0000\u0000\u0369"+
		"\u036a\u0005M\u0000\u0000\u036a\u036c\u0005\u0013\u0000\u0000\u036b\u0368"+
		"\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u0374"+
		"\u0001\u0000\u0000\u0000\u036d\u036e\u0005M\u0000\u0000\u036e\u0371\u0005"+
		"\u0013\u0000\u0000\u036f\u0370\u0005#\u0000\u0000\u0370\u0372\u0005C\u0000"+
		"\u0000\u0371\u036f\u0001\u0000\u0000\u0000\u0371\u0372\u0001\u0000\u0000"+
		"\u0000\u0372\u0374\u0001\u0000\u0000\u0000\u0373\u0367\u0001\u0000\u0000"+
		"\u0000\u0373\u036d\u0001\u0000\u0000\u0000\u0374Q\u0001\u0000\u0000\u0000"+
		"\u0375\u0376\u0005\u001e\u0000\u0000\u0376\u0378\u0005\u000e\u0000\u0000"+
		"\u0377\u0379\u0003N\'\u0000\u0378\u0377\u0001\u0000\u0000\u0000\u0378"+
		"\u0379\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a"+
		"\u037e\u0005\u0003\u0000\u0000\u037b\u037c\u0003T*\u0000\u037c\u037d\u0005"+
		"\u00be\u0000\u0000\u037d\u037f\u0001\u0000\u0000\u0000\u037e\u037b\u0001"+
		"\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u037e\u0001"+
		"\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381\u0382\u0001"+
		"\u0000\u0000\u0000\u0382\u0383\u0005\u0004\u0000\u0000\u0383S\u0001\u0000"+
		"\u0000\u0000\u0384\u0385\u00058\u0000\u0000\u0385\u0386\u0005\u000b\u0000"+
		"\u0000\u0386\u0387\u0005\u0005\u0000\u0000\u0387\u0388\u0003\u0006\u0003"+
		"\u0000\u0388\u0389\u0005\b\u0000\u0000\u0389\u038a\u0003\u0006\u0003\u0000"+
		"\u038a\u038b\u0005\u0006\u0000\u0000\u038b\u03b4\u0001\u0000\u0000\u0000"+
		"\u038c\u038d\u00057\u0000\u0000\u038d\u038e\u0005\u000b\u0000\u0000\u038e"+
		"\u038f\u0005\u0005\u0000\u0000\u038f\u0390\u0003\u0006\u0003\u0000\u0390"+
		"\u0391\u0005\b\u0000\u0000\u0391\u0392\u0003\u0006\u0003\u0000\u0392\u0393"+
		"\u0005\u0006\u0000\u0000\u0393\u03b4\u0001\u0000\u0000\u0000\u0394\u0395"+
		"\u0005\u0016\u0000\u0000\u0395\u0396\u0005G\u0000\u0000\u0396\u0397\u0005"+
		"\u000b\u0000\u0000\u0397\u0398\u0005\u0005\u0000\u0000\u0398\u0399\u0003"+
		"\u0006\u0003\u0000\u0399\u039a\u0005\b\u0000\u0000\u039a\u039b\u0003\u0006"+
		"\u0003\u0000\u039b\u039c\u0005\b\u0000\u0000\u039c\u039d\u0003\u0006\u0003"+
		"\u0000\u039d\u039e\u0005\b\u0000\u0000\u039e\u039f\u0003\u0006\u0003\u0000"+
		"\u039f\u03a0\u0005\u0006\u0000\u0000\u03a0\u03b4\u0001\u0000\u0000\u0000"+
		"\u03a1\u03a2\u0005\u0016\u0000\u0000\u03a2\u03a3\u0005\u0015\u0000\u0000"+
		"\u03a3\u03a4\u0005\u000b\u0000\u0000\u03a4\u03a5\u0005\u0005\u0000\u0000"+
		"\u03a5\u03a6\u0003\u0006\u0003\u0000\u03a6\u03a7\u0005\b\u0000\u0000\u03a7"+
		"\u03a8\u0003\u0006\u0003\u0000\u03a8\u03a9\u0005\b\u0000\u0000\u03a9\u03aa"+
		"\u0003\u0006\u0003\u0000\u03aa\u03ab\u0005\b\u0000\u0000\u03ab\u03ac\u0003"+
		"\u0006\u0003\u0000\u03ac\u03ad\u0005\b\u0000\u0000\u03ad\u03ae\u0003\u0006"+
		"\u0003\u0000\u03ae\u03af\u0005\b\u0000\u0000\u03af\u03b0\u0003\u0006\u0003"+
		"\u0000\u03b0\u03b1\u0005\u0006\u0000\u0000\u03b1\u03b4\u0001\u0000\u0000"+
		"\u0000\u03b2\u03b4\u0005,\u0000\u0000\u03b3\u0384\u0001\u0000\u0000\u0000"+
		"\u03b3\u038c\u0001\u0000\u0000\u0000\u03b3\u0394\u0001\u0000\u0000\u0000"+
		"\u03b3\u03a1\u0001\u0000\u0000\u0000\u03b3\u03b2\u0001\u0000\u0000\u0000"+
		"\u03b4U\u0001\u0000\u0000\u0000\u03b5\u03b6\u0005P\u0000\u0000\u03b6\u03b7"+
		"\u0005\u00be\u0000\u0000\u03b7\u03b8\u0007\u0013\u0000\u0000\u03b8W\u0001"+
		"\u0000\u0000\u0000\u03b9\u03ba\u0005-\u0000\u0000\u03ba\u03bb\u0005\u0005"+
		"\u0000\u0000\u03bb\u03c0\u0005\u00c6\u0000\u0000\u03bc\u03bd\u0005\b\u0000"+
		"\u0000\u03bd\u03bf\u0003\u0006\u0003\u0000\u03be\u03bc\u0001\u0000\u0000"+
		"\u0000\u03bf\u03c2\u0001\u0000\u0000\u0000\u03c0\u03be\u0001\u0000\u0000"+
		"\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c3\u0001\u0000\u0000"+
		"\u0000\u03c2\u03c0\u0001\u0000\u0000\u0000\u03c3\u03c4\u0005\u0006\u0000"+
		"\u0000\u03c4Y\u0001\u0000\u0000\u0000\u03c5\u03ca\u0007\u0014\u0000\u0000"+
		"\u03c6\u03c7\u0005\u0001\u0000\u0000\u03c7\u03c8\u0003\u0006\u0003\u0000"+
		"\u03c8\u03c9\u0005\u0002\u0000\u0000\u03c9\u03cb\u0001\u0000\u0000\u0000"+
		"\u03ca\u03c6\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000"+
		"\u03cc\u03ca\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000"+
		"\u03cd\u03d2\u0001\u0000\u0000\u0000\u03ce\u03cf\u0007\u0015\u0000\u0000"+
		"\u03cf\u03d0\u0005\u0003\u0000\u0000\u03d0\u03d2\u0005\u0004\u0000\u0000"+
		"\u03d1\u03c5\u0001\u0000\u0000\u0000\u03d1\u03ce\u0001\u0000\u0000\u0000"+
		"\u03d2[\u0001\u0000\u0000\u0000L_j|\u0083\u0089\u008c\u0093\u009b\u00a8"+
		"\u00b1\u00b7\u00c1\u00c8\u00d6\u00de\u00e2\u00eb\u00f7\u0100\u010a\u0111"+
		"\u0113\u011d\u0126\u012e\u0135\u0148\u014e\u015c\u0169\u0173\u0187\u018b"+
		"\u018e\u0193\u0196\u019f\u01a4\u01a9\u01b4\u01ba\u01be\u01c7\u01d0\u01d5"+
		"\u01df\u01f0\u0231\u024a\u028d\u02a3\u02bc\u02c9\u02d4\u02e1\u02f2\u02f6"+
		"\u0305\u0314\u032a\u032f\u0340\u0355\u0357\u035d\u0363\u0365\u036b\u0371"+
		"\u0373\u0378\u0380\u03b3\u03c0\u03cc\u03d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}