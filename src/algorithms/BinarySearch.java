package algorithms;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        // First, sort the array before performing binary search
        int[] sorted = BubbleSort.sort(arr);

        int left = 0;
        int right = sorted.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2; // Calculate the middle index

            if (sorted[mid] == target) {
                return mid; // Target found
            }

            if (sorted[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 1, 5};
        int target = 5;

        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
