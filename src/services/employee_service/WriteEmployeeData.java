package services.employee_service;

import models.person.Employee;
import utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class WriteEmployeeData {
    public static void writeFileEmployee(List<Employee> employeeList, String path, boolean append){
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList){
            stringList.add(employee.getInfoEmployee());
        }
        ReadAndWriteFile.writeFile(stringList, path, append);
    }
}
