package hw8_1_task2;

public class Surgeon extends Doctor{
    public Surgeon(String name, int room) {
        super(name, room);
    }

    @Override
    public String treat() {
        return "Treatment plan: The surgeon will cut off your leg.";
    }
}
