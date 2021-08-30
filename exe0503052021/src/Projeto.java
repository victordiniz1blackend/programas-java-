public class Projeto {
    private long codigo;
    private String nome;
    private Tarefa tarefa[];
    private Projetopratico tecc;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tarefa[] getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa[] tarefa) {
        this.tarefa = tarefa;
    }

    public Projetopratico getTecc() {
        return tecc;
    }

    public void setTecc(Projetopratico tecc) {
        this.tecc = tecc;
    }
}
