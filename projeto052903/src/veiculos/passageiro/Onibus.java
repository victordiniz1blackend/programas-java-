package veiculos.passageiro;
import departamento.rh.Funcionario;
import veiculos.transporte.Veiculos;

public class Onibus extends Veiculos {
    private int assentos;
    private Funcionario funcionario[];

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public Funcionario[] getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario[] funcionario) {
        this.funcionario = funcionario;
    }
}
