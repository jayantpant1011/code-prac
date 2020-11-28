import java.io.*;
class Max_elementinstack {
    StackNode root;
    static Max_elementinstack obj = new Max_elementinstack();
    static Max_elementinstack maxstack = new Max_elementinstack();


    static class StackNode {
        int data;
        StackNode next;

        StackNode(int d) {
            data = d;
        }
    }

    public boolean IsEmpty() {
        if (root == null) {
            return true;
        } else
            return false;
    }
    public void push_check(int data)
    {
        int max = data;
        if (!maxstack.IsEmpty() && max <maxstack.see())
        {
            max = maxstack.see();
        }
        obj.push(data);
        maxstack.push(max);

    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (root == null)
            root = newNode;
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        
    }

    public int Pop() {
        int min = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is Empty");
        } else {
            min = root.data;
            root = root.next;
        }
        return min;
    }

    public int see() {
        if (root == null) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return root.data;
        }
    }
    public static int get_Max()
    {
        return maxstack.see();
    }
    public void Pop_check(){
        obj.Pop();
        maxstack.Pop();
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);            
        obj.push_check(Integer.parseInt(br.readLine()));
        obj.push_check(Integer.parseInt(br.readLine()));
        obj.push_check(Integer.parseInt(br.readLine()));
        obj.push_check(Integer.parseInt(br.readLine()));
        System.out.println(get_Max());
        obj.Pop_check();
        obj.Pop_check();
        System.out.println(get_Max());



    }
}
