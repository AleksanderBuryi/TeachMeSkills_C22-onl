package hw8_1_task2;

public class Patient {
    private String name;
    private int age;
    private double weight;
    private TreatmentPlan treatmentPlan;

    public Patient(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    @Override
    public String toString() {
        return "Patient {" +
                "\n\tname = '" + name + '\'' +
                ", \n\tage = " + age +
                ", \n\tweight = " + weight +
                ", \n\n\t" + treatmentPlan +
                "\n}";
    }
}
