package Sep16;

public class AdLoopQ4 {
    public static void main(String[] args){
        short sum = 0;
        for(short i = 0; i <= 100; i+=2){ // i start with 0, every time i will plus 2
            sum+=i; // plus i into the sum
        }
        System.out.println("sum is: " + sum);
    }
}
