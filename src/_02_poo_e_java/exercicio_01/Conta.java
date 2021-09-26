package _02_poo_e_java.exercicio_01;

public class Conta {
    private String numero;
    private double saldo;
    private Cliente titular;

    public Conta (String numero, double saldo, Cliente titular){
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Conta(Cliente titular) {
        this.numero = "1";
        this.saldo = 0;
        this.titular = titular;
    }

    public void depositar (double quantia) {
        saldo += quantia;
        System.out.println("Depósito de R$ " + quantia + " realizado.");
        imprimirSaldo();
    }

    public void sacar (double quantia) {
        if (quantia <= saldo) {
            saldo -= quantia;
            System.out.println("Saque de R$ " + quantia + " realizado.");

        } else {
            System.out.println("Saldo insuficiente");
        }
        imprimirSaldo();
    }

    void imprimirSaldo() {
        System.out.printf("O saldo atual é de R$ %.2f.%n", saldo);
    }
}
