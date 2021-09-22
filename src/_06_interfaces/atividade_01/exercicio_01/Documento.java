package _06_interfaces.atividade_01.exercicio_01;

class Documento implements Imprimivel {
    String nome;
    String tipo;

    public Documento(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void imprimir() {
        System.out.printf("\nSou um documento do Word! Meu nome é %s e sou do tipo %s%n", this.nome, this.tipo);
    }

    @Override
    public String toString() {
        return "Documento nome='" + nome + "', tipo='" + tipo + "'";
    }
}
