public class ass_06_3 {
    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5, 7};
        int n = a.length + 1;
        int s = 0;
        int total = n * (n + 1) / 2;
        for (int i : a) {
            s += i;
        }
        System.out.println("missing number is= "+(total-s));
    }
}