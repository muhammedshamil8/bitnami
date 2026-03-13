import java.util.Scanner;

public class DistanceBetweenPoints_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coordinates of the first point
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        // Input coordinates of the second point
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the distance
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Output the result
        System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
    }
}