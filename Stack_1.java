import java.io.*;
 class Stack1{
    static final int Max=10000;
    int top;
    int s[]=new int [Max];
    boolean IsEmpty()
    {
        return(top<0);
    }
    Stack1()
    {
        top=-1;
    }
    boolean PushIntoStack(int x){
        if (top >= (Max - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            s[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
       }   }
    int pop()
    {
        if (top<0)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            int x = s[top--];
            return x;

        }
    }
    int see()
    {
        if (top<0)
        {
            System.out.println("Stack is empty. Nothing to see");
            return 0;
        }
        else {
            int x = s[top];
            return x;

        }
    }
}
class Driver{
public static void main(String[] args) throws IOException{
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(r);
    Stack1 obj = new Stack1();
    obj.PushIntoStack(Integer.parseInt(br.readLine()));
    obj.PushIntoStack(Integer.parseInt(br.readLine()));
    obj.PushIntoStack(Integer.parseInt(br.readLine()));
    System.out.println("Top of stack :"+ obj.see());
    System.out.println("The value popped is:"+ obj.pop());
    System.out.println("New Top of stack :"+ obj.see());

}
}