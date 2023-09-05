package lesson3;

public class RefuelingStationV2 implements Refueling {
    private Refueling refueling;
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Заправка зимним дизельным топливом");
            case Gasoline -> System.out.println("Заправка 92-м бензином");
        }
    }


}