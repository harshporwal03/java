import java.util.*;

class subarray_sum_equals_k {
    public static int subarraySum(int[] nums, int k) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k)
                    c++;
            }
        }
        return c;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n = in.nextInt();
        int num[] = new int[n];
        System.out.println("enter array");
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        System.out.println("enter target:");
        int target = in.nextInt();
        int ans = subarraySum(num, target);
        System.out.println("the no. of sub arrays whose sum is equal to '" + target + "' is : " + ans);
    }
}