import java.util.Scanner;

public class UpperCaseConversion {

    public static String toUpperCaseCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareStringsCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text:");
        String input = sc.nextLine();

        String upperCustom = toUpperCaseCharAt(input);
        String upperBuiltIn = input.toUpperCase();

        boolean comparison = compareStringsCharAt(upperCustom, upperBuiltIn);

        System.out.println("Uppercase using charAt(): " + upperCustom);
        System.out.println("Uppercase using toUpperCase(): " + upperBuiltIn);
        System.out.println("Are both uppercase strings equal? " + comparison);

        sc.close();
    }
}
