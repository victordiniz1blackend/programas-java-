package conteudo.login;

import conteudo.Banco;
import gerencia.Internauta;

public class Acesso {

    private String nome;
    private String data;
    private Banco banco[];
    private Internauta internauta[];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Banco[] getBanco() {
        return banco;
    }

    public void setBanco(Banco[] banco) {
        this.banco = banco;
    }

    public Internauta[] getInternauta() {
        return internauta;
    }

    public void setInternauta(Internauta[] internauta) {
        this.internauta = internauta;
    }
}
