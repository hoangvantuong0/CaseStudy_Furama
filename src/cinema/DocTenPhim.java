package cinema;

import models.contract.Contract;

import java.util.ArrayList;
import java.util.List;

import static utils.ReadAndWriteFile.readFile;

public class DocTenPhim {
    public static List< Phim > docTenPhim(String path) {
        List< String > stringList = readFile(path);
        List< Phim > movieShowTimesList = new ArrayList<>();
        for (String string : stringList) {
            String[] temp = string.split(",");
            Phim phim = new Phim(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3],
                    Integer.parseInt(temp[4]));

            movieShowTimesList.add(phim);
        }
        return movieShowTimesList;
    }
}

