public abstract class Veiculo {

    private int ano;
    private double valor;
    private Fabrica fabrica[];

    public Fabrica[] getFabrica() {
        return fabrica;
    }

    public void setFabrica(Fabrica[] fabrica) {
        this.fabrica = fabrica;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
