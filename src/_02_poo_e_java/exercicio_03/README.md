> # Exercício 3: Atletas e prova
>
> 1. Defina uma nova classe `Atleta` com os seguintes atributos:
>   * `nome`
>   * `nível`
>   * `energia`
>
> 2. Defina uma nova classe `Prova` com os seguintes atributos:
>    * dificuldade
>    * energiaNecessaria
>
> 3. Crie, na classe `Prova`, o método `podeRealizar`, que deve ter como parâmetro de entrada um objeto do tipo `Atleta`. O método deve retornar `true` caso o atleta possa realizar a prova e, caso contrário, `false`. Um atleta pode realizar a prova se tiver um nível maior ou igual à dificuldade da prova, além de energia suficiente.
>
> 4. Defina uma nova classe com um método `main`. Dentro desse método, crie dois atletas, configurando os atributos necessários, e três provas para cada um, também com os atributos necessários. Depois, verifique se os atletas podem realizar essas provas.
>
>   Esclarecimento: defina, para cada classe, os getters e setters necessários.

> # Extra:
>
> Estenda o projeto Atletas e provas:
>
> 1. Crie uma classe `Estadio`, que deve ter como atributo um conjunto de provas a serem realizadas por um atleta.
>
> 2. Defina um método na classe `Estadio` que recebe um atleta e retorna a lista de provas concluídas pelo atleta.
>
> 3. Defina um método que recebe dois atletas e compara os seus desempenhos. O método deve declarar o melhor atleta, baseando-se em seus níveis atléticos.
>
> 4. Defina um método que recebe dois atletas e declara qual deles obterá a medalha de ouro. Ganhará a medalha de ouro o atleta que consiga realizar o maior número de provas.
