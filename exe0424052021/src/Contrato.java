public class Contrato extends Documentos implements Aquivos,Impressora {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
