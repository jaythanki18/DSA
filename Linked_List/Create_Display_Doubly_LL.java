package Linked_List;

import java.util.Scanner;

public class Create_Display_Doubly_LL {
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

    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            head.previous=null;
            tail.next=null;
        }
        else{
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
            tail.next=null;
        }
    }

    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Create_Display_Doubly_LL dList=new Create_Display_Doubly_LL();
        System.out.print("How many nodes do you want to insert:- ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {

            dList.addNode(sc.nextInt());
            dList.display();
        }
    }
}
