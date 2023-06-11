package hw8_1_task2;

public class TreatmentPlan {
    private int code;
    private Doctor doctor;
    private String plan;

    public TreatmentPlan(int number) {
        this.code = number;
        setDoctor();
    }

    public int getCode() {
        return code;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor() {
        switch (getCode()) {
            case 1 -> {
                doctor = new Surgeon("Paul", 101);
                this.plan = doctor.treat();
            }
            case 2 -> {
                doctor = new Dentist("John", 102);
                this.plan = doctor.treat();
            }
            default -> {
                doctor = new Therapist("Adam", 103);
                this.plan = doctor.treat();
            }
        }
    }

    @Override
    public String toString() {
        return "Therapy { " +
                "\n\t\tcode = " + code +
                ", \n\t\t" + doctor +
                ", \n\t\t" + plan  +
                "\n\t}";
    }
}
