public class Venda extends Contrato{

    private double juros;
    private double aliquoto;

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getAliquoto() {
        return aliquoto;
    }

    public void setAliquoto(double aliquoto) {
        this.aliquoto = aliquoto;
    }

    @Override
    public double calculaValor() {
        return getTotal()*juros+aliquoto;
    }
}
