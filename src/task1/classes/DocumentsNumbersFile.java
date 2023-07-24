package task1.classes;

import task1.exceptions.ValidationNumbersException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class DocumentsNumbersFile {
    private static StringBuilder reason = new StringBuilder();

    public static Map<String, String> getProcessedFiles() {
        Set<String> docNumbers = getUniqueDocNumbers();
        Map<String, String> processedNumbers = new HashMap<>();

        for (String num : docNumbers) {
            if (isValid(num)) {
                processedNumbers.put(num, "Valid");
            } else {
                processedNumbers.put(num, reason.toString());
            }
        }

        return processedNumbers;
    }

    private static Set<String> getUniqueDocNumbers() {
        Set<String> docNumbersSet = new HashSet<>();
        List<String> files = InputOutput.getFilePath();

        for (String file : files) {
            try (Scanner scanner = new Scanner(new File(file))) {
                while (scanner.hasNext()) {
                    docNumbersSet.add(scanner.nextLine());
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        return docNumbersSet;
    }

    private static boolean isValid(String str) {
        if (str.length() == 15) {
            if (!str.startsWith("docnum") && !str.startsWith("kontract")) {
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
