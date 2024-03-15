package graph;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        int vertices = 7;
        int source = 0;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(vertices);
        for (int i = 0; i <= vertices; i++){
            graph.add(new ArrayList<>());
        }
        addNewEdge(graph, 0, 1);
        addNewEdge(graph, 0, 4);
        addNewEdge(graph, 1, 2);
        addNewEdge(graph, 2, 3);
        addNewEdge(graph, 4, 5);
        addNewEdge(graph, 4, 6);
        addNewEdge(graph, 5, 6);

        dfs(graph, vertices, source);


    }

    private static void dfs(ArrayList<ArrayList<Integer>> graph, int vertices, int source) {
        boolean[] visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            if(!visited[i])
                DFSRec(graph,source,visited);
        }
    }

    private static void DFSRec(ArrayList<ArrayList<Integer>> graph, int source, boolean[] visited) {
        visited[source] = true;
        System.out.print(source + " ");
        for (int v : graph.get(source))
            if(!visited[v])
                DFSRec(graph,v,visited);
    }

    private static void addNewEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
}
