import java.util.*;
public class q07 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //factorial
        int n, f=1;
        System.out.println("enter number");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        System.out.println("factorial "+f);
    }

}
