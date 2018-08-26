package rental_car;

public abstract class Car{
    protected enum Transmicion{
        AUTHOMATIC,
        MECHANIC
    }
    protected enum Ensurance{
        ALL_RISK,
        STANDARD
    }
    protected String licencePlate;
    protected double displacement;
    protected String brand;
    protected String color;
    protected Transmicion transmition;
    protected double valuePerHour;
    protected Ensurance ensurance;
    protected int stock;
    protected abstract Ensurance getEnsurance();
    protected abstract double getValuePerHour();
    protected abstract int getStock();
    protected abstract void setValuePerHour(double valuePerHour);
    protected abstract void setEnsurance(Ensurance ensurance);
    protected abstract void setStock(int stock);

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Transmicion getTransmition() {
        return transmition;
    }

    public void setTransmition(Transmicion transmition) {
        this.transmition = transmition;
    }
}