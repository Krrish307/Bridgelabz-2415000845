import java.util.*;

public class NetworkRouting {

    static Map<String, List<String>> graph = new HashMap<>();

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static boolean isConnected() {
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        String start = graph.keySet().iterator().next();
        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String curr = q.poll();
            for (String nei : graph.get(curr)) {
                if (!visited.contains(nei)) {
                    visited.add(nei);
                    q.add(nei);
                }
            }
        }
        return visited.size() == graph.size();
    }

    static List<String> shortestPath(String start, String end) {
        Map<String, String> parent = new HashMap<>();
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String curr = q.poll();
            if (curr.equals(end)) break;

            for (String nei : graph.get(curr)) {
                if (!visited.contains(nei)) {
                    visited.add(nei);
                    parent.put(nei, curr);
                    q.add(nei);
                }
            }
        }

        List<String> path = new ArrayList<>();
        String curr = end;
        while (curr != null) {
            path.add(curr);
            curr = parent.get(curr);
        }
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        addEdge("R1","R2");
        addEdge("R1","R3");
        addEdge("R2","R4");
        addEdge("R3","R4");
        addEdge("R4","R5");
        addEdge("R5","R6");

        System.out.println(isConnected());
        System.out.println(shortestPath("R1","R6"));
    }
}