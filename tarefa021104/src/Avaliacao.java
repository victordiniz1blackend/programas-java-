public class Avaliacao {

    private String aluno;
    private Prova prova;
    private Trabalho trabalho;

    public double getCalculaMedia(){

        return 0.8* prova.getNota() + 0.2 * trabalho.getPontos();
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }
}
