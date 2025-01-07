import java.util.Arrays;

public class ass_02_8 {
    public static int smallest(int []a, int index,int exp) {

        if(index==a.length)
            return exp;
        else {
            if(a[index]!=exp)
                return exp;
            return smallest(a,index+1,exp+1);

        }
    }
    public static void main(String[] args) {
        int a[]={-1,0,2,4};
        Arrays.sort(a);
        System.out.println(smallest(a,0,a[0]));
    }
}
