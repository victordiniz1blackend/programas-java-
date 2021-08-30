public class Fisica extends Pessoa {

    private long cpf;
    private String nome;

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  Fisica(){ }

    public Fisica(String nome, long cpf){
        this.cpf =cpf; ;
        this.nome = nome;
    }

    @Override
    public double recalculaSaldo(double juros) {
        return getSaldo()*(1+juros);
    }

    @Override
    public double obtemCorrecao(int dias) {
        return getSaldo()*(1 + dias)/(dias * 2);
    }
}
