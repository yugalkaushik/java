package containers;

import java.util.*;

public class HashSets {

    public static void main(String[] args) {

        // Create HashSet
        HashSet<Integer> set = new HashSet<>();

        // Add elements
        set.add(10);
        set.add(20);
        set.add(30);

        // Add multiple elements
        set.addAll(Arrays.asList(40, 50, 60, 70));

        // Duplicate elements are ignored
        set.add(10);

        // Get size
        int n = set.size();
        System.out.println(n);

        // Check if element exists
        System.out.println(set.contains(10));

        // Remove element
        set.remove(10);

        // Check if empty
        boolean isEmpty = set.isEmpty();
        System.out.println(isEmpty);

        // Create a copy
        HashSet<Integer> copy = new HashSet<>(set);

        // Traverse HashSet
        for (Integer i : copy) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Clear all elements
        set.clear();
    }
}