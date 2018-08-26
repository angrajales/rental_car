package rental_car;

import java.util.Scanner;

public class App {
    private static App app;
    private Scanner scanner;
    private static final String MESSAGE = "Eliga una opción:" +
            "\n 0. Terminar aplicación" +
            "\n 1. Rentar un carro deportivo." +
            "\n 2. Rentar un carro familiar." +
            "\n 3. Rentar un carro estandar.";
    private App(){
        scanner = new Scanner(System.in);
    }
    public static App getInstance(){
        if(app == null){
            app = new App();
        }
        return app;
    }

    public Customer readCustomer(Customer customer){
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

    public Car readCar(Car car){
        System.out.println("Ingrese la placa:");
        car.setLicencePlate(scanner.nextLine());
        System.out.println("Ingrese el cilindraje:");
        car.setDisplacement(scanner.nextDouble());
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

}
