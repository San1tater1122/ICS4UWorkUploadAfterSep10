package Sep16;

import java.util.Scanner;

public class AdLoopQ13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an positive integer for its factorial: ");
        int input = sc.nextInt();
        long answer = 1L;

        for(int i = input; i > 0; i--){ // for loop for factorial
            answer *= i;
        }

        System.out.println("Factorial for " + input + " is: " + answer);
    }
}
