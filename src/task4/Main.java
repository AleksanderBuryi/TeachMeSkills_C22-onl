package task4;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t=== Homework 10. Additional task. Task 4 ===\n");
        MinDifferentCharString str = new MinDifferentCharString("fffff ab f FFFFF 1234 jkjk");
        System.out.println("Origin string: " + str.getSentence() + "\n");

        System.out.println(str.searchMinDifferentSymbolsWord());
    }
}
