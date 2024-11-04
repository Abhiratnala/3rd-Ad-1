import java.util.*;

public class ass04q01 {
    public static boolean allZeros(int[] arr) {//returns true if all are zero
        for (int num : arr) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
    public static int smallestNonZero(int[] arr) {//returns smallest which is needed to be substracted
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int smallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num != 0 && num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int arr[]={5,2,7,1,3,6};
        int c=0;
        while(!allZeros(arr)){
            int min=smallestNonZero(arr);
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0)
                    arr[i]=arr[i]-min;
            }
            c++;
            for(int i:arr) {
                System.out.print(i + "  ");


            }
            System.out.println("reduction count="+c);

        }
    }
}

