package Sep16;

public class AdLoopQ11 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { // 5 rows
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" "); // print spaces to become right-aligned
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // print stars
            }
            System.out.println(); // next line
        }
    }
}
