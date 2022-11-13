public class Main {
    public static void main(String[] args) {

        Node root = getTreeRoot();

        populateParent(root);

    }

    private static void populateParent(Node root){
        if (root == null) return;
        root.parent = root;
        System.out.println("Parent Node of Node " + root.data + " is " + root.data);
        inorder(root);
    }

    private static void inorder(Node root) {
        if (root.left != null) {
            root.left.parent = root;
            System.out.println("Parent Node of Node " + root.left.data + " is " + root.data);
            inorder(root.left);
        }
        if (root.right != null) {
            root.right.parent = root;
            System.out.println("Parent Node of Node " + root.right.data + " is " + root.data);
            inorder(root.right);
        }
    }

    private static Node<Integer> getTreeRoot(){

        Node root = new Node<>(1);

        root.left = new Node<>(2);
        root.right = new Node<>(3);

        root.left.left = new Node<>(4);
        root.left.right = new Node<>(5);
        root.right.left = new Node<>(6);
        root.right.right = new Node<>(7);


        root.left.left.left = new Node<>(8);
        root.left.right.left = new Node<>(9);
        root.right.left.right = new Node<>(10);
        root.right.right.right = new Node<>(11);


        return root;
    }
}