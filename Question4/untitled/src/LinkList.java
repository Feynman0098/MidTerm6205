public class LinkList  {

    public Node head;

    public int length = 0;

    public LinkList() {
        head = null;
    }

    public void insert(Integer data){
        int index = 0;
        if (head == null) {
            head = new Node(data);
            System.out.println("insert position is " + index);
            return;
        }
        Node temp = head;
        // Insert in sorted manner
        if (data <= head.data) {
            head = new Node(data);
            head.next = temp;
            System.out.println("insert position is " + index);
            return;
        }


        while (temp != null && temp.next != null) {
            index++;
            if (data <= temp.next.data) {
                Node node = new Node(data);
                node.next = temp.next;
                temp.next = node;
                System.out.println("insert position is " + index);
                return;
            }
            temp = temp.next;
        }
        temp.next = new Node(data);
        index++;
        System.out.println("insert position is " + index);
    }
}
