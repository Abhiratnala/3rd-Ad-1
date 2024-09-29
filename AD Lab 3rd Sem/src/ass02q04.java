import java.util.*;
public class ass02q04 {
    //Write a JAVA program to generate the nth Fibonacci number
    public static int fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n: ");
        int n=in.nextInt();
        System.out.println("Fibonacci term at "+n+" is: "+fibonacci(n));

    }
}
