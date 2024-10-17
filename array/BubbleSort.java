
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void bubblesort(int[] ar, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++)
                if (ar[i] > ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
        }
        System.out.print("The Sorted Array:");
        System.out.print(Arrays.toString(ar));
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.print("The Unsorted Array:");
        System.out.println(Arrays.toString(a));
        bubblesort(a, n);
    }
}