package containers;

import java.util.*;

public class HashMaps {

    public static void main(String[] args) {

        // Create HashMap
        Map<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");

        // Update value for existing key
        map.put(2, "b");

        // Get value using key
        System.out.println(map.get(2));

        // Get value for non-existing key
        System.out.println(map.get(6));

        // Get value with default
        System.out.println(map.getOrDefault(6, "Yugal"));

        // Update another value
        map.put(3, "c");

        // Get size
        int n = map.size();
        System.out.println(n);

        // Check if key exists
        boolean keyExists = map.containsKey(3);
        System.out.println(keyExists);

        // Check if value exists
        boolean valueExists = map.containsValue("c");
        System.out.println(valueExists);

        // Check if empty
        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty);

        // Remove key-value pair
        map.remove(2, "b");

        // Remove using key
        map.remove(3);

        // Create a copy
        Map<Integer, String> copy = new HashMap<>(map);

        // Modify copy
        copy.put(6, "F");

        // Compare sizes
        int m = copy.size();
        n = map.size();

        System.out.println(m);
        System.out.println(n);

        // Clear copy
        copy.clear();

        // Traverse keys
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // Traverse values
        for (String value : map.values()) {
            System.out.println(value);
        }

        // Traverse using forEach
        map.forEach((key, value) -> System.out.println(key + " " + value));

        // Add only if key doesn't already exist
        map.putIfAbsent(5, "E");
    }
}