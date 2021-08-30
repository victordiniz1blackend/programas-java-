package transporte;

import negocio.Mercadoria;

public class Trem {

    private String numero;
    private String modelo;
    private Mercadoria mercadoria[];

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Mercadoria[] getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(Mercadoria[] mercadoria) {
        this.mercadoria = mercadoria;
    }
}