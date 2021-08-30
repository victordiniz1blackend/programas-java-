package cadastro.cargos;
import cadastro.Usuario;

public class Programador extends Usuario{
    private String setor;
    private String linguagem;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
