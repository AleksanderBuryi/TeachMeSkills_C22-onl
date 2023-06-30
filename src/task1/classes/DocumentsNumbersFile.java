package task1.classes;
import task1.exceptions.ValidationNumbersException;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static task1.classes.InputPath.getFilePath;

public class DocumentsNumbersFile {

    public static void readFile() {
        try(Scanner fileScanner = new Scanner(getFilePath())) {
                while(fileScanner.hasNext()) {
                    try {
                        String line = fileScanner.nextLine();
                        if (isValid(line))
                            System.out.println(line);
                        else throw new ValidationNumbersException();
                    } catch (ValidationNumbersException e) {
                        e.getStackTrace();
                    }
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static boolean isValid(String str) {
        if (str.length() == 15 && (str.startsWith("docnum") || str.startsWith("contract"))) {
            for (char ch : str.toCharArray()) {
                if (!Character.isLetterOrDigit(ch)) return false;
            }
            return true;
        }
        return false;
    }

}
