package hw8_2_task2;

public abstract class Employee implements IEmployee {
    private String position;

    public Employee() {
        this.position = "Unknown";
    }

    public Employee(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
