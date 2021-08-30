package Vehicle.transport;

import department.logistics.Driver;

public class Vehicle  {

    private String plate;
    private Driver driver;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
