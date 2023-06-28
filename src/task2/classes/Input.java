package task2.classes;

import java.util.Scanner;

public class Input {

    private static Scanner cin() {
        return new Scanner(System.in);
    }

    public static String inputLogin() {
        System.out.print("Enter your login: ");
        return cin().nextLine();
    }

    public static String inputPassword() {
        System.out.print("Enter your password: ");
        return cin().nextLine();
    }

    public static String inputPassword(String msg) {
        System.out.print(msg);
        return cin().nextLine();
    }
}
