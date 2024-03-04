## O que é estrutura de dados?
É uma metodologia para manusear dados, com a intenção de facilitar e agilizar o processo de acessar e escrever dados.

## Qual sua importância?
Administrar dados sempre foi uma tarefa difícil, especialmente em cenários onde é necessário ler Terabytes de dados de maneira ágil (ex: Contas bancárias, CPFs, etc.). Com isso em mente, é essencial saber como manusear tais com eficiência.

## Estruturas:
### Array (estático e dinâmico):
#### Estático:
É declarado com um tamanho constante, geralmente utilizado em cenários onde se tem certeza de que não precisará alterar o tamanho do array (ex: armazenar dias da semana).

![exemplo de array estático](https://github.com/Buggyes/Algoritmos-e-Estruturas-de-Dados/blob/main/img/ArrayEstatico.png)

#### Dinâmico:
É declarado geralmente dentro de uma função, onde é mais simples alterar seu tamanho de forma dinâmica com uma variável, por exemplo. Apesar de ser bem flexível, as vezes pode trazer problemas por adicionar uma camada a mais de complexidade no código.

![exemplo de array dinâmico](https://github.com/Buggyes/Algoritmos-e-Estruturas-de-Dados/blob/main/img/ArrayDinamico.png)

### Lista:
É um vetor dinâmico de objetos fortemente tipado, ou seja, só permite apenas 1 tipo. Na maioria das linguagens de programação, listas e outras formas de vetores dinâmicos possuem métodos já inclusos na própria classe, como o método ".Add()", ".Sort()", etc. Listas podem ser bastante úteis, porém possuem um grave problema com manuseamento de memória, onde se a lista tiver elementos demais, ela acaba criando um vazamento de memória, pois ela tenta ler mais elementos do que ela consegue armazenar, por isso é preciso ter muito cuidado quando for usarmos uma lista e outras formas de vetores dinâmicos.

![exemplo de lista](https://github.com/Buggyes/Algoritmos-e-Estruturas-de-Dados/blob/main/img/Lista.png)

### Fila (ou queue):
É um vetor dinâmico de objetos fortemente tipado, assim como a lista, porém, ele primáriamente se basea no princípio first-in first-out(o primeiro que entra, é o primeiro que sai). Só é possivel remover o primeiro elemento da fila, ou todos os elementos.

![exemplo de fila](https://github.com/Buggyes/Algoritmos-e-Estruturas-de-Dados/blob/main/img/Fila.png)

### Pilha (ou stack):
A pilha é semelhante a fila, com a diferença de que só é possível tirar o último elemento da pilha, pois ela se basea no princípio last-in first-out (o último que entra, é o primeiro que sai).

![exemplo de pilha](https://github.com/Buggyes/Algoritmos-e-Estruturas-de-Dados/blob/main/img/Pilha.png)