public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call method to generate NullPointerException
        // generateException(); // Uncomment to see exception occur

        // Call method to handle NullPointerException
        handleException();
    }
}
