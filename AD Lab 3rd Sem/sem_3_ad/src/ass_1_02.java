public class ass_1_02 {
    public static void main(String[] args) {
        int a[]={1,2,4,22,8,-6};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++) {
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }
        System.out.println(max);
        System.out.println(min);



        }
    }

