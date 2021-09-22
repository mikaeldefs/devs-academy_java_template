> # Exercício 4: Tripé
>
> O tripé é um aparelho de três pés, com uma parte superior circular ou triangular que permite estabilizar uma câmera, evitando seus movimentos. Queremos modelar o comportamento desse objeto.
>
> 1. Defina uma classe `Tripe` com os seguintes atributos:
>   * `dobrado` (indica se o tripé está ou não dobrado)
>   * `alturaMinima`
>   * `alturaMaxima`
>   * `alturaAtual`
>
> 2. Defina o método `definirAltura(Integer novaAltura), que recebe uma altura e modifica o valor da altura atual.
>
> 3. Defina o método `dobrar()`, que dobra o tripé.
>
> 4. Defina o método `desdobrar()`, que desobra o tripé.
>
> 5. Defina o método `prontoParaGuardar()`, que verifica se o tripé está pronto para guardar. Um tripé está pronto para guardar caso esteja dobrado, e sua altura atual seja igual à sua altura mínima.
>
> 6. Defina o método `guardar()`, que deixa o tripé pronto para guardar.
>
> 7. Defina o método `prontoParaUsar(), que deixa o tripé pronto para usar. Um tripé está pronto para usar caso não esteja dobrado, e sua altura atual seja de pelo menos a média entre a sua altura mínima e a sua altura máxima.
>
> 8. Defina o método `usar()`, que deixa o tripé pronto para usar.
>
> 7. Defina uma nova classe com um método `main`. Dentro desse método, criar um tripé e fazer testes com os métodos definidos anteriormente.
