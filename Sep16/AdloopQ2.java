package Sep16;

import java.util.Scanner;

public class AdloopQ2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String password;

        while (true){// the loop will always continue, until a break in the code.
            password = sc.nextLine(); // make user input
            if (password.equals("JavaRocks")){ // if the input is what we need, stop the loop
                break;
            }
        }
    }
}
