public class NotaFiscal {

    private long numero;
    private String data;
    private double valor;

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

    public double getImposto(){
        double imposto = this.valor*0.16;
        return imposto;
    }
    public double getTotal(){
        double total = this.valor+getImposto();
        return total;
    }
}
