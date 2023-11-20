package Programs;

public class BubbleSortAndSearch {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] arr, int searchNumber) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == searchNumber) {
                return mid; // Element found at index mid
            }

            if (arr[mid] < searchNumber) {
                left = mid + 1; // Continue searching in the right half
            } else {
                right = mid - 1; // Continue searching in the left half
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 14, 6, 78, 19, 23, 26, 35, 37, 7, 52, 86, 47}; // Array of size 15
        int searchNumber = 19; // Number to be searched

        // Sorting the array using Bubble Sort
        bubbleSort(numbers);

        // Searching for the number in the sorted array
        int resultIndex = binarySearch(numbers, searchNumber);

        if (resultIndex != -1) {
            System.out.println("Number " + searchNumber + " is present at index " + resultIndex + " in the sorted array.");
        } else {
            System.out.println("Number " + searchNumber + " is not present in the sorted array.");
        }
    }
}
