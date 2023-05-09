package stacksandqueues.Queue;

import java.util.LinkedList;

public class AddLast_RemoveFirst_LikedList {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();

        // Add last and Remove first

        queue.addLast(50); // Head
        queue.addLast(40);
        queue.addLast(30);
        queue.addLast(20);
        queue.addLast(10); // Tail

        System.out.println("Removed First Element: "+queue.removeFirst());
    }
}
