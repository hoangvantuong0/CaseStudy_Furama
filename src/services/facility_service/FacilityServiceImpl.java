package services.facility_service;

import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    public static final String FACILITY_PATH = "src/data/facility.csv";
    Scanner scanner = new Scanner(System.in);
    Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    public static void main(String[] args) {
    }

    @Override
    public void add() {
        System.out.println("Choose the facility to add: " + "\n" +
                "1. Room " + "\n" +
                "2. House " + "\n" +
                "3. Villa " + "\n");
        int choice = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Id of Facility: ");
        String idFacility = scanner.nextLine();
        System.out.println("Enter service: ");
        String service = scanner.nextLine();
        System.out.println("Enter area of using: ");
        double areaUsing = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter rental fee: ");
        double rentalFee = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number of people: ");
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rental of type: ");
        String rentalType = scanner.nextLine();
        Facility facility = null;
        switch (choice) {
            case 1:
                facility = new Room(idFacility, service, areaUsing, rentalFee,
                        numberOfPeople, rentalType, freeService());
                break;
            case 2:
                facility = new House(idFacility, service, areaUsing, rentalFee,
                        numberOfPeople, rentalType, addStandard(), addFloor());
                break;
            case 3:
                facility = new Villa(idFacility, service, areaUsing, rentalFee,
                        numberOfPeople, rentalType, addStandard(), addPoolSize(), addFloor());
                break;
        }
        facilityList.put(facility, 0);
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> mapList : facilityList.entrySet()) {
            System.out.println("Facility List: " + mapList.getKey().toString() + ", " + mapList.getValue());
        }
    }

    @Override
    public void displayMaintenance() {

    }

    public String freeService() {
        System.out.println("Enter free service: ");
        String freeService = scanner.nextLine();
        return freeService;
    }

    public String addStandard() {
        System.out.println("Enter standard: ");
        String standOfRoom = scanner.nextLine();
        return standOfRoom;
    }

    public double addPoolSize() {
        System.out.println("Enter pool area: ");
        double poolSize = Double.parseDouble(scanner.nextLine());
        return poolSize;
    }

    public int addFloor() {
        System.out.println("Enter floor: ");
        int numberOfFloor = Integer.parseInt(scanner.nextLine());
        return numberOfFloor;
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }

}