public class Veiculo {

    private String placa;
    private int ano;
    private Motorista motorista;
    private Multa multa[];

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Multa[] getMulta() {
        return multa;
    }

    public void setMulta(Multa[] multa) {
        this.multa = multa;
    }
}
