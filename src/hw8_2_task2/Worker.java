package hw8_2_task2;

public class Worker extends Employee{

    public Worker() {
        super("Worker");
    }

    public Worker(String position) {
        super(position);
    }

    @Override
    public void printPosition() {
        System.out.println(getPosition());
    }
}
