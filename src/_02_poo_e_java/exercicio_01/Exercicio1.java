package _02_poo_e_java.exercicio_01;

public class Exercicio1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "da Silva");
        Conta conta1 = new Conta("159753", 0, null);
        conta1.depositar(150);
        conta1.sacar(50);

        Cliente cliente2 = new Cliente("Maria", "Souza");
        Conta conta2 = new Conta("357753", 1000, null);
        conta2.depositar(500);
        conta2.sacar(5000);
    }
}
