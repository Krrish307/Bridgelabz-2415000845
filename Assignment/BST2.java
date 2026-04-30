class BST2 {
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

    Node minValue(Node root) {
        while (root.left != null) root = root.left;
        return root;
    }

    Node delete(Node root, int key) {
        if (root == null) return null;
        if (key < root.data) root.left = delete(root.left, key);
        else if (key > root.data) root.right = delete(root.right, key);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            Node temp = minValue(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
        return root;
    }

    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BST2 tree = new BST2();
        int[] arr = {15,10,20,8,12,17,25};

        for (int x : arr) tree.root = tree.insert(tree.root, x);

        tree.root = tree.delete(tree.root, 10);
        tree.root = tree.insert(tree.root, 14);
        tree.root = tree.insert(tree.root, 9);

        tree.inorder(tree.root);
    }
}