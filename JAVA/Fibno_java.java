import java.util.Scanner;

public class Fibno_java {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the limit
        System.out.print("Enter the limit up to which you want to display Fibonacci series: ");
        int limit = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Initialize the first two Fibonacci numbers
        int a = 0, b = 1;

        // Print the Fibonacci series up to the limit
        System.out.println("Fibonacci series up to " + limit + ":");
        
        // Print the first Fibonacci number
        if (limit >= a) {
            System.out.print(a + " ");
        }
        
        // Print the second Fibonacci number
        if (limit >= b) {
            System.out.print(b + " ");
        }
        
        // Generate and print the rest of the series
        int nextTerm = a + b;
        while (nextTerm <= limit) {
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
            nextTerm = a + b;
        }

        // Print a new line for better readability
        System.out.println();
    }
}