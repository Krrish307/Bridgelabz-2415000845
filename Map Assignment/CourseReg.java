import java.util.*;

public class CourseReg {
    public static void main(String[] args) {

        HashMap<String, Integer> courses = new HashMap<>();

        courses.put("CS101", 45);
        courses.put("CS102", 10);
        courses.put("MA101", 4);
        courses.put("PHY201", 55);
        courses.put("EE103", 2);

        courses.put("CS101", courses.get("CS101") + 3);
        courses.put("MA101", courses.get("MA101") - 2);
        if (courses.get("MA101") < 0) courses.put("MA101", 0);

        System.out.println("Near full (>=50):");
        for (String c : courses.keySet()) {
            if (courses.get(c) >= 50) {
                System.out.println(c + " : " + courses.get(c));
            }
        }

        System.out.println("\nUnder-subscribed (<5):");
        for (String c : courses.keySet()) {
            if (courses.get(c) < 5) {
                System.out.println(c + " : " + courses.get(c));
            }
        }
    }
}
