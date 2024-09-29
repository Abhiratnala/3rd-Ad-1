import java.util.*;
public class ass02q06 {
    //Write a JAVA program to convert a given decimal number to its hexadecimal equivalent.
    public static String hexa(int n){
        if(n==0)
            return "0";
        else{
            String hex=hexa( n/16);
            int rem=n%16;
            if(rem<10)
                return hex+rem;
            else {
                char ch = (char) (rem + 55);
                return hex + ch;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n: ");
        int n=in.nextInt();
        System.out.println("Hexadecimal equivalent of "+n+" is: "+hexa(n));
    }
}
