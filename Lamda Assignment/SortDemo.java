import java.util.*;

class Product {
    String name;
    int price;
    int rating;

    Product(String n, int p, int r) {
        name = n;
        price = p;
        rating = r;
    }
}

public class SortDemo {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
            new Product("Shoes", 2000, 4),
            new Product("Watch", 1500, 5),
            new Product("Bag", 800, 3)
        );

        // Sort by Price
        list.sort((a, b) -> a.price - b.price);

        // Print
        list.forEach(p -> System.out.println(p.name + " - ₹" + p.price));
    }
}
