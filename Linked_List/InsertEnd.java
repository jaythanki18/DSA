package Linked_List;

import java.util.Scanner;

public class InsertEnd {
    public Node head=null;
    public Node tail=null;
     class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //Insert element at end
    public void addEnd(int data){
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

    //display
    public void display(){
         Node current=head;
         if(head==null){
             System.out.println("List is empty");
             return;
         }
         while (current!=null){
             System.out.print(current.data+"->");
             current=current.next;
         }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InsertEnd sList=new InsertEnd();
        System.out.print("How many nodes do you want to insert:- ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            sList.addEnd(sc.nextInt());
            sList.display();
        }

    }

}
