package bst;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    Node right, left;
    int key;

    public Node(int key) {
        this.key = key;
    }
}

public class Delete {

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        Node node = new Node(10);
        node.left = new Node(5);
        node.right = new Node(15);
        node.right.left = new Node(12);
        node.right.right = new Node(30);

//        delete(root, 50);
//        printRoot(root);
        Node floor = floor(node, 14);
        Node ceil = ceil(node, 40);
        System.out.println(floor.key);
        System.out.println(ceil);
    }

    /**
     *
     * @param node  our root from where we start searching
     * @param x  is target value
     * @return : Smallest greater value or null
     */
    private static Node ceil(Node node, int x) {
        Node curr = node;
        Node res = null;

        while (curr != null){
            if(curr.key == x){
                return curr;
            }else if(curr.key > x) {
                res = curr;
                curr = curr.left;
            }else {

                curr = curr.right;

            }
        }
        return res;
    }

    /**
     *
     * @param node  our root from where we start searching
     * @param x  is target value
     * @return : Greater smallest value or null
     * @Example : if we have 14, we will find 14 or less than but closet to 14 (10,12,13)
     */
    private static Node floor(Node node, int x) {
        Node curr = node;
        Node res = null;

        while (curr != null) {
            if(curr.key == x){
                return curr;
            }else if(curr.key > x) {
                curr = curr.left;
            }else {
                res = curr;
                curr = curr.right;

            }
        }
        return res;
    }


    private static Node delete(Node root, int x) {
        if (root == null) return null;


        if (root.key > x) {
            root.left = delete(root.left, x);
        } else if (root.key < x) {
            root.right = delete(root.right, x);
        } else {
            if (root.left == null) {
                return root.right;

            } else if (root.right == null) {
                return root.left;
            } else {

                Node closetValue = getCloset(root);
                root.key = closetValue.key;
                root.right = delete(root.right, closetValue.key);
            }
        }

        return root;
    }

    private static Node getCloset(Node root) {
        Node curr = root.right;

        while (curr != null && curr.left != null) {
            curr = curr.left;
        }

        return curr;
    }

    private static void printRoot(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        while (q.size() > 1) {
            Node curr = q.poll();

            if (curr == null) {
                System.out.println();
                q.offer(null);
                continue;
            }
            System.out.print(curr.key + " ");

            if (curr.left != null) {
                q.offer(curr.left);
            }

            if (curr.right != null) {
                q.offer(curr.right);
            }


        }


    }
}
