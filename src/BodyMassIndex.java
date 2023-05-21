import java.util.Scanner;

public class BodyMassIndex {

    public static void showBMI() {
        int _height = PersonalData.askHeight();
        double _weight = PersonalData.askWeight();

        System.out.println("Height: " + _height +
                ", Weight: " + _weight);
        System.out.println("BMI: " + String.format("%.1f",calculateBMI(_height, _weight)) + " kg/m^2");
    }

    public static double calculateBMI(int _height, double _weight) {
        return _weight/Math.pow(_height * 0.01, 2);
    }
}
