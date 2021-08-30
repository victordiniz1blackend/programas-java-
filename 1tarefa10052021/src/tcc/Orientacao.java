package tcc;

import secretaria.Aluno;

public class Orientacao {
    private String data;
    private String hora;
    private Aluno aluno;
    private Projeto projeto[];

    public Projeto[] getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto[] projeto) {
        this.projeto = projeto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
