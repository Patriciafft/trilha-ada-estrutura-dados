package binary_tree;

import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        // Create a binary tree
        BinaryTree tree = new BinaryTree();

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.println("Enter the number of elements you want to insert:");
        int numElements = scanner.nextInt();

        // Insert nodes into the binary tree
        for (int i = 0; i < numElements; i++) {
            System.out.println("Enter the element to insert:");
            int element = scanner.nextInt();
            tree.insert(element);
        }

        // Print the binary tree
        tree.printTree();

        // Close the scanner
        scanner.close();
    }

}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int data) {
        root = insertNode(root, data);
    }

    private Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

    public void printTree() {
        System.out.println("Results of inOrder, preOrder, postOrder: ");
        printInOrder(root);
        System.out.println("###############################");
        printPreOrder(root);
        System.out.println("###############################");
        printPostOrder(root);
        System.out.println("###############################");
    }

    private void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.println(root.data + " ");
            printInOrder(root.right);
        }
    }

    private void printPreOrder(Node root) {
        if (root != null) {
            System.out.println(root.data + " ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }

    private void printPostOrder(Node root) {
        if (root != null) {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.println(root.data + " ");
        }
    }
}