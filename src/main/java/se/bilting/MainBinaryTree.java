package se.bilting;

public class MainBinaryTree {
    static void main() {
        Tree t = new Tree();
        t.add(4); t.add(1);
        t.add(13); t.add(7);
        t.add(20); t.add(5);

        t.printInOrder();

       // IO.println(t.contains(5); // Övning: skriv metoden som returnerar boolean, rekursivt?
       // IO.println(t.contains(6);

    }
}


class Tree {

    Node root;


    public void add(int value) {
        root = addRecursive(root,value);
    }

    private Node addRecursive(Node root, int value) {
        if (root == null) {
            return new Node(null, null, value);
        }
        if (value < root.value) {
            root.left = addRecursive(root.left, value);
        } else if (value > root.value) {
            root.right = addRecursive(root.right, value);
        } else {
            return root;
        }
        return root;
    }

    public void printInOrder(){
        printInOrderRecursive(root);
    }

    // VÄLDIGT knepigt att göra utan rekursion.
    private void printInOrderRecursive(Node root) {
        if (root == null) return;
        printInOrderRecursive(root.left);
        IO.print(root.value + " ");
        printInOrderRecursive(root.right);
    }

}


class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(Node right, Node left, int value) {
        this.right = right;
        this.left = left;
        this.value = value;
    }
}