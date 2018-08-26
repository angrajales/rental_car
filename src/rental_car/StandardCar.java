package rental_car;

public class StandardCar extends Car {
    private int stock = 5;
    private final Ensurance STANDARD_CAR_ENSURANCE = Ensurance.ALL_RISK;
    private final double STANDARD_CAR_VALUE_PER_HOUR = 123450.0;
    @Override
    protected Ensurance getEnsurance() {
        return STANDARD_CAR_ENSURANCE;
    }

    @Override
    protected double getValuePerHour() {
        return STANDARD_CAR_VALUE_PER_HOUR;
    }

    @Override
    protected int getStock() {
        return stock;
    }

    @Override
    public void getCar() {
        if(stock > 0){
            stock--;
        }else{
            System.out.println("No hay mas carros estandares disponibles");
        }
    }

    @Override
    public String toString() {
        return "StandardCar{" +
                "stock=" + stock +
                ", STANDARD_CAR_ENSURANCE=" + STANDARD_CAR_ENSURANCE +
                ", STANDARD_CAR_VALUE_PER_HOUR=" + STANDARD_CAR_VALUE_PER_HOUR +
                '}';
    }
}
