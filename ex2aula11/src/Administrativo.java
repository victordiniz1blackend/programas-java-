public class Administrativo extends Funcionario {

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculaSalario() {
        return getSalario()+bonus;
    }
}
