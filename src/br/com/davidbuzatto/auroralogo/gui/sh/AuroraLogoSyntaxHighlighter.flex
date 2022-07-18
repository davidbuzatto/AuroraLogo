/*
 * Generated on 6/23/22, 9:30 PM
 */
package br.com.davidbuzatto.auroralogo.gui.sh;

import java.io.*;
import javax.swing.text.Segment;

import org.fife.ui.rsyntaxtextarea.*;


/**
 * 
 */
%%

%public
%class AuroraLogoSyntaxHighlighter
%extends AbstractJFlexCTokenMaker
%unicode
/* Case sensitive */
%type org.fife.ui.rsyntaxtextarea.Token


%{


	/**
	 * Constructor.  This must be here because JFlex does not generate a
	 * no-parameter constructor.
	 */
	public AuroraLogoSyntaxHighlighter() {
	}


	/**
	 * Adds the token specified to the current linked list of tokens.
	 *
	 * @param tokenType The token's type.
	 * @see #addToken(int, int, int)
	 */
	private void addHyperlinkToken(int start, int end, int tokenType) {
		int so = start + offsetShift;
		addToken(zzBuffer, start,end, tokenType, so, true);
	}


	/**
	 * Adds the token specified to the current linked list of tokens.
	 *
	 * @param tokenType The token's type.
	 */
	private void addToken(int tokenType) {
		addToken(zzStartRead, zzMarkedPos-1, tokenType);
	}


	/**
	 * Adds the token specified to the current linked list of tokens.
	 *
	 * @param tokenType The token's type.
	 * @see #addHyperlinkToken(int, int, int)
	 */
	private void addToken(int start, int end, int tokenType) {
		int so = start + offsetShift;
		addToken(zzBuffer, start,end, tokenType, so, false);
	}


	/**
	 * Adds the token specified to the current linked list of tokens.
	 *
	 * @param array The character array.
	 * @param start The starting offset in the array.
	 * @param end The ending offset in the array.
	 * @param tokenType The token's type.
	 * @param startOffset The offset in the document at which this token
	 *        occurs.
	 * @param hyperlink Whether this token is a hyperlink.
	 */
	public void addToken(char[] array, int start, int end, int tokenType,
						int startOffset, boolean hyperlink) {
		super.addToken(array, start,end, tokenType, startOffset, hyperlink);
		zzStartRead = zzMarkedPos;
	}


	/**
	 * {@inheritDoc}
	 */
	public String[] getLineCommentStartAndEnd(int languageIndex) {
		return new String[] { "//", null };
	}


	/**
	 * Returns the first token in the linked list of tokens generated
	 * from <code>text</code>.  This method must be implemented by
	 * subclasses so they can correctly implement syntax highlighting.
	 *
	 * @param text The text from which to get tokens.
	 * @param initialTokenType The token type we should start with.
	 * @param startOffset The offset into the document at which
	 *        <code>text</code> starts.
	 * @return The first <code>Token</code> in a linked list representing
	 *         the syntax highlighted text.
	 */
	public Token getTokenList(Segment text, int initialTokenType, int startOffset) {

		resetTokenList();
		this.offsetShift = -text.offset + startOffset;

		// Start off in the proper state.
		int state = Token.NULL;
		switch (initialTokenType) {
						case Token.COMMENT_MULTILINE:
				state = MLC;
				start = text.offset;
				break;

						case Token.COMMENT_DOCUMENTATION:
				state = DOCCOMMENT;
				start = text.offset;
				break;

			default:
				state = Token.NULL;
		}

		s = text;
		try {
			yyreset(zzReader);
			yybegin(state);
			return yylex();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return new TokenImpl();
		}

	}


	/**
	 * Refills the input buffer.
	 *
	 * @return      <code>true</code> if EOF was reached, otherwise
	 *              <code>false</code>.
	 */
	private boolean zzRefill() {
		return zzCurrentPos>=s.offset+s.count;
	}


	/**
	 * Resets the scanner to read from a new input stream.
	 * Does not close the old reader.
	 *
	 * All internal variables are reset, the old input stream 
	 * <b>cannot</b> be reused (internal buffer is discarded and lost).
	 * Lexical state is set to <tt>YY_INITIAL</tt>.
	 *
	 * @param reader   the new input stream 
	 */
	public final void yyreset(Reader reader) {
		// 's' has been updated.
		zzBuffer = s.array;
		/*
		 * We replaced the line below with the two below it because zzRefill
		 * no longer "refills" the buffer (since the way we do it, it's always
		 * "full" the first time through, since it points to the segment's
		 * array).  So, we assign zzEndRead here.
		 */
		//zzStartRead = zzEndRead = s.offset;
		zzStartRead = s.offset;
		zzEndRead = zzStartRead + s.count - 1;
		zzCurrentPos = zzMarkedPos = zzPushbackPos = s.offset;
		zzLexicalState = YYINITIAL;
		zzReader = reader;
		zzAtBOL  = true;
		zzAtEOF  = false;
	}


%}

Letter							= [A-Za-z]
LetterOrUnderscore				= ({Letter}|"_")
NonzeroDigit						= [1-9]
Digit							= ("0"|{NonzeroDigit})
HexDigit							= ({Digit}|[A-Fa-f])
OctalDigit						= ([0-7])
AnyCharacterButApostropheOrBackSlash	= ([^\\'])
AnyCharacterButDoubleQuoteOrBackSlash	= ([^\\\"\n])
EscapedSourceCharacter				= ("u"{HexDigit}{HexDigit}{HexDigit}{HexDigit})
Escape							= ("\\"(([btnfr\"'\\])|([0123]{OctalDigit}?{OctalDigit}?)|({OctalDigit}{OctalDigit}?)|{EscapedSourceCharacter}))
NonSeparator						= ([^\t\f\r\n\ \(\)\{\}\[\]\;\,\.\=\>\<\!\~\?\:\+\-\*\/\&\|\^\%\"\']|"#"|"\\")
IdentifierStart					= ({LetterOrUnderscore}|"$")
IdentifierPart						= ({IdentifierStart}|{Digit}|("\\"{EscapedSourceCharacter}))

LineTerminator				= (\n)
WhiteSpace				= ([ \t\f]+)

CharLiteral	= ([\']({AnyCharacterButApostropheOrBackSlash}|{Escape})[\'])
UnclosedCharLiteral			= ([\'][^\'\n]*)
ErrorCharLiteral			= ({UnclosedCharLiteral}[\'])
StringLiteral				= ([\"]({AnyCharacterButDoubleQuoteOrBackSlash}|{Escape})*[\"])
UnclosedStringLiteral		= ([\"]([\\].|[^\\\"])*[^\"]?)
ErrorStringLiteral			= ({UnclosedStringLiteral}[\"])

MLCBegin					= "/*"
MLCEnd					= "*/"

DocCommentBegin	= "/**"
DocCommentEnd		= "*/"

LineCommentBegin			= "//"

IntegerLiteral			= ({Digit}+)
HexLiteral			= (#{HexDigit}+)
FloatLiteral			= (({Digit}+)("."{Digit}+)?(e[+-]?{Digit}+)? | ({Digit}+)?("."{Digit}+)(e[+-]?{Digit}+)?)
ErrorNumberFormat			= (({IntegerLiteral}|{HexLiteral}|{FloatLiteral}){NonSeparator}+)


Separator					= ([\(\)\{\}\[\]])
Separator2				= ([\;,.])

Identifier				= ({IdentifierStart}{IdentifierPart}*)

URLGenDelim				= ([:\/\?#\[\]@])
URLSubDelim				= ([\!\$&'\(\)\*\+,;=])
URLUnreserved			= ({LetterOrUnderscore}|{Digit}|[\-\.\~])
URLCharacter			= ({URLGenDelim}|{URLSubDelim}|{URLUnreserved}|[%])
URLCharacters			= ({URLCharacter}*)
URLEndCharacter			= ([\/\$]|{Letter}|{Digit})
URL						= (((https?|f(tp|ile))"://"|"www.")({URLCharacters}{URLEndCharacter})?)


/* No string state */
/* No char state */
%state MLC
%state DOCCOMMENT
%state EOL_COMMENT

%%

<YYINITIAL> {

	/* Keywords */
	"ABERTO " | 
"ABERTO" | 
"CORDA " | 
"CORDA" | 
"FALSO " | 
"FALSO" | 
"PI " | 
"PI" | 
"PIZZA " | 
"PIZZA" | 
"VERDADEIRO " | 
"VERDADEIRO" | 
"a " | 
"a" | 
"abaixar " | 
"abaixar" | 
"alterar " | 
"alterar" | 
"amarelo " | 
"amarelo" | 
"at\u00E9 " | 
"at\u00E9" | 
"azul " | 
"azul" | 
"baixo " | 
"baixo" | 
"branco " | 
"branco" | 
"c\u00FAbica " | 
"c\u00FAbica" | 
"cada " | 
"cada" | 
"caminho " | 
"caminho" | 
"ciano " | 
"ciano" | 
"cima " | 
"cima" | 
"cinza " | 
"cinza" | 
"claro " | 
"claro" | 
"com " | 
"com" | 
"continuar " | 
"continuar" | 
"contorno " | 
"contorno" | 
"controle " | 
"controle" | 
"controles " | 
"controles" | 
"cor " | 
"cor" | 
"criarArranjo " | 
"criarArranjo" | 
"criarArranjoAssociativo " | 
"criarArranjoAssociativo" | 
"criarArray " | 
"criarArray" | 
"criarArrayAssociativo " | 
"criarArrayAssociativo" | 
"curva " | 
"curva" | 
"de " | 
"de" | 
"decrementando " | 
"decrementando" | 
"desengrossar " | 
"desengrossar" | 
"desenhar " | 
"desenhar" | 
"di\u00E1logo " | 
"di\u00E1logo" | 
"direita " | 
"direita" | 
"dividindo " | 
"dividindo" | 
"do " | 
"do" | 
"e " | 
"e" | 
"em " | 
"em" | 
"engrossar " | 
"engrossar" | 
"enquanto " | 
"enquanto" | 
"ent\u00E3o " | 
"ent\u00E3o" | 
"escolha " | 
"escolha" | 
"escrever " | 
"escrever" | 
"escuro " | 
"escuro" | 
"esquerda " | 
"esquerda" | 
"fechar " | 
"fechar" | 
"formatarTexto " | 
"formatarTexto" | 
"fun\u00E7\u00E3o " | 
"fun\u00E7\u00E3o" | 
"fundo " | 
"fundo" | 
"girar " | 
"girar" | 
"graus " | 
"graus" | 
"grossura " | 
"grossura" | 
"incrementando " | 
"incrementando" | 
"iniciar " | 
"iniciar" | 
"laranja " | 
"laranja" | 
"ler " | 
"ler" | 
"levantar " | 
"levantar" | 
"limpar " | 
"limpar" | 
"linha " | 
"linha" | 
"magenta " | 
"magenta" | 
"mensagem " | 
"mensagem" | 
"mostrar " | 
"mostrar" | 
"mover " | 
"mover" | 
"multiplicando " | 
"multiplicando" | 
"na " | 
"na" | 
"no " | 
"no" | 
"padr\u00E3o " | 
"padr\u00E3o" | 
"para " | 
"para" | 
"parar " | 
"parar" | 
"passo " | 
"passo" | 
"pincel " | 
"pincel" | 
"por " | 
"por" | 
"preenchimento " | 
"preenchimento" | 
"preto " | 
"preto" | 
"pulando " | 
"pulando" | 
"quadr\u00E1tica " | 
"quadr\u00E1tica" | 
"radianos " | 
"radianos" | 
"repetir " | 
"repetir" | 
"retornar " | 
"retornar" | 
"rosa " | 
"rosa" | 
"sa\u00EDda " | 
"sa\u00EDda" | 
"se " | 
"se" | 
"sem " | 
"sem" | 
"sen\u00E3o " | 
"sen\u00E3o" | 
"somando " | 
"somando" | 
"subtraindo " | 
"subtraindo" | 
"tartaruga " | 
"tartaruga" | 
"terminar " | 
"terminar" | 
"tipo " | 
"tipo" | 
"trocar " | 
"trocar" | 
"usando " | 
"usando" | 
"v\u00E1 " | 
"v\u00E1" | 
"verde " | 
"verde" | 
"vermelho " | 
"vermelho" | 
"vez " | 
"vez" | 
"vezes " | 
"vezes"		{ addToken(Token.RESERVED_WORD); }

	/* Keywords 2 (just an optional set of keywords colored differently) */
	/* No keywords 2 */
        "\u00E2ngulo " | 
"\u00E2ngulo" | 
"caracteres " | 
"caracteres" | 
"chaves " | 
"chaves" | 
"comprimento " | 
"comprimento" | 
"corDoFundo " | 
"corDoFundo" | 
"corDoPincel " | 
"corDoPincel" | 
"corDoPreenchimento " | 
"corDoPreenchimento" | 
"corPr\u00F3pria " | 
"corPr\u00F3pria" | 
"est\u00E1Desenhando " | 
"est\u00E1Desenhando" | 
"grossuraDoPincel " | 
"grossuraDoPincel" | 
"substring " | 
"substring" | 
"x " | 
"x" | 
"y " | 
"y"               { addToken(Token.RESERVED_WORD_2); }

	/* Data types */
	/* No data types */

	/* Functions */
	"arco " | 
"arco" | 
"arco( " | 
"arco() " | 
"arcoCosseno " | 
"arcoCosseno" | 
"arcoCosseno( " | 
"arcoCosseno() " | 
"arcoSeno " | 
"arcoSeno" | 
"arcoSeno( " | 
"arcoSeno() " | 
"arcoTangente " | 
"arcoTangente" | 
"arcoTangente( " | 
"arcoTangente() " | 
"arredondar " | 
"arredondar" | 
"arredondar( " | 
"arredondar() " | 
"c\u00EDrculo " | 
"c\u00EDrculo" | 
"c\u00EDrculo( " | 
"c\u00EDrculo() " | 
"cartesianoParaPolar " | 
"cartesianoParaPolar" | 
"cartesianoParaPolar( " | 
"cartesianoParaPolar() " | 
"ch\u00E3o " | 
"ch\u00E3o" | 
"ch\u00E3o( " | 
"ch\u00E3o() " | 
"cosseno " | 
"cosseno" | 
"cosseno( " | 
"cosseno() " | 
"cossenoHiperb\u00F3lico " | 
"cossenoHiperb\u00F3lico" | 
"cossenoHiperb\u00F3lico( " | 
"cossenoHiperb\u00F3lico() " | 
"curvaC\u00FAbica " | 
"curvaC\u00FAbica" | 
"curvaC\u00FAbica( " | 
"curvaC\u00FAbica() " | 
"curvaQuadr\u00E1tica " | 
"curvaQuadr\u00E1tica" | 
"curvaQuadr\u00E1tica( " | 
"curvaQuadr\u00E1tica() " | 
"decrementar " | 
"decrementar" | 
"decrementar( " | 
"decrementar() " | 
"definirSementeAleat\u00F3ria " | 
"definirSementeAleat\u00F3ria" | 
"definirSementeAleat\u00F3ria( " | 
"definirSementeAleat\u00F3ria() " | 
"elipse " | 
"elipse" | 
"elipse( " | 
"elipse() " | 
"estrela " | 
"estrela" | 
"estrela( " | 
"estrela() " | 
"grausParaRadianos " | 
"grausParaRadianos" | 
"grausParaRadianos( " | 
"grausParaRadianos() " | 
"hipotenusa " | 
"hipotenusa" | 
"hipotenusa( " | 
"hipotenusa() " | 
"incrementar " | 
"incrementar" | 
"incrementar( " | 
"incrementar() " | 
"logar\u00EDtmo " | 
"logar\u00EDtmo" | 
"logar\u00EDtmo( " | 
"logar\u00EDtmo() " | 
"m\u00E1ximo " | 
"m\u00E1ximo" | 
"m\u00E1ximo( " | 
"m\u00E1ximo() " | 
"m\u00EDnimo " | 
"m\u00EDnimo" | 
"m\u00EDnimo( " | 
"m\u00EDnimo() " | 
"n\u00FAmeroAleat\u00F3rio " | 
"n\u00FAmeroAleat\u00F3rio" | 
"n\u00FAmeroAleat\u00F3rio( " | 
"n\u00FAmeroAleat\u00F3rio() " | 
"pol\u00EDgono " | 
"pol\u00EDgono" | 
"pol\u00EDgono( " | 
"pol\u00EDgono() " | 
"pol\u00EDgonoRegular " | 
"pol\u00EDgonoRegular" | 
"pol\u00EDgonoRegular( " | 
"pol\u00EDgonoRegular() " | 
"pot\u00EAncia " | 
"pot\u00EAncia" | 
"pot\u00EAncia( " | 
"pot\u00EAncia() " | 
"quadrado " | 
"quadrado" | 
"quadrado( " | 
"quadrado() " | 
"radianosParaGraus " | 
"radianosParaGraus" | 
"radianosParaGraus( " | 
"radianosParaGraus() " | 
"raiz " | 
"raiz" | 
"raiz( " | 
"raiz() " | 
"raizC\u00FAbica " | 
"raizC\u00FAbica" | 
"raizC\u00FAbica( " | 
"raizC\u00FAbica() " | 
"raizQuadrada " | 
"raizQuadrada" | 
"raizQuadrada( " | 
"raizQuadrada() " | 
"ret\u00E2ngulo " | 
"ret\u00E2ngulo" | 
"ret\u00E2ngulo( " | 
"ret\u00E2ngulo() " | 
"ret\u00E2nguloArredondado " | 
"ret\u00E2nguloArredondado" | 
"ret\u00E2nguloArredondado( " | 
"ret\u00E2nguloArredondado() " | 
"segmento " | 
"segmento" | 
"segmento( " | 
"segmento() " | 
"seno " | 
"seno" | 
"seno( " | 
"seno() " | 
"senoHiperb\u00F3lico " | 
"senoHiperb\u00F3lico" | 
"senoHiperb\u00F3lico( " | 
"senoHiperb\u00F3lico() " | 
"tangente " | 
"tangente" | 
"tangente( " | 
"tangente() " | 
"tangenteHiperb\u00F3lica " | 
"tangenteHiperb\u00F3lica" | 
"tangenteHiperb\u00F3lica( " | 
"tangenteHiperb\u00F3lica() " | 
"teto " | 
"teto" | 
"teto( " | 
"teto() " | 
"valorAbsoluto " | 
"valorAbsoluto" | 
"valorAbsoluto( " | 
"valorAbsoluto() "		{ addToken(Token.FUNCTION); }

	

	{LineTerminator}				{ addNullToken(); return firstToken; }

	{Identifier}					{ addToken(Token.IDENTIFIER); }

	{WhiteSpace}					{ addToken(Token.WHITESPACE); }

	/* String/Character literals. */
	{CharLiteral}				{ addToken(Token.LITERAL_CHAR); }
{UnclosedCharLiteral}		{ addToken(Token.ERROR_CHAR); addNullToken(); return firstToken; }
{ErrorCharLiteral}			{ addToken(Token.ERROR_CHAR); }
	{StringLiteral}				{ addToken(Token.LITERAL_STRING_DOUBLE_QUOTE); }
{UnclosedStringLiteral}		{ addToken(Token.ERROR_STRING_DOUBLE); addNullToken(); return firstToken; }
{ErrorStringLiteral}			{ addToken(Token.ERROR_STRING_DOUBLE); }

	/* Comment literals. */
	{MLCBegin}	{ start = zzMarkedPos-2; yybegin(MLC); }
	{DocCommentBegin}	{ start = zzMarkedPos-3; yybegin(DOCCOMMENT); }
	{LineCommentBegin}			{ start = zzMarkedPos-2; yybegin(EOL_COMMENT); }

	/* Separators. */
	{Separator}					{ addToken(Token.SEPARATOR); }
	{Separator2}					{ addToken(Token.IDENTIFIER); }

	/* Operators. */
" ." | 
" ." | 
"! " | 
"!" | 
"!= " | 
"!=" | 
"% " | 
"%" | 
"%<- " | 
"%<-" | 
"%= " | 
"%=" | 
"&& " | 
"&&" | 
"* " | 
"*" | 
"*<- " | 
"*<-" | 
"*= " | 
"*=" | 
"+ " | 
"+" | 
"+<- " | 
"+<-" | 
"+= " | 
"+=" | 
"- " | 
"-" | 
"-<- " | 
"-<-" | 
"-= " | 
"-=" | 
"/ " | 
"/" | 
"/<- " | 
"/<-" | 
"/= " | 
"/=" | 
"< " | 
"<" | 
"<- " | 
"<-" | 
"<= " | 
"<=" | 
"= " | 
"=" | 
"== " | 
"==" | 
"> " | 
">" | 
">= " | 
">=" | 
"E " | 
"E" | 
"N\u00C3O " | 
"N\u00C3O" | 
"OU " | 
"OU" | 
"\u00E9 diferente de " | 
"\u00E9 diferente de" | 
"\u00E9 igual a " | 
"\u00E9 igual a" | 
"\u00E9 maior ou igual a " | 
"\u00E9 maior ou igual a" | 
"\u00E9 maior que " | 
"\u00E9 maior que" | 
"\u00E9 menor ou igual a " | 
"\u00E9 menor ou igual a" | 
"\u00E9 menor que " | 
"\u00E9 menor que" | 
"dividido por " | 
"dividido por" | 
"mais " | 
"mais" | 
"menos " | 
"menos" | 
"n\u00E3o \u00E9 diferente de " | 
"n\u00E3o \u00E9 diferente de" | 
"n\u00E3o \u00E9 igual a " | 
"n\u00E3o \u00E9 igual a" | 
"n\u00E3o \u00E9 maior ou igual a " | 
"n\u00E3o \u00E9 maior ou igual a" | 
"n\u00E3o \u00E9 maior que " | 
"n\u00E3o \u00E9 maior que" | 
"n\u00E3o \u00E9 menor ou igual a " | 
"n\u00E3o \u00E9 menor ou igual a" | 
"n\u00E3o \u00E9 menor que " | 
"n\u00E3o \u00E9 menor que" | 
"resto " | 
"resto" | 
"|| " | 
"||"		{ addToken(Token.OPERATOR); }

	/* Numbers */
	{IntegerLiteral}				{ addToken(Token.LITERAL_NUMBER_DECIMAL_INT); }
	{HexLiteral}					{ addToken(Token.LITERAL_NUMBER_HEXADECIMAL); }
	{FloatLiteral}					{ addToken(Token.LITERAL_NUMBER_FLOAT); }
	{ErrorNumberFormat}			{ addToken(Token.ERROR_NUMBER_FORMAT); }

	/* Ended with a line not in a string or comment. */
	<<EOF>>						{ addNullToken(); return firstToken; }

	/* Catch any other (unhandled) characters. */
	.							{ addToken(Token.IDENTIFIER); }

}


/* No char state */

/* No string state */

<MLC> {

	[^hwf\n*]+				{}
	{URL}					{ int temp=zzStartRead; addToken(start,zzStartRead-1, Token.COMMENT_MULTILINE); addHyperlinkToken(temp,zzMarkedPos-1, Token.COMMENT_MULTILINE); start = zzMarkedPos; }
	[hwf]					{}

	\n						{ addToken(start,zzStartRead-1, Token.COMMENT_MULTILINE); return firstToken; }
	{MLCEnd}					{ yybegin(YYINITIAL); addToken(start,zzStartRead+2-1, Token.COMMENT_MULTILINE); }
	"*"						{}
	<<EOF>>					{ addToken(start,zzStartRead-1, Token.COMMENT_MULTILINE); return firstToken; }

}


<DOCCOMMENT> {

	[^hwf\n*]+				{}
	{URL}					{ int temp=zzStartRead; addToken(start,zzStartRead-1, Token.COMMENT_DOCUMENTATION); addHyperlinkToken(temp,zzMarkedPos-1, Token.COMMENT_DOCUMENTATION); start = zzMarkedPos; }
	[hwf]					{}

	\n						{ addToken(start,zzStartRead-1, Token.COMMENT_DOCUMENTATION); return firstToken; }
	{DocCommentEnd}			{ yybegin(YYINITIAL); addToken(start,zzStartRead+2-1, Token.COMMENT_DOCUMENTATION); }
	"*"						{}
	<<EOF>>					{ yybegin(YYINITIAL); addToken(start,zzEndRead, Token.COMMENT_DOCUMENTATION); return firstToken; }

}


<EOL_COMMENT> {
	[^hwf\n]+				{}
	{URL}					{ int temp=zzStartRead; addToken(start,zzStartRead-1, Token.COMMENT_EOL); addHyperlinkToken(temp,zzMarkedPos-1, Token.COMMENT_EOL); start = zzMarkedPos; }
	[hwf]					{}
	\n						{ addToken(start,zzStartRead-1, Token.COMMENT_EOL); addNullToken(); return firstToken; }
	<<EOF>>					{ addToken(start,zzStartRead-1, Token.COMMENT_EOL); addNullToken(); return firstToken; }
}

