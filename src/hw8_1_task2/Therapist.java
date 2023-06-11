package hw8_1_task2;

public class Therapist extends Doctor{
    public Therapist(String name, int room) {
        super(name, room);
    }

    @Override
    public String treat() {
        return "Treatment Plan: The therapist will take all your money.";
    }
}
