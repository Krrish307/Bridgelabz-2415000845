import java.util.*;

class Invoice {
    int id;

    Invoice(int id) {
        this.id = id;
    }
}

public class InvoiceDemo {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(11, 22, 33);

        // constructor reference: Invoice::new
        List<Invoice> invoices = ids.stream()
                                    .map(Invoice::new)
                                    .toList();

        invoices.forEach(i -> System.out.println("Invoice created for ID: " + i.id));
    }
}
