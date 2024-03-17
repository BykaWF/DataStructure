package bst;

import com.sun.source.tree.Tree;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int key;
    int lCount;

    public TreeNode(int key){
        this.key = key;
    }

    public TreeNode(){

    }

    TreeNode insert(TreeNode root, int x){
        if(root == null) return new TreeNode(x);

        if(root.key > x){
            root.left = insert(root.left,x);
            root.lCount++;
        }else {
            root.right = insert(root.right,x);
        }

        return root;
    }

    TreeNode kthSmallest(TreeNode root, int k){
        if(root == null) return null;

        int count = root.lCount + 1;
        if(count == k){
            return root;
        }
        if(count > k){
            return kthSmallest(root.left, k);
        }else { // count < k ( go to the right )
            return kthSmallest(root.right, k - count); // subtract left part
        }
    }

    void printByLevel(TreeNode node){
        if(node == null) return;

        printByLevel(node.left);
        System.out.println(node.key + " lCount: " + node.lCount );
        printByLevel(node.right);
    }
}
public class MyTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.insert(root,5);
        root.insert(root,4);
        root.insert(root,6);
        root.insert(root,14);
        root.insert(root,13);
        root.printByLevel(root);
        TreeNode treeNode = root.kthSmallest(root, 6);
        System.out.println(treeNode.key);
    }
}
