import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack_2 {
    StackNode root;
    static class StackNode{
        int data;
        StackNode next;
        StackNode(int d)
        {
            data=d;
        }
    }
    public boolean IsEmpty()
    {
        if (root==null)
        {
            return true;
        }
        else
        return false;
    }
    public void push(int data)
    {
        StackNode newNode= new StackNode(data);
        if (root == null)
        root = newNode;
        else
        {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }
    public int Pop()
    {
        int min = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is Empty");
        }
        else {
            min = root.data;
            root = root.next;
        }
        return min;
    }
    public int see()
    {
        if (root==null){
        System.out.println("Stack is Empty");
        return 0;
        }
        else
        {
            return root.data;
        }
    }
    public static void main(String[] args) throws IOException{
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        Stack_2 obj = new Stack_2();
        obj.push(Integer.parseInt(br.readLine()));
        obj.push(Integer.parseInt(br.readLine()));
        obj.push(Integer.parseInt(br.readLine()));
        obj.push(Integer.parseInt(br.readLine()));
        System.out.println(obj.Pop()+ " popped from stack");
 
        System.out.println("Top element is " + obj.see());
    }
}
