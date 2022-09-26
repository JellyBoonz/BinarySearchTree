public class Driver {
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree(7);

        System.out.println("-----Before-----");
        myTree.inOrderTreeWalk(myTree.root);
        System.out.println();

        myTree.add(8);
        myTree.add(4);
        myTree.add(9);
        myTree.add(6);
        myTree.add(7);
        myTree.add(10);

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
    }
}
