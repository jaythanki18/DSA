package Linked_List;

import java.util.Scanner;

public class Reverse_a_LL {
    public Node head,tail=null;
    class Node{
        int data;
        Node next;
        Node previous;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addatStart(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            head.previous=null;
            tail.next=null;
        }
        else{
            head.previous=newNode;
            newNode.next=head;
            newNode.previous=null;
            head=newNode;
        }
    }

    public void reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;

    }
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
        }
        System.out.println("Nodes of a linked list: ");
       // System.out.print("NUL->");
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Reverse_a_LL List=new Reverse_a_LL();
        System.out.print("How many nodes do you want to insert:- ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            List.addatStart(sc.nextInt());
            List.display();
        }

            List.reverse();
            List.display();

    }
}
