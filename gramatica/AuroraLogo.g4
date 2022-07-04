/**
 * Gramática da linguagem didática AuroraLogo.
 * 
 * Desenvolvido por Prof. Dr. David Buzatto
 */

grammar AuroraLogo;

prog : inst+ ;

inst : ains DOT
     | se
     | repetir
     | repetirEnquanto
     ;

ains : movimentar
     | trocarCor
     | girar
     | engrossar
     | desengrossar
     | trocarGrossura
     | escrever
     | ler
     | atribuir
     | abaixar
     | levantar
     | limpar
     ;

// regras para construção de expressões aritméticas, relacionais e lógicas
expr     : relacao ( ( ELG | ELGT | OLG | OLGT ) relacao )*
         ;

relacao  : exprSimp ( opRel=( IGU | IGUT | IGUA
                            | DIF | DIFT | DIFA
                            | ME  | MET  | MEA
                            | MEI | MEIT | MEIA
                            | MA  | MAT  | MAA
                            | MAI | MAIT | MAIA ) exprSimp )?
         ;

exprSimp : opNeg=( ADI | ADIA 
                 | SUB | SUBA )? termo ( ( ADI | ADIA 
                                         | SUB | SUBA ) termo )*
         ;

termo    : fator ( ( MUL | VEZS
                   | DIV | DIVA POR
                   | MOD | MODA      ) fator )*
         ;

fator    : ( NAO | NAOT ) fator      # fatorNao
         | INT                       # fatorInt
         | DEC                       # fatorDec
         | PI                        # fatorPi
         | ( bool | ID )             # fatorId          // atenção, literais booleanos aqui!
         | CHAR                      # fatorChar
         | STRING                    # fatorString
         | funcaoMatematica          # fatorFuncaoMatematica
         | '(' expr ')'              # fatorParenteses
         ;

exprBool : expr
         ;

bool     : VER | FAL
         ;

// regras para os construtos da linguagem
// se .. senão se .. senão
se           : seSe seSenaoSe seSenao
             ;

seSe         : SE  exprBool ENT '{' inst+ '}'
             ;

seSenaoSe    : seSenaoSeP*
             ;

seSenaoSeP   : SEN SE exprBool ENT '{' inst+ '}'
             ;

seSenao      : ( SEN              '{' inst+ '}' )?
             ;

// repetir vezes
repetir      : REP expr ( VEZ | VEZS ) '{' inst+ '}'
             ;

// enquanto --- repetir
repetirEnquanto   : ( ENQ exprBool )? REP '{' inst+ '}'
                  ;

// regras para instruções de ação
movimentar   : VA PARA ( DIR | ESQ | CIM | BAI ) ( EM expr )?   # movimentarDirecao
             | VA PARA '(' expr ',' expr ')'                    # movimentarPonto
             ;

trocarCor    : TROC COR PARA        configuracaoCor # trocarCorPincel
             | TROC COR DO FUN PARA configuracaoCor # trocarCorFundo
             ;

configuracaoCor : ( HEX | cor=( PRETO
                                         | AZUL
                                         | CIANO
                                         | CINZA
                                         | VERDE
                                         | MAGENTA
                                         | LARANJA
                                         | ROSA 
                                         | VERMELHO
                                         | BRANCO
                                         | AMARELO ) ) ( ( expr ( VEZ | VEZS ) )? ( CLARO | ESCURO ) )?
                ;

girar        : GIR ( EM expr GRA )?
             ;

engrossar    : ENG ( EM expr )?
             ;

desengrossar : DES ( EM expr )?
             ;

trocarGrossura  : TROC GROS PARA expr
                ;

escrever     : ESC expr ( NA SAI )?
             ;

ler          : LER ID
             ;

atribuir     : ID ( ATR | ATRA ) expr
             ;

abaixar      : ABA PINC
             ;

levantar     : LEV PINC
             ;

limpar       : LIM
             ;

funcaoMatematica : F_VABS '(' expr ')'                            # funcaoAbsoluto
                 | F_RAIQ '(' expr ')'                            # funcaoRaizQuadrada
                 | F_RAIC '(' expr ')'                            # funcaoRaizCubica
                 | F_RAIZ '(' expr ',' expr ')'                   # funcaoRaiz
                 | F_POTE '(' expr ',' expr ')'                   # funcaoPotencia
                 | F_HIPO '(' expr ',' expr ')'                   # funcaoHipotenusa
                 | F_CHAO '(' expr ')'                            # funcaoChao
                 | F_TETO '(' expr ')'                            # funcaoTeto
                 | F_ARRE '(' ( expr | expr ',' expr ) ')'        # funcaoArredondar
                 | F_MINI '(' expr ',' expr ')'                   # funcaoMinimo
                 | F_MAXI '(' expr ',' expr ')'                   # funcaoMaximo
                 | F_NUMA '(' ( expr | expr ',' expr )? ')'       # funcaoNumeroAleatorio
                 | F_SENO '(' expr ')'                            # funcaoSeno
                 | F_COSS '(' expr ')'                            # funcaoCosseno
                 | F_TANG '(' expr ')'                            # funcaoTangente
                 | F_ASEN '(' expr ')'                            # funcaoArcoSeno
                 | F_ACOS '(' expr ')'                            # funcaoArcoCosseno
                 | F_ATAN '(' expr ')'                            # funcaoArcoTangente
                 | F_CAPO '(' expr ',' expr ')'                   # funcaoCartesianoParaPolar
                 | F_SENH '(' expr ')'                            # funcaoSenoHiperbolico
                 | F_COSH '(' expr ')'                            # funcaoCossenoHiperbolico
                 | F_TANH '(' expr ')'                            # funcaoTangenteHiperbolica
                 | F_LOGA '(' ( expr | expr ',' expr ) ')'        # funcaoLogaritmo
                 | F_GRRA '(' expr ')'                            # funcaoGrausParaRadianos
                 | F_RAGR '(' expr ')'                            # funcaoRadianosParaGraus
                 ;


fragment
LET : [a-zA-Z] ;

fragment
DIG : [0-9] ;

fragment
DHX : [0-9a-fA-F] ;

fragment
ESCC : '\\' ( ["\\/bfnrt] | UNICODE ) ;

fragment
UNICODE : 'u' DHX DHX DHX DHX ;

// palavras chave
// á = \u00E1
// í = \u00ed
VA   : 'v\u00E1'                  ;
PARA : 'para'                     ;
EM   : 'em'                       ;
DIR  : 'direita'                  ;
ESQ  : 'esquerda'                 ;
CIM  : 'cima'                     ;
BAI  : 'baixo'                    ;
TROC : 'trocar'                   ;
COR  : 'cor'                      ;
DO   : 'do'                       ;
FUN  : 'fundo'                    ;
GIR  : 'girar'                    ;
GRA  : 'graus'                    ;
ENG  : 'engrossar'                ;
DES  : 'desengrossar'             ;
GROS : 'grossura'                 ;
ESC  : 'escrever'                 ;
LER  : 'ler'                      ;
ABA  : 'abaixar'                  ;
LEV  : 'levantar'                 ;
PINC : 'pincel'                   ;
LIM  : 'limpar'                   ;
SE   : 'se'                       ;
ENT  : 'ent\u00E3o'               ;
SEN  : 'sen\u00E3o'               ;
ENQ  : 'enquanto'                 ;
REP  : 'repetir'                  ;
VEZ  : 'vez'                      ;
VEZS : 'vezes'                    ;
NA   : 'na'                       ;
SAI  : 'sa\u00EDda'               ;
PI   : 'PI'                       ;
VER  : 'VERDADEIRO'               ;
FAL  : 'FALSO'                    ;


// constantes para cores
PRETO    : 'preto'    ;
AZUL     : 'azul'     ;
CIANO    : 'ciano'    ;
CINZA    : 'cinza'    ;
VERDE    : 'verde'    ;
MAGENTA  : 'magenta'  ;
LARANJA  : 'laranja'  ;
ROSA     : 'rosa'     ;
VERMELHO : 'vermelho' ;
BRANCO   : 'branco'   ;
AMARELO  : 'amarelo'  ;
ESCURO   : 'escuro'   ;
CLARO    : 'claro'    ;


// funções
// á = \u00E1
// ã = \u00E3
// í = \u00ED
// ê = \u00EA
// ó = \u00F3
// ú = \u00FA
F_VABS : 'valorAbsoluto'             ;
F_RAIQ : 'raizQuadrada'              ;
F_RAIC : 'raizC\u00FAbica'           ;
F_RAIZ : 'raiz'                      ;
F_POTE : 'pot\u00EAncia'             ;
F_HIPO : 'hipotenusa'                ;
F_CHAO : 'ch\u00E3o'                 ;
F_TETO : 'teto'                      ;
F_ARRE : 'arredondar'                ;
F_MINI : 'm\u00EDnimo'               ;
F_MAXI : 'm\u00E1ximo'               ;
F_NUMA : 'n\u00FAmeroAleat\u00F3rio' ;
F_SENO : 'seno'                      ;
F_COSS : 'cosseno'                   ;
F_TANG : 'tangente'                  ;
F_ASEN : 'arcoSeno'                  ;
F_ACOS : 'arcoCosseno'               ;
F_ATAN : 'arcoTangente'              ;
F_CAPO : 'cartesianoParaPolar'       ;
F_SENH : 'senoHiperb\u00F3lico'      ;
F_COSH : 'cossenoHiperb\u00F3lico'   ;
F_TANH : 'tangenteHiperb\u00F3lica'  ;
F_LOGA : 'logar\u00EDtmo'            ;
F_GRRA : 'grausParaRadianos'         ;
F_RAGR : 'radianosParaGraus'         ;


// operadores de atribuição
ATR  : '='   ;
ATRA : '<-'  ;


// operadores aritméticos
ADI  : '+'               ;
ADIA : 'mais'            ;

SUB  : '-'               ;
SUBA : 'menos'           ;

MUL  : '*'               ;
//MULA : 'vezes'         ;

DIV  : '/'               ;
DIVA : 'dividido'    ;
POR  : 'por'             ;

MOD  : '%'               ;
MODA : 'resto'           ;


// operadores relacionais
// ã = \u00E3
// é = \u00E9
IGU  : '=='                                ;
IGUT : '\u00E9 igual a'                    ;  // é igual a
IGUA : 'n\u00E3o \u00E9 diferente de'      ;  // não é diferente de

DIF  : '!='                                ;
DIFT : '\u00E9 diferente de'               ;  // é diferente de
DIFA : 'n\u00E3o \u00E9 igual a'           ;  // não é igual a

ME   : '<'                                 ;
MET  : '\u00E9 menor que'                  ;  // é menor que
MEA  : 'n\u00E3o \u00E9 maior ou igual a'  ;  // não é maior ou igual a

MEI  : '<='                                ;
MEIT : '\u00E9 menor ou igual a'           ;  // é menor ou igual a
MEIA : 'n\u00E3o \u00E9 maior que'         ;  // não é maior que

MA   : '>'                                 ;
MAT  : '\u00E9 maior que'                  ;  // é maior que
MAA  : 'n\u00E3o \u00E9 menor ou igual a'  ;  // não é menor ou igual a

MAI  : '>='                                ;
MAIT : '\u00E9 maior ou igual a'           ;  // é maior ou igual a
MAIA : 'n\u00E3o \u00E9 menor que'         ;  // não é menor que


// operadores lógicos
// Ã = \u00C3
ELG  : '&&'       ;
ELGT : 'E'        ;

OLG  : '||'       ;
OLGT : 'OU'       ;

NAO  : '!'        ;
NAOT : 'N\u00C3O' ;  // NÃO


// fim de linha
DOT  : '.' ;

// identificadores
ID   : LET(LET|DIG)* ;

// literais
INT    : DIG+ ;
DEC    : DIG+ '.' DIG+ ;
HEX    : '0x' DHX+ {getText().length() == 8 || getText().length() == 10}?; // predicado semântico, força formato em 0x000000 ou 0x00000000
CHAR   : '\'' ( ESCC | ~["\\] ) '\'' ;
STRING : '"' ( ESCC | ~["\\] )* '"' ;

// comentários
COMENTARIO       : '/*' .*? '*/' -> skip ;
COMENTARIO_LINHA : '//' ~[\r\n]* -> skip ;

// descarta espaços em branco
WS   : [ \t\r\n]+ -> skip ;