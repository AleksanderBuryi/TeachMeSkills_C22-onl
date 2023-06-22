package task_1.Vectors;

import task_1.Interfaces.IVector;

import java.util.Random;

public abstract class Vector implements IVector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double length() {
        return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2) + Math.pow(this.getZ(), 2));
    }

    @Override
    public double dotProduct(Vector b) {
        return (this.getX() * b.getX() + this.getY() * b.getY() + this.getZ() * b.getZ());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Vector)) {
            return false;
        }
        Vector vector = (Vector) o;
        return this.getX() == vector.getX() && this.getY() == vector.getY() && this.getZ() == vector.getZ() ;
    }

}
