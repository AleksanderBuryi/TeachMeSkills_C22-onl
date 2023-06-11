package hw8_1_task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t===Additional task. Homework 8_1. Task 2===");
        //Task 2
        Patient patient = new Patient("Alfred", 33, 87);
        patient.setTreatmentPlan(new TreatmentPlan(3));
        System.out.println(patient);
    }
}
