public class Linked_List_1 {
    Node head;
    static class Node { //template for Node creation class.
        int data;
        Node next;

        Node(int d) {// initializing the node.
            data = d;
            next =null;
        }

    }

    public static void main(String[] args) {
        Linked_List_1 llist = new Linked_List_1();
        llist.head = new Node(1);// point the head to first node.
        Node second = new Node(2);
        llist.head.next = second;

        llist.printlist();
    }
    public void printlist()
    {
        Node n =head;
        while(n!=null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
}


