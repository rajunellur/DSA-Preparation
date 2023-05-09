package stacksandqueues.Stack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Revers_K_Elements {
    public static void reverse(Queue<Integer> queue,int k){
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<k; i++){
            st.push(queue.remove());
        }
        for(int i=0; i<k; i++){
            queue.offer(st.pop());
        }
        int count = queue.size() - k;
        for(int i=0; i<count; i++){
            queue.offer(queue.remove());
        }
        System.out.println(queue);
    }

    public static void display(Queue<Integer> queue){
        for(int i=0; i<queue.size(); i++){
            System.out.println(queue.remove(i));
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        int k = 3;

        reverse(queue,k);

    }
}
