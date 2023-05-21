import java.util.Scanner;

public class SymToNumConverter {

    public static char askChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any symbol: ");
        return scanner.next().charAt(0);
    }

    public static void showSymbolAndNumber() {
        char symbol = askChar();
        System.out.println(symbol + " - " + (int)symbol);
    }
}
