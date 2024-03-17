package graph;

import java.util.ArrayList;

public class DirectedCycle {
    public static void main(String[] args) {
        int vertices = 4;
        int source = 0;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        addNewEdge(graph, 0, 1);
        addNewEdge(graph, 1, 2);
        addNewEdge(graph, 2, 3);
        addNewEdge(graph, 3, 1);

        boolean hasCycle = hasCycleGraph(graph, vertices);
        System.out.println(hasCycle);
    }

    private static boolean hasCycleGraph(ArrayList<ArrayList<Integer>> graph, int vertices) {
        boolean[] visited = new boolean[vertices];
        boolean[] recursionStack = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (DFSRec(graph, i, visited, recursionStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean DFSRec(ArrayList<ArrayList<Integer>> graph, int s, boolean[] visited, boolean[] recStack) {
        visited[s] = true;
        recStack[s] = true;

        for (int v : graph.get(s)) {
            if (!visited[v]) {
                if (DFSRec(graph, v, visited, recStack)) {
                    return true;
                }
            } else if (recStack[v]) {
                return true;
            }
        }

        recStack[s] = false;
        return false;
    }

    private static void addNewEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
    }
}
