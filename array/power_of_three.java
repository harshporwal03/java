import java.util.*;

public class power_of_three {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false; // Negative numbers and zero are not powers of three
        }

        // Keep dividing n by 3 as long as it's divisible by 3
        while (n % 3 == 0) {
            n /= 3;
        }

        // If n becomes 1, it's a power of three; otherwise, it's not
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfThree(n));
    }
}
