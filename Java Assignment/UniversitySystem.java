// Problem 5: University Management System
import java.util.*;

class Course {
    String courseName;
    Professor professor;
    List<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println(p.name + " is assigned to teach " + courseName);
    }

    void enrollStudent(Student s) {
        students.add(s);
        System.out.println(s.name + " enrolled in " + courseName);
    }

    void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.name : "None"));
        System.out.println("Students enrolled:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course c) {
        c.assignProfessor(this);
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        c.enrollStudent(this);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Sharma");
        Student s1 = new Student("Krish");
        Student s2 = new Student("Riya");

        Course c1 = new Course("Computer Science");
        prof1.assignCourse(c1);
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        c1.showCourseDetails();
    }
}
