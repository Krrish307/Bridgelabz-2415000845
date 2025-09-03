import java.util.Scanner;

public class LowerCaseConversion {

    public static String toLowerCaseCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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

        String lowerCustom = toLowerCaseCharAt(input);
        String lowerBuiltIn = input.toLowerCase();

        boolean comparison = compareStringsCharAt(lowerCustom, lowerBuiltIn);

        System.out.println("Lowercase using charAt(): " + lowerCustom);
        System.out.println("Lowercase using toLowerCase(): " + lowerBuiltIn);
        System.out.println("Are both lowercase strings equal? " + comparison);

        sc.close();
    }
}
