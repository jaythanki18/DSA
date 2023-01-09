package Linked_List;

public class Insert_at_begin {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    static void insertbegin(Node head,int x) {
        Node temp = new Node(x);
        temp.next=head;
        head=temp;
       // System.out.print(head.data+" ");

    }

    public static void printList(){
        Node currNode=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node head=null;
        insertbegin(head,30);
        insertbegin(head,20);
        insertbegin(head,10);
        printList();
    }
}
