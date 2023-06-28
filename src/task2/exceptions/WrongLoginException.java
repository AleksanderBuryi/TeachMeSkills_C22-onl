package task2.exceptions;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
        super();
        System.err.println("Wrong login. Login must be < 20 symbols and doesn't contains gaps.");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
