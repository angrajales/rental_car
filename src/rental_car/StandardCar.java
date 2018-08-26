package rental_car;

public class StandardCar extends Car{
    @Override
    protected Ensurance getEnsurance() {
        return ensurance;
    }

    @Override
    protected double getValuePerHour() {
        return valuePerHour;
    }

    @Override
    protected int getStock() {
        return stock;
    }

    @Override
    protected void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    @Override
    protected void setEnsurance(Ensurance ensurance) {
        this.ensurance = ensurance;
    }

    @Override
    protected void setStock(int stock) {
        this.stock = stock;
    }
}
