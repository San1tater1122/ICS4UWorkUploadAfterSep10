package Sep22;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Create a program that reads a word from the user and stores its characters in a char array.
        // Print whether the word is a palindrome (same forwards and backwards).
        // Extension: Ignore case sensitivity.

        Scanner sc = new Scanner(System.in);

        System.out.print("Please input a word: ");
        String word = sc.nextLine().toLowerCase(); // ignore case sensitivity

        // char array
        char[] chars = word.toCharArray();

        // Check palindrome
        boolean isPalindrome = true;
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) { // compare left and right
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is NOT a palindrome.");
        }
    }
}
