package task_2;

import java.util.Arrays;
import java.util.Random;

public class Vector {
    private double[] coordinates;
    private final String description;

    public Vector(double[] coordinates, String description) {
        this.coordinates = coordinates;
        this.description = description;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public String getDescription() {
        return description;
    }

    public double length() {
        int sum = 0;

        for (double coordinate : coordinates)
            sum += Math.pow(coordinate, 2);

        return Math.sqrt(sum);
    }

    public double dotProduct(Vector vector) {
        int lenNewCoordinates = Math.max(this.coordinates.length, vector.coordinates.length);
        double dot = 0;

        for (int i = 0; i < lenNewCoordinates; i++)
            dot += this.coordinates[i] * vector.coordinates[i];

        return dot;
    }

    public Vector sum(Vector vector) {
        if (this.coordinates.length != vector.coordinates.length)
            return this;

        double[] newVector = new double[coordinates.length];

        for (int i = 0; i < newVector.length; i++)
            newVector[i] = this.coordinates[i] + vector.coordinates[i];

        return new Vector(newVector, "Vector of sum");
    }

    public Vector sub(Vector vector) {
        if (this.coordinates.length != vector.coordinates.length)
            return this;

        double[] newVector = new double[coordinates.length];

        for (int i = 0; i < newVector.length; i++)
            newVector[i] = this.coordinates[i] - vector.coordinates[i];


        return new Vector(newVector, "Vector of subtraction");
    }

    public static Vector[] createArrayOfVector(int size) {
        Vector[] vectors = new Vector[size];
        Random rnd = new Random();

        for (int i = 0; i < vectors.length; i++) {
            double[] newVectorCoordinates = new double[size];

            for (int j = 0; j < newVectorCoordinates.length; j++) {
                newVectorCoordinates[j] = rnd.nextDouble() * 10;
            }

            vectors[i] = new Vector(newVectorCoordinates, "New vector in array");
        }

        return vectors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Vector)) {
            return false;
        }

        Vector vector = (Vector) o;
        for (int i = 0; i < this.coordinates.length; i++) {
            if (this.coordinates[i] != vector.coordinates[i])
                return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return this.description + "\nCoordinates: " + Arrays.toString(this.coordinates)
                + "\nlength " + length();
    }
}
