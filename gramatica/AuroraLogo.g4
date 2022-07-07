/*
 * Copyright (C) 2022 Prof. Dr. David Buzatto
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * Gramática da linguagem de programação didática AuroraLogo.
 * 
 * Desenvolvido por Prof. Dr. David Buzatto
 */
grammar AuroraLogo;

prog : inst+ ;

inst : ains DOT
     | se
     | usando
     | repetir
     | repetirEnquanto
     | desenharCaminho
     ;

ains : movimentar
     | trocarCor
     | girar
     | engrossar
     | desengrossar
     | trocarGrossura
     | instrucaoGeometrica
     | escrever
     | ler
     | atribuir
     | abaixar
     | levantar
     | limpar
     | expr
     | parar
     | continuar
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
                   | DIV | DIVA
                   | MOD | MODA      ) fator )*
         ;

fator    : ( NAO | NAOT ) fator      # fatorNao
         | INT                       # fatorInt
         | DEC                       # fatorDec
         | PI                        # fatorPi
         | ( bool | ID )             # fatorId                // atenção, literais booleanos aqui!
         | CHAR                      # fatorChar
         | STRING                    # fatorString
         | funcaoMatematica          # fatorFuncaoMatematica
         | consultarTartaruga        # fatorConsultarTartaruga
         | '(' expr ')'              # fatorParenteses
         ;

exprBool : expr
         ;

bool     : VER | FAL
         ;

// regras para os construtos da linguagem
// se ... senão se ... senão (if ... else if ... else)
se           : seSe seSenaoSe* seSenao?
             ;

seSe         : SE  exprBool ENT '{' inst+ '}'
             ;

seSenaoSe    : SEN SE exprBool ENT '{' inst+ '}'
             ;

seSenao      : SEN '{' inst+ '}'
             ;

// usando ... escolha (switch ... case)
usando       : USA ID '{' escolha+  ( PADR ':' inst+ )? '}'
             ;

escolha      : ESCO ( INT | DEC | CHAR | STRING ) ':' inst+
             ;

// repetir ... vezes
repetir      : REP expr ( VEZ | VEZS ) '{' inst+ '}'
             ;

// enquanto ... repetir
repetirEnquanto   : ( ENQ exprBool )? REP
                    ( 
                      ( INCM | DCMM ) ID ( EM expr )?
                      | SOMM ID COM expr
                      | MULM ID POR expr
                      | DIVM ID POR expr
                      | SUBM expr DE ID
                    )?
                    '{' inst+ '}'
                  ;

parar        : PARR
             ;

continuar    : CONT
             ;

// regras para instruções de ação
movimentar   : VA PARA ( DIR | ESQ | CIM | BAI ) ( EM expr )?   # movimentarDirecao
             | VA PARA '(' expr ',' expr ')'                    # movimentarPonto
             ;

trocarCor    : TROC COR DO PINC PARA configuracaoCor  # trocarCorPincel
             | TROC COR DO PREE PARA configuracaoCor  # trocarCorPreenchimento
             | TROC COR DO FUN  PARA configuracaoCor  # trocarCorFundo
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

atribuir     : ID (  ATR | ATRA ) expr     # atribuirPadrao
             | ID ( AC_A | AT_A ) expr     # atribuirAdicao
             | ID ( AC_S | AT_S ) expr     # atribuirSubtracao
             | ID ( AC_M | AT_M ) expr     # atribuirMultiplicacao
             | ID ( AC_D | AT_D ) expr     # atribuirDivisao
             | ID ( AC_R | AT_R ) expr     # atribuirResto
             ;

abaixar      : ABA PINC
             ;

levantar     : LEV PINC
             ;

limpar       : LIM
             ;

// funções matemáticas
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
                 | F_SEME '(' expr ')'                            # funcaoDefinirSementeAleatoria
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
                 | F_INC  '(' ID ')'                              # funcaoIncrementar
                 | F_DCM  '(' ID ')'                              # funcaoDecrementar
                 ;

// funções geométricas
instrucaoGeometrica : DESE funcaoGeometrica
                    ;

                      //          x1       y1       x2       y2
funcaoGeometrica    : FG_SEG '(' expr ',' expr ',' expr ',' expr ')'                                                       # funcaoDesenharSegmento
                      //          xc       yc      lado
                    | FG_QUA '(' expr ',' expr ',' expr ')' PREO?                                                          # funcaoDesenharQuadrado
                      //          x        y       larg     alt
                    | FG_RET '(' expr ',' expr ',' expr ',' expr ')' PREO?                                                 # funcaoDesenharRetangulo
                      //          xc       yc      raio
                    | FG_CIC '(' expr ',' expr ',' expr ')' PREO?                                                          # funcaoDesenharCirculo
                      //          xc       yc       eh       ev
                    | FG_ELI '(' expr ',' expr ',' expr ',' expr ')' PREA?                                                 # funcaoDesenharElipse
                      //          xc       yc       eh       ev      aini     afim
                    | FG_ARC '(' expr ',' expr ',' expr ',' expr ',' expr ',' expr ( ',' ( ABE | COD | PIZ ) )? ')' PREO?  # funcaoDesenharArco
                      //          xc       yc      raio     ang       ql
                    | FG_POR '(' expr ',' expr ',' expr ',' expr ',' expr ')' PREO?                                        # funcaoDesenharPoligonoRegular
                      //          xc       yc      raio     ang       qp
                    | FG_EST '(' expr ',' expr ',' expr ',' expr ',' expr ')' PREA?                                        # funcaoDesenharEstrela
                      //          x1       y1       x2       y2       x3       y3         xn       yn
                    | FG_POL '(' expr ',' expr ',' expr ',' expr ',' expr ',' expr ( ',' expr ',' expr )* ')' PREO?        # funcaoDesenharPoligono
                      //          x1       y1      ctx      cty       x2       y2
                    | FG_CQD '(' expr ',' expr ',' expr ',' expr ',' expr ',' expr ')' PREA?                               # funcaoDesenharCurvaQuadratica
                      //          x1       y1      ct1x     ct1y     ct2x     ct2y      x2       y2
                    | FG_CCU '(' expr ',' expr ',' expr ',' expr ',' expr ',' expr ',' expr ',' expr ')' PREA?             # funcaoDesenharCurvaCubica
                    ;


desenharCaminho     : DESE CAM PREO? '{' ( instCaminho DOT )+ '}'
                    ;

                      //           x        y
instCaminho         : MOV ATE '(' expr ',' expr ')'                                           # instrucaoCaminhoMoverAte
                      //           x        y
                    | LIN ATE '(' expr ',' expr ')'                                           # instrucaoCaminhoLinhaAte
                      //               ctx      cty       x        y
                    | CUR QUAD ATE '(' expr ',' expr ',' expr ',' expr ')'                    # instrucaoCaminhoCurvaQuadraticaAte
                      //               ct1x     ct1y     ct2x     ct2y      x        y
                    | CUR CUBI ATE '(' expr ',' expr ',' expr ',' expr ',' expr ',' expr ')'  # instrucaoCaminhoCurvaCubicaAte
                    | FEC                                                                     # instrucaoCaminhoFecharCaminho
                    ;


consultarTartaruga  : TART DOT ( PX | PY | PA )
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

// terminais não tratados como identificadores
// propriedades da tartaruga
PX : 'x'           ;
PY : 'y'           ;
PA : '\u00E2ngulo' ;


// palavras chave
// á = \u00E1
// í = \u00ed
ABA  : 'abaixar'         ;
ABE  : 'ABERTO'          ;
ATE  : 'at\u00E9'        ;
BAI  : 'baixo'           ;
CAM  : 'caminho'         ;
CIM  : 'cima'            ;
COD  : 'CORDA'           ;
COM  : 'com'             ;
CONT : 'continuar'       ;
COR  : 'cor'             ;
CUBI : 'c\u00FAbica'     ;
CUR  : 'curva'           ;
DCMM : 'decrementando'   ;
DE   : 'de'              ; 
DES  : 'desengrossar'    ;
DESE : 'desenhar'        ;
DIR  : 'direita'         ;
DIVM : 'dividindo'       ;
DO   : 'do'              ;
EM   : 'em'              ;
ENG  : 'engrossar'       ;
ENQ  : 'enquanto'        ;
ENT  : 'ent\u00E3o'      ;
ESCO : 'escolha'         ;
ESC  : 'escrever'        ;
ESQ  : 'esquerda'        ;
FAL  : 'FALSO'           ;
FEC  : 'fechar'          ;
FUN  : 'fundo'           ;
GIR  : 'girar'           ;
GRA  : 'graus'           ;
GROS : 'grossura'        ;
INCM : 'incrementando'   ;
INI  : 'iniciar'         ;
LER  : 'ler'             ;
LEV  : 'levantar'        ;
LIM  : 'limpar'          ;
LIN  : 'linha'           ;
MOV  : 'mover'           ;
MULM : 'multiplicando'   ;
NA   : 'na'              ;
PADR : 'padr\u00E3o'     ;
PARA : 'para'            ;
PARR : 'parar'           ;
PI   : 'PI'              ;
PINC : 'pincel'          ;
PIZ  : 'PIZZA'           ;
POR  : 'por'             ;
PREA : 'preenchida'      ;
PREE : 'preenchimento'   ;
PREO : 'preenchido'      ;
QUAD : 'quadr\u00E1tica' ;
REP  : 'repetir'         ;
SAI  : 'sa\u00EDda'      ;
SE   : 'se'              ;
SEN  : 'sen\u00E3o'      ;
SOMM : 'somando'         ;
SUBM : 'subtraindo'      ;
TART : 'tartaruga'       ;
TER  : 'terminar'        ;
TROC : 'trocar'          ;
USA  : 'usando'          ;
VA   : 'v\u00E1'         ;
VER  : 'VERDADEIRO'      ;
VEZ  : 'vez'             ;
VEZS : 'vezes'           ;


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
F_ACOS : 'arcoCosseno'                  ;
F_ARRE : 'arredondar'                   ;
F_ASEN : 'arcoSeno'                     ;
F_ATAN : 'arcoTangente'                 ;
F_CAPO : 'cartesianoParaPolar'          ;
F_CHAO : 'ch\u00E3o'                    ;
F_COSH : 'cossenoHiperb\u00F3lico'      ;
F_COSS : 'cosseno'                      ;
F_DCM  : 'decrementar'                  ;
F_GRRA : 'grausParaRadianos'            ;
F_HIPO : 'hipotenusa'                   ;
F_INC  : 'incrementar'                  ;
F_LOGA : 'logar\u00EDtmo'               ;
F_MAXI : 'm\u00E1ximo'                  ;
F_MINI : 'm\u00EDnimo'                  ;
F_NUMA : 'n\u00FAmeroAleat\u00F3rio'    ;
F_POTE : 'pot\u00EAncia'                ;
F_RAGR : 'radianosParaGraus'            ;
F_RAIC : 'raizC\u00FAbica'              ;
F_RAIQ : 'raizQuadrada'                 ;
F_RAIZ : 'raiz'                         ;
F_SEME : 'definirSementeAleat\u00F3ria' ;
F_SENH : 'senoHiperb\u00F3lico'         ;
F_SENO : 'seno'                         ;
F_TANG : 'tangente'                     ;
F_TANH : 'tangenteHiperb\u00F3lica'     ;
F_TETO : 'teto'                         ;
F_VABS : 'valorAbsoluto'                ;


// funções geométricas
// á = \u00E1
// â = \u00E2
// é = \u00E9
// í = \u00ED
// ú = \u00FA
FG_ARC : 'arco'                 ;
FG_CCU : 'curvaC\u00FAbica'     ;
FG_CIC : 'c\u00EDrculo'         ;
FG_CQD : 'curvaQuadr\u00E1tica' ;
FG_ELI : 'elipse'               ;
FG_EST : 'estrela'              ;
FG_POL : 'pol\u00EDgono'        ;
FG_POR : 'pol\u00EDgonoRegular' ;
FG_QUA : 'quadrado'             ;
FG_RET : 'ret\u00E2ngulo'       ;
FG_SEG : 'segmento'             ;

// operadores de atribuição
ATR  : '='   ;
ATRA : '<-'  ;
AC_A : '+='  ;
AT_A : '+<-' ;
AC_S : '-='  ;
AT_S : '-<-' ;
AC_M : '*='  ;
AT_M : '*<-' ;
AC_D : '/='  ;
AT_D : '/<-' ;
AC_R : '%='  ;
AT_R : '%<-' ;


// operadores aritméticos
ADI  : '+'            ;
ADIA : 'mais'         ;

SUB  : '-'            ;
SUBA : 'menos'        ;

MUL  : '*'            ;
//MULA : 'vezes'      ;

DIV  : '/'            ;
DIVA : 'dividido por' ;

MOD  : '%'            ;
MODA : 'resto'        ;


// operadores relacionais
// ã = \u00E3
// é = \u00E9
IGU  : '=='                               ;
IGUT : '\u00E9 igual a'                   ;  // é igual a
IGUA : 'n\u00E3o \u00E9 diferente de'     ;  // não é diferente de

DIF  : '!='                               ;
DIFT : '\u00E9 diferente de'              ;  // é diferente de
DIFA : 'n\u00E3o \u00E9 igual a'          ;  // não é igual a

ME   : '<'                                ;
MET  : '\u00E9 menor que'                 ;  // é menor que
MEA  : 'n\u00E3o \u00E9 maior ou igual a' ;  // não é maior ou igual a

MEI  : '<='                               ;
MEIT : '\u00E9 menor ou igual a'          ;  // é menor ou igual a
MEIA : 'n\u00E3o \u00E9 maior que'        ;  // não é maior que

MA   : '>'                                ;
MAT  : '\u00E9 maior que'                 ;  // é maior que
MAA  : 'n\u00E3o \u00E9 menor ou igual a' ;  // não é menor ou igual a

MAI  : '>='                               ;
MAIT : '\u00E9 maior ou igual a'          ;  // é maior ou igual a
MAIA : 'n\u00E3o \u00E9 menor que'        ;  // não é menor que


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