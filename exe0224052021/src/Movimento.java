public interface Movimento {
    public int step = 5;
    public int maxSpeed = 180;

    public abstract int positiionx();
    public abstract int positiony();
    public abstract void turnleft();
    public abstract void turnRight();
    public abstract void turbBack();


}
