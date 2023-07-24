package task1.Main;
import task1.classes.*;
import java.io.File;

import static task1.classes.DocumentsNumbersFile.getProcessedFiles;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t === Homework 13. Main task. Task 1 ===\n");
        //  paths for input:
        //      src/task1/resourses/DocumentsNumbers1.txt
        //      src/task1/resourses/DocumentsNumbers2.txt
        //      src/task1/resourses/DocumentsNumbers3.txt
        InputOutput.writeFile(getProcessedFiles(), new File("src/task1/outputFiles/Report.txt"));
    }
}
