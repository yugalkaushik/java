package containers;

import java.util.*;

public class Queues {

    public static void main(String[] args) {

        // Create Queue
        Queue<Integer> queue = new ArrayDeque<>();

        // Add elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // Access front element
        System.out.println(queue.peek());

        // Remove front element
        System.out.println(queue.poll());

        // Get size
        System.out.println(queue.size());

        // Check if empty
        System.out.println(queue.isEmpty());

        // Traverse
        for (Integer value : queue) {
            System.out.println(value);
        }

        // Clear all elements
        queue.clear();
    }
}