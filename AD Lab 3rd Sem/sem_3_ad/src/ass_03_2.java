public class ass_03_2 {
    //insertion sort
    public static void main(String[] args) {
        int [] a={-1,-4,2,1,3,9,1,3,3};
        for(int j=0;j<a.length;j++){
            int key =a[j];
            int i=j-1;
            while(i>=0 && a[i]>key){

                    a[i + 1] = a[i];
                    i=i-1;

            }
            a[i+1]=key;

        }
        for(int i:a)
            System.out.print(i+" ");
    }
}
