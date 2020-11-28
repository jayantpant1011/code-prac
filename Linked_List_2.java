import java.io.*;
public class Linked_List_2 {
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) throws IOException{
        Linked_List_2 ll= new Linked_List_2();
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int new_data = Integer.parseInt(br.readLine());
        ll.head =  new Node(1);
        Node second = new Node(3);
        Node third = new Node (5);
        ll.head.next= second;
        second.next =third;// Note that on initializing final pointer is already pointing to null.
        ll.display();
        System.out.println();
        ll.insertMid(new_data);
        ll.display();
    }
    public void insertMid(int num)
    {
        Node newnode = new Node(num);
        Node ptr =head;
        int len=0;
        while(ptr!=null)
        {
            len++;
            ptr=ptr.next;
        }
        int count = ((len % 2) == 0) ? (len / 2) :
                (len + 1) / 2;
        ptr = head;
        while ((count--)>1)// not to be confused with arrow operator in c! it is actually till when (count--)>1!
            ptr = ptr.next;

        newnode.next = ptr.next;// breaking and forming new connections.
        ptr.next = newnode;

    }
    public void display(){
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }
}
