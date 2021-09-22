# Exercício 02: Jogadores e treinamento

1. Definir uma nova classe JogadorDeFutebol com os seguintes atributos:
    - `nome`
    - `energia`
    - `alegria`
    - `gols`
    - `experiencia`
    
2. Criar um método chamado `fazerGol` na classe Jogador, que tira 5 pontos de energia e dá 10 pontos de alegria ao jogador, além de aumentar o número de gols em 1. O método ve imprimir "GOOOOL!" na tela.

3. Criar um método chamado `correr` na classe Jogador, que tira 10 pontos de energia do jogador. O método deve imprimir na tela "Cansei".

4. Definir uma nova classe `SessaoDeTreinamento` com os seguintes atributos:
    - `experiencia`(o quanto de experiência será ganhada por um jogador quando o treinamento é realizado)

5. Criar um método chamado `treinar`, que tem como parâmetro de entrada um jogador de futebol. Por ser um treinamento, o jogador precisa:
    - Correr
    - Fazer um gol
    - Correr
    
    Depois que o jogador realizar essas três ações, a experiência dele deve aumentar, somando o valor do atributo experiência da sessão de treinamento ao atributo experiência do jogador. O método deve imprimir a experiência inicial e a experiência final do jogador.

6. Definir uma nova classe com um método `main`. Dentro do método main, criar dois jogadores de futebol, configurando os atributos necessários, e criar uma sessão de treinamento, também com os atributos necessários. Os dois jogadores devem realizar um treinamento.

    Esclarecimento: definir, para cada classe, os getters e setters necessários.
