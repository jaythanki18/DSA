package Linked_List;

import java.util.Scanner;

public class Insert_newNode_at_beginning_of_doubly_LL {
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

    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
        }
        System.out.println("Nodes of doubly linked list: ");
        System.out.print("NULL<->");
        while(current!=null){
            System.out.print(current.data+"<->");
            current=current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Insert_newNode_at_beginning_of_doubly_LL dList=new Insert_newNode_at_beginning_of_doubly_LL();
        System.out.print("How many nodes do you want to insert:- ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            dList.addatStart(sc.nextInt());
            dList.display();
        }
    }
}
