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
    static TreeNode prev;

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
        
        //comparing current node to prev node
        //through inorder walk
        if (root != null) {
            if (!isBinaryTree(root.getLeft()))
                return false;

            // Allows unique values valued nodes
            if (prev != null && root.getValue() <= prev.getValue())
                return false;

            prev = root;

            return isBinaryTree(root.getRight());
        }
        return true;
    }
}
