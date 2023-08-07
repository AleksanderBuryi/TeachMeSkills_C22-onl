package task1.consoleMethods;

import task1.interfaces.Reader;

import java.util.Scanner;

public class ConsoleReader implements Reader {

    @Override
    public String read() {
        return cin().nextLine();
    }

    private Scanner cin() {
        return new Scanner(System.in);
    }
}
