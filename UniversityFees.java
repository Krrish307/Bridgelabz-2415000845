public class UniversityFees {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        int discount = (fee * discountPercent) / 100;

        int totalFee = fee - discount;
        System.out.println("Original fee : " + fee);
        System.out.println("discount : " + discount);
        System.out.println("Total fee : " + totalFee);
    }
}
