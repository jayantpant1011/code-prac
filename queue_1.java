import java.io.*;
public class queue_1{
    int head;
    int tail;
    int size;
    static int q[];
    queue_1(int size){
        this.head = 1;
        this.tail=1;
        this.q = new int[size];
    }
    public boolean IsEmpty()
    {
        if (this.tail==this.head)
        return true;
        else 
        return false;
    }
    public boolean isFull()
    {
        if (this.head==this.tail+1)
          return true;
          return false;   
    }
    public void enqueue(int x) {
        if(isFull()) {
          System.out.println("Queue Overflow");
        }
        else {
          this.q[this.tail] = x;
          if(this.tail == this.size)
            this.tail = 1;
          else
            this.tail = this.tail+1;
        }
      }
    
      public int dequeue() {
        if(IsEmpty()) {
          System.out.println("Underflow");
          return -1000;
        }
        else {
          int x = this.q[this.head];
          if(this.head == this.size) {
            this.head = 1;
          }
          else {
            this.head = this.head+1;
          }
          return x;
        }
      }
    
      public void display() {
        int i;
        for(i=this.head; i<this.tail; i++) {
          System.out.println(this.q[i]);
          if(i == this.size) {
            i = 0;
          }
        }
      }
    
    public static void main(String[] args) throws IOException{
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        queue_1 q = new queue_1(10);
        q.enqueue(Integer.parseInt(br.readLine()));
         q.enqueue(Integer.parseInt(br.readLine()));
        q.enqueue(Integer.parseInt(br.readLine()));
         q.enqueue(Integer.parseInt(br.readLine()));
         q.enqueue(Integer.parseInt(br.readLine()));
         System.out.println();
         q.display();

    System.out.println("");

    q.dequeue();
    q.dequeue();
    q.display();

    System.out.println("");

    q.enqueue(60);
    q.enqueue(70);
    q.display();
        
    }
} 