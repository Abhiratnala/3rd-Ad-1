public class ass_02_1
{//recursion sum
    public static int sum(int[] a, int n) {
        if(n==0)
            return a[0];
        else
            return a[n]+sum(a,n-1);

    }
    public static void main(String [] args ){
        int a[]={1,2,3,4,5};
        System.out.println(sum(a,a.length-1));
    }
}
