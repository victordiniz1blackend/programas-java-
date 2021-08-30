public class Pessoa {
    private String nome;
    private int idade;
    private double cpf;
    private Empresa empresa;
    private Trabalha trabalha[];
    private Profissao profissao[];

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Trabalha[] getTrabalha() {
        return trabalha;
    }

    public void setTrabalha(Trabalha[] trabalha) {
        this.trabalha = trabalha;
    }

    public Profissao[] getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao[] profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
