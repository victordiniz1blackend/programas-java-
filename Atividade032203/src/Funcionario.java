public class Funcionario {


    private String nome;
    private Terceirizado terceirizado;
    private Contratado contratado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Terceirizado getTerceirizado() {
        return terceirizado;
    }

    public void setTerceirizado(Terceirizado terceirizado) {
        this.terceirizado = terceirizado;
    }

    public Contratado getContratado() {
        return contratado;
    }

    public void setContratado(Contratado contratado) {
        this.contratado = contratado;
    }
}
