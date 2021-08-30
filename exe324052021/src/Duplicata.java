public class Duplicata implements Imprimir,Calcular {
    private long numero;
    private String serie;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
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
