import java.util.*;
//sum of n numbers present in an array
public class q04 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        //largest continious sum in an array
        int largest_sum=Integer.MIN_VALUE;
        int current_sum=0;
        int a[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++) {


                    current_sum += a[j];

                if (current_sum > largest_sum)
                    largest_sum = current_sum;
            }
            current_sum=0;
        }
        System.out.println(largest_sum);
    }
}
