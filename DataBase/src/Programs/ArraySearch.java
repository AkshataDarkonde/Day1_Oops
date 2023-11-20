package Programs;

public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 14, 6, 78, 19, 23, 26, 35, 37, 7, 52, 86, 47}; // Array of size 15
        int searchNumber = 19; // Number to be searched

        boolean found = false;

        // Search for the number in the array
        for (int num : numbers) {
            if (num == searchNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number " + searchNumber + " is present in the array.");
        } else {
            System.out.println("Number " + searchNumber + " is not present in the array.");
        }
    }
}
