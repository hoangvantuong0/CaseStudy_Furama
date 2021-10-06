package services.facility_service;

import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import services.booking_service.BookingServiceImpl;
import utils.InvalidFormatException;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static services.facility_service.ReadFacilityData.readFileFacility;
import static services.facility_service.WriteFacilityData.writeFileFacility;
import static utils.Regex.*;

public class FacilityServiceImpl implements FacilityService {
    public static final String FACILITY_PATH = "src/data/facility.csv";
    Scanner scanner = new Scanner(System.in);
    Map<Facility, Integer> facilityList = readFileFacility(FACILITY_PATH);

    {
        facilityList.put(new Facility("1", "villa1", 350, 4050,
                14, "By month"), 0);
        facilityList.put(new Facility("2", "villa2", 450, 4000,
              13, "By dai"), 0);
        Facility facility1 = new Facility("3", "house", 350, 4500,
                12, "By hour");
        facilityList.put(facility1, 4 );
    }

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
        } while (!flag || choice > 3 || choice < 0);

        String idFacility = null;
        do {
            try {
                flag = true;
                System.out.println("Enter facility (SV-VL/HO/RO-YYYY): ");
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
                System.out.println("Enter service name (A-Z-a-z): ");
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
                System.out.println("Enter area of using (must be > 30): ");
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
                System.out.println("Enter rental fee (must be > 0): ");
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
                System.out.println("Enter number of people (<20 && >0): ");
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
                System.out.println("Enter rental of type (by month/day/hour): ");
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
        BookingServiceImpl.facilityIntegerMap.put(facility, 0);
        File file = new File(FACILITY_PATH);
        file.delete();
        writeFileFacility(facilityList, FACILITY_PATH, true);
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> mapList : BookingServiceImpl.facilityIntegerMap.entrySet()) {
            System.out.println("Facility List: " + mapList.getKey().toString() + ", " + mapList.getValue());
        }
    }

    @Override
    public void displayMaintenance() {

    }

    public String freeService() {
        System.out.println("Enter free service name: ");
        String freeService = scanner.nextLine();
        return freeService;
    }

    public String addStandard() {
        System.out.println("Enter standard (SV(A-Z)-YYYY): ");
        String standOfRoom = scanner.nextLine();
        return standOfRoom;
    }

    public double addPoolSize() {
        System.out.println("Enter pool area (must be > 30): ");
        double poolSize = Double.parseDouble(scanner.nextLine());
        return poolSize;
    }

    public int addFloor() {
        System.out.println("Enter floor (floor > 0): ");
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