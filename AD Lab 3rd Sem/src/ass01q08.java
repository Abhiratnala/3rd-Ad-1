import java.util.Scanner;

public class q08 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        //fibonnaci series
        int n;
        System.out.println("enter size");
        n=in.nextInt();
        int a[]=new int[n];
        a[0]=0;
         a[1]=1;
        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        for(int i:a)
            System.out.println(i);

    }
}
