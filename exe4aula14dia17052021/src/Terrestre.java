public class Terrestre extends Veiculo {
    private int distancia;
    private int litros;

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    @Override
    public double calculaConsumo() {
        return distancia/0.2*litros;
    }
}
