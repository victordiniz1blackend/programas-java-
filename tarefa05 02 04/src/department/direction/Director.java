package department.direction;

import department.services.People;

public class Director extends People {
    private double additional;

    public double getAdditional() {
        return additional;
    }

    public void setAdditional(double additional) {
        this.additional = additional;
    }
}
