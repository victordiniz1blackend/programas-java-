public class Equipamento {

    private String nome;
    private double preco;
    private Analogico analogico;
    private  Eletrico eletrico;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Analogico getAnalogico() {
        return analogico;
    }

    public void setAnalogico(Analogico analogico) {
        this.analogico = analogico;
    }

    public Eletrico getEletrico() {
        return eletrico;
    }

    public void setEletrico(Eletrico eletrico) {
        this.eletrico = eletrico;
    }
}
