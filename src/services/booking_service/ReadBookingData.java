package services.booking_service;

import models.booking.Booking;
import models.facility.Facility;
import models.person.Customer;
import utils.BookingComparator;
import utils.ReadAndWriteFile;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import static services.customer_service.CustomerServiceImpl.CUSTOMER_PATH;
import static services.customer_service.ReadCustomerData.readFileCustomer;
import static services.facility_service.FacilityServiceImpl.FACILITY_PATH;
import static services.facility_service.ReadFacilityData.readFileFacility;
import static utils.ReadAndWriteFile.readFile;

public class ReadBookingData {
    public static Set<Booking> readFileBooking(String path) {
        List<String> stringList = readFile(path);
        Set<Booking> bookingList = new TreeSet<Booking>(new BookingComparator());
        List<Customer> customerList = readFileCustomer(CUSTOMER_PATH);
        Map<Facility, Integer> facilityList = readFileFacility(FACILITY_PATH);
        for (String string : stringList) {
            String[] temp = string.split(",");
            Customer customer = new Customer();
            for (Customer customer1 : customerList) {
                if (customer1.getId().equals(temp[3])) {
                    customer = customer1;
                }
            }
            Facility facility = new Facility();
            for (Map.Entry<Facility, Integer> map : facilityList.entrySet()) {
                if (map.getKey().getService().equals(temp[4])) {
                    facility = map.getKey();
                }
            }
            Booking booking = new Booking(Integer.parseInt(temp[0]), temp[1], temp[2], customer, facility,temp[5]);
            bookingList.add(booking);
        }
        return bookingList;
    }
}
//
//
//        List<String> stringList = ReadAndWriteFile.readFile(path);
//        Set<Booking> bookingList = new TreeSet<>(new BookingComparator());
//        for (String string : stringList) {
//            String[] temp = string.split(",");
//            Booking booking = new Booking(Integer.parseInt(temp[0]),
//                    temp[1], temp[2], temp[3], temp[4],
//                    temp[5]);
//        }
//
//        return bookingList;
//    }


