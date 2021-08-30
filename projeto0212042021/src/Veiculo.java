public class Veiculo {

    private String placa;
    private int ano;
    private Multa multa[];

    public Multa[] getMulta() {
        return multa;
    }

    public void setMulta(Multa[] multa) {
        this.multa = multa;
    }

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
}
