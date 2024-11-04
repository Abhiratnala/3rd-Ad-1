
import java.util.Arrays;

public class ass04q03 {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void reverseSubarray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 7, 6, 15, 25, 41, 45};
        System.out.println("Original array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int[] tempArr = Arrays.copyOf(arr, arr.length);
                reverseSubarray(tempArr, i, j);

                if (isSorted(tempArr)) {
                    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j + 1)));
                    return;  // Exit after finding the first subarray
                }
            }
        }

        System.out.println("No subarray found that makes the array sorted when reversed.");
    }
}