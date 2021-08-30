package departamento;

import pessoas.Responsavel;

public class Trabalho {

    private String nome;
    private double descricao;
    private Responsavel responsavel[];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDescricao() {
        return descricao;
    }

    public void setDescricao(double descricao) {
        this.descricao = descricao;
    }

    public Responsavel[] getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel[] responsavel) {
        this.responsavel = responsavel;
    }
}
