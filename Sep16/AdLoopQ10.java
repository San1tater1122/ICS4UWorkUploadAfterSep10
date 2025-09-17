package Sep16;

import java.util.Scanner;

public class AdLoopQ10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float input;
        float max;
        float min;
        float total = 0;

        System.out.print("Please input the 1st number: "); // let user input to initialize
        input = sc.nextFloat();
        max = input;
        min = input;

        for (byte i = 2; i <= 10; i++){ // start with 2, end with 10
            System.out.print("Please input the " + i + "th number: ");
            input = sc.nextFloat();

            if (input > max){ // if the input is larger than the max we had record,
                max = input;  // change to be the new max
            }else if(input < min){ // if the input is smaller than the min we had record.
                min = input;       // change to be the new min
            }

            total += input; // add to the total
        }

        System.out.println("The Maximum is: " + max);
        System.out.println("The Minimum is: " + min);
        System.out.println("Average is: " + total/10);
    }
}
