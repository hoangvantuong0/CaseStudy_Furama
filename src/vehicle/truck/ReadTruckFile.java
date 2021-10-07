package vehicle.truck;

import utils.ReadAndWriteFile;
import vehicle.motorbike.Motorbike;

import java.util.LinkedList;
import java.util.List;

public class ReadTruckFile {
    public static List<Truck> readTruckFile(String path) {
        List<String> stringList = ReadAndWriteFile.readFile(path);
        List<Truck> trucks = new LinkedList<>();
        for (String string : stringList) {
            String[] temp = string.split(",");
           Truck truck = new Truck(temp[0], Integer.parseInt(temp[1]));
        }
        return trucks;
    }
}
