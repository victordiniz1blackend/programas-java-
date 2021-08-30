package sample;

public class Professor extends Funcionario{
    private String titulacao;
    private double valorHora;

    public String getTitulacao(){
        return titulacao;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
