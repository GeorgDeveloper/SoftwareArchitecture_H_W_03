package lesson3;

import java.awt.*;

public class SoprtCar extends Car implements Fueling, Wiping{

    private FuelType fueling;

    public SoprtCar(String make, String model, Color color, FuelType fueling) {
        super(make, model, color);
        this.fueling = fueling;
    }


    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    @Override
    public void fuel() {
        if (getRefueling() != null) {
            getRefueling().fuel(this.fueling);
        }
    }

    @Override
    public void wipMirrors() {
        getWiping().wipHeadlights();
    }

    @Override
    public void wipWindshield() {
        getWiping().wipWindshield();
    }

    @Override
    public void wipHeadlights() {
        getWiping().wipMirrors();
    }
}
