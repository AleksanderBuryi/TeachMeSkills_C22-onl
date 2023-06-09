package task1;

import java.util.Scanner;

public class CreditCard {
    private String accountNumber;
    private double accountBalance;

    public CreditCard() {
        System.out.print("Please, enter the account number: ");
        this.accountNumber = cin().nextLine();

        while (true) {
            System.out.print("Please, enter the account balance: ");
            double quantity = cin().nextDouble();
            if (quantity >= 0) {
                this.accountBalance = quantity;
                break;
            } else {
                System.out.println("You cannot enter an account balance less than 0");
            }
        }
    }

    public CreditCard(String accountNumber, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void refill(){
        while (true) {
            System.out.print("\nPlease, enter the amount you want to add to account number " + this.accountNumber + ": ");
            double quantity = cin().nextDouble();
            if (quantity >= 0) {
                this.accountBalance += quantity;
                break;
            } else {
                System.out.println("You cannot enter an amount less than 0");
            }
        }
    }

    public void refill(double quantity){
            if (quantity >= 0) {
                this.accountBalance += quantity;
            } else {
                System.out.println("You cannot enter an amount less than 0");
            }
    }

    public void withdrawMoney(){
        while (true) {
            System.out.print("\nPlease, enter the amount you would like to receive from account number " + this.accountNumber + ": ");
            double quantity = cin().nextDouble();
            quantity = (quantity >= 0.0) ? quantity : quantity * -1;
            if (quantity <= this.accountBalance) {
                this.accountBalance -= quantity;
                break;
            } else {
                System.out.println("You cannot withdraw more than balance");
            }
        }
    }

    public void withdrawMoney(double quantity){
        quantity = (quantity >= 0.0) ? quantity : quantity * -1;
        if (quantity <= this.accountBalance) {
            this.accountBalance -= quantity;
        } else {
            System.out.println("You cannot withdraw more than balance");
        }
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void getCardInfo() {
        System.out.println("\nAccount number: " + getAccountNumber() + "\nCurrent amount: " + getAccountBalance());
    }

    private Scanner cin() {
        return new Scanner(System.in);
    }

}
