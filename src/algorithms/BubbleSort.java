package algorithms;

import java.util.Arrays;

public class BubbleSort {
    static int[] sort(int[] arr) {
        if (arr == null) return null;

        int len = arr.length - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int left = arr[j];
                int right = arr[j + 1];
                if (left > right) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 4, 3, 6, 3};
        System.out.println(Arrays.toString(sort(arr))); // Console Output: [1, 3, 3, 4, 6, 6, 8]
    }
}
