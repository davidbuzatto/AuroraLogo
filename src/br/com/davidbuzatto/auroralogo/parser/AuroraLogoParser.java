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
		CONT=20, CONU=21, CON=22, CONE=23, CONS=24, COR=25, CUBI=26, CUR=27, CRA=28, 
		CRAA=29, CRR=30, CRRA=31, DCMM=32, DE=33, DES=34, DESE=35, DIAG=36, DIR=37, 
		DIVM=38, DO=39, E=40, EM=41, ENG=42, ENQ=43, ENT=44, ESCO=45, ESC=46, 
		ESQ=47, EST=48, FAL=49, FEC=50, FORM=51, FUN=52, FUNC=53, GIR=54, GRA=55, 
		GROS=56, INCM=57, INI=58, LER=59, LEV=60, LIM=61, LIN=62, MEN=63, MOS=64, 
		MOV=65, MULM=66, NA=67, NO=68, PAS=69, PADR=70, PARA=71, PARR=72, PI=73, 
		PINC=74, PIZ=75, PONT=76, POR=77, PREE=78, PUL=79, QUAD=80, RAD=81, REP=82, 
		RET=83, SAI=84, SE=85, SEN=86, SEM=87, SOMM=88, SUBM=89, TART=90, TER=91, 
		TRAC=92, TROC=93, USA=94, VA=95, VER=96, VEZ=97, VEZS=98, PRETO=99, AZUL=100, 
		CIANO=101, CINZA=102, VERDE=103, MAGENTA=104, LARANJA=105, ROSA=106, VERMELHO=107, 
		BRANCO=108, AMARELO=109, ESCURO=110, CLARO=111, PA=112, PCF=113, PCP=114, 
		PCPP=115, PCPR=116, PD=117, PES=118, PG=119, PX=120, PY=121, CARC=122, 
		CHAV=123, COMP=124, SUBS=125, TIPO=126, F_ACOS=127, F_ARRE=128, F_ASEN=129, 
		F_ATAN=130, F_CAPO=131, F_CHAO=132, F_COSH=133, F_COSS=134, F_DCM=135, 
		F_GRRA=136, F_HIPO=137, F_INC=138, F_LOGA=139, F_MAXI=140, F_MINI=141, 
		F_NUMA=142, F_POTE=143, F_RAGR=144, F_RAIC=145, F_RAIQ=146, F_RAIZ=147, 
		F_SEME=148, F_SENH=149, F_SENO=150, F_TANG=151, F_TANH=152, F_TETO=153, 
		F_VABS=154, FC_CRI=155, FCO_INT=156, FCO_DEC=157, FCO_CHR=158, FCO_BOL=159, 
		FCO_STR=160, FCO_COR=161, FG_ARC=162, FG_CCU=163, FG_CIC=164, FG_CQD=165, 
		FG_ELI=166, FG_EST=167, FG_POL=168, FG_POR=169, FG_QUA=170, FG_RET=171, 
		FG_REA=172, FG_SEG=173, ATR=174, ATRA=175, AC_A=176, AT_A=177, AC_S=178, 
		AT_S=179, AC_M=180, AT_M=181, AC_D=182, AT_D=183, AC_R=184, AT_R=185, 
		ADI=186, ADIA=187, SUB=188, SUBA=189, MUL=190, DIV=191, DIVA=192, MOD=193, 
		MODA=194, IGU=195, IGUT=196, IGUA=197, DIF=198, DIFT=199, DIFA=200, ME=201, 
		MET=202, MEA=203, MEI=204, MEIT=205, MEIA=206, MA=207, MAT=208, MAA=209, 
		MAI=210, MAIT=211, MAIA=212, ELG=213, ELGT=214, OLG=215, OLGT=216, NAO=217, 
		NAOT=218, DOT=219, ID=220, IDC=221, IDF=222, IDA=223, INT=224, DEC=225, 
		CHEX=226, CHAR=227, STRING=228, COMENTARIO=229, COMENTARIO_LINHA=230, 
		WS=231;
	public static final int
		RULE_prog = 0, RULE_func = 1, RULE_inst = 2, RULE_instf = 3, RULE_ains = 4, 
		RULE_expr = 5, RULE_relacao = 6, RULE_exprSimp = 7, RULE_termo = 8, RULE_fator = 9, 
		RULE_exprBool = 10, RULE_se = 11, RULE_seSe = 12, RULE_seSenaoSe = 13, 
		RULE_seSenao = 14, RULE_usando = 15, RULE_escolha = 16, RULE_repetir = 17, 
		RULE_passo = 18, RULE_repetirEnquanto = 19, RULE_paraCada = 20, RULE_parar = 21, 
		RULE_continuar = 22, RULE_movimentar = 23, RULE_trocarCor = 24, RULE_configuracaoCor = 25, 
		RULE_cor = 26, RULE_corExtenso = 27, RULE_criarCor = 28, RULE_girar = 29, 
		RULE_engrossar = 30, RULE_desengrossar = 31, RULE_trocarGrossura = 32, 
		RULE_trocarEstilo = 33, RULE_escrever = 34, RULE_ler = 35, RULE_atribuir = 36, 
		RULE_exprIndice = 37, RULE_abaixar = 38, RULE_levantar = 39, RULE_limpar = 40, 
		RULE_funcaoMatematica = 41, RULE_instrucaoGeometrica = 42, RULE_funcaoGeometrica = 43, 
		RULE_opcaoFuncGeom = 44, RULE_opcaoPontosControle = 45, RULE_desenharCaminho = 46, 
		RULE_instCaminho = 47, RULE_consultarTartaruga = 48, RULE_consultarString = 49, 
		RULE_formatarTexto = 50, RULE_criarArranjos = 51, RULE_funcaoConversao = 52, 
		RULE_chamadaFuncao = 53, RULE_retornar = 54, RULE_processaId = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "func", "inst", "instf", "ains", "expr", "relacao", "exprSimp", 
			"termo", "fator", "exprBool", "se", "seSe", "seSenaoSe", "seSenao", "usando", 
			"escolha", "repetir", "passo", "repetirEnquanto", "paraCada", "parar", 
			"continuar", "movimentar", "trocarCor", "configuracaoCor", "cor", "corExtenso", 
			"criarCor", "girar", "engrossar", "desengrossar", "trocarGrossura", "trocarEstilo", 
			"escrever", "ler", "atribuir", "exprIndice", "abaixar", "levantar", "limpar", 
			"funcaoMatematica", "instrucaoGeometrica", "funcaoGeometrica", "opcaoFuncGeom", 
			"opcaoPontosControle", "desenharCaminho", "instCaminho", "consultarTartaruga", 
			"consultarString", "formatarTexto", "criarArranjos", "funcaoConversao", 
			"chamadaFuncao", "retornar", "processaId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "'}'", "'['", "']'", "':'", "'a'", 
			"'abaixar'", "'ABERTO'", "'alterar'", "'at\\u00E9'", "'baixo'", "'cada'", 
			"'caminho'", "'cima'", "'CORDA'", "'com'", "'continuar'", "'cont\\u00EDnuo'", 
			"'contorno'", "'controle'", "'controles'", "'cor'", "'c\\u00FAbica'", 
			"'curva'", "'criarArranjo'", "'criarArranjoAssociativo'", "'criarArray'", 
			"'criarArrayAssociativo'", "'decrementando'", "'de'", "'desengrossar'", 
			"'desenhar'", "'di\\u00E1logo'", "'direita'", "'dividindo'", "'do'", 
			"'e'", "'em'", "'engrossar'", "'enquanto'", "'ent\\u00E3o'", "'escolha'", 
			"'escrever'", "'esquerda'", "'estilo'", "'FALSO'", "'fechar'", "'formatarTexto'", 
			"'fundo'", "'fun\\u00E7\\u00E3o'", "'girar'", "'graus'", "'grossura'", 
			"'incrementando'", "'iniciar'", "'ler'", "'levantar'", "'limpar'", "'linha'", 
			"'mensagem'", "'mostrando'", "'mover'", "'multiplicando'", "'na'", "'no'", 
			"'passo'", "'padr\\u00E3o'", "'para'", "'parar'", "'PI'", "'pincel'", 
			"'PIZZA'", "'pontilhado'", "'por'", "'preenchimento'", "'pulando'", "'quadr\\u00E1tica'", 
			"'radianos'", "'repetir'", "'retornar'", "'sa\\u00EDda'", "'se'", "'sen\\u00E3o'", 
			"'sem'", "'somando'", "'subtraindo'", "'tartaruga'", "'terminar'", "'tracejado'", 
			"'trocar'", "'usando'", "'v\\u00E1'", "'VERDADEIRO'", "'vez'", "'vezes'", 
			"'preto'", "'azul'", "'ciano'", "'cinza'", "'verde'", "'magenta'", "'laranja'", 
			"'rosa'", "'vermelho'", "'branco'", "'amarelo'", "'escuro'", "'claro'", 
			"'\\u00E2ngulo'", "'corDoFundo'", "'corDoPincel'", "'corDoPreenchimento'", 
			"'corPr\\u00F3pria'", "'est\\u00E1Desenhando'", "'estiloDoPincel'", "'grossuraDoPincel'", 
			"'x'", "'y'", "'caracteres'", "'chaves'", "'comprimento'", "'substring'", 
			"'tipo'", "'arcoCosseno'", "'arredondar'", "'arcoSeno'", "'arcoTangente'", 
			"'cartesianoParaPolar'", "'ch\\u00E3o'", "'cossenoHiperb\\u00F3lico'", 
			"'cosseno'", "'decrementar'", "'grausParaRadianos'", "'hipotenusa'", 
			"'incrementar'", "'logar\\u00EDtmo'", "'m\\u00E1ximo'", "'m\\u00EDnimo'", 
			"'n\\u00FAmeroAleat\\u00F3rio'", "'pot\\u00EAncia'", "'radianosParaGraus'", 
			"'raizC\\u00FAbica'", "'raizQuadrada'", "'raiz'", "'definirSementeAleat\\u00F3ria'", 
			"'senoHiperb\\u00F3lico'", "'seno'", "'tangente'", "'tangenteHiperb\\u00F3lica'", 
			"'teto'", "'valorAbsoluto'", "'criarCor'", "'converterEmInteiro'", "'converterEmDecimal'", 
			"'converterEmCaractere'", "'converterEmBooleano'", "'converterEmString'", 
			"'converterEmCor'", "'arco'", "'curvaC\\u00FAbica'", "'c\\u00EDrculo'", 
			"'curvaQuadr\\u00E1tica'", "'elipse'", "'estrela'", "'pol\\u00EDgono'", 
			"'pol\\u00EDgonoRegular'", "'quadrado'", "'ret\\u00E2ngulo'", "'ret\\u00E2nguloArredondado'", 
			"'segmento'", "'='", "'<-'", "'+='", "'+<-'", "'-='", "'-<-'", "'*='", 
			"'*<-'", "'/='", "'/<-'", "'%='", "'%<-'", "'+'", "'mais'", "'-'", "'menos'", 
			"'*'", "'/'", "'dividido por'", "'%'", "'resto'", "'=='", "'\\u00E9 igual a'", 
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
			null, null, null, null, null, null, null, null, null, "A", "ABA", "ABE", 
			"ALT", "ATE", "BAI", "CADA", "CAM", "CIM", "COD", "COM", "CONT", "CONU", 
			"CON", "CONE", "CONS", "COR", "CUBI", "CUR", "CRA", "CRAA", "CRR", "CRRA", 
			"DCMM", "DE", "DES", "DESE", "DIAG", "DIR", "DIVM", "DO", "E", "EM", 
			"ENG", "ENQ", "ENT", "ESCO", "ESC", "ESQ", "EST", "FAL", "FEC", "FORM", 
			"FUN", "FUNC", "GIR", "GRA", "GROS", "INCM", "INI", "LER", "LEV", "LIM", 
			"LIN", "MEN", "MOS", "MOV", "MULM", "NA", "NO", "PAS", "PADR", "PARA", 
			"PARR", "PI", "PINC", "PIZ", "PONT", "POR", "PREE", "PUL", "QUAD", "RAD", 
			"REP", "RET", "SAI", "SE", "SEN", "SEM", "SOMM", "SUBM", "TART", "TER", 
			"TRAC", "TROC", "USA", "VA", "VER", "VEZ", "VEZS", "PRETO", "AZUL", "CIANO", 
			"CINZA", "VERDE", "MAGENTA", "LARANJA", "ROSA", "VERMELHO", "BRANCO", 
			"AMARELO", "ESCURO", "CLARO", "PA", "PCF", "PCP", "PCPP", "PCPR", "PD", 
			"PES", "PG", "PX", "PY", "CARC", "CHAV", "COMP", "SUBS", "TIPO", "F_ACOS", 
			"F_ARRE", "F_ASEN", "F_ATAN", "F_CAPO", "F_CHAO", "F_COSH", "F_COSS", 
			"F_DCM", "F_GRRA", "F_HIPO", "F_INC", "F_LOGA", "F_MAXI", "F_MINI", "F_NUMA", 
			"F_POTE", "F_RAGR", "F_RAIC", "F_RAIQ", "F_RAIZ", "F_SEME", "F_SENH", 
			"F_SENO", "F_TANG", "F_TANH", "F_TETO", "F_VABS", "FC_CRI", "FCO_INT", 
			"FCO_DEC", "FCO_CHR", "FCO_BOL", "FCO_STR", "FCO_COR", "FG_ARC", "FG_CCU", 
			"FG_CIC", "FG_CQD", "FG_ELI", "FG_EST", "FG_POL", "FG_POR", "FG_QUA", 
			"FG_RET", "FG_REA", "FG_SEG", "ATR", "ATRA", "AC_A", "AT_A", "AC_S", 
			"AT_S", "AC_M", "AT_M", "AC_D", "AT_D", "AC_R", "AT_R", "ADI", "ADIA", 
			"SUB", "SUBA", "MUL", "DIV", "DIVA", "MOD", "MODA", "IGU", "IGUT", "IGUA", 
			"DIF", "DIFT", "DIFA", "ME", "MET", "MEA", "MEI", "MEIT", "MEIA", "MA", 
			"MAT", "MAA", "MAI", "MAIT", "MAIA", "ELG", "ELGT", "OLG", "OLGT", "NAO", 
			"NAOT", "DOT", "ID", "IDC", "IDF", "IDA", "INT", "DEC", "CHEX", "CHAR", 
			"STRING", "COMENTARIO", "COMENTARIO_LINHA", "WS"
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(112);
				func();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				inst();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PAS - 69)) | (1L << (PARA - 69)) | (1L << (PARR - 69)) | (1L << (PI - 69)) | (1L << (REP - 69)) | (1L << (RET - 69)) | (1L << (SE - 69)) | (1L << (TART - 69)) | (1L << (TROC - 69)) | (1L << (USA - 69)) | (1L << (VA - 69)) | (1L << (VER - 69)) | (1L << (PRETO - 69)) | (1L << (AZUL - 69)) | (1L << (CIANO - 69)) | (1L << (CINZA - 69)) | (1L << (VERDE - 69)) | (1L << (MAGENTA - 69)) | (1L << (LARANJA - 69)) | (1L << (ROSA - 69)) | (1L << (VERMELHO - 69)) | (1L << (BRANCO - 69)) | (1L << (AMARELO - 69)) | (1L << (F_ACOS - 69)) | (1L << (F_ARRE - 69)) | (1L << (F_ASEN - 69)) | (1L << (F_ATAN - 69)) | (1L << (F_CAPO - 69)) | (1L << (F_CHAO - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (F_COSH - 133)) | (1L << (F_COSS - 133)) | (1L << (F_DCM - 133)) | (1L << (F_GRRA - 133)) | (1L << (F_HIPO - 133)) | (1L << (F_INC - 133)) | (1L << (F_LOGA - 133)) | (1L << (F_MAXI - 133)) | (1L << (F_MINI - 133)) | (1L << (F_NUMA - 133)) | (1L << (F_POTE - 133)) | (1L << (F_RAGR - 133)) | (1L << (F_RAIC - 133)) | (1L << (F_RAIQ - 133)) | (1L << (F_RAIZ - 133)) | (1L << (F_SEME - 133)) | (1L << (F_SENH - 133)) | (1L << (F_SENO - 133)) | (1L << (F_TANG - 133)) | (1L << (F_TANH - 133)) | (1L << (F_TETO - 133)) | (1L << (F_VABS - 133)) | (1L << (FC_CRI - 133)) | (1L << (FCO_INT - 133)) | (1L << (FCO_DEC - 133)) | (1L << (FCO_CHR - 133)) | (1L << (FCO_BOL - 133)) | (1L << (FCO_STR - 133)) | (1L << (FCO_COR - 133)) | (1L << (ADI - 133)) | (1L << (ADIA - 133)) | (1L << (SUB - 133)) | (1L << (SUBA - 133)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NAO - 217)) | (1L << (NAOT - 217)) | (1L << (ID - 217)) | (1L << (IDF - 217)) | (1L << (INT - 217)) | (1L << (DEC - 217)) | (1L << (CHEX - 217)) | (1L << (CHAR - 217)) | (1L << (STRING - 217)))) != 0) );
			setState(123);
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
			setState(125);
			match(FUNC);
			setState(126);
			match(IDF);
			setState(127);
			match(T__0);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(128);
				match(ID);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(129);
					match(T__1);
					setState(130);
					match(ID);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(138);
			match(T__2);
			setState(139);
			match(T__3);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				instf();
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PAS - 69)) | (1L << (PARA - 69)) | (1L << (PARR - 69)) | (1L << (PI - 69)) | (1L << (REP - 69)) | (1L << (RET - 69)) | (1L << (SE - 69)) | (1L << (TART - 69)) | (1L << (TROC - 69)) | (1L << (USA - 69)) | (1L << (VA - 69)) | (1L << (VER - 69)) | (1L << (PRETO - 69)) | (1L << (AZUL - 69)) | (1L << (CIANO - 69)) | (1L << (CINZA - 69)) | (1L << (VERDE - 69)) | (1L << (MAGENTA - 69)) | (1L << (LARANJA - 69)) | (1L << (ROSA - 69)) | (1L << (VERMELHO - 69)) | (1L << (BRANCO - 69)) | (1L << (AMARELO - 69)) | (1L << (F_ACOS - 69)) | (1L << (F_ARRE - 69)) | (1L << (F_ASEN - 69)) | (1L << (F_ATAN - 69)) | (1L << (F_CAPO - 69)) | (1L << (F_CHAO - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (F_COSH - 133)) | (1L << (F_COSS - 133)) | (1L << (F_DCM - 133)) | (1L << (F_GRRA - 133)) | (1L << (F_HIPO - 133)) | (1L << (F_INC - 133)) | (1L << (F_LOGA - 133)) | (1L << (F_MAXI - 133)) | (1L << (F_MINI - 133)) | (1L << (F_NUMA - 133)) | (1L << (F_POTE - 133)) | (1L << (F_RAGR - 133)) | (1L << (F_RAIC - 133)) | (1L << (F_RAIQ - 133)) | (1L << (F_RAIZ - 133)) | (1L << (F_SEME - 133)) | (1L << (F_SENH - 133)) | (1L << (F_SENO - 133)) | (1L << (F_TANG - 133)) | (1L << (F_TANH - 133)) | (1L << (F_TETO - 133)) | (1L << (F_VABS - 133)) | (1L << (FC_CRI - 133)) | (1L << (FCO_INT - 133)) | (1L << (FCO_DEC - 133)) | (1L << (FCO_CHR - 133)) | (1L << (FCO_BOL - 133)) | (1L << (FCO_STR - 133)) | (1L << (FCO_COR - 133)) | (1L << (ADI - 133)) | (1L << (ADIA - 133)) | (1L << (SUB - 133)) | (1L << (SUBA - 133)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NAO - 217)) | (1L << (NAOT - 217)) | (1L << (ID - 217)) | (1L << (IDF - 217)) | (1L << (INT - 217)) | (1L << (DEC - 217)) | (1L << (CHEX - 217)) | (1L << (CHAR - 217)) | (1L << (STRING - 217)))) != 0) );
			setState(145);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				ains();
				setState(148);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				se();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				usando();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				repetir();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				repetirEnquanto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				paraCada();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
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
			setState(158);
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
		public TrocarEstiloContext trocarEstilo() {
			return getRuleContext(TrocarEstiloContext.class,0);
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
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				movimentar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				trocarCor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				girar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				abaixar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				levantar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				limpar();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				engrossar();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				desengrossar();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(168);
				trocarGrossura();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(169);
				trocarEstilo();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(170);
				escrever();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(171);
				ler();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(172);
				atribuir();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(173);
				parar();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(174);
				continuar();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(175);
				retornar();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(176);
				instrucaoGeometrica();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(177);
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
			setState(180);
			relacao();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (ELG - 213)) | (1L << (ELGT - 213)) | (1L << (OLG - 213)) | (1L << (OLGT - 213)))) != 0)) {
				{
				{
				setState(181);
				_la = _input.LA(1);
				if ( !(((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (ELG - 213)) | (1L << (ELGT - 213)) | (1L << (OLG - 213)) | (1L << (OLGT - 213)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				relacao();
				}
				}
				setState(187);
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
			setState(188);
			exprSimp();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (IGU - 195)) | (1L << (IGUT - 195)) | (1L << (IGUA - 195)) | (1L << (DIF - 195)) | (1L << (DIFT - 195)) | (1L << (DIFA - 195)) | (1L << (ME - 195)) | (1L << (MET - 195)) | (1L << (MEA - 195)) | (1L << (MEI - 195)) | (1L << (MEIT - 195)) | (1L << (MEIA - 195)) | (1L << (MA - 195)) | (1L << (MAT - 195)) | (1L << (MAA - 195)) | (1L << (MAI - 195)) | (1L << (MAIT - 195)) | (1L << (MAIA - 195)))) != 0)) {
				{
				setState(189);
				((RelacaoContext)_localctx).opRel = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (IGU - 195)) | (1L << (IGUT - 195)) | (1L << (IGUA - 195)) | (1L << (DIF - 195)) | (1L << (DIFT - 195)) | (1L << (DIFA - 195)) | (1L << (ME - 195)) | (1L << (MET - 195)) | (1L << (MEA - 195)) | (1L << (MEI - 195)) | (1L << (MEIT - 195)) | (1L << (MEIA - 195)) | (1L << (MA - 195)) | (1L << (MAT - 195)) | (1L << (MAA - 195)) | (1L << (MAI - 195)) | (1L << (MAIT - 195)) | (1L << (MAIA - 195)))) != 0)) ) {
					((RelacaoContext)_localctx).opRel = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
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
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (ADI - 186)) | (1L << (ADIA - 186)) | (1L << (SUB - 186)) | (1L << (SUBA - 186)))) != 0)) {
				{
				setState(193);
				((ExprSimpContext)_localctx).opNeg = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (ADI - 186)) | (1L << (ADIA - 186)) | (1L << (SUB - 186)) | (1L << (SUBA - 186)))) != 0)) ) {
					((ExprSimpContext)_localctx).opNeg = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(196);
			termo();
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					_la = _input.LA(1);
					if ( !(((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (ADI - 186)) | (1L << (ADIA - 186)) | (1L << (SUB - 186)) | (1L << (SUBA - 186)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(198);
					termo();
					}
					} 
				}
				setState(203);
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
			setState(204);
			fator();
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					_la = _input.LA(1);
					if ( !(_la==VEZS || ((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & ((1L << (MUL - 190)) | (1L << (DIV - 190)) | (1L << (DIVA - 190)) | (1L << (MOD - 190)) | (1L << (MODA - 190)))) != 0)) ) {
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
					} 
				}
				setState(211);
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
	public static class FatorFuncaoConversaoContext extends FatorContext {
		public FuncaoConversaoContext funcaoConversao() {
			return getRuleContext(FuncaoConversaoContext.class,0);
		}
		public FatorFuncaoConversaoContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFatorFuncaoConversao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFatorFuncaoConversao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFatorFuncaoConversao(this);
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
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new FatorNaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NAOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(213);
				fator();
				}
				break;
			case 2:
				_localctx = new FatorIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(INT);
				}
				break;
			case 3:
				_localctx = new FatorDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(DEC);
				}
				break;
			case 4:
				_localctx = new FatorPiContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(PI);
				}
				break;
			case 5:
				_localctx = new FatorIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				processaId();
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(218);
					match(DOT);
					setState(219);
					_la = _input.LA(1);
					if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (CHAV - 123)) | (1L << (COMP - 123)) | (1L << (TIPO - 123)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(220);
					match(T__0);
					setState(221);
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
				setState(224);
				processaId();
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(225);
					match(T__5);
					setState(226);
					expr();
					setState(227);
					match(T__6);
					}
					}
					setState(231); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(233);
					match(DOT);
					setState(234);
					_la = _input.LA(1);
					if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (CHAV - 123)) | (1L << (COMP - 123)) | (1L << (TIPO - 123)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(235);
					match(T__0);
					setState(236);
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
				setState(239);
				processaId();
				setState(240);
				match(T__3);
				setState(241);
				expr();
				setState(242);
				match(T__4);
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(243);
					match(DOT);
					setState(244);
					_la = _input.LA(1);
					if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (CHAV - 123)) | (1L << (COMP - 123)) | (1L << (TIPO - 123)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(245);
					match(T__0);
					setState(246);
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
				setState(249);
				processaId();
				setState(252); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(250);
						match(DOT);
						setState(251);
						match(IDA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(254); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
				_localctx = new FatorCharContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(256);
				match(CHAR);
				}
				break;
			case 10:
				_localctx = new FatorStringContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(257);
				match(STRING);
				}
				break;
			case 11:
				_localctx = new FatorBoolContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(258);
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
				setState(259);
				cor();
				}
				break;
			case 13:
				_localctx = new FatorFuncaoMatematicaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(260);
				funcaoMatematica();
				}
				break;
			case 14:
				_localctx = new FatorFuncaoConversaoContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(261);
				funcaoConversao();
				}
				break;
			case 15:
				_localctx = new FatorConsultarTartarugaContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(262);
				consultarTartaruga();
				}
				break;
			case 16:
				_localctx = new FatorConsultarStringContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(263);
				consultarString();
				}
				break;
			case 17:
				_localctx = new FatorFormatarTextoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(264);
				formatarTexto();
				}
				break;
			case 18:
				_localctx = new FatorPassoContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(265);
				passo();
				}
				break;
			case 19:
				_localctx = new FatorChamadaFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(266);
				chamadaFuncao();
				}
				break;
			case 20:
				_localctx = new FatorCriarArranjoContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(267);
				criarArranjos();
				}
				break;
			case 21:
				_localctx = new FatorParentesesContext(_localctx);
				enterOuterAlt(_localctx, 21);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PAS - 69)) | (1L << (PARA - 69)) | (1L << (PARR - 69)) | (1L << (PI - 69)) | (1L << (REP - 69)) | (1L << (RET - 69)) | (1L << (SE - 69)) | (1L << (TART - 69)) | (1L << (TROC - 69)) | (1L << (USA - 69)) | (1L << (VA - 69)) | (1L << (VER - 69)) | (1L << (PRETO - 69)) | (1L << (AZUL - 69)) | (1L << (CIANO - 69)) | (1L << (CINZA - 69)) | (1L << (VERDE - 69)) | (1L << (MAGENTA - 69)) | (1L << (LARANJA - 69)) | (1L << (ROSA - 69)) | (1L << (VERMELHO - 69)) | (1L << (BRANCO - 69)) | (1L << (AMARELO - 69)) | (1L << (F_ACOS - 69)) | (1L << (F_ARRE - 69)) | (1L << (F_ASEN - 69)) | (1L << (F_ATAN - 69)) | (1L << (F_CAPO - 69)) | (1L << (F_CHAO - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (F_COSH - 133)) | (1L << (F_COSS - 133)) | (1L << (F_DCM - 133)) | (1L << (F_GRRA - 133)) | (1L << (F_HIPO - 133)) | (1L << (F_INC - 133)) | (1L << (F_LOGA - 133)) | (1L << (F_MAXI - 133)) | (1L << (F_MINI - 133)) | (1L << (F_NUMA - 133)) | (1L << (F_POTE - 133)) | (1L << (F_RAGR - 133)) | (1L << (F_RAIC - 133)) | (1L << (F_RAIQ - 133)) | (1L << (F_RAIZ - 133)) | (1L << (F_SEME - 133)) | (1L << (F_SENH - 133)) | (1L << (F_SENO - 133)) | (1L << (F_TANG - 133)) | (1L << (F_TANH - 133)) | (1L << (F_TETO - 133)) | (1L << (F_VABS - 133)) | (1L << (FC_CRI - 133)) | (1L << (FCO_INT - 133)) | (1L << (FCO_DEC - 133)) | (1L << (FCO_CHR - 133)) | (1L << (FCO_BOL - 133)) | (1L << (FCO_STR - 133)) | (1L << (FCO_COR - 133)) | (1L << (ADI - 133)) | (1L << (ADIA - 133)) | (1L << (SUB - 133)) | (1L << (SUBA - 133)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NAO - 217)) | (1L << (NAOT - 217)) | (1L << (ID - 217)) | (1L << (IDF - 217)) | (1L << (INT - 217)) | (1L << (DEC - 217)) | (1L << (CHEX - 217)) | (1L << (CHAR - 217)) | (1L << (STRING - 217)))) != 0) );
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PAS - 69)) | (1L << (PARA - 69)) | (1L << (PARR - 69)) | (1L << (PI - 69)) | (1L << (REP - 69)) | (1L << (RET - 69)) | (1L << (SE - 69)) | (1L << (TART - 69)) | (1L << (TROC - 69)) | (1L << (USA - 69)) | (1L << (VA - 69)) | (1L << (VER - 69)) | (1L << (PRETO - 69)) | (1L << (AZUL - 69)) | (1L << (CIANO - 69)) | (1L << (CINZA - 69)) | (1L << (VERDE - 69)) | (1L << (MAGENTA - 69)) | (1L << (LARANJA - 69)) | (1L << (ROSA - 69)) | (1L << (VERMELHO - 69)) | (1L << (BRANCO - 69)) | (1L << (AMARELO - 69)) | (1L << (F_ACOS - 69)) | (1L << (F_ARRE - 69)) | (1L << (F_ASEN - 69)) | (1L << (F_ATAN - 69)) | (1L << (F_CAPO - 69)) | (1L << (F_CHAO - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (F_COSH - 133)) | (1L << (F_COSS - 133)) | (1L << (F_DCM - 133)) | (1L << (F_GRRA - 133)) | (1L << (F_HIPO - 133)) | (1L << (F_INC - 133)) | (1L << (F_LOGA - 133)) | (1L << (F_MAXI - 133)) | (1L << (F_MINI - 133)) | (1L << (F_NUMA - 133)) | (1L << (F_POTE - 133)) | (1L << (F_RAGR - 133)) | (1L << (F_RAIC - 133)) | (1L << (F_RAIQ - 133)) | (1L << (F_RAIZ - 133)) | (1L << (F_SEME - 133)) | (1L << (F_SENH - 133)) | (1L << (F_SENO - 133)) | (1L << (F_TANG - 133)) | (1L << (F_TANH - 133)) | (1L << (F_TETO - 133)) | (1L << (F_VABS - 133)) | (1L << (FC_CRI - 133)) | (1L << (FCO_INT - 133)) | (1L << (FCO_DEC - 133)) | (1L << (FCO_CHR - 133)) | (1L << (FCO_BOL - 133)) | (1L << (FCO_STR - 133)) | (1L << (FCO_COR - 133)) | (1L << (ADI - 133)) | (1L << (ADIA - 133)) | (1L << (SUB - 133)) | (1L << (SUBA - 133)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NAO - 217)) | (1L << (NAOT - 217)) | (1L << (ID - 217)) | (1L << (IDF - 217)) | (1L << (INT - 217)) | (1L << (DEC - 217)) | (1L << (CHEX - 217)) | (1L << (CHAR - 217)) | (1L << (STRING - 217)))) != 0) );
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PAS - 69)) | (1L << (PARA - 69)) | (1L << (PARR - 69)) | (1L << (PI - 69)) | (1L << (REP - 69)) | (1L << (RET - 69)) | (1L << (SE - 69)) | (1L << (TART - 69)) | (1L << (TROC - 69)) | (1L << (USA - 69)) | (1L << (VA - 69)) | (1L << (VER - 69)) | (1L << (PRETO - 69)) | (1L << (AZUL - 69)) | (1L << (CIANO - 69)) | (1L << (CINZA - 69)) | (1L << (VERDE - 69)) | (1L << (MAGENTA - 69)) | (1L << (LARANJA - 69)) | (1L << (ROSA - 69)) | (1L << (VERMELHO - 69)) | (1L << (BRANCO - 69)) | (1L << (AMARELO - 69)) | (1L << (F_ACOS - 69)) | (1L << (F_ARRE - 69)) | (1L << (F_ASEN - 69)) | (1L << (F_ATAN - 69)) | (1L << (F_CAPO - 69)) | (1L << (F_CHAO - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (F_COSH - 133)) | (1L << (F_COSS - 133)) | (1L << (F_DCM - 133)) | (1L << (F_GRRA - 133)) | (1L << (F_HIPO - 133)) | (1L << (F_INC - 133)) | (1L << (F_LOGA - 133)) | (1L << (F_MAXI - 133)) | (1L << (F_MINI - 133)) | (1L << (F_NUMA - 133)) | (1L << (F_POTE - 133)) | (1L << (F_RAGR - 133)) | (1L << (F_RAIC - 133)) | (1L << (F_RAIQ - 133)) | (1L << (F_RAIZ - 133)) | (1L << (F_SEME - 133)) | (1L << (F_SENH - 133)) | (1L << (F_SENO - 133)) | (1L << (F_TANG - 133)) | (1L << (F_TANH - 133)) | (1L << (F_TETO - 133)) | (1L << (F_VABS - 133)) | (1L << (FC_CRI - 133)) | (1L << (FCO_INT - 133)) | (1L << (FCO_DEC - 133)) | (1L << (FCO_CHR - 133)) | (1L << (FCO_BOL - 133)) | (1L << (FCO_STR - 133)) | (1L << (FCO_COR - 133)) | (1L << (ADI - 133)) | (1L << (ADIA - 133)) | (1L << (SUB - 133)) | (1L << (SUBA - 133)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NAO - 217)) | (1L << (NAOT - 217)) | (1L << (ID - 217)) | (1L << (IDF - 217)) | (1L << (INT - 217)) | (1L << (DEC - 217)) | (1L << (CHEX - 217)) | (1L << (CHAR - 217)) | (1L << (STRING - 217)))) != 0) );
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PAS - 69)) | (1L << (PARA - 69)) | (1L << (PARR - 69)) | (1L << (PI - 69)) | (1L << (REP - 69)) | (1L << (RET - 69)) | (1L << (SE - 69)) | (1L << (TART - 69)) | (1L << (TROC - 69)) | (1L << (USA - 69)) | (1L << (VA - 69)) | (1L << (VER - 69)) | (1L << (PRETO - 69)) | (1L << (AZUL - 69)) | (1L << (CIANO - 69)) | (1L << (CINZA - 69)) | (1L << (VERDE - 69)) | (1L << (MAGENTA - 69)) | (1L << (LARANJA - 69)) | (1L << (ROSA - 69)) | (1L << (VERMELHO - 69)) | (1L << (BRANCO - 69)) | (1L << (AMARELO - 69)) | (1L << (F_ACOS - 69)) | (1L << (F_ARRE - 69)) | (1L << (F_ASEN - 69)) | (1L << (F_ATAN - 69)) | (1L << (F_CAPO - 69)) | (1L << (F_CHAO - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (F_COSH - 133)) | (1L << (F_COSS - 133)) | (1L << (F_DCM - 133)) | (1L << (F_GRRA - 133)) | (1L << (F_HIPO - 133)) | (1L << (F_INC - 133)) | (1L << (F_LOGA - 133)) | (1L << (F_MAXI - 133)) | (1L << (F_MINI - 133)) | (1L << (F_NUMA - 133)) | (1L << (F_POTE - 133)) | (1L << (F_RAGR - 133)) | (1L << (F_RAIC - 133)) | (1L << (F_RAIQ - 133)) | (1L << (F_RAIZ - 133)) | (1L << (F_SEME - 133)) | (1L << (F_SENH - 133)) | (1L << (F_SENO - 133)) | (1L << (F_TANG - 133)) | (1L << (F_TANH - 133)) | (1L << (F_TETO - 133)) | (1L << (F_VABS - 133)) | (1L << (FC_CRI - 133)) | (1L << (FCO_INT - 133)) | (1L << (FCO_DEC - 133)) | (1L << (FCO_CHR - 133)) | (1L << (FCO_BOL - 133)) | (1L << (FCO_STR - 133)) | (1L << (FCO_COR - 133)) | (1L << (ADI - 133)) | (1L << (ADIA - 133)) | (1L << (SUB - 133)) | (1L << (SUBA - 133)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NAO - 217)) | (1L << (NAOT - 217)) | (1L << (ID - 217)) | (1L << (IDF - 217)) | (1L << (INT - 217)) | (1L << (DEC - 217)) | (1L << (CHEX - 217)) | (1L << (CHAR - 217)) | (1L << (STRING - 217)))) != 0) );
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
			if ( !(((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (INT - 224)) | (1L << (DEC - 224)) | (1L << (CHAR - 224)) | (1L << (STRING - 224)))) != 0)) ) {
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PAS - 69)) | (1L << (PARA - 69)) | (1L << (PARR - 69)) | (1L << (PI - 69)) | (1L << (REP - 69)) | (1L << (RET - 69)) | (1L << (SE - 69)) | (1L << (TART - 69)) | (1L << (TROC - 69)) | (1L << (USA - 69)) | (1L << (VA - 69)) | (1L << (VER - 69)) | (1L << (PRETO - 69)) | (1L << (AZUL - 69)) | (1L << (CIANO - 69)) | (1L << (CINZA - 69)) | (1L << (VERDE - 69)) | (1L << (MAGENTA - 69)) | (1L << (LARANJA - 69)) | (1L << (ROSA - 69)) | (1L << (VERMELHO - 69)) | (1L << (BRANCO - 69)) | (1L << (AMARELO - 69)) | (1L << (F_ACOS - 69)) | (1L << (F_ARRE - 69)) | (1L << (F_ASEN - 69)) | (1L << (F_ATAN - 69)) | (1L << (F_CAPO - 69)) | (1L << (F_CHAO - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (F_COSH - 133)) | (1L << (F_COSS - 133)) | (1L << (F_DCM - 133)) | (1L << (F_GRRA - 133)) | (1L << (F_HIPO - 133)) | (1L << (F_INC - 133)) | (1L << (F_LOGA - 133)) | (1L << (F_MAXI - 133)) | (1L << (F_MINI - 133)) | (1L << (F_NUMA - 133)) | (1L << (F_POTE - 133)) | (1L << (F_RAGR - 133)) | (1L << (F_RAIC - 133)) | (1L << (F_RAIQ - 133)) | (1L << (F_RAIZ - 133)) | (1L << (F_SEME - 133)) | (1L << (F_SENH - 133)) | (1L << (F_SENO - 133)) | (1L << (F_TANG - 133)) | (1L << (F_TANH - 133)) | (1L << (F_TETO - 133)) | (1L << (F_VABS - 133)) | (1L << (FC_CRI - 133)) | (1L << (FCO_INT - 133)) | (1L << (FCO_DEC - 133)) | (1L << (FCO_CHR - 133)) | (1L << (FCO_BOL - 133)) | (1L << (FCO_STR - 133)) | (1L << (FCO_COR - 133)) | (1L << (ADI - 133)) | (1L << (ADIA - 133)) | (1L << (SUB - 133)) | (1L << (SUBA - 133)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NAO - 217)) | (1L << (NAOT - 217)) | (1L << (ID - 217)) | (1L << (IDF - 217)) | (1L << (INT - 217)) | (1L << (DEC - 217)) | (1L << (CHEX - 217)) | (1L << (CHAR - 217)) | (1L << (STRING - 217)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PAS - 69)) | (1L << (PARA - 69)) | (1L << (PARR - 69)) | (1L << (PI - 69)) | (1L << (REP - 69)) | (1L << (RET - 69)) | (1L << (SE - 69)) | (1L << (TART - 69)) | (1L << (TROC - 69)) | (1L << (USA - 69)) | (1L << (VA - 69)) | (1L << (VER - 69)) | (1L << (PRETO - 69)) | (1L << (AZUL - 69)) | (1L << (CIANO - 69)) | (1L << (CINZA - 69)) | (1L << (VERDE - 69)) | (1L << (MAGENTA - 69)) | (1L << (LARANJA - 69)) | (1L << (ROSA - 69)) | (1L << (VERMELHO - 69)) | (1L << (BRANCO - 69)) | (1L << (AMARELO - 69)) | (1L << (F_ACOS - 69)) | (1L << (F_ARRE - 69)) | (1L << (F_ASEN - 69)) | (1L << (F_ATAN - 69)) | (1L << (F_CAPO - 69)) | (1L << (F_CHAO - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (F_COSH - 133)) | (1L << (F_COSS - 133)) | (1L << (F_DCM - 133)) | (1L << (F_GRRA - 133)) | (1L << (F_HIPO - 133)) | (1L << (F_INC - 133)) | (1L << (F_LOGA - 133)) | (1L << (F_MAXI - 133)) | (1L << (F_MINI - 133)) | (1L << (F_NUMA - 133)) | (1L << (F_POTE - 133)) | (1L << (F_RAGR - 133)) | (1L << (F_RAIC - 133)) | (1L << (F_RAIQ - 133)) | (1L << (F_RAIZ - 133)) | (1L << (F_SEME - 133)) | (1L << (F_SENH - 133)) | (1L << (F_SENO - 133)) | (1L << (F_TANG - 133)) | (1L << (F_TANH - 133)) | (1L << (F_TETO - 133)) | (1L << (F_VABS - 133)) | (1L << (FC_CRI - 133)) | (1L << (FCO_INT - 133)) | (1L << (FCO_DEC - 133)) | (1L << (FCO_CHR - 133)) | (1L << (FCO_BOL - 133)) | (1L << (FCO_STR - 133)) | (1L << (FCO_COR - 133)) | (1L << (ADI - 133)) | (1L << (ADIA - 133)) | (1L << (SUB - 133)) | (1L << (SUBA - 133)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NAO - 217)) | (1L << (NAOT - 217)) | (1L << (ID - 217)) | (1L << (IDF - 217)) | (1L << (INT - 217)) | (1L << (DEC - 217)) | (1L << (CHEX - 217)) | (1L << (CHAR - 217)) | (1L << (STRING - 217)))) != 0) );
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PAS - 69)) | (1L << (PARA - 69)) | (1L << (PARR - 69)) | (1L << (PI - 69)) | (1L << (REP - 69)) | (1L << (RET - 69)) | (1L << (SE - 69)) | (1L << (TART - 69)) | (1L << (TROC - 69)) | (1L << (USA - 69)) | (1L << (VA - 69)) | (1L << (VER - 69)) | (1L << (PRETO - 69)) | (1L << (AZUL - 69)) | (1L << (CIANO - 69)) | (1L << (CINZA - 69)) | (1L << (VERDE - 69)) | (1L << (MAGENTA - 69)) | (1L << (LARANJA - 69)) | (1L << (ROSA - 69)) | (1L << (VERMELHO - 69)) | (1L << (BRANCO - 69)) | (1L << (AMARELO - 69)) | (1L << (F_ACOS - 69)) | (1L << (F_ARRE - 69)) | (1L << (F_ASEN - 69)) | (1L << (F_ATAN - 69)) | (1L << (F_CAPO - 69)) | (1L << (F_CHAO - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (F_COSH - 133)) | (1L << (F_COSS - 133)) | (1L << (F_DCM - 133)) | (1L << (F_GRRA - 133)) | (1L << (F_HIPO - 133)) | (1L << (F_INC - 133)) | (1L << (F_LOGA - 133)) | (1L << (F_MAXI - 133)) | (1L << (F_MINI - 133)) | (1L << (F_NUMA - 133)) | (1L << (F_POTE - 133)) | (1L << (F_RAGR - 133)) | (1L << (F_RAIC - 133)) | (1L << (F_RAIQ - 133)) | (1L << (F_RAIZ - 133)) | (1L << (F_SEME - 133)) | (1L << (F_SENH - 133)) | (1L << (F_SENO - 133)) | (1L << (F_TANG - 133)) | (1L << (F_TANH - 133)) | (1L << (F_TETO - 133)) | (1L << (F_VABS - 133)) | (1L << (FC_CRI - 133)) | (1L << (FCO_INT - 133)) | (1L << (FCO_DEC - 133)) | (1L << (FCO_CHR - 133)) | (1L << (FCO_BOL - 133)) | (1L << (FCO_STR - 133)) | (1L << (FCO_COR - 133)) | (1L << (ADI - 133)) | (1L << (ADIA - 133)) | (1L << (SUB - 133)) | (1L << (SUBA - 133)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NAO - 217)) | (1L << (NAOT - 217)) | (1L << (ID - 217)) | (1L << (IDF - 217)) | (1L << (INT - 217)) | (1L << (DEC - 217)) | (1L << (CHEX - 217)) | (1L << (CHAR - 217)) | (1L << (STRING - 217)))) != 0) );
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABA) | (1L << CONT) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << DES) | (1L << DESE) | (1L << ENG) | (1L << ENQ) | (1L << ESC) | (1L << FAL) | (1L << FORM) | (1L << GIR) | (1L << LER) | (1L << LEV) | (1L << LIM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PAS - 69)) | (1L << (PARA - 69)) | (1L << (PARR - 69)) | (1L << (PI - 69)) | (1L << (REP - 69)) | (1L << (RET - 69)) | (1L << (SE - 69)) | (1L << (TART - 69)) | (1L << (TROC - 69)) | (1L << (USA - 69)) | (1L << (VA - 69)) | (1L << (VER - 69)) | (1L << (PRETO - 69)) | (1L << (AZUL - 69)) | (1L << (CIANO - 69)) | (1L << (CINZA - 69)) | (1L << (VERDE - 69)) | (1L << (MAGENTA - 69)) | (1L << (LARANJA - 69)) | (1L << (ROSA - 69)) | (1L << (VERMELHO - 69)) | (1L << (BRANCO - 69)) | (1L << (AMARELO - 69)) | (1L << (F_ACOS - 69)) | (1L << (F_ARRE - 69)) | (1L << (F_ASEN - 69)) | (1L << (F_ATAN - 69)) | (1L << (F_CAPO - 69)) | (1L << (F_CHAO - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (F_COSH - 133)) | (1L << (F_COSS - 133)) | (1L << (F_DCM - 133)) | (1L << (F_GRRA - 133)) | (1L << (F_HIPO - 133)) | (1L << (F_INC - 133)) | (1L << (F_LOGA - 133)) | (1L << (F_MAXI - 133)) | (1L << (F_MINI - 133)) | (1L << (F_NUMA - 133)) | (1L << (F_POTE - 133)) | (1L << (F_RAGR - 133)) | (1L << (F_RAIC - 133)) | (1L << (F_RAIQ - 133)) | (1L << (F_RAIZ - 133)) | (1L << (F_SEME - 133)) | (1L << (F_SENH - 133)) | (1L << (F_SENO - 133)) | (1L << (F_TANG - 133)) | (1L << (F_TANH - 133)) | (1L << (F_TETO - 133)) | (1L << (F_VABS - 133)) | (1L << (FC_CRI - 133)) | (1L << (FCO_INT - 133)) | (1L << (FCO_DEC - 133)) | (1L << (FCO_CHR - 133)) | (1L << (FCO_BOL - 133)) | (1L << (FCO_STR - 133)) | (1L << (FCO_COR - 133)) | (1L << (ADI - 133)) | (1L << (ADIA - 133)) | (1L << (SUB - 133)) | (1L << (SUBA - 133)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NAO - 217)) | (1L << (NAOT - 217)) | (1L << (ID - 217)) | (1L << (IDF - 217)) | (1L << (INT - 217)) | (1L << (DEC - 217)) | (1L << (CHEX - 217)) | (1L << (CHAR - 217)) | (1L << (STRING - 217)))) != 0) );
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
		public CorContext cor() {
			return getRuleContext(CorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << FAL) | (1L << FORM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PAS - 69)) | (1L << (PI - 69)) | (1L << (TART - 69)) | (1L << (VER - 69)) | (1L << (PRETO - 69)) | (1L << (AZUL - 69)) | (1L << (CIANO - 69)) | (1L << (CINZA - 69)) | (1L << (VERDE - 69)) | (1L << (MAGENTA - 69)) | (1L << (LARANJA - 69)) | (1L << (ROSA - 69)) | (1L << (VERMELHO - 69)) | (1L << (BRANCO - 69)) | (1L << (AMARELO - 69)) | (1L << (ESCURO - 69)) | (1L << (CLARO - 69)) | (1L << (F_ACOS - 69)) | (1L << (F_ARRE - 69)) | (1L << (F_ASEN - 69)) | (1L << (F_ATAN - 69)) | (1L << (F_CAPO - 69)) | (1L << (F_CHAO - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (F_COSH - 133)) | (1L << (F_COSS - 133)) | (1L << (F_DCM - 133)) | (1L << (F_GRRA - 133)) | (1L << (F_HIPO - 133)) | (1L << (F_INC - 133)) | (1L << (F_LOGA - 133)) | (1L << (F_MAXI - 133)) | (1L << (F_MINI - 133)) | (1L << (F_NUMA - 133)) | (1L << (F_POTE - 133)) | (1L << (F_RAGR - 133)) | (1L << (F_RAIC - 133)) | (1L << (F_RAIQ - 133)) | (1L << (F_RAIZ - 133)) | (1L << (F_SEME - 133)) | (1L << (F_SENH - 133)) | (1L << (F_SENO - 133)) | (1L << (F_TANG - 133)) | (1L << (F_TANH - 133)) | (1L << (F_TETO - 133)) | (1L << (F_VABS - 133)) | (1L << (FC_CRI - 133)) | (1L << (FCO_INT - 133)) | (1L << (FCO_DEC - 133)) | (1L << (FCO_CHR - 133)) | (1L << (FCO_BOL - 133)) | (1L << (FCO_STR - 133)) | (1L << (FCO_COR - 133)) | (1L << (ADI - 133)) | (1L << (ADIA - 133)) | (1L << (SUB - 133)) | (1L << (SUBA - 133)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NAO - 217)) | (1L << (NAOT - 217)) | (1L << (ID - 217)) | (1L << (IDF - 217)) | (1L << (INT - 217)) | (1L << (DEC - 217)) | (1L << (CHEX - 217)) | (1L << (CHAR - 217)) | (1L << (STRING - 217)))) != 0)) {
				{
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << FAL) | (1L << FORM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PAS - 69)) | (1L << (PI - 69)) | (1L << (TART - 69)) | (1L << (VER - 69)) | (1L << (PRETO - 69)) | (1L << (AZUL - 69)) | (1L << (CIANO - 69)) | (1L << (CINZA - 69)) | (1L << (VERDE - 69)) | (1L << (MAGENTA - 69)) | (1L << (LARANJA - 69)) | (1L << (ROSA - 69)) | (1L << (VERMELHO - 69)) | (1L << (BRANCO - 69)) | (1L << (AMARELO - 69)) | (1L << (F_ACOS - 69)) | (1L << (F_ARRE - 69)) | (1L << (F_ASEN - 69)) | (1L << (F_ATAN - 69)) | (1L << (F_CAPO - 69)) | (1L << (F_CHAO - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (F_COSH - 133)) | (1L << (F_COSS - 133)) | (1L << (F_DCM - 133)) | (1L << (F_GRRA - 133)) | (1L << (F_HIPO - 133)) | (1L << (F_INC - 133)) | (1L << (F_LOGA - 133)) | (1L << (F_MAXI - 133)) | (1L << (F_MINI - 133)) | (1L << (F_NUMA - 133)) | (1L << (F_POTE - 133)) | (1L << (F_RAGR - 133)) | (1L << (F_RAIC - 133)) | (1L << (F_RAIQ - 133)) | (1L << (F_RAIZ - 133)) | (1L << (F_SEME - 133)) | (1L << (F_SENH - 133)) | (1L << (F_SENO - 133)) | (1L << (F_TANG - 133)) | (1L << (F_TANH - 133)) | (1L << (F_TETO - 133)) | (1L << (F_VABS - 133)) | (1L << (FC_CRI - 133)) | (1L << (FCO_INT - 133)) | (1L << (FCO_DEC - 133)) | (1L << (FCO_CHR - 133)) | (1L << (FCO_BOL - 133)) | (1L << (FCO_STR - 133)) | (1L << (FCO_COR - 133)) | (1L << (ADI - 133)) | (1L << (ADIA - 133)) | (1L << (SUB - 133)) | (1L << (SUBA - 133)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NAO - 217)) | (1L << (NAOT - 217)) | (1L << (ID - 217)) | (1L << (IDF - 217)) | (1L << (INT - 217)) | (1L << (DEC - 217)) | (1L << (CHEX - 217)) | (1L << (CHAR - 217)) | (1L << (STRING - 217)))) != 0)) {
					{
					setState(456);
					expr();
					setState(457);
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

				setState(461);
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
		public CorExtensoContext corExtenso() {
			return getRuleContext(CorExtensoContext.class,0);
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
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHEX:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(CHEX);
				}
				break;
			case FC_CRI:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				criarCor();
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
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				corExtenso();
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

	public static class CorExtensoContext extends ParserRuleContext {
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
		public CorExtensoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corExtenso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterCorExtenso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitCorExtenso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitCorExtenso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorExtensoContext corExtenso() throws RecognitionException {
		CorExtensoContext _localctx = new CorExtensoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_corExtenso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (PRETO - 99)) | (1L << (AZUL - 99)) | (1L << (CIANO - 99)) | (1L << (CINZA - 99)) | (1L << (VERDE - 99)) | (1L << (MAGENTA - 99)) | (1L << (LARANJA - 99)) | (1L << (ROSA - 99)) | (1L << (VERMELHO - 99)) | (1L << (BRANCO - 99)) | (1L << (AMARELO - 99)))) != 0)) ) {
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

	public static class CriarCorContext extends ParserRuleContext {
		public TerminalNode FC_CRI() { return getToken(AuroraLogoParser.FC_CRI, 0); }
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
		enterRule(_localctx, 56, RULE_criarCor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(FC_CRI);
			setState(472);
			match(T__0);
			setState(473);
			expr();
			setState(474);
			match(T__1);
			setState(475);
			expr();
			setState(476);
			match(T__1);
			setState(477);
			expr();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(478);
				match(T__1);
				setState(479);
				expr();
				}
			}

			setState(482);
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
		enterRule(_localctx, 58, RULE_girar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(GIR);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(485);
				match(EM);
				setState(486);
				expr();
				setState(487);
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
		enterRule(_localctx, 60, RULE_engrossar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(ENG);
			setState(492);
			match(PINC);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(493);
				match(EM);
				setState(494);
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
		enterRule(_localctx, 62, RULE_desengrossar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(DES);
			setState(498);
			match(PINC);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EM) {
				{
				setState(499);
				match(EM);
				setState(500);
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
		enterRule(_localctx, 64, RULE_trocarGrossura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(TROC);
			setState(504);
			match(GROS);
			setState(505);
			match(DO);
			setState(506);
			match(PINC);
			setState(507);
			match(PARA);
			setState(508);
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

	public static class TrocarEstiloContext extends ParserRuleContext {
		public TerminalNode TROC() { return getToken(AuroraLogoParser.TROC, 0); }
		public TerminalNode EST() { return getToken(AuroraLogoParser.EST, 0); }
		public TerminalNode DO() { return getToken(AuroraLogoParser.DO, 0); }
		public TerminalNode PINC() { return getToken(AuroraLogoParser.PINC, 0); }
		public TerminalNode PARA() { return getToken(AuroraLogoParser.PARA, 0); }
		public TerminalNode CONU() { return getToken(AuroraLogoParser.CONU, 0); }
		public TerminalNode TRAC() { return getToken(AuroraLogoParser.TRAC, 0); }
		public TerminalNode PONT() { return getToken(AuroraLogoParser.PONT, 0); }
		public TrocarEstiloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trocarEstilo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterTrocarEstilo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitTrocarEstilo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitTrocarEstilo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrocarEstiloContext trocarEstilo() throws RecognitionException {
		TrocarEstiloContext _localctx = new TrocarEstiloContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_trocarEstilo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(TROC);
			setState(511);
			match(EST);
			setState(512);
			match(DO);
			setState(513);
			match(PINC);
			setState(514);
			match(PARA);
			setState(515);
			_la = _input.LA(1);
			if ( !(_la==CONU || _la==PONT || _la==TRAC) ) {
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
		enterRule(_localctx, 68, RULE_escrever);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(ESC);
			setState(518);
			expr();
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NA:
				{
				setState(519);
				match(NA);
				setState(520);
				match(SAI);
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUL) {
					{
					setState(521);
					match(PUL);
					setState(522);
					match(LIN);
					}
				}

				}
				break;
			case NO:
				{
				setState(525);
				match(NO);
				setState(526);
				match(DIAG);
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUL) {
					{
					setState(527);
					match(PUL);
					setState(528);
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
		enterRule(_localctx, 70, RULE_ler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(LER);
			setState(534);
			processaId();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USA) {
				{
				setState(535);
				match(USA);
				setState(536);
				match(A);
				setState(537);
				match(MEN);
				setState(538);
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
		enterRule(_localctx, 72, RULE_atribuir);
		int _la;
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new AtribuirPadraoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				processaId();
				setState(542);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(543);
					expr();
					}
					break;
				case 2:
					{
					setState(544);
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
				setState(547);
				processaId();
				setState(552); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(548);
					match(T__5);
					setState(549);
					exprIndice();
					setState(550);
					match(T__6);
					}
					}
					setState(554); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 );
				setState(556);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(557);
					expr();
					}
					break;
				case 2:
					{
					setState(558);
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
				setState(561);
				processaId();
				{
				setState(562);
				match(T__3);
				setState(563);
				exprIndice();
				setState(564);
				match(T__4);
				}
				setState(566);
				_la = _input.LA(1);
				if ( !(_la==ATR || _la==ATRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(567);
					expr();
					}
					break;
				case 2:
					{
					setState(568);
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
				setState(571);
				processaId();
				setState(572);
				_la = _input.LA(1);
				if ( !(_la==AC_A || _la==AT_A) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(573);
				expr();
				}
				break;
			case 5:
				_localctx = new AtribuirSubtracaoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(575);
				processaId();
				setState(576);
				_la = _input.LA(1);
				if ( !(_la==AC_S || _la==AT_S) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(577);
				expr();
				}
				break;
			case 6:
				_localctx = new AtribuirMultiplicacaoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(579);
				processaId();
				setState(580);
				_la = _input.LA(1);
				if ( !(_la==AC_M || _la==AT_M) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(581);
				expr();
				}
				break;
			case 7:
				_localctx = new AtribuirDivisaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(583);
				processaId();
				setState(584);
				_la = _input.LA(1);
				if ( !(_la==AC_D || _la==AT_D) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(585);
				expr();
				}
				break;
			case 8:
				_localctx = new AtribuirRestoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(587);
				processaId();
				setState(588);
				_la = _input.LA(1);
				if ( !(_la==AC_R || _la==AT_R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(589);
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
		enterRule(_localctx, 74, RULE_exprIndice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
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
		enterRule(_localctx, 76, RULE_abaixar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(ABA);
			setState(596);
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
		enterRule(_localctx, 78, RULE_levantar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(LEV);
			setState(599);
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
		enterRule(_localctx, 80, RULE_limpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
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
		enterRule(_localctx, 82, RULE_funcaoMatematica);
		try {
			setState(772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F_VABS:
				_localctx = new FuncaoAbsolutoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				match(F_VABS);
				setState(604);
				match(T__0);
				setState(605);
				expr();
				setState(606);
				match(T__2);
				}
				break;
			case F_RAIQ:
				_localctx = new FuncaoRaizQuadradaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				match(F_RAIQ);
				setState(609);
				match(T__0);
				setState(610);
				expr();
				setState(611);
				match(T__2);
				}
				break;
			case F_RAIC:
				_localctx = new FuncaoRaizCubicaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				match(F_RAIC);
				setState(614);
				match(T__0);
				setState(615);
				expr();
				setState(616);
				match(T__2);
				}
				break;
			case F_RAIZ:
				_localctx = new FuncaoRaizContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
				match(F_RAIZ);
				setState(619);
				match(T__0);
				setState(620);
				expr();
				setState(621);
				match(T__1);
				setState(622);
				expr();
				setState(623);
				match(T__2);
				}
				break;
			case F_POTE:
				_localctx = new FuncaoPotenciaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(625);
				match(F_POTE);
				setState(626);
				match(T__0);
				setState(627);
				expr();
				setState(628);
				match(T__1);
				setState(629);
				expr();
				setState(630);
				match(T__2);
				}
				break;
			case F_HIPO:
				_localctx = new FuncaoHipotenusaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(632);
				match(F_HIPO);
				setState(633);
				match(T__0);
				setState(634);
				expr();
				setState(635);
				match(T__1);
				setState(636);
				expr();
				setState(637);
				match(T__2);
				}
				break;
			case F_CHAO:
				_localctx = new FuncaoChaoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(639);
				match(F_CHAO);
				setState(640);
				match(T__0);
				setState(641);
				expr();
				setState(642);
				match(T__2);
				}
				break;
			case F_TETO:
				_localctx = new FuncaoTetoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(644);
				match(F_TETO);
				setState(645);
				match(T__0);
				setState(646);
				expr();
				setState(647);
				match(T__2);
				}
				break;
			case F_ARRE:
				_localctx = new FuncaoArredondarContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(649);
				match(F_ARRE);
				setState(650);
				match(T__0);
				setState(656);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(651);
					expr();
					}
					break;
				case 2:
					{
					setState(652);
					expr();
					setState(653);
					match(T__1);
					setState(654);
					expr();
					}
					break;
				}
				setState(658);
				match(T__2);
				}
				break;
			case F_MINI:
				_localctx = new FuncaoMinimoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(660);
				match(F_MINI);
				setState(661);
				match(T__0);
				setState(662);
				expr();
				setState(663);
				match(T__1);
				setState(664);
				expr();
				setState(665);
				match(T__2);
				}
				break;
			case F_MAXI:
				_localctx = new FuncaoMaximoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(667);
				match(F_MAXI);
				setState(668);
				match(T__0);
				setState(669);
				expr();
				setState(670);
				match(T__1);
				setState(671);
				expr();
				setState(672);
				match(T__2);
				}
				break;
			case F_NUMA:
				_localctx = new FuncaoNumeroAleatorioContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(674);
				match(F_NUMA);
				setState(675);
				match(T__0);
				setState(681);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(676);
					expr();
					}
					break;
				case 2:
					{
					setState(677);
					expr();
					setState(678);
					match(T__1);
					setState(679);
					expr();
					}
					break;
				}
				setState(683);
				match(T__2);
				}
				break;
			case F_SEME:
				_localctx = new FuncaoDefinirSementeAleatoriaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(684);
				match(F_SEME);
				setState(685);
				match(T__0);
				setState(686);
				expr();
				setState(687);
				match(T__2);
				}
				break;
			case F_SENO:
				_localctx = new FuncaoSenoContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(689);
				match(F_SENO);
				setState(690);
				match(T__0);
				setState(691);
				expr();
				setState(692);
				match(T__2);
				}
				break;
			case F_COSS:
				_localctx = new FuncaoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(694);
				match(F_COSS);
				setState(695);
				match(T__0);
				setState(696);
				expr();
				setState(697);
				match(T__2);
				}
				break;
			case F_TANG:
				_localctx = new FuncaoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(699);
				match(F_TANG);
				setState(700);
				match(T__0);
				setState(701);
				expr();
				setState(702);
				match(T__2);
				}
				break;
			case F_ASEN:
				_localctx = new FuncaoArcoSenoContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(704);
				match(F_ASEN);
				setState(705);
				match(T__0);
				setState(706);
				expr();
				setState(707);
				match(T__2);
				}
				break;
			case F_ACOS:
				_localctx = new FuncaoArcoCossenoContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(709);
				match(F_ACOS);
				setState(710);
				match(T__0);
				setState(711);
				expr();
				setState(712);
				match(T__2);
				}
				break;
			case F_ATAN:
				_localctx = new FuncaoArcoTangenteContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(714);
				match(F_ATAN);
				setState(715);
				match(T__0);
				setState(716);
				expr();
				setState(717);
				match(T__2);
				}
				break;
			case F_CAPO:
				_localctx = new FuncaoCartesianoParaPolarContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(719);
				match(F_CAPO);
				setState(720);
				match(T__0);
				setState(721);
				expr();
				setState(722);
				match(T__1);
				setState(723);
				expr();
				setState(724);
				match(T__2);
				}
				break;
			case F_SENH:
				_localctx = new FuncaoSenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(726);
				match(F_SENH);
				setState(727);
				match(T__0);
				setState(728);
				expr();
				setState(729);
				match(T__2);
				}
				break;
			case F_COSH:
				_localctx = new FuncaoCossenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(731);
				match(F_COSH);
				setState(732);
				match(T__0);
				setState(733);
				expr();
				setState(734);
				match(T__2);
				}
				break;
			case F_TANH:
				_localctx = new FuncaoTangenteHiperbolicaContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(736);
				match(F_TANH);
				setState(737);
				match(T__0);
				setState(738);
				expr();
				setState(739);
				match(T__2);
				}
				break;
			case F_LOGA:
				_localctx = new FuncaoLogaritmoContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(741);
				match(F_LOGA);
				setState(742);
				match(T__0);
				setState(748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(743);
					expr();
					}
					break;
				case 2:
					{
					setState(744);
					expr();
					setState(745);
					match(T__1);
					setState(746);
					expr();
					}
					break;
				}
				setState(750);
				match(T__2);
				}
				break;
			case F_GRRA:
				_localctx = new FuncaoGrausParaRadianosContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(752);
				match(F_GRRA);
				setState(753);
				match(T__0);
				setState(754);
				expr();
				setState(755);
				match(T__2);
				}
				break;
			case F_RAGR:
				_localctx = new FuncaoRadianosParaGrausContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(757);
				match(F_RAGR);
				setState(758);
				match(T__0);
				setState(759);
				expr();
				setState(760);
				match(T__2);
				}
				break;
			case F_INC:
				_localctx = new FuncaoIncrementarContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(762);
				match(F_INC);
				setState(763);
				match(T__0);
				setState(764);
				processaId();
				setState(765);
				match(T__2);
				}
				break;
			case F_DCM:
				_localctx = new FuncaoDecrementarContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(767);
				match(F_DCM);
				setState(768);
				match(T__0);
				setState(769);
				processaId();
				setState(770);
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
		enterRule(_localctx, 84, RULE_instrucaoGeometrica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(DESE);
			setState(775);
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
		enterRule(_localctx, 86, RULE_funcaoGeometrica);
		int _la;
		try {
			setState(985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FG_SEG:
				_localctx = new FuncaoDesenharSegmentoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				match(FG_SEG);
				setState(778);
				match(T__0);
				setState(779);
				expr();
				setState(780);
				match(T__1);
				setState(781);
				expr();
				setState(782);
				match(T__1);
				setState(783);
				expr();
				setState(784);
				match(T__1);
				setState(785);
				expr();
				setState(786);
				match(T__2);
				}
				break;
			case FG_QUA:
				_localctx = new FuncaoDesenharQuadradoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
				match(FG_QUA);
				setState(789);
				match(T__0);
				setState(790);
				expr();
				setState(791);
				match(T__1);
				setState(792);
				expr();
				setState(793);
				match(T__1);
				setState(794);
				expr();
				setState(795);
				match(T__2);
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(796);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_RET:
				_localctx = new FuncaoDesenharRetanguloContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(799);
				match(FG_RET);
				setState(800);
				match(T__0);
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
				match(T__1);
				setState(807);
				expr();
				setState(808);
				match(T__2);
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(809);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_REA:
				_localctx = new FuncaoDesenharRetanguloArredondadoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(812);
				match(FG_REA);
				setState(813);
				match(T__0);
				setState(814);
				expr();
				setState(815);
				match(T__1);
				setState(816);
				expr();
				setState(817);
				match(T__1);
				setState(818);
				expr();
				setState(819);
				match(T__1);
				setState(820);
				expr();
				setState(821);
				match(T__1);
				setState(822);
				expr();
				setState(823);
				match(T__2);
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(824);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_CIC:
				_localctx = new FuncaoDesenharCirculoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(827);
				match(FG_CIC);
				setState(828);
				match(T__0);
				setState(829);
				expr();
				setState(830);
				match(T__1);
				setState(831);
				expr();
				setState(832);
				match(T__1);
				setState(833);
				expr();
				setState(834);
				match(T__2);
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(835);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_ELI:
				_localctx = new FuncaoDesenharElipseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(838);
				match(FG_ELI);
				setState(839);
				match(T__0);
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
				setState(847);
				match(T__2);
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(848);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_ARC:
				_localctx = new FuncaoDesenharArcoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(851);
				match(FG_ARC);
				setState(852);
				match(T__0);
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
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(864);
					match(T__1);
					setState(865);
					_la = _input.LA(1);
					if ( !(_la==ABE || _la==COD || _la==PIZ) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(868);
				match(T__2);
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(869);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_POR:
				_localctx = new FuncaoDesenharPoligonoRegularContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(872);
				match(FG_POR);
				setState(873);
				match(T__0);
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
				match(T__1);
				setState(882);
				expr();
				setState(883);
				match(T__2);
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(884);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_EST:
				_localctx = new FuncaoDesenharEstrelaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(887);
				match(FG_EST);
				setState(888);
				match(T__0);
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
				setState(898);
				match(T__2);
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(899);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_POL:
				_localctx = new FuncaoDesenharPoligonoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(902);
				match(FG_POL);
				setState(903);
				match(T__0);
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
				match(T__1);
				setState(914);
				expr();
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(915);
					match(T__1);
					setState(916);
					expr();
					setState(917);
					match(T__1);
					setState(918);
					expr();
					}
					}
					setState(924);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(925);
				match(T__2);
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEM) {
					{
					setState(926);
					opcaoFuncGeom();
					}
				}

				}
				break;
			case FG_CQD:
				_localctx = new FuncaoDesenharCurvaQuadraticaContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(929);
				match(FG_CQD);
				setState(930);
				match(T__0);
				setState(931);
				expr();
				setState(932);
				match(T__1);
				setState(933);
				expr();
				setState(934);
				match(T__1);
				setState(935);
				expr();
				setState(936);
				match(T__1);
				setState(937);
				expr();
				setState(938);
				match(T__1);
				setState(939);
				expr();
				setState(940);
				match(T__1);
				setState(941);
				expr();
				setState(942);
				match(T__2);
				setState(953);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEM:
					{
					{
					setState(943);
					opcaoFuncGeom();
					setState(946);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(944);
						match(T__1);
						setState(945);
						opcaoPontosControle();
						}
					}

					}
					}
					break;
				case MOS:
					{
					{
					setState(948);
					opcaoPontosControle();
					setState(951);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(949);
						match(T__1);
						setState(950);
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
				setState(955);
				match(FG_CCU);
				setState(956);
				match(T__0);
				setState(957);
				expr();
				setState(958);
				match(T__1);
				setState(959);
				expr();
				setState(960);
				match(T__1);
				setState(961);
				expr();
				setState(962);
				match(T__1);
				setState(963);
				expr();
				setState(964);
				match(T__1);
				setState(965);
				expr();
				setState(966);
				match(T__1);
				setState(967);
				expr();
				setState(968);
				match(T__1);
				setState(969);
				expr();
				setState(970);
				match(T__1);
				setState(971);
				expr();
				setState(972);
				match(T__2);
				setState(983);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEM:
					{
					{
					setState(973);
					opcaoFuncGeom();
					setState(976);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(974);
						match(T__1);
						setState(975);
						opcaoPontosControle();
						}
					}

					}
					}
					break;
				case MOS:
					{
					{
					setState(978);
					opcaoPontosControle();
					setState(981);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(979);
						match(T__1);
						setState(980);
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
		enterRule(_localctx, 88, RULE_opcaoFuncGeom);
		int _la;
		try {
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				match(SEM);
				setState(988);
				match(PREE);
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(989);
					match(E);
					setState(990);
					match(SEM);
					setState(991);
					match(CON);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				match(SEM);
				setState(995);
				match(CON);
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(996);
					match(E);
					setState(997);
					match(SEM);
					setState(998);
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
		enterRule(_localctx, 90, RULE_opcaoPontosControle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(MOS);
			setState(1004);
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
		enterRule(_localctx, 92, RULE_desenharCaminho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(DESE);
			setState(1007);
			match(CAM);
			setState(1018);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEM:
				{
				{
				setState(1008);
				opcaoFuncGeom();
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1009);
					match(T__1);
					setState(1010);
					opcaoPontosControle();
					}
				}

				}
				}
				break;
			case MOS:
				{
				{
				setState(1013);
				opcaoPontosControle();
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1014);
					match(T__1);
					setState(1015);
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
			setState(1020);
			match(T__3);
			setState(1024); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1021);
				instCaminho();
				setState(1022);
				match(DOT);
				}
				}
				setState(1026); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (CUR - 27)) | (1L << (FEC - 27)) | (1L << (LIN - 27)) | (1L << (MOV - 27)))) != 0) );
			setState(1028);
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
		enterRule(_localctx, 94, RULE_instCaminho);
		try {
			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				_localctx = new InstrucaoCaminhoMoverAteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				match(MOV);
				setState(1031);
				match(ATE);
				setState(1032);
				expr();
				setState(1033);
				match(T__1);
				setState(1034);
				expr();
				}
				break;
			case 2:
				_localctx = new InstrucaoCaminhoLinhaAteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				match(LIN);
				setState(1037);
				match(ATE);
				setState(1038);
				expr();
				setState(1039);
				match(T__1);
				setState(1040);
				expr();
				}
				break;
			case 3:
				_localctx = new InstrucaoCaminhoCurvaQuadraticaAteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1042);
				match(CUR);
				setState(1043);
				match(QUAD);
				setState(1044);
				match(ATE);
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
				setState(1050);
				match(T__1);
				setState(1051);
				expr();
				}
				break;
			case 4:
				_localctx = new InstrucaoCaminhoCurvaCubicaAteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1053);
				match(CUR);
				setState(1054);
				match(CUBI);
				setState(1055);
				match(ATE);
				setState(1056);
				expr();
				setState(1057);
				match(T__1);
				setState(1058);
				expr();
				setState(1059);
				match(T__1);
				setState(1060);
				expr();
				setState(1061);
				match(T__1);
				setState(1062);
				expr();
				setState(1063);
				match(T__1);
				setState(1064);
				expr();
				setState(1065);
				match(T__1);
				setState(1066);
				expr();
				}
				break;
			case 5:
				_localctx = new InstrucaoCaminhoFecharCaminhoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1068);
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
		public TerminalNode PES() { return getToken(AuroraLogoParser.PES, 0); }
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
		enterRule(_localctx, 96, RULE_consultarTartaruga);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			match(TART);
			setState(1072);
			match(DOT);
			setState(1073);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (PA - 112)) | (1L << (PCF - 112)) | (1L << (PCP - 112)) | (1L << (PCPP - 112)) | (1L << (PCPR - 112)) | (1L << (PD - 112)) | (1L << (PES - 112)) | (1L << (PG - 112)) | (1L << (PX - 112)) | (1L << (PY - 112)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1074);
			match(T__0);
			setState(1075);
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
		public TerminalNode TIPO() { return getToken(AuroraLogoParser.TIPO, 0); }
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
		enterRule(_localctx, 98, RULE_consultarString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			processaId();
			setState(1078);
			match(DOT);
			setState(1103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMP:
				{
				setState(1079);
				match(COMP);
				setState(1080);
				match(T__0);
				setState(1081);
				match(T__2);
				}
				break;
			case TIPO:
				{
				setState(1082);
				match(TIPO);
				setState(1083);
				match(T__0);
				setState(1084);
				match(T__2);
				}
				break;
			case CARC:
				{
				setState(1085);
				match(CARC);
				setState(1086);
				match(T__0);
				setState(1087);
				match(T__2);
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(1088);
					match(T__5);
					setState(1089);
					exprIndice();
					setState(1090);
					match(T__6);
					}
				}

				}
				break;
			case SUBS:
				{
				setState(1094);
				match(SUBS);
				setState(1095);
				match(T__0);
				setState(1096);
				expr();
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1097);
					match(T__1);
					setState(1098);
					expr();
					}
				}

				setState(1101);
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
		enterRule(_localctx, 100, RULE_formatarTexto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			match(FORM);
			setState(1106);
			match(T__0);
			setState(1107);
			match(STRING);
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1108);
				match(T__1);
				setState(1109);
				expr();
				}
				}
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1115);
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
		enterRule(_localctx, 102, RULE_criarArranjos);
		int _la;
		try {
			setState(1129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CRA:
			case CRR:
				_localctx = new CriarArranjoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1117);
				_la = _input.LA(1);
				if ( !(_la==CRA || _la==CRR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1118);
					match(T__5);
					setState(1119);
					expr();
					setState(1120);
					match(T__6);
					}
					}
					setState(1124); 
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
				setState(1126);
				_la = _input.LA(1);
				if ( !(_la==CRAA || _la==CRRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1127);
				match(T__3);
				setState(1128);
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

	public static class FuncaoConversaoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FCO_INT() { return getToken(AuroraLogoParser.FCO_INT, 0); }
		public TerminalNode FCO_DEC() { return getToken(AuroraLogoParser.FCO_DEC, 0); }
		public TerminalNode FCO_CHR() { return getToken(AuroraLogoParser.FCO_CHR, 0); }
		public TerminalNode FCO_BOL() { return getToken(AuroraLogoParser.FCO_BOL, 0); }
		public TerminalNode FCO_STR() { return getToken(AuroraLogoParser.FCO_STR, 0); }
		public TerminalNode FCO_COR() { return getToken(AuroraLogoParser.FCO_COR, 0); }
		public FuncaoConversaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoConversao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).enterFuncaoConversao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AuroraLogoListener ) ((AuroraLogoListener)listener).exitFuncaoConversao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AuroraLogoVisitor ) return ((AuroraLogoVisitor<? extends T>)visitor).visitFuncaoConversao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoConversaoContext funcaoConversao() throws RecognitionException {
		FuncaoConversaoContext _localctx = new FuncaoConversaoContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_funcaoConversao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			_la = _input.LA(1);
			if ( !(((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (FCO_INT - 156)) | (1L << (FCO_DEC - 156)) | (1L << (FCO_CHR - 156)) | (1L << (FCO_BOL - 156)) | (1L << (FCO_STR - 156)) | (1L << (FCO_COR - 156)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1132);
			match(T__0);
			setState(1133);
			expr();
			setState(1134);
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
		enterRule(_localctx, 106, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			match(IDF);
			setState(1137);
			match(T__0);
			setState(1146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << FAL) | (1L << FORM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PAS - 69)) | (1L << (PI - 69)) | (1L << (TART - 69)) | (1L << (VER - 69)) | (1L << (PRETO - 69)) | (1L << (AZUL - 69)) | (1L << (CIANO - 69)) | (1L << (CINZA - 69)) | (1L << (VERDE - 69)) | (1L << (MAGENTA - 69)) | (1L << (LARANJA - 69)) | (1L << (ROSA - 69)) | (1L << (VERMELHO - 69)) | (1L << (BRANCO - 69)) | (1L << (AMARELO - 69)) | (1L << (F_ACOS - 69)) | (1L << (F_ARRE - 69)) | (1L << (F_ASEN - 69)) | (1L << (F_ATAN - 69)) | (1L << (F_CAPO - 69)) | (1L << (F_CHAO - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (F_COSH - 133)) | (1L << (F_COSS - 133)) | (1L << (F_DCM - 133)) | (1L << (F_GRRA - 133)) | (1L << (F_HIPO - 133)) | (1L << (F_INC - 133)) | (1L << (F_LOGA - 133)) | (1L << (F_MAXI - 133)) | (1L << (F_MINI - 133)) | (1L << (F_NUMA - 133)) | (1L << (F_POTE - 133)) | (1L << (F_RAGR - 133)) | (1L << (F_RAIC - 133)) | (1L << (F_RAIQ - 133)) | (1L << (F_RAIZ - 133)) | (1L << (F_SEME - 133)) | (1L << (F_SENH - 133)) | (1L << (F_SENO - 133)) | (1L << (F_TANG - 133)) | (1L << (F_TANH - 133)) | (1L << (F_TETO - 133)) | (1L << (F_VABS - 133)) | (1L << (FC_CRI - 133)) | (1L << (FCO_INT - 133)) | (1L << (FCO_DEC - 133)) | (1L << (FCO_CHR - 133)) | (1L << (FCO_BOL - 133)) | (1L << (FCO_STR - 133)) | (1L << (FCO_COR - 133)) | (1L << (ADI - 133)) | (1L << (ADIA - 133)) | (1L << (SUB - 133)) | (1L << (SUBA - 133)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NAO - 217)) | (1L << (NAOT - 217)) | (1L << (ID - 217)) | (1L << (IDF - 217)) | (1L << (INT - 217)) | (1L << (DEC - 217)) | (1L << (CHEX - 217)) | (1L << (CHAR - 217)) | (1L << (STRING - 217)))) != 0)) {
				{
				setState(1138);
				expr();
				setState(1143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(1139);
					match(T__1);
					setState(1140);
					expr();
					}
					}
					setState(1145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1148);
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
		enterRule(_localctx, 108, RULE_retornar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			match(RET);
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CRA) | (1L << CRAA) | (1L << CRR) | (1L << CRRA) | (1L << FAL) | (1L << FORM))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PAS - 69)) | (1L << (PI - 69)) | (1L << (TART - 69)) | (1L << (VER - 69)) | (1L << (PRETO - 69)) | (1L << (AZUL - 69)) | (1L << (CIANO - 69)) | (1L << (CINZA - 69)) | (1L << (VERDE - 69)) | (1L << (MAGENTA - 69)) | (1L << (LARANJA - 69)) | (1L << (ROSA - 69)) | (1L << (VERMELHO - 69)) | (1L << (BRANCO - 69)) | (1L << (AMARELO - 69)) | (1L << (F_ACOS - 69)) | (1L << (F_ARRE - 69)) | (1L << (F_ASEN - 69)) | (1L << (F_ATAN - 69)) | (1L << (F_CAPO - 69)) | (1L << (F_CHAO - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (F_COSH - 133)) | (1L << (F_COSS - 133)) | (1L << (F_DCM - 133)) | (1L << (F_GRRA - 133)) | (1L << (F_HIPO - 133)) | (1L << (F_INC - 133)) | (1L << (F_LOGA - 133)) | (1L << (F_MAXI - 133)) | (1L << (F_MINI - 133)) | (1L << (F_NUMA - 133)) | (1L << (F_POTE - 133)) | (1L << (F_RAGR - 133)) | (1L << (F_RAIC - 133)) | (1L << (F_RAIQ - 133)) | (1L << (F_RAIZ - 133)) | (1L << (F_SEME - 133)) | (1L << (F_SENH - 133)) | (1L << (F_SENO - 133)) | (1L << (F_TANG - 133)) | (1L << (F_TANH - 133)) | (1L << (F_TETO - 133)) | (1L << (F_VABS - 133)) | (1L << (FC_CRI - 133)) | (1L << (FCO_INT - 133)) | (1L << (FCO_DEC - 133)) | (1L << (FCO_CHR - 133)) | (1L << (FCO_BOL - 133)) | (1L << (FCO_STR - 133)) | (1L << (FCO_COR - 133)) | (1L << (ADI - 133)) | (1L << (ADIA - 133)) | (1L << (SUB - 133)) | (1L << (SUBA - 133)))) != 0) || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (NAO - 217)) | (1L << (NAOT - 217)) | (1L << (ID - 217)) | (1L << (IDF - 217)) | (1L << (INT - 217)) | (1L << (DEC - 217)) | (1L << (CHEX - 217)) | (1L << (CHAR - 217)) | (1L << (STRING - 217)))) != 0)) {
				{
				setState(1151);
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
		enterRule(_localctx, 110, RULE_processaId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
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
		"\u0004\u0001\u00e7\u0485\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u0001\u0000\u0005\u0000r\b\u0000\n\u0000\f\u0000u\t\u0000"+
		"\u0001\u0000\u0004\u0000x\b\u0000\u000b\u0000\f\u0000y\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u0084\b\u0001\n\u0001\f\u0001\u0087\t\u0001\u0003\u0001"+
		"\u0089\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u008e\b"+
		"\u0001\u000b\u0001\f\u0001\u008f\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u009d\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00b3\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b8"+
		"\b\u0005\n\u0005\f\u0005\u00bb\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00c0\b\u0006\u0001\u0007\u0003\u0007\u00c3\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c8\b\u0007\n\u0007\f\u0007"+
		"\u00cb\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00d0\b\b\n\b\f\b\u00d3"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00df\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\t\u00e6\b\t\u000b\t\f\t\u00e7\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t"+
		"\u00ee\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00f8\b\t\u0001\t\u0001\t\u0001\t\u0004\t\u00fd\b\t\u000b\t"+
		"\f\t\u00fe\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
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
		"\u0001\u0019\u0001\u0019\u0003\u0019\u01cc\b\u0019\u0001\u0019\u0003\u0019"+
		"\u01cf\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01d4\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01e1\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01ea\b\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01f0\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01f6\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u020c\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0212\b\"\u0003\""+
		"\u0214\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u021c\b#\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u0222\b$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0004$\u0229\b$\u000b$\f$\u022a\u0001$\u0001$\u0001$\u0003$\u0230\b"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u023a"+
		"\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u0250\b$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0291\b)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u02aa\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u02ed\b)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u0305\b)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u031e\b+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u032b\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u033a\b+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0345\b+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0352"+
		"\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0363\b+\u0001+\u0001+\u0003"+
		"+\u0367\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u0376\b+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u0385\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005"+
		"+\u0399\b+\n+\f+\u039c\t+\u0001+\u0001+\u0003+\u03a0\b+\u0001+\u0001+"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u03b3\b+\u0001+\u0001+\u0001"+
		"+\u0003+\u03b8\b+\u0003+\u03ba\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u03d1\b+\u0001+\u0001+\u0001"+
		"+\u0003+\u03d6\b+\u0003+\u03d8\b+\u0003+\u03da\b+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u03e1\b,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u03e8\b,\u0003,\u03ea\b,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0003.\u03f4\b.\u0001.\u0001.\u0001.\u0003.\u03f9\b.\u0003.\u03fb"+
		"\b.\u0001.\u0001.\u0001.\u0001.\u0004.\u0401\b.\u000b.\f.\u0402\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u042e\b/\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00031\u0445\b1\u00011\u00011\u00011\u00011\u0001"+
		"1\u00031\u044c\b1\u00011\u00011\u00031\u0450\b1\u00012\u00012\u00012\u0001"+
		"2\u00012\u00052\u0457\b2\n2\f2\u045a\t2\u00012\u00012\u00013\u00013\u0001"+
		"3\u00013\u00013\u00043\u0463\b3\u000b3\f3\u0464\u00013\u00013\u00013\u0003"+
		"3\u046a\b3\u00014\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u0001"+
		"5\u00015\u00055\u0476\b5\n5\f5\u0479\t5\u00035\u047b\b5\u00015\u00015"+
		"\u00016\u00016\u00036\u0481\b6\u00017\u00017\u00017\u0000\u00008\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjln\u0000\u001b\u0001\u0000"+
		"\u00d5\u00d8\u0001\u0000\u00c3\u00d4\u0001\u0000\u00ba\u00bd\u0002\u0000"+
		"bb\u00be\u00c2\u0001\u0000\u00d9\u00da\u0002\u0000{|~~\u0002\u000011`"+
		"`\u0002\u0000\u00e0\u00e1\u00e3\u00e4\u0001\u0000ab\u0002\u0000  99\u0004"+
		"\u0000\u000e\u000e\u0011\u0011%%//\u0001\u0000no\u0001\u0000cm\u0002\u0000"+
		"77QQ\u0003\u0000\u0015\u0015LL\\\\\u0001\u0000\u00ae\u00af\u0001\u0000"+
		"\u00b0\u00b1\u0001\u0000\u00b2\u00b3\u0001\u0000\u00b4\u00b5\u0001\u0000"+
		"\u00b6\u00b7\u0001\u0000\u00b8\u00b9\u0003\u0000\u000b\u000b\u0012\u0012"+
		"KK\u0001\u0000\u0017\u0018\u0001\u0000py\u0002\u0000\u001c\u001c\u001e"+
		"\u001e\u0002\u0000\u001d\u001d\u001f\u001f\u0001\u0000\u009c\u00a1\u050a"+
		"\u0000s\u0001\u0000\u0000\u0000\u0002}\u0001\u0000\u0000\u0000\u0004\u009c"+
		"\u0001\u0000\u0000\u0000\u0006\u009e\u0001\u0000\u0000\u0000\b\u00b2\u0001"+
		"\u0000\u0000\u0000\n\u00b4\u0001\u0000\u0000\u0000\f\u00bc\u0001\u0000"+
		"\u0000\u0000\u000e\u00c2\u0001\u0000\u0000\u0000\u0010\u00cc\u0001\u0000"+
		"\u0000\u0000\u0012\u0110\u0001\u0000\u0000\u0000\u0014\u0112\u0001\u0000"+
		"\u0000\u0000\u0016\u0114\u0001\u0000\u0000\u0000\u0018\u011e\u0001\u0000"+
		"\u0000\u0000\u001a\u0129\u0001\u0000\u0000\u0000\u001c\u0135\u0001\u0000"+
		"\u0000\u0000\u001e\u013e\u0001\u0000\u0000\u0000 \u0151\u0001\u0000\u0000"+
		"\u0000\"\u0159\u0001\u0000\u0000\u0000$\u0164\u0001\u0000\u0000\u0000"+
		"&\u0168\u0001\u0000\u0000\u0000(\u018f\u0001\u0000\u0000\u0000*\u019d"+
		"\u0001\u0000\u0000\u0000,\u019f\u0001\u0000\u0000\u0000.\u01ae\u0001\u0000"+
		"\u0000\u00000\u01c2\u0001\u0000\u0000\u00002\u01c6\u0001\u0000\u0000\u0000"+
		"4\u01d3\u0001\u0000\u0000\u00006\u01d5\u0001\u0000\u0000\u00008\u01d7"+
		"\u0001\u0000\u0000\u0000:\u01e4\u0001\u0000\u0000\u0000<\u01eb\u0001\u0000"+
		"\u0000\u0000>\u01f1\u0001\u0000\u0000\u0000@\u01f7\u0001\u0000\u0000\u0000"+
		"B\u01fe\u0001\u0000\u0000\u0000D\u0205\u0001\u0000\u0000\u0000F\u0215"+
		"\u0001\u0000\u0000\u0000H\u024f\u0001\u0000\u0000\u0000J\u0251\u0001\u0000"+
		"\u0000\u0000L\u0253\u0001\u0000\u0000\u0000N\u0256\u0001\u0000\u0000\u0000"+
		"P\u0259\u0001\u0000\u0000\u0000R\u0304\u0001\u0000\u0000\u0000T\u0306"+
		"\u0001\u0000\u0000\u0000V\u03d9\u0001\u0000\u0000\u0000X\u03e9\u0001\u0000"+
		"\u0000\u0000Z\u03eb\u0001\u0000\u0000\u0000\\\u03ee\u0001\u0000\u0000"+
		"\u0000^\u042d\u0001\u0000\u0000\u0000`\u042f\u0001\u0000\u0000\u0000b"+
		"\u0435\u0001\u0000\u0000\u0000d\u0451\u0001\u0000\u0000\u0000f\u0469\u0001"+
		"\u0000\u0000\u0000h\u046b\u0001\u0000\u0000\u0000j\u0470\u0001\u0000\u0000"+
		"\u0000l\u047e\u0001\u0000\u0000\u0000n\u0482\u0001\u0000\u0000\u0000p"+
		"r\u0003\u0002\u0001\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tw\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000vx\u0003\u0004\u0002\u0000wv\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005\u0000\u0000"+
		"\u0001|\u0001\u0001\u0000\u0000\u0000}~\u00055\u0000\u0000~\u007f\u0005"+
		"\u00de\u0000\u0000\u007f\u0088\u0005\u0001\u0000\u0000\u0080\u0085\u0005"+
		"\u00dc\u0000\u0000\u0081\u0082\u0005\u0002\u0000\u0000\u0082\u0084\u0005"+
		"\u00dc\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0087\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0088\u0080\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"\u0003\u0000\u0000\u008b\u008d\u0005\u0004\u0000\u0000\u008c\u008e\u0003"+
		"\u0006\u0003\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"\u0005\u0000\u0000\u0092\u0003\u0001\u0000\u0000\u0000\u0093\u0094\u0003"+
		"\b\u0004\u0000\u0094\u0095\u0005\u00db\u0000\u0000\u0095\u009d\u0001\u0000"+
		"\u0000\u0000\u0096\u009d\u0003\u0016\u000b\u0000\u0097\u009d\u0003\u001e"+
		"\u000f\u0000\u0098\u009d\u0003\"\u0011\u0000\u0099\u009d\u0003&\u0013"+
		"\u0000\u009a\u009d\u0003(\u0014\u0000\u009b\u009d\u0003\\.\u0000\u009c"+
		"\u0093\u0001\u0000\u0000\u0000\u009c\u0096\u0001\u0000\u0000\u0000\u009c"+
		"\u0097\u0001\u0000\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c"+
		"\u0099\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u0005\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0003\u0004\u0002\u0000\u009f\u0007\u0001\u0000\u0000\u0000\u00a0"+
		"\u00b3\u0003.\u0017\u0000\u00a1\u00b3\u00030\u0018\u0000\u00a2\u00b3\u0003"+
		":\u001d\u0000\u00a3\u00b3\u0003L&\u0000\u00a4\u00b3\u0003N\'\u0000\u00a5"+
		"\u00b3\u0003P(\u0000\u00a6\u00b3\u0003<\u001e\u0000\u00a7\u00b3\u0003"+
		">\u001f\u0000\u00a8\u00b3\u0003@ \u0000\u00a9\u00b3\u0003B!\u0000\u00aa"+
		"\u00b3\u0003D\"\u0000\u00ab\u00b3\u0003F#\u0000\u00ac\u00b3\u0003H$\u0000"+
		"\u00ad\u00b3\u0003*\u0015\u0000\u00ae\u00b3\u0003,\u0016\u0000\u00af\u00b3"+
		"\u0003l6\u0000\u00b0\u00b3\u0003T*\u0000\u00b1\u00b3\u0003\n\u0005\u0000"+
		"\u00b2\u00a0\u0001\u0000\u0000\u0000\u00b2\u00a1\u0001\u0000\u0000\u0000"+
		"\u00b2\u00a2\u0001\u0000\u0000\u0000\u00b2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00b2\u00a4\u0001\u0000\u0000\u0000\u00b2\u00a5\u0001\u0000\u0000\u0000"+
		"\u00b2\u00a6\u0001\u0000\u0000\u0000\u00b2\u00a7\u0001\u0000\u0000\u0000"+
		"\u00b2\u00a8\u0001\u0000\u0000\u0000\u00b2\u00a9\u0001\u0000\u0000\u0000"+
		"\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b2\u00ab\u0001\u0000\u0000\u0000"+
		"\u00b2\u00ac\u0001\u0000\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\t\u0001\u0000\u0000\u0000\u00b4\u00b9\u0003\f\u0006\u0000\u00b5"+
		"\u00b6\u0007\u0000\u0000\u0000\u00b6\u00b8\u0003\f\u0006\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u000b"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf"+
		"\u0003\u000e\u0007\u0000\u00bd\u00be\u0007\u0001\u0000\u0000\u00be\u00c0"+
		"\u0003\u000e\u0007\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\r\u0001\u0000\u0000\u0000\u00c1\u00c3\u0007"+
		"\u0002\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c9\u0003"+
		"\u0010\b\u0000\u00c5\u00c6\u0007\u0002\u0000\u0000\u00c6\u00c8\u0003\u0010"+
		"\b\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ca\u000f\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cc\u00d1\u0003\u0012\t\u0000\u00cd\u00ce\u0007\u0003\u0000\u0000"+
		"\u00ce\u00d0\u0003\u0012\t\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2\u0011\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d5\u0007\u0004\u0000\u0000\u00d5"+
		"\u0111\u0003\u0012\t\u0000\u00d6\u0111\u0005\u00e0\u0000\u0000\u00d7\u0111"+
		"\u0005\u00e1\u0000\u0000\u00d8\u0111\u0005I\u0000\u0000\u00d9\u00de\u0003"+
		"n7\u0000\u00da\u00db\u0005\u00db\u0000\u0000\u00db\u00dc\u0007\u0005\u0000"+
		"\u0000\u00dc\u00dd\u0005\u0001\u0000\u0000\u00dd\u00df\u0005\u0003\u0000"+
		"\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000"+
		"\u0000\u00df\u0111\u0001\u0000\u0000\u0000\u00e0\u00e5\u0003n7\u0000\u00e1"+
		"\u00e2\u0005\u0006\u0000\u0000\u00e2\u00e3\u0003\n\u0005\u0000\u00e3\u00e4"+
		"\u0005\u0007\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ed"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u00db\u0000\u0000\u00ea\u00eb"+
		"\u0007\u0005\u0000\u0000\u00eb\u00ec\u0005\u0001\u0000\u0000\u00ec\u00ee"+
		"\u0005\u0003\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u0111\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0003n7\u0000\u00f0\u00f1\u0005\u0004\u0000\u0000\u00f1\u00f2\u0003\n"+
		"\u0005\u0000\u00f2\u00f7\u0005\u0005\u0000\u0000\u00f3\u00f4\u0005\u00db"+
		"\u0000\u0000\u00f4\u00f5\u0007\u0005\u0000\u0000\u00f5\u00f6\u0005\u0001"+
		"\u0000\u0000\u00f6\u00f8\u0005\u0003\u0000\u0000\u00f7\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u0111\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fc\u0003n7\u0000\u00fa\u00fb\u0005\u00db\u0000\u0000"+
		"\u00fb\u00fd\u0005\u00df\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0111\u0001\u0000\u0000\u0000"+
		"\u0100\u0111\u0005\u00e3\u0000\u0000\u0101\u0111\u0005\u00e4\u0000\u0000"+
		"\u0102\u0111\u0007\u0006\u0000\u0000\u0103\u0111\u00034\u001a\u0000\u0104"+
		"\u0111\u0003R)\u0000\u0105\u0111\u0003h4\u0000\u0106\u0111\u0003`0\u0000"+
		"\u0107\u0111\u0003b1\u0000\u0108\u0111\u0003d2\u0000\u0109\u0111\u0003"+
		"$\u0012\u0000\u010a\u0111\u0003j5\u0000\u010b\u0111\u0003f3\u0000\u010c"+
		"\u010d\u0005\u0001\u0000\u0000\u010d\u010e\u0003\n\u0005\u0000\u010e\u010f"+
		"\u0005\u0003\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u00d4"+
		"\u0001\u0000\u0000\u0000\u0110\u00d6\u0001\u0000\u0000\u0000\u0110\u00d7"+
		"\u0001\u0000\u0000\u0000\u0110\u00d8\u0001\u0000\u0000\u0000\u0110\u00d9"+
		"\u0001\u0000\u0000\u0000\u0110\u00e0\u0001\u0000\u0000\u0000\u0110\u00ef"+
		"\u0001\u0000\u0000\u0000\u0110\u00f9\u0001\u0000\u0000\u0000\u0110\u0100"+
		"\u0001\u0000\u0000\u0000\u0110\u0101\u0001\u0000\u0000\u0000\u0110\u0102"+
		"\u0001\u0000\u0000\u0000\u0110\u0103\u0001\u0000\u0000\u0000\u0110\u0104"+
		"\u0001\u0000\u0000\u0000\u0110\u0105\u0001\u0000\u0000\u0000\u0110\u0106"+
		"\u0001\u0000\u0000\u0000\u0110\u0107\u0001\u0000\u0000\u0000\u0110\u0108"+
		"\u0001\u0000\u0000\u0000\u0110\u0109\u0001\u0000\u0000\u0000\u0110\u010a"+
		"\u0001\u0000\u0000\u0000\u0110\u010b\u0001\u0000\u0000\u0000\u0110\u010c"+
		"\u0001\u0000\u0000\u0000\u0111\u0013\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0003\n\u0005\u0000\u0113\u0015\u0001\u0000\u0000\u0000\u0114\u0118\u0003"+
		"\u0018\f\u0000\u0115\u0117\u0003\u001a\r\u0000\u0116\u0115\u0001\u0000"+
		"\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000"+
		"\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011d\u0003\u001c"+
		"\u000e\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000"+
		"\u0000\u0000\u011d\u0017\u0001\u0000\u0000\u0000\u011e\u011f\u0005U\u0000"+
		"\u0000\u011f\u0120\u0003\u0014\n\u0000\u0120\u0121\u0005,\u0000\u0000"+
		"\u0121\u0123\u0005\u0004\u0000\u0000\u0122\u0124\u0003\u0004\u0002\u0000"+
		"\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0005\u0000\u0000"+
		"\u0128\u0019\u0001\u0000\u0000\u0000\u0129\u012a\u0005V\u0000\u0000\u012a"+
		"\u012b\u0005U\u0000\u0000\u012b\u012c\u0003\u0014\n\u0000\u012c\u012d"+
		"\u0005,\u0000\u0000\u012d\u012f\u0005\u0004\u0000\u0000\u012e\u0130\u0003"+
		"\u0004\u0002\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001"+
		"\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0005"+
		"\u0005\u0000\u0000\u0134\u001b\u0001\u0000\u0000\u0000\u0135\u0136\u0005"+
		"V\u0000\u0000\u0136\u0138\u0005\u0004\u0000\u0000\u0137\u0139\u0003\u0004"+
		"\u0002\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
		"\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0005"+
		"\u0000\u0000\u013d\u001d\u0001\u0000\u0000\u0000\u013e\u013f\u0005^\u0000"+
		"\u0000\u013f\u0140\u0003n7\u0000\u0140\u0142\u0005\u0004\u0000\u0000\u0141"+
		"\u0143\u0003 \u0010\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0001\u0000\u0000\u0000\u0145\u014d\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0005F\u0000\u0000\u0147\u0149\u0005\b\u0000\u0000\u0148\u014a\u0003"+
		"\u0004\u0002\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001"+
		"\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001"+
		"\u0000\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u0146\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0005\u0005\u0000\u0000\u0150\u001f\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0005-\u0000\u0000\u0152\u0153\u0007\u0007"+
		"\u0000\u0000\u0153\u0155\u0005\b\u0000\u0000\u0154\u0156\u0003\u0004\u0002"+
		"\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000"+
		"\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000"+
		"\u0000\u0158!\u0001\u0000\u0000\u0000\u0159\u015a\u0005R\u0000\u0000\u015a"+
		"\u015b\u0003\n\u0005\u0000\u015b\u015c\u0007\b\u0000\u0000\u015c\u015e"+
		"\u0005\u0004\u0000\u0000\u015d\u015f\u0003\u0004\u0002\u0000\u015e\u015d"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u015e"+
		"\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u0005\u0000\u0000\u0163#\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0005E\u0000\u0000\u0165%\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0005+\u0000\u0000\u0167\u0169\u0003\u0014\n\u0000"+
		"\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u0185\u0005R\u0000\u0000\u016b"+
		"\u016c\u0007\t\u0000\u0000\u016c\u016f\u0003n7\u0000\u016d\u016e\u0005"+
		")\u0000\u0000\u016e\u0170\u0003\n\u0005\u0000\u016f\u016d\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0186\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0005X\u0000\u0000\u0172\u0173\u0003n7\u0000"+
		"\u0173\u0174\u0005\u0013\u0000\u0000\u0174\u0175\u0003\n\u0005\u0000\u0175"+
		"\u0186\u0001\u0000\u0000\u0000\u0176\u0177\u0005B\u0000\u0000\u0177\u0178"+
		"\u0003n7\u0000\u0178\u0179\u0005M\u0000\u0000\u0179\u017a\u0003\n\u0005"+
		"\u0000\u017a\u0186\u0001\u0000\u0000\u0000\u017b\u017c\u0005&\u0000\u0000"+
		"\u017c\u017d\u0003n7\u0000\u017d\u017e\u0005M\u0000\u0000\u017e\u017f"+
		"\u0003\n\u0005\u0000\u017f\u0186\u0001\u0000\u0000\u0000\u0180\u0181\u0005"+
		"Y\u0000\u0000\u0181\u0182\u0003\n\u0005\u0000\u0182\u0183\u0005!\u0000"+
		"\u0000\u0183\u0184\u0003n7\u0000\u0184\u0186\u0001\u0000\u0000\u0000\u0185"+
		"\u016b\u0001\u0000\u0000\u0000\u0185\u0171\u0001\u0000\u0000\u0000\u0185"+
		"\u0176\u0001\u0000\u0000\u0000\u0185\u017b\u0001\u0000\u0000\u0000\u0185"+
		"\u0180\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u0187\u0189\u0005\u0004\u0000\u0000\u0188"+
		"\u018a\u0003\u0004\u0002\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0005\u0005\u0000\u0000\u018e\'\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0005G\u0000\u0000\u0190\u0191\u0005\u000f\u0000\u0000\u0191\u0192\u0003"+
		"n7\u0000\u0192\u0193\u0005)\u0000\u0000\u0193\u0194\u0003\n\u0005\u0000"+
		"\u0194\u0195\u0005R\u0000\u0000\u0195\u0197\u0005\u0004\u0000\u0000\u0196"+
		"\u0198\u0003\u0004\u0002\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0005\u0005\u0000\u0000\u019c)\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0005H\u0000\u0000\u019e+\u0001\u0000\u0000\u0000\u019f\u01a0\u0005\u0014"+
		"\u0000\u0000\u01a0-\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005_\u0000\u0000"+
		"\u01a2\u01a3\u0005G\u0000\u0000\u01a3\u01a6\u0007\n\u0000\u0000\u01a4"+
		"\u01a5\u0005)\u0000\u0000\u01a5\u01a7\u0003\n\u0005\u0000\u01a6\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01af"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005_\u0000\u0000\u01a9\u01aa\u0005"+
		"G\u0000\u0000\u01aa\u01ab\u0003\n\u0005\u0000\u01ab\u01ac\u0005\u0002"+
		"\u0000\u0000\u01ac\u01ad\u0003\n\u0005\u0000\u01ad\u01af\u0001\u0000\u0000"+
		"\u0000\u01ae\u01a1\u0001\u0000\u0000\u0000\u01ae\u01a8\u0001\u0000\u0000"+
		"\u0000\u01af/\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005]\u0000\u0000\u01b1"+
		"\u01b2\u0005\u0019\u0000\u0000\u01b2\u01b3\u0005\'\u0000\u0000\u01b3\u01b4"+
		"\u0005J\u0000\u0000\u01b4\u01b5\u0005G\u0000\u0000\u01b5\u01c3\u00032"+
		"\u0019\u0000\u01b6\u01b7\u0005]\u0000\u0000\u01b7\u01b8\u0005\u0019\u0000"+
		"\u0000\u01b8\u01b9\u0005\'\u0000\u0000\u01b9\u01ba\u0005N\u0000\u0000"+
		"\u01ba\u01bb\u0005G\u0000\u0000\u01bb\u01c3\u00032\u0019\u0000\u01bc\u01bd"+
		"\u0005]\u0000\u0000\u01bd\u01be\u0005\u0019\u0000\u0000\u01be\u01bf\u0005"+
		"\'\u0000\u0000\u01bf\u01c0\u00054\u0000\u0000\u01c0\u01c1\u0005G\u0000"+
		"\u0000\u01c1\u01c3\u00032\u0019\u0000\u01c2\u01b0\u0001\u0000\u0000\u0000"+
		"\u01c2\u01b6\u0001\u0000\u0000\u0000\u01c2\u01bc\u0001\u0000\u0000\u0000"+
		"\u01c31\u0001\u0000\u0000\u0000\u01c4\u01c7\u00034\u001a\u0000\u01c5\u01c7"+
		"\u0003\n\u0005\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c7\u01ce\u0001\u0000\u0000\u0000\u01c8\u01c9\u0003"+
		"\n\u0005\u0000\u01c9\u01ca\u0007\b\u0000\u0000\u01ca\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cb\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01cf\u0007\u000b"+
		"\u0000\u0000\u01ce\u01cb\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000"+
		"\u0000\u0000\u01cf3\u0001\u0000\u0000\u0000\u01d0\u01d4\u0005\u00e2\u0000"+
		"\u0000\u01d1\u01d4\u00038\u001c\u0000\u01d2\u01d4\u00036\u001b\u0000\u01d3"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d45\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0007\f\u0000\u0000\u01d67\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005"+
		"\u009b\u0000\u0000\u01d8\u01d9\u0005\u0001\u0000\u0000\u01d9\u01da\u0003"+
		"\n\u0005\u0000\u01da\u01db\u0005\u0002\u0000\u0000\u01db\u01dc\u0003\n"+
		"\u0005\u0000\u01dc\u01dd\u0005\u0002\u0000\u0000\u01dd\u01e0\u0003\n\u0005"+
		"\u0000\u01de\u01df\u0005\u0002\u0000\u0000\u01df\u01e1\u0003\n\u0005\u0000"+
		"\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\u0003\u0000\u0000"+
		"\u01e39\u0001\u0000\u0000\u0000\u01e4\u01e9\u00056\u0000\u0000\u01e5\u01e6"+
		"\u0005)\u0000\u0000\u01e6\u01e7\u0003\n\u0005\u0000\u01e7\u01e8\u0007"+
		"\r\u0000\u0000\u01e8\u01ea\u0001\u0000\u0000\u0000\u01e9\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea;\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ec\u0005*\u0000\u0000\u01ec\u01ef\u0005J\u0000\u0000\u01ed"+
		"\u01ee\u0005)\u0000\u0000\u01ee\u01f0\u0003\n\u0005\u0000\u01ef\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0=\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f2\u0005\"\u0000\u0000\u01f2\u01f5\u0005J"+
		"\u0000\u0000\u01f3\u01f4\u0005)\u0000\u0000\u01f4\u01f6\u0003\n\u0005"+
		"\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f6?\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005]\u0000\u0000\u01f8"+
		"\u01f9\u00058\u0000\u0000\u01f9\u01fa\u0005\'\u0000\u0000\u01fa\u01fb"+
		"\u0005J\u0000\u0000\u01fb\u01fc\u0005G\u0000\u0000\u01fc\u01fd\u0003\n"+
		"\u0005\u0000\u01fdA\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005]\u0000\u0000"+
		"\u01ff\u0200\u00050\u0000\u0000\u0200\u0201\u0005\'\u0000\u0000\u0201"+
		"\u0202\u0005J\u0000\u0000\u0202\u0203\u0005G\u0000\u0000\u0203\u0204\u0007"+
		"\u000e\u0000\u0000\u0204C\u0001\u0000\u0000\u0000\u0205\u0206\u0005.\u0000"+
		"\u0000\u0206\u0213\u0003\n\u0005\u0000\u0207\u0208\u0005C\u0000\u0000"+
		"\u0208\u020b\u0005T\u0000\u0000\u0209\u020a\u0005O\u0000\u0000\u020a\u020c"+
		"\u0005>\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001"+
		"\u0000\u0000\u0000\u020c\u0214\u0001\u0000\u0000\u0000\u020d\u020e\u0005"+
		"D\u0000\u0000\u020e\u0211\u0005$\u0000\u0000\u020f\u0210\u0005O\u0000"+
		"\u0000\u0210\u0212\u0005>\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0214\u0001\u0000\u0000\u0000"+
		"\u0213\u0207\u0001\u0000\u0000\u0000\u0213\u020d\u0001\u0000\u0000\u0000"+
		"\u0213\u0214\u0001\u0000\u0000\u0000\u0214E\u0001\u0000\u0000\u0000\u0215"+
		"\u0216\u0005;\u0000\u0000\u0216\u021b\u0003n7\u0000\u0217\u0218\u0005"+
		"^\u0000\u0000\u0218\u0219\u0005\t\u0000\u0000\u0219\u021a\u0005?\u0000"+
		"\u0000\u021a\u021c\u0003\n\u0005\u0000\u021b\u0217\u0001\u0000\u0000\u0000"+
		"\u021b\u021c\u0001\u0000\u0000\u0000\u021cG\u0001\u0000\u0000\u0000\u021d"+
		"\u021e\u0003n7\u0000\u021e\u0221\u0007\u000f\u0000\u0000\u021f\u0222\u0003"+
		"\n\u0005\u0000\u0220\u0222\u0003f3\u0000\u0221\u021f\u0001\u0000\u0000"+
		"\u0000\u0221\u0220\u0001\u0000\u0000\u0000\u0222\u0250\u0001\u0000\u0000"+
		"\u0000\u0223\u0228\u0003n7\u0000\u0224\u0225\u0005\u0006\u0000\u0000\u0225"+
		"\u0226\u0003J%\u0000\u0226\u0227\u0005\u0007\u0000\u0000\u0227\u0229\u0001"+
		"\u0000\u0000\u0000\u0228\u0224\u0001\u0000\u0000\u0000\u0229\u022a\u0001"+
		"\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u022b\u0001"+
		"\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022f\u0007"+
		"\u000f\u0000\u0000\u022d\u0230\u0003\n\u0005\u0000\u022e\u0230\u0003f"+
		"3\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u022e\u0001\u0000\u0000"+
		"\u0000\u0230\u0250\u0001\u0000\u0000\u0000\u0231\u0232\u0003n7\u0000\u0232"+
		"\u0233\u0005\u0004\u0000\u0000\u0233\u0234\u0003J%\u0000\u0234\u0235\u0005"+
		"\u0005\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0239\u0007"+
		"\u000f\u0000\u0000\u0237\u023a\u0003\n\u0005\u0000\u0238\u023a\u0003f"+
		"3\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u0239\u0238\u0001\u0000\u0000"+
		"\u0000\u023a\u0250\u0001\u0000\u0000\u0000\u023b\u023c\u0003n7\u0000\u023c"+
		"\u023d\u0007\u0010\u0000\u0000\u023d\u023e\u0003\n\u0005\u0000\u023e\u0250"+
		"\u0001\u0000\u0000\u0000\u023f\u0240\u0003n7\u0000\u0240\u0241\u0007\u0011"+
		"\u0000\u0000\u0241\u0242\u0003\n\u0005\u0000\u0242\u0250\u0001\u0000\u0000"+
		"\u0000\u0243\u0244\u0003n7\u0000\u0244\u0245\u0007\u0012\u0000\u0000\u0245"+
		"\u0246\u0003\n\u0005\u0000\u0246\u0250\u0001\u0000\u0000\u0000\u0247\u0248"+
		"\u0003n7\u0000\u0248\u0249\u0007\u0013\u0000\u0000\u0249\u024a\u0003\n"+
		"\u0005\u0000\u024a\u0250\u0001\u0000\u0000\u0000\u024b\u024c\u0003n7\u0000"+
		"\u024c\u024d\u0007\u0014\u0000\u0000\u024d\u024e\u0003\n\u0005\u0000\u024e"+
		"\u0250\u0001\u0000\u0000\u0000\u024f\u021d\u0001\u0000\u0000\u0000\u024f"+
		"\u0223\u0001\u0000\u0000\u0000\u024f\u0231\u0001\u0000\u0000\u0000\u024f"+
		"\u023b\u0001\u0000\u0000\u0000\u024f\u023f\u0001\u0000\u0000\u0000\u024f"+
		"\u0243\u0001\u0000\u0000\u0000\u024f\u0247\u0001\u0000\u0000\u0000\u024f"+
		"\u024b\u0001\u0000\u0000\u0000\u0250I\u0001\u0000\u0000\u0000\u0251\u0252"+
		"\u0003\n\u0005\u0000\u0252K\u0001\u0000\u0000\u0000\u0253\u0254\u0005"+
		"\n\u0000\u0000\u0254\u0255\u0005J\u0000\u0000\u0255M\u0001\u0000\u0000"+
		"\u0000\u0256\u0257\u0005<\u0000\u0000\u0257\u0258\u0005J\u0000\u0000\u0258"+
		"O\u0001\u0000\u0000\u0000\u0259\u025a\u0005=\u0000\u0000\u025aQ\u0001"+
		"\u0000\u0000\u0000\u025b\u025c\u0005\u009a\u0000\u0000\u025c\u025d\u0005"+
		"\u0001\u0000\u0000\u025d\u025e\u0003\n\u0005\u0000\u025e\u025f\u0005\u0003"+
		"\u0000\u0000\u025f\u0305\u0001\u0000\u0000\u0000\u0260\u0261\u0005\u0092"+
		"\u0000\u0000\u0261\u0262\u0005\u0001\u0000\u0000\u0262\u0263\u0003\n\u0005"+
		"\u0000\u0263\u0264\u0005\u0003\u0000\u0000\u0264\u0305\u0001\u0000\u0000"+
		"\u0000\u0265\u0266\u0005\u0091\u0000\u0000\u0266\u0267\u0005\u0001\u0000"+
		"\u0000\u0267\u0268\u0003\n\u0005\u0000\u0268\u0269\u0005\u0003\u0000\u0000"+
		"\u0269\u0305\u0001\u0000\u0000\u0000\u026a\u026b\u0005\u0093\u0000\u0000"+
		"\u026b\u026c\u0005\u0001\u0000\u0000\u026c\u026d\u0003\n\u0005\u0000\u026d"+
		"\u026e\u0005\u0002\u0000\u0000\u026e\u026f\u0003\n\u0005\u0000\u026f\u0270"+
		"\u0005\u0003\u0000\u0000\u0270\u0305\u0001\u0000\u0000\u0000\u0271\u0272"+
		"\u0005\u008f\u0000\u0000\u0272\u0273\u0005\u0001\u0000\u0000\u0273\u0274"+
		"\u0003\n\u0005\u0000\u0274\u0275\u0005\u0002\u0000\u0000\u0275\u0276\u0003"+
		"\n\u0005\u0000\u0276\u0277\u0005\u0003\u0000\u0000\u0277\u0305\u0001\u0000"+
		"\u0000\u0000\u0278\u0279\u0005\u0089\u0000\u0000\u0279\u027a\u0005\u0001"+
		"\u0000\u0000\u027a\u027b\u0003\n\u0005\u0000\u027b\u027c\u0005\u0002\u0000"+
		"\u0000\u027c\u027d\u0003\n\u0005\u0000\u027d\u027e\u0005\u0003\u0000\u0000"+
		"\u027e\u0305\u0001\u0000\u0000\u0000\u027f\u0280\u0005\u0084\u0000\u0000"+
		"\u0280\u0281\u0005\u0001\u0000\u0000\u0281\u0282\u0003\n\u0005\u0000\u0282"+
		"\u0283\u0005\u0003\u0000\u0000\u0283\u0305\u0001\u0000\u0000\u0000\u0284"+
		"\u0285\u0005\u0099\u0000\u0000\u0285\u0286\u0005\u0001\u0000\u0000\u0286"+
		"\u0287\u0003\n\u0005\u0000\u0287\u0288\u0005\u0003\u0000\u0000\u0288\u0305"+
		"\u0001\u0000\u0000\u0000\u0289\u028a\u0005\u0080\u0000\u0000\u028a\u0290"+
		"\u0005\u0001\u0000\u0000\u028b\u0291\u0003\n\u0005\u0000\u028c\u028d\u0003"+
		"\n\u0005\u0000\u028d\u028e\u0005\u0002\u0000\u0000\u028e\u028f\u0003\n"+
		"\u0005\u0000\u028f\u0291\u0001\u0000\u0000\u0000\u0290\u028b\u0001\u0000"+
		"\u0000\u0000\u0290\u028c\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000"+
		"\u0000\u0000\u0292\u0293\u0005\u0003\u0000\u0000\u0293\u0305\u0001\u0000"+
		"\u0000\u0000\u0294\u0295\u0005\u008d\u0000\u0000\u0295\u0296\u0005\u0001"+
		"\u0000\u0000\u0296\u0297\u0003\n\u0005\u0000\u0297\u0298\u0005\u0002\u0000"+
		"\u0000\u0298\u0299\u0003\n\u0005\u0000\u0299\u029a\u0005\u0003\u0000\u0000"+
		"\u029a\u0305\u0001\u0000\u0000\u0000\u029b\u029c\u0005\u008c\u0000\u0000"+
		"\u029c\u029d\u0005\u0001\u0000\u0000\u029d\u029e\u0003\n\u0005\u0000\u029e"+
		"\u029f\u0005\u0002\u0000\u0000\u029f\u02a0\u0003\n\u0005\u0000\u02a0\u02a1"+
		"\u0005\u0003\u0000\u0000\u02a1\u0305\u0001\u0000\u0000\u0000\u02a2\u02a3"+
		"\u0005\u008e\u0000\u0000\u02a3\u02a9\u0005\u0001\u0000\u0000\u02a4\u02aa"+
		"\u0003\n\u0005\u0000\u02a5\u02a6\u0003\n\u0005\u0000\u02a6\u02a7\u0005"+
		"\u0002\u0000\u0000\u02a7\u02a8\u0003\n\u0005\u0000\u02a8\u02aa\u0001\u0000"+
		"\u0000\u0000\u02a9\u02a4\u0001\u0000\u0000\u0000\u02a9\u02a5\u0001\u0000"+
		"\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000"+
		"\u0000\u0000\u02ab\u0305\u0005\u0003\u0000\u0000\u02ac\u02ad\u0005\u0094"+
		"\u0000\u0000\u02ad\u02ae\u0005\u0001\u0000\u0000\u02ae\u02af\u0003\n\u0005"+
		"\u0000\u02af\u02b0\u0005\u0003\u0000\u0000\u02b0\u0305\u0001\u0000\u0000"+
		"\u0000\u02b1\u02b2\u0005\u0096\u0000\u0000\u02b2\u02b3\u0005\u0001\u0000"+
		"\u0000\u02b3\u02b4\u0003\n\u0005\u0000\u02b4\u02b5\u0005\u0003\u0000\u0000"+
		"\u02b5\u0305\u0001\u0000\u0000\u0000\u02b6\u02b7\u0005\u0086\u0000\u0000"+
		"\u02b7\u02b8\u0005\u0001\u0000\u0000\u02b8\u02b9\u0003\n\u0005\u0000\u02b9"+
		"\u02ba\u0005\u0003\u0000\u0000\u02ba\u0305\u0001\u0000\u0000\u0000\u02bb"+
		"\u02bc\u0005\u0097\u0000\u0000\u02bc\u02bd\u0005\u0001\u0000\u0000\u02bd"+
		"\u02be\u0003\n\u0005\u0000\u02be\u02bf\u0005\u0003\u0000\u0000\u02bf\u0305"+
		"\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005\u0081\u0000\u0000\u02c1\u02c2"+
		"\u0005\u0001\u0000\u0000\u02c2\u02c3\u0003\n\u0005\u0000\u02c3\u02c4\u0005"+
		"\u0003\u0000\u0000\u02c4\u0305\u0001\u0000\u0000\u0000\u02c5\u02c6\u0005"+
		"\u007f\u0000\u0000\u02c6\u02c7\u0005\u0001\u0000\u0000\u02c7\u02c8\u0003"+
		"\n\u0005\u0000\u02c8\u02c9\u0005\u0003\u0000\u0000\u02c9\u0305\u0001\u0000"+
		"\u0000\u0000\u02ca\u02cb\u0005\u0082\u0000\u0000\u02cb\u02cc\u0005\u0001"+
		"\u0000\u0000\u02cc\u02cd\u0003\n\u0005\u0000\u02cd\u02ce\u0005\u0003\u0000"+
		"\u0000\u02ce\u0305\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005\u0083\u0000"+
		"\u0000\u02d0\u02d1\u0005\u0001\u0000\u0000\u02d1\u02d2\u0003\n\u0005\u0000"+
		"\u02d2\u02d3\u0005\u0002\u0000\u0000\u02d3\u02d4\u0003\n\u0005\u0000\u02d4"+
		"\u02d5\u0005\u0003\u0000\u0000\u02d5\u0305\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d7\u0005\u0095\u0000\u0000\u02d7\u02d8\u0005\u0001\u0000\u0000\u02d8"+
		"\u02d9\u0003\n\u0005\u0000\u02d9\u02da\u0005\u0003\u0000\u0000\u02da\u0305"+
		"\u0001\u0000\u0000\u0000\u02db\u02dc\u0005\u0085\u0000\u0000\u02dc\u02dd"+
		"\u0005\u0001\u0000\u0000\u02dd\u02de\u0003\n\u0005\u0000\u02de\u02df\u0005"+
		"\u0003\u0000\u0000\u02df\u0305\u0001\u0000\u0000\u0000\u02e0\u02e1\u0005"+
		"\u0098\u0000\u0000\u02e1\u02e2\u0005\u0001\u0000\u0000\u02e2\u02e3\u0003"+
		"\n\u0005\u0000\u02e3\u02e4\u0005\u0003\u0000\u0000\u02e4\u0305\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e6\u0005\u008b\u0000\u0000\u02e6\u02ec\u0005\u0001"+
		"\u0000\u0000\u02e7\u02ed\u0003\n\u0005\u0000\u02e8\u02e9\u0003\n\u0005"+
		"\u0000\u02e9\u02ea\u0005\u0002\u0000\u0000\u02ea\u02eb\u0003\n\u0005\u0000"+
		"\u02eb\u02ed\u0001\u0000\u0000\u0000\u02ec\u02e7\u0001\u0000\u0000\u0000"+
		"\u02ec\u02e8\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ef\u0005\u0003\u0000\u0000\u02ef\u0305\u0001\u0000\u0000\u0000"+
		"\u02f0\u02f1\u0005\u0088\u0000\u0000\u02f1\u02f2\u0005\u0001\u0000\u0000"+
		"\u02f2\u02f3\u0003\n\u0005\u0000\u02f3\u02f4\u0005\u0003\u0000\u0000\u02f4"+
		"\u0305\u0001\u0000\u0000\u0000\u02f5\u02f6\u0005\u0090\u0000\u0000\u02f6"+
		"\u02f7\u0005\u0001\u0000\u0000\u02f7\u02f8\u0003\n\u0005\u0000\u02f8\u02f9"+
		"\u0005\u0003\u0000\u0000\u02f9\u0305\u0001\u0000\u0000\u0000\u02fa\u02fb"+
		"\u0005\u008a\u0000\u0000\u02fb\u02fc\u0005\u0001\u0000\u0000\u02fc\u02fd"+
		"\u0003n7\u0000\u02fd\u02fe\u0005\u0003\u0000\u0000\u02fe\u0305\u0001\u0000"+
		"\u0000\u0000\u02ff\u0300\u0005\u0087\u0000\u0000\u0300\u0301\u0005\u0001"+
		"\u0000\u0000\u0301\u0302\u0003n7\u0000\u0302\u0303\u0005\u0003\u0000\u0000"+
		"\u0303\u0305\u0001\u0000\u0000\u0000\u0304\u025b\u0001\u0000\u0000\u0000"+
		"\u0304\u0260\u0001\u0000\u0000\u0000\u0304\u0265\u0001\u0000\u0000\u0000"+
		"\u0304\u026a\u0001\u0000\u0000\u0000\u0304\u0271\u0001\u0000\u0000\u0000"+
		"\u0304\u0278\u0001\u0000\u0000\u0000\u0304\u027f\u0001\u0000\u0000\u0000"+
		"\u0304\u0284\u0001\u0000\u0000\u0000\u0304\u0289\u0001\u0000\u0000\u0000"+
		"\u0304\u0294\u0001\u0000\u0000\u0000\u0304\u029b\u0001\u0000\u0000\u0000"+
		"\u0304\u02a2\u0001\u0000\u0000\u0000\u0304\u02ac\u0001\u0000\u0000\u0000"+
		"\u0304\u02b1\u0001\u0000\u0000\u0000\u0304\u02b6\u0001\u0000\u0000\u0000"+
		"\u0304\u02bb\u0001\u0000\u0000\u0000\u0304\u02c0\u0001\u0000\u0000\u0000"+
		"\u0304\u02c5\u0001\u0000\u0000\u0000\u0304\u02ca\u0001\u0000\u0000\u0000"+
		"\u0304\u02cf\u0001\u0000\u0000\u0000\u0304\u02d6\u0001\u0000\u0000\u0000"+
		"\u0304\u02db\u0001\u0000\u0000\u0000\u0304\u02e0\u0001\u0000\u0000\u0000"+
		"\u0304\u02e5\u0001\u0000\u0000\u0000\u0304\u02f0\u0001\u0000\u0000\u0000"+
		"\u0304\u02f5\u0001\u0000\u0000\u0000\u0304\u02fa\u0001\u0000\u0000\u0000"+
		"\u0304\u02ff\u0001\u0000\u0000\u0000\u0305S\u0001\u0000\u0000\u0000\u0306"+
		"\u0307\u0005#\u0000\u0000\u0307\u0308\u0003V+\u0000\u0308U\u0001\u0000"+
		"\u0000\u0000\u0309\u030a\u0005\u00ad\u0000\u0000\u030a\u030b\u0005\u0001"+
		"\u0000\u0000\u030b\u030c\u0003\n\u0005\u0000\u030c\u030d\u0005\u0002\u0000"+
		"\u0000\u030d\u030e\u0003\n\u0005\u0000\u030e\u030f\u0005\u0002\u0000\u0000"+
		"\u030f\u0310\u0003\n\u0005\u0000\u0310\u0311\u0005\u0002\u0000\u0000\u0311"+
		"\u0312\u0003\n\u0005\u0000\u0312\u0313\u0005\u0003\u0000\u0000\u0313\u03da"+
		"\u0001\u0000\u0000\u0000\u0314\u0315\u0005\u00aa\u0000\u0000\u0315\u0316"+
		"\u0005\u0001\u0000\u0000\u0316\u0317\u0003\n\u0005\u0000\u0317\u0318\u0005"+
		"\u0002\u0000\u0000\u0318\u0319\u0003\n\u0005\u0000\u0319\u031a\u0005\u0002"+
		"\u0000\u0000\u031a\u031b\u0003\n\u0005\u0000\u031b\u031d\u0005\u0003\u0000"+
		"\u0000\u031c\u031e\u0003X,\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031d"+
		"\u031e\u0001\u0000\u0000\u0000\u031e\u03da\u0001\u0000\u0000\u0000\u031f"+
		"\u0320\u0005\u00ab\u0000\u0000\u0320\u0321\u0005\u0001\u0000\u0000\u0321"+
		"\u0322\u0003\n\u0005\u0000\u0322\u0323\u0005\u0002\u0000\u0000\u0323\u0324"+
		"\u0003\n\u0005\u0000\u0324\u0325\u0005\u0002\u0000\u0000\u0325\u0326\u0003"+
		"\n\u0005\u0000\u0326\u0327\u0005\u0002\u0000\u0000\u0327\u0328\u0003\n"+
		"\u0005\u0000\u0328\u032a\u0005\u0003\u0000\u0000\u0329\u032b\u0003X,\u0000"+
		"\u032a\u0329\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000"+
		"\u032b\u03da\u0001\u0000\u0000\u0000\u032c\u032d\u0005\u00ac\u0000\u0000"+
		"\u032d\u032e\u0005\u0001\u0000\u0000\u032e\u032f\u0003\n\u0005\u0000\u032f"+
		"\u0330\u0005\u0002\u0000\u0000\u0330\u0331\u0003\n\u0005\u0000\u0331\u0332"+
		"\u0005\u0002\u0000\u0000\u0332\u0333\u0003\n\u0005\u0000\u0333\u0334\u0005"+
		"\u0002\u0000\u0000\u0334\u0335\u0003\n\u0005\u0000\u0335\u0336\u0005\u0002"+
		"\u0000\u0000\u0336\u0337\u0003\n\u0005\u0000\u0337\u0339\u0005\u0003\u0000"+
		"\u0000\u0338\u033a\u0003X,\u0000\u0339\u0338\u0001\u0000\u0000\u0000\u0339"+
		"\u033a\u0001\u0000\u0000\u0000\u033a\u03da\u0001\u0000\u0000\u0000\u033b"+
		"\u033c\u0005\u00a4\u0000\u0000\u033c\u033d\u0005\u0001\u0000\u0000\u033d"+
		"\u033e\u0003\n\u0005\u0000\u033e\u033f\u0005\u0002\u0000\u0000\u033f\u0340"+
		"\u0003\n\u0005\u0000\u0340\u0341\u0005\u0002\u0000\u0000\u0341\u0342\u0003"+
		"\n\u0005\u0000\u0342\u0344\u0005\u0003\u0000\u0000\u0343\u0345\u0003X"+
		",\u0000\u0344\u0343\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000"+
		"\u0000\u0345\u03da\u0001\u0000\u0000\u0000\u0346\u0347\u0005\u00a6\u0000"+
		"\u0000\u0347\u0348\u0005\u0001\u0000\u0000\u0348\u0349\u0003\n\u0005\u0000"+
		"\u0349\u034a\u0005\u0002\u0000\u0000\u034a\u034b\u0003\n\u0005\u0000\u034b"+
		"\u034c\u0005\u0002\u0000\u0000\u034c\u034d\u0003\n\u0005\u0000\u034d\u034e"+
		"\u0005\u0002\u0000\u0000\u034e\u034f\u0003\n\u0005\u0000\u034f\u0351\u0005"+
		"\u0003\u0000\u0000\u0350\u0352\u0003X,\u0000\u0351\u0350\u0001\u0000\u0000"+
		"\u0000\u0351\u0352\u0001\u0000\u0000\u0000\u0352\u03da\u0001\u0000\u0000"+
		"\u0000\u0353\u0354\u0005\u00a2\u0000\u0000\u0354\u0355\u0005\u0001\u0000"+
		"\u0000\u0355\u0356\u0003\n\u0005\u0000\u0356\u0357\u0005\u0002\u0000\u0000"+
		"\u0357\u0358\u0003\n\u0005\u0000\u0358\u0359\u0005\u0002\u0000\u0000\u0359"+
		"\u035a\u0003\n\u0005\u0000\u035a\u035b\u0005\u0002\u0000\u0000\u035b\u035c"+
		"\u0003\n\u0005\u0000\u035c\u035d\u0005\u0002\u0000\u0000\u035d\u035e\u0003"+
		"\n\u0005\u0000\u035e\u035f\u0005\u0002\u0000\u0000\u035f\u0362\u0003\n"+
		"\u0005\u0000\u0360\u0361\u0005\u0002\u0000\u0000\u0361\u0363\u0007\u0015"+
		"\u0000\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000"+
		"\u0000\u0000\u0363\u0364\u0001\u0000\u0000\u0000\u0364\u0366\u0005\u0003"+
		"\u0000\u0000\u0365\u0367\u0003X,\u0000\u0366\u0365\u0001\u0000\u0000\u0000"+
		"\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u03da\u0001\u0000\u0000\u0000"+
		"\u0368\u0369\u0005\u00a9\u0000\u0000\u0369\u036a\u0005\u0001\u0000\u0000"+
		"\u036a\u036b\u0003\n\u0005\u0000\u036b\u036c\u0005\u0002\u0000\u0000\u036c"+
		"\u036d\u0003\n\u0005\u0000\u036d\u036e\u0005\u0002\u0000\u0000\u036e\u036f"+
		"\u0003\n\u0005\u0000\u036f\u0370\u0005\u0002\u0000\u0000\u0370\u0371\u0003"+
		"\n\u0005\u0000\u0371\u0372\u0005\u0002\u0000\u0000\u0372\u0373\u0003\n"+
		"\u0005\u0000\u0373\u0375\u0005\u0003\u0000\u0000\u0374\u0376\u0003X,\u0000"+
		"\u0375\u0374\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000"+
		"\u0376\u03da\u0001\u0000\u0000\u0000\u0377\u0378\u0005\u00a7\u0000\u0000"+
		"\u0378\u0379\u0005\u0001\u0000\u0000\u0379\u037a\u0003\n\u0005\u0000\u037a"+
		"\u037b\u0005\u0002\u0000\u0000\u037b\u037c\u0003\n\u0005\u0000\u037c\u037d"+
		"\u0005\u0002\u0000\u0000\u037d\u037e\u0003\n\u0005\u0000\u037e\u037f\u0005"+
		"\u0002\u0000\u0000\u037f\u0380\u0003\n\u0005\u0000\u0380\u0381\u0005\u0002"+
		"\u0000\u0000\u0381\u0382\u0003\n\u0005\u0000\u0382\u0384\u0005\u0003\u0000"+
		"\u0000\u0383\u0385\u0003X,\u0000\u0384\u0383\u0001\u0000\u0000\u0000\u0384"+
		"\u0385\u0001\u0000\u0000\u0000\u0385\u03da\u0001\u0000\u0000\u0000\u0386"+
		"\u0387\u0005\u00a8\u0000\u0000\u0387\u0388\u0005\u0001\u0000\u0000\u0388"+
		"\u0389\u0003\n\u0005\u0000\u0389\u038a\u0005\u0002\u0000\u0000\u038a\u038b"+
		"\u0003\n\u0005\u0000\u038b\u038c\u0005\u0002\u0000\u0000\u038c\u038d\u0003"+
		"\n\u0005\u0000\u038d\u038e\u0005\u0002\u0000\u0000\u038e\u038f\u0003\n"+
		"\u0005\u0000\u038f\u0390\u0005\u0002\u0000\u0000\u0390\u0391\u0003\n\u0005"+
		"\u0000\u0391\u0392\u0005\u0002\u0000\u0000\u0392\u039a\u0003\n\u0005\u0000"+
		"\u0393\u0394\u0005\u0002\u0000\u0000\u0394\u0395\u0003\n\u0005\u0000\u0395"+
		"\u0396\u0005\u0002\u0000\u0000\u0396\u0397\u0003\n\u0005\u0000\u0397\u0399"+
		"\u0001\u0000\u0000\u0000\u0398\u0393\u0001\u0000\u0000\u0000\u0399\u039c"+
		"\u0001\u0000\u0000\u0000\u039a\u0398\u0001\u0000\u0000\u0000\u039a\u039b"+
		"\u0001\u0000\u0000\u0000\u039b\u039d\u0001\u0000\u0000\u0000\u039c\u039a"+
		"\u0001\u0000\u0000\u0000\u039d\u039f\u0005\u0003\u0000\u0000\u039e\u03a0"+
		"\u0003X,\u0000\u039f\u039e\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000"+
		"\u0000\u0000\u03a0\u03da\u0001\u0000\u0000\u0000\u03a1\u03a2\u0005\u00a5"+
		"\u0000\u0000\u03a2\u03a3\u0005\u0001\u0000\u0000\u03a3\u03a4\u0003\n\u0005"+
		"\u0000\u03a4\u03a5\u0005\u0002\u0000\u0000\u03a5\u03a6\u0003\n\u0005\u0000"+
		"\u03a6\u03a7\u0005\u0002\u0000\u0000\u03a7\u03a8\u0003\n\u0005\u0000\u03a8"+
		"\u03a9\u0005\u0002\u0000\u0000\u03a9\u03aa\u0003\n\u0005\u0000\u03aa\u03ab"+
		"\u0005\u0002\u0000\u0000\u03ab\u03ac\u0003\n\u0005\u0000\u03ac\u03ad\u0005"+
		"\u0002\u0000\u0000\u03ad\u03ae\u0003\n\u0005\u0000\u03ae\u03b9\u0005\u0003"+
		"\u0000\u0000\u03af\u03b2\u0003X,\u0000\u03b0\u03b1\u0005\u0002\u0000\u0000"+
		"\u03b1\u03b3\u0003Z-\u0000\u03b2\u03b0\u0001\u0000\u0000\u0000\u03b2\u03b3"+
		"\u0001\u0000\u0000\u0000\u03b3\u03ba\u0001\u0000\u0000\u0000\u03b4\u03b7"+
		"\u0003Z-\u0000\u03b5\u03b6\u0005\u0002\u0000\u0000\u03b6\u03b8\u0003X"+
		",\u0000\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000"+
		"\u0000\u03b8\u03ba\u0001\u0000\u0000\u0000\u03b9\u03af\u0001\u0000\u0000"+
		"\u0000\u03b9\u03b4\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000"+
		"\u0000\u03ba\u03da\u0001\u0000\u0000\u0000\u03bb\u03bc\u0005\u00a3\u0000"+
		"\u0000\u03bc\u03bd\u0005\u0001\u0000\u0000\u03bd\u03be\u0003\n\u0005\u0000"+
		"\u03be\u03bf\u0005\u0002\u0000\u0000\u03bf\u03c0\u0003\n\u0005\u0000\u03c0"+
		"\u03c1\u0005\u0002\u0000\u0000\u03c1\u03c2\u0003\n\u0005\u0000\u03c2\u03c3"+
		"\u0005\u0002\u0000\u0000\u03c3\u03c4\u0003\n\u0005\u0000\u03c4\u03c5\u0005"+
		"\u0002\u0000\u0000\u03c5\u03c6\u0003\n\u0005\u0000\u03c6\u03c7\u0005\u0002"+
		"\u0000\u0000\u03c7\u03c8\u0003\n\u0005\u0000\u03c8\u03c9\u0005\u0002\u0000"+
		"\u0000\u03c9\u03ca\u0003\n\u0005\u0000\u03ca\u03cb\u0005\u0002\u0000\u0000"+
		"\u03cb\u03cc\u0003\n\u0005\u0000\u03cc\u03d7\u0005\u0003\u0000\u0000\u03cd"+
		"\u03d0\u0003X,\u0000\u03ce\u03cf\u0005\u0002\u0000\u0000\u03cf\u03d1\u0003"+
		"Z-\u0000\u03d0\u03ce\u0001\u0000\u0000\u0000\u03d0\u03d1\u0001\u0000\u0000"+
		"\u0000\u03d1\u03d8\u0001\u0000\u0000\u0000\u03d2\u03d5\u0003Z-\u0000\u03d3"+
		"\u03d4\u0005\u0002\u0000\u0000\u03d4\u03d6\u0003X,\u0000\u03d5\u03d3\u0001"+
		"\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6\u03d8\u0001"+
		"\u0000\u0000\u0000\u03d7\u03cd\u0001\u0000\u0000\u0000\u03d7\u03d2\u0001"+
		"\u0000\u0000\u0000\u03d7\u03d8\u0001\u0000\u0000\u0000\u03d8\u03da\u0001"+
		"\u0000\u0000\u0000\u03d9\u0309\u0001\u0000\u0000\u0000\u03d9\u0314\u0001"+
		"\u0000\u0000\u0000\u03d9\u031f\u0001\u0000\u0000\u0000\u03d9\u032c\u0001"+
		"\u0000\u0000\u0000\u03d9\u033b\u0001\u0000\u0000\u0000\u03d9\u0346\u0001"+
		"\u0000\u0000\u0000\u03d9\u0353\u0001\u0000\u0000\u0000\u03d9\u0368\u0001"+
		"\u0000\u0000\u0000\u03d9\u0377\u0001\u0000\u0000\u0000\u03d9\u0386\u0001"+
		"\u0000\u0000\u0000\u03d9\u03a1\u0001\u0000\u0000\u0000\u03d9\u03bb\u0001"+
		"\u0000\u0000\u0000\u03daW\u0001\u0000\u0000\u0000\u03db\u03dc\u0005W\u0000"+
		"\u0000\u03dc\u03e0\u0005N\u0000\u0000\u03dd\u03de\u0005(\u0000\u0000\u03de"+
		"\u03df\u0005W\u0000\u0000\u03df\u03e1\u0005\u0016\u0000\u0000\u03e0\u03dd"+
		"\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u03ea"+
		"\u0001\u0000\u0000\u0000\u03e2\u03e3\u0005W\u0000\u0000\u03e3\u03e7\u0005"+
		"\u0016\u0000\u0000\u03e4\u03e5\u0005(\u0000\u0000\u03e5\u03e6\u0005W\u0000"+
		"\u0000\u03e6\u03e8\u0005N\u0000\u0000\u03e7\u03e4\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e8\u0001\u0000\u0000\u0000\u03e8\u03ea\u0001\u0000\u0000\u0000"+
		"\u03e9\u03db\u0001\u0000\u0000\u0000\u03e9\u03e2\u0001\u0000\u0000\u0000"+
		"\u03eaY\u0001\u0000\u0000\u0000\u03eb\u03ec\u0005@\u0000\u0000\u03ec\u03ed"+
		"\u0007\u0016\u0000\u0000\u03ed[\u0001\u0000\u0000\u0000\u03ee\u03ef\u0005"+
		"#\u0000\u0000\u03ef\u03fa\u0005\u0010\u0000\u0000\u03f0\u03f3\u0003X,"+
		"\u0000\u03f1\u03f2\u0005\u0002\u0000\u0000\u03f2\u03f4\u0003Z-\u0000\u03f3"+
		"\u03f1\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000\u03f4"+
		"\u03fb\u0001\u0000\u0000\u0000\u03f5\u03f8\u0003Z-\u0000\u03f6\u03f7\u0005"+
		"\u0002\u0000\u0000\u03f7\u03f9\u0003X,\u0000\u03f8\u03f6\u0001\u0000\u0000"+
		"\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fb\u0001\u0000\u0000"+
		"\u0000\u03fa\u03f0\u0001\u0000\u0000\u0000\u03fa\u03f5\u0001\u0000\u0000"+
		"\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fc\u0001\u0000\u0000"+
		"\u0000\u03fc\u0400\u0005\u0004\u0000\u0000\u03fd\u03fe\u0003^/\u0000\u03fe"+
		"\u03ff\u0005\u00db\u0000\u0000\u03ff\u0401\u0001\u0000\u0000\u0000\u0400"+
		"\u03fd\u0001\u0000\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402"+
		"\u0400\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403"+
		"\u0404\u0001\u0000\u0000\u0000\u0404\u0405\u0005\u0005\u0000\u0000\u0405"+
		"]\u0001\u0000\u0000\u0000\u0406\u0407\u0005A\u0000\u0000\u0407\u0408\u0005"+
		"\r\u0000\u0000\u0408\u0409\u0003\n\u0005\u0000\u0409\u040a\u0005\u0002"+
		"\u0000\u0000\u040a\u040b\u0003\n\u0005\u0000\u040b\u042e\u0001\u0000\u0000"+
		"\u0000\u040c\u040d\u0005>\u0000\u0000\u040d\u040e\u0005\r\u0000\u0000"+
		"\u040e\u040f\u0003\n\u0005\u0000\u040f\u0410\u0005\u0002\u0000\u0000\u0410"+
		"\u0411\u0003\n\u0005\u0000\u0411\u042e\u0001\u0000\u0000\u0000\u0412\u0413"+
		"\u0005\u001b\u0000\u0000\u0413\u0414\u0005P\u0000\u0000\u0414\u0415\u0005"+
		"\r\u0000\u0000\u0415\u0416\u0003\n\u0005\u0000\u0416\u0417\u0005\u0002"+
		"\u0000\u0000\u0417\u0418\u0003\n\u0005\u0000\u0418\u0419\u0005\u0002\u0000"+
		"\u0000\u0419\u041a\u0003\n\u0005\u0000\u041a\u041b\u0005\u0002\u0000\u0000"+
		"\u041b\u041c\u0003\n\u0005\u0000\u041c\u042e\u0001\u0000\u0000\u0000\u041d"+
		"\u041e\u0005\u001b\u0000\u0000\u041e\u041f\u0005\u001a\u0000\u0000\u041f"+
		"\u0420\u0005\r\u0000\u0000\u0420\u0421\u0003\n\u0005\u0000\u0421\u0422"+
		"\u0005\u0002\u0000\u0000\u0422\u0423\u0003\n\u0005\u0000\u0423\u0424\u0005"+
		"\u0002\u0000\u0000\u0424\u0425\u0003\n\u0005\u0000\u0425\u0426\u0005\u0002"+
		"\u0000\u0000\u0426\u0427\u0003\n\u0005\u0000\u0427\u0428\u0005\u0002\u0000"+
		"\u0000\u0428\u0429\u0003\n\u0005\u0000\u0429\u042a\u0005\u0002\u0000\u0000"+
		"\u042a\u042b\u0003\n\u0005\u0000\u042b\u042e\u0001\u0000\u0000\u0000\u042c"+
		"\u042e\u00052\u0000\u0000\u042d\u0406\u0001\u0000\u0000\u0000\u042d\u040c"+
		"\u0001\u0000\u0000\u0000\u042d\u0412\u0001\u0000\u0000\u0000\u042d\u041d"+
		"\u0001\u0000\u0000\u0000\u042d\u042c\u0001\u0000\u0000\u0000\u042e_\u0001"+
		"\u0000\u0000\u0000\u042f\u0430\u0005Z\u0000\u0000\u0430\u0431\u0005\u00db"+
		"\u0000\u0000\u0431\u0432\u0007\u0017\u0000\u0000\u0432\u0433\u0005\u0001"+
		"\u0000\u0000\u0433\u0434\u0005\u0003\u0000\u0000\u0434a\u0001\u0000\u0000"+
		"\u0000\u0435\u0436\u0003n7\u0000\u0436\u044f\u0005\u00db\u0000\u0000\u0437"+
		"\u0438\u0005|\u0000\u0000\u0438\u0439\u0005\u0001\u0000\u0000\u0439\u0450"+
		"\u0005\u0003\u0000\u0000\u043a\u043b\u0005~\u0000\u0000\u043b\u043c\u0005"+
		"\u0001\u0000\u0000\u043c\u0450\u0005\u0003\u0000\u0000\u043d\u043e\u0005"+
		"z\u0000\u0000\u043e\u043f\u0005\u0001\u0000\u0000\u043f\u0444\u0005\u0003"+
		"\u0000\u0000\u0440\u0441\u0005\u0006\u0000\u0000\u0441\u0442\u0003J%\u0000"+
		"\u0442\u0443\u0005\u0007\u0000\u0000\u0443\u0445\u0001\u0000\u0000\u0000"+
		"\u0444\u0440\u0001\u0000\u0000\u0000\u0444\u0445\u0001\u0000\u0000\u0000"+
		"\u0445\u0450\u0001\u0000\u0000\u0000\u0446\u0447\u0005}\u0000\u0000\u0447"+
		"\u0448\u0005\u0001\u0000\u0000\u0448\u044b\u0003\n\u0005\u0000\u0449\u044a"+
		"\u0005\u0002\u0000\u0000\u044a\u044c\u0003\n\u0005\u0000\u044b\u0449\u0001"+
		"\u0000\u0000\u0000\u044b\u044c\u0001\u0000\u0000\u0000\u044c\u044d\u0001"+
		"\u0000\u0000\u0000\u044d\u044e\u0005\u0003\u0000\u0000\u044e\u0450\u0001"+
		"\u0000\u0000\u0000\u044f\u0437\u0001\u0000\u0000\u0000\u044f\u043a\u0001"+
		"\u0000\u0000\u0000\u044f\u043d\u0001\u0000\u0000\u0000\u044f\u0446\u0001"+
		"\u0000\u0000\u0000\u0450c\u0001\u0000\u0000\u0000\u0451\u0452\u00053\u0000"+
		"\u0000\u0452\u0453\u0005\u0001\u0000\u0000\u0453\u0458\u0005\u00e4\u0000"+
		"\u0000\u0454\u0455\u0005\u0002\u0000\u0000\u0455\u0457\u0003\n\u0005\u0000"+
		"\u0456\u0454\u0001\u0000\u0000\u0000\u0457\u045a\u0001\u0000\u0000\u0000"+
		"\u0458\u0456\u0001\u0000\u0000\u0000\u0458\u0459\u0001\u0000\u0000\u0000"+
		"\u0459\u045b\u0001\u0000\u0000\u0000\u045a\u0458\u0001\u0000\u0000\u0000"+
		"\u045b\u045c\u0005\u0003\u0000\u0000\u045ce\u0001\u0000\u0000\u0000\u045d"+
		"\u0462\u0007\u0018\u0000\u0000\u045e\u045f\u0005\u0006\u0000\u0000\u045f"+
		"\u0460\u0003\n\u0005\u0000\u0460\u0461\u0005\u0007\u0000\u0000\u0461\u0463"+
		"\u0001\u0000\u0000\u0000\u0462\u045e\u0001\u0000\u0000\u0000\u0463\u0464"+
		"\u0001\u0000\u0000\u0000\u0464\u0462\u0001\u0000\u0000\u0000\u0464\u0465"+
		"\u0001\u0000\u0000\u0000\u0465\u046a\u0001\u0000\u0000\u0000\u0466\u0467"+
		"\u0007\u0019\u0000\u0000\u0467\u0468\u0005\u0004\u0000\u0000\u0468\u046a"+
		"\u0005\u0005\u0000\u0000\u0469\u045d\u0001\u0000\u0000\u0000\u0469\u0466"+
		"\u0001\u0000\u0000\u0000\u046ag\u0001\u0000\u0000\u0000\u046b\u046c\u0007"+
		"\u001a\u0000\u0000\u046c\u046d\u0005\u0001\u0000\u0000\u046d\u046e\u0003"+
		"\n\u0005\u0000\u046e\u046f\u0005\u0003\u0000\u0000\u046fi\u0001\u0000"+
		"\u0000\u0000\u0470\u0471\u0005\u00de\u0000\u0000\u0471\u047a\u0005\u0001"+
		"\u0000\u0000\u0472\u0477\u0003\n\u0005\u0000\u0473\u0474\u0005\u0002\u0000"+
		"\u0000\u0474\u0476\u0003\n\u0005\u0000\u0475\u0473\u0001\u0000\u0000\u0000"+
		"\u0476\u0479\u0001\u0000\u0000\u0000\u0477\u0475\u0001\u0000\u0000\u0000"+
		"\u0477\u0478\u0001\u0000\u0000\u0000\u0478\u047b\u0001\u0000\u0000\u0000"+
		"\u0479\u0477\u0001\u0000\u0000\u0000\u047a\u0472\u0001\u0000\u0000\u0000"+
		"\u047a\u047b\u0001\u0000\u0000\u0000\u047b\u047c\u0001\u0000\u0000\u0000"+
		"\u047c\u047d\u0005\u0003\u0000\u0000\u047dk\u0001\u0000\u0000\u0000\u047e"+
		"\u0480\u0005S\u0000\u0000\u047f\u0481\u0003\n\u0005\u0000\u0480\u047f"+
		"\u0001\u0000\u0000\u0000\u0480\u0481\u0001\u0000\u0000\u0000\u0481m\u0001"+
		"\u0000\u0000\u0000\u0482\u0483\u0005\u00dc\u0000\u0000\u0483o\u0001\u0000"+
		"\u0000\u0000\\sy\u0085\u0088\u008f\u009c\u00b2\u00b9\u00bf\u00c2\u00c9"+
		"\u00d1\u00de\u00e7\u00ed\u00f7\u00fe\u0110\u0118\u011c\u0125\u0131\u013a"+
		"\u0144\u014b\u014d\u0157\u0160\u0168\u016f\u0185\u018b\u0199\u01a6\u01ae"+
		"\u01c2\u01c6\u01cb\u01ce\u01d3\u01e0\u01e9\u01ef\u01f5\u020b\u0211\u0213"+
		"\u021b\u0221\u022a\u022f\u0239\u024f\u0290\u02a9\u02ec\u0304\u031d\u032a"+
		"\u0339\u0344\u0351\u0362\u0366\u0375\u0384\u039a\u039f\u03b2\u03b7\u03b9"+
		"\u03d0\u03d5\u03d7\u03d9\u03e0\u03e7\u03e9\u03f3\u03f8\u03fa\u0402\u042d"+
		"\u0444\u044b\u044f\u0458\u0464\u0469\u0477\u047a\u0480";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}