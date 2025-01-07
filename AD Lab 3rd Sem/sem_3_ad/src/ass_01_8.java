import java.util.*;
public class ass_01_8 {
    //fibbonaci
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter");
        int n=in.nextInt();
        int prev=0;
        int curr=1;
        int pprv=0;

        for(int i=1;i<n;i++) {
            pprv = prev;
            prev = curr;
            curr = prev + pprv;
        }
        System.out.println(curr);
    }
}
