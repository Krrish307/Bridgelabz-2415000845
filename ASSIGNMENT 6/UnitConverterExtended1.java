import java.util.Scanner;

public class UnitConverterExtended1 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Extended Unit Converter (Yards, Inches, etc.)");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter value: ");
        double value = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + convertYardsToFeet(value) + " feet");
                break;
            case 2:
                System.out.println("Result: " + convertFeetToYards(value) + " yards");
                break;
            case 3:
                System.out.println("Result: " + convertMetersToInches(value) + " inches");
                break;
            case 4:
                System.out.println("Result: " + convertInchesToMeters(value) + " meters");
                break;
            case 5:
                System.out.println("Result: " + convertInchesToCentimeters(value) + " cm");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
