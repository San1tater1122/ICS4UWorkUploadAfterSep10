package Sep16;

public class AdLoopQ14 {
    public static void main(String[] args) {
        // 0, 1, 1, 2, 3, 5, 8, 13, ...
        int a = 0, b = 1;

        System.out.print("First 15 numbers of the Fibonacci sequence: ");

        for (int i = 1; i <= 15; i++) {
            System.out.print(a + ", "); // print the first number

            int nextNumber = a + b; // next number is equal to a+b
            a = b; // change a to the number will be add next time.
            b = nextNumber; // same as above
        }
    }
}
