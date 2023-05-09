package hashmapandhashset.hashset;

import java.util.HashSet;

public class Basic_Operations {
    public static void main(String[] args) {
        // creating hash set, (Only contains the key part not value part)
        HashSet<Integer> set = new HashSet<>();

        // adding into hash set

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        // checking key is present or not
        System.out.println(set.contains(10));
        System.out.println(set.contains(90));

        // Remove from Hash set
        System.out.println(set.remove(30));

        // size of hash set
        System.out.println(set.size());

        // duplication is not allowed

        set.add(20);
        System.out.println(set.size());


    }
}
