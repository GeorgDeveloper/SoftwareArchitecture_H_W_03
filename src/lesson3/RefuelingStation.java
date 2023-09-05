package lesson3;

public class RefuelingStation implements Refueling {
    private Refueling refueling;
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Заправка летним дизельным топливом");
            case Gasoline -> System.out.println("Заправка 95-м бензином");
        }
    }


}
