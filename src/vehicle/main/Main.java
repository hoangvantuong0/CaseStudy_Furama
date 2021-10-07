package vehicle.main;

import vehicle.cars.Car;
import vehicle.cars.VehicleManagement;
import vehicle.motorbike.Motorbike;
import vehicle.truck.Truck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehicleManagement vehicleManagement = new VehicleManagement();
//        Truck truck = new Truck();
//        Car car = new Car();
//        Motorbike motorbike = new Motorbike();
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("************************************");
            System.out.println("Menu: " + "\n" +
                    "1. Show Vehicle List" + "\n" +
                    "2. Add Vehicle" + "\n" +
                    "3. Delete Vehicle" + "\n" +
                    "4. Exit");
            System.out.println("************************************");
            System.out.println("Enter your choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    vehicleManagement.display();
                    break;
                case "2":
                   vehicleManagement.add();
                    break;
                case "3":
                   vehicleManagement.delete();
                    break;
                case "4":
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Nhập lại!");
            }
        }while (!choice.equals("4"));
    }
}

