> # Desafio
> 
> Desenvolva um sistema para gerenciamento de pessoas em uma empresa.
> 
> A empresa *Incognitus S.A.* decidiu informatizar sua gestão de funcionários, e contratou você para implementar um sistema que satisfaça os seguintes requisitos:
>   * Todo funcionário deve ter as seguintes informações em seu cadastro:
>       * nome
>       * setor
>       * email
>       * endereço
>       * data de admissão
>       * data de demissão
>   * Todo cadastro de funcionário do tipo Pessoa Física deve conter o número do CPF e da carteira de trabalho (NIT)
>   * Todo cadastro de funcionário do tipo Pessoa Jurídica deve conter o número do CNPJ.
>   * Os funcionários devem receber um salário base
>   * Os funcionários devem poder consultar seu contra-cheque
>   * Os funcionários podem requisitar férias, mas precisa estar na empresa há pelo menos 11 meses, e suas últimas férias devem ter sido tiradas há pelo menos quatro meses.
>   * Os funcionários podem trabalhar, pedir demissão, ou solicitar aumento (implemente uma lógica de escolha aleatória para que o aumento seja aprovado ou não).
>   * Os funcionários em estado de férias não devem trabalhar.
>   * Os supervisores e gerentes sempre serão do tipo Pessoa Física
>   * Os supervisores e gerentes recebem uma bonificação de 12% e 8% de seus salários, respectivamente.
>   * Os supervisores podem demitir um funcionário, mas não podem demitir gerentes nem outros supervisores.
>   * Os gerentes podem demitir um funcionário ou um supervisor, mas não podem demitir outros gerentes.
>   * Os gerentes podem reajustar os salários dos funcionários e dos supervisores, contanto que o reajuste não implique em redução do salário.
> 
> Você pode implementar quaisquer outros atributos e métodos nas classes criadas desde que nenhuma regra de negócio seja quebrada.
> 
> Após a implementação do sistema, instancie um gerente, um supervisor, e um funcionário, e os adicione a um ArrayList.