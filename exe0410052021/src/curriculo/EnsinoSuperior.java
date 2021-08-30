package curriculo;

public class EnsinoSuperior {
    private double nota;
    private Curso curso;

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public Curso getCurso() {
        return curso;
    }
}
