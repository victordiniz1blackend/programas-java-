package local;

import vendas.Pedidos;

public class Cliente {
    private long numero;
    private double valor;
    private Pedidos pedidos[];

    public long getNumero() {

        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pedidos[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedidos[] pedidos) {
        this.pedidos = pedidos;
    }
}
