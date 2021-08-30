package curriculo;

public abstract class Pessoa {
    private long cpf;
    private String nome;
    private Profissao profissao;
    private EnsinoSuperior ensino[];

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

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public EnsinoSuperior[] getEnsino() {
        return ensino;
    }

    public void setEnsino(EnsinoSuperior[] ensino) {
        this.ensino = ensino;
    }
}
