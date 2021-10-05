package services.customer_service;

import models.person.Customer;
import java.util.LinkedList;
import java.util.Scanner;
import static services.customer_service.WriteCustomerData.writeFileCustomer;

public class CustomerServiceImpl implements CustomerService {
    public static final String CUSTOMER_PATH = "src/data/customer.csv";
    static LinkedList<Customer> customerList = new LinkedList<>();

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        String id = scanner.nextLine();
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter day of birth: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Enter the gender: ");
        String gender = scanner.nextLine();
        System.out.println("enter identity card number: ");
        String identityCard = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter the email: ");
        String email = scanner.nextLine();
        System.out.println("Enter kinds of customer: ");
        String kindsOfCustomer = scanner.nextLine();
        System.out.println("Enter the address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, dayOfBirth, gender, identityCard, phoneNumber, email, kindsOfCustomer, address);
        customerList.add(customer);
        writeFileCustomer(customerList, CUSTOMER_PATH, true );
    }

    @Override
    public void display() {
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println((i+1) + " " +customerList.get(i).toString());
        }
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        String id = scanner.nextLine();
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter day of birth: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.println("enter identity card number: ");
        String identityCard = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter the email: ");
        String email = scanner.nextLine();
        System.out.println("Enter kinds of customer: ");
        String kindsOfCustomer = scanner.nextLine();
        System.out.println("Enter the address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, dayOfBirth, gender, identityCard, phoneNumber, email, kindsOfCustomer, address);
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                customerList.get(i).setId(id);
                customerList.get(i).setName(name);
                customerList.get(i).setDayOfBirth(dayOfBirth);
                customerList.get(i).setGender(gender);
                customerList.get(i).setIdentityCard(identityCard);
                customerList.get(i).setPhoneNumber(phoneNumber);
                customerList.get(i).setEmail(email);
                customerList.get(i).setKindsOfCustomer(kindsOfCustomer);
                customerList.get(i).setAddress(address);
            }
        }
    }
    @Override
    public void delete(){

    }
}
