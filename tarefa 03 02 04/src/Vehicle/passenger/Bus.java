package Vehicle.passenger;
import Vehicle.transport.Vehicle;
import department.rh.Employee;

public class Bus extends Vehicle {

    private int seat;
    private Employee passenger[];

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public Employee[] getPassenger() {
        return passenger;
    }

    public void setPassenger(Employee[] passenger) {
        this.passenger = passenger;
    }
}
