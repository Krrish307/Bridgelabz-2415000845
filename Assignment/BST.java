class BST {
    class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    Node root;

    Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data) return search(root.left, key);
        return search(root.right, key);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] arr = {50,30,70,20,40,60,80,10,25};

        for (int x : arr) tree.root = tree.insert(tree.root, x);

        tree.inorder(tree.root);
        System.out.println();
        System.out.println(tree.search(tree.root, 25));
    }
}