import java.util.Scanner;

public class UnitConverter {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unit Converter");
        System.out.println("1. Km to Miles");
        System.out.println("2. Miles to Km");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter value: ");
        double value = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + convertKmToMiles(value) + " miles");
                break;
            case 2:
                System.out.println("Result: " + convertMilesToKm(value) + " km");
                break;
            case 3:
                System.out.println("Result: " + convertMetersToFeet(value) + " feet");
                break;
            case 4:
                System.out.println("Result: " + convertFeetToMeters(value) + " meters");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
