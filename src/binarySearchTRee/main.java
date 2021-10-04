package binarySearchTRee;

public class main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node node = binarySearchTree.createTree();
        binarySearchTree.inorder(node);
      //  binarySearchTree.search(node,5);
    }
}
