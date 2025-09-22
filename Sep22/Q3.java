package Sep22;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Write a program that asks the user for 6 exam scores and stores them in an array.
        // Calculate and print the average, the number of scores above the average,
        // and the number of scores below the average.

        Scanner sc = new Scanner(System.in);
        int[] scores = new int[6];
        int sum = 0;

        // Input 6 exam scores
        System.out.println("Please input 6 exam scores: ");
        for (int i = 0; i < 6; i++) {
            scores[i] = sc.nextInt();
            sum += scores[i];
        }

        float average = (float) (sum / 6);

        // Count above and below average
        int above = 0, below = 0;
        for (int score : scores) {
            if (score > average) {
                above++;
            } else if (score < average) {
                below++;
            }
        }

        System.out.println("Average score: " + average);
        System.out.println("Number of scores above average: " + above);
        System.out.println("Number of scores below average: " + below);
    }
}
