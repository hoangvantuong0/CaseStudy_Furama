package services.booking_service;

import models.booking.Booking;
import models.facility.Facility;
import models.person.Customer;
import services.customer_service.CustomerServiceImpl;
import services.facility_service.FacilityServiceImpl;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static services.booking_service.ReadBookingData.readFileBooking;
import static services.customer_service.CustomerServiceImpl.CUSTOMER_PATH;
import static services.customer_service.ReadCustomerData.readFileCustomer;
import static services.facility_service.FacilityServiceImpl.FACILITY_PATH;
import static services.facility_service.ReadFacilityData.readFileFacility;
import static services.facility_service.WriteFacilityData.writeFileFacility;

public class BookingServiceImpl implements BookingService {
    public static final String BOOKING_PATH = "src/data/booking.csv";
    File file = new File(BOOKING_PATH);
    File fileFacility = new File(FACILITY_PATH);
    Set<Booking> bookingList = readFileBooking(BOOKING_PATH);

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Customer service information and facility: ");
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        facilityService.display();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.display();
        List<Customer> customerList = readFileCustomer(CUSTOMER_PATH);
        Map<Facility, Integer> facilityList = readFileFacility(FACILITY_PATH);
        System.out.println("Customer service information and facility: ");
        System.out.println("Enter index customer: ");
        int index = Integer.parseInt(scanner.nextLine());
        Customer customer = customerList.get(index - 1);
        System.out.println("Enter id Booking: ");
        int idBooking = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter start Day: ");
        String startDay = scanner.nextLine();
        System.out.println("Enter end Day: ");
        String endDay = scanner.nextLine();
        System.out.println("Enter service: ");
        String serviceName = scanner.nextLine();
//        System.out.println("Enter customer: ");
//        Customer customer = scanner.nextLine();

        Facility facility = new Facility();
        for (Map.Entry<Facility, Integer> map : facilityList.entrySet()) {
            if (map.getKey().getService().equals(serviceName)) {
                facility = map.getKey();
                map.setValue(map.getValue() + 1);
                fileFacility.delete();
                writeFileFacility(facilityList, FACILITY_PATH, true);
            }
        }
        System.out.println("Enter type of service ");
        String typeOfService = scanner.nextLine();
        Booking booking = new Booking(idBooking, startDay, endDay, customer,
                facility, typeOfService);
//        file.delete();
//        bookingList.add(booking);
//        writeFileBooking(bookingList, BOOKING_PATH, true);

    }

    @Override
    public void display() {
        for (Booking booking : bookingList) {
            System.out.println(booking);
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
