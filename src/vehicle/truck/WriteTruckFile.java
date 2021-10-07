package vehicle.truck;

import utils.ReadAndWriteFile;
import vehicle.motorbike.Motorbike;

import java.util.ArrayList;
import java.util.List;

public class WriteTruckFile {
    public static void writeTruckFile(List<Truck> truck, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Truck truck1 : truck) {
            stringList.add(truck1.getIdTruck());
        }
        ReadAndWriteFile.writeFile(stringList, path, append);
    }
}

