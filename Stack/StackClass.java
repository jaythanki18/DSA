package Stack;

import java.util.Scanner;

public class StackClass {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

     static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s = new Stack();
        System.out.println("How many elements do you want to insert in the Stack : ");
        int n= sc.nextInt();
        while(n-- >0){
            s.push(sc.nextInt());
        }
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
