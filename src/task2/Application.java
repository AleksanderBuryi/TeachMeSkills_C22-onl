package task2;

import java.util.Scanner;

public class Application {

    private final ApplicationService service = new ApplicationService();

    public void start () {
        while (true) {
            System.out.println("""
                    
                    1. Show source collection
                    2. Return the number of people with your name
                       (outside depending on upper/lower case letters)
                    3. Select all names starting with "a" (regardless of
                       upper/lower case letters)
                    4. Sort and return the first element of the collection, or
                       "Empty" if the collection is empty
                    
                    0. Exit
                    """);

            int counter = getAnswer();

            switch (counter) {
                case 1 -> service.showSource();
                case 2 -> service.countStudentsWithSameName();
                case 3 -> service.namesStartWith();
                case 4 -> service.sort();
                case 0 -> {
                    return;
                }
                default -> throw new RuntimeException();
            }
        }

    }

    private int getAnswer() {
        System.out.print("Enter a number: ");
        return cin().nextInt();
    }

    private Scanner cin() {
        return new Scanner(System.in);
    }
}
