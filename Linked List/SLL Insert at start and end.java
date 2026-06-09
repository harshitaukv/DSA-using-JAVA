//INSERT AT BEGINNING AND END

class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertEnd(10);
        sll.insertEnd(20);
        sll.insertStart(30);
        // sll.insertEnd(40);
    }
}
class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
    }
}
class SinglyLinkedList{
    Node head = null;
    Node tail = null;
    void insertEnd(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        // System.out.println(head.data+" "+tail.data);
    }
    void insertStart(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println(head.data+" "+tail.data);
    }
}
