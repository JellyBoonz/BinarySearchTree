import com.sun.source.tree.Tree;

import static java.lang.Thread.sleep;

class TreeNode{
    private TreeNode right;
    private TreeNode left;
    private int value;

    TreeNode(){}

    TreeNode(int value){
        this.value = value;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class BinaryTree {
    TreeNode root;

    BinaryTree(int value){
        root = new TreeNode(value);
    }

    public void inOrderTreeWalk(TreeNode root) {
        if(root != null) {
            inOrderTreeWalk(root.getLeft());
            System.out.print(root.getValue() + " ");
            inOrderTreeWalk(root.getRight());
        }
    }

    public void preorderTreeWalk(TreeNode root) {
        if(root != null){
            System.out.print(root.getValue() + " ");
            preorderTreeWalk(root.getLeft());
            preorderTreeWalk(root.getRight());
        }
    }

    public void postorderTreeWalk(TreeNode root) {
        if(root != null){
            postorderTreeWalk(root.getLeft());
            postorderTreeWalk(root.getRight());
            System.out.print(root.getValue() + " ");
        }
    }

    public TreeNode addTreeNode(TreeNode node, int value) {
        if(node == null){
            return new TreeNode(value);
        }

        //Adding node to the right subtree if > right child
        if(value > node.getValue()){
            node.setRight(addTreeNode(node.getRight(), value));
        }
        //Adding node to left subtree if <= left subtree
        else{
            node.setLeft(addTreeNode(node.getLeft(), value));
        }

        return node;
    }

    public void add(int value){
        root = addTreeNode(root, value);
    }

    public boolean isBinaryTree(TreeNode root){
        if (root == null)
            return true;

        if (root.getLeft() != null && root.getValue() < root.getLeft().getValue())
            return false;

        if (root.getRight() != null && root.getValue() > root.getRight().getValue())
            return false;

        if(!isBinaryTree(root.getLeft()) || !isBinaryTree(root.getRight()))
            return false;
        
        return true;
    }
}
