package tree;


import java.util.LinkedList;
import java.util.Queue;

public class BalancedTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.right.right = new Node(60);

        /*
                10
              /    \
            20      30
           /  \     / \
           n   n   40  50
         */

//        boolean balanced = checkBalance(root);
//        System.out.println(balanced);

        System.out.println(isBalanced(root));
    }


    private static boolean checkBalance(Node curr) {
        if(curr == null) {
            return true;
        }

        int l = hight(curr.left);
        int r = hight(curr.right);

        return (Math.abs(l - r) <= 1 && checkBalance(curr.left) && checkBalance(curr.right));
    }

    private static int hight(Node curr) {
        if(curr == null) {
            return 0;
        }else {
            return Math.max(hight(curr.left),hight(curr.right)) + 1;
        }
    }

    private static int isBalanced(Node root){
        if(root == null) return 0;

        int left = isBalanced(root.left);
        if(left == -1) return -1;

        int right = isBalanced(root.right);
        if(right == -1) return -1;

        if(Math.abs(left - right) > 1) {
            return -1;
        }else {
            return Math.max(left,right) + 1;
        }

    }

}
