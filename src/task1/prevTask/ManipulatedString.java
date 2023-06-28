package task1.prevTask;

import java.util.Scanner;

public class ManipulatedString {

    public static Scanner cin() {
        return new Scanner(System.in);
    }

    public static void getTwoFirstBlocksOf4Number(String str) {
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                System.out.print(str.charAt(i));
                numberCount += 1;
                if (numberCount == 4)
                    System.out.print("-");
            }

            if (numberCount == 8)
                break;
        }
        System.out.println();
    }

    public static void changeBlocksOfThreeLetters(String str) {
        int letterCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != '-')
                letterCounter += 1;
            else if (letterCounter == 3) {
                str = str.replace(str.substring(i - letterCounter, i), "***");
                letterCounter = 0;
            }
        }
        System.out.println(str);
    }

    public static void formattedOutputOnlyLetter(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                System.out.print(str.charAt(i));
            else {
                if (i - 1 < 0) continue;

                if (Character.isLetter(str.charAt(i - 1)))
                    System.out.print('/');
            }
        }
        System.out.println();
    }

    public static void formattedOutputOnlyLetterStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder("Letters:" + str.toUpperCase());
        for (int i = 0; i < stringBuilder.length(); i++) {

            if (Character.isLetter(stringBuilder.charAt(i)) || stringBuilder.charAt(i) == ':' )
                System.out.print(stringBuilder.charAt(i));
            else {
                if (i - 1 < 0) continue;

                if (Character.isLetter(stringBuilder.charAt(i - 1)))
                    System.out.print('/');
            }
        }
        System.out.println();
    }

    public static void containsSubstring(String str, String substring) {
        if(str.toLowerCase().contains(substring.toLowerCase()))
            System.out.println("Contains substring \"" + substring + "\"");
        else System.out.println("Doesn't contain substring \"" + substring + "\"");
    }

    public static boolean startWith(String str, String prefix) {
        return str.startsWith(prefix);
    }

    public static boolean endWith(String str, String prefix) {
        return str.endsWith(prefix);
    }
}
