package sample;

public class Administrativo extends Funcionario{
    private String departamento;
    private double adicional;

    public String getDepartamento(){
        return departamento;
    }

    public double getAdicional() {
        return adicional;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
}
