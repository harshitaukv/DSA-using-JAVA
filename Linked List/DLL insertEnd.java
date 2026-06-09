import java.util.*;

public class Main {
    public static void main(String[] args) {
      DoublyLinkedList dll=new DoublyLinkedList();
      dll.insertEnd(100);
      dll.insertEnd(200);
      dll.insertEnd(300);
      System.out.println(dll.head.data+" "+dll.tail.prev.data+" "+dll.tail.data+" "+dll.tail.prev.prev.prev);
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
  void insertEnd(int data){
    Node newNode=new Node(data);
    if(head==null){
      head=tail=newNode;
      return;
    }
    tail.next=newNode;
    newNode.prev=tail;
    tail=newNode;
  }
}
