package task1.exceptions;

public class IsSequenceException extends Exception{
    public IsSequenceException(String msg) {
        super(msg);
        System.out.println(msg);
    }
}
