package baitap;

import baitap.main.CRUDClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CRUDClass crudClass = new CRUDClass();
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("************************************");
            System.out.println("Menu: " + "\n" +
                    "1. Danh sách môn học" + "\n" +
                    "2. Thêm môn học" + "\n" +
                    "3. Xoá môn học" + "\n" +
                    "4. Exit");
            System.out.println("************************************");
            System.out.println("Enter your choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    crudClass.display();
                    break;
                case "2":
                    crudClass.addLesson();
                    break;
                case "3":
                    crudClass.deleteLesson();
                    break;
                case "4":
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Nhập lại!");
                    break;
            }
        } while (!choice.equals("4"));
    }
}
