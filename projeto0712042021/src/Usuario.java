public class Usuario {

    private String nome;
    private long cpf;
    private Equipamento equipamento[];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Equipamento[] getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento[] equipamento) {
        this.equipamento = equipamento;
    }
}
