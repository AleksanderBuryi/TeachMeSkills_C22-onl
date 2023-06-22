package task_1.Interfaces;

import task_1.Vectors.Vector;

public interface IVector {
    double length();

    double dotProduct(Vector b);

    Vector sum(Vector b);

    Vector sub(Vector b);

    boolean equals(Object o);

    void getInfo();
}
