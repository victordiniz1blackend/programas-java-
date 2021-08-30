package departamento.logistica;
import departamento.rh.Funcionario;

public class Motorista extends Funcionario {
    private long cnh;

    public long getCnh() {
        return cnh;
    }

    public void setCnh(long cnh) {
        this.cnh = cnh;
    }
}
