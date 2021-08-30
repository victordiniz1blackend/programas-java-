package sample;

public class holerite {
    private long numero;//
    private String data;//
    private double salarioBase;//
    private double beneficios;//
    private double descontos;//
    private double liquido;

    public long getNumero(){
        return numero;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public String getData(){
        return data;
    }
    public double getBeneficios(){
        return beneficios;
    }

    public double getDescontos() {
        return descontos;
    }

    public double getLiquido() {
        return liquido;
    }
    public void SetNumero(long numero){
        this.numero = numero;
    }
    public void setData (String data){
        this.data = data;
    }
    public void setSalarioBase (double salarioBase){
        this.salarioBase = salarioBase;
    }
    public void setBeneficios(double beneficios){
        this.beneficios = beneficios;
    }
    public void setDescontos(double descontos){
        this.descontos = descontos;
    }
    public void setLiquido(double liquido){
        this.liquido = liquido;
    }
}
