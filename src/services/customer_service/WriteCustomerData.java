package services.customer_service;

import models.person.Customer;
import utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class WriteCustomerData {
    public static void writeFileCustomer(List<Customer> customerList, String path, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.getInfoCustomer());
        }
        ReadAndWriteFile.writeFile(stringList, path, append);
    }
}
