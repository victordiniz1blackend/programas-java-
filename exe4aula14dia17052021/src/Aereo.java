public class Aereo extends Veiculo{
    private int duracaoVoo;
    private int galoes;

    public int getDuracaoVoo() {
        return duracaoVoo;
    }

    public void setDuracaoVoo(int duracaoVoo) {
        this.duracaoVoo = duracaoVoo;
    }

    public int getGaloes() {
        return galoes;
    }

    public void setGaloes(int galoes) {
        this.galoes = galoes;
    }

    @Override
    public double calculaConsumo() {
        return duracaoVoo/galoes*0.2;

    }
}
