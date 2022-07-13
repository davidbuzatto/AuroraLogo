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
		ABE=10, ALT=11, ATE=12, BAI=13, CADA=14, CAM=15, CIM=16, COD=17, COM=18, 
		CONT=19, CON=20, COR=21, CUBI=22, CUR=23, CRA=24, CRAA=25, CRR=26, CRRA=27, 
		DCMM=28, DE=29, DES=30, DESE=31, DIAG=32, DIR=33, DIVM=34, DO=35, E=36, 
		EM=37, ENG=38, ENQ=39, ENT=40, ESCO=41, ESC=42, ESQ=43, FAL=44, FEC=45, 
		FORM=46, FUN=47, FUNC=48, GIR=49, GRA=50, GROS=51, INCM=52, INI=53, LER=54, 
		LEV=55, LIM=56, LIN=57, MOV=58, MULM=59, NA=60, NO=61, PADR=62, PARA=63, 
		PARR=64, PI=65, PINC=66, PIZ=67, POR=68, PREE=69, PUL=70, QUAD=71, RAD=72, 
		REP=73, REPE=74, RET=75, SAI=76, SE=77, SEN=78, SEM=79, SOMM=80, SUBM=81, 
		TART=82, TER=83, TROC=84, USA=85, VA=86, VER=87, VEZ=88, VEZS=89, PRETO=90, 
		AZUL=91, CIANO=92, CINZA=93, VERDE=94, MAGENTA=95, LARANJA=96, ROSA=97, 
		VERMELHO=98, BRANCO=99, AMARELO=100, ESCURO=101, CLARO=102, PA=103, PX=104, 
		PY=105, CARC=106, CHAV=107, COMP=108, SUBS=109, F_ACOS=110, F_ARRE=111, 
		F_ASEN=112, F_ATAN=113, F_CAPO=114, F_CHAO=115, F_COSH=116, F_COSS=117, 
		F_DCM=118, F_GRRA=119, F_HIPO=120, F_INC=121, F_LOGA=122, F_MAXI=123, 
		F_MINI=124, F_NUMA=125, F_POTE=126, F_RAGR=127, F_RAIC=128, F_RAIQ=129, 
		F_RAIZ=130, F_SEME=131, F_SENH=132, F_SENO=133, F_TANG=134, F_TANH=135, 
		F_TETO=136, F_VABS=137, FG_ARC=138, FG_CCU=139, FG_CIC=140, FG_CQD=141, 
		FG_ELI=142, FG_EST=143, FG_POL=144, FG_POR=145, FG_QUA=146, FG_RET=147, 
		FG_REA=148, FG_SEG=149, ATR=150, ATRA=151, AC_A=152, AT_A=153, AC_S=154, 
		AT_S=155, AC_M=156, AT_M=157, AC_D=158, AT_D=159, AC_R=160, AT_R=161, 
		ADI=162, ADIA=163, SUB=164, SUBA=165, MUL=166, DIV=167, DIVA=168, MOD=169, 
		MODA=170, IGU=171, IGUT=172, IGUA=173, DIF=174, DIFT=175, DIFA=176, ME=177, 
		MET=178, MEA=179, MEI=180, MEIT=181, MEIA=182, MA=183, MAT=184, MAA=185, 
		MAI=186, MAIT=187, MAIA=188, ELG=189, ELGT=190, OLG=191, OLGT=192, NAO=193, 
		NAOT=194, DOT=195, ID=196, IDC=197, IDF=198, IDP=199, IDA=200, INT=201, 
		DEC=202, CHEX=203, CHAR=204, STRING=205, COMENTARIO=206, COMENTARIO_LINHA=207, 
		WS=208;
	public static final int
		RULE_prog = 0, RULE_func = 1, RULE_inst = 2, RULE_instf = 3, RULE_ains = 4, 
		RULE_expr = 5, RULE_relacao = 6, RULE_exprSimp = 7, RULE_termo = 8, RULE_fator = 9, 
		RULE_exprBool = 10, RULE_se = 11, RULE_seSe = 12, RULE_seSenaoSe = 13, 
		RULE_seSenao = 14, RULE_usando = 15, RULE_escolha = 16, RULE_repetir = 17, 
		RULE_repeticao = 18, RULE_repetirEnquanto = 19, RULE_paraCada = 20, RULE_parar = 21, 
		RULE_continuar = 22, RULE_retornar = 23, RULE_movimentar = 24, RULE_trocarCor = 25, 
		RULE_configuracaoCor = 26, RULE_cor = 27, RULE_girar = 28, RULE_engrossar = 29, 
		RULE_desengrossar = 30, RULE_trocarGrossura = 31, RULE_escrever = 32, 
		RULE_ler = 33, RULE_atribuir = 34, RULE_exprIndice = 35, RULE_abaixar = 36, 
		RULE_levantar = 37, RULE_limpar = 38, RULE_funcaoMatematica = 39, RULE_instrucaoGeometrica = 40, 
		RULE_funcaoGeometrica = 41, RULE_opcaoFuncGeom = 42, RULE_desenharCaminho = 43, 
		RULE_instCaminho = 44, RULE_consultarTartaruga = 45, RULE_consultarString = 46, 
		RULE_formatarTexto = 47, RULE_criarArranjos = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "func", "inst", "instf", "ains", "expr", "relacao", "exprSimp", 
			"termo", "fator", "exprBool", "se", "seSe", "seSenaoSe", "seSenao", "usando", 
			"escolha", "repetir", "repeticao", "repetirEnquanto", "paraCada", "parar", 
			"continuar", "retornar", "movimentar", "trocarCor", "configuracaoCor", 
			"cor", "girar", "engrossar", "desengrossar", "trocarGrossura", "escrever", 
			"ler", "atribuir", "exprIndice", "abaixar", "levantar", "limpar", "funcaoMatematica", 
			"instrucaoGeometrica", "funcaoGeometrica", "opcaoFuncGeom", "desenharCaminho", 
			"instCaminho", "consultarTartaruga", "consultarString", "formatarTexto", 
			"criarArranjos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "'}'", "'['", "']'", "':'", "'abaixar'", 
			"'ABERTO'", "'alterar'", "'at\\u00E9'", "'baixo'", "'cada'", "'caminho'", 
			"'cima'", "'CORDA'", "'com'", "'continuar'", "'contorno'", "'cor'", "'c\\u00FAbica'", 
			"'curva'", "'criarArranjo'", "'criarArranjoAssociativo'", "'criarArray'", 
			"'criarArrayAssociativo'", "'decrementando'", "'de'", "'desengrossar'", 
			"'desenhar'", "'di\\u00E1logo'", "'direita'", "'dividindo'", "'do'", 
			"'e'", "'em'", "'engrossar'", "'enquanto'", "'ent\\u00E3o'", "'escolha'", 
			"'escrever'", "'esquerda'", "'FALSO'", "'fechar'", "'formatarTexto'", 
			"'fundo'", "'fun\\u00E7\\u00E3o'", "'girar'", "'graus'", "'grossura'", 
			"'incrementando'", "'iniciar'", "'ler'", "'levantar'", "'limpar'", "'linha'", 
			"'mover'", "'multiplicando'", "'na'", "'no'", "'padr\\u00E3o'", "'para'", 
			"'parar'", "'PI'", "'pincel'", "'PIZZA'", "'por'", "'preenchimento'", 
			"'pulando'", "'quadr\\u00E1tica'", "'radianos'", "'repetir'", "'repeti\\u00E7\\u00E3o'", 
			"'retornar'", "'sa\\u00EDda'", "'se'", "'sen\\u00E3o'", "'sem'", "'somando'", 
			"'subtraindo'", "'tartaruga'", "'terminar'", "'trocar'", "'usando'", 
			"'v\\u00E1'", "'VERDADEIRO'", "'vez'", "'vezes'", "'preto'", "'azul'", 
			"'ciano'", "'cinza'", "'verde'", "'magenta'", "'laranja'", "'rosa'", 
			"'vermelho'", "'branco'", "'amarelo'", "'escuro'", "'claro'", "'\\u00E2ngulo'", 
			"'x'", "'y'", "'caracteres'", "'chaves'", "'comprimento'", "'substring'", 
			"'arcoCosseno'", "'arredondar'", "'arcoSeno'", "'arcoTangente'", "'cartesianoParaPolar'", 
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
			null, null, null, null, null, null, null, null, null, "ABA", "ABE", "ALT", 
			"ATE", "BAI", "CADA", "CAM", "CIM", "COD", "COM", "CONT", "CON", "COR", 
			"CUBI", "CUR", "CRA", "CRAA", "CRR", "CRRA", "DCMM", "DE", "DES", "DESE", 
			"DIAG", "DIR", "DIVM", "DO", "E", "EM", "ENG", "ENQ", "ENT", "ESCO", 
			"ESC", "ESQ", "FAL", "FEC", "FORM", "FUN", "FUNC", "GIR", "GRA", "GROS", 
			"INCM", "INI", "LER", "LEV", "LIM", "LIN", "MOV", "MULM", "NA", "NO", 
			"PADR", "PARA", "PARR", "PI", "PINC", "PIZ", "POR", "PREE", "PUL", "QUAD", 
			"RAD", "REP", "REPE", "RET", "SAI", "SE", "SEN", "SEM", "SOMM", "SUBM", 
			"TART", "TER", "TROC", "USA", "VA", "VER", "VEZ", "VEZS", "PRETO", "AZUL", 
			"CIANO", "CINZA", "VERDE", "MAGENTA", "LARANJA", "ROSA", "VERMELHO", 
			"BRANCO", "AMARELO", "ESCURO", "CLARO", "PA", "PX", "PY", "CARC", "CHAV", 
			"COMP", "SUBS", "F_ACOS", "F_ARRE", "F_ASEN", "F_ATAN", "F_CAPO", "F_CHAO", 
			"F_COSH", "F_COSS", "F_DCM", "F_GRRA", "F_HIPO", "F_INC", "F_LOGA", "F_MAXI", 
			"F_MINI", "F_NUMA", "F_POTE", "F_RAGR", "F_RAIC", "F_RAIQ", "F_RAIZ", 
			"F_SEME", "F_SENH", "F_SENO", "F_TANG", "F_TANH", "F_TETO", "F_VABS", 
			"FG_ARC", "FG_CCU", "FG_CIC", "FG_CQD", "FG_ELI", "FG_EST", "FG_POL", 
			"FG_POR", "FG_QUA", "FG_RET", "FG_REA", "FG_SEG", "ATR", "ATRA", "AC_A", 
			"AT_A", "AC_S", "AT_S", "AC_M", "AT_M", "AC_D", "AT_D", "AC_R", "AT_R", 
			"ADI", "ADIA", "SUB", "SUBA", "MUL", "DIV", "DIVA", "MOD", "MODA", "IGU", 
			"IGUT", "IGUA", "DIF", "DIFT", "DIFA", "ME", "MET", "MEA", "MEI", "MEIT", 
			"MEIA", "MA", "MAT", "MAA", "MAI", "MAIT", "MAIA", "ELG", "ELGT", "OLG", 
			"OLGT", "NAO", "NAOT", "DOT", "ID", "IDC", "IDF", "IDP", "IDA", "INT", 
			"DEC", "CHEX", "CHAR", "STRING", "COMENTARIO", "COMENTARIO_LINHA", "WS"
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
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
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
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(98);
				func();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				inst();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (REPE - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(AuroraLogoParser.FUNC, 0); }
		public TerminalNode IDF() { return getToken(AuroraLogoParser.IDF, 0); }
		public List<TerminalNode> IDP() { return getTokens(AuroraLogoParser.IDP); }
		public TerminalNode IDP(int i) {
			return getToken(AuroraLogoParser.IDP, i);
		}
		public List<InstfContext> instf() {
			return getRuleContexts(InstfContext.class);
		}
		public InstfContext instf(int i) {
			return getRuleContext(InstfContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(FUNC);
			setState(110);
			match(IDF);
			setState(111);
			match(T__0);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDP) {
				{
				setState(112);
				match(IDP);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(113);
					match(T__1);
					setState(114);
					match(IDP);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(122);
			match(T__2);
			setState(123);
			match(T__3);
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				instf();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (REPE - 64)) | (1L << (RET - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(129);
			match(T__4);
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
		enterRule(_localctx, 4, RULE_inst);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				ains();
				setState(132);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				se();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				usando();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				repetir();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				repetirEnquanto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				paraCada();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
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

	public static class InstfContext extends ParserRuleContext {
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public RetornarContext retornar() {
			return getRuleContext(RetornarContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AuroraLogoParser.DOT, 0); }
		public InstfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterInstf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitInstf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitInstf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstfContext instf() throws RecognitionException {
		InstfContext _localctx = new InstfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instf);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ABA:
			case ALT:
			case CONT:
			case DES:
			case DESE:
			case ENG:
			case ENQ:
			case ESC:
			case FAL:
			case FORM:
			case GIR:
			case LER:
			case LEV:
			case LIM:
			case PARA:
			case PARR:
			case PI:
			case REP:
			case REPE:
			case SE:
			case TART:
			case TROC:
			case USA:
			case VA:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				inst();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				retornar();
				setState(144);
				match(DOT);
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
		enterRule(_localctx, 8, RULE_ains);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				movimentar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				trocarCor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				girar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				abaixar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				levantar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				limpar();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(154);
				engrossar();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(155);
				desengrossar();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(156);
				trocarGrossura();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(157);
				escrever();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(158);
				ler();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(159);
				atribuir();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(160);
				parar();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(161);
				continuar();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(162);
				instrucaoGeometrica();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(163);
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
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			relacao();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (ELG - 189)) | (1L << (ELGT - 189)) | (1L << (OLG - 189)) | (1L << (OLGT - 189)))) != 0)) {
				{
				{
				setState(167);
				_la = _input.LA(1);
				if ( !(((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (ELG - 189)) | (1L << (ELGT - 189)) | (1L << (OLG - 189)) | (1L << (OLGT - 189)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				relacao();
				}
				}
				setState(173);
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
		enterRule(_localctx, 12, RULE_relacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			exprSimp();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (IGU - 171)) | (1L << (IGUT - 171)) | (1L << (IGUA - 171)) | (1L << (DIF - 171)) | (1L << (DIFT - 171)) | (1L << (DIFA - 171)) | (1L << (ME - 171)) | (1L << (MET - 171)) | (1L << (MEA - 171)) | (1L << (MEI - 171)) | (1L << (MEIT - 171)) | (1L << (MEIA - 171)) | (1L << (MA - 171)) | (1L << (MAT - 171)) | (1L << (MAA - 171)) | (1L << (MAI - 171)) | (1L << (MAIT - 171)) | (1L << (MAIA - 171)))) != 0)) {
				{
				setState(175);
				((RelacaoContext)_localctx).opRel = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (IGU - 171)) | (1L << (IGUT - 171)) | (1L << (IGUA - 171)) | (1L << (DIF - 171)) | (1L << (DIFT - 171)) | (1L << (DIFA - 171)) | (1L << (ME - 171)) | (1L << (MET - 171)) | (1L << (MEA - 171)) | (1L << (MEI - 171)) | (1L << (MEIT - 171)) | (1L << (MEIA - 171)) | (1L << (MA - 171)) | (1L << (MAT - 171)) | (1L << (MAA - 171)) | (1L << (MAI - 171)) | (1L << (MAIT - 171)) | (1L << (MAIA - 171)))) != 0)) ) {
					((RelacaoContext)_localctx).opRel = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
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
		enterRule(_localctx, 14, RULE_exprSimp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (ADI - 162)) | (1L << (ADIA - 162)) | (1L << (SUB - 162)) | (1L << (SUBA - 162)))) != 0)) {
				{
				setState(179);
				((ExprSimpContext)_localctx).opNeg = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (ADI - 162)) | (1L << (ADIA - 162)) | (1L << (SUB - 162)) | (1L << (SUBA - 162)))) != 0)) ) {
					((ExprSimpContext)_localctx).opNeg = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(182);
			termo();
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					_la = _input.LA(1);
					if ( !(((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (ADI - 162)) | (1L << (ADIA - 162)) | (1L << (SUB - 162)) | (1L << (SUBA - 162)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(184);
					termo();
					}
					} 
				}
				setState(189);
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
		enterRule(_localctx, 16, RULE_termo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			fator();
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					_la = _input.LA(1);
					if ( !(_la==VEZS || ((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & ((1L << (MUL - 166)) | (1L << (DIV - 166)) | (1L << (DIVA - 166)) | (1L << (MOD - 166)) | (1L << (MODA - 166)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(192);
					fator();
					}
					} 
				}
				setState(197);
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
	public static class FatorConsultarStringContext extends FatorContext {
		public ConsultarStringContext consultarString() {
			return getRuleContext(ConsultarStringContext.class,0);
		}
		public FatorConsultarStringContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorConsultarString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorConsultarString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorConsultarString(this);
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
		enterRule(_localctx, 18, RULE_fator);
		int _la;
		try {
			int _alt;
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new FatorNaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NAOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(199);
				fator();
				}
				break;
			case 2:
				_localctx = new FatorIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(INT);
				}
				break;
			case 3:
				_localctx = new FatorDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(DEC);
				}
				break;
			case 4:
				_localctx = new FatorPiContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(PI);
				}
				break;
			case 5:
				_localctx = new FatorIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				match(ID);
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(204);
					match(DOT);
					setState(205);
					match(COMP);
					setState(206);
					match(T__0);
					setState(207);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(208);
					match(DOT);
					setState(209);
					match(CHAV);
					setState(210);
					match(T__0);
					setState(211);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new FatorIdArranjoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				match(ID);
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(215);
					match(T__5);
					setState(216);
					expr();
					setState(217);
					match(T__6);
					}
					}
					setState(221); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(223);
					match(DOT);
					setState(224);
					match(COMP);
					setState(225);
					match(T__0);
					setState(226);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(227);
					match(DOT);
					setState(228);
					match(CHAV);
					setState(229);
					match(T__0);
					setState(230);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new FatorIdArranjoAssociativoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				match(ID);
				setState(234);
				match(T__3);
				setState(235);
				expr();
				setState(236);
				match(T__4);
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(237);
					match(DOT);
					setState(238);
					match(COMP);
					setState(239);
					match(T__0);
					setState(240);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(241);
					match(DOT);
					setState(242);
					match(CHAV);
					setState(243);
					match(T__0);
					setState(244);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new FatorIdIdAtributoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(247);
				match(ID);
				setState(250); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(248);
						match(DOT);
						setState(249);
						match(IDA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(252); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
				_localctx = new FatorCharContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(254);
				match(CHAR);
				}
				break;
			case 10:
				_localctx = new FatorStringContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(255);
				match(STRING);
				}
				break;
			case 11:
				_localctx = new FatorBoolContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(256);
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
				setState(257);
				cor();
				}
				break;
			case 13:
				_localctx = new FatorFuncaoMatematicaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(258);
				funcaoMatematica();
				}
				break;
			case 14:
				_localctx = new FatorConsultarTartarugaContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(259);
				consultarTartaruga();
				}
				break;
			case 15:
				_localctx = new FatorConsultarStringContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(260);
				consultarString();
				}
				break;
			case 16:
				_localctx = new FatorFormatarTextoContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(261);
				formatarTexto();
				}
				break;
			case 17:
				_localctx = new FatorRepeticaoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(262);
				repeticao();
				}
				break;
			case 18:
				_localctx = new FatorParentesesContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(263);
				match(T__0);
				setState(264);
				expr();
				setState(265);
				match(T__2);
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
		enterRule(_localctx, 20, RULE_exprBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 22, RULE_se);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			seSe();
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(272);
					seSenaoSe();
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEN) {
				{
				setState(278);
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
		enterRule(_localctx, 24, RULE_seSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(SE);
			setState(282);
			exprBool();
			setState(283);
			match(ENT);
			setState(284);
			match(T__3);
			setState(286); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(285);
				inst();
				}
				}
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (REPE - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(290);
			match(T__4);
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
		enterRule(_localctx, 26, RULE_seSenaoSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(SEN);
			setState(293);
			match(SE);
			setState(294);
			exprBool();
			setState(295);
			match(ENT);
			setState(296);
			match(T__3);
			setState(298); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(297);
				inst();
				}
				}
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (REPE - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(302);
			match(T__4);
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
			setState(304);
			match(SEN);
			setState(305);
			match(T__3);
			setState(307); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(306);
				inst();
				}
				}
				setState(309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (REPE - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(311);
			match(T__4);
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
		enterRule(_localctx, 30, RULE_usando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(USA);
			setState(314);
			match(ID);
			setState(315);
			match(T__3);
			setState(317); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(316);
				escolha();
				}
				}
				setState(319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESCO );
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PADR) {
				{
				setState(321);
				match(PADR);
				setState(322);
				match(T__7);
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(323);
					inst();
					}
					}
					setState(326); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (REPE - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
				}
			}

			setState(330);
			match(T__4);
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
		enterRule(_localctx, 32, RULE_escolha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(ESCO);
			setState(333);
			_la = _input.LA(1);
			if ( !(((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (INT - 201)) | (1L << (DEC - 201)) | (1L << (CHAR - 201)) | (1L << (STRING - 201)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(334);
			match(T__7);
			setState(336); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(335);
				inst();
				}
				}
				setState(338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (REPE - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
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
		enterRule(_localctx, 34, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(REP);
			setState(341);
			expr();
			setState(342);
			_la = _input.LA(1);
			if ( !(_la==VEZ || _la==VEZS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(343);
			match(T__3);
			setState(345); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(344);
				inst();
				}
				}
				setState(347); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (REPE - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(349);
			match(T__4);
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
		enterRule(_localctx, 36, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		enterRule(_localctx, 38, RULE_repetirEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENQ) {
				{
				setState(353);
				match(ENQ);
				setState(354);
				exprBool();
				}
			}

			setState(357);
			match(REP);
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DCMM:
			case INCM:
				{
				setState(358);
				_la = _input.LA(1);
				if ( !(_la==DCMM || _la==INCM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(359);
				match(ID);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EM) {
					{
					setState(360);
					match(EM);
					setState(361);
					expr();
					}
				}

				}
				break;
			case SOMM:
				{
				setState(364);
				match(SOMM);
				setState(365);
				match(ID);
				setState(366);
				match(COM);
				setState(367);
				expr();
				}
				break;
			case MULM:
				{
				setState(368);
				match(MULM);
				setState(369);
				match(ID);
				setState(370);
				match(POR);
				setState(371);
				expr();
				}
				break;
			case DIVM:
				{
				setState(372);
				match(DIVM);
				setState(373);
				match(ID);
				setState(374);
				match(POR);
				setState(375);
				expr();
				}
				break;
			case SUBM:
				{
				setState(376);
				match(SUBM);
				setState(377);
				expr();
				setState(378);
				match(DE);
				setState(379);
				match(ID);
				}
				break;
			case T__3:
				break;
			default:
				break;
			}
			setState(383);
			match(T__3);
			setState(385); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(384);
				inst();
				}
				}
				setState(387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (REPE - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(389);
			match(T__4);
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
		enterRule(_localctx, 40, RULE_paraCada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(PARA);
			setState(392);
			match(CADA);
			setState(393);
			match(ID);
			setState(394);
			match(EM);
			setState(395);
			expr();
			setState(396);
			match(REP);
			setState(397);
			match(T__3);
			setState(399); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(398);
				inst();
				}
				}
				setState(401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PARA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (REPE - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(403);
			match(T__4);
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
		enterRule(_localctx, 42, RULE_parar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		enterRule(_localctx, 44, RULE_continuar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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

	public static class RetornarContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(AuroraLogoParser.RET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetornarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterRetornar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitRetornar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitRetornar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornarContext retornar() throws RecognitionException {
		RetornarContext _localctx = new RetornarContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_retornar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(RET);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << FAL) | (1L << FORM))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PI - 65)) | (1L << (REPE - 65)) | (1L << (TART - 65)) | (1L << (VER - 65)) | (1L << (F_ACOS - 65)) | (1L << (F_ARRE - 65)) | (1L << (F_ASEN - 65)) | (1L << (F_ATAN - 65)) | (1L << (F_CAPO - 65)) | (1L << (F_CHAO - 65)) | (1L << (F_COSH - 65)) | (1L << (F_COSS - 65)) | (1L << (F_DCM - 65)) | (1L << (F_GRRA - 65)) | (1L << (F_HIPO - 65)) | (1L << (F_INC - 65)) | (1L << (F_LOGA - 65)) | (1L << (F_MAXI - 65)) | (1L << (F_MINI - 65)) | (1L << (F_NUMA - 65)) | (1L << (F_POTE - 65)) | (1L << (F_RAGR - 65)) | (1L << (F_RAIC - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (F_RAIQ - 129)) | (1L << (F_RAIZ - 129)) | (1L << (F_SEME - 129)) | (1L << (F_SENH - 129)) | (1L << (F_SENO - 129)) | (1L << (F_TANG - 129)) | (1L << (F_TANH - 129)) | (1L << (F_TETO - 129)) | (1L << (F_VABS - 129)) | (1L << (ADI - 129)) | (1L << (ADIA - 129)) | (1L << (SUB - 129)) | (1L << (SUBA - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0)) {
				{
				setState(410);
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
		enterRule(_localctx, 48, RULE_movimentar);
		int _la;
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new MovimentarDirecaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(VA);
				setState(414);
				match(PARA);
				setState(415);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAI) | (1L << CIM) | (1L << DIR) | (1L << ESQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				break;
			case 2:
				_localctx = new MovimentarPontoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(VA);
				setState(421);
				match(PARA);
				setState(422);
				expr();
				setState(423);
				match(T__1);
				setState(424);
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
		enterRule(_localctx, 50, RULE_trocarCor);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new TrocarCorPincelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(TROC);
				setState(429);
				match(COR);
				setState(430);
				match(DO);
				setState(431);
				match(PINC);
				setState(432);
				match(PARA);
				setState(433);
				configuracaoCor();
				}
				break;
			case 2:
				_localctx = new TrocarCorPreenchimentoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(TROC);
				setState(435);
				match(COR);
				setState(436);
				match(DO);
				setState(437);
				match(PREE);
				setState(438);
				match(PARA);
				setState(439);
				configuracaoCor();
				}
				break;
			case 3:
				_localctx = new TrocarCorFundoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(440);
				match(TROC);
				setState(441);
				match(COR);
				setState(442);
				match(DO);
				setState(443);
				match(FUN);
				setState(444);
				match(PARA);
				setState(445);
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
		enterRule(_localctx, 52, RULE_configuracaoCor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
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
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(448);
					cor();
					}
					break;
				case 2:
					{
					setState(449);
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
				setState(452);
				((ConfiguracaoCorContext)_localctx).corEx = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (PRETO - 90)) | (1L << (AZUL - 90)) | (1L << (CIANO - 90)) | (1L << (CINZA - 90)) | (1L << (VERDE - 90)) | (1L << (MAGENTA - 90)) | (1L << (LARANJA - 90)) | (1L << (ROSA - 90)) | (1L << (VERMELHO - 90)) | (1L << (BRANCO - 90)) | (1L << (AMARELO - 90)))) != 0)) ) {
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
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << FAL) | (1L << FORM))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PI - 65)) | (1L << (REPE - 65)) | (1L << (TART - 65)) | (1L << (VER - 65)) | (1L << (ESCURO - 65)) | (1L << (CLARO - 65)) | (1L << (F_ACOS - 65)) | (1L << (F_ARRE - 65)) | (1L << (F_ASEN - 65)) | (1L << (F_ATAN - 65)) | (1L << (F_CAPO - 65)) | (1L << (F_CHAO - 65)) | (1L << (F_COSH - 65)) | (1L << (F_COSS - 65)) | (1L << (F_DCM - 65)) | (1L << (F_GRRA - 65)) | (1L << (F_HIPO - 65)) | (1L << (F_INC - 65)) | (1L << (F_LOGA - 65)) | (1L << (F_MAXI - 65)) | (1L << (F_MINI - 65)) | (1L << (F_NUMA - 65)) | (1L << (F_POTE - 65)) | (1L << (F_RAGR - 65)) | (1L << (F_RAIC - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (F_RAIQ - 129)) | (1L << (F_RAIZ - 129)) | (1L << (F_SEME - 129)) | (1L << (F_SENH - 129)) | (1L << (F_SENO - 129)) | (1L << (F_TANG - 129)) | (1L << (F_TANH - 129)) | (1L << (F_TETO - 129)) | (1L << (F_VABS - 129)) | (1L << (ADI - 129)) | (1L << (ADIA - 129)) | (1L << (SUB - 129)) | (1L << (SUBA - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0)) {
				{
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << FAL) | (1L << FORM))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PI - 65)) | (1L << (REPE - 65)) | (1L << (TART - 65)) | (1L << (VER - 65)) | (1L << (F_ACOS - 65)) | (1L << (F_ARRE - 65)) | (1L << (F_ASEN - 65)) | (1L << (F_ATAN - 65)) | (1L << (F_CAPO - 65)) | (1L << (F_CHAO - 65)) | (1L << (F_COSH - 65)) | (1L << (F_COSS - 65)) | (1L << (F_DCM - 65)) | (1L << (F_GRRA - 65)) | (1L << (F_HIPO - 65)) | (1L << (F_INC - 65)) | (1L << (F_LOGA - 65)) | (1L << (F_MAXI - 65)) | (1L << (F_MINI - 65)) | (1L << (F_NUMA - 65)) | (1L << (F_POTE - 65)) | (1L << (F_RAGR - 65)) | (1L << (F_RAIC - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (F_RAIQ - 129)) | (1L << (F_RAIZ - 129)) | (1L << (F_SEME - 129)) | (1L << (F_SENH - 129)) | (1L << (F_SENO - 129)) | (1L << (F_TANG - 129)) | (1L << (F_TANH - 129)) | (1L << (F_TETO - 129)) | (1L << (F_VABS - 129)) | (1L << (ADI - 129)) | (1L << (ADIA - 129)) | (1L << (SUB - 129)) | (1L << (SUBA - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0)) {
					{
					setState(455);
					expr();
					setState(456);
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

				setState(460);
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
		enterRule(_localctx, 54, RULE_cor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
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
		public TerminalNode RAD() { return getToken(AuroraLogoParser.RAD, 0); }
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
		enterRule(_localctx, 56, RULE_girar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(GIR);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(466);
				match(EM);
				setState(467);
				expr();
				setState(468);
				_la = _input.LA(1);
				if ( !(_la==GRA || _la==RAD) ) {
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

	public static class EngrossarContext extends ParserRuleContext {
		public TerminalNode ENG() { return getToken(AuroraLogoParser.ENG, 0); }
		public TerminalNode PINC() { return getToken(AuroraLogoParser.PINC, 0); }
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
		enterRule(_localctx, 58, RULE_engrossar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(ENG);
			setState(473);
			match(PINC);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(474);
				match(EM);
				setState(475);
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
		public TerminalNode PINC() { return getToken(AuroraLogoParser.PINC, 0); }
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
		enterRule(_localctx, 60, RULE_desengrossar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(DES);
			setState(479);
			match(PINC);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(480);
				match(EM);
				setState(481);
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
		public TerminalNode ALT() { return getToken(AuroraLogoParser.ALT, 0); }
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
		enterRule(_localctx, 62, RULE_trocarGrossura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(ALT);
			setState(485);
			match(GROS);
			setState(486);
			match(PARA);
			setState(487);
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
		enterRule(_localctx, 64, RULE_escrever);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(ESC);
			setState(490);
			expr();
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NA:
				{
				setState(491);
				match(NA);
				setState(492);
				match(SAI);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUL) {
					{
					setState(493);
					match(PUL);
					setState(494);
					match(LIN);
					}
				}

				}
				break;
			case NO:
				{
				setState(497);
				match(NO);
				setState(498);
				match(DIAG);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUL) {
					{
					setState(499);
					match(PUL);
					setState(500);
					match(LIN);
					}
				}

				}
				break;
			case DOT:
				break;
			default:
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
		enterRule(_localctx, 66, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(LER);
			setState(506);
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
		enterRule(_localctx, 68, RULE_atribuir);
		int _la;
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new AtribuirPadraoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(ID);
				setState(509);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(512);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
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
					setState(510);
					expr();
					}
					break;
				case CRA:
				case CRAA:
				case CRR:
				case CRRA:
					{
					setState(511);
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
				setState(514);
				match(ID);
				setState(519); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(515);
					match(T__5);
					setState(516);
					exprIndice();
					setState(517);
					match(T__6);
					}
					}
					setState(521); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(523);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(526);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
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
					setState(524);
					expr();
					}
					break;
				case CRA:
				case CRAA:
				case CRR:
				case CRRA:
					{
					setState(525);
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
				setState(528);
				match(ID);
				{
				setState(529);
				match(T__3);
				setState(530);
				exprIndice();
				setState(531);
				match(T__4);
				}
				setState(533);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(536);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
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
					setState(534);
					expr();
					}
					break;
				case CRA:
				case CRAA:
				case CRR:
				case CRRA:
					{
					setState(535);
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
				setState(538);
				match(ID);
				setState(539);
				_la = _input.LA(1);
				if ( !(_la==AC_A || _la==AT_A) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(540);
				expr();
				}
				break;
			case 5:
				_localctx = new AtribuirSubtracaoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(541);
				match(ID);
				setState(542);
				_la = _input.LA(1);
				if ( !(_la==AC_S || _la==AT_S) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(543);
				expr();
				}
				break;
			case 6:
				_localctx = new AtribuirMultiplicacaoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(544);
				match(ID);
				setState(545);
				_la = _input.LA(1);
				if ( !(_la==AC_M || _la==AT_M) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(546);
				expr();
				}
				break;
			case 7:
				_localctx = new AtribuirDivisaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(547);
				match(ID);
				setState(548);
				_la = _input.LA(1);
				if ( !(_la==AC_D || _la==AT_D) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(549);
				expr();
				}
				break;
			case 8:
				_localctx = new AtribuirRestoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(550);
				match(ID);
				setState(551);
				_la = _input.LA(1);
				if ( !(_la==AC_R || _la==AT_R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(552);
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
		enterRule(_localctx, 70, RULE_exprIndice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
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
		enterRule(_localctx, 72, RULE_abaixar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(ABA);
			setState(558);
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
		enterRule(_localctx, 74, RULE_levantar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(LEV);
			setState(561);
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
		enterRule(_localctx, 76, RULE_limpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
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
		enterRule(_localctx, 78, RULE_funcaoMatematica);
		try {
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F_VABS:
				_localctx = new FuncaoAbsolutoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(F_VABS);
				setState(566);
				match(T__0);
				setState(567);
				expr();
				setState(568);
				match(T__2);
				}
				break;
			case F_RAIQ:
				_localctx = new FuncaoRaizQuadradaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(F_RAIQ);
				setState(571);
				match(T__0);
				setState(572);
				expr();
				setState(573);
				match(T__2);
				}
				break;
			case F_RAIC:
				_localctx = new FuncaoRaizCubicaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				match(F_RAIC);
				setState(576);
				match(T__0);
				setState(577);
				expr();
				setState(578);
				match(T__2);
				}
				break;
			case F_RAIZ:
				_localctx = new FuncaoRaizContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(580);
				match(F_RAIZ);
				setState(581);
				match(T__0);
				setState(582);
				expr();
				setState(583);
				match(T__1);
				setState(584);
				expr();
				setState(585);
				match(T__2);
				}
				break;
			case F_POTE:
				_localctx = new FuncaoPotenciaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(587);
				match(F_POTE);
				setState(588);
				match(T__0);
				setState(589);
				expr();
				setState(590);
				match(T__1);
				setState(591);
				expr();
				setState(592);
				match(T__2);
				}
				break;
			case F_HIPO:
				_localctx = new FuncaoHipotenusaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(594);
				match(F_HIPO);
				setState(595);
				match(T__0);
				setState(596);
				expr();
				setState(597);
				match(T__1);
				setState(598);
				expr();
				setState(599);
				match(T__2);
				}
				break;
			case F_CHAO:
				_localctx = new FuncaoChaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(601);
				match(F_CHAO);
				setState(602);
				match(T__0);
				setState(603);
				expr();
				setState(604);
				match(T__2);
				}
				break;
			case F_TETO:
				_localctx = new FuncaoTetoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(606);
				match(F_TETO);
				setState(607);
				match(T__0);
				setState(608);
				expr();
				setState(609);
				match(T__2);
				}
				break;
			case F_ARRE:
				_localctx = new FuncaoArredondarContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(611);
				match(F_ARRE);
				setState(612);
				match(T__0);
				setState(618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(613);
					expr();
					}
					break;
				case 2:
					{
					setState(614);
					expr();
					setState(615);
					match(T__1);
					setState(616);
					expr();
					}
					break;
				}
				setState(620);
				match(T__2);
				}
				break;
			case F_MINI:
				_localctx = new FuncaoMinimoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(622);
				match(F_MINI);
				setState(623);
				match(T__0);
				setState(624);
				expr();
				setState(625);
				match(T__1);
				setState(626);
				expr();
				setState(627);
				match(T__2);
				}
				break;
			case F_MAXI:
				_localctx = new FuncaoMaximoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(629);
				match(F_MAXI);
				setState(630);
				match(T__0);
				setState(631);
				expr();
				setState(632);
				match(T__1);
				setState(633);
				expr();
				setState(634);
				match(T__2);
				}
				break;
			case F_NUMA:
				_localctx = new FuncaoNumeroAleatorioContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(636);
				match(F_NUMA);
				setState(637);
				match(T__0);
				setState(643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(638);
					expr();
					}
					break;
				case 2:
					{
					setState(639);
					expr();
					setState(640);
					match(T__1);
					setState(641);
					expr();
					}
					break;
				}
				setState(645);
				match(T__2);
				}
				break;
			case F_SEME:
				_localctx = new FuncaoDefinirSementeAleatoriaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(646);
				match(F_SEME);
				setState(647);
				match(T__0);
				setState(648);
				expr();
				setState(649);
				match(T__2);
				}
				break;
			case F_SENO:
				_localctx = new FuncaoSenoContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(651);
				match(F_SENO);
				setState(652);
				match(T__0);
				setState(653);
				expr();
				setState(654);
				match(T__2);
				}
				break;
			case F_COSS:
				_localctx = new FuncaoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(656);
				match(F_COSS);
				setState(657);
				match(T__0);
				setState(658);
				expr();
				setState(659);
				match(T__2);
				}
				break;
			case F_TANG:
				_localctx = new FuncaoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(661);
				match(F_TANG);
				setState(662);
				match(T__0);
				setState(663);
				expr();
				setState(664);
				match(T__2);
				}
				break;
			case F_ASEN:
				_localctx = new FuncaoArcoSenoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(666);
				match(F_ASEN);
				setState(667);
				match(T__0);
				setState(668);
				expr();
				setState(669);
				match(T__2);
				}
				break;
			case F_ACOS:
				_localctx = new FuncaoArcoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(671);
				match(F_ACOS);
				setState(672);
				match(T__0);
				setState(673);
				expr();
				setState(674);
				match(T__2);
				}
				break;
			case F_ATAN:
				_localctx = new FuncaoArcoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(676);
				match(F_ATAN);
				setState(677);
				match(T__0);
				setState(678);
				expr();
				setState(679);
				match(T__2);
				}
				break;
			case F_CAPO:
				_localctx = new FuncaoCartesianoParaPolarContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(681);
				match(F_CAPO);
				setState(682);
				match(T__0);
				setState(683);
				expr();
				setState(684);
				match(T__1);
				setState(685);
				expr();
				setState(686);
				match(T__2);
				}
				break;
			case F_SENH:
				_localctx = new FuncaoSenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(688);
				match(F_SENH);
				setState(689);
				match(T__0);
				setState(690);
				expr();
				setState(691);
				match(T__2);
				}
				break;
			case F_COSH:
				_localctx = new FuncaoCossenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(693);
				match(F_COSH);
				setState(694);
				match(T__0);
				setState(695);
				expr();
				setState(696);
				match(T__2);
				}
				break;
			case F_TANH:
				_localctx = new FuncaoTangenteHiperbolicaContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(698);
				match(F_TANH);
				setState(699);
				match(T__0);
				setState(700);
				expr();
				setState(701);
				match(T__2);
				}
				break;
			case F_LOGA:
				_localctx = new FuncaoLogaritmoContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(703);
				match(F_LOGA);
				setState(704);
				match(T__0);
				setState(710);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(705);
					expr();
					}
					break;
				case 2:
					{
					setState(706);
					expr();
					setState(707);
					match(T__1);
					setState(708);
					expr();
					}
					break;
				}
				setState(712);
				match(T__2);
				}
				break;
			case F_GRRA:
				_localctx = new FuncaoGrausParaRadianosContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(714);
				match(F_GRRA);
				setState(715);
				match(T__0);
				setState(716);
				expr();
				setState(717);
				match(T__2);
				}
				break;
			case F_RAGR:
				_localctx = new FuncaoRadianosParaGrausContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(719);
				match(F_RAGR);
				setState(720);
				match(T__0);
				setState(721);
				expr();
				setState(722);
				match(T__2);
				}
				break;
			case F_INC:
				_localctx = new FuncaoIncrementarContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(724);
				match(F_INC);
				setState(725);
				match(T__0);
				setState(726);
				match(ID);
				setState(727);
				match(T__2);
				}
				break;
			case F_DCM:
				_localctx = new FuncaoDecrementarContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(728);
				match(F_DCM);
				setState(729);
				match(T__0);
				setState(730);
				match(ID);
				setState(731);
				match(T__2);
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
		enterRule(_localctx, 80, RULE_instrucaoGeometrica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(DESE);
			setState(735);
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
		public OpcaoFuncGeomContext opcaoFuncGeom() {
			return getRuleContext(OpcaoFuncGeomContext.class,0);
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
		public OpcaoFuncGeomContext opcaoFuncGeom() {
			return getRuleContext(OpcaoFuncGeomContext.class,0);
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
		public OpcaoFuncGeomContext opcaoFuncGeom() {
			return getRuleContext(OpcaoFuncGeomContext.class,0);
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
		public OpcaoFuncGeomContext opcaoFuncGeom() {
			return getRuleContext(OpcaoFuncGeomContext.class,0);
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
		public OpcaoFuncGeomContext opcaoFuncGeom() {
			return getRuleContext(OpcaoFuncGeomContext.class,0);
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
		public OpcaoFuncGeomContext opcaoFuncGeom() {
			return getRuleContext(OpcaoFuncGeomContext.class,0);
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
		public OpcaoFuncGeomContext opcaoFuncGeom() {
			return getRuleContext(OpcaoFuncGeomContext.class,0);
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
		public OpcaoFuncGeomContext opcaoFuncGeom() {
			return getRuleContext(OpcaoFuncGeomContext.class,0);
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
		public OpcaoFuncGeomContext opcaoFuncGeom() {
			return getRuleContext(OpcaoFuncGeomContext.class,0);
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
		public OpcaoFuncGeomContext opcaoFuncGeom() {
			return getRuleContext(OpcaoFuncGeomContext.class,0);
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
		public OpcaoFuncGeomContext opcaoFuncGeom() {
			return getRuleContext(OpcaoFuncGeomContext.class,0);
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
		enterRule(_localctx, 82, RULE_funcaoGeometrica);
		int _la;
		try {
			setState(927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FG_SEG:
				_localctx = new FuncaoDesenharSegmentoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				match(FG_SEG);
				setState(738);
				match(T__0);
				setState(739);
				expr();
				setState(740);
				match(T__1);
				setState(741);
				expr();
				setState(742);
				match(T__1);
				setState(743);
				expr();
				setState(744);
				match(T__1);
				setState(745);
				expr();
				setState(746);
				match(T__2);
				}
				break;
			case FG_QUA:
				_localctx = new FuncaoDesenharQuadradoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				match(FG_QUA);
				setState(749);
				match(T__0);
				setState(750);
				expr();
				setState(751);
				match(T__1);
				setState(752);
				expr();
				setState(753);
				match(T__1);
				setState(754);
				expr();
				setState(755);
				match(T__2);
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(756);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_RET:
				_localctx = new FuncaoDesenharRetanguloContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(759);
				match(FG_RET);
				setState(760);
				match(T__0);
				setState(761);
				expr();
				setState(762);
				match(T__1);
				setState(763);
				expr();
				setState(764);
				match(T__1);
				setState(765);
				expr();
				setState(766);
				match(T__1);
				setState(767);
				expr();
				setState(768);
				match(T__2);
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(769);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_REA:
				_localctx = new FuncaoDesenharRetanguloArredondadoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(772);
				match(FG_REA);
				setState(773);
				match(T__0);
				setState(774);
				expr();
				setState(775);
				match(T__1);
				setState(776);
				expr();
				setState(777);
				match(T__1);
				setState(778);
				expr();
				setState(779);
				match(T__1);
				setState(780);
				expr();
				setState(781);
				match(T__1);
				setState(782);
				expr();
				setState(783);
				match(T__2);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(784);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_CIC:
				_localctx = new FuncaoDesenharCirculoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(787);
				match(FG_CIC);
				setState(788);
				match(T__0);
				setState(789);
				expr();
				setState(790);
				match(T__1);
				setState(791);
				expr();
				setState(792);
				match(T__1);
				setState(793);
				expr();
				setState(794);
				match(T__2);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(795);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_ELI:
				_localctx = new FuncaoDesenharElipseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(798);
				match(FG_ELI);
				setState(799);
				match(T__0);
				setState(800);
				expr();
				setState(801);
				match(T__1);
				setState(802);
				expr();
				setState(803);
				match(T__1);
				setState(804);
				expr();
				setState(805);
				match(T__1);
				setState(806);
				expr();
				setState(807);
				match(T__2);
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(808);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_ARC:
				_localctx = new FuncaoDesenharArcoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(811);
				match(FG_ARC);
				setState(812);
				match(T__0);
				setState(813);
				expr();
				setState(814);
				match(T__1);
				setState(815);
				expr();
				setState(816);
				match(T__1);
				setState(817);
				expr();
				setState(818);
				match(T__1);
				setState(819);
				expr();
				setState(820);
				match(T__1);
				setState(821);
				expr();
				setState(822);
				match(T__1);
				setState(823);
				expr();
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(824);
					match(T__1);
					setState(825);
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

				setState(828);
				match(T__2);
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(829);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_POR:
				_localctx = new FuncaoDesenharPoligonoRegularContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(832);
				match(FG_POR);
				setState(833);
				match(T__0);
				setState(834);
				expr();
				setState(835);
				match(T__1);
				setState(836);
				expr();
				setState(837);
				match(T__1);
				setState(838);
				expr();
				setState(839);
				match(T__1);
				setState(840);
				expr();
				setState(841);
				match(T__1);
				setState(842);
				expr();
				setState(843);
				match(T__2);
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(844);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_EST:
				_localctx = new FuncaoDesenharEstrelaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(847);
				match(FG_EST);
				setState(848);
				match(T__0);
				setState(849);
				expr();
				setState(850);
				match(T__1);
				setState(851);
				expr();
				setState(852);
				match(T__1);
				setState(853);
				expr();
				setState(854);
				match(T__1);
				setState(855);
				expr();
				setState(856);
				match(T__1);
				setState(857);
				expr();
				setState(858);
				match(T__2);
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(859);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_POL:
				_localctx = new FuncaoDesenharPoligonoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(862);
				match(FG_POL);
				setState(863);
				match(T__0);
				setState(864);
				expr();
				setState(865);
				match(T__1);
				setState(866);
				expr();
				setState(867);
				match(T__1);
				setState(868);
				expr();
				setState(869);
				match(T__1);
				setState(870);
				expr();
				setState(871);
				match(T__1);
				setState(872);
				expr();
				setState(873);
				match(T__1);
				setState(874);
				expr();
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(875);
					match(T__1);
					setState(876);
					expr();
					setState(877);
					match(T__1);
					setState(878);
					expr();
					}
					}
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(885);
				match(T__2);
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(886);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_CQD:
				_localctx = new FuncaoDesenharCurvaQuadraticaContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(889);
				match(FG_CQD);
				setState(890);
				match(T__0);
				setState(891);
				expr();
				setState(892);
				match(T__1);
				setState(893);
				expr();
				setState(894);
				match(T__1);
				setState(895);
				expr();
				setState(896);
				match(T__1);
				setState(897);
				expr();
				setState(898);
				match(T__1);
				setState(899);
				expr();
				setState(900);
				match(T__1);
				setState(901);
				expr();
				setState(902);
				match(T__2);
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(903);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_CCU:
				_localctx = new FuncaoDesenharCurvaCubicaContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(906);
				match(FG_CCU);
				setState(907);
				match(T__0);
				setState(908);
				expr();
				setState(909);
				match(T__1);
				setState(910);
				expr();
				setState(911);
				match(T__1);
				setState(912);
				expr();
				setState(913);
				match(T__1);
				setState(914);
				expr();
				setState(915);
				match(T__1);
				setState(916);
				expr();
				setState(917);
				match(T__1);
				setState(918);
				expr();
				setState(919);
				match(T__1);
				setState(920);
				expr();
				setState(921);
				match(T__1);
				setState(922);
				expr();
				setState(923);
				match(T__2);
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(924);
					opcaoFuncGeom();
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

	public static class OpcaoFuncGeomContext extends ParserRuleContext {
		public List<TerminalNode> SEM() { return getTokens(AuroraLogoParser.SEM); }
		public TerminalNode SEM(int i) {
			return getToken(AuroraLogoParser.SEM, i);
		}
		public TerminalNode PREE() { return getToken(AuroraLogoParser.PREE, 0); }
		public TerminalNode E() { return getToken(AuroraLogoParser.E, 0); }
		public TerminalNode CON() { return getToken(AuroraLogoParser.CON, 0); }
		public OpcaoFuncGeomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcaoFuncGeom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterOpcaoFuncGeom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitOpcaoFuncGeom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitOpcaoFuncGeom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcaoFuncGeomContext opcaoFuncGeom() throws RecognitionException {
		OpcaoFuncGeomContext _localctx = new OpcaoFuncGeomContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_opcaoFuncGeom);
		int _la;
		try {
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(929);
				match(SEM);
				setState(930);
				match(PREE);
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(931);
					match(E);
					setState(932);
					match(SEM);
					setState(933);
					match(CON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				match(SEM);
				setState(937);
				match(CON);
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(938);
					match(E);
					setState(939);
					match(SEM);
					setState(940);
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
		public OpcaoFuncGeomContext opcaoFuncGeom() {
			return getRuleContext(OpcaoFuncGeomContext.class,0);
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
		enterRule(_localctx, 86, RULE_desenharCaminho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(DESE);
			setState(946);
			match(CAM);
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEM) {
				{
				setState(947);
				opcaoFuncGeom();
				}
			}

			setState(950);
			match(T__3);
			setState(954); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(951);
				instCaminho();
				setState(952);
				match(DOT);
				}
				}
				setState(956); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CUR) | (1L << FEC) | (1L << LIN) | (1L << MOV))) != 0) );
			setState(958);
			match(T__4);
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
		enterRule(_localctx, 88, RULE_instCaminho);
		try {
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				_localctx = new InstrucaoCaminhoMoverAteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(960);
				match(MOV);
				setState(961);
				match(ATE);
				setState(962);
				expr();
				setState(963);
				match(T__1);
				setState(964);
				expr();
				}
				break;
			case 2:
				_localctx = new InstrucaoCaminhoLinhaAteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
				match(LIN);
				setState(967);
				match(ATE);
				setState(968);
				expr();
				setState(969);
				match(T__1);
				setState(970);
				expr();
				}
				break;
			case 3:
				_localctx = new InstrucaoCaminhoCurvaQuadraticaAteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(972);
				match(CUR);
				setState(973);
				match(QUAD);
				setState(974);
				match(ATE);
				setState(975);
				expr();
				setState(976);
				match(T__1);
				setState(977);
				expr();
				setState(978);
				match(T__1);
				setState(979);
				expr();
				setState(980);
				match(T__1);
				setState(981);
				expr();
				}
				break;
			case 4:
				_localctx = new InstrucaoCaminhoCurvaCubicaAteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(983);
				match(CUR);
				setState(984);
				match(CUBI);
				setState(985);
				match(ATE);
				setState(986);
				expr();
				setState(987);
				match(T__1);
				setState(988);
				expr();
				setState(989);
				match(T__1);
				setState(990);
				expr();
				setState(991);
				match(T__1);
				setState(992);
				expr();
				setState(993);
				match(T__1);
				setState(994);
				expr();
				setState(995);
				match(T__1);
				setState(996);
				expr();
				}
				break;
			case 5:
				_localctx = new InstrucaoCaminhoFecharCaminhoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(998);
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
		enterRule(_localctx, 90, RULE_consultarTartaruga);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(TART);
			setState(1002);
			match(DOT);
			setState(1003);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (PA - 103)) | (1L << (PX - 103)) | (1L << (PY - 103)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1004);
			match(T__0);
			setState(1005);
			match(T__2);
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

	public static class ConsultarStringContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public TerminalNode DOT() { return getToken(AuroraLogoParser.DOT, 0); }
		public TerminalNode COMP() { return getToken(AuroraLogoParser.COMP, 0); }
		public TerminalNode CARC() { return getToken(AuroraLogoParser.CARC, 0); }
		public TerminalNode SUBS() { return getToken(AuroraLogoParser.SUBS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprIndiceContext exprIndice() {
			return getRuleContext(ExprIndiceContext.class,0);
		}
		public ConsultarStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consultarString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterConsultarString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitConsultarString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitConsultarString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsultarStringContext consultarString() throws RecognitionException {
		ConsultarStringContext _localctx = new ConsultarStringContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_consultarString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(ID);
			setState(1008);
			match(DOT);
			setState(1030);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMP:
				{
				setState(1009);
				match(COMP);
				setState(1010);
				match(T__0);
				setState(1011);
				match(T__2);
				}
				break;
			case CARC:
				{
				setState(1012);
				match(CARC);
				setState(1013);
				match(T__0);
				setState(1014);
				match(T__2);
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(1015);
					match(T__5);
					setState(1016);
					exprIndice();
					setState(1017);
					match(T__6);
					}
				}

				}
				break;
			case SUBS:
				{
				setState(1021);
				match(SUBS);
				setState(1022);
				match(T__0);
				setState(1023);
				expr();
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1024);
					match(T__1);
					setState(1025);
					expr();
					}
				}

				setState(1028);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 94, RULE_formatarTexto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(FORM);
			setState(1033);
			match(T__0);
			setState(1034);
			match(STRING);
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1035);
				match(T__1);
				setState(1036);
				expr();
				}
				}
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1042);
			match(T__2);
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
		enterRule(_localctx, 96, RULE_criarArranjos);
		int _la;
		try {
			setState(1056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CRA:
			case CRR:
				_localctx = new CriarArranjoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				_la = _input.LA(1);
				if ( !(_la==CRA || _la==CRR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1049); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1045);
					match(T__5);
					setState(1046);
					expr();
					setState(1047);
					match(T__6);
					}
					}
					setState(1051); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				}
				break;
			case CRAA:
			case CRRA:
				_localctx = new CriarArranjoAssociativoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				_la = _input.LA(1);
				if ( !(_la==CRAA || _la==CRRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1054);
				match(T__3);
				setState(1055);
				match(T__4);
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
		"\u0004\u0001\u00d0\u0423\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000"+
		"\u0005\u0000d\b\u0000\n\u0000\f\u0000g\t\u0000\u0001\u0000\u0004\u0000"+
		"j\b\u0000\u000b\u0000\f\u0000k\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001t\b\u0001\n\u0001\f\u0001w\t"+
		"\u0001\u0003\u0001y\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001~\b\u0001\u000b\u0001\f\u0001\u007f\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008d\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0093\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a5\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00aa\b\u0005\n\u0005\f\u0005\u00ad\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b2\b\u0006\u0001\u0007"+
		"\u0003\u0007\u00b5\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00ba\b\u0007\n\u0007\f\u0007\u00bd\t\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00c2\b\b\n\b\f\b\u00c5\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00d5\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00dc"+
		"\b\t\u000b\t\f\t\u00dd\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u00e8\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00f6"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0004\t\u00fb\b\t\u000b\t\f\t\u00fc\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u010c\b\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u0112\b\u000b\n\u000b\f\u000b\u0115\t\u000b\u0001"+
		"\u000b\u0003\u000b\u0118\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0004\f\u011f\b\f\u000b\f\f\f\u0120\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u012b\b\r\u000b\r\f\r\u012c\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0134\b\u000e"+
		"\u000b\u000e\f\u000e\u0135\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0004\u000f\u013e\b\u000f\u000b\u000f\f\u000f"+
		"\u013f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u0145\b\u000f\u000b"+
		"\u000f\f\u000f\u0146\u0003\u000f\u0149\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u0151\b\u0010"+
		"\u000b\u0010\f\u0010\u0152\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0004\u0011\u015a\b\u0011\u000b\u0011\f\u0011\u015b\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0164\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u016b\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u017e\b\u0013\u0001\u0013\u0001\u0013\u0004"+
		"\u0013\u0182\b\u0013\u000b\u0013\f\u0013\u0183\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0004\u0014\u0190\b\u0014\u000b\u0014\f\u0014"+
		"\u0191\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u019c\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01a3\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u01ab\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u01bf\b\u0019\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u01c3\b\u001a\u0001\u001a\u0003\u001a\u01c6\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u01cb\b\u001a\u0001\u001a\u0003\u001a"+
		"\u01ce\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u01d7\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u01dd\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u01e3\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u01f0\b \u0001 \u0001 \u0001 \u0001 \u0003 \u01f6\b \u0003"+
		" \u01f8\b \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u0201\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0004\"\u0208\b\""+
		"\u000b\"\f\"\u0209\u0001\"\u0001\"\u0001\"\u0003\"\u020f\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0219\b\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u022a\b\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u026b\b\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0284\b\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u02c7\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u02dd\b\'\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u02f6\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u0303\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0312\b)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u031d"+
		"\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u032a\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u033b"+
		"\b)\u0001)\u0001)\u0003)\u033f\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u034e\b)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u035d\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0005)\u0371\b)\n)\f)\u0374\t)\u0001)\u0001)\u0003)\u0378"+
		"\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0389\b)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u039e\b)\u0003)\u03a0"+
		"\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u03a7\b*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0003*\u03ae\b*\u0003*\u03b0\b*\u0001+\u0001+\u0001+\u0003"+
		"+\u03b5\b+\u0001+\u0001+\u0001+\u0001+\u0004+\u03bb\b+\u000b+\f+\u03bc"+
		"\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u03e8\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0003.\u03fc\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0403"+
		"\b.\u0001.\u0001.\u0003.\u0407\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0005"+
		"/\u040e\b/\n/\f/\u0411\t/\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00040\u041a\b0\u000b0\f0\u041b\u00010\u00010\u00010\u00030\u0421\b"+
		"0\u00010\u0000\u00001\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`\u0000\u0017\u0001\u0000\u00bd\u00c0\u0001\u0000\u00ab\u00bc\u0001\u0000"+
		"\u00a2\u00a5\u0002\u0000YY\u00a6\u00aa\u0001\u0000\u00c1\u00c2\u0002\u0000"+
		",,WW\u0002\u0000\u00c9\u00ca\u00cc\u00cd\u0001\u0000XY\u0002\u0000\u001c"+
		"\u001c44\u0004\u0000\r\r\u0010\u0010!!++\u0001\u0000Zd\u0001\u0000ef\u0002"+
		"\u000022HH\u0001\u0000\u0096\u0097\u0001\u0000\u0098\u0099\u0001\u0000"+
		"\u009a\u009b\u0001\u0000\u009c\u009d\u0001\u0000\u009e\u009f\u0001\u0000"+
		"\u00a0\u00a1\u0003\u0000\n\n\u0011\u0011CC\u0001\u0000gi\u0002\u0000\u0018"+
		"\u0018\u001a\u001a\u0002\u0000\u0019\u0019\u001b\u001b\u049f\u0000e\u0001"+
		"\u0000\u0000\u0000\u0002m\u0001\u0000\u0000\u0000\u0004\u008c\u0001\u0000"+
		"\u0000\u0000\u0006\u0092\u0001\u0000\u0000\u0000\b\u00a4\u0001\u0000\u0000"+
		"\u0000\n\u00a6\u0001\u0000\u0000\u0000\f\u00ae\u0001\u0000\u0000\u0000"+
		"\u000e\u00b4\u0001\u0000\u0000\u0000\u0010\u00be\u0001\u0000\u0000\u0000"+
		"\u0012\u010b\u0001\u0000\u0000\u0000\u0014\u010d\u0001\u0000\u0000\u0000"+
		"\u0016\u010f\u0001\u0000\u0000\u0000\u0018\u0119\u0001\u0000\u0000\u0000"+
		"\u001a\u0124\u0001\u0000\u0000\u0000\u001c\u0130\u0001\u0000\u0000\u0000"+
		"\u001e\u0139\u0001\u0000\u0000\u0000 \u014c\u0001\u0000\u0000\u0000\""+
		"\u0154\u0001\u0000\u0000\u0000$\u015f\u0001\u0000\u0000\u0000&\u0163\u0001"+
		"\u0000\u0000\u0000(\u0187\u0001\u0000\u0000\u0000*\u0195\u0001\u0000\u0000"+
		"\u0000,\u0197\u0001\u0000\u0000\u0000.\u0199\u0001\u0000\u0000\u00000"+
		"\u01aa\u0001\u0000\u0000\u00002\u01be\u0001\u0000\u0000\u00004\u01c5\u0001"+
		"\u0000\u0000\u00006\u01cf\u0001\u0000\u0000\u00008\u01d1\u0001\u0000\u0000"+
		"\u0000:\u01d8\u0001\u0000\u0000\u0000<\u01de\u0001\u0000\u0000\u0000>"+
		"\u01e4\u0001\u0000\u0000\u0000@\u01e9\u0001\u0000\u0000\u0000B\u01f9\u0001"+
		"\u0000\u0000\u0000D\u0229\u0001\u0000\u0000\u0000F\u022b\u0001\u0000\u0000"+
		"\u0000H\u022d\u0001\u0000\u0000\u0000J\u0230\u0001\u0000\u0000\u0000L"+
		"\u0233\u0001\u0000\u0000\u0000N\u02dc\u0001\u0000\u0000\u0000P\u02de\u0001"+
		"\u0000\u0000\u0000R\u039f\u0001\u0000\u0000\u0000T\u03af\u0001\u0000\u0000"+
		"\u0000V\u03b1\u0001\u0000\u0000\u0000X\u03e7\u0001\u0000\u0000\u0000Z"+
		"\u03e9\u0001\u0000\u0000\u0000\\\u03ef\u0001\u0000\u0000\u0000^\u0408"+
		"\u0001\u0000\u0000\u0000`\u0420\u0001\u0000\u0000\u0000bd\u0003\u0002"+
		"\u0001\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000hj\u0003\u0004\u0002\u0000ih\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000l\u0001\u0001\u0000\u0000\u0000mn\u00050\u0000\u0000no\u0005"+
		"\u00c6\u0000\u0000ox\u0005\u0001\u0000\u0000pu\u0005\u00c7\u0000\u0000"+
		"qr\u0005\u0002\u0000\u0000rt\u0005\u00c7\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xp\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z{\u0005\u0003\u0000\u0000{}\u0005\u0004\u0000\u0000|~\u0003\u0006\u0003"+
		"\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0005\u0000\u0000\u0082\u0003"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0003\b\u0004\u0000\u0084\u0085\u0005"+
		"\u00c3\u0000\u0000\u0085\u008d\u0001\u0000\u0000\u0000\u0086\u008d\u0003"+
		"\u0016\u000b\u0000\u0087\u008d\u0003\u001e\u000f\u0000\u0088\u008d\u0003"+
		"\"\u0011\u0000\u0089\u008d\u0003&\u0013\u0000\u008a\u008d\u0003(\u0014"+
		"\u0000\u008b\u008d\u0003V+\u0000\u008c\u0083\u0001\u0000\u0000\u0000\u008c"+
		"\u0086\u0001\u0000\u0000\u0000\u008c\u0087\u0001\u0000\u0000\u0000\u008c"+
		"\u0088\u0001\u0000\u0000\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u0005\u0001\u0000\u0000\u0000\u008e\u0093\u0003\u0004\u0002\u0000\u008f"+
		"\u0090\u0003.\u0017\u0000\u0090\u0091\u0005\u00c3\u0000\u0000\u0091\u0093"+
		"\u0001\u0000\u0000\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u008f"+
		"\u0001\u0000\u0000\u0000\u0093\u0007\u0001\u0000\u0000\u0000\u0094\u00a5"+
		"\u00030\u0018\u0000\u0095\u00a5\u00032\u0019\u0000\u0096\u00a5\u00038"+
		"\u001c\u0000\u0097\u00a5\u0003H$\u0000\u0098\u00a5\u0003J%\u0000\u0099"+
		"\u00a5\u0003L&\u0000\u009a\u00a5\u0003:\u001d\u0000\u009b\u00a5\u0003"+
		"<\u001e\u0000\u009c\u00a5\u0003>\u001f\u0000\u009d\u00a5\u0003@ \u0000"+
		"\u009e\u00a5\u0003B!\u0000\u009f\u00a5\u0003D\"\u0000\u00a0\u00a5\u0003"+
		"*\u0015\u0000\u00a1\u00a5\u0003,\u0016\u0000\u00a2\u00a5\u0003P(\u0000"+
		"\u00a3\u00a5\u0003\n\u0005\u0000\u00a4\u0094\u0001\u0000\u0000\u0000\u00a4"+
		"\u0095\u0001\u0000\u0000\u0000\u00a4\u0096\u0001\u0000\u0000\u0000\u00a4"+
		"\u0097\u0001\u0000\u0000\u0000\u00a4\u0098\u0001\u0000\u0000\u0000\u00a4"+
		"\u0099\u0001\u0000\u0000\u0000\u00a4\u009a\u0001\u0000\u0000\u0000\u00a4"+
		"\u009b\u0001\u0000\u0000\u0000\u00a4\u009c\u0001\u0000\u0000\u0000\u00a4"+
		"\u009d\u0001\u0000\u0000\u0000\u00a4\u009e\u0001\u0000\u0000\u0000\u00a4"+
		"\u009f\u0001\u0000\u0000\u0000\u00a4\u00a0\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\t\u0001\u0000\u0000\u0000\u00a6\u00ab"+
		"\u0003\f\u0006\u0000\u00a7\u00a8\u0007\u0000\u0000\u0000\u00a8\u00aa\u0003"+
		"\f\u0006\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u000b\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b1\u0003\u000e\u0007\u0000\u00af\u00b0\u0007\u0001"+
		"\u0000\u0000\u00b0\u00b2\u0003\u000e\u0007\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\r\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b5\u0007\u0002\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00bb\u0003\u0010\b\u0000\u00b7\u00b8\u0007\u0002\u0000\u0000"+
		"\u00b8\u00ba\u0003\u0010\b\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bc\u000f\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00be\u00c3\u0003\u0012\t\u0000\u00bf\u00c0"+
		"\u0007\u0003\u0000\u0000\u00c0\u00c2\u0003\u0012\t\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u0011\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0007"+
		"\u0004\u0000\u0000\u00c7\u010c\u0003\u0012\t\u0000\u00c8\u010c\u0005\u00c9"+
		"\u0000\u0000\u00c9\u010c\u0005\u00ca\u0000\u0000\u00ca\u010c\u0005A\u0000"+
		"\u0000\u00cb\u00d4\u0005\u00c4\u0000\u0000\u00cc\u00cd\u0005\u00c3\u0000"+
		"\u0000\u00cd\u00ce\u0005l\u0000\u0000\u00ce\u00cf\u0005\u0001\u0000\u0000"+
		"\u00cf\u00d5\u0005\u0003\u0000\u0000\u00d0\u00d1\u0005\u00c3\u0000\u0000"+
		"\u00d1\u00d2\u0005k\u0000\u0000\u00d2\u00d3\u0005\u0001\u0000\u0000\u00d3"+
		"\u00d5\u0005\u0003\u0000\u0000\u00d4\u00cc\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5"+
		"\u010c\u0001\u0000\u0000\u0000\u00d6\u00db\u0005\u00c4\u0000\u0000\u00d7"+
		"\u00d8\u0005\u0006\u0000\u0000\u00d8\u00d9\u0003\n\u0005\u0000\u00d9\u00da"+
		"\u0005\u0007\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d7"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e7"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u00c3\u0000\u0000\u00e0\u00e1"+
		"\u0005l\u0000\u0000\u00e1\u00e2\u0005\u0001\u0000\u0000\u00e2\u00e8\u0005"+
		"\u0003\u0000\u0000\u00e3\u00e4\u0005\u00c3\u0000\u0000\u00e4\u00e5\u0005"+
		"k\u0000\u0000\u00e5\u00e6\u0005\u0001\u0000\u0000\u00e6\u00e8\u0005\u0003"+
		"\u0000\u0000\u00e7\u00df\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u010c\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0005\u00c4\u0000\u0000\u00ea\u00eb\u0005\u0004"+
		"\u0000\u0000\u00eb\u00ec\u0003\n\u0005\u0000\u00ec\u00f5\u0005\u0005\u0000"+
		"\u0000\u00ed\u00ee\u0005\u00c3\u0000\u0000\u00ee\u00ef\u0005l\u0000\u0000"+
		"\u00ef\u00f0\u0005\u0001\u0000\u0000\u00f0\u00f6\u0005\u0003\u0000\u0000"+
		"\u00f1\u00f2\u0005\u00c3\u0000\u0000\u00f2\u00f3\u0005k\u0000\u0000\u00f3"+
		"\u00f4\u0005\u0001\u0000\u0000\u00f4\u00f6\u0005\u0003\u0000\u0000\u00f5"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f5\u00f1\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u010c\u0001\u0000\u0000\u0000\u00f7"+
		"\u00fa\u0005\u00c4\u0000\u0000\u00f8\u00f9\u0005\u00c3\u0000\u0000\u00f9"+
		"\u00fb\u0005\u00c8\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u010c\u0001\u0000\u0000\u0000\u00fe"+
		"\u010c\u0005\u00cc\u0000\u0000\u00ff\u010c\u0005\u00cd\u0000\u0000\u0100"+
		"\u010c\u0007\u0005\u0000\u0000\u0101\u010c\u00036\u001b\u0000\u0102\u010c"+
		"\u0003N\'\u0000\u0103\u010c\u0003Z-\u0000\u0104\u010c\u0003\\.\u0000\u0105"+
		"\u010c\u0003^/\u0000\u0106\u010c\u0003$\u0012\u0000\u0107\u0108\u0005"+
		"\u0001\u0000\u0000\u0108\u0109\u0003\n\u0005\u0000\u0109\u010a\u0005\u0003"+
		"\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u00c6\u0001\u0000"+
		"\u0000\u0000\u010b\u00c8\u0001\u0000\u0000\u0000\u010b\u00c9\u0001\u0000"+
		"\u0000\u0000\u010b\u00ca\u0001\u0000\u0000\u0000\u010b\u00cb\u0001\u0000"+
		"\u0000\u0000\u010b\u00d6\u0001\u0000\u0000\u0000\u010b\u00e9\u0001\u0000"+
		"\u0000\u0000\u010b\u00f7\u0001\u0000\u0000\u0000\u010b\u00fe\u0001\u0000"+
		"\u0000\u0000\u010b\u00ff\u0001\u0000\u0000\u0000\u010b\u0100\u0001\u0000"+
		"\u0000\u0000\u010b\u0101\u0001\u0000\u0000\u0000\u010b\u0102\u0001\u0000"+
		"\u0000\u0000\u010b\u0103\u0001\u0000\u0000\u0000\u010b\u0104\u0001\u0000"+
		"\u0000\u0000\u010b\u0105\u0001\u0000\u0000\u0000\u010b\u0106\u0001\u0000"+
		"\u0000\u0000\u010b\u0107\u0001\u0000\u0000\u0000\u010c\u0013\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0003\n\u0005\u0000\u010e\u0015\u0001\u0000\u0000"+
		"\u0000\u010f\u0113\u0003\u0018\f\u0000\u0110\u0112\u0003\u001a\r\u0000"+
		"\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000"+
		"\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000"+
		"\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0116\u0118\u0003\u001c\u000e\u0000\u0117\u0116\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0017\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0005M\u0000\u0000\u011a\u011b\u0003\u0014\n\u0000\u011b"+
		"\u011c\u0005(\u0000\u0000\u011c\u011e\u0005\u0004\u0000\u0000\u011d\u011f"+
		"\u0003\u0004\u0002\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0005\u0005\u0000\u0000\u0123\u0019\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0005N\u0000\u0000\u0125\u0126\u0005M\u0000\u0000\u0126\u0127\u0003\u0014"+
		"\n\u0000\u0127\u0128\u0005(\u0000\u0000\u0128\u012a\u0005\u0004\u0000"+
		"\u0000\u0129\u012b\u0003\u0004\u0002\u0000\u012a\u0129\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0005\u0005\u0000\u0000\u012f\u001b\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0005N\u0000\u0000\u0131\u0133\u0005\u0004\u0000\u0000"+
		"\u0132\u0134\u0003\u0004\u0002\u0000\u0133\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0005\u0005\u0000\u0000\u0138\u001d\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0005U\u0000\u0000\u013a\u013b\u0005\u00c4\u0000\u0000\u013b"+
		"\u013d\u0005\u0004\u0000\u0000\u013c\u013e\u0003 \u0010\u0000\u013d\u013c"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u013d"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0148"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0005>\u0000\u0000\u0142\u0144\u0005"+
		"\b\u0000\u0000\u0143\u0145\u0003\u0004\u0002\u0000\u0144\u0143\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0149\u0001\u0000"+
		"\u0000\u0000\u0148\u0141\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u0005"+
		"\u0000\u0000\u014b\u001f\u0001\u0000\u0000\u0000\u014c\u014d\u0005)\u0000"+
		"\u0000\u014d\u014e\u0007\u0006\u0000\u0000\u014e\u0150\u0005\b\u0000\u0000"+
		"\u014f\u0151\u0003\u0004\u0002\u0000\u0150\u014f\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0001\u0000\u0000\u0000\u0153!\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0005I\u0000\u0000\u0155\u0156\u0003\n\u0005\u0000\u0156\u0157"+
		"\u0007\u0007\u0000\u0000\u0157\u0159\u0005\u0004\u0000\u0000\u0158\u015a"+
		"\u0003\u0004\u0002\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0005\u0005\u0000\u0000\u015e#\u0001\u0000\u0000\u0000\u015f\u0160\u0005"+
		"J\u0000\u0000\u0160%\u0001\u0000\u0000\u0000\u0161\u0162\u0005\'\u0000"+
		"\u0000\u0162\u0164\u0003\u0014\n\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000"+
		"\u0165\u017d\u0005I\u0000\u0000\u0166\u0167\u0007\b\u0000\u0000\u0167"+
		"\u016a\u0005\u00c4\u0000\u0000\u0168\u0169\u0005%\u0000\u0000\u0169\u016b"+
		"\u0003\n\u0005\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001"+
		"\u0000\u0000\u0000\u016b\u017e\u0001\u0000\u0000\u0000\u016c\u016d\u0005"+
		"P\u0000\u0000\u016d\u016e\u0005\u00c4\u0000\u0000\u016e\u016f\u0005\u0012"+
		"\u0000\u0000\u016f\u017e\u0003\n\u0005\u0000\u0170\u0171\u0005;\u0000"+
		"\u0000\u0171\u0172\u0005\u00c4\u0000\u0000\u0172\u0173\u0005D\u0000\u0000"+
		"\u0173\u017e\u0003\n\u0005\u0000\u0174\u0175\u0005\"\u0000\u0000\u0175"+
		"\u0176\u0005\u00c4\u0000\u0000\u0176\u0177\u0005D\u0000\u0000\u0177\u017e"+
		"\u0003\n\u0005\u0000\u0178\u0179\u0005Q\u0000\u0000\u0179\u017a\u0003"+
		"\n\u0005\u0000\u017a\u017b\u0005\u001d\u0000\u0000\u017b\u017c\u0005\u00c4"+
		"\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u0166\u0001\u0000"+
		"\u0000\u0000\u017d\u016c\u0001\u0000\u0000\u0000\u017d\u0170\u0001\u0000"+
		"\u0000\u0000\u017d\u0174\u0001\u0000\u0000\u0000\u017d\u0178\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f\u0181\u0005\u0004\u0000\u0000\u0180\u0182\u0003\u0004"+
		"\u0002\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000"+
		"\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u0005"+
		"\u0000\u0000\u0186\'\u0001\u0000\u0000\u0000\u0187\u0188\u0005?\u0000"+
		"\u0000\u0188\u0189\u0005\u000e\u0000\u0000\u0189\u018a\u0005\u00c4\u0000"+
		"\u0000\u018a\u018b\u0005%\u0000\u0000\u018b\u018c\u0003\n\u0005\u0000"+
		"\u018c\u018d\u0005I\u0000\u0000\u018d\u018f\u0005\u0004\u0000\u0000\u018e"+
		"\u0190\u0003\u0004\u0002\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193"+
		"\u0194\u0005\u0005\u0000\u0000\u0194)\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0005@\u0000\u0000\u0196+\u0001\u0000\u0000\u0000\u0197\u0198\u0005\u0013"+
		"\u0000\u0000\u0198-\u0001\u0000\u0000\u0000\u0199\u019b\u0005K\u0000\u0000"+
		"\u019a\u019c\u0003\n\u0005\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0001\u0000\u0000\u0000\u019c/\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0005V\u0000\u0000\u019e\u019f\u0005?\u0000\u0000\u019f\u01a2\u0007\t"+
		"\u0000\u0000\u01a0\u01a1\u0005%\u0000\u0000\u01a1\u01a3\u0003\n\u0005"+
		"\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a3\u01ab\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005V\u0000\u0000"+
		"\u01a5\u01a6\u0005?\u0000\u0000\u01a6\u01a7\u0003\n\u0005\u0000\u01a7"+
		"\u01a8\u0005\u0002\u0000\u0000\u01a8\u01a9\u0003\n\u0005\u0000\u01a9\u01ab"+
		"\u0001\u0000\u0000\u0000\u01aa\u019d\u0001\u0000\u0000\u0000\u01aa\u01a4"+
		"\u0001\u0000\u0000\u0000\u01ab1\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005"+
		"T\u0000\u0000\u01ad\u01ae\u0005\u0015\u0000\u0000\u01ae\u01af\u0005#\u0000"+
		"\u0000\u01af\u01b0\u0005B\u0000\u0000\u01b0\u01b1\u0005?\u0000\u0000\u01b1"+
		"\u01bf\u00034\u001a\u0000\u01b2\u01b3\u0005T\u0000\u0000\u01b3\u01b4\u0005"+
		"\u0015\u0000\u0000\u01b4\u01b5\u0005#\u0000\u0000\u01b5\u01b6\u0005E\u0000"+
		"\u0000\u01b6\u01b7\u0005?\u0000\u0000\u01b7\u01bf\u00034\u001a\u0000\u01b8"+
		"\u01b9\u0005T\u0000\u0000\u01b9\u01ba\u0005\u0015\u0000\u0000\u01ba\u01bb"+
		"\u0005#\u0000\u0000\u01bb\u01bc\u0005/\u0000\u0000\u01bc\u01bd\u0005?"+
		"\u0000\u0000\u01bd\u01bf\u00034\u001a\u0000\u01be\u01ac\u0001\u0000\u0000"+
		"\u0000\u01be\u01b2\u0001\u0000\u0000\u0000\u01be\u01b8\u0001\u0000\u0000"+
		"\u0000\u01bf3\u0001\u0000\u0000\u0000\u01c0\u01c3\u00036\u001b\u0000\u01c1"+
		"\u01c3\u0003\n\u0005\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c6"+
		"\u0007\n\u0000\u0000\u01c5\u01c2\u0001\u0000\u0000\u0000\u01c5\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c6\u01cd\u0001\u0000\u0000\u0000\u01c7\u01c8\u0003"+
		"\n\u0005\u0000\u01c8\u01c9\u0007\u0007\u0000\u0000\u01c9\u01cb\u0001\u0000"+
		"\u0000\u0000\u01ca\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ce\u0007\u000b"+
		"\u0000\u0000\u01cd\u01ca\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000"+
		"\u0000\u0000\u01ce5\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005\u00cb\u0000"+
		"\u0000\u01d07\u0001\u0000\u0000\u0000\u01d1\u01d6\u00051\u0000\u0000\u01d2"+
		"\u01d3\u0005%\u0000\u0000\u01d3\u01d4\u0003\n\u0005\u0000\u01d4\u01d5"+
		"\u0007\f\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d79\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0005&\u0000\u0000\u01d9\u01dc\u0005B\u0000\u0000"+
		"\u01da\u01db\u0005%\u0000\u0000\u01db\u01dd\u0003\n\u0005\u0000\u01dc"+
		"\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd"+
		";\u0001\u0000\u0000\u0000\u01de\u01df\u0005\u001e\u0000\u0000\u01df\u01e2"+
		"\u0005B\u0000\u0000\u01e0\u01e1\u0005%\u0000\u0000\u01e1\u01e3\u0003\n"+
		"\u0005\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e3=\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u000b\u0000"+
		"\u0000\u01e5\u01e6\u00053\u0000\u0000\u01e6\u01e7\u0005?\u0000\u0000\u01e7"+
		"\u01e8\u0003\n\u0005\u0000\u01e8?\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\u0005*\u0000\u0000\u01ea\u01f7\u0003\n\u0005\u0000\u01eb\u01ec\u0005"+
		"<\u0000\u0000\u01ec\u01ef\u0005L\u0000\u0000\u01ed\u01ee\u0005F\u0000"+
		"\u0000\u01ee\u01f0\u00059\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f8\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f2\u0005=\u0000\u0000\u01f2\u01f5\u0005 \u0000\u0000\u01f3\u01f4"+
		"\u0005F\u0000\u0000\u01f4\u01f6\u00059\u0000\u0000\u01f5\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001\u0000"+
		"\u0000\u0000\u01f7\u01eb\u0001\u0000\u0000\u0000\u01f7\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8A\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u00056\u0000\u0000\u01fa\u01fb\u0005\u00c4\u0000\u0000"+
		"\u01fbC\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005\u00c4\u0000\u0000\u01fd"+
		"\u0200\u0007\r\u0000\u0000\u01fe\u0201\u0003\n\u0005\u0000\u01ff\u0201"+
		"\u0003`0\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0200\u01ff\u0001\u0000"+
		"\u0000\u0000\u0201\u022a\u0001\u0000\u0000\u0000\u0202\u0207\u0005\u00c4"+
		"\u0000\u0000\u0203\u0204\u0005\u0006\u0000\u0000\u0204\u0205\u0003F#\u0000"+
		"\u0205\u0206\u0005\u0007\u0000\u0000\u0206\u0208\u0001\u0000\u0000\u0000"+
		"\u0207\u0203\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000"+
		"\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000"+
		"\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020e\u0007\r\u0000\u0000\u020c"+
		"\u020f\u0003\n\u0005\u0000\u020d\u020f\u0003`0\u0000\u020e\u020c\u0001"+
		"\u0000\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020f\u022a\u0001"+
		"\u0000\u0000\u0000\u0210\u0211\u0005\u00c4\u0000\u0000\u0211\u0212\u0005"+
		"\u0004\u0000\u0000\u0212\u0213\u0003F#\u0000\u0213\u0214\u0005\u0005\u0000"+
		"\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0218\u0007\r\u0000\u0000"+
		"\u0216\u0219\u0003\n\u0005\u0000\u0217\u0219\u0003`0\u0000\u0218\u0216"+
		"\u0001\u0000\u0000\u0000\u0218\u0217\u0001\u0000\u0000\u0000\u0219\u022a"+
		"\u0001\u0000\u0000\u0000\u021a\u021b\u0005\u00c4\u0000\u0000\u021b\u021c"+
		"\u0007\u000e\u0000\u0000\u021c\u022a\u0003\n\u0005\u0000\u021d\u021e\u0005"+
		"\u00c4\u0000\u0000\u021e\u021f\u0007\u000f\u0000\u0000\u021f\u022a\u0003"+
		"\n\u0005\u0000\u0220\u0221\u0005\u00c4\u0000\u0000\u0221\u0222\u0007\u0010"+
		"\u0000\u0000\u0222\u022a\u0003\n\u0005\u0000\u0223\u0224\u0005\u00c4\u0000"+
		"\u0000\u0224\u0225\u0007\u0011\u0000\u0000\u0225\u022a\u0003\n\u0005\u0000"+
		"\u0226\u0227\u0005\u00c4\u0000\u0000\u0227\u0228\u0007\u0012\u0000\u0000"+
		"\u0228\u022a\u0003\n\u0005\u0000\u0229\u01fc\u0001\u0000\u0000\u0000\u0229"+
		"\u0202\u0001\u0000\u0000\u0000\u0229\u0210\u0001\u0000\u0000\u0000\u0229"+
		"\u021a\u0001\u0000\u0000\u0000\u0229\u021d\u0001\u0000\u0000\u0000\u0229"+
		"\u0220\u0001\u0000\u0000\u0000\u0229\u0223\u0001\u0000\u0000\u0000\u0229"+
		"\u0226\u0001\u0000\u0000\u0000\u022aE\u0001\u0000\u0000\u0000\u022b\u022c"+
		"\u0003\n\u0005\u0000\u022cG\u0001\u0000\u0000\u0000\u022d\u022e\u0005"+
		"\t\u0000\u0000\u022e\u022f\u0005B\u0000\u0000\u022fI\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u00057\u0000\u0000\u0231\u0232\u0005B\u0000\u0000\u0232"+
		"K\u0001\u0000\u0000\u0000\u0233\u0234\u00058\u0000\u0000\u0234M\u0001"+
		"\u0000\u0000\u0000\u0235\u0236\u0005\u0089\u0000\u0000\u0236\u0237\u0005"+
		"\u0001\u0000\u0000\u0237\u0238\u0003\n\u0005\u0000\u0238\u0239\u0005\u0003"+
		"\u0000\u0000\u0239\u02dd\u0001\u0000\u0000\u0000\u023a\u023b\u0005\u0081"+
		"\u0000\u0000\u023b\u023c\u0005\u0001\u0000\u0000\u023c\u023d\u0003\n\u0005"+
		"\u0000\u023d\u023e\u0005\u0003\u0000\u0000\u023e\u02dd\u0001\u0000\u0000"+
		"\u0000\u023f\u0240\u0005\u0080\u0000\u0000\u0240\u0241\u0005\u0001\u0000"+
		"\u0000\u0241\u0242\u0003\n\u0005\u0000\u0242\u0243\u0005\u0003\u0000\u0000"+
		"\u0243\u02dd\u0001\u0000\u0000\u0000\u0244\u0245\u0005\u0082\u0000\u0000"+
		"\u0245\u0246\u0005\u0001\u0000\u0000\u0246\u0247\u0003\n\u0005\u0000\u0247"+
		"\u0248\u0005\u0002\u0000\u0000\u0248\u0249\u0003\n\u0005\u0000\u0249\u024a"+
		"\u0005\u0003\u0000\u0000\u024a\u02dd\u0001\u0000\u0000\u0000\u024b\u024c"+
		"\u0005~\u0000\u0000\u024c\u024d\u0005\u0001\u0000\u0000\u024d\u024e\u0003"+
		"\n\u0005\u0000\u024e\u024f\u0005\u0002\u0000\u0000\u024f\u0250\u0003\n"+
		"\u0005\u0000\u0250\u0251\u0005\u0003\u0000\u0000\u0251\u02dd\u0001\u0000"+
		"\u0000\u0000\u0252\u0253\u0005x\u0000\u0000\u0253\u0254\u0005\u0001\u0000"+
		"\u0000\u0254\u0255\u0003\n\u0005\u0000\u0255\u0256\u0005\u0002\u0000\u0000"+
		"\u0256\u0257\u0003\n\u0005\u0000\u0257\u0258\u0005\u0003\u0000\u0000\u0258"+
		"\u02dd\u0001\u0000\u0000\u0000\u0259\u025a\u0005s\u0000\u0000\u025a\u025b"+
		"\u0005\u0001\u0000\u0000\u025b\u025c\u0003\n\u0005\u0000\u025c\u025d\u0005"+
		"\u0003\u0000\u0000\u025d\u02dd\u0001\u0000\u0000\u0000\u025e\u025f\u0005"+
		"\u0088\u0000\u0000\u025f\u0260\u0005\u0001\u0000\u0000\u0260\u0261\u0003"+
		"\n\u0005\u0000\u0261\u0262\u0005\u0003\u0000\u0000\u0262\u02dd\u0001\u0000"+
		"\u0000\u0000\u0263\u0264\u0005o\u0000\u0000\u0264\u026a\u0005\u0001\u0000"+
		"\u0000\u0265\u026b\u0003\n\u0005\u0000\u0266\u0267\u0003\n\u0005\u0000"+
		"\u0267\u0268\u0005\u0002\u0000\u0000\u0268\u0269\u0003\n\u0005\u0000\u0269"+
		"\u026b\u0001\u0000\u0000\u0000\u026a\u0265\u0001\u0000\u0000\u0000\u026a"+
		"\u0266\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c"+
		"\u026d\u0005\u0003\u0000\u0000\u026d\u02dd\u0001\u0000\u0000\u0000\u026e"+
		"\u026f\u0005|\u0000\u0000\u026f\u0270\u0005\u0001\u0000\u0000\u0270\u0271"+
		"\u0003\n\u0005\u0000\u0271\u0272\u0005\u0002\u0000\u0000\u0272\u0273\u0003"+
		"\n\u0005\u0000\u0273\u0274\u0005\u0003\u0000\u0000\u0274\u02dd\u0001\u0000"+
		"\u0000\u0000\u0275\u0276\u0005{\u0000\u0000\u0276\u0277\u0005\u0001\u0000"+
		"\u0000\u0277\u0278\u0003\n\u0005\u0000\u0278\u0279\u0005\u0002\u0000\u0000"+
		"\u0279\u027a\u0003\n\u0005\u0000\u027a\u027b\u0005\u0003\u0000\u0000\u027b"+
		"\u02dd\u0001\u0000\u0000\u0000\u027c\u027d\u0005}\u0000\u0000\u027d\u0283"+
		"\u0005\u0001\u0000\u0000\u027e\u0284\u0003\n\u0005\u0000\u027f\u0280\u0003"+
		"\n\u0005\u0000\u0280\u0281\u0005\u0002\u0000\u0000\u0281\u0282\u0003\n"+
		"\u0005\u0000\u0282\u0284\u0001\u0000\u0000\u0000\u0283\u027e\u0001\u0000"+
		"\u0000\u0000\u0283\u027f\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000"+
		"\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u02dd\u0005\u0003"+
		"\u0000\u0000\u0286\u0287\u0005\u0083\u0000\u0000\u0287\u0288\u0005\u0001"+
		"\u0000\u0000\u0288\u0289\u0003\n\u0005\u0000\u0289\u028a\u0005\u0003\u0000"+
		"\u0000\u028a\u02dd\u0001\u0000\u0000\u0000\u028b\u028c\u0005\u0085\u0000"+
		"\u0000\u028c\u028d\u0005\u0001\u0000\u0000\u028d\u028e\u0003\n\u0005\u0000"+
		"\u028e\u028f\u0005\u0003\u0000\u0000\u028f\u02dd\u0001\u0000\u0000\u0000"+
		"\u0290\u0291\u0005u\u0000\u0000\u0291\u0292\u0005\u0001\u0000\u0000\u0292"+
		"\u0293\u0003\n\u0005\u0000\u0293\u0294\u0005\u0003\u0000\u0000\u0294\u02dd"+
		"\u0001\u0000\u0000\u0000\u0295\u0296\u0005\u0086\u0000\u0000\u0296\u0297"+
		"\u0005\u0001\u0000\u0000\u0297\u0298\u0003\n\u0005\u0000\u0298\u0299\u0005"+
		"\u0003\u0000\u0000\u0299\u02dd\u0001\u0000\u0000\u0000\u029a\u029b\u0005"+
		"p\u0000\u0000\u029b\u029c\u0005\u0001\u0000\u0000\u029c\u029d\u0003\n"+
		"\u0005\u0000\u029d\u029e\u0005\u0003\u0000\u0000\u029e\u02dd\u0001\u0000"+
		"\u0000\u0000\u029f\u02a0\u0005n\u0000\u0000\u02a0\u02a1\u0005\u0001\u0000"+
		"\u0000\u02a1\u02a2\u0003\n\u0005\u0000\u02a2\u02a3\u0005\u0003\u0000\u0000"+
		"\u02a3\u02dd\u0001\u0000\u0000\u0000\u02a4\u02a5\u0005q\u0000\u0000\u02a5"+
		"\u02a6\u0005\u0001\u0000\u0000\u02a6\u02a7\u0003\n\u0005\u0000\u02a7\u02a8"+
		"\u0005\u0003\u0000\u0000\u02a8\u02dd\u0001\u0000\u0000\u0000\u02a9\u02aa"+
		"\u0005r\u0000\u0000\u02aa\u02ab\u0005\u0001\u0000\u0000\u02ab\u02ac\u0003"+
		"\n\u0005\u0000\u02ac\u02ad\u0005\u0002\u0000\u0000\u02ad\u02ae\u0003\n"+
		"\u0005\u0000\u02ae\u02af\u0005\u0003\u0000\u0000\u02af\u02dd\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b1\u0005\u0084\u0000\u0000\u02b1\u02b2\u0005\u0001"+
		"\u0000\u0000\u02b2\u02b3\u0003\n\u0005\u0000\u02b3\u02b4\u0005\u0003\u0000"+
		"\u0000\u02b4\u02dd\u0001\u0000\u0000\u0000\u02b5\u02b6\u0005t\u0000\u0000"+
		"\u02b6\u02b7\u0005\u0001\u0000\u0000\u02b7\u02b8\u0003\n\u0005\u0000\u02b8"+
		"\u02b9\u0005\u0003\u0000\u0000\u02b9\u02dd\u0001\u0000\u0000\u0000\u02ba"+
		"\u02bb\u0005\u0087\u0000\u0000\u02bb\u02bc\u0005\u0001\u0000\u0000\u02bc"+
		"\u02bd\u0003\n\u0005\u0000\u02bd\u02be\u0005\u0003\u0000\u0000\u02be\u02dd"+
		"\u0001\u0000\u0000\u0000\u02bf\u02c0\u0005z\u0000\u0000\u02c0\u02c6\u0005"+
		"\u0001\u0000\u0000\u02c1\u02c7\u0003\n\u0005\u0000\u02c2\u02c3\u0003\n"+
		"\u0005\u0000\u02c3\u02c4\u0005\u0002\u0000\u0000\u02c4\u02c5\u0003\n\u0005"+
		"\u0000\u02c5\u02c7\u0001\u0000\u0000\u0000\u02c6\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c2\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000"+
		"\u0000\u02c8\u02c9\u0005\u0003\u0000\u0000\u02c9\u02dd\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cb\u0005w\u0000\u0000\u02cb\u02cc\u0005\u0001\u0000\u0000"+
		"\u02cc\u02cd\u0003\n\u0005\u0000\u02cd\u02ce\u0005\u0003\u0000\u0000\u02ce"+
		"\u02dd\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005\u007f\u0000\u0000\u02d0"+
		"\u02d1\u0005\u0001\u0000\u0000\u02d1\u02d2\u0003\n\u0005\u0000\u02d2\u02d3"+
		"\u0005\u0003\u0000\u0000\u02d3\u02dd\u0001\u0000\u0000\u0000\u02d4\u02d5"+
		"\u0005y\u0000\u0000\u02d5\u02d6\u0005\u0001\u0000\u0000\u02d6\u02d7\u0005"+
		"\u00c4\u0000\u0000\u02d7\u02dd\u0005\u0003\u0000\u0000\u02d8\u02d9\u0005"+
		"v\u0000\u0000\u02d9\u02da\u0005\u0001\u0000\u0000\u02da\u02db\u0005\u00c4"+
		"\u0000\u0000\u02db\u02dd\u0005\u0003\u0000\u0000\u02dc\u0235\u0001\u0000"+
		"\u0000\u0000\u02dc\u023a\u0001\u0000\u0000\u0000\u02dc\u023f\u0001\u0000"+
		"\u0000\u0000\u02dc\u0244\u0001\u0000\u0000\u0000\u02dc\u024b\u0001\u0000"+
		"\u0000\u0000\u02dc\u0252\u0001\u0000\u0000\u0000\u02dc\u0259\u0001\u0000"+
		"\u0000\u0000\u02dc\u025e\u0001\u0000\u0000\u0000\u02dc\u0263\u0001\u0000"+
		"\u0000\u0000\u02dc\u026e\u0001\u0000\u0000\u0000\u02dc\u0275\u0001\u0000"+
		"\u0000\u0000\u02dc\u027c\u0001\u0000\u0000\u0000\u02dc\u0286\u0001\u0000"+
		"\u0000\u0000\u02dc\u028b\u0001\u0000\u0000\u0000\u02dc\u0290\u0001\u0000"+
		"\u0000\u0000\u02dc\u0295\u0001\u0000\u0000\u0000\u02dc\u029a\u0001\u0000"+
		"\u0000\u0000\u02dc\u029f\u0001\u0000\u0000\u0000\u02dc\u02a4\u0001\u0000"+
		"\u0000\u0000\u02dc\u02a9\u0001\u0000\u0000\u0000\u02dc\u02b0\u0001\u0000"+
		"\u0000\u0000\u02dc\u02b5\u0001\u0000\u0000\u0000\u02dc\u02ba\u0001\u0000"+
		"\u0000\u0000\u02dc\u02bf\u0001\u0000\u0000\u0000\u02dc\u02ca\u0001\u0000"+
		"\u0000\u0000\u02dc\u02cf\u0001\u0000\u0000\u0000\u02dc\u02d4\u0001\u0000"+
		"\u0000\u0000\u02dc\u02d8\u0001\u0000\u0000\u0000\u02ddO\u0001\u0000\u0000"+
		"\u0000\u02de\u02df\u0005\u001f\u0000\u0000\u02df\u02e0\u0003R)\u0000\u02e0"+
		"Q\u0001\u0000\u0000\u0000\u02e1\u02e2\u0005\u0095\u0000\u0000\u02e2\u02e3"+
		"\u0005\u0001\u0000\u0000\u02e3\u02e4\u0003\n\u0005\u0000\u02e4\u02e5\u0005"+
		"\u0002\u0000\u0000\u02e5\u02e6\u0003\n\u0005\u0000\u02e6\u02e7\u0005\u0002"+
		"\u0000\u0000\u02e7\u02e8\u0003\n\u0005\u0000\u02e8\u02e9\u0005\u0002\u0000"+
		"\u0000\u02e9\u02ea\u0003\n\u0005\u0000\u02ea\u02eb\u0005\u0003\u0000\u0000"+
		"\u02eb\u03a0\u0001\u0000\u0000\u0000\u02ec\u02ed\u0005\u0092\u0000\u0000"+
		"\u02ed\u02ee\u0005\u0001\u0000\u0000\u02ee\u02ef\u0003\n\u0005\u0000\u02ef"+
		"\u02f0\u0005\u0002\u0000\u0000\u02f0\u02f1\u0003\n\u0005\u0000\u02f1\u02f2"+
		"\u0005\u0002\u0000\u0000\u02f2\u02f3\u0003\n\u0005\u0000\u02f3\u02f5\u0005"+
		"\u0003\u0000\u0000\u02f4\u02f6\u0003T*\u0000\u02f5\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u03a0\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f8\u0005\u0093\u0000\u0000\u02f8\u02f9\u0005\u0001\u0000"+
		"\u0000\u02f9\u02fa\u0003\n\u0005\u0000\u02fa\u02fb\u0005\u0002\u0000\u0000"+
		"\u02fb\u02fc\u0003\n\u0005\u0000\u02fc\u02fd\u0005\u0002\u0000\u0000\u02fd"+
		"\u02fe\u0003\n\u0005\u0000\u02fe\u02ff\u0005\u0002\u0000\u0000\u02ff\u0300"+
		"\u0003\n\u0005\u0000\u0300\u0302\u0005\u0003\u0000\u0000\u0301\u0303\u0003"+
		"T*\u0000\u0302\u0301\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000"+
		"\u0000\u0303\u03a0\u0001\u0000\u0000\u0000\u0304\u0305\u0005\u0094\u0000"+
		"\u0000\u0305\u0306\u0005\u0001\u0000\u0000\u0306\u0307\u0003\n\u0005\u0000"+
		"\u0307\u0308\u0005\u0002\u0000\u0000\u0308\u0309\u0003\n\u0005\u0000\u0309"+
		"\u030a\u0005\u0002\u0000\u0000\u030a\u030b\u0003\n\u0005\u0000\u030b\u030c"+
		"\u0005\u0002\u0000\u0000\u030c\u030d\u0003\n\u0005\u0000\u030d\u030e\u0005"+
		"\u0002\u0000\u0000\u030e\u030f\u0003\n\u0005\u0000\u030f\u0311\u0005\u0003"+
		"\u0000\u0000\u0310\u0312\u0003T*\u0000\u0311\u0310\u0001\u0000\u0000\u0000"+
		"\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u03a0\u0001\u0000\u0000\u0000"+
		"\u0313\u0314\u0005\u008c\u0000\u0000\u0314\u0315\u0005\u0001\u0000\u0000"+
		"\u0315\u0316\u0003\n\u0005\u0000\u0316\u0317\u0005\u0002\u0000\u0000\u0317"+
		"\u0318\u0003\n\u0005\u0000\u0318\u0319\u0005\u0002\u0000\u0000\u0319\u031a"+
		"\u0003\n\u0005\u0000\u031a\u031c\u0005\u0003\u0000\u0000\u031b\u031d\u0003"+
		"T*\u0000\u031c\u031b\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000"+
		"\u0000\u031d\u03a0\u0001\u0000\u0000\u0000\u031e\u031f\u0005\u008e\u0000"+
		"\u0000\u031f\u0320\u0005\u0001\u0000\u0000\u0320\u0321\u0003\n\u0005\u0000"+
		"\u0321\u0322\u0005\u0002\u0000\u0000\u0322\u0323\u0003\n\u0005\u0000\u0323"+
		"\u0324\u0005\u0002\u0000\u0000\u0324\u0325\u0003\n\u0005\u0000\u0325\u0326"+
		"\u0005\u0002\u0000\u0000\u0326\u0327\u0003\n\u0005\u0000\u0327\u0329\u0005"+
		"\u0003\u0000\u0000\u0328\u032a\u0003T*\u0000\u0329\u0328\u0001\u0000\u0000"+
		"\u0000\u0329\u032a\u0001\u0000\u0000\u0000\u032a\u03a0\u0001\u0000\u0000"+
		"\u0000\u032b\u032c\u0005\u008a\u0000\u0000\u032c\u032d\u0005\u0001\u0000"+
		"\u0000\u032d\u032e\u0003\n\u0005\u0000\u032e\u032f\u0005\u0002\u0000\u0000"+
		"\u032f\u0330\u0003\n\u0005\u0000\u0330\u0331\u0005\u0002\u0000\u0000\u0331"+
		"\u0332\u0003\n\u0005\u0000\u0332\u0333\u0005\u0002\u0000\u0000\u0333\u0334"+
		"\u0003\n\u0005\u0000\u0334\u0335\u0005\u0002\u0000\u0000\u0335\u0336\u0003"+
		"\n\u0005\u0000\u0336\u0337\u0005\u0002\u0000\u0000\u0337\u033a\u0003\n"+
		"\u0005\u0000\u0338\u0339\u0005\u0002\u0000\u0000\u0339\u033b\u0007\u0013"+
		"\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000"+
		"\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000\u033c\u033e\u0005\u0003"+
		"\u0000\u0000\u033d\u033f\u0003T*\u0000\u033e\u033d\u0001\u0000\u0000\u0000"+
		"\u033e\u033f\u0001\u0000\u0000\u0000\u033f\u03a0\u0001\u0000\u0000\u0000"+
		"\u0340\u0341\u0005\u0091\u0000\u0000\u0341\u0342\u0005\u0001\u0000\u0000"+
		"\u0342\u0343\u0003\n\u0005\u0000\u0343\u0344\u0005\u0002\u0000\u0000\u0344"+
		"\u0345\u0003\n\u0005\u0000\u0345\u0346\u0005\u0002\u0000\u0000\u0346\u0347"+
		"\u0003\n\u0005\u0000\u0347\u0348\u0005\u0002\u0000\u0000\u0348\u0349\u0003"+
		"\n\u0005\u0000\u0349\u034a\u0005\u0002\u0000\u0000\u034a\u034b\u0003\n"+
		"\u0005\u0000\u034b\u034d\u0005\u0003\u0000\u0000\u034c\u034e\u0003T*\u0000"+
		"\u034d\u034c\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000\u0000"+
		"\u034e\u03a0\u0001\u0000\u0000\u0000\u034f\u0350\u0005\u008f\u0000\u0000"+
		"\u0350\u0351\u0005\u0001\u0000\u0000\u0351\u0352\u0003\n\u0005\u0000\u0352"+
		"\u0353\u0005\u0002\u0000\u0000\u0353\u0354\u0003\n\u0005\u0000\u0354\u0355"+
		"\u0005\u0002\u0000\u0000\u0355\u0356\u0003\n\u0005\u0000\u0356\u0357\u0005"+
		"\u0002\u0000\u0000\u0357\u0358\u0003\n\u0005\u0000\u0358\u0359\u0005\u0002"+
		"\u0000\u0000\u0359\u035a\u0003\n\u0005\u0000\u035a\u035c\u0005\u0003\u0000"+
		"\u0000\u035b\u035d\u0003T*\u0000\u035c\u035b\u0001\u0000\u0000\u0000\u035c"+
		"\u035d\u0001\u0000\u0000\u0000\u035d\u03a0\u0001\u0000\u0000\u0000\u035e"+
		"\u035f\u0005\u0090\u0000\u0000\u035f\u0360\u0005\u0001\u0000\u0000\u0360"+
		"\u0361\u0003\n\u0005\u0000\u0361\u0362\u0005\u0002\u0000\u0000\u0362\u0363"+
		"\u0003\n\u0005\u0000\u0363\u0364\u0005\u0002\u0000\u0000\u0364\u0365\u0003"+
		"\n\u0005\u0000\u0365\u0366\u0005\u0002\u0000\u0000\u0366\u0367\u0003\n"+
		"\u0005\u0000\u0367\u0368\u0005\u0002\u0000\u0000\u0368\u0369\u0003\n\u0005"+
		"\u0000\u0369\u036a\u0005\u0002\u0000\u0000\u036a\u0372\u0003\n\u0005\u0000"+
		"\u036b\u036c\u0005\u0002\u0000\u0000\u036c\u036d\u0003\n\u0005\u0000\u036d"+
		"\u036e\u0005\u0002\u0000\u0000\u036e\u036f\u0003\n\u0005\u0000\u036f\u0371"+
		"\u0001\u0000\u0000\u0000\u0370\u036b\u0001\u0000\u0000\u0000\u0371\u0374"+
		"\u0001\u0000\u0000\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0372\u0373"+
		"\u0001\u0000\u0000\u0000\u0373\u0375\u0001\u0000\u0000\u0000\u0374\u0372"+
		"\u0001\u0000\u0000\u0000\u0375\u0377\u0005\u0003\u0000\u0000\u0376\u0378"+
		"\u0003T*\u0000\u0377\u0376\u0001\u0000\u0000\u0000\u0377\u0378\u0001\u0000"+
		"\u0000\u0000\u0378\u03a0\u0001\u0000\u0000\u0000\u0379\u037a\u0005\u008d"+
		"\u0000\u0000\u037a\u037b\u0005\u0001\u0000\u0000\u037b\u037c\u0003\n\u0005"+
		"\u0000\u037c\u037d\u0005\u0002\u0000\u0000\u037d\u037e\u0003\n\u0005\u0000"+
		"\u037e\u037f\u0005\u0002\u0000\u0000\u037f\u0380\u0003\n\u0005\u0000\u0380"+
		"\u0381\u0005\u0002\u0000\u0000\u0381\u0382\u0003\n\u0005\u0000\u0382\u0383"+
		"\u0005\u0002\u0000\u0000\u0383\u0384\u0003\n\u0005\u0000\u0384\u0385\u0005"+
		"\u0002\u0000\u0000\u0385\u0386\u0003\n\u0005\u0000\u0386\u0388\u0005\u0003"+
		"\u0000\u0000\u0387\u0389\u0003T*\u0000\u0388\u0387\u0001\u0000\u0000\u0000"+
		"\u0388\u0389\u0001\u0000\u0000\u0000\u0389\u03a0\u0001\u0000\u0000\u0000"+
		"\u038a\u038b\u0005\u008b\u0000\u0000\u038b\u038c\u0005\u0001\u0000\u0000"+
		"\u038c\u038d\u0003\n\u0005\u0000\u038d\u038e\u0005\u0002\u0000\u0000\u038e"+
		"\u038f\u0003\n\u0005\u0000\u038f\u0390\u0005\u0002\u0000\u0000\u0390\u0391"+
		"\u0003\n\u0005\u0000\u0391\u0392\u0005\u0002\u0000\u0000\u0392\u0393\u0003"+
		"\n\u0005\u0000\u0393\u0394\u0005\u0002\u0000\u0000\u0394\u0395\u0003\n"+
		"\u0005\u0000\u0395\u0396\u0005\u0002\u0000\u0000\u0396\u0397\u0003\n\u0005"+
		"\u0000\u0397\u0398\u0005\u0002\u0000\u0000\u0398\u0399\u0003\n\u0005\u0000"+
		"\u0399\u039a\u0005\u0002\u0000\u0000\u039a\u039b\u0003\n\u0005\u0000\u039b"+
		"\u039d\u0005\u0003\u0000\u0000\u039c\u039e\u0003T*\u0000\u039d\u039c\u0001"+
		"\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u03a0\u0001"+
		"\u0000\u0000\u0000\u039f\u02e1\u0001\u0000\u0000\u0000\u039f\u02ec\u0001"+
		"\u0000\u0000\u0000\u039f\u02f7\u0001\u0000\u0000\u0000\u039f\u0304\u0001"+
		"\u0000\u0000\u0000\u039f\u0313\u0001\u0000\u0000\u0000\u039f\u031e\u0001"+
		"\u0000\u0000\u0000\u039f\u032b\u0001\u0000\u0000\u0000\u039f\u0340\u0001"+
		"\u0000\u0000\u0000\u039f\u034f\u0001\u0000\u0000\u0000\u039f\u035e\u0001"+
		"\u0000\u0000\u0000\u039f\u0379\u0001\u0000\u0000\u0000\u039f\u038a\u0001"+
		"\u0000\u0000\u0000\u03a0S\u0001\u0000\u0000\u0000\u03a1\u03a2\u0005O\u0000"+
		"\u0000\u03a2\u03a6\u0005E\u0000\u0000\u03a3\u03a4\u0005$\u0000\u0000\u03a4"+
		"\u03a5\u0005O\u0000\u0000\u03a5\u03a7\u0005\u0014\u0000\u0000\u03a6\u03a3"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7\u03b0"+
		"\u0001\u0000\u0000\u0000\u03a8\u03a9\u0005O\u0000\u0000\u03a9\u03ad\u0005"+
		"\u0014\u0000\u0000\u03aa\u03ab\u0005$\u0000\u0000\u03ab\u03ac\u0005O\u0000"+
		"\u0000\u03ac\u03ae\u0005E\u0000\u0000\u03ad\u03aa\u0001\u0000\u0000\u0000"+
		"\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae\u03b0\u0001\u0000\u0000\u0000"+
		"\u03af\u03a1\u0001\u0000\u0000\u0000\u03af\u03a8\u0001\u0000\u0000\u0000"+
		"\u03b0U\u0001\u0000\u0000\u0000\u03b1\u03b2\u0005\u001f\u0000\u0000\u03b2"+
		"\u03b4\u0005\u000f\u0000\u0000\u03b3\u03b5\u0003T*\u0000\u03b4\u03b3\u0001"+
		"\u0000\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001"+
		"\u0000\u0000\u0000\u03b6\u03ba\u0005\u0004\u0000\u0000\u03b7\u03b8\u0003"+
		"X,\u0000\u03b8\u03b9\u0005\u00c3\u0000\u0000\u03b9\u03bb\u0001\u0000\u0000"+
		"\u0000\u03ba\u03b7\u0001\u0000\u0000\u0000\u03bb\u03bc\u0001\u0000\u0000"+
		"\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000"+
		"\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03bf\u0005\u0005\u0000"+
		"\u0000\u03bfW\u0001\u0000\u0000\u0000\u03c0\u03c1\u0005:\u0000\u0000\u03c1"+
		"\u03c2\u0005\f\u0000\u0000\u03c2\u03c3\u0003\n\u0005\u0000\u03c3\u03c4"+
		"\u0005\u0002\u0000\u0000\u03c4\u03c5\u0003\n\u0005\u0000\u03c5\u03e8\u0001"+
		"\u0000\u0000\u0000\u03c6\u03c7\u00059\u0000\u0000\u03c7\u03c8\u0005\f"+
		"\u0000\u0000\u03c8\u03c9\u0003\n\u0005\u0000\u03c9\u03ca\u0005\u0002\u0000"+
		"\u0000\u03ca\u03cb\u0003\n\u0005\u0000\u03cb\u03e8\u0001\u0000\u0000\u0000"+
		"\u03cc\u03cd\u0005\u0017\u0000\u0000\u03cd\u03ce\u0005G\u0000\u0000\u03ce"+
		"\u03cf\u0005\f\u0000\u0000\u03cf\u03d0\u0003\n\u0005\u0000\u03d0\u03d1"+
		"\u0005\u0002\u0000\u0000\u03d1\u03d2\u0003\n\u0005\u0000\u03d2\u03d3\u0005"+
		"\u0002\u0000\u0000\u03d3\u03d4\u0003\n\u0005\u0000\u03d4\u03d5\u0005\u0002"+
		"\u0000\u0000\u03d5\u03d6\u0003\n\u0005\u0000\u03d6\u03e8\u0001\u0000\u0000"+
		"\u0000\u03d7\u03d8\u0005\u0017\u0000\u0000\u03d8\u03d9\u0005\u0016\u0000"+
		"\u0000\u03d9\u03da\u0005\f\u0000\u0000\u03da\u03db\u0003\n\u0005\u0000"+
		"\u03db\u03dc\u0005\u0002\u0000\u0000\u03dc\u03dd\u0003\n\u0005\u0000\u03dd"+
		"\u03de\u0005\u0002\u0000\u0000\u03de\u03df\u0003\n\u0005\u0000\u03df\u03e0"+
		"\u0005\u0002\u0000\u0000\u03e0\u03e1\u0003\n\u0005\u0000\u03e1\u03e2\u0005"+
		"\u0002\u0000\u0000\u03e2\u03e3\u0003\n\u0005\u0000\u03e3\u03e4\u0005\u0002"+
		"\u0000\u0000\u03e4\u03e5\u0003\n\u0005\u0000\u03e5\u03e8\u0001\u0000\u0000"+
		"\u0000\u03e6\u03e8\u0005-\u0000\u0000\u03e7\u03c0\u0001\u0000\u0000\u0000"+
		"\u03e7\u03c6\u0001\u0000\u0000\u0000\u03e7\u03cc\u0001\u0000\u0000\u0000"+
		"\u03e7\u03d7\u0001\u0000\u0000\u0000\u03e7\u03e6\u0001\u0000\u0000\u0000"+
		"\u03e8Y\u0001\u0000\u0000\u0000\u03e9\u03ea\u0005R\u0000\u0000\u03ea\u03eb"+
		"\u0005\u00c3\u0000\u0000\u03eb\u03ec\u0007\u0014\u0000\u0000\u03ec\u03ed"+
		"\u0005\u0001\u0000\u0000\u03ed\u03ee\u0005\u0003\u0000\u0000\u03ee[\u0001"+
		"\u0000\u0000\u0000\u03ef\u03f0\u0005\u00c4\u0000\u0000\u03f0\u0406\u0005"+
		"\u00c3\u0000\u0000\u03f1\u03f2\u0005l\u0000\u0000\u03f2\u03f3\u0005\u0001"+
		"\u0000\u0000\u03f3\u0407\u0005\u0003\u0000\u0000\u03f4\u03f5\u0005j\u0000"+
		"\u0000\u03f5\u03f6\u0005\u0001\u0000\u0000\u03f6\u03fb\u0005\u0003\u0000"+
		"\u0000\u03f7\u03f8\u0005\u0006\u0000\u0000\u03f8\u03f9\u0003F#\u0000\u03f9"+
		"\u03fa\u0005\u0007\u0000\u0000\u03fa\u03fc\u0001\u0000\u0000\u0000\u03fb"+
		"\u03f7\u0001\u0000\u0000\u0000\u03fb\u03fc\u0001\u0000\u0000\u0000\u03fc"+
		"\u0407\u0001\u0000\u0000\u0000\u03fd\u03fe\u0005m\u0000\u0000\u03fe\u03ff"+
		"\u0005\u0001\u0000\u0000\u03ff\u0402\u0003\n\u0005\u0000\u0400\u0401\u0005"+
		"\u0002\u0000\u0000\u0401\u0403\u0003\n\u0005\u0000\u0402\u0400\u0001\u0000"+
		"\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403\u0404\u0001\u0000"+
		"\u0000\u0000\u0404\u0405\u0005\u0003\u0000\u0000\u0405\u0407\u0001\u0000"+
		"\u0000\u0000\u0406\u03f1\u0001\u0000\u0000\u0000\u0406\u03f4\u0001\u0000"+
		"\u0000\u0000\u0406\u03fd\u0001\u0000\u0000\u0000\u0407]\u0001\u0000\u0000"+
		"\u0000\u0408\u0409\u0005.\u0000\u0000\u0409\u040a\u0005\u0001\u0000\u0000"+
		"\u040a\u040f\u0005\u00cd\u0000\u0000\u040b\u040c\u0005\u0002\u0000\u0000"+
		"\u040c\u040e\u0003\n\u0005\u0000\u040d\u040b\u0001\u0000\u0000\u0000\u040e"+
		"\u0411\u0001\u0000\u0000\u0000\u040f\u040d\u0001\u0000\u0000\u0000\u040f"+
		"\u0410\u0001\u0000\u0000\u0000\u0410\u0412\u0001\u0000\u0000\u0000\u0411"+
		"\u040f\u0001\u0000\u0000\u0000\u0412\u0413\u0005\u0003\u0000\u0000\u0413"+
		"_\u0001\u0000\u0000\u0000\u0414\u0419\u0007\u0015\u0000\u0000\u0415\u0416"+
		"\u0005\u0006\u0000\u0000\u0416\u0417\u0003\n\u0005\u0000\u0417\u0418\u0005"+
		"\u0007\u0000\u0000\u0418\u041a\u0001\u0000\u0000\u0000\u0419\u0415\u0001"+
		"\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000\u041b\u0419\u0001"+
		"\u0000\u0000\u0000\u041b\u041c\u0001\u0000\u0000\u0000\u041c\u0421\u0001"+
		"\u0000\u0000\u0000\u041d\u041e\u0007\u0016\u0000\u0000\u041e\u041f\u0005"+
		"\u0004\u0000\u0000\u041f\u0421\u0005\u0005\u0000\u0000\u0420\u0414\u0001"+
		"\u0000\u0000\u0000\u0420\u041d\u0001\u0000\u0000\u0000\u0421a\u0001\u0000"+
		"\u0000\u0000Sekux\u007f\u008c\u0092\u00a4\u00ab\u00b1\u00b4\u00bb\u00c3"+
		"\u00d4\u00dd\u00e7\u00f5\u00fc\u010b\u0113\u0117\u0120\u012c\u0135\u013f"+
		"\u0146\u0148\u0152\u015b\u0163\u016a\u017d\u0183\u0191\u019b\u01a2\u01aa"+
		"\u01be\u01c2\u01c5\u01ca\u01cd\u01d6\u01dc\u01e2\u01ef\u01f5\u01f7\u0200"+
		"\u0209\u020e\u0218\u0229\u026a\u0283\u02c6\u02dc\u02f5\u0302\u0311\u031c"+
		"\u0329\u033a\u033e\u034d\u035c\u0372\u0377\u0388\u039d\u039f\u03a6\u03ad"+
		"\u03af\u03b4\u03bc\u03e7\u03fb\u0402\u0406\u040f\u041b\u0420";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}