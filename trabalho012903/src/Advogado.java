public class Advogado extends Profissional{
    private String area;
    private Profissional prifissional;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Profissional getPrifissional() {
        return prifissional;
    }

    public void setPrifissional(Profissional prifissional) {
        this.prifissional = prifissional;
    }
}
