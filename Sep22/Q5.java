package Sep22;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Write a program that asks the user for 12 integers and stores them in an array.
        // Print all pairs of numbers whose sum is exactly 20.
        // Extension: Ensure no duplicate pairs are printed.

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[12];

        System.out.println("Please input 12 integers:");
        for (int i = 0; i < 12; i++) {
            numbers[i] = sc.nextInt();
        }

        // Find and print pairs whose sum is 20
        System.out.println("Pairs whose sum is exactly 20:");
        boolean found = false;
        for (int i = 0; i < 12; i++) {
            for (int j = i + 1; j < 12; j++) {
                if (numbers[i] + numbers[j] == 20) {
                    System.out.println(numbers[i] + " + " + numbers[j] + " = 20");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found.");
        }
    }
}
