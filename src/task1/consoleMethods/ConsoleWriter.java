package task1.consoleMethods;

import task1.interfaces.Writer;

public class ConsoleWriter implements Writer {

    @Override
    public void write(String message) {
        System.out.print(message);
    }
}
