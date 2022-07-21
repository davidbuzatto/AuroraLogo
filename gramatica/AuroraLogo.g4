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

prog : func* inst+ EOF ;

func : FUNC IDF '(' ( ID ( ',' ID )* )? ')' '{' instf+ '}'
     ;

inst : ains DOT
     | se
     | usando
     | repetir
     | repetirEnquanto
     | paraCada
     | desenharCaminho
     ;

instf : inst
      ;

ains : movimentar
     | trocarCor
     | girar
     | abaixar
     | levantar
     | limpar
     | engrossar
     | desengrossar
     | trocarGrossura
     | trocarEstilo
     | escrever
     | ler
     | atribuir
     | parar
     | continuar
     | retornar
     | instrucaoGeometrica
     | expr
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

fator    : ( NAO | NAOT ) fator                                                   # fatorNao
         | INT                                                                    # fatorInt
         | DEC                                                                    # fatorDec
         | PI                                                                     # fatorPi
         | processaId                   ( DOT ( COMP | CHAV | TIPO ) '(' ')' )?   # fatorId
         | processaId ( '[' expr ']' )+ ( DOT ( COMP | CHAV | TIPO ) '(' ')' )?   # fatorIdArranjo
         | processaId   '{' expr '}'    ( DOT ( COMP | CHAV | TIPO ) '(' ')' )?   # fatorIdArranjoAssociativo
         | processaId ( DOT IDA )+                                                # fatorIdIdAtributo
         | CHAR                                                                   # fatorChar
         | STRING                                                                 # fatorString 
         | ( VER | FAL )                                                          # fatorBool
         | cor                                                                    # fatorCor
         | funcaoMatematica                                                       # fatorFuncaoMatematica
         | consultarTartaruga                                                     # fatorConsultarTartaruga
         | consultarString                                                        # fatorConsultarString
         | formatarTexto                                                          # fatorFormatarTexto
         | passo                                                                  # fatorPasso
         | chamadaFuncao                                                          # fatorChamadaFuncao
         | criarArranjos                                                          # fatorCriarArranjo
         | '(' expr ')'                                                           # fatorParenteses
         ;

exprBool : expr
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
usando       : USA processaId '{' escolha+  ( PADR ':' inst+ )? '}'
             ;

escolha      : ESCO ( INT | DEC | CHAR | STRING ) ':' inst+
             ;

// repetir ... vezes
repetir      : REP expr ( VEZ | VEZS ) '{' inst+ '}'
             ;

passo        : PAS 
             ;

// enquanto ... repetir
repetirEnquanto : ( ENQ exprBool )? REP
                  ( 
                    ( INCM | DCMM ) processaId ( EM expr )?
                    | SOMM processaId COM expr
                    | MULM processaId POR expr
                    | DIVM processaId POR expr
                    | SUBM expr DE processaId
                  )?
                  '{' inst+ '}'
                ;

// para cada
paraCada     : PARA CADA processaId EM expr REP '{' inst+ '}'
             ;

parar        : PARR
             ;

continuar    : CONT
             ;

// regras para instruções de ação
movimentar   : VA PARA ( DIR | ESQ | CIM | BAI ) ( EM expr )?   # movimentarDirecao
             | VA PARA expr ',' expr                            # movimentarPonto
             ;

trocarCor    : TROC COR DO PINC PARA configuracaoCor  # trocarCorPincel
             | TROC COR DO PREE PARA configuracaoCor  # trocarCorPreenchimento
             | TROC COR DO FUN  PARA configuracaoCor  # trocarCorFundo
             ;

configuracaoCor : ( cor | expr | corEx=( PRETO
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

cor          : CHEX | criarCor 
             ;

criarCor     : FC_CRI  '(' expr ',' expr ',' expr ( ',' expr )? ')'
             ;

girar        : GIR ( EM expr ( GRA | RAD ) )?
             ;

engrossar    : ENG PINC ( EM expr )?
             ;

desengrossar : DES PINC ( EM expr )?
             ;

trocarGrossura  : TROC GROS DO PINC PARA expr
                ;

trocarEstilo    : TROC EST DO PINC PARA ( CONU | TRAC | PONT )
                ;

escrever     : ESC expr ( NA SAI  ( PUL LIN )?
                        | NO DIAG ( PUL LIN )?
                        )?
             ;

ler          : LER processaId ( USA A MEN expr )?
             ;

atribuir     : processaId                         (  ATR | ATRA ) ( expr | criarArranjos )  # atribuirPadrao
             | processaId ( '[' exprIndice ']' )+ (  ATR | ATRA ) ( expr | criarArranjos )  # atribuirArranjo
             | processaId ( '{' exprIndice '}' )  (  ATR | ATRA ) ( expr | criarArranjos )  # atribuirArranjoAssociativo
             | processaId ( AC_A | AT_A )   expr                                            # atribuirAdicao
             | processaId ( AC_S | AT_S )   expr                                            # atribuirSubtracao
             | processaId ( AC_M | AT_M )   expr                                            # atribuirMultiplicacao
             | processaId ( AC_D | AT_D )   expr                                            # atribuirDivisao
             | processaId ( AC_R | AT_R )   expr                                            # atribuirResto
             ;

exprIndice   : expr
             ;

abaixar      : ABA PINC
             ;

levantar     : LEV PINC
             ;

limpar       : LIM
             ;

// funções matemáticas
funcaoMatematica : F_VABS '(' expr ')'                       # funcaoAbsoluto
                 | F_RAIQ '(' expr ')'                       # funcaoRaizQuadrada
                 | F_RAIC '(' expr ')'                       # funcaoRaizCubica
                 | F_RAIZ '(' expr ',' expr ')'              # funcaoRaiz
                 | F_POTE '(' expr ',' expr ')'              # funcaoPotencia
                 | F_HIPO '(' expr ',' expr ')'              # funcaoHipotenusa
                 | F_CHAO '(' expr ')'                       # funcaoChao
                 | F_TETO '(' expr ')'                       # funcaoTeto
                 | F_ARRE '(' ( expr | expr ',' expr ) ')'   # funcaoArredondar
                 | F_MINI '(' expr ',' expr ')'              # funcaoMinimo
                 | F_MAXI '(' expr ',' expr ')'              # funcaoMaximo
                 | F_NUMA '(' ( expr | expr ',' expr )? ')'  # funcaoNumeroAleatorio
                 | F_SEME '(' expr ')'                       # funcaoDefinirSementeAleatoria
                 | F_SENO '(' expr ')'                       # funcaoSeno
                 | F_COSS '(' expr ')'                       # funcaoCosseno
                 | F_TANG '(' expr ')'                       # funcaoTangente
                 | F_ASEN '(' expr ')'                       # funcaoArcoSeno
                 | F_ACOS '(' expr ')'                       # funcaoArcoCosseno
                 | F_ATAN '(' expr ')'                       # funcaoArcoTangente
                 | F_CAPO '(' expr ',' expr ')'              # funcaoCartesianoParaPolar
                 | F_SENH '(' expr ')'                       # funcaoSenoHiperbolico
                 | F_COSH '(' expr ')'                       # funcaoCossenoHiperbolico
                 | F_TANH '(' expr ')'                       # funcaoTangenteHiperbolica
                 | F_LOGA '(' ( expr | expr ',' expr ) ')'   # funcaoLogaritmo
                 | F_GRRA '(' expr ')'                       # funcaoGrausParaRadianos
                 | F_RAGR '(' expr ')'                       # funcaoRadianosParaGraus
                 | F_INC  '(' processaId ')'                 # funcaoIncrementar
                 | F_DCM  '(' processaId ')'                 # funcaoDecrementar
                 ;

// funções geométricas
instrucaoGeometrica : DESE funcaoGeometrica
                    ;

                      //          x1       y1       x2       y2
funcaoGeometrica    : FG_SEG '(' expr ',' expr ',' expr ',' expr ')'                                                                # funcaoDesenharSegmento
                      //          xc       yc      lado
                    | FG_QUA '(' expr ',' expr ',' expr ')' opcaoFuncGeom?                                                          # funcaoDesenharQuadrado
                      //          x        y       larg     alt
                    | FG_RET '(' expr ',' expr ',' expr ',' expr ')' opcaoFuncGeom?                                                 # funcaoDesenharRetangulo
                      //          x        y       larg     alt      arco
                    | FG_REA '(' expr ',' expr ',' expr ',' expr ',' expr ')' opcaoFuncGeom?                                        # funcaoDesenharRetanguloArredondado
                      //          xc       yc      raio
                    | FG_CIC '(' expr ',' expr ',' expr ')' opcaoFuncGeom?                                                          # funcaoDesenharCirculo
                      //          xc       yc       eh       ev
                    | FG_ELI '(' expr ',' expr ',' expr ',' expr ')' opcaoFuncGeom?                                                 # funcaoDesenharElipse
                      //          xc       yc       eh       ev      aini     afim
                    | FG_ARC '(' expr ',' expr ',' expr ',' expr ',' expr ',' expr ( ',' ( ABE | COD | PIZ ) )? ')' opcaoFuncGeom?  # funcaoDesenharArco
                      //          xc       yc      raio     ang       ql
                    | FG_POR '(' expr ',' expr ',' expr ',' expr ',' expr ')' opcaoFuncGeom?                                        # funcaoDesenharPoligonoRegular
                      //          xc       yc      raio     ang       qp
                    | FG_EST '(' expr ',' expr ',' expr ',' expr ',' expr ')' opcaoFuncGeom?                                        # funcaoDesenharEstrela
                      //          x1       y1       x2       y2       x3       y3         xn       yn
                    | FG_POL '(' expr ',' expr ',' expr ',' expr ',' expr ',' expr ( ',' expr ',' expr )* ')' opcaoFuncGeom?        # funcaoDesenharPoligono
                      //          x1       y1      ctx      cty       x2       y2
                    | FG_CQD '(' expr ',' expr ',' expr ',' expr ',' expr ',' expr ')'
                      ( ( opcaoFuncGeom ( ',' opcaoPontosControle )? ) | ( opcaoPontosControle ( ',' opcaoFuncGeom )? ) )?          # funcaoDesenharCurvaQuadratica
                      //          x1       y1      ct1x     ct1y     ct2x     ct2y      x2       y2
                    | FG_CCU '(' expr ',' expr ',' expr ',' expr ',' expr ',' expr ',' expr ',' expr ')' 
                      ( ( opcaoFuncGeom ( ',' opcaoPontosControle )? ) | ( opcaoPontosControle ( ',' opcaoFuncGeom )? ) )?          # funcaoDesenharCurvaCubica
                    ;

opcaoFuncGeom       : SEM PREE ( E SEM CON )? | SEM CON ( E SEM PREE )? 
                    ;

opcaoPontosControle : MOS ( CONE | CONS )
                    ;

desenharCaminho     : DESE CAM ( ( opcaoFuncGeom ( ',' opcaoPontosControle )? ) | ( opcaoPontosControle ( ',' opcaoFuncGeom )? ) )? '{' ( instCaminho DOT )+ '}'
                    ;

                      //       x        y
instCaminho         : MOV ATE expr ',' expr                                           # instrucaoCaminhoMoverAte
                      //       x        y
                    | LIN ATE expr ',' expr                                           # instrucaoCaminhoLinhaAte
                      //           ctx      cty       x        y
                    | CUR QUAD ATE expr ',' expr ',' expr ',' expr                    # instrucaoCaminhoCurvaQuadraticaAte
                      //            t1x     ct1y     ct2x     ct2y      x        y
                    | CUR CUBI ATE expr ',' expr ',' expr ',' expr ',' expr ',' expr  # instrucaoCaminhoCurvaCubicaAte
                    | FEC                                                             # instrucaoCaminhoFecharCaminho
                    ;

consultarTartaruga  : TART DOT ( PX | PY | PA | PG | PES | PCP | PCPP | PCF | PCPR | PD ) '(' ')'
                    ;

consultarString     : processaId DOT ( COMP '(' ')' | CARC '(' ')' ( '[' exprIndice ']' )? | SUBS '(' expr ( ',' expr )? ')' )
                    ;

formatarTexto       : FORM '(' STRING ( ',' expr )* ')'
                    ;

criarArranjos       : ( CRA  | CRR  ) ( '[' expr ']' )+  # criarArranjo
                    | ( CRAA | CRRA )   '{' '}'          # criarArranjoAssociativo
                    ;

chamadaFuncao       : IDF '(' ( expr ( ',' expr )* )? ')'
                    ;

retornar            : RET expr?
                    ;

processaId          : ID
                    ;

fragment
LETmin  : [a-z];

fragment
LETmai  : [A-Z];

fragment
LET     : [a-zA-Z] ;

fragment
LETAmin : [\u00E1\u00E0\u00E2\u00E3\u00E9\u00EA\u00ED\u00F3\u00F4\u00F5\u00FA\u00FC\u00E7] ;

fragment
LETAmai : [\u00C1\u00C0\u00C2\u00C3\u00C9\u00CA\u00CD\u00D3\u00D4\u00D5\u00DA\u00DC\u00C7] ;

fragment
LETA    : [\u00E1\u00E0\u00E2\u00E3\u00E9\u00EA\u00ED\u00F3\u00F4\u00F5\u00FA\u00FC\u00E7\u00C1\u00C0\u00C2\u00C3\u00C9\u00CA\u00CD\u00D3\u00D4\u00D5\u00DA\u00DC\u00C7] ;

fragment
DIG : [0-9] ;

fragment
DHX : [0-9a-fA-F] ;

fragment
ESCC : '\\' ( ["\\/bfnrt] | UNICODE ) ;

fragment
UNICODE : 'u' DHX DHX DHX DHX ;

// escape dos caracteres "especiais"
// Ã = \u00C3
// á = \u00E1
// â = \u00E2
// ã = \u00E3
// ç = \u00E7
// é = \u00E9
// ê = \u00EA
// í = \u00ED
// ó = \u00F3
// ú = \u00FA


// palavras chave
A    : 'a'                       ;
ABA  : 'abaixar'                 ;
ABE  : 'ABERTO'                  ;
ALT  : 'alterar'                 ;
ATE  : 'at\u00E9'                ;
BAI  : 'baixo'                   ;
CADA : 'cada'                    ;
CAM  : 'caminho'                 ;
CIM  : 'cima'                    ;
COD  : 'CORDA'                   ;
COM  : 'com'                     ;
CONT : 'continuar'               ;
CONU : 'cont\u00EDnuo'           ;
CON  : 'contorno'                ;
CONE : 'controle'                ;
CONS : 'controles'               ;
COR  : 'cor'                     ;
CUBI : 'c\u00FAbica'             ;
CUR  : 'curva'                   ;
CRA  : 'criarArranjo'            ;
CRAA : 'criarArranjoAssociativo' ;
CRR  : 'criarArray'              ;
CRRA : 'criarArrayAssociativo'   ;
DCMM : 'decrementando'           ;
DE   : 'de'                      ; 
DES  : 'desengrossar'            ;
DESE : 'desenhar'                ;
DIAG : 'di\u00E1logo'            ;
DIR  : 'direita'                 ;
DIVM : 'dividindo'               ;
DO   : 'do'                      ;
E    : 'e'                       ;
EM   : 'em'                      ;
ENG  : 'engrossar'               ;
ENQ  : 'enquanto'                ;
ENT  : 'ent\u00E3o'              ;
ESCO : 'escolha'                 ;
ESC  : 'escrever'                ;
ESQ  : 'esquerda'                ;
EST  : 'estilo'                  ;
FAL  : 'FALSO'                   ;
FEC  : 'fechar'                  ;
FORM : 'formatarTexto'           ;
FUN  : 'fundo'                   ;
FUNC : 'fun\u00E7\u00E3o'        ;
GIR  : 'girar'                   ;
GRA  : 'graus'                   ;
GROS : 'grossura'                ;
INCM : 'incrementando'           ;
INI  : 'iniciar'                 ;
LER  : 'ler'                     ;
LEV  : 'levantar'                ;
LIM  : 'limpar'                  ;
LIN  : 'linha'                   ;
MEN  : 'mensagem'                ;
MOS  : 'mostrando'               ;
MOV  : 'mover'                   ;
MULM : 'multiplicando'           ;
NA   : 'na'                      ;
NO   : 'no'                      ;
PAS  : 'passo'                   ;
PADR : 'padr\u00E3o'             ;
PARA : 'para'                    ;
PARR : 'parar'                   ;
PI   : 'PI'                      ;
PINC : 'pincel'                  ;
PIZ  : 'PIZZA'                   ;
PONT : 'pontilhado'              ;
POR  : 'por'                     ;
PREE : 'preenchimento'           ;
PUL  : 'pulando'                 ;
QUAD : 'quadr\u00E1tica'         ;
RAD  : 'radianos'                ;
REP  : 'repetir'                 ;
RET  : 'retornar'                ;
SAI  : 'sa\u00EDda'              ;
SE   : 'se'                      ;
SEN  : 'sen\u00E3o'              ;
SEM  : 'sem'                     ;
SOMM : 'somando'                 ;
SUBM : 'subtraindo'              ;
TART : 'tartaruga'               ;
TER  : 'terminar'                ;
TRAC : 'tracejado'               ;
TROC : 'trocar'                  ;
USA  : 'usando'                  ;
VA   : 'v\u00E1'                 ;
VER  : 'VERDADEIRO'              ;
VEZ  : 'vez'                     ;
VEZS : 'vezes'                   ;


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


// terminais que são propriedades da tartaruga
PA   : '\u00E2ngulo'         ;
PCF  : 'corDoFundo'          ;
PCP  : 'corDoPincel'         ;
PCPP : 'corDoPreenchimento'  ;
PCPR : 'corPr\u00F3pria'     ;
PD   : 'est\u00E1Desenhando' ;
PES  : 'estiloDoPincel'      ;
PG   : 'grossuraDoPincel'    ;
PX   : 'x'                   ;
PY   : 'y'                   ;

// terminais que são proprieades dos arranjos e strings
CARC : 'caracteres'  ;
CHAV : 'chaves'      ;
COMP : 'comprimento' ;
SUBS : 'substring'   ;
TIPO : 'tipo'        ;


// funções
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


// funções para criar cores
FC_CRI : 'criarCor'                  ;


// funções geométricas
FG_ARC : 'arco'                      ;
FG_CCU : 'curvaC\u00FAbica'          ;
FG_CIC : 'c\u00EDrculo'              ;
FG_CQD : 'curvaQuadr\u00E1tica'      ;
FG_ELI : 'elipse'                    ;
FG_EST : 'estrela'                   ;
FG_POL : 'pol\u00EDgono'             ;
FG_POR : 'pol\u00EDgonoRegular'      ;
FG_QUA : 'quadrado'                  ;
FG_RET : 'ret\u00E2ngulo'            ;
FG_REA : 'ret\u00E2nguloArredondado' ;
FG_SEG : 'segmento'                  ;

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
ELG  : '&&'       ;
ELGT : 'E'        ;

OLG  : '||'       ;
OLGT : 'OU'       ;

NAO  : '!'        ;
NAOT : 'N\u00C3O' ;  // NÃO


// fim de linha
DOT  : '.' ;

// identificadores
ID   : ( 'v' | 'p' ) ( LETmai | LETAmai | [_$] ) ( LET | LETA | DIG | [_$] )* ;   // identificador de variáveis e de parâmetros de funções
IDC  : 'c'           ( LETmai | LETAmai | [_$] ) ( LET | LETA | DIG | [_$] )* ;   // identificador de constantes
IDF  : 'f'           ( LETmai | LETAmai | [_$] ) ( LET | LETA | DIG | [_$] )* ;   // identificador de funções definidas pelo usuário
IDA  : 'a'           ( LET    | LETA    | [_$] ) ( LET | LETA | DIG | [_$] )* ;   // identificador de atributos/propriedades

// literais
// Obs: CHEX (cor hexa) usa um predicado semântico, 
//      forçando o formato em #000000 ou #00000000.
//      CHEXSTR (cor hexa como String) usa um predicado semântico, 
//      forçando o formato em "#000000" ou "#00000000".
INT     : DIG+ ;
DEC     : DIG+ '.' DIG+ ;
CHEX    : [#] DHX+ {getText().length() == 7 || getText().length() == 9}?; 
//CHEXSTR : '"' CHEX '"' {getText().length() == 9 || getText().length() == 11}?; 
CHAR    : '\'' ( ESCC | ~["\\] ) '\'' ;
STRING  : '"' ( ESCC | ~["\\] )* '"' ;

// comentários
COMENTARIO       : '/*' .*? '*/' -> skip ;
COMENTARIO_LINHA : '//' ~[\r\n]* -> skip ;

// descarta espaços em branco
WS   : [ \t\r\n]+ -> skip ;