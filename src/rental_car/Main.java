package rental_car;

import java.util.Date;
import java.util.Scanner;

public class Main {
    private static final String MESSAGE = "Eliga una opción:" +
            "\n 0. Terminar aplicación" +
            "\n 1. Rentar un carro deportivo." +
            "\n 2. Rentar un carro familiar." +
            "\n 3. Rentar un carro estandar.";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalCar rentalCar = new RentalCarImplementation();
        RentalTransaction rentalTransaction = RentalTransaction.getInstance();
        App app = App.getInstance();
        Car sportCar = rentalCar.createSportCar();
        Car familiarCar = rentalCar.createFamiliarCar();
        Car standardCar = rentalCar.createStandardCar();
        Customer customer = new Customer();
        byte opcion = -1;
        while(true){
            System.out.println(MESSAGE);
            opcion = scanner.nextByte();
            if(opcion == 0){
                break;
            }
            //Adding today date
            rentalTransaction.setDate(new Date());
            rentalTransaction.setId(new Date() + "" + rentalTransaction.hashCode());
            rentalTransaction.setHours(12);
            customer = app.readCustomer(customer);
            rentalTransaction.setCustomer(customer);
            switch (opcion){
                case 1:
                    sportCar = app.readCar(sportCar);
                    rentalTransaction.setCar(sportCar);
                    sportCar.getCar();
                    break;
                case 2:
                    familiarCar = app.readCar(familiarCar);
                    rentalTransaction.setCar(familiarCar);
                    familiarCar.getCar();
                    break;
                case 3:
                    standardCar = app.readCar(standardCar);
                    rentalTransaction.setCar(standardCar);
                    standardCar.getCar();
                    break;
                default:
                    break;
            }
            rentalTransaction = app.readTransaction(rentalTransaction);
            // Rent operation
            System.out.println("Rent operation was successful");
        }
    }
}
