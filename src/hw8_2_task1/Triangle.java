package hw8_2_task1;

public class Triangle extends Figure{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double getSquare() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "\nTriangle { " +
                "\n\tside1 = " + side1 +
                ", \n\tside2 = " + side2 +
                ", \n\tside3 = " + side3 +
                "\n\tperimenter = " + getPerimeter() +
                "\n\tsquare = " + getSquare() +
                "\n}";
    }
}
