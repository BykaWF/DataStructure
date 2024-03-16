package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortPath {
    public static void main(String[] args) {
        int vertices = 3;
        int source = 0;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(vertices);
        for (int i = 0; i <= vertices; i++){
            graph.add(new ArrayList<>());
        }

        addNewEdge(graph,0,1);
        addNewEdge(graph,0,2);
        addNewEdge(graph,1,2);
        addNewEdge(graph,1,3);
        addNewEdge(graph,2,3);

        printShortPath(graph,vertices,source);
    }

    private static void printShortPath(ArrayList<ArrayList<Integer>> adj, int vertices, int source) {
        boolean[] visited = new boolean[vertices + 1];
        Queue<Integer> queue = new LinkedList<>();
        int[] distance = new int[vertices+ 1];
        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()){

            int edge = queue.poll();

            for(int v : adj.get(edge)){
                if(!visited[v]){
                    distance[v] = distance[edge] + 1;
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
        System.out.println(Arrays.toString(distance));
    }

    private static void addNewEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

}
