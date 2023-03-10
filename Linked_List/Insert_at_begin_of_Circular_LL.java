package Linked_List;

import java.util.Scanner;

public class Insert_at_begin_of_Circular_LL {
    static Node head=null;
    static Node tail = null;
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

    public void deleteEnd() {
        //Checks whether list is empty
        if(head == null) {
            return;
        }
        else {
            //Checks whether contain only one element
            if(head != tail ) {
                Node current = head;
                //Loop will iterate till the second last element as current.next is pointing to tail
                while(current.next != tail) {
                    current = current.next;
                }
                //Second last element will be new tail
                tail = current;
                //Tail will point to head as it is a circular linked list
                tail.next = head;
            }
            //If the list contains only one element
            //Then it will remove it and both head and tail will point to null
            else {
                head = tail = null;
            }
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
        for (int i = 0; i < n; i++) {
            list.deleteEnd();
        }
        printList();

    }
}
