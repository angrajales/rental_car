package rental_car;

public interface RentalCar {
    FamiliarCar createFamiliarCar();
    SportCar createSportCar();
    StandardCar createStandardCar();
}
