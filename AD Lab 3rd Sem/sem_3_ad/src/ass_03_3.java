public class ass_03_3 {
    public static void main(String[] args) {


        //selection sort
        int a[] = {-2, 3, -2, -22, 9, -33};
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] <a[ min])
                    min = j;
            }
            if (min != i){
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;

        }
        }
        for(int i:a)
            System.out.print(i+"  ");


    }
}
