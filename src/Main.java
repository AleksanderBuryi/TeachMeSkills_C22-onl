import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 1.1
        System.out.println("Task 1.1");
        System.out.println(printSeasonByMonthNumberSwitch());
        //Task 1.2
        System.out.println("\nTask 1.2");
        printSeasonByMonthNumberIfElse();
        //Task 1.3
        System.out.println("\nTask 1.3");
        checkEvenNumber();
        //Task 1.4
        System.out.println("\nTask 1.4");
        checkTemperature();
        //Task 1.5
        System.out.println("\nTask 1.5");
        System.out.println(defineRainbowColor());

        //Task 2.1
        System.out.println("\nTask 2.1");
        printOddNumber();
        //Task 2.2
        System.out.println("\nTask 2.2");
        printDecrementNumbers();
        //Task 2.3
        System.out.println("\nTask 2.3");
        System.out.println(sumUntilNumber());
        //Task 2.4
        System.out.println("\nTask 2.4");
        printPow7Sequence();
        //Task 2.5
        System.out.println("\nTask 2.5");
        printDescentSequence();
        //Task 2.6
        System.out.println("\nTask 2.6");
        printSquaresOfNumbers();

        //Task 3.1
        System.out.println("\nTask 3.1");
        printFibonacciSequence();
        //Task 3.2
        System.out.println("\nTask 3.2");
        calculateBankOperation();
        //Task 3.3
        System.out.println("\nTask 3.3");
        printMultiplicationTable();
    }

    public static Scanner cin() {
        return new Scanner(System.in);
    }

    public static String printSeasonByMonthNumberSwitch(){
        System.out.print("Please, enter a month number: ");

        switch(cin().nextInt()) {
            case 1, 2, 12: return "Winter";
            case 3, 4, 5: return "Spring";
            case 6, 7, 8: return "Summer";
            case 9, 10, 11: return "Autumn";
            default: return "It's not a month number";
        }

    }

    public static void printSeasonByMonthNumberIfElse() {
        System.out.print("Please, enter a month number: ");
        int numberOfMonth = cin().nextInt();

        if(numberOfMonth == 1 || numberOfMonth == 2 || numberOfMonth == 12){
            System.out.println("Winter");
        } else if (numberOfMonth >= 3 && numberOfMonth <= 5) {
            System.out.println("Spring");
        } else if (numberOfMonth >= 6 && numberOfMonth <= 8) {
            System.out.println("Summer");
        } else if (numberOfMonth >= 9 && numberOfMonth <= 11) {
            System.out.println("Autumn");
        } else System.out.println("It's not a month number");
    }

    public static void checkEvenNumber() {
        System.out.print("Please, enter a number: ");

        System.out.println((cin().nextInt() % 2 == 0) ? "It's an even number." : "It's an odd number.");
    }

    public static void checkTemperature() {
        System.out.print("Please, enter a temperature: ");

        int t = cin().nextInt();

        if (t > -5) System.out.println("Тепло");
        else if (-5 >= t && t > -20) System.out.println("Нормально");
        else if (-20 >= t) System.out.println("Холодно");
        else System.out.println("Please, check your input.");
    }

    public static String defineRainbowColor() {
        System.out.print("Please, enter a rainbow color number: ");

        switch (cin().nextInt()) {
            case 1: return "Red";
            case 2: return "Orange";
            case 3: return "Yellow";
            case 4: return "Green";
            case 5: return "Blue";
            case 6: return "Indigo";
            case 7: return "Violet";
            default: return "It's not a rainbow color number";
        }
    }

    public static void printOddNumber() {
        for (int i = 1; i < 99; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }
    }

    public static void printDecrementNumbers() {
        for (int i = 5; i > 1; i--) System.out.print(i + " ");
    }

    public static int sumUntilNumber() {
        int number;
        while (true) {
            System.out.print("Please, enter a positive integer number: ");
            number = cin().nextInt();
            if (number > 0) break;
            else System.out.println("Check your input number");
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += i;
        }

        return sum;
    }

    public static void printPow7Sequence() {
        int number = 0;

        while (number < 98) {
            System.out.print((number += 7) + " ");
        }

    }

    public static void printDescentSequence() {
        for (int i = 0, seqMember = 0; i < 10; i++, seqMember -= 5) {
            System.out.print(seqMember + " ");
        }
    }

    public static void printSquaresOfNumbers() {
        for (int i = 10; i <= 20; i++) {
            System.out.printf("Square %d is %.0f\n", i, Math.pow(i, 2));
        }
    }

    public static void printFibonacciSequence() {
        int first = 0;
        int second = 1;
        int result;
        System.out.print("Fibonacci sequence: " + first + " " + second + " ");
        for (int i = 1; i < 10; i++) {
            result = first + second;
            first = second;
            second = result;
            System.out.print(result + " ");
        }

    }

    public static void calculateBankOperation() {
        System.out.print("Please, enter a deposit amount: ");
        float deposit = cin().nextFloat();

        System.out.print("Please, enter a month: ");
        int month = cin().nextInt();

        float resultDeposit = 0;

        for (int i = 0; i < month; i++) {
            resultDeposit += (deposit * 0.07);
        }

        resultDeposit += deposit;

        System.out.println("Finally deposit amount: " + resultDeposit);
    }

    public static void printMultiplicationTable() {
        for (int i = 1; i < 10; i++ ){
            for (int j = 1; j < 10; j++){
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
