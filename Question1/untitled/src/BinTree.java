import java.util.ArrayList;
import java.util.List;

public class BinTree <T> {
    public Node<T> root;

    public BinTree() {

    }

    public void populateNextRight(Node root){
        if (root == null) return;
        List<Node> list = new ArrayList();
        list.add(root);
        list.add(null);
        Node pre = null;
        while (list.size() > 0) {
            Node temp = list.get(0);
            list.remove(0);
            if (temp == null && list.size() > 0) {
                list.add(null);
            } else if (temp != null) {
                if (temp.right != null) {
                    list.add(temp.right);
                }
                if (temp.left != null) {
                    list.add(temp.left);
                }
            }

            if (pre != null) {
                pre.nextLeft = temp;
                if (temp == null) {
                    System.out.println("Next left of Node " + pre.data + " is " + temp);
                } else {
                    System.out.println("Next left of Node " + pre.data + " is " + temp.data);
                }

            }
            pre = temp;
        }
    }
}