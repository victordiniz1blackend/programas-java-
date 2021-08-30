public class Funcionario extends Pessoa{
    private long ctps;
    private String nome;

    public long getCtps() {
        return ctps;
    }

    public void setCtps(long ctps) {
        this.ctps = ctps;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
