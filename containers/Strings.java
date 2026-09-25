package containers;

import java.util.*;

public class Strings {

    public static void main(String[] args) {

        // Create String
        String s = " hello ";

        // Access character
        char c2 = s.charAt(2);
        System.out.println(c2);

        // Get length
        int n = s.length();
        System.out.println(n);

        // Convert String to char array
        char[] characters = s.toCharArray();
        System.out.println(Arrays.toString(characters));

        // Store individual characters
        ArrayList<Character> individual = new ArrayList<>();

        for (char c : characters) {
            individual.add(c);
        }
        System.out.println(individual);

        // Build String from characters
        String copy = "";

        for (char c : individual) {
            copy += c;
        }
        System.out.println(copy);

        // Concatenate Strings
        String s1 = "Yugal";
        String s2 = "Tina";

        String combined = s1 + s2;
        System.out.println(combined);

        // Compare Strings
        boolean areEqual = s1.equals(s2);
        System.out.println(areEqual);

        // Compare ignoring case
        String s3 = "yugal";
        areEqual = s1.equalsIgnoreCase(s3);
        System.out.println(areEqual);

        // Find character index
        int c3 = s1.indexOf('g');
        System.out.println(c3);

        // Check if String contains a character
        boolean isThere = s1.contains("g");
        System.out.println(isThere);

        // Extract substring
        String yug = s1.substring(0, 2);
        System.out.println(yug);

        // Convert to uppercase
        String upper = yug.toUpperCase();
        System.out.println(upper);

        // Convert to lowercase
        String lower = s3.toLowerCase();
        System.out.println(lower);

        // Replace characters
        String replaced = s.replace('h', 'g');
        System.out.println(replaced);

        // Remove leading and trailing spaces
        String trimmed = s.trim();
        System.out.println(trimmed);

        // Split String
        String[] parts = s.trim().split(" ");
        System.out.println(Arrays.toString(parts));
    }
}