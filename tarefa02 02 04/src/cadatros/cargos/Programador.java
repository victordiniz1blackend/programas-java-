package cadatros.cargos;
import cadatros.Usuario;

public class Programador extends Usuario {

    private String sector;
    private String language;

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
