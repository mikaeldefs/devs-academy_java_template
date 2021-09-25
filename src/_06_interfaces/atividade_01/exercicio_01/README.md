# Exercício 01: Impressora 

Criar uma interface chamada Imprimível. Nessa interface, definir o método imprimir, com a seguinte assinatura: public void imprimir() 

Em seguida, criar as seguintes classes e fazer com que cada uma implementa a interface Imprimível. Definir também o comportamento do método imprimir em cada caso: 

* Contrato: Um contrato tem nome e tipo e ao imprimir mostra na tela “Sou um contrato muito legal” junto com o nome e tipo. 

* Foto: Uma foto tem nome e tipo e ao imprimir mostra na tela imprime na tela “Sou uma selfie” junto com o nome e tipo. 

* Documento: Um Documento tem nome e tipo e ao imprimir mostra na tela “Sou um documento do Word” junto com o nome e tipo. 

Criar uma classe abstrata Impressora contendo uma lista de imprimíveis. Em seguida, criar dois métodos na classe impressora: 

* public void imprimirTudo(). Esse método será encarregado de percorrer a lista de imprimíveis e fazer a impressão.. 

* public void adicionarImprimivel(Imprimivel umImprimivel). Esse método será encarregado de adicionar um imprimível à lista da impressora. 

Criar na classe Main: 

* um contrato 

* uma foto 

* documento

* impressora. 

Adicionar o contrato, a foto e o documento à impressora. Pedir para a impressora imprimir tudo. Observar o comportamento. 