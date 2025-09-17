package Sep16;

public class AdLoopQ15 {
    public static void main(String[] args) {
        System.out.print("a*b=? "); // Fine-tune distance
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%4d", i); // Print the header, know the columns number
        }
        System.out.println();
        System.out.print("      "); //  Fine-tune distance
        for (int i = 1; i <= 12; i++) {
            System.out.print("____"); // Print dividing line
        }
        System.out.println();

        for (int i = 1; i <= 12; i++) {
            System.out.printf("%4d |", i); // Print the row label with | divide

            for (int j = 1; j <= 12; j++) {
                System.out.printf("%4d", i * j); // print all the product
            }
            System.out.println();
        }
    }
}
