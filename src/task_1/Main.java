package task_1;

import task_1.Vectors.Vector;
import task_1.Vectors.Vector2D;
import task_1.Vectors.Vector3D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("\n\t\t\t===Homework #9. task_1.Main Task. Task 1===\n");
        //Task 1
        System.out.println("\t\t2D Vectors\n");
        Vector vector1 = new Vector2D(2, 3);
        Vector vector2 = new Vector2D(3, 4);

        vector1.getInfo();
        vector2.getInfo();

        System.out.println("\nDot product: " + vector1.dotProduct(vector2));
        System.out.println("\nSum of Vectors: " );
        vector1.sum(vector2).getInfo();
        System.out.println("\nSubtraction of Vectors: ");
        vector1.sub(vector2).getInfo();

        System.out.println("\n/////////////////////////////");
        Vector[] arrayVectors = Vector2D.createArrayOfVector(2);
        for( Vector vector : arrayVectors) {
            vector.getInfo();
            System.out.println();
        }
        System.out.println("/////////////////////////////");

        System.out.println("\n\n------------------------------------------------------------");
        System.out.println("\t\t3D Vectors\n");
        Vector vector3 = new Vector3D(2, 3, 4);
        Vector vector4 = new Vector3D(3, 4, 5);

        vector3.getInfo();
        vector4.getInfo();

        System.out.println("\nDot product: " + vector3.dotProduct(vector4));
        System.out.println("\nSum of Vectors: " );
        vector3.sum(vector4).getInfo();
        System.out.println("\nSubtraction of Vectors: ");
        vector3.sub(vector4).getInfo();

        System.out.println("\n/////////////////////////////");
        Vector[] arrayVectors3D = Vector3D.createArrayOfVector(2);
        for( Vector vector : arrayVectors3D) {
            vector.getInfo();
            System.out.println();
        }
        System.out.println("/////////////////////////////");
    }
}
