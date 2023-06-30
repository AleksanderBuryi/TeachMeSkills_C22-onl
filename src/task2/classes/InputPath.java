package task2.classes;

import java.io.File;
import java.util.Scanner;

public class InputPath {
    private static Scanner cin() {
        return new Scanner(System.in);
    }

    public static File getFilePath() {
        System.out.print("Enter file path: ");
        String path = cin().nextLine();
        return new File(path);
    }
}
