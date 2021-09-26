> # Exercício 03
> 
> * Crie uma Classe CalculoMatematico.
>     
>     * Nela, crie um método divisao, que recebe como parâmetros os valores a serem divididos. O retorno é o resultado da divisão (todos os números devem ser do tipo inteiro); 
> 
> * Crie uma classe de teste para testar a CalculoMatematico 
> 
>     * Nela crie um objeto CalculoMatematico e acesse o método divisao, tentando dividir 4 por 0. 
> 
> * Execute a classe e veja o que acontece; 
> 
> * Crie um bloco try...catch no método divisão para tratar a operação realizada; 
> 
> * No catch: 
>     * Informar o objeto do tipo ArithmeticException 
> 
>     * Imprimir uma mensagem informando que a operação não pode ser realizada 
> 
>     * Retorna zero 
> 
> * Tire o bloco try...catch do método divisão; 
> 
> * Adicione throws ArithmeticException na assinatura do método;
> 
> * E na primeira linha do bloco do método, faça uma verificação se o divisor é igual a 0:
> 
>     * Se for, lance uma exceção throw new ArithmeticException(“Texto”); 
> 
> * Na classe de teste, crie um bloco try...catch, tentando executar o método divisão; 
> 
>     * Catch para ArithmeticException 
> 
>     * No bloco do Catch, imprima o método getMessage() do objeto criado do tipo ArithmeticException