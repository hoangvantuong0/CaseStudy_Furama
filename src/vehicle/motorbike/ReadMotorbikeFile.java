package vehicle.motorbike;

import utils.ReadAndWriteFile;
import vehicle.cars.Car;

import java.util.LinkedList;
import java.util.List;

public class ReadMotorbikeFile {
    public static List<Motorbike> readMotorbikeFile(String path) {
        List<String> stringList = ReadAndWriteFile.readFile(path);
        List<Motorbike> motorbikes = new LinkedList<>();
        for (String string : stringList) {
            String[] temp = string.split(",");
             Motorbike motorbike = new Motorbike(temp[0], temp[1]);
        }
       return motorbikes;
    }
}
