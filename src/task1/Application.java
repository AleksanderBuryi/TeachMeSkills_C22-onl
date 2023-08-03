package task1;

import java.util.Scanner;

public class Application {

    private final ApplicationService service = new ApplicationService();

    public void start() {
        while(true) {
            System.out.println("""
                    
                    1. Show source array
                    2. Remove duplicates
                    3. Output all even elements in the range from 7 to 17 (inclusive)
                    4. Multiply each element by 2
                    5. Sort and display the first 4 elements
                    6. Display the number of elements in the stream
                    7. Display the arithmetic mean of all numbers in the stream
                    
                    0. Exit
                    """);


            int counter = getAnswer();

            switch (counter) {
                case 1 -> service.showSource();
                case 2 -> service.deleteDuplicates();
                case 3 -> service.getEvenNumbers();
                case 4 -> service.multiply();
                case 5 -> service.sortAndShow4Elements();
                case 6 -> service.getAmountOfElements();
                case 7 -> service.getAverage();
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
