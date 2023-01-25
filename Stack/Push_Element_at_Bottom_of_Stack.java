package Stack;

import java.util.Scanner;

public class Push_Element_at_Bottom_of_Stack {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;

        }
    }

    static class Stack{
        public Node head;
        public boolean isEmpty(){
            return head==null;
        }
        public void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void pushAtBottom(int data,Stack s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        System.out.print("How many elements do you want to insert in the Stack : ");
        int n= sc.nextInt();
        while(n-- >0){
            s.push(sc.nextInt());
        }
        System.out.print("Which element do you want to insert at bottom: ");
        pushAtBottom(sc.nextInt(),s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
