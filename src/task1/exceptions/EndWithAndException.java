package task1.exceptions;

public class EndWithAndException extends Exception{
    public EndWithAndException(String message) {
        super(message);
        System.out.println(message);
    }
}
