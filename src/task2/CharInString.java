package task2;

import java.util.Scanner;

public class CharInString {
    private final String primaryString;

    public CharInString() {
        System.out.print("Enter your string: ");
        this.primaryString = cin().nextLine();
    }

    public CharInString(String primaryString) {
        this.primaryString = primaryString;
    }

    public String getPrimaryString() {
        return primaryString;
    }

    public String duplicateCharInString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < primaryString.length(); i++) {
            res.append(primaryString.charAt(i));
            res.append(primaryString.charAt(i));
        }
        return res.toString();
    }

    public static Scanner cin() {
        return new Scanner(System.in);
    }
}
