package cadastro.cargos;
import cadastro.Usuario;

public class Analise extends Usuario{

    private String area;
    private String metodologia;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }
}
