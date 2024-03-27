package greedy;

import java.util.*;

class Node{
    Node right;
    Node left;
    int frequency;
    char character;

    public Node(int frq, char character, Node left, Node right){
        this.frequency = frq;
        this.character = character;
        this.left = left;
        this.right = right;
    }

}
public class HuffmanCode {
    public static void main(String[] args) {

        int[] freq = {30,40,60,80};
        char[] arr = {'a','d','f','e'};

        printH(arr,freq);



    }

    private static void printH(char[] arr, int[] freq) {
        PriorityQueue<Node>  pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.frequency));

        for (int i = 0; i < arr.length; i++) {
            pq.add(new Node(freq[i],arr[i],null,null));
        }

        while (pq.size() > 1){

            Node left = pq.poll();
            Node right = pq.poll();

            pq.add(new Node(left.frequency + right.frequency, '$', left,right));
        }

        printPQRec(pq.peek(), " ");
    }

    private static void printPQRec(Node root, String space) {
        if(root.character != '$'){
            System.out.println(root.character + ":" + space);
            return;
        }

        printPQRec(root.left, space + "0");
        printPQRec(root.right, space + "1");

    }
}
