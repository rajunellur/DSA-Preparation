package stacksandqueues.Stack;

import java.util.LinkedList;

public class AddRemoveFirst_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        // Add first and Remove first
        stack.addFirst(10); // Head
        stack.addFirst(20);
        stack.addFirst(30);
        stack.addFirst(40);
        stack.addFirst(50);  // Tail

        System.out.println("Removed First Element: " + stack.removeFirst());
    }
}
