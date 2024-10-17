import java.util.*;

public class MissingNum {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] != i)
                return i;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(missingNumber(arr));
    }
}
