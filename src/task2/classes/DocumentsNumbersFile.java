package task2.classes;
import task1.exceptions.ValidationNumbersException;

import java.io.*;
import java.util.Scanner;

import static task1.classes.InputPath.getFilePath;

public class DocumentsNumbersFile {
    private static StringBuilder validNumbers = new StringBuilder();
    private static StringBuilder invalidNumbers = new StringBuilder();
    private static StringBuilder reason = new StringBuilder();

    public static void readFile() {
        try(Scanner fileScanner = new Scanner(getFilePath())) {

            while(fileScanner.hasNext()) {
                try {
                    String line = fileScanner.nextLine();
                    if (isValid(line)) {
                        validNumbers.append(line).append("\n");
                        System.out.println(line);
                    } else {
                        invalidNumbers.append(line).append(reason).append("\n");
                        throw new ValidationNumbersException();
                    }
                } catch (ValidationNumbersException e) {
                    e.getStackTrace();
                }
            }
            writeFile(new File("src/task2/outputFiles/ValidNumbers.txt"), validNumbers.toString());
            writeFile(new File("src/task2/outputFiles/InvalidNumbers.txt"), invalidNumbers.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(File outPath, String line) {
        try (PrintWriter pw = new PrintWriter(outPath)) {
            pw.write(line);
            pw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static boolean isValid(String str) {
        if (str.length() == 15) {
            if (!str.startsWith("docnum") && !str.startsWith("contract")) {
                reason.replace(0, reason.length()," doesn't start with docnum or contract.");
                return false;
            } else {
                for (char ch : str.toCharArray()) {
                    if (!Character.isLetterOrDigit(ch)) {
                        reason.replace(0, reason.length(), " contains a non-letter/number.");
                        return false;
                    }
                }
                return true;
            }
        } else {
            reason.replace(0, reason.length(), " length is not 15 characters.");
            return false;
        }
    }

}
