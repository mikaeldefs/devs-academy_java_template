# Exercício 01: Clientes e contas 

1. Definir uma nova classe Cliente contendo os seguintes atributos: 
    * nome
    * sobrenome

2. Definir uma nova classe Conta contendo os seguintes atributos: 
    * número da conta 
    * saldo 
    * titular (o titular é um objeto do tipo Cliente). 

3. Criar um método chamado depósito que tenha como parâmetro de entrada quantia em dinheiro.

    Como estamos fazendo um depósito, a quantia de dinheiro é somada ao saldo.
    
    O método deve imprimir na tela o tipo de transação realizada e o novo saldo. 

4. Criar um método chamado saque que tenha como parâmetro de entrada quantia em dinheiro.

    Como estamos fazendo um saque, a quantia é subtraída do saldo.
    
    Caso o valor do saque a realizar seja maior que o saldo disponível, imprimir na tela: “Saldo insuficiente”.
    
    Caso contrário, o método deve imprimir na tela o tipo de transação realizada e o novo saldo.

5. Definir uma nova classe chamada Exercicio1 e criar um método main.

    Dentro do método main, criar dois clientes, passando nome e sobrenome, e criar uma conta para cada um, inicializando número da conta, saldo e titular.
    
    Em seguida, fazer um depósito e um saque em cada conta.
    
    Esclarecimento: definir, para cada classe, os métodos getters e setters necessários. 