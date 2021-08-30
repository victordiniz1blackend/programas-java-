public abstract class Aluno {
    private String nome;
    private long ra;

    public abstract double calculaMedia();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }
}
