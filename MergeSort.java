import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int[] arr = {4,5,7,2,1,3,8,9};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, high, mid);
    }

    public static void merge(int[] arr, int low, int high, int mid) {
        int[] left = new int[(mid - low) + 1];
        int[] right = new int[(high - mid)];
        int k = 0;
        for (int i = low; i <= mid; i++) {
            left[k] = arr[i];
            k++;
        }
        k = 0;
        for (int i = mid + 1; i <= high; i++) {
            right[k] = arr[i];
            k++;
        }
        int i = 0;
        int j = 0;
        k = low;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}