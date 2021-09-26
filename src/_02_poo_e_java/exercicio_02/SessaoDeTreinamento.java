package _02_poo_e_java.exercicio_02;

public class SessaoDeTreinamento {
    private int experiencia;

    public SessaoDeTreinamento() {
        this.setExperiencia(0);
    }

    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void treinar (JogadorDeFutebol jogador) {
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        System.out.println("Experiência inicial: " + jogador.getExperiencia());
        jogador.setExperiencia(jogador.getExperiencia()+1);
        System.out.println("Experiência final: " + jogador.getExperiencia());
    }


}
