import java.util.*;

public class Main {
    public static void main(String[] args) {
      Node nN1=new Node(10);
      Node nN2=new Node(20);
      nN2.prev=nN1;
      nN1.next=nN2;
      System.out.println(nN1.prev+" "+nN1.data+" "+nN1.next);
      System.out.println(nN2.prev+" "+nN2.data+" "+nN2.next);
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
