import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
      Stack<Integer> stack = new Stack<>();

        stack.push(1);  
        stack.push(2);  
        stack.push(3);  

        System.out.println("Top element: " + stack.peek());  
        System.out.println("Stack size: " + stack.size());   
        
        System.out.println("Popped element: " + stack.pop());  
        System.out.println("Popped element: " + stack.pop());  

        System.out.println("Stack size after popping: " + stack.size()); 
        System.out.println("Top element after popping: " + stack.peek());
        System.out.println("Is Stack Empty: " + stack.isEmpty());

    }
}