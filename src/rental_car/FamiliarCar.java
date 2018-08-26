package rental_car;

public class FamiliarCar extends Car{
    private int stock = 3;
    private final Ensurance FAMILIAR_CAR_ENSURANCE = Ensurance.ALL_RISK;
    private final double FAMILIAR_CAR_VALUE_PER_HOUR = 123450.0;

    @Override
    protected Ensurance getEnsurance() {
        return FAMILIAR_CAR_ENSURANCE;
    }

    @Override
    protected double getValuePerHour() {
        return FAMILIAR_CAR_VALUE_PER_HOUR;
    }

    @Override
    protected int getStock() {
        return stock;
    }

    public void getCar() {
        if (stock > 0) {
            stock--;
        }else{
            System.out.println("No hay mas carros familiares diponibles");
        }
    }

    @Override
    public String toString() {
        return "FamiliarCar{" +
                "stock=" + stock +
                ", FAMILIAR_CAR_ENSURANCE=" + FAMILIAR_CAR_ENSURANCE +
                ", FAMILIAR_CAR_VALUE_PER_HOUR=" + FAMILIAR_CAR_VALUE_PER_HOUR +
                '}';
    }
}