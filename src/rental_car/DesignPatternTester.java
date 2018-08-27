package rental_car;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import rental_car.*;


public class DesignPatternTester {
    @Test
    public void singletonTest(){
        RentalTransaction rentalTransaction1 = RentalTransaction.getInstance();
        RentalTransaction rentalTransaction2 = RentalTransaction.getInstance();
        assertEquals(rentalTransaction1.hashCode(), rentalTransaction2.hashCode(), "Singleton test has passed");
    }
    @Test
    public void abstractFactoryTest(){
        Car car1 = new SportCar();
        Car car2 = new StandardCar();
        Car car3 = new FamiliarCar();

        assertEquals(car1.getStock(), 2, "Test 1 for abstract factory test has passed");
        assertEquals(car2.getStock(), 5, "Test 2 for abstract factory test has passed");
        assertEquals(car3.getStock(), 3, "Test 3 for abstract factory test has passed");
    }
    @Test
    public void abstractFactoryForNewCarTest(){
        Car car = new TestCar();
        assertEquals(car.getStock(), 1000, "Test for new car has passed");
    }

}
