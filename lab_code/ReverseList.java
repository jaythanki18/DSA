package lab_code;

import java.util.Scanner;

public class ReverseList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;

    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }


    public void display(){
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

    public void reverse(Node current){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        else{
            if (current.next==null){
                System.out.print(current.data+" ");
                return;
            }
            reverse(current.next);
            System.out.print(current.data+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ReverseList sList=new ReverseList();
        System.out.println("Enter 5 nodes for a Singly Linked List");
        for (int i = 0; i < 5; i++) {
            sList.addNode(sc.nextInt());
        }
        System.out.print("Original list:- ");
        sList.display();
        System.out.println();
        System.out.print("Reversed list:- ");
        sList.reverse(sList.head);
    }
}
