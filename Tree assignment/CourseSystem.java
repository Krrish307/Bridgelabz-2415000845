import java.util.*;

public class CourseSystem {

    static Map<String, List<String>> graph = new HashMap<>();

    // Add prerequisite (A -> B means A before B)
    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
    }

    // Cycle detection using DFS
    static boolean hasCycleUtil(String node, Set<String> visited, Set<String> recStack) {
        visited.add(node);
        recStack.add(node);

        for (String neighbor : graph.get(node)) {
            if (!visited.contains(neighbor)) {
                if (hasCycleUtil(neighbor, visited, recStack))
                    return true;
            } else if (recStack.contains(neighbor)) {
                return true;
            }
        }

        recStack.remove(node);
        return false;
    }

    static boolean hasCycle() {
        Set<String> visited = new HashSet<>();
        Set<String> recStack = new HashSet<>();

        for (String node : graph.keySet()) {
            if (!visited.contains(node)) {
                if (hasCycleUtil(node, visited, recStack))
                    return true;
            }
        }
        return false;
    }

    // Find all prerequisites using DFS
    static void findPrerequisites(String course, Set<String> visited) {
        for (String pre : graph.keySet()) {
            if (graph.get(pre).contains(course) && !visited.contains(pre)) {
                visited.add(pre);
                findPrerequisites(pre, visited);
            }
        }
    }

    // Topological Sort (Kahn's Algorithm)
    static void topologicalSort() {
        Map<String, Integer> indegree = new HashMap<>();

        for (String node : graph.keySet()) {
            indegree.put(node, 0);
        }

        for (String node : graph.keySet()) {
            for (String neighbor : graph.get(node)) {
                indegree.put(neighbor, indegree.get(neighbor) + 1);
            }
        }

        Queue<String> q = new LinkedList<>();

        for (String node : indegree.keySet()) {
            if (indegree.get(node) == 0) {
                q.add(node);
            }
        }

        System.out.print("Topological Order: ");
        while (!q.isEmpty()) {
            String curr = q.poll();
            System.out.print(curr + " ");

            for (String neighbor : graph.get(curr)) {
                indegree.put(neighbor, indegree.get(neighbor) - 1);
                if (indegree.get(neighbor) == 0) {
                    q.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        // Input
        addEdge("CS101", "CS102");
        addEdge("CS101", "CS201");
        addEdge("CS102", "CS202");
        addEdge("MATH101", "CS201");

        // Cycle check
        System.out.println("Cycle present? " + hasCycle());

        // Find prerequisites of CS202
        Set<String> prereq = new HashSet<>();
        findPrerequisites("CS202", prereq);
        System.out.println("Prerequisites for CS202: " + prereq);

        // Topological order
        topologicalSort();
    }
}