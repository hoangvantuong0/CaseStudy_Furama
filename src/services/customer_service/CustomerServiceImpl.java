package services.customer_service;

import models.person.Customer;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static LinkedList<Customer> customerList = new LinkedList<>();

    static {
        Customer customer = new Customer(01, "Nguyễn Văn Ba", "10/02/1996", "Male", 0123455674, 0375235223, "Nguyenvanba@gmail.com",
                "Diamond", "Quảng Nam");
        customerList.add(customer);
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter day of birth: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.println("enter identity card number: ");
        int identityCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter phone number: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter kinds of customer: ");
        String kindsOfCustomer = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, dayOfBirth, gender, identityCard, phoneNumber, email, kindsOfCustomer, address);
        customerList.add(customer);
    }

    @Override
    public void display() {
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter day of birth: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.println("enter identity card number: ");
        int identityCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter phone number: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter kinds of customer: ");
        String kindsOfCustomer = scanner.nextLine();
        System.out.println("Enter address: ");
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
