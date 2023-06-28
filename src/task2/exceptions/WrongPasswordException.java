package task2.exceptions;

public class WrongPasswordException extends Exception{

    public WrongPasswordException() {
        super();
        System.err.println("Wrong password. Password must be < 20 symbols, doesn't contains gaps and has at least one digit.");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
