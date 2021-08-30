package faculdade.coordenaao;

import faculdade.departamento.Pessoa;

public class Professor extends Pessoa {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
