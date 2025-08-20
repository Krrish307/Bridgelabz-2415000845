import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        double km;
        double miles;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        miles = km / 1.6;

        System.out.println("Distance in miles: " + miles);
    }
}
