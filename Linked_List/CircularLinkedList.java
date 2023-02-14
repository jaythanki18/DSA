package Linked_List;
import java.util.Scanner;
public class CircularLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    CircularLinkedList() {
        head = null;
    }

    void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    void deleteAtEnd() {
        if (head == null)
            return;
        if (head.next == head) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != head)
            temp = temp.next;
        temp.next = head;
    }

    void printList() {
        if (head == null)
            return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.insertAtFront(data);
        }

        System.out.println("List after inserting elements at front:");
        list.printList();

        System.out.println("\nEnter the number of elements to be deleted:");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            list.deleteAtEnd();
        }

        System.out.println("List after deleting elements at end:");
        list.printList();

    }

}
