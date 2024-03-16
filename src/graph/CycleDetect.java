package graph;

import java.util.ArrayList;

public class CycleDetect {
    public static void main(String[] args) {
        int vertices = 3;
        int source = 0;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(vertices);
        for (int i = 0; i <= vertices; i++) {
            graph.add(new ArrayList<>());
        }
        addNewEdge(graph, 0, 1);
        addNewEdge(graph, 1, 2);
        addNewEdge(graph, 2, 3);
        addNewEdge(graph, 3, 1);

        boolean dfs = dfs(graph, vertices, source);
        System.out.println(dfs);
    }

    private static boolean dfs(ArrayList<ArrayList<Integer>> adj, int vertices, int source) {
        boolean[] visited = new boolean[vertices + 1];
        for (int i = 0; i <= vertices; i++) {
            if (!visited[i]) {
                if (!DFSRec(adj, i, visited, -1)) return true;
            }
        }
        return false;
    }

    private static boolean DFSRec(ArrayList<ArrayList<Integer>> adj, int source, boolean[] visited, int parent) {
        visited[source] = true;

        for (int v : adj.get(source)) {
            if (!visited[v]) {
                DFSRec(adj, v, visited, source);
                return true;
            } else if (v != parent) {
                return true;
            }
        }

        return false;
    }

    private static void addNewEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
}
