package local;

import cliente.Veiculo;

public class Estacionamento {
    private String nome;
    private Veiculo veiculo[];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veiculo[] getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo[] veiculo) {
        this.veiculo = veiculo;
    }
}
