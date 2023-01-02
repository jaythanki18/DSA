package lab_code;

import java.util.Scanner;

public class SinglyLinkedList {
    class Node{   //Create a structure of a linked list
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //head and tail will point to same node at starting
    public Node head=null;
    public Node tail=null;

    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            //Enter first node
            head=newNode;
            tail=newNode;
        }
        else{
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next=newNode;
            //newNode will become new tail of the list
            tail=newNode;
        }
    }

    public void display(){
        //node current will point to head
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list");
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SinglyLinkedList sList=new SinglyLinkedList();
        System.out.println("Enter 5 nodes for Singly Linked List");
        for (int i = 0; i < 5; i++) {
            sList.addNode(sc.nextInt());
        }
        sList.display();

    }
}
