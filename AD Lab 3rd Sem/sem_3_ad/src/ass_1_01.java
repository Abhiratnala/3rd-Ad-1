import java.util.*;
public class ass_1_01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] a ={1,5,6,8,2,3,4};
        int s=0;
        System.out.println("enter n");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            s+=a[i];
        }
        System.out.println("sum="+s);
    }
}
