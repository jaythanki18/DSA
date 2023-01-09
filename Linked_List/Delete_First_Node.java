package Linked_List;

import java.util.Scanner;

public class Delete_First_Node {
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

    //delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            if(head!=tail){
                head=head.next;
            }
            else {
                head=tail=null;
            }
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
        Delete_First_Node sList=new Delete_First_Node();
        System.out.print("How many nodes do you want to insert:- ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            sList.addEnd(sc.nextInt());
            sList.display();
        }
        sList.deleteFirst();
        sList.display();

    }

}
