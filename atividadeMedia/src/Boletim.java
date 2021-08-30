public class Boletim {

    private String disciplina;
    private double notaProva;
    private double notaTrabalho;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(double notaProva) {
        this.notaProva = notaProva;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
    public double getMedia() {

        return this.notaProva*0.7 + this.notaTrabalho*0.3;

    }
    public double getMedia(){

        double media = 0.7*notaProva+0.3*notaTrabalho;
        return media;
    }
}
