package containers;

public class SinglyLinkedList {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Print the linked list
    static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Find length
    static int length(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Search for a value
    static boolean contains(ListNode head, int value) {
        ListNode current = head;
        while (current != null) {
            if (current.val == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Insert at beginning
    static ListNode insertFirst(ListNode head, int value) {
        ListNode node = new ListNode(value);
        node.next = head;
        return node;
    }

    // Insert at end
    static ListNode insertLast(ListNode head, int value) {
        ListNode node = new ListNode(value);
        if (head == null) {
            return node;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        return head;
    }

    // Insert at a specific index
    static ListNode insertAt(ListNode head, int index, int value) {
        if (index == 0) {
            return insertFirst(head, value);
        }
        ListNode current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            return head;
        }

        ListNode node = new ListNode(value);

        node.next = current.next;
        current.next = node;

        return head;
    }

    // Delete first node
    static ListNode deleteFirst(ListNode head) {
        if (head == null) {
            return null;
        }
        return head.next;
    }

    // Delete last node
    static ListNode deleteLast(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;

        return head;
    }

    // Delete node at a specific index
    static ListNode deleteAt(ListNode head, int index) {

        if (head == null) {
            return null;
        }

        if (index == 0) {
            return head.next;
        }

        ListNode current = head;

        for (int i = 0; i < index - 1 && current.next != null; i++) {
            current = current.next;
        }

        if (current.next == null) {
            return head;
        }

        current.next = current.next.next;

        return head;
    }

    // Delete first occurrence of a value
    static ListNode deleteValue(ListNode head, int value) {

        if (head == null) {
            return null;
        }

        if (head.val == value) {
            return head.next;
        }

        ListNode current = head;

        while (current.next != null) {

            if (current.next.val == value) {
                current.next = current.next.next;
                return head;
            }

            current = current.next;
        }

        return head;
    }

    // Reverse linked list
    static ListNode reverse(ListNode head) {

        ListNode previous = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        return previous;
    }

    // Find middle node
    static ListNode findMiddle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        // Create linked list
        ListNode head = new ListNode(10);

        head.next = new ListNode(20);
        head.next.next = new ListNode(30);

        // Print
        printList(head);

        // Length
        System.out.println(length(head));

        // Search
        System.out.println(contains(head, 20));

        // Insert at beginning
        head = insertFirst(head, 5);
        printList(head);

        // Insert at end
        head = insertLast(head, 40);
        printList(head);

        // Insert at index
        head = insertAt(head, 2, 15);
        printList(head);

        // Delete first
        head = deleteFirst(head);
        printList(head);

        // Delete last
        head = deleteLast(head);
        printList(head);

        // Delete at index
        head = deleteAt(head, 1);
        printList(head);

        // Delete by value
        head = deleteValue(head, 30);
        printList(head);

        // Find middle
        ListNode middle = findMiddle(head);
        System.out.println(middle.val);

        // Reverse
        head = reverse(head);
        printList(head);
    }
}