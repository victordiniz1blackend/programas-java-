package Personagem;

public class Medico extends Bot{
    private String companhia;

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    @Override
    public double calculaVida() {
        return getSaude() * getForca() * 0.12;
    }
}
