package task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t=== Homework 10. Main task. Task 1 ===\n");
        String str = "1234-qWe-5678-yhN-1a2b";
        System.out.print("Origin document number: " + str + "\n\n");

        ManipulatedString.getTwoFirstBlocksOf4Number(str);
        ManipulatedString.changeBlocksOfThreeLetters(str);
        ManipulatedString.formattedOutputOnlyLetter(str);
        ManipulatedString.formattedOutputOnlyLetterStringBuilder(str);
        ManipulatedString.containsSubstring(str, "abc");
        ManipulatedString.containsSubstring(str, "qwe");
        System.out.println(str + " starts with \"555\": " + ManipulatedString.startWith(str, "555"));
        System.out.println(str + " ends with \"1a2b\": " + ManipulatedString.endWith(str, "1a2b"));
    }
}
