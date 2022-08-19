# Funções Matemáticas

A linguagem de programação AuroraLogo suporta diversas funções matemáticas para cálculos variados. Além disso, a constante matemática π (pi) pode ser obtida usando a palavra chave ```PI```.

[Voltar à Página Principal](../README.md)

- **Manipulação de Valores**
  - [Valor Absoluto](#valor-absoluto)
  - [Chão](#chão)
  - [Teto](#teto)
  - [Arredondar](#arredondar)
  - [Mínimo](#mínimo)
  - [Máximo](#máximo)
- **Raízes, Potências e Logarítmos**
  - [Raiz Quadrada](#raiz-quadrada)
  - [Raiz Cúbica](#raiz-cúbica)
  - [Raiz](#raiz)
  - [Potência](#potência)
  - [Logarítmo](#logarítmo)
- **Triângulos e Trigonométricas**
  - [Hipotenusa](#hipotenusa)
  - [Seno](#seno)
  - [Cosseno](#cosseno)
  - [Tangente](#tangente)
  - [Arco Seno](#arco-seno)
  - [Arco Cosseno](#arco-cosseno)
  - [Arco Tangente](#arco-tangente)
  - [Seno Hiperbólico](#seno-hiperbólico)
  - [Cosseno Hiperbólico](#cosseno-hiperbólico)
  - [Tangente Hiperbólica](#tangente-hiperbólica)
- **Números Aleatórios (pseudo-aleatórios)**
  - [Número Aleatório](#número-aleatório)
  - [Número Aleatório em Intervalo](#número-aleatório-em-intervalo)
  - [Definir Semente Aleatória](#definir-semente-aleatória)
- **Conversões**
  - [Cartesiano para Polar](#cartesiano-para-polar)
  - [Graus para Radianos](#graus-para-radianos)
  - [Radianos para Graus](#radianos-para-graus)


## Valor Absoluto

```AuroraLogo
valorAbsoluto( valor )
```

Calcula o valor absoluto de um número inteiro ou decimal.

**Parâmetro(s):**

 > - **valor:** o valor que será usado para calcular o valor absoluto.

**Retorna:** o valor absoluto do valor passado como parâmetro.

[Voltar](#funções-matemáticas)


## Chão

```AuroraLogo
chão( valor )
```

Calcula o chão (menor inteiro mais próximo) de um número decimal.

**Parâmetro(s):**

 > - **valor:** o valor que será usado para calcular o chão.

**Retorna:** o chão do valor passado como parâmetro.

[Voltar](#funções-matemáticas)


## Teto

```AuroraLogo
teto( valor )
```

Calcula o teto (maior inteiro mais próximo) de um número decimal.

**Parâmetro(s):**

 > - **valor:** o valor que será usado para calcular o teto.

**Retorna:** o teto do valor passado como parâmetro.

[Voltar](#funções-matemáticas)


## Arredondar

```AuroraLogo
arredondar( valor [, casasDecimais] )
```

Arredonda um valor removendo sua parte decimal ou, caso a quantidade de casas decimais seja fornecida, o valor é arredondado até a quantidade de casas especificada.

**Parâmetro(s):**

 > - **valor:** o valor a ser arredondado;
 > - **casasDecimais (opcional):** a quantidade de casas decimais que o arredondamento será feito.

**Retorna:** um valor removendo sua parte decimal ou, caso a quantidade de casas decimais seja fornecida, o valor é arredondado até a quantidade de casas especificada.

[Voltar](#funções-matemáticas)


## Mínimo

```AuroraLogo
mínimo( valor1, valor2 )
```

Retorna o menor valor entre dois valores passados como parâmetro.

**Parâmetro(s):**

 > - **valor1:** um valor;
 > - **valor2:** outro valor.

**Retorna:** o menor valor entre os dois valores passados como parâmetro.

[Voltar](#funções-matemáticas)


## Máximo

```AuroraLogo
máximo( valor1, valor2 )
```

Retorna o maior valor entre dois valores passados como parâmetro.

**Parâmetro(s):**

 > - **valor1:** um valor;
 > - **valor2:** outro valor.

**Retorna:** o maior valor entre os dois valores passados como parâmetro.

[Voltar](#funções-matemáticas)


## Raiz Quadrada

```AuroraLogo
raizQuadrada( radicando )
```

Calcula a raiz quadrada de um radicando.

**Parâmetro(s):**

 > - **radicando:** o valor do radicando.

**Retorna:** a raiz quadrada de um radicando. Caso a raiz não exista é retornado o valor NaN (Não-Número).

[Voltar](#funções-matemáticas)


## Raiz Cúbica

```AuroraLogo
raizCúbica( radicando )
```

Calcula a raiz cúbica de um radicando.

**Parâmetro(s):**

 > - **radicando:** o valor do radicando.

**Retorna:** a raiz cúbica de um radicando.

[Voltar](#funções-matemáticas)


## Raiz

```AuroraLogo
raiz( radicando, índice )
```

Calcula a raiz iésima de um radicando. Caso a raiz não exista é retornado o valor NaN (Não-Número).

**Parâmetro(s):**

 > - **radicando:** o valor do radicando;
 > - **índice:** o valor do índice.

**Retorna:** a raiz iésima de um radicando. Caso a raiz não exista é retornado o valor NaN (Não-Número).

[Voltar](#funções-matemáticas)


## Potência

```AuroraLogo
potência( base, expoente )
```

Calcula o valor da base elevada ao expoente.

**Parâmetro(s):**

 > - **base:** o valor da base;
 > - **expoente:** o valor do expoente.

**Retorna:** o valor da base elevada ao expoente. Caso a potência não exista é retornado o valor NaN (Não-Número).

[Voltar](#funções-matemáticas)


## Logarítmo

```AuroraLogo
logarítmo( logaritimando [, base] )
```

Calcula o logaritmo de um logaritmando em uma base ou o logaritmo natural do logaritmando caso a base não seja fornecida.

**Parâmetro(s):**

 > - **logaritmando:** o valor do logaritmando;
 > - **base (opcional):** o valor da base.

**Retorna:** o logaritmo de um logaritmando em uma base ou o logaritmo natural do logaritmando caso a base não seja fornecida.

[Voltar](#funções-matemáticas)


## Hipotenusa

```AuroraLogo
hipotenusa( cateto1, cateto2 )
```

Calcula o valor da hipotenusa formada pelos dois catetos de um triângulo retângulo.

**Parâmetro(s):**

 > - **cateto1:** o valor de um cateto;
 > - **cateto2:** o valor do outro cateto.

**Retorna:** a hipotenusa formada pelos dois catetos.

[Voltar](#funções-matemáticas)


## Seno

```AuroraLogo
seno( ângulo )
```

Calcula o seno de um ângulo expresso em graus.

**Parâmetro(s):**

 > - **ângulo:** o valor de um ângulo em graus.

**Retorna:** o seno correspondente ao ângulo passado como parâmetro.

[Voltar](#funções-matemáticas)


## Cosseno

```AuroraLogo
cosseno( ângulo )
```

Calcula o cosseno de um ângulo expresso em graus.

**Parâmetro(s):**

 > - **ângulo:** o valor de um ângulo em graus.

**Retorna:** o cosseno correspondente ao ângulo passado como parâmetro.

[Voltar](#funções-matemáticas)


## Tangente

```AuroraLogo
tangente( ângulo )
```

Calcula a tangente de um ângulo expresso em graus.

**Parâmetro(s):**

 > - **ângulo:** o valor de um ângulo em graus.

**Retorna:** a tangente correspondente ao ângulo passado como parâmetro.

[Voltar](#funções-matemáticas)


## Arco Seno

```AuroraLogo
arcoSeno( seno )
```

Calcula o ângulo (arco) em graus do seno passado como parâmetro.

**Parâmetro(s):**

 > - **tangente:** o valor do seno que será usado para calcular o ângulo (arco).

**Retorna:** o ângulo (arco) correspondente ao seno passado como parâmetro.

[Voltar](#funções-matemáticas)


## Arco Cosseno

```AuroraLogo
arcoCosseno( cosseno )
```

Calcula o ângulo (arco) em graus do cosseno passado como parâmetro.

**Parâmetro(s):**

 > - **tangente:** o valor do cosseno que será usado para calcular o ângulo (arco).

**Retorna:** o ângulo (arco) correspondente ao cosseno passado como parâmetro.

[Voltar](#funções-matemáticas)


## Arco Tangente

```AuroraLogo
arcoTangente( tangente )
```

Calcula o ângulo (arco) em graus da tangente passada como parâmetro.

**Parâmetro(s):**

 > - **tangente:** o valor da tangente que será usado para calcular o ângulo (arco).

**Retorna:** o ângulo (arco) correspondente à tangente passada como parâmetro.

[Voltar](#funções-matemáticas)


## Seno Hiperbólico

```AuroraLogo
senoHiperbólico( valor )
```

Calcula o seno hiperbólico de um valor.

**Parâmetro(s):**

 > - **valor:** o valor que será usado para calcular o seno hiperbólico.

**Retorna:** o seno hiperbólico do valor passado.

[Voltar](#funções-matemáticas)


## Cosseno Hiperbólico

```AuroraLogo
cossenoHiperbólico( valor )
```

Calcula o cosseno hiperbólico de um valor.

**Parâmetro(s):**

 > - **valor:** o valor que será usado para calcular o cosseno hiperbólico.

**Retorna:** o cosseno hiperbólico do valor passado.

[Voltar](#funções-matemáticas)


## Tangente Hiperbólica

```AuroraLogo
tangenteHiperbólico( valor )
```

Calcula a tangente hiperbólica de um valor. De modo a obter consistência na sintaxe das funções hiperbólicas, a tangente hiperbólica usa o sufixo ```o``` ao invés de ```a``` no nome da função.

**Parâmetro(s):**

 > - **valor:** o valor que será usado para calcular a tangente hiperbólica.

**Retorna:** a tangente hiperbólica do valor passado.

[Voltar](#funções-matemáticas)


## Número Aleatório

```AuroraLogo
númeroAleatório( [limite] )
```

Gera um número aleatório maior ou igual a zero e menor que um, ou um número aleatório maior ou igual a zero e menor que o limite caso o limite seja especificado.

**Parâmetro(s):**

 > - **limite (opcional):** o valor limite/final (exclusive).

**Retorna:** um número aleatório maior ou igual a zero e menor que um, ou um número aleatório maior ou igual a zero e menor que o limite caso o limite seja especificado.

[Voltar](#funções-matemáticas)


## Número Aleatório em Intervalo

```AuroraLogo
númeroAleatório( início, limite )
```

Gera um número aleatório maior ou igual ao valor inicial e menor que o limite.

**Parâmetro(s):**

 > - **início:** o valor inicial (inclusive);
 > - **limite:** o valor limite/final (exclusive).

**Retorna:** um número aleatório maior ou igual ao valor inicial e menor que o limite.

[Voltar](#funções-matemáticas)


## Definir Semente Aleatória

```AuroraLogo
definirSementeAleatória( semente )
```

Define a semente aleatória do gerador de números aleatórios, ou seja, quando usada com um valor constante, todos os números aleatórios gerados seguirão a mesma ordem.

**Parâmetro(s):**

 > - **semente:** um número inteiro que servirá como semente aleatória.

[Voltar](#funções-matemáticas)


## Cartesiano para Polar

```AuroraLogo
cartesianoParaPolar( variaçãoY, variaçãoX )
```

Converte uma coordenada cartesiana indicada pela variação em y e variação em x em uma coordenada polar, ou seja, o ângulo formado entre a hipotenusa e o cateto adjacente à esse ângulo em um triângulo retângulo.

**Parâmetro(s):**

 > - **variaçãoY:** a variação em y dos dois pontos que se quer obter a coordenada polar;
 > - **variaçãoX:** a variação em yy dos dois pontos que se quer obter a coordenada polar.

**Retorna:** o ângulo expresso em graus formado entre a hipotenusa e o cateto adjacente à esse ângulo em um triângulo retângulo.

[Voltar](#funções-matemáticas)


## Graus para Radianos

```AuroraLogo
grausParaRadianos( graus )
```

Converte um valor expresso em graus para um valor expresso em radianos.

**Parâmetro(s):**

 > - **graus:** o valor em graus.

**Retorna:** o valor em radianos correspondente ao valor em graus passado como parâmetro.

[Voltar](#funções-matemáticas)


## Radianos para Graus

```AuroraLogo
radianosParaGraus( radianos )
```

Converte um valor expresso em radianos para um valor expresso em graus.

**Parâmetro(s):**

 > - **radianos:** o valor em radianos.

**Retorna:** o valor em graus correspondente ao valor em radianos passado como parâmetro.

[Voltar](#funções-matemáticas)
