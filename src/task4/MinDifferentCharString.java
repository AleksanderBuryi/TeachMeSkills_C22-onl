package task4;

import java.util.Scanner;

public class MinDifferentCharString {
    private final String sentence;

    public MinDifferentCharString() {
        System.out.print("Enter your sentence: ");
        this.sentence = cin().nextLine();
    }

    public MinDifferentCharString(String sentence) {
        this.sentence = sentence;
    }

    public String searchMinDifferentSymbolsWord() {
        String[] words = sentence.split(" ");

        int maxCounter = 0;
        int wordIndex = 0;
        int iterator = 0;

        for (String word : words) {
            int currentCounter = 0;

            for (int i = 0; i < word.length(); i++) {
                for (int j = i; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j))
                        currentCounter += 1;
                }
            }
            if (maxCounter < currentCounter) {
                maxCounter = currentCounter;
                wordIndex = iterator;
            }
            iterator++;
        }

        return words[wordIndex];
    }

    public String getSentence() {
        return sentence;
    }

    public static Scanner cin() {
        return new Scanner(System.in);
    }
}
