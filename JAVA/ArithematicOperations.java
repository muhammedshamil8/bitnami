public class ArithematicOperations {
    public static void main(String[] args) {
        // Check if exactly two arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }
        
        try {
            // Convert the command-line arguments to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            
            // Calculate sum, difference, product, quotient, and remainder
            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
            int quotient = 0;
            int remainder = 0;

            if (num2 != 0) {
                quotient = num1 / num2;
                remainder = num1 % num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
            
            // Output the results
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            
            if (num2 != 0) {
                System.out.println("Quotient: " + quotient);
                System.out.println("Remainder: " + remainder);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        }
    }
}