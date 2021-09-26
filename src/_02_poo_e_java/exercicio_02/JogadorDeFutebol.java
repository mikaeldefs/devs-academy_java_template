package _02_poo_e_java.exercicio_02;

public class JogadorDeFutebol {
    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;

    public JogadorDeFutebol() {
        this.setNome("");
        this.setEnergia(0);
        this.setAlegria(0);
        this.setGols(0);
        this.setExperiencia(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void fazerGol() {
        this.setEnergia(getEnergia() - 5);
        this.setAlegria(getAlegria() + 10);
        this.setGols(getGols() + 1);
        System.out.println("GOOOOL!");
    }

    public void correr() {
        this.setEnergia(getEnergia() - 10);
        System.out.println("Cansei");
    }


}
