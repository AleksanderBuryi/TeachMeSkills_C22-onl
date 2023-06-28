package task2.classes;

import task2.exceptions.WrongLoginException;
import task2.exceptions.WrongPasswordException;

public class Authorization {

    public static boolean makeAuthorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.isEmpty() || login.length() >= 20 || login.contains(" "))
            throw new WrongLoginException();
        else if (password.isEmpty() || password.length() >= 20 || password.contains(" ")) {
            throw new WrongPasswordException();
        } else {
            int num = 0;
            for (char ch : password.toCharArray()) {
                if (Character.isDigit(ch)) {
                    num++;
                    break;
                }
            }
            if (num > 0 && password.equals(confirmPassword)){
                return true;
            } else {
                throw new WrongLoginException(
                        "The password must have at least one digit " +
                        "and equals confirmPassword."
                );
            }
        }
    }
}
