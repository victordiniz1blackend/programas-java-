public class Aluno {
    private long ra;
    private String nome;
    private Avaliacao avaliacao[];

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Avaliacao[] getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao[] avaliacao) {
        this.avaliacao = avaliacao;
    }
}
