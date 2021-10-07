package vehicle.motorbike;

import utils.ReadAndWriteFile;
import vehicle.cars.Car;

import java.util.ArrayList;
import java.util.List;

public class WriteMotorbike {
    public static void writeMotorbikeFile(List<Motorbike> motorbikes, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Motorbike motorbike1 : motorbikes) {
            stringList.add(motorbike1.getMotorbikeInfo());
        }
        ReadAndWriteFile.writeFile(stringList, path, append);
    }
}
