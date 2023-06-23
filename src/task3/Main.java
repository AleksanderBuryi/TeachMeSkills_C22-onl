package task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t=== Homework 10. Additional task. Task 3 ===\n");

        MinMaxSubstring string = new MinMaxSubstring("Search in this string min and max substring; for example word IN and substrING!");
        System.out.println("Origin string: " + string.getSentence());
        string.searchMax();
        string.searchMin();
    }
}
