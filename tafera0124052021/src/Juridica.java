public  class Juridica extends Pessoa {
    private long cnpj;
    private double razaoSocial;

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public double getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(double razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public Juridica(){}

    public Juridica(long cnpj, double razaoSocial){

        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public double recalculaSaldo(double juros) {
        return getSaldo()*(1+juros);
    }

    @Override
    public double obtemCorrecao(int dias) {
        return getSaldo()*(1+dias)/(dias/31);
    }

}
