package faculdade.coordenacaodis;

import faculdade.coordenaao.Professor;
import faculdade.historico.Prova;
import faculdade.secretaria.Aluno;

public class Disciplina {

    private long numero;
    private String nome;
    private Professor professor[];
    private Aluno aluno[];
    private Prova prova;

    public Professor[] getProfessor() {
        return professor;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
