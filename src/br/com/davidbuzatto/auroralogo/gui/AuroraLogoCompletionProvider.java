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
package br.com.davidbuzatto.auroralogo.gui;

import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.DefaultCompletionProvider;
import org.fife.ui.autocomplete.ShorthandCompletion;

/**
 * Provedor de "auto-completar".
 * 
 * @author Prof. Dr. David Buzatto
 */
public class AuroraLogoCompletionProvider extends DefaultCompletionProvider {
    
    public AuroraLogoCompletionProvider() {
        
        addCompletion( new ShorthandCompletion( this, "função valorAbsoluto(v)", "valorAbsoluto( valor )", "calcula o valor absoluto de um número" ) );
        addCompletion( new ShorthandCompletion( this, "função raizQuadrada(r)", "raizQuadrada( radicando )", "calcula a raiz quadrada do radicando" ) );
        addCompletion( new ShorthandCompletion( this, "função raizCúbica(r)", "raizCúbica( radicando )", "calcula a raiz cúbica do radicando" ) );
        addCompletion( new ShorthandCompletion( this, "função raiz(r, i)", "raiz( radicando, índice )", "calcula a raiz enésima do radicando" ) );
        addCompletion( new ShorthandCompletion( this, "função potência(b, e)", "potência( base, expoente )", "calcula a base elevada ao expoente" ) );
        addCompletion( new ShorthandCompletion( this, "função hipotenusa(l1, l2)", "hipotenusa( lado1, lado2 )", "calcula a hipotenusa de um triângulo retângulo" ) );
        addCompletion( new ShorthandCompletion( this, "função chão(v)", "chão( vvalor )", "calcula o chão de um valor (menor inteiro mais próximo)" ) );
        addCompletion( new ShorthandCompletion( this, "função teto(v)", "teto( valor )", "calculo o teto de um valor (maior inteiro mais próximo)" ) );
        addCompletion( new ShorthandCompletion( this, "função arredondar(v)", "arredondar( valor )", "arredonda um valor até o menor inteiro" ) );
        addCompletion( new ShorthandCompletion( this, "função arredondar(v, d)", "arredondar( valor, quantidadeCasas )", "arredonda um valor até a casa decimal especificada" ) );
        addCompletion( new ShorthandCompletion( this, "função mínimo(n1, n2)", "mínimo( número1, número2 )", "calcula o mínimo entre dois números" ) );
        addCompletion( new ShorthandCompletion( this, "função máximo(n1, n2)", "máximo( número1, número2 )", "calcula o máximo entre dois números" ) );
        addCompletion( new ShorthandCompletion( this, "função definirSementeAleatória(s)", "definirSementeAleatória( semente )", "define a semente aleatória do gerador de números aleatórios" ) );
        addCompletion( new ShorthandCompletion( this, "função númeroAleatório()", "númeroAleatório()", "retorna um número aleatório maior ou igual a zero e menor que um" ) );
        addCompletion( new ShorthandCompletion( this, "função númeroAleatório(l)", "númeroAleatório( limite )", "retorna um número aleatório maior ou igual a zero e menor que o limite" ) );
        addCompletion( new ShorthandCompletion( this, "função númeroAleatório(i, l)", "númeroAleatório( inicio, limite )", "retorna um número aleatório maior ou igual ao valor inicial e menor que o limite" ) );
        addCompletion( new ShorthandCompletion( this, "função seno(a)", "seno( ângulo )", "calcula o seno de um ângulo expresso em graus" ) );
        addCompletion( new ShorthandCompletion( this, "função cosseno(a)", "cosseno( ângulo )", "calcula o cosseno de um ângulo expresso em graus" ) );
        addCompletion( new ShorthandCompletion( this, "função tangente(a)", "tangente( ângulo )", "calcula a tangente de um ângulo expresso em graus" ) );
        addCompletion( new ShorthandCompletion( this, "função arcoSeno(s)", "arcoSeno( seno )", "calcula o ângulo em graus cujo seno é igual ao valor" ) );
        addCompletion( new ShorthandCompletion( this, "função arcoCosseno(c)", "arcoCosseno( cosseno )", "calcula o ângulo em graus cujo cosseno é igual ao valor" ) );
        addCompletion( new ShorthandCompletion( this, "função arcoTangente(t)", "arcoTangente( tangente )", "calcula o ângulo em graus cuja tangente é igual ao valor" ) );
        addCompletion( new ShorthandCompletion( this, "função cartesianoParaPolar(vY, vX)", "cartesianoParaPolar( variacaoY, variacaoX )", "calcula o ângulo em graus formado pela hipotenusa" ) );
        addCompletion( new ShorthandCompletion( this, "função senoHiperbólico(v)", "senoHiperbólico( valor )", "calcula o seno hiperbólico de um valor" ) );
        addCompletion( new ShorthandCompletion( this, "função cossenoHiperbólico(v)", "cossenoHiperbólico( valor )", "calcula o cosseno hiperbólico de um valor" ) );
        addCompletion( new ShorthandCompletion( this, "função tangenteHiperbólica(t)", "tangenteHiperbólica( valor )", "calcula a tangente hiperbólica de um valor" ) );
        addCompletion( new ShorthandCompletion( this, "função logarítmo(l)", "logarítmo( logaritmando )", "calcula o logaritmo natural (base \u2107) do logaritmando" ) );
        addCompletion( new ShorthandCompletion( this, "função logarítmo(l, b)", "logarítmo( logaritmando, base )", "calcula o logarítmo de um logaritmando em uma base especificada" ) );
        addCompletion( new ShorthandCompletion( this, "função grausParaRadianos(g)", "grausParaRadianos( graus )", "converte um valor em graus para radianos" ) );
        addCompletion( new ShorthandCompletion( this, "função radianosParaGraus(r)", "radianosParaGraus( radianos )", "converte um valor em radianos para graus" ) );
        addCompletion( new ShorthandCompletion( this, "função incrementar(v)", "incrementar( variável )", "incrementa em um a variável especificada" ) );
        addCompletion( new ShorthandCompletion( this, "função decrementar(v)", "decrementar( variável )", "decrementa em um a variável especificada" ) );
        addCompletion( new BasicCompletion( this, "PI", "constante matemática \u03c0", "" ) );
        
        addCompletion( new ShorthandCompletion( this, "desenhar segmento(xi, yi, xf, xf)", "desenhar segmento( xIni, yIni, xFim, yFim ) .", "desenha um segmento" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar quadrado(xc, yc, lado)", "desenhar quadrado( xCentro, yCentro, lado ) .", "desenha um quadrado" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar retângulo(xc, yc, l, a)", "desenhar retângulo( xCentro, yCentro, largura, altura ) .", "desenha um retângulo" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar retânguloArredondado(xc, yc, l, a, ra)", "desenhar retânguloArredondado( xCentro, yCentro, largura, altura, raioArco ) .", "desenha um retângulo de cantos arredondados" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar círculo(xc, yc, r)", "desenhar círculo( xCentro, yCentro, raio ) .", "desenha um círculo" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar elipse(xc, yc, eh, ev)", "desenhar elipse( xCentro, yCentro, eixoHorizontal, eixoVertical ) .", "desenha uma elipse" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar arco(xc, yc, eh, ev, ai, af)", "desenhar arco( xCentro, yCentro, eixoHorizontal, eixoVertical, anguloInicial, anguloFinal ) .", "desenha um arco aberto" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar arco(xc, yc, eh, ev, ai, af, ABERTO)", "desenhar arco( xCentro, yCentro, eixoHorizontal, eixoVertical, anguloInicial, anguloFinal, ABERTO ) .", "desenha um arco aberto" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar arco(xc, yc, eh, ev, ai, af, CORDA)", "desenhar arco( xCentro, yCentro, eixoHorizontal, eixoVertical, anguloInicial, anguloFinal, CORDA ) .", "desenha um arco fechado com uma corda" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar arco(xc, yc, eh, ev, ai, af, PIZZA)", "desenhar arco( xCentro, yCentro, eixoHorizontal, eixoVertical, anguloInicial, anguloFinal, PIZZA ) .", "desenha um arco fechado como pizza" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar polígonoRegular(xc, yc, r, ai, ql)", "desenhar polígonoRegular( xCentro, yCentro, raio, anguloInicial, quantidadeDeLados ) .", "desenha um polígono regular" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar estrela(xc, yc, r, ai, qp)", "desenhar estrela( xCentro, yCentro, raio, anguloInicial, quantidadeDePontas ) .", "desenha uma estrela" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar polígono(x1, y1, x2, y2, x3, y3, ...)", "desenhar polígono( x1, y1, x2, y2, x3, y3, ... ) .", "desenha um polígono de vértices arbitrários" ) );         
        addCompletion( new ShorthandCompletion( this, "desenhar curvaQuadrática(xi, yi, xc, yc, xf, yf)", "desenhar curvaQuadrática( xIni, yIni, xCurva, yCurva, xFim, yFim ) .", "desenha uma curva Bézier quadrática" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar curvaCúbica(xi, yi, xc1, yc1, xc2, yc2, xf, yf)", "desenhar curvaCúbica( xIni, yIni, xCurva1, yCurva1, xCurva2, yCurva2, xFim, yFim ) .", "desenha uma curva Bézier cúbica" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar caminho", "desenhar caminho {\n}", "bloco de desenho de caminhos" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar caminho mover até x, y", "mover até x, y .", "em um caminho, move até uma coordenada" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar caminho linha até x, y", "linha até x, y .", "em um caminho, desenha uma linha até uma coordenada" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar caminho curva quadrática até xc, yc, x, y", "curva quadrática até xCurva, yCurva, x, y .", "em um caminho, desenha uma curva Bézier quadrática até uma coordenada" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar caminho curva cúbica até xc1, yc1, xc2, yc2, x, y", "curva cúbica até xCurva1, yCurva1, xCurva2, yCurva2, x, y .", "em um caminho, desenha uma curva Bézier cúbica até uma coordenada" ) );
        addCompletion( new ShorthandCompletion( this, "desenhar caminho fechar", "fechar .", "fecha/finaliza um caminho" ) );
        
        addCompletion( new ShorthandCompletion( this, "tartaruga x", "tartaruga.x()", "posição atual da tartaruga no eixo x" ) );
        addCompletion( new ShorthandCompletion( this, "tartaruga y", "tartaruga.y()", "posição atual da tartaruga no eixo y" ) );
        addCompletion( new ShorthandCompletion( this, "tartaruga ângulo", "tartaruga.ângulo()", "ângulo atual da tartaruga em graus" ) );
        
        addCompletion( new ShorthandCompletion( this, "pincel (abaixar)", "abaixar pincel .", "abaixa o pincel de pintura" ) );
        addCompletion( new ShorthandCompletion( this, "pincel (levantar)", "levantar pincel .", "levanta o pincel de pintura" ) );
        addCompletion( new ShorthandCompletion( this, "limpar", "limpar .", "limpa toda a área de desenho e reposiciona a tartaruga" ) );
        
        addCompletion( new ShorthandCompletion( this, "girar (graus)", "girar em \u03b8 graus .", "gira a tartaruga em \u03b8 graus" ) );
        addCompletion( new ShorthandCompletion( this, "girar (radianos)", "girar em \u03b8 radianos .", "gira a tartaruga em \u03b8 radianos" ) );
        
        addCompletion( new ShorthandCompletion( this, "vá para", "vá para x, y .", "a tartaruga vai para a coordenada x, y" ) );
        addCompletion( new ShorthandCompletion( this, "vá para cima", "vá para cima em quantidade", "a tartaruga anda uma quantidade de pixels para cima" ) );
        addCompletion( new ShorthandCompletion( this, "vá para baixo", "vá para baixo em quantidade", "a tartaruga anda uma quantidade de pixels para baixo" ) );
        addCompletion( new ShorthandCompletion( this, "vá para esquerda", "vá para esquerda em quantidade", "a tartaruga anda uma quantidade de pixels para esquerda" ) );
        addCompletion( new ShorthandCompletion( this, "vá para direita", "vá para direita em quantidade", "a tartaruga anda uma quantidade de pixels para direita" ) );
        
        addCompletion( new ShorthandCompletion( this, "engrossar pincel", "engrossar pincel .", "engrossa o pincel em 1 pixel" ) );
        addCompletion( new ShorthandCompletion( this, "engrossar pincel em", "engrossar pincel em valor .", "engrossa o pincel em uma quantidade especificada" ) );
        addCompletion( new ShorthandCompletion( this, "desengrossar pincel", "desengrossar pincel .", "desengrossa o pincel em 1 pixel" ) );
        addCompletion( new ShorthandCompletion( this, "desengrossar pincel em", "desengrossar pincel em valor .", "desengrossa o pincel em uma quantidade especificada" ) );
        addCompletion( new ShorthandCompletion( this, "alterar grossura", "alterar grossura para valor .", "altera a grossura do pincel para uma quantidade especificada" ) );
        
        addCompletion( new ShorthandCompletion( this, "trocar cor do pincel", "trocar cor do pincel para #000000 .", "troca a cor do pincel de pintura (contorno e texto)" ) );
        addCompletion( new ShorthandCompletion( this, "trocar cor do preenchimento", "trocar cor do preenchimento para #000000 .", "troca a cor de preenchimento das formas geométricas" ) );
        addCompletion( new ShorthandCompletion( this, "trocar cor do fundo", "trocar cor do fundo para #000000 .", "troca a cor de fundo do cenário da tartaruga" ) );
        
        addCompletion( new ShorthandCompletion( this, "parar", "parar .", "" ) );
        addCompletion( new ShorthandCompletion( this, "continuar", "continuar .", "" ) );
        addCompletion( new ShorthandCompletion( this, "retornar", "retornar expressão .", "" ) );
        
        addCompletion( new ShorthandCompletion( this, ".comprimento()", ".comprimento()", "retorna o comprimento de strings e arranjos (arrays)" ) );
        addCompletion( new ShorthandCompletion( this, ".chaves()", ".chaves()", "retorna um arranjo (array) que contém as chaves de um arranjo (array) associativo" ) );
        addCompletion( new ShorthandCompletion( this, ".caracteres()", ".caracteres()", "retorna um arranjo (array) que contém os caracteres de uma string" ) );
        addCompletion( new ShorthandCompletion( this, ".substring(ini)", ".substring( inicio )", "recorta uma string a partir do índice fornecido (inclusive)" ) );
        addCompletion( new ShorthandCompletion( this, ".substring(ini, fim)", ".substring( início, fím )", "recorta uma string do início (inclusive) ao fim (exclusive)" ) );
        
        addCompletion( new ShorthandCompletion( this, "se", "se condição então {\n\n}", "estrutura condicional \"se\"" ) );
        addCompletion( new ShorthandCompletion( this, "se...senão", "se condição então {\n\n} senão {\n\n}", "estrutura condicional \"se\"...\"senão\"" ) );
        addCompletion( new ShorthandCompletion( this, "se...senão se...senão", "se condição1 então {\n\n} senão se condição2 então {\n\n} senão se condição3 então {\n\n} senão se condiçãoN então {\n\n} senão {\n\n}", "estrutura condicional \"se\"...\"senão se\"...\"senão\"" ) );
        addCompletion( new ShorthandCompletion( this, "usando", "usando variável {\n    escolha 0:\n        parar .\n    escolha 1:\n        parar .\n    escolha 2:\n        parar .\n    escolha N:\n        parar .\n    padrão:\n        parar .\n}", "estrutura condicional \"usando\"" ) );
        
        addCompletion( new ShorthandCompletion( this, "repetir", "repetir {\n\n}", "estrutura de repetição de laço infinito" ) );
        addCompletion( new ShorthandCompletion( this, "repetir vezes", "repetir quantidade vezes {\n\n}", "estrutura de repetição de quantidade fixa de repetições" ) );
        addCompletion( new ShorthandCompletion( this, "repetir enquanto", "enquanto condição repetir [incrementando/decrementando] variável {\n\n}", "estrutura de repetição com condição e controle de passo" ) );
        addCompletion( new ShorthandCompletion( this, "para cada", "para cada item em arranjo repetir {\n\n}", "itera pelo arranjo, posição a posição, atribuindo o valor do momento ao item" ) );
        
        addCompletion( new ShorthandCompletion( this, "criar função", "função identificador {\n    retornar expressão .\n}", "define uma nova função" ) );
        addCompletion( new ShorthandCompletion( this, "criar arranjo", "criarArranjo[tamanho]", "cria um arranjo (array) com o tamanho especificado" ) );
        addCompletion( new ShorthandCompletion( this, "criar array", "criarArray[tamanho]", "cria um array (arranjo) com o tamanho especificado" ) );
        addCompletion( new ShorthandCompletion( this, "criar arranjo associativo", "criarArranjoAssociativo{}", "cria um arranjo (array) associativo" ) );
        addCompletion( new ShorthandCompletion( this, "criar array associativo", "criarArrayAssociativo{}", "cria um array (arranjo) associativo" ) );
        
        addCompletion( new ShorthandCompletion( this, "ler", "ler variável .", "apresenta um diálogo para entrada de dados, atribuindo o valor válido na variável usada" ) );
        addCompletion( new ShorthandCompletion( this, "ler usando a mensagem", "ler variável usando a mensagem expressão.", "apresenta um diálogo para entrada de dados com uma mensagem personalizada, atribuindo o valor válido na variável usada" ) );
        
        addCompletion( new ShorthandCompletion( this, "escrever", "escrever \"expressão\" .", "comanda a tartaruga para escrever a expressão na posição atual" ) );
        addCompletion( new ShorthandCompletion( this, "escrever na saída", "escrever \"expressão\" na saída .", "escreve a expressão na saída" ) );
        addCompletion( new ShorthandCompletion( this, "escrever na saída pulando linha", "escrever \"expressão\" na saída pulando linha .", "escreve a expressão na saída e pula uma linha" ) );
        addCompletion( new ShorthandCompletion( this, "escrever no diálogo", "escrever \"expressão\" no diálogo .", "apresenta um diálogo com a expressão fornecida" ) );
        addCompletion( new ShorthandCompletion( this, "escrever no diálogo pulando linha", "escrever \"expressão\" no diálogo pulando linha .", "apresenta um diálogo com a expressão fornecida e pula uma linha" ) );
        
        addCompletion( new ShorthandCompletion( this, "formatar texto", "formatarTexto( \"padrão\", valor1, valor2, ... )", "realiza a formatação de texto de forma parecida com a função printf da linguagem C" ) );
        addCompletion( new ShorthandCompletion( this, "%d", "d", "especificador de formato para inteiros" ) );
        addCompletion( new ShorthandCompletion( this, "%f", "f", "especificador de formato para decimais" ) );
        addCompletion( new ShorthandCompletion( this, "%c", "c", "especificador de formato para caracteres" ) );
        addCompletion( new ShorthandCompletion( this, "%s", "s", "especificador de formato para strings" ) );
        
        addCompletion( new ShorthandCompletion( this, "#000000", "000000", "insere uma cor" ) );
        addCompletion( new ShorthandCompletion( this, "#00000000", "00000000", "insere uma cor com transparência" ) );
        
        addCompletion( new ShorthandCompletion( this, "é ==", "é igual a", "é igual a" ) );
        addCompletion( new ShorthandCompletion( this, "é !=", "é diferente de", "é diferente de" ) );
        addCompletion( new ShorthandCompletion( this, "é <", "é menor que", "é menor que" ) );
        addCompletion( new ShorthandCompletion( this, "é <=", "é menor ou igual a", "é menor ou igual a" ) );
        addCompletion( new ShorthandCompletion( this, "é >", "é maior que", "é maior que" ) );
        addCompletion( new ShorthandCompletion( this, "é >=", "é maior ou igual a", "é maior ou igual a" ) );
        addCompletion( new ShorthandCompletion( this, "não é ==", "não é igual a", "não é igual a" ) );
        addCompletion( new ShorthandCompletion( this, "não é !=", "não é diferente de", "não é diferente de" ) );
        addCompletion( new ShorthandCompletion( this, "não é >=", "não é maior ou igual a", "não é maior ou igual a" ) );
        addCompletion( new ShorthandCompletion( this, "não é >", "não é maior que", "não é maior que" ) );
        addCompletion( new ShorthandCompletion( this, "não é <=", "não é menor ou igual a", "não é menor ou igual a" ) );
        addCompletion( new ShorthandCompletion( this, "não é <", "não é menor que", "não é menor que" ) );

    }
    
}
