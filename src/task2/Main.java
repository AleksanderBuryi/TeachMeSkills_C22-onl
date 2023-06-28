package task2;

import task2.classes.Authorization;
import task2.classes.Input;
import task2.exceptions.WrongLoginException;
import task2.exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t=== Homework 11. Additional task. Task 2 ===\n");

        try {
            System.out.println(
                    "\nIs authorization success? " +
                    Authorization.makeAuthorization(
                            Input.inputLogin(),
                            Input.inputPassword(),
                            Input.inputPassword("Enter confirm password: ")
                    )
            );
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }

    }
}
