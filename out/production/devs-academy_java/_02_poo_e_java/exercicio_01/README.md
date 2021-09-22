# Exercício 01: Clientes e contas

1. Definir uma nova classe `Cliente` com os seguintes atributos:
    - `nome`
    - `sobrenome`

2. Definir uma nova classe `Conta` com os seguintes atributos:
    - `número`
    - `saldo`
    - `titular` (o titular deve ser um objeto do tipo `Cliente`)

3. Criar um método chamado `depositar` que tenha como parâmetro de entrada uma quantia em dinheiro. Como estamos fazendo um depósito, a quantia deve ser somado ao saldo. O método deve imprimir na tela o tipo de transação realizada e o novo saldo.

4. Criar um método chamado `sacar` que tenha como parâmetro de entrada uma quantia em dinheiro. Como estamos fazendo um saque, a quantia deve ser subtraída do saldo. Caso o valor do saque seja maior que o saldo disponível, o saque não deve ser efetuado, e deve-se imprimir na tela "Saldo insuficiente". Caso contrário, o método deve imprimir na tela o tipo de transação.

5. Definir uma nova classe com um método `main`. Dentro desse método, criar dois clientes, passando nome e sobrenome, e criar uma conta para cada um, inicializando o numero da conta, saldo e titular. Em seguida, fazer um deposito e um saque em cada conta.

    Esclarecimento: definir, para cada classe, os métodos getters e setters necessários.
