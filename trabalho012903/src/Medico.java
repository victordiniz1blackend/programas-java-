public class Medico extends Profissional{
    private String especialidade;
    private Profissional profissional;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public Profissional getProfissional() {
        return profissional;
    }

    @Override
    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }
}
