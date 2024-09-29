import java.util.*;
public class ass2q01 {
    public static int sum(int n){
        if(n==0)
            return n;
        else
            return n+sum(n-1);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        //Write a JAVA program to find the sum of n numbers present in an array
        System.out.print("Enter the number n:");
        int n=in.nextInt();
        System.out.println("sum of the first "+n+" numbers is: "+sum(5));

    }
}
