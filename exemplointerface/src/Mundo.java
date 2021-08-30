public class Mundo implements FiguraPersonagem{

    private String nome;
    private String skill;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String getnomeFigura() {
        return nome;
    }

    @Override
    public String getskill() {
        return skill;
    }
}
