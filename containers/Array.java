package containers;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        // Create
        int[] arr = {1, 2, 3, 4};
        int[] nums = new int[5];


        // Access
        System.out.println("First Value: " + arr[0]);
        System.out.println("Value at index 2: " + arr[2]); 
        System.out.println("Last Value: " + arr[arr.length - 1]);


        // Update
        arr[1] = 10;


        // Length
        int length = arr.length;
        System.out.println("Length: " + length);


        // Normal for loop
        System.out.println("For Loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        // Reverse loop
        System.out.println("Reverse For Loop");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }


        // For-each
        System.out.println("For-each Loop");
        for (int num : arr) {
            System.out.println(num);
        }


        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Size");
        int size = sc.nextInt();
        int[] input = new int[size];
        System.out.println("Input Values");
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }


        // Sum
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum: " + sum);


        // Min / Max
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);


        // Search
        int target = 10;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
            }
        }


        // Sort
        Arrays.sort(arr);


        // Print
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));


        // Copy
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array");
        System.out.println(Arrays.toString(copy));


        // Copy range
        System.out.println("Copy a specific range");
        int[] range = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(range));


        // Compare
        boolean same = Arrays.equals(arr, copy);
        System.out.println("Is copy and arr equal?" + same);


        // Fill
        Arrays.fill(nums, 5);
        System.out.println("Fill value 5");
        System.out.println(Arrays.toString(nums));

        sc.close();
    }
}