package task_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t===Homework #9. Task 2. Additional task===\n");
        //Task 2
        System.out.println("\t\tND Vectors\n");
        Vector vector1 = new Vector(new double[]{23, 45, 6, 949, 43}, "5D");
        Vector vector2 = new Vector(new double[]{46, 9, 20, 43, 345}, "5D");

        System.out.println(vector1 + "\n");
        System.out.println(vector2);

        System.out.println("\nDot product: " + vector1.dotProduct(vector2));
        System.out.println("\nSum of Vectors: " + vector1.sum(vector2));
        System.out.println("\nSubtraction of Vectors: " + vector1.sub(vector2));

        System.out.println("\n/////////////////////////////");
        Vector[] arrayVectors = Vector.createArrayOfVector(2);
        for( Vector vector : arrayVectors) {
            System.out.println(vector + "\n");
        }
        System.out.println("/////////////////////////////");
    }
}
