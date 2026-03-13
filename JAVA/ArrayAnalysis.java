import java.util.Scanner;
import java.util.Arrays;

public class ArrayAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array (10 or more): ");
        int n = sc.nextInt();
        
        if (n < 10) {
            System.out.println("Please enter a size of 10 or more.");
            return;
        }
        
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int smallest = arr[0];
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
        System.out.println("Second largest element: " + secondLargest);
    }
}