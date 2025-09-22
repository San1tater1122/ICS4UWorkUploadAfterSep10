package Sep22;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        // Write a program that asks the user to input 10 integers and
        // store them in an array. Then, print the numbers in reverse order.
        // Extension: Also print the sum of numbers at even indices.

        Scanner sc = new Scanner(System.in);

        int[] array_input = new int[10];
        int sumEvenIndices = 0;

        System.out.println("Please input 10 integers: ");
        for(byte i = 0; i < 10; i++){
            int line = sc.nextInt();
            array_input[i] = line; // join to the array

            if(i % 2 == 0){ // even indices
                sumEvenIndices += line;
            }
        }

        System.out.print("Reversed order: ");
        for(byte i = 9; i > 0; i--){
            System.out.print(array_input[i] + ", ");
        }
        System.out.println("Sum even indices: " + sumEvenIndices);

    }
}
