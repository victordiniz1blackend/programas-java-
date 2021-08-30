package conta.skill;

import conta.personagem.Personagem;

public class Skill extends Personagem {
    private String nomepoder;
    private double danoskill;
    private String classeskill;

    public String getNomepoder() {
        return nomepoder;
    }

    public void setNomepoder(String nomepoder) {
        this.nomepoder = nomepoder;
    }

    public double getDanoskill() {
        return danoskill;
    }

    public void setDanoskill(double danoskill) {
        this.danoskill = danoskill;
    }

    public String getClasseskill() {
        return classeskill;
    }

    public void setClasseskill(String classeskill) {
        this.classeskill = classeskill;
    }
}
