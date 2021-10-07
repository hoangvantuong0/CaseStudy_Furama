package vehicle.cars;

import vehicle.InterfaceCar;
import vehicle.motorbike.Motorbike;
import vehicle.truck.Truck;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import static vehicle.cars.ReadCarFile.readCarFile;
import static vehicle.cars.WriteCarFile.writeCarFile;
import static vehicle.motorbike.ReadMotorbikeFile.readMotorbikeFile;
import static vehicle.motorbike.WriteMotorbike.writeMotorbikeFile;
import static vehicle.truck.ReadTruckFile.readTruckFile;
import static vehicle.truck.WriteTruckFile.writeTruckFile;

public class VehicleManagement implements InterfaceCar {
    //    private static final String REGEX_CHOICE = "^[1-3]$";
    public static final String CAR_PATH = "vehicle/data/carList.csv";
    public static final String TRUCK_PATH = "src/vehicle/data/truckList.csv";
    public static final String MOTORBIKE_PATH = "src/vehicle/data/motorbikeList.csv";
    File file = new File(CAR_PATH);
    Scanner scanner = new Scanner(System.in);
    List<Car> carList = readCarFile(CAR_PATH);
    List<Truck> truckList = readTruckFile(TRUCK_PATH);
    List<Motorbike> motorbikeList = readMotorbikeFile(MOTORBIKE_PATH);

    //    @Override
//    public void add() {
//        System.out.println("Enter Id of Car:");
//        String idCar = scanner.nextLine();
//        System.out.println("Add seat number: ");
//        int seatNumber = Integer.parseInt(scanner.nextLine());
//        System.out.println("Enter vehicle type:");
//        String vehicleType = scanner.nextLine();
//        Car car = new Car(idCar, seatNumber, vehicleType);
//        carList.add(car);
//        file.delete();
//        writeCarFile(carList, CAR_PATH, true);
//    }
    public void add() {
        String choice;
        do {
            System.out.println("************************************");
            System.out.println("Choice type of vehicle: " + "\n" +
                    " 1: Car\n" +
                    " 2: Truck\n" +
                    " 3: MotorBike\n" +
                    " 4: Exit");
            System.out.println("************************************");
            System.out.println("Enter your choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    Car car = new Car(addIdVehicle(), Integer.parseInt(addSeatNumber()), addTypeVehicle());
                    file.delete();
                    carList.add(car);
                    writeCarFile(carList, CAR_PATH, true);
                    break;
                case "2":
                    Truck truck = new Truck(addIdVehicle(), Integer.parseInt(addLoad()));
                    file.delete();
                   truckList.add(truck);
                    writeTruckFile(truckList, TRUCK_PATH, true);
                    break;
                case "3":
                    Motorbike motorbike = new Motorbike(addIdVehicle(),addPower());
                    file.delete();
                    motorbikeList.add(motorbike);
                    writeMotorbikeFile(motorbikeList, MOTORBIKE_PATH, true);
                    break;
                case "4":
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Nhập lại!");
            }
        } while (!choice.equals("4"));
    }

    public String addIdVehicle() {
        System.out.println("Input id of vehicle: ");
        String idVehicle = scanner.nextLine();
        return idVehicle;
    }

    public String addSeatNumber() {
        System.out.println("Input number seat: ");
        String seatNumber = scanner.nextLine();
        return seatNumber;
    }

    public String addLoad() {
        System.out.println("Input load of vehicle: ");
        String load = scanner.nextLine();
        return load;
    }

    public String addTypeVehicle() {
        System.out.println("Input type of vehicle: ");
        String typeOfVehicle = scanner.nextLine();
        return typeOfVehicle;
    }

    public String addPower() {
        System.out.println("Input power of vehicle: ");
        String power = scanner.nextLine();
        return power;
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {
        display();
        System.out.println("Input Id of Car wanna delete:");
        String idDeleteCar = scanner.nextLine();
        for (int i = 0; i < carList.size(); i++) {
            if (idDeleteCar.equals(carList.get(i).idCar)) {
                carList.remove(carList.get(i));
                writeCarFile(carList, CAR_PATH, true);
                System.out.println("Xoá thành công");
            } else {
                System.out.println("Không tìm thấy xe cần xoá!");
            }
        }
    }

    @Override
    public void display() {
        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
