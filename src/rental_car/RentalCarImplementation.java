package rental_car;

public class RentalCarImplementation implements RentalCar{
    @Override
    public FamiliarCar createFamiliarCar() {
        return new FamiliarCar();
    }

    @Override
    public SportCar createSportCar() {
        return new SportCar();
    }

    @Override
    public StandardCar createStandardCar() {
        return new StandardCar();
    }
}
