package rh;

import curriculo.Pessoa;

public class executivo extends Pessoa {
    private String banco;
    private double custos;
    private double salario;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getCustos() {
        return custos;
    }

    public void setCustos(double custos) {
        this.custos = custos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
