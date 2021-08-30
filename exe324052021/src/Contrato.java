public class Contrato implements Calcular, Imprimir {
    private long numero;
    private String validade;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    @Override
    public void mprime() {

    }

    @Override
    public void estar() {

    }

    @Override
    public void limpar() {

    }

    @Override
    public boolean imprimie() {
        return false;
    }

    @Override
    public int testar() {
        return 0;
    }
}
