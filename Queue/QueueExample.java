import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.display();
        System.out.println("removed "+ q.dequeue());
        q.display();
        System.out.println("removed "+ q.dequeue());
        q.display();
        System.out.println("removed "+ q.dequeue());
        q.display();
        System.out.println("removed "+ q.dequeue());
        q.display();
        System.out.println("removed "+ q.dequeue());
        q.display();
        System.out.println("removed "+ q.dequeue());
        q.display();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println("peek "+ q.peek());
        System.out.println("isEmpty "+ q.isEmpty());
    }
}
class Queue {
    int[] arr;
    int front, rear;
    int size;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        if(rear == -1) front = 0;
        arr[++rear] = data;
    }

    int dequeue() {
        if (rear == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int remove = arr[0];
        for(int i=1;i<=rear;i++){
            arr[i-1] = arr[i];  
        }
        arr[rear] = 0;
        rear--;
        return remove;
    }

    int peek() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty() {
        return rear == -1;
    }

    void display() {
        // System.out.println("d=== " + front +" "+rear);
        if (front == rear+1) {
            System.out.println("queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}