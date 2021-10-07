package vehicle.cars;

import utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class WriteCarFile {
    public static void writeCarFile(List<Car> car, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Car car1 : car) {
            stringList.add(car1.getCarInfo());
        }
        ReadAndWriteFile.writeFile(stringList, path, append);
    }
}

