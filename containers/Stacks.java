package containers;

import java.util.*;

public class Stacks {

    public static void main(String[] args) {

        // Create Deque
        Deque<Integer> stack = new ArrayDeque<>();

        // Add elements to top
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Access top element
        System.out.println(stack.peek());

        // Remove top element
        System.out.println(stack.pop());

        // Get size
        System.out.println(stack.size());

        // Check if empty
        System.out.println(stack.isEmpty());

        // Traverse
        for (Integer value : stack) {
            System.out.println(value);
        }

        // Clear all elements
        stack.clear();
    }
}