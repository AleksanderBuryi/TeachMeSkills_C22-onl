package task3;

import java.util.Scanner;

public class MinMaxSubstring {
    private final String sentence;

    public MinMaxSubstring() {
        System.out.print("Enter your sentence: ");
        this.sentence = cin().nextLine();
    }

    public MinMaxSubstring(String sentence) {
        this.sentence = sentence;
    }

    public void searchMax() {
        String[] words = this.sentence.split("[ .,?!;]");
        String maxLengthWord = words[0];

        for (String word : words)
            if (word.length() >= maxLengthWord.length())
                maxLengthWord = word;

        System.out.println("Last word with max length: " + maxLengthWord);
    }

    public void searchMin() {
        String[] words = this.sentence.split("[ .,?!;]");
        String minLengthWord = words[0];

        for (String word : words)
            if (word.length() <= minLengthWord.length() && !word.isBlank())
                minLengthWord = word;

        System.out.println("Last word with min length: " + minLengthWord);
    }

    public static Scanner cin() {
        return new Scanner(System.in);
    }

    public String getSentence() {
        return sentence;
    }
}
