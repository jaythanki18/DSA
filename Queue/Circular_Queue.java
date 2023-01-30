package Queue;

import java.util.Scanner;

public class Circular_Queue {
    static class Queue{
        static int size;
        static int arr[];
        static int rear=-1;
        static int front=-1;
        Queue(int n){
            arr=new int[n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //enqueue O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("Full queue");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //dequeue O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int result=arr[front];
            //single element condition
            if(front==rear){
                front=rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            return front;
        }

        //peek O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("print statement "+q.remove());
        q.add(6);
        System.out.println("print statement "+q.remove());
        q.add(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
