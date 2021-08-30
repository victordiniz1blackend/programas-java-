public class Locacao extends Contrato {

    private int prazo;
    private double aluguel;

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }

    @Override
    public double calculaValor() {
        return getTotal()+(prazo+aluguel);
    }
}
