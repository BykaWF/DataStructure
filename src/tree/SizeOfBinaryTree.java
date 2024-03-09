package tree;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.right.left = new Node(70);

//        System.out.println(size(root));
//
//        System.out.println(size2(root));
        System.out.println(maxBT(root));

    }

    private static int size(Node root) {
        if(root == null){
            return -1;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int res = 0;
        while (!q.isEmpty()){
            Node curr = q.poll();

            res = Math.max(res, curr.key);

            if(curr.left != null){
                q.offer(curr.left);
            }

            if(curr.right != null){
                q.offer(curr.right);
            }

        }
            return res;
    }

    private static int size2(Node root){
        if(root == null){
            return 0;
        }

        return 1 + size2(root.left) + size2(root.right);
    }

    private static int maxBT(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }


        return Math.max(root.key, Math.max(maxBT(root.left),maxBT(root.right)));

    }

}
