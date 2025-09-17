package Sep16;

public class AdLoopQ8 {
    public static void main(String[] args){

        for (int row = 0; row < 8; row++) { // 2 for loop for the 2d board
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) { // Use the odd and even to make X and O cross
                    System.out.print("O ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println(); //next line
        }
    }
}
