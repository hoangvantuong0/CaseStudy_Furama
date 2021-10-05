package services.customer_service;

import models.person.Customer;
import models.person.Employee;
import utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadCustomerData {
    public static List<Customer> readFileCustomer(String path){
        List<String> stringList = ReadAndWriteFile.readFile(path);
        List<Customer> customerList = new LinkedList<>();
        for (String string : stringList){
            String[] temp = string.split(",");
            Customer customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4],
                   temp[5], temp[6], temp[7], temp[8], temp[9]);
        }
        return customerList;
    }

}
