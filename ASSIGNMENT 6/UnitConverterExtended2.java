import java.util.Scanner;

public class UnitConverterExtended2 {
    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Extended Unit Converter (Temp, Weight, Volume)");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter value: ");
        double value = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + convertFahrenheitToCelsius(value) + " °C");
                break;
            case 2:
                System.out.println("Result: " + convertCelsiusToFahrenheit(value) + " °F");
                break;
            case 3:
                System.out.println("Result: " + convertPoundsToKilograms(value) + " kg");
                break;
            case 4:
                System.out.println("Result: " + convertKilogramsToPounds(value) + " pounds");
                break;
            case 5:
                System.out.println("Result: " + convertGallonsToLiters(value) + " liters");
                break;
            case 6:
                System.out.println("Result: " + convertLitersToGallons(value) + " gallons");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
