import java.util.*;

class CityRoad {
    static class Edge {
        String dest;
        int weight;
        Edge(String d, int w) {
            dest = d;
            weight = w;
        }
    }

    static Map<String, List<Edge>> graph = new HashMap<>();

    static void addEdge(String u, String v, int w, boolean twoWay) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(new Edge(v, w));
        if (twoWay) graph.get(v).add(new Edge(u, w));
    }

    static int bfs(String start, String end) {
        Queue<String> q = new LinkedList<>();
        Map<String, Integer> dist = new HashMap<>();

        q.add(start);
        dist.put(start, 0);

        while (!q.isEmpty()) {
            String curr = q.poll();
            if (curr.equals(end)) return dist.get(curr);

            for (Edge e : graph.get(curr)) {
                if (!dist.containsKey(e.dest)) {
                    dist.put(e.dest, dist.get(curr) + 1);
                    q.add(e.dest);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        addEdge("A","B",5,true);
        addEdge("B","C",3,true);
        addEdge("A","D",7,true);
        addEdge("D","E",2,false);
        addEdge("C","E",4,false);

        System.out.println(bfs("A","E"));
    }
}