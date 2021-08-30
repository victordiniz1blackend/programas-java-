package conta.pais;

import conta.Conta;
import conta.personagem.Personagem;

public class Reino extends Conta {
    private String nomepais;
    private String nomecidade;
    private Personagem personagem[];

    public String getNomepais() {
        return nomepais;
    }

    public void setNomepais(String nomepais) {
        this.nomepais = nomepais;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    public Personagem[] getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem[] personagem) {
        this.personagem = personagem;
    }
}
