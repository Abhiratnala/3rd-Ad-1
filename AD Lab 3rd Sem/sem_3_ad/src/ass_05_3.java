import java.util.Scanner;

public class ass_05_3 {
    //iterative binary search
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter");
        int n=in.nextInt();
        int a[]={1,2,3,4,5,6,10};

        int low=0, high=a.length-1, c=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==n){
                c++;
                System.out.println("found at "+mid);
                break;}
            else if(n<a[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        if(c==0)
            System.out.println("not found ");

    }
}
