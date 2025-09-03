import java.util.Scanner;

public class StringCharComparison {

    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] chars1 = getChars(text);
        char[] chars2 = text.toCharArray();

        boolean comparison = compareCharArrays(chars1, chars2);

        System.out.println(chars1);
        System.out.println(chars2);
        System.out.println(comparison);

        sc.close();
    }
}
