> # Exercício 05: Veículos usados
>
> Queremos desenvolver um sistema informátio para uma concessionária de carros usados. Todos os carros têm marca, modelo, ano de fabricação, cor, e quilometragem.
>
> Como estratégia de marketing, a concessionária quer ter um registro dos clientes que compraram os veículos. O departamento de marketing da concessionária precisa saber o nome, o sobrenome, e alguma informação de contato dos clientes para poder oferecer outros carros no futuro.
>
> Por outro lado, o departamento de contabilidade da concessionária quer ter um registro das vendas realizadas.
>
> Cada registro deve ter as seguintes informações:
> * `valorDaVenda`
> * `veiculoVendido`
> * `cliente`
>
> 1. Faça um diagrama de classe representando o modelo que queremos implementar.
>
> 2. Implemente cada classe e definir seus atributos. As classes que devem ser implementadas são:
>   * `Concessionaria`
>   * `Cliente`
>   * `Venda`
>   * `Veiculo`
>
> 3. Crie os construtores para as classes `Cliente`, `Veiculo`, e `Venda`.
>   * `Cliente` deve ter como parâmetros:
>      * `nome`
>      * `sobrenome`
>      * `contato`
>   * `Veículo` deve ter como parâmetros:
>      * `marca`
>      * `modelo`
>      * `anoDeFabricacao`
>      * `cor`
>      * `quilometragem`
>   * `Venda` deve ter como parâmetros:
>      * `cliente`
>      * `veículo`
>      * `valorDaVenda`
>
> 4. Defina, na classe `Concessionaria`, o método `registrarVenda(Veiculo vericulo, Cliente cliente, double valor)`, que adiciona ao registo de vendas da concessionária uma nova venda de um veículo a um cliente com um determinado valor.
>
> 5. Defina uma nova classe com um método `main`. Dentro desse método, crie um carro e um cliente, e registre a venda desse veículo ao cliente.
