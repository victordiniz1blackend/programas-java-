public class AirCreaft implements Movimento {

    private String prefix;
    private int Speed;
    private int fuel;

    public AirCreaft(){}

    public AirCreaft(String prefix, int Speed, int fuel){
        this.prefix=prefix;
        this.fuel=fuel;
        this.Speed=Speed;

    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
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
