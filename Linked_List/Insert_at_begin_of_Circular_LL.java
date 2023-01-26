package Linked_List;

import java.util.Scanner;

public class Insert_at_begin_of_Circular_LL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }

    public Node insertBegin(int data){
        Node temp=new Node(data);
        if(head==null){
            temp.next=temp;
            head=temp;
            return head;
        }
        else{
            temp.next=head.next;
            head.next=temp;
            int t=head.data;
            head.data=temp.data;
            temp.data=t;
            return head;
        }
    }

    public static void printList(){
        if(head==null)
            return;
        System.out.println(head.data+" ");
        for(Node r=head.next;r!=head;r=r.next)
            System.out.println(r.data+" ");
    }

    public static void main(String[] args) {
        Insert_at_begin_of_Circular_LL list=new Insert_at_begin_of_Circular_LL();
        Scanner sc=new Scanner(System.in);
        System.out.print("How many nodes do you want to insert:- ");
        int n=sc.nextInt();
        Node head=null;
        for (int i = 0; i < n; i++) {
            list.insertBegin(sc.nextInt());
        }
        printList();

    }
}
