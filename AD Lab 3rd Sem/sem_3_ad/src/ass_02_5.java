public class ass_02_5 {
    //gcd
    public static int gcd(int a,int b) {
        if(a==0)
            return b;
        if(b==0)
            return a;
        else
            return gcd(b,a%b);

    }
    public static void main(String[] args) {
        System.out.println(gcd(24,18));
    }
}
