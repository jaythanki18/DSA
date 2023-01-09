package Linked_List;

import java.util.Scanner;

public class InsertStart {
    public Node head=null;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //Insert at begin
    public void addStart(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            head=newNode;
            head.next=temp;
        }
    }

    //Display linked list
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
        }
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;

        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InsertStart sList=new InsertStart();
        System.out.println("How many nodes do you want to insert:- ");
        int n= sc.nextInt();
        System.out.println("Enter nodes:- ");
        for (int i = 0; i < n; i++) {
            sList.addStart(sc.nextInt());
        }
        sList.display();

    }
}
