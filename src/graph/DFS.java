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

    private static void dfs(ArrayList<ArrayList<Integer>> adjacencyList, int vertices, int source) {
        boolean[] visited = new boolean[vertices];
        int count = 0;
        for (int i = 0; i < vertices; i++) {
            if(!visited[i]) {
                count++;
                DFSRec(adjacencyList, source, visited);
            }
        }
        System.out.println();
        System.out.println(count);
    }

    private static void DFSRec(ArrayList<ArrayList<Integer>> adjacencyList, int source, boolean[] visited) {
        visited[source] = true;
        System.out.print(source + " ");
        for (int v : adjacencyList.get(source))
            if(!visited[v])
                DFSRec(adjacencyList,v,visited);
    }

    private static void addNewEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
}
