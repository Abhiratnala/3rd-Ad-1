import java.util.*;
//sum of n numbers present in an array
public class q05 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        //smallest missing element
        int arr[] = {-9, -1, 0, 1, 3, 4};
        int index = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                index = i;
                break;
            }
        }
        int i = 0;
        while (i < n) {
            if (arr[index] != i) {
                System.out.println(i);
                break;
            }
            i++;
            index++;

        }
    }
}
