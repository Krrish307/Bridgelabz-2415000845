import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        double fee;
        double discountPercent;
        double discount;
        double finalFee;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Fee: ");
        fee = input.nextDouble();

        System.out.print("Enter University Discount (%): ");
        discountPercent = input.nextDouble();

        discount = (fee * discountPercent) / 100;
        finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
