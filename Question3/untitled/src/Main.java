public class Main {

    static boolean isFirst = true;

    public static void main(String[] args) {
        Node root = getBST();
        int[] range = {5, 8};
        helper(root, range);
    }

    private static void helper(Node<Integer> root, int[] range) {
        // assume range.length == 2; && range[1] > range[0]
        if (root == null) return;
        if (root.data < range[0]) {
            helper(root.right, range);
        }
        if (root.data >= range[0] && root.data <= range[1]) {
            helper(root.left, range);
            if (isFirst) {
                System.out.print(root.data);
                isFirst = false;
            } else {
                System.out.print(", " + root.data);
            }
            helper(root.right, range);
        }
        if (root.data > range[1]) {
            helper(root.left, range);
        }
    }

    // Given range between 5 and 8 it will print 6, 7, 8
    private static Node<Integer> getBST(){
        Node<Integer> root = new Node<>(8);
        root.parent = root;

        root.left = new Node<>(3);
        root.right = new Node<>(10);
        root.left.parent = root;
        root.right.parent = root;


        root.left.left = new Node<>(1);
        root.left.right = new Node<>(6);
        root.left.left.parent = root.left;
        root.left.right.parent = root.left;

        root.right.right = new Node<>(14);
        root.right.right.parent = root.right;

        root.left.right.left = new Node<>(4);
        root.left.right.right = new Node<>(17);
        root.left.right.left.parent = root.left.right;
        root.left.right.right.parent = root.left.right;


        root.right.right.left = new Node<>(13);
        root.right.right.left.parent = root.right.right;



        return root;
    }

}