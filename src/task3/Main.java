package task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t\t===Additional Task. Task 2===\n");
        //Task 2
        ATM atm = new ATM(30, 20, 10 );
        System.out.println(atm);
        System.out.println();

        atm.addMoney(50, 4);
        System.out.println(atm);
        System.out.println();

        if (atm.withdrawMoney(2520)) {
            System.out.println("Success.\n");
        } else {
            System.out.println("Sorry, ATM cannot give you this quantity of money.\n");
        }
        System.out.println(atm);

    }
}
