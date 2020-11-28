import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Linked_List_5 {
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d)
        {
            data =d;
            next = null;
        }
    }

    public static void main(String[] args) throws IOException {
        Linked_List_5 llist = new Linked_List_5();
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        llist.head = new Node(Integer.parseInt(br.readLine()));
        Node second = new Node(Integer.parseInt(br.readLine()));
        Node third = new Node(Integer.parseInt(br.readLine()));
        Node fourth = new Node(Integer.parseInt(br.readLine()));
        Node fifth = new Node(Integer.parseInt(br.readLine()));
        llist.head.next =second;
        second.next=third;
        third.next = fourth;
        fourth.next=fifth;
        System.out.println(llist.Max_Element());
        System.out.println(llist.Min_Element());

    }
     int Max_Element()
    {
        Node temp = head;
        int max = 0;
        while(temp!=null)
        {
            if (temp.data>max)
                max= temp.data;
            temp = temp.next;
        }
        return max;


    }
    int Min_Element()
    {
        Node temp = head;
        int min = 214748367;
        while(temp!=null)
        {
            if (temp.data<min)
                min= temp.data;
            temp = temp.next;
        }
        return min;


    }
}
