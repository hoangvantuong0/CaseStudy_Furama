package services.booking_service;
import models.booking.Booking;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static utils.ReadAndWriteFile.writeFile;

public class WriteBookingData {
    public static void writeFileBooking(Set<Booking> bookingList, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Booking booking : bookingList) {
            stringList.add(booking.getInfoBooking());
        }
        writeFile(stringList, path, append);
    }
}
