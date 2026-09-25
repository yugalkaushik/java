package containers;

import java.util.*;

public class PriorityQueues {

    public static void main(String[] args) {

        // Create PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        // Access highest-priority element
        System.out.println(pq.peek());

        // Remove highest-priority element
        System.out.println(pq.poll());

        // Get size
        System.out.println(pq.size());

        // Check if empty
        System.out.println(pq.isEmpty());

        // Traverse
        for (Integer value : pq) {
            System.out.println(value);
        }

        // Clear all elements
        pq.clear();
    }
}