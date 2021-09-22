> # Exercício - Banco Digital
> 
> O Banco Digital solicita o desenvolvimento de um novo sistema, que será utilizado para registrar seus clientes e suas respectivas contas.
> 
> **Clientes:** os clientes devem ser identificados por um número de cliente, um nome, um sobrenome, um número de RG, e um número de CPF.
> 
> **Contas:** as contas do banco devem permitir a realização de depósitos, saques, e consultas de saldo. Toda conta deve ser associada a um cliente.
> 
> **Extensão:**
> 
> **Conta poupança:** além do saldo, as contas poupanças devem ter uma taxa de juros.
> 
> * Esse tipo de conta deve poder realizar as seguintes operações:
>   * Depósito de dinheiro: o cliente deve poder depositar qualquer quantia de dinheiro.
>   * Saque de dinheiro: o cliente deve poder sacar qualquer quantia de dinheiro, desde a quantia não exceda o seu saldo.
>   * Recolhimento de juros: o cliente deve poder recolher os juros mensais aplicados pela sua conta poupança.
>
> **Conta corrente:** além do saldo, as contas correntes devem ter um limite autorizado de cheque especial.
> * Esse tipo de conta deve poder realizar as seguintes operações:
>   * Depósito de dinheiro: o cliente deve poder depositar qualquer quantia de dinheiro.
>   * Saque de dinheiro: o cliente deve poder sacar qualquer quantia de dinheiro, desde a quantia não exceda o seu saldo.
>   * Depósito de cheques: o cliente deve poder depositar cheques. Os cheques devem ter um valor, um banco emissor, e uma data de pagamento.
>
> Implemente as classes aplicando os conceitos de herança, classe abstrata, e de orientação a objetos em Java para a resolução do sistema.