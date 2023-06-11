package hw8_2_task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t===Main task. Homework 8_2. Task 1===");
        //Task 1
        Figure[] figures = new Figure[]{
                new Triangle(3,4,5),
                new Triangle(6, 8, 10),
                new Rectangle(4, 6),
                new Rectangle(5, 5),
                new Circle(10)
        };

        System.out.println(Arrays.toString(figures));
        System.out.println("\nThe sum of the perimeter of all shapes in the array: " + sumPerimeters(figures));

    }

    public static double sumPerimeters(Figure[] figures) {
        double sumPerimeters = 0;

        for (Figure figure : figures) {
            sumPerimeters += figure.getPerimeter();
        }

        return sumPerimeters;
    }
}
