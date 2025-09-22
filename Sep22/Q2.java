package Sep22;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Create a program that reads 8 integers into an array.
        // Find and print the largest and smallest values along with their positions (indices).
        // Extension: If there are multiple occurrences, print all indices.

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[8];

        System.out.println("Please input 8 integers: ");
        for (int i = 0; i < 8; i++) {
            numbers[i] = sc.nextInt();
        }

        // min and max
        int min = numbers[0];
        int max = numbers[0];

        // Find min max
        for (int i = 1; i < 8; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print results
        System.out.println("Smallest value: " + min);
        System.out.print("Indices of smallest value: ");
        for (int i = 0; i < 8; i++) {
            if (numbers[i] == min) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Largest value: " + max);
        System.out.print("Indices of largest value: ");
        for (int i = 0; i < 8; i++) {
            if (numbers[i] == max) {
                System.out.print(i + " ");
            }
        }
    }
}
