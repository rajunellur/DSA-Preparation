package stacksandqueues.Stack;
import java.util.Stack;
public class Basic_Operations {
    public static void main(String[] args) {
        // Creation
        Stack<Integer> st = new Stack<>();

        // add
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        // peek operation

        System.out.println(st.peek()); // get the last element but it won't remove from stack

        // remove

        System.out.println(st.pop()); // removes the last element

        System.out.println(st.remove(2)); // removes the index element

        // size

        System.out.println(st.size());

        System.out.println(st.isEmpty());

    }
}
