package _06_interfaces.atividade_01.exercicio_01;

class Foto implements Imprimivel {
    String nome;
    String tipo;

    public Foto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void imprimir() {
        System.out.printf("\nSou uma selfie! Meu nome é %s e sou do tipo %s%n", this.nome, this.tipo);
    }

    @Override
    public String toString() {
        return "Foto nome='" + nome + "', tipo='" + tipo + "'";
    }
}
