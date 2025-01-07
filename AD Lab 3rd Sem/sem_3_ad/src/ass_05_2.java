public class ass_05_2 {
    public static int search(int [] a,int n,int x) {
        if(n==a.length)

            return -1;
        else {
            if(x == a[n])
                return n;
            else
                return search(a, n+1,x);



        }

    }
    public static void main(String[] args) {
        int a[]={1,2,4,3,2,3,2,3,2,3,4,44};
        System.out.println(search(a,0,4));
    }
}
