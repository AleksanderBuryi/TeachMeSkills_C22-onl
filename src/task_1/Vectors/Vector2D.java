package task_1.Vectors;

import java.util.Random;

public class Vector2D extends Vector {
    private final String description;

    public Vector2D(double x, double y) {
        super(x,y);
        description = "This is a vector for a 2D coordinate system.";
    }

    public static Vector[] createArrayOfVector(int size) {
        Vector[] array = new Vector2D[size];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = new Vector2D(rnd.nextDouble() * 10, rnd.nextDouble() * 10);

        return array;
    }


    @Override
    public Vector sum(Vector b) {
        return new Vector2D(this.getX() + b.getX(), this.getY() + b.getY());
    }

    @Override
    public Vector sub(Vector b) {
        return new Vector2D(this.getX() - b.getX(), this.getY() - b.getY());
    }

    @Override
    public void getInfo() {
        System.out.println(
                description +
                        "\nx: " + this.getX() +
                        " \ty: " + this.getY() +
                        "\nlength: " + length()
        );
    }
}
