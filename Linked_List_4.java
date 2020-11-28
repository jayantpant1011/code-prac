import java.io.*;
public class Linked_List_4 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node (int d)
        {
            data = d;
            next = null;
        }

    }
    public static void main(String[] args) throws IOException{
        Linked_List_4 ll = new Linked_List_4();
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        ll.head = new Node(Integer.parseInt(br.readLine()));
        Node second = new Node(Integer.parseInt(br.readLine()));
        Node third = new Node(Integer.parseInt(br.readLine()));
        Node fourth = new Node(Integer.parseInt(br.readLine()));
        ll.head.next =second;
        second.next=third;
        third.next = fourth;
        System.out.println("Enter element to be deleted");
        int del = Integer.parseInt(br.readLine());
        ll.display();
        System.out.println();
        ll.deleteNode(del);
        ll.display();

    }
    void deleteNode(int key)
    {
        Node temp = head, prev = null;
        if (temp!=null && temp.data==key)
        {
            head = temp.next;

        }
        while (temp!=null && temp.data!=key)
        {
            prev = temp;
            temp = temp.next;
        }
        if (temp==null)
            return;

        prev.next = temp.next;
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
