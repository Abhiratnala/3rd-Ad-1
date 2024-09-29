import java.util.*;
public class ass02q05 {
    //Write a JAVA program to find the GCD of two given numbers
    public static int gcd(int m,int n){
        if(n==0)
        return m;
        else if (m==0) {
            return n;
        }
        else
            return gcd(n,m%n);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n: ");
        int m=in.nextInt();
        int n=in.nextInt();
        System.out.println("Factorial of "+m+"and "+n+" is: "+gcd(m,n));
    }
}
