package PRAASSESMENT2.SOALTYPED2;

import java.util.*;

public class DitaTripPlanner {
    private Map<String, List<String>> cityMap;

    public DitaTripPlanner() {
        cityMap = new HashMap<>();
        setupCities();
    }

    private void setupCities() {
        addEdge("London", "Salisbury");
        addEdge("London", "Bristol");
        addEdge("London", "Birmingham");
        addEdge("Bristol", "Cardiff");
        addEdge("Birmingham", "Manchester");
        addEdge("Manchester", "Liverpool");
        addEdge("Liverpool", "Kingston");
        addEdge("Manchester", "Newcastle");
        addEdge("Newcastle", "Edinburgh");
        addEdge("Edinburgh", "Glasgow");
    }

    private void addEdge(String from, String to) {
        cityMap.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
        cityMap.computeIfAbsent(to, k -> new ArrayList<>()).add(from);
    }

    public void bfsTraversal(String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);

        System.out.println("Kunjungan berdasarkan kota terdekat terlebih dahulu (BFS):");
        while (!queue.isEmpty()) {
            String city = queue.poll();
            if (!visited.contains(city)) {
                visited.add(city);
                System.out.println(city);
                for (String neighbor : cityMap.getOrDefault(city, new ArrayList<>())) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                    }
                }
            }
        }
    }

    public void dfsTraversal(String start) {
        Set<String> visited = new HashSet<>();
        System.out.println("\nKunjungan menyusuri kota yang menjauh dari London (DFS):");
        dfsHelper(start, visited);
    }

    private void dfsHelper(String city, Set<String> visited) {
        visited.add(city);
        System.out.println(city);
        for (String neighbor : cityMap.getOrDefault(city, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        DitaTripPlanner planner = new DitaTripPlanner();
        planner.bfsTraversal("London");
        planner.dfsTraversal("London");
    }
}

