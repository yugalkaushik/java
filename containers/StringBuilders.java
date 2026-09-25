package containers;

public class StringBuilders {

    public static void main(String[] args) {

        // Create empty StringBuilder
        StringBuilder emp = new StringBuilder();
        emp.append("yugal");

        // Create StringBuilder with String
        StringBuilder sb = new StringBuilder("Yugal");

        // Append elements
        sb.append('k');
        sb.append("aushik");
        sb.append(7);
        System.out.println(sb);

        // Insert at index
        sb.insert(5, '+');
        System.out.println(sb);

        // Update character
        sb.setCharAt(5, '-');
        System.out.println(sb);

        // Get length
        int n = sb.length();
        System.out.println(n);

        // Access character
        char c = sb.charAt(6);
        System.out.println(c);

        // Delete character
        sb.deleteCharAt(5);
        System.out.println(sb);

        // Delete range
        sb.delete(6, sb.length());
        System.out.println(sb);

        // Reverse
        sb.reverse();
        System.out.println(sb);

        // Convert StringBuilder to String
        String s = sb.toString();
        System.out.println(s);

        // Convert String to StringBuilder
        StringBuilder sbn = new StringBuilder(s);
        System.out.println(sbn);

        // Clear StringBuilder
        sbn.setLength(0);
        System.out.println(sbn);
    }
}