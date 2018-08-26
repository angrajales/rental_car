package rental_car;

public class SportCar extends Car{
    private int stock = 2;
    private final Ensurance SPORT_CAR_ENSURANCE = Ensurance.ALL_RISK;
    private final double SPORT_CAR_VALUE_PER_HOUR = 200000.0;

    @Override
    protected Ensurance getEnsurance() {
        return SPORT_CAR_ENSURANCE;
    }

    @Override
    protected double getValuePerHour() {
        return SPORT_CAR_VALUE_PER_HOUR;
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
            System.out.println("No hay mas carros deportivos disponibles");
        }
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "stock=" + stock +
                ", SPORT_CAR_ENSURANCE=" + SPORT_CAR_ENSURANCE +
                ", SPORT_CAR_VALUE_PER_HOUR=" + SPORT_CAR_VALUE_PER_HOUR +
                '}';
    }
}
