import java.io.*;
 class Q_Node {
    int key;
    Q_Node next;
    Q_Node(int k){
        this.key = k;
        this.next = null;
    }
 }
 class queue_2{
     Q_Node front, rear;
     public queue_2(){
         this.front=this.rear=null;
     }
     void enqueue(int key)
     {
         Q_Node temp = new Q_Node(key);
         if (this.rear==null)
         {
             this.rear=this.front=temp;
             return;
         }
         this.rear.next = temp;
         this.rear=temp;
     }
     void dequeue()
     {
        if (this.front == null)
        return;
        Q_Node temp = this.front;
        this.front=this.front.next;
        if (this.front == null)
         this.rear=null;
     }
 }
 class Test{
     public static void main(String[] args) throws IOException{
         InputStreamReader r = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(r);
         queue_2 obj=new queue_2();
         obj.enqueue(Integer.parseInt(br.readLine()));
         obj.enqueue(Integer.parseInt(br.readLine()));
         obj.enqueue(Integer.parseInt(br.readLine()));
         obj.dequeue();
         obj.enqueue(Integer.parseInt(br.readLine()));
         obj.dequeue();
         System.out.println("Front of queue : "+ obj.front.key);
         System.out.println("rear of queue : "+ obj.rear.key);


     }
 }