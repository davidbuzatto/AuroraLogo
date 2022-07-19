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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, A=9, ABA=10, 
		ABE=11, ALT=12, ATE=13, BAI=14, CADA=15, CAM=16, CIM=17, COD=18, COM=19, 
		CONT=20, CON=21, CONE=22, CONS=23, COR=24, CUBI=25, CUR=26, CRA=27, CRAA=28, 
		CRR=29, CRRA=30, DCMM=31, DE=32, DES=33, DESE=34, DIAG=35, DIR=36, DIVM=37, 
		DO=38, E=39, EM=40, ENG=41, ENQ=42, ENT=43, ESCO=44, ESC=45, ESQ=46, FAL=47, 
		FEC=48, FORM=49, FUN=50, FUNC=51, GIR=52, GRA=53, GROS=54, INCM=55, INI=56, 
		LER=57, LEV=58, LIM=59, LIN=60, MEN=61, MOS=62, MOV=63, MULM=64, NA=65, 
		NO=66, PAS=67, PADR=68, PARA=69, PARR=70, PI=71, PINC=72, PIZ=73, POR=74, 
		PREE=75, PUL=76, QUAD=77, RAD=78, REP=79, RET=80, SAI=81, SE=82, SEN=83, 
		SEM=84, SOMM=85, SUBM=86, TART=87, TER=88, TROC=89, USA=90, VA=91, VER=92, 
		VEZ=93, VEZS=94, PRETO=95, AZUL=96, CIANO=97, CINZA=98, VERDE=99, MAGENTA=100, 
		LARANJA=101, ROSA=102, VERMELHO=103, BRANCO=104, AMARELO=105, ESCURO=106, 
		CLARO=107, PA=108, PCF=109, PCP=110, PCPP=111, PCPR=112, PD=113, PG=114, 
		PX=115, PY=116, CARC=117, CHAV=118, COMP=119, SUBS=120, TIPO=121, F_ACOS=122, 
		F_ARRE=123, F_ASEN=124, F_ATAN=125, F_CAPO=126, F_CHAO=127, F_COSH=128, 
		F_COSS=129, F_DCM=130, F_GRRA=131, F_HIPO=132, F_INC=133, F_LOGA=134, 
		F_MAXI=135, F_MINI=136, F_NUMA=137, F_POTE=138, F_RAGR=139, F_RAIC=140, 
		F_RAIQ=141, F_RAIZ=142, F_SEME=143, F_SENH=144, F_SENO=145, F_TANG=146, 
		F_TANH=147, F_TETO=148, F_VABS=149, FC_RGB=150, FG_ARC=151, FG_CCU=152, 
		FG_CIC=153, FG_CQD=154, FG_ELI=155, FG_EST=156, FG_POL=157, FG_POR=158, 
		FG_QUA=159, FG_RET=160, FG_REA=161, FG_SEG=162, ATR=163, ATRA=164, AC_A=165, 
		AT_A=166, AC_S=167, AT_S=168, AC_M=169, AT_M=170, AC_D=171, AT_D=172, 
		AC_R=173, AT_R=174, ADI=175, ADIA=176, SUB=177, SUBA=178, MUL=179, DIV=180, 
		DIVA=181, MOD=182, MODA=183, IGU=184, IGUT=185, IGUA=186, DIF=187, DIFT=188, 
		DIFA=189, ME=190, MET=191, MEA=192, MEI=193, MEIT=194, MEIA=195, MA=196, 
		MAT=197, MAA=198, MAI=199, MAIT=200, MAIA=201, ELG=202, ELGT=203, OLG=204, 
		OLGT=205, NAO=206, NAOT=207, DOT=208, ID=209, IDC=210, IDF=211, IDA=212, 
		INT=213, DEC=214, CHEX=215, CHAR=216, STRING=217, COMENTARIO=218, COMENTARIO_LINHA=219, 
		WS=220;
	public static final int
		RULE_prog = 0, RULE_func = 1, RULE_inst = 2, RULE_instf = 3, RULE_ains = 4, 
		RULE_expr = 5, RULE_relacao = 6, RULE_exprSimp = 7, RULE_termo = 8, RULE_fator = 9, 
		RULE_exprBool = 10, RULE_se = 11, RULE_seSe = 12, RULE_seSenaoSe = 13, 
		RULE_seSenao = 14, RULE_usando = 15, RULE_escolha = 16, RULE_repetir = 17, 
		RULE_passo = 18, RULE_repetirEnquanto = 19, RULE_paraCada = 20, RULE_parar = 21, 
		RULE_continuar = 22, RULE_movimentar = 23, RULE_trocarCor = 24, RULE_configuracaoCor = 25, 
		RULE_cor = 26, RULE_criarCor = 27, RULE_girar = 28, RULE_engrossar = 29, 
		RULE_desengrossar = 30, RULE_trocarGrossura = 31, RULE_escrever = 32, 
		RULE_ler = 33, RULE_atribuir = 34, RULE_exprIndice = 35, RULE_abaixar = 36, 
		RULE_levantar = 37, RULE_limpar = 38, RULE_funcaoMatematica = 39, RULE_instrucaoGeometrica = 40, 
		RULE_funcaoGeometrica = 41, RULE_opcaoFuncGeom = 42, RULE_opcaoPontosControle = 43, 
		RULE_desenharCaminho = 44, RULE_instCaminho = 45, RULE_consultarTartaruga = 46, 
		RULE_consultarString = 47, RULE_formatarTexto = 48, RULE_criarArranjos = 49, 
		RULE_chamadaFuncao = 50, RULE_retornar = 51, RULE_processaId = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "func", "inst", "instf", "ains", "expr", "relacao", "exprSimp", 
			"termo", "fator", "exprBool", "se", "seSe", "seSenaoSe", "seSenao", "usando", 
			"escolha", "repetir", "passo", "repetirEnquanto", "paraCada", "parar", 
			"continuar", "movimentar", "trocarCor", "configuracaoCor", "cor", "criarCor", 
			"girar", "engrossar", "desengrossar", "trocarGrossura", "escrever", "ler", 
			"atribuir", "exprIndice", "abaixar", "levantar", "limpar", "funcaoMatematica", 
			"instrucaoGeometrica", "funcaoGeometrica", "opcaoFuncGeom", "opcaoPontosControle", 
			"desenharCaminho", "instCaminho", "consultarTartaruga", "consultarString", 
			"formatarTexto", "criarArranjos", "chamadaFuncao", "retornar", "processaId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "'}'", "'['", "']'", "':'", "'a'", 
			"'abaixar'", "'ABERTO'", "'alterar'", "'at\\u00E9'", "'baixo'", "'cada'", 
			"'caminho'", "'cima'", "'CORDA'", "'com'", "'continuar'", "'contorno'", 
			"'controle'", "'controles'", "'cor'", "'c\\u00FAbica'", "'curva'", "'criarArranjo'", 
			"'criarArranjoAssociativo'", "'criarArray'", "'criarArrayAssociativo'", 
			"'decrementando'", "'de'", "'desengrossar'", "'desenhar'", "'di\\u00E1logo'", 
			"'direita'", "'dividindo'", "'do'", "'e'", "'em'", "'engrossar'", "'enquanto'", 
			"'ent\\u00E3o'", "'escolha'", "'escrever'", "'esquerda'", "'FALSO'", 
			"'fechar'", "'formatarTexto'", "'fundo'", "'fun\\u00E7\\u00E3o'", "'girar'", 
			"'graus'", "'grossura'", "'incrementando'", "'iniciar'", "'ler'", "'levantar'", 
			"'limpar'", "'linha'", "'mensagem'", "'mostrando'", "'mover'", "'multiplicando'", 
			"'na'", "'no'", "'passo'", "'padr\\u00E3o'", "'para'", "'parar'", "'PI'", 
			"'pincel'", "'PIZZA'", "'por'", "'preenchimento'", "'pulando'", "'quadr\\u00E1tica'", 
			"'radianos'", "'repetir'", "'retornar'", "'sa\\u00EDda'", "'se'", "'sen\\u00E3o'", 
			"'sem'", "'somando'", "'subtraindo'", "'tartaruga'", "'terminar'", "'trocar'", 
			"'usando'", "'v\\u00E1'", "'VERDADEIRO'", "'vez'", "'vezes'", "'preto'", 
			"'azul'", "'ciano'", "'cinza'", "'verde'", "'magenta'", "'laranja'", 
			"'rosa'", "'vermelho'", "'branco'", "'amarelo'", "'escuro'", "'claro'", 
			"'\\u00E2ngulo'", "'corDoFundo'", "'corDoPincel'", "'corDoPreenchimento'", 
			"'corPr\\u00F3pria'", "'est\\u00E1Desenhando'", "'grossuraDoPincel'", 
			"'x'", "'y'", "'caracteres'", "'chaves'", "'comprimento'", "'substring'", 
			"'tipo'", "'arcoCosseno'", "'arredondar'", "'arcoSeno'", "'arcoTangente'", 
			"'cartesianoParaPolar'", "'ch\\u00E3o'", "'cossenoHiperb\\u00F3lico'", 
			"'cosseno'", "'decrementar'", "'grausParaRadianos'", "'hipotenusa'", 
			"'incrementar'", "'logar\\u00EDtmo'", "'m\\u00E1ximo'", "'m\\u00EDnimo'", 
			"'n\\u00FAmeroAleat\\u00F3rio'", "'pot\\u00EAncia'", "'radianosParaGraus'", 
			"'raizC\\u00FAbica'", "'raizQuadrada'", "'raiz'", "'definirSementeAleat\\u00F3ria'", 
			"'senoHiperb\\u00F3lico'", "'seno'", "'tangente'", "'tangenteHiperb\\u00F3lica'", 
			"'teto'", "'valorAbsoluto'", "'criarCorRGB'", "'arco'", "'curvaC\\u00FAbica'", 
			"'c\\u00EDrculo'", "'curvaQuadr\\u00E1tica'", "'elipse'", "'estrela'", 
			"'pol\\u00EDgono'", "'pol\\u00EDgonoRegular'", "'quadrado'", "'ret\\u00E2ngulo'", 
			"'ret\\u00E2nguloArredondado'", "'segmento'", "'='", "'<-'", "'+='", 
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
			null, null, null, null, null, null, null, null, null, "A", "ABA", "ABE", 
			"ALT", "ATE", "BAI", "CADA", "CAM", "CIM", "COD", "COM", "CONT", "CON", 
			"CONE", "CONS", "COR", "CUBI", "CUR", "CRA", "CRAA", "CRR", "CRRA", "DCMM", 
			"DE", "DES", "DESE", "DIAG", "DIR", "DIVM", "DO", "E", "EM", "ENG", "ENQ", 
			"ENT", "ESCO", "ESC", "ESQ", "FAL", "FEC", "FORM", "FUN", "FUNC", "GIR", 
			"GRA", "GROS", "INCM", "INI", "LER", "LEV", "LIM", "LIN", "MEN", "MOS", 
			"MOV", "MULM", "NA", "NO", "PAS", "PADR", "PARA", "PARR", "PI", "PINC", 
			"PIZ", "POR", "PREE", "PUL", "QUAD", "RAD", "REP", "RET", "SAI", "SE", 
			"SEN", "SEM", "SOMM", "SUBM", "TART", "TER", "TROC", "USA", "VA", "VER", 
			"VEZ", "VEZS", "PRETO", "AZUL", "CIANO", "CINZA", "VERDE", "MAGENTA", 
			"LARANJA", "ROSA", "VERMELHO", "BRANCO", "AMARELO", "ESCURO", "CLARO", 
			"PA", "PCF", "PCP", "PCPP", "PCPR", "PD", "PG", "PX", "PY", "CARC", "CHAV", 
			"COMP", "SUBS", "TIPO", "F_ACOS", "F_ARRE", "F_ASEN", "F_ATAN", "F_CAPO", 
			"F_CHAO", "F_COSH", "F_COSS", "F_DCM", "F_GRRA", "F_HIPO", "F_INC", "F_LOGA", 
			"F_MAXI", "F_MINI", "F_NUMA", "F_POTE", "F_RAGR", "F_RAIC", "F_RAIQ", 
			"F_RAIZ", "F_SEME", "F_SENH", "F_SENO", "F_TANG", "F_TANH", "F_TETO", 
			"F_VABS", "FC_RGB", "FG_ARC", "FG_CCU", "FG_CIC", "FG_CQD", "FG_ELI", 
			"FG_EST", "FG_POL", "FG_POR", "FG_QUA", "FG_RET", "FG_REA", "FG_SEG", 
			"ATR", "ATRA", "AC_A", "AT_A", "AC_S", "AT_S", "AC_M", "AT_M", "AC_D", 
			"AT_D", "AC_R", "AT_R", "ADI", "ADIA", "SUB", "SUBA", "MUL", "DIV", "DIVA", 
			"MOD", "MODA", "IGU", "IGUT", "IGUA", "DIF", "DIFT", "DIFA", "ME", "MET", 
			"MEA", "MEI", "MEIT", "MEIA", "MA", "MAT", "MAA", "MAI", "MAIT", "MAIA", 
			"ELG", "ELGT", "OLG", "OLGT", "NAO", "NAOT", "DOT", "ID", "IDC", "IDF", 
			"IDA", "INT", "DEC", "CHEX", "CHAR", "STRING", "COMENTARIO", "COMENTARIO_LINHA", 
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
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(106);
				func();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				inst();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PAS - 67)) | (1L << (PARA - 67)) | (1L << (PARR - 67)) | (1L << (PI - 67)) | (1L << (REP - 67)) | (1L << (RET - 67)) | (1L << (SE - 67)) | (1L << (TART - 67)) | (1L << (TROC - 67)) | (1L << (USA - 67)) | (1L << (VA - 67)) | (1L << (VER - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_COSH - 67)) | (1L << (F_COSS - 67)) | (1L << (F_DCM - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (F_GRRA - 131)) | (1L << (F_HIPO - 131)) | (1L << (F_INC - 131)) | (1L << (F_LOGA - 131)) | (1L << (F_MAXI - 131)) | (1L << (F_MINI - 131)) | (1L << (F_NUMA - 131)) | (1L << (F_POTE - 131)) | (1L << (F_RAGR - 131)) | (1L << (F_RAIC - 131)) | (1L << (F_RAIQ - 131)) | (1L << (F_RAIZ - 131)) | (1L << (F_SEME - 131)) | (1L << (F_SENH - 131)) | (1L << (F_SENO - 131)) | (1L << (F_TANG - 131)) | (1L << (F_TANH - 131)) | (1L << (F_TETO - 131)) | (1L << (F_VABS - 131)) | (1L << (FC_RGB - 131)) | (1L << (ADI - 131)) | (1L << (ADIA - 131)) | (1L << (SUB - 131)) | (1L << (SUBA - 131)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAO - 206)) | (1L << (NAOT - 206)) | (1L << (ID - 206)) | (1L << (IDF - 206)) | (1L << (INT - 206)) | (1L << (DEC - 206)) | (1L << (CHEX - 206)) | (1L << (CHAR - 206)) | (1L << (STRING - 206)))) != 0) );
			setState(117);
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
			setState(119);
			match(FUNC);
			setState(120);
			match(IDF);
			setState(121);
			match(T__0);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(122);
				match(ID);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(123);
					match(T__1);
					setState(124);
					match(ID);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(132);
			match(T__2);
			setState(133);
			match(T__3);
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				instf();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PAS - 67)) | (1L << (PARA - 67)) | (1L << (PARR - 67)) | (1L << (PI - 67)) | (1L << (REP - 67)) | (1L << (RET - 67)) | (1L << (SE - 67)) | (1L << (TART - 67)) | (1L << (TROC - 67)) | (1L << (USA - 67)) | (1L << (VA - 67)) | (1L << (VER - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_COSH - 67)) | (1L << (F_COSS - 67)) | (1L << (F_DCM - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (F_GRRA - 131)) | (1L << (F_HIPO - 131)) | (1L << (F_INC - 131)) | (1L << (F_LOGA - 131)) | (1L << (F_MAXI - 131)) | (1L << (F_MINI - 131)) | (1L << (F_NUMA - 131)) | (1L << (F_POTE - 131)) | (1L << (F_RAGR - 131)) | (1L << (F_RAIC - 131)) | (1L << (F_RAIQ - 131)) | (1L << (F_RAIZ - 131)) | (1L << (F_SEME - 131)) | (1L << (F_SENH - 131)) | (1L << (F_SENO - 131)) | (1L << (F_TANG - 131)) | (1L << (F_TANH - 131)) | (1L << (F_TETO - 131)) | (1L << (F_VABS - 131)) | (1L << (FC_RGB - 131)) | (1L << (ADI - 131)) | (1L << (ADIA - 131)) | (1L << (SUB - 131)) | (1L << (SUBA - 131)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAO - 206)) | (1L << (NAOT - 206)) | (1L << (ID - 206)) | (1L << (IDF - 206)) | (1L << (INT - 206)) | (1L << (DEC - 206)) | (1L << (CHEX - 206)) | (1L << (CHAR - 206)) | (1L << (STRING - 206)))) != 0) );
			setState(139);
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
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				ains();
				setState(142);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				se();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				usando();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				repetir();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				repetirEnquanto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				paraCada();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
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
			setState(152);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				movimentar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				trocarCor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				girar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				abaixar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				levantar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				limpar();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				engrossar();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
				desengrossar();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(162);
				trocarGrossura();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(163);
				escrever();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(164);
				ler();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(165);
				atribuir();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(166);
				parar();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(167);
				continuar();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(168);
				retornar();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(169);
				instrucaoGeometrica();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(170);
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
			setState(173);
			relacao();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (ELG - 202)) | (1L << (ELGT - 202)) | (1L << (OLG - 202)) | (1L << (OLGT - 202)))) != 0)) {
				{
				{
				setState(174);
				_la = _input.LA(1);
				if ( !(((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (ELG - 202)) | (1L << (ELGT - 202)) | (1L << (OLG - 202)) | (1L << (OLGT - 202)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(175);
				relacao();
				}
				}
				setState(180);
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
			setState(181);
			exprSimp();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (IGU - 184)) | (1L << (IGUT - 184)) | (1L << (IGUA - 184)) | (1L << (DIF - 184)) | (1L << (DIFT - 184)) | (1L << (DIFA - 184)) | (1L << (ME - 184)) | (1L << (MET - 184)) | (1L << (MEA - 184)) | (1L << (MEI - 184)) | (1L << (MEIT - 184)) | (1L << (MEIA - 184)) | (1L << (MA - 184)) | (1L << (MAT - 184)) | (1L << (MAA - 184)) | (1L << (MAI - 184)) | (1L << (MAIT - 184)) | (1L << (MAIA - 184)))) != 0)) {
				{
				setState(182);
				((RelacaoContext)_localctx).opRel = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (IGU - 184)) | (1L << (IGUT - 184)) | (1L << (IGUA - 184)) | (1L << (DIF - 184)) | (1L << (DIFT - 184)) | (1L << (DIFA - 184)) | (1L << (ME - 184)) | (1L << (MET - 184)) | (1L << (MEA - 184)) | (1L << (MEI - 184)) | (1L << (MEIT - 184)) | (1L << (MEIA - 184)) | (1L << (MA - 184)) | (1L << (MAT - 184)) | (1L << (MAA - 184)) | (1L << (MAI - 184)) | (1L << (MAIT - 184)) | (1L << (MAIA - 184)))) != 0)) ) {
					((RelacaoContext)_localctx).opRel = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
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
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (ADI - 175)) | (1L << (ADIA - 175)) | (1L << (SUB - 175)) | (1L << (SUBA - 175)))) != 0)) {
				{
				setState(186);
				((ExprSimpContext)_localctx).opNeg = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (ADI - 175)) | (1L << (ADIA - 175)) | (1L << (SUB - 175)) | (1L << (SUBA - 175)))) != 0)) ) {
					((ExprSimpContext)_localctx).opNeg = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(189);
			termo();
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					_la = _input.LA(1);
					if ( !(((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (ADI - 175)) | (1L << (ADIA - 175)) | (1L << (SUB - 175)) | (1L << (SUBA - 175)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(191);
					termo();
					}
					} 
				}
				setState(196);
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
			setState(197);
			fator();
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198);
					_la = _input.LA(1);
					if ( !(_la==VEZS || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (MUL - 179)) | (1L << (DIV - 179)) | (1L << (DIVA - 179)) | (1L << (MOD - 179)) | (1L << (MODA - 179)))) != 0)) ) {
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
					} 
				}
				setState(204);
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
		public TerminalNode TIPO() { return getToken(AuroraLogoParser.TIPO, 0); }
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
		public TerminalNode TIPO() { return getToken(AuroraLogoParser.TIPO, 0); }
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
		public TerminalNode TIPO() { return getToken(AuroraLogoParser.TIPO, 0); }
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
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new FatorNaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NAOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				fator();
				}
				break;
			case 2:
				_localctx = new FatorIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(INT);
				}
				break;
			case 3:
				_localctx = new FatorDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(DEC);
				}
				break;
			case 4:
				_localctx = new FatorPiContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(PI);
				}
				break;
			case 5:
				_localctx = new FatorIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				processaId();
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(211);
					match(DOT);
					setState(212);
					_la = _input.LA(1);
					if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (CHAV - 118)) | (1L << (COMP - 118)) | (1L << (TIPO - 118)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
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
				setState(230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(226);
					match(DOT);
					setState(227);
					_la = _input.LA(1);
					if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (CHAV - 118)) | (1L << (COMP - 118)) | (1L << (TIPO - 118)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(228);
					match(T__0);
					setState(229);
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
				setState(232);
				processaId();
				setState(233);
				match(T__3);
				setState(234);
				expr();
				setState(235);
				match(T__4);
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(236);
					match(DOT);
					setState(237);
					_la = _input.LA(1);
					if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (CHAV - 118)) | (1L << (COMP - 118)) | (1L << (TIPO - 118)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(238);
					match(T__0);
					setState(239);
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
				setState(242);
				processaId();
				setState(245); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(243);
						match(DOT);
						setState(244);
						match(IDA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(247); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
				_localctx = new FatorCharContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(249);
				match(CHAR);
				}
				break;
			case 10:
				_localctx = new FatorStringContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(250);
				match(STRING);
				}
				break;
			case 11:
				_localctx = new FatorBoolContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(251);
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
				setState(252);
				cor();
				}
				break;
			case 13:
				_localctx = new FatorFuncaoMatematicaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(253);
				funcaoMatematica();
				}
				break;
			case 14:
				_localctx = new FatorConsultarTartarugaContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(254);
				consultarTartaruga();
				}
				break;
			case 15:
				_localctx = new FatorConsultarStringContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(255);
				consultarString();
				}
				break;
			case 16:
				_localctx = new FatorFormatarTextoContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(256);
				formatarTexto();
				}
				break;
			case 17:
				_localctx = new FatorPassoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(257);
				passo();
				}
				break;
			case 18:
				_localctx = new FatorChamadaFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(258);
				chamadaFuncao();
				}
				break;
			case 19:
				_localctx = new FatorCriarArranjoContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(259);
				criarArranjos();
				}
				break;
			case 20:
				_localctx = new FatorParentesesContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(260);
				match(T__0);
				setState(261);
				expr();
				setState(262);
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
			setState(266);
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
			setState(268);
			seSe();
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					seSenaoSe();
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEN) {
				{
				setState(275);
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
			setState(278);
			match(SE);
			setState(279);
			exprBool();
			setState(280);
			match(ENT);
			setState(281);
			match(T__3);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PAS - 67)) | (1L << (PARA - 67)) | (1L << (PARR - 67)) | (1L << (PI - 67)) | (1L << (REP - 67)) | (1L << (RET - 67)) | (1L << (SE - 67)) | (1L << (TART - 67)) | (1L << (TROC - 67)) | (1L << (USA - 67)) | (1L << (VA - 67)) | (1L << (VER - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_COSH - 67)) | (1L << (F_COSS - 67)) | (1L << (F_DCM - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (F_GRRA - 131)) | (1L << (F_HIPO - 131)) | (1L << (F_INC - 131)) | (1L << (F_LOGA - 131)) | (1L << (F_MAXI - 131)) | (1L << (F_MINI - 131)) | (1L << (F_NUMA - 131)) | (1L << (F_POTE - 131)) | (1L << (F_RAGR - 131)) | (1L << (F_RAIC - 131)) | (1L << (F_RAIQ - 131)) | (1L << (F_RAIZ - 131)) | (1L << (F_SEME - 131)) | (1L << (F_SENH - 131)) | (1L << (F_SENO - 131)) | (1L << (F_TANG - 131)) | (1L << (F_TANH - 131)) | (1L << (F_TETO - 131)) | (1L << (F_VABS - 131)) | (1L << (FC_RGB - 131)) | (1L << (ADI - 131)) | (1L << (ADIA - 131)) | (1L << (SUB - 131)) | (1L << (SUBA - 131)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAO - 206)) | (1L << (NAOT - 206)) | (1L << (ID - 206)) | (1L << (IDF - 206)) | (1L << (INT - 206)) | (1L << (DEC - 206)) | (1L << (CHEX - 206)) | (1L << (CHAR - 206)) | (1L << (STRING - 206)))) != 0) );
			setState(287);
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
			setState(289);
			match(SEN);
			setState(290);
			match(SE);
			setState(291);
			exprBool();
			setState(292);
			match(ENT);
			setState(293);
			match(T__3);
			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(294);
				inst();
				}
				}
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PAS - 67)) | (1L << (PARA - 67)) | (1L << (PARR - 67)) | (1L << (PI - 67)) | (1L << (REP - 67)) | (1L << (RET - 67)) | (1L << (SE - 67)) | (1L << (TART - 67)) | (1L << (TROC - 67)) | (1L << (USA - 67)) | (1L << (VA - 67)) | (1L << (VER - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_COSH - 67)) | (1L << (F_COSS - 67)) | (1L << (F_DCM - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (F_GRRA - 131)) | (1L << (F_HIPO - 131)) | (1L << (F_INC - 131)) | (1L << (F_LOGA - 131)) | (1L << (F_MAXI - 131)) | (1L << (F_MINI - 131)) | (1L << (F_NUMA - 131)) | (1L << (F_POTE - 131)) | (1L << (F_RAGR - 131)) | (1L << (F_RAIC - 131)) | (1L << (F_RAIQ - 131)) | (1L << (F_RAIZ - 131)) | (1L << (F_SEME - 131)) | (1L << (F_SENH - 131)) | (1L << (F_SENO - 131)) | (1L << (F_TANG - 131)) | (1L << (F_TANH - 131)) | (1L << (F_TETO - 131)) | (1L << (F_VABS - 131)) | (1L << (FC_RGB - 131)) | (1L << (ADI - 131)) | (1L << (ADIA - 131)) | (1L << (SUB - 131)) | (1L << (SUBA - 131)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAO - 206)) | (1L << (NAOT - 206)) | (1L << (ID - 206)) | (1L << (IDF - 206)) | (1L << (INT - 206)) | (1L << (DEC - 206)) | (1L << (CHEX - 206)) | (1L << (CHAR - 206)) | (1L << (STRING - 206)))) != 0) );
			setState(299);
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
			setState(301);
			match(SEN);
			setState(302);
			match(T__3);
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(303);
				inst();
				}
				}
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PAS - 67)) | (1L << (PARA - 67)) | (1L << (PARR - 67)) | (1L << (PI - 67)) | (1L << (REP - 67)) | (1L << (RET - 67)) | (1L << (SE - 67)) | (1L << (TART - 67)) | (1L << (TROC - 67)) | (1L << (USA - 67)) | (1L << (VA - 67)) | (1L << (VER - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_COSH - 67)) | (1L << (F_COSS - 67)) | (1L << (F_DCM - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (F_GRRA - 131)) | (1L << (F_HIPO - 131)) | (1L << (F_INC - 131)) | (1L << (F_LOGA - 131)) | (1L << (F_MAXI - 131)) | (1L << (F_MINI - 131)) | (1L << (F_NUMA - 131)) | (1L << (F_POTE - 131)) | (1L << (F_RAGR - 131)) | (1L << (F_RAIC - 131)) | (1L << (F_RAIQ - 131)) | (1L << (F_RAIZ - 131)) | (1L << (F_SEME - 131)) | (1L << (F_SENH - 131)) | (1L << (F_SENO - 131)) | (1L << (F_TANG - 131)) | (1L << (F_TANH - 131)) | (1L << (F_TETO - 131)) | (1L << (F_VABS - 131)) | (1L << (FC_RGB - 131)) | (1L << (ADI - 131)) | (1L << (ADIA - 131)) | (1L << (SUB - 131)) | (1L << (SUBA - 131)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAO - 206)) | (1L << (NAOT - 206)) | (1L << (ID - 206)) | (1L << (IDF - 206)) | (1L << (INT - 206)) | (1L << (DEC - 206)) | (1L << (CHEX - 206)) | (1L << (CHAR - 206)) | (1L << (STRING - 206)))) != 0) );
			setState(308);
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
			setState(310);
			match(USA);
			setState(311);
			processaId();
			setState(312);
			match(T__3);
			setState(314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(313);
				escolha();
				}
				}
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESCO );
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PADR) {
				{
				setState(318);
				match(PADR);
				setState(319);
				match(T__7);
				setState(321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(320);
					inst();
					}
					}
					setState(323); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PAS - 67)) | (1L << (PARA - 67)) | (1L << (PARR - 67)) | (1L << (PI - 67)) | (1L << (REP - 67)) | (1L << (RET - 67)) | (1L << (SE - 67)) | (1L << (TART - 67)) | (1L << (TROC - 67)) | (1L << (USA - 67)) | (1L << (VA - 67)) | (1L << (VER - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_COSH - 67)) | (1L << (F_COSS - 67)) | (1L << (F_DCM - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (F_GRRA - 131)) | (1L << (F_HIPO - 131)) | (1L << (F_INC - 131)) | (1L << (F_LOGA - 131)) | (1L << (F_MAXI - 131)) | (1L << (F_MINI - 131)) | (1L << (F_NUMA - 131)) | (1L << (F_POTE - 131)) | (1L << (F_RAGR - 131)) | (1L << (F_RAIC - 131)) | (1L << (F_RAIQ - 131)) | (1L << (F_RAIZ - 131)) | (1L << (F_SEME - 131)) | (1L << (F_SENH - 131)) | (1L << (F_SENO - 131)) | (1L << (F_TANG - 131)) | (1L << (F_TANH - 131)) | (1L << (F_TETO - 131)) | (1L << (F_VABS - 131)) | (1L << (FC_RGB - 131)) | (1L << (ADI - 131)) | (1L << (ADIA - 131)) | (1L << (SUB - 131)) | (1L << (SUBA - 131)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAO - 206)) | (1L << (NAOT - 206)) | (1L << (ID - 206)) | (1L << (IDF - 206)) | (1L << (INT - 206)) | (1L << (DEC - 206)) | (1L << (CHEX - 206)) | (1L << (CHAR - 206)) | (1L << (STRING - 206)))) != 0) );
				}
			}

			setState(327);
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
			setState(329);
			match(ESCO);
			setState(330);
			_la = _input.LA(1);
			if ( !(((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (INT - 213)) | (1L << (DEC - 213)) | (1L << (CHAR - 213)) | (1L << (STRING - 213)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(331);
			match(T__7);
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				inst();
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PAS - 67)) | (1L << (PARA - 67)) | (1L << (PARR - 67)) | (1L << (PI - 67)) | (1L << (REP - 67)) | (1L << (RET - 67)) | (1L << (SE - 67)) | (1L << (TART - 67)) | (1L << (TROC - 67)) | (1L << (USA - 67)) | (1L << (VA - 67)) | (1L << (VER - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_COSH - 67)) | (1L << (F_COSS - 67)) | (1L << (F_DCM - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (F_GRRA - 131)) | (1L << (F_HIPO - 131)) | (1L << (F_INC - 131)) | (1L << (F_LOGA - 131)) | (1L << (F_MAXI - 131)) | (1L << (F_MINI - 131)) | (1L << (F_NUMA - 131)) | (1L << (F_POTE - 131)) | (1L << (F_RAGR - 131)) | (1L << (F_RAIC - 131)) | (1L << (F_RAIQ - 131)) | (1L << (F_RAIZ - 131)) | (1L << (F_SEME - 131)) | (1L << (F_SENH - 131)) | (1L << (F_SENO - 131)) | (1L << (F_TANG - 131)) | (1L << (F_TANH - 131)) | (1L << (F_TETO - 131)) | (1L << (F_VABS - 131)) | (1L << (FC_RGB - 131)) | (1L << (ADI - 131)) | (1L << (ADIA - 131)) | (1L << (SUB - 131)) | (1L << (SUBA - 131)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAO - 206)) | (1L << (NAOT - 206)) | (1L << (ID - 206)) | (1L << (IDF - 206)) | (1L << (INT - 206)) | (1L << (DEC - 206)) | (1L << (CHEX - 206)) | (1L << (CHAR - 206)) | (1L << (STRING - 206)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(337);
			match(REP);
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
			setState(340);
			match(T__3);
			setState(342); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(341);
				inst();
				}
				}
				setState(344); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PAS - 67)) | (1L << (PARA - 67)) | (1L << (PARR - 67)) | (1L << (PI - 67)) | (1L << (REP - 67)) | (1L << (RET - 67)) | (1L << (SE - 67)) | (1L << (TART - 67)) | (1L << (TROC - 67)) | (1L << (USA - 67)) | (1L << (VA - 67)) | (1L << (VER - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_COSH - 67)) | (1L << (F_COSS - 67)) | (1L << (F_DCM - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (F_GRRA - 131)) | (1L << (F_HIPO - 131)) | (1L << (F_INC - 131)) | (1L << (F_LOGA - 131)) | (1L << (F_MAXI - 131)) | (1L << (F_MINI - 131)) | (1L << (F_NUMA - 131)) | (1L << (F_POTE - 131)) | (1L << (F_RAGR - 131)) | (1L << (F_RAIC - 131)) | (1L << (F_RAIQ - 131)) | (1L << (F_RAIZ - 131)) | (1L << (F_SEME - 131)) | (1L << (F_SENH - 131)) | (1L << (F_SENO - 131)) | (1L << (F_TANG - 131)) | (1L << (F_TANH - 131)) | (1L << (F_TETO - 131)) | (1L << (F_VABS - 131)) | (1L << (FC_RGB - 131)) | (1L << (ADI - 131)) | (1L << (ADIA - 131)) | (1L << (SUB - 131)) | (1L << (SUBA - 131)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAO - 206)) | (1L << (NAOT - 206)) | (1L << (ID - 206)) | (1L << (IDF - 206)) | (1L << (INT - 206)) | (1L << (DEC - 206)) | (1L << (CHEX - 206)) | (1L << (CHAR - 206)) | (1L << (STRING - 206)))) != 0) );
			setState(346);
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
			setState(348);
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
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENQ) {
				{
				setState(350);
				match(ENQ);
				setState(351);
				exprBool();
				}
			}

			setState(354);
			match(REP);
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DCMM:
			case INCM:
				{
				setState(355);
				_la = _input.LA(1);
				if ( !(_la==DCMM || _la==INCM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(356);
				processaId();
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
			case SOMM:
				{
				setState(361);
				match(SOMM);
				setState(362);
				processaId();
				setState(363);
				match(COM);
				setState(364);
				expr();
				}
				break;
			case MULM:
				{
				setState(366);
				match(MULM);
				setState(367);
				processaId();
				setState(368);
				match(POR);
				setState(369);
				expr();
				}
				break;
			case DIVM:
				{
				setState(371);
				match(DIVM);
				setState(372);
				processaId();
				setState(373);
				match(POR);
				setState(374);
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
				processaId();
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PAS - 67)) | (1L << (PARA - 67)) | (1L << (PARR - 67)) | (1L << (PI - 67)) | (1L << (REP - 67)) | (1L << (RET - 67)) | (1L << (SE - 67)) | (1L << (TART - 67)) | (1L << (TROC - 67)) | (1L << (USA - 67)) | (1L << (VA - 67)) | (1L << (VER - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_COSH - 67)) | (1L << (F_COSS - 67)) | (1L << (F_DCM - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (F_GRRA - 131)) | (1L << (F_HIPO - 131)) | (1L << (F_INC - 131)) | (1L << (F_LOGA - 131)) | (1L << (F_MAXI - 131)) | (1L << (F_MINI - 131)) | (1L << (F_NUMA - 131)) | (1L << (F_POTE - 131)) | (1L << (F_RAGR - 131)) | (1L << (F_RAIC - 131)) | (1L << (F_RAIQ - 131)) | (1L << (F_RAIZ - 131)) | (1L << (F_SEME - 131)) | (1L << (F_SENH - 131)) | (1L << (F_SENO - 131)) | (1L << (F_TANG - 131)) | (1L << (F_TANH - 131)) | (1L << (F_TETO - 131)) | (1L << (F_VABS - 131)) | (1L << (FC_RGB - 131)) | (1L << (ADI - 131)) | (1L << (ADIA - 131)) | (1L << (SUB - 131)) | (1L << (SUBA - 131)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAO - 206)) | (1L << (NAOT - 206)) | (1L << (ID - 206)) | (1L << (IDF - 206)) | (1L << (INT - 206)) | (1L << (DEC - 206)) | (1L << (CHEX - 206)) | (1L << (CHAR - 206)) | (1L << (STRING - 206)))) != 0) );
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
			setState(391);
			match(PARA);
			setState(392);
			match(CADA);
			setState(393);
			processaId();
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PAS - 67)) | (1L << (PARA - 67)) | (1L << (PARR - 67)) | (1L << (PI - 67)) | (1L << (REP - 67)) | (1L << (RET - 67)) | (1L << (SE - 67)) | (1L << (TART - 67)) | (1L << (TROC - 67)) | (1L << (USA - 67)) | (1L << (VA - 67)) | (1L << (VER - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_COSH - 67)) | (1L << (F_COSS - 67)) | (1L << (F_DCM - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (F_GRRA - 131)) | (1L << (F_HIPO - 131)) | (1L << (F_INC - 131)) | (1L << (F_LOGA - 131)) | (1L << (F_MAXI - 131)) | (1L << (F_MINI - 131)) | (1L << (F_NUMA - 131)) | (1L << (F_POTE - 131)) | (1L << (F_RAGR - 131)) | (1L << (F_RAIC - 131)) | (1L << (F_RAIQ - 131)) | (1L << (F_RAIZ - 131)) | (1L << (F_SEME - 131)) | (1L << (F_SENH - 131)) | (1L << (F_SENO - 131)) | (1L << (F_TANG - 131)) | (1L << (F_TANH - 131)) | (1L << (F_TETO - 131)) | (1L << (F_VABS - 131)) | (1L << (FC_RGB - 131)) | (1L << (ADI - 131)) | (1L << (ADIA - 131)) | (1L << (SUB - 131)) | (1L << (SUBA - 131)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAO - 206)) | (1L << (NAOT - 206)) | (1L << (ID - 206)) | (1L << (IDF - 206)) | (1L << (INT - 206)) | (1L << (DEC - 206)) | (1L << (CHEX - 206)) | (1L << (CHAR - 206)) | (1L << (STRING - 206)))) != 0) );
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
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new MovimentarDirecaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(VA);
				setState(410);
				match(PARA);
				setState(411);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAI) | (1L << CIM) | (1L << DIR) | (1L << ESQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EM) {
					{
					setState(412);
					match(EM);
					setState(413);
					expr();
					}
				}

				}
				break;
			case 2:
				_localctx = new MovimentarPontoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(VA);
				setState(417);
				match(PARA);
				setState(418);
				expr();
				setState(419);
				match(T__1);
				setState(420);
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
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new TrocarCorPincelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(TROC);
				setState(425);
				match(COR);
				setState(426);
				match(DO);
				setState(427);
				match(PINC);
				setState(428);
				match(PARA);
				setState(429);
				configuracaoCor();
				}
				break;
			case 2:
				_localctx = new TrocarCorPreenchimentoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(TROC);
				setState(431);
				match(COR);
				setState(432);
				match(DO);
				setState(433);
				match(PREE);
				setState(434);
				match(PARA);
				setState(435);
				configuracaoCor();
				}
				break;
			case 3:
				_localctx = new TrocarCorFundoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				match(TROC);
				setState(437);
				match(COR);
				setState(438);
				match(DO);
				setState(439);
				match(FUN);
				setState(440);
				match(PARA);
				setState(441);
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
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(444);
				cor();
				}
				break;
			case 2:
				{
				setState(445);
				expr();
				}
				break;
			case 3:
				{
				setState(446);
				((ConfiguracaoCorContext)_localctx).corEx = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (PRETO - 95)) | (1L << (AZUL - 95)) | (1L << (CIANO - 95)) | (1L << (CINZA - 95)) | (1L << (VERDE - 95)) | (1L << (MAGENTA - 95)) | (1L << (LARANJA - 95)) | (1L << (ROSA - 95)) | (1L << (VERMELHO - 95)) | (1L << (BRANCO - 95)) | (1L << (AMARELO - 95)))) != 0)) ) {
					((ConfiguracaoCorContext)_localctx).corEx = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << FAL) | (1L << FORM))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PAS - 67)) | (1L << (PI - 67)) | (1L << (TART - 67)) | (1L << (VER - 67)) | (1L << (ESCURO - 67)) | (1L << (CLARO - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_COSH - 67)) | (1L << (F_COSS - 67)) | (1L << (F_DCM - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (F_GRRA - 131)) | (1L << (F_HIPO - 131)) | (1L << (F_INC - 131)) | (1L << (F_LOGA - 131)) | (1L << (F_MAXI - 131)) | (1L << (F_MINI - 131)) | (1L << (F_NUMA - 131)) | (1L << (F_POTE - 131)) | (1L << (F_RAGR - 131)) | (1L << (F_RAIC - 131)) | (1L << (F_RAIQ - 131)) | (1L << (F_RAIZ - 131)) | (1L << (F_SEME - 131)) | (1L << (F_SENH - 131)) | (1L << (F_SENO - 131)) | (1L << (F_TANG - 131)) | (1L << (F_TANH - 131)) | (1L << (F_TETO - 131)) | (1L << (F_VABS - 131)) | (1L << (FC_RGB - 131)) | (1L << (ADI - 131)) | (1L << (ADIA - 131)) | (1L << (SUB - 131)) | (1L << (SUBA - 131)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAO - 206)) | (1L << (NAOT - 206)) | (1L << (ID - 206)) | (1L << (IDF - 206)) | (1L << (INT - 206)) | (1L << (DEC - 206)) | (1L << (CHEX - 206)) | (1L << (CHAR - 206)) | (1L << (STRING - 206)))) != 0)) {
				{
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << FAL) | (1L << FORM))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PAS - 67)) | (1L << (PI - 67)) | (1L << (TART - 67)) | (1L << (VER - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_COSH - 67)) | (1L << (F_COSS - 67)) | (1L << (F_DCM - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (F_GRRA - 131)) | (1L << (F_HIPO - 131)) | (1L << (F_INC - 131)) | (1L << (F_LOGA - 131)) | (1L << (F_MAXI - 131)) | (1L << (F_MINI - 131)) | (1L << (F_NUMA - 131)) | (1L << (F_POTE - 131)) | (1L << (F_RAGR - 131)) | (1L << (F_RAIC - 131)) | (1L << (F_RAIQ - 131)) | (1L << (F_RAIZ - 131)) | (1L << (F_SEME - 131)) | (1L << (F_SENH - 131)) | (1L << (F_SENO - 131)) | (1L << (F_TANG - 131)) | (1L << (F_TANH - 131)) | (1L << (F_TETO - 131)) | (1L << (F_VABS - 131)) | (1L << (FC_RGB - 131)) | (1L << (ADI - 131)) | (1L << (ADIA - 131)) | (1L << (SUB - 131)) | (1L << (SUBA - 131)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAO - 206)) | (1L << (NAOT - 206)) | (1L << (ID - 206)) | (1L << (IDF - 206)) | (1L << (INT - 206)) | (1L << (DEC - 206)) | (1L << (CHEX - 206)) | (1L << (CHAR - 206)) | (1L << (STRING - 206)))) != 0)) {
					{
					setState(449);
					expr();
					setState(450);
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

				setState(454);
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
		public CriarCorContext criarCor() {
			return getRuleContext(CriarCorContext.class,0);
		}
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
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				match(CHEX);
				}
				break;
			case FC_RGB:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				criarCor();
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

	public static class CriarCorContext extends ParserRuleContext {
		public TerminalNode FC_RGB() { return getToken(AuroraLogoParser.FC_RGB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CriarCorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criarCor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterCriarCor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitCriarCor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitCriarCor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriarCorContext criarCor() throws RecognitionException {
		CriarCorContext _localctx = new CriarCorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_criarCor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(FC_RGB);
			setState(462);
			match(T__0);
			setState(463);
			expr();
			setState(464);
			match(T__1);
			setState(465);
			expr();
			setState(466);
			match(T__1);
			setState(467);
			expr();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(468);
				match(T__1);
				setState(469);
				expr();
				}
			}

			setState(472);
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
			setState(474);
			match(GIR);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(475);
				match(EM);
				setState(476);
				expr();
				setState(477);
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
			setState(481);
			match(ENG);
			setState(482);
			match(PINC);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(483);
				match(EM);
				setState(484);
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
			setState(487);
			match(DES);
			setState(488);
			match(PINC);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(489);
				match(EM);
				setState(490);
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
		public TerminalNode DO() { return getToken(AuroraLogoParser.DO, 0); }
		public TerminalNode PINC() { return getToken(AuroraLogoParser.PINC, 0); }
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
			setState(493);
			match(TROC);
			setState(494);
			match(GROS);
			setState(495);
			match(DO);
			setState(496);
			match(PINC);
			setState(497);
			match(PARA);
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
			setState(500);
			match(ESC);
			setState(501);
			expr();
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NA:
				{
				setState(502);
				match(NA);
				setState(503);
				match(SAI);
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUL) {
					{
					setState(504);
					match(PUL);
					setState(505);
					match(LIN);
					}
				}

				}
				break;
			case NO:
				{
				setState(508);
				match(NO);
				setState(509);
				match(DIAG);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUL) {
					{
					setState(510);
					match(PUL);
					setState(511);
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
		public TerminalNode USA() { return getToken(AuroraLogoParser.USA, 0); }
		public TerminalNode A() { return getToken(AuroraLogoParser.A, 0); }
		public TerminalNode MEN() { return getToken(AuroraLogoParser.MEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 66, RULE_ler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(LER);
			setState(517);
			processaId();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USA) {
				{
				setState(518);
				match(USA);
				setState(519);
				match(A);
				setState(520);
				match(MEN);
				setState(521);
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
		enterRule(_localctx, 68, RULE_atribuir);
		int _la;
		try {
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new AtribuirPadraoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				processaId();
				setState(525);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(526);
					expr();
					}
					break;
				case 2:
					{
					setState(527);
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
				setState(530);
				processaId();
				setState(535); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(531);
					match(T__5);
					setState(532);
					exprIndice();
					setState(533);
					match(T__6);
					}
					}
					setState(537); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(539);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(540);
					expr();
					}
					break;
				case 2:
					{
					setState(541);
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
				setState(544);
				processaId();
				{
				setState(545);
				match(T__3);
				setState(546);
				exprIndice();
				setState(547);
				match(T__4);
				}
				setState(549);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(550);
					expr();
					}
					break;
				case 2:
					{
					setState(551);
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
				setState(554);
				processaId();
				setState(555);
				_la = _input.LA(1);
				if ( !(_la==AC_A || _la==AT_A) ) {
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
			case 5:
				_localctx = new AtribuirSubtracaoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(558);
				processaId();
				setState(559);
				_la = _input.LA(1);
				if ( !(_la==AC_S || _la==AT_S) ) {
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
			case 6:
				_localctx = new AtribuirMultiplicacaoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(562);
				processaId();
				setState(563);
				_la = _input.LA(1);
				if ( !(_la==AC_M || _la==AT_M) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(564);
				expr();
				}
				break;
			case 7:
				_localctx = new AtribuirDivisaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(566);
				processaId();
				setState(567);
				_la = _input.LA(1);
				if ( !(_la==AC_D || _la==AT_D) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(568);
				expr();
				}
				break;
			case 8:
				_localctx = new AtribuirRestoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(570);
				processaId();
				setState(571);
				_la = _input.LA(1);
				if ( !(_la==AC_R || _la==AT_R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(572);
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
			setState(576);
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
			setState(578);
			match(ABA);
			setState(579);
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
			setState(581);
			match(LEV);
			setState(582);
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
			setState(584);
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
		enterRule(_localctx, 78, RULE_funcaoMatematica);
		try {
			setState(755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F_VABS:
				_localctx = new FuncaoAbsolutoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(F_VABS);
				setState(587);
				match(T__0);
				setState(588);
				expr();
				setState(589);
				match(T__2);
				}
				break;
			case F_RAIQ:
				_localctx = new FuncaoRaizQuadradaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				match(F_RAIQ);
				setState(592);
				match(T__0);
				setState(593);
				expr();
				setState(594);
				match(T__2);
				}
				break;
			case F_RAIC:
				_localctx = new FuncaoRaizCubicaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(596);
				match(F_RAIC);
				setState(597);
				match(T__0);
				setState(598);
				expr();
				setState(599);
				match(T__2);
				}
				break;
			case F_RAIZ:
				_localctx = new FuncaoRaizContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(601);
				match(F_RAIZ);
				setState(602);
				match(T__0);
				setState(603);
				expr();
				setState(604);
				match(T__1);
				setState(605);
				expr();
				setState(606);
				match(T__2);
				}
				break;
			case F_POTE:
				_localctx = new FuncaoPotenciaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(608);
				match(F_POTE);
				setState(609);
				match(T__0);
				setState(610);
				expr();
				setState(611);
				match(T__1);
				setState(612);
				expr();
				setState(613);
				match(T__2);
				}
				break;
			case F_HIPO:
				_localctx = new FuncaoHipotenusaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(615);
				match(F_HIPO);
				setState(616);
				match(T__0);
				setState(617);
				expr();
				setState(618);
				match(T__1);
				setState(619);
				expr();
				setState(620);
				match(T__2);
				}
				break;
			case F_CHAO:
				_localctx = new FuncaoChaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(622);
				match(F_CHAO);
				setState(623);
				match(T__0);
				setState(624);
				expr();
				setState(625);
				match(T__2);
				}
				break;
			case F_TETO:
				_localctx = new FuncaoTetoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(627);
				match(F_TETO);
				setState(628);
				match(T__0);
				setState(629);
				expr();
				setState(630);
				match(T__2);
				}
				break;
			case F_ARRE:
				_localctx = new FuncaoArredondarContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(632);
				match(F_ARRE);
				setState(633);
				match(T__0);
				setState(639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(634);
					expr();
					}
					break;
				case 2:
					{
					setState(635);
					expr();
					setState(636);
					match(T__1);
					setState(637);
					expr();
					}
					break;
				}
				setState(641);
				match(T__2);
				}
				break;
			case F_MINI:
				_localctx = new FuncaoMinimoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(643);
				match(F_MINI);
				setState(644);
				match(T__0);
				setState(645);
				expr();
				setState(646);
				match(T__1);
				setState(647);
				expr();
				setState(648);
				match(T__2);
				}
				break;
			case F_MAXI:
				_localctx = new FuncaoMaximoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(650);
				match(F_MAXI);
				setState(651);
				match(T__0);
				setState(652);
				expr();
				setState(653);
				match(T__1);
				setState(654);
				expr();
				setState(655);
				match(T__2);
				}
				break;
			case F_NUMA:
				_localctx = new FuncaoNumeroAleatorioContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(657);
				match(F_NUMA);
				setState(658);
				match(T__0);
				setState(664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(659);
					expr();
					}
					break;
				case 2:
					{
					setState(660);
					expr();
					setState(661);
					match(T__1);
					setState(662);
					expr();
					}
					break;
				}
				setState(666);
				match(T__2);
				}
				break;
			case F_SEME:
				_localctx = new FuncaoDefinirSementeAleatoriaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(667);
				match(F_SEME);
				setState(668);
				match(T__0);
				setState(669);
				expr();
				setState(670);
				match(T__2);
				}
				break;
			case F_SENO:
				_localctx = new FuncaoSenoContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(672);
				match(F_SENO);
				setState(673);
				match(T__0);
				setState(674);
				expr();
				setState(675);
				match(T__2);
				}
				break;
			case F_COSS:
				_localctx = new FuncaoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(677);
				match(F_COSS);
				setState(678);
				match(T__0);
				setState(679);
				expr();
				setState(680);
				match(T__2);
				}
				break;
			case F_TANG:
				_localctx = new FuncaoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(682);
				match(F_TANG);
				setState(683);
				match(T__0);
				setState(684);
				expr();
				setState(685);
				match(T__2);
				}
				break;
			case F_ASEN:
				_localctx = new FuncaoArcoSenoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(687);
				match(F_ASEN);
				setState(688);
				match(T__0);
				setState(689);
				expr();
				setState(690);
				match(T__2);
				}
				break;
			case F_ACOS:
				_localctx = new FuncaoArcoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(692);
				match(F_ACOS);
				setState(693);
				match(T__0);
				setState(694);
				expr();
				setState(695);
				match(T__2);
				}
				break;
			case F_ATAN:
				_localctx = new FuncaoArcoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(697);
				match(F_ATAN);
				setState(698);
				match(T__0);
				setState(699);
				expr();
				setState(700);
				match(T__2);
				}
				break;
			case F_CAPO:
				_localctx = new FuncaoCartesianoParaPolarContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(702);
				match(F_CAPO);
				setState(703);
				match(T__0);
				setState(704);
				expr();
				setState(705);
				match(T__1);
				setState(706);
				expr();
				setState(707);
				match(T__2);
				}
				break;
			case F_SENH:
				_localctx = new FuncaoSenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(709);
				match(F_SENH);
				setState(710);
				match(T__0);
				setState(711);
				expr();
				setState(712);
				match(T__2);
				}
				break;
			case F_COSH:
				_localctx = new FuncaoCossenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(714);
				match(F_COSH);
				setState(715);
				match(T__0);
				setState(716);
				expr();
				setState(717);
				match(T__2);
				}
				break;
			case F_TANH:
				_localctx = new FuncaoTangenteHiperbolicaContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(719);
				match(F_TANH);
				setState(720);
				match(T__0);
				setState(721);
				expr();
				setState(722);
				match(T__2);
				}
				break;
			case F_LOGA:
				_localctx = new FuncaoLogaritmoContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(724);
				match(F_LOGA);
				setState(725);
				match(T__0);
				setState(731);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(726);
					expr();
					}
					break;
				case 2:
					{
					setState(727);
					expr();
					setState(728);
					match(T__1);
					setState(729);
					expr();
					}
					break;
				}
				setState(733);
				match(T__2);
				}
				break;
			case F_GRRA:
				_localctx = new FuncaoGrausParaRadianosContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(735);
				match(F_GRRA);
				setState(736);
				match(T__0);
				setState(737);
				expr();
				setState(738);
				match(T__2);
				}
				break;
			case F_RAGR:
				_localctx = new FuncaoRadianosParaGrausContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(740);
				match(F_RAGR);
				setState(741);
				match(T__0);
				setState(742);
				expr();
				setState(743);
				match(T__2);
				}
				break;
			case F_INC:
				_localctx = new FuncaoIncrementarContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(745);
				match(F_INC);
				setState(746);
				match(T__0);
				setState(747);
				processaId();
				setState(748);
				match(T__2);
				}
				break;
			case F_DCM:
				_localctx = new FuncaoDecrementarContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(750);
				match(F_DCM);
				setState(751);
				match(T__0);
				setState(752);
				processaId();
				setState(753);
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
			setState(757);
			match(DESE);
			setState(758);
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
		public OpcaoPontosControleContext opcaoPontosControle() {
			return getRuleContext(OpcaoPontosControleContext.class,0);
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
		public OpcaoPontosControleContext opcaoPontosControle() {
			return getRuleContext(OpcaoPontosControleContext.class,0);
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
			setState(968);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FG_SEG:
				_localctx = new FuncaoDesenharSegmentoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				match(FG_SEG);
				setState(761);
				match(T__0);
				setState(762);
				expr();
				setState(763);
				match(T__1);
				setState(764);
				expr();
				setState(765);
				match(T__1);
				setState(766);
				expr();
				setState(767);
				match(T__1);
				setState(768);
				expr();
				setState(769);
				match(T__2);
				}
				break;
			case FG_QUA:
				_localctx = new FuncaoDesenharQuadradoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				match(FG_QUA);
				setState(772);
				match(T__0);
				setState(773);
				expr();
				setState(774);
				match(T__1);
				setState(775);
				expr();
				setState(776);
				match(T__1);
				setState(777);
				expr();
				setState(778);
				match(T__2);
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(779);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_RET:
				_localctx = new FuncaoDesenharRetanguloContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(782);
				match(FG_RET);
				setState(783);
				match(T__0);
				setState(784);
				expr();
				setState(785);
				match(T__1);
				setState(786);
				expr();
				setState(787);
				match(T__1);
				setState(788);
				expr();
				setState(789);
				match(T__1);
				setState(790);
				expr();
				setState(791);
				match(T__2);
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(792);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_REA:
				_localctx = new FuncaoDesenharRetanguloArredondadoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(795);
				match(FG_REA);
				setState(796);
				match(T__0);
				setState(797);
				expr();
				setState(798);
				match(T__1);
				setState(799);
				expr();
				setState(800);
				match(T__1);
				setState(801);
				expr();
				setState(802);
				match(T__1);
				setState(803);
				expr();
				setState(804);
				match(T__1);
				setState(805);
				expr();
				setState(806);
				match(T__2);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(807);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_CIC:
				_localctx = new FuncaoDesenharCirculoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(810);
				match(FG_CIC);
				setState(811);
				match(T__0);
				setState(812);
				expr();
				setState(813);
				match(T__1);
				setState(814);
				expr();
				setState(815);
				match(T__1);
				setState(816);
				expr();
				setState(817);
				match(T__2);
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(818);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_ELI:
				_localctx = new FuncaoDesenharElipseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(821);
				match(FG_ELI);
				setState(822);
				match(T__0);
				setState(823);
				expr();
				setState(824);
				match(T__1);
				setState(825);
				expr();
				setState(826);
				match(T__1);
				setState(827);
				expr();
				setState(828);
				match(T__1);
				setState(829);
				expr();
				setState(830);
				match(T__2);
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(831);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_ARC:
				_localctx = new FuncaoDesenharArcoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(834);
				match(FG_ARC);
				setState(835);
				match(T__0);
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
				match(T__1);
				setState(844);
				expr();
				setState(845);
				match(T__1);
				setState(846);
				expr();
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(847);
					match(T__1);
					setState(848);
					_la = _input.LA(1);
					if ( !(((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (ABE - 11)) | (1L << (COD - 11)) | (1L << (PIZ - 11)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(851);
				match(T__2);
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(852);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_POR:
				_localctx = new FuncaoDesenharPoligonoRegularContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(855);
				match(FG_POR);
				setState(856);
				match(T__0);
				setState(857);
				expr();
				setState(858);
				match(T__1);
				setState(859);
				expr();
				setState(860);
				match(T__1);
				setState(861);
				expr();
				setState(862);
				match(T__1);
				setState(863);
				expr();
				setState(864);
				match(T__1);
				setState(865);
				expr();
				setState(866);
				match(T__2);
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(867);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_EST:
				_localctx = new FuncaoDesenharEstrelaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(870);
				match(FG_EST);
				setState(871);
				match(T__0);
				setState(872);
				expr();
				setState(873);
				match(T__1);
				setState(874);
				expr();
				setState(875);
				match(T__1);
				setState(876);
				expr();
				setState(877);
				match(T__1);
				setState(878);
				expr();
				setState(879);
				match(T__1);
				setState(880);
				expr();
				setState(881);
				match(T__2);
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(882);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_POL:
				_localctx = new FuncaoDesenharPoligonoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(885);
				match(FG_POL);
				setState(886);
				match(T__0);
				setState(887);
				expr();
				setState(888);
				match(T__1);
				setState(889);
				expr();
				setState(890);
				match(T__1);
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
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(898);
					match(T__1);
					setState(899);
					expr();
					setState(900);
					match(T__1);
					setState(901);
					expr();
					}
					}
					setState(907);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(908);
				match(T__2);
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(909);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_CQD:
				_localctx = new FuncaoDesenharCurvaQuadraticaContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(912);
				match(FG_CQD);
				setState(913);
				match(T__0);
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
				match(T__1);
				setState(924);
				expr();
				setState(925);
				match(T__2);
				setState(936);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEM:
					{
					{
					setState(926);
					opcaoFuncGeom();
					setState(929);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(927);
						match(T__1);
						setState(928);
						opcaoPontosControle();
						}
					}

					}
					}
					break;
				case MOS:
					{
					{
					setState(931);
					opcaoPontosControle();
					setState(934);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(932);
						match(T__1);
						setState(933);
						opcaoFuncGeom();
						}
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
				break;
			case FG_CCU:
				_localctx = new FuncaoDesenharCurvaCubicaContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(938);
				match(FG_CCU);
				setState(939);
				match(T__0);
				setState(940);
				expr();
				setState(941);
				match(T__1);
				setState(942);
				expr();
				setState(943);
				match(T__1);
				setState(944);
				expr();
				setState(945);
				match(T__1);
				setState(946);
				expr();
				setState(947);
				match(T__1);
				setState(948);
				expr();
				setState(949);
				match(T__1);
				setState(950);
				expr();
				setState(951);
				match(T__1);
				setState(952);
				expr();
				setState(953);
				match(T__1);
				setState(954);
				expr();
				setState(955);
				match(T__2);
				setState(966);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEM:
					{
					{
					setState(956);
					opcaoFuncGeom();
					setState(959);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(957);
						match(T__1);
						setState(958);
						opcaoPontosControle();
						}
					}

					}
					}
					break;
				case MOS:
					{
					{
					setState(961);
					opcaoPontosControle();
					setState(964);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(962);
						match(T__1);
						setState(963);
						opcaoFuncGeom();
						}
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
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(970);
				match(SEM);
				setState(971);
				match(PREE);
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(972);
					match(E);
					setState(973);
					match(SEM);
					setState(974);
					match(CON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(977);
				match(SEM);
				setState(978);
				match(CON);
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(979);
					match(E);
					setState(980);
					match(SEM);
					setState(981);
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

	public static class OpcaoPontosControleContext extends ParserRuleContext {
		public TerminalNode MOS() { return getToken(AuroraLogoParser.MOS, 0); }
		public TerminalNode CONE() { return getToken(AuroraLogoParser.CONE, 0); }
		public TerminalNode CONS() { return getToken(AuroraLogoParser.CONS, 0); }
		public OpcaoPontosControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcaoPontosControle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterOpcaoPontosControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitOpcaoPontosControle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitOpcaoPontosControle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcaoPontosControleContext opcaoPontosControle() throws RecognitionException {
		OpcaoPontosControleContext _localctx = new OpcaoPontosControleContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_opcaoPontosControle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(MOS);
			setState(987);
			_la = _input.LA(1);
			if ( !(_la==CONE || _la==CONS) ) {
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

	public static class DesenharCaminhoContext extends ParserRuleContext {
		public TerminalNode DESE() { return getToken(AuroraLogoParser.DESE, 0); }
		public TerminalNode CAM() { return getToken(AuroraLogoParser.CAM, 0); }
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
		public OpcaoFuncGeomContext opcaoFuncGeom() {
			return getRuleContext(OpcaoFuncGeomContext.class,0);
		}
		public OpcaoPontosControleContext opcaoPontosControle() {
			return getRuleContext(OpcaoPontosControleContext.class,0);
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
		enterRule(_localctx, 88, RULE_desenharCaminho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(DESE);
			setState(990);
			match(CAM);
			setState(1001);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEM:
				{
				{
				setState(991);
				opcaoFuncGeom();
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(992);
					match(T__1);
					setState(993);
					opcaoPontosControle();
					}
				}

				}
				}
				break;
			case MOS:
				{
				{
				setState(996);
				opcaoPontosControle();
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(997);
					match(T__1);
					setState(998);
					opcaoFuncGeom();
					}
				}

				}
				}
				break;
			case T__3:
				break;
			default:
				break;
			}
			setState(1003);
			match(T__3);
			setState(1007); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1004);
				instCaminho();
				setState(1005);
				match(DOT);
				}
				}
				setState(1009); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CUR) | (1L << FEC) | (1L << LIN) | (1L << MOV))) != 0) );
			setState(1011);
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
		enterRule(_localctx, 90, RULE_instCaminho);
		try {
			setState(1052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				_localctx = new InstrucaoCaminhoMoverAteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1013);
				match(MOV);
				setState(1014);
				match(ATE);
				setState(1015);
				expr();
				setState(1016);
				match(T__1);
				setState(1017);
				expr();
				}
				break;
			case 2:
				_localctx = new InstrucaoCaminhoLinhaAteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				match(LIN);
				setState(1020);
				match(ATE);
				setState(1021);
				expr();
				setState(1022);
				match(T__1);
				setState(1023);
				expr();
				}
				break;
			case 3:
				_localctx = new InstrucaoCaminhoCurvaQuadraticaAteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1025);
				match(CUR);
				setState(1026);
				match(QUAD);
				setState(1027);
				match(ATE);
				setState(1028);
				expr();
				setState(1029);
				match(T__1);
				setState(1030);
				expr();
				setState(1031);
				match(T__1);
				setState(1032);
				expr();
				setState(1033);
				match(T__1);
				setState(1034);
				expr();
				}
				break;
			case 4:
				_localctx = new InstrucaoCaminhoCurvaCubicaAteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1036);
				match(CUR);
				setState(1037);
				match(CUBI);
				setState(1038);
				match(ATE);
				setState(1039);
				expr();
				setState(1040);
				match(T__1);
				setState(1041);
				expr();
				setState(1042);
				match(T__1);
				setState(1043);
				expr();
				setState(1044);
				match(T__1);
				setState(1045);
				expr();
				setState(1046);
				match(T__1);
				setState(1047);
				expr();
				setState(1048);
				match(T__1);
				setState(1049);
				expr();
				}
				break;
			case 5:
				_localctx = new InstrucaoCaminhoFecharCaminhoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1051);
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
		public TerminalNode PG() { return getToken(AuroraLogoParser.PG, 0); }
		public TerminalNode PCP() { return getToken(AuroraLogoParser.PCP, 0); }
		public TerminalNode PCPP() { return getToken(AuroraLogoParser.PCPP, 0); }
		public TerminalNode PCF() { return getToken(AuroraLogoParser.PCF, 0); }
		public TerminalNode PCPR() { return getToken(AuroraLogoParser.PCPR, 0); }
		public TerminalNode PD() { return getToken(AuroraLogoParser.PD, 0); }
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
		enterRule(_localctx, 92, RULE_consultarTartaruga);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			match(TART);
			setState(1055);
			match(DOT);
			setState(1056);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (PA - 108)) | (1L << (PCF - 108)) | (1L << (PCP - 108)) | (1L << (PCPP - 108)) | (1L << (PCPR - 108)) | (1L << (PD - 108)) | (1L << (PG - 108)) | (1L << (PX - 108)) | (1L << (PY - 108)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1057);
			match(T__0);
			setState(1058);
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
		enterRule(_localctx, 94, RULE_consultarString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			processaId();
			setState(1061);
			match(DOT);
			setState(1083);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMP:
				{
				setState(1062);
				match(COMP);
				setState(1063);
				match(T__0);
				setState(1064);
				match(T__2);
				}
				break;
			case CARC:
				{
				setState(1065);
				match(CARC);
				setState(1066);
				match(T__0);
				setState(1067);
				match(T__2);
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(1068);
					match(T__5);
					setState(1069);
					exprIndice();
					setState(1070);
					match(T__6);
					}
				}

				}
				break;
			case SUBS:
				{
				setState(1074);
				match(SUBS);
				setState(1075);
				match(T__0);
				setState(1076);
				expr();
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1077);
					match(T__1);
					setState(1078);
					expr();
					}
				}

				setState(1081);
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
		enterRule(_localctx, 96, RULE_formatarTexto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			match(FORM);
			setState(1086);
			match(T__0);
			setState(1087);
			match(STRING);
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1088);
				match(T__1);
				setState(1089);
				expr();
				}
				}
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1095);
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
		enterRule(_localctx, 98, RULE_criarArranjos);
		int _la;
		try {
			setState(1109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CRA:
			case CRR:
				_localctx = new CriarArranjoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1097);
				_la = _input.LA(1);
				if ( !(_la==CRA || _la==CRR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1098);
					match(T__5);
					setState(1099);
					expr();
					setState(1100);
					match(T__6);
					}
					}
					setState(1104); 
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
				setState(1106);
				_la = _input.LA(1);
				if ( !(_la==CRAA || _la==CRRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1107);
				match(T__3);
				setState(1108);
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
		enterRule(_localctx, 100, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			match(IDF);
			setState(1112);
			match(T__0);
			setState(1121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << FAL) | (1L << FORM))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PAS - 67)) | (1L << (PI - 67)) | (1L << (TART - 67)) | (1L << (VER - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_COSH - 67)) | (1L << (F_COSS - 67)) | (1L << (F_DCM - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (F_GRRA - 131)) | (1L << (F_HIPO - 131)) | (1L << (F_INC - 131)) | (1L << (F_LOGA - 131)) | (1L << (F_MAXI - 131)) | (1L << (F_MINI - 131)) | (1L << (F_NUMA - 131)) | (1L << (F_POTE - 131)) | (1L << (F_RAGR - 131)) | (1L << (F_RAIC - 131)) | (1L << (F_RAIQ - 131)) | (1L << (F_RAIZ - 131)) | (1L << (F_SEME - 131)) | (1L << (F_SENH - 131)) | (1L << (F_SENO - 131)) | (1L << (F_TANG - 131)) | (1L << (F_TANH - 131)) | (1L << (F_TETO - 131)) | (1L << (F_VABS - 131)) | (1L << (FC_RGB - 131)) | (1L << (ADI - 131)) | (1L << (ADIA - 131)) | (1L << (SUB - 131)) | (1L << (SUBA - 131)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAO - 206)) | (1L << (NAOT - 206)) | (1L << (ID - 206)) | (1L << (IDF - 206)) | (1L << (INT - 206)) | (1L << (DEC - 206)) | (1L << (CHEX - 206)) | (1L << (CHAR - 206)) | (1L << (STRING - 206)))) != 0)) {
				{
				setState(1113);
				expr();
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1114);
					match(T__1);
					setState(1115);
					expr();
					}
					}
					setState(1120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1123);
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
		enterRule(_localctx, 102, RULE_retornar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			match(RET);
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << FAL) | (1L << FORM))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PAS - 67)) | (1L << (PI - 67)) | (1L << (TART - 67)) | (1L << (VER - 67)) | (1L << (F_ACOS - 67)) | (1L << (F_ARRE - 67)) | (1L << (F_ASEN - 67)) | (1L << (F_ATAN - 67)) | (1L << (F_CAPO - 67)) | (1L << (F_CHAO - 67)) | (1L << (F_COSH - 67)) | (1L << (F_COSS - 67)) | (1L << (F_DCM - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (F_GRRA - 131)) | (1L << (F_HIPO - 131)) | (1L << (F_INC - 131)) | (1L << (F_LOGA - 131)) | (1L << (F_MAXI - 131)) | (1L << (F_MINI - 131)) | (1L << (F_NUMA - 131)) | (1L << (F_POTE - 131)) | (1L << (F_RAGR - 131)) | (1L << (F_RAIC - 131)) | (1L << (F_RAIQ - 131)) | (1L << (F_RAIZ - 131)) | (1L << (F_SEME - 131)) | (1L << (F_SENH - 131)) | (1L << (F_SENO - 131)) | (1L << (F_TANG - 131)) | (1L << (F_TANH - 131)) | (1L << (F_TETO - 131)) | (1L << (F_VABS - 131)) | (1L << (FC_RGB - 131)) | (1L << (ADI - 131)) | (1L << (ADIA - 131)) | (1L << (SUB - 131)) | (1L << (SUBA - 131)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (NAO - 206)) | (1L << (NAOT - 206)) | (1L << (ID - 206)) | (1L << (IDF - 206)) | (1L << (INT - 206)) | (1L << (DEC - 206)) | (1L << (CHEX - 206)) | (1L << (CHAR - 206)) | (1L << (STRING - 206)))) != 0)) {
				{
				setState(1126);
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
		enterRule(_localctx, 104, RULE_processaId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
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
		"\u0004\u0001\u00dc\u046c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u0001\u0000\u0005\u0000l\b"+
		"\u0000\n\u0000\f\u0000o\t\u0000\u0001\u0000\u0004\u0000r\b\u0000\u000b"+
		"\u0000\f\u0000s\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001~\b\u0001\n\u0001"+
		"\f\u0001\u0081\t\u0001\u0003\u0001\u0083\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001\u0088\b\u0001\u000b\u0001\f\u0001\u0089\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0097"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00ac\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00b1\b\u0005\n\u0005\f\u0005\u00b4\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00b9\b\u0006\u0001\u0007\u0003\u0007"+
		"\u00bc\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c1\b"+
		"\u0007\n\u0007\f\u0007\u00c4\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00c9"+
		"\b\b\n\b\f\b\u00cc\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d8\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0004\t\u00df\b\t\u000b\t\f\t\u00e0\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u00e7\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00f1\b\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\t\u00f6\b\t\u000b\t\f\t\u00f7\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0109\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u010f\b\u000b\n\u000b\f\u000b\u0112\t\u000b\u0001\u000b\u0003\u000b"+
		"\u0115\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u011c\b"+
		"\f\u000b\f\f\f\u011d\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0004\r\u0128\b\r\u000b\r\f\r\u0129\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0004\u000e\u0131\b\u000e\u000b\u000e\f\u000e"+
		"\u0132\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0004\u000f\u013b\b\u000f\u000b\u000f\f\u000f\u013c\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0004\u000f\u0142\b\u000f\u000b\u000f\f\u000f"+
		"\u0143\u0003\u000f\u0146\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u014e\b\u0010\u000b\u0010\f"+
		"\u0010\u014f\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0004\u0011\u0157\b\u0011\u000b\u0011\f\u0011\u0158\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0161"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0168\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u017e\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0004\u0013\u0182\b\u0013\u000b\u0013\f\u0013\u0183"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u0190\b\u0014"+
		"\u000b\u0014\f\u0014\u0191\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u019f\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01a7\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u01bb\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01c0\b"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01c5\b\u0019\u0001"+
		"\u0019\u0003\u0019\u01c8\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u01cc"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01d7\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u01e0\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u01e6\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01ec\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u01fb\b \u0001 \u0001 \u0001 \u0001 \u0003 \u0201"+
		"\b \u0003 \u0203\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u020b"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0211\b\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0004\"\u0218\b\"\u000b\"\f\"\u0219\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u021f\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u0229\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u023f\b\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0280"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0299\b\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u02dc\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02f4\b\'\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u030d\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u031a\b)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u0329\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u0334\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u0341\b)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u0352\b)\u0001)\u0001)\u0003)\u0356\b)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u0365\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0374\b)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u0388\b)\n)\f)\u038b\t)\u0001"+
		")\u0001)\u0003)\u038f\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u03a2\b)\u0001)\u0001)\u0001)\u0003)\u03a7\b)\u0003)\u03a9\b"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u03c0\b)\u0001)\u0001)\u0001)\u0003)\u03c5\b)\u0003)\u03c7"+
		"\b)\u0003)\u03c9\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u03d0\b"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u03d7\b*\u0003*\u03d9\b*\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u03e3\b,\u0001"+
		",\u0001,\u0001,\u0003,\u03e8\b,\u0003,\u03ea\b,\u0001,\u0001,\u0001,\u0001"+
		",\u0004,\u03f0\b,\u000b,\f,\u03f1\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u041d\b-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0431\b/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u0438\b/\u0001/\u0001/\u0003/\u043c\b/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00050\u0443\b0\n0\f0\u0446\t0\u00010\u00010\u0001"+
		"1\u00011\u00011\u00011\u00011\u00041\u044f\b1\u000b1\f1\u0450\u00011\u0001"+
		"1\u00011\u00031\u0456\b1\u00012\u00012\u00012\u00012\u00012\u00052\u045d"+
		"\b2\n2\f2\u0460\t2\u00032\u0462\b2\u00012\u00012\u00013\u00013\u00033"+
		"\u0468\b3\u00014\u00014\u00014\u0000\u00005\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfh\u0000\u0019\u0001\u0000\u00ca\u00cd\u0001"+
		"\u0000\u00b8\u00c9\u0001\u0000\u00af\u00b2\u0002\u0000^^\u00b3\u00b7\u0001"+
		"\u0000\u00ce\u00cf\u0002\u0000vwyy\u0002\u0000//\\\\\u0002\u0000\u00d5"+
		"\u00d6\u00d8\u00d9\u0001\u0000]^\u0002\u0000\u001f\u001f77\u0004\u0000"+
		"\u000e\u000e\u0011\u0011$$..\u0001\u0000_i\u0001\u0000jk\u0002\u00005"+
		"5NN\u0001\u0000\u00a3\u00a4\u0001\u0000\u00a5\u00a6\u0001\u0000\u00a7"+
		"\u00a8\u0001\u0000\u00a9\u00aa\u0001\u0000\u00ab\u00ac\u0001\u0000\u00ad"+
		"\u00ae\u0003\u0000\u000b\u000b\u0012\u0012II\u0001\u0000\u0016\u0017\u0001"+
		"\u0000lt\u0002\u0000\u001b\u001b\u001d\u001d\u0002\u0000\u001c\u001c\u001e"+
		"\u001e\u04f1\u0000m\u0001\u0000\u0000\u0000\u0002w\u0001\u0000\u0000\u0000"+
		"\u0004\u0096\u0001\u0000\u0000\u0000\u0006\u0098\u0001\u0000\u0000\u0000"+
		"\b\u00ab\u0001\u0000\u0000\u0000\n\u00ad\u0001\u0000\u0000\u0000\f\u00b5"+
		"\u0001\u0000\u0000\u0000\u000e\u00bb\u0001\u0000\u0000\u0000\u0010\u00c5"+
		"\u0001\u0000\u0000\u0000\u0012\u0108\u0001\u0000\u0000\u0000\u0014\u010a"+
		"\u0001\u0000\u0000\u0000\u0016\u010c\u0001\u0000\u0000\u0000\u0018\u0116"+
		"\u0001\u0000\u0000\u0000\u001a\u0121\u0001\u0000\u0000\u0000\u001c\u012d"+
		"\u0001\u0000\u0000\u0000\u001e\u0136\u0001\u0000\u0000\u0000 \u0149\u0001"+
		"\u0000\u0000\u0000\"\u0151\u0001\u0000\u0000\u0000$\u015c\u0001\u0000"+
		"\u0000\u0000&\u0160\u0001\u0000\u0000\u0000(\u0187\u0001\u0000\u0000\u0000"+
		"*\u0195\u0001\u0000\u0000\u0000,\u0197\u0001\u0000\u0000\u0000.\u01a6"+
		"\u0001\u0000\u0000\u00000\u01ba\u0001\u0000\u0000\u00002\u01bf\u0001\u0000"+
		"\u0000\u00004\u01cb\u0001\u0000\u0000\u00006\u01cd\u0001\u0000\u0000\u0000"+
		"8\u01da\u0001\u0000\u0000\u0000:\u01e1\u0001\u0000\u0000\u0000<\u01e7"+
		"\u0001\u0000\u0000\u0000>\u01ed\u0001\u0000\u0000\u0000@\u01f4\u0001\u0000"+
		"\u0000\u0000B\u0204\u0001\u0000\u0000\u0000D\u023e\u0001\u0000\u0000\u0000"+
		"F\u0240\u0001\u0000\u0000\u0000H\u0242\u0001\u0000\u0000\u0000J\u0245"+
		"\u0001\u0000\u0000\u0000L\u0248\u0001\u0000\u0000\u0000N\u02f3\u0001\u0000"+
		"\u0000\u0000P\u02f5\u0001\u0000\u0000\u0000R\u03c8\u0001\u0000\u0000\u0000"+
		"T\u03d8\u0001\u0000\u0000\u0000V\u03da\u0001\u0000\u0000\u0000X\u03dd"+
		"\u0001\u0000\u0000\u0000Z\u041c\u0001\u0000\u0000\u0000\\\u041e\u0001"+
		"\u0000\u0000\u0000^\u0424\u0001\u0000\u0000\u0000`\u043d\u0001\u0000\u0000"+
		"\u0000b\u0455\u0001\u0000\u0000\u0000d\u0457\u0001\u0000\u0000\u0000f"+
		"\u0465\u0001\u0000\u0000\u0000h\u0469\u0001\u0000\u0000\u0000jl\u0003"+
		"\u0002\u0001\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000pr\u0003\u0004\u0002\u0000qp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u0000\u0000\u0001"+
		"v\u0001\u0001\u0000\u0000\u0000wx\u00053\u0000\u0000xy\u0005\u00d3\u0000"+
		"\u0000y\u0082\u0005\u0001\u0000\u0000z\u007f\u0005\u00d1\u0000\u0000{"+
		"|\u0005\u0002\u0000\u0000|~\u0005\u00d1\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0082z\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\u0003\u0000\u0000\u0085\u0087\u0005\u0004\u0000\u0000\u0086\u0088"+
		"\u0003\u0006\u0003\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005\u0005\u0000\u0000\u008c\u0003\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0003\b\u0004\u0000\u008e\u008f\u0005\u00d0\u0000\u0000\u008f\u0097\u0001"+
		"\u0000\u0000\u0000\u0090\u0097\u0003\u0016\u000b\u0000\u0091\u0097\u0003"+
		"\u001e\u000f\u0000\u0092\u0097\u0003\"\u0011\u0000\u0093\u0097\u0003&"+
		"\u0013\u0000\u0094\u0097\u0003(\u0014\u0000\u0095\u0097\u0003X,\u0000"+
		"\u0096\u008d\u0001\u0000\u0000\u0000\u0096\u0090\u0001\u0000\u0000\u0000"+
		"\u0096\u0091\u0001\u0000\u0000\u0000\u0096\u0092\u0001\u0000\u0000\u0000"+
		"\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0005\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0003\u0004\u0002\u0000\u0099\u0007\u0001\u0000\u0000\u0000"+
		"\u009a\u00ac\u0003.\u0017\u0000\u009b\u00ac\u00030\u0018\u0000\u009c\u00ac"+
		"\u00038\u001c\u0000\u009d\u00ac\u0003H$\u0000\u009e\u00ac\u0003J%\u0000"+
		"\u009f\u00ac\u0003L&\u0000\u00a0\u00ac\u0003:\u001d\u0000\u00a1\u00ac"+
		"\u0003<\u001e\u0000\u00a2\u00ac\u0003>\u001f\u0000\u00a3\u00ac\u0003@"+
		" \u0000\u00a4\u00ac\u0003B!\u0000\u00a5\u00ac\u0003D\"\u0000\u00a6\u00ac"+
		"\u0003*\u0015\u0000\u00a7\u00ac\u0003,\u0016\u0000\u00a8\u00ac\u0003f"+
		"3\u0000\u00a9\u00ac\u0003P(\u0000\u00aa\u00ac\u0003\n\u0005\u0000\u00ab"+
		"\u009a\u0001\u0000\u0000\u0000\u00ab\u009b\u0001\u0000\u0000\u0000\u00ab"+
		"\u009c\u0001\u0000\u0000\u0000\u00ab\u009d\u0001\u0000\u0000\u0000\u00ab"+
		"\u009e\u0001\u0000\u0000\u0000\u00ab\u009f\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a0\u0001\u0000\u0000\u0000\u00ab\u00a1\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a2\u0001\u0000\u0000\u0000\u00ab\u00a3\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a4\u0001\u0000\u0000\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a6\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\t\u0001\u0000\u0000\u0000\u00ad\u00b2"+
		"\u0003\f\u0006\u0000\u00ae\u00af\u0007\u0000\u0000\u0000\u00af\u00b1\u0003"+
		"\f\u0006\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u000b\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0003\u000e\u0007\u0000\u00b6\u00b7\u0007\u0001"+
		"\u0000\u0000\u00b7\u00b9\u0003\u000e\u0007\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\r\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bc\u0007\u0002\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c2\u0003\u0010\b\u0000\u00be\u00bf\u0007\u0002\u0000\u0000"+
		"\u00bf\u00c1\u0003\u0010\b\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c3\u000f\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c5\u00ca\u0003\u0012\t\u0000\u00c6\u00c7"+
		"\u0007\u0003\u0000\u0000\u00c7\u00c9\u0003\u0012\t\u0000\u00c8\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u0011\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce\u0007"+
		"\u0004\u0000\u0000\u00ce\u0109\u0003\u0012\t\u0000\u00cf\u0109\u0005\u00d5"+
		"\u0000\u0000\u00d0\u0109\u0005\u00d6\u0000\u0000\u00d1\u0109\u0005G\u0000"+
		"\u0000\u00d2\u00d7\u0003h4\u0000\u00d3\u00d4\u0005\u00d0\u0000\u0000\u00d4"+
		"\u00d5\u0007\u0005\u0000\u0000\u00d5\u00d6\u0005\u0001\u0000\u0000\u00d6"+
		"\u00d8\u0005\u0003\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u0109\u0001\u0000\u0000\u0000\u00d9"+
		"\u00de\u0003h4\u0000\u00da\u00db\u0005\u0006\u0000\u0000\u00db\u00dc\u0003"+
		"\n\u0005\u0000\u00dc\u00dd\u0005\u0007\u0000\u0000\u00dd\u00df\u0001\u0000"+
		"\u0000\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e6\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u00d0"+
		"\u0000\u0000\u00e3\u00e4\u0007\u0005\u0000\u0000\u00e4\u00e5\u0005\u0001"+
		"\u0000\u0000\u00e5\u00e7\u0005\u0003\u0000\u0000\u00e6\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u0109\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0003h4\u0000\u00e9\u00ea\u0005\u0004\u0000\u0000"+
		"\u00ea\u00eb\u0003\n\u0005\u0000\u00eb\u00f0\u0005\u0005\u0000\u0000\u00ec"+
		"\u00ed\u0005\u00d0\u0000\u0000\u00ed\u00ee\u0007\u0005\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0001\u0000\u0000\u00ef\u00f1\u0005\u0003\u0000\u0000\u00f0"+
		"\u00ec\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"\u0109\u0001\u0000\u0000\u0000\u00f2\u00f5\u0003h4\u0000\u00f3\u00f4\u0005"+
		"\u00d0\u0000\u0000\u00f4\u00f6\u0005\u00d4\u0000\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u0109\u0001"+
		"\u0000\u0000\u0000\u00f9\u0109\u0005\u00d8\u0000\u0000\u00fa\u0109\u0005"+
		"\u00d9\u0000\u0000\u00fb\u0109\u0007\u0006\u0000\u0000\u00fc\u0109\u0003"+
		"4\u001a\u0000\u00fd\u0109\u0003N\'\u0000\u00fe\u0109\u0003\\.\u0000\u00ff"+
		"\u0109\u0003^/\u0000\u0100\u0109\u0003`0\u0000\u0101\u0109\u0003$\u0012"+
		"\u0000\u0102\u0109\u0003d2\u0000\u0103\u0109\u0003b1\u0000\u0104\u0105"+
		"\u0005\u0001\u0000\u0000\u0105\u0106\u0003\n\u0005\u0000\u0106\u0107\u0005"+
		"\u0003\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u00cd\u0001"+
		"\u0000\u0000\u0000\u0108\u00cf\u0001\u0000\u0000\u0000\u0108\u00d0\u0001"+
		"\u0000\u0000\u0000\u0108\u00d1\u0001\u0000\u0000\u0000\u0108\u00d2\u0001"+
		"\u0000\u0000\u0000\u0108\u00d9\u0001\u0000\u0000\u0000\u0108\u00e8\u0001"+
		"\u0000\u0000\u0000\u0108\u00f2\u0001\u0000\u0000\u0000\u0108\u00f9\u0001"+
		"\u0000\u0000\u0000\u0108\u00fa\u0001\u0000\u0000\u0000\u0108\u00fb\u0001"+
		"\u0000\u0000\u0000\u0108\u00fc\u0001\u0000\u0000\u0000\u0108\u00fd\u0001"+
		"\u0000\u0000\u0000\u0108\u00fe\u0001\u0000\u0000\u0000\u0108\u00ff\u0001"+
		"\u0000\u0000\u0000\u0108\u0100\u0001\u0000\u0000\u0000\u0108\u0101\u0001"+
		"\u0000\u0000\u0000\u0108\u0102\u0001\u0000\u0000\u0000\u0108\u0103\u0001"+
		"\u0000\u0000\u0000\u0108\u0104\u0001\u0000\u0000\u0000\u0109\u0013\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0003\n\u0005\u0000\u010b\u0015\u0001\u0000"+
		"\u0000\u0000\u010c\u0110\u0003\u0018\f\u0000\u010d\u010f\u0003\u001a\r"+
		"\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000"+
		"\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000"+
		"\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000"+
		"\u0000\u0113\u0115\u0003\u001c\u000e\u0000\u0114\u0113\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0017\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0005R\u0000\u0000\u0117\u0118\u0003\u0014\n\u0000"+
		"\u0118\u0119\u0005+\u0000\u0000\u0119\u011b\u0005\u0004\u0000\u0000\u011a"+
		"\u011c\u0003\u0004\u0002\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0005\u0005\u0000\u0000\u0120\u0019\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0005S\u0000\u0000\u0122\u0123\u0005R\u0000\u0000\u0123\u0124\u0003"+
		"\u0014\n\u0000\u0124\u0125\u0005+\u0000\u0000\u0125\u0127\u0005\u0004"+
		"\u0000\u0000\u0126\u0128\u0003\u0004\u0002\u0000\u0127\u0126\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0005\u0005\u0000\u0000\u012c\u001b\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0005S\u0000\u0000\u012e\u0130\u0005\u0004\u0000"+
		"\u0000\u012f\u0131\u0003\u0004\u0002\u0000\u0130\u012f\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0005\u0005\u0000\u0000\u0135\u001d\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0005Z\u0000\u0000\u0137\u0138\u0003h4\u0000\u0138"+
		"\u013a\u0005\u0004\u0000\u0000\u0139\u013b\u0003 \u0010\u0000\u013a\u0139"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013a"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u0145"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0005D\u0000\u0000\u013f\u0141\u0005"+
		"\b\u0000\u0000\u0140\u0142\u0003\u0004\u0002\u0000\u0141\u0140\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0146\u0001\u0000"+
		"\u0000\u0000\u0145\u013e\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0005\u0005"+
		"\u0000\u0000\u0148\u001f\u0001\u0000\u0000\u0000\u0149\u014a\u0005,\u0000"+
		"\u0000\u014a\u014b\u0007\u0007\u0000\u0000\u014b\u014d\u0005\b\u0000\u0000"+
		"\u014c\u014e\u0003\u0004\u0002\u0000\u014d\u014c\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0001\u0000\u0000\u0000\u0150!\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0005O\u0000\u0000\u0152\u0153\u0003\n\u0005\u0000\u0153\u0154"+
		"\u0007\b\u0000\u0000\u0154\u0156\u0005\u0004\u0000\u0000\u0155\u0157\u0003"+
		"\u0004\u0002\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001"+
		"\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015b\u0005"+
		"\u0005\u0000\u0000\u015b#\u0001\u0000\u0000\u0000\u015c\u015d\u0005C\u0000"+
		"\u0000\u015d%\u0001\u0000\u0000\u0000\u015e\u015f\u0005*\u0000\u0000\u015f"+
		"\u0161\u0003\u0014\n\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u017d"+
		"\u0005O\u0000\u0000\u0163\u0164\u0007\t\u0000\u0000\u0164\u0167\u0003"+
		"h4\u0000\u0165\u0166\u0005(\u0000\u0000\u0166\u0168\u0003\n\u0005\u0000"+
		"\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000"+
		"\u0168\u017e\u0001\u0000\u0000\u0000\u0169\u016a\u0005U\u0000\u0000\u016a"+
		"\u016b\u0003h4\u0000\u016b\u016c\u0005\u0013\u0000\u0000\u016c\u016d\u0003"+
		"\n\u0005\u0000\u016d\u017e\u0001\u0000\u0000\u0000\u016e\u016f\u0005@"+
		"\u0000\u0000\u016f\u0170\u0003h4\u0000\u0170\u0171\u0005J\u0000\u0000"+
		"\u0171\u0172\u0003\n\u0005\u0000\u0172\u017e\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0005%\u0000\u0000\u0174\u0175\u0003h4\u0000\u0175\u0176\u0005"+
		"J\u0000\u0000\u0176\u0177\u0003\n\u0005\u0000\u0177\u017e\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0005V\u0000\u0000\u0179\u017a\u0003\n\u0005"+
		"\u0000\u017a\u017b\u0005 \u0000\u0000\u017b\u017c\u0003h4\u0000\u017c"+
		"\u017e\u0001\u0000\u0000\u0000\u017d\u0163\u0001\u0000\u0000\u0000\u017d"+
		"\u0169\u0001\u0000\u0000\u0000\u017d\u016e\u0001\u0000\u0000\u0000\u017d"+
		"\u0173\u0001\u0000\u0000\u0000\u017d\u0178\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f"+
		"\u0181\u0005\u0004\u0000\u0000\u0180\u0182\u0003\u0004\u0002\u0000\u0181"+
		"\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183"+
		"\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184"+
		"\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u0005\u0000\u0000\u0186"+
		"\'\u0001\u0000\u0000\u0000\u0187\u0188\u0005E\u0000\u0000\u0188\u0189"+
		"\u0005\u000f\u0000\u0000\u0189\u018a\u0003h4\u0000\u018a\u018b\u0005("+
		"\u0000\u0000\u018b\u018c\u0003\n\u0005\u0000\u018c\u018d\u0005O\u0000"+
		"\u0000\u018d\u018f\u0005\u0004\u0000\u0000\u018e\u0190\u0003\u0004\u0002"+
		"\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000"+
		"\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000"+
		"\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0005\u0005\u0000"+
		"\u0000\u0194)\u0001\u0000\u0000\u0000\u0195\u0196\u0005F\u0000\u0000\u0196"+
		"+\u0001\u0000\u0000\u0000\u0197\u0198\u0005\u0014\u0000\u0000\u0198-\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0005[\u0000\u0000\u019a\u019b\u0005E\u0000"+
		"\u0000\u019b\u019e\u0007\n\u0000\u0000\u019c\u019d\u0005(\u0000\u0000"+
		"\u019d\u019f\u0003\n\u0005\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0001\u0000\u0000\u0000\u019f\u01a7\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0005[\u0000\u0000\u01a1\u01a2\u0005E\u0000\u0000\u01a2\u01a3\u0003"+
		"\n\u0005\u0000\u01a3\u01a4\u0005\u0002\u0000\u0000\u01a4\u01a5\u0003\n"+
		"\u0005\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u0199\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a0\u0001\u0000\u0000\u0000\u01a7/\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0005Y\u0000\u0000\u01a9\u01aa\u0005\u0018\u0000\u0000"+
		"\u01aa\u01ab\u0005&\u0000\u0000\u01ab\u01ac\u0005H\u0000\u0000\u01ac\u01ad"+
		"\u0005E\u0000\u0000\u01ad\u01bb\u00032\u0019\u0000\u01ae\u01af\u0005Y"+
		"\u0000\u0000\u01af\u01b0\u0005\u0018\u0000\u0000\u01b0\u01b1\u0005&\u0000"+
		"\u0000\u01b1\u01b2\u0005K\u0000\u0000\u01b2\u01b3\u0005E\u0000\u0000\u01b3"+
		"\u01bb\u00032\u0019\u0000\u01b4\u01b5\u0005Y\u0000\u0000\u01b5\u01b6\u0005"+
		"\u0018\u0000\u0000\u01b6\u01b7\u0005&\u0000\u0000\u01b7\u01b8\u00052\u0000"+
		"\u0000\u01b8\u01b9\u0005E\u0000\u0000\u01b9\u01bb\u00032\u0019\u0000\u01ba"+
		"\u01a8\u0001\u0000\u0000\u0000\u01ba\u01ae\u0001\u0000\u0000\u0000\u01ba"+
		"\u01b4\u0001\u0000\u0000\u0000\u01bb1\u0001\u0000\u0000\u0000\u01bc\u01c0"+
		"\u00034\u001a\u0000\u01bd\u01c0\u0003\n\u0005\u0000\u01be\u01c0\u0007"+
		"\u000b\u0000\u0000\u01bf\u01bc\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0\u01c7\u0001"+
		"\u0000\u0000\u0000\u01c1\u01c2\u0003\n\u0005\u0000\u01c2\u01c3\u0007\b"+
		"\u0000\u0000\u01c3\u01c5\u0001\u0000\u0000\u0000\u01c4\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c8\u0007\f\u0000\u0000\u01c7\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c83\u0001\u0000\u0000\u0000"+
		"\u01c9\u01cc\u0005\u00d7\u0000\u0000\u01ca\u01cc\u00036\u001b\u0000\u01cb"+
		"\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc"+
		"5\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\u0096\u0000\u0000\u01ce\u01cf"+
		"\u0005\u0001\u0000\u0000\u01cf\u01d0\u0003\n\u0005\u0000\u01d0\u01d1\u0005"+
		"\u0002\u0000\u0000\u01d1\u01d2\u0003\n\u0005\u0000\u01d2\u01d3\u0005\u0002"+
		"\u0000\u0000\u01d3\u01d6\u0003\n\u0005\u0000\u01d4\u01d5\u0005\u0002\u0000"+
		"\u0000\u01d5\u01d7\u0003\n\u0005\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0005\u0003\u0000\u0000\u01d97\u0001\u0000\u0000\u0000\u01da"+
		"\u01df\u00054\u0000\u0000\u01db\u01dc\u0005(\u0000\u0000\u01dc\u01dd\u0003"+
		"\n\u0005\u0000\u01dd\u01de\u0007\r\u0000\u0000\u01de\u01e0\u0001\u0000"+
		"\u0000\u0000\u01df\u01db\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e09\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005)\u0000\u0000"+
		"\u01e2\u01e5\u0005H\u0000\u0000\u01e3\u01e4\u0005(\u0000\u0000\u01e4\u01e6"+
		"\u0003\n\u0005\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e6;\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005!\u0000"+
		"\u0000\u01e8\u01eb\u0005H\u0000\u0000\u01e9\u01ea\u0005(\u0000\u0000\u01ea"+
		"\u01ec\u0003\n\u0005\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ec=\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005"+
		"Y\u0000\u0000\u01ee\u01ef\u00056\u0000\u0000\u01ef\u01f0\u0005&\u0000"+
		"\u0000\u01f0\u01f1\u0005H\u0000\u0000\u01f1\u01f2\u0005E\u0000\u0000\u01f2"+
		"\u01f3\u0003\n\u0005\u0000\u01f3?\u0001\u0000\u0000\u0000\u01f4\u01f5"+
		"\u0005-\u0000\u0000\u01f5\u0202\u0003\n\u0005\u0000\u01f6\u01f7\u0005"+
		"A\u0000\u0000\u01f7\u01fa\u0005Q\u0000\u0000\u01f8\u01f9\u0005L\u0000"+
		"\u0000\u01f9\u01fb\u0005<\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u0203\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fd\u0005B\u0000\u0000\u01fd\u0200\u0005#\u0000\u0000\u01fe\u01ff"+
		"\u0005L\u0000\u0000\u01ff\u0201\u0005<\u0000\u0000\u0200\u01fe\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0203\u0001\u0000"+
		"\u0000\u0000\u0202\u01f6\u0001\u0000\u0000\u0000\u0202\u01fc\u0001\u0000"+
		"\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203A\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u00059\u0000\u0000\u0205\u020a\u0003h4\u0000\u0206"+
		"\u0207\u0005Z\u0000\u0000\u0207\u0208\u0005\t\u0000\u0000\u0208\u0209"+
		"\u0005=\u0000\u0000\u0209\u020b\u0003\n\u0005\u0000\u020a\u0206\u0001"+
		"\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020bC\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0003h4\u0000\u020d\u0210\u0007\u000e\u0000\u0000"+
		"\u020e\u0211\u0003\n\u0005\u0000\u020f\u0211\u0003b1\u0000\u0210\u020e"+
		"\u0001\u0000\u0000\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0211\u023f"+
		"\u0001\u0000\u0000\u0000\u0212\u0217\u0003h4\u0000\u0213\u0214\u0005\u0006"+
		"\u0000\u0000\u0214\u0215\u0003F#\u0000\u0215\u0216\u0005\u0007\u0000\u0000"+
		"\u0216\u0218\u0001\u0000\u0000\u0000\u0217\u0213\u0001\u0000\u0000\u0000"+
		"\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000"+
		"\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000"+
		"\u021b\u021e\u0007\u000e\u0000\u0000\u021c\u021f\u0003\n\u0005\u0000\u021d"+
		"\u021f\u0003b1\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021d\u0001"+
		"\u0000\u0000\u0000\u021f\u023f\u0001\u0000\u0000\u0000\u0220\u0221\u0003"+
		"h4\u0000\u0221\u0222\u0005\u0004\u0000\u0000\u0222\u0223\u0003F#\u0000"+
		"\u0223\u0224\u0005\u0005\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000"+
		"\u0225\u0228\u0007\u000e\u0000\u0000\u0226\u0229\u0003\n\u0005\u0000\u0227"+
		"\u0229\u0003b1\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0227\u0001"+
		"\u0000\u0000\u0000\u0229\u023f\u0001\u0000\u0000\u0000\u022a\u022b\u0003"+
		"h4\u0000\u022b\u022c\u0007\u000f\u0000\u0000\u022c\u022d\u0003\n\u0005"+
		"\u0000\u022d\u023f\u0001\u0000\u0000\u0000\u022e\u022f\u0003h4\u0000\u022f"+
		"\u0230\u0007\u0010\u0000\u0000\u0230\u0231\u0003\n\u0005\u0000\u0231\u023f"+
		"\u0001\u0000\u0000\u0000\u0232\u0233\u0003h4\u0000\u0233\u0234\u0007\u0011"+
		"\u0000\u0000\u0234\u0235\u0003\n\u0005\u0000\u0235\u023f\u0001\u0000\u0000"+
		"\u0000\u0236\u0237\u0003h4\u0000\u0237\u0238\u0007\u0012\u0000\u0000\u0238"+
		"\u0239\u0003\n\u0005\u0000\u0239\u023f\u0001\u0000\u0000\u0000\u023a\u023b"+
		"\u0003h4\u0000\u023b\u023c\u0007\u0013\u0000\u0000\u023c\u023d\u0003\n"+
		"\u0005\u0000\u023d\u023f\u0001\u0000\u0000\u0000\u023e\u020c\u0001\u0000"+
		"\u0000\u0000\u023e\u0212\u0001\u0000\u0000\u0000\u023e\u0220\u0001\u0000"+
		"\u0000\u0000\u023e\u022a\u0001\u0000\u0000\u0000\u023e\u022e\u0001\u0000"+
		"\u0000\u0000\u023e\u0232\u0001\u0000\u0000\u0000\u023e\u0236\u0001\u0000"+
		"\u0000\u0000\u023e\u023a\u0001\u0000\u0000\u0000\u023fE\u0001\u0000\u0000"+
		"\u0000\u0240\u0241\u0003\n\u0005\u0000\u0241G\u0001\u0000\u0000\u0000"+
		"\u0242\u0243\u0005\n\u0000\u0000\u0243\u0244\u0005H\u0000\u0000\u0244"+
		"I\u0001\u0000\u0000\u0000\u0245\u0246\u0005:\u0000\u0000\u0246\u0247\u0005"+
		"H\u0000\u0000\u0247K\u0001\u0000\u0000\u0000\u0248\u0249\u0005;\u0000"+
		"\u0000\u0249M\u0001\u0000\u0000\u0000\u024a\u024b\u0005\u0095\u0000\u0000"+
		"\u024b\u024c\u0005\u0001\u0000\u0000\u024c\u024d\u0003\n\u0005\u0000\u024d"+
		"\u024e\u0005\u0003\u0000\u0000\u024e\u02f4\u0001\u0000\u0000\u0000\u024f"+
		"\u0250\u0005\u008d\u0000\u0000\u0250\u0251\u0005\u0001\u0000\u0000\u0251"+
		"\u0252\u0003\n\u0005\u0000\u0252\u0253\u0005\u0003\u0000\u0000\u0253\u02f4"+
		"\u0001\u0000\u0000\u0000\u0254\u0255\u0005\u008c\u0000\u0000\u0255\u0256"+
		"\u0005\u0001\u0000\u0000\u0256\u0257\u0003\n\u0005\u0000\u0257\u0258\u0005"+
		"\u0003\u0000\u0000\u0258\u02f4\u0001\u0000\u0000\u0000\u0259\u025a\u0005"+
		"\u008e\u0000\u0000\u025a\u025b\u0005\u0001\u0000\u0000\u025b\u025c\u0003"+
		"\n\u0005\u0000\u025c\u025d\u0005\u0002\u0000\u0000\u025d\u025e\u0003\n"+
		"\u0005\u0000\u025e\u025f\u0005\u0003\u0000\u0000\u025f\u02f4\u0001\u0000"+
		"\u0000\u0000\u0260\u0261\u0005\u008a\u0000\u0000\u0261\u0262\u0005\u0001"+
		"\u0000\u0000\u0262\u0263\u0003\n\u0005\u0000\u0263\u0264\u0005\u0002\u0000"+
		"\u0000\u0264\u0265\u0003\n\u0005\u0000\u0265\u0266\u0005\u0003\u0000\u0000"+
		"\u0266\u02f4\u0001\u0000\u0000\u0000\u0267\u0268\u0005\u0084\u0000\u0000"+
		"\u0268\u0269\u0005\u0001\u0000\u0000\u0269\u026a\u0003\n\u0005\u0000\u026a"+
		"\u026b\u0005\u0002\u0000\u0000\u026b\u026c\u0003\n\u0005\u0000\u026c\u026d"+
		"\u0005\u0003\u0000\u0000\u026d\u02f4\u0001\u0000\u0000\u0000\u026e\u026f"+
		"\u0005\u007f\u0000\u0000\u026f\u0270\u0005\u0001\u0000\u0000\u0270\u0271"+
		"\u0003\n\u0005\u0000\u0271\u0272\u0005\u0003\u0000\u0000\u0272\u02f4\u0001"+
		"\u0000\u0000\u0000\u0273\u0274\u0005\u0094\u0000\u0000\u0274\u0275\u0005"+
		"\u0001\u0000\u0000\u0275\u0276\u0003\n\u0005\u0000\u0276\u0277\u0005\u0003"+
		"\u0000\u0000\u0277\u02f4\u0001\u0000\u0000\u0000\u0278\u0279\u0005{\u0000"+
		"\u0000\u0279\u027f\u0005\u0001\u0000\u0000\u027a\u0280\u0003\n\u0005\u0000"+
		"\u027b\u027c\u0003\n\u0005\u0000\u027c\u027d\u0005\u0002\u0000\u0000\u027d"+
		"\u027e\u0003\n\u0005\u0000\u027e\u0280\u0001\u0000\u0000\u0000\u027f\u027a"+
		"\u0001\u0000\u0000\u0000\u027f\u027b\u0001\u0000\u0000\u0000\u0280\u0281"+
		"\u0001\u0000\u0000\u0000\u0281\u0282\u0005\u0003\u0000\u0000\u0282\u02f4"+
		"\u0001\u0000\u0000\u0000\u0283\u0284\u0005\u0088\u0000\u0000\u0284\u0285"+
		"\u0005\u0001\u0000\u0000\u0285\u0286\u0003\n\u0005\u0000\u0286\u0287\u0005"+
		"\u0002\u0000\u0000\u0287\u0288\u0003\n\u0005\u0000\u0288\u0289\u0005\u0003"+
		"\u0000\u0000\u0289\u02f4\u0001\u0000\u0000\u0000\u028a\u028b\u0005\u0087"+
		"\u0000\u0000\u028b\u028c\u0005\u0001\u0000\u0000\u028c\u028d\u0003\n\u0005"+
		"\u0000\u028d\u028e\u0005\u0002\u0000\u0000\u028e\u028f\u0003\n\u0005\u0000"+
		"\u028f\u0290\u0005\u0003\u0000\u0000\u0290\u02f4\u0001\u0000\u0000\u0000"+
		"\u0291\u0292\u0005\u0089\u0000\u0000\u0292\u0298\u0005\u0001\u0000\u0000"+
		"\u0293\u0299\u0003\n\u0005\u0000\u0294\u0295\u0003\n\u0005\u0000\u0295"+
		"\u0296\u0005\u0002\u0000\u0000\u0296\u0297\u0003\n\u0005\u0000\u0297\u0299"+
		"\u0001\u0000\u0000\u0000\u0298\u0293\u0001\u0000\u0000\u0000\u0298\u0294"+
		"\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029a"+
		"\u0001\u0000\u0000\u0000\u029a\u02f4\u0005\u0003\u0000\u0000\u029b\u029c"+
		"\u0005\u008f\u0000\u0000\u029c\u029d\u0005\u0001\u0000\u0000\u029d\u029e"+
		"\u0003\n\u0005\u0000\u029e\u029f\u0005\u0003\u0000\u0000\u029f\u02f4\u0001"+
		"\u0000\u0000\u0000\u02a0\u02a1\u0005\u0091\u0000\u0000\u02a1\u02a2\u0005"+
		"\u0001\u0000\u0000\u02a2\u02a3\u0003\n\u0005\u0000\u02a3\u02a4\u0005\u0003"+
		"\u0000\u0000\u02a4\u02f4\u0001\u0000\u0000\u0000\u02a5\u02a6\u0005\u0081"+
		"\u0000\u0000\u02a6\u02a7\u0005\u0001\u0000\u0000\u02a7\u02a8\u0003\n\u0005"+
		"\u0000\u02a8\u02a9\u0005\u0003\u0000\u0000\u02a9\u02f4\u0001\u0000\u0000"+
		"\u0000\u02aa\u02ab\u0005\u0092\u0000\u0000\u02ab\u02ac\u0005\u0001\u0000"+
		"\u0000\u02ac\u02ad\u0003\n\u0005\u0000\u02ad\u02ae\u0005\u0003\u0000\u0000"+
		"\u02ae\u02f4\u0001\u0000\u0000\u0000\u02af\u02b0\u0005|\u0000\u0000\u02b0"+
		"\u02b1\u0005\u0001\u0000\u0000\u02b1\u02b2\u0003\n\u0005\u0000\u02b2\u02b3"+
		"\u0005\u0003\u0000\u0000\u02b3\u02f4\u0001\u0000\u0000\u0000\u02b4\u02b5"+
		"\u0005z\u0000\u0000\u02b5\u02b6\u0005\u0001\u0000\u0000\u02b6\u02b7\u0003"+
		"\n\u0005\u0000\u02b7\u02b8\u0005\u0003\u0000\u0000\u02b8\u02f4\u0001\u0000"+
		"\u0000\u0000\u02b9\u02ba\u0005}\u0000\u0000\u02ba\u02bb\u0005\u0001\u0000"+
		"\u0000\u02bb\u02bc\u0003\n\u0005\u0000\u02bc\u02bd\u0005\u0003\u0000\u0000"+
		"\u02bd\u02f4\u0001\u0000\u0000\u0000\u02be\u02bf\u0005~\u0000\u0000\u02bf"+
		"\u02c0\u0005\u0001\u0000\u0000\u02c0\u02c1\u0003\n\u0005\u0000\u02c1\u02c2"+
		"\u0005\u0002\u0000\u0000\u02c2\u02c3\u0003\n\u0005\u0000\u02c3\u02c4\u0005"+
		"\u0003\u0000\u0000\u02c4\u02f4\u0001\u0000\u0000\u0000\u02c5\u02c6\u0005"+
		"\u0090\u0000\u0000\u02c6\u02c7\u0005\u0001\u0000\u0000\u02c7\u02c8\u0003"+
		"\n\u0005\u0000\u02c8\u02c9\u0005\u0003\u0000\u0000\u02c9\u02f4\u0001\u0000"+
		"\u0000\u0000\u02ca\u02cb\u0005\u0080\u0000\u0000\u02cb\u02cc\u0005\u0001"+
		"\u0000\u0000\u02cc\u02cd\u0003\n\u0005\u0000\u02cd\u02ce\u0005\u0003\u0000"+
		"\u0000\u02ce\u02f4\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005\u0093\u0000"+
		"\u0000\u02d0\u02d1\u0005\u0001\u0000\u0000\u02d1\u02d2\u0003\n\u0005\u0000"+
		"\u02d2\u02d3\u0005\u0003\u0000\u0000\u02d3\u02f4\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d5\u0005\u0086\u0000\u0000\u02d5\u02db\u0005\u0001\u0000\u0000"+
		"\u02d6\u02dc\u0003\n\u0005\u0000\u02d7\u02d8\u0003\n\u0005\u0000\u02d8"+
		"\u02d9\u0005\u0002\u0000\u0000\u02d9\u02da\u0003\n\u0005\u0000\u02da\u02dc"+
		"\u0001\u0000\u0000\u0000\u02db\u02d6\u0001\u0000\u0000\u0000\u02db\u02d7"+
		"\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u02de"+
		"\u0005\u0003\u0000\u0000\u02de\u02f4\u0001\u0000\u0000\u0000\u02df\u02e0"+
		"\u0005\u0083\u0000\u0000\u02e0\u02e1\u0005\u0001\u0000\u0000\u02e1\u02e2"+
		"\u0003\n\u0005\u0000\u02e2\u02e3\u0005\u0003\u0000\u0000\u02e3\u02f4\u0001"+
		"\u0000\u0000\u0000\u02e4\u02e5\u0005\u008b\u0000\u0000\u02e5\u02e6\u0005"+
		"\u0001\u0000\u0000\u02e6\u02e7\u0003\n\u0005\u0000\u02e7\u02e8\u0005\u0003"+
		"\u0000\u0000\u02e8\u02f4\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005\u0085"+
		"\u0000\u0000\u02ea\u02eb\u0005\u0001\u0000\u0000\u02eb\u02ec\u0003h4\u0000"+
		"\u02ec\u02ed\u0005\u0003\u0000\u0000\u02ed\u02f4\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ef\u0005\u0082\u0000\u0000\u02ef\u02f0\u0005\u0001\u0000\u0000"+
		"\u02f0\u02f1\u0003h4\u0000\u02f1\u02f2\u0005\u0003\u0000\u0000\u02f2\u02f4"+
		"\u0001\u0000\u0000\u0000\u02f3\u024a\u0001\u0000\u0000\u0000\u02f3\u024f"+
		"\u0001\u0000\u0000\u0000\u02f3\u0254\u0001\u0000\u0000\u0000\u02f3\u0259"+
		"\u0001\u0000\u0000\u0000\u02f3\u0260\u0001\u0000\u0000\u0000\u02f3\u0267"+
		"\u0001\u0000\u0000\u0000\u02f3\u026e\u0001\u0000\u0000\u0000\u02f3\u0273"+
		"\u0001\u0000\u0000\u0000\u02f3\u0278\u0001\u0000\u0000\u0000\u02f3\u0283"+
		"\u0001\u0000\u0000\u0000\u02f3\u028a\u0001\u0000\u0000\u0000\u02f3\u0291"+
		"\u0001\u0000\u0000\u0000\u02f3\u029b\u0001\u0000\u0000\u0000\u02f3\u02a0"+
		"\u0001\u0000\u0000\u0000\u02f3\u02a5\u0001\u0000\u0000\u0000\u02f3\u02aa"+
		"\u0001\u0000\u0000\u0000\u02f3\u02af\u0001\u0000\u0000\u0000\u02f3\u02b4"+
		"\u0001\u0000\u0000\u0000\u02f3\u02b9\u0001\u0000\u0000\u0000\u02f3\u02be"+
		"\u0001\u0000\u0000\u0000\u02f3\u02c5\u0001\u0000\u0000\u0000\u02f3\u02ca"+
		"\u0001\u0000\u0000\u0000\u02f3\u02cf\u0001\u0000\u0000\u0000\u02f3\u02d4"+
		"\u0001\u0000\u0000\u0000\u02f3\u02df\u0001\u0000\u0000\u0000\u02f3\u02e4"+
		"\u0001\u0000\u0000\u0000\u02f3\u02e9\u0001\u0000\u0000\u0000\u02f3\u02ee"+
		"\u0001\u0000\u0000\u0000\u02f4O\u0001\u0000\u0000\u0000\u02f5\u02f6\u0005"+
		"\"\u0000\u0000\u02f6\u02f7\u0003R)\u0000\u02f7Q\u0001\u0000\u0000\u0000"+
		"\u02f8\u02f9\u0005\u00a2\u0000\u0000\u02f9\u02fa\u0005\u0001\u0000\u0000"+
		"\u02fa\u02fb\u0003\n\u0005\u0000\u02fb\u02fc\u0005\u0002\u0000\u0000\u02fc"+
		"\u02fd\u0003\n\u0005\u0000\u02fd\u02fe\u0005\u0002\u0000\u0000\u02fe\u02ff"+
		"\u0003\n\u0005\u0000\u02ff\u0300\u0005\u0002\u0000\u0000\u0300\u0301\u0003"+
		"\n\u0005\u0000\u0301\u0302\u0005\u0003\u0000\u0000\u0302\u03c9\u0001\u0000"+
		"\u0000\u0000\u0303\u0304\u0005\u009f\u0000\u0000\u0304\u0305\u0005\u0001"+
		"\u0000\u0000\u0305\u0306\u0003\n\u0005\u0000\u0306\u0307\u0005\u0002\u0000"+
		"\u0000\u0307\u0308\u0003\n\u0005\u0000\u0308\u0309\u0005\u0002\u0000\u0000"+
		"\u0309\u030a\u0003\n\u0005\u0000\u030a\u030c\u0005\u0003\u0000\u0000\u030b"+
		"\u030d\u0003T*\u0000\u030c\u030b\u0001\u0000\u0000\u0000\u030c\u030d\u0001"+
		"\u0000\u0000\u0000\u030d\u03c9\u0001\u0000\u0000\u0000\u030e\u030f\u0005"+
		"\u00a0\u0000\u0000\u030f\u0310\u0005\u0001\u0000\u0000\u0310\u0311\u0003"+
		"\n\u0005\u0000\u0311\u0312\u0005\u0002\u0000\u0000\u0312\u0313\u0003\n"+
		"\u0005\u0000\u0313\u0314\u0005\u0002\u0000\u0000\u0314\u0315\u0003\n\u0005"+
		"\u0000\u0315\u0316\u0005\u0002\u0000\u0000\u0316\u0317\u0003\n\u0005\u0000"+
		"\u0317\u0319\u0005\u0003\u0000\u0000\u0318\u031a\u0003T*\u0000\u0319\u0318"+
		"\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a\u03c9"+
		"\u0001\u0000\u0000\u0000\u031b\u031c\u0005\u00a1\u0000\u0000\u031c\u031d"+
		"\u0005\u0001\u0000\u0000\u031d\u031e\u0003\n\u0005\u0000\u031e\u031f\u0005"+
		"\u0002\u0000\u0000\u031f\u0320\u0003\n\u0005\u0000\u0320\u0321\u0005\u0002"+
		"\u0000\u0000\u0321\u0322\u0003\n\u0005\u0000\u0322\u0323\u0005\u0002\u0000"+
		"\u0000\u0323\u0324\u0003\n\u0005\u0000\u0324\u0325\u0005\u0002\u0000\u0000"+
		"\u0325\u0326\u0003\n\u0005\u0000\u0326\u0328\u0005\u0003\u0000\u0000\u0327"+
		"\u0329\u0003T*\u0000\u0328\u0327\u0001\u0000\u0000\u0000\u0328\u0329\u0001"+
		"\u0000\u0000\u0000\u0329\u03c9\u0001\u0000\u0000\u0000\u032a\u032b\u0005"+
		"\u0099\u0000\u0000\u032b\u032c\u0005\u0001\u0000\u0000\u032c\u032d\u0003"+
		"\n\u0005\u0000\u032d\u032e\u0005\u0002\u0000\u0000\u032e\u032f\u0003\n"+
		"\u0005\u0000\u032f\u0330\u0005\u0002\u0000\u0000\u0330\u0331\u0003\n\u0005"+
		"\u0000\u0331\u0333\u0005\u0003\u0000\u0000\u0332\u0334\u0003T*\u0000\u0333"+
		"\u0332\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000\u0000\u0334"+
		"\u03c9\u0001\u0000\u0000\u0000\u0335\u0336\u0005\u009b\u0000\u0000\u0336"+
		"\u0337\u0005\u0001\u0000\u0000\u0337\u0338\u0003\n\u0005\u0000\u0338\u0339"+
		"\u0005\u0002\u0000\u0000\u0339\u033a\u0003\n\u0005\u0000\u033a\u033b\u0005"+
		"\u0002\u0000\u0000\u033b\u033c\u0003\n\u0005\u0000\u033c\u033d\u0005\u0002"+
		"\u0000\u0000\u033d\u033e\u0003\n\u0005\u0000\u033e\u0340\u0005\u0003\u0000"+
		"\u0000\u033f\u0341\u0003T*\u0000\u0340\u033f\u0001\u0000\u0000\u0000\u0340"+
		"\u0341\u0001\u0000\u0000\u0000\u0341\u03c9\u0001\u0000\u0000\u0000\u0342"+
		"\u0343\u0005\u0097\u0000\u0000\u0343\u0344\u0005\u0001\u0000\u0000\u0344"+
		"\u0345\u0003\n\u0005\u0000\u0345\u0346\u0005\u0002\u0000\u0000\u0346\u0347"+
		"\u0003\n\u0005\u0000\u0347\u0348\u0005\u0002\u0000\u0000\u0348\u0349\u0003"+
		"\n\u0005\u0000\u0349\u034a\u0005\u0002\u0000\u0000\u034a\u034b\u0003\n"+
		"\u0005\u0000\u034b\u034c\u0005\u0002\u0000\u0000\u034c\u034d\u0003\n\u0005"+
		"\u0000\u034d\u034e\u0005\u0002\u0000\u0000\u034e\u0351\u0003\n\u0005\u0000"+
		"\u034f\u0350\u0005\u0002\u0000\u0000\u0350\u0352\u0007\u0014\u0000\u0000"+
		"\u0351\u034f\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000"+
		"\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0355\u0005\u0003\u0000\u0000"+
		"\u0354\u0356\u0003T*\u0000\u0355\u0354\u0001\u0000\u0000\u0000\u0355\u0356"+
		"\u0001\u0000\u0000\u0000\u0356\u03c9\u0001\u0000\u0000\u0000\u0357\u0358"+
		"\u0005\u009e\u0000\u0000\u0358\u0359\u0005\u0001\u0000\u0000\u0359\u035a"+
		"\u0003\n\u0005\u0000\u035a\u035b\u0005\u0002\u0000\u0000\u035b\u035c\u0003"+
		"\n\u0005\u0000\u035c\u035d\u0005\u0002\u0000\u0000\u035d\u035e\u0003\n"+
		"\u0005\u0000\u035e\u035f\u0005\u0002\u0000\u0000\u035f\u0360\u0003\n\u0005"+
		"\u0000\u0360\u0361\u0005\u0002\u0000\u0000\u0361\u0362\u0003\n\u0005\u0000"+
		"\u0362\u0364\u0005\u0003\u0000\u0000\u0363\u0365\u0003T*\u0000\u0364\u0363"+
		"\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365\u03c9"+
		"\u0001\u0000\u0000\u0000\u0366\u0367\u0005\u009c\u0000\u0000\u0367\u0368"+
		"\u0005\u0001\u0000\u0000\u0368\u0369\u0003\n\u0005\u0000\u0369\u036a\u0005"+
		"\u0002\u0000\u0000\u036a\u036b\u0003\n\u0005\u0000\u036b\u036c\u0005\u0002"+
		"\u0000\u0000\u036c\u036d\u0003\n\u0005\u0000\u036d\u036e\u0005\u0002\u0000"+
		"\u0000\u036e\u036f\u0003\n\u0005\u0000\u036f\u0370\u0005\u0002\u0000\u0000"+
		"\u0370\u0371\u0003\n\u0005\u0000\u0371\u0373\u0005\u0003\u0000\u0000\u0372"+
		"\u0374\u0003T*\u0000\u0373\u0372\u0001\u0000\u0000\u0000\u0373\u0374\u0001"+
		"\u0000\u0000\u0000\u0374\u03c9\u0001\u0000\u0000\u0000\u0375\u0376\u0005"+
		"\u009d\u0000\u0000\u0376\u0377\u0005\u0001\u0000\u0000\u0377\u0378\u0003"+
		"\n\u0005\u0000\u0378\u0379\u0005\u0002\u0000\u0000\u0379\u037a\u0003\n"+
		"\u0005\u0000\u037a\u037b\u0005\u0002\u0000\u0000\u037b\u037c\u0003\n\u0005"+
		"\u0000\u037c\u037d\u0005\u0002\u0000\u0000\u037d\u037e\u0003\n\u0005\u0000"+
		"\u037e\u037f\u0005\u0002\u0000\u0000\u037f\u0380\u0003\n\u0005\u0000\u0380"+
		"\u0381\u0005\u0002\u0000\u0000\u0381\u0389\u0003\n\u0005\u0000\u0382\u0383"+
		"\u0005\u0002\u0000\u0000\u0383\u0384\u0003\n\u0005\u0000\u0384\u0385\u0005"+
		"\u0002\u0000\u0000\u0385\u0386\u0003\n\u0005\u0000\u0386\u0388\u0001\u0000"+
		"\u0000\u0000\u0387\u0382\u0001\u0000\u0000\u0000\u0388\u038b\u0001\u0000"+
		"\u0000\u0000\u0389\u0387\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000"+
		"\u0000\u0000\u038a\u038c\u0001\u0000\u0000\u0000\u038b\u0389\u0001\u0000"+
		"\u0000\u0000\u038c\u038e\u0005\u0003\u0000\u0000\u038d\u038f\u0003T*\u0000"+
		"\u038e\u038d\u0001\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000\u0000"+
		"\u038f\u03c9\u0001\u0000\u0000\u0000\u0390\u0391\u0005\u009a\u0000\u0000"+
		"\u0391\u0392\u0005\u0001\u0000\u0000\u0392\u0393\u0003\n\u0005\u0000\u0393"+
		"\u0394\u0005\u0002\u0000\u0000\u0394\u0395\u0003\n\u0005\u0000\u0395\u0396"+
		"\u0005\u0002\u0000\u0000\u0396\u0397\u0003\n\u0005\u0000\u0397\u0398\u0005"+
		"\u0002\u0000\u0000\u0398\u0399\u0003\n\u0005\u0000\u0399\u039a\u0005\u0002"+
		"\u0000\u0000\u039a\u039b\u0003\n\u0005\u0000\u039b\u039c\u0005\u0002\u0000"+
		"\u0000\u039c\u039d\u0003\n\u0005\u0000\u039d\u03a8\u0005\u0003\u0000\u0000"+
		"\u039e\u03a1\u0003T*\u0000\u039f\u03a0\u0005\u0002\u0000\u0000\u03a0\u03a2"+
		"\u0003V+\u0000\u03a1\u039f\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000"+
		"\u0000\u0000\u03a2\u03a9\u0001\u0000\u0000\u0000\u03a3\u03a6\u0003V+\u0000"+
		"\u03a4\u03a5\u0005\u0002\u0000\u0000\u03a5\u03a7\u0003T*\u0000\u03a6\u03a4"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7\u03a9"+
		"\u0001\u0000\u0000\u0000\u03a8\u039e\u0001\u0000\u0000\u0000\u03a8\u03a3"+
		"\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9\u03c9"+
		"\u0001\u0000\u0000\u0000\u03aa\u03ab\u0005\u0098\u0000\u0000\u03ab\u03ac"+
		"\u0005\u0001\u0000\u0000\u03ac\u03ad\u0003\n\u0005\u0000\u03ad\u03ae\u0005"+
		"\u0002\u0000\u0000\u03ae\u03af\u0003\n\u0005\u0000\u03af\u03b0\u0005\u0002"+
		"\u0000\u0000\u03b0\u03b1\u0003\n\u0005\u0000\u03b1\u03b2\u0005\u0002\u0000"+
		"\u0000\u03b2\u03b3\u0003\n\u0005\u0000\u03b3\u03b4\u0005\u0002\u0000\u0000"+
		"\u03b4\u03b5\u0003\n\u0005\u0000\u03b5\u03b6\u0005\u0002\u0000\u0000\u03b6"+
		"\u03b7\u0003\n\u0005\u0000\u03b7\u03b8\u0005\u0002\u0000\u0000\u03b8\u03b9"+
		"\u0003\n\u0005\u0000\u03b9\u03ba\u0005\u0002\u0000\u0000\u03ba\u03bb\u0003"+
		"\n\u0005\u0000\u03bb\u03c6\u0005\u0003\u0000\u0000\u03bc\u03bf\u0003T"+
		"*\u0000\u03bd\u03be\u0005\u0002\u0000\u0000\u03be\u03c0\u0003V+\u0000"+
		"\u03bf\u03bd\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000"+
		"\u03c0\u03c7\u0001\u0000\u0000\u0000\u03c1\u03c4\u0003V+\u0000\u03c2\u03c3"+
		"\u0005\u0002\u0000\u0000\u03c3\u03c5\u0003T*\u0000\u03c4\u03c2\u0001\u0000"+
		"\u0000\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5\u03c7\u0001\u0000"+
		"\u0000\u0000\u03c6\u03bc\u0001\u0000\u0000\u0000\u03c6\u03c1\u0001\u0000"+
		"\u0000\u0000\u03c6\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c9\u0001\u0000"+
		"\u0000\u0000\u03c8\u02f8\u0001\u0000\u0000\u0000\u03c8\u0303\u0001\u0000"+
		"\u0000\u0000\u03c8\u030e\u0001\u0000\u0000\u0000\u03c8\u031b\u0001\u0000"+
		"\u0000\u0000\u03c8\u032a\u0001\u0000\u0000\u0000\u03c8\u0335\u0001\u0000"+
		"\u0000\u0000\u03c8\u0342\u0001\u0000\u0000\u0000\u03c8\u0357\u0001\u0000"+
		"\u0000\u0000\u03c8\u0366\u0001\u0000\u0000\u0000\u03c8\u0375\u0001\u0000"+
		"\u0000\u0000\u03c8\u0390\u0001\u0000\u0000\u0000\u03c8\u03aa\u0001\u0000"+
		"\u0000\u0000\u03c9S\u0001\u0000\u0000\u0000\u03ca\u03cb\u0005T\u0000\u0000"+
		"\u03cb\u03cf\u0005K\u0000\u0000\u03cc\u03cd\u0005\'\u0000\u0000\u03cd"+
		"\u03ce\u0005T\u0000\u0000\u03ce\u03d0\u0005\u0015\u0000\u0000\u03cf\u03cc"+
		"\u0001\u0000\u0000\u0000\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u03d9"+
		"\u0001\u0000\u0000\u0000\u03d1\u03d2\u0005T\u0000\u0000\u03d2\u03d6\u0005"+
		"\u0015\u0000\u0000\u03d3\u03d4\u0005\'\u0000\u0000\u03d4\u03d5\u0005T"+
		"\u0000\u0000\u03d5\u03d7\u0005K\u0000\u0000\u03d6\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d6\u03d7\u0001\u0000\u0000\u0000\u03d7\u03d9\u0001\u0000\u0000"+
		"\u0000\u03d8\u03ca\u0001\u0000\u0000\u0000\u03d8\u03d1\u0001\u0000\u0000"+
		"\u0000\u03d9U\u0001\u0000\u0000\u0000\u03da\u03db\u0005>\u0000\u0000\u03db"+
		"\u03dc\u0007\u0015\u0000\u0000\u03dcW\u0001\u0000\u0000\u0000\u03dd\u03de"+
		"\u0005\"\u0000\u0000\u03de\u03e9\u0005\u0010\u0000\u0000\u03df\u03e2\u0003"+
		"T*\u0000\u03e0\u03e1\u0005\u0002\u0000\u0000\u03e1\u03e3\u0003V+\u0000"+
		"\u03e2\u03e0\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000"+
		"\u03e3\u03ea\u0001\u0000\u0000\u0000\u03e4\u03e7\u0003V+\u0000\u03e5\u03e6"+
		"\u0005\u0002\u0000\u0000\u03e6\u03e8\u0003T*\u0000\u03e7\u03e5\u0001\u0000"+
		"\u0000\u0000\u03e7\u03e8\u0001\u0000\u0000\u0000\u03e8\u03ea\u0001\u0000"+
		"\u0000\u0000\u03e9\u03df\u0001\u0000\u0000\u0000\u03e9\u03e4\u0001\u0000"+
		"\u0000\u0000\u03e9\u03ea\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000"+
		"\u0000\u0000\u03eb\u03ef\u0005\u0004\u0000\u0000\u03ec\u03ed\u0003Z-\u0000"+
		"\u03ed\u03ee\u0005\u00d0\u0000\u0000\u03ee\u03f0\u0001\u0000\u0000\u0000"+
		"\u03ef\u03ec\u0001\u0000\u0000\u0000\u03f0\u03f1\u0001\u0000\u0000\u0000"+
		"\u03f1\u03ef\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001\u0000\u0000\u0000"+
		"\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3\u03f4\u0005\u0005\u0000\u0000"+
		"\u03f4Y\u0001\u0000\u0000\u0000\u03f5\u03f6\u0005?\u0000\u0000\u03f6\u03f7"+
		"\u0005\r\u0000\u0000\u03f7\u03f8\u0003\n\u0005\u0000\u03f8\u03f9\u0005"+
		"\u0002\u0000\u0000\u03f9\u03fa\u0003\n\u0005\u0000\u03fa\u041d\u0001\u0000"+
		"\u0000\u0000\u03fb\u03fc\u0005<\u0000\u0000\u03fc\u03fd\u0005\r\u0000"+
		"\u0000\u03fd\u03fe\u0003\n\u0005\u0000\u03fe\u03ff\u0005\u0002\u0000\u0000"+
		"\u03ff\u0400\u0003\n\u0005\u0000\u0400\u041d\u0001\u0000\u0000\u0000\u0401"+
		"\u0402\u0005\u001a\u0000\u0000\u0402\u0403\u0005M\u0000\u0000\u0403\u0404"+
		"\u0005\r\u0000\u0000\u0404\u0405\u0003\n\u0005\u0000\u0405\u0406\u0005"+
		"\u0002\u0000\u0000\u0406\u0407\u0003\n\u0005\u0000\u0407\u0408\u0005\u0002"+
		"\u0000\u0000\u0408\u0409\u0003\n\u0005\u0000\u0409\u040a\u0005\u0002\u0000"+
		"\u0000\u040a\u040b\u0003\n\u0005\u0000\u040b\u041d\u0001\u0000\u0000\u0000"+
		"\u040c\u040d\u0005\u001a\u0000\u0000\u040d\u040e\u0005\u0019\u0000\u0000"+
		"\u040e\u040f\u0005\r\u0000\u0000\u040f\u0410\u0003\n\u0005\u0000\u0410"+
		"\u0411\u0005\u0002\u0000\u0000\u0411\u0412\u0003\n\u0005\u0000\u0412\u0413"+
		"\u0005\u0002\u0000\u0000\u0413\u0414\u0003\n\u0005\u0000\u0414\u0415\u0005"+
		"\u0002\u0000\u0000\u0415\u0416\u0003\n\u0005\u0000\u0416\u0417\u0005\u0002"+
		"\u0000\u0000\u0417\u0418\u0003\n\u0005\u0000\u0418\u0419\u0005\u0002\u0000"+
		"\u0000\u0419\u041a\u0003\n\u0005\u0000\u041a\u041d\u0001\u0000\u0000\u0000"+
		"\u041b\u041d\u00050\u0000\u0000\u041c\u03f5\u0001\u0000\u0000\u0000\u041c"+
		"\u03fb\u0001\u0000\u0000\u0000\u041c\u0401\u0001\u0000\u0000\u0000\u041c"+
		"\u040c\u0001\u0000\u0000\u0000\u041c\u041b\u0001\u0000\u0000\u0000\u041d"+
		"[\u0001\u0000\u0000\u0000\u041e\u041f\u0005W\u0000\u0000\u041f\u0420\u0005"+
		"\u00d0\u0000\u0000\u0420\u0421\u0007\u0016\u0000\u0000\u0421\u0422\u0005"+
		"\u0001\u0000\u0000\u0422\u0423\u0005\u0003\u0000\u0000\u0423]\u0001\u0000"+
		"\u0000\u0000\u0424\u0425\u0003h4\u0000\u0425\u043b\u0005\u00d0\u0000\u0000"+
		"\u0426\u0427\u0005w\u0000\u0000\u0427\u0428\u0005\u0001\u0000\u0000\u0428"+
		"\u043c\u0005\u0003\u0000\u0000\u0429\u042a\u0005u\u0000\u0000\u042a\u042b"+
		"\u0005\u0001\u0000\u0000\u042b\u0430\u0005\u0003\u0000\u0000\u042c\u042d"+
		"\u0005\u0006\u0000\u0000\u042d\u042e\u0003F#\u0000\u042e\u042f\u0005\u0007"+
		"\u0000\u0000\u042f\u0431\u0001\u0000\u0000\u0000\u0430\u042c\u0001\u0000"+
		"\u0000\u0000\u0430\u0431\u0001\u0000\u0000\u0000\u0431\u043c\u0001\u0000"+
		"\u0000\u0000\u0432\u0433\u0005x\u0000\u0000\u0433\u0434\u0005\u0001\u0000"+
		"\u0000\u0434\u0437\u0003\n\u0005\u0000\u0435\u0436\u0005\u0002\u0000\u0000"+
		"\u0436\u0438\u0003\n\u0005\u0000\u0437\u0435\u0001\u0000\u0000\u0000\u0437"+
		"\u0438\u0001\u0000\u0000\u0000\u0438\u0439\u0001\u0000\u0000\u0000\u0439"+
		"\u043a\u0005\u0003\u0000\u0000\u043a\u043c\u0001\u0000\u0000\u0000\u043b"+
		"\u0426\u0001\u0000\u0000\u0000\u043b\u0429\u0001\u0000\u0000\u0000\u043b"+
		"\u0432\u0001\u0000\u0000\u0000\u043c_\u0001\u0000\u0000\u0000\u043d\u043e"+
		"\u00051\u0000\u0000\u043e\u043f\u0005\u0001\u0000\u0000\u043f\u0444\u0005"+
		"\u00d9\u0000\u0000\u0440\u0441\u0005\u0002\u0000\u0000\u0441\u0443\u0003"+
		"\n\u0005\u0000\u0442\u0440\u0001\u0000\u0000\u0000\u0443\u0446\u0001\u0000"+
		"\u0000\u0000\u0444\u0442\u0001\u0000\u0000\u0000\u0444\u0445\u0001\u0000"+
		"\u0000\u0000\u0445\u0447\u0001\u0000\u0000\u0000\u0446\u0444\u0001\u0000"+
		"\u0000\u0000\u0447\u0448\u0005\u0003\u0000\u0000\u0448a\u0001\u0000\u0000"+
		"\u0000\u0449\u044e\u0007\u0017\u0000\u0000\u044a\u044b\u0005\u0006\u0000"+
		"\u0000\u044b\u044c\u0003\n\u0005\u0000\u044c\u044d\u0005\u0007\u0000\u0000"+
		"\u044d\u044f\u0001\u0000\u0000\u0000\u044e\u044a\u0001\u0000\u0000\u0000"+
		"\u044f\u0450\u0001\u0000\u0000\u0000\u0450\u044e\u0001\u0000\u0000\u0000"+
		"\u0450\u0451\u0001\u0000\u0000\u0000\u0451\u0456\u0001\u0000\u0000\u0000"+
		"\u0452\u0453\u0007\u0018\u0000\u0000\u0453\u0454\u0005\u0004\u0000\u0000"+
		"\u0454\u0456\u0005\u0005\u0000\u0000\u0455\u0449\u0001\u0000\u0000\u0000"+
		"\u0455\u0452\u0001\u0000\u0000\u0000\u0456c\u0001\u0000\u0000\u0000\u0457"+
		"\u0458\u0005\u00d3\u0000\u0000\u0458\u0461\u0005\u0001\u0000\u0000\u0459"+
		"\u045e\u0003\n\u0005\u0000\u045a\u045b\u0005\u0002\u0000\u0000\u045b\u045d"+
		"\u0003\n\u0005\u0000\u045c\u045a\u0001\u0000\u0000\u0000\u045d\u0460\u0001"+
		"\u0000\u0000\u0000\u045e\u045c\u0001\u0000\u0000\u0000\u045e\u045f\u0001"+
		"\u0000\u0000\u0000\u045f\u0462\u0001\u0000\u0000\u0000\u0460\u045e\u0001"+
		"\u0000\u0000\u0000\u0461\u0459\u0001\u0000\u0000\u0000\u0461\u0462\u0001"+
		"\u0000\u0000\u0000\u0462\u0463\u0001\u0000\u0000\u0000\u0463\u0464\u0005"+
		"\u0003\u0000\u0000\u0464e\u0001\u0000\u0000\u0000\u0465\u0467\u0005P\u0000"+
		"\u0000\u0466\u0468\u0003\n\u0005\u0000\u0467\u0466\u0001\u0000\u0000\u0000"+
		"\u0467\u0468\u0001\u0000\u0000\u0000\u0468g\u0001\u0000\u0000\u0000\u0469"+
		"\u046a\u0005\u00d1\u0000\u0000\u046ai\u0001\u0000\u0000\u0000\\ms\u007f"+
		"\u0082\u0089\u0096\u00ab\u00b2\u00b8\u00bb\u00c2\u00ca\u00d7\u00e0\u00e6"+
		"\u00f0\u00f7\u0108\u0110\u0114\u011d\u0129\u0132\u013c\u0143\u0145\u014f"+
		"\u0158\u0160\u0167\u017d\u0183\u0191\u019e\u01a6\u01ba\u01bf\u01c4\u01c7"+
		"\u01cb\u01d6\u01df\u01e5\u01eb\u01fa\u0200\u0202\u020a\u0210\u0219\u021e"+
		"\u0228\u023e\u027f\u0298\u02db\u02f3\u030c\u0319\u0328\u0333\u0340\u0351"+
		"\u0355\u0364\u0373\u0389\u038e\u03a1\u03a6\u03a8\u03bf\u03c4\u03c6\u03c8"+
		"\u03cf\u03d6\u03d8\u03e2\u03e7\u03e9\u03f1\u041c\u0430\u0437\u043b\u0444"+
		"\u0450\u0455\u045e\u0461\u0467";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}