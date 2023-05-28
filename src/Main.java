import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t===Main task===");
        //Task 0
        System.out.println("Task 0");
        int[] arrayFor0Task = createSimpleArray(10);
        System.out.println(Arrays.toString(arrayFor0Task));
        checkNumberInArray(arrayFor0Task);

        //Task 1
        System.out.println("\nTask 1");
        int[] arrayFor1Task1 = new int[] {1,2,3,4,5,6,1,7,1,9};
        System.out.println(Arrays.toString(arrayFor1Task1));
        int[] arrayFor1Task2 = removeNumbersInArray(arrayFor1Task1);
        System.out.println(Arrays.toString(arrayFor1Task2));

        //Task 2
        System.out.println("\nTask 2");
        int[] arrayFor2Task = createRandomArray();
        System.out.println(Arrays.toString(arrayFor2Task));
        findMaxMinAverageValue(arrayFor2Task);

        //Task 3
        System.out.println("\nTask 3");
        int[] arrayFor3Task1 = createRandomArray(5);
        int[] arrayFor3Task2 = createRandomArray(5);
        System.out.println("First array: " + Arrays.toString(arrayFor3Task1));
        System.out.println("Second array: " + Arrays.toString(arrayFor3Task2));
        compareValues(findAverageValue(arrayFor3Task1), findAverageValue(arrayFor3Task2));

        System.out.println("\n\t\t===Additional task==");

    }

    public static Scanner cin() {
        return new Scanner(System.in);
    }

    public static int[] createSimpleArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }

        return array;
    }

    public static void checkNumberInArray(int[] array) {
        System.out.print("Please, enter a number: ");
        int number = cin().nextInt();
        System.out.println(Arrays.binarySearch(array, number) < 0 ? "Array doesn't contain this number" : "Array contains this number");
    }

    public static int[] removeNumbersInArray(int[] array) {
        System.out.print("Please, enter a number to delete: ");
        int counter = 0;
        int number = cin().nextInt();
        for (int i = 0, j = 0; i < array.length; i++){
            if (array[i] == number) {
                counter++;
            } else array[j++] = array[i];
        }
        if (counter == 0) {
            System.out.println("This number is not in the array");
        }
        return Arrays.copyOf(array, array.length-counter);
    }

    public static int[] createRandomArray() {
        System.out.print("Please, enter a size of array: ");
        int size = cin().nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(0 + Math.random() * 10);
        }

        return array;
    }

    public static int[] createRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(0 + Math.random() * 10);
        }

        return array;
    }

    public static double findAverageValue(int [] array) {
            double sum = 0;
            for (int element : array) sum += element;

            return sum / array.length;
    }

    public static void findMaxMinAverageValue(int[] array) {
        Arrays.sort(array);

        int minValue = array[0];
        int maxValue = array[array.length - 1];

        System.out.printf("Min value is %d,\nMax value is %d,\nAverage value is %.1f\n", minValue, maxValue, findAverageValue(array));
    }

    public static void compareValues(double firstValue, double secondValue) {
        System.out.println(firstValue > secondValue ?
                "The first average value (" + firstValue +") is greater than the second one (" + secondValue + ")" :
                (firstValue < secondValue) ? "The second average value (" + secondValue +") is greater than the first one (" + firstValue + ")" :
                "These values are equal.");
    }
}
