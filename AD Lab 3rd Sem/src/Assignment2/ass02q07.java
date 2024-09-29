import java.util.*;
public class ass02q07 {
    //Write a JAVA program to compute the nth power of a given number
    public static int power(int n,int x){
        if(x==0)
            return 1;
        else
            return n*power(n,x-1);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=in.nextInt();
        System.out.println("enter power: ");
        int x=in.nextInt();
        System.out.println(n+" to the power "+x+" is "+power(n,x));
    }
}
