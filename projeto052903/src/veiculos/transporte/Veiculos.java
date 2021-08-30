package veiculos.transporte;
import departamento.logistica.Motorista;

public class Veiculos {
    private String placas;
    private Motorista motorista;

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
}
