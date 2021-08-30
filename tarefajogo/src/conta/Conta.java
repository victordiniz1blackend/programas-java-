package conta;

import conta.pais.Reino;
import conta.personagem.Personagem;

public class Conta {

    private String id;
    private String senha;
    private Personagem personagem[];
    private Reino reino;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Personagem[] getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem[] personagem) {
        this.personagem = personagem;
    }

    public Reino getReino() {
        return reino;
    }

    public void setReino(Reino reino) {
        this.reino = reino;
    }
}
