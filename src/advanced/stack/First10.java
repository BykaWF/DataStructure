package advanced.stack;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class First10 {
    public static void main(String[] args) {
        int n = 100;
        printFirstN(n);
    }

    static void printFirstN(int n){
        Queue<String> q = new LinkedList<>();
        q.offer("5");
        q.offer("6");

        for (int i = 1; i < n; i++){
            String cur = q.poll();
            System.out.print(cur + " ");
            q.offer(cur + "5");
            q.offer(cur + "6");
        }

    }
}
