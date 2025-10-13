import java.util.*;

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item: " + title + " by " + author + ", Loan Duration: " + getLoanDuration() + " days");
    }
}

interface Reservable {
    void reserveItem(String user);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    private String reservedBy;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() { return 14; }

    public void reserveItem(String user) {
        if (available) {
            available = false;
            reservedBy = user;
        }
    }

    public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() { return 7; }

    public void reserveItem(String user) { available = false; }

    public boolean checkAvailability() { return available; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() { return 5; }

    public void reserveItem(String user) { available = false; }

    public boolean checkAvailability() { return available; }
}

public class LibraryManagement {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book(1, "Java Basics", "James"));
        items.add(new Magazine(2, "Tech Today", "EditorX"));
        items.add(new DVD(3, "AI Revolution", "John"));
        for (LibraryItem i : items) {
            i.getItemDetails();
            ((Reservable) i).reserveItem("Krish");
            System.out.println("Available: " + ((Reservable) i).checkAvailability());
        }
    }
}
