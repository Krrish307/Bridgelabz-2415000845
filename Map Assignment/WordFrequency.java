import java.util.*;
public class WordFrequency {
    public static void main(String[] args) {

        String text = "Hello world, hello Java!";
        text = text.toLowerCase().replaceAll("[^a-z ]", "");

        String[] words = text.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }

        System.out.println(map);
    }
}
