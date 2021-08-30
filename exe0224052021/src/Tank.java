public class Tank implements Movimento {

    private int id;
    private int power;

    public Tank(){}

    public Tank(int id,int power){
        this.id = id;
        this.power = power;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int positiionx() {
        return 0;
    }

    @Override
    public int positiony() {
        return 0;
    }

    @Override
    public void turnleft() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void turbBack() {

    }
}
