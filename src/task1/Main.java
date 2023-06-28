package task1;

import task1.exceptions.EndWithAndException;
import task1.exceptions.IsSequenceException;
import task1.exceptions.StartWithAndException;
import task1.prevTask.MainPrev;
import task1.prevTask.ManipulatedString;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t=== Homework 11. MainPrev Task. Task 1 ===\n");

        String str = "1234-qWe-5678-yhN-1a2b";
        System.out.print("Origin document number: " + str + "\n\n");

        try {
            ManipulatedStringWithExceptions.containsSubstring(str, "qwe");
            ManipulatedStringWithExceptions.containsSubstring(str, "abc");
        } catch (IsSequenceException e) {
            e.printStackTrace();
            System.err.println();
        }

        System.out.println();

        try {
            System.out.println(str + " starts with \"123\": " + ManipulatedStringWithExceptions.startWith(str, "123"));
            System.out.println(str + " starts with \"555\": " + ManipulatedStringWithExceptions.startWith(str, "555"));
        } catch (StartWithAndException e) {
            e.printStackTrace();
            System.err.println();
        }

        System.out.println();

        try {
            System.out.println(str + " ends with \"1a2b\": " + ManipulatedStringWithExceptions.endWith(str, "1a2b"));
            System.out.println(str + " ends with \"3r4f\": " + ManipulatedStringWithExceptions.endWith(str, "3r4f"));
        } catch (EndWithAndException e) {
            System.out.println();
            e.printStackTrace();
        }
    }
}
