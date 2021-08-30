package sample;

public class Funcionario extends Pessoa {

    private long ctps;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public long getCtps() {
        return ctps;
    }

    public void setCtps(long ctps) {
        this.ctps = ctps;
    }
}
