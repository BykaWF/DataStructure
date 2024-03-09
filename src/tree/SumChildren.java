package tree;

public class SumChildren {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.right.left = new Node(1);
        root.right.right = new Node(3);

        boolean b = hasSumProperty(root);
        System.out.println(b);
    }

    private static boolean hasSumProperty(Node root) {
        if(root == null) return true;

        if(root.right == null && root.left == null) return true;

        int sum = 0;

        if(root.left != null) {
            sum += root.left.key;
        }

        if(root.right != null){
            sum+= root.right.key;
        }

        return (root.key == sum && hasSumProperty(root.left) && hasSumProperty(root.right));
    }
}
