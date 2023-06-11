package hw8_2_task1;

public class Circle extends Rectangle{

    public Circle(double radius) {
        super(radius, radius);
    }

    public double getRadius() {
        return super.getSide1();
    }

    @Override
    public double getSquare() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String toString() {
        return "\nCircle {" +
                "\n\tradius = " + getRadius() +
                "\n\tperimenter = " + getPerimeter() +
                "\n\tsquare = " + getSquare() +
                "\n}";
    }
}
