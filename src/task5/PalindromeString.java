package task5;

import java.util.Scanner;

public class PalindromeString {
    private final String sentence;

    public PalindromeString() {
        System.out.print("Enter your sentence: ");
        this.sentence = cin().nextLine();
    }

    public PalindromeString(String sentence) {
        this.sentence = sentence;
    }

    public boolean isPalindrome(int wordIndex) {
        String[] words = sentence.split(" ");

        if (checkWordIndex(wordIndex, words)) {
            String reverseWord = new StringBuilder(words[wordIndex]).reverse().toString();
            return words[wordIndex].equalsIgnoreCase(reverseWord);
        }

        return false;
    }

    private static boolean checkWordIndex(int index, String[] words) {
        if (index > words.length-1 || index < 0) {
            System.out.println("There is no word with this index " + index);
            return false;
        } else
            return true;
    }

    public String getSentence() {
        return sentence;
    }

    public String getWord(int index) {
        return sentence.split(" ")[index];
    }

    public void aboutWord(int index) {
        System.out.println("Is \"" + getWord(index) + "\" a palindrome? " + isPalindrome(index));
    }

    public static Scanner cin() {
        return new Scanner(System.in);
    }
}
