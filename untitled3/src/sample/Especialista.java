package sample;

public class Especialista extends Funcionario{
    private long numeroContato;
    private String dataContrato;

    public long getNumeroContato() {
        return numeroContato;
    }

    public String getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(String dataContrato) {
        this.dataContrato = dataContrato;
    }

    public void setNumeroContato(long numeroContato) {
        this.numeroContato = numeroContato;
    }
}
