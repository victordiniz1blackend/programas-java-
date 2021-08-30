package rh;

import caracteristicas.Pessoa;

public class Programadores extends Pessoa {
    private String carteiraDeTrab;
    private String ano;
    private double salario;

    public String getCarteiraDeTrab() {
        return carteiraDeTrab;
    }

    public void setCarteiraDeTrab(String carteiraDeTrab) {
        this.carteiraDeTrab = carteiraDeTrab;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
