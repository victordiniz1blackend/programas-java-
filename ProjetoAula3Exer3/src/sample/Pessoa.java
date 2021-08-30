package sample;

public class Pessoa {
    private String nome;
    private String rg;

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
