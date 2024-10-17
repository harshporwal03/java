import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void SelectSort(int[] a, int size) {
        for (int i = 0; i < (size - 1); i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        System.out.print("The Sorted Array:");
        System.out.println(Arrays.toString(a));
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = in.nextInt();
        int ar[] = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        System.out.print("The Unsorted Array:");
        System.out.println(Arrays.toString(ar));
        SelectSort(ar, n);
    }
}
