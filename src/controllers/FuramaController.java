package controllers;

import services.customer_service.CustomerService;
import services.customer_service.CustomerServiceImpl;
import services.employee_service.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {

    public static void main(String[] args) {
        EmployeeServiceImpl employeeManagement = new EmployeeServiceImpl();
        CustomerService customerService = new CustomerServiceImpl();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Menu: " +
                    "1. Employee Management" +
                    "2. Customer Management" +
                    "3. Facility Management" +
                    "4. Booking Management" +
                    "5. Promotion Management" +
                    "6. Exit ");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    boolean flag1 = true;
                    while (flag1) {
                        System.out.println("Menu employees:" +
                                "1. Display list employees" +
                                "2. Add new employee" +
                                "3. Edit employee" +
                                "4	Return main menu");
                        System.out.println("Enter your choose:");
                        int choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                employeeManagement.display();
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                flag1 = false;
                        }
                    }
                    break;
                }
                case 2: {
                    boolean flag1 = true;
                    while (flag1) {
                        System.out.println("Menu employees:" +
                                "1. Display list customers" +
                                "2. Add new customer" +
                                "3. Edit customer" +
                                "4	Return main menu");
                        System.out.println("Enter your choose:");
                        int choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                flag1 = false;
                        }
                    }
                }
                break;

            }
        }

    }

}
