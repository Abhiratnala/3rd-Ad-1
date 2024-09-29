import java.util.*;
public class ass02q03 {
    //Write a JAVA program to find the factorial of a given number
    public static int factorial(int n){
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n: ");
        int n=in.nextInt();
        System.out.println("Factorial of "+n+" is: "+factorial(n));
    }
}
