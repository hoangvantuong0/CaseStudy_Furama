package services.booking_service;

import models.booking.Booking;
import models.person.Customer;
import utils.ReadAndWriteFile;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReadBookingData {
    public static Set<Booking> readFileBooking(String path) {
        List<String> stringList = ReadAndWriteFile.readFile(path);
        Set<Booking> bookingList = new TreeSet<>();
        for (String string : stringList) {
            String[] temp = string.split(",");
            Booking booking = new Booking(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4],
                    temp[5]);
        }

        return bookingList;
    }

}
