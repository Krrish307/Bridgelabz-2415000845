import java.util.*;

public class SocialNetwork {

    static Map<String, List<String>> graph = new HashMap<>();

    // Add friendship (undirected)
    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    
    static void findFriends(String user) {
        System.out.println("Friends of " + user + ": " + graph.get(user));
    }

   
    static boolean isDirectlyConnected(String u, String v) {
        return graph.get(u).contains(v);
    }

    // Shortest path using BFS
    static int shortestPath(String start, String end) {
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String node = q.poll();

                if (node.equals(end)) return level;

                for (String neighbor : graph.get(node)) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        q.add(neighbor);
                    }
                }
            }
            level++;
        }
        return -1;
    }

    public static void main(String[] args) {

        // Input
        addEdge("Alice", "Bob");
        addEdge("Alice", "Charlie");
        addEdge("Bob", "David");
        addEdge("Charlie", "Eve");
        addEdge("David", "Eve");

        // Tasks
        findFriends("Alice");

        System.out.println("Bob & Eve direct? " +
                isDirectlyConnected("Bob", "Eve"));

        System.out.println("Shortest path Alice → Eve: " +
                shortestPath("Alice", "Eve"));
    }
}