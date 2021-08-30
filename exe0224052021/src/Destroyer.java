public class Destroyer implements Movimento {

    private String name;
    private double weapons;

    public Destroyer(){}

    public Destroyer(String name, double weapons) {

        this.name=name;
        this.weapons=weapons;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeapons() {
        return weapons;
    }

    public void setWeapons(double weapons) {
        this.weapons = weapons;
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
