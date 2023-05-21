import java.util.Scanner;

public class PersonalData {

    public static void showPersonalData() {
        String _name = askName();
        String _surname = askSurname();
        int _age = askAge();
        int _height = askHeight();
        double _weight = askWeight();

        System.out.println("--Personal data: ");
        System.out.println("Name: " + _name);
        System.out.println("Surname: " + _surname);
        System.out.println("Age: " + _age);
        System.out.println("Height: " + _height);
        System.out.println("Weight: " + _weight);
    }

    public static String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        return scanner.nextLine();
    }

    public static String askSurname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a surname: ");
        return scanner.nextLine();
    }

    public static int askAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an age: ");
        return scanner.nextInt();
    }

    public static int askHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a height in sm: ");
        return scanner.nextInt();
    }

    public static double askWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a weight in kg: ");
        return scanner.nextDouble();
    }
}
