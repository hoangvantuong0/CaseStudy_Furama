package cinema;

import models.booking.Booking;
import models.contract.Contract;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static utils.ReadAndWriteFile.writeFile;

public class VietTenPhim {
    public static void vietTenPhim(List<Phim> phim, String path, boolean append) {
            List<String> stringList = new ArrayList<>();
            for (Phim phim1 : phim) {
                stringList.add(phim1.thongTinPhim());
            }
            writeFile(stringList, path, append);
        }
    }

