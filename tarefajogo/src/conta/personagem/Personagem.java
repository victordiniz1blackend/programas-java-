package conta.personagem;

import conta.Conta;
import conta.skill.Skill;

public class Personagem extends Conta {
    private String nome;
    private String personagem;
    private int nivel;
    private Skill skill[];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Skill[] getSkill() {
        return skill;
    }

    public void setSkill(Skill[] skill) {
        this.skill = skill;
    }
}
