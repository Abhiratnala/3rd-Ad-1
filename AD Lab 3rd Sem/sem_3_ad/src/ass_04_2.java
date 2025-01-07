public class ass_04_2 {
    public static void sortArray(int [] a1, int [] a2) {
        int i = 0, j = 0;
        while (i < a1.length) {
            if (a1[i] > a2[j]) {
                int temp = a1[i];
                a1[i] = a2[j];
                a2[j] = temp;

                sortSecondArray(a2);
            }
            i++;


        }
    }

    public static void sortSecondArray(int a2[]) {
        for (int i = 1; i < a2.length && a2[i - 1] > a2[i]; i++) {
            int temp = a2[i];
            a2[i] = a2[i - 1];
            a2[i - 1] = temp;
        }
    }

    public static void printArrays(int a1[],int a2[]) {
        for(int num:a1)
            System.out.print(num+" ");
        for(int j:a2)
            System.out.print(j+" ");

    }




    public static void main(String[] args) {
       int a1[]={2,6,9,14,15};
       int a2[]={1,5,10,25};
       printArrays(a1,a2);
       sortArray(a1,a2);
        System.out.println();
       printArrays(a1,a2);



    }
}

