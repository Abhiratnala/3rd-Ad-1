import java.util.*;
//sum of n numbers present in an array
public class q06 {
    public static void main(String args[]) {
        //arrange max min 2nd max 2nd min and so on
        Scanner in = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
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
        int i=0,j=n-1;
        while(true){
            System.out.print(arr[j]+" ");
            if(j==i)
                break;
            System.out.print(arr[i]+" ");
            j--;
            i++;

        }
    }
}
