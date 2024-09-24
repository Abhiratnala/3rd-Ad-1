
import java.util.*;
//sum of n numbers present in an array
public class q01 {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        int n; int sum=0;
        System.out.println("Enter the size of the array");
        n=in.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
            sum+=array[i];
        }
        System.out.println("sum of the array elements is="+sum);
        
    }

}
