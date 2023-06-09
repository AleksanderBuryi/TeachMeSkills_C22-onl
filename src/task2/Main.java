package task2;

public class Main {
    public static void main(String[] args){
        System.out.println("\n\t\t===Additional Task. Task 1===\n");
        //Task 1
        Computer computer1 = new Computer(3500, "Lenovo");
        System.out.println(computer1);
        System.out.println();

        HDD hdd = new HDD("HDD", 1024, "Internal");
        RAM ram = new RAM("RAM", 64);
        Computer computer2 = new Computer(7500 , "Lenovo ideapad 330", ram, hdd);
        System.out.println(computer2);

    }
}
