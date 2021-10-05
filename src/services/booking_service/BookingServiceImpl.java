package services.booking_service;

import models.booking.Booking;
import models.facility.Facility;
import models.facility.Villa;
import models.person.Customer;
import utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    //    public static final String BOOKING_PATH = "src/data/booking.csv";
//    File file = new File(BOOKING_PATH);
//    File fileFacility = new File(FACILITY_PATH);
//    Set<Booking> bookingList = readFileBooking(BOOKING_PATH);

    Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        Customer customer1 = new Customer("1", "Hoàng Văn An", "10/02/1994", "Male",
                "0124126453", "037512637", "hoangvanan@gmail.com",
                "Vip", "Đà Nẵng");
        Customer customer2 = new Customer("2", "Nguyễn Thị Linh", "13/03/1995", "FeMale",
                "0124126213", "03751357", "nguyenthilinh@gmail.com",
                "normal", "Quảng Ngãi");
        customerList.add(customer1);
        customerList.add(customer2);
        facilityIntegerMap.put(new Villa("1", "Villa 1", 100, 200,
                10, "Month", "Vip", 200, 12), 0);
        facilityIntegerMap.put(new Villa("2", "Villa 2", 150, 250,
                11, "Month", "Vip", 240, 11), 0);
    }

    public Set<Booking> sendBooking() {
        return bookingSet;
    }

    @Override
    public void add() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Input start day: ");
        String startDay = scanner.nextLine();
        System.out.println("Input end day: ");
        String endDay = scanner.nextLine();
        Booking booking = new Booking(id, startDay, endDay, customer, facility);
        bookingSet.add(booking);
        System.out.println("Booking complete!");
    }


    @Override
    public void display() {
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }

    public static Customer chooseCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Customer list: ");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("Input id of Customer: ");
        boolean check = true;
        String id = scanner.nextLine();
        while (check) {
            for (Customer customer : customerList) {
                if (id.equals(customer.getId())) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.println("Wrong input! please input again: ");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Facility list: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Input id of Facility: ");
        boolean check = true;
        String id = scanner.nextLine();
        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getIdFacility())) {
                    check = false;
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.println("Wrong input! please input again: ");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
//    @Override
//    public void add() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Customer service information and facility: ");
//        FacilityServiceImpl facilityService = new FacilityServiceImpl();
//        facilityService.display();
//        CustomerServiceImpl customerService = new CustomerServiceImpl();
//        customerService.display();
//        List<Customer> customerList = readFileCustomer(CUSTOMER_PATH);
//        System.out.println(customerList);
//        Map<Facility, Integer> facilityList = readFileFacility(FACILITY_PATH);
//        System.out.println("Enter index customer: ");
//        int index = Integer.parseInt(scanner.nextLine());
//        Customer customer = customerList.get(index - 1);
//        System.out.println("Enter id Booking: ");
//        int idBooking = Integer.parseInt(scanner.nextLine());
//        System.out.println("Enter start Day: ");
//        String startDay = scanner.nextLine();
//        System.out.println("Enter end Day: ");
//        String endDay = scanner.nextLine();
//        System.out.println("Enter service: ");
//        String serviceName = scanner.nextLine();
//        Facility facility = new Facility();
//        for (Map.Entry<Facility, Integer> map : facilityList.entrySet()) {
//            if (map.getKey().getService().equals(serviceName)) {
//                facility = map.getKey();
//                map.setValue(map.getValue() + 1);
//                fileFacility.delete();
//                writeFileFacility(facilityList, FACILITY_PATH, true);
//            }
//        }
//        System.out.println("Enter type of service ");
//        String typeOfService = scanner.nextLine();
//        Booking booking = new Booking(idBooking, startDay, endDay, customer,
//                facility, typeOfService);
//
//        writeFileBooking(bookingList, BOOKING_PATH, true);

//    }

//    @Override
//    public void display() {
//        for (Booking booking : bookingList) {
//            System.out.println(booking);
//        }
//    }


