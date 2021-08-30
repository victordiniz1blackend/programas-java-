package faculdade.secretaria;

import faculdade.departamento.Pessoa;
import faculdade.historico.Prova;

public class Aluno extends Pessoa {

    private long ra;
    private double enem;
    private Prova prova[];


    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public double getEnem() {
        return enem;
    }

    public void setEnem(double enem) {
        this.enem = enem;
    }
}
