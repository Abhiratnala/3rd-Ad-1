public class ass_06_5 {
    public static void main(String[] args) {
        int a[] = {12, 3, 4, 2, 3};
        int mc = 0, e = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > mc) {
                mc = count;
                e = a[i];


            }

        }
        System.out.println("element " + e + " appears " + mc + "  times");
    }
}
