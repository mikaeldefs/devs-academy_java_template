package _02_poo_e_java.exercicio_02;

public class Exercicio2 {
    public static void main(String[] args) {
        JogadorDeFutebol jogador1 = new JogadorDeFutebol();
        JogadorDeFutebol jogador2 = new JogadorDeFutebol();

        jogador1.setNome("Messi");
        jogador1.setEnergia(100);

        jogador2.setNome("Zagallo");
        jogador2.setEnergia(100);

        SessaoDeTreinamento treino = new SessaoDeTreinamento();
        System.out.println(jogador1.getNome());
        treino.treinar(jogador1);
        System.out.println(jogador2.getNome());
        treino.treinar(jogador2);
    }

}
