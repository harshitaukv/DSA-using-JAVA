class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}
class DoublyLinkedList {
    Node head;
    public void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);
// Insert at beginning
        if (pos == 0) {
            newNode.next = head;
            if (head != null)
                head.prev = newNode;
            head = newNode;
            return;
        }
        Node temp = head;
        int count = 0;

        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtPosition(10, 0);
        dll.insertAtPosition(20, 1);
        dll.insertAtPosition(30, 2);
        dll.display();
        dll.insertAtPosition(25, 2);
        dll.display();
    }
}
