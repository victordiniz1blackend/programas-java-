package venda;

import despachante.Carga;

public class Pedido {
    private long numero;
    private double total;
    private Carga carga[];

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Carga[] getCarga() {
        return carga;
    }

    public void setCarga(Carga[] carga) {
        this.carga = carga;
    }
}
