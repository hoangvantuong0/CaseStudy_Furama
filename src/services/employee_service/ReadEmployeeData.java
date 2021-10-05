package services.employee_service;
import models.person.Employee;
import java.util.ArrayList;
import java.util.List;
import static utils.ReadAndWriteFile.readFile;

public class ReadEmployeeData {
    public static List<Employee> readFileEmployee(String path) {
        List<String> stringList = readFile(path);
        List<Employee> employeeList = new ArrayList<>();
        for (String string : stringList) {
            String[] temp = string.split(",");
            Employee employee = new Employee(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], Integer.parseInt(temp[4]),
                    Integer.parseInt(temp[5]), temp[6], temp[7], temp[8], Double.parseDouble(temp[9]));
        }
        return employeeList;
    }
}
