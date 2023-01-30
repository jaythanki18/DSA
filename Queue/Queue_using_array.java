package Queue;

import java.util.Scanner;

public class Queue_using_array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        Queue(int n){
            arr=new int[n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        //enqueue O(1)
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Full queue");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        //dequeue O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peek O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }

        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the size of the Queue: ");
            int n=s.nextInt();
            Queue q=new Queue(n);
            q.add(1);
            q.add(2);
            q.add(3);
            while(!isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}
