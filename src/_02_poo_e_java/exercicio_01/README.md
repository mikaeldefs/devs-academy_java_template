> # Exercício 01: Clientes e contas
>
> 1. Defina uma nova classe `Cliente` com os seguintes atributos:
>    * `nome`
>    * `sobrenome`
>
> 2. Defina uma nova classe `Conta` com os seguintes atributos:
>    * `número`
>    * `saldo`
>    * `titular` (o titular deve ser um objeto do tipo `Cliente`)
>
> 3. Crie um método `depositar` que tem com parâmetro de entrada uma quantia em dinheiro. O método deve somar a quantia ao saldo, e imprimir na tela o tipo de transação realizada e o novo saldo.
>
> 4. Crie um método `sacar` que tem como parâmetro de entrada uma quantia em dinheiro. Caso o valor do saque seja maior que o saldo disponível, o saque não deve ser efetuado, e o método deve imprimir na tela "Saldo insuficiente". Caso contrário, o método deve substrair a quantia do saldo, e imprimir na tela o tipo de transação.
>
> 5. Defina uma nova classe com um método `main`. Dentro desse método, crie dois clientes, passando nome e sobrenome, e uma conta para cada um, inicializando o numero da conta, saldo e titular. Em seguida, faça um deposito e um saque em cada conta.
>
>    Esclarecimento: defina, para cada classe, os métodos *getters* e *setters* necessários.
