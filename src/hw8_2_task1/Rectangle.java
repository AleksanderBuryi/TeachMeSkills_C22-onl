package hw8_2_task1;

public class Rectangle extends Triangle {

    public Rectangle(double side1, double side2) {
        super(side1, side2, 0);
    }

    @Override
    public double getSide1() {
        return super.getSide1();
    }

    @Override
    public double getSide2() {
        return super.getSide2();
    }

    @Override
    public double getSquare() {
        return getSide1() * getSide2();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getSide1() + getSide2());
    }

    @Override
    public String toString() {
        return "Rectangle { " +
                "\n\tside1 = " + getSide1() +
                ", \n\tside2 = " + getSide2() +
                "\n\tperimenter = " + getPerimeter() +
                "\n\tsquare = " + getSquare() +
                "\n}";
    }
}
