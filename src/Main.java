import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t===Main Task===");
        //Task 1
        System.out.println("Task 1");
        int [][][] array1 = create3DRandomArray(2,2,3);
        System.out.println(Arrays.deepToString(array1));
        increaseValuesOf3DArray(array1);

        //Task 2
        System.out.println("Task 2");
        drawChessBoard();

        System.out.println("\n\t\t===Additional Task===");
        //Task 3
        System.out.println("Task 3");
        int[][] matrix1 = create2DRandomArray(3, 3);
        int[][] matrix2 = create2DRandomArray(3, 3);
/*        //matrices from example
        int[][] matrix1 = {{1,0,0,0},{0,1,0,0}, {0,0,0,0}};
        int[][] matrix2 = {{1,2,3}, {1,1,1}, {0,0,0}, {2,1,0}};
*/
        System.out.println("First matrix: ");
        showMatrix(matrix1);
        System.out.println("Second matrix: ");
        showMatrix(matrix2);
        System.out.println("Result: ");
        showMatrix(multiply(matrix1, matrix2));

        //Task 4
        System.out.println("\nTask 4");
        int[][] array4 = create2DRandomArray(3, 4);
        showMatrix(array4);
        System.out.println("Sum of all array elements: " + sumAllValuesOfArray(array4));

        //Task 5
        System.out.println("\nTask 5");
        int[][] array5 = create2DRandomArray(3, 3);
        showMatrix(array5);
        showMatrixDiagonal(array5);

        //Task 6
        System.out.println("\nTask 6");
        int[][] array6 = create2DRandomArray(3,3);
        showMatrix(array6);
        sortMatrix(array6);
        System.out.println();
        showMatrix(array6);

    }

    public static Scanner cin(){
        return new Scanner(System.in);
    }

    public static int[] createRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(0 + Math.random() * 10);
        }

        return array;
    }

    public static int[][] create2DRandomArray(int size1, int size2) {
        int[][] array = new int[size1][size2];

        for (int i = 0; i < size1; i++) {
            array[i] = createRandomArray(size2);
        }

        return array;
    }

    public static int[][][] create3DRandomArray(int size1, int size2, int size3) {
        int[][][] newArray = new int[size1][size2][size3];

        for (int i = 0; i < size1; i++){
            for (int j = 0; j < size2; j++){
                    newArray[i][j] = createRandomArray(size3);
            }
        }

        return newArray;
    }

    public static void increaseValuesOf3DArray(int [][][] array) {
        System.out.print("Please, enter a value to increase array elements: ");
        int number = cin().nextInt();

        for (int[][] arrayMiddle: array){
            for (int[] arrayInternal: arrayMiddle) {
                for (int item: arrayInternal) {
                    System.out.print((item + number) + " ");
                }
                System.out.print("\t");
            }
            System.out.println("\n");
        }
    }

    public static void drawChessBoard() {
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0)
                    chessBoard[i][j] = "W";
                else
                    chessBoard[i][j] = "B";
            }
        }

        showMatrix(chessBoard);
    }

    public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        int[][] matrixM = new int[matrixA.length][matrixB[0].length];
        for (int i = 0; i < matrixM.length; i++) {
            for (int j = 0; j < matrixM[i].length; j++) {
                matrixM[i][j] = 0;
                for (int k = 0; k < matrixA[i].length; k++) {
                    matrixM[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return matrixM;
    }

    public static int sumAllValuesOfArray(int[][] array) {
        int sum = 0;
        for (int[] rows : array) {
            for (int el : rows) {
                sum += el;
            }
        }
        return sum;
    }

    public static void showMatrixDiagonal(int[][] array) {
        int size = Math.min(array.length, array[0].length);
        int[] mainDiagonal = new int[size];
        for (int i = 0, k = 0; i < size; i++) {
                mainDiagonal[k++] = array[i][i];
        }
        System.out.println("Main diagonal of the array: " + Arrays.toString(mainDiagonal));

        int[] sideDiagonal = new int[size];
        if (array.length > array[0].length) {
            for (int i = size, k = 0; i > 0; i--) {
                sideDiagonal[k++] = array[i][size - i];
            }
        } else {
            for (int i = size - 1, k = 0; i >= 0; i--) {
                sideDiagonal[k++] = array[i][size - 1 - i];
            }
        }
        System.out.println("Side diagonal of the array: " + Arrays.toString(sideDiagonal));
    }

// sort all matrix elements
//    public static void sortFullMatrix(int[][] matrix) {
//        int[] fullTempArray = new int[matrix.length * matrix[0].length];
//        for (int i = 0, k = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                fullTempArray[k++] = matrix[i][j];
//            }
//        }
//        Arrays.sort(fullTempArray);
//
//        for (int i = 0, k = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = fullTempArray[k++];
//            }
//        }
//    }

    public static void sortMatrix(int[][] matrix) {
        for (int[] rows : matrix) {
            Arrays.sort(rows);
        }
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void showMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}

