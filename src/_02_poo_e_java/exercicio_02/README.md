# Exercício 02: Jogadores e treinamento 

1. Definir uma nova classe JogadorDeFutebol contendo os seguintes atributos:
    * nome 
    * energia 
    * alegria 
    * gols 
    * experiência 

2. Criar um método chamado fazerGol em jogador, que tire 5 pontos de energia e dê 10 pontos de alegria ao jogador, além de aumentar o número de gols em 1.

    O método deve imprimir “GOOOOL!” na tela. 

3. Criar um método chamado correr em jogador, que tire 10 pontos de energia dele.

    O método deve imprimir na tela: “Cansei”. 

4. Definir uma nova classe SessaoDeTreinamento contendo os seguintes atributos: 
    * experiência (ganha quando um treinamento é realizado) 

5. Criar um método chamado treinarA que tenha como parâmetro de entrada um jogador de futebol.

    Como é um treinamento, o jogador precisa:
    * Correr 
    * Fazer um Gol 
    * Correr 

    Depois que o jogador fizer essas três coisas, a experiência dele deve aumentar, somando um ponto na experiência.
    
    O método deve imprimir a experiência inicial e a experiência final do jogador. 

6. Definir uma nova classe chamada Exercicio2 e criar um método main.

    Dentro do método main, criar dois jogadores de futebol, configurando os atributos necessários, e criar uma sessão de treinamento, também com os atributos necessários.
    
    Os dois jogadores devem realizar um treinamento. 

    Esclarecimento: definir, para cada classe, os getters e setters necessários.

# Adicional: Atletas 2, a missão

Estender o exercício dos atletas para que: 

1. Um atleta possa competir em um dos estádios do Rio.
    Cada estádio tem um conjunto de provas 

2. Dado um atleta, queremos saber como foi o desempenho dele em um estádio, ou seja, que provas ele concluiu.

    O método recebe um atleta e retorna uma lista com as provas concluídas. 

3. Dados dois atletas e uma prova, queremos saber quem é o melhor.

    Ou seja, o atleta que consiga concluir a prova e que tenha o maior nível atlético. 

4. Dados dois atletas e um estádio, definir qual atleta ganhará a medalha de ouro.

    Ou seja, aquele que consiga realizar melhor o maior número de provas.