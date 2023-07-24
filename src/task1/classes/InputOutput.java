package task1.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.Scanner;

public class InputOutput {

    public static List<String> getFilePath() {
        System.out.print("Enter file path or 0 for exit: ");
        List<String> files = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("0")) break;
            files.add(line);
            System.out.print("Enter next file path: ");
        }
        return files;
    }

    public static void writeFile(Map<String, String> documentNumbers, File outPath) {
        try (PrintWriter pw = new PrintWriter(outPath)) {
            for (Map.Entry<String, String> set : documentNumbers.entrySet()) {
                pw.write(set.getKey() + " - " + set.getValue() + "\n");
                pw.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
