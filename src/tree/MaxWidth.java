package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(22);
        root.left.right = new Node(32);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.right.right = new Node(60);
          /*
                10
              /    \
            20      30
           /  \     / \
          22   32   40  50

          O/p : 4
         */

        int i = maxWidth(root);
        System.out.println(i);
    }

    private static int maxWidth(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        q.offer(null); // it will be indicator of level end

        int width = Integer.MIN_VALUE;
        int count = 0;
        while (q.size() > 1){
            Node curr = q.poll();

            if(curr == null){
                width = Math.max(width, count);
                count = 0;
                q.offer(null);
                continue;
            }

            count++;


            if(curr.left != null) q.offer(curr.left);
            if(curr.right != null) q.offer(curr.right);
        }

        return width;
    }
}
