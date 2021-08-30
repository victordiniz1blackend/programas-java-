public class Operacional extends Funcionario{
    private double horasExtras;
    private double valorHora;

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calculaSalario() {
        return getSalario()+(horasExtras+valorHora)*0.2;
    }
}
