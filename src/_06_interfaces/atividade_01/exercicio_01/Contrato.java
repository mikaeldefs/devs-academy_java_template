package _06_interfaces.atividade_01.exercicio_01;

class Contrato implements Imprimivel {
    String nome;
    String tipo;

    public Contrato(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void imprimir() {
        System.out.printf("\nSou um contrato muito legal! Meu nome é %s e sou do tipo %s%n", this.nome, this.tipo);
    }

    @Override
    public String toString() {
        return "Contrato nome='" + nome + "', tipo='" + tipo + "'";
    }
}
