package sample;

public class Cliente extends Pessoa {
    private String endereco;
    private String email;

    public String getEndereco(){
        return endereco;
    }
    public String getEmail(){
        return email;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setEmail( String email){
        this.email = email;
    }
}
