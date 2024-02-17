package tree;
class Node{
    Node right;
    Node left;
    int key;

    public Node(int key){
        this.key = key;
    }
}
public class InorderTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        printInorder(root);
    }

    private static void printInorder(Node root) {
        if(root != null){
            printInorder(root.left);
            System.out.print(root.key + " "); // first left part then right
            printInorder(root.right);
        }
    }


}
