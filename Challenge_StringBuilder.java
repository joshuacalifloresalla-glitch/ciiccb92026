import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string of at least 10 characters: ");
        String input = scanner.nextLine();

        // Validate input length
        if (input.length() < 10) {
            System.out.println("Invalid input! String must be at least 10 characters long.");
            scanner.close();
            return;
        }

        // Initialize StringBuilder
        StringBuilder sb = new StringBuilder(input);

        // 1. Print the length of the string
        System.out.println("1. Length: " + sb.length());

        // 2. Print the first character of the string
        System.out.println("2. First character: " + sb.charAt(0));

        // 3. Print the last character of the string
        System.out.println("3. Last character: " + sb.charAt(sb.length() - 1));

        // 4. Print the index of the first occurrence of the letter 'a'
        int indexOfA = sb.indexOf("a");
        if (indexOfA != -1) {
            System.out.println("4. Index of 'a': " + indexOfA);
        } else {
            System.out.println("4. Index of 'a': Letter 'a' not found");
        }

        // 5. Print the substring from index 3 to index 6
        System.out.println("5. Substring (index 3 to 6): " + sb.substring(3, 6));

        // 6. Append the string "123" to the end of the string
        sb.append("123");
        System.out.println("6. After append(\"123\"): " + sb);

        // 7. Insert the string "xyz" at index 4
        sb.insert(4, "xyz");
        System.out.println("7. After insert(4, \"xyz\"): " + sb);

        // 8. Delete the substring from index 2 to index 4
        sb.delete(2, 4);
        System.out.println("8. After delete(2, 4): " + sb);

        // 9. Delete the character at index 8
        if (sb.length() > 8) {
            sb.deleteCharAt(8);
            System.out.println("9. After deleteCharAt(8): " + sb);
        } else {
            System.out.println("9. String too short to delete character at index 8.");
        }

        // 10. Reverse the string and print it
        sb.reverse();
        System.out.println("10. Reversed string: " + sb);

        scanner.close();
    }
}
