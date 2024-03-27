package graph;

import java.util.ArrayList;

public class KasarujuAlgo {
    public static void main(String[] args) {
        int vertices = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        addNewEdge(graph, 0, 2);
        addNewEdge(graph, 2, 1);
        addNewEdge(graph, 1, 0);
        addNewEdge(graph, 2, 3);
        addNewEdge(graph, 3, 4);
        addNewEdge(graph, 4, 3);

        strongestComp(graph,vertices);
    }

    private static void strongestComp(ArrayList<ArrayList<Integer>> graph, int vertices) {
        boolean[] visited = new boolean[vertices + 1];

        for (int i = 0; i < vertices; i++) {
            if(!visited[i]){
                dfs(graph,i,visited);
            }
        }
    }

    private static void dfs(ArrayList<ArrayList<Integer>> graph, int i, boolean[] visited) {
        visited[i] = true;
        System.out.print(i + " ");

        for(int v : graph.get(i)){

            if(!visited[v]){
                dfs(graph, v, visited);
            }
        }

        System.out.println();
    }

    private static void addNewEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
    }
}
