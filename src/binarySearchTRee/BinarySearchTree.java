package binarySearchTRee;

import java.util.Random;
import java.util.Scanner;

public class BinarySearchTree {
    Scanner sc = new Scanner(System.in);

    public  Node  createTree(){
        Node root = null;
        System.out.println("Enter data ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);
        System.out.println("Enter Left for" + data);
        root.left = createTree();
        System.out.println("Enter Right for" + data);
        root.right = createTree();
        return  root;
    }
    public void inorder(Node root){
        if (root ==null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }
    public void search(Node root,int Element){
        if (root ==null)
            return;
        inorder(root.left);
        if(root.data == Element){
            System.out.println(Element + " is present in the tree");
        }
        inorder(root.right);

    }

}
