import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class ass_01_7 {
    //factorial
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int f=1;
        System.out.println("enter");
        int n=in.nextInt();
        for(int i=1;i<=n;i++) {
            f *= i;
        }
        System.out.println(f);

    }

}
