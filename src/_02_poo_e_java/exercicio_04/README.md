# Exercício 04: Tripé 

O tripé é um aparelho de três pés, com a parte superior circular ou triangular, que permite estabilizar uma câmera e evitar os movimentos dela. Queremos modelar o comportamento desse objeto. 

1. Definir uma classe Tripé contendo os seguintes atributos: 
    * dobrado: indica o estado atual do tripé (dobrado ou não) 
    * alturaMinima 
    * alturaMaxima 
    * alturaAtual. 

2. Definir o método definirAltura(Integer novaAltura), que receba uma altura e modifique o valor da altura atual. 

3. Definir o método dobrar(), que permita dobrar o tripé. 

4. Definir o método desdobrar(), que permita desdobrar o tripé.

5. Definir o método guardar(), que permita deixar o tripé pronto para guardar.

    Ou seja, ele deve estar dobrado e a altura atual deve ser a menor possível. 

6. Definir o método prontoParaGuardar(), que permita verificar se o tripé está pronto para ser guardado.

    Ou seja, ele deve estar dobrado e com a mínima altura atual. 

7. Definir o método usar(), que permita usar o tripé.

    Um tripé está pronto para usar quando está desdobrado e com altura superior à metade da altura máxima. 

8. Definir o método prontoParaUsar(), que permita verificar se o tripé está pronto para ser usado.

    Ou seja, ele deve estar desdobrado e com altura superior à metade da altura máxima. 

9. Definir uma nova classe chamada Exercicio4 e criar um método main.

    Dentro do método main, criar um tripé e fazer testes com os métodos definidos anteriormente. 