package Sep16;

public class AdLoopQ12 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) { // count down
            System.out.println(i); // print the number

            try {
                Thread.sleep(999); // wait 1 seconds
            } catch (InterruptedException e) {}

        }
        System.out.println("Blast Off!");
    }
}
