package controllers;

import services.booking_service.BookingServiceImpl;
import services.contract_service.ContractServiceImpl;
import services.customer_service.CustomerService;
import services.customer_service.CustomerServiceImpl;
import services.employee_service.EmployeeServiceImpl;
import services.facility_service.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {

    public static void main(String[] args) {
        EmployeeServiceImpl employeeManagement = new EmployeeServiceImpl();
        CustomerService customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("Menu: " + "\n" +
                    "1. Employee Management" + "\n" +
                    "2. Customer Management" + "\n" +
                    "3. Facility Management" + "\n" +
                    "4. Booking Management" + "\n" +
                    "5. Promotion Management" + "\n" +
                    "6. Exit ");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    boolean flag1 = true;
                    while (flag1) {
                        System.out.println("Menu Employees: " + "\n" +
                                "1. Display list employees" + "\n" +
                                "2. Add new employee" + "\n" +
                                "3. Edit employee" + "\n" +
                                "4. Return main menu");
                        System.out.println("Enter your choice: ");
                        int choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                employeeManagement.display();
                                break;
                            case 2:
                                employeeManagement.add();
                                break;
                            case 3:
                                employeeManagement.edit();
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
                        System.out.println("Menu Customer: " + "\n" +
                                "1. Display list customers" + "\n" +
                                "2. Add new customer" + "\n" +
                                "3. Edit customer" + "\n" +
                                "4. Return main menu");
                        System.out.println("Enter your choice: ");
                        int choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                customerService.display();
                                break;
                            case 2:
                                customerService.add();
                                break;
                            case 3:
                                customerService.edit();
                                break;
                            case 4:
                                flag1 = false;
                        }
                    }
                    break;
                }
                case 3: {
                    boolean flag1 = true;
                    while (flag1) {
                        System.out.println("Menu Facility Management: " + "\n" +
                                "1. Display list facility" + "\n" +
                                "2. Add new facility" + "\n" +
                                "3. Display list facility maintenance" + "\n" +
                                "4. Return main menu");
                        System.out.println("Enter your choice: ");
                        int choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                facilityService.display();
                                break;
                            case 2:
                                facilityService.add();
                                break;
                            case 3:
                                facilityService.displayMaintenance();
                                break;
                            case 4:
                                flag1 = false;
                        }
                    }
                    break;
                }
                case 4: {
                    boolean flag1 = true;
                    while (flag1) {
                        System.out.println("Menu Booking Management: " + "\n" +
                                "1. Add new booking" + "\n" +
                                "2. Display list booking" + "\n" +
                                "3. Create new contracts" + "\n" +
                                "4. Display list contracts" + "\n" +
                                "5. Edit contracts" + "\n" +
                                "6. Return main menu");
                        System.out.println("Enter your choice: ");
                        int choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                bookingService.add();
                                break;
                            case 2:
                                bookingService.display();
                                break;
                            case 3:
                                contractService.add();
                                break;
                            case 4:
                                contractService.display();
                            case 5:
                                break;
                            case 6:
                                flag1 = false;
                        }
                    }
                    break;
                }
                case 5: {
                    boolean flag1 = true;
                    while (flag1) {
                        System.out.println("Menu Promotion Management: " + "\n" +
                                "1. Display list customers use service" + "\n" +
                                "2. Display list customers get voucher" + "\n" +
                                "4. Return main menu");
                        System.out.println("Enter your choice: ");
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
                    break;
                }
            }
        }
    }

}


