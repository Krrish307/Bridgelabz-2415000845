import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double number1;
        double number2;
        double add;
        double sub;
        double mul;
        double div;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        add = number1 + number2;
        sub = number1 - number2;
        mul = number1 * number2;
        div = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
    }
}
