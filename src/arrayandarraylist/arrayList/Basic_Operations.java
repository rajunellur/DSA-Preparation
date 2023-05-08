package arrayandarraylist.arrayList;

import java.util.ArrayList;

public class Basic_Operations {
    public static void main(String[] args) {
        // Creation
        ArrayList<Integer> list = new ArrayList<>();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Printing
        System.out.println("Array List is: "+list);

        // add at Index
        list.get(3);
        System.out.println(list);

        // get
        System.out.println(list.get(3));

        // Set
        System.out.println(list.set(2,70));

        // Remove
        list.get(2);
        System.out.println(list);

        // size
        System.out.println(list.size());
    }
}
