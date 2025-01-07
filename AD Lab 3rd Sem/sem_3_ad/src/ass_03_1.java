public class ass_03_1 {
    //bubble sort
    public static void main(String[] args) {
        int []a={1,2,3,1,2,3,2,7,9,0,-4,2,1};
        for(int i=1;i<a.length;i++){
            for(int j=a.length-1;j>=i;j--){
                if(a[j]<a[j-1]) {
                    int temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        for(int i:a)
            System.out.print(i+"  ");
    }
}
