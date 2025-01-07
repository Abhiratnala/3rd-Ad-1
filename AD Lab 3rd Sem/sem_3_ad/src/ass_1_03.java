import java.util.*;
public class ass_1_03 {
    public static void main(String[] args) {



 /*       public static int sum(int n,int [] arr)
        {
            if(n==0)
            {
                return arr[0];
            }
            else
                return arr[n]+sum(n-1,arr);
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int arr[] = {1,2,3};
            System.out.println(sum(arr.length-1,arr));*/



		 /*int sum=0;
		 for(int i=0;i<=arr.length-1;i++)
		 {
			 sum=sum+arr[i];*/


        Scanner in = new Scanner(System.in);
        System.out.println("enter k");
        int k = in.nextInt();
        int a[] = {1,2,3,4,5,6};
        while (k > 0) {
            int n = a[a.length - 1];
            for (int i = a.length - 2; i >= 0; i--) {
                a[i + 1] = a[i];
            }
            a[0] = n;
            k--;

        }
        for (
                int i : a) {


            System.out.print(i+" ");


        }
    }
}



