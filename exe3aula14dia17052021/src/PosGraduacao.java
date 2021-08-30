public class PosGraduacao extends Aluno {

    private double notaArtigo;
    private double notaBanca;

    public double getNotaArtigo() {
        return notaArtigo;
    }

    public void setNotaArtigo(double notaArtigo) {
        this.notaArtigo = notaArtigo;
    }

    public double getNotaBanca() {
        return notaBanca;
    }

    public void setNotaBanca(double notaBanca) {
        this.notaBanca = notaBanca;
    }

    @Override
    public double calculaMedia() {
        return notaArtigo*0.3+notaBanca+0.7;
    }
}
