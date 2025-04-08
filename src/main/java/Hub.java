import AmazingNumbers.AmazingNumbers;

import java.util.Scanner;

public class Hub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Java Practice Hub!");
            System.out.println("Please choose a program to run:");
            System.out.println("1 - Amazing Numbers");
            // Future options:
            // System.out.println("2 - SomeOtherModule");
            System.out.println("0 - Exit");

            System.out.print("Your choice: ");
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    AmazingNumbers amazingNumbers = new AmazingNumbers();
                    amazingNumbers.run();  // Ensure AmazingNumbers class has a run() method
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid input. Please enter a valid option.");
            }

            System.out.println();
        }
    }
}
