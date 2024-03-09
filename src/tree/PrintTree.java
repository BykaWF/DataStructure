package tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.right.left = new Node(70);

        printRoot(root);
    }

    private static void printRoot(Node root) {
       if(root == null) return;

       Queue<Node> q = new LinkedList<>();
       q.offer(root);
       q.offer(null);

       while (q.size() > 1){
           Node curr = q.poll();

           if(curr == null){
               System.out.println();
               q.offer(null);
               continue;
           }
           System.out.print(curr.key + " ");

           if(curr.left != null){
               q.offer(curr.left);
           }

           if(curr.right != null){
               q.offer(curr.right);
           }


       }


    }


}
