package sample;

public class departamento {
    private String sigla;
    private String nome;
    private String endereco;

    public String getNome(){
        return nome;
    }
    public String getSigla(){
        return sigla;
    }
    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
}
