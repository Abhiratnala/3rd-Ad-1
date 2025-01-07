import java.util.*;
public class ass_05_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter");
        int n = in.nextInt();
        int c = 0,k=0;
        int a[] = {1, 2, 4, 3, 2, 3, 2, 3, 2, 3, 4, 44};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                /*System.out.println("found at " + i);*/
                c++;
                k=i;
                break;
            }
        }
        if(c==0)
            System.out.println("not found");
        else
            System.out.println("found at "+k);

    }
}
