public class NotaFiscal extends Documentos implements Aquivos,Impressora{
    private String serie;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public int contaPalavras() {
        return 0;
    }

    @Override
    public void grava() {

    }

    @Override
    public void imprime(String texto) {

    }

    @Override
    public void reseta() {

    }
}
