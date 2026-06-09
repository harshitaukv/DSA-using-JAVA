import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

// Display list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

// 1. Find value
    boolean find(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == value)
                return true;

            temp = temp.next;
        }

        return false;
    }

// 2. Count occurrences
    int occurrence(int value) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == value)
                count++;

            temp = temp.next;
        }

        return count;
    }

// 3. Length
    int length() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

// 4. Middle value
    int middle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
// 5. Update by value
    void updateValue(int oldValue, int newValue) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
            }
            temp = temp.next;
        }
    }
// 6. Update by position
    void updateAtPosition(int position, int newValue) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (index == position) {
                temp.data = newValue;
                return;
            }

            index++;
            temp = temp.next;
        }
    }
}

public class SLL {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Creating list: 1 2 3 4 1 1 2
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(1);
        list.insert(1);
        list.insert(2);

        System.out.print("Linked List: ");
        list.display();

        System.out.println("Find 3: " + list.find(3));

        System.out.println("Occurrence of 1: " + list.occurrence(1));

        System.out.println("Length: " + list.length());

        System.out.println("Middle Value: " + list.middle());

        list.updateValue(1, 10);
        System.out.print("After updating 1 to 10: ");
        list.display();

        list.updateAtPosition(2, 99);
        System.out.print("After updating position 2 to 99: ");
        list.display();
    }
}
