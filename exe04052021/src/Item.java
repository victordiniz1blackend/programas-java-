public class Item {
    private long quantidade;
    private String materiaPrima[];
    private Produto produto;

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public String[] getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(String[] materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
