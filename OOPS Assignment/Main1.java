class Book {
    String title;
    String author;
    double price;

    void setDetails(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setDetails("Java Basics", "James Gosling", 500);
        b.showDetails();
    }
}
