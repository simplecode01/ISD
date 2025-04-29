package TUGAS8;


import java.util.*;

public class Graph {
    private final Map<Character, List<Character>> graph;

    public Graph() {
        graph = new HashMap<>();
        buildGraph();
    }

    private void buildGraph() {
        addEdge('A', 'B');
        addEdge('A', 'C');
        addEdge('A', 'H');
        addEdge('B', 'D');
        addEdge('C', 'G');
        addEdge('D', 'E');
        addEdge('E', 'F');
        addEdge('F', 'G');
    }

    private void addEdge(char from, char to) {
        graph.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
        graph.computeIfAbsent(to, k -> new ArrayList<>()).add(from); // karena tidak berarah
    }

    public void dfs(char start) {
        Set<Character> visited = new HashSet<>();
        System.out.print("DFS: ");
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(char current, Set<Character> visited) {
        visited.add(current);
        System.out.print(current + " ");

        List<Character> neighbors = graph.getOrDefault(current, new ArrayList<>());
        for (char neighbor : neighbors) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    public void bfs(char start) {
        Set<Character> visited = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        System.out.print("BFS: ");
        while (!queue.isEmpty()) {
            char current = queue.poll();
            System.out.print(current + " ");

            List<Character> neighbors = graph.getOrDefault(current, new ArrayList<>());
            for (char neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

}
