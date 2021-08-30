public class Tcc {

    private String aluno;
    private Apresentacao apresentacao;
    private Monografia monografia;

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public Apresentacao getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(Apresentacao apresentacao) {
        this.apresentacao = apresentacao;
    }

    public Monografia getMonografia() {
        return monografia;
    }

    public void setMonografia(Monografia monografia) {
        this.monografia = monografia;
    }

    public double calculaMedia(){

        double x = 0.6 * apresentacao.getNota() + 0.4 * monografia.getPontos();
        return x;




    }
}

