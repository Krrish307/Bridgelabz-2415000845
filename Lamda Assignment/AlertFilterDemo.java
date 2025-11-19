import java.util.*;
import java.util.function.Predicate;

public class AlertFilterDemo {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList(
            "Critical: ICU patient low BP",
            "Normal: Patient medicine update",
            "Critical: Oxygen low",
            "Info: New patient admitted"
        );

        // Predicate: Allow only critical alerts
        Predicate<String> onlyCritical = msg -> msg.startsWith("Critical");

        alerts.stream()
              .filter(onlyCritical)
              .forEach(System.out::println);
    }
}
