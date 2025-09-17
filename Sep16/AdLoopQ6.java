package Sep16;

import java.util.Random;
public class AdLoopQ6 {
    public static void main(String[] args){
        byte dice1;
        byte dice2;

        byte[] n = {1, 2, 3, 4, 5, 6}; // a list to simulate the dice.
        Random rand = new Random();

        while(true){
            dice1 = n[rand.nextInt(n.length)]; // randomly choose 1 to 6
            dice2 = n[rand.nextInt(n.length)]; // same as above
            System.out.println("Dice 1 is " + dice1 + ", Dice 2 is " + dice2 + ".");
            if(dice1 == dice2){ // if 2 are the same, stop the loop.
                break;
            }
        }

    }
}
