import java.util.Arrays;

public class ass_06_4 {
    public static void main(String[] args) {
        int [] a={3,8,15,1,5};
        if(a.length<2)
            System.out.println("contains only 1 element");
        else{
            Arrays.sort(a);
            int max_diff=a[a.length-1]-a[0];
            int min_diff=Integer.MAX_VALUE;
            int [] max=new int [2];
            max[0]=a[0];
            max[1]=a[a.length-1];
            int [] min=new int[2];
            for(int i=0;i<a.length-1;i++){
                int diff=a[i+1]-a[i];
                if(diff<min_diff) {
                    min_diff = diff;
                    min[0]=a[i];
                    min[1]=a[i+1];

                }

            }
            System.out.println("max difference is "+max_diff);
            System.out.println("between "+max[0]+"  "+max[1]);
            System.out.println("min difference is "+min_diff);
            System.out.println("between "+min[0]+"  "+min[1]);
        }
    }
}
