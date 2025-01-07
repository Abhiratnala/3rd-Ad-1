public class ass_04_1 {
    public static boolean allZeros(int [] a){
        for(int i:a)
            if(i!=0)
             return false ;
        return true;
    }

    public static int smallest(int [] a) {
        if(a==null || a.length==0)
            return -1;
        else
        {
            int min=Integer.MAX_VALUE;
            for(int i=0;i<a.length;i++){
                if(a[i]!=0 && a[i]<min)
                    min=a[i];
            }
            return min;
        }

    }

    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,2,4,3};
        int c=0;

        while(!allZeros(a)){
            int min=smallest(a);
            for(int i=0;i<a.length;i++){
                if(a[i]!=0)
                    a[i]-=min;
            }
            c++;
            for(int i:a)
                System.out.print(i+"  ");
            System.out.println("reduction count= "+c);
        }


    }
}
