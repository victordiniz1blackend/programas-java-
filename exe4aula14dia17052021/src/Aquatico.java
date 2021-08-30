public class Aquatico extends Veiculo{
    private int velocidadeMedia;
    private int tempo;

    public int getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(int velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public double calculaConsumo() {
        return velocidadeMedia*0.3/tempo;
    }
}
