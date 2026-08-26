import java.util.Scanner;

public class StringMethodsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // 1. Length of the string
        System.out.println("Length: " + input.length());

        // 2. Convert to uppercase
        System.out.println("Uppercase: " + input.toUpperCase());

        // 3. Convert to lowercase
        System.out.println("Lowercase: " + input.toLowerCase());

        // Check if the string has at least one character for safe indexing
        if (input.length() >= 1) {
            // 4. First character (index 0)
            System.out.println("First character: " + input.charAt(0));

            // 5. Last character (index length - 1)
            System.out.println("Last character: " + input.charAt(input.length() - 1));
        } else {
            System.out.println("String is empty, cannot retrieve first or last character.");
        }

        // 6. Substring from 2nd character (index 1) to 5th character (index 5)
        if (input.length() >= 5) {
            System.out.println("Substring (2nd to 5th character): " + input.substring(1, 5));
        } else if (input.length() > 1) {
            System.out.println("Substring (2nd character to end): " + input.substring(1));
        } else {
            System.out.println("String is too short for substring extraction.");
        }

        scanner.close();
    }
}
