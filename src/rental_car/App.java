package rental_car;

import java.util.Date;
import java.util.Scanner;

public class App {
    private static App app;
    private App(){ }
    public static App getInstance(){
        if(app == null){
            app = new App();
        }
        return app;
    }

    public Customer readCustomer(Customer customer, Scanner scanner){
        System.out.println("Ingrese el id:");
        customer.setId(scanner.nextLine());
        System.out.println("Ingrese el nombre:");
        customer.setName(scanner.nextLine());
        System.out.println("Ingrese el genero(F, M):");
        customer.setGenre(scanner.nextLine());
        System.out.println("Ingrese el tipo(VIP, NORMAL):");
        String tipo = scanner.nextLine();
        customer.setType(tipo.equalsIgnoreCase("VIP") ?
                Customer.Type.VIP: Customer.Type.NORMAL);
        return customer;
    }

    public Car readCar(Car car, Scanner scanner){
        scanner = new Scanner(System.in);
        System.out.println("Ingrese la placa:");
        car.setLicencePlate(scanner.nextLine());
        System.out.println("Ingrese el cilindraje:");
        car.setDisplacement(Double.parseDouble(scanner.nextLine()));
        System.out.println("Ingrese la marca:");
        car.setBrand(scanner.nextLine());
        System.out.println("Ingrese el color:");
        car.setColor(scanner.nextLine());
        System.out.println("Ingrese la transmición(AUTOMATICA, MECANICA):");
        String transmicion=scanner.nextLine();
        car.setTransmition(transmicion.equalsIgnoreCase("AUTOMATICA") ?
                Car.Transmicion.AUTHOMATIC: Car.Transmicion.MECHANIC);
        return car;
    }
    public RentalTransaction readTransaction(RentalTransaction rentalTransaction, Scanner scanner){
        scanner = new Scanner(System.in);
        System.out.println("Ingrese el id de la transacción: ");
        rentalTransaction.setId(scanner.nextLine());
        rentalTransaction.setDate(new Date());
        System.out.println("Ingrese la fecha de la salida del carro: ");
        rentalTransaction.setPickUpDate(new Date(scanner.nextLine()));
        System.out.println("Ingrese la fecha de regreso del carro: ");
        rentalTransaction.setReturnDate(new Date(scanner.nextLine()));
        System.out.println("Ingrese el número de horas: ");
        rentalTransaction.setHours((int)(Double.parseDouble(scanner.nextLine())));
        System.out.println("Ingrese el valor por hora: ");
        rentalTransaction.setValuePerHour(Double.parseDouble(scanner.nextLine()));
        double totalValue = rentalTransaction.getHours() * rentalTransaction.getValuePerHour();
        rentalTransaction.setTotalValue(totalValue);
        return rentalTransaction;
    }

}
