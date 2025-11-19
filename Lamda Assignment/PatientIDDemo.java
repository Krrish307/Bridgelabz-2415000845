import java.util.*;

public class PatientIDDemo {
    public static void main(String[] args) {
        List<Integer> patientIDs = Arrays.asList(101, 102, 103, 104);

        // Using method reference
        patientIDs.forEach(System.out::println);
    }
}
