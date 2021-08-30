public class Calcular {

    private int numero;
    private int numero2;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getCalcula(){

        int calcula = this.numero + this.numero2;

                return calcula;
    }

    public double getdividir() {

        double dividir = this.numero / this.numero2;

        return dividir;
    }
}
