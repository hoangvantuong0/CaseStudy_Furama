package services.booking_service;

import models.booking.Booking;
import models.facility.Facility;
import models.facility.Villa;
import models.person.Customer;

import java.io.File;
import java.util.*;

import static services.booking_service.ReadBookingData.readFileBooking;
import static services.booking_service.WriteBookingData.writeFileBooking;

public class BookingServiceImpl implements BookingService {
    public static final String BOOKING_PATH = "src/data/booking.csv";
    Scanner scanner = new Scanner(System.in);
    Set<Booking> bookingSet = readFileBooking(BOOKING_PATH);
    static List<Customer> customerList = new ArrayList<>();
    public static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        Customer customer1 = new Customer("1", "Hoàng Văn An", "10/02/1994", "Male",
                "0124126453", "037512637", "hoangvanan@gmail.com",
                "Gold", "Đà Nẵng");
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

        System.out.println("Input id booking: ");
        int idBooking = Integer.parseInt(scanner.nextLine());
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Input start day: ");
        String startDay = scanner.nextLine();
        System.out.println("Input end day: ");
        String endDay = scanner.nextLine();
        System.out.println("Input type of service: ");
        String typeOfService = scanner.nextLine();
        Booking booking = new Booking(idBooking, startDay, endDay, customer, facility, typeOfService);
        bookingSet.add(booking);
        System.out.println("Booking complete!");
        File file = new File(BOOKING_PATH);
        file.delete();
        writeFileBooking(bookingSet, BOOKING_PATH, true);
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            if (chooseFacility().getIdFacility().equals(entry.getKey().getIdFacility())) {
                entry.setValue(entry.getValue() + 1);
            }
        }
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
