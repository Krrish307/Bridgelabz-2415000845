// Problem 4: E-commerce Platform with Orders, Customers, and Products

import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product: " + name + ", Price: ₹" + price);
    }
}

class Order {
    int orderId;
    List<Product> products = new ArrayList<>();
    Customer customer;

    Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Customer: " + customer.name);
        System.out.println("Products in Order:");
        for (Product p : products) {
            p.displayProduct();
        }
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed an order with ID: " + o.orderId);
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer("Krish");

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Headphones", 2000);
        Product p3 = new Product("Mouse", 800);

        Order o1 = new Order(101, c1);
        o1.addProduct(p1);
        o1.addProduct(p2);
        o1.addProduct(p3);

        c1.placeOrder(o1);
        o1.showOrderDetails();
    }
}
