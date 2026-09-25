package containers;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(60);

        // Add element at index
        list.add(2, 25);

        // Get element by index
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
        System.out.println(list.get(2));

        // Update element
        list.set(2, 21);
        list.set(0, 11);
        list.set(list.size() - 1, 61);

        // Remove by index
        list.remove(2);

        // Remove by value
        list.remove(Integer.valueOf(11));

        // Remove first and last elements
        list.remove(0);
        list.remove(list.size() - 1);

        // Get size
        int n = list.size();
        System.out.println(n);

        // Check if empty
        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty);

        // Create a copy
        ArrayList<Integer> copy = new ArrayList<>(list);

        // Check index and existence
        int firstIndex = list.indexOf(11);
        boolean thereExists = list.contains(11);
        System.out.println(firstIndex + " " + thereExists);

        // Clear all elements
        copy.clear();

        // Traverse using normal for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Traverse using enhanced for loop
        for (int value : list) {
            System.out.println(value);
        }
    }
}