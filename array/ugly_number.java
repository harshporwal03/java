
// An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
import java.util.Scanner;

public class ugly_number {
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.println(isUgly(n));
    }
}
