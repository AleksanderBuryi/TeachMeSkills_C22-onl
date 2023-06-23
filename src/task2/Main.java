package task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t=== Homework 10. Main task. Task 2 ===\n");
        String str1 = "Hello";
        System.out.print(str1 + " -> ");
        String str2 = new CharInString(str1).duplicateCharInString();
        System.out.println(str2);
        System.out.println("\nHash code str1 = \"" + str1 + "\": " + str1.hashCode());
        System.out.println("Hash code str2 = \"" + str2 + "\": " + str2.hashCode());
    }
}
