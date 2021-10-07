package services.facility_service;

import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import services.booking_service.BookingServiceImpl;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

import static services.facility_service.ReadFacilityData.readFileFacility;
import static services.facility_service.WriteFacilityData.writeFileFacility;
import static utils.Regex.checkRegex;

public class FacilityServiceImpl implements FacilityService {
    private static final String REGEX_ID = "^SV(VL|HO|RO)\\d{4}$";
    private static final String REGEX_NAME = "^[A-Z](\\w+\\s?)*$";
    private static final String REGEX_AREA = "^([3-9][1-9]|[1-9]\\d{2,}).?\\d*$";
    private static final String REGEX_INT = "^[1-9]|[1][0-9]+$";
    private static final String REGEX_PERSON = "^[1-9]|[1][0-9]$";
    private static final String REGEX_CHOICE = "^[1-3]$";
    public static final String FACILITY_PATH = "src/data/facility.csv";
    File file = new File(FACILITY_PATH);
    Scanner scanner = new Scanner(System.in);
    Map<Facility, Integer> facilityList = readFileFacility(FACILITY_PATH);

    {
        facilityList.put(new Facility("1", "villa1", 350, 4050,
                14, "By month"), 0);
        facilityList.put(new Facility("2", "villa2", 450, 4000,
                13, "By dai"), 0);
        Facility facility1 = new Facility("3", "house", 350, 4500,
                12, "By hour");
        facilityList.put(facility1, 4);
    }

    public static void main(String[] args) {
    }

    @Override
    public void add() {

        System.out.println("Choice type of facility: " + "\n" +
                " 1: Room\n" +
                " 2: House\n" +
                " 3: Villa");
        int choice = Integer.parseInt(inputChoice());
        switch (choice) {
            case 1:
                Facility facility1 = new Room(inputId(), inputServiceName(), Double.parseDouble(inputArea()),
                        Double.parseDouble(inputCostRent()), Integer.parseInt(inputPersonNumber()),
                        inputTypeRent(), inputFreeService());

                file.delete();
                facilityList.put(facility1, 0);
                writeFileFacility(facilityList, FACILITY_PATH, true);
                break;
            case 2:
                Facility facility2 = new House(inputId(), inputServiceName(), Double.parseDouble(inputArea()),
                        Double.parseDouble(inputCostRent()), Integer.parseInt(inputPersonNumber()),
                        inputTypeRent(), inputStandard(), Integer.parseInt(inputFloor()));
                file.delete();
                facilityList.put(facility2, 0);
                writeFileFacility(facilityList, FACILITY_PATH, true);
                break;
            case 3:
                Facility facility3 = new Villa(inputId(), inputServiceName(), Double.parseDouble(inputArea()),
                        Double.parseDouble(inputCostRent()), Integer.parseInt(inputPersonNumber()),
                        inputTypeRent(), inputStandard(), Double.parseDouble(inputPoolArea()), Integer.parseInt(inputFloor()));
                file.delete();
                facilityList.put(facility3, 0);
                writeFileFacility(facilityList, FACILITY_PATH, true);
        }
    }

    private String inputChoice() {
        System.out.println("Enter choice from 1 to 3: ");
        String choice = scanner.nextLine();
        return checkRegex(choice, REGEX_CHOICE, "Wrong input! please choose 1 or 2 or 3!");
    }

    private String inputId() {
        System.out.println("Enter id follow this format (SV)VL/HO/RO-0000: ");
        String id = scanner.nextLine();
        return checkRegex(id, REGEX_ID, "Wrong format! please input like this: (SV)VL/HO/RO0000");
    }

    private String inputServiceName() {
        System.out.println("Enter Service name (must begin a capital): ");
        String serviceName = scanner.nextLine();
        return checkRegex(serviceName, REGEX_NAME, "Wrong format! must begin a capital");
    }

    private String inputArea() {
        System.out.println("Enter area ");
        String area = scanner.nextLine();
        return checkRegex(area, REGEX_AREA, "Area >30");
    }

    private String inputPersonNumber() {
        System.out.println("Enter person number (area > 0 && <20) ");
        String personNumber = scanner.nextLine();
        return checkRegex(personNumber, REGEX_PERSON, " input again! Area > 0 && <20 ");
    }

    private String inputCostRent() {
        System.out.println("Enter cost rent (cost >0): ");
        String costRent = scanner.nextLine();
        return checkRegex(costRent, REGEX_AREA, "Cost rent must be positive");
    }

    private String inputTypeRent() {
        System.out.println("Enter type of rent (first word must be a capital): ");
        String typeOfRent = scanner.nextLine();
        return checkRegex(typeOfRent, REGEX_NAME, "Wrong format, first word must be a capital");
    }

    private String inputStandard() {
        System.out.println("Enter add Standard: ");
        String standard = scanner.nextLine();
        return checkRegex(standard, REGEX_NAME, "Wrong format, first word is capital");
    }

    private String inputPoolArea() {
        System.out.println("Enter pool area: ");
        String poolArea = scanner.nextLine();
        return checkRegex(poolArea, REGEX_AREA, "Area >30");
    }

    private String inputFloor() {
        System.out.println("Enter number of floor: ");
        String numberOfFloor = scanner.nextLine();
        return checkRegex(numberOfFloor, REGEX_PERSON, " Number of floor have to positive");
    }

    public String inputFreeService() {
        System.out.println("Enter free service (First word must be a capital): ");
        String freeService = scanner.nextLine();
        return checkRegex(freeService, REGEX_NAME, "Wrong format! First word must be a capital");
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