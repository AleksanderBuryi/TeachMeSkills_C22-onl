package task1;

import task1.consoleMethods.*;
import task1.interfaces.*;

public class Application {

    private final Reader reader = new ConsoleReader();
    private final Writer writer = new ConsoleWriter();
    private final Validator validator = new Validator();

    public void start() {
        do {
            writer.write("Enter ip-address: ");
            String ip = reader.read();

            if (validator.validate(ip)) {
                writer.write("ip-address is valid.");
            } else {
                writer.write("ip-address isn't valid");
            }

        } while (continueQuestion());
    }

    private boolean continueQuestion() {
        writer.write("\nContinue? 1 - yes, not 1 - no\n");
        return reader.read().equals("1");
    }
}
