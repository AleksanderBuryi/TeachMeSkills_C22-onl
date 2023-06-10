package hw8_1_task1;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t===Main task. Homework 8_1. Task 1===");
        //Task 1
        Phone phone1 = new Phone("375291234567", "Xiaomi Redmi Note 11", 320);
        Phone phone2 = new Phone("375337654321", "Poco x3 Pro", 480);
        Phone phone3 = new Phone("375259087645", "Samsung Galaxy S10");

        System.out.println("phone1: "
                                + "\n\tnumber: " + phone1.getNumber()
                                + "\n\tmodel: " + phone1.getModel()
                                + "\n\tweight: " + phone1.getWeight());

        System.out.println("phone2: "
                                + "\n\tnumber: " + phone2.getNumber()
                                + "\n\tmodel: " + phone2.getModel()
                                + "\n\tweight: " + phone2.getWeight());

        System.out.println("phone3: "
                                + "\n\tnumber: " + phone3.getNumber()
                                + "\n\tmodel: " + phone3.getModel()
                                + "\n\tweight: " + phone3.getWeight());

        System.out.println("___________________________________");

        System.out.println(phone1.receiveCall("Anton"));
        System.out.println(phone2.receiveCall("Rita"));
        System.out.println(phone3.receiveCall("Petra") + "\n");

        System.out.println(phone1.receiveCall("Anton", "375299987766"));
        System.out.println(phone2.receiveCall("Rita", "375442233556"));
        System.out.println(phone3.receiveCall("Petra", "375339081726"));

        phone1.sendMessage("375291133925", "375299078610", "375295538886");
        phone2.sendMessage("375295693907", "375292312669", "375298374473", "375298478762", "375296121284");
        phone3.sendMessage("375293270234", "375293952028", "375291597299", "375291938984", "375295494172", "375290050998", "375290062814");

    }

}

