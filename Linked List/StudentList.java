class Node {
    int id;
    String name;
    Node next;

    Node(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentList {
    Node head;

    void insertAtBeginning(int id, String name) {
        Node newNode = new Node(id, name);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int id, String name) {
        Node newNode = new Node(id, name);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    void delete(int id) {
        if (head == null) return;

        if (head.id == id) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }

        if (temp.next != null) temp.next = temp.next.next;
    }

    void search(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Found: " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print("(" + temp.id + "," + temp.name + ") -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StudentList list = new StudentList();

        list.insertAtBeginning(1, "A");
        list.insertAtEnd(2, "B");
        list.insertAtEnd(3, "C");

        list.display();

        list.search(2);

        list.delete(2);

        list.display();
    }
}