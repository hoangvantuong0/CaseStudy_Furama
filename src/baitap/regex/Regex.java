package baitap.regex;

import java.util.Scanner;

public class Regex {
    static Scanner sc = new Scanner(System.in);

    public static String checkRegex(String string, String regex, String err) {
        boolean check = true;
        do {
            if (string.matches(regex)) {
                check = false;
            } else {
                System.out.println(err);
                string = sc.nextLine();
            }
        } while (check);
        return string;
    }
}