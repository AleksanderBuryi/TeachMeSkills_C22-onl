package task2.exceptions;

public class ValidationNumbersException extends Exception{

    public ValidationNumbersException() {
        super();
        System.out.println("Document number is not valid.");
    }

    public ValidationNumbersException(String message) {
        super(message);
        System.err.println(message);
        System.out.println(message);
    }
}
