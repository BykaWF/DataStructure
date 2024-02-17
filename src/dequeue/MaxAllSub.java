package dequeue;

import java.util.ArrayDeque;
import java.util.Random;

public class MaxAllSub {
    public static void main(String[] args) {
        int[] arr = {10, 8, 5, 12, 15, 7, 6};
        Random random = new Random();
        int k = random.nextInt(2, arr.length / 2);
        printMax(arr, 3);
    }

    private static void printMax(int[] arr, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]){
                deque.removeLast();
            }

            deque.offerLast(i);
        }


        for (int i = k; i < arr.length; i++) {
            // print front of the window
            System.out.print(arr[deque.peek()] + " ");

            while (!deque.isEmpty() && deque.peek() <= i -k){
                deque.removeFirst();
            }

            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]){
                deque.removeLast();
            }

            deque.offerLast(i);

        }

        System.out.print(arr[deque.peek()] + " "); // print max of the last window
    }
}
