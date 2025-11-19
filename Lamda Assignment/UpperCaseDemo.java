import java.util.*;

public class UpperCaseDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("krish", "amit", "john");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
