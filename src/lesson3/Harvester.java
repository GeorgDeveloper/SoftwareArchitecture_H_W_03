package lesson3;

import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping {
    private FuelType fueling;

    public Harvester(String make, String model, Color color, FuelType fueling) {
        super(make, model, color);
        this.fueling = fueling;
        setWheelsCount(6);
    }


    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        if (getRefueling() != null) {
            getRefueling().fuel(this.fueling);
        }
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

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }

//    public void setCarWash(Wiping wash) {
//        this.wiping = wash;
//        System.out.format("Автомобиль %s прибыл на мойку \n", getMake());
//    }

    @Override
    public void wipMirrors() {
        getWiping().wipMirrors();
    }

    @Override
    public void wipWindshield() {
        getWiping().wipWindshield();
    }

    @Override
    public void wipHeadlights() {
        getWiping().wipHeadlights();
    }


}
