public class profit {
    public static void main(String[] args) {
        double costPrice = 129.0;
        double sellingPrice = 191.0;
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit/costPrice * 100.0);

        System.out.println("The Cost price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + String.format("%.2f.",profitPercentage));
    }
}
