import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double base;
        double height;
        double areaInInches;
        double areaInCm;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base (in inches): ");
        base = input.nextDouble();

        System.out.print("Enter height (in inches): ");
        height = input.nextDouble();

        areaInInches = 0.5 * base * height;
        areaInCm = areaInInches * 6.4516;

        System.out.println("The area of the triangle in square inches is " + areaInInches +
                " and in square centimeters is " + areaInCm);
    }
}
