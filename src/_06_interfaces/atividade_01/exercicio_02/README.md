> # Exercício 02: Voador
> 
> Criar uma interface chamada Voador. Nessa interface, definir o método voar, com a seguinte assinatura: 
> 
> public void voar() 
> 
> Em seguida, criar as seguintes classes e fazer com que cada uma implement a interface Voador. Definir também o comportamento do método voar em cada caso: 
> 
> * Pato: o pato tem uma energia. Cada vez que voa, ele perde 5 unidades de energia e imprime na tela “Estou voando como um pato” 
> 
> * Avião: o avião tem horas de voo. Cada vez que o avião voa, soma 13h de voo e imprime na tela “Estou voando como um avião”. 
> 
> * Super-homem: o super-homem tem experiência. Cada vez que o super-homem voa, a experiência dele aumenta 3 unidades, e imprime na tela “Estou voando como um campeão” 
> 
> Criar uma classe TorreDeControle contendo uma lista de voadores. Em seguida, criar dois métodos na classe TorreDeControle: 
> 
> * public void voemTodos(). Esse método será encarregado de percorrer a lista de voadores e fazer com que eles voem.
> 
> * public void adicionarVoador(Voador umVoador). Esse método será encarregado de adicionar um voador à lista de voadores. 
> 
> Criar na classe Main: 
> 
> * um pato 
> 
> * um avião 
> 
> * o super-homem 
> 
> * uma torre de controle 
> 
> Adicionar o pato, o avião e o super-homem à torre de controle. Pedir para a torre de controle fazer todos os voadores voarem. Observar o comportamento.