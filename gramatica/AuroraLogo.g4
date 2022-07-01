/**
 * Gramática da linguagem didática AuroraLogo.
 * 
 * Desenvolvido por Prof. Dr. David Buzatto
 */

grammar AuroraLogo;

prog : inst+ ;

inst : ains DOT
     | se
     | repita
     | enquanto
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
         | ID                        # fatorId
         | '(' expr ')'              # fatorParenteses
         ;

exprBool : expr
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

// repita vezes
repita       : REP expr ( VEZ | VEZS ) '{' inst+ '}'
             ;

// enquanto repita
enquanto     : ( ENQ exprBool )? REP '{' inst+ '}'
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

girar        : GIR ( EM ( SUB | SUBA )? expr )?
             ;

engrossar    : ENG ( EM expr )?
             ;

desengrossar : DES ( EM expr )?
             ;

trocarGrossura  : TROC GROS PARA expr
                ;

escrever     : ESC ( STRING | expr ) concat*
             ;

ler          : LER ID
             ;

concat       : ( ADI | ADIA ) ( STRING | expr )
             ;

atribuir     : ID ( ATR | ATRA ) expr
             ;

abaixar      : ABA PINC
             ;

levantar     : LEV PINC
             ;

limpar       : LIM
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
REP  : 'repita'                   ;
VEZ  : 'vez'                      ;
VEZS : 'vezes'                    ;


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
RAIZ     : 'raiz'     ;


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
INT  : DIG+ ;
HEX  : '0x' DHX+ {getText().length() == 8}?; // predicado semântico, força formato em 0x000000
STRING : '"' ( ESCC | ~["\\] )* '"' ;

// comentários
COMENTARIO       : '/*' .*? '*/' -> skip ;
COMENTARIO_LINHA : '//' ~[\r\n]* -> skip ;

// descarta espaços em branco
WS   : [ \t\r\n]+ -> skip ;