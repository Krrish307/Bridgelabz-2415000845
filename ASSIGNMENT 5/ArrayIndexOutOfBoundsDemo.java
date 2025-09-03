import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // Accessing index beyond array length
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];

        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // Uncomment the next line to see the runtime exception occur
        // generateException(names);

        handleException(names);

        sc.close();
    }
}
