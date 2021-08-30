package sample;

public class Fornecedor extends Pessoa{
    private String site;
    private String telefone;

    public String getSite(){
        return site;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setSite(String site){
        this.site = site;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
