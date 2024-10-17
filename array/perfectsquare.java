import java.util.*;

public class perfectsquare {

    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true; // 0 and 1 are perfect squares
        }

        long left = 2; // Start with the smallest possible perfect square (2^2)
        long right = num / 2; // The largest possible perfect square <= num

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true; // Found a perfect square
            } else if (square < num) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return false; // No perfect square found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        perfectsquare ob = new perfectsquare();
        System.out.println(ob.isPerfectSquare(n));
    }
}

/*
 * public boolean isPerfectSquare(int num) {
 * int i = 1;
 * while (i * i <= num) {
 * if (num % (i * i) == 0) {
 * return true;
 * }
 * i++;
 * }
 * return false;
 */