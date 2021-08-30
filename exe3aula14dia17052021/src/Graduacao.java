public class Graduacao extends Aluno{

    private double notaBimestre;
    private double notaTrabalho;

    public double getNotaBimestre() {
        return notaBimestre;
    }

    public void setNotaBimestre(double notaBimestre) {
        this.notaBimestre = notaBimestre;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    @Override
    public double calculaMedia() {
        return notaBimestre*0.6+notaTrabalho+0.4;
    }
}
