import java.util.*;

public class power_of_two {
    public static boolean isPowerOfTwo(int n) {
        int p = 1;
        if (n == 0)
            return false;
        else if (n == 1)
            return true;
        else {
            for (int i = 1; i <= n / 2; i++) {
                p = p * 2;
                if (p == n) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}

// more optimised solution :
/*
 * 
 * if (n <= 0) {
 * return false;
 * }
 * // A power of two in binary representation has only one '1' bit set.
 * // For example, 4 (100) or 8 (1000).
 * // By using bitwise operations, we can check if there is only one '1' bit.
 * return (n & (n - 1)) == 0;
 * }
 * 
 * 
 */
