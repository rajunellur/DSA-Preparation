package hashmapandhashset.hashmap;

import java.util.HashMap;

public class Basic_Operations {
    public static void main(String[] args) {
        // Creating hash map
        HashMap<String,Integer> population = new HashMap<>();

        // add into Hash map
        population.put("India",121);
        population.put("Pakistan", 110);
        population.put("Nepal", 3);
        population.put("Srilanka", 4);
        population.put("Bangladesh", 85);

        // access the Hash map
        System.out.println("Accessing the Hash map value");
        System.out.println(population.get("India"));
        System.out.println(population.get("Pakistan"));
        System.out.println(population.get("Bangladesh"));

        // Traversing int Hash map, ORDER IS NOT FOLLOWED
        System.out.println("Traversing into the Hash map");
        for(String s : population.keySet()){
            System.out.println(s);
        }

        // key is contains or not
        System.out.println("The key/value is containing or not");

        System.out.println(population.containsKey("India"));
        System.out.println(population.containsValue(121));

        // Remove from hash map
        System.out.println("Remove from hash map");

        population.remove("India");
        System.out.println(population.containsKey("India"));

        // size of the hash map
        System.out.println("Size of the hash map");

        System.out.println(population.size());
    }
}
