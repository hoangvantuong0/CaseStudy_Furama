package services.employee_service;

import models.person.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static final String EMPLOYEE_PATH = "src/data/employee.csv";
    static ArrayList<Employee> employeesList = new ArrayList<>();

    static {
        Employee employee1 = new Employee(01, "Nguyễn Văn An", "10/02/1993", "Male", 0123455667, 0375235267, "Nguyenvanan@gmail.com",
                "amateur", "employee", 100000);
        employeesList.add(employee1);
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
        System.out.println("Enter standard: ");
        String standard = scanner.nextLine();
        System.out.println("Enter position: ");
        String position = scanner.nextLine();
        System.out.println("Enter salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(id, name, dayOfBirth, gender, identityCard, phoneNumber, email, standard, position, salary);
        employeesList.add(employee);
    }

    @Override
    public void display() {
        for (int i = 0; i < employeesList.size(); i++) {
            System.out.println(employeesList.get(i));
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
        System.out.println("Enter standard: ");
        String standard = scanner.nextLine();
        System.out.println("Enter position: ");
        String position = scanner.nextLine();
        System.out.println("Enter salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        for (int i=0; i<employeesList.size(); i++){
            if(employeesList.get(i).getId() == id){
                employeesList.get(i).setId(id);
                employeesList.get(i).setName(name);
                employeesList.get(i).setDayOfBirth(dayOfBirth);
                employeesList.get(i).setGender(gender);
                employeesList.get(i).setIdentityCard(identityCard);
                employeesList.get(i).setPhoneNumber(phoneNumber);
                employeesList.get(i).setEmail(email);
                employeesList.get(i).setStandard(standard);
                employeesList.get(i).setPosition(position);
                employeesList.get(i).setSalary(salary);
            }
        }
    }

    @Override
    public void delete() {

    }
}

