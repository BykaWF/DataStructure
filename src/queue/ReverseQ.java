package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseQ {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);

        reverse(q);
    }

    private static void reverse(Queue<Integer> q) {
        if(q.isEmpty()){
            return;
        }
        int x = q.peek();
        q.poll();
        reverse(q);

        q.offer(x);
    }
}
