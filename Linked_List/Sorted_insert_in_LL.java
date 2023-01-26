package Linked_List;

import java.util.LinkedList;
import java.util.Scanner;

public class Sorted_insert_in_LL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }

    public static Node sortedInsert(int x){
        Node temp=new Node(x);
        if(head==null){
            head=temp;
            return head;
        }
        if(x<head.data){
            temp.next=head;
            head = temp;
            return head;
        }
        Node curr=head;
        while(curr.next!=null && curr.next.data<x){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }

    public static void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public static void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
//        LinkedList<Integer> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        Node head=null;
        addLast(10);
        addLast(20);
        addLast(30);
        sortedInsert(25);
        printList();
    }
}
