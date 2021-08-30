package estoque;

public abstract class Produto {
    private long codigo;
    private String nome;
    private MateriaPrima materiaPrima[];

    public MateriaPrima[] getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriaPrima[] materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
