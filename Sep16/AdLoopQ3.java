package Sep16;

import java.util.Scanner;
public class AdLoopQ3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String action;
        do{
            System.out.println("Say Hello");
            System.out.println("Say Goodbye");
            System.out.println("Exit");
            action = sc.nextLine(); // make user input
        }while (!action.equals("Exit")); // if not equal to exit, keep the loop work.

    }
}
