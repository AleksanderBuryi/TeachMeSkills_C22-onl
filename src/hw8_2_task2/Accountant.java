package hw8_2_task2;

public class Accountant extends Employee {

    public Accountant() {
        super("Accountant");
    }

    public Accountant(String position) {
        super(position);
    }

    @Override
    public void printPosition() {
        System.out.println(getPosition());
    }
}
