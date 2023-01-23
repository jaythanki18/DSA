package Linked_List;

import java.util.Scanner;

public class Count_Nodes_in_Doubly_LL {
    Node head, tail = null;
    class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public int countNodes() {
        int counter = 0;
        Node current = head;
        while(current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Count_Nodes_in_Doubly_LL dList=new Count_Nodes_in_Doubly_LL();
        System.out.print("How many nodes do you want to insert:- ");
        int n=sc.nextInt();

        for (int i = 0; i < n; i++) {
            dList.addNode(sc.nextInt());
            dList.display();
        }
        int a= dList.countNodes();
        System.out.println("Number of nodes : "+a);
    }
}
