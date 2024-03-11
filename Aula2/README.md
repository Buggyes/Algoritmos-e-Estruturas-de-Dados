
> Os exemplos foram escritos em Java, e estão disponíveis na pasta [Exemplos](https://github.com/Buggyes/Algoritmos-e-Estruturas-de-Dados/blob/main/Aula2/Exemplos) deste diretório.
### Vector:
Vector é um array dinâmico onde sua capacidade e escalonamento podem ser definidos manualmente pelo programador, ao contrário de outras formas de arrays dinâmicos. É uma ótima forma de armazenar dados principalmente em cenários onde performance é uma das principais prioridades de uma aplicação.

![exemplo de vector](https://github.com/Buggyes/Algoritmos-e-Estruturas-de-Dados/blob/main/img/Vector.png)

### ArrayList:
ArrayList é uma forma mais simplificada de um vector, sem a necessidade de manualmente atribuir o seu tamanho inicial e escalonamento, já que na maioria das linguagens isto é feito automáticamente dentro da classe do ArrayList, e também já possui funções utilitarias implementadas como "sort()", e um "foreach()" já integrado dentro de si.

Porém, a maior desvantagem é a maneira que o ArrayList funciona. Quando o espaço de um LinkedList é preenchido (internamente), ele gera um array novo com um tamanho muito maior, transfere **todos** os elementos do array antigo para o array novo, e deleta o array antigo após isso. Isso é um processo muito custoso, considerando que ArrayLists são utilizados em diversos sistemas e aplicações de grande porte que estão no mercado.

![exemplo de ArrayList](https://github.com/Buggyes/Algoritmos-e-Estruturas-de-Dados/blob/main/img/ArrayList.png)

### LinkedList:
Na prática, um LinkedList é utilizado da mesma forma que um ArrayList, porém a única característica que difere um LinkedList de um ArrayList é a maneira que ele funciona por baixo dos panos.

Um LinkedList armazena seus elementos em "containers". A lista possui um índice do primeiro container, e todo container possui um índice para o próximo container da lista. Ele básicamente funciona que nem uma Queue (fila).

![exemplo de LinkedList](https://github.com/Buggyes/Algoritmos-e-Estruturas-de-Dados/blob/main/img/LinkedList.png)

### Hashmap:
HashMaps funcionam essencialmente da mesmo jeito que um ArrayList, a única diferença sendo para criar e acessar os seus elementos, é necessário criar uma chave única para cada elemento.

![exemplo de HashMap](https://github.com/Buggyes/Algoritmos-e-Estruturas-de-Dados/blob/main/img/HashMap.png)