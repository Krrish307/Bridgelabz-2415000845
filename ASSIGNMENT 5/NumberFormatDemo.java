import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String text) {
        int number = Integer.parseInt(text); // This will throw NumberFormatException if text is not a valid integer
        System.out.println("Number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Uncomment the next line to see the runtime exception occur
        // generateException(input);

        handleException(input);

        sc.close();
    }
}
