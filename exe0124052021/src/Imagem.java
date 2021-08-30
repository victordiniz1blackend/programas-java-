public class Imagem implements Calcula {

    private String nome;
    private String caminho;
    private int tamanho;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public boolean imprime(String texto) {
        return false;
    }

    @Override
    public boolean limpa() {
        return false;
    }

    @Override
    public boolean obtemstatus() {
        return false;
    }
}
