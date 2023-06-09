package task1;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t===Main Task===");
        //Task 1
        System.out.println("Task 1");
        CreditCard card1 = new CreditCard("7234578987658345", 100);
        CreditCard card2 = new CreditCard("1029384756564738", 500);
        CreditCard card3 = new CreditCard();
//        task1.CreditCard card3 = new task1.CreditCard("5647382910298374", 900);

        card1.getCardInfo();
        card2.getCardInfo();
        card3.getCardInfo();

        card1.refill(75);
        card2.refill();
        card3.withdrawMoney();

        card1.getCardInfo();
        card2.getCardInfo();
        card3.getCardInfo();

    }
}
