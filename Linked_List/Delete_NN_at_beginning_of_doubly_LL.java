package Linked_List;

import java.util.Scanner;

public class Delete_NN_at_beginning_of_doubly_LL {
    Node head,tail=null;
    class Node{

        int data;
        Node previous;
        Node next;
        public Node(int data){
            this.data=data;
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

    public void deleteFromStart(){
        if(head==null){
            return;
        }
        else{
            if(head!=tail){
                head=head.next;
                head.previous=null;
            }
            else{
                head=tail=null;
            }
        }
    }

    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.print("NULL<->");
        while(current!=null){
            System.out.print(current.data+"<->");
            current=current.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Delete_NN_at_beginning_of_doubly_LL dList=new Delete_NN_at_beginning_of_doubly_LL();
        System.out.print("How many nodes do you want to insert:- ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            dList.addNode(sc.nextInt());
            dList.display();
        }
        for (int i = 0; i < n; i++){
            dList.deleteFromStart();
            dList.display();
        }
    }
}
