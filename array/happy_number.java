/* Input: n = 19
Output: true
Explanation:
1*1 + 9*9 = 82
8*8 + 2*2 = 68
6*6 + 8*8 = 100
1*1 + 0*0 + 0*0 = 1 */

import java.util.*;

public class happy_number {
    public static boolean isHappy(int n) {
        while (n >= 1 && n != 4) {
            int sum = 0;
            while (n != 0) {
                int rem = n % 10;
                sum += rem * rem;
                n = n / 10;
            }
            if (sum == 1)
                return true;
            n = sum;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isHappy(n));
    }
}
