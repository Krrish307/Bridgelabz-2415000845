import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        DatabaseManager db = new DatabaseManager();

        while (true) {
            System.out.println("\n--- Student Result Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Show All Students");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    Student s = new Student(id, name, marks);
                    list.add(s);
                    db.addStudent(s);
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("New Marks: ");
                    int newMarks = sc.nextInt();

                    Student us = new Student(uid, newName, newMarks);
                    db.updateStudent(us);
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    db.deleteStudent(did);
                    break;

                case 4:
                    db.showAll();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
