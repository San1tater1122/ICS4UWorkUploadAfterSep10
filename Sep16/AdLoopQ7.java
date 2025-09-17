package Sep16;

public class AdLoopQ7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // 10 row
            for (int j = 1; j <= 10; j++) { // 10 columns
                System.out.print("    " + i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
