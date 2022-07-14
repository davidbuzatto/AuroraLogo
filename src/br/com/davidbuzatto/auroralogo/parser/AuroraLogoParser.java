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
		LEV=55, LIM=56, LIN=57, MOV=58, MULM=59, NA=60, NO=61, PAS=62, PADR=63, 
		PARA=64, PARR=65, PI=66, PINC=67, PIZ=68, POR=69, PREE=70, PUL=71, QUAD=72, 
		RAD=73, REP=74, RET=75, SAI=76, SE=77, SEN=78, SEM=79, SOMM=80, SUBM=81, 
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
		NAOT=194, DOT=195, ID=196, IDC=197, IDF=198, IDA=199, INT=200, DEC=201, 
		CHEX=202, CHAR=203, STRING=204, COMENTARIO=205, COMENTARIO_LINHA=206, 
		WS=207;
	public static final int
		RULE_prog = 0, RULE_func = 1, RULE_inst = 2, RULE_instf = 3, RULE_ains = 4, 
		RULE_expr = 5, RULE_relacao = 6, RULE_exprSimp = 7, RULE_termo = 8, RULE_fator = 9, 
		RULE_exprBool = 10, RULE_se = 11, RULE_seSe = 12, RULE_seSenaoSe = 13, 
		RULE_seSenao = 14, RULE_usando = 15, RULE_escolha = 16, RULE_repetir = 17, 
		RULE_passo = 18, RULE_repetirEnquanto = 19, RULE_paraCada = 20, RULE_parar = 21, 
		RULE_continuar = 22, RULE_movimentar = 23, RULE_trocarCor = 24, RULE_configuracaoCor = 25, 
		RULE_cor = 26, RULE_girar = 27, RULE_engrossar = 28, RULE_desengrossar = 29, 
		RULE_trocarGrossura = 30, RULE_escrever = 31, RULE_ler = 32, RULE_atribuir = 33, 
		RULE_exprIndice = 34, RULE_abaixar = 35, RULE_levantar = 36, RULE_limpar = 37, 
		RULE_funcaoMatematica = 38, RULE_instrucaoGeometrica = 39, RULE_funcaoGeometrica = 40, 
		RULE_opcaoFuncGeom = 41, RULE_desenharCaminho = 42, RULE_instCaminho = 43, 
		RULE_consultarTartaruga = 44, RULE_consultarString = 45, RULE_formatarTexto = 46, 
		RULE_criarArranjos = 47, RULE_chamadaFuncao = 48, RULE_retornar = 49, 
		RULE_processaId = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "func", "inst", "instf", "ains", "expr", "relacao", "exprSimp", 
			"termo", "fator", "exprBool", "se", "seSe", "seSenaoSe", "seSenao", "usando", 
			"escolha", "repetir", "passo", "repetirEnquanto", "paraCada", "parar", 
			"continuar", "movimentar", "trocarCor", "configuracaoCor", "cor", "girar", 
			"engrossar", "desengrossar", "trocarGrossura", "escrever", "ler", "atribuir", 
			"exprIndice", "abaixar", "levantar", "limpar", "funcaoMatematica", "instrucaoGeometrica", 
			"funcaoGeometrica", "opcaoFuncGeom", "desenharCaminho", "instCaminho", 
			"consultarTartaruga", "consultarString", "formatarTexto", "criarArranjos", 
			"chamadaFuncao", "retornar", "processaId"
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
			"'mover'", "'multiplicando'", "'na'", "'no'", "'passo'", "'padr\\u00E3o'", 
			"'para'", "'parar'", "'PI'", "'pincel'", "'PIZZA'", "'por'", "'preenchimento'", 
			"'pulando'", "'quadr\\u00E1tica'", "'radianos'", "'repetir'", "'retornar'", 
			"'sa\\u00EDda'", "'se'", "'sen\\u00E3o'", "'sem'", "'somando'", "'subtraindo'", 
			"'tartaruga'", "'terminar'", "'trocar'", "'usando'", "'v\\u00E1'", "'VERDADEIRO'", 
			"'vez'", "'vezes'", "'preto'", "'azul'", "'ciano'", "'cinza'", "'verde'", 
			"'magenta'", "'laranja'", "'rosa'", "'vermelho'", "'branco'", "'amarelo'", 
			"'escuro'", "'claro'", "'\\u00E2ngulo'", "'x'", "'y'", "'caracteres'", 
			"'chaves'", "'comprimento'", "'substring'", "'arcoCosseno'", "'arredondar'", 
			"'arcoSeno'", "'arcoTangente'", "'cartesianoParaPolar'", "'ch\\u00E3o'", 
			"'cossenoHiperb\\u00F3lico'", "'cosseno'", "'decrementar'", "'grausParaRadianos'", 
			"'hipotenusa'", "'incrementar'", "'logar\\u00EDtmo'", "'m\\u00E1ximo'", 
			"'m\\u00EDnimo'", "'n\\u00FAmeroAleat\\u00F3rio'", "'pot\\u00EAncia'", 
			"'radianosParaGraus'", "'raizC\\u00FAbica'", "'raizQuadrada'", "'raiz'", 
			"'definirSementeAleat\\u00F3ria'", "'senoHiperb\\u00F3lico'", "'seno'", 
			"'tangente'", "'tangenteHiperb\\u00F3lica'", "'teto'", "'valorAbsoluto'", 
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
			"PAS", "PADR", "PARA", "PARR", "PI", "PINC", "PIZ", "POR", "PREE", "PUL", 
			"QUAD", "RAD", "REP", "RET", "SAI", "SE", "SEN", "SEM", "SOMM", "SUBM", 
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
			"OLGT", "NAO", "NAOT", "DOT", "ID", "IDC", "IDF", "IDA", "INT", "DEC", 
			"CHEX", "CHAR", "STRING", "COMENTARIO", "COMENTARIO_LINHA", "WS"
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
		public TerminalNode EOF() { return getToken(AuroraLogoParser.EOF, 0); }
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(102);
				func();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				inst();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PAS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARA - 64)) | (1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (RET - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (IDF - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(113);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> ID() { return getTokens(AuroraLogoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AuroraLogoParser.ID, i);
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
			setState(115);
			match(FUNC);
			setState(116);
			match(IDF);
			setState(117);
			match(T__0);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(118);
				match(ID);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(119);
					match(T__1);
					setState(120);
					match(ID);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(128);
			match(T__2);
			setState(129);
			match(T__3);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				instf();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PAS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARA - 64)) | (1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (RET - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (IDF - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(135);
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				ains();
				setState(138);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				se();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				usando();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				repetir();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				repetirEnquanto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				paraCada();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			inst();
			}
		}
		catch (RecognitionException re) {
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
		public RetornarContext retornar() {
			return getRuleContext(RetornarContext.class,0);
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
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				movimentar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				trocarCor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				girar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				abaixar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				levantar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				limpar();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				engrossar();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(157);
				desengrossar();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(158);
				trocarGrossura();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(159);
				escrever();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(160);
				ler();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(161);
				atribuir();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(162);
				parar();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(163);
				continuar();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(164);
				retornar();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(165);
				instrucaoGeometrica();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(166);
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
			setState(169);
			relacao();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (ELG - 189)) | (1L << (ELGT - 189)) | (1L << (OLG - 189)) | (1L << (OLGT - 189)))) != 0)) {
				{
				{
				setState(170);
				_la = _input.LA(1);
				if ( !(((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (ELG - 189)) | (1L << (ELGT - 189)) | (1L << (OLG - 189)) | (1L << (OLGT - 189)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				relacao();
				}
				}
				setState(176);
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
			setState(177);
			exprSimp();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 171)) & ~0x3f) == 0 && ((1L << (_la - 171)) & ((1L << (IGU - 171)) | (1L << (IGUT - 171)) | (1L << (IGUA - 171)) | (1L << (DIF - 171)) | (1L << (DIFT - 171)) | (1L << (DIFA - 171)) | (1L << (ME - 171)) | (1L << (MET - 171)) | (1L << (MEA - 171)) | (1L << (MEI - 171)) | (1L << (MEIT - 171)) | (1L << (MEIA - 171)) | (1L << (MA - 171)) | (1L << (MAT - 171)) | (1L << (MAA - 171)) | (1L << (MAI - 171)) | (1L << (MAIT - 171)) | (1L << (MAIA - 171)))) != 0)) {
				{
				setState(178);
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
				setState(179);
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
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (ADI - 162)) | (1L << (ADIA - 162)) | (1L << (SUB - 162)) | (1L << (SUBA - 162)))) != 0)) {
				{
				setState(182);
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

			setState(185);
			termo();
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					_la = _input.LA(1);
					if ( !(((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (ADI - 162)) | (1L << (ADIA - 162)) | (1L << (SUB - 162)) | (1L << (SUBA - 162)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(187);
					termo();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(193);
			fator();
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					_la = _input.LA(1);
					if ( !(_la==VEZS || ((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & ((1L << (MUL - 166)) | (1L << (DIV - 166)) | (1L << (DIVA - 166)) | (1L << (MOD - 166)) | (1L << (MODA - 166)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(195);
					fator();
					}
					} 
				}
				setState(200);
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
	public static class FatorPassoContext extends FatorContext {
		public PassoContext passo() {
			return getRuleContext(PassoContext.class,0);
		}
		public FatorPassoContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorPasso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorPasso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorPasso(this);
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
	public static class FatorIdArranjoAssociativoContext extends FatorContext {
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
	public static class FatorChamadaFuncaoContext extends FatorContext {
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public FatorChamadaFuncaoContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorChamadaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorChamadaFuncao(this);
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
	public static class FatorCriarArranjoContext extends FatorContext {
		public CriarArranjosContext criarArranjos() {
			return getRuleContext(CriarArranjosContext.class,0);
		}
		public FatorCriarArranjoContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorCriarArranjo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorCriarArranjo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorCriarArranjo(this);
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
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new FatorNaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NAOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(202);
				fator();
				}
				break;
			case 2:
				_localctx = new FatorIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(INT);
				}
				break;
			case 3:
				_localctx = new FatorDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(DEC);
				}
				break;
			case 4:
				_localctx = new FatorPiContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(PI);
				}
				break;
			case 5:
				_localctx = new FatorIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				processaId();
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(207);
					match(DOT);
					setState(208);
					match(COMP);
					setState(209);
					match(T__0);
					setState(210);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(211);
					match(DOT);
					setState(212);
					match(CHAV);
					setState(213);
					match(T__0);
					setState(214);
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
				setState(217);
				processaId();
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(218);
					match(T__5);
					setState(219);
					expr();
					setState(220);
					match(T__6);
					}
					}
					setState(224); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(226);
					match(DOT);
					setState(227);
					match(COMP);
					setState(228);
					match(T__0);
					setState(229);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(230);
					match(DOT);
					setState(231);
					match(CHAV);
					setState(232);
					match(T__0);
					setState(233);
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
				setState(236);
				processaId();
				setState(237);
				match(T__3);
				setState(238);
				expr();
				setState(239);
				match(T__4);
				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(240);
					match(DOT);
					setState(241);
					match(COMP);
					setState(242);
					match(T__0);
					setState(243);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(244);
					match(DOT);
					setState(245);
					match(CHAV);
					setState(246);
					match(T__0);
					setState(247);
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
				setState(250);
				processaId();
				setState(253); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(251);
						match(DOT);
						setState(252);
						match(IDA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(255); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
				_localctx = new FatorCharContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(257);
				match(CHAR);
				}
				break;
			case 10:
				_localctx = new FatorStringContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(258);
				match(STRING);
				}
				break;
			case 11:
				_localctx = new FatorBoolContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(259);
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
				setState(260);
				cor();
				}
				break;
			case 13:
				_localctx = new FatorFuncaoMatematicaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(261);
				funcaoMatematica();
				}
				break;
			case 14:
				_localctx = new FatorConsultarTartarugaContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(262);
				consultarTartaruga();
				}
				break;
			case 15:
				_localctx = new FatorConsultarStringContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(263);
				consultarString();
				}
				break;
			case 16:
				_localctx = new FatorFormatarTextoContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(264);
				formatarTexto();
				}
				break;
			case 17:
				_localctx = new FatorPassoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(265);
				passo();
				}
				break;
			case 18:
				_localctx = new FatorChamadaFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(266);
				chamadaFuncao();
				}
				break;
			case 19:
				_localctx = new FatorCriarArranjoContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(267);
				criarArranjos();
				}
				break;
			case 20:
				_localctx = new FatorParentesesContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(268);
				match(T__0);
				setState(269);
				expr();
				setState(270);
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
			setState(274);
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
			setState(276);
			seSe();
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					seSenaoSe();
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEN) {
				{
				setState(283);
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
			setState(286);
			match(SE);
			setState(287);
			exprBool();
			setState(288);
			match(ENT);
			setState(289);
			match(T__3);
			setState(291); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(290);
				inst();
				}
				}
				setState(293); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PAS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARA - 64)) | (1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (RET - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (IDF - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(295);
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
			setState(297);
			match(SEN);
			setState(298);
			match(SE);
			setState(299);
			exprBool();
			setState(300);
			match(ENT);
			setState(301);
			match(T__3);
			setState(303); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(302);
				inst();
				}
				}
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PAS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARA - 64)) | (1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (RET - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (IDF - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(307);
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
			setState(309);
			match(SEN);
			setState(310);
			match(T__3);
			setState(312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(311);
				inst();
				}
				}
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PAS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARA - 64)) | (1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (RET - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (IDF - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(316);
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
			setState(318);
			match(USA);
			setState(319);
			processaId();
			setState(320);
			match(T__3);
			setState(322); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(321);
				escolha();
				}
				}
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESCO );
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PADR) {
				{
				setState(326);
				match(PADR);
				setState(327);
				match(T__7);
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(328);
					inst();
					}
					}
					setState(331); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PAS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARA - 64)) | (1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (RET - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (IDF - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
				}
			}

			setState(335);
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
			setState(337);
			match(ESCO);
			setState(338);
			_la = _input.LA(1);
			if ( !(((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (INT - 200)) | (1L << (DEC - 200)) | (1L << (CHAR - 200)) | (1L << (STRING - 200)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(339);
			match(T__7);
			setState(341); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(340);
				inst();
				}
				}
				setState(343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PAS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARA - 64)) | (1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (RET - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (IDF - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(345);
			match(REP);
			setState(346);
			expr();
			setState(347);
			_la = _input.LA(1);
			if ( !(_la==VEZ || _la==VEZS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(348);
			match(T__3);
			setState(350); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(349);
				inst();
				}
				}
				setState(352); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PAS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARA - 64)) | (1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (RET - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (IDF - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(354);
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

	public static class PassoContext extends ParserRuleContext {
		public TerminalNode PAS() { return getToken(AuroraLogoParser.PAS, 0); }
		public PassoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterPasso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitPasso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitPasso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassoContext passo() throws RecognitionException {
		PassoContext _localctx = new PassoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_passo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(PAS);
			}
		}
		catch (RecognitionException re) {
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENQ) {
				{
				setState(358);
				match(ENQ);
				setState(359);
				exprBool();
				}
			}

			setState(362);
			match(REP);
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DCMM:
			case INCM:
				{
				setState(363);
				_la = _input.LA(1);
				if ( !(_la==DCMM || _la==INCM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(364);
				processaId();
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EM) {
					{
					setState(365);
					match(EM);
					setState(366);
					expr();
					}
				}

				}
				break;
			case SOMM:
				{
				setState(369);
				match(SOMM);
				setState(370);
				processaId();
				setState(371);
				match(COM);
				setState(372);
				expr();
				}
				break;
			case MULM:
				{
				setState(374);
				match(MULM);
				setState(375);
				processaId();
				setState(376);
				match(POR);
				setState(377);
				expr();
				}
				break;
			case DIVM:
				{
				setState(379);
				match(DIVM);
				setState(380);
				processaId();
				setState(381);
				match(POR);
				setState(382);
				expr();
				}
				break;
			case SUBM:
				{
				setState(384);
				match(SUBM);
				setState(385);
				expr();
				setState(386);
				match(DE);
				setState(387);
				processaId();
				}
				break;
			case T__3:
				break;
			default:
				break;
			}
			setState(391);
			match(T__3);
			setState(393); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(392);
				inst();
				}
				}
				setState(395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PAS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARA - 64)) | (1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (RET - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (IDF - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(397);
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
			setState(399);
			match(PARA);
			setState(400);
			match(CADA);
			setState(401);
			processaId();
			setState(402);
			match(EM);
			setState(403);
			expr();
			setState(404);
			match(REP);
			setState(405);
			match(T__3);
			setState(407); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(406);
				inst();
				}
				}
				setState(409); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << ALT) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM) | (1L << PAS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PARA - 64)) | (1L << (PARR - 64)) | (1L << (PI - 64)) | (1L << (REP - 64)) | (1L << (RET - 64)) | (1L << (SE - 64)) | (1L << (TART - 64)) | (1L << (TROC - 64)) | (1L << (USA - 64)) | (1L << (VA - 64)) | (1L << (VER - 64)) | (1L << (F_ACOS - 64)) | (1L << (F_ARRE - 64)) | (1L << (F_ASEN - 64)) | (1L << (F_ATAN - 64)) | (1L << (F_CAPO - 64)) | (1L << (F_CHAO - 64)) | (1L << (F_COSH - 64)) | (1L << (F_COSS - 64)) | (1L << (F_DCM - 64)) | (1L << (F_GRRA - 64)) | (1L << (F_HIPO - 64)) | (1L << (F_INC - 64)) | (1L << (F_LOGA - 64)) | (1L << (F_MAXI - 64)) | (1L << (F_MINI - 64)) | (1L << (F_NUMA - 64)) | (1L << (F_POTE - 64)) | (1L << (F_RAGR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (F_RAIC - 128)) | (1L << (F_RAIQ - 128)) | (1L << (F_RAIZ - 128)) | (1L << (F_SEME - 128)) | (1L << (F_SENH - 128)) | (1L << (F_SENO - 128)) | (1L << (F_TANG - 128)) | (1L << (F_TANH - 128)) | (1L << (F_TETO - 128)) | (1L << (F_VABS - 128)) | (1L << (ADI - 128)) | (1L << (ADIA - 128)) | (1L << (SUB - 128)) | (1L << (SUBA - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (NAO - 193)) | (1L << (NAOT - 193)) | (1L << (ID - 193)) | (1L << (IDF - 193)) | (1L << (INT - 193)) | (1L << (DEC - 193)) | (1L << (CHEX - 193)) | (1L << (CHAR - 193)) | (1L << (STRING - 193)))) != 0) );
			setState(411);
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
			setState(413);
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
			setState(415);
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
		enterRule(_localctx, 46, RULE_movimentar);
		int _la;
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new MovimentarDirecaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(VA);
				setState(418);
				match(PARA);
				setState(419);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAI) | (1L << CIM) | (1L << DIR) | (1L << ESQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EM) {
					{
					setState(420);
					match(EM);
					setState(421);
					expr();
					}
				}

				}
				break;
			case 2:
				_localctx = new MovimentarPontoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(VA);
				setState(425);
				match(PARA);
				setState(426);
				expr();
				setState(427);
				match(T__1);
				setState(428);
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
		enterRule(_localctx, 48, RULE_trocarCor);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new TrocarCorPincelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(TROC);
				setState(433);
				match(COR);
				setState(434);
				match(DO);
				setState(435);
				match(PINC);
				setState(436);
				match(PARA);
				setState(437);
				configuracaoCor();
				}
				break;
			case 2:
				_localctx = new TrocarCorPreenchimentoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(TROC);
				setState(439);
				match(COR);
				setState(440);
				match(DO);
				setState(441);
				match(PREE);
				setState(442);
				match(PARA);
				setState(443);
				configuracaoCor();
				}
				break;
			case 3:
				_localctx = new TrocarCorFundoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				match(TROC);
				setState(445);
				match(COR);
				setState(446);
				match(DO);
				setState(447);
				match(FUN);
				setState(448);
				match(PARA);
				setState(449);
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
		enterRule(_localctx, 50, RULE_configuracaoCor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case CRA:
			case CRAA:
			case CRR:
			case CRRA:
			case FAL:
			case FORM:
			case PAS:
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
			case IDF:
			case INT:
			case DEC:
			case CHEX:
			case CHAR:
			case STRING:
				{
				setState(454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(452);
					cor();
					}
					break;
				case 2:
					{
					setState(453);
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
				setState(456);
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
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << FAL) | (1L << FORM) | (1L << PAS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PI - 66)) | (1L << (TART - 66)) | (1L << (VER - 66)) | (1L << (ESCURO - 66)) | (1L << (CLARO - 66)) | (1L << (F_ACOS - 66)) | (1L << (F_ARRE - 66)) | (1L << (F_ASEN - 66)) | (1L << (F_ATAN - 66)) | (1L << (F_CAPO - 66)) | (1L << (F_CHAO - 66)) | (1L << (F_COSH - 66)) | (1L << (F_COSS - 66)) | (1L << (F_DCM - 66)) | (1L << (F_GRRA - 66)) | (1L << (F_HIPO - 66)) | (1L << (F_INC - 66)) | (1L << (F_LOGA - 66)) | (1L << (F_MAXI - 66)) | (1L << (F_MINI - 66)) | (1L << (F_NUMA - 66)) | (1L << (F_POTE - 66)) | (1L << (F_RAGR - 66)) | (1L << (F_RAIC - 66)) | (1L << (F_RAIQ - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (F_RAIZ - 130)) | (1L << (F_SEME - 130)) | (1L << (F_SENH - 130)) | (1L << (F_SENO - 130)) | (1L << (F_TANG - 130)) | (1L << (F_TANH - 130)) | (1L << (F_TETO - 130)) | (1L << (F_VABS - 130)) | (1L << (ADI - 130)) | (1L << (ADIA - 130)) | (1L << (SUB - 130)) | (1L << (SUBA - 130)) | (1L << (NAO - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (NAOT - 194)) | (1L << (ID - 194)) | (1L << (IDF - 194)) | (1L << (INT - 194)) | (1L << (DEC - 194)) | (1L << (CHEX - 194)) | (1L << (CHAR - 194)) | (1L << (STRING - 194)))) != 0)) {
				{
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << FAL) | (1L << FORM) | (1L << PAS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PI - 66)) | (1L << (TART - 66)) | (1L << (VER - 66)) | (1L << (F_ACOS - 66)) | (1L << (F_ARRE - 66)) | (1L << (F_ASEN - 66)) | (1L << (F_ATAN - 66)) | (1L << (F_CAPO - 66)) | (1L << (F_CHAO - 66)) | (1L << (F_COSH - 66)) | (1L << (F_COSS - 66)) | (1L << (F_DCM - 66)) | (1L << (F_GRRA - 66)) | (1L << (F_HIPO - 66)) | (1L << (F_INC - 66)) | (1L << (F_LOGA - 66)) | (1L << (F_MAXI - 66)) | (1L << (F_MINI - 66)) | (1L << (F_NUMA - 66)) | (1L << (F_POTE - 66)) | (1L << (F_RAGR - 66)) | (1L << (F_RAIC - 66)) | (1L << (F_RAIQ - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (F_RAIZ - 130)) | (1L << (F_SEME - 130)) | (1L << (F_SENH - 130)) | (1L << (F_SENO - 130)) | (1L << (F_TANG - 130)) | (1L << (F_TANH - 130)) | (1L << (F_TETO - 130)) | (1L << (F_VABS - 130)) | (1L << (ADI - 130)) | (1L << (ADIA - 130)) | (1L << (SUB - 130)) | (1L << (SUBA - 130)) | (1L << (NAO - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (NAOT - 194)) | (1L << (ID - 194)) | (1L << (IDF - 194)) | (1L << (INT - 194)) | (1L << (DEC - 194)) | (1L << (CHEX - 194)) | (1L << (CHAR - 194)) | (1L << (STRING - 194)))) != 0)) {
					{
					setState(459);
					expr();
					setState(460);
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

				setState(464);
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
		enterRule(_localctx, 52, RULE_cor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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
		enterRule(_localctx, 54, RULE_girar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(GIR);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(470);
				match(EM);
				setState(471);
				expr();
				setState(472);
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
		enterRule(_localctx, 56, RULE_engrossar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(ENG);
			setState(477);
			match(PINC);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(478);
				match(EM);
				setState(479);
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
		enterRule(_localctx, 58, RULE_desengrossar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(DES);
			setState(483);
			match(PINC);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(484);
				match(EM);
				setState(485);
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
		enterRule(_localctx, 60, RULE_trocarGrossura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(ALT);
			setState(489);
			match(GROS);
			setState(490);
			match(PARA);
			setState(491);
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
		enterRule(_localctx, 62, RULE_escrever);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(ESC);
			setState(494);
			expr();
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NA:
				{
				setState(495);
				match(NA);
				setState(496);
				match(SAI);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUL) {
					{
					setState(497);
					match(PUL);
					setState(498);
					match(LIN);
					}
				}

				}
				break;
			case NO:
				{
				setState(501);
				match(NO);
				setState(502);
				match(DIAG);
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUL) {
					{
					setState(503);
					match(PUL);
					setState(504);
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
		enterRule(_localctx, 64, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(LER);
			setState(510);
			processaId();
			}
		}
		catch (RecognitionException re) {
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
		enterRule(_localctx, 66, RULE_atribuir);
		int _la;
		try {
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new AtribuirPadraoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				processaId();
				setState(513);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(514);
					expr();
					}
					break;
				case 2:
					{
					setState(515);
					criarArranjos();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AtribuirArranjoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				processaId();
				setState(523); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(519);
					match(T__5);
					setState(520);
					exprIndice();
					setState(521);
					match(T__6);
					}
					}
					setState(525); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(527);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(528);
					expr();
					}
					break;
				case 2:
					{
					setState(529);
					criarArranjos();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new AtribuirArranjoAssociativoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				processaId();
				{
				setState(533);
				match(T__3);
				setState(534);
				exprIndice();
				setState(535);
				match(T__4);
				}
				setState(537);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(538);
					expr();
					}
					break;
				case 2:
					{
					setState(539);
					criarArranjos();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new AtribuirAdicaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				processaId();
				setState(543);
				_la = _input.LA(1);
				if ( !(_la==AC_A || _la==AT_A) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(544);
				expr();
				}
				break;
			case 5:
				_localctx = new AtribuirSubtracaoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				processaId();
				setState(547);
				_la = _input.LA(1);
				if ( !(_la==AC_S || _la==AT_S) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(548);
				expr();
				}
				break;
			case 6:
				_localctx = new AtribuirMultiplicacaoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(550);
				processaId();
				setState(551);
				_la = _input.LA(1);
				if ( !(_la==AC_M || _la==AT_M) ) {
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
			case 7:
				_localctx = new AtribuirDivisaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(554);
				processaId();
				setState(555);
				_la = _input.LA(1);
				if ( !(_la==AC_D || _la==AT_D) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(556);
				expr();
				}
				break;
			case 8:
				_localctx = new AtribuirRestoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(558);
				processaId();
				setState(559);
				_la = _input.LA(1);
				if ( !(_la==AC_R || _la==AT_R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(560);
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
		enterRule(_localctx, 68, RULE_exprIndice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
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
		enterRule(_localctx, 70, RULE_abaixar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(ABA);
			setState(567);
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
		enterRule(_localctx, 72, RULE_levantar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(LEV);
			setState(570);
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
		enterRule(_localctx, 74, RULE_limpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
		enterRule(_localctx, 76, RULE_funcaoMatematica);
		try {
			setState(743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F_VABS:
				_localctx = new FuncaoAbsolutoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(F_VABS);
				setState(575);
				match(T__0);
				setState(576);
				expr();
				setState(577);
				match(T__2);
				}
				break;
			case F_RAIQ:
				_localctx = new FuncaoRaizQuadradaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(F_RAIQ);
				setState(580);
				match(T__0);
				setState(581);
				expr();
				setState(582);
				match(T__2);
				}
				break;
			case F_RAIC:
				_localctx = new FuncaoRaizCubicaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				match(F_RAIC);
				setState(585);
				match(T__0);
				setState(586);
				expr();
				setState(587);
				match(T__2);
				}
				break;
			case F_RAIZ:
				_localctx = new FuncaoRaizContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(589);
				match(F_RAIZ);
				setState(590);
				match(T__0);
				setState(591);
				expr();
				setState(592);
				match(T__1);
				setState(593);
				expr();
				setState(594);
				match(T__2);
				}
				break;
			case F_POTE:
				_localctx = new FuncaoPotenciaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(596);
				match(F_POTE);
				setState(597);
				match(T__0);
				setState(598);
				expr();
				setState(599);
				match(T__1);
				setState(600);
				expr();
				setState(601);
				match(T__2);
				}
				break;
			case F_HIPO:
				_localctx = new FuncaoHipotenusaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(603);
				match(F_HIPO);
				setState(604);
				match(T__0);
				setState(605);
				expr();
				setState(606);
				match(T__1);
				setState(607);
				expr();
				setState(608);
				match(T__2);
				}
				break;
			case F_CHAO:
				_localctx = new FuncaoChaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(610);
				match(F_CHAO);
				setState(611);
				match(T__0);
				setState(612);
				expr();
				setState(613);
				match(T__2);
				}
				break;
			case F_TETO:
				_localctx = new FuncaoTetoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(615);
				match(F_TETO);
				setState(616);
				match(T__0);
				setState(617);
				expr();
				setState(618);
				match(T__2);
				}
				break;
			case F_ARRE:
				_localctx = new FuncaoArredondarContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(620);
				match(F_ARRE);
				setState(621);
				match(T__0);
				setState(627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(622);
					expr();
					}
					break;
				case 2:
					{
					setState(623);
					expr();
					setState(624);
					match(T__1);
					setState(625);
					expr();
					}
					break;
				}
				setState(629);
				match(T__2);
				}
				break;
			case F_MINI:
				_localctx = new FuncaoMinimoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(631);
				match(F_MINI);
				setState(632);
				match(T__0);
				setState(633);
				expr();
				setState(634);
				match(T__1);
				setState(635);
				expr();
				setState(636);
				match(T__2);
				}
				break;
			case F_MAXI:
				_localctx = new FuncaoMaximoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(638);
				match(F_MAXI);
				setState(639);
				match(T__0);
				setState(640);
				expr();
				setState(641);
				match(T__1);
				setState(642);
				expr();
				setState(643);
				match(T__2);
				}
				break;
			case F_NUMA:
				_localctx = new FuncaoNumeroAleatorioContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(645);
				match(F_NUMA);
				setState(646);
				match(T__0);
				setState(652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(647);
					expr();
					}
					break;
				case 2:
					{
					setState(648);
					expr();
					setState(649);
					match(T__1);
					setState(650);
					expr();
					}
					break;
				}
				setState(654);
				match(T__2);
				}
				break;
			case F_SEME:
				_localctx = new FuncaoDefinirSementeAleatoriaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(655);
				match(F_SEME);
				setState(656);
				match(T__0);
				setState(657);
				expr();
				setState(658);
				match(T__2);
				}
				break;
			case F_SENO:
				_localctx = new FuncaoSenoContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(660);
				match(F_SENO);
				setState(661);
				match(T__0);
				setState(662);
				expr();
				setState(663);
				match(T__2);
				}
				break;
			case F_COSS:
				_localctx = new FuncaoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(665);
				match(F_COSS);
				setState(666);
				match(T__0);
				setState(667);
				expr();
				setState(668);
				match(T__2);
				}
				break;
			case F_TANG:
				_localctx = new FuncaoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(670);
				match(F_TANG);
				setState(671);
				match(T__0);
				setState(672);
				expr();
				setState(673);
				match(T__2);
				}
				break;
			case F_ASEN:
				_localctx = new FuncaoArcoSenoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(675);
				match(F_ASEN);
				setState(676);
				match(T__0);
				setState(677);
				expr();
				setState(678);
				match(T__2);
				}
				break;
			case F_ACOS:
				_localctx = new FuncaoArcoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(680);
				match(F_ACOS);
				setState(681);
				match(T__0);
				setState(682);
				expr();
				setState(683);
				match(T__2);
				}
				break;
			case F_ATAN:
				_localctx = new FuncaoArcoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(685);
				match(F_ATAN);
				setState(686);
				match(T__0);
				setState(687);
				expr();
				setState(688);
				match(T__2);
				}
				break;
			case F_CAPO:
				_localctx = new FuncaoCartesianoParaPolarContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(690);
				match(F_CAPO);
				setState(691);
				match(T__0);
				setState(692);
				expr();
				setState(693);
				match(T__1);
				setState(694);
				expr();
				setState(695);
				match(T__2);
				}
				break;
			case F_SENH:
				_localctx = new FuncaoSenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(697);
				match(F_SENH);
				setState(698);
				match(T__0);
				setState(699);
				expr();
				setState(700);
				match(T__2);
				}
				break;
			case F_COSH:
				_localctx = new FuncaoCossenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(702);
				match(F_COSH);
				setState(703);
				match(T__0);
				setState(704);
				expr();
				setState(705);
				match(T__2);
				}
				break;
			case F_TANH:
				_localctx = new FuncaoTangenteHiperbolicaContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(707);
				match(F_TANH);
				setState(708);
				match(T__0);
				setState(709);
				expr();
				setState(710);
				match(T__2);
				}
				break;
			case F_LOGA:
				_localctx = new FuncaoLogaritmoContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(712);
				match(F_LOGA);
				setState(713);
				match(T__0);
				setState(719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(714);
					expr();
					}
					break;
				case 2:
					{
					setState(715);
					expr();
					setState(716);
					match(T__1);
					setState(717);
					expr();
					}
					break;
				}
				setState(721);
				match(T__2);
				}
				break;
			case F_GRRA:
				_localctx = new FuncaoGrausParaRadianosContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(723);
				match(F_GRRA);
				setState(724);
				match(T__0);
				setState(725);
				expr();
				setState(726);
				match(T__2);
				}
				break;
			case F_RAGR:
				_localctx = new FuncaoRadianosParaGrausContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(728);
				match(F_RAGR);
				setState(729);
				match(T__0);
				setState(730);
				expr();
				setState(731);
				match(T__2);
				}
				break;
			case F_INC:
				_localctx = new FuncaoIncrementarContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(733);
				match(F_INC);
				setState(734);
				match(T__0);
				setState(735);
				processaId();
				setState(736);
				match(T__2);
				}
				break;
			case F_DCM:
				_localctx = new FuncaoDecrementarContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(738);
				match(F_DCM);
				setState(739);
				match(T__0);
				setState(740);
				processaId();
				setState(741);
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
		enterRule(_localctx, 78, RULE_instrucaoGeometrica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(DESE);
			setState(746);
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
		enterRule(_localctx, 80, RULE_funcaoGeometrica);
		int _la;
		try {
			setState(938);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FG_SEG:
				_localctx = new FuncaoDesenharSegmentoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				match(FG_SEG);
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
				match(T__1);
				setState(756);
				expr();
				setState(757);
				match(T__2);
				}
				break;
			case FG_QUA:
				_localctx = new FuncaoDesenharQuadradoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				match(FG_QUA);
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
				match(T__2);
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(767);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_RET:
				_localctx = new FuncaoDesenharRetanguloContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(770);
				match(FG_RET);
				setState(771);
				match(T__0);
				setState(772);
				expr();
				setState(773);
				match(T__1);
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
				match(T__2);
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(780);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_REA:
				_localctx = new FuncaoDesenharRetanguloArredondadoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(783);
				match(FG_REA);
				setState(784);
				match(T__0);
				setState(785);
				expr();
				setState(786);
				match(T__1);
				setState(787);
				expr();
				setState(788);
				match(T__1);
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
			case FG_CIC:
				_localctx = new FuncaoDesenharCirculoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(798);
				match(FG_CIC);
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
				match(T__2);
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(806);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_ELI:
				_localctx = new FuncaoDesenharElipseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(809);
				match(FG_ELI);
				setState(810);
				match(T__0);
				setState(811);
				expr();
				setState(812);
				match(T__1);
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
				match(T__2);
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(819);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_ARC:
				_localctx = new FuncaoDesenharArcoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(822);
				match(FG_ARC);
				setState(823);
				match(T__0);
				setState(824);
				expr();
				setState(825);
				match(T__1);
				setState(826);
				expr();
				setState(827);
				match(T__1);
				setState(828);
				expr();
				setState(829);
				match(T__1);
				setState(830);
				expr();
				setState(831);
				match(T__1);
				setState(832);
				expr();
				setState(833);
				match(T__1);
				setState(834);
				expr();
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(835);
					match(T__1);
					setState(836);
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

				setState(839);
				match(T__2);
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(840);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_POR:
				_localctx = new FuncaoDesenharPoligonoRegularContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(843);
				match(FG_POR);
				setState(844);
				match(T__0);
				setState(845);
				expr();
				setState(846);
				match(T__1);
				setState(847);
				expr();
				setState(848);
				match(T__1);
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
				match(T__2);
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(855);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_EST:
				_localctx = new FuncaoDesenharEstrelaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(858);
				match(FG_EST);
				setState(859);
				match(T__0);
				setState(860);
				expr();
				setState(861);
				match(T__1);
				setState(862);
				expr();
				setState(863);
				match(T__1);
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
				match(T__2);
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(870);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_POL:
				_localctx = new FuncaoDesenharPoligonoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(873);
				match(FG_POL);
				setState(874);
				match(T__0);
				setState(875);
				expr();
				setState(876);
				match(T__1);
				setState(877);
				expr();
				setState(878);
				match(T__1);
				setState(879);
				expr();
				setState(880);
				match(T__1);
				setState(881);
				expr();
				setState(882);
				match(T__1);
				setState(883);
				expr();
				setState(884);
				match(T__1);
				setState(885);
				expr();
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(886);
					match(T__1);
					setState(887);
					expr();
					setState(888);
					match(T__1);
					setState(889);
					expr();
					}
					}
					setState(895);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(896);
				match(T__2);
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(897);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_CQD:
				_localctx = new FuncaoDesenharCurvaQuadraticaContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(900);
				match(FG_CQD);
				setState(901);
				match(T__0);
				setState(902);
				expr();
				setState(903);
				match(T__1);
				setState(904);
				expr();
				setState(905);
				match(T__1);
				setState(906);
				expr();
				setState(907);
				match(T__1);
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
				match(T__2);
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(914);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_CCU:
				_localctx = new FuncaoDesenharCurvaCubicaContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(917);
				match(FG_CCU);
				setState(918);
				match(T__0);
				setState(919);
				expr();
				setState(920);
				match(T__1);
				setState(921);
				expr();
				setState(922);
				match(T__1);
				setState(923);
				expr();
				setState(924);
				match(T__1);
				setState(925);
				expr();
				setState(926);
				match(T__1);
				setState(927);
				expr();
				setState(928);
				match(T__1);
				setState(929);
				expr();
				setState(930);
				match(T__1);
				setState(931);
				expr();
				setState(932);
				match(T__1);
				setState(933);
				expr();
				setState(934);
				match(T__2);
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(935);
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
		enterRule(_localctx, 82, RULE_opcaoFuncGeom);
		int _la;
		try {
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				match(SEM);
				setState(941);
				match(PREE);
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(942);
					match(E);
					setState(943);
					match(SEM);
					setState(944);
					match(CON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
				match(SEM);
				setState(948);
				match(CON);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(949);
					match(E);
					setState(950);
					match(SEM);
					setState(951);
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
		enterRule(_localctx, 84, RULE_desenharCaminho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(DESE);
			setState(957);
			match(CAM);
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEM) {
				{
				setState(958);
				opcaoFuncGeom();
				}
			}

			setState(961);
			match(T__3);
			setState(965); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(962);
				instCaminho();
				setState(963);
				match(DOT);
				}
				}
				setState(967); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CUR) | (1L << FEC) | (1L << LIN) | (1L << MOV))) != 0) );
			setState(969);
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
		enterRule(_localctx, 86, RULE_instCaminho);
		try {
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				_localctx = new InstrucaoCaminhoMoverAteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				match(MOV);
				setState(972);
				match(ATE);
				setState(973);
				expr();
				setState(974);
				match(T__1);
				setState(975);
				expr();
				}
				break;
			case 2:
				_localctx = new InstrucaoCaminhoLinhaAteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(977);
				match(LIN);
				setState(978);
				match(ATE);
				setState(979);
				expr();
				setState(980);
				match(T__1);
				setState(981);
				expr();
				}
				break;
			case 3:
				_localctx = new InstrucaoCaminhoCurvaQuadraticaAteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(983);
				match(CUR);
				setState(984);
				match(QUAD);
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
				}
				break;
			case 4:
				_localctx = new InstrucaoCaminhoCurvaCubicaAteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(994);
				match(CUR);
				setState(995);
				match(CUBI);
				setState(996);
				match(ATE);
				setState(997);
				expr();
				setState(998);
				match(T__1);
				setState(999);
				expr();
				setState(1000);
				match(T__1);
				setState(1001);
				expr();
				setState(1002);
				match(T__1);
				setState(1003);
				expr();
				setState(1004);
				match(T__1);
				setState(1005);
				expr();
				setState(1006);
				match(T__1);
				setState(1007);
				expr();
				}
				break;
			case 5:
				_localctx = new InstrucaoCaminhoFecharCaminhoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1009);
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
		enterRule(_localctx, 88, RULE_consultarTartaruga);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(TART);
			setState(1013);
			match(DOT);
			setState(1014);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (PA - 103)) | (1L << (PX - 103)) | (1L << (PY - 103)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1015);
			match(T__0);
			setState(1016);
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
		public ProcessaIdContext processaId() {
			return getRuleContext(ProcessaIdContext.class,0);
		}
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
		enterRule(_localctx, 90, RULE_consultarString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			processaId();
			setState(1019);
			match(DOT);
			setState(1041);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMP:
				{
				setState(1020);
				match(COMP);
				setState(1021);
				match(T__0);
				setState(1022);
				match(T__2);
				}
				break;
			case CARC:
				{
				setState(1023);
				match(CARC);
				setState(1024);
				match(T__0);
				setState(1025);
				match(T__2);
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(1026);
					match(T__5);
					setState(1027);
					exprIndice();
					setState(1028);
					match(T__6);
					}
				}

				}
				break;
			case SUBS:
				{
				setState(1032);
				match(SUBS);
				setState(1033);
				match(T__0);
				setState(1034);
				expr();
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1035);
					match(T__1);
					setState(1036);
					expr();
					}
				}

				setState(1039);
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
		enterRule(_localctx, 92, RULE_formatarTexto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			match(FORM);
			setState(1044);
			match(T__0);
			setState(1045);
			match(STRING);
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1046);
				match(T__1);
				setState(1047);
				expr();
				}
				}
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1053);
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
		enterRule(_localctx, 94, RULE_criarArranjos);
		int _la;
		try {
			setState(1067);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CRA:
			case CRR:
				_localctx = new CriarArranjoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1055);
				_la = _input.LA(1);
				if ( !(_la==CRA || _la==CRR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1060); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1056);
					match(T__5);
					setState(1057);
					expr();
					setState(1058);
					match(T__6);
					}
					}
					setState(1062); 
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
				setState(1064);
				_la = _input.LA(1);
				if ( !(_la==CRAA || _la==CRRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1065);
				match(T__3);
				setState(1066);
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

	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(AuroraLogoParser.IDF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitChamadaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitChamadaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(IDF);
			setState(1070);
			match(T__0);
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << FAL) | (1L << FORM) | (1L << PAS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PI - 66)) | (1L << (TART - 66)) | (1L << (VER - 66)) | (1L << (F_ACOS - 66)) | (1L << (F_ARRE - 66)) | (1L << (F_ASEN - 66)) | (1L << (F_ATAN - 66)) | (1L << (F_CAPO - 66)) | (1L << (F_CHAO - 66)) | (1L << (F_COSH - 66)) | (1L << (F_COSS - 66)) | (1L << (F_DCM - 66)) | (1L << (F_GRRA - 66)) | (1L << (F_HIPO - 66)) | (1L << (F_INC - 66)) | (1L << (F_LOGA - 66)) | (1L << (F_MAXI - 66)) | (1L << (F_MINI - 66)) | (1L << (F_NUMA - 66)) | (1L << (F_POTE - 66)) | (1L << (F_RAGR - 66)) | (1L << (F_RAIC - 66)) | (1L << (F_RAIQ - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (F_RAIZ - 130)) | (1L << (F_SEME - 130)) | (1L << (F_SENH - 130)) | (1L << (F_SENO - 130)) | (1L << (F_TANG - 130)) | (1L << (F_TANH - 130)) | (1L << (F_TETO - 130)) | (1L << (F_VABS - 130)) | (1L << (ADI - 130)) | (1L << (ADIA - 130)) | (1L << (SUB - 130)) | (1L << (SUBA - 130)) | (1L << (NAO - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (NAOT - 194)) | (1L << (ID - 194)) | (1L << (IDF - 194)) | (1L << (INT - 194)) | (1L << (DEC - 194)) | (1L << (CHEX - 194)) | (1L << (CHAR - 194)) | (1L << (STRING - 194)))) != 0)) {
				{
				setState(1071);
				expr();
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1072);
					match(T__1);
					setState(1073);
					expr();
					}
					}
					setState(1078);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1081);
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
		enterRule(_localctx, 98, RULE_retornar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			match(RET);
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << FAL) | (1L << FORM) | (1L << PAS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PI - 66)) | (1L << (TART - 66)) | (1L << (VER - 66)) | (1L << (F_ACOS - 66)) | (1L << (F_ARRE - 66)) | (1L << (F_ASEN - 66)) | (1L << (F_ATAN - 66)) | (1L << (F_CAPO - 66)) | (1L << (F_CHAO - 66)) | (1L << (F_COSH - 66)) | (1L << (F_COSS - 66)) | (1L << (F_DCM - 66)) | (1L << (F_GRRA - 66)) | (1L << (F_HIPO - 66)) | (1L << (F_INC - 66)) | (1L << (F_LOGA - 66)) | (1L << (F_MAXI - 66)) | (1L << (F_MINI - 66)) | (1L << (F_NUMA - 66)) | (1L << (F_POTE - 66)) | (1L << (F_RAGR - 66)) | (1L << (F_RAIC - 66)) | (1L << (F_RAIQ - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (F_RAIZ - 130)) | (1L << (F_SEME - 130)) | (1L << (F_SENH - 130)) | (1L << (F_SENO - 130)) | (1L << (F_TANG - 130)) | (1L << (F_TANH - 130)) | (1L << (F_TETO - 130)) | (1L << (F_VABS - 130)) | (1L << (ADI - 130)) | (1L << (ADIA - 130)) | (1L << (SUB - 130)) | (1L << (SUBA - 130)) | (1L << (NAO - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (NAOT - 194)) | (1L << (ID - 194)) | (1L << (IDF - 194)) | (1L << (INT - 194)) | (1L << (DEC - 194)) | (1L << (CHEX - 194)) | (1L << (CHAR - 194)) | (1L << (STRING - 194)))) != 0)) {
				{
				setState(1084);
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

	public static class ProcessaIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AuroraLogoParser.ID, 0); }
		public ProcessaIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processaId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterProcessaId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitProcessaId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitProcessaId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessaIdContext processaId() throws RecognitionException {
		ProcessaIdContext _localctx = new ProcessaIdContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_processaId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
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

	public static final String _serializedATN =
		"\u0004\u0001\u00cf\u0442\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u0001\u0000\u0005\u0000h\b\u0000\n\u0000\f\u0000k\t\u0000"+
		"\u0001\u0000\u0004\u0000n\b\u0000\u000b\u0000\f\u0000o\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001z\b\u0001\n\u0001\f\u0001}\t\u0001\u0003\u0001\u007f"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0084\b\u0001"+
		"\u000b\u0001\f\u0001\u0085\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0093\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a8\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00ad\b\u0005\n\u0005"+
		"\f\u0005\u00b0\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00b5\b\u0006\u0001\u0007\u0003\u0007\u00b8\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u00bd\b\u0007\n\u0007\f\u0007\u00c0\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u00c5\b\b\n\b\f\b\u00c8\t\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d8\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0004\t\u00df\b\t\u000b\t\f\t\u00e0\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00eb\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00f9\b\t\u0001\t\u0001\t\u0001\t\u0004\t\u00fe\b\t"+
		"\u000b\t\f\t\u00ff\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0111\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u0117"+
		"\b\u000b\n\u000b\f\u000b\u011a\t\u000b\u0001\u000b\u0003\u000b\u011d\b"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0124\b\f\u000b"+
		"\f\f\f\u0125\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0004\r\u0130\b\r\u000b\r\f\r\u0131\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0004\u000e\u0139\b\u000e\u000b\u000e\f\u000e\u013a"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0004\u000f\u0143\b\u000f\u000b\u000f\f\u000f\u0144\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u014a\b\u000f\u000b\u000f\f\u000f\u014b"+
		"\u0003\u000f\u014e\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0004\u0010\u0156\b\u0010\u000b\u0010\f\u0010"+
		"\u0157\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0004"+
		"\u0011\u015f\b\u0011\u000b\u0011\f\u0011\u0160\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0169\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0170\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0186\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0004\u0013\u018a\b\u0013\u000b\u0013\f\u0013\u018b\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u0198\b\u0014\u000b"+
		"\u0014\f\u0014\u0199\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u01a7\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01af\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01c3"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u01c7\b\u0019\u0001\u0019"+
		"\u0003\u0019\u01ca\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u01cf\b\u0019\u0001\u0019\u0003\u0019\u01d2\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u01db\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01e1\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u01e7\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u01f4\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u01fa\b\u001f\u0003\u001f\u01fc\b\u001f\u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0003!\u0205\b!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0004!\u020c\b!\u000b!\f!\u020d\u0001!\u0001!\u0001!\u0003"+
		"!\u0213\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u021d\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u0233\b!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0274\b&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u028d\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02d0"+
		"\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u02e8\b&\u0001\'\u0001\'\u0001\'\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0301"+
		"\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u030e\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u031d\b(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0328\b(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0003(\u0335\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0346\b(\u0001"+
		"(\u0001(\u0003(\u034a\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0359\b(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u0368\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0005(\u037c\b(\n(\f(\u037f\t(\u0001(\u0001(\u0003(\u0383\b("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0394\b(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u03a9\b(\u0003(\u03ab"+
		"\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u03b2\b)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u03b9\b)\u0003)\u03bb\b)\u0001*\u0001*\u0001*\u0003"+
		"*\u03c0\b*\u0001*\u0001*\u0001*\u0001*\u0004*\u03c6\b*\u000b*\f*\u03c7"+
		"\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0003+\u03f3\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u0407\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u040e"+
		"\b-\u0001-\u0001-\u0003-\u0412\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0005"+
		".\u0419\b.\n.\f.\u041c\t.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0004/\u0425\b/\u000b/\f/\u0426\u0001/\u0001/\u0001/\u0003/\u042c\b"+
		"/\u00010\u00010\u00010\u00010\u00010\u00050\u0433\b0\n0\f0\u0436\t0\u0003"+
		"0\u0438\b0\u00010\u00010\u00011\u00011\u00031\u043e\b1\u00012\u00012\u0001"+
		"2\u0000\u00003\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\u0017"+
		"\u0001\u0000\u00bd\u00c0\u0001\u0000\u00ab\u00bc\u0001\u0000\u00a2\u00a5"+
		"\u0002\u0000YY\u00a6\u00aa\u0001\u0000\u00c1\u00c2\u0002\u0000,,WW\u0002"+
		"\u0000\u00c8\u00c9\u00cb\u00cc\u0001\u0000XY\u0002\u0000\u001c\u001c4"+
		"4\u0004\u0000\r\r\u0010\u0010!!++\u0001\u0000Zd\u0001\u0000ef\u0002\u0000"+
		"22II\u0001\u0000\u0096\u0097\u0001\u0000\u0098\u0099\u0001\u0000\u009a"+
		"\u009b\u0001\u0000\u009c\u009d\u0001\u0000\u009e\u009f\u0001\u0000\u00a0"+
		"\u00a1\u0003\u0000\n\n\u0011\u0011DD\u0001\u0000gi\u0002\u0000\u0018\u0018"+
		"\u001a\u001a\u0002\u0000\u0019\u0019\u001b\u001b\u04c0\u0000i\u0001\u0000"+
		"\u0000\u0000\u0002s\u0001\u0000\u0000\u0000\u0004\u0092\u0001\u0000\u0000"+
		"\u0000\u0006\u0094\u0001\u0000\u0000\u0000\b\u00a7\u0001\u0000\u0000\u0000"+
		"\n\u00a9\u0001\u0000\u0000\u0000\f\u00b1\u0001\u0000\u0000\u0000\u000e"+
		"\u00b7\u0001\u0000\u0000\u0000\u0010\u00c1\u0001\u0000\u0000\u0000\u0012"+
		"\u0110\u0001\u0000\u0000\u0000\u0014\u0112\u0001\u0000\u0000\u0000\u0016"+
		"\u0114\u0001\u0000\u0000\u0000\u0018\u011e\u0001\u0000\u0000\u0000\u001a"+
		"\u0129\u0001\u0000\u0000\u0000\u001c\u0135\u0001\u0000\u0000\u0000\u001e"+
		"\u013e\u0001\u0000\u0000\u0000 \u0151\u0001\u0000\u0000\u0000\"\u0159"+
		"\u0001\u0000\u0000\u0000$\u0164\u0001\u0000\u0000\u0000&\u0168\u0001\u0000"+
		"\u0000\u0000(\u018f\u0001\u0000\u0000\u0000*\u019d\u0001\u0000\u0000\u0000"+
		",\u019f\u0001\u0000\u0000\u0000.\u01ae\u0001\u0000\u0000\u00000\u01c2"+
		"\u0001\u0000\u0000\u00002\u01c9\u0001\u0000\u0000\u00004\u01d3\u0001\u0000"+
		"\u0000\u00006\u01d5\u0001\u0000\u0000\u00008\u01dc\u0001\u0000\u0000\u0000"+
		":\u01e2\u0001\u0000\u0000\u0000<\u01e8\u0001\u0000\u0000\u0000>\u01ed"+
		"\u0001\u0000\u0000\u0000@\u01fd\u0001\u0000\u0000\u0000B\u0232\u0001\u0000"+
		"\u0000\u0000D\u0234\u0001\u0000\u0000\u0000F\u0236\u0001\u0000\u0000\u0000"+
		"H\u0239\u0001\u0000\u0000\u0000J\u023c\u0001\u0000\u0000\u0000L\u02e7"+
		"\u0001\u0000\u0000\u0000N\u02e9\u0001\u0000\u0000\u0000P\u03aa\u0001\u0000"+
		"\u0000\u0000R\u03ba\u0001\u0000\u0000\u0000T\u03bc\u0001\u0000\u0000\u0000"+
		"V\u03f2\u0001\u0000\u0000\u0000X\u03f4\u0001\u0000\u0000\u0000Z\u03fa"+
		"\u0001\u0000\u0000\u0000\\\u0413\u0001\u0000\u0000\u0000^\u042b\u0001"+
		"\u0000\u0000\u0000`\u042d\u0001\u0000\u0000\u0000b\u043b\u0001\u0000\u0000"+
		"\u0000d\u043f\u0001\u0000\u0000\u0000fh\u0003\u0002\u0001\u0000gf\u0001"+
		"\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000ln\u0003\u0004\u0002\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qr\u0005\u0000\u0000\u0001r\u0001\u0001\u0000\u0000"+
		"\u0000st\u00050\u0000\u0000tu\u0005\u00c6\u0000\u0000u~\u0005\u0001\u0000"+
		"\u0000v{\u0005\u00c4\u0000\u0000wx\u0005\u0002\u0000\u0000xz\u0005\u00c4"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000~v\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"\u0003\u0000\u0000\u0081\u0083\u0005\u0004\u0000\u0000\u0082\u0084\u0003"+
		"\u0006\u0003\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"\u0005\u0000\u0000\u0088\u0003\u0001\u0000\u0000\u0000\u0089\u008a\u0003"+
		"\b\u0004\u0000\u008a\u008b\u0005\u00c3\u0000\u0000\u008b\u0093\u0001\u0000"+
		"\u0000\u0000\u008c\u0093\u0003\u0016\u000b\u0000\u008d\u0093\u0003\u001e"+
		"\u000f\u0000\u008e\u0093\u0003\"\u0011\u0000\u008f\u0093\u0003&\u0013"+
		"\u0000\u0090\u0093\u0003(\u0014\u0000\u0091\u0093\u0003T*\u0000\u0092"+
		"\u0089\u0001\u0000\u0000\u0000\u0092\u008c\u0001\u0000\u0000\u0000\u0092"+
		"\u008d\u0001\u0000\u0000\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092"+
		"\u008f\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0005\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0003\u0004\u0002\u0000\u0095\u0007\u0001\u0000\u0000\u0000\u0096"+
		"\u00a8\u0003.\u0017\u0000\u0097\u00a8\u00030\u0018\u0000\u0098\u00a8\u0003"+
		"6\u001b\u0000\u0099\u00a8\u0003F#\u0000\u009a\u00a8\u0003H$\u0000\u009b"+
		"\u00a8\u0003J%\u0000\u009c\u00a8\u00038\u001c\u0000\u009d\u00a8\u0003"+
		":\u001d\u0000\u009e\u00a8\u0003<\u001e\u0000\u009f\u00a8\u0003>\u001f"+
		"\u0000\u00a0\u00a8\u0003@ \u0000\u00a1\u00a8\u0003B!\u0000\u00a2\u00a8"+
		"\u0003*\u0015\u0000\u00a3\u00a8\u0003,\u0016\u0000\u00a4\u00a8\u0003b"+
		"1\u0000\u00a5\u00a8\u0003N\'\u0000\u00a6\u00a8\u0003\n\u0005\u0000\u00a7"+
		"\u0096\u0001\u0000\u0000\u0000\u00a7\u0097\u0001\u0000\u0000\u0000\u00a7"+
		"\u0098\u0001\u0000\u0000\u0000\u00a7\u0099\u0001\u0000\u0000\u0000\u00a7"+
		"\u009a\u0001\u0000\u0000\u0000\u00a7\u009b\u0001\u0000\u0000\u0000\u00a7"+
		"\u009c\u0001\u0000\u0000\u0000\u00a7\u009d\u0001\u0000\u0000\u0000\u00a7"+
		"\u009e\u0001\u0000\u0000\u0000\u00a7\u009f\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a7\u00a1\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\t\u0001\u0000\u0000\u0000\u00a9\u00ae"+
		"\u0003\f\u0006\u0000\u00aa\u00ab\u0007\u0000\u0000\u0000\u00ab\u00ad\u0003"+
		"\f\u0006\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u000b\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b4\u0003\u000e\u0007\u0000\u00b2\u00b3\u0007\u0001"+
		"\u0000\u0000\u00b3\u00b5\u0003\u000e\u0007\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\r\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b8\u0007\u0002\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00be\u0003\u0010\b\u0000\u00ba\u00bb\u0007\u0002\u0000\u0000"+
		"\u00bb\u00bd\u0003\u0010\b\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u000f\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00c6\u0003\u0012\t\u0000\u00c2\u00c3"+
		"\u0007\u0003\u0000\u0000\u00c3\u00c5\u0003\u0012\t\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u0011\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0007"+
		"\u0004\u0000\u0000\u00ca\u0111\u0003\u0012\t\u0000\u00cb\u0111\u0005\u00c8"+
		"\u0000\u0000\u00cc\u0111\u0005\u00c9\u0000\u0000\u00cd\u0111\u0005B\u0000"+
		"\u0000\u00ce\u00d7\u0003d2\u0000\u00cf\u00d0\u0005\u00c3\u0000\u0000\u00d0"+
		"\u00d1\u0005l\u0000\u0000\u00d1\u00d2\u0005\u0001\u0000\u0000\u00d2\u00d8"+
		"\u0005\u0003\u0000\u0000\u00d3\u00d4\u0005\u00c3\u0000\u0000\u00d4\u00d5"+
		"\u0005k\u0000\u0000\u00d5\u00d6\u0005\u0001\u0000\u0000\u00d6\u00d8\u0005"+
		"\u0003\u0000\u0000\u00d7\u00cf\u0001\u0000\u0000\u0000\u00d7\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u0111\u0001"+
		"\u0000\u0000\u0000\u00d9\u00de\u0003d2\u0000\u00da\u00db\u0005\u0006\u0000"+
		"\u0000\u00db\u00dc\u0003\n\u0005\u0000\u00dc\u00dd\u0005\u0007\u0000\u0000"+
		"\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00da\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0005\u00c3\u0000\u0000\u00e3\u00e4\u0005l\u0000\u0000\u00e4"+
		"\u00e5\u0005\u0001\u0000\u0000\u00e5\u00eb\u0005\u0003\u0000\u0000\u00e6"+
		"\u00e7\u0005\u00c3\u0000\u0000\u00e7\u00e8\u0005k\u0000\u0000\u00e8\u00e9"+
		"\u0005\u0001\u0000\u0000\u00e9\u00eb\u0005\u0003\u0000\u0000\u00ea\u00e2"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e6\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0001\u0000\u0000\u0000\u00eb\u0111\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0003d2\u0000\u00ed\u00ee\u0005\u0004\u0000\u0000\u00ee\u00ef\u0003\n"+
		"\u0005\u0000\u00ef\u00f8\u0005\u0005\u0000\u0000\u00f0\u00f1\u0005\u00c3"+
		"\u0000\u0000\u00f1\u00f2\u0005l\u0000\u0000\u00f2\u00f3\u0005\u0001\u0000"+
		"\u0000\u00f3\u00f9\u0005\u0003\u0000\u0000\u00f4\u00f5\u0005\u00c3\u0000"+
		"\u0000\u00f5\u00f6\u0005k\u0000\u0000\u00f6\u00f7\u0005\u0001\u0000\u0000"+
		"\u00f7\u00f9\u0005\u0003\u0000\u0000\u00f8\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9\u0111\u0001\u0000\u0000\u0000\u00fa\u00fd\u0003d2\u0000\u00fb\u00fc"+
		"\u0005\u00c3\u0000\u0000\u00fc\u00fe\u0005\u00c7\u0000\u0000\u00fd\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0111"+
		"\u0001\u0000\u0000\u0000\u0101\u0111\u0005\u00cb\u0000\u0000\u0102\u0111"+
		"\u0005\u00cc\u0000\u0000\u0103\u0111\u0007\u0005\u0000\u0000\u0104\u0111"+
		"\u00034\u001a\u0000\u0105\u0111\u0003L&\u0000\u0106\u0111\u0003X,\u0000"+
		"\u0107\u0111\u0003Z-\u0000\u0108\u0111\u0003\\.\u0000\u0109\u0111\u0003"+
		"$\u0012\u0000\u010a\u0111\u0003`0\u0000\u010b\u0111\u0003^/\u0000\u010c"+
		"\u010d\u0005\u0001\u0000\u0000\u010d\u010e\u0003\n\u0005\u0000\u010e\u010f"+
		"\u0005\u0003\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u00c9"+
		"\u0001\u0000\u0000\u0000\u0110\u00cb\u0001\u0000\u0000\u0000\u0110\u00cc"+
		"\u0001\u0000\u0000\u0000\u0110\u00cd\u0001\u0000\u0000\u0000\u0110\u00ce"+
		"\u0001\u0000\u0000\u0000\u0110\u00d9\u0001\u0000\u0000\u0000\u0110\u00ec"+
		"\u0001\u0000\u0000\u0000\u0110\u00fa\u0001\u0000\u0000\u0000\u0110\u0101"+
		"\u0001\u0000\u0000\u0000\u0110\u0102\u0001\u0000\u0000\u0000\u0110\u0103"+
		"\u0001\u0000\u0000\u0000\u0110\u0104\u0001\u0000\u0000\u0000\u0110\u0105"+
		"\u0001\u0000\u0000\u0000\u0110\u0106\u0001\u0000\u0000\u0000\u0110\u0107"+
		"\u0001\u0000\u0000\u0000\u0110\u0108\u0001\u0000\u0000\u0000\u0110\u0109"+
		"\u0001\u0000\u0000\u0000\u0110\u010a\u0001\u0000\u0000\u0000\u0110\u010b"+
		"\u0001\u0000\u0000\u0000\u0110\u010c\u0001\u0000\u0000\u0000\u0111\u0013"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0003\n\u0005\u0000\u0113\u0015\u0001"+
		"\u0000\u0000\u0000\u0114\u0118\u0003\u0018\f\u0000\u0115\u0117\u0003\u001a"+
		"\r\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011b\u011d\u0003\u001c\u000e\u0000\u011c\u011b\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u0017\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0005M\u0000\u0000\u011f\u0120\u0003\u0014\n\u0000"+
		"\u0120\u0121\u0005(\u0000\u0000\u0121\u0123\u0005\u0004\u0000\u0000\u0122"+
		"\u0124\u0003\u0004\u0002\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0005\u0005\u0000\u0000\u0128\u0019\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0005N\u0000\u0000\u012a\u012b\u0005M\u0000\u0000\u012b\u012c\u0003"+
		"\u0014\n\u0000\u012c\u012d\u0005(\u0000\u0000\u012d\u012f\u0005\u0004"+
		"\u0000\u0000\u012e\u0130\u0003\u0004\u0002\u0000\u012f\u012e\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0005\u0005\u0000\u0000\u0134\u001b\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0005N\u0000\u0000\u0136\u0138\u0005\u0004\u0000"+
		"\u0000\u0137\u0139\u0003\u0004\u0002\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0005\u0005\u0000\u0000\u013d\u001d\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0005U\u0000\u0000\u013f\u0140\u0003d2\u0000\u0140"+
		"\u0142\u0005\u0004\u0000\u0000\u0141\u0143\u0003 \u0010\u0000\u0142\u0141"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0142"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u014d"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0005?\u0000\u0000\u0147\u0149\u0005"+
		"\b\u0000\u0000\u0148\u014a\u0003\u0004\u0002\u0000\u0149\u0148\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014e\u0001\u0000"+
		"\u0000\u0000\u014d\u0146\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u0005"+
		"\u0000\u0000\u0150\u001f\u0001\u0000\u0000\u0000\u0151\u0152\u0005)\u0000"+
		"\u0000\u0152\u0153\u0007\u0006\u0000\u0000\u0153\u0155\u0005\b\u0000\u0000"+
		"\u0154\u0156\u0003\u0004\u0002\u0000\u0155\u0154\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0001\u0000\u0000\u0000\u0158!\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0005J\u0000\u0000\u015a\u015b\u0003\n\u0005\u0000\u015b\u015c"+
		"\u0007\u0007\u0000\u0000\u015c\u015e\u0005\u0004\u0000\u0000\u015d\u015f"+
		"\u0003\u0004\u0002\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0005\u0005\u0000\u0000\u0163#\u0001\u0000\u0000\u0000\u0164\u0165\u0005"+
		">\u0000\u0000\u0165%\u0001\u0000\u0000\u0000\u0166\u0167\u0005\'\u0000"+
		"\u0000\u0167\u0169\u0003\u0014\n\u0000\u0168\u0166\u0001\u0000\u0000\u0000"+
		"\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000"+
		"\u016a\u0185\u0005J\u0000\u0000\u016b\u016c\u0007\b\u0000\u0000\u016c"+
		"\u016f\u0003d2\u0000\u016d\u016e\u0005%\u0000\u0000\u016e\u0170\u0003"+
		"\n\u0005\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0186\u0001\u0000\u0000\u0000\u0171\u0172\u0005P\u0000"+
		"\u0000\u0172\u0173\u0003d2\u0000\u0173\u0174\u0005\u0012\u0000\u0000\u0174"+
		"\u0175\u0003\n\u0005\u0000\u0175\u0186\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0005;\u0000\u0000\u0177\u0178\u0003d2\u0000\u0178\u0179\u0005E\u0000"+
		"\u0000\u0179\u017a\u0003\n\u0005\u0000\u017a\u0186\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u0005\"\u0000\u0000\u017c\u017d\u0003d2\u0000\u017d\u017e"+
		"\u0005E\u0000\u0000\u017e\u017f\u0003\n\u0005\u0000\u017f\u0186\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0005Q\u0000\u0000\u0181\u0182\u0003\n"+
		"\u0005\u0000\u0182\u0183\u0005\u001d\u0000\u0000\u0183\u0184\u0003d2\u0000"+
		"\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u016b\u0001\u0000\u0000\u0000"+
		"\u0185\u0171\u0001\u0000\u0000\u0000\u0185\u0176\u0001\u0000\u0000\u0000"+
		"\u0185\u017b\u0001\u0000\u0000\u0000\u0185\u0180\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187\u0189\u0005\u0004\u0000\u0000\u0188\u018a\u0003\u0004\u0002\u0000"+
		"\u0189\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018e\u0005\u0005\u0000\u0000"+
		"\u018e\'\u0001\u0000\u0000\u0000\u018f\u0190\u0005@\u0000\u0000\u0190"+
		"\u0191\u0005\u000e\u0000\u0000\u0191\u0192\u0003d2\u0000\u0192\u0193\u0005"+
		"%\u0000\u0000\u0193\u0194\u0003\n\u0005\u0000\u0194\u0195\u0005J\u0000"+
		"\u0000\u0195\u0197\u0005\u0004\u0000\u0000\u0196\u0198\u0003\u0004\u0002"+
		"\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000"+
		"\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0005\u0005\u0000"+
		"\u0000\u019c)\u0001\u0000\u0000\u0000\u019d\u019e\u0005A\u0000\u0000\u019e"+
		"+\u0001\u0000\u0000\u0000\u019f\u01a0\u0005\u0013\u0000\u0000\u01a0-\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a2\u0005V\u0000\u0000\u01a2\u01a3\u0005@\u0000"+
		"\u0000\u01a3\u01a6\u0007\t\u0000\u0000\u01a4\u01a5\u0005%\u0000\u0000"+
		"\u01a5\u01a7\u0003\n\u0005\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a7\u01af\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0005V\u0000\u0000\u01a9\u01aa\u0005@\u0000\u0000\u01aa\u01ab\u0003"+
		"\n\u0005\u0000\u01ab\u01ac\u0005\u0002\u0000\u0000\u01ac\u01ad\u0003\n"+
		"\u0005\u0000\u01ad\u01af\u0001\u0000\u0000\u0000\u01ae\u01a1\u0001\u0000"+
		"\u0000\u0000\u01ae\u01a8\u0001\u0000\u0000\u0000\u01af/\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b1\u0005T\u0000\u0000\u01b1\u01b2\u0005\u0015\u0000\u0000"+
		"\u01b2\u01b3\u0005#\u0000\u0000\u01b3\u01b4\u0005C\u0000\u0000\u01b4\u01b5"+
		"\u0005@\u0000\u0000\u01b5\u01c3\u00032\u0019\u0000\u01b6\u01b7\u0005T"+
		"\u0000\u0000\u01b7\u01b8\u0005\u0015\u0000\u0000\u01b8\u01b9\u0005#\u0000"+
		"\u0000\u01b9\u01ba\u0005F\u0000\u0000\u01ba\u01bb\u0005@\u0000\u0000\u01bb"+
		"\u01c3\u00032\u0019\u0000\u01bc\u01bd\u0005T\u0000\u0000\u01bd\u01be\u0005"+
		"\u0015\u0000\u0000\u01be\u01bf\u0005#\u0000\u0000\u01bf\u01c0\u0005/\u0000"+
		"\u0000\u01c0\u01c1\u0005@\u0000\u0000\u01c1\u01c3\u00032\u0019\u0000\u01c2"+
		"\u01b0\u0001\u0000\u0000\u0000\u01c2\u01b6\u0001\u0000\u0000\u0000\u01c2"+
		"\u01bc\u0001\u0000\u0000\u0000\u01c31\u0001\u0000\u0000\u0000\u01c4\u01c7"+
		"\u00034\u001a\u0000\u01c5\u01c7\u0003\n\u0005\u0000\u01c6\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001"+
		"\u0000\u0000\u0000\u01c8\u01ca\u0007\n\u0000\u0000\u01c9\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca\u01d1\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0003\n\u0005\u0000\u01cc\u01cd\u0007\u0007\u0000"+
		"\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01cb\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d2\u0007\u000b\u0000\u0000\u01d1\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d23\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0005\u00ca\u0000\u0000\u01d45\u0001\u0000\u0000\u0000\u01d5"+
		"\u01da\u00051\u0000\u0000\u01d6\u01d7\u0005%\u0000\u0000\u01d7\u01d8\u0003"+
		"\n\u0005\u0000\u01d8\u01d9\u0007\f\u0000\u0000\u01d9\u01db\u0001\u0000"+
		"\u0000\u0000\u01da\u01d6\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000"+
		"\u0000\u0000\u01db7\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005&\u0000\u0000"+
		"\u01dd\u01e0\u0005C\u0000\u0000\u01de\u01df\u0005%\u0000\u0000\u01df\u01e1"+
		"\u0003\n\u0005\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e19\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\u001e"+
		"\u0000\u0000\u01e3\u01e6\u0005C\u0000\u0000\u01e4\u01e5\u0005%\u0000\u0000"+
		"\u01e5\u01e7\u0003\n\u0005\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e7;\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0005\u000b\u0000\u0000\u01e9\u01ea\u00053\u0000\u0000\u01ea\u01eb\u0005"+
		"@\u0000\u0000\u01eb\u01ec\u0003\n\u0005\u0000\u01ec=\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0005*\u0000\u0000\u01ee\u01fb\u0003\n\u0005\u0000"+
		"\u01ef\u01f0\u0005<\u0000\u0000\u01f0\u01f3\u0005L\u0000\u0000\u01f1\u01f2"+
		"\u0005G\u0000\u0000\u01f2\u01f4\u00059\u0000\u0000\u01f3\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01fc\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0005=\u0000\u0000\u01f6\u01f9\u0005 \u0000\u0000"+
		"\u01f7\u01f8\u0005G\u0000\u0000\u01f8\u01fa\u00059\u0000\u0000\u01f9\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fb\u01ef\u0001\u0000\u0000\u0000\u01fb\u01f5"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc?\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u00056\u0000\u0000\u01fe\u01ff\u0003d2"+
		"\u0000\u01ffA\u0001\u0000\u0000\u0000\u0200\u0201\u0003d2\u0000\u0201"+
		"\u0204\u0007\r\u0000\u0000\u0202\u0205\u0003\n\u0005\u0000\u0203\u0205"+
		"\u0003^/\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0203\u0001\u0000"+
		"\u0000\u0000\u0205\u0233\u0001\u0000\u0000\u0000\u0206\u020b\u0003d2\u0000"+
		"\u0207\u0208\u0005\u0006\u0000\u0000\u0208\u0209\u0003D\"\u0000\u0209"+
		"\u020a\u0005\u0007\u0000\u0000\u020a\u020c\u0001\u0000\u0000\u0000\u020b"+
		"\u0207\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d"+
		"\u020b\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e"+
		"\u020f\u0001\u0000\u0000\u0000\u020f\u0212\u0007\r\u0000\u0000\u0210\u0213"+
		"\u0003\n\u0005\u0000\u0211\u0213\u0003^/\u0000\u0212\u0210\u0001\u0000"+
		"\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213\u0233\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0003d2\u0000\u0215\u0216\u0005\u0004\u0000\u0000"+
		"\u0216\u0217\u0003D\"\u0000\u0217\u0218\u0005\u0005\u0000\u0000\u0218"+
		"\u0219\u0001\u0000\u0000\u0000\u0219\u021c\u0007\r\u0000\u0000\u021a\u021d"+
		"\u0003\n\u0005\u0000\u021b\u021d\u0003^/\u0000\u021c\u021a\u0001\u0000"+
		"\u0000\u0000\u021c\u021b\u0001\u0000\u0000\u0000\u021d\u0233\u0001\u0000"+
		"\u0000\u0000\u021e\u021f\u0003d2\u0000\u021f\u0220\u0007\u000e\u0000\u0000"+
		"\u0220\u0221\u0003\n\u0005\u0000\u0221\u0233\u0001\u0000\u0000\u0000\u0222"+
		"\u0223\u0003d2\u0000\u0223\u0224\u0007\u000f\u0000\u0000\u0224\u0225\u0003"+
		"\n\u0005\u0000\u0225\u0233\u0001\u0000\u0000\u0000\u0226\u0227\u0003d"+
		"2\u0000\u0227\u0228\u0007\u0010\u0000\u0000\u0228\u0229\u0003\n\u0005"+
		"\u0000\u0229\u0233\u0001\u0000\u0000\u0000\u022a\u022b\u0003d2\u0000\u022b"+
		"\u022c\u0007\u0011\u0000\u0000\u022c\u022d\u0003\n\u0005\u0000\u022d\u0233"+
		"\u0001\u0000\u0000\u0000\u022e\u022f\u0003d2\u0000\u022f\u0230\u0007\u0012"+
		"\u0000\u0000\u0230\u0231\u0003\n\u0005\u0000\u0231\u0233\u0001\u0000\u0000"+
		"\u0000\u0232\u0200\u0001\u0000\u0000\u0000\u0232\u0206\u0001\u0000\u0000"+
		"\u0000\u0232\u0214\u0001\u0000\u0000\u0000\u0232\u021e\u0001\u0000\u0000"+
		"\u0000\u0232\u0222\u0001\u0000\u0000\u0000\u0232\u0226\u0001\u0000\u0000"+
		"\u0000\u0232\u022a\u0001\u0000\u0000\u0000\u0232\u022e\u0001\u0000\u0000"+
		"\u0000\u0233C\u0001\u0000\u0000\u0000\u0234\u0235\u0003\n\u0005\u0000"+
		"\u0235E\u0001\u0000\u0000\u0000\u0236\u0237\u0005\t\u0000\u0000\u0237"+
		"\u0238\u0005C\u0000\u0000\u0238G\u0001\u0000\u0000\u0000\u0239\u023a\u0005"+
		"7\u0000\u0000\u023a\u023b\u0005C\u0000\u0000\u023bI\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u00058\u0000\u0000\u023dK\u0001\u0000\u0000\u0000\u023e"+
		"\u023f\u0005\u0089\u0000\u0000\u023f\u0240\u0005\u0001\u0000\u0000\u0240"+
		"\u0241\u0003\n\u0005\u0000\u0241\u0242\u0005\u0003\u0000\u0000\u0242\u02e8"+
		"\u0001\u0000\u0000\u0000\u0243\u0244\u0005\u0081\u0000\u0000\u0244\u0245"+
		"\u0005\u0001\u0000\u0000\u0245\u0246\u0003\n\u0005\u0000\u0246\u0247\u0005"+
		"\u0003\u0000\u0000\u0247\u02e8\u0001\u0000\u0000\u0000\u0248\u0249\u0005"+
		"\u0080\u0000\u0000\u0249\u024a\u0005\u0001\u0000\u0000\u024a\u024b\u0003"+
		"\n\u0005\u0000\u024b\u024c\u0005\u0003\u0000\u0000\u024c\u02e8\u0001\u0000"+
		"\u0000\u0000\u024d\u024e\u0005\u0082\u0000\u0000\u024e\u024f\u0005\u0001"+
		"\u0000\u0000\u024f\u0250\u0003\n\u0005\u0000\u0250\u0251\u0005\u0002\u0000"+
		"\u0000\u0251\u0252\u0003\n\u0005\u0000\u0252\u0253\u0005\u0003\u0000\u0000"+
		"\u0253\u02e8\u0001\u0000\u0000\u0000\u0254\u0255\u0005~\u0000\u0000\u0255"+
		"\u0256\u0005\u0001\u0000\u0000\u0256\u0257\u0003\n\u0005\u0000\u0257\u0258"+
		"\u0005\u0002\u0000\u0000\u0258\u0259\u0003\n\u0005\u0000\u0259\u025a\u0005"+
		"\u0003\u0000\u0000\u025a\u02e8\u0001\u0000\u0000\u0000\u025b\u025c\u0005"+
		"x\u0000\u0000\u025c\u025d\u0005\u0001\u0000\u0000\u025d\u025e\u0003\n"+
		"\u0005\u0000\u025e\u025f\u0005\u0002\u0000\u0000\u025f\u0260\u0003\n\u0005"+
		"\u0000\u0260\u0261\u0005\u0003\u0000\u0000\u0261\u02e8\u0001\u0000\u0000"+
		"\u0000\u0262\u0263\u0005s\u0000\u0000\u0263\u0264\u0005\u0001\u0000\u0000"+
		"\u0264\u0265\u0003\n\u0005\u0000\u0265\u0266\u0005\u0003\u0000\u0000\u0266"+
		"\u02e8\u0001\u0000\u0000\u0000\u0267\u0268\u0005\u0088\u0000\u0000\u0268"+
		"\u0269\u0005\u0001\u0000\u0000\u0269\u026a\u0003\n\u0005\u0000\u026a\u026b"+
		"\u0005\u0003\u0000\u0000\u026b\u02e8\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0005o\u0000\u0000\u026d\u0273\u0005\u0001\u0000\u0000\u026e\u0274\u0003"+
		"\n\u0005\u0000\u026f\u0270\u0003\n\u0005\u0000\u0270\u0271\u0005\u0002"+
		"\u0000\u0000\u0271\u0272\u0003\n\u0005\u0000\u0272\u0274\u0001\u0000\u0000"+
		"\u0000\u0273\u026e\u0001\u0000\u0000\u0000\u0273\u026f\u0001\u0000\u0000"+
		"\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276\u0005\u0003\u0000"+
		"\u0000\u0276\u02e8\u0001\u0000\u0000\u0000\u0277\u0278\u0005|\u0000\u0000"+
		"\u0278\u0279\u0005\u0001\u0000\u0000\u0279\u027a\u0003\n\u0005\u0000\u027a"+
		"\u027b\u0005\u0002\u0000\u0000\u027b\u027c\u0003\n\u0005\u0000\u027c\u027d"+
		"\u0005\u0003\u0000\u0000\u027d\u02e8\u0001\u0000\u0000\u0000\u027e\u027f"+
		"\u0005{\u0000\u0000\u027f\u0280\u0005\u0001\u0000\u0000\u0280\u0281\u0003"+
		"\n\u0005\u0000\u0281\u0282\u0005\u0002\u0000\u0000\u0282\u0283\u0003\n"+
		"\u0005\u0000\u0283\u0284\u0005\u0003\u0000\u0000\u0284\u02e8\u0001\u0000"+
		"\u0000\u0000\u0285\u0286\u0005}\u0000\u0000\u0286\u028c\u0005\u0001\u0000"+
		"\u0000\u0287\u028d\u0003\n\u0005\u0000\u0288\u0289\u0003\n\u0005\u0000"+
		"\u0289\u028a\u0005\u0002\u0000\u0000\u028a\u028b\u0003\n\u0005\u0000\u028b"+
		"\u028d\u0001\u0000\u0000\u0000\u028c\u0287\u0001\u0000\u0000\u0000\u028c"+
		"\u0288\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d"+
		"\u028e\u0001\u0000\u0000\u0000\u028e\u02e8\u0005\u0003\u0000\u0000\u028f"+
		"\u0290\u0005\u0083\u0000\u0000\u0290\u0291\u0005\u0001\u0000\u0000\u0291"+
		"\u0292\u0003\n\u0005\u0000\u0292\u0293\u0005\u0003\u0000\u0000\u0293\u02e8"+
		"\u0001\u0000\u0000\u0000\u0294\u0295\u0005\u0085\u0000\u0000\u0295\u0296"+
		"\u0005\u0001\u0000\u0000\u0296\u0297\u0003\n\u0005\u0000\u0297\u0298\u0005"+
		"\u0003\u0000\u0000\u0298\u02e8\u0001\u0000\u0000\u0000\u0299\u029a\u0005"+
		"u\u0000\u0000\u029a\u029b\u0005\u0001\u0000\u0000\u029b\u029c\u0003\n"+
		"\u0005\u0000\u029c\u029d\u0005\u0003\u0000\u0000\u029d\u02e8\u0001\u0000"+
		"\u0000\u0000\u029e\u029f\u0005\u0086\u0000\u0000\u029f\u02a0\u0005\u0001"+
		"\u0000\u0000\u02a0\u02a1\u0003\n\u0005\u0000\u02a1\u02a2\u0005\u0003\u0000"+
		"\u0000\u02a2\u02e8\u0001\u0000\u0000\u0000\u02a3\u02a4\u0005p\u0000\u0000"+
		"\u02a4\u02a5\u0005\u0001\u0000\u0000\u02a5\u02a6\u0003\n\u0005\u0000\u02a6"+
		"\u02a7\u0005\u0003\u0000\u0000\u02a7\u02e8\u0001\u0000\u0000\u0000\u02a8"+
		"\u02a9\u0005n\u0000\u0000\u02a9\u02aa\u0005\u0001\u0000\u0000\u02aa\u02ab"+
		"\u0003\n\u0005\u0000\u02ab\u02ac\u0005\u0003\u0000\u0000\u02ac\u02e8\u0001"+
		"\u0000\u0000\u0000\u02ad\u02ae\u0005q\u0000\u0000\u02ae\u02af\u0005\u0001"+
		"\u0000\u0000\u02af\u02b0\u0003\n\u0005\u0000\u02b0\u02b1\u0005\u0003\u0000"+
		"\u0000\u02b1\u02e8\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005r\u0000\u0000"+
		"\u02b3\u02b4\u0005\u0001\u0000\u0000\u02b4\u02b5\u0003\n\u0005\u0000\u02b5"+
		"\u02b6\u0005\u0002\u0000\u0000\u02b6\u02b7\u0003\n\u0005\u0000\u02b7\u02b8"+
		"\u0005\u0003\u0000\u0000\u02b8\u02e8\u0001\u0000\u0000\u0000\u02b9\u02ba"+
		"\u0005\u0084\u0000\u0000\u02ba\u02bb\u0005\u0001\u0000\u0000\u02bb\u02bc"+
		"\u0003\n\u0005\u0000\u02bc\u02bd\u0005\u0003\u0000\u0000\u02bd\u02e8\u0001"+
		"\u0000\u0000\u0000\u02be\u02bf\u0005t\u0000\u0000\u02bf\u02c0\u0005\u0001"+
		"\u0000\u0000\u02c0\u02c1\u0003\n\u0005\u0000\u02c1\u02c2\u0005\u0003\u0000"+
		"\u0000\u02c2\u02e8\u0001\u0000\u0000\u0000\u02c3\u02c4\u0005\u0087\u0000"+
		"\u0000\u02c4\u02c5\u0005\u0001\u0000\u0000\u02c5\u02c6\u0003\n\u0005\u0000"+
		"\u02c6\u02c7\u0005\u0003\u0000\u0000\u02c7\u02e8\u0001\u0000\u0000\u0000"+
		"\u02c8\u02c9\u0005z\u0000\u0000\u02c9\u02cf\u0005\u0001\u0000\u0000\u02ca"+
		"\u02d0\u0003\n\u0005\u0000\u02cb\u02cc\u0003\n\u0005\u0000\u02cc\u02cd"+
		"\u0005\u0002\u0000\u0000\u02cd\u02ce\u0003\n\u0005\u0000\u02ce\u02d0\u0001"+
		"\u0000\u0000\u0000\u02cf\u02ca\u0001\u0000\u0000\u0000\u02cf\u02cb\u0001"+
		"\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d2\u0005"+
		"\u0003\u0000\u0000\u02d2\u02e8\u0001\u0000\u0000\u0000\u02d3\u02d4\u0005"+
		"w\u0000\u0000\u02d4\u02d5\u0005\u0001\u0000\u0000\u02d5\u02d6\u0003\n"+
		"\u0005\u0000\u02d6\u02d7\u0005\u0003\u0000\u0000\u02d7\u02e8\u0001\u0000"+
		"\u0000\u0000\u02d8\u02d9\u0005\u007f\u0000\u0000\u02d9\u02da\u0005\u0001"+
		"\u0000\u0000\u02da\u02db\u0003\n\u0005\u0000\u02db\u02dc\u0005\u0003\u0000"+
		"\u0000\u02dc\u02e8\u0001\u0000\u0000\u0000\u02dd\u02de\u0005y\u0000\u0000"+
		"\u02de\u02df\u0005\u0001\u0000\u0000\u02df\u02e0\u0003d2\u0000\u02e0\u02e1"+
		"\u0005\u0003\u0000\u0000\u02e1\u02e8\u0001\u0000\u0000\u0000\u02e2\u02e3"+
		"\u0005v\u0000\u0000\u02e3\u02e4\u0005\u0001\u0000\u0000\u02e4\u02e5\u0003"+
		"d2\u0000\u02e5\u02e6\u0005\u0003\u0000\u0000\u02e6\u02e8\u0001\u0000\u0000"+
		"\u0000\u02e7\u023e\u0001\u0000\u0000\u0000\u02e7\u0243\u0001\u0000\u0000"+
		"\u0000\u02e7\u0248\u0001\u0000\u0000\u0000\u02e7\u024d\u0001\u0000\u0000"+
		"\u0000\u02e7\u0254\u0001\u0000\u0000\u0000\u02e7\u025b\u0001\u0000\u0000"+
		"\u0000\u02e7\u0262\u0001\u0000\u0000\u0000\u02e7\u0267\u0001\u0000\u0000"+
		"\u0000\u02e7\u026c\u0001\u0000\u0000\u0000\u02e7\u0277\u0001\u0000\u0000"+
		"\u0000\u02e7\u027e\u0001\u0000\u0000\u0000\u02e7\u0285\u0001\u0000\u0000"+
		"\u0000\u02e7\u028f\u0001\u0000\u0000\u0000\u02e7\u0294\u0001\u0000\u0000"+
		"\u0000\u02e7\u0299\u0001\u0000\u0000\u0000\u02e7\u029e\u0001\u0000\u0000"+
		"\u0000\u02e7\u02a3\u0001\u0000\u0000\u0000\u02e7\u02a8\u0001\u0000\u0000"+
		"\u0000\u02e7\u02ad\u0001\u0000\u0000\u0000\u02e7\u02b2\u0001\u0000\u0000"+
		"\u0000\u02e7\u02b9\u0001\u0000\u0000\u0000\u02e7\u02be\u0001\u0000\u0000"+
		"\u0000\u02e7\u02c3\u0001\u0000\u0000\u0000\u02e7\u02c8\u0001\u0000\u0000"+
		"\u0000\u02e7\u02d3\u0001\u0000\u0000\u0000\u02e7\u02d8\u0001\u0000\u0000"+
		"\u0000\u02e7\u02dd\u0001\u0000\u0000\u0000\u02e7\u02e2\u0001\u0000\u0000"+
		"\u0000\u02e8M\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005\u001f\u0000\u0000"+
		"\u02ea\u02eb\u0003P(\u0000\u02ebO\u0001\u0000\u0000\u0000\u02ec\u02ed"+
		"\u0005\u0095\u0000\u0000\u02ed\u02ee\u0005\u0001\u0000\u0000\u02ee\u02ef"+
		"\u0003\n\u0005\u0000\u02ef\u02f0\u0005\u0002\u0000\u0000\u02f0\u02f1\u0003"+
		"\n\u0005\u0000\u02f1\u02f2\u0005\u0002\u0000\u0000\u02f2\u02f3\u0003\n"+
		"\u0005\u0000\u02f3\u02f4\u0005\u0002\u0000\u0000\u02f4\u02f5\u0003\n\u0005"+
		"\u0000\u02f5\u02f6\u0005\u0003\u0000\u0000\u02f6\u03ab\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f8\u0005\u0092\u0000\u0000\u02f8\u02f9\u0005\u0001\u0000"+
		"\u0000\u02f9\u02fa\u0003\n\u0005\u0000\u02fa\u02fb\u0005\u0002\u0000\u0000"+
		"\u02fb\u02fc\u0003\n\u0005\u0000\u02fc\u02fd\u0005\u0002\u0000\u0000\u02fd"+
		"\u02fe\u0003\n\u0005\u0000\u02fe\u0300\u0005\u0003\u0000\u0000\u02ff\u0301"+
		"\u0003R)\u0000\u0300\u02ff\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000"+
		"\u0000\u0000\u0301\u03ab\u0001\u0000\u0000\u0000\u0302\u0303\u0005\u0093"+
		"\u0000\u0000\u0303\u0304\u0005\u0001\u0000\u0000\u0304\u0305\u0003\n\u0005"+
		"\u0000\u0305\u0306\u0005\u0002\u0000\u0000\u0306\u0307\u0003\n\u0005\u0000"+
		"\u0307\u0308\u0005\u0002\u0000\u0000\u0308\u0309\u0003\n\u0005\u0000\u0309"+
		"\u030a\u0005\u0002\u0000\u0000\u030a\u030b\u0003\n\u0005\u0000\u030b\u030d"+
		"\u0005\u0003\u0000\u0000\u030c\u030e\u0003R)\u0000\u030d\u030c\u0001\u0000"+
		"\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u03ab\u0001\u0000"+
		"\u0000\u0000\u030f\u0310\u0005\u0094\u0000\u0000\u0310\u0311\u0005\u0001"+
		"\u0000\u0000\u0311\u0312\u0003\n\u0005\u0000\u0312\u0313\u0005\u0002\u0000"+
		"\u0000\u0313\u0314\u0003\n\u0005\u0000\u0314\u0315\u0005\u0002\u0000\u0000"+
		"\u0315\u0316\u0003\n\u0005\u0000\u0316\u0317\u0005\u0002\u0000\u0000\u0317"+
		"\u0318\u0003\n\u0005\u0000\u0318\u0319\u0005\u0002\u0000\u0000\u0319\u031a"+
		"\u0003\n\u0005\u0000\u031a\u031c\u0005\u0003\u0000\u0000\u031b\u031d\u0003"+
		"R)\u0000\u031c\u031b\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000"+
		"\u0000\u031d\u03ab\u0001\u0000\u0000\u0000\u031e\u031f\u0005\u008c\u0000"+
		"\u0000\u031f\u0320\u0005\u0001\u0000\u0000\u0320\u0321\u0003\n\u0005\u0000"+
		"\u0321\u0322\u0005\u0002\u0000\u0000\u0322\u0323\u0003\n\u0005\u0000\u0323"+
		"\u0324\u0005\u0002\u0000\u0000\u0324\u0325\u0003\n\u0005\u0000\u0325\u0327"+
		"\u0005\u0003\u0000\u0000\u0326\u0328\u0003R)\u0000\u0327\u0326\u0001\u0000"+
		"\u0000\u0000\u0327\u0328\u0001\u0000\u0000\u0000\u0328\u03ab\u0001\u0000"+
		"\u0000\u0000\u0329\u032a\u0005\u008e\u0000\u0000\u032a\u032b\u0005\u0001"+
		"\u0000\u0000\u032b\u032c\u0003\n\u0005\u0000\u032c\u032d\u0005\u0002\u0000"+
		"\u0000\u032d\u032e\u0003\n\u0005\u0000\u032e\u032f\u0005\u0002\u0000\u0000"+
		"\u032f\u0330\u0003\n\u0005\u0000\u0330\u0331\u0005\u0002\u0000\u0000\u0331"+
		"\u0332\u0003\n\u0005\u0000\u0332\u0334\u0005\u0003\u0000\u0000\u0333\u0335"+
		"\u0003R)\u0000\u0334\u0333\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000"+
		"\u0000\u0000\u0335\u03ab\u0001\u0000\u0000\u0000\u0336\u0337\u0005\u008a"+
		"\u0000\u0000\u0337\u0338\u0005\u0001\u0000\u0000\u0338\u0339\u0003\n\u0005"+
		"\u0000\u0339\u033a\u0005\u0002\u0000\u0000\u033a\u033b\u0003\n\u0005\u0000"+
		"\u033b\u033c\u0005\u0002\u0000\u0000\u033c\u033d\u0003\n\u0005\u0000\u033d"+
		"\u033e\u0005\u0002\u0000\u0000\u033e\u033f\u0003\n\u0005\u0000\u033f\u0340"+
		"\u0005\u0002\u0000\u0000\u0340\u0341\u0003\n\u0005\u0000\u0341\u0342\u0005"+
		"\u0002\u0000\u0000\u0342\u0345\u0003\n\u0005\u0000\u0343\u0344\u0005\u0002"+
		"\u0000\u0000\u0344\u0346\u0007\u0013\u0000\u0000\u0345\u0343\u0001\u0000"+
		"\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u0347\u0001\u0000"+
		"\u0000\u0000\u0347\u0349\u0005\u0003\u0000\u0000\u0348\u034a\u0003R)\u0000"+
		"\u0349\u0348\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000"+
		"\u034a\u03ab\u0001\u0000\u0000\u0000\u034b\u034c\u0005\u0091\u0000\u0000"+
		"\u034c\u034d\u0005\u0001\u0000\u0000\u034d\u034e\u0003\n\u0005\u0000\u034e"+
		"\u034f\u0005\u0002\u0000\u0000\u034f\u0350\u0003\n\u0005\u0000\u0350\u0351"+
		"\u0005\u0002\u0000\u0000\u0351\u0352\u0003\n\u0005\u0000\u0352\u0353\u0005"+
		"\u0002\u0000\u0000\u0353\u0354\u0003\n\u0005\u0000\u0354\u0355\u0005\u0002"+
		"\u0000\u0000\u0355\u0356\u0003\n\u0005\u0000\u0356\u0358\u0005\u0003\u0000"+
		"\u0000\u0357\u0359\u0003R)\u0000\u0358\u0357\u0001\u0000\u0000\u0000\u0358"+
		"\u0359\u0001\u0000\u0000\u0000\u0359\u03ab\u0001\u0000\u0000\u0000\u035a"+
		"\u035b\u0005\u008f\u0000\u0000\u035b\u035c\u0005\u0001\u0000\u0000\u035c"+
		"\u035d\u0003\n\u0005\u0000\u035d\u035e\u0005\u0002\u0000\u0000\u035e\u035f"+
		"\u0003\n\u0005\u0000\u035f\u0360\u0005\u0002\u0000\u0000\u0360\u0361\u0003"+
		"\n\u0005\u0000\u0361\u0362\u0005\u0002\u0000\u0000\u0362\u0363\u0003\n"+
		"\u0005\u0000\u0363\u0364\u0005\u0002\u0000\u0000\u0364\u0365\u0003\n\u0005"+
		"\u0000\u0365\u0367\u0005\u0003\u0000\u0000\u0366\u0368\u0003R)\u0000\u0367"+
		"\u0366\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000\u0368"+
		"\u03ab\u0001\u0000\u0000\u0000\u0369\u036a\u0005\u0090\u0000\u0000\u036a"+
		"\u036b\u0005\u0001\u0000\u0000\u036b\u036c\u0003\n\u0005\u0000\u036c\u036d"+
		"\u0005\u0002\u0000\u0000\u036d\u036e\u0003\n\u0005\u0000\u036e\u036f\u0005"+
		"\u0002\u0000\u0000\u036f\u0370\u0003\n\u0005\u0000\u0370\u0371\u0005\u0002"+
		"\u0000\u0000\u0371\u0372\u0003\n\u0005\u0000\u0372\u0373\u0005\u0002\u0000"+
		"\u0000\u0373\u0374\u0003\n\u0005\u0000\u0374\u0375\u0005\u0002\u0000\u0000"+
		"\u0375\u037d\u0003\n\u0005\u0000\u0376\u0377\u0005\u0002\u0000\u0000\u0377"+
		"\u0378\u0003\n\u0005\u0000\u0378\u0379\u0005\u0002\u0000\u0000\u0379\u037a"+
		"\u0003\n\u0005\u0000\u037a\u037c\u0001\u0000\u0000\u0000\u037b\u0376\u0001"+
		"\u0000\u0000\u0000\u037c\u037f\u0001\u0000\u0000\u0000\u037d\u037b\u0001"+
		"\u0000\u0000\u0000\u037d\u037e\u0001\u0000\u0000\u0000\u037e\u0380\u0001"+
		"\u0000\u0000\u0000\u037f\u037d\u0001\u0000\u0000\u0000\u0380\u0382\u0005"+
		"\u0003\u0000\u0000\u0381\u0383\u0003R)\u0000\u0382\u0381\u0001\u0000\u0000"+
		"\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u03ab\u0001\u0000\u0000"+
		"\u0000\u0384\u0385\u0005\u008d\u0000\u0000\u0385\u0386\u0005\u0001\u0000"+
		"\u0000\u0386\u0387\u0003\n\u0005\u0000\u0387\u0388\u0005\u0002\u0000\u0000"+
		"\u0388\u0389\u0003\n\u0005\u0000\u0389\u038a\u0005\u0002\u0000\u0000\u038a"+
		"\u038b\u0003\n\u0005\u0000\u038b\u038c\u0005\u0002\u0000\u0000\u038c\u038d"+
		"\u0003\n\u0005\u0000\u038d\u038e\u0005\u0002\u0000\u0000\u038e\u038f\u0003"+
		"\n\u0005\u0000\u038f\u0390\u0005\u0002\u0000\u0000\u0390\u0391\u0003\n"+
		"\u0005\u0000\u0391\u0393\u0005\u0003\u0000\u0000\u0392\u0394\u0003R)\u0000"+
		"\u0393\u0392\u0001\u0000\u0000\u0000\u0393\u0394\u0001\u0000\u0000\u0000"+
		"\u0394\u03ab\u0001\u0000\u0000\u0000\u0395\u0396\u0005\u008b\u0000\u0000"+
		"\u0396\u0397\u0005\u0001\u0000\u0000\u0397\u0398\u0003\n\u0005\u0000\u0398"+
		"\u0399\u0005\u0002\u0000\u0000\u0399\u039a\u0003\n\u0005\u0000\u039a\u039b"+
		"\u0005\u0002\u0000\u0000\u039b\u039c\u0003\n\u0005\u0000\u039c\u039d\u0005"+
		"\u0002\u0000\u0000\u039d\u039e\u0003\n\u0005\u0000\u039e\u039f\u0005\u0002"+
		"\u0000\u0000\u039f\u03a0\u0003\n\u0005\u0000\u03a0\u03a1\u0005\u0002\u0000"+
		"\u0000\u03a1\u03a2\u0003\n\u0005\u0000\u03a2\u03a3\u0005\u0002\u0000\u0000"+
		"\u03a3\u03a4\u0003\n\u0005\u0000\u03a4\u03a5\u0005\u0002\u0000\u0000\u03a5"+
		"\u03a6\u0003\n\u0005\u0000\u03a6\u03a8\u0005\u0003\u0000\u0000\u03a7\u03a9"+
		"\u0003R)\u0000\u03a8\u03a7\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000"+
		"\u0000\u0000\u03a9\u03ab\u0001\u0000\u0000\u0000\u03aa\u02ec\u0001\u0000"+
		"\u0000\u0000\u03aa\u02f7\u0001\u0000\u0000\u0000\u03aa\u0302\u0001\u0000"+
		"\u0000\u0000\u03aa\u030f\u0001\u0000\u0000\u0000\u03aa\u031e\u0001\u0000"+
		"\u0000\u0000\u03aa\u0329\u0001\u0000\u0000\u0000\u03aa\u0336\u0001\u0000"+
		"\u0000\u0000\u03aa\u034b\u0001\u0000\u0000\u0000\u03aa\u035a\u0001\u0000"+
		"\u0000\u0000\u03aa\u0369\u0001\u0000\u0000\u0000\u03aa\u0384\u0001\u0000"+
		"\u0000\u0000\u03aa\u0395\u0001\u0000\u0000\u0000\u03abQ\u0001\u0000\u0000"+
		"\u0000\u03ac\u03ad\u0005O\u0000\u0000\u03ad\u03b1\u0005F\u0000\u0000\u03ae"+
		"\u03af\u0005$\u0000\u0000\u03af\u03b0\u0005O\u0000\u0000\u03b0\u03b2\u0005"+
		"\u0014\u0000\u0000\u03b1\u03ae\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001"+
		"\u0000\u0000\u0000\u03b2\u03bb\u0001\u0000\u0000\u0000\u03b3\u03b4\u0005"+
		"O\u0000\u0000\u03b4\u03b8\u0005\u0014\u0000\u0000\u03b5\u03b6\u0005$\u0000"+
		"\u0000\u03b6\u03b7\u0005O\u0000\u0000\u03b7\u03b9\u0005F\u0000\u0000\u03b8"+
		"\u03b5\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9"+
		"\u03bb\u0001\u0000\u0000\u0000\u03ba\u03ac\u0001\u0000\u0000\u0000\u03ba"+
		"\u03b3\u0001\u0000\u0000\u0000\u03bbS\u0001\u0000\u0000\u0000\u03bc\u03bd"+
		"\u0005\u001f\u0000\u0000\u03bd\u03bf\u0005\u000f\u0000\u0000\u03be\u03c0"+
		"\u0003R)\u0000\u03bf\u03be\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000"+
		"\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c5\u0005\u0004"+
		"\u0000\u0000\u03c2\u03c3\u0003V+\u0000\u03c3\u03c4\u0005\u00c3\u0000\u0000"+
		"\u03c4\u03c6\u0001\u0000\u0000\u0000\u03c5\u03c2\u0001\u0000\u0000\u0000"+
		"\u03c6\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c5\u0001\u0000\u0000\u0000"+
		"\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000"+
		"\u03c9\u03ca\u0005\u0005\u0000\u0000\u03caU\u0001\u0000\u0000\u0000\u03cb"+
		"\u03cc\u0005:\u0000\u0000\u03cc\u03cd\u0005\f\u0000\u0000\u03cd\u03ce"+
		"\u0003\n\u0005\u0000\u03ce\u03cf\u0005\u0002\u0000\u0000\u03cf\u03d0\u0003"+
		"\n\u0005\u0000\u03d0\u03f3\u0001\u0000\u0000\u0000\u03d1\u03d2\u00059"+
		"\u0000\u0000\u03d2\u03d3\u0005\f\u0000\u0000\u03d3\u03d4\u0003\n\u0005"+
		"\u0000\u03d4\u03d5\u0005\u0002\u0000\u0000\u03d5\u03d6\u0003\n\u0005\u0000"+
		"\u03d6\u03f3\u0001\u0000\u0000\u0000\u03d7\u03d8\u0005\u0017\u0000\u0000"+
		"\u03d8\u03d9\u0005H\u0000\u0000\u03d9\u03da\u0005\f\u0000\u0000\u03da"+
		"\u03db\u0003\n\u0005\u0000\u03db\u03dc\u0005\u0002\u0000\u0000\u03dc\u03dd"+
		"\u0003\n\u0005\u0000\u03dd\u03de\u0005\u0002\u0000\u0000\u03de\u03df\u0003"+
		"\n\u0005\u0000\u03df\u03e0\u0005\u0002\u0000\u0000\u03e0\u03e1\u0003\n"+
		"\u0005\u0000\u03e1\u03f3\u0001\u0000\u0000\u0000\u03e2\u03e3\u0005\u0017"+
		"\u0000\u0000\u03e3\u03e4\u0005\u0016\u0000\u0000\u03e4\u03e5\u0005\f\u0000"+
		"\u0000\u03e5\u03e6\u0003\n\u0005\u0000\u03e6\u03e7\u0005\u0002\u0000\u0000"+
		"\u03e7\u03e8\u0003\n\u0005\u0000\u03e8\u03e9\u0005\u0002\u0000\u0000\u03e9"+
		"\u03ea\u0003\n\u0005\u0000\u03ea\u03eb\u0005\u0002\u0000\u0000\u03eb\u03ec"+
		"\u0003\n\u0005\u0000\u03ec\u03ed\u0005\u0002\u0000\u0000\u03ed\u03ee\u0003"+
		"\n\u0005\u0000\u03ee\u03ef\u0005\u0002\u0000\u0000\u03ef\u03f0\u0003\n"+
		"\u0005\u0000\u03f0\u03f3\u0001\u0000\u0000\u0000\u03f1\u03f3\u0005-\u0000"+
		"\u0000\u03f2\u03cb\u0001\u0000\u0000\u0000\u03f2\u03d1\u0001\u0000\u0000"+
		"\u0000\u03f2\u03d7\u0001\u0000\u0000\u0000\u03f2\u03e2\u0001\u0000\u0000"+
		"\u0000\u03f2\u03f1\u0001\u0000\u0000\u0000\u03f3W\u0001\u0000\u0000\u0000"+
		"\u03f4\u03f5\u0005R\u0000\u0000\u03f5\u03f6\u0005\u00c3\u0000\u0000\u03f6"+
		"\u03f7\u0007\u0014\u0000\u0000\u03f7\u03f8\u0005\u0001\u0000\u0000\u03f8"+
		"\u03f9\u0005\u0003\u0000\u0000\u03f9Y\u0001\u0000\u0000\u0000\u03fa\u03fb"+
		"\u0003d2\u0000\u03fb\u0411\u0005\u00c3\u0000\u0000\u03fc\u03fd\u0005l"+
		"\u0000\u0000\u03fd\u03fe\u0005\u0001\u0000\u0000\u03fe\u0412\u0005\u0003"+
		"\u0000\u0000\u03ff\u0400\u0005j\u0000\u0000\u0400\u0401\u0005\u0001\u0000"+
		"\u0000\u0401\u0406\u0005\u0003\u0000\u0000\u0402\u0403\u0005\u0006\u0000"+
		"\u0000\u0403\u0404\u0003D\"\u0000\u0404\u0405\u0005\u0007\u0000\u0000"+
		"\u0405\u0407\u0001\u0000\u0000\u0000\u0406\u0402\u0001\u0000\u0000\u0000"+
		"\u0406\u0407\u0001\u0000\u0000\u0000\u0407\u0412\u0001\u0000\u0000\u0000"+
		"\u0408\u0409\u0005m\u0000\u0000\u0409\u040a\u0005\u0001\u0000\u0000\u040a"+
		"\u040d\u0003\n\u0005\u0000\u040b\u040c\u0005\u0002\u0000\u0000\u040c\u040e"+
		"\u0003\n\u0005\u0000\u040d\u040b\u0001\u0000\u0000\u0000\u040d\u040e\u0001"+
		"\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u0410\u0005"+
		"\u0003\u0000\u0000\u0410\u0412\u0001\u0000\u0000\u0000\u0411\u03fc\u0001"+
		"\u0000\u0000\u0000\u0411\u03ff\u0001\u0000\u0000\u0000\u0411\u0408\u0001"+
		"\u0000\u0000\u0000\u0412[\u0001\u0000\u0000\u0000\u0413\u0414\u0005.\u0000"+
		"\u0000\u0414\u0415\u0005\u0001\u0000\u0000\u0415\u041a\u0005\u00cc\u0000"+
		"\u0000\u0416\u0417\u0005\u0002\u0000\u0000\u0417\u0419\u0003\n\u0005\u0000"+
		"\u0418\u0416\u0001\u0000\u0000\u0000\u0419\u041c\u0001\u0000\u0000\u0000"+
		"\u041a\u0418\u0001\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000"+
		"\u041b\u041d\u0001\u0000\u0000\u0000\u041c\u041a\u0001\u0000\u0000\u0000"+
		"\u041d\u041e\u0005\u0003\u0000\u0000\u041e]\u0001\u0000\u0000\u0000\u041f"+
		"\u0424\u0007\u0015\u0000\u0000\u0420\u0421\u0005\u0006\u0000\u0000\u0421"+
		"\u0422\u0003\n\u0005\u0000\u0422\u0423\u0005\u0007\u0000\u0000\u0423\u0425"+
		"\u0001\u0000\u0000\u0000\u0424\u0420\u0001\u0000\u0000\u0000\u0425\u0426"+
		"\u0001\u0000\u0000\u0000\u0426\u0424\u0001\u0000\u0000\u0000\u0426\u0427"+
		"\u0001\u0000\u0000\u0000\u0427\u042c\u0001\u0000\u0000\u0000\u0428\u0429"+
		"\u0007\u0016\u0000\u0000\u0429\u042a\u0005\u0004\u0000\u0000\u042a\u042c"+
		"\u0005\u0005\u0000\u0000\u042b\u041f\u0001\u0000\u0000\u0000\u042b\u0428"+
		"\u0001\u0000\u0000\u0000\u042c_\u0001\u0000\u0000\u0000\u042d\u042e\u0005"+
		"\u00c6\u0000\u0000\u042e\u0437\u0005\u0001\u0000\u0000\u042f\u0434\u0003"+
		"\n\u0005\u0000\u0430\u0431\u0005\u0002\u0000\u0000\u0431\u0433\u0003\n"+
		"\u0005\u0000\u0432\u0430\u0001\u0000\u0000\u0000\u0433\u0436\u0001\u0000"+
		"\u0000\u0000\u0434\u0432\u0001\u0000\u0000\u0000\u0434\u0435\u0001\u0000"+
		"\u0000\u0000\u0435\u0438\u0001\u0000\u0000\u0000\u0436\u0434\u0001\u0000"+
		"\u0000\u0000\u0437\u042f\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000"+
		"\u0000\u0000\u0438\u0439\u0001\u0000\u0000\u0000\u0439\u043a\u0005\u0003"+
		"\u0000\u0000\u043aa\u0001\u0000\u0000\u0000\u043b\u043d\u0005K\u0000\u0000"+
		"\u043c\u043e\u0003\n\u0005\u0000\u043d\u043c\u0001\u0000\u0000\u0000\u043d"+
		"\u043e\u0001\u0000\u0000\u0000\u043ec\u0001\u0000\u0000\u0000\u043f\u0440"+
		"\u0005\u00c4\u0000\u0000\u0440e\u0001\u0000\u0000\u0000Tio{~\u0085\u0092"+
		"\u00a7\u00ae\u00b4\u00b7\u00be\u00c6\u00d7\u00e0\u00ea\u00f8\u00ff\u0110"+
		"\u0118\u011c\u0125\u0131\u013a\u0144\u014b\u014d\u0157\u0160\u0168\u016f"+
		"\u0185\u018b\u0199\u01a6\u01ae\u01c2\u01c6\u01c9\u01ce\u01d1\u01da\u01e0"+
		"\u01e6\u01f3\u01f9\u01fb\u0204\u020d\u0212\u021c\u0232\u0273\u028c\u02cf"+
		"\u02e7\u0300\u030d\u031c\u0327\u0334\u0345\u0349\u0358\u0367\u037d\u0382"+
		"\u0393\u03a8\u03aa\u03b1\u03b8\u03ba\u03bf\u03c7\u03f2\u0406\u040d\u0411"+
		"\u041a\u0426\u042b\u0434\u0437\u043d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}