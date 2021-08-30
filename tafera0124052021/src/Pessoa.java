public abstract class Pessoa {
    private long codigo;
    private double saldo;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double razaoSocial) {
        this.saldo = razaoSocial;
    }

    public abstract double recalculaSaldo( double juros);

    public abstract double obtemCorrecao(int dias);

    public Pessoa(){

    }

    public Pessoa(long codigo, double saldo ){

        this.codigo = codigo;
        this.saldo = saldo;


    }

}
