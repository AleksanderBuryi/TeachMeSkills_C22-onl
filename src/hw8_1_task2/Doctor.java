package hw8_1_task2;

public abstract class Doctor {
    private String name;
    private int room;

    public Doctor(String name, int room) {
        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public int getRoom() {
        return room;
    }

    public abstract String treat();

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", room=" + room +
                '}';
    }
}
