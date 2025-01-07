import java.util.*;
public class ass_01_5 {
    public static void main(String[] args) {
        int a[]={9,-8, -7,-6,-5};

        Arrays.sort(a);
        int i=a[0];
        int j=0;

        while(j<=a.length-1){
            if(i!=a[j]) {
                System.out.println(i);
                break;
            }

            i++;
            j++;



        }
    }
}
