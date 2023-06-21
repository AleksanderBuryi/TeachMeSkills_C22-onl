package hw8_2_task2;

public class Director extends Employee {

    public Director() {
        super("Director");
    }

    public Director(String position) {
        super(position);
    }

    @Override
    public void printPosition() {
        System.out.println(getPosition());
    }
}
