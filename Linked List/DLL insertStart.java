import java.util.*;

public class Main {
    public static void main(String[] args) {
      DoublyLinkedList dll=new DoublyLinkedList();
      dll.insertStart(100);
      dll.insertStart(200);
      dll.insertStart(300);
      System.out.println(dll.head.data+" "+dll.head.next.data+" "+dll.head.next.next.data+" "+dll.tail.prev.prev.prev);
    }
}
class Node{
  int data ;
  Node prev;
  Node next;
  Node(int data){
    this.data=data;
    this.prev=null;
    this.next=null;
  }
}
class DoublyLinkedList{
  //methods of DoublyLinkedList
  Node head=null;
  Node tail=null;
  void insertStart(int data){
    Node newNode=new Node(data);
    if(head==null){
      head=tail=newNode;
      return;
    }
    head.prev=newNode;
    newNode.next=head;
    head=newNode;
  }
}
