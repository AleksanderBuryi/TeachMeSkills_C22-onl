package task5;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t=== Homework 10. Additional task. Task 5 ===\n");
        PalindromeString string = new PalindromeString("Radar sees you");
        System.out.println("Origin string: " + string.getSentence());

        string.aboutWord(0);
    }
}
