public class ass3q03 {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        // Selection Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;


            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }


            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
