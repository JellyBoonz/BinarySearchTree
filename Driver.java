public class Driver {
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree(7);
        BinaryTree notBST = new BinaryTree(8);

        System.out.println();

        //Adding to binary tree
        myTree.root.setRight(new TreeNode(10));
        myTree.root.getRight().setLeft(new TreeNode(8));
        myTree.root.getRight().setRight(new TreeNode(11));

        myTree.root.setLeft(new TreeNode(4));
        myTree.root.getLeft().setLeft(new TreeNode(3));
        myTree.root.getLeft().setRight(new TreeNode(6));
        myTree.root.getLeft().getRight().setLeft(new TreeNode(5));


        //Adding to notBST
        notBST.root.setRight(new TreeNode(10));
        notBST.root.getRight().setLeft(new TreeNode(6));
        notBST.root.getRight().setRight(new TreeNode(11));

        notBST.root.setLeft(new TreeNode(4));
        notBST.root.getLeft().setLeft(new TreeNode(3));
        notBST.root.getLeft().setRight(new TreeNode(8));
        notBST.root.getLeft().getRight().setLeft(new TreeNode(5));



        System.out.println("-----Inorder-----");
        myTree.inOrderTreeWalk(myTree.root);
        System.out.println();

        System.out.println("-----Preorder-----");
        myTree.preorderTreeWalk(myTree.root);
        System.out.println();

        System.out.println("-----Postorder-----");
        myTree.postorderTreeWalk(myTree.root);
        System.out.println();

        System.out.print("Binary Tree? ");
        System.out.println(myTree.isBinaryTree(myTree.root));

        System.out.print("Binary Tree? ");
        System.out.println(notBST.isBinaryTree(notBST.root));
    }
}
