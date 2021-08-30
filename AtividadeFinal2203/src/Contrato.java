public class Contrato {

    private long numero;
    private String data;
    private double valor;
    private double multa;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getImpostoMulta(){
        double impostoMulta = this.multa*5.0;
        return impostoMulta;
    }
    public double getValorMulta(){

        double Valormulta = this.multa + this.valor + getImpostoMulta();
        return Valormulta;
    }
}
