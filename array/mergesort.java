import java.util.Scanner;

public class mergesort {
    public static void merge(int[] a, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int[] b = new int[high + 1];
        int k = low;

        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                k++;
                i++;
            } else {
                b[k] = a[j];
                k++;
                j++;
            }
        }

        while (i <= mid) {
            b[k] = a[i];
            k++;
            i++;
        }

        while (j <= high) {
            b[k] = a[j];
            k++;
            j++;
        }

        for (i = low; i <= high; i++) {
            a[i] = b[i];
        }
    }

    public static void mergeSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        mergeSort(arr, 0, size - 1);

        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}