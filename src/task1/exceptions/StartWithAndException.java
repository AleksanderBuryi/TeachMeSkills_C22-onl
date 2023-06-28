package task1.exceptions;

public class StartWithAndException extends Exception {
    public StartWithAndException(String message) {
        super(message);
        System.out.println(message);
    }
}
