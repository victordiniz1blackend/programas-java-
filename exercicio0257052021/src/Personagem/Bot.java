package Personagem;

public abstract class Bot {
    private String nome;
    private int saude;
    private double forca;

    public Bot(){}

    public Bot(String nome, int saude, double forca){

        this.forca=forca;
        this.saude=saude;
        this.nome=nome;

    }

    public abstract double calculaVida();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }
}
