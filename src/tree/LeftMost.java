package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftMost {
    static int maxLevel = 0;
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.right.left = new Node(70);

        printLeftView(root);
    }

    private static void printLeftMost(Node root, int level) {
        if(root == null){
            return;
        }

        if(maxLevel < level){
            System.out.print(root.key + " ");
            maxLevel = level;
        }

        printLeftMost(root.left, level + 1);
        printLeftMost(root.right, level + 1);
    }

    private static void printLeftView(Node root){
        printLeftMost(root,1);
    }
}
