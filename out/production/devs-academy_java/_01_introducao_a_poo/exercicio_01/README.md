# Exercício 01: Clientes e contas

1. Definir uma nova classe `Cliente` com os seguintes atributos:
    - `nome`
    - `sobrenome`

2. Definir uma nova classe `Conta` com os seguintes atributos:
    - `número`
    - `saldo`
    - `titular` (o titular deve ser um objeto do tipo `Cliente`)

3. Criar um método chamado `depositar` que tenha como parâmetro de entrada uma quantia em dinheiro. Como estamos fazendo um depósito, a quantia deve ser somado ao saldo. O método deve imprimir na tela o tipo de transação realizada e o novo saldo.

4. Criar um método chamado `sacar` que tenha como parâmetro de entrada uma quantia em dinheiro. Como estamos fazendo um saque, a quantia deve ser subtraída do saldo. Caso o valor do saque seja maior que o saldo disponível, o saque não deve ser efetuado, e deve-se imprimir na tela "Saldo insuficiente". Caso contrário, o método deve imprimir na tela o tipo de transação e o novo saldo.
