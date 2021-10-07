package cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CrudPhim crudPhim = new CrudPhim();
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("************************************");
            System.out.println("Menu: " + "\n" +
                    "1. Danh sách phim" + "\n" +
                    "2. Thêm phim" + "\n" +
                    "3. Xoá phim" + "\n" +
                    "4. Exit");
            System.out.println("************************************");
            System.out.println("Enter your choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    crudPhim.hienThiPhim();
                    break;
                case "2":
                    crudPhim.themPhim();
                    break;
                case "3":
                    crudPhim.xoaPhim();
                    break;
                case "4":
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Nhập lại!");
            }
        }while (!choice.equals("4"));
    }
}