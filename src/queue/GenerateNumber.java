package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNumber {
    public static void main(String[] args) {
        generateNumber(300);
    }

    private static void generateNumber(int n) {
        Queue<String> q = new ArrayDeque<>();

        q.offer("5");
        q.offer("6");

        for (int i = 0; i < n; i++) {
            String curr = q.peek();
            System.out.println(q.poll());
            q.offer(curr + "5");
            q.offer(curr + "6");
        }
    }
}
