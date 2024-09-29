import java.util.*;
//sum of n numbers present in an array
public class q03 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        //rotate array by k positions
        int k;
        int a[]={1,2,3,4,5,6};
        int n;
        System.out.println("enter the value of k");
        k=in.nextInt();
        while(k>0){
            n=a[a.length-1];
            for(int i=a.length-2;i>=0;i--){
               a[i+1]=a[i];

            }
            a[0]=n;
            k--;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}
