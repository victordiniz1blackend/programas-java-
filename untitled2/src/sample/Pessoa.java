package sample;

public class Pessoa {
    private String rg;
    private String nascimento;
    private String endereco;

    public String getRg(){
        return rg;

    }

    public String getNascimento() {
        return nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
