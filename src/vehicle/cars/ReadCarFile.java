package vehicle.cars;

import utils.ReadAndWriteFile;

import java.util.LinkedList;
import java.util.List;

public class ReadCarFile {
    public static List<Car> readCarFile(String path) {
        List<String> stringList = ReadAndWriteFile.readFile(path);
        List<Car> carList = new LinkedList<>();
        for (String string : stringList) {
            String[] temp = string.split(",");
            Car car = new Car(temp[0], Integer.parseInt(temp[1]), temp[2]);
        }
        return carList;
    }

}
