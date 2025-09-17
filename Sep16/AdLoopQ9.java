package Sep16;

import java.util.Scanner;

public class AdLoopQ9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        for (int i = input.length()-1; i >= 0; i--) { // print from the last character
            char c = input.charAt(i);
            System.out.print(c);
        }
    }
}
