package services.facility_service;

import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import utils.InvalidFormatException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static services.facility_service.WriteFacilityData.writeFileFacility;
import static utils.Regex.*;

public class FacilityServiceImpl implements FacilityService {
    public static final String FACILITY_PATH = "src/data/facility.csv";
    Scanner scanner = new Scanner(System.in);
    Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    public static void main(String[] args) {
    }

    @Override
    public void add() {
        boolean flag;
        int choice = 0;
        do {
            try {
                flag = true;
                System.out.println("Choose the facility to add: " + "\n" +
                        "1. Room " + "\n" +
                        "2. House " + "\n" +
                        "3. Villa " + "\n");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);

        String idFacility = null;
        do {
            try {
                flag = true;
                System.out.println("Enter facility: ");
                idFacility = scanner.nextLine();
                checkNumberId(idFacility);
            } catch (InvalidFormatException e) {
                e.printStackTrace();
                flag = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);
        String service = null;
        do {
            try {
                flag = true;
                System.out.println("Enter service: ");
                service = scanner.nextLine();
                checkNameService(service);
            } catch (InvalidFormatException e) {
                e.printStackTrace();
                flag = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);
        double areaUsing = 0.0d;
        do {
            try {
                flag = true;
                System.out.println("Enter area of using: ");
                areaUsing = Double.parseDouble(scanner.nextLine());
                checkArea(areaUsing);
            } catch (InvalidFormatException e) {
                e.printStackTrace();
                flag = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);
        double rentalFee = 0.0d;
        do {
            try {
                flag = true;
                System.out.println("Enter rental fee: ");
                rentalFee = Double.parseDouble(scanner.nextLine());
                checkRentalFee(rentalFee);
            } catch (InvalidFormatException e) {
                e.printStackTrace();
                flag = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);
        int numberOfPeople = 0;
        do {
            try {
                flag = true;
                System.out.println("Enter number of people: ");
                numberOfPeople = Integer.parseInt(scanner.nextLine());
                checkPerson(numberOfPeople);
            } catch (InvalidFormatException e) {
                e.printStackTrace();
                flag = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);
        String rentalType = null;
        do {
            try {
                flag = true;
                System.out.println("Enter rental of type: ");
                rentalType = scanner.nextLine();
                checkNameService(rentalType);
            } catch (InvalidFormatException e) {
                e.printStackTrace();
                flag = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);

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
        writeFileFacility(facilityList, FACILITY_PATH, true);
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