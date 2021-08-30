public class Documento implements Calcula {
    private String nome;
    private int paginas;
    private String texto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public boolean imprime(String texto) {
        return true;
    }

    @Override
    public boolean limpa() {
return true;
    }

    @Override
    public boolean obtemstatus() {
        return false;
    }
}
