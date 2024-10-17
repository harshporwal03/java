import java.util.*;

public class move_zeroes {
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        // Move non-zero elements to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining elements with zeroes
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int nums_i = 0; nums_i < n; nums_i++) {
            nums[nums_i] = in.nextInt();
        }
        moveZeroes(nums);
        for (int nums_i = 0; nums_i < n; nums_i++) {
            System.out.print(nums[nums_i] + " ");
        }
    }
}
