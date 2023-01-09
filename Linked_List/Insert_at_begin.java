package Linked_List;

public class Insert_at_begin {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    static Node insertbegin(Node head,int x) {
        Node temp = new Node(x);
        temp.next=head;
        head=temp;
        System.out.print(head.data+" ");
        return head;
    }



    public static void main(String[] args) {
        Node head=null;
        insertbegin(head,30);
        insertbegin(head,20);
        insertbegin(head,10);

    }
}
