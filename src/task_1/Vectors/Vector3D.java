package task_1.Vectors;

import java.util.Random;

public class Vector3D extends Vector{
    private final String description;

    public Vector3D(double x, double y, double z) {
        super(x,y, z);
        description = "This is a vector for a 3D coordinate system.";
    }

    public static Vector[] createArrayOfVector(int size) {
        Vector[] array = new Vector3D[size];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = new Vector3D(rnd.nextDouble() * 10, rnd.nextDouble() * 10, rnd.nextDouble() * 10);

        return array;
    }


    @Override
    public Vector sum(Vector b) {
        return new Vector3D(this.getX() + b.getX(), this.getY() + b.getY(), this.getZ() + b.getZ());
    }

    @Override
    public Vector sub(Vector b) {
        return new Vector3D(this.getX() - b.getX(), this.getY() - b.getY(), this.getZ() - b.getZ());
    }

    @Override
    public void getInfo() {
        System.out.println(
                description +
                        "\nx: " + this.getX() +
                        " \ty: " + this.getY() +
                        " \tz: " + this.getZ() +
                        "\nlength: " + length()
        );
    }
}
