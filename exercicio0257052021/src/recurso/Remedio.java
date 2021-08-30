package recurso;

import Personagem.Medico;

public class Remedio extends Medico {
    private String nome;
    private String formula;
    private double cura;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public double getCura() {
        return cura;
    }

    public void setCura(double cura) {
        this.cura = cura;
    }
}
