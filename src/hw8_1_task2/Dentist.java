package hw8_1_task2;

public class Dentist extends Doctor{
    public Dentist(String name, int room) {
        super(name, room);
    }

    @Override
    public String treat() {
        return "Treatment Plan: The Dentist Will Pull All Your Teeth!!!";
    }
}
