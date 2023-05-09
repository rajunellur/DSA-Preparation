package stacksandqueues.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Basic_Operations {
    public static void main(String[] args) {
        // Creation

        Queue<Integer> queue = new ArrayDeque<>();

        // add

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        // get
        System.out.println(queue.peek());

        //remove
        System.out.println(queue.remove());

        // size
        System.out.println(queue.size());

        // contain
        System.out.println(queue.contains(50));

        System.out.println(queue.iterator());

    }
}
