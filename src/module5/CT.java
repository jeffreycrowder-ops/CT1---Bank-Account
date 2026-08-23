package module5;

import java.util.Scanner;

public class CT {

    // The recursive method used to compute the product
    public static int product(int[] numbers, int index) {

        // Base case, once index reaches the end of the array, return 1
        if (index == numbers.length) {
            return 1;
        }

        // Recursive case, multiply current number by the product of the remaining numbers
        return numbers[index] * product(numbers, index + 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Array to store the five user input numbers
        int[] values = new int[5];

        System.out.println("Please enter five numbers:");

        // Loop to collect user input
        for (int i = 0; i < 5; i++) {

            while (true) {
                System.out.print("Number " + (i + 1) + ": ");

                try {
                    // Attempt to read an integer from the user
                    values[i] = scanner.nextInt();
                    break; // Valid input exits loop

                } catch (Exception e) {
                    // Error message for invalid input
                    System.out.println("Invalid input. Please enter a valid number.");

                    // Clear the invalid input so scanner can continue
                    scanner.nextLine();
                }
            }
        }

        // Call the recursive method starting at index 0
        int result = product(values, 0);

        // Print message with the result at the end
        System.out.println("\nThe product of your chosen five numbers is: " + result + " :)");

        scanner.close();
    }
}
