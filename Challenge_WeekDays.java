import java.util.Scanner;

public class NumberToDayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");

        // Check if the input is a valid integer
        if (scanner.hasNextInt()) {
            int dayNumber = scanner.nextInt();

            // Map the integer to the corresponding day of the week
            switch (dayNumber) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        } else {
            // Catches non-integer characters or text inputs
            System.out.println("invalid input");
        }

        scanner.close();
    }
}
