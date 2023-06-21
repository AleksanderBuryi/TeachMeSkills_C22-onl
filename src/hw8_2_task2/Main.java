package hw8_2_task2;

public class Main {
    public static void main(String[] args){
        System.out.println("\t\t===Main task. Homework 8_2. Task 2===");
        Employee director = new Director();
        System.out.print("Director position: ");
        director.printPosition();

        Employee accountant = new Accountant("Accountant");
        System.out.print("Accountant position: ");
        accountant.printPosition();

        Employee worker = new Worker();
        System.out.print("Worker position: ");
        worker.printPosition();

    }
}
