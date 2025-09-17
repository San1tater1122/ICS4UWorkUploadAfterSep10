package Sep16;

public class AdLoopQ5 {
    public static void main(String[] args){
        for(byte i = 0; i<5; i++){ // Number of lines
            for(byte j = 0; j <= i; j++){ // Number of columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
