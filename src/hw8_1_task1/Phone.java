package hw8_1_task1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public String receiveCall(String name){
        return name + " calls";
    }
    public String receiveCall(String name, String number){
        return name + " calls " +
                "\nPhone number: " + number + "\n";
    }
    public void sendMessage(String ...numbers){
        System.out.println("\nPhone numbers to which the message will be sent from " + number +":");
        for (String num : numbers) {
            System.out.println(num);
        }
    }
}
