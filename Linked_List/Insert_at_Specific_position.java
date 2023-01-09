package Linked_List;

import java.util.Scanner;

public class Insert_at_Specific_position {
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

    //Add at end
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

    //Add at specific position
    public void insertAtPos(int position,int value){
        Node newNode=new Node(value);
        if(position==1){
            newNode.next=head;
            head=newNode;
        }
        else{
            Node previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            Node current=previous.next;
            previous.next=newNode;
            newNode.next=current;
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
        Insert_at_Specific_position sList=new Insert_at_Specific_position();
        System.out.print("How many nodes do you want to insert:- ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            sList.addEnd(sc.nextInt());
            sList.display();
        }
        sList.insertAtPos(4,2);
        System.out.println("Updated list:- ");
        sList.display();

    }

}
