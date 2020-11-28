import java.io.*;
public class Linked_List_3 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node (int n)
        {
            data = n;
            next = null;
        }

    }

    public static void main(String[] args) throws IOException{
        Linked_List_3 ll = new Linked_List_3();
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        ll.head = new Node(Integer.parseInt(br.readLine()));
        Node second = new Node(Integer.parseInt(br.readLine()));
        Node third = new Node(Integer.parseInt(br.readLine()));
        ll.head.next=second;
        second.next = third;
        System.out.println("Enter the value to search");
        int search = Integer.parseInt(br.readLine());
        if (ll.search_LinkedList(search))
            System.out.println("data found in linked list");
        else
            System.out.println("data not found in linked list");


    }
    public boolean search_LinkedList(int key)
    {
       Node temp = head;
       while (temp!=null)
       {
         if (temp.data==key)
             return true;
          temp = temp.next;
       }
       return false;
    }
}
