package rental_car;

public class TestCar extends Car {
    private int stock = 1000;
    private final Ensurance TEST_CAR_ENSURANCE = Ensurance.ALL_RISK;
    private final double TEST_CAR_VALUE_PER_HOUR = 200000.0;

    @Override
    protected Ensurance getEnsurance() {
        return TEST_CAR_ENSURANCE;
    }

    @Override
    protected double getValuePerHour() {
        return TEST_CAR_VALUE_PER_HOUR;
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
            System.out.println("No hay mas carros diponibles de test car.");
        }
    }

    @Override
    public String toString() {
        return "TestCar{" +
                "stock=" + stock +
                ", TEST_CAR_ENSURANCE=" + TEST_CAR_ENSURANCE +
                ", TEST_CAR_VALUE_PER_HOUR=" + TEST_CAR_VALUE_PER_HOUR +
                '}';
    }
}
