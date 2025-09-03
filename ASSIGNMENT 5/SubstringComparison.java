import java.util.Scanner;

public class SubstringComparison {

    public static String substringCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
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

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String substring1 = substringCharAt(text, start, end);
        String substring2 = text.substring(start, end);

        boolean comparison = compareStringsCharAt(substring1, substring2);

        System.out.println(substring1);
        System.out.println(substring2);
        System.out.println(comparison);

        sc.close();
    }
}
