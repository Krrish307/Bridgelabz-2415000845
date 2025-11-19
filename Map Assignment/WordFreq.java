import java.util.*;

public class WordFreq {
    public static void main(String[] args) {

        String sentence = "Java is fun and Java is powerful";

        sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");

        String[] words = sentence.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
