package department.logistics;
import department.rh.Employee;

public class Driver extends Employee {
    private long cnh;

    public long getCnh() {
        return cnh;
    }

    public void setCnh(long cnh) {
        this.cnh = cnh;
    }
}
