import java.util.*;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer num : nums) {
            if (num.equals(firstMax) || num.equals(secondMax) || num.equals(thirdMax)) {
                continue;
            }

            if (firstMax == null || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        return thirdMax != null ? thirdMax : firstMax;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int result = thirdMax(nums);
        System.out.println("Third Maximum Number: " + result);
    }
}
