package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UndirectedGraph {
    public static void main(String[] args) {
        int vertices = 8;
        int source = 0;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(vertices);
        for (int i = 0; i <= vertices; i++){
            graph.add(new ArrayList<>());
        }
        addNewEdge(graph, 0, 1);
        addNewEdge(graph, 0, 2);
        addNewEdge(graph, 1, 2);

        addNewEdge(graph, 3, 4);

        addNewEdge(graph, 5, 6);
        addNewEdge(graph, 5, 7);
        addNewEdge(graph, 7, 8);

//        printGraph(graph);

        BFSdis(graph, vertices);
    }

    private static void BFS(ArrayList<ArrayList<Integer>> graph, int vertices, int source, boolean[] visited) {
        visited[source] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while (!q.isEmpty()){
            int u = q.poll();
            System.out.print(u + " ");
            for ( int v  : graph.get(u)){
                if( !visited[v] ){
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }

    private static void BFSdis(ArrayList<ArrayList<Integer>> adj, int vertices){
        boolean[] visited = new boolean[vertices + 1];
        int count = 0;
        for (int i = 0; i < vertices; i++) {
            if(!visited[i]) {
                count++;
                BFS(adj, vertices, i, visited);
            }
        }
        System.out.println();
        System.out.println(count);
    }

    private static void printGraph(ArrayList<ArrayList<Integer>> graph) {

        for (int i = 0; i < graph.size(); i++){
            for (int j = 0; j < graph.get(i).size(); j++){
                System.out.print(graph.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }

    private static void addNewEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
}
