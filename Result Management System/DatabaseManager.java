import java.sql.*;

public class DatabaseManager {

    private Connection getConnection() throws Exception {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",          // <-- yaha apna username
                "yourpassword"   // <-- yaha apna password
        );
    }

    public void addStudent(Student s) {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO students VALUES(?, ?, ?)"
            );
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getMarks());
            ps.executeUpdate();
            System.out.println("✔ Student added to database.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void updateStudent(Student s) {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "UPDATE students SET name=?, marks=? WHERE id=?"
            );
            ps.setString(1, s.getName());
            ps.setInt(2, s.getMarks());
            ps.setInt(3, s.getId());
            ps.executeUpdate();
            System.out.println("✔ Student updated.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void deleteStudent(int id) {
        try (Connection con = getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM students WHERE id=?"
            );
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("✔ Student deleted.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void showAll() {
        try (Connection con = getConnection()) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " | " +
                        rs.getString(2) + " | " +
                        rs.getInt(3)
                );
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
