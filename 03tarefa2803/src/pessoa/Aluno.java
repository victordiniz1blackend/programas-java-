package pessoa;

public class Aluno extends Pessoa {
    private String anoCursado;
    private double ra;

    public String getAnoCursado() {
        return anoCursado;
    }

    public void setAnoCursado(String anoCursado) {
        this.anoCursado = anoCursado;
    }

    public double getRa() {
        return ra;
    }

    public void setRa(double ra) {
        this.ra = ra;
    }
}
