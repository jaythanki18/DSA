package Linked_List;

public class Recursive_Display_LL {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }

    static void rPrint(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.data+" ");
        rPrint(head.next);
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        rPrint(head);
    }
}
